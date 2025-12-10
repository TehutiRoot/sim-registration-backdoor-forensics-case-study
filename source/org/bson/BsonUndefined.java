package org.bson;

/* loaded from: classes6.dex */
public final class BsonUndefined extends BsonValue {
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && BsonUndefined.class == obj.getClass()) {
            return true;
        }
        return false;
    }

    @Override // org.bson.BsonValue
    public BsonType getBsonType() {
        return BsonType.UNDEFINED;
    }

    public int hashCode() {
        return 0;
    }
}
