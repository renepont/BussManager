package com.renepont.bussmanager.service.mapper;

import com.renepont.bussmanager.domain.Company;
import com.renepont.bussmanager.domain.Customer;
import com.renepont.bussmanager.service.dto.CompanyDTO;
import com.renepont.bussmanager.service.dto.CustomerDTO;
import org.mapstruct.*;

/**
 * Mapper for the entity {@link Customer} and its DTO {@link CustomerDTO}.
 */
@Mapper(componentModel = "spring")
public interface CustomerMapper extends EntityMapper<CustomerDTO, Customer> {
    @Mapping(target = "company", source = "company", qualifiedByName = "companyId")
    CustomerDTO toDto(Customer s);

    @Named("companyId")
    @BeanMapping(ignoreByDefault = true)
    @Mapping(target = "id", source = "id")
    CompanyDTO toDtoCompanyId(Company company);
}
