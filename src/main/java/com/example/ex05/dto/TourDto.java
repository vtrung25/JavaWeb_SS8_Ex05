package com.example.ex05.dto;

import com.example.ex05.validation.TourCode;
import com.example.ex05.validation.ValidPriceRange;
import com.example.ex05.validation.ValidDateRange;
import jakarta.validation.constraints.FutureOrPresent;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Positive;
import java.time.LocalDate;

@ValidPriceRange
@ValidDateRange
public class TourDto {

    @NotBlank(message = "Mã tour không được để trống")
    @TourCode
    private String tourCode;

    @Positive(message = "Giá người lớn phải lớn hơn 0")
    private Long adultPrice;

    @Positive(message = "Giá trẻ em phải lớn hơn 0")
    private Long childPrice;

    @FutureOrPresent(message = "Ngày khởi hành phải từ hôm nay trở đi")
    private LocalDate startDate;

    private LocalDate endDate;

    public String getTourCode() {
        return tourCode;
    }

    public void setTourCode(String tourCode) {
        this.tourCode = tourCode;
    }

    public Long getAdultPrice() {
        return adultPrice;
    }

    public void setAdultPrice(Long adultPrice) {
        this.adultPrice = adultPrice;
    }

    public Long getChildPrice() {
        return childPrice;
    }

    public void setChildPrice(Long childPrice) {
        this.childPrice = childPrice;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    public LocalDate getEndDate() {
        return endDate;
    }

    public void setEndDate(LocalDate endDate) {
        this.endDate = endDate;
    }
}