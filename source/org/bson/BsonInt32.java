package org.bson;

import org.bson.types.Decimal128;

/* loaded from: classes6.dex */
public final class BsonInt32 extends BsonNumber implements Comparable<BsonInt32> {

    /* renamed from: a */
    public final int f75770a;

    public BsonInt32(int i) {
        this.f75770a = i;
    }

    @Override // org.bson.BsonNumber
    public Decimal128 decimal128Value() {
        return new Decimal128(this.f75770a);
    }

    @Override // org.bson.BsonNumber
    public double doubleValue() {
        return this.f75770a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && BsonInt32.class == obj.getClass() && this.f75770a == ((BsonInt32) obj).f75770a) {
            return true;
        }
        return false;
    }

    @Override // org.bson.BsonValue
    public BsonType getBsonType() {
        return BsonType.INT32;
    }

    public int getValue() {
        return this.f75770a;
    }

    public int hashCode() {
        return this.f75770a;
    }

    @Override // org.bson.BsonNumber
    public int intValue() {
        return this.f75770a;
    }

    @Override // org.bson.BsonNumber
    public long longValue() {
        return this.f75770a;
    }

    public String toString() {
        return "BsonInt32{value=" + this.f75770a + '}';
    }

    @Override // java.lang.Comparable
    public int compareTo(BsonInt32 bsonInt32) {
        int i = this.f75770a;
        int i2 = bsonInt32.f75770a;
        if (i < i2) {
            return -1;
        }
        return i == i2 ? 0 : 1;
    }
}
