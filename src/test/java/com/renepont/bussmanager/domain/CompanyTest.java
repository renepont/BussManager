package com.renepont.bussmanager.domain;

import static com.renepont.bussmanager.domain.CompanyTestSamples.*;
import static com.renepont.bussmanager.domain.CustomerTestSamples.*;
import static com.renepont.bussmanager.domain.EmployeeTestSamples.*;
import static com.renepont.bussmanager.domain.TransactionTestSamples.*;
import static org.assertj.core.api.Assertions.assertThat;

import com.renepont.bussmanager.web.rest.TestUtil;
import java.util.HashSet;
import java.util.Set;
import org.junit.jupiter.api.Test;

class CompanyTest {

    @Test
    void equalsVerifier() throws Exception {
        TestUtil.equalsVerifier(Company.class);
        Company company1 = getCompanySample1();
        Company company2 = new Company();
        assertThat(company1).isNotEqualTo(company2);

        company2.setId(company1.getId());
        assertThat(company1).isEqualTo(company2);

        company2 = getCompanySample2();
        assertThat(company1).isNotEqualTo(company2);
    }

    @Test
    void employeeTest() {
        Company company = getCompanyRandomSampleGenerator();
        Employee employeeBack = getEmployeeRandomSampleGenerator();

        company.addEmployee(employeeBack);
        assertThat(company.getEmployees()).containsOnly(employeeBack);
        assertThat(employeeBack.getCompany()).isEqualTo(company);

        company.removeEmployee(employeeBack);
        assertThat(company.getEmployees()).doesNotContain(employeeBack);
        assertThat(employeeBack.getCompany()).isNull();

        company.employees(new HashSet<>(Set.of(employeeBack)));
        assertThat(company.getEmployees()).containsOnly(employeeBack);
        assertThat(employeeBack.getCompany()).isEqualTo(company);

        company.setEmployees(new HashSet<>());
        assertThat(company.getEmployees()).doesNotContain(employeeBack);
        assertThat(employeeBack.getCompany()).isNull();
    }

    @Test
    void transactionTest() {
        Company company = getCompanyRandomSampleGenerator();
        Transaction transactionBack = getTransactionRandomSampleGenerator();

        company.addTransaction(transactionBack);
        assertThat(company.getTransactions()).containsOnly(transactionBack);
        assertThat(transactionBack.getCompany()).isEqualTo(company);

        company.removeTransaction(transactionBack);
        assertThat(company.getTransactions()).doesNotContain(transactionBack);
        assertThat(transactionBack.getCompany()).isNull();

        company.transactions(new HashSet<>(Set.of(transactionBack)));
        assertThat(company.getTransactions()).containsOnly(transactionBack);
        assertThat(transactionBack.getCompany()).isEqualTo(company);

        company.setTransactions(new HashSet<>());
        assertThat(company.getTransactions()).doesNotContain(transactionBack);
        assertThat(transactionBack.getCompany()).isNull();
    }

    @Test
    void customerTest() {
        Company company = getCompanyRandomSampleGenerator();
        Customer customerBack = getCustomerRandomSampleGenerator();

        company.addCustomer(customerBack);
        assertThat(company.getCustomers()).containsOnly(customerBack);
        assertThat(customerBack.getCompany()).isEqualTo(company);

        company.removeCustomer(customerBack);
        assertThat(company.getCustomers()).doesNotContain(customerBack);
        assertThat(customerBack.getCompany()).isNull();

        company.customers(new HashSet<>(Set.of(customerBack)));
        assertThat(company.getCustomers()).containsOnly(customerBack);
        assertThat(customerBack.getCompany()).isEqualTo(company);

        company.setCustomers(new HashSet<>());
        assertThat(company.getCustomers()).doesNotContain(customerBack);
        assertThat(customerBack.getCompany()).isNull();
    }
}
