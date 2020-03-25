/*   ---------------------------
*    PROJETO - Agenda telefonia
*    ---------------------------
*
*    For more information on java.swing visit - http://www.java2s.com/Tutorials/Java/Java_Swing/
*
*    Copyright (C) 2020 Yuri Moysés da Silva
*
*    This program is free software: you can redistribute it and/or modify
*    it under the terms of the GNU General Public License as published by
*    the Free Software Foundation, either version 3 of the License, or
*    (at your option) any later version.
*
*    This program is distributed in the hope that it will be useful,
*    but WITHOUT ANY WARRANTY; without even the implied warranty of
*    MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
*    GNU General Public License for more details.
* */

import javax.swing.*;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JMenuBar;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;


public class ContadoFrame extends JFrame {
    // Atibutos do objeto, senoa a classe interna noa tem acesso
    private JTextField nomeField;
    private  JTextField telefoneField;
    private JTextField enderecoField;

    public ContadoFrame(){
        super("AGENDA TELEFONICA"); // Tilulo do programa
        criarMenu();
        criarFormulario();
    }

    private void criarFormulario() {
        setLayout(new BorderLayout());

        // Criando um painel para adicionar o titulo que ira aparecer na tela
        JPanel painelTitulo = new JPanel();
        painelTitulo.setLayout(new FlowLayout());

        JLabel titulo = new JLabel("Cadastro de contato"); // Nome do titulo
        titulo.setFont(new Font("Verdana", Font.PLAIN, 16)); // Escolhe uma fonte

        painelTitulo.add(titulo); // Adiciona titulo

        JPanel painelCadastro = new JPanel(); // Cria um painel chamado cadastro
        painelCadastro.setLayout(new FlowLayout());

        JLabel nomeLabel = new JLabel("Nome");
        nomeField = new JTextField(38);

        JLabel telefoneLabel = new JLabel("Telefone");
        telefoneField = new JTextField(37);

        JLabel enderecoLabel = new JLabel("Endereço");
        enderecoField = new JTextField(37);

        // Adicionando no painelCadastro os Labels e Fields criados
        painelCadastro.add(nomeLabel);
        painelCadastro.add(nomeField);

        painelCadastro.add(telefoneLabel);
        painelCadastro.add(telefoneField);

        painelCadastro.add(enderecoLabel);
        painelCadastro.add(enderecoField);

        // Criando um painel para os botoes
        JPanel painelBotoes = new JPanel();
        painelBotoes.setLayout(new FlowLayout());

        JButton botaoSalvar = new JButton("Salvar");
        JButton botaoFechar = new JButton("Fechar");

        botaoSalvar.setFont(new Font("Arial", Font.PLAIN, 14));
        botaoFechar.setFont(new Font("Arial", Font.PLAIN, 14));

        // Adiciona no painelBotoes os JButtons criados
        painelBotoes.add(botaoSalvar);
        painelBotoes.add(botaoFechar);

        // Defininimos o local de cada painel criado
        add(painelTitulo, BorderLayout.NORTH);
        add(painelCadastro, BorderLayout.CENTER);
        add(painelBotoes, BorderLayout.SOUTH);

    }

    private void criarMenu(){
        // Criando menu CONTATO E itens - Novo, Salvar, Fechar
        JMenu menuContato = new JMenu("Contato");

        NovoAction novoAction = new NovoAction(); // Adiciona uma acao

        // Criando itens dentro do menu contato
        JMenuItem  menuItemNovo = new JMenuItem("Novo");
        menuItemNovo.addActionListener(novoAction);
        JMenuItem menuItemFechar = new JMenuItem("Fechar");

        // Adicionando na aba contato os itens (Novo, Salvar, Fechhar)
        menuContato.add(menuItemNovo);
        menuContato.add(menuItemFechar);

        // Alterando a fonte do menu contato e do seus itens
        menuContato.setFont(new Font("Arial", Font.PLAIN, 14));
        menuItemNovo.setFont(new Font("Arial", Font.PLAIN, 12));
        menuItemFechar.setFont(new Font("Arial", Font.PLAIN, 12));

        // Criando o menu ajuda
        JMenu menuAjuda = new JMenu("Ajuda");

        // Criando itens do menu ajuda
        JMenuItem menuItemSobre = new JMenuItem("Sobre");
        JMenuItem menuItemVersao = new JMenuItem("Versão");

        // Adicionando itens no menu ajuda
        menuAjuda.add(menuItemSobre);
        menuAjuda.add(menuItemVersao);

        // Alterando a fonte do menu ajuda e dos itens
        menuAjuda.setFont(new Font("Arial", Font.PLAIN, 14));
        menuItemSobre.setFont(new Font("Arial", Font.PLAIN, 12));
        menuItemVersao.setFont(new Font("Arial", Font.PLAIN, 12));

        // Criando uma barra de menu
        JMenuBar barra = new JMenuBar();
        setJMenuBar(barra); // Cria uma barra de menu, chamada 'barra'

        // ADICIONANDO NA BARRA OS MENUS CRIADOS
        barra.add(menuContato);
        barra.add(menuAjuda);
    }
    private class NovoAction implements ActionListener{
        public void actionPerformed(ActionEvent event){
            nomeField.setText("");
            telefoneField.setText("");
            enderecoField.setText("");

        }

    }
}


