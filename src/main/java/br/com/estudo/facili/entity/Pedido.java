package br.com.estudo.facili.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table
public class Pedido {

    @Id
    private Long id;

    private String codigo;
    
    public Long getId() {
		return id;
	}
    
    public void setId(Long id) {
		this.id = id;
	}
    
    public String getCodigo() {
		return codigo;
	}
    
    public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
}


