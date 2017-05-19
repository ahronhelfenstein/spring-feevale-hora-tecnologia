package br.feevale.horatecnologia.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;

import br.feevale.horatecnologia.entity.PessoaEntity;
import br.feevale.horatecnologia.repository.dto.PessoaTesteDTO;

/**
 *
 * @author Ahron Henrique Helfenstein <ahron.helfenstein@cwi.com.br>
 */
public interface PessoaRepository extends PagingAndSortingRepository<PessoaEntity, Long> {

    public List<PessoaTesteDTO> findAllByNative();

    public List<PessoaEntity> findByNome(String nome);

    @Query("select p from PessoaEntity p where nome like %:nome%")
    public List<PessoaEntity> findByNomeLike(@Param("nome") String nome);

}
