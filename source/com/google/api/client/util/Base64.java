package com.google.api.client.util;

import com.google.common.p014io.BaseEncoding;

@Deprecated
/* loaded from: classes4.dex */
public class Base64 {

    /* renamed from: a */
    public static final BaseEncoding f52287a = BaseEncoding.base64().withSeparator("\n", 64);

    /* renamed from: b */
    public static final BaseEncoding f52288b = BaseEncoding.base64Url().withSeparator("\n", 64);

    public static byte[] decodeBase64(byte[] bArr) {
        return decodeBase64(StringUtils.newStringUtf8(bArr));
    }

    public static byte[] encodeBase64(byte[] bArr) {
        return StringUtils.getBytesUtf8(encodeBase64String(bArr));
    }

    public static String encodeBase64String(byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        return BaseEncoding.base64().encode(bArr);
    }

    public static byte[] encodeBase64URLSafe(byte[] bArr) {
        return StringUtils.getBytesUtf8(encodeBase64URLSafeString(bArr));
    }

    public static String encodeBase64URLSafeString(byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        return BaseEncoding.base64Url().omitPadding().encode(bArr);
    }

    public static byte[] decodeBase64(String str) {
        if (str == null) {
            return null;
        }
        try {
            return f52287a.decode(str);
        } catch (IllegalArgumentException e) {
            if (e.getCause() instanceof BaseEncoding.DecodingException) {
                return f52288b.decode(str.trim());
            }
            throw e;
        }
    }
}
