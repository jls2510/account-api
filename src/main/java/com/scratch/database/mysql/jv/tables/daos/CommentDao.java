/*
 * This file is generated by jOOQ.
 */
package com.scratch.database.mysql.jv.tables.daos;


import com.scratch.database.mysql.jv.enums.CommentStatus;
import com.scratch.database.mysql.jv.enums.CommentType;
import com.scratch.database.mysql.jv.tables.Comment;
import com.scratch.database.mysql.jv.tables.records.CommentRecord;

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
public class CommentDao extends DAOImpl<CommentRecord, com.scratch.database.mysql.jv.tables.pojos.Comment, ULong> {

    /**
     * Create a new CommentDao without any configuration
     */
    public CommentDao() {
        super(Comment.COMMENT, com.scratch.database.mysql.jv.tables.pojos.Comment.class);
    }

    /**
     * Create a new CommentDao with an attached configuration
     */
    public CommentDao(Configuration configuration) {
        super(Comment.COMMENT, com.scratch.database.mysql.jv.tables.pojos.Comment.class, configuration);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    protected ULong getId(com.scratch.database.mysql.jv.tables.pojos.Comment object) {
        return object.getId();
    }

    /**
     * Fetch records that have <code>id IN (values)</code>
     */
    public List<com.scratch.database.mysql.jv.tables.pojos.Comment> fetchById(ULong... values) {
        return fetch(Comment.COMMENT.ID, values);
    }

    /**
     * Fetch a unique record that has <code>id = value</code>
     */
    public com.scratch.database.mysql.jv.tables.pojos.Comment fetchOneById(ULong value) {
        return fetchOne(Comment.COMMENT.ID, value);
    }

    /**
     * Fetch records that have <code>type IN (values)</code>
     */
    public List<com.scratch.database.mysql.jv.tables.pojos.Comment> fetchByType(CommentType... values) {
        return fetch(Comment.COMMENT.TYPE, values);
    }

    /**
     * Fetch records that have <code>related_id IN (values)</code>
     */
    public List<com.scratch.database.mysql.jv.tables.pojos.Comment> fetchByRelatedId(String... values) {
        return fetch(Comment.COMMENT.RELATED_ID, values);
    }

    /**
     * Fetch records that have <code>account_id IN (values)</code>
     */
    public List<com.scratch.database.mysql.jv.tables.pojos.Comment> fetchByAccountId(Long... values) {
        return fetch(Comment.COMMENT.ACCOUNT_ID, values);
    }

    /**
     * Fetch records that have <code>name IN (values)</code>
     */
    public List<com.scratch.database.mysql.jv.tables.pojos.Comment> fetchByName(String... values) {
        return fetch(Comment.COMMENT.NAME, values);
    }

    /**
     * Fetch records that have <code>comment IN (values)</code>
     */
    public List<com.scratch.database.mysql.jv.tables.pojos.Comment> fetchByComment(String... values) {
        return fetch(Comment.COMMENT.COMMENT_, values);
    }

    /**
     * Fetch records that have <code>status IN (values)</code>
     */
    public List<com.scratch.database.mysql.jv.tables.pojos.Comment> fetchByStatus(CommentStatus... values) {
        return fetch(Comment.COMMENT.STATUS, values);
    }

    /**
     * Fetch records that have <code>approval_user IN (values)</code>
     */
    public List<com.scratch.database.mysql.jv.tables.pojos.Comment> fetchByApprovalUser(String... values) {
        return fetch(Comment.COMMENT.APPROVAL_USER, values);
    }

    /**
     * Fetch records that have <code>is_deleted IN (values)</code>
     */
    public List<com.scratch.database.mysql.jv.tables.pojos.Comment> fetchByIsDeleted(Byte... values) {
        return fetch(Comment.COMMENT.IS_DELETED, values);
    }

    /**
     * Fetch records that have <code>updated_ts IN (values)</code>
     */
    public List<com.scratch.database.mysql.jv.tables.pojos.Comment> fetchByUpdatedTs(Timestamp... values) {
        return fetch(Comment.COMMENT.UPDATED_TS, values);
    }

    /**
     * Fetch records that have <code>created_ts IN (values)</code>
     */
    public List<com.scratch.database.mysql.jv.tables.pojos.Comment> fetchByCreatedTs(Timestamp... values) {
        return fetch(Comment.COMMENT.CREATED_TS, values);
    }
}
