package com.pagafacil.PagaFacil.View;

public class evento {
    // src/main/java/com/exemplo/mvc/view/UsuarioView.java
package com.exemplo.mvc.view;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener; // Usaremos para o botão
import java.util.Observable;
import java.util.Observer; // Importa Observer para a View "observar" a Model

    // UsuarioView é a nossa "View" e também um "Observer" da nossa Model
    public class UsuarioView extends JFrame implements Observer {

        private JLabel nomeLabel; // Onde exibimos o nome do usuário
        private JTextField nomeTextField; // Campo para o usuário digitar um novo nome
        private JButton atualizarButton; // Botão para atualizar o nome

        public UsuarioView() {
            super("Aplicação MVC de Usuário");

            // Configurações da janela
            setSize(400, 200);
            setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            setLocationRelativeTo(null);
            setLayout(new FlowLayout(FlowLayout.CENTER, 10, 10)); // Layout mais organizado

            // Inicializa os componentes
            nomeLabel = new JLabel("Nome: [Aguardando dados da Model]");
            nomeTextField = new JTextField(20); // Campo de texto com 20 colunas de largura
            atualizarButton = new JButton("Atualizar Nome");

            // Adiciona os componentes à janela
            add(new JLabel("Nome Atual:"));
            add(nomeLabel);
            add(new JLabel("Novo Nome:"));
            add(nomeTextField);
            add(atualizarButton);

            setVisible(true);
        }

        // --- Métodos para interagir com o Controller ---

        // Retorna o texto digitado no campo de texto
        public String getNomeDoCampo() {
            return nomeTextField.getText();
        }

        // Adiciona um listener ao botão (o Controller irá "escutar" este botão)
        public void addAtualizarListener(ActionListener listener) {
            atualizarButton.addActionListener(listener);
        }

        // --- Métodos para interagir com a Model (implementando Observer) ---

        // Este método é chamado pela Model (Usuario) sempre que ela muda
        @Override
        public void update(Observable o, Object arg) {
            // arg é o objeto que a Model passou em notifyObservers()
            if (arg instanceof String) {
                String novoNome = (String) arg;
                nomeLabel.setText("Nome: " + novoNome); // Atualiza o rótulo da View
                // Opcional: Limpar ou preencher o campo de texto com o novo nome
                nomeTextField.setText(novoNome);
            }
        }

        // Método para exibir mensagens de erro/sucesso (pode ser chamado pelo Controller)
        public void exibirMensagem(String mensagem) {
            JOptionPane.showMessageDialog(this, mensagem);
        }
    }
}
