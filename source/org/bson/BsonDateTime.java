package org.bson;

/* loaded from: classes6.dex */
public class BsonDateTime extends BsonValue implements Comparable<BsonDateTime> {

    /* renamed from: a */
    public final long f75745a;

    public BsonDateTime(long j) {
        this.f75745a = j;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass() && this.f75745a == ((BsonDateTime) obj).f75745a) {
            return true;
        }
        return false;
    }

    @Override // org.bson.BsonValue
    public BsonType getBsonType() {
        return BsonType.DATE_TIME;
    }

    public long getValue() {
        return this.f75745a;
    }

    public int hashCode() {
        long j = this.f75745a;
        return (int) (j ^ (j >>> 32));
    }

    public String toString() {
        return "BsonDateTime{value=" + this.f75745a + '}';
    }

    @Override // java.lang.Comparable
    public int compareTo(BsonDateTime bsonDateTime) {
        return Long.valueOf(this.f75745a).compareTo(Long.valueOf(bsonDateTime.f75745a));
    }
}
