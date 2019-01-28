/*
 * This file is generated by jOOQ.
 */
package com.scratch.database.mysql.jv.tables.pojos;


import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Timestamp;

import javax.annotation.Generated;

import org.jooq.types.ULong;


/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.11.5"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Product implements Serializable {

    private static final long serialVersionUID = 606926880;

    private final ULong      id;
    private final String     itemNumber;
    private final String     description_1;
    private final String     description_2;
    private final String     uom;
    private final String     packageSize;
    private final String     brand;
    private final String     brandName;
    private final Byte       perishable;
    private final String     salesTaxCode;
    private final BigDecimal itemWeight;
    private final String     itemWeightUom;
    private final String     shortDescription;
    private final String     longDescription;
    private final String     replacementItemNumber;
    private final String     displayName;
    private final String     url;
    private final String     metaTitle;
    private final String     metaDescription;
    private final Byte       isGiftable;
    private final Byte       isPromotable;
    private final Byte       isDeleted;
    private final Byte       isActive;
    private final Timestamp  updatedTs;
    private final Timestamp  createdTs;
    private final BigDecimal cubicVolume;
    private final String     cubicVolumeUom;
    private final String     catchWeight;
    private final String     catchWeightUom;
    private final BigDecimal averageWeight;
    private final BigDecimal varianceOver;
    private final BigDecimal varianceUnder;

    public Product(Product value) {
        this.id = value.id;
        this.itemNumber = value.itemNumber;
        this.description_1 = value.description_1;
        this.description_2 = value.description_2;
        this.uom = value.uom;
        this.packageSize = value.packageSize;
        this.brand = value.brand;
        this.brandName = value.brandName;
        this.perishable = value.perishable;
        this.salesTaxCode = value.salesTaxCode;
        this.itemWeight = value.itemWeight;
        this.itemWeightUom = value.itemWeightUom;
        this.shortDescription = value.shortDescription;
        this.longDescription = value.longDescription;
        this.replacementItemNumber = value.replacementItemNumber;
        this.displayName = value.displayName;
        this.url = value.url;
        this.metaTitle = value.metaTitle;
        this.metaDescription = value.metaDescription;
        this.isGiftable = value.isGiftable;
        this.isPromotable = value.isPromotable;
        this.isDeleted = value.isDeleted;
        this.isActive = value.isActive;
        this.updatedTs = value.updatedTs;
        this.createdTs = value.createdTs;
        this.cubicVolume = value.cubicVolume;
        this.cubicVolumeUom = value.cubicVolumeUom;
        this.catchWeight = value.catchWeight;
        this.catchWeightUom = value.catchWeightUom;
        this.averageWeight = value.averageWeight;
        this.varianceOver = value.varianceOver;
        this.varianceUnder = value.varianceUnder;
    }

    public Product(
        ULong      id,
        String     itemNumber,
        String     description_1,
        String     description_2,
        String     uom,
        String     packageSize,
        String     brand,
        String     brandName,
        Byte       perishable,
        String     salesTaxCode,
        BigDecimal itemWeight,
        String     itemWeightUom,
        String     shortDescription,
        String     longDescription,
        String     replacementItemNumber,
        String     displayName,
        String     url,
        String     metaTitle,
        String     metaDescription,
        Byte       isGiftable,
        Byte       isPromotable,
        Byte       isDeleted,
        Byte       isActive,
        Timestamp  updatedTs,
        Timestamp  createdTs,
        BigDecimal cubicVolume,
        String     cubicVolumeUom,
        String     catchWeight,
        String     catchWeightUom,
        BigDecimal averageWeight,
        BigDecimal varianceOver,
        BigDecimal varianceUnder
    ) {
        this.id = id;
        this.itemNumber = itemNumber;
        this.description_1 = description_1;
        this.description_2 = description_2;
        this.uom = uom;
        this.packageSize = packageSize;
        this.brand = brand;
        this.brandName = brandName;
        this.perishable = perishable;
        this.salesTaxCode = salesTaxCode;
        this.itemWeight = itemWeight;
        this.itemWeightUom = itemWeightUom;
        this.shortDescription = shortDescription;
        this.longDescription = longDescription;
        this.replacementItemNumber = replacementItemNumber;
        this.displayName = displayName;
        this.url = url;
        this.metaTitle = metaTitle;
        this.metaDescription = metaDescription;
        this.isGiftable = isGiftable;
        this.isPromotable = isPromotable;
        this.isDeleted = isDeleted;
        this.isActive = isActive;
        this.updatedTs = updatedTs;
        this.createdTs = createdTs;
        this.cubicVolume = cubicVolume;
        this.cubicVolumeUom = cubicVolumeUom;
        this.catchWeight = catchWeight;
        this.catchWeightUom = catchWeightUom;
        this.averageWeight = averageWeight;
        this.varianceOver = varianceOver;
        this.varianceUnder = varianceUnder;
    }

    public ULong getId() {
        return this.id;
    }

    public String getItemNumber() {
        return this.itemNumber;
    }

    public String getDescription_1() {
        return this.description_1;
    }

    public String getDescription_2() {
        return this.description_2;
    }

    public String getUom() {
        return this.uom;
    }

    public String getPackageSize() {
        return this.packageSize;
    }

    public String getBrand() {
        return this.brand;
    }

    public String getBrandName() {
        return this.brandName;
    }

    public Byte getPerishable() {
        return this.perishable;
    }

    public String getSalesTaxCode() {
        return this.salesTaxCode;
    }

    public BigDecimal getItemWeight() {
        return this.itemWeight;
    }

    public String getItemWeightUom() {
        return this.itemWeightUom;
    }

    public String getShortDescription() {
        return this.shortDescription;
    }

    public String getLongDescription() {
        return this.longDescription;
    }

    public String getReplacementItemNumber() {
        return this.replacementItemNumber;
    }

    public String getDisplayName() {
        return this.displayName;
    }

    public String getUrl() {
        return this.url;
    }

    public String getMetaTitle() {
        return this.metaTitle;
    }

    public String getMetaDescription() {
        return this.metaDescription;
    }

    public Byte getIsGiftable() {
        return this.isGiftable;
    }

    public Byte getIsPromotable() {
        return this.isPromotable;
    }

    public Byte getIsDeleted() {
        return this.isDeleted;
    }

    public Byte getIsActive() {
        return this.isActive;
    }

    public Timestamp getUpdatedTs() {
        return this.updatedTs;
    }

    public Timestamp getCreatedTs() {
        return this.createdTs;
    }

    public BigDecimal getCubicVolume() {
        return this.cubicVolume;
    }

    public String getCubicVolumeUom() {
        return this.cubicVolumeUom;
    }

    public String getCatchWeight() {
        return this.catchWeight;
    }

    public String getCatchWeightUom() {
        return this.catchWeightUom;
    }

    public BigDecimal getAverageWeight() {
        return this.averageWeight;
    }

    public BigDecimal getVarianceOver() {
        return this.varianceOver;
    }

    public BigDecimal getVarianceUnder() {
        return this.varianceUnder;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Product (");

        sb.append(id);
        sb.append(", ").append(itemNumber);
        sb.append(", ").append(description_1);
        sb.append(", ").append(description_2);
        sb.append(", ").append(uom);
        sb.append(", ").append(packageSize);
        sb.append(", ").append(brand);
        sb.append(", ").append(brandName);
        sb.append(", ").append(perishable);
        sb.append(", ").append(salesTaxCode);
        sb.append(", ").append(itemWeight);
        sb.append(", ").append(itemWeightUom);
        sb.append(", ").append(shortDescription);
        sb.append(", ").append(longDescription);
        sb.append(", ").append(replacementItemNumber);
        sb.append(", ").append(displayName);
        sb.append(", ").append(url);
        sb.append(", ").append(metaTitle);
        sb.append(", ").append(metaDescription);
        sb.append(", ").append(isGiftable);
        sb.append(", ").append(isPromotable);
        sb.append(", ").append(isDeleted);
        sb.append(", ").append(isActive);
        sb.append(", ").append(updatedTs);
        sb.append(", ").append(createdTs);
        sb.append(", ").append(cubicVolume);
        sb.append(", ").append(cubicVolumeUom);
        sb.append(", ").append(catchWeight);
        sb.append(", ").append(catchWeightUom);
        sb.append(", ").append(averageWeight);
        sb.append(", ").append(varianceOver);
        sb.append(", ").append(varianceUnder);

        sb.append(")");
        return sb.toString();
    }
}
