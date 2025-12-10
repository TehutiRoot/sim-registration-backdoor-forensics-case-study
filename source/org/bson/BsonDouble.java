package org.bson;

import java.math.BigDecimal;
import org.bson.types.Decimal128;

/* loaded from: classes6.dex */
public class BsonDouble extends BsonNumber implements Comparable<BsonDouble> {

    /* renamed from: a */
    public final double f75767a;

    public BsonDouble(double d) {
        this.f75767a = d;
    }

    @Override // org.bson.BsonNumber
    public Decimal128 decimal128Value() {
        if (Double.isNaN(this.f75767a)) {
            return Decimal128.NaN;
        }
        if (Double.isInfinite(this.f75767a)) {
            if (this.f75767a > 0.0d) {
                return Decimal128.POSITIVE_INFINITY;
            }
            return Decimal128.NEGATIVE_INFINITY;
        }
        return new Decimal128(new BigDecimal(this.f75767a));
    }

    @Override // org.bson.BsonNumber
    public double doubleValue() {
        return this.f75767a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass() && Double.compare(((BsonDouble) obj).f75767a, this.f75767a) == 0) {
            return true;
        }
        return false;
    }

    @Override // org.bson.BsonValue
    public BsonType getBsonType() {
        return BsonType.DOUBLE;
    }

    public double getValue() {
        return this.f75767a;
    }

    public int hashCode() {
        long doubleToLongBits = Double.doubleToLongBits(this.f75767a);
        return (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
    }

    @Override // org.bson.BsonNumber
    public int intValue() {
        return (int) this.f75767a;
    }

    @Override // org.bson.BsonNumber
    public long longValue() {
        return (long) this.f75767a;
    }

    public String toString() {
        return "BsonDouble{value=" + this.f75767a + '}';
    }

    @Override // java.lang.Comparable
    public int compareTo(BsonDouble bsonDouble) {
        return Double.compare(this.f75767a, bsonDouble.f75767a);
    }
}
