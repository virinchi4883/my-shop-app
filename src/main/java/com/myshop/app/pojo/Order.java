package com.myshop.app.pojo;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

public class Order {
    @JsonProperty("id")
    private Long id = null;

    @JsonProperty("orderId")
    private Long orderId = null;

    @JsonProperty("customerId")
    private Long customerId = null;

    @JsonProperty("items")
    private List<Item> items = null;

    /**
     * Order Status
     */
    public enum StatusEnum {
        ORDERED("ordered"),

        SHIPPED("shipped"),

        DELIVERED("delivered");

        private final String value;

        StatusEnum(String value) {
            this.value = value;
        }

        @Override
        @JsonValue
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static StatusEnum fromValue(String text) {
            for (StatusEnum b : StatusEnum.values()) {
                if (String.valueOf(b.value).equals(text)) {
                    return b;
                }
            }
            return null;
        }
    }

    @JsonProperty("status")
    private StatusEnum status = null;

    @JsonProperty("complete")
    private Boolean complete = null;

    @JsonProperty("shipingAddress")
    private Address shipingAddress = null;

    @JsonProperty("shipments")
    private List<Shipment> shipments = null;

    public Order id(Long id) {
        this.id = id;
        return this;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Order orderId(Long orderId) {
        this.orderId = orderId;
        return this;
    }

    public Long getOrderId() {
        return orderId;
    }

    public void setOrderId(Long orderId) {
        this.orderId = orderId;
    }

    public Order customerId(Long customerId) {
        this.customerId = customerId;
        return this;
    }

    public Long getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Long customerId) {
        this.customerId = customerId;
    }

    public Order items(List<Item> items) {
        this.items = items;
        return this;
    }

    public Order addItemsItem(Item itemsItem) {
        if (this.items == null) {
            this.items = new ArrayList<Item>();
        }
        this.items.add(itemsItem);
        return this;
    }

    public List<Item> getItems() {
        return items;
    }

    public void setItems(List<Item> items) {
        this.items = items;
    }

    public Order status(StatusEnum status) {
        this.status = status;
        return this;
    }

    public StatusEnum getStatus() {
        return status;
    }

    public void setStatus(StatusEnum status) {
        this.status = status;
    }

    public Order complete(Boolean complete) {
        this.complete = complete;
        return this;
    }

    public Boolean isComplete() {
        return complete;
    }

    public void setComplete(Boolean complete) {
        this.complete = complete;
    }

    public Order shipingAddress(Address shipingAddress) {
        this.shipingAddress = shipingAddress;
        return this;
    }

    public Address getShipingAddress() {
        return shipingAddress;
    }

    public void setShipingAddress(Address shipingAddress) {
        this.shipingAddress = shipingAddress;
    }

    public Order shipments(List<Shipment> shipments) {
        this.shipments = shipments;
        return this;
    }

    public Order addShipmentsItem(Shipment shipmentsItem) {
        if (this.shipments == null) {
            this.shipments = new ArrayList<Shipment>();
        }
        this.shipments.add(shipmentsItem);
        return this;
    }

    public List<Shipment> getShipments() {
        return shipments;
    }

    public void setShipments(List<Shipment> shipments) {
        this.shipments = shipments;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Order order = (Order) o;
        return Objects.equals(this.id, order.id) &&
                Objects.equals(this.orderId, order.orderId) &&
                Objects.equals(this.customerId, order.customerId) &&
                Objects.equals(this.items, order.items) &&
                Objects.equals(this.status, order.status) &&
                Objects.equals(this.complete, order.complete) &&
                Objects.equals(this.shipingAddress, order.shipingAddress) &&
                Objects.equals(this.shipments, order.shipments);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, orderId, customerId, items, status, complete, shipingAddress, shipments);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Order {\n");

        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    orderId: ").append(toIndentedString(orderId)).append("\n");
        sb.append("    customerId: ").append(toIndentedString(customerId)).append("\n");
        sb.append("    items: ").append(toIndentedString(items)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    complete: ").append(toIndentedString(complete)).append("\n");
        sb.append("    shipingAddress: ").append(toIndentedString(shipingAddress)).append("\n");
        sb.append("    shipments: ").append(toIndentedString(shipments)).append("\n");
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
