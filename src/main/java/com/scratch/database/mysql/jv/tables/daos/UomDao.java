/*
 * This file is generated by jOOQ.
 */
package com.scratch.database.mysql.jv.tables.daos;


import com.scratch.database.mysql.jv.tables.Uom;
import com.scratch.database.mysql.jv.tables.records.UomRecord;

import java.sql.Timestamp;
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
public class UomDao extends DAOImpl<UomRecord, com.scratch.database.mysql.jv.tables.pojos.Uom, String> {

    /**
     * Create a new UomDao without any configuration
     */
    public UomDao() {
        super(Uom.UOM, com.scratch.database.mysql.jv.tables.pojos.Uom.class);
    }

    /**
     * Create a new UomDao with an attached configuration
     */
    public UomDao(Configuration configuration) {
        super(Uom.UOM, com.scratch.database.mysql.jv.tables.pojos.Uom.class, configuration);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    protected String getId(com.scratch.database.mysql.jv.tables.pojos.Uom object) {
        return object.getId();
    }

    /**
     * Fetch records that have <code>id IN (values)</code>
     */
    public List<com.scratch.database.mysql.jv.tables.pojos.Uom> fetchById(String... values) {
        return fetch(Uom.UOM.ID, values);
    }

    /**
     * Fetch a unique record that has <code>id = value</code>
     */
    public com.scratch.database.mysql.jv.tables.pojos.Uom fetchOneById(String value) {
        return fetchOne(Uom.UOM.ID, value);
    }

    /**
     * Fetch records that have <code>name IN (values)</code>
     */
    public List<com.scratch.database.mysql.jv.tables.pojos.Uom> fetchByName(String... values) {
        return fetch(Uom.UOM.NAME, values);
    }

    /**
     * Fetch records that have <code>created_ts IN (values)</code>
     */
    public List<com.scratch.database.mysql.jv.tables.pojos.Uom> fetchByCreatedTs(Timestamp... values) {
        return fetch(Uom.UOM.CREATED_TS, values);
    }
}
