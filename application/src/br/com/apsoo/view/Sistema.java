package br.com.apsoo.view;

import br.com.apsoo.dao.conexao;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.table.DefaultTableModel;
import br.com.apsoo.dto.Venda;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.UUID;
import javax.swing.JOptionPane;



public class Sistema extends javax.swing.JFrame {
    
    conexao con = new conexao();
    
    public Sistema() {
        initComponents();
        con.conectar();
        
        populaTabela();
        
        lblData.setText(new SimpleDateFormat("dd/MM/yyyy").format(new Date()));
        lblHora.setText(new SimpleDateFormat("HH:mm:ss").format(new Date()));
        
        UUID uuid = UUID.randomUUID();
        String myRandom = uuid.toString();
        lblNVenda.setText(myRandom.substring(0,10));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        barraLateral = new javax.swing.JPanel();
        Venda = new javax.swing.JButton();
        Retirada = new javax.swing.JButton();
        Estoque = new javax.swing.JButton();
        Relatorio = new javax.swing.JButton();
        Admin = new javax.swing.JButton();
        painelBase = new javax.swing.JPanel();
        painelInicial = new javax.swing.JPanel();
        painelVendaOrcamento = new javax.swing.JPanel();
        btnVenda = new javax.swing.JButton();
        btnOrcamento = new javax.swing.JButton();
        painelVenda = new javax.swing.JPanel();
        codvendedor = new javax.swing.JTextField();
        orcamento = new javax.swing.JTextField();
        cpfcliente = new javax.swing.JTextField();
        btnGravar = new javax.swing.JButton();
        btnExcluir = new javax.swing.JButton();
        orcamentoTxtLabel = new javax.swing.JLabel();
        codVendTxtLabel = new javax.swing.JLabel();
        cpfClienteTxtLabel = new javax.swing.JLabel();
        vendedorTxtLabel = new javax.swing.JLabel();
        clienteTxtLabel = new javax.swing.JLabel();
        nVendaTxtLabel = new javax.swing.JLabel();
        lblNVenda = new javax.swing.JLabel();
        lblData = new javax.swing.JLabel();
        lblHora = new javax.swing.JLabel();
        nomeVendedor = new javax.swing.JLabel();
        nomeCliente = new javax.swing.JLabel();
        listaProdPanel = new javax.swing.JPanel();
        subtotalLista = new javax.swing.JLabel();
        valorVenda = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        qtdItens = new javax.swing.JLabel();
        btnAdicionar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblProdutos = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        desconto = new javax.swing.JLabel();
        total = new javax.swing.JLabel();
        btnVendedorCliente = new javax.swing.JButton();
        btnProcuraOrcamento1 = new javax.swing.JButton();
        painelPagamento = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setAlwaysOnTop(true);
        setBackground(new java.awt.Color(46, 88, 89));
        setResizable(false);
        setSize(new java.awt.Dimension(800, 600));

        barraLateral.setBackground(new java.awt.Color(213, 222, 222));
        barraLateral.setPreferredSize(new java.awt.Dimension(120, 600));
        barraLateral.setLayout(null);

        Venda.setBackground(new java.awt.Color(4, 55, 56));
        Venda.setText("VENDA");
        Venda.setAlignmentY(0.0F);
        Venda.setBorderPainted(false);
        Venda.setMargin(new java.awt.Insets(0, 0, 0, 0));
        Venda.setPreferredSize(new java.awt.Dimension(120, 120));
        Venda.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                VendaMouseClicked(evt);
            }
        });
        Venda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VendaActionPerformed(evt);
            }
        });
        barraLateral.add(Venda);
        Venda.setBounds(0, 0, 120, 118);

        Retirada.setBackground(new java.awt.Color(4, 55, 56));
        Retirada.setText("RETIRADA");
        Retirada.setAlignmentY(0.0F);
        Retirada.setBorderPainted(false);
        Retirada.setPreferredSize(new java.awt.Dimension(120, 120));
        Retirada.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                RetiradaMouseClicked(evt);
            }
        });
        barraLateral.add(Retirada);
        Retirada.setBounds(0, 120, 120, 118);

        Estoque.setBackground(new java.awt.Color(4, 55, 56));
        Estoque.setText("ESTOQUE");
        Estoque.setBorderPainted(false);
        Estoque.setPreferredSize(new java.awt.Dimension(120, 120));
        Estoque.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EstoqueActionPerformed(evt);
            }
        });
        barraLateral.add(Estoque);
        Estoque.setBounds(0, 240, 120, 118);

        Relatorio.setBackground(new java.awt.Color(4, 55, 56));
        Relatorio.setText("RELATÓRIOS");
        Relatorio.setBorderPainted(false);
        Relatorio.setPreferredSize(new java.awt.Dimension(120, 120));
        barraLateral.add(Relatorio);
        Relatorio.setBounds(0, 360, 120, 118);

        Admin.setBackground(new java.awt.Color(4, 55, 56));
        Admin.setText("ADMIN");
        Admin.setBorderPainted(false);
        Admin.setPreferredSize(new java.awt.Dimension(120, 120));
        Admin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AdminActionPerformed(evt);
            }
        });
        barraLateral.add(Admin);
        Admin.setBounds(0, 480, 120, 120);

        painelBase.setBackground(new java.awt.Color(46, 88, 89));
        painelBase.setPreferredSize(new java.awt.Dimension(680, 600));
        painelBase.setLayout(new java.awt.CardLayout());

        painelInicial.setBackground(new java.awt.Color(46, 88, 89));

        javax.swing.GroupLayout painelInicialLayout = new javax.swing.GroupLayout(painelInicial);
        painelInicial.setLayout(painelInicialLayout);
        painelInicialLayout.setHorizontalGroup(
            painelInicialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 627, Short.MAX_VALUE)
        );
        painelInicialLayout.setVerticalGroup(
            painelInicialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 600, Short.MAX_VALUE)
        );

        painelBase.add(painelInicial, "card2");

        painelVendaOrcamento.setBackground(new java.awt.Color(46, 88, 89));

        btnVenda.setBackground(new java.awt.Color(4, 55, 56));
        btnVenda.setText("REALIZAR VENDA");
        btnVenda.setBorderPainted(false);
        btnVenda.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnVendaMouseClicked(evt);
            }
        });

        btnOrcamento.setBackground(new java.awt.Color(4, 55, 56));
        btnOrcamento.setText("REALIZAR ORÇAMENTO");
        btnOrcamento.setBorderPainted(false);
        btnOrcamento.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnOrcamentoMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout painelVendaOrcamentoLayout = new javax.swing.GroupLayout(painelVendaOrcamento);
        painelVendaOrcamento.setLayout(painelVendaOrcamentoLayout);
        painelVendaOrcamentoLayout.setHorizontalGroup(
            painelVendaOrcamentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelVendaOrcamentoLayout.createSequentialGroup()
                .addContainerGap(88, Short.MAX_VALUE)
                .addComponent(btnVenda, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(82, 82, 82)
                .addComponent(btnOrcamento, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(125, 125, 125))
        );
        painelVendaOrcamentoLayout.setVerticalGroup(
            painelVendaOrcamentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelVendaOrcamentoLayout.createSequentialGroup()
                .addGap(209, 209, 209)
                .addGroup(painelVendaOrcamentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnVenda, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnOrcamento, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(228, Short.MAX_VALUE))
        );

        painelBase.add(painelVendaOrcamento, "card2");

        painelVenda.setBackground(new java.awt.Color(46, 88, 89));
        painelVenda.setPreferredSize(new java.awt.Dimension(680, 600));
        painelVenda.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        codvendedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                codvendedorActionPerformed(evt);
            }
        });
        painelVenda.add(codvendedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 360, 132, -1));
        painelVenda.add(orcamento, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 40, 132, -1));
        painelVenda.add(cpfcliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 410, 132, -1));

        btnGravar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/apsoo/imagens/gravar_registro.gif"))); // NOI18N
        btnGravar.setText("CONFIRMAR");
        btnGravar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGravarActionPerformed(evt);
            }
        });
        painelVenda.add(btnGravar, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 490, -1, -1));

        btnExcluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/apsoo/imagens/delete.gif"))); // NOI18N
        btnExcluir.setText("CANCELAR");
        btnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirActionPerformed(evt);
            }
        });
        painelVenda.add(btnExcluir, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 490, -1, -1));

        orcamentoTxtLabel.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        orcamentoTxtLabel.setForeground(new java.awt.Color(213, 222, 222));
        orcamentoTxtLabel.setText("Nº Orçamento");
        painelVenda.add(orcamentoTxtLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 40, -1, -1));

        codVendTxtLabel.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        codVendTxtLabel.setForeground(new java.awt.Color(213, 222, 222));
        codVendTxtLabel.setText("CÓD. VENDEDOR");
        painelVenda.add(codVendTxtLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 340, -1, -1));

        cpfClienteTxtLabel.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        cpfClienteTxtLabel.setForeground(new java.awt.Color(213, 222, 222));
        cpfClienteTxtLabel.setText("CPF DO CLIENTE");
        painelVenda.add(cpfClienteTxtLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 390, -1, -1));

        vendedorTxtLabel.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        vendedorTxtLabel.setForeground(new java.awt.Color(213, 222, 222));
        vendedorTxtLabel.setText("VENDEDOR");
        painelVenda.add(vendedorTxtLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 340, -1, -1));

        clienteTxtLabel.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        clienteTxtLabel.setForeground(new java.awt.Color(213, 222, 222));
        clienteTxtLabel.setText("CLIENTE");
        painelVenda.add(clienteTxtLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 390, -1, -1));

        nVendaTxtLabel.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        nVendaTxtLabel.setForeground(new java.awt.Color(213, 222, 222));
        nVendaTxtLabel.setText("Nº Venda");
        painelVenda.add(nVendaTxtLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 40, -1, -1));

        lblNVenda.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblNVenda.setForeground(new java.awt.Color(213, 222, 222));
        lblNVenda.setText("nVenda");
        painelVenda.add(lblNVenda, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 40, -1, -1));

        lblData.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblData.setForeground(new java.awt.Color(213, 222, 222));
        lblData.setText("data");
        painelVenda.add(lblData, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 40, -1, -1));

        lblHora.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblHora.setForeground(new java.awt.Color(213, 222, 222));
        lblHora.setText("hora");
        painelVenda.add(lblHora, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 60, -1, -1));

        nomeVendedor.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        nomeVendedor.setForeground(new java.awt.Color(213, 222, 222));
        nomeVendedor.setText("INSIRA O CÓDIGO DO VENDEDOR");
        painelVenda.add(nomeVendedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 360, -1, -1));

        nomeCliente.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        nomeCliente.setForeground(new java.awt.Color(213, 222, 222));
        nomeCliente.setText("INSIRA O CPF DO CLIENTE");
        painelVenda.add(nomeCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 410, -1, -1));

        listaProdPanel.setPreferredSize(new java.awt.Dimension(520, 150));

        subtotalLista.setText("Subtotal: R$");

        valorVenda.setText("0.00");

        jLabel2.setText("Itens:");

        qtdItens.setText("0");

        btnAdicionar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnAdicionar.setForeground(new java.awt.Color(4, 55, 56));
        btnAdicionar.setText("ADICIONAR ITENS");
        btnAdicionar.setBorderPainted(false);
        btnAdicionar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAdicionarMouseClicked(evt);
            }
        });
        btnAdicionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdicionarActionPerformed(evt);
            }
        });

        tblProdutos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Código", "Nome", "Preço", "Quantidade"
            }
        ));
        tblProdutos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblProdutosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblProdutos);
        if (tblProdutos.getColumnModel().getColumnCount() > 0) {
            tblProdutos.getColumnModel().getColumn(2).setMinWidth(20);
        }

        javax.swing.GroupLayout listaProdPanelLayout = new javax.swing.GroupLayout(listaProdPanel);
        listaProdPanel.setLayout(listaProdPanelLayout);
        listaProdPanelLayout.setHorizontalGroup(
            listaProdPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(listaProdPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(listaProdPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(listaProdPanelLayout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 570, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(listaProdPanelLayout.createSequentialGroup()
                        .addComponent(btnAdicionar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(subtotalLista)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(valorVenda)
                        .addGap(41, 41, 41)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(qtdItens)
                        .addGap(27, 27, 27))))
        );
        listaProdPanelLayout.setVerticalGroup(
            listaProdPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(listaProdPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 129, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(listaProdPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAdicionar)
                    .addComponent(subtotalLista)
                    .addComponent(valorVenda)
                    .addComponent(jLabel2)
                    .addComponent(qtdItens))
                .addContainerGap())
        );

        painelVenda.add(listaProdPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 120, 590, 180));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(222, 213, 213));
        jLabel4.setText("Desconto: R$");
        painelVenda.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 520, -1, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(222, 213, 213));
        jLabel5.setText("Total: R$");
        painelVenda.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 550, -1, -1));

        desconto.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        desconto.setForeground(new java.awt.Color(222, 213, 213));
        desconto.setText("0.00");
        painelVenda.add(desconto, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 520, -1, -1));

        total.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        total.setForeground(new java.awt.Color(222, 213, 213));
        total.setText("0.00");
        painelVenda.add(total, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 550, -1, -1));

        btnVendedorCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/apsoo/imagens/localizar.gif"))); // NOI18N
        btnVendedorCliente.setText("BUSCAR");
        btnVendedorCliente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnVendedorClienteMouseClicked(evt);
            }
        });
        painelVenda.add(btnVendedorCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 450, 130, -1));

        btnProcuraOrcamento1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/apsoo/imagens/localizar.gif"))); // NOI18N
        btnProcuraOrcamento1.setText("BUSCAR ORÇAMENTO");
        painelVenda.add(btnProcuraOrcamento1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 70, 170, -1));

        painelBase.add(painelVenda, "card2");

        painelPagamento.setBackground(new java.awt.Color(46, 88, 89));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 478, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 179, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout painelPagamentoLayout = new javax.swing.GroupLayout(painelPagamento);
        painelPagamento.setLayout(painelPagamentoLayout);
        painelPagamentoLayout.setHorizontalGroup(
            painelPagamentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelPagamentoLayout.createSequentialGroup()
                .addGap(76, 76, 76)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(73, Short.MAX_VALUE))
        );
        painelPagamentoLayout.setVerticalGroup(
            painelPagamentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelPagamentoLayout.createSequentialGroup()
                .addGap(170, 170, 170)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(251, Short.MAX_VALUE))
        );

        painelBase.add(painelPagamento, "card2");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(barraLateral, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(painelBase, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(barraLateral, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(painelBase, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnVendaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnVendaMouseClicked
        painelBase.removeAll();
        painelBase.add(painelVenda);
        painelBase.repaint();
        painelBase.revalidate();
    }//GEN-LAST:event_btnVendaMouseClicked

    private void btnOrcamentoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnOrcamentoMouseClicked
        painelBase.removeAll();
        //painel1.add(painelOrcamento);
        painelBase.repaint();
        painelBase.revalidate();
    }//GEN-LAST:event_btnOrcamentoMouseClicked

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnExcluirActionPerformed

    private void VendaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_VendaMouseClicked
        painelBase.removeAll();
        String codigoVendedor = JOptionPane.showInputDialog(painelBase,
                        "Inserir código do funcionário para validar a venda", null);
        System.out.println(codigoVendedor);
        painelBase.add(painelVendaOrcamento);
        painelBase.repaint();
        painelBase.revalidate();
    }//GEN-LAST:event_VendaMouseClicked

    private void RetiradaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RetiradaMouseClicked

    }//GEN-LAST:event_RetiradaMouseClicked

    private void AdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AdminActionPerformed

    }//GEN-LAST:event_AdminActionPerformed

    private void VendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VendaActionPerformed
        
    }//GEN-LAST:event_VendaActionPerformed

    private void EstoqueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EstoqueActionPerformed
        
    }//GEN-LAST:event_EstoqueActionPerformed

    private void codvendedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_codvendedorActionPerformed
        
    }//GEN-LAST:event_codvendedorActionPerformed

    private void btnGravarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGravarActionPerformed
            con.atualizar("insert into venda(codVenda, dataVenda, cpfcliente, cpfvendedor, valorVenda, desconto, total)"
                + " values('" + lblNVenda.getText() + "', '" + lblData.getText() + "', '" + cpfcliente.getText() + "' , '" + 1111 + "' ,"
                + " '" + valorVenda.getText() + "' ,  '" + desconto.getText() + "' , '" + total.getText() + "')");
            try {
                con.pesquisar("select * from venda");
                con.rs.first();
            } catch (SQLException erroSQL) {
                System.out.println("Erro SQL : " + erroSQL);

            }
          System.exit(0);
    }//GEN-LAST:event_btnGravarActionPerformed

    private void btnVendedorClienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnVendedorClienteMouseClicked
        String sqli = "select p.nome from pessoa as p inner join funcionario as f on p.cpf = f.cpf inner join vendedor as v on p.cpf = v.cpf where v.codacesso = '" + codvendedor.getText() + "'";
        con.pesquisar(sqli);
        try {
             con.rs.next();
             nomeVendedor.setText(con.rs.getString("nome"));
        } catch (SQLException erroSQL) {
            System.out.println("Erro de conexão com o banco: " + erroSQL);
        }

        String sqli2 = "select p.nome from pessoa as p inner join cliente as c on c.cpf = p.cpf where c.cpf = '" + cpfcliente.getText() + "'";
        con.pesquisar(sqli2);
        try {
            con.rs.next();
            nomeCliente.setText(con.rs.getString("nome"));
        } catch (SQLException erroSQL) {
            System.out.println("Erro de conexão com o banco: " + erroSQL);
        }
        
        


    }//GEN-LAST:event_btnVendedorClienteMouseClicked

    private void btnAdicionarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAdicionarMouseClicked
        String codProduto = tblProdutos.getValueAt(tblProdutos.getSelectedRow(), 0).toString();
        String preco = tblProdutos.getValueAt(tblProdutos.getSelectedRow(), 2).toString();
        Venda objetovenda = new Venda();
        
        if(objetovenda.calculaValorVenda(valorVenda.getText(), preco, 1).length() > 8) {
            valorVenda.setText(objetovenda.calculaValorVenda(valorVenda.getText(), preco, 1).substring(0,7));
        } else {
            valorVenda.setText(objetovenda.calculaValorVenda(valorVenda.getText(), preco, 1));
        }
        
        if(objetovenda.calculaDesconto(valorVenda.getText()).length() > 8) {
            desconto.setText(objetovenda.calculaDesconto(valorVenda.getText()).substring(0,7));
        } else {
            desconto.setText(objetovenda.calculaDesconto(valorVenda.getText()));
        }
        
        if(objetovenda.calculaTotal(valorVenda.getText(), desconto.getText()).length() > 8) {
            total.setText(objetovenda.calculaTotal(valorVenda.getText(), desconto.getText()).substring(0,7));
        } else {
            total.setText(objetovenda.calculaTotal(valorVenda.getText(), desconto.getText()));
        }
        
        int qtd = Integer.parseInt(qtdItens.getText());
        int qtdTotal = qtd + 1;
        qtdItens.setText(Integer.toString(qtdTotal));
        
         //con.atualizar("insert into vendaProduto(codVenda, codProduto, quantidade, preco)"
              //    + " values('" + lblNVenda.getText() + "', '" + codProduto + "' , '" + qtdItens.getText() + "' ,"
            //      + " '" + preco + "')");
      
    }//GEN-LAST:event_btnAdicionarMouseClicked

    private void tblProdutosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblProdutosMouseClicked
        
    }//GEN-LAST:event_tblProdutosMouseClicked

    private void btnAdicionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdicionarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAdicionarActionPerformed

   
     private void populaTabela() {
        // com o parâmetro vai realizar uma pesquisa
        
        int qtde = 9;
        double val = 0.0;
        
        //vamos controlar os erros 
        try {
            //definimos tamanho da largura das colunas
            tblProdutos.getColumnModel().getColumn(0).setPreferredWidth(10);
            tblProdutos.getColumnModel().getColumn(1).setPreferredWidth(80);
            tblProdutos.getColumnModel().getColumn(2).setPreferredWidth(30);

            //vamos criar um objeto da classe DefaultTableModel para tratar as configurações
            DefaultTableModel modelo = (DefaultTableModel) tblProdutos.getModel();
            //vamos seguir definir o número inicial de linhas, setando para 0
            modelo.setNumRows(0);
            //agora podemos preencher a tabela com o número de linhas que estiver no resultset (rs)
            con.pesquisar("select * from produtos where codproduto = 2");
            con.rs.next();
            val += Double.parseDouble(con.rs.getString("preco"));
            modelo.addRow(new Object[]{con.rs.getString("codproduto"), con.rs.getString("descricao"), con.rs.getString("preco"), 1});
            con.pesquisar("select * from produtos where codproduto = 3");
            con.rs.next();
            val += Double.parseDouble(con.rs.getString("preco")) * 5;
            modelo.addRow(new Object[]{con.rs.getString("codproduto"), con.rs.getString("descricao"), con.rs.getString("preco"), 5});
            con.pesquisar("select * from produtos where codproduto = 4");
            con.rs.next();
            val += Double.parseDouble(con.rs.getString("preco")) * 2;
            modelo.addRow(new Object[]{con.rs.getString("codproduto"), con.rs.getString("descricao"), con.rs.getString("preco"), 2});
            con.pesquisar("select * from produtos where codproduto = 5");
            con.rs.next();
            val += Double.parseDouble(con.rs.getString("preco"));
            modelo.addRow(new Object[]{con.rs.getString("codproduto"), con.rs.getString("descricao"), con.rs.getString("preco"), 1});
            
            valorVenda.setText(Double.toString(val));
            qtdItens.setText(Integer.toString(qtde));
        } catch (SQLException erro) {
            System.out.println("Erro SQL da tabela: " + erro);
        }
    }
     
     
    
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
            java.util.logging.Logger.getLogger(Sistema.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Sistema.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Sistema.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Sistema.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
   
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Sistema().setVisible(true);
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Admin;
    private javax.swing.JButton Estoque;
    private javax.swing.JButton Relatorio;
    private javax.swing.JButton Retirada;
    private javax.swing.JButton Venda;
    private javax.swing.JPanel barraLateral;
    private javax.swing.JButton btnAdicionar;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton btnGravar;
    private javax.swing.JButton btnOrcamento;
    private javax.swing.JButton btnProcuraOrcamento1;
    private javax.swing.JButton btnVenda;
    private javax.swing.JButton btnVendedorCliente;
    private javax.swing.JLabel clienteTxtLabel;
    private javax.swing.JLabel codVendTxtLabel;
    private javax.swing.JTextField codvendedor;
    private javax.swing.JLabel cpfClienteTxtLabel;
    private javax.swing.JTextField cpfcliente;
    private javax.swing.JLabel desconto;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblData;
    private javax.swing.JLabel lblHora;
    private javax.swing.JLabel lblNVenda;
    private javax.swing.JPanel listaProdPanel;
    private javax.swing.JLabel nVendaTxtLabel;
    private javax.swing.JLabel nomeCliente;
    private javax.swing.JLabel nomeVendedor;
    private javax.swing.JTextField orcamento;
    private javax.swing.JLabel orcamentoTxtLabel;
    private javax.swing.JPanel painelBase;
    private javax.swing.JPanel painelInicial;
    private javax.swing.JPanel painelPagamento;
    private javax.swing.JPanel painelVenda;
    private javax.swing.JPanel painelVendaOrcamento;
    private javax.swing.JLabel qtdItens;
    private javax.swing.JLabel subtotalLista;
    private javax.swing.JTable tblProdutos;
    private javax.swing.JLabel total;
    private javax.swing.JLabel valorVenda;
    private javax.swing.JLabel vendedorTxtLabel;
    // End of variables declaration//GEN-END:variables
}
