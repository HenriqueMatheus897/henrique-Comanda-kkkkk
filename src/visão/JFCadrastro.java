 package visão;




import java.awt.Color;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;
import javafx.stage.FileChooser;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import java.awt.Image;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author henrique matheus
 */
public class JFCadrastro extends javax.swing.JFrame {

    private Object jTxTabela;

    
    
    public JFCadrastro() {
        initComponents();
        
      //  jTxtEndereço.setBackground(new Color(0,0,0,0));
    }
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel8 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jLabel4 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        buttonGroup3 = new javax.swing.ButtonGroup();
        buttonGroup4 = new javax.swing.ButtonGroup();
        jbApagar = new javax.swing.JButton();
        jbInserir = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanelEmail = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea2 = new javax.swing.JTextArea();
        jPanel2 = new javax.swing.JPanel();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jLabel13 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jTxtCep2 = new javax.swing.JFormattedTextField();
        jTxtEndereço2 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jTxtRG = new javax.swing.JFormattedTextField();
        jTxtCPF = new javax.swing.JFormattedTextField();
        jTxtTelefone = new javax.swing.JFormattedTextField();
        jTxtCelular = new javax.swing.JFormattedTextField();
        jTxtBairro = new javax.swing.JTextField();
        jTxtEmail = new javax.swing.JTextField();
        jTxtObiservaçoes = new javax.swing.JTextField();
        jTxtNome = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        jTxtEndereço = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();

        jLabel8.setText("jLabel8");

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        jLabel4.setText("Sexo:");

        jTextField2.setText("jTextField2");

        jbApagar.setText("Apagar");

        jbInserir.setText("Inserir");
        jbInserir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbInserirActionPerformed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(46, 49, 56));

        jLabel1.setBackground(new java.awt.Color(82, 94, 108));
        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(82, 94, 108));
        jLabel1.setText("Nome:");

        jLabel2.setText("Email:");

        javax.swing.GroupLayout jPanelEmailLayout = new javax.swing.GroupLayout(jPanelEmail);
        jPanelEmail.setLayout(jPanelEmailLayout);
        jPanelEmailLayout.setHorizontalGroup(
            jPanelEmailLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 337, Short.MAX_VALUE)
        );
        jPanelEmailLayout.setVerticalGroup(
            jPanelEmailLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 32, Short.MAX_VALUE)
        );

        jLabel3.setText("Numero:");

        jLabel5.setText("Rua:");

        jLabel6.setText("Cep:");

        jLabel7.setText("Bairro:");

        jLabel10.setText("Data de Nacimento:");

        jLabel11.setText("WhatsApp:");

        jLabel12.setText("Celular:");

        jTextArea2.setColumns(20);
        jTextArea2.setRows(5);
        jScrollPane2.setViewportView(jTextArea2);

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Sexo:"));

        buttonGroup2.add(jRadioButton1);
        jRadioButton1.setText("Masculino");

        buttonGroup2.add(jRadioButton2);
        jRadioButton2.setText("Feminino");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jRadioButton1)
                .addGap(18, 18, 18)
                .addComponent(jRadioButton2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButton1)
                    .addComponent(jRadioButton2))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jLabel13.setText("Obiservações:");

        jButton2.setText("Selecionar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/cliente.png"))); // NOI18N
        jLabel14.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jLabel14.setMaximumSize(new java.awt.Dimension(0, 0));
        jLabel14.setMinimumSize(new java.awt.Dimension(0, 0));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel11)
                .addGap(34, 34, 34)
                .addComponent(jLabel12)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(87, 87, 87))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, 0)
                        .addComponent(jLabel9)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton2))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel13))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(jLabel1))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel7)))
                .addGap(24, 24, 24)
                .addComponent(jLabel6))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(0, 171, Short.MAX_VALUE)
                    .addComponent(jPanelEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 171, Short.MAX_VALUE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(103, 103, 103)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel10)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap(103, Short.MAX_VALUE)
                        .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel3)
                    .addComponent(jLabel7)
                    .addComponent(jLabel6))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel12, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel11, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(jLabel2)))
                .addGap(7, 7, 7)
                .addComponent(jLabel9)
                .addGap(31, 31, 31)
                .addComponent(jLabel13)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton2))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(0, 286, Short.MAX_VALUE)
                    .addComponent(jPanelEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 286, Short.MAX_VALUE)))
        );

        jPanel1.getAccessibleContext().setAccessibleDescription("");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 413, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        jLabel15.setText("jLabel15");

        jLabel16.setBackground(new java.awt.Color(84, 94, 106));
        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/background_tela DeCadastro.jpg"))); // NOI18N

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 589, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Cadastro");
        setBackground(new java.awt.Color(4, 197, 130));
        setUndecorated(true);
        getContentPane().setLayout(null);

        jTxtCep2.setBorder(null);
        jTxtCep2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTxtCep2ActionPerformed(evt);
            }
        });
        getContentPane().add(jTxtCep2);
        jTxtCep2.setBounds(0, 0, 0, 14);

        jTxtEndereço2.setBackground(new java.awt.Color(84, 94, 106));
        jTxtEndereço2.setForeground(java.awt.Color.white);
        jTxtEndereço2.setBorder(null);
        jTxtEndereço2.setCaretColor(java.awt.Color.white);
        jTxtEndereço2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTxtEndereço2ActionPerformed(evt);
            }
        });
        getContentPane().add(jTxtEndereço2);
        jTxtEndereço2.setBounds(380, 330, 430, 20);

        jButton1.setBackground(new java.awt.Color(4, 197, 130));
        jButton1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton1.setForeground(java.awt.Color.white);
        jButton1.setText("Salvar");
        jButton1.setBorder(null);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(550, 620, 210, 50);

        jTxtRG.setBackground(new java.awt.Color(84, 94, 106));
        jTxtRG.setBorder(null);
        jTxtRG.setForeground(new java.awt.Color(255, 255, 255));
        jTxtRG.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(new java.text.SimpleDateFormat("dd-MM-yyyy"))));
        jTxtRG.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTxtRGActionPerformed(evt);
            }
        });
        getContentPane().add(jTxtRG);
        jTxtRG.setBounds(360, 180, 200, 20);

        jTxtCPF.setBackground(new java.awt.Color(84, 94, 106));
        jTxtCPF.setBorder(null);
        jTxtCPF.setForeground(new java.awt.Color(255, 255, 255));
        jTxtCPF.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat(""))));
        jTxtCPF.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                jTxtCPFComponentShown(evt);
            }
        });
        jTxtCPF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTxtCPFActionPerformed(evt);
            }
        });
        getContentPane().add(jTxtCPF);
        jTxtCPF.setBounds(860, 320, 90, 30);

        jTxtTelefone.setBackground(new java.awt.Color(84, 94, 106));
        jTxtTelefone.setBorder(null);
        jTxtTelefone.setForeground(new java.awt.Color(255, 255, 255));
        jTxtTelefone.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("############"))));
        getContentPane().add(jTxtTelefone);
        jTxtTelefone.setBounds(370, 410, 260, 30);

        jTxtCelular.setBackground(new java.awt.Color(84, 94, 106));
        jTxtCelular.setBorder(null);
        jTxtCelular.setForeground(new java.awt.Color(255, 255, 255));
        jTxtCelular.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#########"))));
        getContentPane().add(jTxtCelular);
        jTxtCelular.setBounds(670, 410, 260, 30);

        jTxtBairro.setBackground(new java.awt.Color(84, 94, 106));
        jTxtBairro.setForeground(new java.awt.Color(255, 255, 255));
        jTxtBairro.setBorder(null);
        getContentPane().add(jTxtBairro);
        jTxtBairro.setBounds(680, 260, 260, 30);

        jTxtEmail.setBackground(new java.awt.Color(82, 94, 108));
        jTxtEmail.setForeground(new java.awt.Color(255, 255, 255));
        jTxtEmail.setBorder(null);
        jTxtEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTxtEmailActionPerformed(evt);
            }
        });
        getContentPane().add(jTxtEmail);
        jTxtEmail.setBounds(350, 120, 420, 20);

        jTxtObiservaçoes.setBackground(new java.awt.Color(84, 94, 106));
        jTxtObiservaçoes.setForeground(new java.awt.Color(255, 255, 255));
        jTxtObiservaçoes.setBorder(null);
        jTxtObiservaçoes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTxtObiservaçoesActionPerformed(evt);
            }
        });
        getContentPane().add(jTxtObiservaçoes);
        jTxtObiservaçoes.setBounds(380, 480, 560, 101);

        jTxtNome.setBackground(new java.awt.Color(82, 94, 108));
        jTxtNome.setForeground(new java.awt.Color(255, 255, 255));
        jTxtNome.setBorder(null);
        jTxtNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTxtNomeActionPerformed(evt);
            }
        });
        getContentPane().add(jTxtNome);
        jTxtNome.setBounds(350, 50, 430, 20);

        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3);
        jButton3.setBounds(1260, 0, 60, 50);

        jTxtEndereço.setBackground(new java.awt.Color(84, 94, 106));
        jTxtEndereço.setForeground(new java.awt.Color(255, 255, 255));
        jTxtEndereço.setBorder(null);
        jTxtEndereço.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTxtEndereçoActionPerformed(evt);
            }
        });
        getContentPane().add(jTxtEndereço);
        jTxtEndereço.setBounds(370, 260, 260, 30);

        jLabel18.setBackground(java.awt.Color.white);
        jLabel18.setForeground(java.awt.Color.white);
        jLabel18.setText("Nome:");
        getContentPane().add(jLabel18);
        jLabel18.setBounds(340, 30, 140, 14);

        jLabel19.setForeground(java.awt.Color.white);
        jLabel19.setText("Observações:");
        getContentPane().add(jLabel19);
        jLabel19.setBounds(340, 450, 140, 20);

        jLabel20.setForeground(java.awt.Color.white);
        jLabel20.setText("Email:");
        getContentPane().add(jLabel20);
        jLabel20.setBounds(340, 90, 170, 20);

        jLabel21.setForeground(java.awt.Color.white);
        jLabel21.setText("Data de Aniversário:");
        getContentPane().add(jLabel21);
        jLabel21.setBounds(340, 160, 150, 20);

        jLabel22.setForeground(java.awt.Color.white);
        jLabel22.setText("WhatsApp:");
        getContentPane().add(jLabel22);
        jLabel22.setBounds(360, 390, 120, 20);

        jLabel23.setForeground(java.awt.Color.white);
        jLabel23.setText("Celular:");
        getContentPane().add(jLabel23);
        jLabel23.setBounds(670, 390, 140, 20);

        jLabel24.setForeground(java.awt.Color.white);
        jLabel24.setText("Cidade:");
        getContentPane().add(jLabel24);
        jLabel24.setBounds(360, 240, 140, 14);

        jLabel25.setForeground(java.awt.Color.white);
        jLabel25.setText("Bairro:");
        getContentPane().add(jLabel25);
        jLabel25.setBounds(670, 240, 170, 14);

        jLabel26.setForeground(java.awt.Color.white);
        jLabel26.setText("Rua:");
        getContentPane().add(jLabel26);
        jLabel26.setBounds(360, 300, 170, 20);

        jLabel27.setForeground(java.awt.Color.white);
        jLabel27.setText("Numero:");
        getContentPane().add(jLabel27);
        jLabel27.setBounds(850, 300, 80, 20);

        jLabel30.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/azul.jpg"))); // NOI18N
        getContentPane().add(jLabel30);
        jLabel30.setBounds(850, 0, 390, 10);

        jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/---Cadrasto.png"))); // NOI18N
        getContentPane().add(jLabel17);
        jLabel17.setBounds(20, 0, 1320, 700);

        jLabel28.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/azul.jpg"))); // NOI18N
        getContentPane().add(jLabel28);
        jLabel28.setBounds(1200, 70, 80, 510);

        jLabel29.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/azul.jpg"))); // NOI18N
        jLabel29.setText("jLabel29");
        getContentPane().add(jLabel29);
        jLabel29.setBounds(1200, 500, 80, 160);

        jLabel31.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/azul.jpg"))); // NOI18N
        getContentPane().add(jLabel31);
        jLabel31.setBounds(0, 0, 390, 20);

        jLabel32.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/azul.jpg"))); // NOI18N
        getContentPane().add(jLabel32);
        jLabel32.setBounds(390, 0, 390, 20);

        jLabel33.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/azul.jpg"))); // NOI18N
        getContentPane().add(jLabel33);
        jLabel33.setBounds(780, 0, 390, 20);

        jLabel34.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/azul.jpg"))); // NOI18N
        getContentPane().add(jLabel34);
        jLabel34.setBounds(820, 640, 390, 20);

        jLabel35.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/azul.jpg"))); // NOI18N
        getContentPane().add(jLabel35);
        jLabel35.setBounds(430, 640, 390, 20);

        jLabel36.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/azul.jpg"))); // NOI18N
        getContentPane().add(jLabel36);
        jLabel36.setBounds(40, 640, 390, 20);

        jLabel37.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/azul.jpg"))); // NOI18N
        getContentPane().add(jLabel37);
        jLabel37.setBounds(0, 640, 390, 20);

        setSize(new java.awt.Dimension(1314, 698));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jTxtCPFComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_jTxtCPFComponentShown
        // TODO add your handling code here:
    }//GEN-LAST:event_jTxtCPFComponentShown

    private void jTxtCPFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTxtCPFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTxtCPFActionPerformed

    private void jTxtObiservaçoesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTxtObiservaçoesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTxtObiservaçoesActionPerformed

    private void jbInserirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbInserirActionPerformed

    }//GEN-LAST:event_jbInserirActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed

   /*     JFileChooser arquivo = new JFileChooser();
        arquivo.setDialogTitle("Selecione uma foto");
        arquivo.setFileSelectionMode(JFileChooser.FILES_ONLY);
        
        int opc = arquivo.showOpenDialog(this);
        if(opc == JFileChooser.APPROVE_OPTION) {
            File file = new File("Caminho");
            file=arquivo.getSelectedFile(); //RECEBE O CAMINHO
            String filename = file.getAbsolutePath();
            jTextFieldPath.setText(filename);
            
            
            ImageIcon imagem = new ImageIcon(arquivo.getSelectedFile().getPath());
            jLabel14.setIcon(new ImageIcon(imagem.getImage().getScaledInstance(jLabel14.getWidth(), jLabel14.getHeight(), Image.SCALE_DEFAULT)));
          */  
           
        //}
        //JFileChooser chooser = new JFileChooser(); //Se o usuário não apertar ok, cancela a operação 
       // if (chooser.showOpenDialog(this) != JFileChooser.APPROVE_OPTION) { return; 
       // }
       
       /*JFileChooser chooser = new JFileChooser();
       if (chooser.showOpenDialog(this) != JFileChooser.APPROVE_OPTION) {
       return;
       }
       File f = chooser.getSelectedFile();
      
      // jLabel14.setIcon(new ImageIcon(f));
       jLabel14.setIcon(new ImageIcon(f.toString())); */
       
       
       
       
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jTxtNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTxtNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTxtNomeActionPerformed

    private void jTxtCep2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTxtCep2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTxtCep2ActionPerformed

    private void jTxtEndereço2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTxtEndereço2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTxtEndereço2ActionPerformed

    private void jTxtEndereçoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTxtEndereçoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTxtEndereçoActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        Date dataSistema = new Date();
        SimpleDateFormat formato = new SimpleDateFormat("dd-MM-yyyy");

        Clientes clientes = new Clientes();

        clientes.setNome(jTxtNome.getText()); //pega o texto que esta no formulario
        clientes.setEmail(jTxtEmail.getText());
        clientes.setCpf(jTxtCPF.getText());
        clientes.setRG(jTxtRG.getText());
        clientes.setEndereço(jTxtEndereço2.getText());
        clientes.setBairro(jTxtBairro.getText());
        clientes.setCep(jTxtCep2.getText());
        clientes.setTelefone(jTxtTelefone.getText());
        clientes.setCelular(jTxtCelular.getText());
        clientes.setObiservaçoes(jTxtObiservaçoes.getText());
        clientes.setCidade(jTxtEndereço.getText());
       // clientes.setFoto(jTextFieldPath.getText());
        clientes.setHora(formato.format(dataSistema)); 

        JOptionPane.showMessageDialog(null, clientes.sauvar());

        jTxtNome.setText("");
        jTxtEmail.setText("");
        jTxtCPF.setText("");
        jTxtRG.setText("");
        jTxtEndereço2.setText("");
        jTxtBairro.setText("");
        jTxtCep2.setText("");
        jTxtTelefone.setText("");
        jTxtCelular.setText("");
        jTxtObiservaçoes.setText("");
        //jTextFieldPath.setText("");
        
              
        

    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
dispose();
TelaPrincipal tela = new TelaPrincipal();
                       tela.setVisible(true);

    }//GEN-LAST:event_jButton3ActionPerformed

    private void jTxtEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTxtEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTxtEmailActionPerformed

    private void jTxtRGActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTxtRGActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTxtRGActionPerformed

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
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
        }
        //</editor-fold>
        //</editor-fold>
        
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new JFCadrastro().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.ButtonGroup buttonGroup3;
    private javax.swing.ButtonGroup buttonGroup4;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanelEmail;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextArea jTextArea2;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTxtBairro;
    private javax.swing.JFormattedTextField jTxtCPF;
    private javax.swing.JFormattedTextField jTxtCelular;
    private javax.swing.JFormattedTextField jTxtCep2;
    private javax.swing.JTextField jTxtEmail;
    private javax.swing.JTextField jTxtEndereço;
    private javax.swing.JTextField jTxtEndereço2;
    private javax.swing.JTextField jTxtNome;
    private javax.swing.JTextField jTxtObiservaçoes;
    private javax.swing.JFormattedTextField jTxtRG;
    private javax.swing.JFormattedTextField jTxtTelefone;
    private javax.swing.JButton jbApagar;
    private javax.swing.JButton jbInserir;
    // End of variables declaration//GEN-END:variables

    private static class util {

        public util() {
        }

        private static class logging {

            public logging() {
            }

            private static class Level {

               // private static com.sun.org.apache.xalan.internal.xsltc.compiler.util.Type SEVERE;

                public Level() {
                }
            }

            private static class Logger {

                private static Object getLogger(String name) {
                    throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
                }

                public Logger() {
                }
            }
        }
    }
}
