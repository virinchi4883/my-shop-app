package com.myshop.app.pojo;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Shipment {
    @JsonProperty("id")
    private Long id = null;

    @JsonProperty("items")
    private List<Long> items = null;

    @JsonProperty("carrier")
    private String carrier = null;

    @JsonProperty("trackingNumber")
    private String trackingNumber = null;

    @JsonProperty("trackingUrl")
    private String trackingUrl = null;

    @JsonProperty("estimatedDeliveryDate")
    private String estimatedDeliveryDate = null;

    @JsonProperty("shipDate")
    private String shipDate = null;

    public Shipment id(Long id) {
        this.id = id;
        return this;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Shipment items(List<Long> items) {
        this.items = items;
        return this;
    }

    public Shipment addItemsItem(Long itemsItem) {
        if (this.items == null) {
            this.items = new ArrayList<Long>();
        }
        this.items.add(itemsItem);
        return this;
    }

    public List<Long> getItems() {
        return items;
    }

    public void setItems(List<Long> items) {
        this.items = items;
    }

    public Shipment carrier(String carrier) {
        this.carrier = carrier;
        return this;
    }

    public String getCarrier() {
        return carrier;
    }

    public void setCarrier(String carrier) {
        this.carrier = carrier;
    }

    public Shipment trackingNumber(String trackingNumber) {
        this.trackingNumber = trackingNumber;
        return this;
    }

    public String getTrackingNumber() {
        return trackingNumber;
    }

    public void setTrackingNumber(String trackingNumber) {
        this.trackingNumber = trackingNumber;
    }

    public Shipment trackingUrl(String trackingUrl) {
        this.trackingUrl = trackingUrl;
        return this;
    }

    public String getTrackingUrl() {
        return trackingUrl;
    }

    public void setTrackingUrl(String trackingUrl) {
        this.trackingUrl = trackingUrl;
    }

    public Shipment estimatedDeliveryDate(String estimatedDeliveryDate) {
        this.estimatedDeliveryDate = estimatedDeliveryDate;
        return this;
    }

    public String getEstimatedDeliveryDate() {
        return estimatedDeliveryDate;
    }

    public void setEstimatedDeliveryDate(String estimatedDeliveryDate) {
        this.estimatedDeliveryDate = estimatedDeliveryDate;
    }

    public Shipment shipDate(String shipDate) {
        this.shipDate = shipDate;
        return this;
    }

    public String getShipDate() {
        return shipDate;
    }

    public void setShipDate(String shipDate) {
        this.shipDate = shipDate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Shipment shipment = (Shipment) o;
        return Objects.equals(this.id, shipment.id) &&
                Objects.equals(this.items, shipment.items) &&
                Objects.equals(this.carrier, shipment.carrier) &&
                Objects.equals(this.trackingNumber, shipment.trackingNumber) &&
                Objects.equals(this.trackingUrl, shipment.trackingUrl) &&
                Objects.equals(this.estimatedDeliveryDate, shipment.estimatedDeliveryDate) &&
                Objects.equals(this.shipDate, shipment.shipDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, items, carrier, trackingNumber, trackingUrl, estimatedDeliveryDate, shipDate);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Shipment {\n");

        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    items: ").append(toIndentedString(items)).append("\n");
        sb.append("    carrier: ").append(toIndentedString(carrier)).append("\n");
        sb.append("    trackingNumber: ").append(toIndentedString(trackingNumber)).append("\n");
        sb.append("    trackingUrl: ").append(toIndentedString(trackingUrl)).append("\n");
        sb.append("    estimatedDeliveryDate: ").append(toIndentedString(estimatedDeliveryDate)).append("\n");
        sb.append("    shipDate: ").append(toIndentedString(shipDate)).append("\n");
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
