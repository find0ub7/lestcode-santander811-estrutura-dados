package com.letscode.sort;

import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;

import java.io.Serial;
import java.io.Serializable;

@Getter
@Builder
@ToString
@EqualsAndHashCode
public class Estudante {

//public class Estudante implements Comparable<Estudante>, Serializable {

    protected String nome;
    protected int idade;
    protected String turma;
    protected int rank;

//    @Override
//    public int compareTo(Estudante estudante) {
//        int nomeCompare = nome.compareTo(estudante.nome);
//        if (nomeCompare != 0) {
//            return nomeCompare;
//        }
//
//        int idadeCompare = Integer.compare(idade, estudante.idade); //idade - estudante.idade
//        if (idadeCompare != 0) {
//            return idadeCompare;
//        }
//        return turma.compareTo(estudante.turma);
//    }
}
