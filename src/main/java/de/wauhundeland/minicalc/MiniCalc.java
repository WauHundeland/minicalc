/*
 * Copyright (C) 2023 wauhundeland
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package de.wauhundeland.minicalc;

import com.formdev.flatlaf.themes.FlatMacLightLaf;
import java.io.PrintWriter;
import java.io.StringWriter;
import net.objecthunter.exp4j.*;

/**
 *
 * @author wauhundeland
 */
public class MiniCalc extends javax.swing.JFrame {

    /**
     * Creates new form MiniCalc
     */
    public MiniCalc() {
        initComponents();
    }

    public Expression parseExpression(String x) {
        return new ExpressionBuilder(x)
                .variables("x", "y")
                .build()
                .setVariable("x", Double.parseDouble(xVar.getText()))
                .setVariable("y", Double.parseDouble(yVar.getText()));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        StacktraceContainer = new javax.swing.JFrame();
        StacktraceScrollPane = new javax.swing.JScrollPane();
        StacktraceTextPane = new javax.swing.JTextPane();
        TabPane = new javax.swing.JTabbedPane();
        CalculatorPanel = new javax.swing.JPanel();
        jTextField1 = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        jLabel2 = new javax.swing.JLabel();
        jCheckBox2 = new javax.swing.JCheckBox();
        VariablesPanel = new javax.swing.JPanel();
        yVarLabel = new javax.swing.JLabel();
        xVar = new javax.swing.JTextField();
        xVarLabel = new javax.swing.JLabel();
        yVar = new javax.swing.JTextField();
        SettingsPanel = new javax.swing.JPanel();
        AlwaysOnTopCheckbox = new javax.swing.JCheckBox();
        LastErrorLabel = new javax.swing.JLabel();
        LastErrorSeperator = new javax.swing.JSeparator();
        ErrorScrollPane = new javax.swing.JScrollPane();
        ErrorTextPane = new javax.swing.JTextPane();
        BackToCalculatorButton = new javax.swing.JButton();
        ShowStacktraceButton = new javax.swing.JButton();
        MenuBar = new javax.swing.JMenuBar();
        FileMenu = new javax.swing.JMenu();
        CloseMenuItem = new javax.swing.JMenuItem();

        StacktraceContainer.setTitle("Stacktrace-Anzeige");
        StacktraceContainer.setSize(new java.awt.Dimension(350, 248));

        StacktraceTextPane.setContentType("text/html"); // NOI18N
        StacktraceTextPane.setFont(new java.awt.Font("Consolas", 0, 12)); // NOI18N
        StacktraceTextPane.setText("<html>\r\n  <head>\r\n\r\n  </head>\r\n  <body>\r\n    <p style=\"margin-top: 0; color: green\">\r\n      \rKein Stacktrace verfügbar!\n    </p>\r\n  </body>\r\n</html>\r\n");
        StacktraceScrollPane.setViewportView(StacktraceTextPane);

        javax.swing.GroupLayout StacktraceContainerLayout = new javax.swing.GroupLayout(StacktraceContainer.getContentPane());
        StacktraceContainer.getContentPane().setLayout(StacktraceContainerLayout);
        StacktraceContainerLayout.setHorizontalGroup(
            StacktraceContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(StacktraceContainerLayout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(StacktraceScrollPane, javax.swing.GroupLayout.DEFAULT_SIZE, 418, Short.MAX_VALUE)
                .addGap(6, 6, 6))
        );
        StacktraceContainerLayout.setVerticalGroup(
            StacktraceContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(StacktraceContainerLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(StacktraceScrollPane, javax.swing.GroupLayout.DEFAULT_SIZE, 259, Short.MAX_VALUE)
                .addContainerGap())
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("MiniCalc");

        TabPane.setTabPlacement(javax.swing.JTabbedPane.RIGHT);

        jTextField1.setFont(new java.awt.Font("Cambria Math", 0, 14)); // NOI18N
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Cambria Math", 0, 12)); // NOI18N
        jLabel2.setText("<html>\n");
        jLabel2.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jScrollPane2.setViewportView(jLabel2);

        jCheckBox2.setText("Ergebnis übernehmen");

        javax.swing.GroupLayout CalculatorPanelLayout = new javax.swing.GroupLayout(CalculatorPanel);
        CalculatorPanel.setLayout(CalculatorPanelLayout);
        CalculatorPanelLayout.setHorizontalGroup(
            CalculatorPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CalculatorPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(CalculatorPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jTextField1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(CalculatorPanelLayout.createSequentialGroup()
                        .addComponent(jCheckBox2)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        CalculatorPanelLayout.setVerticalGroup(
            CalculatorPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CalculatorPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jCheckBox2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 131, Short.MAX_VALUE)
                .addContainerGap())
        );

        TabPane.addTab("Berechnen", CalculatorPanel);

        yVarLabel.setText("y = ");

        xVar.setText("0");

        xVarLabel.setText("x = ");

        yVar.setText("0");

        javax.swing.GroupLayout VariablesPanelLayout = new javax.swing.GroupLayout(VariablesPanel);
        VariablesPanel.setLayout(VariablesPanelLayout);
        VariablesPanelLayout.setHorizontalGroup(
            VariablesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(VariablesPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(VariablesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(xVarLabel)
                    .addComponent(yVarLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(VariablesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(yVar, javax.swing.GroupLayout.DEFAULT_SIZE, 287, Short.MAX_VALUE)
                    .addComponent(xVar))
                .addContainerGap())
        );
        VariablesPanelLayout.setVerticalGroup(
            VariablesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(VariablesPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(VariablesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(xVar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(xVarLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(VariablesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(yVar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(yVarLabel))
                .addContainerGap(142, Short.MAX_VALUE))
        );

        TabPane.addTab("Variablen", VariablesPanel);

        AlwaysOnTopCheckbox.setText("Immer im Vordergrund");
        AlwaysOnTopCheckbox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AlwaysOnTopCheckboxActionPerformed(evt);
            }
        });

        LastErrorLabel.setText("Letzter Fehler: ");

        ErrorTextPane.setEditable(false);
        ErrorTextPane.setContentType("text/html"); // NOI18N
        ErrorTextPane.setText("<html>\r\n  <head>\r\n\r\n  </head>\r\n  <body>\r\n    <p style=\"margin-top: 0; color: green\">\r\n      \rKeine Fehler!\n    </p>\r\n  </body>\r\n</html>\r\n");
        ErrorScrollPane.setViewportView(ErrorTextPane);

        BackToCalculatorButton.setText("Zurück zum Rechenfenster");
        BackToCalculatorButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackToCalculatorButtonActionPerformed(evt);
            }
        });

        ShowStacktraceButton.setText("Fehler-Stacktrace anzeigen");
        ShowStacktraceButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ShowStacktraceButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout SettingsPanelLayout = new javax.swing.GroupLayout(SettingsPanel);
        SettingsPanel.setLayout(SettingsPanelLayout);
        SettingsPanelLayout.setHorizontalGroup(
            SettingsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SettingsPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(SettingsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ErrorScrollPane, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(LastErrorSeperator, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(AlwaysOnTopCheckbox, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(BackToCalculatorButton, javax.swing.GroupLayout.DEFAULT_SIZE, 313, Short.MAX_VALUE)
                    .addGroup(SettingsPanelLayout.createSequentialGroup()
                        .addComponent(LastErrorLabel)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(ShowStacktraceButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        SettingsPanelLayout.setVerticalGroup(
            SettingsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SettingsPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(AlwaysOnTopCheckbox)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(LastErrorSeperator, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(LastErrorLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ErrorScrollPane, javax.swing.GroupLayout.DEFAULT_SIZE, 79, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ShowStacktraceButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(BackToCalculatorButton))
        );

        TabPane.addTab("Einstellungen", SettingsPanel);

        FileMenu.setText("Datei");

        CloseMenuItem.setText("Schließen");
        CloseMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CloseMenuItemActionPerformed(evt);
            }
        });
        FileMenu.add(CloseMenuItem);

        MenuBar.add(FileMenu);

        setJMenuBar(MenuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(TabPane)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(TabPane)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        try {
            Expression exp = parseExpression(jTextField1.getText());

            double result = exp.evaluate();

            jLabel2.setText(jLabel2.getText() + jTextField1.getText() + " = " + result + "<br>");
            if (jCheckBox2.isSelected()) {
                jTextField1.setText(Double.toString(result));
            } else {
                jTextField1.setText("");
            }
        } catch (Exception ex) {
            StringWriter sw = new StringWriter();
            PrintWriter pw = new PrintWriter(sw);
            ex.printStackTrace(pw);

            TabPane.setSelectedIndex(2);
            ErrorTextPane.setText("<html><p style=\"margin-top: 0; color: red\">" + ex.getLocalizedMessage());
            StacktraceTextPane.setText("<html><p style=\"margin-top: 0; color: red\">" + sw.toString());
        }
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void AlwaysOnTopCheckboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AlwaysOnTopCheckboxActionPerformed
        if (AlwaysOnTopCheckbox.isSelected()) {
            setAlwaysOnTop(true);
        } else {
            setAlwaysOnTop(false);
        }
    }//GEN-LAST:event_AlwaysOnTopCheckboxActionPerformed

    private void BackToCalculatorButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackToCalculatorButtonActionPerformed
        TabPane.setSelectedIndex(0);
    }//GEN-LAST:event_BackToCalculatorButtonActionPerformed

    private void CloseMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CloseMenuItemActionPerformed
        System.exit(0);
    }//GEN-LAST:event_CloseMenuItemActionPerformed

    private void ShowStacktraceButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ShowStacktraceButtonActionPerformed
        StacktraceContainer.show();
    }//GEN-LAST:event_ShowStacktraceButtonActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        FlatMacLightLaf.setup();
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new MiniCalc().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox AlwaysOnTopCheckbox;
    private javax.swing.JButton BackToCalculatorButton;
    private javax.swing.JPanel CalculatorPanel;
    private javax.swing.JMenuItem CloseMenuItem;
    private javax.swing.JScrollPane ErrorScrollPane;
    private javax.swing.JTextPane ErrorTextPane;
    private javax.swing.JMenu FileMenu;
    private javax.swing.JLabel LastErrorLabel;
    private javax.swing.JSeparator LastErrorSeperator;
    private javax.swing.JMenuBar MenuBar;
    private javax.swing.JPanel SettingsPanel;
    private javax.swing.JButton ShowStacktraceButton;
    private javax.swing.JFrame StacktraceContainer;
    private javax.swing.JScrollPane StacktraceScrollPane;
    private javax.swing.JTextPane StacktraceTextPane;
    private javax.swing.JTabbedPane TabPane;
    private javax.swing.JPanel VariablesPanel;
    private javax.swing.JCheckBox jCheckBox2;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField xVar;
    private javax.swing.JLabel xVarLabel;
    private javax.swing.JTextField yVar;
    private javax.swing.JLabel yVarLabel;
    // End of variables declaration//GEN-END:variables
}
