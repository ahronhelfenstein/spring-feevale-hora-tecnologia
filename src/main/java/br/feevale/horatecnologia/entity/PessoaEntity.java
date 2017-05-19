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

/**
 *
 * @author Ahron Henrique Helfenstein <ahron.helfenstein@cwi.com.br>
 */
@Entity
@Table(name = "pessoa")
@SqlResultSetMapping(
        name = "pessoaNativeDTO",
        classes = {
            @ConstructorResult(
                    targetClass = PessoaTesteDTO.class,
                    columns = {
                        @ColumnResult(name = "id", type = Long.class)
                        ,
                        @ColumnResult(name = "nome", type = String.class)
                    }
            )
        }
)
@NamedNativeQuery(name = "PessoaEntity.findAllByNative", query
        = "select * from pessoa",
        resultSetMapping = "pessoaNativeDTO")

public class PessoaEntity implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String nome;

    private String cpf;

    private LocalDateTime createdDate = LocalDateTime.now();

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public LocalDateTime getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(LocalDateTime createdDate) {
        this.createdDate = createdDate;
    }

}
