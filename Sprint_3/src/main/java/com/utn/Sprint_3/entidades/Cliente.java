package com.utn.Sprint_3.entidades;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.util.ArrayList;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Cliente extends BaseEntidad {


    private String nombre;
    private String apellido;
    private String telefono;
    private String email;
    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true, fetch = FetchType.EAGER)
    @JoinColumn(name = "cliente_ID")
    @Builder.Default
    private List<Pedido> pedidos = new ArrayList<>();

    public void agregarPedido(Pedido pedido){
        pedidos.add(pedido);
    }

    public void mostrarPedidos() {
        System.out.println("Pedidos de " + nombre + " " + apellido + ":");
        for (Pedido pedidos : pedidos) {
            System.out.println("Estado: " + pedidos.getEstado() +
                    ", Fecha: " + pedidos.getFecha() +
                    ", Tipo de Envio: " + pedidos.getTipoEnvio() +
                    ", Total: " + pedidos.getTotal() +
                    ", Factura: " + pedidos.getFactura());
            pedidos.mostrarDetallesPedidos();
        }

    }

}
