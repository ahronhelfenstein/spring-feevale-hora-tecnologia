/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.feevale.horatecnologia.repository;

import br.feevale.horatecnologia.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author ahelfenstein
 */
public interface UserRepository extends JpaRepository<UserEntity, Long> {

    UserEntity findByUsername(String username);
}
