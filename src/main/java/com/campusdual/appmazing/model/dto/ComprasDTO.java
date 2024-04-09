package com.campusdual.appmazing.model.dto;

import com.campusdual.appmazing.model.Contacto;
import com.campusdual.appmazing.model.Product;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

public class ComprasDTO {

    private int id;

    private ContactDTO contacto;

    private List<ProductDTO> productos;

    private int cantidad;

    private Date fechaCompra;

    private Boolean pagado;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public List<ProductDTO> getProductos() {
        return productos;
    }

    public void setProductos(List<ProductDTO> productos) {
        this.productos = productos;
    }

    public ContactDTO getContacto() {
        return contacto;
    }

    public void setContacto(ContactDTO contacto) {
        this.contacto = contacto;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public Date getFechaCompra() {
        return fechaCompra;
    }

    public void setFechaCompra(Date fechaCompra) {
        this.fechaCompra = fechaCompra;
    }

    public Boolean getPagado() {
        return pagado;
    }

    public void setPagado(Boolean pagado) {
        this.pagado = pagado;
    }
}
