/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package amharicstopwordremoval;

import java.awt.Color;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import static java.util.Arrays.asList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.text.Highlighter;

/**
 *
 * @author Epha
 */
public class UI extends javax.swing.JFrame {

    /**
     * Creates new form UI
     */
    public UI() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem1 = new javax.swing.JMenuItem();
        jScrollPane1 = new javax.swing.JScrollPane();
        result_jTextArea1 = new javax.swing.JTextArea();
        jButton1 = new javax.swing.JButton();
        get_input_sentences = new javax.swing.JTextField();
        sentence_jRadioButton1 = new javax.swing.JRadioButton();
        file_jRadioButton2 = new javax.swing.JRadioButton();
        get_files = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        file_chooseerButton1 = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();

        jMenuItem1.setText("jMenuItem1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        result_jTextArea1.setColumns(20);
        result_jTextArea1.setFont(new java.awt.Font("Nyala", 0, 12)); // NOI18N
        result_jTextArea1.setRows(5);
        jScrollPane1.setViewportView(result_jTextArea1);

        jButton1.setFont(new java.awt.Font("Nyala", 0, 18)); // NOI18N
        jButton1.setText("ማሰሪያ-አንቀጽ እና አያያዦችን ለይ");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        get_input_sentences.setFont(new java.awt.Font("Nyala", 0, 12)); // NOI18N
        get_input_sentences.setText("ዓ.ነገር............................");

        sentence_jRadioButton1.setFont(new java.awt.Font("Nyala", 0, 14)); // NOI18N
        sentence_jRadioButton1.setText("ዓርፍተ-ነገር ይምረጡ");

        file_jRadioButton2.setFont(new java.awt.Font("Nyala", 0, 12)); // NOI18N
        file_jRadioButton2.setText("ከማህደር ዶክመንት ይክፈቱ");

        get_files.setFont(new java.awt.Font("Nyala", 0, 12)); // NOI18N
        get_files.setText("ዶክመንት..........");

        jButton2.setFont(new java.awt.Font("Nyala", 0, 18)); // NOI18N
        jButton2.setText("አጽዳ");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        file_chooseerButton1.setFont(new java.awt.Font("Nyala", 0, 18)); // NOI18N
        file_chooseerButton1.setText("ዶክመንት ምረጥ");
        file_chooseerButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                file_chooseerButton1ActionPerformed(evt);
            }
        });

        jMenu1.setText("ክአማርኛ ዶክመንት ማሰርያ-አንቀጽ እና አያያዦችን መለያ መተግበሪያ ");
        jMenu1.setFont(new java.awt.Font("Nyala", 0, 18)); // NOI18N
        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(66, 66, 66)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(sentence_jRadioButton1)
                            .addComponent(file_jRadioButton2))
                        .addGap(27, 27, 27)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(get_files, javax.swing.GroupLayout.PREFERRED_SIZE, 284, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(file_chooseerButton1))
                            .addComponent(get_input_sentences, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 427, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(133, 133, 133)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(89, 89, 89)
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton2)
                .addGap(122, 122, 122))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(sentence_jRadioButton1)
                    .addComponent(get_input_sentences, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(get_files, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(file_chooseerButton1))
                    .addComponent(file_jRadioButton2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 46, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton2, javax.swing.GroupLayout.Alignment.TRAILING)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    @SuppressWarnings("unchecked")
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        Tokenizer t = new Tokenizer();
        if (sentence_jRadioButton1.isSelected()) {
            get_files.setEditable(false);
            //  file_jRadioButton2.setDisabledSelectedIcon(disabledSelectedIcon);
            String sentence = get_input_sentences.getText();
            List tokens = t.parsetSentencesList(sentence);
            for (int i = 0; i < tokens.size(); i++) {
                result_jTextArea1.append(tokens.get(i).toString() + "\n");
                result_jTextArea1.setSelectedTextColor(Color.red);
                result_jTextArea1.setSelectionColor(Color.blue);

            }
        } else if (file_jRadioButton2.isSelected()) {
            get_input_sentences.setEditable(false);
            String text = null;
            try {
                text = new FileReaders().read(get_files.getText());
            } catch (IOException ex) {
                Logger.getLogger(UI.class.getName()).log(Level.SEVERE, null, ex);
            }
            List sen = t.parseParagraphsList(text.trim());
            for (Iterator it = sen.iterator(); it.hasNext();) {
                Object p = it.next();
                List<String> words = t.parsetSentencesList(p.toString().trim());
                for (int i = 0; i < words.size(); i++) {
                    result_jTextArea1.append(words.get(i) + "\n");
                }
            }
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        get_input_sentences.setText("");
        result_jTextArea1.setText("");        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void file_chooseerButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_file_chooseerButton1ActionPerformed
        JFileChooser chooser = new JFileChooser();
        chooser.showOpenDialog(null);
        File f = chooser.getSelectedFile();
        get_files.setText(f.getAbsolutePath()); // TODO add your handling code here:
    }//GEN-LAST:event_file_chooseerButton1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
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
            java.util.logging.Logger.getLogger(UI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton file_chooseerButton1;
    private javax.swing.JRadioButton file_jRadioButton2;
    private javax.swing.JTextField get_files;
    private javax.swing.JTextField get_input_sentences;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea result_jTextArea1;
    private javax.swing.JRadioButton sentence_jRadioButton1;
    // End of variables declaration//GEN-END:variables
}
