package entidades;
// Generated 23-08-2016 22:12:21 by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;

/**
 * Cliente generated by hbm2java
 */
public class Cliente  implements java.io.Serializable {


     private Integer idCliente;
     private String nombreCliente;
     private String apellidoCliente;
     private String rutCliente;
     private String telefonoCliente;
     private String direccionCliente;
     private String referenciaCliente;
     private Boolean morosoCliente;
     private Boolean activoCliente;
     private Integer totalcomprasCliente;
     private Integer totalabonoCliente;
     private Integer numeroCliente;
     private Set abonos = new HashSet(0);
     private Set ventas = new HashSet(0);

    public Cliente() {
    }

    public Cliente(String nombreCliente, String apellidoCliente, String rutCliente, String telefonoCliente, String direccionCliente, String referenciaCliente, Boolean morosoCliente, Boolean activoCliente, Integer totalcomprasCliente, Integer totalabonoCliente, Integer numeroCliente, Set abonos, Set ventas) {
       this.nombreCliente = nombreCliente;
       this.apellidoCliente = apellidoCliente;
       this.rutCliente = rutCliente;
       this.telefonoCliente = telefonoCliente;
       this.direccionCliente = direccionCliente;
       this.referenciaCliente = referenciaCliente;
       this.morosoCliente = morosoCliente;
       this.activoCliente = activoCliente;
       this.totalcomprasCliente = totalcomprasCliente;
       this.totalabonoCliente = totalabonoCliente;
       this.numeroCliente = numeroCliente;
       this.abonos = abonos;
       this.ventas = ventas;
    }
   
    public Integer getIdCliente() {
        return this.idCliente;
    }
    
    public void setIdCliente(Integer idCliente) {
        this.idCliente = idCliente;
    }
    public String getNombreCliente() {
        return this.nombreCliente;
    }
    
    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }
    public String getApellidoCliente() {
        return this.apellidoCliente;
    }
    
    public void setApellidoCliente(String apellidoCliente) {
        this.apellidoCliente = apellidoCliente;
    }
    public String getRutCliente() {
        return this.rutCliente;
    }
    
    public void setRutCliente(String rutCliente) {
        this.rutCliente = rutCliente;
    }
    public String getTelefonoCliente() {
        return this.telefonoCliente;
    }
    
    public void setTelefonoCliente(String telefonoCliente) {
        this.telefonoCliente = telefonoCliente;
    }
    public String getDireccionCliente() {
        return this.direccionCliente;
    }
    
    public void setDireccionCliente(String direccionCliente) {
        this.direccionCliente = direccionCliente;
    }
    public String getReferenciaCliente() {
        return this.referenciaCliente;
    }
    
    public void setReferenciaCliente(String referenciaCliente) {
        this.referenciaCliente = referenciaCliente;
    }
    public Boolean getMorosoCliente() {
        return this.morosoCliente;
    }
    
    public void setMorosoCliente(Boolean morosoCliente) {
        this.morosoCliente = morosoCliente;
    }
    public Boolean getActivoCliente() {
        return this.activoCliente;
    }
    
    public void setActivoCliente(Boolean activoCliente) {
        this.activoCliente = activoCliente;
    }
    public Integer getTotalcomprasCliente() {
        return this.totalcomprasCliente;
    }
    
    public void setTotalcomprasCliente(Integer totalcomprasCliente) {
        this.totalcomprasCliente = totalcomprasCliente;
    }
    public Integer getTotalabonoCliente() {
        return this.totalabonoCliente;
    }
    
    public void setTotalabonoCliente(Integer totalabonoCliente) {
        this.totalabonoCliente = totalabonoCliente;
    }
    public Integer getNumeroCliente() {
        return this.numeroCliente;
    }
    
    public void setNumeroCliente(Integer numeroCliente) {
        this.numeroCliente = numeroCliente;
    }
    public Set getAbonos() {
        return this.abonos;
    }
    
    public void setAbonos(Set abonos) {
        this.abonos = abonos;
    }
    public Set getVentas() {
        return this.ventas;
    }
    
    public void setVentas(Set ventas) {
        this.ventas = ventas;
    }




}


