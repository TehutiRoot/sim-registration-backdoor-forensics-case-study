package com.google.api.client.json.webtoken;

import com.google.api.client.util.Preconditions;
import java.math.BigInteger;
import java.util.Arrays;

/* loaded from: classes4.dex */
public class DerEncoder {

    /* renamed from: a */
    public static byte f52199a = 48;

    /* renamed from: b */
    public static byte f52200b = 2;

    /* renamed from: a */
    public static byte[] m41720a(byte[] bArr) {
        boolean z;
        if (bArr.length == 64) {
            z = true;
        } else {
            z = false;
        }
        Preconditions.checkState(z);
        byte[] byteArray = new BigInteger(1, Arrays.copyOfRange(bArr, 0, 32)).toByteArray();
        byte[] byteArray2 = new BigInteger(1, Arrays.copyOfRange(bArr, 32, 64)).toByteArray();
        int length = byteArray.length + 6 + byteArray2.length;
        byte[] bArr2 = new byte[length];
        bArr2[0] = f52199a;
        bArr2[1] = (byte) (length - 2);
        bArr2[2] = f52200b;
        bArr2[3] = (byte) byteArray.length;
        System.arraycopy(byteArray, 0, bArr2, 4, byteArray.length);
        int length2 = byteArray.length;
        bArr2[length2 + 4] = f52200b;
        bArr2[length2 + 5] = (byte) byteArray2.length;
        System.arraycopy(byteArray2, 0, bArr2, length2 + 6, byteArray2.length);
        return bArr2;
    }
}
