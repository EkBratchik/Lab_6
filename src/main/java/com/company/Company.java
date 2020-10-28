package com.company;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Objects;

public class Company {private String name;
    private String shortTitle;
    private Date actualDate;
    private String address;
    private Date foundationDate;
    private Integer employeeNumber;
    private String auditor;
    private String phone;
    private String email;
    private String industry;
    private String kindOfActivity;
    private String URLAddress;

    public Company(String CSVString) throws Exception {
        String[] fields = CSVString.split(";");
        if (fields.length < 12) {
            throw new Exception("error");
        }
        this.name = fields[0];
        this.shortTitle = fields[1];
        this.actualDate = new SimpleDateFormat("dd/MM/yyyy").parse(fields[2]);
        this.address = fields[3];
        this.foundationDate = new SimpleDateFormat("dd/MM/yyyy").parse(fields[4]);
        this.employeeNumber = Integer.parseInt(fields[5]);
        this.auditor = fields[6];
        this.phone = fields[7];
        this.email = fields[8];
        this.industry = fields[9];
        this.kindOfActivity = fields[10];
        this.URLAddress = fields[11];
    }

    public void setName(String name) {
        this.name = name;
    }
    public void setShortTitle(String shortTitle) {
        this.shortTitle = shortTitle;
    }
    public void setActualDate(Date actualDate) {
        this.actualDate = actualDate;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public void setFoundationDate(Date foundationDate) {
        this.foundationDate = foundationDate;
    }
    public void setEmployeeNumber(Integer employeeNumber) {
        this.employeeNumber = employeeNumber;
    }
    public void setAuditor(String auditor) {
        this.auditor = auditor;
    }
    public void setPhone(String phone) {
        this.phone = phone;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public void setIndustry(String industry) {
        this.industry = industry;
    }

    public void setKindOfActivity(String kindOfActivity) {
        this.kindOfActivity = kindOfActivity;
    }

    public void setURLAddress(String URLAddress) {
        this.URLAddress = URLAddress;
    }
    public String getShortName() {
        return shortTitle;
    }
    public Date getActualDate() {
        return actualDate;
    }
    public String getAddress() {
        return address;
    }
    public Date getFoundationDate() {
        return foundationDate;
    }
    public Integer getEmployeeNumber() {
        return employeeNumber;
    }
    public String getAuditor() {
        return auditor;
    }
    public String getPhone() {
        return phone;
    }
    public String getEmail() {
        return email;
    }
    public String getIndustry() {
        return industry;
    }
    public String getKindOfActivity() {
        return kindOfActivity;
    }
    public String getURLAddress() {
        return URLAddress;
    }
    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return name + ";" + shortTitle + ";" + actualDate.toString() + ";" + address + ";" +
                foundationDate.toString() + ";" + employeeNumber.toString() + ";" + auditor + ";" +
                phone + ";" + email + ";" + industry + ";" + kindOfActivity + ";" + URLAddress + ";";
    }

    @Override
    public boolean equals(Object t) {
        if (this == t) return true;
        if (t == null || getClass() != t.getClass()) return false;
        Company company = (Company) t;
        return Objects.equals(name, company.name) &&
                Objects.equals(shortTitle, company.shortTitle) &&
                Objects.equals(actualDate, company.actualDate) &&
                Objects.equals(address, company.address) &&
                Objects.equals(foundationDate, company.foundationDate) &&
                Objects.equals(employeeNumber, company.employeeNumber) &&
                Objects.equals(auditor, company.auditor) &&
                Objects.equals(phone, company.phone) &&
                Objects.equals(email, company.email) &&
                Objects.equals(industry, company.industry) &&
                Objects.equals(kindOfActivity, company.kindOfActivity) &&
                Objects.equals(URLAddress, company.URLAddress);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, shortTitle, actualDate, address, foundationDate, employeeNumber, auditor, phone, email, industry, kindOfActivity, URLAddress);
    }
}
