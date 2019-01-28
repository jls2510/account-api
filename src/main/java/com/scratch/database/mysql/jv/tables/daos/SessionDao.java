/*
 * This file is generated by jOOQ.
 */
package com.scratch.database.mysql.jv.tables.daos;


import com.scratch.database.mysql.jv.tables.Session;
import com.scratch.database.mysql.jv.tables.records.SessionRecord;

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
public class SessionDao extends DAOImpl<SessionRecord, com.scratch.database.mysql.jv.tables.pojos.Session, String> {

    /**
     * Create a new SessionDao without any configuration
     */
    public SessionDao() {
        super(Session.SESSION, com.scratch.database.mysql.jv.tables.pojos.Session.class);
    }

    /**
     * Create a new SessionDao with an attached configuration
     */
    public SessionDao(Configuration configuration) {
        super(Session.SESSION, com.scratch.database.mysql.jv.tables.pojos.Session.class, configuration);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    protected String getId(com.scratch.database.mysql.jv.tables.pojos.Session object) {
        return object.getId();
    }

    /**
     * Fetch records that have <code>id IN (values)</code>
     */
    public List<com.scratch.database.mysql.jv.tables.pojos.Session> fetchById(String... values) {
        return fetch(Session.SESSION.ID, values);
    }

    /**
     * Fetch a unique record that has <code>id = value</code>
     */
    public com.scratch.database.mysql.jv.tables.pojos.Session fetchOneById(String value) {
        return fetchOne(Session.SESSION.ID, value);
    }

    /**
     * Fetch records that have <code>name IN (values)</code>
     */
    public List<com.scratch.database.mysql.jv.tables.pojos.Session> fetchByName(String... values) {
        return fetch(Session.SESSION.NAME, values);
    }

    /**
     * Fetch records that have <code>modified IN (values)</code>
     */
    public List<com.scratch.database.mysql.jv.tables.pojos.Session> fetchByModified(Integer... values) {
        return fetch(Session.SESSION.MODIFIED, values);
    }

    /**
     * Fetch records that have <code>lifetime IN (values)</code>
     */
    public List<com.scratch.database.mysql.jv.tables.pojos.Session> fetchByLifetime(Integer... values) {
        return fetch(Session.SESSION.LIFETIME, values);
    }

    /**
     * Fetch records that have <code>data IN (values)</code>
     */
    public List<com.scratch.database.mysql.jv.tables.pojos.Session> fetchByData(String... values) {
        return fetch(Session.SESSION.DATA, values);
    }
}
