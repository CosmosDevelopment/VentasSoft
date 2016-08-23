package entidades;
// Generated 22-08-2016 21:51:15 by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;

/**
 * Producto generated by hbm2java
 */
public class Producto  implements java.io.Serializable {


     private Integer idProducto;
     private String nombreProducto;
     private Integer cantidadProducto;
     private Integer precioProducto;
     private Boolean estadoProducto;
     private Set ventas = new HashSet(0);

    public Producto() {
    }

    public Producto(String nombreProducto, Integer cantidadProducto, Integer precioProducto, Boolean estadoProducto, Set ventas) {
       this.nombreProducto = nombreProducto;
       this.cantidadProducto = cantidadProducto;
       this.precioProducto = precioProducto;
       this.estadoProducto = estadoProducto;
       this.ventas = ventas;
    }
   
    public Integer getIdProducto() {
        return this.idProducto;
    }
    
    public void setIdProducto(Integer idProducto) {
        this.idProducto = idProducto;
    }
    public String getNombreProducto() {
        return this.nombreProducto;
    }
    
    public void setNombreProducto(String nombreProducto) {
        this.nombreProducto = nombreProducto;
    }
    public Integer getCantidadProducto() {
        return this.cantidadProducto;
    }
    
    public void setCantidadProducto(Integer cantidadProducto) {
        this.cantidadProducto = cantidadProducto;
    }
    public Integer getPrecioProducto() {
        return this.precioProducto;
    }
    
    public void setPrecioProducto(Integer precioProducto) {
        this.precioProducto = precioProducto;
    }
    public Boolean getEstadoProducto() {
        return this.estadoProducto;
    }
    
    public void setEstadoProducto(Boolean estadoProducto) {
        this.estadoProducto = estadoProducto;
    }
    public Set getVentas() {
        return this.ventas;
    }
    
    public void setVentas(Set ventas) {
        this.ventas = ventas;
    }




}


