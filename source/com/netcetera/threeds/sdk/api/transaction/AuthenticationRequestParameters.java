package com.netcetera.threeds.sdk.api.transaction;

import android.view.ViewConfiguration;
import com.netcetera.threeds.sdk.api.exceptions.InvalidInputException;
import com.netcetera.threeds.sdk.infrastructure.C9621nj;
import org.bouncycastle.pqc.math.linearalgebra.Matrix;

/* loaded from: classes5.dex */
public class AuthenticationRequestParameters {
    public static boolean ThreeDS2Service = true;
    public static char[] ThreeDS2ServiceInstance = {'q', 'i', 'w', 'e', 'k', Matrix.MATRIX_TYPE_ZERO, 'v', 'm', 's', 'r'};
    public static boolean get = true;
    private static int onCompleted = 1;
    private static int onError = 0;
    public static int values = 4;
    private final String cleanup;
    private final String getSDKInfo;
    private final String getSDKVersion;
    private final String getWarnings;
    private final String initialize;
    private final String valueOf;

    public AuthenticationRequestParameters(String str, String str2, String str3, String str4, String str5, String str6) throws InvalidInputException {
        this.getSDKInfo = C9621nj.ThreeDS2ServiceInstance(str, "sdkTransactionID");
        this.valueOf = C9621nj.ThreeDS2ServiceInstance(str2, "deviceData");
        this.getSDKVersion = C9621nj.ThreeDS2ServiceInstance(str3, "sdkEphemeralPublicKey");
        this.cleanup = C9621nj.ThreeDS2ServiceInstance(str4, "sdkAppID");
        this.initialize = C9621nj.ThreeDS2ServiceInstance(str5, "sdkReferenceNumber");
        Object[] objArr = new Object[1];
        ThreeDS2ServiceInstance(127 - (ViewConfiguration.getScrollBarSize() >> 8), null, null, "\u008a\u0089\u0088\u0083\u0087\u0082\u0086\u0082\u0085\u0084\u0083\u0083\u0082\u0081", objArr);
        this.getWarnings = C9621nj.ThreeDS2ServiceInstance(str6, ((String) objArr[0]).intern());
    }

    /* JADX WARN: Code restructure failed: missing block: B:45:?, code lost:
        r9 = r9;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void ThreeDS2ServiceInstance(int r6, java.lang.String r7, int[] r8, java.lang.String r9, java.lang.Object[] r10) {
        /*
            if (r9 == 0) goto L8
            java.lang.String r0 = "ISO-8859-1"
            byte[] r9 = r9.getBytes(r0)
        L8:
            byte[] r9 = (byte[]) r9
            if (r7 == 0) goto L10
            char[] r7 = r7.toCharArray()
        L10:
            char[] r7 = (char[]) r7
            java.lang.Object r0 = com.netcetera.threeds.sdk.infrastructure.ThreeDS2Service.InitializationCallback.values
            monitor-enter(r0)
            char[] r1 = com.netcetera.threeds.sdk.api.transaction.AuthenticationRequestParameters.ThreeDS2ServiceInstance     // Catch: java.lang.Throwable -> L42
            int r2 = com.netcetera.threeds.sdk.api.transaction.AuthenticationRequestParameters.values     // Catch: java.lang.Throwable -> L42
            boolean r3 = com.netcetera.threeds.sdk.api.transaction.AuthenticationRequestParameters.ThreeDS2Service     // Catch: java.lang.Throwable -> L42
            r4 = 0
            if (r3 == 0) goto L4d
            int r7 = r9.length     // Catch: java.lang.Throwable -> L42
            com.netcetera.threeds.sdk.infrastructure.ThreeDS2Service.InitializationCallback.ThreeDS2Service = r7     // Catch: java.lang.Throwable -> L42
            char[] r7 = new char[r7]     // Catch: java.lang.Throwable -> L42
            com.netcetera.threeds.sdk.infrastructure.ThreeDS2Service.InitializationCallback.ThreeDS2ServiceInstance = r4     // Catch: java.lang.Throwable -> L42
        L25:
            int r8 = com.netcetera.threeds.sdk.infrastructure.ThreeDS2Service.InitializationCallback.ThreeDS2ServiceInstance     // Catch: java.lang.Throwable -> L42
            int r3 = com.netcetera.threeds.sdk.infrastructure.ThreeDS2Service.InitializationCallback.ThreeDS2Service     // Catch: java.lang.Throwable -> L42
            if (r8 >= r3) goto L44
            int r8 = com.netcetera.threeds.sdk.infrastructure.ThreeDS2Service.InitializationCallback.ThreeDS2ServiceInstance     // Catch: java.lang.Throwable -> L42
            int r3 = com.netcetera.threeds.sdk.infrastructure.ThreeDS2Service.InitializationCallback.ThreeDS2Service     // Catch: java.lang.Throwable -> L42
            int r3 = r3 + (-1)
            int r5 = com.netcetera.threeds.sdk.infrastructure.ThreeDS2Service.InitializationCallback.ThreeDS2ServiceInstance     // Catch: java.lang.Throwable -> L42
            int r3 = r3 - r5
            r3 = r9[r3]     // Catch: java.lang.Throwable -> L42
            int r3 = r3 + r6
            char r3 = r1[r3]     // Catch: java.lang.Throwable -> L42
            int r3 = r3 - r2
            char r3 = (char) r3     // Catch: java.lang.Throwable -> L42
            r7[r8] = r3     // Catch: java.lang.Throwable -> L42
            int r5 = r5 + 1
            com.netcetera.threeds.sdk.infrastructure.ThreeDS2Service.InitializationCallback.ThreeDS2ServiceInstance = r5     // Catch: java.lang.Throwable -> L42
            goto L25
        L42:
            r6 = move-exception
            goto Lab
        L44:
            java.lang.String r6 = new java.lang.String     // Catch: java.lang.Throwable -> L42
            r6.<init>(r7)     // Catch: java.lang.Throwable -> L42
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L42
            r10[r4] = r6
            return
        L4d:
            boolean r9 = com.netcetera.threeds.sdk.api.transaction.AuthenticationRequestParameters.get     // Catch: java.lang.Throwable -> L42
            if (r9 == 0) goto L7e
            int r8 = r7.length     // Catch: java.lang.Throwable -> L42
            com.netcetera.threeds.sdk.infrastructure.ThreeDS2Service.InitializationCallback.ThreeDS2Service = r8     // Catch: java.lang.Throwable -> L42
            char[] r8 = new char[r8]     // Catch: java.lang.Throwable -> L42
            com.netcetera.threeds.sdk.infrastructure.ThreeDS2Service.InitializationCallback.ThreeDS2ServiceInstance = r4     // Catch: java.lang.Throwable -> L42
        L58:
            int r9 = com.netcetera.threeds.sdk.infrastructure.ThreeDS2Service.InitializationCallback.ThreeDS2ServiceInstance     // Catch: java.lang.Throwable -> L42
            int r3 = com.netcetera.threeds.sdk.infrastructure.ThreeDS2Service.InitializationCallback.ThreeDS2Service     // Catch: java.lang.Throwable -> L42
            if (r9 >= r3) goto L75
            int r9 = com.netcetera.threeds.sdk.infrastructure.ThreeDS2Service.InitializationCallback.ThreeDS2ServiceInstance     // Catch: java.lang.Throwable -> L42
            int r3 = com.netcetera.threeds.sdk.infrastructure.ThreeDS2Service.InitializationCallback.ThreeDS2Service     // Catch: java.lang.Throwable -> L42
            int r3 = r3 + (-1)
            int r5 = com.netcetera.threeds.sdk.infrastructure.ThreeDS2Service.InitializationCallback.ThreeDS2ServiceInstance     // Catch: java.lang.Throwable -> L42
            int r3 = r3 - r5
            char r3 = r7[r3]     // Catch: java.lang.Throwable -> L42
            int r3 = r3 - r6
            char r3 = r1[r3]     // Catch: java.lang.Throwable -> L42
            int r3 = r3 - r2
            char r3 = (char) r3     // Catch: java.lang.Throwable -> L42
            r8[r9] = r3     // Catch: java.lang.Throwable -> L42
            int r5 = r5 + 1
            com.netcetera.threeds.sdk.infrastructure.ThreeDS2Service.InitializationCallback.ThreeDS2ServiceInstance = r5     // Catch: java.lang.Throwable -> L42
            goto L58
        L75:
            java.lang.String r6 = new java.lang.String     // Catch: java.lang.Throwable -> L42
            r6.<init>(r8)     // Catch: java.lang.Throwable -> L42
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L42
            r10[r4] = r6
            return
        L7e:
            int r7 = r8.length     // Catch: java.lang.Throwable -> L42
            com.netcetera.threeds.sdk.infrastructure.ThreeDS2Service.InitializationCallback.ThreeDS2Service = r7     // Catch: java.lang.Throwable -> L42
            char[] r7 = new char[r7]     // Catch: java.lang.Throwable -> L42
            com.netcetera.threeds.sdk.infrastructure.ThreeDS2Service.InitializationCallback.ThreeDS2ServiceInstance = r4     // Catch: java.lang.Throwable -> L42
        L85:
            int r9 = com.netcetera.threeds.sdk.infrastructure.ThreeDS2Service.InitializationCallback.ThreeDS2ServiceInstance     // Catch: java.lang.Throwable -> L42
            int r3 = com.netcetera.threeds.sdk.infrastructure.ThreeDS2Service.InitializationCallback.ThreeDS2Service     // Catch: java.lang.Throwable -> L42
            if (r9 >= r3) goto La2
            int r9 = com.netcetera.threeds.sdk.infrastructure.ThreeDS2Service.InitializationCallback.ThreeDS2ServiceInstance     // Catch: java.lang.Throwable -> L42
            int r3 = com.netcetera.threeds.sdk.infrastructure.ThreeDS2Service.InitializationCallback.ThreeDS2Service     // Catch: java.lang.Throwable -> L42
            int r3 = r3 + (-1)
            int r5 = com.netcetera.threeds.sdk.infrastructure.ThreeDS2Service.InitializationCallback.ThreeDS2ServiceInstance     // Catch: java.lang.Throwable -> L42
            int r3 = r3 - r5
            r3 = r8[r3]     // Catch: java.lang.Throwable -> L42
            int r3 = r3 - r6
            char r3 = r1[r3]     // Catch: java.lang.Throwable -> L42
            int r3 = r3 - r2
            char r3 = (char) r3     // Catch: java.lang.Throwable -> L42
            r7[r9] = r3     // Catch: java.lang.Throwable -> L42
            int r5 = r5 + 1
            com.netcetera.threeds.sdk.infrastructure.ThreeDS2Service.InitializationCallback.ThreeDS2ServiceInstance = r5     // Catch: java.lang.Throwable -> L42
            goto L85
        La2:
            java.lang.String r6 = new java.lang.String     // Catch: java.lang.Throwable -> L42
            r6.<init>(r7)     // Catch: java.lang.Throwable -> L42
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L42
            r10[r4] = r6
            return
        Lab:
            monitor-exit(r0)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.netcetera.threeds.sdk.api.transaction.AuthenticationRequestParameters.ThreeDS2ServiceInstance(int, java.lang.String, int[], java.lang.String, java.lang.Object[]):void");
    }

    public String getDeviceData() {
        int i = (onCompleted + 101) % 128;
        onError = i;
        String str = this.valueOf;
        onCompleted = (i + 27) % 128;
        return str;
    }

    public String getMessageVersion() {
        String str;
        int i = onError + 87;
        int i2 = i % 128;
        onCompleted = i2;
        if (i % 2 == 0) {
            str = this.getWarnings;
            int i3 = 91 / 0;
        } else {
            str = this.getWarnings;
        }
        int i4 = i2 + 43;
        onError = i4 % 128;
        if (i4 % 2 == 0) {
            return str;
        }
        throw null;
    }

    public String getSDKAppID() {
        int i = onError + 89;
        int i2 = i % 128;
        onCompleted = i2;
        if (i % 2 != 0) {
            String str = this.cleanup;
            onError = (i2 + 9) % 128;
            return str;
        }
        throw null;
    }

    public String getSDKEphemeralPublicKey() {
        int i = onCompleted + 73;
        int i2 = i % 128;
        onError = i2;
        if (i % 2 == 0) {
            String str = this.getSDKVersion;
            int i3 = i2 + 65;
            onCompleted = i3 % 128;
            if (i3 % 2 != 0) {
                return str;
            }
            throw null;
        }
        throw null;
    }

    public String getSDKReferenceNumber() {
        String str;
        int i = onError + 7;
        int i2 = i % 128;
        onCompleted = i2;
        if (i % 2 == 0) {
            str = this.initialize;
            int i3 = 29 / 0;
        } else {
            str = this.initialize;
        }
        onError = (i2 + 21) % 128;
        return str;
    }

    public String getSDKTransactionID() {
        int i = onCompleted;
        int i2 = i + 57;
        onError = i2 % 128;
        if (i2 % 2 == 0) {
            String str = this.getSDKInfo;
            onError = (i + 75) % 128;
            return str;
        }
        throw null;
    }
}
