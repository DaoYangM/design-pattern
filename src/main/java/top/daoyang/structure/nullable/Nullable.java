package top.daoyang.structure.nullable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

import java.util.Optional;

/**
 * 空对象模式
 */
public class Nullable {

    @Setter
    @AllArgsConstructor
    public static class User {
        private Address address;

        public Optional<Address> getAddress() {
            return Optional.ofNullable(address);
        }
    }

    @Setter
    @AllArgsConstructor
    public static class Address {

        private Country country;

        public Optional<Country> getCountry() {
            return Optional.ofNullable(country);
        }
    }

    @Data
    @RequiredArgsConstructor
    public static class Country {
        private final String isoCode;
    }
}

