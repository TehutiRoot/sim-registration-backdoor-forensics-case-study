package com.netcetera.threeds.sdk.infrastructure;

import java.io.UnsupportedEncodingException;

/* renamed from: com.netcetera.threeds.sdk.infrastructure.ro */
/* loaded from: classes5.dex */
public class C9719ro {
    public static String ThreeDS2Service(byte[] bArr, String str) {
        if (bArr == null) {
            return null;
        }
        try {
            return new String(bArr, str);
        } catch (UnsupportedEncodingException unused) {
            throw valueOf(str);
        }
    }

    public static String get(byte[] bArr) {
        return ThreeDS2Service(bArr, "UTF-8");
    }

    public static byte[] valueOf(String str, String str2) {
        if (str == null) {
            return null;
        }
        try {
            return str.getBytes(str2);
        } catch (UnsupportedEncodingException unused) {
            throw valueOf(str2);
        }
    }

    public static byte[] values(String str) {
        return valueOf(str, "US-ASCII");
    }

    public static byte[] ThreeDS2Service(String str) {
        return valueOf(str, "UTF-8");
    }

    private static IllegalStateException valueOf(String str) {
        return new IllegalStateException("Unknown or unsupported character set name: " + str);
    }
}