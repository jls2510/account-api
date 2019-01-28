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
@Path("/api/account")
public class AccountController {

//    @Inject
//    lateinit var
//    Provider tomcatRequestProvider = new HttpServletRequest();
//    @Inject
//    lateinit var
//    grizzlyRequestProvider:Provider<Request>

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
    @Path("/{id}")
    public Response getById(@PathParam("id") int id) {
        List<Account> result = new ArrayList<Account>();

        try {
            configuration = new DefaultConfiguration().set(msc.getConnection()).set(SQLDialect.MYSQL_5_7);
            result.add(new AccountDao(configuration).fetchOneById(ULong.valueOf((long) id)));

        } catch (Exception e) {

            e.printStackTrace();
            log.error(e.getMessage());
            return new ExceptionJsonResponse().toResponse(e);
        }

        return toJsonResponse(result);
    } // getById()

    /**
     * @return
     */
    @GET
    public Response getList() {
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


//@POST
//    fun create(AccountData: Account): Response {
//            val result = mutableListOf<Account>()
//
//        try {
//        result.add(AccountRecord))
//
//        } catch (e: Exception) {
//        log.error(e.message)
//        return ExceptionJsonResponse().toResponse(e)
//        }
//
//        return toJsonResponse(result)
//        } // create ()
//
//
//@PUT
//@Path("/{id}")
//    fun update(AccountResult: Account, @PathParam("id") id: Int): Response {
//        val result = mutableListOf<AccountRecord>()
//
//        try {
//        val signature: String? = AccountResult.tosSignature
//        val title: String? = AccountResult.tosTitle
//        if (signature == null || title == null || signature.isBlank() || title.isBlank()) {
//        throw HttpPassThruException(App.config("error_message") + " Error: Input Parameters Missing.")
//        } else {
//        val AccountData = Account.agreeTos(id, signature, title)
//        result.add(AccountData)
//        }
//        } catch (e: Exception) {
//        log.error(e.message)
//        return ExceptionJsonResponse().toResponse(e)
//        }
//
//        return toJsonResponse(result)
//        } // update()
//
//@DELETE
//@Path("/{auditId}")
//    fun cancel(@PathParam("auditId") auditId: Int): Response {
//        val result = mutableListOf<AccountRecord>()
//
//        try {
//        AccountBuilder.cancelSelection(auditId)
//        } catch (e: Exception) {
//        log.error(e.message)
//        return ExceptionJsonResponse().toResponse(e)
//        }
//
//        return toJsonResponse(result)
//        } // cancel()
//

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
