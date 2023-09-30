package com.utn.Sprint_3.entidades;

import com.utn.Sprint_3.enumeraciones.FormaDePago;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.util.Date;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Factura extends BaseEntidad {

    private int numero;
    private Date fecha;
    private double descuento;
    private FormaDePago formaPago;
    private int total;
}
