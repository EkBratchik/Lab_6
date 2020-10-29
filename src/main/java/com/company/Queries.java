package com.company;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
public class Queries {
    private final List<Company> companies;

    Queries() {
        this.companies = new ArrayList<>();
    }

    Queries(List<Company> companies) {
        this.companies = new ArrayList<>(companies);
    }

    public void addCompany(Company company) {
        companies.add(company);
    }

    public List<Company> getCompanies() {
        return new ArrayList<>(companies);
    }

    public List<Company> findByShortName(String shortName) {
        List<Company> result = new ArrayList<>();
        for (Company company : companies) {
            if (company.getShortName().toLowerCase().compareTo(shortName.toLowerCase()) == 0) {
                result.add(company);
            }
        }
        return result;
    }

    public List<Company> findByIndustry(String industry) {
        List<Company> result = new ArrayList<>();
        for (Company company : companies) {
            if (company.getIndustry().toLowerCase().compareTo(industry.toLowerCase()) == 0) {
                result.add(company);
            }
        }
        return result;
    }

    public List<Company> findByKindOfActivity(String business) {
        List<Company> result = new ArrayList<>();
        for (Company company : companies) {
            if (company.getKindOfActivity().toLowerCase().compareTo(business.toLowerCase()) == 0) {
                result.add(company);
            }
        }
        return result;
    }

    public List<Company> findByDateOfFoundation(Date from, Date till) {
        Calendar cal = Calendar.getInstance();
        cal.setTime(from);
        cal.add(Calendar.DATE, -1);
        from = cal.getTime();
        cal.setTime(till);
        cal.add(Calendar.DATE, 1);
        till = cal.getTime();
        List<Company> result = new ArrayList<>();
        for (Company company : companies) {
            if (company.getFoundationDate().after(from) && company.getFoundationDate().before(till)) {
                result.add(company);
            }
        }
        return result;
    }

    public List<Company> findByNumberOfEmployees(int min, int max) {
        List<Company> result = new ArrayList<>();
        for (Company company : companies) {
            if (company.getEmployeeNumber() >= min && company.getEmployeeNumber() <= max) {
                result.add(company);
            }
        }
        return result;
    }
}
