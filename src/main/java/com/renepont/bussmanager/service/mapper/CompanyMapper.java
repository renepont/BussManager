package com.renepont.bussmanager.service.mapper;

import com.renepont.bussmanager.domain.Company;
import com.renepont.bussmanager.service.dto.CompanyDTO;
import org.mapstruct.*;

/**
 * Mapper for the entity {@link Company} and its DTO {@link CompanyDTO}.
 */
@Mapper(componentModel = "spring")
public interface CompanyMapper extends EntityMapper<CompanyDTO, Company> {}
