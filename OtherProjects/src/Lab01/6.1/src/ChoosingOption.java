import javax.swing.JOptionPane;
public class ChoosingOption {
    public static void main(String[] args){
        int option = JOptionPane.showConfirmDialog(null,"Do you want to change to the first class ticket");
        JOptionPane.showMessageDialog(null,"You've choosen: " + (option==JOptionPane.YES_NO_OPTION?"I do":"I do not"));
        System.exit(0);
    }   
}
