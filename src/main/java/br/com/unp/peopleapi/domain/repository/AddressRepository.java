package br.com.unp.peopleapi.domain.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.unp.peopleapi.domain.model.Address;

public interface AddressRepository extends JpaRepository<Address, Long> {

    List<Address> findByPersonIdAndIsPrimary(Long personId, Boolean isPrimary);

}
