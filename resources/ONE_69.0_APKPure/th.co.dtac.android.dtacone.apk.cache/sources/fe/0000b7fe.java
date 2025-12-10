package com.google.zxing.common;

import java.nio.charset.Charset;

/* loaded from: classes5.dex */
public final class StringUtils {
    public static final String GB2312 = "GB2312";
    public static final String SHIFT_JIS = "SJIS";

    /* renamed from: a */
    public static final String f57784a;

    /* renamed from: b */
    public static final boolean f57785b;

    static {
        boolean z;
        String name = Charset.defaultCharset().name();
        f57784a = name;
        if (!SHIFT_JIS.equalsIgnoreCase(name) && !"EUC_JP".equalsIgnoreCase(name)) {
            z = false;
        } else {
            z = true;
        }
        f57785b = z;
    }

    /* JADX WARN: Removed duplicated region for block: B:136:0x00f6 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00ac  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.String guessEncoding(byte[] r21, java.util.Map<com.google.zxing.DecodeHintType, ?> r22) {
        /*
            Method dump skipped, instructions count: 321
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.zxing.common.StringUtils.guessEncoding(byte[], java.util.Map):java.lang.String");
    }
}