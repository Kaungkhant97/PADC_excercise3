package com.kaungkhantthu.padcexercise3;

/**
 * Created by kaungkhantthu on 7/1/16.
 */
public class jobVO {
    private String title;
    private String company;
    private String country;
    private int     icon;
    private String jobDate;

    public jobVO(String title, String company, String country, int icon, String jobDate) {
        this.title = title;
        this.company = company;
        this.country = country;
        this.icon = icon;
        this.jobDate = jobDate;
    }

    public String getTitle() {
        return title;
    }

    public String getCompany() {
        return company;
    }

    public String getCountry() {
        return country;
    }

    public int getIcon() {
        return icon;
    }

    public String getJobDate() {
        return jobDate;
    }
}
