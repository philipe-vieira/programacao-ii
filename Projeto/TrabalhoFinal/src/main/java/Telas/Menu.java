/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Telas;

/**
 * Tela de menu da aplica��o
 * @author Philipe
 */
public class Menu extends javax.swing.JDialog {
    public int escolha = 0;

    /**
     * Construtor para inicializa��o da tela de menu
     * @param parent - Frame oai da Janela
     * @param modal - booleano para validar janela modal
     */
    public Menu(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblMenu = new javax.swing.JLabel();
        jBtnCadastrar = new javax.swing.JButton();
        jBtnConsultar = new javax.swing.JButton();
        jBtnInserir = new javax.swing.JButton();
        jBtnObter3Aluno = new javax.swing.JButton();
        jBtnRemover = new javax.swing.JButton();
        jBtnObterPU = new javax.swing.JButton();
        jBtnSalvar = new javax.swing.JButton();
        jBtnImprimirVelhoNovo = new javax.swing.JButton();
        jBtnSair = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("MENU");
        setAlwaysOnTop(true);
        setFont(new java.awt.Font("Dialog", 0, 8)); // NOI18N
        setResizable(false);
        setSize(new java.awt.Dimension(1020, 530));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
        });

        lblMenu.setFont(new java.awt.Font("Malgun Gothic", 1, 60)); // NOI18N
        lblMenu.setForeground(new java.awt.Color(224, 30, 33));
        lblMenu.setText("Cadastre");

        jBtnCadastrar.setBackground(new java.awt.Color(11, 111, 181));
        jBtnCadastrar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jBtnCadastrar.setForeground(new java.awt.Color(255, 255, 255));
        jBtnCadastrar.setText("Cadastrar");
        jBtnCadastrar.setMaximumSize(new java.awt.Dimension(125, 40));
        jBtnCadastrar.setMinimumSize(new java.awt.Dimension(125, 40));
        jBtnCadastrar.setPreferredSize(new java.awt.Dimension(125, 40));
        jBtnCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnCadastrarActionPerformed(evt);
            }
        });

        jBtnConsultar.setBackground(new java.awt.Color(11, 111, 181));
        jBtnConsultar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jBtnConsultar.setForeground(new java.awt.Color(255, 255, 255));
        jBtnConsultar.setText("Consultar Aluno");
        jBtnConsultar.setMaximumSize(new java.awt.Dimension(125, 40));
        jBtnConsultar.setMinimumSize(new java.awt.Dimension(125, 40));
        jBtnConsultar.setPreferredSize(new java.awt.Dimension(125, 40));
        jBtnConsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnConsultarActionPerformed(evt);
            }
        });

        jBtnInserir.setBackground(new java.awt.Color(11, 111, 181));
        jBtnInserir.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jBtnInserir.setForeground(new java.awt.Color(255, 255, 255));
        jBtnInserir.setText("<html>\n<center>\nInserir Aluno \n<br>\nna 3� Posi��o\n</center>"); // NOI18N
        jBtnInserir.setToolTipText("");
        jBtnInserir.setMaximumSize(new java.awt.Dimension(125, 40));
        jBtnInserir.setMinimumSize(new java.awt.Dimension(125, 40));
        jBtnInserir.setPreferredSize(new java.awt.Dimension(125, 40));
        jBtnInserir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnInserirActionPerformed(evt);
            }
        });

        jBtnObter3Aluno.setBackground(new java.awt.Color(11, 111, 181));
        jBtnObter3Aluno.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jBtnObter3Aluno.setForeground(new java.awt.Color(255, 255, 255));
        jBtnObter3Aluno.setText("<html> <center>\nObter Aluno \n<br>\nda 3� Posi��o\n</center>"); // NOI18N
        jBtnObter3Aluno.setMaximumSize(new java.awt.Dimension(125, 40));
        jBtnObter3Aluno.setMinimumSize(new java.awt.Dimension(125, 40));
        jBtnObter3Aluno.setPreferredSize(new java.awt.Dimension(125, 40));
        jBtnObter3Aluno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnObter3AlunoActionPerformed(evt);
            }
        });

        jBtnRemover.setBackground(new java.awt.Color(11, 111, 181));
        jBtnRemover.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jBtnRemover.setForeground(new java.awt.Color(255, 255, 255));
        jBtnRemover.setText("<html> <center>Remover o <br>\n �timo cadastro\n</center>");
        jBtnRemover.setMaximumSize(new java.awt.Dimension(125, 40));
        jBtnRemover.setMinimumSize(new java.awt.Dimension(125, 40));
        jBtnRemover.setPreferredSize(new java.awt.Dimension(125, 40));
        jBtnRemover.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnRemoverActionPerformed(evt);
            }
        });

        jBtnObterPU.setBackground(new java.awt.Color(11, 111, 181));
        jBtnObterPU.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jBtnObterPU.setForeground(new java.awt.Color(255, 255, 255));
        jBtnObterPU.setText("<html> <center> Obter Matr�cula <br>do  primeiro e �ltimo aluno </center>");
        jBtnObterPU.setMaximumSize(new java.awt.Dimension(125, 40));
        jBtnObterPU.setMinimumSize(new java.awt.Dimension(125, 40));
        jBtnObterPU.setPreferredSize(new java.awt.Dimension(125, 40));
        jBtnObterPU.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnObterPUActionPerformed(evt);
            }
        });

        jBtnSalvar.setBackground(new java.awt.Color(11, 111, 181));
        jBtnSalvar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jBtnSalvar.setForeground(new java.awt.Color(255, 255, 255));
        jBtnSalvar.setText("Salvar em CSV");
        jBtnSalvar.setMaximumSize(new java.awt.Dimension(125, 40));
        jBtnSalvar.setMinimumSize(new java.awt.Dimension(125, 40));
        jBtnSalvar.setPreferredSize(new java.awt.Dimension(125, 40));
        jBtnSalvar.setSelected(true);
        jBtnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnSalvarActionPerformed(evt);
            }
        });

        jBtnImprimirVelhoNovo.setBackground(new java.awt.Color(11, 111, 181));
        jBtnImprimirVelhoNovo.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jBtnImprimirVelhoNovo.setForeground(new java.awt.Color(255, 255, 255));
        jBtnImprimirVelhoNovo.setText("<html>\n<center>\nImprimir o mais velho e\n<br>\n o mais novo\n</center>");
        jBtnImprimirVelhoNovo.setActionCommand("<html> <center> Imprimir mais velho  e mais novo </center>");
        jBtnImprimirVelhoNovo.setPreferredSize(new java.awt.Dimension(125, 40));
        jBtnImprimirVelhoNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnImprimirVelhoNovoActionPerformed(evt);
            }
        });

        jBtnSair.setBackground(new java.awt.Color(11, 111, 181));
        jBtnSair.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jBtnSair.setForeground(new java.awt.Color(255, 255, 255));
        jBtnSair.setText("SAIR DO SISTEMA");
        jBtnSair.setBorderPainted(false);
        jBtnSair.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jBtnSair.setMaximumSize(new java.awt.Dimension(125, 40));
        jBtnSair.setMinimumSize(new java.awt.Dimension(125, 40));
        jBtnSair.setPreferredSize(new java.awt.Dimension(125, 40));
        jBtnSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnSairActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(11, 111, 181));
        jLabel1.setText("�");

        jLabel3.setFont(new java.awt.Font("Consolas", 1, 11)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(11, 111, 181));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("_____________________________________________________________________________________");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(224, 30, 33));
        jLabel2.setText("Ol�! Seja bem-vindo ao sistema Cadastre. Por favor, escolha as op��es abaixo desejada.");

        jLabel4.setFont(new java.awt.Font("Microsoft YaHei", 0, 11)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(224, 30, 33));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("<html> <center> Remova o �ltimo <br> cadastro da lista. </center>");

        jLabel5.setFont(new java.awt.Font("Microsoft YaHei", 0, 11)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(224, 30, 33));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("<html> <center> Cadastre o aluno inserindo <br> os dados solicitados. </center>");

        jLabel6.setFont(new java.awt.Font("Microsoft YaHei", 0, 11)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(224, 30, 33));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("<html> <center>Consulte um aluno e <br> verifique se j� est� na lista. </center>");

        jLabel7.setFont(new java.awt.Font("Microsoft YaHei", 0, 11)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(224, 30, 33));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("<html> <center> Insira um novo aluno na Terceira<br> posi��o da lista de cadastro </center>");

        jLabel8.setFont(new java.awt.Font("Microsoft YaHei", 0, 11)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(224, 30, 33));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("<html> <center> Verifique o terceiro aluno <br> cadastrado na lista. </center>");

        jLabel9.setFont(new java.awt.Font("Microsoft YaHei", 0, 11)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(224, 30, 33));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("<html> <center>Salve a lista de alunos cadastrados <br> em formato de arquivo CSV. </center>");

        jLabel10.setFont(new java.awt.Font("Microsoft YaHei", 0, 11)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(224, 30, 33));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("<html> <center> Consulte o aluno mais velho <br> e o mais novo cadastrados na lista. </center>");

        jLabel11.setFont(new java.awt.Font("Microsoft YaHei", 0, 11)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(224, 30, 33));
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("<html> <center> Verifique o primeiro e o �ltimo <br> aluno cadastrado. </center>");

        jLabel12.setFont(new java.awt.Font("Microsoft YaHei", 0, 11)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(11, 111, 181));
        jLabel12.setText("� Philipe Vieira, Ada Beatriz, Daniel Bricio.");

        jLabel13.setFont(new java.awt.Font("Consolas", 1, 11)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(11, 111, 181));
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setText("___________________________________________________________________________________________________________________________________________________________");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(lblMenu)
                        .addGap(0, 0, 0)
                        .addComponent(jLabel1)
                        .addGap(509, 509, 509)
                        .addComponent(jBtnSair, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 960, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(430, 430, 430)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 540, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(jBtnCadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(70, 70, 70)
                        .addComponent(jBtnConsultar, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(70, 70, 70)
                        .addComponent(jBtnInserir, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(80, 80, 80)
                        .addComponent(jBtnObter3Aluno, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(70, 70, 70)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(70, 70, 70)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(80, 80, 80)
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(jBtnSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(70, 70, 70)
                        .addComponent(jBtnImprimirVelhoNovo, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(80, 80, 80)
                        .addComponent(jBtnObterPU, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(70, 70, 70)
                        .addComponent(jBtnRemover, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(70, 70, 70)
                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(80, 80, 80)
                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(70, 70, 70)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(40, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 570, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(217, 217, 217))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(378, 378, 378))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(jBtnSair, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addComponent(jLabel13)
                .addGap(6, 6, 6)
                .addComponent(jLabel2)
                .addGap(43, 43, 43)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jBtnCadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBtnConsultar, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBtnInserir, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBtnObter3Aluno, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jBtnSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBtnImprimirVelhoNovo, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBtnObterPU, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBtnRemover, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addGap(1, 1, 1)
                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    /**
     * M�todo para a��o do bot�o CADASTRAR
     * @param evt - Evento de click no bot�o
     */
    private void jBtnCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnCadastrarActionPerformed
        // TODO add your handling code here:
        this.escolha = 1;
        this.dispose();
    }//GEN-LAST:event_jBtnCadastrarActionPerformed

    /**
     * M�todo para a��o do bot�o CONSULTAR
     * @param evt - Evento de click no bot�o
     */
    private void jBtnConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnConsultarActionPerformed
        // TODO add your handling code here:
        this.escolha = 2;
        this.dispose();
    }//GEN-LAST:event_jBtnConsultarActionPerformed

    /**
     * M�todo para a��o do bot�o INSERIR NA 3 POS
     * @param evt - Evento de click no bot�o
     */
    private void jBtnInserirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnInserirActionPerformed
        // TODO add your handling code here:
        this.escolha = 3;
        this.dispose();
    }//GEN-LAST:event_jBtnInserirActionPerformed

    /**
     * M�todo para a��o do bot�o OBTER ALUNO 3 POS
     * @param evt - Evento de click no bot�o
     */
    private void jBtnObter3AlunoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnObter3AlunoActionPerformed
        // TODO add your handling code here:
        this.escolha = 4;
        this.dispose();
    }//GEN-LAST:event_jBtnObter3AlunoActionPerformed

    /**
     * M�todo para a��o do bot�o REMOVER (ULTIMO)
     * @param evt - Evento de click no bot�o
     */
    private void jBtnRemoverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnRemoverActionPerformed
        // TODO add your handling code here:
        this.escolha = 5;
        this.dispose();
    }//GEN-LAST:event_jBtnRemoverActionPerformed

    /**
     * M�todo para a��o do bot�o OBTER MATRICULA PRIMEIRO E ULTIMO
     * @param evt - Evento de click no bot�o
     */
    private void jBtnObterPUActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnObterPUActionPerformed
        // TODO add your handling code here:
        this.escolha = 6;
        this.dispose();
    }//GEN-LAST:event_jBtnObterPUActionPerformed

    /**
     * M�todo para a��o do bot�o SALVAR CSV
     * @param evt - Evento de click no bot�o
     */
    private void jBtnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnSalvarActionPerformed
        // TODO add your handling code here:
        this.escolha = 7;
        this.dispose();
    }//GEN-LAST:event_jBtnSalvarActionPerformed

    /**
     * M�todo para a��o do bot�o IMPRIMIR MAIS VELHO E MAIS NOVO
     * @param evt - Evento de click no bot�o
     */
    private void jBtnImprimirVelhoNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnImprimirVelhoNovoActionPerformed
        // TODO add your handling code here:
        this.escolha = 8;
        this.dispose();
    }//GEN-LAST:event_jBtnImprimirVelhoNovoActionPerformed

    /**
     * M�todo para a��o do bot�o SAIR
     * @param evt - Evento de click no bot�o
     */
    private void jBtnSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnSairActionPerformed
        // TODO add your handling code here:
        this.escolha = 0;
        this.dispose();
    }//GEN-LAST:event_jBtnSairActionPerformed

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_formWindowClosed

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
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Menu dialog = new Menu(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
     
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBtnCadastrar;
    private javax.swing.JButton jBtnConsultar;
    private javax.swing.JButton jBtnImprimirVelhoNovo;
    private javax.swing.JButton jBtnInserir;
    private javax.swing.JButton jBtnObter3Aluno;
    private javax.swing.JButton jBtnObterPU;
    private javax.swing.JButton jBtnRemover;
    private javax.swing.JButton jBtnSair;
    private javax.swing.JButton jBtnSalvar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel lblMenu;
    // End of variables declaration//GEN-END:variables

   
}
