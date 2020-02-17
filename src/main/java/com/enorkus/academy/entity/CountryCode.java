package com.enorkus.academy.entity;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public enum CountryCode {
    LT,
    LV,
    EE,
    SE;

    public static List<String> getCountryCodes() {
        return Stream.of(CountryCode.values()).map(Enum::name).collect(Collectors.toList());
    }
}
