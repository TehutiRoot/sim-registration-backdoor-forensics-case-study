package org.bson;

import org.bson.assertions.Assertions;
import org.bson.types.Decimal128;

/* loaded from: classes6.dex */
public final class BsonDecimal128 extends BsonNumber {

    /* renamed from: a */
    public final Decimal128 f75748a;

    public BsonDecimal128(Decimal128 decimal128) {
        Assertions.notNull("value", decimal128);
        this.f75748a = decimal128;
    }

    @Override // org.bson.BsonNumber
    public Decimal128 decimal128Value() {
        return this.f75748a;
    }

    @Override // org.bson.BsonNumber
    public double doubleValue() {
        return this.f75748a.bigDecimalValue().doubleValue();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && BsonDecimal128.class == obj.getClass() && this.f75748a.equals(((BsonDecimal128) obj).f75748a)) {
            return true;
        }
        return false;
    }

    @Override // org.bson.BsonValue
    public BsonType getBsonType() {
        return BsonType.DECIMAL128;
    }

    public Decimal128 getValue() {
        return this.f75748a;
    }

    public int hashCode() {
        return this.f75748a.hashCode();
    }

    @Override // org.bson.BsonNumber
    public int intValue() {
        return this.f75748a.bigDecimalValue().intValue();
    }

    @Override // org.bson.BsonNumber
    public long longValue() {
        return this.f75748a.bigDecimalValue().longValue();
    }

    public String toString() {
        return "BsonDecimal128{value=" + this.f75748a + '}';
    }
}
