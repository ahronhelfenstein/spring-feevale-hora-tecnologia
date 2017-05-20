package br.feevale.horatecnologia.entity;

import java.io.Serializable;
import java.time.LocalDateTime;

import javax.persistence.ColumnResult;
import javax.persistence.ConstructorResult;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedNativeQuery;
import javax.persistence.SqlResultSetMapping;
import javax.persistence.Table;

import br.feevale.horatecnologia.repository.dto.PessoaTesteDTO;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

/**
 *
 * @author Ahron Henrique Helfenstein <ahron.helfenstein@cwi.com.br>
 */
@Entity
@Table(name = "pessoa")
@Getter
@Setter
public class PessoaEntity implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String nome;

    private String cpf;

    private LocalDateTime createdDate = LocalDateTime.now();

}
