package org.bson;

import org.bouncycastle.asn1.cmc.BodyPartID;
import org.bson.internal.UnsignedLongs;

/* loaded from: classes6.dex */
public final class BsonTimestamp extends BsonValue implements Comparable<BsonTimestamp> {

    /* renamed from: a */
    public final long f75780a;

    public BsonTimestamp() {
        this.f75780a = 0L;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && BsonTimestamp.class == obj.getClass() && this.f75780a == ((BsonTimestamp) obj).f75780a) {
            return true;
        }
        return false;
    }

    @Override // org.bson.BsonValue
    public BsonType getBsonType() {
        return BsonType.TIMESTAMP;
    }

    public int getInc() {
        return (int) this.f75780a;
    }

    public int getTime() {
        return (int) (this.f75780a >> 32);
    }

    public long getValue() {
        return this.f75780a;
    }

    public int hashCode() {
        long j = this.f75780a;
        return (int) (j ^ (j >>> 32));
    }

    public String toString() {
        return "Timestamp{value=" + getValue() + ", seconds=" + getTime() + ", inc=" + getInc() + '}';
    }

    @Override // java.lang.Comparable
    public int compareTo(BsonTimestamp bsonTimestamp) {
        return UnsignedLongs.compare(this.f75780a, bsonTimestamp.f75780a);
    }

    public BsonTimestamp(long j) {
        this.f75780a = j;
    }

    public BsonTimestamp(int i, int i2) {
        this.f75780a = (i2 & BodyPartID.bodyIdMax) | (i << 32);
    }
}
