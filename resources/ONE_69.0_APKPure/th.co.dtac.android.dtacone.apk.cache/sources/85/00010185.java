package org.bson;

/* loaded from: classes6.dex */
public final class BsonNull extends BsonValue {
    public static final BsonNull VALUE = new BsonNull();

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && BsonNull.class == obj.getClass()) {
            return true;
        }
        return false;
    }

    @Override // org.bson.BsonValue
    public BsonType getBsonType() {
        return BsonType.NULL;
    }

    public int hashCode() {
        return 0;
    }

    public String toString() {
        return "BsonNull";
    }
}