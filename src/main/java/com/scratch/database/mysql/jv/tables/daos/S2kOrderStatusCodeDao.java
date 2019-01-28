/*
 * This file is generated by jOOQ.
 */
package com.scratch.database.mysql.jv.tables.daos;


import com.scratch.database.mysql.jv.enums.S2kOrderStatusCodeCode;
import com.scratch.database.mysql.jv.tables.S2kOrderStatusCode;
import com.scratch.database.mysql.jv.tables.records.S2kOrderStatusCodeRecord;

import java.util.List;

import javax.annotation.Generated;

import org.jooq.Configuration;
import org.jooq.impl.DAOImpl;


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
public class S2kOrderStatusCodeDao extends DAOImpl<S2kOrderStatusCodeRecord, com.scratch.database.mysql.jv.tables.pojos.S2kOrderStatusCode, Integer> {

    /**
     * Create a new S2kOrderStatusCodeDao without any configuration
     */
    public S2kOrderStatusCodeDao() {
        super(S2kOrderStatusCode.S2K_ORDER_STATUS_CODE, com.scratch.database.mysql.jv.tables.pojos.S2kOrderStatusCode.class);
    }

    /**
     * Create a new S2kOrderStatusCodeDao with an attached configuration
     */
    public S2kOrderStatusCodeDao(Configuration configuration) {
        super(S2kOrderStatusCode.S2K_ORDER_STATUS_CODE, com.scratch.database.mysql.jv.tables.pojos.S2kOrderStatusCode.class, configuration);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    protected Integer getId(com.scratch.database.mysql.jv.tables.pojos.S2kOrderStatusCode object) {
        return object.getId();
    }

    /**
     * Fetch records that have <code>id IN (values)</code>
     */
    public List<com.scratch.database.mysql.jv.tables.pojos.S2kOrderStatusCode> fetchById(Integer... values) {
        return fetch(S2kOrderStatusCode.S2K_ORDER_STATUS_CODE.ID, values);
    }

    /**
     * Fetch a unique record that has <code>id = value</code>
     */
    public com.scratch.database.mysql.jv.tables.pojos.S2kOrderStatusCode fetchOneById(Integer value) {
        return fetchOne(S2kOrderStatusCode.S2K_ORDER_STATUS_CODE.ID, value);
    }

    /**
     * Fetch records that have <code>code IN (values)</code>
     */
    public List<com.scratch.database.mysql.jv.tables.pojos.S2kOrderStatusCode> fetchByCode(S2kOrderStatusCodeCode... values) {
        return fetch(S2kOrderStatusCode.S2K_ORDER_STATUS_CODE.CODE, values);
    }

    /**
     * Fetch records that have <code>name IN (values)</code>
     */
    public List<com.scratch.database.mysql.jv.tables.pojos.S2kOrderStatusCode> fetchByName(String... values) {
        return fetch(S2kOrderStatusCode.S2K_ORDER_STATUS_CODE.NAME, values);
    }
}
