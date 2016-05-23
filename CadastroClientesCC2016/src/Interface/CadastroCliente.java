package Interface;

import javax.swing.JOptionPane;

public class CadastroCliente extends javax.swing.JFrame {

    public CadastroCliente() {
        initComponents();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pCadastroTelefone = new java.awt.Panel();
        lblCadTel = new java.awt.Label();
        lvlCadTelTel = new java.awt.Label();
        txfCadTelCli = new java.awt.TextField();
        lblCadTelCodCli = new java.awt.Label();
        txfCadCodCli = new java.awt.TextField();
        btnSairTelefone = new javax.swing.JButton();
        btnCadastroTelefone = new javax.swing.JButton();
        pCadastro = new java.awt.Panel();
        lblCadCliente = new java.awt.Label();
        lblCpf = new java.awt.Label();
        txfCadCliNome = new java.awt.TextField();
        lblNomeCompleto = new java.awt.Label();
        txfCadCliRG = new java.awt.TextField();
        lblEndereco = new java.awt.Label();
        lblRg = new java.awt.Label();
        txfCadCliCPF = new java.awt.TextField();
        txfCadCliEndereco = new java.awt.TextField();
        btnSairCliente = new javax.swing.JButton();
        btnCadastroCliente = new javax.swing.JButton();
        pListar = new java.awt.Panel();
        lblListarClientes = new java.awt.Label();
        sclTblCliente = new javax.swing.JScrollPane();
        tblCliente = new javax.swing.JTable();
        btnExcluirCliente = new javax.swing.JButton();
        btnAtualizarCliente = new javax.swing.JButton();
        pListarTelefone = new java.awt.Panel();
        lblListarTelefone = new java.awt.Label();
        sclTblTelefone = new javax.swing.JScrollPane();
        TblTelefone = new javax.swing.JTable();
        btnExcluirTelefone = new javax.swing.JButton();
        btnAtualizarTelefone = new javax.swing.JButton();
        pInicial = new java.awt.Panel();
        informativo = new java.awt.Label();
        jMenuPricipal = new javax.swing.JMenuBar();
        jMenuClientes = new javax.swing.JMenu();
        jMenuNovoCliente = new javax.swing.JMenuItem();
        jMenuListarCliente = new javax.swing.JMenuItem();
        jMenuTelefones = new javax.swing.JMenu();
        jMenuNovoTelefone = new javax.swing.JMenuItem();
        jMenuListarTelefone = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Cadastro de Clientes - Versão Beta 1.0.0.0");
        setBounds(new java.awt.Rectangle(0, 0, 0, 0));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setFocusable(false);
        setLocation(new java.awt.Point(200, 100));
        setResizable(false);

        pCadastroTelefone.setName(""); // NOI18N

        lblCadTel.setAlignment(java.awt.Label.CENTER);
        lblCadTel.setFont(new java.awt.Font("Calibri Light", 1, 36)); // NOI18N
        lblCadTel.setText("Cadastro de Telefone");

        lvlCadTelTel.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        lvlCadTelTel.setText("TELEFONE:");

        lblCadTelCodCli.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        lblCadTelCodCli.setText("CODIGO CLIENTE:");

        txfCadCodCli.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txfCadCodCliActionPerformed(evt);
            }
        });

        btnSairTelefone.setText("Cancelar");
        btnSairTelefone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSairTelefoneActionPerformed(evt);
            }
        });

        btnCadastroTelefone.setText("Cadastrar");
        btnCadastroTelefone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastroTelefoneActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pCadastroTelefoneLayout = new javax.swing.GroupLayout(pCadastroTelefone);
        pCadastroTelefone.setLayout(pCadastroTelefoneLayout);
        pCadastroTelefoneLayout.setHorizontalGroup(
            pCadastroTelefoneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pCadastroTelefoneLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pCadastroTelefoneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pCadastroTelefoneLayout.createSequentialGroup()
                        .addComponent(lblCadTel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pCadastroTelefoneLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 437, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnSairTelefone)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnCadastroTelefone))
                    .addGroup(pCadastroTelefoneLayout.createSequentialGroup()
                        .addComponent(lblCadTelCodCli, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txfCadCodCli, javax.swing.GroupLayout.DEFAULT_SIZE, 575, Short.MAX_VALUE))
                    .addGroup(pCadastroTelefoneLayout.createSequentialGroup()
                        .addComponent(lvlCadTelTel, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txfCadTelCli, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        pCadastroTelefoneLayout.setVerticalGroup(
            pCadastroTelefoneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pCadastroTelefoneLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblCadTel, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addGroup(pCadastroTelefoneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lvlCadTelTel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txfCadTelCli, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pCadastroTelefoneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txfCadCodCli, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCadTelCodCli, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pCadastroTelefoneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSairTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCadastroTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(15, Short.MAX_VALUE))
        );

        lblCadTelCodCli.getAccessibleContext().setAccessibleName("");

        pCadastro.setName(""); // NOI18N

        lblCadCliente.setAlignment(java.awt.Label.CENTER);
        lblCadCliente.setFont(new java.awt.Font("Calibri Light", 1, 36)); // NOI18N
        lblCadCliente.setText("Cadastro de Cliente");

        lblCpf.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        lblCpf.setText("CPF:");

        lblNomeCompleto.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        lblNomeCompleto.setText("NOME COMPLETO:");

        lblEndereco.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        lblEndereco.setText("ENDEREÇO:");

        lblRg.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        lblRg.setText("RG:");

        btnSairCliente.setText("Cancelar");
        btnSairCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSairClienteActionPerformed(evt);
            }
        });

        btnCadastroCliente.setText("Cadastrar");
        btnCadastroCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastroClienteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pCadastroLayout = new javax.swing.GroupLayout(pCadastro);
        pCadastro.setLayout(pCadastroLayout);
        pCadastroLayout.setHorizontalGroup(
            pCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pCadastroLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pCadastroLayout.createSequentialGroup()
                        .addComponent(lblCadCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 412, Short.MAX_VALUE))
                    .addGroup(pCadastroLayout.createSequentialGroup()
                        .addGroup(pCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblNomeCompleto, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblCpf, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblRg, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txfCadCliNome, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txfCadCliCPF, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txfCadCliRG, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txfCadCliEndereco, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pCadastroLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnSairCliente)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnCadastroCliente)))
                .addContainerGap())
        );
        pCadastroLayout.setVerticalGroup(
            pCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pCadastroLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblCadCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addGroup(pCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(pCadastroLayout.createSequentialGroup()
                        .addComponent(txfCadCliNome, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txfCadCliCPF, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txfCadCliRG, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txfCadCliEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnCadastroCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnSairCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(22, Short.MAX_VALUE))
                    .addGroup(pCadastroLayout.createSequentialGroup()
                        .addComponent(lblNomeCompleto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblCpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblRg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        lblCadCliente.getAccessibleContext().setAccessibleName("");

        pListar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        lblListarClientes.setAlignment(java.awt.Label.CENTER);
        lblListarClientes.setFont(new java.awt.Font("Calibri Light", 1, 36)); // NOI18N
        lblListarClientes.setText("Clientes Cadastrados");

        tblCliente.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tblCliente.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "ID", "NOME", "CPF", "RG", "ENDEREÇO"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        sclTblCliente.setViewportView(tblCliente);
        if (tblCliente.getColumnModel().getColumnCount() > 0) {
            tblCliente.getColumnModel().getColumn(0).setResizable(false);
            tblCliente.getColumnModel().getColumn(1).setResizable(false);
            tblCliente.getColumnModel().getColumn(2).setResizable(false);
            tblCliente.getColumnModel().getColumn(3).setResizable(false);
            tblCliente.getColumnModel().getColumn(4).setResizable(false);
        }
        tblCliente.getAccessibleContext().setAccessibleName("");

        btnExcluirCliente.setText("EXCLUIR CLIENTE");

        btnAtualizarCliente.setText("ATUALIZAR CLIENTE");

        javax.swing.GroupLayout pListarLayout = new javax.swing.GroupLayout(pListar);
        pListar.setLayout(pListarLayout);
        pListarLayout.setHorizontalGroup(
            pListarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pListarLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pListarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pListarLayout.createSequentialGroup()
                        .addComponent(lblListarClientes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(269, 454, Short.MAX_VALUE))
                    .addGroup(pListarLayout.createSequentialGroup()
                        .addComponent(sclTblCliente)
                        .addContainerGap())))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pListarLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnAtualizarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnExcluirCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        pListarLayout.setVerticalGroup(
            pListarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pListarLayout.createSequentialGroup()
                .addComponent(lblListarClientes, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(sclTblCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addGroup(pListarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnExcluirCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAtualizarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        pListarTelefone.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        lblListarTelefone.setAlignment(java.awt.Label.CENTER);
        lblListarTelefone.setFont(new java.awt.Font("Calibri Light", 1, 36)); // NOI18N
        lblListarTelefone.setText("Telefones Cadastrados");

        TblTelefone.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        TblTelefone.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "ID", "TELEFONE", "CLIENTE"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        sclTblTelefone.setViewportView(TblTelefone);
        if (TblTelefone.getColumnModel().getColumnCount() > 0) {
            TblTelefone.getColumnModel().getColumn(0).setResizable(false);
            TblTelefone.getColumnModel().getColumn(1).setResizable(false);
            TblTelefone.getColumnModel().getColumn(2).setResizable(false);
        }

        btnExcluirTelefone.setText("EXCLUIR TELEFONE");

        btnAtualizarTelefone.setText("ATUALIZAR TELEFONE");

        javax.swing.GroupLayout pListarTelefoneLayout = new javax.swing.GroupLayout(pListarTelefone);
        pListarTelefone.setLayout(pListarTelefoneLayout);
        pListarTelefoneLayout.setHorizontalGroup(
            pListarTelefoneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pListarTelefoneLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pListarTelefoneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pListarTelefoneLayout.createSequentialGroup()
                        .addComponent(sclTblTelefone)
                        .addContainerGap())
                    .addGroup(pListarTelefoneLayout.createSequentialGroup()
                        .addComponent(lblListarTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(33, 421, Short.MAX_VALUE))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pListarTelefoneLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnAtualizarTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnExcluirTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(8, 8, 8))
        );
        pListarTelefoneLayout.setVerticalGroup(
            pListarTelefoneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pListarTelefoneLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblListarTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(sclTblTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(pListarTelefoneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAtualizarTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnExcluirTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        informativo.setAlignment(java.awt.Label.CENTER);
        informativo.setFont(new java.awt.Font("Calibri", 0, 36)); // NOI18N
        informativo.setText("Olá amigo(a), seja bem vindo!!");

        javax.swing.GroupLayout pInicialLayout = new javax.swing.GroupLayout(pInicial);
        pInicial.setLayout(pInicialLayout);
        pInicialLayout.setHorizontalGroup(
            pInicialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pInicialLayout.createSequentialGroup()
                .addGap(121, 121, 121)
                .addComponent(informativo, javax.swing.GroupLayout.PREFERRED_SIZE, 580, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(130, Short.MAX_VALUE))
        );
        pInicialLayout.setVerticalGroup(
            pInicialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pInicialLayout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(informativo, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(339, Short.MAX_VALUE))
        );

        informativo.getAccessibleContext().setAccessibleName("");
        informativo.getAccessibleContext().setAccessibleDescription("");
        informativo.getAccessibleContext().setAccessibleParent(null);

        jMenuPricipal.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jMenuPricipal.setFocusCycleRoot(true);
        jMenuPricipal.setInheritsPopupMenu(true);

        jMenuClientes.setText("Cliente");

        jMenuNovoCliente.setText("Novo Cliente");
        jMenuNovoCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuNovoClienteActionPerformed(evt);
            }
        });
        jMenuClientes.add(jMenuNovoCliente);

        jMenuListarCliente.setText("Listar Clientes");
        jMenuListarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuListarClienteActionPerformed(evt);
            }
        });
        jMenuClientes.add(jMenuListarCliente);

        jMenuPricipal.add(jMenuClientes);

        jMenuTelefones.setText("Telefone");

        jMenuNovoTelefone.setText("Novo Telefone");
        jMenuNovoTelefone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuNovoTelefoneActionPerformed(evt);
            }
        });
        jMenuTelefones.add(jMenuNovoTelefone);

        jMenuListarTelefone.setText("Listar Telefones");
        jMenuListarTelefone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuListarTelefoneActionPerformed(evt);
            }
        });
        jMenuTelefones.add(jMenuListarTelefone);

        jMenuPricipal.add(jMenuTelefones);

        setJMenuBar(jMenuPricipal);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pInicial, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(20, 20, 20)
                    .addComponent(pCadastroTelefone, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(20, 20, 20)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(pCadastro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(pListar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(20, 20, 20)
                    .addComponent(pListarTelefone, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGap(20, 20, 20)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 10, Short.MAX_VALUE)
                .addComponent(pInicial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(53, 53, 53)
                    .addComponent(pCadastroTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(240, Short.MAX_VALUE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(53, 53, 53)
                    .addComponent(pCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(53, Short.MAX_VALUE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(45, 45, 45)
                    .addComponent(pListar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(132, Short.MAX_VALUE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(55, 55, 55)
                    .addComponent(pListarTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(56, Short.MAX_VALUE)))
        );

        getAccessibleContext().setAccessibleDescription("");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuNovoClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuNovoClienteActionPerformed
        novoCliente();
    }//GEN-LAST:event_jMenuNovoClienteActionPerformed

    private void jMenuListarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuListarClienteActionPerformed
        listarClientes();
    }//GEN-LAST:event_jMenuListarClienteActionPerformed

    private void jMenuNovoTelefoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuNovoTelefoneActionPerformed
        novoTelefone();
    }//GEN-LAST:event_jMenuNovoTelefoneActionPerformed

    private void jMenuListarTelefoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuListarTelefoneActionPerformed
        listarTelefone();
    }//GEN-LAST:event_jMenuListarTelefoneActionPerformed

    private void btnSairClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSairClienteActionPerformed
        sairCadastro();
    }//GEN-LAST:event_btnSairClienteActionPerformed

    private void btnCadastroClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastroClienteActionPerformed
        salvarCliente();
    }//GEN-LAST:event_btnCadastroClienteActionPerformed

    private void btnSairTelefoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSairTelefoneActionPerformed
        sairCadastro();
    }//GEN-LAST:event_btnSairTelefoneActionPerformed

    private void btnCadastroTelefoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastroTelefoneActionPerformed
        salvarTelefone();
    }//GEN-LAST:event_btnCadastroTelefoneActionPerformed

    private void txfCadCodCliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txfCadCodCliActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txfCadCodCliActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CadastroCliente().setVisible(true);

            }
        });

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable TblTelefone;
    private javax.swing.JButton btnAtualizarCliente;
    private javax.swing.JButton btnAtualizarTelefone;
    private javax.swing.JButton btnCadastroCliente;
    private javax.swing.JButton btnCadastroTelefone;
    private javax.swing.JButton btnExcluirCliente;
    private javax.swing.JButton btnExcluirTelefone;
    private javax.swing.JButton btnSairCliente;
    private javax.swing.JButton btnSairTelefone;
    private java.awt.Label informativo;
    private javax.swing.JMenu jMenuClientes;
    private javax.swing.JMenuItem jMenuListarCliente;
    private javax.swing.JMenuItem jMenuListarTelefone;
    private javax.swing.JMenuItem jMenuNovoCliente;
    private javax.swing.JMenuItem jMenuNovoTelefone;
    private javax.swing.JMenuBar jMenuPricipal;
    private javax.swing.JMenu jMenuTelefones;
    private java.awt.Label lblCadCliente;
    private java.awt.Label lblCadTel;
    private java.awt.Label lblCadTelCodCli;
    private java.awt.Label lblCpf;
    private java.awt.Label lblEndereco;
    private java.awt.Label lblListarClientes;
    private java.awt.Label lblListarTelefone;
    private java.awt.Label lblNomeCompleto;
    private java.awt.Label lblRg;
    private java.awt.Label lvlCadTelTel;
    private java.awt.Panel pCadastro;
    private java.awt.Panel pCadastroTelefone;
    private java.awt.Panel pInicial;
    private java.awt.Panel pListar;
    private java.awt.Panel pListarTelefone;
    private javax.swing.JScrollPane sclTblCliente;
    private javax.swing.JScrollPane sclTblTelefone;
    private javax.swing.JTable tblCliente;
    private java.awt.TextField txfCadCliCPF;
    private java.awt.TextField txfCadCliEndereco;
    private java.awt.TextField txfCadCliNome;
    private java.awt.TextField txfCadCliRG;
    private java.awt.TextField txfCadCodCli;
    private java.awt.TextField txfCadTelCli;
    // End of variables declaration//GEN-END:variables
int idCliente = 0;
int idTelefone = 0;
static String armazenarCliente[][] = new String[100][4];
static String armazenarTelefone[][] = new String[100][2];
    private void novoCliente() {
        pInicial.setVisible(false);
        pListar.setVisible(false);
        pCadastroTelefone.setVisible(false);
        pListarTelefone.setVisible(false);
        pCadastro.setVisible(true);
    }

    private void listarClientes() {
        pInicial.setVisible(false);
        pCadastro.setVisible(false);
        pCadastroTelefone.setVisible(false);
        pListarTelefone.setVisible(false);
        pListar.setVisible(true);
    }

    private void novoTelefone() {
        pInicial.setVisible(false);
        pCadastro.setVisible(false);
        pListar.setVisible(false);
        pListarTelefone.setVisible(false);
        pCadastroTelefone.setVisible(true);
    }

    private void listarTelefone() {
        pInicial.setVisible(false);
        pCadastro.setVisible(false);
        pListar.setVisible(false);
        pCadastroTelefone.setVisible(false);
        pListarTelefone.setVisible(true);
    }

    private void sairCadastro() {
        pInicial.setVisible(true);
        pCadastro.setVisible(false);
        pListar.setVisible(false);
        pCadastroTelefone.setVisible(false);
        pListarTelefone.setVisible(false);
    }

    private void salvarTelefone() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void salvarCliente() {

        armazenarCliente[idCliente][0] = txfCadCliNome.getText();
        armazenarCliente[idCliente][1] = txfCadCliEndereco.getText();
        armazenarCliente[idCliente][2] = txfCadCliCPF.getText();
        armazenarCliente[idCliente][3] = txfCadCliRG.getText();
        idCliente++;

        JOptionPane.showMessageDialog(null, "Cadastro Realizado com sucesso!!!");
       
        pCadastro.repaint();
        txfCadCliCPF.setText(null);
        txfCadCliEndereco.setText(null);
        txfCadCliNome.setText(null);
        txfCadCliRG.setText(null);

    }
}
