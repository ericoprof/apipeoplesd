package br.com.unp.peopleapi.assembler;

import java.util.List;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

import br.com.unp.peopleapi.api.model.AddressInputDTO;
import br.com.unp.peopleapi.api.model.AddressOutDTO;
import br.com.unp.peopleapi.domain.model.Address;
import lombok.AllArgsConstructor;

@AllArgsConstructor
@Component
public class AddressAssembler {

    private ModelMapper modelMapper;

    public Address toAddress(final AddressInputDTO addressInputDTO) {
        return modelMapper.map(addressInputDTO, Address.class);
    }

    public AddressOutDTO toDto(final Address address) {
        return modelMapper.map(address, AddressOutDTO.class);
    }

    public List<AddressOutDTO> toCollectionDto(final List<Address> addresses) {
        return addresses.stream().map(this::toDto).collect(Collectors.toList());
    }

}
