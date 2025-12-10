package com.netcetera.threeds.sdk.infrastructure;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.security.SecureRandom;
import java.util.Arrays;

/* renamed from: com.netcetera.threeds.sdk.infrastructure.rj */
/* loaded from: classes5.dex */
public class C9714rj {
    public static final byte[] get = new byte[0];

    public static int[] ThreeDS2Service(byte[] bArr) {
        int[] iArr = new int[bArr.length];
        for (int i = 0; i < bArr.length; i++) {
            iArr[i] = ThreeDS2ServiceInstance(bArr[i]);
        }
        return iArr;
    }

    public static int ThreeDS2ServiceInstance(byte b) {
        return b >= 0 ? b : 256 - (~(b - 1));
    }

    public static byte[] get(byte[] bArr) {
        return values(bArr, 0, bArr.length / 2);
    }

    public static byte[] valueOf(byte[] bArr) {
        int length = bArr.length / 2;
        return values(bArr, length, length);
    }

    public static byte[] values(byte[]... bArr) {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            for (byte[] bArr2 : bArr) {
                byteArrayOutputStream.write(bArr2);
            }
            return byteArrayOutputStream.toByteArray();
        } catch (IOException e) {
            throw new IllegalStateException("IOEx from ByteArrayOutputStream?!", e);
        }
    }

    public static byte[] ThreeDS2ServiceInstance(long j) {
        ByteBuffer allocate = ByteBuffer.allocate(8);
        allocate.putLong(j);
        return allocate.array();
    }

    public static int get(int i) {
        if (i > 268435455 || i < 0) {
            throw new C9723rt("Invalid byte length (" + i + ") for converting to bit length");
        }
        return i * 8;
    }

    public static int valueOf(int i) {
        return i / 8;
    }

    public static byte[] ThreeDS2Service(int i) {
        ByteBuffer allocate = ByteBuffer.allocate(4);
        allocate.putInt(i);
        return allocate.array();
    }

    public static byte[] ThreeDS2ServiceInstance(int i, SecureRandom secureRandom) {
        if (secureRandom == null) {
            secureRandom = new SecureRandom();
        }
        byte[] bArr = new byte[i];
        secureRandom.nextBytes(bArr);
        return bArr;
    }

    public static byte[] values(byte[] bArr, int i, int i2) {
        byte[] bArr2 = new byte[i2];
        System.arraycopy(bArr, i, bArr2, 0, i2);
        return bArr2;
    }

    public static boolean ThreeDS2Service(byte[] bArr, byte[] bArr2) {
        if (bArr == null) {
            bArr = get;
        }
        if (bArr2 == null) {
            bArr2 = get;
        }
        int min = Math.min(bArr.length, bArr2.length);
        int max = Math.max(bArr.length, bArr2.length);
        int i = 0;
        for (int i2 = 0; i2 < min; i2++) {
            i |= bArr[i2] ^ bArr2[i2];
        }
        return i == 0 && min == max;
    }

    public static String ThreeDS2ServiceInstance(byte[] bArr) {
        String ThreeDS2Service = new C9662oq().ThreeDS2Service(bArr);
        int[] ThreeDS2Service2 = ThreeDS2Service(bArr);
        return Arrays.toString(ThreeDS2Service2) + "(" + ThreeDS2Service2.length + "bytes/" + get(ThreeDS2Service2.length) + "bits) | base64url encoded: " + ThreeDS2Service;
    }

    public static int values(byte[] bArr) {
        return get(bArr.length);
    }

    public static byte[] values(int i) {
        return ThreeDS2ServiceInstance(i, null);
    }
}