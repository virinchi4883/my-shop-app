package com.myshop.app.pojo;

import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Address {
    @JsonProperty("street")
    private String street = null;

    @JsonProperty("city")
    private String city = null;

    @JsonProperty("state")
    private String state = null;

    @JsonProperty("zip")
    private String zip = null;

    public Address street(String street) {
        this.street = street;
        return this;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public Address city(String city) {
        this.city = city;
        return this;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public Address state(String state) {
        this.state = state;
        return this;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public Address zip(String zip) {
        this.zip = zip;
        return this;
    }

    public String getZip() {
        return zip;
    }

    public void setZip(String zip) {
        this.zip = zip;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Address address = (Address) o;
        return Objects.equals(this.street, address.street) &&
                Objects.equals(this.city, address.city) &&
                Objects.equals(this.state, address.state) &&
                Objects.equals(this.zip, address.zip);
    }

    @Override
    public int hashCode() {
        return Objects.hash(street, city, state, zip);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Address {\n");

        sb.append("    street: ").append(toIndentedString(street)).append("\n");
        sb.append("    city: ").append(toIndentedString(city)).append("\n");
        sb.append("    state: ").append(toIndentedString(state)).append("\n");
        sb.append("    zip: ").append(toIndentedString(zip)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /**
     * Convert the given object to string with each line indented by 4 spaces
     * (except the first line).
     */
    private String toIndentedString(Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }
}
