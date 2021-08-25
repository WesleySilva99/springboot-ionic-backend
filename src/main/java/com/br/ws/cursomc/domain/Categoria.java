package com.br.ws.cursomc.domain;

import lombok.*;

import java.io.Serializable;
import java.util.Objects;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Categoria implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer id;
    private String nome;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Categoria categoria = (Categoria) o;
        return Objects.equals(id, categoria.id) && nome.equals(categoria.nome);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
