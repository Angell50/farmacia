import javax.swing.*;

public class Farmacia {

    public static void main(String[] args) {
        //Detector de rol
        int respuestaUsableOpcion1=0;
        int respuestaAccionAdminUsable=0;
        int respuestaAccionUserUsable=0;
        do {
            String respuesta=JOptionPane.showInputDialog(null,"Cual es su rol\n 1)Administrador \n 2)Usuario ");
            int respuestaopcion1=0;
            try {
                respuestaopcion1= Integer.parseInt(respuesta);
                respuestaUsableOpcion1=respuestaopcion1;
            }catch (NumberFormatException e){
                JOptionPane.showMessageDialog(null,"Valor no valido");

            }
        }while (funcionalidades.validarintervalo(respuestaUsableOpcion1,2,1));

        //Objetos Productos
        Productos p1=new Productos("Paracetamol","0001","24/12/23","10/10/23",5.00d,20);
        Productos p2=new Productos("Fentanilo","0002","28/01/24","12/10/23",15.00d,10);
        Productos p3=new Productos("Viagra","0003","10/11/24","02/3/23",2.50d,40);
        Productos p4=new Productos("Ibuprofeno","0004","01/02/24","05/1/22",4.50d,100);
        Productos p5=new Productos("Alchol","0005","03/10/24","01/3/23",2.50d,10);
        //Objetos Proveedores
        Proveedores pv1=new Proveedores("Bayer","1234567891001","02-2341667","bayer@udla.edu.ec");
        Proveedores pv2=new Proveedores("Pfizer","16728192341001","02-654321","pfizer@yahoo.com");
        Proveedores pv3=new Proveedores("Bagó","71263182319001","02-981625","bagó@yahoo.com");

        //Menu Principal

        switch (respuestaUsableOpcion1){
            case 1:
                //Menu Admin
                do {
                    String respuestaOpcionAdmin=JOptionPane.showInputDialog(null,"Que quiere realizar?\n 1)Comprar Productos\n 2)Observar el inventario \n 3)Vender \n 4)Agregar Productos\n");
                    int respuestaAccionAdmin=0;
                    try {
                        respuestaAccionAdmin=Integer.parseInt(respuestaOpcionAdmin);
                        respuestaAccionAdminUsable=respuestaAccionAdmin;
                    }catch (NumberFormatException e){
                        JOptionPane.showMessageDialog(null,"Error");

                    }
                }while (funcionalidades.validarintervalo(respuestaAccionAdminUsable,4,1));

                        switch (respuestaAccionAdminUsable){
                            case 1:

                                break;
                            case 2:
                                break;
                            case 3:
                                break;
                            case 4:
                                break;
                        }
                break;
            case 2:
                //Menu User
                do {
                    String respuestaOpcionAdmin=JOptionPane.showInputDialog(null,"Que quiere realizar?\n 1)Comprar Productos\n 2)Observar el inventario  ");
                    int respuestaAccionUser=0;
                    try {
                        respuestaAccionUser=Integer.parseInt(respuestaOpcionAdmin);
                        respuestaAccionUserUsable=respuestaAccionUser;
                    }catch (NumberFormatException e){
                        JOptionPane.showMessageDialog(null,"Error");

                    }
                }while (funcionalidades.validarintervalo(respuestaAccionUserUsable,2,1));
                break;
        }

    }



}
