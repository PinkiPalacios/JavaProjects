
import cineunimet.*; 
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;


public class PPrincipal extends javax.swing.JFrame {
     CineUnimet cu; 
     NodoPaises pais;
     NodoSucursales sucursal; 
     NodoSalas auxiliarSala; 
     Archivo archivo;
     
    public PPrincipal() 
    {   initComponents(); 
        cu = new CineUnimet(); 
        
        archivo = new Archivo();
        
        inicializarArbol(); 
        inicializarComboPaises(cu.getArbol().getRaiz()); 
        
    }
    
    public void inicializarArbol(){
        try {
            cu.setArbol((ArbolPaises)archivo.obtenerArchivoLista()); 
            
        } catch (Exception ex) {
            System.out.println("Error leyendo: "+ex.getMessage());
            cu.setArbol(new ArbolPaises());
        }
    }
    
        
    public void inicializarComboPaises(NodoPaises aux)
    {   if(aux!=null)
        {   comboPaises.addItem(aux.getNombre());
            if(aux.getNDerecho()!=null)
                {   inicializarComboPaises(aux.getNDerecho());}
            
            if(aux.getNIzquierdo()!=null)
                {   inicializarComboPaises(aux.getNIzquierdo());}
        }
    }
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDialog1 = new javax.swing.JDialog();
        jScrollPane1 = new javax.swing.JScrollPane();
        modeloAsientos=new DefaultListModel();
        asientosJList = new javax.swing.JList();
        comprar2Button = new javax.swing.JButton();
        modSucursalDialog = new javax.swing.JDialog();
        jLabel14 = new javax.swing.JLabel();
        nuevoNombreSuc = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        nuevaDirSuc = new javax.swing.JTextField();
        acModSucButton = new javax.swing.JButton();
        jLayeredPane1 = new javax.swing.JLayeredPane();
        Panel1 = new javax.swing.JPanel();
        comboPaises = new javax.swing.JComboBox();
        jLabel3 = new javax.swing.JLabel();
        agPaisButton = new javax.swing.JButton();
        comboSucursales = new javax.swing.JComboBox();
        agSucursalButton = new javax.swing.JButton();
        cerrarSucursalButton = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLayeredPane2 = new javax.swing.JLayeredPane();
        agSucPanel = new javax.swing.JPanel();
        agSucPanel.setVisible(false);
        jLabel1 = new javax.swing.JLabel();
        nombreSucText = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        dirSucText = new javax.swing.JTextField();
        acSucurButton = new javax.swing.JButton();
        mostrarSucursal = new javax.swing.JButton();
        SalirButton = new javax.swing.JButton();
        fondo = new javax.swing.JLabel();
        agPaisPanel = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        paisText = new javax.swing.JTextField();
        acPaisButton = new javax.swing.JButton();
        Panel2 = new javax.swing.JPanel();
        sucLabel = new javax.swing.JLabel();
        paisLabel = new javax.swing.JLabel();
        dirLabel = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        sucTabbedPane = new javax.swing.JTabbedPane();
        salasPanel = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        agSalasButton = new javax.swing.JButton();
        modSalasButton = new javax.swing.JButton();
        verSalasButton = new javax.swing.JButton();
        jLayeredPane4 = new javax.swing.JLayeredPane();
        verSalaPanel = new javax.swing.JPanel();
        numSalaLabel = new javax.swing.JLabel();
        capSalaLabel = new javax.swing.JLabel();
        peliSalaLabel = new javax.swing.JLabel();
        dispSalaLabel = new javax.swing.JLabel();
        comprarButton = new javax.swing.JButton();
        asSalaLabel = new javax.swing.JLabel();
        agSalaPanel = new javax.swing.JPanel();
        numSalaText = new javax.swing.JTextField();
        agSalasFormCombo = new javax.swing.JComboBox();
        capSalaText = new javax.swing.JTextField();
        agSalaPelisCombo = new javax.swing.JComboBox();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        acAgSalaButton = new javax.swing.JButton();
        acModSalasButton = new javax.swing.JButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        modelo=new DefaultListModel();
        salasJList = new javax.swing.JList();
        pelisPanel = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        agPeliButton = new javax.swing.JButton();
        modPeliButton = new javax.swing.JButton();
        elimPeliButton = new javax.swing.JButton();
        verPeliButton = new javax.swing.JButton();
        jLayeredPane3 = new javax.swing.JLayeredPane();
        verPeliPanel = new javax.swing.JPanel();
        comprarBButton = new javax.swing.JButton();
        tPText = new javax.swing.JLabel();
        dPText = new javax.swing.JLabel();
        fPText = new javax.swing.JLabel();
        yPText = new javax.swing.JLabel();
        asignarSalaButton = new javax.swing.JButton();
        eCText = new javax.swing.JLabel();
        desasosSalaButton = new javax.swing.JButton();
        agPeliPanel = new javax.swing.JPanel();
        titPeliText = new javax.swing.JTextField();
        dirPeliText = new javax.swing.JTextField();
        yearPeliText = new javax.swing.JTextField();
        formatoCombo = new javax.swing.JComboBox();
        acAgPeliButton = new javax.swing.JButton();
        enCarteleraBox = new javax.swing.JCheckBox();
        acModPeliButton = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        modeloPeli= new DefaultListModel();
        pelisJList = new javax.swing.JList();
        atrasButton = new javax.swing.JButton();
        boletosLabel = new javax.swing.JLabel();
        SalirButton2 = new javax.swing.JButton();
        fondo2 = new javax.swing.JLabel();

        jDialog1.setTitle("Comprar Ticket");
        jDialog1.setMinimumSize(new java.awt.Dimension(300, 300));

        asientosJList.setModel(modeloAsientos);
        asientosJList.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_INTERVAL_SELECTION);
        asientosJList.setLayoutOrientation(javax.swing.JList.VERTICAL_WRAP);
        jScrollPane1.setViewportView(asientosJList);

        comprar2Button.setText("Comprar");
        comprar2Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comprar2ButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jDialog1Layout = new javax.swing.GroupLayout(jDialog1.getContentPane());
        jDialog1.getContentPane().setLayout(jDialog1Layout);
        jDialog1Layout.setHorizontalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDialog1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jDialog1Layout.createSequentialGroup()
                .addGap(0, 186, Short.MAX_VALUE)
                .addComponent(comprar2Button))
        );
        jDialog1Layout.setVerticalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDialog1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                .addComponent(comprar2Button)
                .addContainerGap())
        );

        modSucursalDialog.setTitle("Modificar Sucursal");
        modSucursalDialog.setMinimumSize(new java.awt.Dimension(350, 150));

        jLabel14.setText("Nombre:");

        nuevoNombreSuc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nuevoNombreSucActionPerformed(evt);
            }
        });

        jLabel15.setText("Direccion:");

        acModSucButton.setText("Aceptar");
        acModSucButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                acModSucButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout modSucursalDialogLayout = new javax.swing.GroupLayout(modSucursalDialog.getContentPane());
        modSucursalDialog.getContentPane().setLayout(modSucursalDialogLayout);
        modSucursalDialogLayout.setHorizontalGroup(
            modSucursalDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(modSucursalDialogLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(modSucursalDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(modSucursalDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(nuevoNombreSuc)
                    .addComponent(nuevaDirSuc, javax.swing.GroupLayout.DEFAULT_SIZE, 157, Short.MAX_VALUE))
                .addContainerGap(20, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, modSucursalDialogLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(acModSucButton)
                .addContainerGap())
        );
        modSucursalDialogLayout.setVerticalGroup(
            modSucursalDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(modSucursalDialogLayout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addGroup(modSucursalDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(nuevoNombreSuc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(modSucursalDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(nuevaDirSuc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                .addComponent(acModSucButton)
                .addContainerGap())
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Cine Unimet");

        jLayeredPane1.setMaximumSize(new java.awt.Dimension(900, 500));

        Panel1.setMaximumSize(new java.awt.Dimension(900, 500));
        Panel1.setLayout(null);

        comboPaises.setModel(new javax.swing.DefaultComboBoxModel());
        comboPaises.setMinimumSize(new java.awt.Dimension(160, 27));
        comboPaises.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboPaisesActionPerformed(evt);
            }
        });
        Panel1.add(comboPaises);
        comboPaises.setBounds(200, 200, 160, 20);

        jLabel3.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Paises:");
        Panel1.add(jLabel3);
        jLabel3.setBounds(190, 180, 80, 19);

        agPaisButton.setText("Agregar");
        agPaisButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                agPaisButtonActionPerformed(evt);
            }
        });
        Panel1.add(agPaisButton);
        agPaisButton.setBounds(370, 200, 110, 23);

        comboSucursales.setModel(new javax.swing.DefaultComboBoxModel());
        comboSucursales.setMinimumSize(new java.awt.Dimension(160, 27));
        comboSucursales.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboSucursalesActionPerformed(evt);
            }
        });
        Panel1.add(comboSucursales);
        comboSucursales.setBounds(200, 280, 160, 20);

        agSucursalButton.setText("Agregar");
        agSucursalButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                agSucursalButtonActionPerformed(evt);
            }
        });
        Panel1.add(agSucursalButton);
        agSucursalButton.setBounds(370, 270, 110, 23);

        cerrarSucursalButton.setText("Cerrar");
        cerrarSucursalButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cerrarSucursalButtonActionPerformed(evt);
            }
        });
        Panel1.add(cerrarSucursalButton);
        cerrarSucursalButton.setBounds(370, 300, 110, 23);

        jLabel4.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Sucursales:");
        Panel1.add(jLabel4);
        jLabel4.setBounds(190, 260, 90, 19);

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resourses/CineUnimet Titulo 2.png"))); // NOI18N
        Panel1.add(jLabel6);
        jLabel6.setBounds(290, 80, 310, 80);

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resourses/CineUnimet Titulo.png"))); // NOI18N
        jLabel7.setText("jLabel7");
        Panel1.add(jLabel7);
        jLabel7.setBounds(340, 30, 200, 60);

        jLayeredPane2.setMaximumSize(new java.awt.Dimension(235, 150));
        jLayeredPane2.setPreferredSize(new java.awt.Dimension(235, 150));

        agSucPanel.setBackground(new java.awt.Color(0, 0, 0));
        agSucPanel.setForeground(new java.awt.Color(255, 255, 255));
        agSucPanel.setMinimumSize(new java.awt.Dimension(235, 150));

        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Nombre:");

        nombreSucText.setMinimumSize(new java.awt.Dimension(84, 28));
        nombreSucText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nombreSucTextActionPerformed(evt);
            }
        });

        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Direccion:");

        dirSucText.setMinimumSize(new java.awt.Dimension(84, 28));
        dirSucText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dirSucTextActionPerformed(evt);
            }
        });

        acSucurButton.setText("Aceptar");
        acSucurButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                acSucurButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout agSucPanelLayout = new javax.swing.GroupLayout(agSucPanel);
        agSucPanel.setLayout(agSucPanelLayout);
        agSucPanelLayout.setHorizontalGroup(
            agSucPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(agSucPanelLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(agSucPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(acSucurButton)
                    .addGroup(agSucPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel8)
                        .addGroup(agSucPanelLayout.createSequentialGroup()
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(nombreSucText, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(dirSucText, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(19, Short.MAX_VALUE))
        );
        agSucPanelLayout.setVerticalGroup(
            agSucPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(agSucPanelLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(agSucPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(nombreSucText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(dirSucText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(acSucurButton)
                .addContainerGap(35, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jLayeredPane2Layout = new javax.swing.GroupLayout(jLayeredPane2);
        jLayeredPane2.setLayout(jLayeredPane2Layout);
        jLayeredPane2Layout.setHorizontalGroup(
            jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(agSucPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jLayeredPane2Layout.setVerticalGroup(
            jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane2Layout.createSequentialGroup()
                .addComponent(agSucPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jLayeredPane2.setLayer(agSucPanel, javax.swing.JLayeredPane.DEFAULT_LAYER);

        Panel1.add(jLayeredPane2);
        jLayeredPane2.setBounds(490, 200, 230, 150);

        mostrarSucursal.setText("Mostrar");
        mostrarSucursal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mostrarSucursalActionPerformed(evt);
            }
        });
        Panel1.add(mostrarSucursal);
        mostrarSucursal.setBounds(370, 330, 110, 23);

        SalirButton.setText("Salir");
        SalirButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SalirButtonActionPerformed(evt);
            }
        });
        Panel1.add(SalirButton);
        SalirButton.setBounds(760, 450, 97, 23);

        fondo.setForeground(new java.awt.Color(255, 255, 255));
        fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resourses/CinemaBackground.jpg"))); // NOI18N
        Panel1.add(fondo);
        fondo.setBounds(0, 0, 880, 510);

        agPaisPanel.setBackground(new java.awt.Color(0, 0, 0));
        agPaisPanel.setForeground(new java.awt.Color(255, 255, 255));
        agPaisPanel.setMinimumSize(new java.awt.Dimension(235, 150));
        agPaisPanel.setPreferredSize(new java.awt.Dimension(235, 150));

        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Nombre:");

        paisText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                paisTextActionPerformed(evt);
            }
        });

        acPaisButton.setText("Aceptar");
        acPaisButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                acPaisButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout agPaisPanelLayout = new javax.swing.GroupLayout(agPaisPanel);
        agPaisPanel.setLayout(agPaisPanelLayout);
        agPaisPanelLayout.setHorizontalGroup(
            agPaisPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(agPaisPanelLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(agPaisPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(paisText, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(31, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, agPaisPanelLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(acPaisButton)
                .addGap(21, 21, 21))
        );
        agPaisPanelLayout.setVerticalGroup(
            agPaisPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(agPaisPanelLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel5)
                .addGap(4, 4, 4)
                .addComponent(paisText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(acPaisButton)
                .addGap(23, 23, 23))
        );

        Panel1.add(agPaisPanel);
        agPaisPanel.setBounds(550, 70, 235, 150);
        agPaisPanel.setVisible(false);

        Panel2.setMaximumSize(new java.awt.Dimension(880, 510));
        Panel2.setLayout(null);
        Panel2.setVisible(false);

        sucLabel.setFont(new java.awt.Font("Lucida Grande", 1, 24)); // NOI18N
        sucLabel.setForeground(new java.awt.Color(255, 255, 255));
        sucLabel.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        sucLabel.setText("SUCURSAL: ");
        Panel2.add(sucLabel);
        sucLabel.setBounds(10, 30, 170, 50);

        paisLabel.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        paisLabel.setForeground(new java.awt.Color(255, 255, 255));
        paisLabel.setText("Pais: ");
        Panel2.add(paisLabel);
        paisLabel.setBounds(10, 90, 140, 20);

        dirLabel.setFont(new java.awt.Font("Lucida Grande", 1, 12)); // NOI18N
        dirLabel.setForeground(new java.awt.Color(255, 255, 255));
        dirLabel.setText("Direccion:");
        Panel2.add(dirLabel);
        dirLabel.setBounds(10, 120, 160, 20);

        jButton1.setText("Modificar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        Panel2.add(jButton1);
        jButton1.setBounds(40, 180, 90, 30);

        sucTabbedPane.setBackground(new java.awt.Color(153, 153, 153));

        salasPanel.setBackground(new java.awt.Color(0, 0, 0));
        salasPanel.setForeground(new java.awt.Color(255, 255, 255));
        salasPanel.setMaximumSize(new java.awt.Dimension(518, 294));
        salasPanel.setMinimumSize(new java.awt.Dimension(518, 294));

        jLabel9.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Salas");

        agSalasButton.setText("Agregar");
        agSalasButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                agSalasButtonActionPerformed(evt);
            }
        });

        modSalasButton.setText("Modificar");
        modSalasButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modSalasButtonActionPerformed(evt);
            }
        });

        verSalasButton.setText("Ver");
        verSalasButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                verSalasButtonActionPerformed(evt);
            }
        });

        jLayeredPane4.setMaximumSize(new java.awt.Dimension(210, 250));

        verSalaPanel.setVisible(false);

        numSalaLabel.setText("Numero");

        capSalaLabel.setText("Capacidad");

        peliSalaLabel.setText("Pelicula");

        dispSalaLabel.setText("Esta Disponible");

        comprarButton.setVisible(false);
        comprarButton.setText("Comprar Boleto");
        comprarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comprarButtonActionPerformed(evt);
            }
        });

        asSalaLabel.setText("Asientos Disponibles: ");

        javax.swing.GroupLayout verSalaPanelLayout = new javax.swing.GroupLayout(verSalaPanel);
        verSalaPanel.setLayout(verSalaPanelLayout);
        verSalaPanelLayout.setHorizontalGroup(
            verSalaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(verSalaPanelLayout.createSequentialGroup()
                .addGroup(verSalaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, verSalaPanelLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(comprarButton, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(verSalaPanelLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(verSalaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(asSalaLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 186, Short.MAX_VALUE)
                            .addGroup(verSalaPanelLayout.createSequentialGroup()
                                .addGroup(verSalaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(numSalaLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(peliSalaLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(dispSalaLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 172, Short.MAX_VALUE)
                                    .addComponent(capSalaLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addContainerGap())
        );
        verSalaPanelLayout.setVerticalGroup(
            verSalaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(verSalaPanelLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(numSalaLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(capSalaLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(peliSalaLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(dispSalaLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(asSalaLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 102, Short.MAX_VALUE)
                .addComponent(comprarButton)
                .addGap(17, 17, 17))
        );

        jLayeredPane4.add(verSalaPanel);
        verSalaPanel.setBounds(0, 0, 210, 250);

        agSalaPanel.setVisible(false);

        numSalaText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                numSalaTextActionPerformed(evt);
            }
        });

        agSalasFormCombo.setModel(new javax.swing.DefaultComboBoxModel(new String[] {"2D", "3D", "4Dx"}));
        agSalasFormCombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                agSalasFormComboActionPerformed(evt);
            }
        });

        agSalaPelisCombo.setModel(new javax.swing.DefaultComboBoxModel());

        jLabel10.setText("Numero:");

        jLabel11.setText("Capacidad:");

        jLabel12.setText("Formato:");

        jLabel13.setText("Pelicula:");

        acAgSalaButton.setText("Aceptar");
        acAgSalaButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                acAgSalaButtonActionPerformed(evt);
            }
        });

        acModSalasButton.setText("Aceptar");
        acModSalasButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                acModSalasButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout agSalaPanelLayout = new javax.swing.GroupLayout(agSalaPanel);
        agSalaPanel.setLayout(agSalaPanelLayout);
        agSalaPanelLayout.setHorizontalGroup(
            agSalaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(agSalaPanelLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(agSalaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(agSalaPelisCombo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(agSalaPanelLayout.createSequentialGroup()
                        .addGroup(agSalaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel11)
                            .addComponent(jLabel10)
                            .addGroup(agSalaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel13)
                                .addComponent(jLabel12)))
                        .addGap(8, 8, 8)
                        .addGroup(agSalaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(numSalaText, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(capSalaText, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(agSalasFormCombo, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(30, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, agSalaPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(acModSalasButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(acAgSalaButton)
                .addContainerGap())
        );
        agSalaPanelLayout.setVerticalGroup(
            agSalaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(agSalaPanelLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(agSalaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(numSalaText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(agSalaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(capSalaText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(agSalaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(agSalasFormCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel13)
                .addGap(1, 1, 1)
                .addComponent(agSalaPelisCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 79, Short.MAX_VALUE)
                .addGroup(agSalaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(acAgSalaButton)
                    .addComponent(acModSalasButton))
                .addGap(17, 17, 17))
        );

        jLayeredPane4.add(agSalaPanel);
        agSalaPanel.setBounds(0, 0, 210, 250);

        salasJList.setModel(modelo);
        salasJList.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPane4.setViewportView(salasJList);

        javax.swing.GroupLayout salasPanelLayout = new javax.swing.GroupLayout(salasPanel);
        salasPanel.setLayout(salasPanelLayout);
        salasPanelLayout.setHorizontalGroup(
            salasPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(salasPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(salasPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(salasPanelLayout.createSequentialGroup()
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(salasPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(agSalasButton, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(modSalasButton, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addComponent(verSalasButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addComponent(jLayeredPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 223, Short.MAX_VALUE))
                    .addGroup(salasPanelLayout.createSequentialGroup()
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        salasPanelLayout.setVerticalGroup(
            salasPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, salasPanelLayout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(salasPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLayeredPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 250, Short.MAX_VALUE)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 258, Short.MAX_VALUE)
                    .addGroup(salasPanelLayout.createSequentialGroup()
                        .addComponent(agSalasButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(modSalasButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(verSalasButton)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        sucTabbedPane.addTab("Salas", salasPanel);

        pelisPanel.setBackground(new java.awt.Color(0, 0, 0));

        jLabel2.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Peliculas");

        agPeliButton.setText("Agregar");
        agPeliButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                agPeliButtonActionPerformed(evt);
            }
        });

        modPeliButton.setText("Modificar");
        modPeliButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modPeliButtonActionPerformed(evt);
            }
        });

        elimPeliButton.setText("Eliminar");
        elimPeliButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                elimPeliButtonActionPerformed(evt);
            }
        });

        verPeliButton.setText("Ver");
        verPeliButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                verPeliButtonActionPerformed(evt);
            }
        });

        jLayeredPane3.setMaximumSize(new java.awt.Dimension(210, 230));
        jLayeredPane3.setMinimumSize(new java.awt.Dimension(210, 230));

        verPeliPanel.setVisible(false);

        comprarBButton.setText("Comprar Boleto");
        comprarBButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comprarBButtonActionPerformed(evt);
            }
        });

        tPText.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        tPText.setText("Titulo:");

        dPText.setText("Director: ");

        fPText.setText("Formato:");

        yPText.setText("Año:");

        asignarSalaButton.setText("Asignar Sala");
        asignarSalaButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                asignarSalaButtonActionPerformed(evt);
            }
        });

        eCText.setForeground(new java.awt.Color(0, 153, 153));
        eCText.setText("en Cartelera");

        desasosSalaButton.setVisible(false);
        desasosSalaButton.setText("Desasociar Sala");
        desasosSalaButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                desasosSalaButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout verPeliPanelLayout = new javax.swing.GroupLayout(verPeliPanel);
        verPeliPanel.setLayout(verPeliPanelLayout);
        verPeliPanelLayout.setHorizontalGroup(
            verPeliPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(verPeliPanelLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(verPeliPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(desasosSalaButton)
                    .addComponent(comprarBButton)
                    .addGroup(verPeliPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(yPText)
                        .addComponent(dPText, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(tPText, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(fPText)
                        .addComponent(eCText, javax.swing.GroupLayout.DEFAULT_SIZE, 175, Short.MAX_VALUE))
                    .addComponent(asignarSalaButton, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(14, Short.MAX_VALUE))
        );
        verPeliPanelLayout.setVerticalGroup(
            verPeliPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, verPeliPanelLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(tPText, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(dPText)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(fPText)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(yPText)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(eCText)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(desasosSalaButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(asignarSalaButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(comprarBButton)
                .addGap(46, 46, 46))
        );

        jLayeredPane3.add(verPeliPanel);
        verPeliPanel.setBounds(10, 10, 210, 230);

        agPeliPanel.setVisible(false);

        titPeliText.setText("Titulo");
        titPeliText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                titPeliTextActionPerformed(evt);
            }
        });

        dirPeliText.setText("Director");
        dirPeliText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dirPeliTextActionPerformed(evt);
            }
        });

        yearPeliText.setText("Año");
        yearPeliText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                yearPeliTextActionPerformed(evt);
            }
        });

        formatoCombo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "2D", "3D", "4Dx" }));
        formatoCombo.setToolTipText("Formato");

        acAgPeliButton.setText("Aceptar");
        acAgPeliButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                acAgPeliButtonActionPerformed(evt);
            }
        });

        enCarteleraBox.setText("Esta en Cartelera");

        acModPeliButton.setText("Aceptar");
        acModPeliButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                acModPeliButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout agPeliPanelLayout = new javax.swing.GroupLayout(agPeliPanel);
        agPeliPanel.setLayout(agPeliPanelLayout);
        agPeliPanelLayout.setHorizontalGroup(
            agPeliPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(agPeliPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(agPeliPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(agPeliPanelLayout.createSequentialGroup()
                        .addGroup(agPeliPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(agPeliPanelLayout.createSequentialGroup()
                                .addComponent(yearPeliText, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(formatoCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(enCarteleraBox))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(agPeliPanelLayout.createSequentialGroup()
                        .addGroup(agPeliPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(titPeliText, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(dirPeliText, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(agPeliPanelLayout.createSequentialGroup()
                                .addComponent(acModPeliButton)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(acAgPeliButton)))
                        .addGap(0, 13, Short.MAX_VALUE))))
        );
        agPeliPanelLayout.setVerticalGroup(
            agPeliPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(agPeliPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(titPeliText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(dirPeliText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(agPeliPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(yearPeliText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(formatoCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(enCarteleraBox)
                .addGap(58, 58, 58)
                .addGroup(agPeliPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(acModPeliButton)
                    .addComponent(acAgPeliButton))
                .addContainerGap(19, Short.MAX_VALUE))
        );

        jLayeredPane3.add(agPeliPanel);
        agPeliPanel.setBounds(6, 6, 189, 208);

        pelisJList.setModel(modeloPeli);
        pelisJList.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPane3.setViewportView(pelisJList);

        javax.swing.GroupLayout pelisPanelLayout = new javax.swing.GroupLayout(pelisPanel);
        pelisPanel.setLayout(pelisPanelLayout);
        pelisPanelLayout.setHorizontalGroup(
            pelisPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pelisPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pelisPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(pelisPanelLayout.createSequentialGroup()
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pelisPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(verPeliButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(agPeliButton, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(modPeliButton, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(elimPeliButton, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLayeredPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 231, Short.MAX_VALUE)))
                .addGap(16, 16, 16))
        );
        pelisPanelLayout.setVerticalGroup(
            pelisPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pelisPanelLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pelisPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLayeredPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 241, Short.MAX_VALUE)
                    .addGroup(pelisPanelLayout.createSequentialGroup()
                        .addComponent(agPeliButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(modPeliButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(elimPeliButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(verPeliButton)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane3))
                .addContainerGap())
        );

        sucTabbedPane.addTab("Peliculas", pelisPanel);

        Panel2.add(sucTabbedPane);
        sucTabbedPane.setBounds(180, 10, 540, 340);

        atrasButton.setText("Atrás");
        atrasButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                atrasButtonActionPerformed(evt);
            }
        });
        Panel2.add(atrasButton);
        atrasButton.setBounds(20, 460, 59, 23);

        boletosLabel.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        boletosLabel.setForeground(new java.awt.Color(255, 255, 255));
        boletosLabel.setText("Boletos Disponibles:");
        Panel2.add(boletosLabel);
        boletosLabel.setBounds(10, 150, 180, 18);

        SalirButton2.setText("Salir");
        SalirButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SalirButton2ActionPerformed(evt);
            }
        });
        Panel2.add(SalirButton2);
        SalirButton2.setBounds(760, 460, 90, 30);

        fondo2.setForeground(new java.awt.Color(255, 255, 255));
        fondo2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resourses/CinemaBackground.jpg"))); // NOI18N
        Panel2.add(fondo2);
        fondo2.setBounds(0, 0, 890, 510);

        javax.swing.GroupLayout jLayeredPane1Layout = new javax.swing.GroupLayout(jLayeredPane1);
        jLayeredPane1.setLayout(jLayeredPane1Layout);
        jLayeredPane1Layout.setHorizontalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Panel1, javax.swing.GroupLayout.DEFAULT_SIZE, 876, Short.MAX_VALUE)
            .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jLayeredPane1Layout.createSequentialGroup()
                    .addComponent(Panel2, javax.swing.GroupLayout.DEFAULT_SIZE, 876, Short.MAX_VALUE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        jLayeredPane1Layout.setVerticalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Panel1, javax.swing.GroupLayout.DEFAULT_SIZE, 508, Short.MAX_VALUE)
            .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(Panel2, javax.swing.GroupLayout.DEFAULT_SIZE, 508, Short.MAX_VALUE))
        );
        jLayeredPane1.setLayer(Panel1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(Panel2, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLayeredPane1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLayeredPane1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void comboPaisesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboPaisesActionPerformed
        comboSucursales.removeAllItems();
        if(comboPaises.getSelectedItem()!=null)
        {   String sPais = (String)comboPaises.getSelectedItem();
            NodoPaises pais = cu.getArbol().compararNombre(cu.getArbol().getRaiz(), sPais);//encuentro el pais seleccionado
            NodoSucursales aux = pais.getSucursales().getCabeza();
            while(aux!=null)
            {   comboSucursales.addItem(aux.getNombre());
                aux=aux.getProximo();
            }
        }
    }//GEN-LAST:event_comboPaisesActionPerformed

    private void comboSucursalesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboSucursalesActionPerformed

    }//GEN-LAST:event_comboSucursalesActionPerformed

    private void agPaisButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_agPaisButtonActionPerformed
        agPaisPanel.setVisible(true);
        agSucPanel.setVisible(false); 
    }//GEN-LAST:event_agPaisButtonActionPerformed

    private void paisTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_paisTextActionPerformed
        
    }//GEN-LAST:event_paisTextActionPerformed

    private void nombreSucTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nombreSucTextActionPerformed
        
    }//GEN-LAST:event_nombreSucTextActionPerformed

    private void dirSucTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dirSucTextActionPerformed
        
    }//GEN-LAST:event_dirSucTextActionPerformed

    private void agSucursalButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_agSucursalButtonActionPerformed
        if(comboPaises.getSelectedItem()!=null){
        agSucPanel.setVisible(true);
        agPaisPanel.setVisible(false); }
    }//GEN-LAST:event_agSucursalButtonActionPerformed

    private void cerrarSucursalButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cerrarSucursalButtonActionPerformed
        if(comboSucursales.getSelectedItem()!=null)//verifico que haya seleccionado una sucursal
        {   if(JOptionPane.showConfirmDialog(rootPane, "Esta seguro de que desea eliminar esta sucursal?", "", JOptionPane.OK_CANCEL_OPTION)==JOptionPane.OK_OPTION){
                String sPais = (String)comboPaises.getSelectedItem();
                String sSucursal = (String)comboSucursales.getSelectedItem();
                NodoPaises nPais = cu.getArbol().compararNombre(cu.getArbol().getRaiz(), sPais);//encuentro el pais seleccionado
                nPais.getSucursales().cerrarSucursal(nPais.getSucursales().getCabeza(), sSucursal);//cierro sucursal
                comboSucursales.removeItem(comboSucursales.getSelectedItem());
            }
        }
    }//GEN-LAST:event_cerrarSucursalButtonActionPerformed

    private void acSucurButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_acSucurButtonActionPerformed
        if(comboPaises.getSelectedItem()!=null)//verifico que haya seleccionado un pais
        {   String sPais = (String)comboPaises.getSelectedItem();
            NodoPaises nPais = cu.getArbol().compararNombre(cu.getArbol().getRaiz(), sPais);//encuentro el pais seleccionado
            //Verifico que la sucursal no exista
                NodoSucursales aux1 = nPais.getSucursales().buscarPorNombre(nPais.getSucursales().getCabeza(), nombreSucText.getText()); 
                //NodoSucursales aux2 = nPais.getSucursales().buscarPorDir(nPais.getSucursales().getCabeza(), dirSucText.getText());
            if(aux1!=null)// || aux2!=null)
            {   JOptionPane.showMessageDialog(rootPane, "Esta Sucursal ya se encuentra en la Lista");}
            else { nPais.getSucursales().agregarPrimero(nombreSucText.getText(), dirSucText.getText());
                    comboSucursales.addItem(nombreSucText.getText());}
        }
        agSucPanel.setVisible(false);
    }//GEN-LAST:event_acSucurButtonActionPerformed

    private void mostrarSucursalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mostrarSucursalActionPerformed
         if(comboSucursales.getSelectedItem()!=null){
        pais = cu.getArbol().compararNombre(cu.getArbol().getRaiz(), (String)comboPaises.getSelectedItem());
        sucursal = pais.getSucursales().buscarPorNombre(pais.getSucursales().getCabeza(), (String)comboSucursales.getSelectedItem());
        Panel2.setVisible(true);
        Panel1.setVisible(false); 
            String nombreSuc = (String) comboSucursales.getSelectedItem();
            sucLabel.setText(nombreSuc);
            String nPais = (String) comboPaises.getSelectedItem();
            paisLabel.setText("Pais: "+nPais);
            dirLabel.setText("Direccion: "+sucursal.getDir());
            boletosLabel.setText("Boletos Disponibles: "+ sucursal.boletosDisponibles());
            inicializarListModelSalas();
            inicializarListModelPeliculas();
        }
                
    }//GEN-LAST:event_mostrarSucursalActionPerformed
    
    public void inicializarListModelSalas()
    {       modelo.removeAllElements();
            NodoSalas sala = sucursal.getListaSalas().getCabeza(); 
            while(sala!=null)
            { modelo.addElement(String.valueOf(sala.getNumero())); 
              sala=sala.getProximo();
            }
    }
    public void inicializarListModelPeliculas()
    {       modeloPeli.removeAllElements();
            NodoPelicula peli = sucursal.getListaPelis().getCabeza(); 
            if(peli!=null)
            {   do
                {   modeloPeli.addElement(peli.getTitulo());
                    peli=peli.getProximo();
                }while(peli!=sucursal.getListaPelis().getCabeza() && peli!=null);
            }   
    }
    
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        nuevoNombreSuc.setText(sucursal.getNombre());
        nuevaDirSuc.setText(sucursal.getDir());
        modSucursalDialog.setVisible(true); 
    }//GEN-LAST:event_jButton1ActionPerformed

    private void agPeliButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_agPeliButtonActionPerformed
        verPeliPanel.setVisible(false);
        agPeliPanel.setVisible(true);
        
        acAgPeliButton.setVisible(true);
        acModPeliButton.setVisible(false);
        dirPeliText.setText("Director");
        titPeliText.setText("Titulo");
        yearPeliText.setText("Año");
    }//GEN-LAST:event_agPeliButtonActionPerformed

    private void elimPeliButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_elimPeliButtonActionPerformed
        String  nPeli = (String) modeloPeli.getElementAt(pelisJList.getSelectedIndex());
        sucursal.getListaPelis().eliminarPelicula(nPeli);
        sucursal.desasociarSalasPeliculasSegunPelicula(nPeli);
        modeloPeli.remove(pelisJList.getSelectedIndex());
        boletosLabel.setText("Boletos Disponibles: "+ sucursal.boletosDisponibles());
    }//GEN-LAST:event_elimPeliButtonActionPerformed

    private void acPaisButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_acPaisButtonActionPerformed
        NodoPaises aux = cu.getArbol().compararNombre(cu.getArbol().getRaiz(), paisText.getText());
        if(aux!=null){JOptionPane.showMessageDialog(rootPane, "Este Pais ya se encuentra en la Lista");}
        else
        {       cu.getArbol().crearPais(paisText.getText()); 
                comboPaises.addItem(paisText.getText());}
        agPaisPanel.setVisible(false);
    }//GEN-LAST:event_acPaisButtonActionPerformed

    private void modPeliButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modPeliButtonActionPerformed
        verPeliPanel.setVisible(false);
        if(pelisJList.getSelectedValue()!=null){ 
            agPeliPanel.setVisible(true);
            acAgPeliButton.setVisible(false);
            acModPeliButton.setVisible(true);
            
            String  nPeli = (String) modeloPeli.getElementAt(pelisJList.getSelectedIndex());
            NodoPelicula peli = sucursal.getListaPelis().buscarPelicula(nPeli);
            
            dirPeliText.setText(peli.getDirector());
            titPeliText.setText(nPeli);
            yearPeliText.setText(Integer.toString(peli.getYear()));
            formatoCombo.setSelectedItem(peli.getFormato());
            enCarteleraBox.setSelected(peli.isEnCartelera());
        }
        
    }//GEN-LAST:event_modPeliButtonActionPerformed

    private void comprarBButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comprarBButtonActionPerformed
        modeloAsientos.removeAllElements();
        
        jDialog1.setVisible(true);
        
        NodoPelicula peli = sucursal.getListaPelis().buscarPelicula((String) pelisJList.getSelectedValue());
        NodoSalas sala = sucursal.getListaSalas().buscarPorPelicula(sucursal.getListaSalas().getCabeza(), (String) pelisJList.getSelectedValue());
        NodoAsientos asiento = sala.getAsientos().peek();
        
        while(asiento!=null)
        {   if(asiento.isOcupado()){modeloAsientos.addElement("X");}
            else { modeloAsientos.addElement(String.valueOf(asiento.getNumero()));}
            asiento=asiento.getProximo();
        }
        
    }//GEN-LAST:event_comprarBButtonActionPerformed

    private void verPeliButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_verPeliButtonActionPerformed
            if(pelisJList.getSelectedValue()!=null){
                verPeliPanel.setVisible(true);
                NodoPelicula peli = sucursal.getListaPelis().buscarPelicula((String) pelisJList.getSelectedValue());
                if(peli.isEnCartelera())
                {comprarBButton.setVisible(true); 
                 if(sucursal.getListaSalas().buscarPorPelicula(sucursal.getListaSalas().getCabeza(), peli.getTitulo())==null){asignarSalaButton.setVisible(true);}
                 else{asignarSalaButton.setVisible(false);}
                }
                else{comprarBButton.setVisible(false); 
                 if(sucursal.getListaSalas().buscarPorPelicula(sucursal.getListaSalas().getCabeza(), peli.getTitulo())!=null){asignarSalaButton.setVisible(false);}
                }
                
                if(sucursal.getListaSalas().buscarPorPelicula(sucursal.getListaSalas().getCabeza(), peli.getTitulo())!=null){desasosSalaButton.setVisible(true);}
                else{desasosSalaButton.setVisible(false);}
                    
                tPText.setText(peli.getTitulo());
                dPText.setText("Director: "+peli.getDirector()); 
                yPText.setText("Año: "+String.valueOf(peli.getYear()));
                fPText.setText("Formato: "+peli.getFormato()); 
                if(peli.isEnCartelera()){eCText.setText("En Cartelera");}else{eCText.setText("No esta en Cartelera");}
            }
    }//GEN-LAST:event_verPeliButtonActionPerformed

    private void acModPeliButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_acModPeliButtonActionPerformed
        String  nPeli = (String) pelisJList.getSelectedValue();
        String nombreSuc = (String) comboSucursales.getSelectedItem();
        NodoPelicula peli = sucursal.getListaPelis().buscarPelicula(nPeli);
        peli.modificar(titPeliText.getText(), Integer.parseInt(yearPeliText.getText()), dirPeliText.getText(), enCarteleraBox.isSelected(), (String)formatoCombo.getSelectedItem());
        modeloPeli.remove(pelisJList.getSelectedIndex());
        modeloPeli.addElement(titPeliText.getText());
        agPeliPanel.setVisible(false);
    }//GEN-LAST:event_acModPeliButtonActionPerformed

    private void acAgPeliButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_acAgPeliButtonActionPerformed
        if(sucursal.getListaPelis().buscarPelicula(titPeliText.getText())!=null){
            JOptionPane.showMessageDialog(rootPane, "Esta Pelicula ya se encuentra en la Lista");
        }else{
            sucursal.getListaPelis().agregarPelicula(titPeliText.getText(),Integer.parseInt(yearPeliText.getText()), dirPeliText.getText(), enCarteleraBox.isSelected(),(String)formatoCombo.getSelectedItem());
            modeloPeli.addElement(titPeliText.getText());}
        
        agPeliPanel.setVisible(false);
    }//GEN-LAST:event_acAgPeliButtonActionPerformed

    private void yearPeliTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_yearPeliTextActionPerformed
        yearPeliText.setText("");
    }//GEN-LAST:event_yearPeliTextActionPerformed

    private void dirPeliTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dirPeliTextActionPerformed
        dirPeliText.setText("");
    }//GEN-LAST:event_dirPeliTextActionPerformed

    private void titPeliTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_titPeliTextActionPerformed
        titPeliText.setText("");
    }//GEN-LAST:event_titPeliTextActionPerformed

    private void asignarSalaButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_asignarSalaButtonActionPerformed
        String  nPeli = tPText.getText();
        NodoPelicula peli = sucursal.getListaPelis().buscarPelicula(nPeli);
        NodoSalas sala = sucursal.asociarSalasPeliculas(nPeli);
        if(sala==null){JOptionPane.showMessageDialog(rootPane, "No hay salas disponibles en este momento");}
        verPeliPanel.setVisible(false);
        boletosLabel.setText("Boletos Disponibles: "+ sucursal.boletosDisponibles());
    }//GEN-LAST:event_asignarSalaButtonActionPerformed

    private void numSalaTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_numSalaTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_numSalaTextActionPerformed

    private void agSalasButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_agSalasButtonActionPerformed
        agSalaPanel.setVisible(true);
        verSalaPanel.setVisible(false);
        acAgSalaButton.setVisible(true);
        acModSalasButton.setVisible(false);
    }//GEN-LAST:event_agSalasButtonActionPerformed

    private void acAgSalaButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_acAgSalaButtonActionPerformed
        NodoPelicula peli; 
        if(!"Ninguna".equals((String)agSalaPelisCombo.getSelectedItem()))
        {   peli = sucursal.getListaPelis().buscarPelicula((String)agSalaPelisCombo.getSelectedItem());}
        else{peli = null;}
        
        if(sucursal.getListaSalas().buscarPorNumero(sucursal.getListaSalas().getCabeza(), Integer.parseInt(numSalaText.getText()))!=null)
        { JOptionPane.showMessageDialog(rootPane, "Esta Sala ya se encuentra en la Lista. Intente cambiar el numero");}
        else
        {   sucursal.getListaSalas().agregarSala(Integer.parseInt(numSalaText.getText()), (String)agSalasFormCombo.getSelectedItem(), Integer.parseInt(capSalaText.getText()), peli);
            modelo.addElement((String)numSalaText.getText());
            if(peli!=null)
            {   NodoSalas auxSala = sucursal.getListaSalas().buscarPorNumero(sucursal.getListaSalas().getCabeza(), Integer.parseInt(numSalaText.getText()));
                sucursal.crearBoletosAlAgregarPeli(auxSala);
            }
        }
        agSalaPanel.setVisible(false);
        numSalaText.setText(null);
        capSalaText.setText(null);
    }//GEN-LAST:event_acAgSalaButtonActionPerformed

    private void agSalasFormComboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_agSalasFormComboActionPerformed
        NodoPelicula peli = sucursal.getListaPelis().getCabeza();
        agSalaPelisCombo.removeAllItems();
        agSalaPelisCombo.addItem("Ninguna");
        if(peli!=null)
        {   do 
            {   if(peli.getFormato().equals((String)agSalasFormCombo.getSelectedItem()) && peli.isEnCartelera())
                {   agSalaPelisCombo.addItem(peli.getTitulo()); }
                peli=peli.getProximo();
            }while(peli!=sucursal.getListaPelis().getCabeza() && peli!=null); 
        }
    }//GEN-LAST:event_agSalasFormComboActionPerformed

    private void modSalasButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modSalasButtonActionPerformed
        if(salasJList.getSelectedValue()!=null)
        {   agSalaPanel.setVisible(true);
            verSalaPanel.setVisible(false);
            acAgSalaButton.setVisible(false);
            acModSalasButton.setVisible(true);
            
            int numSala = Integer.parseInt((String)modelo.getElementAt(salasJList.getSelectedIndex()));
            NodoSalas sala = sucursal.getListaSalas().buscarPorNumero(sucursal.getListaSalas().getCabeza(), numSala);
            
            numSalaText.setText(String.valueOf(sala.getNumero()));
            capSalaText.setText(String.valueOf(sala.getCapacidad()));
            agSalasFormCombo.setSelectedItem(sala.getFormato());
            if(sala.getPelicula()!=null){agSalaPelisCombo.setSelectedItem(sala.getPelicula().getTitulo());}
            else{agSalaPelisCombo.setSelectedItem("Ninguna");}
        }
        
    }//GEN-LAST:event_modSalasButtonActionPerformed

    private void comprarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comprarButtonActionPerformed
        modeloAsientos.removeAllElements();
        
        jDialog1.setVisible(true);
        
        int numSala = Integer.parseInt((String)modelo.getElementAt(salasJList.getSelectedIndex()));
        NodoSalas sala = sucursal.getListaSalas().buscarPorNumero(sucursal.getListaSalas().getCabeza(), numSala);
        NodoAsientos asiento = sala.getAsientos().peek();
        
        while(asiento!=null)
        {   if(asiento.isOcupado()){modeloAsientos.addElement("X");}
            else { modeloAsientos.addElement(String.valueOf(asiento.getNumero()));}
            asiento=asiento.getProximo();
        }
                                                    
    }//GEN-LAST:event_comprarButtonActionPerformed

    private void acModSalasButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_acModSalasButtonActionPerformed
        int numSala = Integer.parseInt((String)modelo.getElementAt(salasJList.getSelectedIndex()));
        NodoSalas sala = sucursal.getListaSalas().buscarPorNumero(sucursal.getListaSalas().getCabeza(), numSala);
        
        NodoPelicula peli; 
        if(!"Ninguna".equals((String)agSalaPelisCombo.getSelectedItem()))
        {   peli = sucursal.getListaPelis().buscarPelicula((String)agSalaPelisCombo.getSelectedItem());}
        else{peli = null;}
        
        if(peli!=sala.getPelicula())
        {   sala.setCapacidad(Integer.parseInt(capSalaText.getText()));
            sucursal.crearBoletosAlAgregarPeli(sala);
        }
        
        sala.modificar((String)agSalasFormCombo.getSelectedItem(), Integer.parseInt(numSalaText.getText()), Integer.parseInt(capSalaText.getText()), peli);
        modelo.remove(salasJList.getSelectedIndex());
        modelo.addElement(numSalaText.getText());
        
        agSalaPanel.setVisible(false);
        numSalaText.setText(null);
        capSalaText.setText(null);
    }//GEN-LAST:event_acModSalasButtonActionPerformed

    private void verSalasButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_verSalasButtonActionPerformed
        if(salasJList.getSelectedValue()!=null){
        verSalaPanel.setVisible(true);  
        int numSala = Integer.parseInt((String)modelo.getElementAt(salasJList.getSelectedIndex()));
        NodoSalas sala = sucursal.getListaSalas().buscarPorNumero(sucursal.getListaSalas().getCabeza(), numSala);
        
        numSalaLabel.setText("Numero: "+ numSala);
        capSalaLabel.setText("Capacidad: " + String.valueOf(sala.getCapacidad()));
        asSalaLabel.setText("Asientos Disponibles: " + String.valueOf(sala.contarAsientosDisponibles()));
        
        if(sala.getPelicula()!=null)
        {   peliSalaLabel.setText("Pelicula: " + sala.getPelicula().getTitulo());
            dispSalaLabel.setText("No esta disponible");
            comprarButton.setVisible(true);
        }else
        {   peliSalaLabel.setText("Pelicula: -- " );
            dispSalaLabel.setText("Esta disponible");
        }
        }
    }//GEN-LAST:event_verSalasButtonActionPerformed

    private void desasosSalaButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_desasosSalaButtonActionPerformed
        String  nPeli = titPeliText.getText();
        NodoPelicula peli = sucursal.getListaPelis().buscarPelicula(nPeli);
        NodoSalas sala = sucursal.desasociarSalasPeliculasSegunPelicula(nPeli);
        verPeliPanel.setVisible(false);
    }//GEN-LAST:event_desasosSalaButtonActionPerformed

    private void atrasButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_atrasButtonActionPerformed
        Panel2.setVisible(false);
        Panel1.setVisible(true);
    }//GEN-LAST:event_atrasButtonActionPerformed

    private void SalirButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SalirButtonActionPerformed
        if(JOptionPane.showConfirmDialog(rootPane, "Desea guardar los cambios en el sistema?", "", JOptionPane.OK_CANCEL_OPTION)==JOptionPane.OK_OPTION)
        {   try {
            archivo.crearArchivoLista(cu.getArbol());
            System.exit(0);
        } catch (Exception ex) {
            System.out.println("Error creando: "+ex.getMessage());
        }
        }
    }//GEN-LAST:event_SalirButtonActionPerformed

    private void comprar2ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comprar2ButtonActionPerformed
        if(asientosJList.getSelectedValue()!=null){
        if(salasPanel.isVisible())
        {   int numSala = Integer.parseInt((String)modelo.getElementAt(salasJList.getSelectedIndex()));
            NodoSalas sala = sucursal.getListaSalas().buscarPorNumero(sucursal.getListaSalas().getCabeza(), numSala);
        
            int x = Integer.parseInt((String)modeloAsientos.getElementAt(asientosJList.getSelectedIndex())); 
            sucursal.comprarBoleto(sala, x);
        }
        
        else if (pelisPanel.isVisible())
        {    NodoPelicula peli = sucursal.getListaPelis().buscarPelicula((String) pelisJList.getSelectedValue());
             NodoSalas sala = sucursal.getListaSalas().buscarPorPelicula(sucursal.getListaSalas().getCabeza(), (String) pelisJList.getSelectedValue());
       
            int x = Integer.parseInt((String)modeloAsientos.getElementAt(asientosJList.getSelectedIndex())); 
            sucursal.comprarBoleto(sala, x);

        }
        boletosLabel.setText("Boletos Disponibles: "+ sucursal.boletosDisponibles()); 
        jDialog1.setVisible(false);}
    }//GEN-LAST:event_comprar2ButtonActionPerformed

    private void nuevoNombreSucActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nuevoNombreSucActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nuevoNombreSucActionPerformed

    private void acModSucButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_acModSucButtonActionPerformed
        
            sucursal.setNombre(nuevoNombreSuc.getText());
            sucursal.setDir(nuevaDirSuc.getText());
            
            sucLabel.setText(sucursal.getNombre());
            dirLabel.setText("Direccion: "+ sucursal.getDir());
            
            nuevoNombreSuc.setText(null);
            nuevaDirSuc.setText(null);
            
            modSucursalDialog.setVisible(false);
    }//GEN-LAST:event_acModSucButtonActionPerformed

    private void SalirButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SalirButton2ActionPerformed
          if(JOptionPane.showConfirmDialog(rootPane, "Desea guardar los cambios en el sistema?", "", JOptionPane.OK_CANCEL_OPTION)==JOptionPane.OK_OPTION)
        {   try {
            archivo.crearArchivoLista(cu.getArbol());
            System.exit(0);
        } catch (Exception ex) {
            System.out.println("Error creando: "+ex.getMessage());
        }
        }
    }//GEN-LAST:event_SalirButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(PPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Panel1;
    private javax.swing.JPanel Panel2;
    private javax.swing.JButton SalirButton;
    private javax.swing.JButton SalirButton2;
    private javax.swing.JButton acAgPeliButton;
    private javax.swing.JButton acAgSalaButton;
    private javax.swing.JButton acModPeliButton;
    private javax.swing.JButton acModSalasButton;
    private javax.swing.JButton acModSucButton;
    private javax.swing.JButton acPaisButton;
    private javax.swing.JButton acSucurButton;
    private javax.swing.JButton agPaisButton;
    private javax.swing.JPanel agPaisPanel;
    private javax.swing.JButton agPeliButton;
    private javax.swing.JPanel agPeliPanel;
    private javax.swing.JPanel agSalaPanel;
    private javax.swing.JComboBox agSalaPelisCombo;
    private javax.swing.JButton agSalasButton;
    private javax.swing.JComboBox agSalasFormCombo;
    private javax.swing.JPanel agSucPanel;
    private javax.swing.JButton agSucursalButton;
    private javax.swing.JLabel asSalaLabel;
    private javax.swing.JList asientosJList;
    private DefaultListModel modeloAsientos;
    private javax.swing.JButton asignarSalaButton;
    private javax.swing.JButton atrasButton;
    private javax.swing.JLabel boletosLabel;
    private javax.swing.JLabel capSalaLabel;
    private javax.swing.JTextField capSalaText;
    private javax.swing.JButton cerrarSucursalButton;
    private javax.swing.JComboBox comboPaises;
    private javax.swing.JComboBox comboSucursales;
    private javax.swing.JButton comprar2Button;
    private javax.swing.JButton comprarBButton;
    private javax.swing.JButton comprarButton;
    private javax.swing.JLabel dPText;
    private javax.swing.JButton desasosSalaButton;
    private javax.swing.JLabel dirLabel;
    private javax.swing.JTextField dirPeliText;
    private javax.swing.JTextField dirSucText;
    private javax.swing.JLabel dispSalaLabel;
    private javax.swing.JLabel eCText;
    private javax.swing.JButton elimPeliButton;
    private javax.swing.JCheckBox enCarteleraBox;
    private javax.swing.JLabel fPText;
    private javax.swing.JLabel fondo;
    private javax.swing.JLabel fondo2;
    private javax.swing.JComboBox formatoCombo;
    private javax.swing.JButton jButton1;
    private javax.swing.JDialog jDialog1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JLayeredPane jLayeredPane2;
    private javax.swing.JLayeredPane jLayeredPane3;
    private javax.swing.JLayeredPane jLayeredPane4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JButton modPeliButton;
    private javax.swing.JButton modSalasButton;
    private javax.swing.JDialog modSucursalDialog;
    private javax.swing.JButton mostrarSucursal;
    private javax.swing.JTextField nombreSucText;
    private javax.swing.JTextField nuevaDirSuc;
    private javax.swing.JTextField nuevoNombreSuc;
    private javax.swing.JLabel numSalaLabel;
    private javax.swing.JTextField numSalaText;
    private javax.swing.JLabel paisLabel;
    private javax.swing.JTextField paisText;
    private javax.swing.JLabel peliSalaLabel;
    private javax.swing.JList pelisJList;
    private DefaultListModel modeloPeli;
    private javax.swing.JPanel pelisPanel;
    private javax.swing.JList salasJList;
    private DefaultListModel modelo;
    private javax.swing.JPanel salasPanel;
    private javax.swing.JLabel sucLabel;
    private javax.swing.JTabbedPane sucTabbedPane;
    private javax.swing.JLabel tPText;
    private javax.swing.JTextField titPeliText;
    private javax.swing.JButton verPeliButton;
    private javax.swing.JPanel verPeliPanel;
    private javax.swing.JPanel verSalaPanel;
    private javax.swing.JButton verSalasButton;
    private javax.swing.JLabel yPText;
    private javax.swing.JTextField yearPeliText;
    // End of variables declaration//GEN-END:variables
}
