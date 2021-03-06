/*
 * This file is generated by jOOQ.
 */
package com.scratch.database.mysql.jv.tables.records;


import com.scratch.database.mysql.jv.enums.ContentStatus;
import com.scratch.database.mysql.jv.tables.Content;

import java.sql.Timestamp;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record8;
import org.jooq.Row8;
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
public class ContentRecord extends UpdatableRecordImpl<ContentRecord> implements Record8<ULong, ULong, ContentStatus, String, String, String, Timestamp, Timestamp> {

    private static final long serialVersionUID = 812465150;

    /**
     * Setter for <code>jv_b2c_dev.content.id</code>.
     */
    public ContentRecord setId(ULong value) {
        set(0, value);
        return this;
    }

    /**
     * Getter for <code>jv_b2c_dev.content.id</code>.
     */
    public ULong getId() {
        return (ULong) get(0);
    }

    /**
     * Setter for <code>jv_b2c_dev.content.parent_id</code>.
     */
    public ContentRecord setParentId(ULong value) {
        set(1, value);
        return this;
    }

    /**
     * Getter for <code>jv_b2c_dev.content.parent_id</code>.
     */
    public ULong getParentId() {
        return (ULong) get(1);
    }

    /**
     * Setter for <code>jv_b2c_dev.content.status</code>.
     */
    public ContentRecord setStatus(ContentStatus value) {
        set(2, value);
        return this;
    }

    /**
     * Getter for <code>jv_b2c_dev.content.status</code>.
     */
    public ContentStatus getStatus() {
        return (ContentStatus) get(2);
    }

    /**
     * Setter for <code>jv_b2c_dev.content.title</code>.
     */
    public ContentRecord setTitle(String value) {
        set(3, value);
        return this;
    }

    /**
     * Getter for <code>jv_b2c_dev.content.title</code>.
     */
    public String getTitle() {
        return (String) get(3);
    }

    /**
     * Setter for <code>jv_b2c_dev.content.url</code>.
     */
    public ContentRecord setUrl(String value) {
        set(4, value);
        return this;
    }

    /**
     * Getter for <code>jv_b2c_dev.content.url</code>.
     */
    public String getUrl() {
        return (String) get(4);
    }

    /**
     * Setter for <code>jv_b2c_dev.content.content</code>.
     */
    public ContentRecord setContent(String value) {
        set(5, value);
        return this;
    }

    /**
     * Getter for <code>jv_b2c_dev.content.content</code>.
     */
    public String getContent() {
        return (String) get(5);
    }

    /**
     * Setter for <code>jv_b2c_dev.content.updated_ts</code>.
     */
    public ContentRecord setUpdatedTs(Timestamp value) {
        set(6, value);
        return this;
    }

    /**
     * Getter for <code>jv_b2c_dev.content.updated_ts</code>.
     */
    public Timestamp getUpdatedTs() {
        return (Timestamp) get(6);
    }

    /**
     * Setter for <code>jv_b2c_dev.content.created_ts</code>.
     */
    public ContentRecord setCreatedTs(Timestamp value) {
        set(7, value);
        return this;
    }

    /**
     * Getter for <code>jv_b2c_dev.content.created_ts</code>.
     */
    public Timestamp getCreatedTs() {
        return (Timestamp) get(7);
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
    // Record8 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row8<ULong, ULong, ContentStatus, String, String, String, Timestamp, Timestamp> fieldsRow() {
        return (Row8) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row8<ULong, ULong, ContentStatus, String, String, String, Timestamp, Timestamp> valuesRow() {
        return (Row8) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<ULong> field1() {
        return Content.CONTENT.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<ULong> field2() {
        return Content.CONTENT.PARENT_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<ContentStatus> field3() {
        return Content.CONTENT.STATUS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field4() {
        return Content.CONTENT.TITLE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field5() {
        return Content.CONTENT.URL;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field6() {
        return Content.CONTENT.CONTENT_;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field7() {
        return Content.CONTENT.UPDATED_TS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field8() {
        return Content.CONTENT.CREATED_TS;
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
        return getParentId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ContentStatus component3() {
        return getStatus();
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
        return getUrl();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component6() {
        return getContent();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp component7() {
        return getUpdatedTs();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp component8() {
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
    public ULong value2() {
        return getParentId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ContentStatus value3() {
        return getStatus();
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
        return getUrl();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value6() {
        return getContent();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value7() {
        return getUpdatedTs();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value8() {
        return getCreatedTs();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ContentRecord value1(ULong value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ContentRecord value2(ULong value) {
        setParentId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ContentRecord value3(ContentStatus value) {
        setStatus(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ContentRecord value4(String value) {
        setTitle(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ContentRecord value5(String value) {
        setUrl(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ContentRecord value6(String value) {
        setContent(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ContentRecord value7(Timestamp value) {
        setUpdatedTs(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ContentRecord value8(Timestamp value) {
        setCreatedTs(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ContentRecord values(ULong value1, ULong value2, ContentStatus value3, String value4, String value5, String value6, Timestamp value7, Timestamp value8) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        value8(value8);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached ContentRecord
     */
    public ContentRecord() {
        super(Content.CONTENT);
    }

    /**
     * Create a detached, initialised ContentRecord
     */
    public ContentRecord(ULong id, ULong parentId, ContentStatus status, String title, String url, String content, Timestamp updatedTs, Timestamp createdTs) {
        super(Content.CONTENT);

        set(0, id);
        set(1, parentId);
        set(2, status);
        set(3, title);
        set(4, url);
        set(5, content);
        set(6, updatedTs);
        set(7, createdTs);
    }
}
