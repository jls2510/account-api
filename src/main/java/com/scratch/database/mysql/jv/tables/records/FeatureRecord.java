/*
 * This file is generated by jOOQ.
 */
package com.scratch.database.mysql.jv.tables.records;


import com.scratch.database.mysql.jv.enums.FeatureType;
import com.scratch.database.mysql.jv.tables.Feature;

import java.sql.Timestamp;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record14;
import org.jooq.Row14;
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
public class FeatureRecord extends UpdatableRecordImpl<FeatureRecord> implements Record14<ULong, FeatureType, String, String, String, String, Integer, Timestamp, Timestamp, Byte, Byte, Byte, Timestamp, Timestamp> {

    private static final long serialVersionUID = -886119515;

    /**
     * Setter for <code>jv_b2c_dev.feature.id</code>.
     */
    public FeatureRecord setId(ULong value) {
        set(0, value);
        return this;
    }

    /**
     * Getter for <code>jv_b2c_dev.feature.id</code>.
     */
    public ULong getId() {
        return (ULong) get(0);
    }

    /**
     * Setter for <code>jv_b2c_dev.feature.type</code>.
     */
    public FeatureRecord setType(FeatureType value) {
        set(1, value);
        return this;
    }

    /**
     * Getter for <code>jv_b2c_dev.feature.type</code>.
     */
    public FeatureType getType() {
        return (FeatureType) get(1);
    }

    /**
     * Setter for <code>jv_b2c_dev.feature.featured_id</code>.
     */
    public FeatureRecord setFeaturedId(String value) {
        set(2, value);
        return this;
    }

    /**
     * Getter for <code>jv_b2c_dev.feature.featured_id</code>.
     */
    public String getFeaturedId() {
        return (String) get(2);
    }

    /**
     * Setter for <code>jv_b2c_dev.feature.title</code>.
     */
    public FeatureRecord setTitle(String value) {
        set(3, value);
        return this;
    }

    /**
     * Getter for <code>jv_b2c_dev.feature.title</code>.
     */
    public String getTitle() {
        return (String) get(3);
    }

    /**
     * Setter for <code>jv_b2c_dev.feature.description</code>.
     */
    public FeatureRecord setDescription(String value) {
        set(4, value);
        return this;
    }

    /**
     * Getter for <code>jv_b2c_dev.feature.description</code>.
     */
    public String getDescription() {
        return (String) get(4);
    }

    /**
     * Setter for <code>jv_b2c_dev.feature.image_filename</code>.
     */
    public FeatureRecord setImageFilename(String value) {
        set(5, value);
        return this;
    }

    /**
     * Getter for <code>jv_b2c_dev.feature.image_filename</code>.
     */
    public String getImageFilename() {
        return (String) get(5);
    }

    /**
     * Setter for <code>jv_b2c_dev.feature.sequence</code>.
     */
    public FeatureRecord setSequence(Integer value) {
        set(6, value);
        return this;
    }

    /**
     * Getter for <code>jv_b2c_dev.feature.sequence</code>.
     */
    public Integer getSequence() {
        return (Integer) get(6);
    }

    /**
     * Setter for <code>jv_b2c_dev.feature.start_date</code>.
     */
    public FeatureRecord setStartDate(Timestamp value) {
        set(7, value);
        return this;
    }

    /**
     * Getter for <code>jv_b2c_dev.feature.start_date</code>.
     */
    public Timestamp getStartDate() {
        return (Timestamp) get(7);
    }

    /**
     * Setter for <code>jv_b2c_dev.feature.end_date</code>.
     */
    public FeatureRecord setEndDate(Timestamp value) {
        set(8, value);
        return this;
    }

    /**
     * Getter for <code>jv_b2c_dev.feature.end_date</code>.
     */
    public Timestamp getEndDate() {
        return (Timestamp) get(8);
    }

    /**
     * Setter for <code>jv_b2c_dev.feature.is_carousel</code>.
     */
    public FeatureRecord setIsCarousel(Byte value) {
        set(9, value);
        return this;
    }

    /**
     * Getter for <code>jv_b2c_dev.feature.is_carousel</code>.
     */
    public Byte getIsCarousel() {
        return (Byte) get(9);
    }

    /**
     * Setter for <code>jv_b2c_dev.feature.is_active</code>.
     */
    public FeatureRecord setIsActive(Byte value) {
        set(10, value);
        return this;
    }

    /**
     * Getter for <code>jv_b2c_dev.feature.is_active</code>.
     */
    public Byte getIsActive() {
        return (Byte) get(10);
    }

    /**
     * Setter for <code>jv_b2c_dev.feature.is_deleted</code>.
     */
    public FeatureRecord setIsDeleted(Byte value) {
        set(11, value);
        return this;
    }

    /**
     * Getter for <code>jv_b2c_dev.feature.is_deleted</code>.
     */
    public Byte getIsDeleted() {
        return (Byte) get(11);
    }

    /**
     * Setter for <code>jv_b2c_dev.feature.created_ts</code>.
     */
    public FeatureRecord setCreatedTs(Timestamp value) {
        set(12, value);
        return this;
    }

    /**
     * Getter for <code>jv_b2c_dev.feature.created_ts</code>.
     */
    public Timestamp getCreatedTs() {
        return (Timestamp) get(12);
    }

    /**
     * Setter for <code>jv_b2c_dev.feature.updated_ts</code>.
     */
    public FeatureRecord setUpdatedTs(Timestamp value) {
        set(13, value);
        return this;
    }

    /**
     * Getter for <code>jv_b2c_dev.feature.updated_ts</code>.
     */
    public Timestamp getUpdatedTs() {
        return (Timestamp) get(13);
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
    // Record14 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row14<ULong, FeatureType, String, String, String, String, Integer, Timestamp, Timestamp, Byte, Byte, Byte, Timestamp, Timestamp> fieldsRow() {
        return (Row14) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row14<ULong, FeatureType, String, String, String, String, Integer, Timestamp, Timestamp, Byte, Byte, Byte, Timestamp, Timestamp> valuesRow() {
        return (Row14) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<ULong> field1() {
        return Feature.FEATURE.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<FeatureType> field2() {
        return Feature.FEATURE.TYPE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return Feature.FEATURE.FEATURED_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field4() {
        return Feature.FEATURE.TITLE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field5() {
        return Feature.FEATURE.DESCRIPTION;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field6() {
        return Feature.FEATURE.IMAGE_FILENAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field7() {
        return Feature.FEATURE.SEQUENCE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field8() {
        return Feature.FEATURE.START_DATE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field9() {
        return Feature.FEATURE.END_DATE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Byte> field10() {
        return Feature.FEATURE.IS_CAROUSEL;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Byte> field11() {
        return Feature.FEATURE.IS_ACTIVE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Byte> field12() {
        return Feature.FEATURE.IS_DELETED;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field13() {
        return Feature.FEATURE.CREATED_TS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field14() {
        return Feature.FEATURE.UPDATED_TS;
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
    public FeatureType component2() {
        return getType();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component3() {
        return getFeaturedId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component4() {
        return getTitle();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component5() {
        return getDescription();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component6() {
        return getImageFilename();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component7() {
        return getSequence();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp component8() {
        return getStartDate();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp component9() {
        return getEndDate();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Byte component10() {
        return getIsCarousel();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Byte component11() {
        return getIsActive();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Byte component12() {
        return getIsDeleted();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp component13() {
        return getCreatedTs();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp component14() {
        return getUpdatedTs();
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
    public FeatureType value2() {
        return getType();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value3() {
        return getFeaturedId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value4() {
        return getTitle();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value5() {
        return getDescription();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value6() {
        return getImageFilename();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value7() {
        return getSequence();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value8() {
        return getStartDate();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value9() {
        return getEndDate();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Byte value10() {
        return getIsCarousel();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Byte value11() {
        return getIsActive();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Byte value12() {
        return getIsDeleted();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value13() {
        return getCreatedTs();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value14() {
        return getUpdatedTs();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public FeatureRecord value1(ULong value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public FeatureRecord value2(FeatureType value) {
        setType(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public FeatureRecord value3(String value) {
        setFeaturedId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public FeatureRecord value4(String value) {
        setTitle(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public FeatureRecord value5(String value) {
        setDescription(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public FeatureRecord value6(String value) {
        setImageFilename(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public FeatureRecord value7(Integer value) {
        setSequence(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public FeatureRecord value8(Timestamp value) {
        setStartDate(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public FeatureRecord value9(Timestamp value) {
        setEndDate(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public FeatureRecord value10(Byte value) {
        setIsCarousel(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public FeatureRecord value11(Byte value) {
        setIsActive(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public FeatureRecord value12(Byte value) {
        setIsDeleted(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public FeatureRecord value13(Timestamp value) {
        setCreatedTs(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public FeatureRecord value14(Timestamp value) {
        setUpdatedTs(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public FeatureRecord values(ULong value1, FeatureType value2, String value3, String value4, String value5, String value6, Integer value7, Timestamp value8, Timestamp value9, Byte value10, Byte value11, Byte value12, Timestamp value13, Timestamp value14) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        value8(value8);
        value9(value9);
        value10(value10);
        value11(value11);
        value12(value12);
        value13(value13);
        value14(value14);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached FeatureRecord
     */
    public FeatureRecord() {
        super(Feature.FEATURE);
    }

    /**
     * Create a detached, initialised FeatureRecord
     */
    public FeatureRecord(ULong id, FeatureType type, String featuredId, String title, String description, String imageFilename, Integer sequence, Timestamp startDate, Timestamp endDate, Byte isCarousel, Byte isActive, Byte isDeleted, Timestamp createdTs, Timestamp updatedTs) {
        super(Feature.FEATURE);

        set(0, id);
        set(1, type);
        set(2, featuredId);
        set(3, title);
        set(4, description);
        set(5, imageFilename);
        set(6, sequence);
        set(7, startDate);
        set(8, endDate);
        set(9, isCarousel);
        set(10, isActive);
        set(11, isDeleted);
        set(12, createdTs);
        set(13, updatedTs);
    }
}