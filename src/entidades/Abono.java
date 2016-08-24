package entidades;
// Generated 24-08-2016 0:10:16 by Hibernate Tools 4.3.1


import java.util.Date;

/**
 * Abono generated by hbm2java
 */
public class Abono  implements java.io.Serializable {


     private Integer idAbono;
     private Cliente cliente;
     private Date fechaAbono;
     private Integer saldoAbono;
     private Integer montoAbono;

    public Abono() {
    }

	
    public Abono(Cliente cliente) {
        this.cliente = cliente;
    }
    public Abono(Cliente cliente, Date fechaAbono, Integer saldoAbono, Integer montoAbono) {
       this.cliente = cliente;
       this.fechaAbono = fechaAbono;
       this.saldoAbono = saldoAbono;
       this.montoAbono = montoAbono;
    }
   
    public Integer getIdAbono() {
        return this.idAbono;
    }
    
    public void setIdAbono(Integer idAbono) {
        this.idAbono = idAbono;
    }
    public Cliente getCliente() {
        return this.cliente;
    }
    
    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
    public Date getFechaAbono() {
        return this.fechaAbono;
    }
    
    public void setFechaAbono(Date fechaAbono) {
        this.fechaAbono = fechaAbono;
    }
    public Integer getSaldoAbono() {
        return this.saldoAbono;
    }
    
    public void setSaldoAbono(Integer saldoAbono) {
        this.saldoAbono = saldoAbono;
    }
    public Integer getMontoAbono() {
        return this.montoAbono;
    }
    
    public void setMontoAbono(Integer montoAbono) {
        this.montoAbono = montoAbono;
    }




}


