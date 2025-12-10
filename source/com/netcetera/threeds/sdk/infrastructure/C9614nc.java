package com.netcetera.threeds.sdk.infrastructure;

import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import java.math.BigInteger;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* renamed from: com.netcetera.threeds.sdk.infrastructure.nc */
/* loaded from: classes5.dex */
public class C9614nc {
    public static long ThreeDS2ServiceInstance = 206108251769162773L;
    private static int valueOf = 0;
    private static int values = 1;
    private final Object ThreeDS2Service$30c565a5;

    public C9614nc(Object obj) {
        this.ThreeDS2Service$30c565a5 = obj;
    }

    /* JADX WARN: Code restructure failed: missing block: B:0:?, code lost:
        r8 = r8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void get(java.lang.String r8, int r9, java.lang.Object[] r10) {
        /*
            if (r8 == 0) goto L6
            char[] r8 = r8.toCharArray()
        L6:
            char[] r8 = (char[]) r8
            java.lang.Object r0 = com.netcetera.threeds.sdk.infrastructure.getWarnings.valueOf
            monitor-enter(r0)
            long r1 = com.netcetera.threeds.sdk.infrastructure.C9614nc.ThreeDS2ServiceInstance     // Catch: java.lang.Throwable -> L3a
            char[] r8 = com.netcetera.threeds.sdk.infrastructure.getWarnings.ThreeDS2Service(r1, r8, r9)     // Catch: java.lang.Throwable -> L3a
            r9 = 4
            com.netcetera.threeds.sdk.infrastructure.getWarnings.values = r9     // Catch: java.lang.Throwable -> L3a
        L14:
            int r1 = com.netcetera.threeds.sdk.infrastructure.getWarnings.values     // Catch: java.lang.Throwable -> L3a
            int r2 = r8.length     // Catch: java.lang.Throwable -> L3a
            if (r1 >= r2) goto L3c
            int r1 = r1 + (-4)
            com.netcetera.threeds.sdk.infrastructure.getWarnings.ThreeDS2ServiceInstance = r1     // Catch: java.lang.Throwable -> L3a
            int r1 = com.netcetera.threeds.sdk.infrastructure.getWarnings.values     // Catch: java.lang.Throwable -> L3a
            char r2 = r8[r1]     // Catch: java.lang.Throwable -> L3a
            int r3 = r1 % 4
            char r3 = r8[r3]     // Catch: java.lang.Throwable -> L3a
            r2 = r2 ^ r3
            long r2 = (long) r2     // Catch: java.lang.Throwable -> L3a
            int r4 = com.netcetera.threeds.sdk.infrastructure.getWarnings.ThreeDS2ServiceInstance     // Catch: java.lang.Throwable -> L3a
            long r4 = (long) r4     // Catch: java.lang.Throwable -> L3a
            long r6 = com.netcetera.threeds.sdk.infrastructure.C9614nc.ThreeDS2ServiceInstance     // Catch: java.lang.Throwable -> L3a
            long r4 = r4 * r6
            long r2 = r2 ^ r4
            int r3 = (int) r2     // Catch: java.lang.Throwable -> L3a
            char r2 = (char) r3     // Catch: java.lang.Throwable -> L3a
            r8[r1] = r2     // Catch: java.lang.Throwable -> L3a
            int r1 = com.netcetera.threeds.sdk.infrastructure.getWarnings.values     // Catch: java.lang.Throwable -> L3a
            int r1 = r1 + 1
            com.netcetera.threeds.sdk.infrastructure.getWarnings.values = r1     // Catch: java.lang.Throwable -> L3a
            goto L14
        L3a:
            r8 = move-exception
            goto L48
        L3c:
            java.lang.String r1 = new java.lang.String     // Catch: java.lang.Throwable -> L3a
            int r2 = r8.length     // Catch: java.lang.Throwable -> L3a
            int r2 = r2 - r9
            r1.<init>(r8, r9, r2)     // Catch: java.lang.Throwable -> L3a
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L3a
            r8 = 0
            r10[r8] = r1
            return
        L48:
            monitor-exit(r0)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.netcetera.threeds.sdk.infrastructure.C9614nc.get(java.lang.String, int, java.lang.Object[]):void");
    }

    public String ThreeDS2ServiceInstance(String str) {
        try {
            Object obj = this.ThreeDS2Service$30c565a5;
            Object[] objArr = new Object[1];
            get("찢챯Ử劽\ud995䆊鿃", AndroidCharacter.getMirror('0') - '/', objArr);
            MessageDigest messageDigest = (MessageDigest) ((Class) get3DSServerTransactionID.ThreeDS2Service(448 - View.resolveSize(0, 0), 65 - (ViewConfiguration.getJumpTapTimeout() >> 16), (char) (45053 - TextUtils.getOffsetAfter("", 0)))).getMethod("getSDKInfo", String.class).invoke(obj, ((String) objArr[0]).intern());
            messageDigest.update(str.getBytes(StandardCharsets.UTF_8), 0, str.length());
            byte[] digest = messageDigest.digest();
            BigInteger bigInteger = new BigInteger(1, digest);
            StringBuilder sb = new StringBuilder();
            Object[] objArr2 = new Object[1];
            get("귮귋\ue274깑⟺뇼", -MotionEvent.axisFromString(""), objArr2);
            sb.append(((String) objArr2[0]).intern());
            sb.append(digest.length << 1);
            Object[] objArr3 = new Object[1];
            get("ㅀㄸ콇ﳚ놣", (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), objArr3);
            sb.append(((String) objArr3[0]).intern());
            String format = String.format(sb.toString(), bigInteger);
            values = (valueOf + 89) % 128;
            return format;
        } catch (NoSuchAlgorithmException unused) {
            return "";
        }
    }
}
