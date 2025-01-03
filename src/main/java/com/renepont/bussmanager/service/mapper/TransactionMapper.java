package com.renepont.bussmanager.service.mapper;

import com.renepont.bussmanager.domain.Company;
import com.renepont.bussmanager.domain.Transaction;
import com.renepont.bussmanager.service.dto.CompanyDTO;
import com.renepont.bussmanager.service.dto.TransactionDTO;
import org.mapstruct.*;

/**
 * Mapper for the entity {@link Transaction} and its DTO {@link TransactionDTO}.
 */
@Mapper(componentModel = "spring")
public interface TransactionMapper extends EntityMapper<TransactionDTO, Transaction> {
    @Mapping(target = "company", source = "company", qualifiedByName = "companyId")
    TransactionDTO toDto(Transaction s);

    @Named("companyId")
    @BeanMapping(ignoreByDefault = true)
    @Mapping(target = "id", source = "id")
    CompanyDTO toDtoCompanyId(Company company);
}
