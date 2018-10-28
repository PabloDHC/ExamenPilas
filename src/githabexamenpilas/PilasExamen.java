package githabexamenpilas;

import javax.swing.JOptionPane;

public class PilasExamen implements IPilasExamen {

    private int Max;
    private int Tope;
    private int[] Pila;

    @Override
    public void crearPila() {
        Tope = -1;
        Pila = new int[Max = Integer.parseInt(JOptionPane.showInputDialog("Escribe El Tamaño De La Pila "))];
        JOptionPane.showMessageDialog(null, "  Se Creo La Pila De " + Max + " Elementos ");
    }

    @Override
    public void insertarElementos() {
        if (Max -1 == Tope) {
            JOptionPane.showMessageDialog(null, "SIN ESPACIO", "ESPACIO AGOTADO", (int) JOptionPane.LEFT_ALIGNMENT);
        } else {
            int item = Integer.parseInt(JOptionPane.showInputDialog("Ingrese Un Elemento"));
            JOptionPane.showMessageDialog(null, "  Elemento Agregado Correctamente");
            
            Pila[(Tope+1)] = item;
            Tope++;
        }
    }

    @Override
    public void estaVacia() {
          if(Tope == 0){
              JOptionPane.showMessageDialog(null,"LA PILA ESTA VACIA");
          }else{
              JOptionPane.showMessageDialog(null,"LA PILA ESTA LLENA");
          }      
    }

    @Override
    public void estaLLena() {
        if (!(Tope == -1)) {

            JOptionPane.showMessageDialog(null, "LA PILA ESTA LLENA  ");
        } else {
            JOptionPane.showMessageDialog(null, "LA PILA ESTA VACIA ");
        }
    }

    @Override
    public void quitarElementos() {
        if (Tope > 0) { 
            Tope--;
            
          JOptionPane.showMessageDialog(null, "Se Elimino El Elemento [" + Pila[(Max-1)] + "]");
        } else { 
          JOptionPane.showMessageDialog(null, "No Hay Datos Por Eliminar");
        }
    }
    
    @Override
    public void imprimirPila() {
        if (Tope == -1) {
            JOptionPane.showMessageDialog(null, "La Pila Esta Vacia");
        } else {
            String PILA = "";
            for (int i = Tope ; i >=0; i--) {
                PILA = PILA + "Elemento " + i + ": " + "[" + Pila[i] + "]" + "\n";
            }
            JOptionPane.showMessageDialog(null, "Los Datos De La Pila Son : \n" + PILA, "Mostrar datos", JOptionPane.PLAIN_MESSAGE);
        }
    }

    @Override
    public void menu() {
        do {
            int opcion = Integer.parseInt(JOptionPane.showInputDialog(null,
                      "---MENU PILAS EXAMEN---\n"+
                    "1.Crear Una Nueva Pila\n"+       
                    "2.Insertar Elementos\n"+
                    "3.Comprobar Si Esta Vacia\n"+
                    "4.Comprobar Si Esta Llena\n"+
                    "5.Quitar Un Elemento A la Pila\n"+
                    "6.Imprimir Toda La Pila \n"+
                    "7. Salir \n"+
                    "--------------------------------------------------------\n"+
                    "INGRESE LA OPCION [1 - 7]","MENU PILA",JOptionPane.QUESTION_MESSAGE));
            switch (opcion) {
                case 1:
                    crearPila();
                    break;
                case 2:
                    insertarElementos();
                    break;
                case 3:
                    estaVacia();
                    break;
                case 4:
                    estaLLena();
                    break;
                case 5:
                    quitarElementos();
                    break;
                case 6:
                    imprimirPila();
                    break;
                case 7:
                    System.exit(0);
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "error");

            }
        } while (true);
    }

    public static void main(String[] args) {
        PilasExamen p = new PilasExamen();
        p.menu();
    }
}
