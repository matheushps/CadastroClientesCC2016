package Interface;
import javax.swing.UIManager;
import javax.swing.table.DefaultTableModel;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.GroupLayout;
import java.awt.Toolkit;

public class Cadastro extends javax.swing.JFrame {

	private static final long serialVersionUID = -1773021545657741617L;
	static int quantidadeArmazenamento = 100;
    static int colunaCliente = 5;
    static int colunaTelefone = 2;
    static int idCliente = 0;
    static String[][] armazenarCliente = new String[quantidadeArmazenamento][colunaCliente];
    static String[][] armazenarTelefone = new String[quantidadeArmazenamento][colunaTelefone];

    public Cadastro() {
    	setIconImage(Toolkit.getDefaultToolkit().getImage(Cadastro.class.getResource("/javax/swing/plaf/metal/icons/ocean/floppy.gif")));
    	setResizable(false);
        initComponents();
    }

    @SuppressWarnings({"serial" })
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        cpNomeCompleto = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        cpEndereco = new javax.swing.JTextField();
        cpCPF = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        cpEmail = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        btnAtualizar = new javax.swing.JButton();
        btnAdicionar = new javax.swing.JButton();
        btnRemover = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        btnLimpar = new javax.swing.JButton();
        txAcaoTitulo = new javax.swing.JLabel();
        cpRG = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        rolagemCliente = new javax.swing.JScrollPane();
        tabelaCliente = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Tela de Cadastro de Clientes - v.1.0.0");
        setAlwaysOnTop(true);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setLocation(new java.awt.Point(200, 100));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); 
        jLabel2.setText("Nome completo:");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); 
        jLabel3.setText("Endereço:");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); 
        jLabel4.setText("CPF:");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); 
        jLabel5.setText("E-mail");

        btnAtualizar.setFont(new java.awt.Font("Tahoma", 0, 14)); 
        btnAtualizar.setText("Atualizar");
        btnAtualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtualizarActionPerformed(evt);
            }
        });

        btnAdicionar.setFont(new java.awt.Font("Tahoma", 0, 14)); 
        btnAdicionar.setText("Adicionar");
        btnAdicionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdicionarActionPerformed(evt);
            }
        });

        btnRemover.setFont(new java.awt.Font("Tahoma", 0, 14)); 
        btnRemover.setText("Remover");
        btnRemover.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRemoverActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); 
        jLabel6.setForeground(new java.awt.Color(51, 102, 255));
        jLabel6.setText("Registros");

        btnLimpar.setFont(new java.awt.Font("Tahoma", 0, 14)); 
        btnLimpar.setText("Limpar");
        btnLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimparActionPerformed(evt);
            }
        });

        txAcaoTitulo.setFont(new java.awt.Font("Tahoma", 0, 24)); 
        txAcaoTitulo.setForeground(new java.awt.Color(51, 102, 255));
        txAcaoTitulo.setText("Cadastrar Cliente");

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); 
        jLabel8.setText("RG:");

        tabelaCliente.setModel(new javax.swing.table.DefaultTableModel(
         new Object[] {"Id", "Nome", "Endereço", "CPF", "RG", "Email"},
				0) {
			@Override
			public boolean isCellEditable(int row, int col) {
				return false;
			}

		}
        );
        rolagemCliente.setViewportView(tabelaCliente);
		for (int i = 0; i < idCliente; i++) {
			DefaultTableModel registros = (DefaultTableModel) tabelaCliente.getModel();
			registros.addRow(new Object[] { idCliente, armazenarCliente[i][0], armazenarCliente[i][1], armazenarCliente[i][2], armazenarCliente[i][3],
					armazenarCliente[i][4] });
		}

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        layout.setHorizontalGroup(
        	layout.createParallelGroup(Alignment.TRAILING)
        		.addGroup(layout.createSequentialGroup()
        			.addGroup(layout.createParallelGroup(Alignment.LEADING)
        				.addGroup(layout.createSequentialGroup()
        					.addContainerGap(590, Short.MAX_VALUE)
        					.addComponent(btnRemover)
        					.addPreferredGap(ComponentPlacement.UNRELATED)
        					.addComponent(btnAtualizar, GroupLayout.PREFERRED_SIZE, 98, GroupLayout.PREFERRED_SIZE))
        				.addGroup(layout.createSequentialGroup()
        					.addGap(19)
        					.addGroup(layout.createParallelGroup(Alignment.TRAILING)
        						.addComponent(txAcaoTitulo, Alignment.LEADING)
        						.addGroup(layout.createSequentialGroup()
        							.addGroup(layout.createParallelGroup(Alignment.LEADING)
        								.addComponent(jLabel5)
        								.addGroup(layout.createParallelGroup(Alignment.TRAILING, false)
        									.addComponent(cpEmail, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 379, Short.MAX_VALUE)
        									.addComponent(jLabel3, Alignment.LEADING)
        									.addComponent(cpEndereco, Alignment.LEADING)))
        							.addPreferredGap(ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
        							.addGroup(layout.createParallelGroup(Alignment.TRAILING)
        								.addGroup(layout.createParallelGroup(Alignment.LEADING)
        									.addComponent(jLabel8)
        									.addComponent(cpRG, GroupLayout.PREFERRED_SIZE, 357, GroupLayout.PREFERRED_SIZE))
        								.addGroup(layout.createParallelGroup(Alignment.LEADING)
        									.addComponent(jLabel4)
        									.addComponent(cpCPF, GroupLayout.PREFERRED_SIZE, 357, GroupLayout.PREFERRED_SIZE))))
        						.addGroup(layout.createSequentialGroup()
        							.addGap(0, 594, Short.MAX_VALUE)
        							.addComponent(btnAdicionar)
        							.addPreferredGap(ComponentPlacement.RELATED)
        							.addComponent(btnLimpar, GroupLayout.PREFERRED_SIZE, 81, GroupLayout.PREFERRED_SIZE))
        						.addComponent(cpNomeCompleto, 768, 768, Short.MAX_VALUE)
        						.addGroup(layout.createSequentialGroup()
        							.addGroup(layout.createParallelGroup(Alignment.LEADING)
        								.addComponent(jLabel2)
        								.addGroup(layout.createSequentialGroup()
        									.addComponent(jLabel6)
        									.addPreferredGap(ComponentPlacement.UNRELATED)
        									.addComponent(jSeparator1, GroupLayout.PREFERRED_SIZE, 692, GroupLayout.PREFERRED_SIZE)))
        							.addGap(0, 10, Short.MAX_VALUE))
        						.addComponent(rolagemCliente, GroupLayout.DEFAULT_SIZE, 768, Short.MAX_VALUE))))
        			.addGap(23))
        );
        layout.setVerticalGroup(
        	layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(layout.createSequentialGroup()
        			.addContainerGap()
        			.addComponent(txAcaoTitulo)
        			.addGap(20)
        			.addComponent(jLabel2)
        			.addGap(4)
        			.addComponent(cpNomeCompleto, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        			.addGap(7)
        			.addGroup(layout.createParallelGroup(Alignment.TRAILING)
        				.addGroup(layout.createParallelGroup(Alignment.LEADING)
        					.addComponent(jLabel3)
        					.addGroup(layout.createSequentialGroup()
        						.addGap(21)
        						.addComponent(cpEndereco, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
        				.addComponent(cpCPF, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        				.addGroup(layout.createSequentialGroup()
        					.addComponent(jLabel4)
        					.addGap(24)))
        			.addPreferredGap(ComponentPlacement.UNRELATED)
        			.addGroup(layout.createParallelGroup(Alignment.TRAILING)
        				.addGroup(layout.createSequentialGroup()
        					.addComponent(jLabel5)
        					.addGap(4)
        					.addComponent(cpEmail, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
        				.addComponent(cpRG, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        				.addGroup(layout.createSequentialGroup()
        					.addComponent(jLabel8)
        					.addGap(24)))
        			.addPreferredGap(ComponentPlacement.RELATED)
        			.addGroup(layout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(btnAdicionar)
        				.addComponent(btnLimpar, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        			.addGap(4)
        			.addGroup(layout.createParallelGroup(Alignment.TRAILING)
        				.addComponent(jSeparator1, GroupLayout.PREFERRED_SIZE, 10, GroupLayout.PREFERRED_SIZE)
        				.addComponent(jLabel6))
        			.addPreferredGap(ComponentPlacement.RELATED)
        			.addComponent(rolagemCliente, GroupLayout.PREFERRED_SIZE, 198, GroupLayout.PREFERRED_SIZE)
        			.addGap(18)
        			.addGroup(layout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(btnAtualizar)
        				.addComponent(btnRemover))
        			.addContainerGap())
        );
        getContentPane().setLayout(layout);

        pack();
    }

    private void btnAdicionarActionPerformed(java.awt.event.ActionEvent evt) {
        adicionarCliente();
    }

    private void btnLimparActionPerformed(java.awt.event.ActionEvent evt) {
        limparCampos();
    }

    private void btnRemoverActionPerformed(java.awt.event.ActionEvent evt) {
        removerCliente();
    }

    private void btnAtualizarActionPerformed(java.awt.event.ActionEvent evt) {
        atualizarCliente();
    }

    public static void main(String args[]) {
        try {
            UIManager.setLookAndFeel("com.sun.java.swing.plaf.gtk.GTKLookAndFeel");
        } catch (Exception e) {

        }
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Cadastro().setVisible(true);
            }
        });
    }

    private javax.swing.JButton btnAdicionar;
    private javax.swing.JButton btnAtualizar;
    private javax.swing.JButton btnLimpar;
    private javax.swing.JButton btnRemover;
    private javax.swing.JTextField cpCPF;
    private javax.swing.JTextField cpEmail;
    private javax.swing.JTextField cpEndereco;
    private javax.swing.JTextField cpNomeCompleto;
    private javax.swing.JTextField cpRG;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JScrollPane rolagemCliente;
    private javax.swing.JTable tabelaCliente;
    private javax.swing.JLabel txAcaoTitulo;
    // End of variables declaration//GEN-END:variables

    private void adicionarCliente() {
        validarLimite();
        armazenarCliente[idCliente][0] = cpNomeCompleto.getText();
        armazenarCliente[idCliente][1] = cpEndereco.getText();
        armazenarCliente[idCliente][2] = cpCPF.getText();
        armazenarCliente[idCliente][3] = cpEmail.getText();
        armazenarCliente[idCliente][4] = cpRG.getText();

        DefaultTableModel valores = (DefaultTableModel) tabelaCliente.getModel();
        valores.addRow(new Object[]{(idCliente), armazenarCliente[idCliente][0], armazenarCliente[idCliente][1],
            armazenarCliente[idCliente][2], armazenarCliente[idCliente][3], armazenarCliente[idCliente][4]});
        limparCampos();
        idCliente++;
    }

    private void limparCampos() {
        cpNomeCompleto.setText(null);
        cpEndereco.setText(null);
        cpCPF.setText(null);
        cpEmail.setText(null);
        cpRG.setText(null);
    }

    private void removerCliente() {

    }

    private void atualizarCliente() {

    }

    private void validarLimite() {
        if (idCliente >= 100) {
        	btnAdicionar.setVisible(false);
        }
        else if (idCliente < 100)
        {
        	btnAdicionar.setVisible(true);
        }
        }
    
}