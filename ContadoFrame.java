/*  ---------------------------
*   PROJETO - Agenda telefonia
*   ---------------------------
*   AUTHOR - Yuri Moysés
*   CREATED IN - 19/03/2020
*
* */

import javax.swing.*;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JMenuBar;
import javax.swing.JColorChooser;
import java.awt.*;

import static java.awt.Font.ITALIC;

public class ContadoFrame extends JFrame {

    public ContadoFrame(){
        super("AGENDA TELEFONICA");

        criarMenu();
    }

    private void criarMenu(){
        /*
        * CRIANDO O MENU CHAMADO CONTATO
        * */
        JMenu menuContato = new JMenu("Contato");
        /*
        * CRIANDO FONTES E TAMANHO DELAS
        * */
        Font f3 = new Font(Font.DIALOG_INPUT, Font.BOLD|Font.ITALIC, 12);
        Font f4 = new Font(Font.DIALOG_INPUT, Font.BOLD|Font.ITALIC, 13);
        /*
        * ALTERANDO A FONTE DO MENU CONTATO E ITENS
        * */
        menuContato.setFont(f4);
        /*
        * CRIANDO ITENS DENTRO DO MENU CONTATO
        * */
        JMenuItem  menuItemNovo = new JMenuItem("Novo");
        JMenuItem menuItemSalvar = new JMenuItem("Salvar");
        JMenuItem menuItemFechar = new JMenuItem("Fechar");
        /*
        * ADICIONANDO NA ABA CONTADO OS ITENS 'Novo, Salvar, Fechar'
        * */
        menuContato.add(menuItemNovo);
        menuContato.add(menuItemSalvar);
        menuContato.add(menuItemFechar);
        /*
        * CRIANDO O MENU AJUDA
        * */
        JMenu menuAjuda = new JMenu("Ajuda");
        /*
        * ALTERANDO A FONTO DO MENU AJUDAS
        * */
        menuAjuda.setFont(f4);
        /*
        * CRIANDO ITENS DENTRO DO MENU AJUDA
        * */
        JMenuItem menuItemSobre = new JMenuItem("Sobre");
        JMenuItem menuItemVersao = new JMenuItem("Versão");
        /*
        * ADICIONANDO ITENS NO MENU AJUDA
        * */
        menuAjuda.add(menuItemSobre);
        menuAjuda.add(menuItemVersao);

        JMenuBar barra = new JMenuBar();  // USADO PARA A CRIAÇAO DE BARRAS DE MENUS
        setJMenuBar(barra); //CRIANDO UMA BARRA
        /*
        * ADICIONANDO NA BARRA OS MENUS CRIADOS
        * */
        barra.add(menuContato);
        barra.add(menuAjuda);

    }

}
