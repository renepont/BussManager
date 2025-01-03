package com.renepont.bussmanager.service.mapper;

import com.renepont.bussmanager.domain.Company;
import com.renepont.bussmanager.domain.Employee;
import com.renepont.bussmanager.service.dto.CompanyDTO;
import com.renepont.bussmanager.service.dto.EmployeeDTO;
import org.mapstruct.*;

/**
 * Mapper for the entity {@link Employee} and its DTO {@link EmployeeDTO}.
 */
@Mapper(componentModel = "spring")
public interface EmployeeMapper extends EntityMapper<EmployeeDTO, Employee> {
    @Mapping(target = "company", source = "company", qualifiedByName = "companyId")
    EmployeeDTO toDto(Employee s);

    @Named("companyId")
    @BeanMapping(ignoreByDefault = true)
    @Mapping(target = "id", source = "id")
    CompanyDTO toDtoCompanyId(Company company);
}
