package interfaz;
import torneodetenis.*;

public class Interfaz extends javax.swing.JFrame 
{
    Aplicacion app;
    
    NodoTemporada temp;
    NodoCEquipo equipo;
    NodoCategoria categoria;
    NodoJugador jugador;
    
    /**
     * Creates new form Interfaz
     */
    public Interfaz() 
    {
        
         initComponents();
        app = new Aplicacion();
       
        ConsultaPanel.setVisible(false);
        TempActualPanel.setVisible(false);
        NuevaTemporadaPanel.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLayeredPane = new javax.swing.JLayeredPane();
        MenuPrincipal = new javax.swing.JPanel();
        ConsultaBtn = new javax.swing.JButton();
        TempActualBtn = new javax.swing.JButton();
        NuevaTemporadaBtn = new javax.swing.JButton();
        jComboBox1 = new javax.swing.JComboBox();
        jLabel4 = new javax.swing.JLabel();
        atemp = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        ConsultaPanel = new javax.swing.JPanel();
        volverBtn1 = new javax.swing.JButton();
        TempActualPanel = new javax.swing.JPanel();
        volverBtn2 = new javax.swing.JButton();
        NuevaTemporadaPanel = new javax.swing.JPanel();
        nuevaTempLabel = new javax.swing.JLabel();
        volverBtn3 = new javax.swing.JButton();
        comboEquipo = new javax.swing.JComboBox();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        EquipoTxtF = new javax.swing.JTextField();
        jLayeredPane1 = new javax.swing.JLayeredPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        comboCategorias = new javax.swing.JComboBox();
        jLabel2 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        categoriasInscritas = new javax.swing.JComboBox();
        m = new javax.swing.JRadioButton();
        f = new javax.swing.JRadioButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        listaEquiposInscritos = new javax.swing.JList();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(800, 500));
        setSize(new java.awt.Dimension(800, 500));

        jLayeredPane.setPreferredSize(new java.awt.Dimension(800, 500));

        MenuPrincipal.setPreferredSize(new java.awt.Dimension(800, 500));

        ConsultaBtn.setText("Consulta");
        ConsultaBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ConsultaBtnActionPerformed(evt);
            }
        });

        TempActualBtn.setText("Temporada Actual");
        TempActualBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TempActualBtnActionPerformed(evt);
            }
        });

        NuevaTemporadaBtn.setText("Nueva Temporada");
        NuevaTemporadaBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NuevaTemporadaBtnActionPerformed(evt);
            }
        });

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        jLabel4.setText("Año");

        jLabel5.setText("Año:");

        javax.swing.GroupLayout MenuPrincipalLayout = new javax.swing.GroupLayout(MenuPrincipal);
        MenuPrincipal.setLayout(MenuPrincipalLayout);
        MenuPrincipalLayout.setHorizontalGroup(
            MenuPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, MenuPrincipalLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(MenuPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, MenuPrincipalLayout.createSequentialGroup()
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(ConsultaBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(MenuPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(MenuPrincipalLayout.createSequentialGroup()
                        .addComponent(TempActualBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(NuevaTemporadaBtn, javax.swing.GroupLayout.DEFAULT_SIZE, 241, Short.MAX_VALUE))
                    .addGroup(MenuPrincipalLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(atemp, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(36, 36, 36))
        );
        MenuPrincipalLayout.setVerticalGroup(
            MenuPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MenuPrincipalLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(MenuPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ConsultaBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TempActualBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(NuevaTemporadaBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(MenuPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(atemp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(326, Short.MAX_VALUE))
        );

        MenuPrincipalLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {ConsultaBtn, NuevaTemporadaBtn, TempActualBtn});

        ConsultaPanel.setPreferredSize(new java.awt.Dimension(800, 500));

        volverBtn1.setText("Volver");
        volverBtn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                volverBtn1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout ConsultaPanelLayout = new javax.swing.GroupLayout(ConsultaPanel);
        ConsultaPanel.setLayout(ConsultaPanelLayout);
        ConsultaPanelLayout.setHorizontalGroup(
            ConsultaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ConsultaPanelLayout.createSequentialGroup()
                .addContainerGap(727, Short.MAX_VALUE)
                .addComponent(volverBtn1)
                .addContainerGap())
        );
        ConsultaPanelLayout.setVerticalGroup(
            ConsultaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ConsultaPanelLayout.createSequentialGroup()
                .addContainerGap(466, Short.MAX_VALUE)
                .addComponent(volverBtn1)
                .addContainerGap())
        );

        TempActualPanel.setPreferredSize(new java.awt.Dimension(800, 500));

        volverBtn2.setText("Volver");
        volverBtn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                volverBtn2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout TempActualPanelLayout = new javax.swing.GroupLayout(TempActualPanel);
        TempActualPanel.setLayout(TempActualPanelLayout);
        TempActualPanelLayout.setHorizontalGroup(
            TempActualPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, TempActualPanelLayout.createSequentialGroup()
                .addContainerGap(733, Short.MAX_VALUE)
                .addComponent(volverBtn2)
                .addContainerGap())
        );
        TempActualPanelLayout.setVerticalGroup(
            TempActualPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, TempActualPanelLayout.createSequentialGroup()
                .addContainerGap(466, Short.MAX_VALUE)
                .addComponent(volverBtn2)
                .addContainerGap())
        );

        NuevaTemporadaPanel.setPreferredSize(new java.awt.Dimension(800, 500));

        nuevaTempLabel.setText("Temporada: ");

        volverBtn3.setText("Volver");
        volverBtn3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                volverBtn3ActionPerformed(evt);
            }
        });

        comboEquipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboEquipoActionPerformed(evt);
            }
        });

        jButton1.setText("Crear Equipo");
        jButton1.setPreferredSize(new java.awt.Dimension(100, 50));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Modificar Equipo");

        jButton3.setText("Eliminar Equipo");

        EquipoTxtF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EquipoTxtFActionPerformed(evt);
            }
        });

        jLabel1.setText("Categorias");

        comboCategorias.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "1ra", "2da", "3ra", "4ta", "5ta", "6ta" }));

        jLabel2.setText("Categorias inscritas:");

        jButton4.setText("Agregar categoria");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        buttonGroup1.add(m);
        m.setText("Masculino");

        buttonGroup1.add(f);
        f.setText("Femenino");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(f)
                    .addComponent(m)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(comboCategorias, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1)
                            .addComponent(jButton4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(categoriasInscritas, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(344, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(comboCategorias, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(categoriasInscritas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(m)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(f)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton4)
                .addContainerGap(133, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jLayeredPane1Layout = new javax.swing.GroupLayout(jLayeredPane1);
        jLayeredPane1.setLayout(jLayeredPane1Layout);
        jLayeredPane1Layout.setHorizontalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane1Layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jLayeredPane1Layout.setVerticalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jLayeredPane1.setLayer(jPanel1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jScrollPane2.setViewportView(listaEquiposInscritos);

        jLabel3.setText("Equipos Inscritos");

        javax.swing.GroupLayout NuevaTemporadaPanelLayout = new javax.swing.GroupLayout(NuevaTemporadaPanel);
        NuevaTemporadaPanel.setLayout(NuevaTemporadaPanelLayout);
        NuevaTemporadaPanelLayout.setHorizontalGroup(
            NuevaTemporadaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, NuevaTemporadaPanelLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLayeredPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 96, Short.MAX_VALUE)
                .addComponent(volverBtn3))
            .addGroup(NuevaTemporadaPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(NuevaTemporadaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(NuevaTemporadaPanelLayout.createSequentialGroup()
                        .addComponent(EquipoTxtF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(NuevaTemporadaPanelLayout.createSequentialGroup()
                        .addComponent(comboEquipo, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(NuevaTemporadaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton3)
                            .addComponent(jButton2)))
                    .addComponent(nuevaTempLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(NuevaTemporadaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        NuevaTemporadaPanelLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {EquipoTxtF, comboEquipo, jButton1, jButton2, jButton3});

        NuevaTemporadaPanelLayout.setVerticalGroup(
            NuevaTemporadaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(NuevaTemporadaPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(NuevaTemporadaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(NuevaTemporadaPanelLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(volverBtn3))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, NuevaTemporadaPanelLayout.createSequentialGroup()
                        .addGroup(NuevaTemporadaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(nuevaTempLabel)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(NuevaTemporadaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(NuevaTemporadaPanelLayout.createSequentialGroup()
                                .addGroup(NuevaTemporadaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(EquipoTxtF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(NuevaTemporadaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jButton2)
                                    .addComponent(comboEquipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton3))
                            .addComponent(jScrollPane2))
                        .addGap(22, 22, 22)
                        .addComponent(jLayeredPane1)))
                .addContainerGap())
        );

        NuevaTemporadaPanelLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {EquipoTxtF, comboEquipo, jButton1, jButton2, jButton3});

        javax.swing.GroupLayout jLayeredPaneLayout = new javax.swing.GroupLayout(jLayeredPane);
        jLayeredPane.setLayout(jLayeredPaneLayout);
        jLayeredPaneLayout.setHorizontalGroup(
            jLayeredPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPaneLayout.createSequentialGroup()
                .addGroup(jLayeredPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(MenuPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ConsultaPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jLayeredPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jLayeredPaneLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(TempActualPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
            .addGroup(jLayeredPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jLayeredPaneLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(NuevaTemporadaPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        jLayeredPaneLayout.setVerticalGroup(
            jLayeredPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPaneLayout.createSequentialGroup()
                .addComponent(MenuPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ConsultaPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jLayeredPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jLayeredPaneLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(TempActualPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
            .addGroup(jLayeredPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jLayeredPaneLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(NuevaTemporadaPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        jLayeredPane.setLayer(MenuPrincipal, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane.setLayer(ConsultaPanel, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane.setLayer(TempActualPanel, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane.setLayer(NuevaTemporadaPanel, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLayeredPane, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLayeredPane, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void NuevaTemporadaBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NuevaTemporadaBtnActionPerformed
        NuevaTemporadaPanel.setVisible(true);
        MenuPrincipal.setVisible(false);
        ConsultaPanel.setVisible(false);
        TempActualPanel.setVisible(false);
        
        NodoTemporada ntemp= new NodoTemporada ();
        ntemp.setTemporada(Integer.parseInt(atemp.getText()));
        // app.getLsTemp().crearTemporada(Integer.parseInt(atemp.getText()));
        app.getLsTemp().insertarPrimero(ntemp);
//        app.getLsTemp().insertarPrimero(nTemp);
//        app.getLsTemp().getCabeza().setTemporada(tempActual);
//        //nTemp.setTemporada(tempActual);
//        //app.getLsTemp().insertarPrimero(nTemp);
          nuevaTempLabel.setText("Temporada:  " + Integer.toString(app.getLsTemp().getCabeza().getTemporada()));
        
       
       //inicializarComboEquipo(); 
        
    }//GEN-LAST:event_NuevaTemporadaBtnActionPerformed

    public void inicializarComboEquipo(NodoCEquipo aux){
    
    
    
    
    }
    
    
    private void TempActualBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TempActualBtnActionPerformed
        TempActualPanel.setVisible(true);
        NuevaTemporadaPanel.setVisible(false);
        MenuPrincipal.setVisible(false);
        ConsultaPanel.setVisible(false); 
    }//GEN-LAST:event_TempActualBtnActionPerformed

    private void volverBtn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_volverBtn1ActionPerformed
        MenuPrincipal.setVisible(true);
        TempActualPanel.setVisible(false);
        NuevaTemporadaPanel.setVisible(false);
        ConsultaPanel.setVisible(false);
    }//GEN-LAST:event_volverBtn1ActionPerformed

    private void volverBtn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_volverBtn2ActionPerformed
        MenuPrincipal.setVisible(true);
        TempActualPanel.setVisible(false);
        NuevaTemporadaPanel.setVisible(false);
        ConsultaPanel.setVisible(false);
    }//GEN-LAST:event_volverBtn2ActionPerformed

    private void volverBtn3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_volverBtn3ActionPerformed
        MenuPrincipal.setVisible(true);
        TempActualPanel.setVisible(false);
        NuevaTemporadaPanel.setVisible(false);
        ConsultaPanel.setVisible(false);
    }//GEN-LAST:event_volverBtn3ActionPerformed

    private void ConsultaBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ConsultaBtnActionPerformed
        ConsultaPanel.setVisible(true);
        MenuPrincipal.setVisible(false);
        TempActualPanel.setVisible(false);
        NuevaTemporadaPanel.setVisible(false);
        
    }//GEN-LAST:event_ConsultaBtnActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if (EquipoTxtF.getText()!=null)
        {
            String strEquipo = EquipoTxtF.getText();
            app.getLsTemp().getCabeza().getLc_Equipos().crearEquipo(strEquipo);
            //nCEquipo.setNombreEquipo(strEquipo);
            //nTemp.getLc_Equipos().insertarPrimero(nCEquipo);
//            app.getLsTemp().getCabeza().getLc_Equipos().setCabeza(nCEquipo);
//            app.getLsTemp().getCabeza().getLc_Equipos().getCabeza().setNombreEquipo(strEquipo);
//            
              //listaEquiposInscritos.setName(strEquipo);
              
               comboEquipo.addItem(strEquipo);
            
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void EquipoTxtFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EquipoTxtFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_EquipoTxtFActionPerformed

    private void comboEquipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboEquipoActionPerformed
     comboCategorias.removeAllItems();
     if(comboEquipo.getSelectedItem()!=null){
         NodoTemporada t=app.getLsTemp().buscarPorAño(app.getLsTemp().getCabeza(), Integer.parseInt(atemp.getText()));
     String sEquipo= (String)comboEquipo.getSelectedItem();
     NodoCEquipo equi = t.getLc_Equipos().buscarPorNombre(t.getLc_Equipos().getCabeza(), sEquipo);
     NodoCategoria aux =equi.getLs_Categorias().getCabeza();
     
     while(aux!=null){
     categoriasInscritas.addItem(aux.getCategoria()+aux.getSexo());
     
     
     }
     
     
     
     
     }
     
//     
//     //NodoCEquipo equipo=temp.getLc_Equipos().buscarPorNombre(temp.getLc_Equipos().getCabeza(), sEquipo);
//     NodoCategoria aux=equipo.getLs_Categorias().getCabeza();
//     
//     
//     while(aux!=null){
//     comboCategorias.addItem(aux.getCategoria());
//     aux=aux.getProximo();
//     }
//     
//     
//     }
        
//        if (ComboEquipo.getSelectedItem()!=null){
//        
//        String sEquipo= (String)ComboEquipo.getSelectedItem();
//        NodoCategoria aux1= 
//        
//        }
        
        
        
        
        
    }//GEN-LAST:event_comboEquipoActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
      if(m.isSelected()&&comboCategorias.getSelectedItem()=="1ra"){
           app.getLsTemp().getCabeza().getLc_Equipos().buscarPorNombre(equipo, (String)comboEquipo.getSelectedItem()).getLs_Categorias().insertarPrimero('m', 1);
          
           }
    
      
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) 
    {  
        java.awt.EventQueue.invokeLater(new Runnable() 
        {
            public void run() 
            {
                Interfaz interfaz = new Interfaz();
                interfaz.setVisible(true);
                interfaz.setSize(900, 600);
            }    
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ConsultaBtn;
    private javax.swing.JPanel ConsultaPanel;
    private javax.swing.JTextField EquipoTxtF;
    private javax.swing.JPanel MenuPrincipal;
    private javax.swing.JButton NuevaTemporadaBtn;
    private javax.swing.JPanel NuevaTemporadaPanel;
    private javax.swing.JButton TempActualBtn;
    private javax.swing.JPanel TempActualPanel;
    private javax.swing.JTextField atemp;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox categoriasInscritas;
    private javax.swing.JComboBox comboCategorias;
    private javax.swing.JComboBox comboEquipo;
    private javax.swing.JRadioButton f;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLayeredPane jLayeredPane;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JList listaEquiposInscritos;
    private javax.swing.JRadioButton m;
    private javax.swing.JLabel nuevaTempLabel;
    private javax.swing.JButton volverBtn1;
    private javax.swing.JButton volverBtn2;
    private javax.swing.JButton volverBtn3;
    // End of variables declaration//GEN-END:variables
}