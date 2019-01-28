/*
 * This file is generated by jOOQ.
 */
package com.scratch.database.mysql.jv.tables.records;


import com.scratch.database.mysql.jv.enums.PromotionDetailDetailType;
import com.scratch.database.mysql.jv.enums.PromotionDetailDiscountType;
import com.scratch.database.mysql.jv.tables.PromotionDetail;

import java.math.BigDecimal;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record7;
import org.jooq.Row7;
import org.jooq.impl.UpdatableRecordImpl;
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
public class PromotionDetailRecord extends UpdatableRecordImpl<PromotionDetailRecord> implements Record7<ULong, ULong, PromotionDetailDetailType, String, PromotionDetailDiscountType, BigDecimal, Byte> {

    private static final long serialVersionUID = -540396429;

    /**
     * Setter for <code>jv_b2c_dev.promotion_detail.id</code>.
     */
    public PromotionDetailRecord setId(ULong value) {
        set(0, value);
        return this;
    }

    /**
     * Getter for <code>jv_b2c_dev.promotion_detail.id</code>.
     */
    public ULong getId() {
        return (ULong) get(0);
    }

    /**
     * Setter for <code>jv_b2c_dev.promotion_detail.promotion_id</code>.
     */
    public PromotionDetailRecord setPromotionId(ULong value) {
        set(1, value);
        return this;
    }

    /**
     * Getter for <code>jv_b2c_dev.promotion_detail.promotion_id</code>.
     */
    public ULong getPromotionId() {
        return (ULong) get(1);
    }

    /**
     * Setter for <code>jv_b2c_dev.promotion_detail.detail_type</code>.
     */
    public PromotionDetailRecord setDetailType(PromotionDetailDetailType value) {
        set(2, value);
        return this;
    }

    /**
     * Getter for <code>jv_b2c_dev.promotion_detail.detail_type</code>.
     */
    public PromotionDetailDetailType getDetailType() {
        return (PromotionDetailDetailType) get(2);
    }

    /**
     * Setter for <code>jv_b2c_dev.promotion_detail.key</code>.
     */
    public PromotionDetailRecord setKey(String value) {
        set(3, value);
        return this;
    }

    /**
     * Getter for <code>jv_b2c_dev.promotion_detail.key</code>.
     */
    public String getKey() {
        return (String) get(3);
    }

    /**
     * Setter for <code>jv_b2c_dev.promotion_detail.discount_type</code>.
     */
    public PromotionDetailRecord setDiscountType(PromotionDetailDiscountType value) {
        set(4, value);
        return this;
    }

    /**
     * Getter for <code>jv_b2c_dev.promotion_detail.discount_type</code>.
     */
    public PromotionDetailDiscountType getDiscountType() {
        return (PromotionDetailDiscountType) get(4);
    }

    /**
     * Setter for <code>jv_b2c_dev.promotion_detail.discount_amount</code>.
     */
    public PromotionDetailRecord setDiscountAmount(BigDecimal value) {
        set(5, value);
        return this;
    }

    /**
     * Getter for <code>jv_b2c_dev.promotion_detail.discount_amount</code>.
     */
    public BigDecimal getDiscountAmount() {
        return (BigDecimal) get(5);
    }

    /**
     * Setter for <code>jv_b2c_dev.promotion_detail.is_deleted</code>.
     */
    public PromotionDetailRecord setIsDeleted(Byte value) {
        set(6, value);
        return this;
    }

    /**
     * Getter for <code>jv_b2c_dev.promotion_detail.is_deleted</code>.
     */
    public Byte getIsDeleted() {
        return (Byte) get(6);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Record1<ULong> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record7 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row7<ULong, ULong, PromotionDetailDetailType, String, PromotionDetailDiscountType, BigDecimal, Byte> fieldsRow() {
        return (Row7) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row7<ULong, ULong, PromotionDetailDetailType, String, PromotionDetailDiscountType, BigDecimal, Byte> valuesRow() {
        return (Row7) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<ULong> field1() {
        return PromotionDetail.PROMOTION_DETAIL.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<ULong> field2() {
        return PromotionDetail.PROMOTION_DETAIL.PROMOTION_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<PromotionDetailDetailType> field3() {
        return PromotionDetail.PROMOTION_DETAIL.DETAIL_TYPE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field4() {
        return PromotionDetail.PROMOTION_DETAIL.KEY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<PromotionDetailDiscountType> field5() {
        return PromotionDetail.PROMOTION_DETAIL.DISCOUNT_TYPE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<BigDecimal> field6() {
        return PromotionDetail.PROMOTION_DETAIL.DISCOUNT_AMOUNT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Byte> field7() {
        return PromotionDetail.PROMOTION_DETAIL.IS_DELETED;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ULong component1() {
        return getId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ULong component2() {
        return getPromotionId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PromotionDetailDetailType component3() {
        return getDetailType();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component4() {
        return getKey();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PromotionDetailDiscountType component5() {
        return getDiscountType();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BigDecimal component6() {
        return getDiscountAmount();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Byte component7() {
        return getIsDeleted();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ULong value1() {
        return getId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ULong value2() {
        return getPromotionId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PromotionDetailDetailType value3() {
        return getDetailType();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value4() {
        return getKey();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PromotionDetailDiscountType value5() {
        return getDiscountType();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BigDecimal value6() {
        return getDiscountAmount();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Byte value7() {
        return getIsDeleted();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PromotionDetailRecord value1(ULong value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PromotionDetailRecord value2(ULong value) {
        setPromotionId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PromotionDetailRecord value3(PromotionDetailDetailType value) {
        setDetailType(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PromotionDetailRecord value4(String value) {
        setKey(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PromotionDetailRecord value5(PromotionDetailDiscountType value) {
        setDiscountType(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PromotionDetailRecord value6(BigDecimal value) {
        setDiscountAmount(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PromotionDetailRecord value7(Byte value) {
        setIsDeleted(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PromotionDetailRecord values(ULong value1, ULong value2, PromotionDetailDetailType value3, String value4, PromotionDetailDiscountType value5, BigDecimal value6, Byte value7) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached PromotionDetailRecord
     */
    public PromotionDetailRecord() {
        super(PromotionDetail.PROMOTION_DETAIL);
    }

    /**
     * Create a detached, initialised PromotionDetailRecord
     */
    public PromotionDetailRecord(ULong id, ULong promotionId, PromotionDetailDetailType detailType, String key, PromotionDetailDiscountType discountType, BigDecimal discountAmount, Byte isDeleted) {
        super(PromotionDetail.PROMOTION_DETAIL);

        set(0, id);
        set(1, promotionId);
        set(2, detailType);
        set(3, key);
        set(4, discountType);
        set(5, discountAmount);
        set(6, isDeleted);
    }
}