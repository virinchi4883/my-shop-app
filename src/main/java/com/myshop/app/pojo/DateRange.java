package com.myshop.app.pojo;

import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonProperty;

public class DateRange {
    @JsonProperty("fromDate")
    private String fromDate = null;

    @JsonProperty("toDate")
    private String toDate = null;

    public DateRange fromDate(String fromDate) {
        this.fromDate = fromDate;
        return this;
    }

    public String getFromDate() {
        return fromDate;
    }

    public void setFromDate(String fromDate) {
        this.fromDate = fromDate;
    }

    public DateRange toDate(String toDate) {
        this.toDate = toDate;
        return this;
    }

    public String getToDate() {
        return toDate;
    }

    public void setToDate(String toDate) {
        this.toDate = toDate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        DateRange dateRange = (DateRange) o;
        return Objects.equals(this.fromDate, dateRange.fromDate) &&
                Objects.equals(this.toDate, dateRange.toDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fromDate, toDate);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DateRange {\n");

        sb.append("    fromDate: ").append(toIndentedString(fromDate)).append("\n");
        sb.append("    toDate: ").append(toIndentedString(toDate)).append("\n");
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
