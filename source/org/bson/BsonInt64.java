package org.bson;

import org.bson.types.Decimal128;

/* loaded from: classes6.dex */
public final class BsonInt64 extends BsonNumber implements Comparable<BsonInt64> {

    /* renamed from: a */
    public final long f75771a;

    public BsonInt64(long j) {
        this.f75771a = j;
    }

    @Override // org.bson.BsonNumber
    public Decimal128 decimal128Value() {
        return new Decimal128(this.f75771a);
    }

    @Override // org.bson.BsonNumber
    public double doubleValue() {
        return this.f75771a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && BsonInt64.class == obj.getClass() && this.f75771a == ((BsonInt64) obj).f75771a) {
            return true;
        }
        return false;
    }

    @Override // org.bson.BsonValue
    public BsonType getBsonType() {
        return BsonType.INT64;
    }

    public long getValue() {
        return this.f75771a;
    }

    public int hashCode() {
        long j = this.f75771a;
        return (int) (j ^ (j >>> 32));
    }

    @Override // org.bson.BsonNumber
    public int intValue() {
        return (int) this.f75771a;
    }

    @Override // org.bson.BsonNumber
    public long longValue() {
        return this.f75771a;
    }

    public String toString() {
        return "BsonInt64{value=" + this.f75771a + '}';
    }

    @Override // java.lang.Comparable
    public int compareTo(BsonInt64 bsonInt64) {
        long j = this.f75771a;
        long j2 = bsonInt64.f75771a;
        if (j < j2) {
            return -1;
        }
        return j == j2 ? 0 : 1;
    }
}
