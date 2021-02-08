package com.myshop.app.pojo;

import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

public class Item {
    @JsonProperty("id")
    private Long id = null;

    @JsonProperty("name")
    private String name = null;

    @JsonProperty("planId")
    private String planId = null;

    @JsonProperty("skuId")
    private String skuId = null;

    @JsonProperty("quantity")
    private Integer quantity = null;

    @JsonProperty("telephoneNumber")
    private String telephoneNumber = null;

    public enum StatusEnum {
        ORDERED("ordered"),

        SHIPPED("shipped"),

        DELIVERED("delivered");

        private String value;

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

    @JsonProperty("estimatedShipDateRange")
    private DateRange estimatedShipDateRange = null;

    @JsonProperty("newEstimatedShipDateRange")
    private DateRange newEstimatedShipDateRange = null;

    @JsonProperty("userAcceptedDelay")
    private Boolean userAcceptedDelay = null;

    @JsonProperty("delayAcceptedDate")
    private String delayAcceptedDate = null;

    public Item id(Long id) {
        this.id = id;
        return this;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Item name(String name) {
        this.name = name;
        return this;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Item planId(String planId) {
        this.planId = planId;
        return this;
    }

    public String getPlanId() {
        return planId;
    }

    public void setPlanId(String planId) {
        this.planId = planId;
    }

    public Item skuId(String skuId) {
        this.skuId = skuId;
        return this;
    }

    public String getSkuId() {
        return skuId;
    }

    public void setSkuId(String skuId) {
        this.skuId = skuId;
    }

    public Item quantity(Integer quantity) {
        this.quantity = quantity;
        return this;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public Item telephoneNumber(String telephoneNumber) {
        this.telephoneNumber = telephoneNumber;
        return this;
    }

    public String getTelephoneNumber() {
        return telephoneNumber;
    }

    public void setTelephoneNumber(String telephoneNumber) {
        this.telephoneNumber = telephoneNumber;
    }

    public Item status(StatusEnum status) {
        this.status = status;
        return this;
    }

    public StatusEnum getStatus() {
        return status;
    }

    public void setStatus(StatusEnum status) {
        this.status = status;
    }

    public Item complete(Boolean complete) {
        this.complete = complete;
        return this;
    }

    public Boolean isComplete() {
        return complete;
    }

    public void setComplete(Boolean complete) {
        this.complete = complete;
    }

    public Item estimatedShipDateRange(DateRange estimatedShipDateRange) {
        this.estimatedShipDateRange = estimatedShipDateRange;
        return this;
    }

    public DateRange getEstimatedShipDateRange() {
        return estimatedShipDateRange;
    }

    public void setEstimatedShipDateRange(DateRange estimatedShipDateRange) {
        this.estimatedShipDateRange = estimatedShipDateRange;
    }

    public Item newEstimatedShipDateRange(DateRange newEstimatedShipDateRange) {
        this.newEstimatedShipDateRange = newEstimatedShipDateRange;
        return this;
    }

    public DateRange getNewEstimatedShipDateRange() {
        return newEstimatedShipDateRange;
    }

    public void setNewEstimatedShipDateRange(DateRange newEstimatedShipDateRange) {
        this.newEstimatedShipDateRange = newEstimatedShipDateRange;
    }

    public Item userAcceptedDelay(Boolean userAcceptedDelay) {
        this.userAcceptedDelay = userAcceptedDelay;
        return this;
    }

    public Boolean isUserAcceptedDelay() {
        return userAcceptedDelay;
    }

    public void setUserAcceptedDelay(Boolean userAcceptedDelay) {
        this.userAcceptedDelay = userAcceptedDelay;
    }

    public Item delayAcceptedDate(String delayAcceptedDate) {
        this.delayAcceptedDate = delayAcceptedDate;
        return this;
    }

    public String getDelayAcceptedDate() {
        return delayAcceptedDate;
    }

    public void setDelayAcceptedDate(String delayAcceptedDate) {
        this.delayAcceptedDate = delayAcceptedDate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Item item = (Item) o;
        return Objects.equals(this.id, item.id) &&
                Objects.equals(this.name, item.name) &&
                Objects.equals(this.planId, item.planId) &&
                Objects.equals(this.skuId, item.skuId) &&
                Objects.equals(this.quantity, item.quantity) &&
                Objects.equals(this.telephoneNumber, item.telephoneNumber) &&
                Objects.equals(this.status, item.status) &&
                Objects.equals(this.complete, item.complete) &&
                Objects.equals(this.estimatedShipDateRange, item.estimatedShipDateRange) &&
                Objects.equals(this.newEstimatedShipDateRange, item.newEstimatedShipDateRange) &&
                Objects.equals(this.userAcceptedDelay, item.userAcceptedDelay) &&
                Objects.equals(this.delayAcceptedDate, item.delayAcceptedDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, planId, skuId, quantity, telephoneNumber, status, complete, estimatedShipDateRange, newEstimatedShipDateRange,
                userAcceptedDelay, delayAcceptedDate);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Item {\n");

        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    planId: ").append(toIndentedString(planId)).append("\n");
        sb.append("    skuId: ").append(toIndentedString(skuId)).append("\n");
        sb.append("    quantity: ").append(toIndentedString(quantity)).append("\n");
        sb.append("    telephoneNumber: ").append(toIndentedString(telephoneNumber)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    complete: ").append(toIndentedString(complete)).append("\n");
        sb.append("    estimatedShipDateRange: ").append(toIndentedString(estimatedShipDateRange)).append("\n");
        sb.append("    newEstimatedShipDateRange: ").append(toIndentedString(newEstimatedShipDateRange)).append("\n");
        sb.append("    userAcceptedDelay: ").append(toIndentedString(userAcceptedDelay)).append("\n");
        sb.append("    delayAcceptedDate: ").append(toIndentedString(delayAcceptedDate)).append("\n");
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
