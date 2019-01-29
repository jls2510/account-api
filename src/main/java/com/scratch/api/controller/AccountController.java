package com.scratch.api.controller;

import com.scratch.database.mysql.jv.tables.pojos.Account;
import com.scratch.database.mysql.jv.tables.daos.AccountDao;
import com.scratch.database.mysql.jv.tables.records.AccountRecord;
import com.scratch.service.database.MySQLConnection;
import com.scratch.util.JsonResponse;
import com.scratch.util.ExceptionJsonResponse;
import com.scratch.util.HttpPassThruException;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.glassfish.grizzly.http.server.Request;
import org.jooq.Configuration;
import org.jooq.SQLDialect;
import org.jooq.impl.DSL;
import org.jooq.impl.DefaultConfiguration;
import org.jooq.types.ULong;

import java.sql.Connection;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;
import javax.inject.Inject;
import javax.inject.Provider;
import javax.servlet.http.HttpServletRequest;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

/**
 *
 */
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
@Path("/account")
public class AccountController {

    private static Configuration configuration;
    private static MySQLConnection msc;

    static {

        try {
            msc = new MySQLConnection();
        } catch (Exception e) {
        }
    }

    private Logger log = LogManager.getLogger(AccountController.class.getName());

    /**
     * @param id
     * @return
     */
    @GET
    @Path("/id/{id}")
    public Response getById(@PathParam("id") int id) {
        System.out.println("AccountController.getById()");
        List<Account> result = new ArrayList<Account>();

        try {
            configuration = new DefaultConfiguration().set(msc.getConnection()).set(SQLDialect.MYSQL_5_7);
            Account account = new AccountDao(configuration).fetchOneById(ULong.valueOf((long) id));
            if (account != null) {
                result.add(account);
            } else {
                return Response
                        .status(304)
                        .entity("{\"success\":false}")
                        .build();
            }

        } catch (Exception e) {

            e.printStackTrace();
            log.error(e.getMessage());
            return new ExceptionJsonResponse().toResponse(e);
        }

        return toJsonResponse(result);
    } // getById()

    /**
     * @param username
     * @return
     */
    @GET
    @Path("/username/{username}")
    public Response getByUsername(@PathParam("username") String username) {
        System.out.println("AccountController.getByUsername()");
        List<Account> result = new ArrayList<Account>();

        try {
            configuration = new DefaultConfiguration().set(msc.getConnection()).set(SQLDialect.MYSQL_5_7);
            result.add(new AccountDao(configuration).fetchOneByUsername(username));

        } catch (Exception e) {

            e.printStackTrace();
            log.error(e.getMessage());
            return new ExceptionJsonResponse().toResponse(e);
        }

        return toJsonResponse(result);
    } // getByUsername()

    /**
     * @return
     */
    @GET
    public Response getList() {
        System.out.println("AccountController.getList()");
        List<Account> result = new ArrayList<Account>();

        try {
            configuration = new DefaultConfiguration().set(msc.getConnection()).set(SQLDialect.MYSQL_5_7);
            result.addAll(new AccountDao(configuration).findAll());
        } catch (Exception e) {

            e.printStackTrace();
            log.error(e.getMessage());
            return new ExceptionJsonResponse().toResponse(e);
        }

        return toJsonResponse(result);
    } // getList()


    @POST
    @Path("/create")
    @Consumes(MediaType.APPLICATION_JSON)
    public Response create(Account accountData) {
        System.out.println("AccountController.create()");

        Account accountAsCreated = null;

        try {
            configuration = new DefaultConfiguration().set(msc.getConnection()).set(SQLDialect.MYSQL_5_7);
            AccountDao accountDao = new AccountDao(configuration);

            accountDao.insert(accountData);

            // we want to return the record AS CREATED
            // AccountDao does not return the record, so as a work-around we will re-fetch it by username
            accountAsCreated = accountDao.fetchOneByUsername(accountData.getUsername());

        } catch (Exception e) {

            e.printStackTrace();
            log.error(e.getMessage());
            return new ExceptionJsonResponse().toResponse(e);
        }

        //return toJsonResponse(result);
        return Response
                .status(201)
                .entity(accountAsCreated)
                .build();

    } // create()


    @PUT
    @Path("/update/{id}")
    public Response update(Account account, @PathParam("id") int id) {
        System.out.println("AccountController.update()");

        String output = account.toString();

        try {
            configuration = new DefaultConfiguration().set(msc.getConnection()).set(SQLDialect.MYSQL_5_7);
            AccountDao accountDao = new AccountDao(configuration);

            account.setId(ULong.valueOf((long) id)); // in case it's not set as received

            accountDao.update(account);

        } catch (Exception e) {

            e.printStackTrace();
            log.error(e.getMessage());
            return new ExceptionJsonResponse().toResponse(e);
        }

        //return toJsonResponse(result);
        return Response
                .status(204)
                .entity("{'success': true}")
                .build();

    } // update()


    @DELETE
    @Path("/delete/{id}")
    public Response deleteById(@PathParam("id") int id) {
        System.out.println("AccountController.deleteById()");

        try {
            configuration = new DefaultConfiguration().set(msc.getConnection()).set(SQLDialect.MYSQL_5_7);
            AccountDao accountDao = new AccountDao(configuration);

            if (id > 0) {
                accountDao.deleteById(ULong.valueOf((long) id));
            } else {
                return Response
                        .status(304)
                        .entity("{\"success\":false}")
                        .build();
            }

        } catch (Exception e) {

            e.printStackTrace();
            log.error(e.getMessage());
            return new ExceptionJsonResponse().toResponse(e);
        }

        return Response
                .status(204)
                .entity("{'success': true}")
                .build();

    } // deleteById()


    /**
     * @param result
     * @return Response
     */
    private Response toJsonResponse(List<Account> result) {
        JsonResponse jsonResponse = new JsonResponse(true, result);
        log.debug(jsonResponse);
        return Response
                .status(200)
                .entity(jsonResponse)
                .build();
    } // toJsonResponse()


}
