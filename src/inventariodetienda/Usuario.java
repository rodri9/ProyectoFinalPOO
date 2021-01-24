/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inventariodetienda;

import java.util.ArrayList;

/**
 *
 * @author alan-
 */
public class Usuario {
    
    private String mNombre;
    private String mPass;
    private String mCorreoElectronico;
    private ArrayList<String> mListaRoles = new ArrayList();
   

    /**
     * @return the mNombre
     */
    public String getNombre() {
        return mNombre;
    }

    /**
     * @param mNombre the mNombre to set
     */
    public void setNombre(String mNombre) {
        this.mNombre = mNombre;
    }

    /**
     * @return the mPass
     */
    public String getPass() {
        return mPass;
    }

    /**
     * @param mPass the mPass to set
     */
    public void setPass(String mPass) {
        this.mPass = mPass;
    }

    /**
     * @return the mCorreoElectronico
     */
    public String getCorreoElectronico() {
        return mCorreoElectronico;
    }

    /**
     * @param mCorreoElectronico the mCorreoElectronico to set
     */
    public void setCorreoElectronico(String mCorreoElectronico) {
        this.mCorreoElectronico = mCorreoElectronico;
    }

    /**
     * @return the mListaRoles
     */
    public ArrayList<String> getListaRoles() {
        return mListaRoles;
    }

    /**
     * @param pListaRoles the mListaRoles to set
     */
    public void setListaRoles(ArrayList<String> pListaRoles) {
        this.mListaRoles = pListaRoles;
    }

    
}
