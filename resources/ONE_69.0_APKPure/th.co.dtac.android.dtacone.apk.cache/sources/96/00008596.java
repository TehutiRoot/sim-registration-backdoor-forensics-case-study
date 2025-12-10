package com.fasterxml.jackson.annotation;

/* loaded from: classes3.dex */
public enum PropertyAccessor {
    GETTER,
    SETTER,
    CREATOR,
    FIELD,
    IS_GETTER,
    NONE,
    ALL;

    public boolean creatorEnabled() {
        if (this != CREATOR && this != ALL) {
            return false;
        }
        return true;
    }

    public boolean fieldEnabled() {
        if (this != FIELD && this != ALL) {
            return false;
        }
        return true;
    }

    public boolean getterEnabled() {
        if (this != GETTER && this != ALL) {
            return false;
        }
        return true;
    }

    public boolean isGetterEnabled() {
        if (this != IS_GETTER && this != ALL) {
            return false;
        }
        return true;
    }

    public boolean setterEnabled() {
        if (this != SETTER && this != ALL) {
            return false;
        }
        return true;
    }
}