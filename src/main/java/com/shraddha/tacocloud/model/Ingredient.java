package com.shraddha.tacocloud.model;

import lombok.Data;
import lombok.RequiredArgsConstructor;

import javax.annotation.sql.DataSourceDefinition;

/**
 * Created by HOME on 01-07-2019.
 */
@Data @RequiredArgsConstructor
public class Ingredient {

    private final String id;
    private final String name;
    private final Type type;
    public static enum Type {
        WRAP, PROTEIN, VEGGIES, CHEESE, SAUCE
    }
}
