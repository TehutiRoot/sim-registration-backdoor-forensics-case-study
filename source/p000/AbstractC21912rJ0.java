package p000;

import java.math.BigDecimal;
import org.bson.BsonInvalidOperationException;
import org.bson.BsonReader;
import org.bson.BsonType;
import org.bson.types.Decimal128;

/* renamed from: rJ0  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC21912rJ0 {

    /* renamed from: rJ0$a */
    /* loaded from: classes6.dex */
    public static /* synthetic */ class C13246a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f77237a;

        static {
            int[] iArr = new int[BsonType.values().length];
            f77237a = iArr;
            try {
                iArr[BsonType.INT32.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f77237a[BsonType.INT64.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f77237a[BsonType.DOUBLE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f77237a[BsonType.DECIMAL128.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    /* renamed from: a */
    public static double m23346a(BsonReader bsonReader) {
        BsonType currentBsonType = bsonReader.getCurrentBsonType();
        int i = C13246a.f77237a[currentBsonType.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i == 4) {
                        Decimal128 readDecimal128 = bsonReader.readDecimal128();
                        try {
                            double doubleValue = readDecimal128.doubleValue();
                            if (!readDecimal128.equals(new Decimal128(new BigDecimal(doubleValue)))) {
                                throw m23343d(Double.class, readDecimal128);
                            }
                            return doubleValue;
                        } catch (NumberFormatException unused) {
                            throw m23343d(Double.class, readDecimal128);
                        }
                    }
                    throw new BsonInvalidOperationException(String.format("Invalid numeric type, found: %s", currentBsonType));
                }
                return bsonReader.readDouble();
            }
            long readInt64 = bsonReader.readInt64();
            double d = readInt64;
            if (readInt64 == ((long) d)) {
                return d;
            }
            throw m23343d(Double.class, Long.valueOf(readInt64));
        }
        return bsonReader.readInt32();
    }

    /* renamed from: b */
    public static int m23345b(BsonReader bsonReader) {
        int i;
        BsonType currentBsonType = bsonReader.getCurrentBsonType();
        int i2 = C13246a.f77237a[currentBsonType.ordinal()];
        if (i2 != 1) {
            if (i2 != 2) {
                if (i2 != 3) {
                    if (i2 == 4) {
                        Decimal128 readDecimal128 = bsonReader.readDecimal128();
                        int intValue = readDecimal128.intValue();
                        if (!readDecimal128.equals(new Decimal128(intValue))) {
                            throw m23343d(Integer.class, readDecimal128);
                        }
                        return intValue;
                    }
                    throw new BsonInvalidOperationException(String.format("Invalid numeric type, found: %s", currentBsonType));
                }
                double readDouble = bsonReader.readDouble();
                i = (int) readDouble;
                if (readDouble != i) {
                    throw m23343d(Integer.class, Double.valueOf(readDouble));
                }
            } else {
                long readInt64 = bsonReader.readInt64();
                i = (int) readInt64;
                if (readInt64 != i) {
                    throw m23343d(Integer.class, Long.valueOf(readInt64));
                }
            }
            return i;
        }
        return bsonReader.readInt32();
    }

    /* renamed from: c */
    public static long m23344c(BsonReader bsonReader) {
        BsonType currentBsonType = bsonReader.getCurrentBsonType();
        int i = C13246a.f77237a[currentBsonType.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i == 4) {
                        Decimal128 readDecimal128 = bsonReader.readDecimal128();
                        long longValue = readDecimal128.longValue();
                        if (!readDecimal128.equals(new Decimal128(longValue))) {
                            throw m23343d(Long.class, readDecimal128);
                        }
                        return longValue;
                    }
                    throw new BsonInvalidOperationException(String.format("Invalid numeric type, found: %s", currentBsonType));
                }
                double readDouble = bsonReader.readDouble();
                long j = (long) readDouble;
                if (readDouble == j) {
                    return j;
                }
                throw m23343d(Long.class, Double.valueOf(readDouble));
            }
            return bsonReader.readInt64();
        }
        return bsonReader.readInt32();
    }

    /* renamed from: d */
    public static BsonInvalidOperationException m23343d(Class cls, Number number) {
        return new BsonInvalidOperationException(String.format("Could not convert `%s` to a %s without losing precision", number, cls));
    }
}
