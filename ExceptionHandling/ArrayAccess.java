/*
Navarro, Ruben
COP-3252
Assignment 6
Date 04/03/2019
*/

// ArrayAccess.java
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class ArrayAccess extends JFrame
{
    private JTextField inputField;
    private JTextField retrieveField1;
    private JTextField retrieveField2;
    private JTextField outputField;
    private JPanel inputArea;
    private JPanel retrieveArea;
    private JPanel outputArea;

    private int num;
    private int index = 0;
    private int array[] = new int[ 10 ];
    private String result;

    // set up GUI
    public ArrayAccess()
    {
        super( "Accessing Array values" );
        setLayout( new FlowLayout() );

        // set up input Panel
        inputArea = new JPanel();
        inputArea.add( new JLabel( "Enter array elements here" ) );
        inputField = new JTextField( 10 );
        inputArea.add( inputField );
        inputField.addActionListener(
                new ActionListener()
                {
                    public void actionPerformed( ActionEvent e )
                    {
                        try {
                            array[index] = Integer.parseInt(inputField.getText());
                            ++index;
                        } catch ( NumberFormatException ex ) {
                            JOptionPane.showMessageDialog(null, "Please enter only integer values\n");
                        }
                        catch (ArrayIndexOutOfBoundsException ex) {
                            JOptionPane.showMessageDialog(null, "Array may contain only 10 elements.\n");
                        }

                        inputField.setText( "" );
                    } // end method actionPerformed
                } // end anonymous inner class
        ); // end call to addActionListener

        // set up retrieve Panel
        retrieveArea = new JPanel( new GridLayout( 2, 2 ) );
        retrieveArea.add( new JLabel( "Enter number to retrieve" ) );
        retrieveField1 = new JTextField( 10 );
        retrieveArea.add( retrieveField1 );
        retrieveField1.addActionListener(
                new ActionListener()
                {
                    public void actionPerformed( ActionEvent event )
                    {
                        try {
                            num = Integer.parseInt(retrieveField1.getText());
                            boolean flag = false;

                            for (int i = 0; i < array.length; ++i) {
                                if (num == array[i]) {
                                    flag = true;
                                    result = i + " ";
                                }
                            }
                            if (flag == false) {
                                throw new NumberNotFoundException();
                            }
                            outputField.setText("Number found at index: " + result);
                        }
                     catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(null, "Please enter only integer values\n");
                }
               catch (NumberNotFoundException ex) {
                    JOptionPane.showMessageDialog(null, "Number not found in array\n");
                }

               retrieveField1.setText( "" );
                } // end method actionPerformed
    } // end anonymous inner class
      ); // end call to addActionListener

      retrieveArea.add( new JLabel( "Enter index to retrieve" ) );
      retrieveField2 = new JTextField( 10 );
      retrieveArea.add( retrieveField2 );
      retrieveField2.addActionListener(
              new ActionListener()
{
    public void actionPerformed( ActionEvent event )
    {
               /* Create a try block in which the application reads from
                  retrieveField2 the index of a value in the array, then
                  displays the value at that index in the outputField. If the index
                  input by the user is not a number a NumberFormatException should
                  be thrown. If the number input by the user is outside the array
                  bounds or represents an element in which the application has not
                  stored a value, an ArrayIndexOutOfBoundsException should
                  be thrown. */
        try
        {
            num = Integer.parseInt(retrieveField2.getText());
            outputField.setText(String.valueOf(array[num]));
        }
        catch ( NumberFormatException ex ) {
            JOptionPane.showMessageDialog(null, "Please enter only integer values\n");
        }
        catch (ArrayIndexOutOfBoundsException ex) {
            JOptionPane.showMessageDialog(null, "Index not found.\n");
        }

        retrieveField2.setText( "" );
    } // end anonymous inner class
} // end new ActionListener
      ); // end call to addActionListener

    // set up output Panel
    outputArea = new JPanel();
      outputArea.add( new JLabel( "Result" ) );
    outputField = new JTextField( 30 );
      outputField.setEditable( false );
      outputArea.add( outputField );

    add( inputArea );
    add( retrieveArea );
    add( outputArea );
}  // end constructor
} // end class ArrayAccess