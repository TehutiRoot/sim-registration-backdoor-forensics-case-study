package com.netcetera.threeds.sdk.infrastructure;

import android.os.Process;
import android.text.TextUtils;
import android.view.KeyEvent;
import java.util.ArrayList;
import java.util.List;
import org.bouncycastle.asn1.eac.CertificateHolderAuthorization;

/* loaded from: classes5.dex */
public class setMax {
    private static int getSDKVersion = 1;
    private static int values;
    private final String ThreeDS2Service;
    private final String ThreeDS2ServiceInstance;
    private final List<setInterpolator> get;
    private final String valueOf;

    public setMax(String str, String str2, String str3, List<setInterpolator> list) {
        this.valueOf = str;
        this.ThreeDS2ServiceInstance = str2;
        this.ThreeDS2Service = str3;
        this.get = list;
    }

    public String ThreeDS2Service() {
        int i = getSDKVersion;
        int i2 = i & 91;
        int i3 = (i | 91) & (~i2);
        int i4 = -(-(i2 << 1));
        int i5 = (i3 ^ i4) + ((i3 & i4) << 1);
        values = i5 % 128;
        if (i5 % 2 == 0) {
            return this.ThreeDS2Service;
        }
        throw null;
    }

    public String get() {
        int i = getSDKVersion;
        int i2 = ((i ^ 61) | (i & 61)) << 1;
        int i3 = -(((~i) & 61) | (i & (-62)));
        int i4 = ((i2 & i3) + (i3 | i2)) % 128;
        values = i4;
        String str = this.valueOf;
        getSDKVersion = ((i4 ^ 55) + ((i4 & 55) << 1)) % 128;
        return str;
    }

    public String valueOf() {
        int i = values;
        String str = this.ThreeDS2ServiceInstance;
        int i2 = (i & 55) + (i | 55);
        getSDKVersion = i2 % 128;
        if (i2 % 2 != 0) {
            return str;
        }
        throw null;
    }

    public List<setInterpolator> values() {
        int i = getSDKVersion;
        int i2 = i & 7;
        int i3 = (i ^ 7) | i2;
        int i4 = (i2 & i3) + (i3 | i2);
        int i5 = i4 % 128;
        values = i5;
        if (i4 % 2 == 0) {
            List<setInterpolator> list = this.get;
            int i6 = i5 & 101;
            int i7 = (i5 ^ 101) | i6;
            getSDKVersion = ((i6 & i7) + (i7 | i6)) % 128;
            return list;
        }
        throw null;
    }

    /* loaded from: classes5.dex */
    public static class ThreeDS2Service {
        private static int cleanup = 0;
        private static int getWarnings = 1;
        public static int valueOf = 92;
        private final String ThreeDS2Service;
        private final String ThreeDS2ServiceInstance;
        private final String get;
        private final List<setInterpolator> values = new ArrayList();

        public ThreeDS2Service(String str, String str2) {
            this.get = str;
            this.ThreeDS2ServiceInstance = str2;
            Object[] objArr = new Object[1];
            ThreeDS2ServiceInstance(2 - TextUtils.indexOf("", "", 0, 0), (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 6, "\n\uffdd\u0000\u0005\u000b\u000e\u0000", KeyEvent.normalizeMetaState(0) + CertificateHolderAuthorization.CVCA, true, objArr);
            this.ThreeDS2Service = ((String) objArr[0]).intern();
        }

        /* JADX WARN: Code restructure failed: missing block: B:0:?, code lost:
            r8 = r8;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        private static void ThreeDS2ServiceInstance(int r6, int r7, java.lang.String r8, int r9, boolean r10, java.lang.Object[] r11) {
            /*
                if (r8 == 0) goto L6
                char[] r8 = r8.toCharArray()
            L6:
                char[] r8 = (char[]) r8
                java.lang.Object r0 = com.netcetera.threeds.sdk.infrastructure.apiKey.get
                monitor-enter(r0)
                char[] r1 = new char[r7]     // Catch: java.lang.Throwable -> L2f
                r2 = 0
                com.netcetera.threeds.sdk.infrastructure.apiKey.ThreeDS2ServiceInstance = r2     // Catch: java.lang.Throwable -> L2f
            L10:
                int r3 = com.netcetera.threeds.sdk.infrastructure.apiKey.ThreeDS2ServiceInstance     // Catch: java.lang.Throwable -> L2f
                if (r3 >= r7) goto L31
                char r3 = r8[r3]     // Catch: java.lang.Throwable -> L2f
                com.netcetera.threeds.sdk.infrastructure.apiKey.valueOf = r3     // Catch: java.lang.Throwable -> L2f
                int r3 = com.netcetera.threeds.sdk.infrastructure.apiKey.ThreeDS2ServiceInstance     // Catch: java.lang.Throwable -> L2f
                int r4 = com.netcetera.threeds.sdk.infrastructure.apiKey.valueOf     // Catch: java.lang.Throwable -> L2f
                int r4 = r4 + r9
                char r4 = (char) r4     // Catch: java.lang.Throwable -> L2f
                r1[r3] = r4     // Catch: java.lang.Throwable -> L2f
                int r3 = com.netcetera.threeds.sdk.infrastructure.apiKey.ThreeDS2ServiceInstance     // Catch: java.lang.Throwable -> L2f
                char r4 = r1[r3]     // Catch: java.lang.Throwable -> L2f
                int r5 = com.netcetera.threeds.sdk.infrastructure.setMax.ThreeDS2Service.valueOf     // Catch: java.lang.Throwable -> L2f
                int r4 = r4 - r5
                char r4 = (char) r4     // Catch: java.lang.Throwable -> L2f
                r1[r3] = r4     // Catch: java.lang.Throwable -> L2f
                int r3 = r3 + 1
                com.netcetera.threeds.sdk.infrastructure.apiKey.ThreeDS2ServiceInstance = r3     // Catch: java.lang.Throwable -> L2f
                goto L10
            L2f:
                r6 = move-exception
                goto L69
            L31:
                if (r6 <= 0) goto L48
                com.netcetera.threeds.sdk.infrastructure.apiKey.values = r6     // Catch: java.lang.Throwable -> L2f
                char[] r6 = new char[r7]     // Catch: java.lang.Throwable -> L2f
                java.lang.System.arraycopy(r1, r2, r6, r2, r7)     // Catch: java.lang.Throwable -> L2f
                int r8 = com.netcetera.threeds.sdk.infrastructure.apiKey.values     // Catch: java.lang.Throwable -> L2f
                int r9 = r7 - r8
                java.lang.System.arraycopy(r6, r2, r1, r9, r8)     // Catch: java.lang.Throwable -> L2f
                int r8 = com.netcetera.threeds.sdk.infrastructure.apiKey.values     // Catch: java.lang.Throwable -> L2f
                int r9 = r7 - r8
                java.lang.System.arraycopy(r6, r8, r1, r2, r9)     // Catch: java.lang.Throwable -> L2f
            L48:
                if (r10 == 0) goto L60
                char[] r6 = new char[r7]     // Catch: java.lang.Throwable -> L2f
                com.netcetera.threeds.sdk.infrastructure.apiKey.ThreeDS2ServiceInstance = r2     // Catch: java.lang.Throwable -> L2f
            L4e:
                int r8 = com.netcetera.threeds.sdk.infrastructure.apiKey.ThreeDS2ServiceInstance     // Catch: java.lang.Throwable -> L2f
                if (r8 >= r7) goto L5f
                int r9 = r7 - r8
                int r9 = r9 + (-1)
                char r9 = r1[r9]     // Catch: java.lang.Throwable -> L2f
                r6[r8] = r9     // Catch: java.lang.Throwable -> L2f
                int r8 = r8 + 1
                com.netcetera.threeds.sdk.infrastructure.apiKey.ThreeDS2ServiceInstance = r8     // Catch: java.lang.Throwable -> L2f
                goto L4e
            L5f:
                r1 = r6
            L60:
                java.lang.String r6 = new java.lang.String     // Catch: java.lang.Throwable -> L2f
                r6.<init>(r1)     // Catch: java.lang.Throwable -> L2f
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L2f
                r11[r2] = r6
                return
            L69:
                monitor-exit(r0)
                throw r6
            */
            throw new UnsupportedOperationException("Method not decompiled: com.netcetera.threeds.sdk.infrastructure.setMax.ThreeDS2Service.ThreeDS2ServiceInstance(int, int, java.lang.String, int, boolean, java.lang.Object[]):void");
        }

        public ThreeDS2Service ThreeDS2Service(List<setInterpolator> list) {
            getWarnings = (cleanup + 87) % 128;
            this.values.addAll(list);
            int i = cleanup + 33;
            getWarnings = i % 128;
            if (i % 2 != 0) {
                return this;
            }
            throw null;
        }

        public ThreeDS2Service valueOf(setInterpolator setinterpolator) {
            int i = getWarnings + 41;
            cleanup = i % 128;
            if (i % 2 == 0) {
                this.values.add(setinterpolator);
                int i2 = cleanup + 29;
                getWarnings = i2 % 128;
                if (i2 % 2 == 0) {
                    int i3 = 12 / 0;
                }
                return this;
            }
            this.values.add(setinterpolator);
            throw null;
        }

        public setMax ThreeDS2Service() {
            setMax setmax = new setMax(this.get, this.ThreeDS2ServiceInstance, this.ThreeDS2Service, this.values);
            cleanup = (getWarnings + 65) % 128;
            return setmax;
        }
    }
}
