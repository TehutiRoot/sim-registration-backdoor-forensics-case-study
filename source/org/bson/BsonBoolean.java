package org.bson;

/* loaded from: classes6.dex */
public final class BsonBoolean extends BsonValue implements Comparable<BsonBoolean> {

    /* renamed from: a */
    public final boolean f75744a;
    public static final BsonBoolean TRUE = new BsonBoolean(true);
    public static final BsonBoolean FALSE = new BsonBoolean(false);

    public BsonBoolean(boolean z) {
        this.f75744a = z;
    }

    public static BsonBoolean valueOf(boolean z) {
        if (z) {
            return TRUE;
        }
        return FALSE;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && BsonBoolean.class == obj.getClass() && this.f75744a == ((BsonBoolean) obj).f75744a) {
            return true;
        }
        return false;
    }

    @Override // org.bson.BsonValue
    public BsonType getBsonType() {
        return BsonType.BOOLEAN;
    }

    public boolean getValue() {
        return this.f75744a;
    }

    public int hashCode() {
        return this.f75744a ? 1 : 0;
    }

    public String toString() {
        return "BsonBoolean{value=" + this.f75744a + '}';
    }

    @Override // java.lang.Comparable
    public int compareTo(BsonBoolean bsonBoolean) {
        return Boolean.valueOf(this.f75744a).compareTo(Boolean.valueOf(bsonBoolean.f75744a));
    }
}
