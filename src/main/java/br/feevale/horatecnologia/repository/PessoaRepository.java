package br.feevale.horatecnologia.repository;

import br.feevale.horatecnologia.entity.PessoaEntity;
import org.springframework.data.repository.PagingAndSortingRepository;

/**
 *
 * @author Ahron Henrique Helfenstein <ahron.helfenstein@cwi.com.br>
 */
public interface PessoaRepository extends PagingAndSortingRepository<PessoaEntity, Long> {

}
