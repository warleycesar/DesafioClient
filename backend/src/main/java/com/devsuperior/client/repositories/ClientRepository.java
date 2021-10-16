//Camada de acesso a dados

package com.devsuperior.client.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.devsuperior.client.entities.Client;

//Registra a interface como um componente injetavel
@Repository
public interface ClientRepository extends JpaRepository<Client, Long> {

}
