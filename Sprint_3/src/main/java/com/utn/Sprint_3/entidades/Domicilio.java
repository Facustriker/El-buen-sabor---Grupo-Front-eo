package com.utn.Sprint_3.entidades;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Domicilio extends BaseEntidad {

    private String calle;
    private String numero;
    private String localidad;
    @ManyToOne(cascade= CascadeType.ALL)
    @JoinColumn(name = "cliente-id")
    private Cliente cliente;

    public void mostrarDomicilios() {
        System.out.println("Domicilios de " + cliente.getNombre() + " " + cliente.getApellido() + ":");
        System.out.println("Calle: "+ calle);
        System.out.println("Numero: "+ numero);
        System.out.println("Localidad: "+ localidad);
    }
}
