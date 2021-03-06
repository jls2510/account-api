/*
 * This file is generated by jOOQ.
 */
package com.scratch.database.mysql.jv.tables;


import com.scratch.database.mysql.jv.Indexes;
import com.scratch.database.mysql.jv.JvB2cDev;
import com.scratch.database.mysql.jv.Keys;
import com.scratch.database.mysql.jv.tables.records.SearchKeywordRecord;

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
public class SearchKeyword extends TableImpl<SearchKeywordRecord> {

    private static final long serialVersionUID = 154460850;

    /**
     * The reference instance of <code>jv_b2c_dev.search_keyword</code>
     */
    public static final SearchKeyword SEARCH_KEYWORD = new SearchKeyword();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<SearchKeywordRecord> getRecordType() {
        return SearchKeywordRecord.class;
    }

    /**
     * The column <code>jv_b2c_dev.search_keyword.id</code>.
     */
    public final TableField<SearchKeywordRecord, ULong> ID = createField("id", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false).identity(true), this, "");

    /**
     * The column <code>jv_b2c_dev.search_keyword.search_keyword</code>.
     */
    public final TableField<SearchKeywordRecord, String> SEARCH_KEYWORD_ = createField("search_keyword", org.jooq.impl.SQLDataType.CLOB.nullable(false), this, "");

    /**
     * The column <code>jv_b2c_dev.search_keyword.replacement_keyword</code>.
     */
    public final TableField<SearchKeywordRecord, String> REPLACEMENT_KEYWORD = createField("replacement_keyword", org.jooq.impl.SQLDataType.CLOB.nullable(false), this, "");

    /**
     * The column <code>jv_b2c_dev.search_keyword.created_ts</code>.
     */
    public final TableField<SearchKeywordRecord, Timestamp> CREATED_TS = createField("created_ts", org.jooq.impl.SQLDataType.TIMESTAMP.defaultValue(org.jooq.impl.DSL.field("CURRENT_TIMESTAMP", org.jooq.impl.SQLDataType.TIMESTAMP)), this, "");

    /**
     * The column <code>jv_b2c_dev.search_keyword.updated_ts</code>.
     */
    public final TableField<SearchKeywordRecord, Timestamp> UPDATED_TS = createField("updated_ts", org.jooq.impl.SQLDataType.TIMESTAMP.defaultValue(org.jooq.impl.DSL.field("CURRENT_TIMESTAMP", org.jooq.impl.SQLDataType.TIMESTAMP)), this, "");

    /**
     * Create a <code>jv_b2c_dev.search_keyword</code> table reference
     */
    public SearchKeyword() {
        this(DSL.name("search_keyword"), null);
    }

    /**
     * Create an aliased <code>jv_b2c_dev.search_keyword</code> table reference
     */
    public SearchKeyword(String alias) {
        this(DSL.name(alias), SEARCH_KEYWORD);
    }

    /**
     * Create an aliased <code>jv_b2c_dev.search_keyword</code> table reference
     */
    public SearchKeyword(Name alias) {
        this(alias, SEARCH_KEYWORD);
    }

    private SearchKeyword(Name alias, Table<SearchKeywordRecord> aliased) {
        this(alias, aliased, null);
    }

    private SearchKeyword(Name alias, Table<SearchKeywordRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> SearchKeyword(Table<O> child, ForeignKey<O, SearchKeywordRecord> key) {
        super(child, key, SEARCH_KEYWORD);
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
        return Arrays.<Index>asList(Indexes.SEARCH_KEYWORD_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Identity<SearchKeywordRecord, ULong> getIdentity() {
        return Keys.IDENTITY_SEARCH_KEYWORD;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<SearchKeywordRecord> getPrimaryKey() {
        return Keys.KEY_SEARCH_KEYWORD_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<SearchKeywordRecord>> getKeys() {
        return Arrays.<UniqueKey<SearchKeywordRecord>>asList(Keys.KEY_SEARCH_KEYWORD_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SearchKeyword as(String alias) {
        return new SearchKeyword(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SearchKeyword as(Name alias) {
        return new SearchKeyword(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public SearchKeyword rename(String name) {
        return new SearchKeyword(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public SearchKeyword rename(Name name) {
        return new SearchKeyword(name, null);
    }
}
