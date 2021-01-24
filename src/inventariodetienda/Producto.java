/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inventariodetienda;


/**
 *
 * @author alan-
 */
public class Producto {
    
    private String mNombre;
    
    private Double mCosto;
    private Double mPrecio;
    private int mEnStock;
    

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
     * @return the mCosto
     */
    public Double getCosto() {
        return mCosto;
    }

    /**
     * @param mCosto the mCosto to set
     */
    public void setCosto(Double mCosto) {
        this.mCosto = mCosto;
    }

    /**
     * @return the mPrecio
     */
    public Double getPrecio() {
        return mPrecio;
    }

    /**
     * @param mPrecio the mPrecio to set
     */
    public void setPrecio(Double mPrecio) {
        this.mPrecio = mPrecio;
    }

    /**
     * @return the mEnStock
     */
    public Integer getEnStock() {
        return mEnStock;
    }

    /**
     * @param mEnStock the mEnStock to set
     */
    public void setEnStock(Integer mEnStock) {
        this.mEnStock = mEnStock;
    }

    
           
    
}
