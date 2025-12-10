package com.netcetera.threeds.sdk.infrastructure;

import android.graphics.ImageFormat;
import android.net.Uri;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.view.ViewConfiguration;

/* loaded from: classes5.dex */
public class setWidth {
    public static char ThreeDS2Service = 0;
    public static long ThreeDS2ServiceInstance = 0;
    private static int cleanup = 0;
    private static int getSDKInfo = 1;
    public static int valueOf;
    private static final String values;
    private final InterfaceC9652ns get = C9653nt.ThreeDS2ServiceInstance(setWidth.class);
    private final String getWarnings;

    static {
        ThreeDS2Service();
        Object[] objArr = new Object[1];
        get((CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 2004385542, (char) (1 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1))), "\uec20뼆떐ਗ਼ं饎礊", "أ硿칷퉝", "\u0000\u0000\u0000\u0000", objArr);
        values = ((String) objArr[0]).intern();
        cleanup = (getSDKInfo + 67) % 128;
    }

    public setWidth(String str) {
        this.getWarnings = str;
    }

    public static void ThreeDS2Service() {
        valueOf = 0;
        ThreeDS2Service = (char) 8980;
        ThreeDS2ServiceInstance = 0L;
    }

    public boolean get(Uri uri) {
        if (C9669om.ThreeDS2Service(this.getWarnings)) {
            cleanup = (getSDKInfo + 45) % 128;
            ViewConfiguration.getScrollDefaultDelay();
            TextUtils.indexOf((CharSequence) "", '0');
            return false;
        } else if (uri == null) {
            getSDKInfo = (cleanup + 1) % 128;
            Process.getGidForName("");
            TextUtils.indexOf((CharSequence) "", '0', 0, 0);
            return false;
        } else {
            Uri parse = Uri.parse(this.getWarnings);
            if (ThreeDS2Service(parse.getScheme(), uri.getScheme(), true) && ThreeDS2Service(parse.getAuthority(), uri.getAuthority(), true) && ThreeDS2Service(parse.getPath(), uri.getPath(), false)) {
                Object[] objArr = new Object[1];
                get(2004385542 - (ViewConfiguration.getMaximumFlingVelocity() >> 16), (char) (ImageFormat.getBitsPerPixel(0) + 1), "\uec20뼆떐ਗ਼ं饎礊", "أ硿칷퉝", "\u0000\u0000\u0000\u0000", objArr);
                String queryParameter = parse.getQueryParameter(((String) objArr[0]).intern());
                Object[] objArr2 = new Object[1];
                get(TextUtils.getCapsMode("", 0, 0) + 2004385542, (char) (ViewConfiguration.getTapTimeout() >> 16), "\uec20뼆떐ਗ਼ं饎礊", "أ硿칷퉝", "\u0000\u0000\u0000\u0000", objArr2);
                return ThreeDS2Service(queryParameter, uri.getQueryParameter(((String) objArr2[0]).intern()), true);
            }
            return false;
        }
    }

    private boolean ThreeDS2Service(String str, String str2, boolean z) {
        int i = cleanup + 37;
        getSDKInfo = i % 128;
        if (i % 2 != 0) {
            if ((z && C9669om.valueOf(str, str2)) || (!C9669om.valueOf(str, str2))) {
                return false;
            }
            getSDKInfo = (cleanup + 59) % 128;
            return true;
        }
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:0:?, code lost:
        r12 = r12;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void get(int r8, char r9, java.lang.String r10, java.lang.String r11, java.lang.String r12, java.lang.Object[] r13) {
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
            long r6 = com.netcetera.threeds.sdk.infrastructure.setWidth.ThreeDS2ServiceInstance     // Catch: java.lang.Throwable -> L7c
            long r4 = r4 ^ r6
            int r2 = com.netcetera.threeds.sdk.infrastructure.setWidth.valueOf     // Catch: java.lang.Throwable -> L7c
            long r6 = (long) r2     // Catch: java.lang.Throwable -> L7c
            long r4 = r4 ^ r6
            char r2 = com.netcetera.threeds.sdk.infrastructure.setWidth.ThreeDS2Service     // Catch: java.lang.Throwable -> L7c
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
        throw new UnsupportedOperationException("Method not decompiled: com.netcetera.threeds.sdk.infrastructure.setWidth.get(int, char, java.lang.String, java.lang.String, java.lang.String, java.lang.Object[]):void");
    }
}
