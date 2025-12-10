package io.realm.internal.android;

/* loaded from: classes5.dex */
public class TypeUtils {
    public static byte[] convertNonPrimitiveBinaryToPrimitive(Byte[] bArr) {
        byte[] bArr2 = new byte[bArr.length];
        for (int i = 0; i < bArr.length; i++) {
            Byte b = bArr[i];
            if (b != null) {
                bArr2[i] = b.byteValue();
            } else {
                throw new IllegalArgumentException("Byte arrays cannot contain null values.");
            }
        }
        return bArr2;
    }

    public static Byte[] convertPrimitiveBinaryToNonPrimitive(byte[] bArr) {
        Byte[] bArr2 = new Byte[bArr.length];
        for (int i = 0; i < bArr.length; i++) {
            bArr2[i] = Byte.valueOf(bArr[i]);
        }
        return bArr2;
    }
}