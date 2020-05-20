package top.daoyang.structure.nullable;

import org.junit.jupiter.api.Test;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

class NullableTest {

    @Test
    public void nullable() {
        Nullable.User cn = new Nullable.User(new Nullable.Address(new Nullable.Country("cn")));

        Nullable.User nullObject = new Nullable.User(new Nullable.Address(null));

        assertNotEquals(Optional.of(cn)
                .flatMap(Nullable.User::getAddress)
                .flatMap(Nullable.Address::getCountry)
                .map(Nullable.Country::getIsoCode)
                .orElse("null").toUpperCase(), "Null");

        assertEquals(Optional.of(nullObject)
                .flatMap(Nullable.User::getAddress)
                .flatMap(Nullable.Address::getCountry)
                .map(Nullable.Country::getIsoCode)
                .orElse("null").toUpperCase(), "NULL");
    }
}