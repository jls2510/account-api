/*
 * This file is generated by jOOQ.
 */
package com.scratch.database.mysql.jv.tables.pojos;


import java.io.Serializable;
import java.sql.Timestamp;

import javax.annotation.Generated;

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
public class ProductCategory implements Serializable {

    private static final long serialVersionUID = -779748399;

    private final ULong     id;
    private final String    itemNumber;
    private final ULong     categoryId;
    private final Timestamp updatedTs;
    private final Timestamp createdTs;

    public ProductCategory(ProductCategory value) {
        this.id = value.id;
        this.itemNumber = value.itemNumber;
        this.categoryId = value.categoryId;
        this.updatedTs = value.updatedTs;
        this.createdTs = value.createdTs;
    }

    public ProductCategory(
        ULong     id,
        String    itemNumber,
        ULong     categoryId,
        Timestamp updatedTs,
        Timestamp createdTs
    ) {
        this.id = id;
        this.itemNumber = itemNumber;
        this.categoryId = categoryId;
        this.updatedTs = updatedTs;
        this.createdTs = createdTs;
    }

    public ULong getId() {
        return this.id;
    }

    public String getItemNumber() {
        return this.itemNumber;
    }

    public ULong getCategoryId() {
        return this.categoryId;
    }

    public Timestamp getUpdatedTs() {
        return this.updatedTs;
    }

    public Timestamp getCreatedTs() {
        return this.createdTs;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("ProductCategory (");

        sb.append(id);
        sb.append(", ").append(itemNumber);
        sb.append(", ").append(categoryId);
        sb.append(", ").append(updatedTs);
        sb.append(", ").append(createdTs);

        sb.append(")");
        return sb.toString();
    }
}