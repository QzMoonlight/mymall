package com.moonlightqz.mymall.model.dto;

import com.moonlightqz.mymall.annotation.validator.FlagValidator;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import java.io.Serializable;

public class PmsBrandDto implements Serializable {

    @NotEmpty
    private String name;

    private String firstLetter;

    @Min(value = 0)
    private Integer sort;

    @FlagValidator(value = {"0","1"}, message = "厂家状态不正确")
    private Integer factoryStatus;

    @FlagValidator(value = {"0","1"}, message = "显示状态不正确")
    private Integer showStatus;

    private String logo;

    private String bigPic;

    private String brandStory;

    @Override
    public String toString() {
        return "PmsBrandDto{" +
                "name='" + name + '\'' +
                ", firstLetter='" + firstLetter + '\'' +
                ", sort=" + sort +
                ", factoryStatus=" + factoryStatus +
                ", showStatus=" + showStatus +
                ", logo='" + logo + '\'' +
                ", bigPic='" + bigPic + '\'' +
                ", brandStory='" + brandStory + '\'' +
                '}';
    }

    public PmsBrandDto() {
    }

    public PmsBrandDto(String name, String firstLetter, Integer sort, Integer factoryStatus, Integer showStatus, String logo, String bigPic, String brandStory) {
        this.name = name;
        this.firstLetter = firstLetter;
        this.sort = sort;
        this.factoryStatus = factoryStatus;
        this.showStatus = showStatus;
        this.logo = logo;
        this.bigPic = bigPic;
        this.brandStory = brandStory;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFirstLetter() {
        return firstLetter;
    }

    public void setFirstLetter(String firstLetter) {
        this.firstLetter = firstLetter;
    }

    public Integer getSort() {
        return sort;
    }

    public void setSort(Integer sort) {
        this.sort = sort;
    }

    public Integer getFactoryStatus() {
        return factoryStatus;
    }

    public void setFactoryStatus(Integer factoryStatus) {
        this.factoryStatus = factoryStatus;
    }

    public Integer getShowStatus() {
        return showStatus;
    }

    public void setShowStatus(Integer showStatus) {
        this.showStatus = showStatus;
    }

    public String getLogo() {
        return logo;
    }

    public void setLogo(String logo) {
        this.logo = logo;
    }

    public String getBigPic() {
        return bigPic;
    }

    public void setBigPic(String bigPic) {
        this.bigPic = bigPic;
    }

    public String getBrandStory() {
        return brandStory;
    }

    public void setBrandStory(String brandStory) {
        this.brandStory = brandStory;
    }
}
