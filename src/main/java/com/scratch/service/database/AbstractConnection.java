package com.scratch.service.database;

import com.scratch.util.HttpPassThruException;
import org.jooq.DSLContext;

public abstract class AbstractConnection {

    public abstract DSLContext jooq(String db_name) throws HttpPassThruException;
}
