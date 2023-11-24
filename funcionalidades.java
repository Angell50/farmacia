import javax.swing.*;

public class funcionalidades {
    public static boolean validarintervalo(int num, int may, int min){
            if((num>=min) && (num<=may)){
                return false;
            }else{
                JOptionPane.showMessageDialog(null,"Valor fuera de rango");
                return true;
            }
    }

}
