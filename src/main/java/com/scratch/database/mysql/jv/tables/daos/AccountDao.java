/*
 * This file is generated by jOOQ.
 */
package com.scratch.database.mysql.jv.tables.daos;


import com.scratch.database.mysql.jv.tables.Account;
import com.scratch.database.mysql.jv.tables.records.AccountRecord;

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
public class AccountDao extends DAOImpl<AccountRecord, com.scratch.database.mysql.jv.tables.pojos.Account, ULong> {

    /**
     * Create a new AccountDao without any configuration
     */
    public AccountDao() {
        super(Account.ACCOUNT, com.scratch.database.mysql.jv.tables.pojos.Account.class);
    }

    /**
     * Create a new AccountDao with an attached configuration
     */
    public AccountDao(Configuration configuration) {
        super(Account.ACCOUNT, com.scratch.database.mysql.jv.tables.pojos.Account.class, configuration);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    protected ULong getId(com.scratch.database.mysql.jv.tables.pojos.Account object) {
        return object.getId();
    }

    /**
     * Fetch records that have <code>id IN (values)</code>
     */
    public List<com.scratch.database.mysql.jv.tables.pojos.Account> fetchById(ULong... values) {
        return fetch(Account.ACCOUNT.ID, values);
    }

    /**
     * Fetch a unique record that has <code>id = value</code>
     */
    public com.scratch.database.mysql.jv.tables.pojos.Account fetchOneById(ULong value) {
        return fetchOne(Account.ACCOUNT.ID, value);
    }

    /**
     * Fetch records that have <code>username IN (values)</code>
     */
    public List<com.scratch.database.mysql.jv.tables.pojos.Account> fetchByUsername(String... values) {
        return fetch(Account.ACCOUNT.USERNAME, values);
    }

    /**
     * Fetch a unique record that has <code>username = value</code>
     */
    public com.scratch.database.mysql.jv.tables.pojos.Account fetchOneByUsername(String value) {
        return fetchOne(Account.ACCOUNT.USERNAME, value);
    }

    /**
     * Fetch records that have <code>email IN (values)</code>
     */
    public List<com.scratch.database.mysql.jv.tables.pojos.Account> fetchByEmail(String... values) {
        return fetch(Account.ACCOUNT.EMAIL, values);
    }

    /**
     * Fetch records that have <code>password IN (values)</code>
     */
    public List<com.scratch.database.mysql.jv.tables.pojos.Account> fetchByPassword(String... values) {
        return fetch(Account.ACCOUNT.PASSWORD, values);
    }

    /**
     * Fetch records that have <code>first_name IN (values)</code>
     */
    public List<com.scratch.database.mysql.jv.tables.pojos.Account> fetchByFirstName(String... values) {
        return fetch(Account.ACCOUNT.FIRST_NAME, values);
    }

    /**
     * Fetch records that have <code>last_name IN (values)</code>
     */
    public List<com.scratch.database.mysql.jv.tables.pojos.Account> fetchByLastName(String... values) {
        return fetch(Account.ACCOUNT.LAST_NAME, values);
    }

    /**
     * Fetch records that have <code>stripe_id IN (values)</code>
     */
    public List<com.scratch.database.mysql.jv.tables.pojos.Account> fetchByStripeId(String... values) {
        return fetch(Account.ACCOUNT.STRIPE_ID, values);
    }

    /**
     * Fetch records that have <code>is_active IN (values)</code>
     */
    public List<com.scratch.database.mysql.jv.tables.pojos.Account> fetchByIsActive(Byte... values) {
        return fetch(Account.ACCOUNT.IS_ACTIVE, values);
    }

    /**
     * Fetch records that have <code>is_verified IN (values)</code>
     */
    public List<com.scratch.database.mysql.jv.tables.pojos.Account> fetchByIsVerified(Byte... values) {
        return fetch(Account.ACCOUNT.IS_VERIFIED, values);
    }

    /**
     * Fetch records that have <code>verification_code IN (values)</code>
     */
    public List<com.scratch.database.mysql.jv.tables.pojos.Account> fetchByVerificationCode(String... values) {
        return fetch(Account.ACCOUNT.VERIFICATION_CODE, values);
    }

    /**
     * Fetch records that have <code>verification_expire IN (values)</code>
     */
    public List<com.scratch.database.mysql.jv.tables.pojos.Account> fetchByVerificationExpire(Timestamp... values) {
        return fetch(Account.ACCOUNT.VERIFICATION_EXPIRE, values);
    }

    /**
     * Fetch records that have <code>updated_ts IN (values)</code>
     */
    public List<com.scratch.database.mysql.jv.tables.pojos.Account> fetchByUpdatedTs(Timestamp... values) {
        return fetch(Account.ACCOUNT.UPDATED_TS, values);
    }

    /**
     * Fetch records that have <code>created_ts IN (values)</code>
     */
    public List<com.scratch.database.mysql.jv.tables.pojos.Account> fetchByCreatedTs(Timestamp... values) {
        return fetch(Account.ACCOUNT.CREATED_TS, values);
    }
}
