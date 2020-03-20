import javax.swing.*;

public class ProgramaPrincipal extends JFrame {

    public static void main(String[] arg){
        ContadoFrame contadoFrame = new ContadoFrame();

        contadoFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        contadoFrame.setSize(530, 300); // Define o tamanho padrao da janela
        contadoFrame.setVisible(true); // Define que a janela esta visivel


    }
}
