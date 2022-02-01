package com.letscode.sort;

import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;

@Getter
@Builder
@ToString
@EqualsAndHashCode
public class Estudante implements Comparable<Estudante> {

    private String nome;
    private int idade;
    private String turma;
    private int rank;

    @Override
    public int compareTo(Estudante estudante) {
        int nomeCompare = nome.compareTo(estudante.nome);
        if (nomeCompare != 0) {
            return nomeCompare;
        }

        int idadeCompare = Integer.compare(idade, estudante.idade); //idade - estudante.idade
        if (idadeCompare != 0) {
            return idadeCompare;
        }
        return turma.compareTo(estudante.turma);
    }
}
