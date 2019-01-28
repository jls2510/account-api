/*
 * This file is generated by jOOQ.
 */
package com.scratch.database.mysql.jv.tables.records;


import com.scratch.database.mysql.jv.tables.Address;

import java.sql.Timestamp;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record15;
import org.jooq.Row15;
import org.jooq.impl.UpdatableRecordImpl;
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
public class AddressRecord extends UpdatableRecordImpl<AddressRecord> implements Record15<ULong, ULong, String, String, String, String, String, String, String, String, String, String, Byte, Timestamp, Timestamp> {

    private static final long serialVersionUID = 996281470;

    /**
     * Setter for <code>jv_b2c_dev.address.id</code>.
     */
    public AddressRecord setId(ULong value) {
        set(0, value);
        return this;
    }

    /**
     * Getter for <code>jv_b2c_dev.address.id</code>.
     */
    public ULong getId() {
        return (ULong) get(0);
    }

    /**
     * Setter for <code>jv_b2c_dev.address.account_id</code>.
     */
    public AddressRecord setAccountId(ULong value) {
        set(1, value);
        return this;
    }

    /**
     * Getter for <code>jv_b2c_dev.address.account_id</code>.
     */
    public ULong getAccountId() {
        return (ULong) get(1);
    }

    /**
     * Setter for <code>jv_b2c_dev.address.name</code>.
     */
    public AddressRecord setName(String value) {
        set(2, value);
        return this;
    }

    /**
     * Getter for <code>jv_b2c_dev.address.name</code>.
     */
    public String getName() {
        return (String) get(2);
    }

    /**
     * Setter for <code>jv_b2c_dev.address.care_of</code>.
     */
    public AddressRecord setCareOf(String value) {
        set(3, value);
        return this;
    }

    /**
     * Getter for <code>jv_b2c_dev.address.care_of</code>.
     */
    public String getCareOf() {
        return (String) get(3);
    }

    /**
     * Setter for <code>jv_b2c_dev.address.line1</code>.
     */
    public AddressRecord setLine1(String value) {
        set(4, value);
        return this;
    }

    /**
     * Getter for <code>jv_b2c_dev.address.line1</code>.
     */
    public String getLine1() {
        return (String) get(4);
    }

    /**
     * Setter for <code>jv_b2c_dev.address.line2</code>.
     */
    public AddressRecord setLine2(String value) {
        set(5, value);
        return this;
    }

    /**
     * Getter for <code>jv_b2c_dev.address.line2</code>.
     */
    public String getLine2() {
        return (String) get(5);
    }

    /**
     * Setter for <code>jv_b2c_dev.address.city</code>.
     */
    public AddressRecord setCity(String value) {
        set(6, value);
        return this;
    }

    /**
     * Getter for <code>jv_b2c_dev.address.city</code>.
     */
    public String getCity() {
        return (String) get(6);
    }

    /**
     * Setter for <code>jv_b2c_dev.address.state</code>.
     */
    public AddressRecord setState(String value) {
        set(7, value);
        return this;
    }

    /**
     * Getter for <code>jv_b2c_dev.address.state</code>.
     */
    public String getState() {
        return (String) get(7);
    }

    /**
     * Setter for <code>jv_b2c_dev.address.postal_code</code>.
     */
    public AddressRecord setPostalCode(String value) {
        set(8, value);
        return this;
    }

    /**
     * Getter for <code>jv_b2c_dev.address.postal_code</code>.
     */
    public String getPostalCode() {
        return (String) get(8);
    }

    /**
     * Setter for <code>jv_b2c_dev.address.country</code>.
     */
    public AddressRecord setCountry(String value) {
        set(9, value);
        return this;
    }

    /**
     * Getter for <code>jv_b2c_dev.address.country</code>.
     */
    public String getCountry() {
        return (String) get(9);
    }

    /**
     * Setter for <code>jv_b2c_dev.address.phone</code>.
     */
    public AddressRecord setPhone(String value) {
        set(10, value);
        return this;
    }

    /**
     * Getter for <code>jv_b2c_dev.address.phone</code>.
     */
    public String getPhone() {
        return (String) get(10);
    }

    /**
     * Setter for <code>jv_b2c_dev.address.email</code>.
     */
    public AddressRecord setEmail(String value) {
        set(11, value);
        return this;
    }

    /**
     * Getter for <code>jv_b2c_dev.address.email</code>.
     */
    public String getEmail() {
        return (String) get(11);
    }

    /**
     * Setter for <code>jv_b2c_dev.address.default</code>.
     */
    public AddressRecord setDefault(Byte value) {
        set(12, value);
        return this;
    }

    /**
     * Getter for <code>jv_b2c_dev.address.default</code>.
     */
    public Byte getDefault() {
        return (Byte) get(12);
    }

    /**
     * Setter for <code>jv_b2c_dev.address.updated_ts</code>.
     */
    public AddressRecord setUpdatedTs(Timestamp value) {
        set(13, value);
        return this;
    }

    /**
     * Getter for <code>jv_b2c_dev.address.updated_ts</code>.
     */
    public Timestamp getUpdatedTs() {
        return (Timestamp) get(13);
    }

    /**
     * Setter for <code>jv_b2c_dev.address.created_ts</code>.
     */
    public AddressRecord setCreatedTs(Timestamp value) {
        set(14, value);
        return this;
    }

    /**
     * Getter for <code>jv_b2c_dev.address.created_ts</code>.
     */
    public Timestamp getCreatedTs() {
        return (Timestamp) get(14);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Record1<ULong> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record15 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row15<ULong, ULong, String, String, String, String, String, String, String, String, String, String, Byte, Timestamp, Timestamp> fieldsRow() {
        return (Row15) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row15<ULong, ULong, String, String, String, String, String, String, String, String, String, String, Byte, Timestamp, Timestamp> valuesRow() {
        return (Row15) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<ULong> field1() {
        return Address.ADDRESS.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<ULong> field2() {
        return Address.ADDRESS.ACCOUNT_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return Address.ADDRESS.NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field4() {
        return Address.ADDRESS.CARE_OF;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field5() {
        return Address.ADDRESS.LINE1;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field6() {
        return Address.ADDRESS.LINE2;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field7() {
        return Address.ADDRESS.CITY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field8() {
        return Address.ADDRESS.STATE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field9() {
        return Address.ADDRESS.POSTAL_CODE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field10() {
        return Address.ADDRESS.COUNTRY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field11() {
        return Address.ADDRESS.PHONE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field12() {
        return Address.ADDRESS.EMAIL;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Byte> field13() {
        return Address.ADDRESS.DEFAULT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field14() {
        return Address.ADDRESS.UPDATED_TS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field15() {
        return Address.ADDRESS.CREATED_TS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ULong component1() {
        return getId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ULong component2() {
        return getAccountId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component3() {
        return getName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component4() {
        return getCareOf();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component5() {
        return getLine1();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component6() {
        return getLine2();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component7() {
        return getCity();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component8() {
        return getState();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component9() {
        return getPostalCode();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component10() {
        return getCountry();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component11() {
        return getPhone();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component12() {
        return getEmail();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Byte component13() {
        return getDefault();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp component14() {
        return getUpdatedTs();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp component15() {
        return getCreatedTs();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ULong value1() {
        return getId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ULong value2() {
        return getAccountId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value3() {
        return getName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value4() {
        return getCareOf();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value5() {
        return getLine1();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value6() {
        return getLine2();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value7() {
        return getCity();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value8() {
        return getState();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value9() {
        return getPostalCode();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value10() {
        return getCountry();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value11() {
        return getPhone();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value12() {
        return getEmail();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Byte value13() {
        return getDefault();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value14() {
        return getUpdatedTs();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value15() {
        return getCreatedTs();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AddressRecord value1(ULong value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AddressRecord value2(ULong value) {
        setAccountId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AddressRecord value3(String value) {
        setName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AddressRecord value4(String value) {
        setCareOf(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AddressRecord value5(String value) {
        setLine1(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AddressRecord value6(String value) {
        setLine2(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AddressRecord value7(String value) {
        setCity(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AddressRecord value8(String value) {
        setState(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AddressRecord value9(String value) {
        setPostalCode(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AddressRecord value10(String value) {
        setCountry(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AddressRecord value11(String value) {
        setPhone(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AddressRecord value12(String value) {
        setEmail(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AddressRecord value13(Byte value) {
        setDefault(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AddressRecord value14(Timestamp value) {
        setUpdatedTs(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AddressRecord value15(Timestamp value) {
        setCreatedTs(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AddressRecord values(ULong value1, ULong value2, String value3, String value4, String value5, String value6, String value7, String value8, String value9, String value10, String value11, String value12, Byte value13, Timestamp value14, Timestamp value15) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        value8(value8);
        value9(value9);
        value10(value10);
        value11(value11);
        value12(value12);
        value13(value13);
        value14(value14);
        value15(value15);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached AddressRecord
     */
    public AddressRecord() {
        super(Address.ADDRESS);
    }

    /**
     * Create a detached, initialised AddressRecord
     */
    public AddressRecord(ULong id, ULong accountId, String name, String careOf, String line1, String line2, String city, String state, String postalCode, String country, String phone, String email, Byte default_, Timestamp updatedTs, Timestamp createdTs) {
        super(Address.ADDRESS);

        set(0, id);
        set(1, accountId);
        set(2, name);
        set(3, careOf);
        set(4, line1);
        set(5, line2);
        set(6, city);
        set(7, state);
        set(8, postalCode);
        set(9, country);
        set(10, phone);
        set(11, email);
        set(12, default_);
        set(13, updatedTs);
        set(14, createdTs);
    }
}
