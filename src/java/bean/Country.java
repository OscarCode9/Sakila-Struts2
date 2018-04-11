/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bean;

/**
 *
 * @author oscarcode
 */
public class Country {
    private int country_id;
    private String country;

    public void setCountry_id(int country_id) {
        this.country_id = country_id;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public int getCountry_id() {
        return country_id;
    }

    public String getCountry() {
        return country;
    }
}
