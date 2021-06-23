/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.apsoo.view;

import br.com.apsoo.dto.Cliente;
import br.com.apsoo.dto.Controladora;
import br.com.apsoo.dto.ItemVenda;
import br.com.apsoo.dto.Orcamento;
import br.com.apsoo.dto.Produto;
import br.com.apsoo.dto.Venda;
import java.awt.event.KeyEvent;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.TimerTask;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;


public class InterfaceNew extends javax.swing.JFrame {
    private Controladora controladora;
    
    public InterfaceNew() {
        initComponents();
        controladora = new Controladora();
        configura_relogio();
                
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanelLateral = new javax.swing.JPanel();
        jButtonVenda = new javax.swing.JButton();
        jButtonRetirada = new javax.swing.JButton();
        jButtonEstoque = new javax.swing.JButton();
        jButtonRelatorios = new javax.swing.JButton();
        jButtonAdm = new javax.swing.JButton();
        jPanelConteudo = new javax.swing.JPanel();
        jPanelInicial = new javax.swing.JPanel();
        jLabelDataInicial = new javax.swing.JLabel();
        jLabelHoraInicial = new javax.swing.JLabel();
        jPanelMenuVenda = new javax.swing.JPanel();
        jLabelDataMenuVenda = new javax.swing.JLabel();
        jLabelHoraMenuVenda = new javax.swing.JLabel();
        jButtonRealizarVenda = new javax.swing.JButton();
        jButtonRealizarOrcamento = new javax.swing.JButton();
        jPanelVenda = new javax.swing.JPanel();
        jLabelDataVenda = new javax.swing.JLabel();
        jLabelHoraVenda = new javax.swing.JLabel();
        jLabelNumOrc = new javax.swing.JLabel();
        jTextFieldNumOrc = new javax.swing.JTextField();
        jLabelNumVenda = new javax.swing.JLabel();
        jTextFieldNumVenda = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabelInfoVendedor = new javax.swing.JLabel();
        jLabelVendedor = new javax.swing.JLabel();
        jLabelInfoCodVendedor = new javax.swing.JLabel();
        jLabelCodVendedor = new javax.swing.JLabel();
        jLabelCliente = new javax.swing.JLabel();
        jLabelCPFCliente = new javax.swing.JLabel();
        jTextFieldCPFCliente = new javax.swing.JTextField();
        jLabelInfoCliente = new javax.swing.JLabel();
        jLabelItensVenda = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableProdutosVenda = new javax.swing.JTable();
        jButtonAddItem = new javax.swing.JButton();
        jButtonRemItem = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jLabelQtdeItensCompra = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabelSubtotalCompra = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabelDesconto = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabelTotal = new javax.swing.JLabel();
        jButtonCancelarSelecao = new javax.swing.JButton();
        jButtonFinalizarSelecao = new javax.swing.JButton();
        jPanelOrcamento = new javax.swing.JPanel();
        jLabelDataOrca = new javax.swing.JLabel();
        jLabelHoraOrca = new javax.swing.JLabel();
        jLabelNumOrca = new javax.swing.JLabel();
        jTextFieldNumOrca = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        jLabelInfoVendedorOrca = new javax.swing.JLabel();
        jLabelVendedorOrca = new javax.swing.JLabel();
        jLabelInfoCodVendedorOrca = new javax.swing.JLabel();
        jLabelCodVendedorOrca = new javax.swing.JLabel();
        jLabelClienteOrca = new javax.swing.JLabel();
        jLabelCPFClienteOrca = new javax.swing.JLabel();
        jTextFieldCPFClienteOrca = new javax.swing.JTextField();
        jLabelInfoClienteOrca = new javax.swing.JLabel();
        jLabelItensOrca = new javax.swing.JLabel();
        jSeparator4 = new javax.swing.JSeparator();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTableProdutosOrca = new javax.swing.JTable();
        jButtonAddItemOrca = new javax.swing.JButton();
        jButtonRemItemOrca = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jLabelQtdeItensCompraOrca = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabelSubtotalCompraOrca = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabelTotalOrca = new javax.swing.JLabel();
        jButtonCancelarOrca = new javax.swing.JButton();
        jButtonFinalizarOrca = new javax.swing.JButton();
        jLabelValInfo = new javax.swing.JLabel();
        jLabelValDias = new javax.swing.JLabel();
        jPanelSelecaoProduto = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTableProdutosCatalogo = new javax.swing.JTable();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jSpinnerQtdProduto = new javax.swing.JSpinner();
        jButtonCancelarItem = new javax.swing.JButton();
        jButtonConfirmarItem = new javax.swing.JButton();
        jPanelPagamento = new javax.swing.JPanel();
        jButtonCancelarVenda = new javax.swing.JButton();
        jButtonConfirmarVenda = new javax.swing.JButton();
        jLabel32 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        jRadioButtonDIN = new javax.swing.JRadioButton();
        jRadioButtonCRE = new javax.swing.JRadioButton();
        jRadioButtonDEB = new javax.swing.JRadioButton();
        jRadioButtonPIX = new javax.swing.JRadioButton();
        jLabel34 = new javax.swing.JLabel();
        jLabelTotalPgto = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        jLabelTrocoPgto = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jSeparator5 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        jSeparator6 = new javax.swing.JSeparator();
        jSeparator7 = new javax.swing.JSeparator();
        jLabel3 = new javax.swing.JLabel();
        jSeparator8 = new javax.swing.JSeparator();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabelValorParcelaCredito = new javax.swing.JLabel();
        jLabelValorParcelaDebito = new javax.swing.JLabel();
        jTextFieldPagamentoDinheiro = new javax.swing.JTextField();
        jSpinnerDebito = new javax.swing.JSpinner();
        jSpinnerCredito = new javax.swing.JSpinner();
        jTextFieldChavePix = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Venda de Eletrônicos");
        setBounds(new java.awt.Rectangle(0, 0, 0, 0));
        setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        setFocusCycleRoot(false);
        setForeground(java.awt.Color.lightGray);
        setSize(new java.awt.Dimension(800, 600));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanelLateral.setLayout(null);

        jButtonVenda.setText("Venda");
        jButtonVenda.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonVendaMouseClicked(evt);
            }
        });
        jPanelLateral.add(jButtonVenda);
        jButtonVenda.setBounds(0, 0, 100, 120);

        jButtonRetirada.setText("Retirada");
        jPanelLateral.add(jButtonRetirada);
        jButtonRetirada.setBounds(0, 120, 100, 120);

        jButtonEstoque.setText("Estoque");
        jPanelLateral.add(jButtonEstoque);
        jButtonEstoque.setBounds(0, 240, 100, 120);

        jButtonRelatorios.setText("Relatórios");
        jPanelLateral.add(jButtonRelatorios);
        jButtonRelatorios.setBounds(0, 360, 100, 120);

        jButtonAdm.setText("Admin");
        jPanelLateral.add(jButtonAdm);
        jButtonAdm.setBounds(0, 480, 100, 120);

        getContentPane().add(jPanelLateral, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 100, 600));

        jPanelConteudo.setLayout(new java.awt.CardLayout());

        jLabelDataInicial.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jLabelDataInicial.setText("12/12/12");

        jLabelHoraInicial.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jLabelHoraInicial.setText("12:12:12");

        javax.swing.GroupLayout jPanelInicialLayout = new javax.swing.GroupLayout(jPanelInicial);
        jPanelInicial.setLayout(jPanelInicialLayout);
        jPanelInicialLayout.setHorizontalGroup(
            jPanelInicialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelInicialLayout.createSequentialGroup()
                .addContainerGap(640, Short.MAX_VALUE)
                .addGroup(jPanelInicialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelHoraInicial)
                    .addComponent(jLabelDataInicial))
                .addContainerGap())
        );
        jPanelInicialLayout.setVerticalGroup(
            jPanelInicialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelInicialLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelDataInicial)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelHoraInicial)
                .addContainerGap(550, Short.MAX_VALUE))
        );

        jPanelConteudo.add(jPanelInicial, "card2");

        jLabelDataMenuVenda.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jLabelDataMenuVenda.setText("12/12/12");

        jLabelHoraMenuVenda.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jLabelHoraMenuVenda.setText("12:12:12");

        jButtonRealizarVenda.setText("VENDA");
        jButtonRealizarVenda.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonRealizarVendaMouseClicked(evt);
            }
        });

        jButtonRealizarOrcamento.setText("ORÇAMENTO");

        javax.swing.GroupLayout jPanelMenuVendaLayout = new javax.swing.GroupLayout(jPanelMenuVenda);
        jPanelMenuVenda.setLayout(jPanelMenuVendaLayout);
        jPanelMenuVendaLayout.setHorizontalGroup(
            jPanelMenuVendaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelMenuVendaLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanelMenuVendaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelHoraMenuVenda)
                    .addComponent(jLabelDataMenuVenda))
                .addContainerGap())
            .addGroup(jPanelMenuVendaLayout.createSequentialGroup()
                .addGap(190, 190, 190)
                .addComponent(jButtonRealizarVenda, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(100, 100, 100)
                .addComponent(jButtonRealizarOrcamento, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(190, 190, 190))
        );
        jPanelMenuVendaLayout.setVerticalGroup(
            jPanelMenuVendaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelMenuVendaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelDataMenuVenda)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelHoraMenuVenda)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 150, Short.MAX_VALUE)
                .addGroup(jPanelMenuVendaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonRealizarVenda, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonRealizarOrcamento, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(200, 200, 200))
        );

        jPanelConteudo.add(jPanelMenuVenda, "card2");

        jLabelDataVenda.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jLabelDataVenda.setText("12/12/12");

        jLabelHoraVenda.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jLabelHoraVenda.setText("12:12:12");

        jLabelNumOrc.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabelNumOrc.setText("N° Orçamento");

        jTextFieldNumOrc.setToolTipText("digite");
        jTextFieldNumOrc.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextFieldNumOrcKeyPressed(evt);
            }
        });

        jLabelNumVenda.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabelNumVenda.setText("N° Venda");

        jTextFieldNumVenda.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jTextFieldNumVenda.setText("0000000000");

        jLabelInfoVendedor.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabelInfoVendedor.setText("VENDEDOR NÃO INFORMADO");

        jLabelVendedor.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jLabelVendedor.setText("Vendedor:");

        jLabelInfoCodVendedor.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabelInfoCodVendedor.setText("000000");

        jLabelCodVendedor.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jLabelCodVendedor.setText("Código:");

        jLabelCliente.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jLabelCliente.setText("Identificação do Cliente");

        jLabelCPFCliente.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jLabelCPFCliente.setText("CPF do Cliente:");

        jTextFieldCPFCliente.setToolTipText("digite");
        jTextFieldCPFCliente.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextFieldCPFClienteKeyPressed(evt);
            }
        });

        jLabelInfoCliente.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabelInfoCliente.setText("CLIENTE NÃO INFORMADO");

        jLabelItensVenda.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabelItensVenda.setText("Itens da venda");

        jTableProdutosVenda.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Código Produto", "Descrição", "Marca", "Preço Unitário", "Quantidade", "Total Produto"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Double.class, java.lang.Integer.class, java.lang.Double.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTableProdutosVenda);

        jButtonAddItem.setText("Adcionar Item");
        jButtonAddItem.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonAddItemMouseClicked(evt);
            }
        });

        jButtonRemItem.setText("Remover Item");
        jButtonRemItem.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonRemItemMouseClicked(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel9.setText("Itens");

        jLabelQtdeItensCompra.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabelQtdeItensCompra.setText("000");

        jLabel7.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel7.setText("Subtotal");

        jLabelSubtotalCompra.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabelSubtotalCompra.setText("R$ 0,00");

        jLabel12.setFont(new java.awt.Font("Dialog", 0, 20)); // NOI18N
        jLabel12.setText("Desconto");

        jLabelDesconto.setFont(new java.awt.Font("Dialog", 1, 20)); // NOI18N
        jLabelDesconto.setText("R$ 0,00");

        jLabel11.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        jLabel11.setText("Total da Compra");

        jLabelTotal.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabelTotal.setText("R$ 0,00");

        jButtonCancelarSelecao.setText("CANCELAR");
        jButtonCancelarSelecao.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonCancelarSelecaoMouseClicked(evt);
            }
        });

        jButtonFinalizarSelecao.setText("PROSSEGUIR");
        jButtonFinalizarSelecao.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonFinalizarSelecaoMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanelVendaLayout = new javax.swing.GroupLayout(jPanelVenda);
        jPanelVenda.setLayout(jPanelVendaLayout);
        jPanelVendaLayout.setHorizontalGroup(
            jPanelVendaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(jPanelVendaLayout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(jLabelNumOrc)
                .addGap(3, 3, 3)
                .addComponent(jTextFieldNumOrc, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabelNumVenda)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextFieldNumVenda)
                .addGap(142, 142, 142)
                .addGroup(jPanelVendaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelHoraVenda)
                    .addComponent(jLabelDataVenda))
                .addContainerGap())
            .addGroup(jPanelVendaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelVendaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelVendaLayout.createSequentialGroup()
                        .addComponent(jLabelVendedor)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jLabelInfoVendedor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanelVendaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelCodVendedor)
                    .addComponent(jLabelInfoCodVendedor, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(91, 91, 91))
            .addComponent(jSeparator2)
            .addGroup(jPanelVendaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelVendaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(jPanelVendaLayout.createSequentialGroup()
                        .addGroup(jPanelVendaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelVendaLayout.createSequentialGroup()
                                .addGroup(jPanelVendaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabelCPFCliente)
                                    .addComponent(jTextFieldCPFCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(76, 76, 76)
                                .addGroup(jPanelVendaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabelCliente)
                                    .addComponent(jLabelInfoCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 450, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jLabelItensVenda))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelVendaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelVendaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanelVendaLayout.createSequentialGroup()
                        .addComponent(jLabel11)
                        .addGap(49, 49, 49)
                        .addComponent(jLabelTotal))
                    .addGroup(jPanelVendaLayout.createSequentialGroup()
                        .addComponent(jLabel12)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabelDesconto)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 47, Short.MAX_VALUE)
                .addComponent(jButtonCancelarSelecao, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(jButtonFinalizarSelecao, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(jPanelVendaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButtonAddItem)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonRemItem)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelQtdeItensCompra)
                .addGap(18, 18, 18)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelSubtotalCompra)
                .addGap(14, 14, 14))
        );
        jPanelVendaLayout.setVerticalGroup(
            jPanelVendaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelVendaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelVendaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelDataVenda)
                    .addComponent(jLabelNumOrc)
                    .addComponent(jTextFieldNumOrc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelNumVenda)
                    .addComponent(jTextFieldNumVenda))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelHoraVenda)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelVendaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelVendedor)
                    .addComponent(jLabelCodVendedor))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelVendaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelInfoVendedor)
                    .addComponent(jLabelInfoCodVendedor))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanelVendaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelCPFCliente)
                    .addComponent(jLabelCliente))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelVendaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelInfoCliente)
                    .addComponent(jTextFieldCPFCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelItensVenda)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanelVendaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonAddItem)
                    .addComponent(jButtonRemItem)
                    .addComponent(jLabel9)
                    .addComponent(jLabelQtdeItensCompra)
                    .addComponent(jLabel7)
                    .addComponent(jLabelSubtotalCompra))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 49, Short.MAX_VALUE)
                .addGroup(jPanelVendaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(jLabelDesconto))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanelVendaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(jLabelTotal)
                    .addComponent(jButtonCancelarSelecao)
                    .addComponent(jButtonFinalizarSelecao))
                .addGap(29, 29, 29))
        );

        jPanelConteudo.add(jPanelVenda, "card2");

        jLabelDataOrca.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jLabelDataOrca.setText("12/12/12");

        jLabelHoraOrca.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jLabelHoraOrca.setText("12:12:12");

        jLabelNumOrca.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabelNumOrca.setText("N° Orçamento");

        jTextFieldNumOrca.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jTextFieldNumOrca.setText("0000000000");

        jLabelInfoVendedorOrca.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabelInfoVendedorOrca.setText("VENDEDOR NÃO INFORMADO");

        jLabelVendedorOrca.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jLabelVendedorOrca.setText("Vendedor:");

        jLabelInfoCodVendedorOrca.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabelInfoCodVendedorOrca.setText("000000");

        jLabelCodVendedorOrca.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jLabelCodVendedorOrca.setText("Código:");

        jLabelClienteOrca.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jLabelClienteOrca.setText("Identificação do Cliente");

        jLabelCPFClienteOrca.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jLabelCPFClienteOrca.setText("CPF do Cliente:");

        jTextFieldCPFClienteOrca.setToolTipText("digite");

        jLabelInfoClienteOrca.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabelInfoClienteOrca.setText("CLIENTE NÃO INFORMADO");

        jLabelItensOrca.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabelItensOrca.setText("Itens do orçamento");

        jTableProdutosOrca.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Código Produto", "Descrição", "Marca", "Preço Unitário", "Quantidade", "Total Produto"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Double.class, java.lang.Integer.class, java.lang.Double.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(jTableProdutosOrca);

        jButtonAddItemOrca.setText("Adcionar Item");

        jButtonRemItemOrca.setText("Remover Item");

        jLabel10.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel10.setText("Itens");

        jLabelQtdeItensCompraOrca.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabelQtdeItensCompraOrca.setText("000");

        jLabel8.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel8.setText("Subtotal");

        jLabelSubtotalCompraOrca.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabelSubtotalCompraOrca.setText("R$ 0,00");

        jLabel14.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        jLabel14.setText("Total Orçado");

        jLabelTotalOrca.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabelTotalOrca.setText("R$ 0,00");

        jButtonCancelarOrca.setText("CANCELAR");

        jButtonFinalizarOrca.setText("FINALIZAR");

        jLabelValInfo.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabelValInfo.setText("Validade do Orçamento");

        jLabelValDias.setFont(new java.awt.Font("Dialog", 0, 13)); // NOI18N
        jLabelValDias.setForeground(new java.awt.Color(255, 0, 51));
        jLabelValDias.setText("2 dias a partir da data!");

        javax.swing.GroupLayout jPanelOrcamentoLayout = new javax.swing.GroupLayout(jPanelOrcamento);
        jPanelOrcamento.setLayout(jPanelOrcamentoLayout);
        jPanelOrcamentoLayout.setHorizontalGroup(
            jPanelOrcamentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator3, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(jPanelOrcamentoLayout.createSequentialGroup()
                .addGap(82, 82, 82)
                .addGroup(jPanelOrcamentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanelOrcamentoLayout.createSequentialGroup()
                        .addComponent(jLabelNumOrca)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldNumOrca)
                        .addGap(103, 103, 103)
                        .addComponent(jLabelValInfo))
                    .addComponent(jLabelValDias))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanelOrcamentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelHoraOrca)
                    .addComponent(jLabelDataOrca))
                .addContainerGap())
            .addGroup(jPanelOrcamentoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelOrcamentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelVendedorOrca)
                    .addComponent(jLabelInfoVendedorOrca, javax.swing.GroupLayout.PREFERRED_SIZE, 509, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanelOrcamentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelCodVendedorOrca)
                    .addComponent(jLabelInfoCodVendedorOrca, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jSeparator4)
            .addGroup(jPanelOrcamentoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelOrcamentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2)
                    .addGroup(jPanelOrcamentoLayout.createSequentialGroup()
                        .addGroup(jPanelOrcamentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelOrcamentoLayout.createSequentialGroup()
                                .addGroup(jPanelOrcamentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabelCPFClienteOrca)
                                    .addComponent(jTextFieldCPFClienteOrca, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(76, 76, 76)
                                .addGroup(jPanelOrcamentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabelClienteOrca)
                                    .addComponent(jLabelInfoClienteOrca, javax.swing.GroupLayout.PREFERRED_SIZE, 450, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jLabelItensOrca))
                        .addGap(0, 40, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelOrcamentoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel14)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabelTotalOrca)
                .addGap(60, 60, 60)
                .addComponent(jButtonCancelarOrca, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(jButtonFinalizarOrca, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(jPanelOrcamentoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButtonAddItemOrca)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonRemItemOrca)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelQtdeItensCompraOrca)
                .addGap(18, 18, 18)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelSubtotalCompraOrca)
                .addGap(14, 14, 14))
        );
        jPanelOrcamentoLayout.setVerticalGroup(
            jPanelOrcamentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelOrcamentoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelOrcamentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanelOrcamentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabelDataOrca)
                        .addComponent(jLabelNumOrca)
                        .addComponent(jTextFieldNumOrca))
                    .addComponent(jLabelValInfo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelOrcamentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelHoraOrca)
                    .addComponent(jLabelValDias, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelOrcamentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelVendedorOrca)
                    .addComponent(jLabelCodVendedorOrca))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelOrcamentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelInfoVendedorOrca)
                    .addComponent(jLabelInfoCodVendedorOrca))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanelOrcamentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelCPFClienteOrca)
                    .addComponent(jLabelClienteOrca))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelOrcamentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelInfoClienteOrca)
                    .addComponent(jTextFieldCPFClienteOrca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelItensOrca)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanelOrcamentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonAddItemOrca)
                    .addComponent(jButtonRemItemOrca)
                    .addComponent(jLabel10)
                    .addComponent(jLabelQtdeItensCompraOrca)
                    .addComponent(jLabel8)
                    .addComponent(jLabelSubtotalCompraOrca))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 86, Short.MAX_VALUE)
                .addGroup(jPanelOrcamentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(jLabelTotalOrca)
                    .addComponent(jButtonCancelarOrca)
                    .addComponent(jButtonFinalizarOrca))
                .addGap(29, 29, 29))
        );

        jPanelConteudo.add(jPanelOrcamento, "card2");

        jTableProdutosCatalogo.setModel(new javax.swing.table.DefaultTableModel(
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
                {null, null, null, null, null}
            },
            new String [] {
                "Código Produto", "Descrição", "Marca", "Preço Unitário", "Quantidade Estoque"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Double.class, java.lang.Integer.class
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
        jScrollPane3.setViewportView(jTableProdutosCatalogo);

        jLabel28.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel28.setText("Mostrando Somente Itens em Estoque");

        jLabel29.setFont(new java.awt.Font("Dialog", 0, 28)); // NOI18N
        jLabel29.setText("Catálogo de Produtos");

        jLabel30.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel30.setText("Item(s)");

        jLabel31.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel31.setText("Selecione a Quantidade Desejada:");

        jSpinnerQtdProduto.setModel(new javax.swing.SpinnerNumberModel(1, 1, 200, 1));

        jButtonCancelarItem.setText("CANCELAR");
        jButtonCancelarItem.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonCancelarItemMouseClicked(evt);
            }
        });

        jButtonConfirmarItem.setText("CONFIRMAR");
        jButtonConfirmarItem.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonConfirmarItemMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanelSelecaoProdutoLayout = new javax.swing.GroupLayout(jPanelSelecaoProduto);
        jPanelSelecaoProduto.setLayout(jPanelSelecaoProdutoLayout);
        jPanelSelecaoProdutoLayout.setHorizontalGroup(
            jPanelSelecaoProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelSelecaoProdutoLayout.createSequentialGroup()
                .addGroup(jPanelSelecaoProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelSelecaoProdutoLayout.createSequentialGroup()
                        .addGroup(jPanelSelecaoProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelSelecaoProdutoLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel28))
                            .addGroup(jPanelSelecaoProdutoLayout.createSequentialGroup()
                                .addGap(199, 199, 199)
                                .addComponent(jLabel29))
                            .addGroup(jPanelSelecaoProdutoLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel31, javax.swing.GroupLayout.PREFERRED_SIZE, 292, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelSelecaoProdutoLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane3))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelSelecaoProdutoLayout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(jSpinnerQtdProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel30)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 225, Short.MAX_VALUE)
                        .addComponent(jButtonCancelarItem, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonConfirmarItem, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanelSelecaoProdutoLayout.setVerticalGroup(
            jPanelSelecaoProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelSelecaoProdutoLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel29)
                .addGap(32, 32, 32)
                .addComponent(jLabel28)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 371, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(jLabel31)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelSelecaoProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonCancelarItem, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonConfirmarItem, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSpinnerQtdProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel30))
                .addContainerGap())
        );

        jPanelConteudo.add(jPanelSelecaoProduto, "card6");

        jButtonCancelarVenda.setText("CANCELAR");
        jButtonCancelarVenda.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonCancelarSelecaoMouseClicked(evt);
            }
        });

        jButtonConfirmarVenda.setText("CONFIRMAR");
        jButtonConfirmarVenda.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonConfirmarVendaMouseClicked(evt);
            }
        });

        jLabel32.setFont(new java.awt.Font("Dialog", 0, 28)); // NOI18N
        jLabel32.setText("Pagamento da Venda");

        jLabel33.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel33.setText("Forma de pagamento desejada:");

        buttonGroup1.add(jRadioButtonDIN);
        jRadioButtonDIN.setText("Dinheiro: à vista");
        jRadioButtonDIN.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jRadioButtonDINMouseClicked(evt);
            }
        });

        buttonGroup1.add(jRadioButtonCRE);
        jRadioButtonCRE.setText("Cartão de crédito: até 12x");
        jRadioButtonCRE.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jRadioButtonCREMouseClicked(evt);
            }
        });

        buttonGroup1.add(jRadioButtonDEB);
        jRadioButtonDEB.setText("Cartão de débito: à vista");
        jRadioButtonDEB.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jRadioButtonDEBMouseClicked(evt);
            }
        });

        buttonGroup1.add(jRadioButtonPIX);
        jRadioButtonPIX.setText("Pix (Transferência): à vista");
        jRadioButtonPIX.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jRadioButtonPIXMouseClicked(evt);
            }
        });

        jLabel34.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        jLabel34.setText("Total a Pagar");

        jLabelTotalPgto.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabelTotalPgto.setText("R$ 0,00");

        jLabel35.setFont(new java.awt.Font("Dialog", 0, 36)); // NOI18N
        jLabel35.setText("Troco");

        jLabelTrocoPgto.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        jLabelTrocoPgto.setText("R$ 0,00");

        jLabel1.setText("Pagamento em Dinheiro");

        jLabel2.setText("Pagamento por Cartão Débito");

        jLabel3.setText("Pagamento por Cartão Crédito");

        jLabel4.setText("Pagamento via PIX");

        jLabel5.setText("Valor pago em dinheiro:");

        jLabel6.setText("Parcelas:");

        jLabel15.setText("Total Por Parcela:");

        jLabel16.setText("Parcelas:");

        jLabel17.setText("Total Por Parcela:");

        jLabel18.setText("Chave do Pix:");

        jLabelValorParcelaCredito.setText("R$ 0,00");

        jLabelValorParcelaDebito.setText("R$ 0,00");

        jTextFieldPagamentoDinheiro.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextFieldPagamentoDinheiroKeyPressed(evt);
            }
        });

        jSpinnerDebito.setModel(new javax.swing.SpinnerNumberModel(1, 1, 1, 1));

        jSpinnerCredito.setModel(new javax.swing.SpinnerNumberModel(1, 1, 12, 1));
        jSpinnerCredito.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jSpinnerCreditoStateChanged(evt);
            }
        });

        javax.swing.GroupLayout jPanelPagamentoLayout = new javax.swing.GroupLayout(jPanelPagamento);
        jPanelPagamento.setLayout(jPanelPagamentoLayout);
        jPanelPagamentoLayout.setHorizontalGroup(
            jPanelPagamentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelPagamentoLayout.createSequentialGroup()
                .addGroup(jPanelPagamentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelPagamentoLayout.createSequentialGroup()
                        .addGroup(jPanelPagamentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelPagamentoLayout.createSequentialGroup()
                                .addGap(190, 190, 190)
                                .addComponent(jLabel32))
                            .addGroup(jPanelPagamentoLayout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanelPagamentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel33)
                                    .addGroup(jPanelPagamentoLayout.createSequentialGroup()
                                        .addComponent(jRadioButtonDIN)
                                        .addGap(18, 18, 18)
                                        .addComponent(jRadioButtonDEB)
                                        .addGap(18, 18, 18)
                                        .addComponent(jRadioButtonCRE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jRadioButtonPIX)))))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelPagamentoLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, 546, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanelPagamentoLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanelPagamentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelPagamentoLayout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addGroup(jPanelPagamentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel5)
                                    .addGroup(jPanelPagamentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addComponent(jLabel6))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanelPagamentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextFieldPagamentoDinheiro, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jSeparator6, javax.swing.GroupLayout.PREFERRED_SIZE, 520, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jSeparator7, javax.swing.GroupLayout.PREFERRED_SIZE, 520, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanelPagamentoLayout.createSequentialGroup()
                                        .addGap(12, 12, 12)
                                        .addGroup(jPanelPagamentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanelPagamentoLayout.createSequentialGroup()
                                                .addComponent(jSpinnerDebito, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(120, 120, 120)
                                                .addComponent(jLabel15)
                                                .addGap(18, 18, 18)
                                                .addComponent(jLabelValorParcelaDebito, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addComponent(jSpinnerCredito, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                            .addGroup(jPanelPagamentoLayout.createSequentialGroup()
                                .addGap(207, 207, 207)
                                .addComponent(jLabelTotalPgto, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelPagamentoLayout.createSequentialGroup()
                                .addGroup(jPanelPagamentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanelPagamentoLayout.createSequentialGroup()
                                        .addGroup(jPanelPagamentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel18)
                                            .addComponent(jLabel34))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jTextFieldChavePix))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanelPagamentoLayout.createSequentialGroup()
                                        .addGroup(jPanelPagamentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanelPagamentoLayout.createSequentialGroup()
                                                .addComponent(jLabel35, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 233, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(jPanelPagamentoLayout.createSequentialGroup()
                                                .addGap(207, 207, 207)
                                                .addComponent(jLabelTrocoPgto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                        .addGap(1, 1, 1)
                                        .addComponent(jButtonCancelarVenda, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(18, 18, 18)
                                .addComponent(jButtonConfirmarVenda, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap())
            .addGroup(jPanelPagamentoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelPagamentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelPagamentoLayout.createSequentialGroup()
                        .addComponent(jLabel16)
                        .addGap(217, 217, 217)
                        .addComponent(jLabel17)
                        .addGap(18, 18, 18)
                        .addComponent(jLabelValorParcelaCredito, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jSeparator8, javax.swing.GroupLayout.PREFERRED_SIZE, 576, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanelPagamentoLayout.setVerticalGroup(
            jPanelPagamentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelPagamentoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel32)
                .addGap(40, 40, 40)
                .addComponent(jLabel33)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanelPagamentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButtonDIN)
                    .addComponent(jRadioButtonDEB)
                    .addComponent(jRadioButtonCRE)
                    .addComponent(jRadioButtonPIX))
                .addGap(18, 18, 18)
                .addGroup(jPanelPagamentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1)
                    .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanelPagamentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jTextFieldPagamentoDinheiro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addGroup(jPanelPagamentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2)
                    .addComponent(jSeparator6, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanelPagamentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jLabel15)
                    .addComponent(jLabelValorParcelaDebito)
                    .addComponent(jSpinnerDebito, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(51, 51, 51)
                .addGroup(jPanelPagamentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3)
                    .addComponent(jSeparator7, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanelPagamentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16)
                    .addComponent(jLabel17)
                    .addComponent(jLabelValorParcelaCredito)
                    .addComponent(jSpinnerCredito, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 49, Short.MAX_VALUE)
                .addGroup(jPanelPagamentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel4)
                    .addComponent(jSeparator8, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanelPagamentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel18)
                    .addComponent(jTextFieldChavePix, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(jPanelPagamentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel34)
                    .addComponent(jLabelTotalPgto))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelPagamentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelPagamentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButtonCancelarVenda, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButtonConfirmarVenda, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelPagamentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel35)
                        .addComponent(jLabelTrocoPgto)))
                .addContainerGap())
        );

        jPanelConteudo.add(jPanelPagamento, "card6");

        getContentPane().add(jPanelConteudo, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 0, 700, 600));

        getAccessibleContext().setAccessibleParent(this);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonVendaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonVendaMouseClicked
        String input_cod_acesso = JOptionPane.showInputDialog("DIGITE O CÓDIGO DE FUNCIONÁRIO PARA VALIDAR A OPERAÇÃO!");
        
        if(input_cod_acesso != null && controladora.validarFuncionario(input_cod_acesso)){
            troca_tela(jPanelMenuVenda);
        }
        else{
            JOptionPane.showConfirmDialog(null, "Código inválido ou inexistente! Tente Novamente.", "Validar Acesso Funcionário", JOptionPane.DEFAULT_OPTION, JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jButtonVendaMouseClicked

    private void jButtonRealizarVendaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonRealizarVendaMouseClicked
        Venda v = controladora.iniciarVenda();

        seta_informacoes_venda(v);
        
        DefaultTableModel model = (DefaultTableModel) jTableProdutosVenda.getModel();
        model.setNumRows(0);
        
        troca_tela(jPanelVenda);
    }//GEN-LAST:event_jButtonRealizarVendaMouseClicked

    // busca o cliente pelo cpf informado e caso exista, cadastrado no banco, atualiza a tela 
    // de venda com o cliente
    private void jTextFieldCPFClienteKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldCPFClienteKeyPressed
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){
            
            String cpf = jTextFieldCPFCliente.getText().toString();
            
            try{
                Cliente cli = controladora.buscaCliente(cpf);
                controladora.seta_cliente(cli);
                seta_cliente_venda(cli);
            }
            catch (Exception e){
                JOptionPane.showConfirmDialog(null, "Cliente não encontrado! Tente Novamente.", "Buscar Cliente", JOptionPane.DEFAULT_OPTION, JOptionPane.ERROR_MESSAGE);
            }            
        }
        else if(evt.getKeyCode() == KeyEvent.VK_DELETE){
            jTextFieldCPFCliente.setText("");
        }
    }//GEN-LAST:event_jTextFieldCPFClienteKeyPressed

    // deverá trazer as informações de orçamento quando este existir
    private void jTextFieldNumOrcKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldNumOrcKeyPressed
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){
            
            String num_orcamento = jTextFieldNumOrc.getText().toString();
            
            try{
                //Orcamento orc = controladora.buscaOrcamento(num_orcamento);
                // buscar dados do orcamento no banco e preenchar a ttela de venda com o orcamento feito, se for valido
                // checar data de validade do orçamento
                throw new Exception();
            }
            catch (Exception e){
                //JOptionPane.showConfirmDialog(null, "Orçamento não existe! Tente Novamente.", "Buscar Orçamento", JOptionPane.DEFAULT_OPTION, JOptionPane.ERROR_MESSAGE);
                JOptionPane.showConfirmDialog(null, "Orçamento não implementado!", "Buscar Orçamento", JOptionPane.DEFAULT_OPTION, JOptionPane.ERROR_MESSAGE);
            }            
        }
        else if(evt.getKeyCode() == KeyEvent.VK_DELETE){
            jTextFieldNumOrc.setText("");
        }
    }//GEN-LAST:event_jTextFieldNumOrcKeyPressed

    // abre a tela de selecao de produtos
    private void jButtonAddItemMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonAddItemMouseClicked
        
        carrega_catalogo_produtos();
        
        troca_tela(jPanelSelecaoProduto);
    }//GEN-LAST:event_jButtonAddItemMouseClicked

    //cancelar inclusão de item na venda
    private void jButtonCancelarItemMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonCancelarItemMouseClicked
        if(controladora.getOperacao().equals("VENDA")){
            troca_tela(jPanelVenda);
        }
        else{
            troca_tela(jPanelOrcamento);
        }
    }//GEN-LAST:event_jButtonCancelarItemMouseClicked

    // apos um produto selecionado, associa ele à venda com um novo itemVenda 
    // e mostra o produto selecionado na tabela de itens da compra
    private void jButtonConfirmarItemMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonConfirmarItemMouseClicked
        if(controladora.getOperacao().equals("VENDA")){
            ItemVenda iv = extrai_item_selecionado();
            if(iv != null){
                controladora.associa_item_venda(iv);
                associa_item_venda(iv);
                troca_tela(jPanelVenda);
                
                atualiza_valores_venda();            }
        }
        else{
            //controladora.associa_item_orcamento();
            troca_tela(jPanelOrcamento);
        }
    }//GEN-LAST:event_jButtonConfirmarItemMouseClicked

    // remove um item da lista de itens da venda
    private void jButtonRemItemMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonRemItemMouseClicked
        try{
            if(controladora.getOperacao().equals("VENDA")){
                int remover = jTableProdutosVenda.getSelectedRow();
                String cod_produto = jTableProdutosVenda.getModel().getValueAt(remover, 0).toString();
                int quantidade = Integer.valueOf(jTableProdutosVenda.getModel().getValueAt(remover, 4).toString());
                        
                controladora.remove_item_venda(cod_produto, quantidade);
                remove_item_tabela(jTableProdutosVenda, remover);
                
                atualiza_valores_venda();       
            }
            else{
                //String cod_produto = jTableProdutosOrca.getModel().getValueAt(jTableProdutosOrca.getSelectedRow(), 0).toString();
            }
        }
        catch (Exception e){
            JOptionPane.showConfirmDialog(null, "Selecione um Produto Antes de Remover!", "Remover Produto", JOptionPane.DEFAULT_OPTION, JOptionPane.ERROR_MESSAGE);            
        }
    }//GEN-LAST:event_jButtonRemItemMouseClicked

    private void jButtonCancelarSelecaoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonCancelarSelecaoMouseClicked
        controladora.cancelarVenda();
        JOptionPane.showConfirmDialog(null, "Venda cancelada com sucesso!", "Cancelar Operação", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE);
        troca_tela(jPanelInicial);
    }//GEN-LAST:event_jButtonCancelarSelecaoMouseClicked

    private void jButtonFinalizarSelecaoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonFinalizarSelecaoMouseClicked
        jRadioButtonDIN.setSelected(true);
        jTextFieldChavePix.setEnabled(false);
        jSpinnerCredito.setEnabled(false);
        jSpinnerDebito.setEnabled(false);
        jTextFieldPagamentoDinheiro.setEnabled(true);
        controladora.setFormaPagamento("DINHEIRO");
        troca_tela(jPanelPagamento);
    }//GEN-LAST:event_jButtonFinalizarSelecaoMouseClicked

    private void jRadioButtonDINMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jRadioButtonDINMouseClicked
        jTextFieldChavePix.setEnabled(false);
        jSpinnerCredito.setEnabled(false);
        jSpinnerDebito.setEnabled(false);
        jTextFieldPagamentoDinheiro.setEnabled(true);
        
        controladora.setFormaPagamento("DINHEIRO");

    }//GEN-LAST:event_jRadioButtonDINMouseClicked

    private void jRadioButtonDEBMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jRadioButtonDEBMouseClicked
        jTextFieldChavePix.setEnabled(false);
        jSpinnerCredito.setEnabled(false);
        jSpinnerDebito.setEnabled(true);
        jTextFieldPagamentoDinheiro.setEnabled(false);
        
        jLabelTrocoPgto.setText("R$ %.2f".formatted(0.0));
        double total_parcela = controladora.calculaValorParcela(1);
        jLabelValorParcelaDebito.setText("R$ %.2f".formatted(total_parcela));
        
        controladora.setFormaPagamento("DÉBITO");
    }//GEN-LAST:event_jRadioButtonDEBMouseClicked

    private void jRadioButtonCREMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jRadioButtonCREMouseClicked
        jTextFieldChavePix.setEnabled(false);
        jSpinnerCredito.setEnabled(true);
        jSpinnerDebito.setEnabled(false);
        jTextFieldPagamentoDinheiro.setEnabled(false);
        
        jLabelTrocoPgto.setText("R$ %.2f".formatted(0.0));
        double total_parcela = controladora.calculaValorParcela(1);
        jLabelValorParcelaCredito.setText("R$ %.2f".formatted(total_parcela));
        
        controladora.setFormaPagamento("CRÉDITO");

    }//GEN-LAST:event_jRadioButtonCREMouseClicked

    private void jRadioButtonPIXMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jRadioButtonPIXMouseClicked
        jTextFieldChavePix.setEnabled(true);
        jSpinnerCredito.setEnabled(false);
        jSpinnerDebito.setEnabled(false);
        jTextFieldPagamentoDinheiro.setEnabled(false);
        
        jLabelTrocoPgto.setText("R$ %.2f".formatted(0.0));
        
        controladora.setFormaPagamento("PIX");
    }//GEN-LAST:event_jRadioButtonPIXMouseClicked

    private void jTextFieldPagamentoDinheiroKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldPagamentoDinheiroKeyPressed
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){
            double valor = Double.valueOf(jTextFieldPagamentoDinheiro.getText());
        
            try {
                double troco = controladora.calculaTroco(valor);
                jLabelTrocoPgto.setText("R$ %.2f".formatted(troco));
            } catch (Exception e) {
                JOptionPane.showConfirmDialog(null, "Insira um valor maior ou igual ao total da compra!", "Pagamento Dinheiro", JOptionPane.DEFAULT_OPTION, JOptionPane.ERROR_MESSAGE);
            }
        
        }
        else if(evt.getKeyCode() == KeyEvent.VK_DELETE){
            jTextFieldPagamentoDinheiro.setText("");
        }    }//GEN-LAST:event_jTextFieldPagamentoDinheiroKeyPressed

    private void jSpinnerCreditoStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jSpinnerCreditoStateChanged
        
        int parcelas = Integer.valueOf(jSpinnerCredito.getValue().toString());
        double total_parcela = controladora.calculaValorParcela(parcelas);
        jLabelValorParcelaCredito.setText("R$ %.2f".formatted(total_parcela));
    }//GEN-LAST:event_jSpinnerCreditoStateChanged

    private void jButtonConfirmarVendaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonConfirmarVendaMouseClicked
        try{
            String data_hora = getTimerDataHora();
            controladora.finalizarVenda(data_hora);
            JOptionPane.showConfirmDialog(null, "Venda finalizada com sucesso!", "Concluir Operação", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE);
            troca_tela(jPanelInicial);
        }catch (Exception e){
            JOptionPane.showConfirmDialog(null, "Erro no acesso ao banco de dados. Tente Novamente!", "Erro de Conexão", JOptionPane.DEFAULT_OPTION, JOptionPane.ERROR_MESSAGE);
        }
        
    }//GEN-LAST:event_jButtonConfirmarVendaMouseClicked

    public String getTimerDataHora(){
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");

        String date = simpleDateFormat.format(new Date());
        String result ="%s %s".formatted(date, jLabelHoraVenda.getText()); 
        return  result;
    }
    
    public void atualiza_valores_venda(){
        jLabelQtdeItensCompra.setText("%03d".formatted(controladora.getVenda().getQtde_produtos()));
        jLabelSubtotalCompra.setText("R$ %.2f".formatted(controladora.getVenda().getSubtotal()));
        jLabelDesconto.setText("R$ %.2f".formatted(controladora.getVenda().getDesconto()));
        jLabelTotal.setText("R$ %.2f".formatted(controladora.getVenda().getTotal()));
        jLabelTotalPgto.setText("R$ %.2f".formatted(controladora.getVenda().getTotal()));

    }
    
    public void remove_item_tabela(JTable tabela, int produto){
       DefaultTableModel model = (DefaultTableModel) jTableProdutosVenda.getModel();
       model.removeRow(produto);
    }
      
    // coloca as informações do itemVenda extraido na tabela de selecionados
    public void associa_item_venda(ItemVenda iv){
        DefaultTableModel model = (DefaultTableModel) jTableProdutosVenda.getModel();
        model.addRow(new Object[]{  iv.getItem().getCodigo(), iv.getItem().getDescricao(), iv.getItem().getMarca().getNome(), 
                                    iv.getItem().getPreco(), iv.getQtde_item(), iv.getTotal_item()});
    }
    
    // extrai informações do item selecioado pelo usuario na selecao de itens
    public ItemVenda extrai_item_selecionado(){
        String cod_produto = jTableProdutosCatalogo.getModel().getValueAt(jTableProdutosCatalogo.getSelectedRow(), 0).toString();
        int qtde_item = (Integer) jSpinnerQtdProduto.getValue();
        
        try {
            Produto p = controladora.buscaProduto(cod_produto);
            ItemVenda iv = new ItemVenda(p, qtde_item, p.getPreco()*qtde_item);
            return iv;
        } catch (Exception e) {
            JOptionPane.showConfirmDialog(null, "Produto não encontrado! Tente Novamente.", "Buscar Produto", JOptionPane.DEFAULT_OPTION, JOptionPane.ERROR_MESSAGE);            
        }
        
        return null;
    }
    
    public void carrega_catalogo_produtos(){
        //busca e carrega todos os produtos do catálogo de produtos do sistema
        //na tabela de seleção de produtos
        
        DefaultTableModel model = (DefaultTableModel) jTableProdutosCatalogo.getModel();
        model.setNumRows(0);
        
        jSpinnerQtdProduto.setValue(1);
        
        try {
            List res = controladora.busca_catalogo();
            
        Iterator<String> it = res.iterator();
        while(it.hasNext()){
            String s = (String) it.next();
            String[] ss = s.split(",");
            model.addRow(new Object[]{ss[0].strip(), ss[1].strip(), ss[2].strip(), Double.valueOf(ss[3].strip()), Integer.valueOf(ss[4].strip())});
        }
            
        } catch (Exception e) {
            JOptionPane.showConfirmDialog(null, "Erro ao listar todos os produtos!", "Buscar Produtos", JOptionPane.DEFAULT_OPTION, JOptionPane.ERROR_MESSAGE);
        }
    }
    
    public void seta_cliente_venda(Cliente c)
    {   
        //adciona o nome do cliente da venda na tela de venda
        jLabelInfoCliente.setText(c.getNome());
    }
    
    public void seta_informacoes_venda(Venda v)
    {
        //adciona as informações da venda e do vendedor na tela da venda
        jTextFieldNumVenda.setText(v.getCodigo());
        jLabelInfoVendedor.setText(v.getFun().toString());
        jLabelInfoCodVendedor.setText(v.getFun().getCod_acesso());
    }
            
    public void troca_tela(JPanel nova_tela){
        //troca a tela principal no jPanel de conteudo
        jPanelConteudo.removeAll();
        jPanelConteudo.add(nova_tela);
        jPanelConteudo.repaint();
        jPanelConteudo.revalidate();
    }
    
    public void configura_relogio(){
        //configura todos os relogios com data e hora presentes nas telas
        java.util.Timer timer = new java.util.Timer();
        timer.scheduleAtFixedRate(new TimerTask() {
            @Override
            public void run() {
                jLabelHoraInicial.setText(new SimpleDateFormat("HH:mm:ss").format(new Date()));
                jLabelDataInicial.setText(new SimpleDateFormat("dd/MM/yy").format(new Date()));
                jLabelHoraMenuVenda.setText(new SimpleDateFormat("HH:mm:ss").format(new Date()));
                jLabelDataMenuVenda.setText(new SimpleDateFormat("dd/MM/yy").format(new Date()));
                jLabelHoraVenda.setText(new SimpleDateFormat("HH:mm:ss").format(new Date()));
                jLabelDataVenda.setText(new SimpleDateFormat("dd/MM/yy").format(new Date()));
                jLabelHoraOrca.setText(new SimpleDateFormat("HH:mm:ss").format(new Date()));
                jLabelDataOrca.setText(new SimpleDateFormat("dd/MM/yy").format(new Date()));
            }
        }, 0, 1000);
    }
    
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
            java.util.logging.Logger.getLogger(InterfaceNew.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InterfaceNew.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InterfaceNew.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InterfaceNew.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InterfaceNew().setVisible(true);
                
//                JOptionPane.showInputDialog("DIGITE O CÓDIGO DE FUNCIONÁRIO PARA VALIDAR A OPERAÇÃO!");
//                
//                JOptionPane.showConfirmDialog(null, "Erro no acesso ao banco de dados.", "Erro de Conexão", JOptionPane.DEFAULT_OPTION, JOptionPane.ERROR_MESSAGE);
//                
//                JOptionPane.showConfirmDialog(null, "Código inválido ou inexistente! Tente Novamente.", "Validar Acesso Funcionário", JOptionPane.DEFAULT_OPTION, JOptionPane.ERROR_MESSAGE);
//                JOptionPane.showConfirmDialog(null, "Cliente não encontrado! Tente Novamente.", "Buscar Cliente", JOptionPane.DEFAULT_OPTION, JOptionPane.ERROR_MESSAGE);
//                JOptionPane.showConfirmDialog(null, "Orçamento não existe! Tente Novamente.", "Buscar Orçamento", JOptionPane.DEFAULT_OPTION, JOptionPane.ERROR_MESSAGE);
//                
//                JOptionPane.showConfirmDialog(null, "Venda cancelada com sucesso!", "Cancelar Operação", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE);
//                JOptionPane.showConfirmDialog(null, "Venda finalizada com sucesso!", "Concluir Operação", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE);
//                JOptionPane.showConfirmDialog(null, "Orçamento cancelado com sucesso!", "Cancelar Operação", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE);
//                JOptionPane.showConfirmDialog(null, "Orçamento registrado com sucesso!", "Concluir Operação", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButtonAddItem;
    private javax.swing.JButton jButtonAddItemOrca;
    private javax.swing.JButton jButtonAdm;
    private javax.swing.JButton jButtonCancelarItem;
    private javax.swing.JButton jButtonCancelarOrca;
    private javax.swing.JButton jButtonCancelarSelecao;
    private javax.swing.JButton jButtonCancelarVenda;
    private javax.swing.JButton jButtonConfirmarItem;
    private javax.swing.JButton jButtonConfirmarVenda;
    private javax.swing.JButton jButtonEstoque;
    private javax.swing.JButton jButtonFinalizarOrca;
    private javax.swing.JButton jButtonFinalizarSelecao;
    private javax.swing.JButton jButtonRealizarOrcamento;
    private javax.swing.JButton jButtonRealizarVenda;
    private javax.swing.JButton jButtonRelatorios;
    private javax.swing.JButton jButtonRemItem;
    private javax.swing.JButton jButtonRemItemOrca;
    private javax.swing.JButton jButtonRetirada;
    private javax.swing.JButton jButtonVenda;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabelCPFCliente;
    private javax.swing.JLabel jLabelCPFClienteOrca;
    private javax.swing.JLabel jLabelCliente;
    private javax.swing.JLabel jLabelClienteOrca;
    private javax.swing.JLabel jLabelCodVendedor;
    private javax.swing.JLabel jLabelCodVendedorOrca;
    private javax.swing.JLabel jLabelDataInicial;
    private javax.swing.JLabel jLabelDataMenuVenda;
    private javax.swing.JLabel jLabelDataOrca;
    private javax.swing.JLabel jLabelDataVenda;
    private javax.swing.JLabel jLabelDesconto;
    private javax.swing.JLabel jLabelHoraInicial;
    private javax.swing.JLabel jLabelHoraMenuVenda;
    private javax.swing.JLabel jLabelHoraOrca;
    private javax.swing.JLabel jLabelHoraVenda;
    private javax.swing.JLabel jLabelInfoCliente;
    private javax.swing.JLabel jLabelInfoClienteOrca;
    private javax.swing.JLabel jLabelInfoCodVendedor;
    private javax.swing.JLabel jLabelInfoCodVendedorOrca;
    private javax.swing.JLabel jLabelInfoVendedor;
    private javax.swing.JLabel jLabelInfoVendedorOrca;
    private javax.swing.JLabel jLabelItensOrca;
    private javax.swing.JLabel jLabelItensVenda;
    private javax.swing.JLabel jLabelNumOrc;
    private javax.swing.JLabel jLabelNumOrca;
    private javax.swing.JLabel jLabelNumVenda;
    private javax.swing.JLabel jLabelQtdeItensCompra;
    private javax.swing.JLabel jLabelQtdeItensCompraOrca;
    private javax.swing.JLabel jLabelSubtotalCompra;
    private javax.swing.JLabel jLabelSubtotalCompraOrca;
    private javax.swing.JLabel jLabelTotal;
    private javax.swing.JLabel jLabelTotalOrca;
    private javax.swing.JLabel jLabelTotalPgto;
    private javax.swing.JLabel jLabelTrocoPgto;
    private javax.swing.JLabel jLabelValDias;
    private javax.swing.JLabel jLabelValInfo;
    private javax.swing.JLabel jLabelValorParcelaCredito;
    private javax.swing.JLabel jLabelValorParcelaDebito;
    private javax.swing.JLabel jLabelVendedor;
    private javax.swing.JLabel jLabelVendedorOrca;
    private javax.swing.JPanel jPanelConteudo;
    private javax.swing.JPanel jPanelInicial;
    private javax.swing.JPanel jPanelLateral;
    private javax.swing.JPanel jPanelMenuVenda;
    private javax.swing.JPanel jPanelOrcamento;
    private javax.swing.JPanel jPanelPagamento;
    private javax.swing.JPanel jPanelSelecaoProduto;
    private javax.swing.JPanel jPanelVenda;
    private javax.swing.JRadioButton jRadioButtonCRE;
    private javax.swing.JRadioButton jRadioButtonDEB;
    private javax.swing.JRadioButton jRadioButtonDIN;
    private javax.swing.JRadioButton jRadioButtonPIX;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JSeparator jSeparator8;
    private javax.swing.JSpinner jSpinnerCredito;
    private javax.swing.JSpinner jSpinnerDebito;
    private javax.swing.JSpinner jSpinnerQtdProduto;
    private javax.swing.JTable jTableProdutosCatalogo;
    private javax.swing.JTable jTableProdutosOrca;
    private javax.swing.JTable jTableProdutosVenda;
    private javax.swing.JTextField jTextFieldCPFCliente;
    private javax.swing.JTextField jTextFieldCPFClienteOrca;
    private javax.swing.JTextField jTextFieldChavePix;
    private javax.swing.JTextField jTextFieldNumOrc;
    private javax.swing.JLabel jTextFieldNumOrca;
    private javax.swing.JLabel jTextFieldNumVenda;
    private javax.swing.JTextField jTextFieldPagamentoDinheiro;
    // End of variables declaration//GEN-END:variables
}
