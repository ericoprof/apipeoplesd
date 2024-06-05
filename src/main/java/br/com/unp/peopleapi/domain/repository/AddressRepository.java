package br.com.unp.peopleapi.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.unp.peopleapi.domain.model.Address;

public interface AddressRepository extends JpaRepository<Address, Long> {

}
