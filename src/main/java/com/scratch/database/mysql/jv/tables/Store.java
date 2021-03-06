/*
 * This file is generated by jOOQ.
 */
package com.scratch.database.mysql.jv.tables;


import com.scratch.database.mysql.jv.Indexes;
import com.scratch.database.mysql.jv.JvB2cDev;
import com.scratch.database.mysql.jv.Keys;
import com.scratch.database.mysql.jv.tables.records.StoreRecord;

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
public class Store extends TableImpl<StoreRecord> {

    private static final long serialVersionUID = -686868828;

    /**
     * The reference instance of <code>jv_b2c_dev.store</code>
     */
    public static final Store STORE = new Store();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<StoreRecord> getRecordType() {
        return StoreRecord.class;
    }

    /**
     * The column <code>jv_b2c_dev.store.id</code>.
     */
    public final TableField<StoreRecord, ULong> ID = createField("id", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false).identity(true), this, "");

    /**
     * Create a <code>jv_b2c_dev.store</code> table reference
     */
    public Store() {
        this(DSL.name("store"), null);
    }

    /**
     * Create an aliased <code>jv_b2c_dev.store</code> table reference
     */
    public Store(String alias) {
        this(DSL.name(alias), STORE);
    }

    /**
     * Create an aliased <code>jv_b2c_dev.store</code> table reference
     */
    public Store(Name alias) {
        this(alias, STORE);
    }

    private Store(Name alias, Table<StoreRecord> aliased) {
        this(alias, aliased, null);
    }

    private Store(Name alias, Table<StoreRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> Store(Table<O> child, ForeignKey<O, StoreRecord> key) {
        super(child, key, STORE);
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
        return Arrays.<Index>asList(Indexes.STORE_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Identity<StoreRecord, ULong> getIdentity() {
        return Keys.IDENTITY_STORE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<StoreRecord> getPrimaryKey() {
        return Keys.KEY_STORE_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<StoreRecord>> getKeys() {
        return Arrays.<UniqueKey<StoreRecord>>asList(Keys.KEY_STORE_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Store as(String alias) {
        return new Store(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Store as(Name alias) {
        return new Store(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public Store rename(String name) {
        return new Store(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public Store rename(Name name) {
        return new Store(name, null);
    }
}
