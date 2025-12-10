package org.bson.internal;

import java.util.UUID;
import org.bson.BSONException;
import org.bson.BsonBinarySubType;
import org.bson.BsonSerializationException;
import org.bson.UuidRepresentation;

/* loaded from: classes6.dex */
public final class UuidHelper {

    /* renamed from: org.bson.internal.UuidHelper$a */
    /* loaded from: classes6.dex */
    public static /* synthetic */ class C12932a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f75942a;

        static {
            int[] iArr = new int[UuidRepresentation.values().length];
            f75942a = iArr;
            try {
                iArr[UuidRepresentation.C_SHARP_LEGACY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f75942a[UuidRepresentation.JAVA_LEGACY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f75942a[UuidRepresentation.PYTHON_LEGACY.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f75942a[UuidRepresentation.STANDARD.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    /* renamed from: a */
    public static long m24189a(byte[] bArr, int i) {
        return ((bArr[i] & 255) << 56) | (bArr[i + 7] & 255) | ((bArr[i + 6] & 255) << 8) | ((bArr[i + 5] & 255) << 16) | ((bArr[i + 4] & 255) << 24) | ((bArr[i + 3] & 255) << 32) | ((bArr[i + 2] & 255) << 40) | ((bArr[i + 1] & 255) << 48);
    }

    /* renamed from: b */
    public static void m24188b(byte[] bArr, int i, int i2) {
        for (int i3 = (i2 + i) - 1; i < i3; i3--) {
            byte b = bArr[i];
            bArr[i] = bArr[i3];
            bArr[i3] = b;
            i++;
        }
    }

    /* renamed from: c */
    public static void m24187c(byte[] bArr, int i, long j) {
        bArr[i + 7] = (byte) (j & 255);
        bArr[i + 6] = (byte) ((j >> 8) & 255);
        bArr[i + 5] = (byte) ((j >> 16) & 255);
        bArr[i + 4] = (byte) ((j >> 24) & 255);
        bArr[i + 3] = (byte) ((j >> 32) & 255);
        bArr[i + 2] = (byte) ((j >> 40) & 255);
        bArr[i + 1] = (byte) ((j >> 48) & 255);
        bArr[i] = (byte) ((j >> 56) & 255);
    }

    public static UUID decodeBinaryToUuid(byte[] bArr, byte b, UuidRepresentation uuidRepresentation) {
        if (bArr.length == 16) {
            if (b == BsonBinarySubType.UUID_LEGACY.getValue()) {
                int i = C12932a.f75942a[uuidRepresentation.ordinal()];
                if (i != 1) {
                    if (i != 2) {
                        if (i != 3) {
                            if (i != 4) {
                                throw new BSONException("Unexpected UUID representation: " + uuidRepresentation);
                            }
                            throw new BSONException("Can not decode a subtype 3 (UUID legacy) BSON binary when the decoder is configured to use the standard UUID representation");
                        }
                    } else {
                        m24188b(bArr, 0, 8);
                        m24188b(bArr, 8, 8);
                    }
                } else {
                    m24188b(bArr, 0, 4);
                    m24188b(bArr, 4, 2);
                    m24188b(bArr, 6, 2);
                }
            }
            return new UUID(m24189a(bArr, 0), m24189a(bArr, 8));
        }
        throw new BsonSerializationException(String.format("Expected length to be 16, not %d.", Integer.valueOf(bArr.length)));
    }

    public static byte[] encodeUuidToBinary(UUID uuid, UuidRepresentation uuidRepresentation) {
        byte[] bArr = new byte[16];
        m24187c(bArr, 0, uuid.getMostSignificantBits());
        m24187c(bArr, 8, uuid.getLeastSignificantBits());
        int i = C12932a.f75942a[uuidRepresentation.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3 && i != 4) {
                    throw new BSONException("Unexpected UUID representation: " + uuidRepresentation);
                }
            } else {
                m24188b(bArr, 0, 8);
                m24188b(bArr, 8, 8);
            }
        } else {
            m24188b(bArr, 0, 4);
            m24188b(bArr, 4, 2);
            m24188b(bArr, 6, 2);
        }
        return bArr;
    }
}
