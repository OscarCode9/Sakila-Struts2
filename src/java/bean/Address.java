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
public class Address {

    private int address_id;
    private String address;
    private String address2;
    private String district;
    private int city_id;
    private String postal_code;

    public void setAddress_id(int address_id) {
        this.address_id = address_id;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setAddress2(String address2) {
        this.address2 = address2;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public void setCity_id(int city_id) {
        this.city_id = city_id;
    }

    public void setPostal_code(String postal_code) {
        this.postal_code = postal_code;
    }
    

    public int getAddress_id() {
        return address_id;
    }

    public String getAddress() {
        return address;
    }

    public String getAddress2() {
        return address2;
    }

    public String getDistrict() {
        return district;
    }

    public int getCity_id() {
        return city_id;
    }

    public String getPostal_code() {
        return postal_code;
    }

}
