package br.feevale.horatecnologia.entity;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Data;

/**
 *
 * @author Ahron Henrique Helfenstein <ahron.helfenstein@cwi.com.br>
 */
@Entity
@Table(name = "pessoa")
@Data
public class PessoaEntity implements Serializable {

    @Id
    private Long id;

    private String nome;

}
