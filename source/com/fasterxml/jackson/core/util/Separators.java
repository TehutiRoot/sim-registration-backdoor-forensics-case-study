package com.fasterxml.jackson.core.util;

import java.io.Serializable;

/* loaded from: classes3.dex */
public class Separators implements Serializable {
    private static final long serialVersionUID = 1;
    private final char arrayValueSeparator;
    private final char objectEntrySeparator;
    private final char objectFieldValueSeparator;

    public Separators() {
        this(':', ',', ',');
    }

    public static Separators createDefaultInstance() {
        return new Separators();
    }

    public char getArrayValueSeparator() {
        return this.arrayValueSeparator;
    }

    public char getObjectEntrySeparator() {
        return this.objectEntrySeparator;
    }

    public char getObjectFieldValueSeparator() {
        return this.objectFieldValueSeparator;
    }

    public Separators withArrayValueSeparator(char c) {
        if (this.arrayValueSeparator == c) {
            return this;
        }
        return new Separators(this.objectFieldValueSeparator, this.objectEntrySeparator, c);
    }

    public Separators withObjectEntrySeparator(char c) {
        if (this.objectEntrySeparator == c) {
            return this;
        }
        return new Separators(this.objectFieldValueSeparator, c, this.arrayValueSeparator);
    }

    public Separators withObjectFieldValueSeparator(char c) {
        if (this.objectFieldValueSeparator == c) {
            return this;
        }
        return new Separators(c, this.objectEntrySeparator, this.arrayValueSeparator);
    }

    public Separators(char c, char c2, char c3) {
        this.objectFieldValueSeparator = c;
        this.objectEntrySeparator = c2;
        this.arrayValueSeparator = c3;
    }
}
