package com.dragontalker.uml.composition;

import com.dragontalker.uml.dependence.IDCard;

public class Person {
    // Aggregation
    private IDCard card;

    // Composition
    private Head head = new Head();
}
