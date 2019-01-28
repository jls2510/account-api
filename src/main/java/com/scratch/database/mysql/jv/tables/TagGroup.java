/*
 * This file is generated by jOOQ.
 */
package com.scratch.database.mysql.jv.tables;


import com.scratch.database.mysql.jv.Indexes;
import com.scratch.database.mysql.jv.JvB2cDev;
import com.scratch.database.mysql.jv.Keys;
import com.scratch.database.mysql.jv.enums.TagGroupConstants;
import com.scratch.database.mysql.jv.tables.records.TagGroupRecord;

import java.sql.Timestamp;
import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Identity;
import org.jooq.Index;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.UniqueKey;
import org.jooq.impl.DSL;
import org.jooq.impl.TableImpl;
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
public class TagGroup extends TableImpl<TagGroupRecord> {

    private static final long serialVersionUID = -18672547;

    /**
     * The reference instance of <code>jv_b2c_dev.tag_group</code>
     */
    public static final TagGroup TAG_GROUP = new TagGroup();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<TagGroupRecord> getRecordType() {
        return TagGroupRecord.class;
    }

    /**
     * The column <code>jv_b2c_dev.tag_group.id</code>.
     */
    public final TableField<TagGroupRecord, ULong> ID = createField("id", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false).identity(true), this, "");

    /**
     * The column <code>jv_b2c_dev.tag_group.section</code>.
     */
    public final TableField<TagGroupRecord, String> SECTION = createField("section", org.jooq.impl.SQLDataType.VARCHAR(255), this, "");

    /**
     * The column <code>jv_b2c_dev.tag_group.name</code>.
     */
    public final TableField<TagGroupRecord, String> NAME = createField("name", org.jooq.impl.SQLDataType.VARCHAR(255), this, "");

    /**
     * The column <code>jv_b2c_dev.tag_group.is_filter</code>.
     */
    public final TableField<TagGroupRecord, Byte> IS_FILTER = createField("is_filter", org.jooq.impl.SQLDataType.TINYINT.nullable(false), this, "");

    /**
     * The column <code>jv_b2c_dev.tag_group.isRelatable</code>.
     */
    public final TableField<TagGroupRecord, Byte> ISRELATABLE = createField("isRelatable", org.jooq.impl.SQLDataType.TINYINT, this, "");

    /**
     * The column <code>jv_b2c_dev.tag_group.updated_ts</code>.
     */
    public final TableField<TagGroupRecord, Timestamp> UPDATED_TS = createField("updated_ts", org.jooq.impl.SQLDataType.TIMESTAMP.defaultValue(org.jooq.impl.DSL.field("CURRENT_TIMESTAMP", org.jooq.impl.SQLDataType.TIMESTAMP)), this, "");

    /**
     * The column <code>jv_b2c_dev.tag_group.created_ts</code>.
     */
    public final TableField<TagGroupRecord, Timestamp> CREATED_TS = createField("created_ts", org.jooq.impl.SQLDataType.TIMESTAMP.defaultValue(org.jooq.impl.DSL.field("CURRENT_TIMESTAMP", org.jooq.impl.SQLDataType.TIMESTAMP)), this, "");

    /**
     * The column <code>jv_b2c_dev.tag_group.constants</code>.
     */
    public final TableField<TagGroupRecord, TagGroupConstants> CONSTANTS = createField("constants", org.jooq.impl.SQLDataType.VARCHAR(15).asEnumDataType(com.scratch.database.mysql.jv.enums.TagGroupConstants.class), this, "");

    /**
     * Create a <code>jv_b2c_dev.tag_group</code> table reference
     */
    public TagGroup() {
        this(DSL.name("tag_group"), null);
    }

    /**
     * Create an aliased <code>jv_b2c_dev.tag_group</code> table reference
     */
    public TagGroup(String alias) {
        this(DSL.name(alias), TAG_GROUP);
    }

    /**
     * Create an aliased <code>jv_b2c_dev.tag_group</code> table reference
     */
    public TagGroup(Name alias) {
        this(alias, TAG_GROUP);
    }

    private TagGroup(Name alias, Table<TagGroupRecord> aliased) {
        this(alias, aliased, null);
    }

    private TagGroup(Name alias, Table<TagGroupRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> TagGroup(Table<O> child, ForeignKey<O, TagGroupRecord> key) {
        super(child, key, TAG_GROUP);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Schema getSchema() {
        return JvB2cDev.JV_B2C_DEV;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<Index> getIndexes() {
        return Arrays.<Index>asList(Indexes.TAG_GROUP_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Identity<TagGroupRecord, ULong> getIdentity() {
        return Keys.IDENTITY_TAG_GROUP;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<TagGroupRecord> getPrimaryKey() {
        return Keys.KEY_TAG_GROUP_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<TagGroupRecord>> getKeys() {
        return Arrays.<UniqueKey<TagGroupRecord>>asList(Keys.KEY_TAG_GROUP_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TagGroup as(String alias) {
        return new TagGroup(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TagGroup as(Name alias) {
        return new TagGroup(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public TagGroup rename(String name) {
        return new TagGroup(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public TagGroup rename(Name name) {
        return new TagGroup(name, null);
    }
}
