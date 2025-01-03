package com.renepont.bussmanager.domain;

import static com.renepont.bussmanager.domain.CompanyTestSamples.*;
import static com.renepont.bussmanager.domain.EmployeeTestSamples.*;
import static org.assertj.core.api.Assertions.assertThat;

import com.renepont.bussmanager.web.rest.TestUtil;
import org.junit.jupiter.api.Test;

class EmployeeTest {

    @Test
    void equalsVerifier() throws Exception {
        TestUtil.equalsVerifier(Employee.class);
        Employee employee1 = getEmployeeSample1();
        Employee employee2 = new Employee();
        assertThat(employee1).isNotEqualTo(employee2);

        employee2.setId(employee1.getId());
        assertThat(employee1).isEqualTo(employee2);

        employee2 = getEmployeeSample2();
        assertThat(employee1).isNotEqualTo(employee2);
    }

    @Test
    void companyTest() {
        Employee employee = getEmployeeRandomSampleGenerator();
        Company companyBack = getCompanyRandomSampleGenerator();

        employee.setCompany(companyBack);
        assertThat(employee.getCompany()).isEqualTo(companyBack);

        employee.company(null);
        assertThat(employee.getCompany()).isNull();
    }
}
