
import java.util.Random;
import javax.swing.DefaultListModel;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author israe
 */
public class TelaLuta extends javax.swing.JFrame {

    Lutador l[] = new Lutador[6];
    DefaultListModel lista1 = new DefaultListModel();
    DefaultListModel lista2 = new DefaultListModel();
    String nomeLut1;
    String nomeLut2;
    int numLut1;
    int numLut2;
    
    

    
    
    
    
    public TelaLuta() {
        initComponents();
        
    l[0] = new Lutador("Pretty Boy", "França", 31, 1.75f, 68.9f, 11, 2, 1);
    l[1] = new Lutador("Putscript", "Brasil", 29, 1.68f, 57.8f, 14, 2, 3);
    l[2] = new Lutador("Snapshadow", "EUA", 35, 1.65f, 80.9f, 12, 2, 1);
    l[3] = new Lutador("Dead Code", "Austrália", 28, 1.93f, 81.6f, 13, 0, 2);
    l[4] = new Lutador("UF0Cobol", "Brasil", 37, 1.70f, 119.3f, 5, 4, 3);
    l[5] = new Lutador("Nerdaart", "EUA", 30, 1.81f, 105.7f, 12, 2, 4); 
    
    panel1.setVisible(false);
    panel2.setVisible(false);    
        
          for (int cont = 0; cont <= 5; cont++){
            String n1 = l[cont].getNome();
            String n2 = l[cont].getNome();
            lista1.addElement(n1);
            lista2.addElement(n2);
             
    
          }
    
          jLista1.setModel(lista1);
          jLista2.setModel(lista2);
    
    }
    

 
    
    
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lLutador1 = new javax.swing.JLabel();
        lblP = new javax.swing.JLabel();
        lLutador2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jLista1 = new javax.swing.JList<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        jLista2 = new javax.swing.JList<>();
        lIdade1 = new javax.swing.JLabel();
        lPeso1 = new javax.swing.JLabel();
        lNac1 = new javax.swing.JLabel();
        lAltura1 = new javax.swing.JLabel();
        lCat1 = new javax.swing.JLabel();
        lPeso2 = new javax.swing.JLabel();
        lNac2 = new javax.swing.JLabel();
        lAltura2 = new javax.swing.JLabel();
        lCat2 = new javax.swing.JLabel();
        lIdade2 = new javax.swing.JLabel();
        tIdade1 = new javax.swing.JLabel();
        tNac1 = new javax.swing.JLabel();
        tAltura1 = new javax.swing.JLabel();
        tPeso1 = new javax.swing.JLabel();
        tCat1 = new javax.swing.JLabel();
        tAltura2 = new javax.swing.JLabel();
        tPeso2 = new javax.swing.JLabel();
        tCat2 = new javax.swing.JLabel();
        tIdade2 = new javax.swing.JLabel();
        tNac2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        btnMarcarLuta = new javax.swing.JButton();
        panel1 = new javax.swing.JPanel();
        lblAP1 = new javax.swing.JLabel();
        panel2 = new javax.swing.JPanel();
        lblAP2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lLutador1.setForeground(new java.awt.Color(0, 0, 0));
        lLutador1.setText("Escolha o lutador 1");

        lblP.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblP.setForeground(new java.awt.Color(0, 0, 255));
        lblP.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblP.setText("Bem-vindos ao sistema de luta");

        lLutador2.setForeground(new java.awt.Color(0, 0, 0));
        lLutador2.setText("Escolha o lutador 2");

        jLista1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLista1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jLista1);

        jLista2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLista2MouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jLista2);

        lIdade1.setForeground(new java.awt.Color(102, 0, 0));
        lIdade1.setText("Idade:");

        lPeso1.setForeground(new java.awt.Color(102, 0, 0));
        lPeso1.setText("Peso:");

        lNac1.setForeground(new java.awt.Color(102, 0, 0));
        lNac1.setText("Nac:");

        lAltura1.setForeground(new java.awt.Color(102, 0, 0));
        lAltura1.setText("Altura:");

        lCat1.setForeground(new java.awt.Color(102, 0, 0));
        lCat1.setText("Cat:");

        lPeso2.setForeground(new java.awt.Color(102, 0, 0));
        lPeso2.setText("Peso:");

        lNac2.setForeground(new java.awt.Color(102, 0, 0));
        lNac2.setText("Nac:");

        lAltura2.setForeground(new java.awt.Color(102, 0, 0));
        lAltura2.setText("Altura:");

        lCat2.setForeground(new java.awt.Color(102, 0, 0));
        lCat2.setText("Cat:");

        lIdade2.setForeground(new java.awt.Color(102, 0, 0));
        lIdade2.setText("Idade:");

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 102));
        jLabel1.setText("VS");

        btnMarcarLuta.setText("Marcar Luta");
        btnMarcarLuta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMarcarLutaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panel1Layout = new javax.swing.GroupLayout(panel1);
        panel1.setLayout(panel1Layout);
        panel1Layout.setHorizontalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblAP1, javax.swing.GroupLayout.DEFAULT_SIZE, 156, Short.MAX_VALUE)
                .addContainerGap())
        );
        panel1Layout.setVerticalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblAP1, javax.swing.GroupLayout.DEFAULT_SIZE, 88, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout panel2Layout = new javax.swing.GroupLayout(panel2);
        panel2.setLayout(panel2Layout);
        panel2Layout.setHorizontalGroup(
            panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblAP2, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        panel2Layout.setVerticalGroup(
            panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblAP2, javax.swing.GroupLayout.DEFAULT_SIZE, 89, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(lblP, javax.swing.GroupLayout.PREFERRED_SIZE, 456, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(lLutador1)
                        .addGap(156, 156, 156)
                        .addComponent(lLutador2))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(34, 34, 34)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(40, 40, 40)
                                .addComponent(jLabel1))
                            .addComponent(btnMarcarLuta))
                        .addGap(29, 29, 29)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(lNac1)
                        .addGap(18, 18, 18)
                        .addComponent(tNac1, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(156, 156, 156)
                        .addComponent(lNac2)
                        .addGap(6, 6, 6)
                        .addComponent(tNac2, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(lIdade1)
                        .addGap(9, 9, 9)
                        .addComponent(tIdade1, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(156, 156, 156)
                        .addComponent(lIdade2)
                        .addGap(6, 6, 6)
                        .addComponent(tIdade2, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(lAltura1)
                        .addGap(6, 6, 6)
                        .addComponent(tAltura1, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(156, 156, 156)
                        .addComponent(lAltura2)
                        .addGap(13, 13, 13)
                        .addComponent(tAltura2, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(lPeso1)
                        .addGap(12, 12, 12)
                        .addComponent(tPeso1, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(165, 165, 165)
                        .addComponent(lPeso2)
                        .addGap(2, 2, 2)
                        .addComponent(tPeso2, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(lCat1)
                        .addGap(18, 18, 18)
                        .addComponent(tCat1, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(166, 166, 166)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addComponent(tCat2, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(lCat2)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(panel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(66, 66, 66)
                        .addComponent(panel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(31, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(lblP, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lLutador1)
                    .addComponent(lLutador2))
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addComponent(jLabel1)
                        .addGap(25, 25, 25)
                        .addComponent(btnMarcarLuta))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lNac1)
                    .addComponent(tNac1, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lNac2)
                    .addComponent(tNac2, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lIdade2)
                    .addComponent(tIdade2, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lIdade1)
                            .addComponent(tIdade1, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(lAltura1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(tAltura1, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(lAltura2)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(tAltura2, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(4, 4, 4)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lPeso1)
                    .addComponent(tPeso1, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lPeso2)
                    .addComponent(tPeso2, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(4, 4, 4)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tCat2, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lCat2)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lCat1)
                            .addComponent(tCat1, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(panel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(panel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLista1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLista1MouseClicked
    //nomeLut1 = jLista1.getSelectionModel();
    numLut1 = jLista1.getSelectedIndex();
    tNac1.setText(l[numLut1].getNacionalidade());
    tIdade1.setText(Integer.toString(l[numLut1].getIdade()));
    tAltura1.setText(Float.toString(l[numLut1].getAltura()));
    tPeso1.setText(Float.toString(l[numLut1].getPeso()));
    tCat1.setText(l[numLut1].getCategoria());

        // TODO add your handling code here:
    }//GEN-LAST:event_jLista1MouseClicked

    private void jLista2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLista2MouseClicked
    numLut2 = jLista2.getSelectedIndex();
    tNac2.setText(l[numLut2].getNacionalidade());
    tIdade2.setText(Integer.toString(l[numLut2].getIdade()));
    tAltura2.setText(Float.toString(l[numLut2].getAltura()));
    tPeso2.setText(Float.toString(l[numLut2].getPeso()));
    tCat2.setText(l[numLut2].getCategoria());
    }//GEN-LAST:event_jLista2MouseClicked

    private void btnMarcarLutaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMarcarLutaActionPerformed
        // TODO add your handling code here:
        Luta UEC = new Luta();
        if(btnMarcarLuta.getText() == "Marcar Luta"){
         if ((l[numLut1].getCategoria().equals(l[numLut2].getCategoria())) && (l[numLut1] != l[numLut2])){
         UEC.setAprovada(true);
         UEC.setDesafiado(l[numLut1]);
         UEC.setDesafiante(l[numLut2]);
         //btnMarcarLuta.setText("Lutar");
         panel1.setVisible(true);
         lblAP1.setText(UEC.getDesafiado().apresentar());
         panel2.setVisible(true);
         lblAP2.setText(UEC.getDesafiante().apresentar());
         
         Random aleatorio = new Random();
         int n = aleatorio.nextInt(3);
            
            switch (n){
                    case 0:
                        lblP.setText("EMPATOU!!!!");
                        UEC.setDesafiado(l[numLut1]);
                        UEC.setDesafiante(l[numLut2]);
                        break;
                    case 1:
                        lblP.setText("Vitória do " + UEC.getDesafiado().getNome());
                        UEC.setDesafiado(l[numLut1]);
                        l[numLut1].ganharLuta();
                        UEC.setDesafiante(l[numLut2]);
                        l[numLut2].perderLuta();
                        break;
                    case 2:
                        lblP.setText("Vitória do " + UEC.getDesafiante().getNome());
                        UEC.setDesafiante(l[numLut1]);
                        l[numLut2].ganharLuta();
                        UEC.setDesafiado(l[numLut2]);
                        l[numLut1].perderLuta();
                        break;
                }
          }   
         else {
         UEC.setAprovada(false);
         lblP.setText("A luta não pode acontecer");
         } 
        }
        else{
            btnMarcarLuta.setText("Marcar Luta");
            
           
        }
    }//GEN-LAST:event_btnMarcarLutaActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        
        
    
    //jLista1.setModel(lista1); 
    //jLista2.setModel(lista2);
    
        
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
            java.util.logging.Logger.getLogger(TelaLuta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaLuta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaLuta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaLuta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaLuta().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnMarcarLuta;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JList<String> jLista1;
    private javax.swing.JList<String> jLista2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lAltura1;
    private javax.swing.JLabel lAltura2;
    private javax.swing.JLabel lCat1;
    private javax.swing.JLabel lCat2;
    private javax.swing.JLabel lIdade1;
    private javax.swing.JLabel lIdade2;
    private javax.swing.JLabel lLutador1;
    private javax.swing.JLabel lLutador2;
    private javax.swing.JLabel lNac1;
    private javax.swing.JLabel lNac2;
    private javax.swing.JLabel lPeso1;
    private javax.swing.JLabel lPeso2;
    private javax.swing.JLabel lblAP1;
    private javax.swing.JLabel lblAP2;
    private javax.swing.JLabel lblP;
    private javax.swing.JPanel panel1;
    private javax.swing.JPanel panel2;
    private javax.swing.JLabel tAltura1;
    private javax.swing.JLabel tAltura2;
    private javax.swing.JLabel tCat1;
    private javax.swing.JLabel tCat2;
    private javax.swing.JLabel tIdade1;
    private javax.swing.JLabel tIdade2;
    private javax.swing.JLabel tNac1;
    private javax.swing.JLabel tNac2;
    private javax.swing.JLabel tPeso1;
    private javax.swing.JLabel tPeso2;
    // End of variables declaration//GEN-END:variables
}
