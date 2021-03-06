/*
 * This file is generated by jOOQ.
 */
package com.scratch.database.mysql.jv.tables.daos;


import com.scratch.database.mysql.jv.tables.Product;
import com.scratch.database.mysql.jv.tables.records.ProductRecord;

import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Configuration;
import org.jooq.impl.DAOImpl;
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
public class ProductDao extends DAOImpl<ProductRecord, com.scratch.database.mysql.jv.tables.pojos.Product, ULong> {

    /**
     * Create a new ProductDao without any configuration
     */
    public ProductDao() {
        super(Product.PRODUCT, com.scratch.database.mysql.jv.tables.pojos.Product.class);
    }

    /**
     * Create a new ProductDao with an attached configuration
     */
    public ProductDao(Configuration configuration) {
        super(Product.PRODUCT, com.scratch.database.mysql.jv.tables.pojos.Product.class, configuration);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    protected ULong getId(com.scratch.database.mysql.jv.tables.pojos.Product object) {
        return object.getId();
    }

    /**
     * Fetch records that have <code>id IN (values)</code>
     */
    public List<com.scratch.database.mysql.jv.tables.pojos.Product> fetchById(ULong... values) {
        return fetch(Product.PRODUCT.ID, values);
    }

    /**
     * Fetch a unique record that has <code>id = value</code>
     */
    public com.scratch.database.mysql.jv.tables.pojos.Product fetchOneById(ULong value) {
        return fetchOne(Product.PRODUCT.ID, value);
    }

    /**
     * Fetch records that have <code>item_number IN (values)</code>
     */
    public List<com.scratch.database.mysql.jv.tables.pojos.Product> fetchByItemNumber(String... values) {
        return fetch(Product.PRODUCT.ITEM_NUMBER, values);
    }

    /**
     * Fetch a unique record that has <code>item_number = value</code>
     */
    public com.scratch.database.mysql.jv.tables.pojos.Product fetchOneByItemNumber(String value) {
        return fetchOne(Product.PRODUCT.ITEM_NUMBER, value);
    }

    /**
     * Fetch records that have <code>description_1 IN (values)</code>
     */
    public List<com.scratch.database.mysql.jv.tables.pojos.Product> fetchByDescription_1(String... values) {
        return fetch(Product.PRODUCT.DESCRIPTION_1, values);
    }

    /**
     * Fetch records that have <code>description_2 IN (values)</code>
     */
    public List<com.scratch.database.mysql.jv.tables.pojos.Product> fetchByDescription_2(String... values) {
        return fetch(Product.PRODUCT.DESCRIPTION_2, values);
    }

    /**
     * Fetch records that have <code>uom IN (values)</code>
     */
    public List<com.scratch.database.mysql.jv.tables.pojos.Product> fetchByUom(String... values) {
        return fetch(Product.PRODUCT.UOM, values);
    }

    /**
     * Fetch records that have <code>package_size IN (values)</code>
     */
    public List<com.scratch.database.mysql.jv.tables.pojos.Product> fetchByPackageSize(String... values) {
        return fetch(Product.PRODUCT.PACKAGE_SIZE, values);
    }

    /**
     * Fetch records that have <code>brand IN (values)</code>
     */
    public List<com.scratch.database.mysql.jv.tables.pojos.Product> fetchByBrand(String... values) {
        return fetch(Product.PRODUCT.BRAND, values);
    }

    /**
     * Fetch records that have <code>brand_name IN (values)</code>
     */
    public List<com.scratch.database.mysql.jv.tables.pojos.Product> fetchByBrandName(String... values) {
        return fetch(Product.PRODUCT.BRAND_NAME, values);
    }

    /**
     * Fetch records that have <code>perishable IN (values)</code>
     */
    public List<com.scratch.database.mysql.jv.tables.pojos.Product> fetchByPerishable(Byte... values) {
        return fetch(Product.PRODUCT.PERISHABLE, values);
    }

    /**
     * Fetch records that have <code>sales_tax_code IN (values)</code>
     */
    public List<com.scratch.database.mysql.jv.tables.pojos.Product> fetchBySalesTaxCode(String... values) {
        return fetch(Product.PRODUCT.SALES_TAX_CODE, values);
    }

    /**
     * Fetch records that have <code>item_weight IN (values)</code>
     */
    public List<com.scratch.database.mysql.jv.tables.pojos.Product> fetchByItemWeight(BigDecimal... values) {
        return fetch(Product.PRODUCT.ITEM_WEIGHT, values);
    }

    /**
     * Fetch records that have <code>item_weight_uom IN (values)</code>
     */
    public List<com.scratch.database.mysql.jv.tables.pojos.Product> fetchByItemWeightUom(String... values) {
        return fetch(Product.PRODUCT.ITEM_WEIGHT_UOM, values);
    }

    /**
     * Fetch records that have <code>short_description IN (values)</code>
     */
    public List<com.scratch.database.mysql.jv.tables.pojos.Product> fetchByShortDescription(String... values) {
        return fetch(Product.PRODUCT.SHORT_DESCRIPTION, values);
    }

    /**
     * Fetch records that have <code>long_description IN (values)</code>
     */
    public List<com.scratch.database.mysql.jv.tables.pojos.Product> fetchByLongDescription(String... values) {
        return fetch(Product.PRODUCT.LONG_DESCRIPTION, values);
    }

    /**
     * Fetch records that have <code>replacement_item_number IN (values)</code>
     */
    public List<com.scratch.database.mysql.jv.tables.pojos.Product> fetchByReplacementItemNumber(String... values) {
        return fetch(Product.PRODUCT.REPLACEMENT_ITEM_NUMBER, values);
    }

    /**
     * Fetch records that have <code>display_name IN (values)</code>
     */
    public List<com.scratch.database.mysql.jv.tables.pojos.Product> fetchByDisplayName(String... values) {
        return fetch(Product.PRODUCT.DISPLAY_NAME, values);
    }

    /**
     * Fetch records that have <code>url IN (values)</code>
     */
    public List<com.scratch.database.mysql.jv.tables.pojos.Product> fetchByUrl(String... values) {
        return fetch(Product.PRODUCT.URL, values);
    }

    /**
     * Fetch a unique record that has <code>url = value</code>
     */
    public com.scratch.database.mysql.jv.tables.pojos.Product fetchOneByUrl(String value) {
        return fetchOne(Product.PRODUCT.URL, value);
    }

    /**
     * Fetch records that have <code>meta_title IN (values)</code>
     */
    public List<com.scratch.database.mysql.jv.tables.pojos.Product> fetchByMetaTitle(String... values) {
        return fetch(Product.PRODUCT.META_TITLE, values);
    }

    /**
     * Fetch records that have <code>meta_description IN (values)</code>
     */
    public List<com.scratch.database.mysql.jv.tables.pojos.Product> fetchByMetaDescription(String... values) {
        return fetch(Product.PRODUCT.META_DESCRIPTION, values);
    }

    /**
     * Fetch records that have <code>is_giftable IN (values)</code>
     */
    public List<com.scratch.database.mysql.jv.tables.pojos.Product> fetchByIsGiftable(Byte... values) {
        return fetch(Product.PRODUCT.IS_GIFTABLE, values);
    }

    /**
     * Fetch records that have <code>is_promotable IN (values)</code>
     */
    public List<com.scratch.database.mysql.jv.tables.pojos.Product> fetchByIsPromotable(Byte... values) {
        return fetch(Product.PRODUCT.IS_PROMOTABLE, values);
    }

    /**
     * Fetch records that have <code>is_deleted IN (values)</code>
     */
    public List<com.scratch.database.mysql.jv.tables.pojos.Product> fetchByIsDeleted(Byte... values) {
        return fetch(Product.PRODUCT.IS_DELETED, values);
    }

    /**
     * Fetch records that have <code>is_active IN (values)</code>
     */
    public List<com.scratch.database.mysql.jv.tables.pojos.Product> fetchByIsActive(Byte... values) {
        return fetch(Product.PRODUCT.IS_ACTIVE, values);
    }

    /**
     * Fetch records that have <code>updated_ts IN (values)</code>
     */
    public List<com.scratch.database.mysql.jv.tables.pojos.Product> fetchByUpdatedTs(Timestamp... values) {
        return fetch(Product.PRODUCT.UPDATED_TS, values);
    }

    /**
     * Fetch records that have <code>created_ts IN (values)</code>
     */
    public List<com.scratch.database.mysql.jv.tables.pojos.Product> fetchByCreatedTs(Timestamp... values) {
        return fetch(Product.PRODUCT.CREATED_TS, values);
    }

    /**
     * Fetch records that have <code>cubic_volume IN (values)</code>
     */
    public List<com.scratch.database.mysql.jv.tables.pojos.Product> fetchByCubicVolume(BigDecimal... values) {
        return fetch(Product.PRODUCT.CUBIC_VOLUME, values);
    }

    /**
     * Fetch records that have <code>cubic_volume_uom IN (values)</code>
     */
    public List<com.scratch.database.mysql.jv.tables.pojos.Product> fetchByCubicVolumeUom(String... values) {
        return fetch(Product.PRODUCT.CUBIC_VOLUME_UOM, values);
    }

    /**
     * Fetch records that have <code>catch_weight IN (values)</code>
     */
    public List<com.scratch.database.mysql.jv.tables.pojos.Product> fetchByCatchWeight(String... values) {
        return fetch(Product.PRODUCT.CATCH_WEIGHT, values);
    }

    /**
     * Fetch records that have <code>catch_weight_UOM IN (values)</code>
     */
    public List<com.scratch.database.mysql.jv.tables.pojos.Product> fetchByCatchWeightUom(String... values) {
        return fetch(Product.PRODUCT.CATCH_WEIGHT_UOM, values);
    }

    /**
     * Fetch records that have <code>average_weight IN (values)</code>
     */
    public List<com.scratch.database.mysql.jv.tables.pojos.Product> fetchByAverageWeight(BigDecimal... values) {
        return fetch(Product.PRODUCT.AVERAGE_WEIGHT, values);
    }

    /**
     * Fetch records that have <code>variance_over IN (values)</code>
     */
    public List<com.scratch.database.mysql.jv.tables.pojos.Product> fetchByVarianceOver(BigDecimal... values) {
        return fetch(Product.PRODUCT.VARIANCE_OVER, values);
    }

    /**
     * Fetch records that have <code>variance_under IN (values)</code>
     */
    public List<com.scratch.database.mysql.jv.tables.pojos.Product> fetchByVarianceUnder(BigDecimal... values) {
        return fetch(Product.PRODUCT.VARIANCE_UNDER, values);
    }
}
