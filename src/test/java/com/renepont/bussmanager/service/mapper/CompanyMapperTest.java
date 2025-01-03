package com.renepont.bussmanager.service.mapper;

import static com.renepont.bussmanager.domain.CompanyAsserts.*;
import static com.renepont.bussmanager.domain.CompanyTestSamples.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CompanyMapperTest {

    private CompanyMapper companyMapper;

    @BeforeEach
    void setUp() {
        companyMapper = new CompanyMapperImpl();
    }

    @Test
    void shouldConvertToDtoAndBack() {
        var expected = getCompanySample1();
        var actual = companyMapper.toEntity(companyMapper.toDto(expected));
        assertCompanyAllPropertiesEquals(expected, actual);
    }
}
