/*
 * This file is generated by jOOQ.
 */
package com.scratch.database.mysql.jv.tables;


import com.scratch.database.mysql.jv.Indexes;
import com.scratch.database.mysql.jv.JvB2cDev;
import com.scratch.database.mysql.jv.Keys;
import com.scratch.database.mysql.jv.tables.records.RecipeCategoryRecord;

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
public class RecipeCategory extends TableImpl<RecipeCategoryRecord> {

    private static final long serialVersionUID = 723773674;

    /**
     * The reference instance of <code>jv_b2c_dev.recipe_category</code>
     */
    public static final RecipeCategory RECIPE_CATEGORY = new RecipeCategory();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<RecipeCategoryRecord> getRecordType() {
        return RecipeCategoryRecord.class;
    }

    /**
     * The column <code>jv_b2c_dev.recipe_category.id</code>.
     */
    public final TableField<RecipeCategoryRecord, ULong> ID = createField("id", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false).identity(true), this, "");

    /**
     * The column <code>jv_b2c_dev.recipe_category.url</code>.
     */
    public final TableField<RecipeCategoryRecord, String> URL = createField("url", org.jooq.impl.SQLDataType.VARCHAR(255), this, "");

    /**
     * The column <code>jv_b2c_dev.recipe_category.name</code>.
     */
    public final TableField<RecipeCategoryRecord, String> NAME = createField("name", org.jooq.impl.SQLDataType.CLOB, this, "");

    /**
     * The column <code>jv_b2c_dev.recipe_category.description</code>.
     */
    public final TableField<RecipeCategoryRecord, String> DESCRIPTION = createField("description", org.jooq.impl.SQLDataType.VARCHAR(255), this, "");

    /**
     * The column <code>jv_b2c_dev.recipe_category.sequence</code>.
     */
    public final TableField<RecipeCategoryRecord, Integer> SEQUENCE = createField("sequence", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>jv_b2c_dev.recipe_category.is_active</code>.
     */
    public final TableField<RecipeCategoryRecord, Byte> IS_ACTIVE = createField("is_active", org.jooq.impl.SQLDataType.TINYINT.nullable(false).defaultValue(org.jooq.impl.DSL.inline("1", org.jooq.impl.SQLDataType.TINYINT)), this, "");

    /**
     * The column <code>jv_b2c_dev.recipe_category.is_deleted</code>.
     */
    public final TableField<RecipeCategoryRecord, Byte> IS_DELETED = createField("is_deleted", org.jooq.impl.SQLDataType.TINYINT.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.TINYINT)), this, "");

    /**
     * The column <code>jv_b2c_dev.recipe_category.updated_ts</code>.
     */
    public final TableField<RecipeCategoryRecord, Timestamp> UPDATED_TS = createField("updated_ts", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false).defaultValue(org.jooq.impl.DSL.field("CURRENT_TIMESTAMP", org.jooq.impl.SQLDataType.TIMESTAMP)), this, "");

    /**
     * The column <code>jv_b2c_dev.recipe_category.created_ts</code>.
     */
    public final TableField<RecipeCategoryRecord, Timestamp> CREATED_TS = createField("created_ts", org.jooq.impl.SQLDataType.TIMESTAMP.defaultValue(org.jooq.impl.DSL.field("CURRENT_TIMESTAMP", org.jooq.impl.SQLDataType.TIMESTAMP)), this, "");

    /**
     * Create a <code>jv_b2c_dev.recipe_category</code> table reference
     */
    public RecipeCategory() {
        this(DSL.name("recipe_category"), null);
    }

    /**
     * Create an aliased <code>jv_b2c_dev.recipe_category</code> table reference
     */
    public RecipeCategory(String alias) {
        this(DSL.name(alias), RECIPE_CATEGORY);
    }

    /**
     * Create an aliased <code>jv_b2c_dev.recipe_category</code> table reference
     */
    public RecipeCategory(Name alias) {
        this(alias, RECIPE_CATEGORY);
    }

    private RecipeCategory(Name alias, Table<RecipeCategoryRecord> aliased) {
        this(alias, aliased, null);
    }

    private RecipeCategory(Name alias, Table<RecipeCategoryRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> RecipeCategory(Table<O> child, ForeignKey<O, RecipeCategoryRecord> key) {
        super(child, key, RECIPE_CATEGORY);
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
        return Arrays.<Index>asList(Indexes.RECIPE_CATEGORY_IS_ACTIVE, Indexes.RECIPE_CATEGORY_IS_DELETED, Indexes.RECIPE_CATEGORY_PRIMARY, Indexes.RECIPE_CATEGORY_URL);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Identity<RecipeCategoryRecord, ULong> getIdentity() {
        return Keys.IDENTITY_RECIPE_CATEGORY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<RecipeCategoryRecord> getPrimaryKey() {
        return Keys.KEY_RECIPE_CATEGORY_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<RecipeCategoryRecord>> getKeys() {
        return Arrays.<UniqueKey<RecipeCategoryRecord>>asList(Keys.KEY_RECIPE_CATEGORY_PRIMARY, Keys.KEY_RECIPE_CATEGORY_URL);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public RecipeCategory as(String alias) {
        return new RecipeCategory(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public RecipeCategory as(Name alias) {
        return new RecipeCategory(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public RecipeCategory rename(String name) {
        return new RecipeCategory(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public RecipeCategory rename(Name name) {
        return new RecipeCategory(name, null);
    }
}
