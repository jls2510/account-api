/*
 * This file is generated by jOOQ.
 */
package com.scratch.database.mysql.jv.tables.records;


import com.scratch.database.mysql.jv.tables.ProductCategory;

import java.sql.Timestamp;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record5;
import org.jooq.Row5;
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
public class ProductCategoryRecord extends UpdatableRecordImpl<ProductCategoryRecord> implements Record5<ULong, String, ULong, Timestamp, Timestamp> {

    private static final long serialVersionUID = -1073547449;

    /**
     * Setter for <code>jv_b2c_dev.product_category.id</code>.
     */
    public ProductCategoryRecord setId(ULong value) {
        set(0, value);
        return this;
    }

    /**
     * Getter for <code>jv_b2c_dev.product_category.id</code>.
     */
    public ULong getId() {
        return (ULong) get(0);
    }

    /**
     * Setter for <code>jv_b2c_dev.product_category.item_number</code>.
     */
    public ProductCategoryRecord setItemNumber(String value) {
        set(1, value);
        return this;
    }

    /**
     * Getter for <code>jv_b2c_dev.product_category.item_number</code>.
     */
    public String getItemNumber() {
        return (String) get(1);
    }

    /**
     * Setter for <code>jv_b2c_dev.product_category.category_id</code>.
     */
    public ProductCategoryRecord setCategoryId(ULong value) {
        set(2, value);
        return this;
    }

    /**
     * Getter for <code>jv_b2c_dev.product_category.category_id</code>.
     */
    public ULong getCategoryId() {
        return (ULong) get(2);
    }

    /**
     * Setter for <code>jv_b2c_dev.product_category.updated_ts</code>.
     */
    public ProductCategoryRecord setUpdatedTs(Timestamp value) {
        set(3, value);
        return this;
    }

    /**
     * Getter for <code>jv_b2c_dev.product_category.updated_ts</code>.
     */
    public Timestamp getUpdatedTs() {
        return (Timestamp) get(3);
    }

    /**
     * Setter for <code>jv_b2c_dev.product_category.created_ts</code>.
     */
    public ProductCategoryRecord setCreatedTs(Timestamp value) {
        set(4, value);
        return this;
    }

    /**
     * Getter for <code>jv_b2c_dev.product_category.created_ts</code>.
     */
    public Timestamp getCreatedTs() {
        return (Timestamp) get(4);
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
    // Record5 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row5<ULong, String, ULong, Timestamp, Timestamp> fieldsRow() {
        return (Row5) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row5<ULong, String, ULong, Timestamp, Timestamp> valuesRow() {
        return (Row5) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<ULong> field1() {
        return ProductCategory.PRODUCT_CATEGORY.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return ProductCategory.PRODUCT_CATEGORY.ITEM_NUMBER;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<ULong> field3() {
        return ProductCategory.PRODUCT_CATEGORY.CATEGORY_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field4() {
        return ProductCategory.PRODUCT_CATEGORY.UPDATED_TS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field5() {
        return ProductCategory.PRODUCT_CATEGORY.CREATED_TS;
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
    public String component2() {
        return getItemNumber();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ULong component3() {
        return getCategoryId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp component4() {
        return getUpdatedTs();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp component5() {
        return getCreatedTs();
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
    public String value2() {
        return getItemNumber();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ULong value3() {
        return getCategoryId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value4() {
        return getUpdatedTs();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value5() {
        return getCreatedTs();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ProductCategoryRecord value1(ULong value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ProductCategoryRecord value2(String value) {
        setItemNumber(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ProductCategoryRecord value3(ULong value) {
        setCategoryId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ProductCategoryRecord value4(Timestamp value) {
        setUpdatedTs(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ProductCategoryRecord value5(Timestamp value) {
        setCreatedTs(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ProductCategoryRecord values(ULong value1, String value2, ULong value3, Timestamp value4, Timestamp value5) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached ProductCategoryRecord
     */
    public ProductCategoryRecord() {
        super(ProductCategory.PRODUCT_CATEGORY);
    }

    /**
     * Create a detached, initialised ProductCategoryRecord
     */
    public ProductCategoryRecord(ULong id, String itemNumber, ULong categoryId, Timestamp updatedTs, Timestamp createdTs) {
        super(ProductCategory.PRODUCT_CATEGORY);

        set(0, id);
        set(1, itemNumber);
        set(2, categoryId);
        set(3, updatedTs);
        set(4, createdTs);
    }
}
