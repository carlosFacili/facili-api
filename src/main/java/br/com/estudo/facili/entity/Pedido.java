package br.com.estudo.facili.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Getter
@Setter
@Entity
@Table
public class Pedido {

    @Id
    private Long id;

    private String codigo;
}
