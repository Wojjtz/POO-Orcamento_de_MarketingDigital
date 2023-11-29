/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package orçamentoDeMarketing.UI.produtosUI;

import javax.swing.JOptionPane;
import javax.swing.SpinnerNumberModel;
import orçamentoDeMarketing.model.abstracts.Site;
import orçamentoDeMarketing.model.site.Institucional;
import orçamentoDeMarketing.model.site.Loja;
import orçamentoDeMarketing.UI.opcoes.OpcoesUI;
import orçamentoDeMarketing.listas.ListaSites;

/**
 *
 * @author rodol
 */
public class SiteUI extends javax.swing.JFrame {

    /**
     * Creates new form SiteUI
     */
    public SiteUI() {
        initComponents();
        spinnerQntdProdutos.setModel(new SpinnerNumberModel(0, 0, 1000, 1));
    }

    ListaSites listaSites = new ListaSites();

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        buttonVoltarPagina = new javax.swing.JButton();
        txtSite = new javax.swing.JLabel();
        buttonAddImagem = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        txtNumProdutos = new javax.swing.JLabel();
        spinnerQntdProdutos = new javax.swing.JSpinner();
        buttonAjudaNumProdutos = new javax.swing.JButton();
        txtQuantidadePaginas = new javax.swing.JLabel();
        comboBoxPaginas = new javax.swing.JComboBox<>();
        radioButton2 = new javax.swing.JRadioButton();
        radioButton1 = new javax.swing.JRadioButton();
        txtTipo1 = new javax.swing.JLabel();
        buttonAjudaTipoSite = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));

        jPanel2.setBackground(new java.awt.Color(237, 126, 49));
        jPanel2.setForeground(new java.awt.Color(237, 126, 49));
        jPanel2.setPreferredSize(new java.awt.Dimension(97, 650));

        buttonVoltarPagina.setBackground(new java.awt.Color(237, 125, 49));
        buttonVoltarPagina.setIcon(new javax.swing.ImageIcon(getClass().getResource("/orçamentoDeMarketing/images/back-page-icon.png"))); // NOI18N
        buttonVoltarPagina.setBorder(null);
        buttonVoltarPagina.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                buttonVoltarPaginaMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                buttonVoltarPaginaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                buttonVoltarPaginaMouseExited(evt);
            }
        });
        buttonVoltarPagina.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonVoltarPaginaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(buttonVoltarPagina)
                .addContainerGap(17, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(buttonVoltarPagina)
                .addContainerGap(443, Short.MAX_VALUE))
        );

        txtSite.setFont(new java.awt.Font("Noto Serif", 1, 48)); // NOI18N
        txtSite.setForeground(new java.awt.Color(237, 125, 49));
        txtSite.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtSite.setText("SITE");

        buttonAddImagem.setBackground(new java.awt.Color(237, 125, 49));
        buttonAddImagem.setFont(new java.awt.Font("Noto Serif", 1, 18)); // NOI18N
        buttonAddImagem.setForeground(new java.awt.Color(255, 255, 255));
        buttonAddImagem.setText("ADICIONAR");
        buttonAddImagem.setBorderPainted(false);
        buttonAddImagem.setFocusPainted(false);
        buttonAddImagem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonAddImagemActionPerformed(evt);
            }
        });

        jPanel3.setBackground(new java.awt.Color(60, 60, 60));

        txtNumProdutos.setFont(new java.awt.Font("Noto Serif", 1, 24)); // NOI18N
        txtNumProdutos.setForeground(new java.awt.Color(255, 255, 255));
        txtNumProdutos.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtNumProdutos.setText("Nº de Produtos:");
        txtNumProdutos.setToolTipText("Apenas sites do tipo loja podem acrescentar produtos.");

        spinnerQntdProdutos.setFont(new java.awt.Font("Noto Sans", 1, 14)); // NOI18N
        spinnerQntdProdutos.setOpaque(true);

        buttonAjudaNumProdutos.setBackground(new java.awt.Color(237, 125, 49));
        buttonAjudaNumProdutos.setFont(new java.awt.Font("Noto Sans", 1, 12)); // NOI18N
        buttonAjudaNumProdutos.setForeground(new java.awt.Color(255, 255, 255));
        buttonAjudaNumProdutos.setText("?");
        buttonAjudaNumProdutos.setBorder(null);
        buttonAjudaNumProdutos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonAjudaNumProdutosActionPerformed(evt);
            }
        });

        txtQuantidadePaginas.setFont(new java.awt.Font("Noto Serif", 1, 24)); // NOI18N
        txtQuantidadePaginas.setForeground(new java.awt.Color(255, 255, 255));
        txtQuantidadePaginas.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtQuantidadePaginas.setText("Quantidade de páginas:");
        txtQuantidadePaginas.setToolTipText("Número de páginas. \n");

        comboBoxPaginas.setBackground(new java.awt.Color(255, 255, 255));
        comboBoxPaginas.setFont(new java.awt.Font("Noto Sans", 1, 14)); // NOI18N
        comboBoxPaginas.setForeground(new java.awt.Color(51, 51, 51));
        comboBoxPaginas.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-", "3", "4", "5", "6", "7", "8" }));
        comboBoxPaginas.setToolTipText("Recomenda-se no mínimo 3 para o site ser mais organizado e a navegação do site ser mais fluída.");

        radioButton2.setBackground(new java.awt.Color(60, 60, 60));
        buttonGroup.add(radioButton2);
        radioButton2.setFont(new java.awt.Font("Noto Sans", 0, 18)); // NOI18N
        radioButton2.setForeground(java.awt.Color.white);
        radioButton2.setText("Loja");
        radioButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioButton2ActionPerformed(evt);
            }
        });

        radioButton1.setBackground(new java.awt.Color(60, 60, 60));
        buttonGroup.add(radioButton1);
        radioButton1.setFont(new java.awt.Font("Noto Sans", 0, 18)); // NOI18N
        radioButton1.setForeground(java.awt.Color.white);
        radioButton1.setText("Institucional");
        radioButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioButton1ActionPerformed(evt);
            }
        });

        txtTipo1.setFont(new java.awt.Font("Noto Serif", 1, 24)); // NOI18N
        txtTipo1.setForeground(new java.awt.Color(255, 255, 255));
        txtTipo1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtTipo1.setText("Qual o tipo do seu site?");

        buttonAjudaTipoSite.setBackground(new java.awt.Color(237, 125, 49));
        buttonAjudaTipoSite.setFont(new java.awt.Font("Noto Sans", 1, 12)); // NOI18N
        buttonAjudaTipoSite.setForeground(new java.awt.Color(255, 255, 255));
        buttonAjudaTipoSite.setText("?");
        buttonAjudaTipoSite.setBorder(null);
        buttonAjudaTipoSite.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonAjudaTipoSiteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(txtNumProdutos)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(spinnerQntdProdutos, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(buttonAjudaNumProdutos, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(txtQuantidadePaginas)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(comboBoxPaginas, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(txtTipo1)
                        .addGap(18, 18, 18)
                        .addComponent(buttonAjudaTipoSite, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addComponent(radioButton1)
                        .addGap(27, 27, 27)
                        .addComponent(radioButton2)))
                .addContainerGap(32, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(buttonAjudaTipoSite, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtTipo1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(radioButton1)
                    .addComponent(radioButton2))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtQuantidadePaginas)
                    .addComponent(comboBoxPaginas, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(spinnerQntdProdutos, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(buttonAjudaNumProdutos, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(txtNumProdutos))
                .addContainerGap(52, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtSite)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonAddImagem, javax.swing.GroupLayout.PREFERRED_SIZE, 424, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtSite)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(buttonAddImagem, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 419, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void buttonVoltarPaginaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonVoltarPaginaMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_buttonVoltarPaginaMouseClicked

    private void buttonVoltarPaginaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonVoltarPaginaMouseEntered
        buttonVoltarPagina.setIcon(new javax.swing.ImageIcon(getClass().getResource("/orçamentoDeMarketing/images/back-page-icon-entered.png")));
    }//GEN-LAST:event_buttonVoltarPaginaMouseEntered

    private void buttonVoltarPaginaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonVoltarPaginaMouseExited
        buttonVoltarPagina.setIcon(new javax.swing.ImageIcon(getClass().getResource("/orçamentoDeMarketing/images/back-page-icon.png")));
    }//GEN-LAST:event_buttonVoltarPaginaMouseExited

    private void buttonVoltarPaginaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonVoltarPaginaActionPerformed
        OpcoesUI op = new OpcoesUI();
        op.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_buttonVoltarPaginaActionPerformed

    private void buttonAjudaTipoSiteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonAjudaTipoSiteActionPerformed
        JOptionPane.showMessageDialog(null,
                "Um site institucional é um tipo de website que"
                + "\nrepresenta uma organização ou empresa, fornecendo"
                + "\ninformações sobre sua identidade, missão e serviços."
                + "\n\n"
                + "Já o site tipo Loja, fornece as informações que o"
                + "\ninstitucional oferece, mas com uma loja acoplada,"
                + "\nonde o cliente consegue comprar pelo próprio site,"
                + "\nsem intermédio de terceiros ou atendimento");
    }//GEN-LAST:event_buttonAjudaTipoSiteActionPerformed

    private void radioButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioButton2ActionPerformed
        spinnerQntdProdutos.setEnabled(true);
    }//GEN-LAST:event_radioButton2ActionPerformed

    private void buttonAjudaNumProdutosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonAjudaNumProdutosActionPerformed
        JOptionPane.showMessageDialog(null, "Valor por produto:"
                + "\nAté 10 -----------> R$40"
                + "\nAté 20 -----------> R$35"
                + "\nAté 100 ----------> R$27.50"
                + "\nAté 250 ----------> R$20"
                + "\nAté 400 ----------> R$12.50"
                + "\nMais que 400 -----> R$5");
    }//GEN-LAST:event_buttonAjudaNumProdutosActionPerformed

    private void radioButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioButton1ActionPerformed
        spinnerQntdProdutos.setEnabled(false);
    }//GEN-LAST:event_radioButton1ActionPerformed

    private void buttonAddImagemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonAddImagemActionPerformed
        if (String.valueOf(comboBoxPaginas.getSelectedItem()) == "-" || buttonGroup.getSelection() == null || spinnerQntdProdutos.getValue() == null) {
            JOptionPane.showMessageDialog(null, "Preencha todos os campos!");
        } else {
            if (radioButton1.isSelected()) {
                listaSites.adicionar(new Institucional(
                        "institucional", 
                        Integer.parseInt(String.valueOf(comboBoxPaginas.getSelectedItem()))));
            } else {
                listaSites.adicionar(new Loja(
                        "loja",
                        Integer.parseInt(String.valueOf(comboBoxPaginas.getSelectedItem())),
                Integer.parseInt(spinnerQntdProdutos.getValue().toString())));
            }
            JOptionPane.showMessageDialog(null, "Site adicionado com sucesso ao carrinho! ");
            OpcoesUI op = new OpcoesUI();
            op.setVisible(true);
            this.dispose();
        }
    }//GEN-LAST:event_buttonAddImagemActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void Site(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(SiteUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SiteUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SiteUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SiteUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SiteUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonAddImagem;
    private javax.swing.JButton buttonAjudaNumProdutos;
    private javax.swing.JButton buttonAjudaTipoSite;
    private javax.swing.ButtonGroup buttonGroup;
    private javax.swing.JButton buttonVoltarPagina;
    private javax.swing.JComboBox<String> comboBoxPaginas;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JRadioButton radioButton1;
    private javax.swing.JRadioButton radioButton2;
    private javax.swing.JSpinner spinnerQntdProdutos;
    private javax.swing.JLabel txtNumProdutos;
    private javax.swing.JLabel txtQuantidadePaginas;
    private javax.swing.JLabel txtSite;
    private javax.swing.JLabel txtTipo1;
    // End of variables declaration//GEN-END:variables
}
