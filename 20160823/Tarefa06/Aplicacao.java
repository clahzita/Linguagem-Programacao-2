import javax.swing.JOptionPane;


public class Aplicacao{

    public static void main(String[] args){


        Object[] possibilities = {"ham", "spam", "yam"};
        String s = (String)JOptionPane.showInputDialog(
                            frame,
                            "Complete the sentence:\n"
                            + "\"Green eggs and...\"",
                            "Customized Dialog",
                            JOptionPane.PLAIN_MESSAGE,
                            icon,
                            possibilities,
                            "ham");

        /*If a string was returned, say so.
        if ((s != null) && (s.length() > 0)) {
            setLabel("Green eggs and... " + s + "!");
            return;
        }

        //If you're here, the return value was null/empty.
        setLabel("Come on, finish the sentence!");
        }*/
    }

}