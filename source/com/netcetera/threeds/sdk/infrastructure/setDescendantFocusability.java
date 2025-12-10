package com.netcetera.threeds.sdk.infrastructure;

import android.os.SystemClock;
import android.text.TextUtils;
import android.view.ViewConfiguration;
import com.netcetera.threeds.sdk.api.info.CertificateInfo;
import java.security.cert.CertificateEncodingException;
import java.security.cert.X509Certificate;
import java.util.Date;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes5.dex */
public class setDescendantFocusability implements com.netcetera.threeds.sdk.api.info.CertificateInfo {
    private static int ThreeDS2Service = 0;
    public static int ThreeDS2ServiceInstance = 0;
    public static char get = 2201;
    private static int initialize = 1;
    public static long valueOf;
    private final X509Certificate values;

    public setDescendantFocusability(X509Certificate x509Certificate) {
        this.values = x509Certificate;
    }

    /* JADX WARN: Code restructure failed: missing block: B:0:?, code lost:
        r12 = r12;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void valueOf(int r8, char r9, java.lang.String r10, java.lang.String r11, java.lang.String r12, java.lang.Object[] r13) {
        /*
            if (r12 == 0) goto L6
            char[] r12 = r12.toCharArray()
        L6:
            char[] r12 = (char[]) r12
            if (r11 == 0) goto Le
            char[] r11 = r11.toCharArray()
        Le:
            char[] r11 = (char[]) r11
            if (r10 == 0) goto L16
            char[] r10 = r10.toCharArray()
        L16:
            char[] r10 = (char[]) r10
            java.lang.Object r0 = com.netcetera.threeds.sdk.infrastructure.cleanup.get
            monitor-enter(r0)
            java.lang.Object r11 = r11.clone()     // Catch: java.lang.Throwable -> L7c
            char[] r11 = (char[]) r11     // Catch: java.lang.Throwable -> L7c
            java.lang.Object r12 = r12.clone()     // Catch: java.lang.Throwable -> L7c
            char[] r12 = (char[]) r12     // Catch: java.lang.Throwable -> L7c
            r1 = 0
            char r2 = r11[r1]     // Catch: java.lang.Throwable -> L7c
            r9 = r9 ^ r2
            char r9 = (char) r9     // Catch: java.lang.Throwable -> L7c
            r11[r1] = r9     // Catch: java.lang.Throwable -> L7c
            r9 = 2
            char r2 = r12[r9]     // Catch: java.lang.Throwable -> L7c
            char r8 = (char) r8     // Catch: java.lang.Throwable -> L7c
            int r2 = r2 + r8
            char r8 = (char) r2     // Catch: java.lang.Throwable -> L7c
            r12[r9] = r8     // Catch: java.lang.Throwable -> L7c
            int r8 = r10.length     // Catch: java.lang.Throwable -> L7c
            char[] r9 = new char[r8]     // Catch: java.lang.Throwable -> L7c
            com.netcetera.threeds.sdk.infrastructure.cleanup.ThreeDS2ServiceInstance = r1     // Catch: java.lang.Throwable -> L7c
        L3b:
            int r2 = com.netcetera.threeds.sdk.infrastructure.cleanup.ThreeDS2ServiceInstance     // Catch: java.lang.Throwable -> L7c
            if (r2 >= r8) goto L7e
            int r3 = r2 + 2
            int r3 = r3 % 4
            int r4 = r2 + 3
            int r4 = r4 % 4
            int r2 = r2 % 4
            char r2 = r11[r2]     // Catch: java.lang.Throwable -> L7c
            int r2 = r2 * 32718
            char r3 = r12[r3]     // Catch: java.lang.Throwable -> L7c
            int r2 = r2 + r3
            r5 = 65535(0xffff, float:9.1834E-41)
            int r2 = r2 % r5
            char r2 = (char) r2     // Catch: java.lang.Throwable -> L7c
            com.netcetera.threeds.sdk.infrastructure.cleanup.values = r2     // Catch: java.lang.Throwable -> L7c
            char r6 = r11[r4]     // Catch: java.lang.Throwable -> L7c
            int r6 = r6 * 32718
            int r6 = r6 + r3
            int r6 = r6 / r5
            char r3 = (char) r6     // Catch: java.lang.Throwable -> L7c
            r12[r4] = r3     // Catch: java.lang.Throwable -> L7c
            r11[r4] = r2     // Catch: java.lang.Throwable -> L7c
            int r3 = com.netcetera.threeds.sdk.infrastructure.cleanup.ThreeDS2ServiceInstance     // Catch: java.lang.Throwable -> L7c
            char r4 = r10[r3]     // Catch: java.lang.Throwable -> L7c
            r2 = r2 ^ r4
            long r4 = (long) r2     // Catch: java.lang.Throwable -> L7c
            long r6 = com.netcetera.threeds.sdk.infrastructure.setDescendantFocusability.valueOf     // Catch: java.lang.Throwable -> L7c
            long r4 = r4 ^ r6
            int r2 = com.netcetera.threeds.sdk.infrastructure.setDescendantFocusability.ThreeDS2ServiceInstance     // Catch: java.lang.Throwable -> L7c
            long r6 = (long) r2     // Catch: java.lang.Throwable -> L7c
            long r4 = r4 ^ r6
            char r2 = com.netcetera.threeds.sdk.infrastructure.setDescendantFocusability.get     // Catch: java.lang.Throwable -> L7c
            long r6 = (long) r2     // Catch: java.lang.Throwable -> L7c
            long r4 = r4 ^ r6
            int r2 = (int) r4     // Catch: java.lang.Throwable -> L7c
            char r2 = (char) r2     // Catch: java.lang.Throwable -> L7c
            r9[r3] = r2     // Catch: java.lang.Throwable -> L7c
            int r3 = r3 + 1
            com.netcetera.threeds.sdk.infrastructure.cleanup.ThreeDS2ServiceInstance = r3     // Catch: java.lang.Throwable -> L7c
            goto L3b
        L7c:
            r8 = move-exception
            goto L87
        L7e:
            java.lang.String r8 = new java.lang.String     // Catch: java.lang.Throwable -> L7c
            r8.<init>(r9)     // Catch: java.lang.Throwable -> L7c
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L7c
            r13[r1] = r8
            return
        L87:
            monitor-exit(r0)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.netcetera.threeds.sdk.infrastructure.setDescendantFocusability.valueOf(int, char, java.lang.String, java.lang.String, java.lang.String, java.lang.Object[]):void");
    }

    @Override // com.netcetera.threeds.sdk.api.info.CertificateInfo
    public String getCertPrefix() {
        int i = ThreeDS2Service + 9;
        initialize = i % 128;
        try {
            if (i % 2 == 0) {
                return C9669om.get(C9668ol.get(this.values.getEncoded()), 85);
            }
            return C9669om.get(C9668ol.get(this.values.getEncoded()), 50);
        } catch (CertificateEncodingException unused) {
            Object[] objArr = new Object[1];
            valueOf(629024434 - TextUtils.getOffsetBefore("", 0), (char) (40662 - TextUtils.indexOf((CharSequence) "", '0', 0)), "赮\ue50b\uf4ad", "뉷縦휥꒞", "\u0000\u0000\u0000\u0000", objArr);
            return ((String) objArr[0]).intern();
        }
    }

    @Override // com.netcetera.threeds.sdk.api.info.CertificateInfo
    public Date getExpiryDate() {
        int i = ThreeDS2Service + 73;
        initialize = i % 128;
        if (i % 2 == 0) {
            int i2 = 99 / 0;
            return this.values.getNotAfter();
        }
        return this.values.getNotAfter();
    }

    @Override // com.netcetera.threeds.sdk.api.info.CertificateInfo
    public String getName() {
        Object[] objArr = new Object[1];
        valueOf(ViewConfiguration.getDoubleTapTimeout() >> 16, (char) (ViewConfiguration.getMaximumFlingVelocity() >> 16), "竩\u0b5a\ued22蒑\uf686\udfaa\ue1cf䃻ᚊ儝", "璤䉁尷Ꚙ", "\u0000\u0000\u0000\u0000", objArr);
        Matcher matcher = Pattern.compile(((String) objArr[0]).intern()).matcher(this.values.getSubjectX500Principal().getName());
        if (!(!matcher.find())) {
            int i = ThreeDS2Service + 97;
            initialize = i % 128;
            if (i % 2 == 0) {
                return matcher.group(0);
            }
            return matcher.group(1);
        }
        Object[] objArr2 = new Object[1];
        valueOf(629024434 - (ViewConfiguration.getPressedStateDuration() >> 16), (char) ((SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 40662), "赮\ue50b\uf4ad", "뉷縦휥꒞", "\u0000\u0000\u0000\u0000", objArr2);
        String intern = ((String) objArr2[0]).intern();
        int i2 = ThreeDS2Service + 17;
        initialize = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 75 / 0;
        }
        return intern;
    }

    @Override // com.netcetera.threeds.sdk.api.info.CertificateInfo
    public CertificateInfo.CertificateType getType() {
        initialize = (ThreeDS2Service + 51) % 128;
        CertificateInfo.CertificateType certificateType = CertificateInfo.CertificateType.CERTIFICATE;
        int i = initialize + 77;
        ThreeDS2Service = i % 128;
        if (i % 2 != 0) {
            int i2 = 21 / 0;
        }
        return certificateType;
    }
}
