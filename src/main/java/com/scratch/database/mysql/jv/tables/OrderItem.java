/*
 * This file is generated by jOOQ.
 */
package com.scratch.database.mysql.jv.tables;


import com.scratch.database.mysql.jv.Indexes;
import com.scratch.database.mysql.jv.JvB2cDev;
import com.scratch.database.mysql.jv.Keys;
import com.scratch.database.mysql.jv.tables.records.OrderItemRecord;

import java.math.BigDecimal;
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
public class OrderItem extends TableImpl<OrderItemRecord> {

    private static final long serialVersionUID = -574313786;

    /**
     * The reference instance of <code>jv_b2c_dev.order_item</code>
     */
    public static final OrderItem ORDER_ITEM = new OrderItem();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<OrderItemRecord> getRecordType() {
        return OrderItemRecord.class;
    }

    /**
     * The column <code>jv_b2c_dev.order_item.id</code>.
     */
    public final TableField<OrderItemRecord, ULong> ID = createField("id", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false).identity(true), this, "");

    /**
     * The column <code>jv_b2c_dev.order_item.order_id</code>.
     */
    public final TableField<OrderItemRecord, ULong> ORDER_ID = createField("order_id", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>jv_b2c_dev.order_item.item_number</code>.
     */
    public final TableField<OrderItemRecord, String> ITEM_NUMBER = createField("item_number", org.jooq.impl.SQLDataType.VARCHAR(20).nullable(false).defaultValue(org.jooq.impl.DSL.inline("", org.jooq.impl.SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>jv_b2c_dev.order_item.item_description</code>.
     */
    public final TableField<OrderItemRecord, String> ITEM_DESCRIPTION = createField("item_description", org.jooq.impl.SQLDataType.VARCHAR(30).nullable(false).defaultValue(org.jooq.impl.DSL.inline("", org.jooq.impl.SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>jv_b2c_dev.order_item.price</code>.
     */
    public final TableField<OrderItemRecord, BigDecimal> PRICE = createField("price", org.jooq.impl.SQLDataType.DECIMAL(9, 2).nullable(false).defaultValue(org.jooq.impl.DSL.inline("0.00", org.jooq.impl.SQLDataType.DECIMAL)), this, "");

    /**
     * The column <code>jv_b2c_dev.order_item.quantity</code>.
     */
    public final TableField<OrderItemRecord, BigDecimal> QUANTITY = createField("quantity", org.jooq.impl.SQLDataType.DECIMAL(7, 2).nullable(false).defaultValue(org.jooq.impl.DSL.inline("0.00", org.jooq.impl.SQLDataType.DECIMAL)), this, "");

    /**
     * The column <code>jv_b2c_dev.order_item.perishable</code>.
     */
    public final TableField<OrderItemRecord, Byte> PERISHABLE = createField("perishable", org.jooq.impl.SQLDataType.TINYINT.defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.TINYINT)), this, "");

    /**
     * The column <code>jv_b2c_dev.order_item.discount_percent</code>.
     */
    public final TableField<OrderItemRecord, Integer> DISCOUNT_PERCENT = createField("discount_percent", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.INTEGER)), this, "");

    /**
     * The column <code>jv_b2c_dev.order_item.discount_price</code>.
     */
    public final TableField<OrderItemRecord, BigDecimal> DISCOUNT_PRICE = createField("discount_price", org.jooq.impl.SQLDataType.DECIMAL(9, 2).nullable(false).defaultValue(org.jooq.impl.DSL.inline("0.00", org.jooq.impl.SQLDataType.DECIMAL)), this, "");

    /**
     * The column <code>jv_b2c_dev.order_item.promo_code</code>.
     */
    public final TableField<OrderItemRecord, String> PROMO_CODE = createField("promo_code", org.jooq.impl.SQLDataType.VARCHAR(20).nullable(false).defaultValue(org.jooq.impl.DSL.inline("", org.jooq.impl.SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>jv_b2c_dev.order_item.weight</code>.
     */
    public final TableField<OrderItemRecord, BigDecimal> WEIGHT = createField("weight", org.jooq.impl.SQLDataType.DECIMAL(9, 2), this, "");

    /**
     * The column <code>jv_b2c_dev.order_item.weight_uom</code>.
     */
    public final TableField<OrderItemRecord, String> WEIGHT_UOM = createField("weight_uom", org.jooq.impl.SQLDataType.VARCHAR(255), this, "");

    /**
     * The column <code>jv_b2c_dev.order_item.is_taxable</code>.
     */
    public final TableField<OrderItemRecord, Byte> IS_TAXABLE = createField("is_taxable", org.jooq.impl.SQLDataType.TINYINT.nullable(false).defaultValue(org.jooq.impl.DSL.inline("1", org.jooq.impl.SQLDataType.TINYINT)), this, "");

    /**
     * The column <code>jv_b2c_dev.order_item.tax</code>.
     */
    public final TableField<OrderItemRecord, BigDecimal> TAX = createField("tax", org.jooq.impl.SQLDataType.DECIMAL(7, 2), this, "");

    /**
     * The column <code>jv_b2c_dev.order_item.sales_tax_code</code>.
     */
    public final TableField<OrderItemRecord, String> SALES_TAX_CODE = createField("sales_tax_code", org.jooq.impl.SQLDataType.VARCHAR(20), this, "");

    /**
     * The column <code>jv_b2c_dev.order_item.promotion_id</code>.
     */
    public final TableField<OrderItemRecord, ULong> PROMOTION_ID = createField("promotion_id", org.jooq.impl.SQLDataType.BIGINTUNSIGNED, this, "");

    /**
     * The column <code>jv_b2c_dev.order_item.qty_ship</code>.
     */
    public final TableField<OrderItemRecord, BigDecimal> QTY_SHIP = createField("qty_ship", org.jooq.impl.SQLDataType.DECIMAL(7, 2), this, "");

    /**
     * The column <code>jv_b2c_dev.order_item.catch_weight</code>.
     */
    public final TableField<OrderItemRecord, String> CATCH_WEIGHT = createField("catch_weight", org.jooq.impl.SQLDataType.VARCHAR(255), this, "");

    /**
     * The column <code>jv_b2c_dev.order_item.catch_weight_price</code>.
     */
    public final TableField<OrderItemRecord, BigDecimal> CATCH_WEIGHT_PRICE = createField("catch_weight_price", org.jooq.impl.SQLDataType.DECIMAL(9, 2), this, "");

    /**
     * The column <code>jv_b2c_dev.order_item.refund_amount</code>.
     */
    public final TableField<OrderItemRecord, BigDecimal> REFUND_AMOUNT = createField("refund_amount", org.jooq.impl.SQLDataType.DECIMAL(9, 2), this, "");

    /**
     * The column <code>jv_b2c_dev.order_item.refund_qty</code>.
     */
    public final TableField<OrderItemRecord, BigDecimal> REFUND_QTY = createField("refund_qty", org.jooq.impl.SQLDataType.DECIMAL(7, 2), this, "");

    /**
     * The column <code>jv_b2c_dev.order_item.refund_email_ts</code>.
     */
    public final TableField<OrderItemRecord, Timestamp> REFUND_EMAIL_TS = createField("refund_email_ts", org.jooq.impl.SQLDataType.TIMESTAMP, this, "");

    /**
     * The column <code>jv_b2c_dev.order_item.created_ts</code>.
     */
    public final TableField<OrderItemRecord, Timestamp> CREATED_TS = createField("created_ts", org.jooq.impl.SQLDataType.TIMESTAMP.defaultValue(org.jooq.impl.DSL.field("CURRENT_TIMESTAMP", org.jooq.impl.SQLDataType.TIMESTAMP)), this, "");

    /**
     * The column <code>jv_b2c_dev.order_item.updated_ts</code>.
     */
    public final TableField<OrderItemRecord, Timestamp> UPDATED_TS = createField("updated_ts", org.jooq.impl.SQLDataType.TIMESTAMP.defaultValue(org.jooq.impl.DSL.field("CURRENT_TIMESTAMP", org.jooq.impl.SQLDataType.TIMESTAMP)), this, "");

    /**
     * Create a <code>jv_b2c_dev.order_item</code> table reference
     */
    public OrderItem() {
        this(DSL.name("order_item"), null);
    }

    /**
     * Create an aliased <code>jv_b2c_dev.order_item</code> table reference
     */
    public OrderItem(String alias) {
        this(DSL.name(alias), ORDER_ITEM);
    }

    /**
     * Create an aliased <code>jv_b2c_dev.order_item</code> table reference
     */
    public OrderItem(Name alias) {
        this(alias, ORDER_ITEM);
    }

    private OrderItem(Name alias, Table<OrderItemRecord> aliased) {
        this(alias, aliased, null);
    }

    private OrderItem(Name alias, Table<OrderItemRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> OrderItem(Table<O> child, ForeignKey<O, OrderItemRecord> key) {
        super(child, key, ORDER_ITEM);
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
        return Arrays.<Index>asList(Indexes.ORDER_ITEM_ORDER_ID, Indexes.ORDER_ITEM_ORDER_ITEM_IBFK_2, Indexes.ORDER_ITEM_PRIMARY, Indexes.ORDER_ITEM_PROMOTION_ID, Indexes.ORDER_ITEM_WEIGHT_UOM);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Identity<OrderItemRecord, ULong> getIdentity() {
        return Keys.IDENTITY_ORDER_ITEM;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<OrderItemRecord> getPrimaryKey() {
        return Keys.KEY_ORDER_ITEM_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<OrderItemRecord>> getKeys() {
        return Arrays.<UniqueKey<OrderItemRecord>>asList(Keys.KEY_ORDER_ITEM_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<ForeignKey<OrderItemRecord, ?>> getReferences() {
        return Arrays.<ForeignKey<OrderItemRecord, ?>>asList(Keys.ORDER_ITEM_IBFK_1, Keys.ORDER_ITEM_IBFK_3, Keys.ORDER_ITEM_IBFK_5);
    }

    public Order order() {
        return new Order(this, Keys.ORDER_ITEM_IBFK_1);
    }

    public Uom uom() {
        return new Uom(this, Keys.ORDER_ITEM_IBFK_3);
    }

    public PromotionHeader promotionHeader() {
        return new PromotionHeader(this, Keys.ORDER_ITEM_IBFK_5);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public OrderItem as(String alias) {
        return new OrderItem(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public OrderItem as(Name alias) {
        return new OrderItem(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public OrderItem rename(String name) {
        return new OrderItem(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public OrderItem rename(Name name) {
        return new OrderItem(name, null);
    }
}
