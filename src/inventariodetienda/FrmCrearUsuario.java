/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inventariodetienda;

import java.util.ArrayList;
import java.util.Iterator;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JOptionPane;

/**
 *
 * @author alan-
 */

/*
 * La clase FrmCrearUsuario hereda de la clase JFrame que se
 * encuentra en la libreria javax y paquete swing
 */
public class FrmCrearUsuario extends javax.swing.JFrame {

    /*
        Variables miembro de la clase FrmCrearUsuario
     */
    String mNombre;
    String mPass;
    String mCorreo;
    ArrayList<String> mListaRoles;
    
    int mCamposVacios= 0;

    /**
     * Creates new form frmLogin
     */
    public FrmCrearUsuario() {
        initComponents();

        //Agregar a la lista los roles
        lstRoles.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = {"Administrador", "Vendedor", "Acomodador"};

            public int getSize() {
                return strings.length;
            }

            public String getElementAt(int i) {
                return strings[i];
            }
        });
        jScrollPane1.setViewportView(lstRoles);

        this.setLocationRelativeTo(null);

        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlBlanco = new javax.swing.JPanel();
        lblRol = new javax.swing.JLabel();
        lblPass = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        btnGuardar = new javax.swing.JButton();
        btnLimpiar = new javax.swing.JButton();
        txtPass = new javax.swing.JPasswordField();
        lblUsuario1 = new javax.swing.JLabel();
        txtCorreo = new javax.swing.JTextField();
        lblCorreo = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        lstRoles = new javax.swing.JList<>();
        txtTip = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Creacion de Usuarios");
        setName("Inicio de sesion"); // NOI18N

        pnlBlanco.setBackground(new java.awt.Color(255, 255, 255));

        lblRol.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        lblRol.setText("Rol");

        lblPass.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        lblPass.setText("Contraseña");

        txtNombre.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        btnGuardar.setBackground(new java.awt.Color(255, 255, 255));
        btnGuardar.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        btnGuardar.setText("Guardar");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        btnLimpiar.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        btnLimpiar.setText("Limpiar");
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });

        lblUsuario1.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        lblUsuario1.setText("Nombre");

        txtCorreo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        lblCorreo.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        lblCorreo.setText("Correo Electronico");

        jScrollPane1.setViewportView(lstRoles);

        txtTip.setForeground(new java.awt.Color(153, 153, 153));
        txtTip.setText("La contraseña debe se mayor a 5 caracteres, una mayuscula y un numero");

        jLabel1.setForeground(new java.awt.Color(255, 0, 0));
        jLabel1.setText("*");

        jLabel2.setForeground(new java.awt.Color(255, 0, 0));
        jLabel2.setText("*");

        jLabel3.setForeground(new java.awt.Color(255, 0, 0));
        jLabel3.setText("*");

        javax.swing.GroupLayout pnlBlancoLayout = new javax.swing.GroupLayout(pnlBlanco);
        pnlBlanco.setLayout(pnlBlancoLayout);
        pnlBlancoLayout.setHorizontalGroup(
            pnlBlancoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlBlancoLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(pnlBlancoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlBlancoLayout.createSequentialGroup()
                        .addComponent(lblCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtCorreo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(46, 46, 46))
                    .addGroup(pnlBlancoLayout.createSequentialGroup()
                        .addGroup(pnlBlancoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlBlancoLayout.createSequentialGroup()
                                .addComponent(lblUsuario1, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 383, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(pnlBlancoLayout.createSequentialGroup()
                                .addComponent(lblPass)
                                .addGap(75, 75, 75)
                                .addGroup(pnlBlancoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(pnlBlancoLayout.createSequentialGroup()
                                        .addComponent(txtTip)
                                        .addGap(0, 29, Short.MAX_VALUE))
                                    .addComponent(txtPass))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pnlBlancoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18))
                    .addGroup(pnlBlancoLayout.createSequentialGroup()
                        .addComponent(lblRol, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(pnlBlancoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlBlancoLayout.createSequentialGroup()
                                .addGap(40, 40, 40)
                                .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 305, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(pnlBlancoLayout.createSequentialGroup()
                                .addGap(124, 124, 124)
                                .addComponent(btnLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        pnlBlancoLayout.setVerticalGroup(
            pnlBlancoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlBlancoLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(pnlBlancoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlBlancoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblUsuario1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel1))
                .addGap(14, 14, 14)
                .addGroup(pnlBlancoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlBlancoLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblRol, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(107, 107, 107))
                    .addGroup(pnlBlancoLayout.createSequentialGroup()
                        .addGroup(pnlBlancoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlBlancoLayout.createSequentialGroup()
                                .addGap(22, 22, 22)
                                .addGroup(pnlBlancoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lblPass)
                                    .addComponent(txtPass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlBlancoLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel3)
                                .addGap(11, 11, 11)))
                        .addGroup(pnlBlancoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlBlancoLayout.createSequentialGroup()
                                .addGap(1, 1, 1)
                                .addComponent(txtTip)
                                .addGap(18, 18, 18)
                                .addGroup(pnlBlancoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lblCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(pnlBlancoLayout.createSequentialGroup()
                                .addGap(31, 31, 31)
                                .addComponent(jLabel2)))
                        .addGroup(pnlBlancoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlBlancoLayout.createSequentialGroup()
                                .addGap(48, 48, 48)
                                .addComponent(btnLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(26, 26, 26)
                                .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlBlancoLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(58, 58, 58))))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlBlanco, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(pnlBlanco, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /* 
        El metodo para el boton guardar invoca a 3 metodos: obtenerTexto, guardar y limpiarCampos
     */
    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        // TODO add your handling code here:
        this.obtenerTexto();
        
        
        //Agregamos la validacion de los campos obligatorios
        if (mCamposVacios == 0) {
            
            boolean esValida = passValida();
            if (esValida) {

                //Usuario debe ser único
                boolean esUnico = usuarioEsUnico();
                
                if (esUnico) {
                    this.guardar();
                    this.limpiarCampos();
                } else {
                    JOptionPane.showMessageDialog(this, "El usuario que ingresó ya existe. Intente con otro nombre.");
                }
                
            }
        } else {
            JOptionPane.showMessageDialog(this, "Debe llenar todos los campos obligatorios para poder guardar");
        }

    }//GEN-LAST:event_btnGuardarActionPerformed

    /*
        Boton limpiar invoca 1 metodo: limpiarCampos
     */
    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        // TODO add your handling code here:
        this.limpiarCampos();
    }//GEN-LAST:event_btnLimpiarActionPerformed

    public boolean usuarioEsUnico() {
        
        boolean esUnico = true;

        //Realizamos la busqueda del nombre en el arreglo que tiene los roles
        Iterator<Usuario> iterador = frmLogin.mListaDeUsuarios.iterator();

        //Usamos un ciclo while para comprobar que el iterador tenga un siguiente objeto
        while (iterador.hasNext()) {

            //Le asignamos la variable rol para el el iterador deposite lo que tiene en la posicion
            Usuario usuario = iterador.next();

            //Comparamos si el nombre de ese rol es igual al parametro rol, que al final contiene el nombre que ingresamos en el form que queremos buscar
            if (usuario.getNombre().equals(mNombre)) {

                //No es unico, porque se encontró
                esUnico = false;
            }
        }
        
        return esUnico;
    }
    /*
        Metodo que obtiene: nombre,contraseña,correo electronico y roles de un usuario
     */
    public void obtenerTexto() {
        mCamposVacios=0;
        //Validar que el campo nombre no este vacio
        mNombre = txtNombre.getText();
        if (mNombre.equals("")) {
            
            mCamposVacios++;
        }
        //Validar que campo contraseña no esté vacia
        mPass = txtPass.getText();
        if (mPass.equals("")) {
            
            mCamposVacios++;
        }
        //Correo es opcional, entonces no validamos si está vacia
        mCorreo = txtCorreo.getText();
        if (mCorreo.equals("")) {
            mCamposVacios++;
        }
        mListaRoles= new ArrayList();

        Object sel = null;

        int[] selectedIndex = this.lstRoles.getSelectedIndices();

        for (int i = 0; i < selectedIndex.length; i++) {
            sel = lstRoles.getModel().getElementAt(selectedIndex[i]);
            if (sel.equals("Administrador")) {
                
                mListaRoles.add("Adminisitrador");
            }

            if (sel.equals("Vendedor")) {
                
                mListaRoles.add("Vendedor");
            }

            if (sel.equals("Acomodador")) {
                
                mListaRoles.add("Acomodador");
            }
        }

    }
public boolean passValida() {
        
        boolean esValida = true;

        //Contraseña sea mayor a 5 caracteres
        if (mPass.length() < 5) {
            
            JOptionPane.showMessageDialog(this, "La Contraseña debe ser mayor a 5 caracteres.");
            esValida = false;
        }

        //Contraseña debe tener al menos una letra mayuscula y un digito (no importando el orden)
        //Credito de la expresión regular: https://riptutorial.com/regex/example/18996/a-password-containing-at-least-1-uppercase--1-lowercase--1-digit--1-special-character-and-have-a-length-of-at-least-of-10
        //Material de apoyo: http://puntocomnoesunlenguaje.blogspot.com/2013/07/ejemplos-expresiones-regulares-java-split.html
        if (!(mPass.matches("^(?=.*[A-Z])(?=.*[0-9]).*$"))) {
            JOptionPane.showMessageDialog(this, "La Contraseña debe tener, al menos, una letra mayuscula y un número");
            esValida = false;
            
        }
        
        return esValida;
    }
    /*
        Metodo que crea un nuevo objeto de la clase Rol. 
     */
    public void guardar() {

//        Rol nuevoRol = new Rol();
//
//        //Agregamos el objeto a la lista de roles
//        frmLogin.mListaDeRoles.add(nuevoRol);
//
//        JOptionPane.showMessageDialog(this, "Se guardó el rol con nombre " + mNombre + " exitosamente.");

          Usuario nuevoUsuario = new Usuario();
          
          nuevoUsuario.setNombre(mNombre);
          nuevoUsuario.setPass(mPass);
          nuevoUsuario.setCorreoElectronico(mCorreo);
          nuevoUsuario.setListaRoles(mListaRoles);
          
          //Agregar el objeto a la lista de usuario
          
          frmLogin.mListaDeUsuarios.add(nuevoUsuario);
          JOptionPane.showMessageDialog(this, "Se guardó el usuario con nombre " + mNombre + " exitosamente.");

    }

    /*
       Metodo que limpia el formulario 
     */
    public void limpiarCampos() {

        this.txtNombre.setText("");
        this.txtPass.setText("");
        this.txtCorreo.setText("");

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
            java.util.logging.Logger.getLogger(FrmCrearUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmCrearUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmCrearUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmCrearUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmCrearUsuario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblCorreo;
    private javax.swing.JLabel lblPass;
    private javax.swing.JLabel lblRol;
    private javax.swing.JLabel lblUsuario1;
    private javax.swing.JList<String> lstRoles;
    private javax.swing.JPanel pnlBlanco;
    private javax.swing.JTextField txtCorreo;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JPasswordField txtPass;
    private javax.swing.JLabel txtTip;
    // End of variables declaration//GEN-END:variables
}
