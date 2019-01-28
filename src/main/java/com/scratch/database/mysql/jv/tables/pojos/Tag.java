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
public class Tag implements Serializable {

    private static final long serialVersionUID = 1607318150;

    private final ULong     id;
    private final ULong     tagGroupId;
    private final String    name;
    private final Timestamp updatedTs;
    private final Timestamp createdTs;

    public Tag(Tag value) {
        this.id = value.id;
        this.tagGroupId = value.tagGroupId;
        this.name = value.name;
        this.updatedTs = value.updatedTs;
        this.createdTs = value.createdTs;
    }

    public Tag(
        ULong     id,
        ULong     tagGroupId,
        String    name,
        Timestamp updatedTs,
        Timestamp createdTs
    ) {
        this.id = id;
        this.tagGroupId = tagGroupId;
        this.name = name;
        this.updatedTs = updatedTs;
        this.createdTs = createdTs;
    }

    public ULong getId() {
        return this.id;
    }

    public ULong getTagGroupId() {
        return this.tagGroupId;
    }

    public String getName() {
        return this.name;
    }

    public Timestamp getUpdatedTs() {
        return this.updatedTs;
    }

    public Timestamp getCreatedTs() {
        return this.createdTs;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Tag (");

        sb.append(id);
        sb.append(", ").append(tagGroupId);
        sb.append(", ").append(name);
        sb.append(", ").append(updatedTs);
        sb.append(", ").append(createdTs);

        sb.append(")");
        return sb.toString();
    }
}