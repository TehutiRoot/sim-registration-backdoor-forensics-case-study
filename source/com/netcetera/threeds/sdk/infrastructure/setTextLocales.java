package com.netcetera.threeds.sdk.infrastructure;

import android.content.Context;
import android.graphics.Color;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import ch.qos.logback.core.CoreConstants;
import com.netcetera.threeds.sdk.api.ThreeDS2Service;
import com.netcetera.threeds.sdk.api.p018ui.logic.UiCustomization;
import java.util.List;
import java.util.Map;
import kotlin.text.Typography;

/* loaded from: classes5.dex */
public class setTextLocales implements com.netcetera.threeds.sdk.api.ThreeDS2Service {
    public static char[] ThreeDS2ServiceInstance = {':', 'n', 'e', 'f', 'j', 'q', 'o', 'F', '+', '.', '.', '+', Typography.greater, '^', 'm', 'k', 'e', 'T', 'K', 'B', 'B', '\\', 'k', 't', 'o', 'f', 'd', 'I', 'K', 'k', 'k'};
    private static int get = 0;
    private static int values = 1;
    private final C9620ni ThreeDS2Service;
    private final com.netcetera.threeds.sdk.api.ThreeDS2Service valueOf;

    public setTextLocales(Object obj, C9620ni c9620ni) {
        try {
            this.valueOf = (com.netcetera.threeds.sdk.api.ThreeDS2Service) ((Class) get3DSServerTransactionID.ThreeDS2Service(MotionEvent.axisFromString("") + 3019, 59 - ExpandableListView.getPackedPositionChild(0L), (char) (ViewConfiguration.getJumpTapTimeout() >> 16))).getMethod(CoreConstants.VALUE_OF, null).invoke(obj, null);
            this.ThreeDS2Service = c9620ni;
        } catch (Throwable th2) {
            Throwable cause = th2.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th2;
        }
    }

    public static com.netcetera.threeds.sdk.api.ThreeDS2Service valueOf() {
        setTextLocales settextlocales = new setTextLocales(AuthenticationRequestParameters.valueOf((Class) get3DSServerTransactionID.ThreeDS2Service((SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 3017, 61 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)), (char) Color.blue(0))), new C9620ni());
        int i = values + 85;
        get = i % 128;
        if (i % 2 == 0) {
            return settextlocales;
        }
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:46:?, code lost:
        r12 = r12;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void values(java.lang.String r12, int[] r13, boolean r14, java.lang.Object[] r15) {
        /*
            if (r12 == 0) goto L8
            java.lang.String r0 = "ISO-8859-1"
            byte[] r12 = r12.getBytes(r0)
        L8:
            byte[] r12 = (byte[]) r12
            java.lang.Object r0 = com.netcetera.threeds.sdk.infrastructure.ConfigurationBuilder.values
            monitor-enter(r0)
            r1 = 0
            r2 = r13[r1]     // Catch: java.lang.Throwable -> L38
            r3 = 1
            r4 = r13[r3]     // Catch: java.lang.Throwable -> L38
            r5 = 2
            r6 = r13[r5]     // Catch: java.lang.Throwable -> L38
            r7 = 3
            r7 = r13[r7]     // Catch: java.lang.Throwable -> L38
            char[] r8 = com.netcetera.threeds.sdk.infrastructure.setTextLocales.ThreeDS2ServiceInstance     // Catch: java.lang.Throwable -> L38
            char[] r9 = new char[r4]     // Catch: java.lang.Throwable -> L38
            java.lang.System.arraycopy(r8, r2, r9, r1, r4)     // Catch: java.lang.Throwable -> L38
            if (r12 == 0) goto L49
            char[] r2 = new char[r4]     // Catch: java.lang.Throwable -> L38
            com.netcetera.threeds.sdk.infrastructure.ConfigurationBuilder.ThreeDS2Service = r1     // Catch: java.lang.Throwable -> L38
            r8 = 0
        L27:
            int r10 = com.netcetera.threeds.sdk.infrastructure.ConfigurationBuilder.ThreeDS2Service     // Catch: java.lang.Throwable -> L38
            if (r10 >= r4) goto L48
            r11 = r12[r10]     // Catch: java.lang.Throwable -> L38
            if (r11 != r3) goto L3a
            char r11 = r9[r10]     // Catch: java.lang.Throwable -> L38
            int r11 = r11 << r3
            int r11 = r11 + r3
            int r11 = r11 - r8
            char r8 = (char) r11     // Catch: java.lang.Throwable -> L38
            r2[r10] = r8     // Catch: java.lang.Throwable -> L38
            goto L41
        L38:
            r12 = move-exception
            goto L8d
        L3a:
            char r11 = r9[r10]     // Catch: java.lang.Throwable -> L38
            int r11 = r11 << r3
            int r11 = r11 - r8
            char r8 = (char) r11     // Catch: java.lang.Throwable -> L38
            r2[r10] = r8     // Catch: java.lang.Throwable -> L38
        L41:
            char r8 = r2[r10]     // Catch: java.lang.Throwable -> L38
            int r10 = r10 + 1
            com.netcetera.threeds.sdk.infrastructure.ConfigurationBuilder.ThreeDS2Service = r10     // Catch: java.lang.Throwable -> L38
            goto L27
        L48:
            r9 = r2
        L49:
            if (r7 <= 0) goto L58
            char[] r12 = new char[r4]     // Catch: java.lang.Throwable -> L38
            java.lang.System.arraycopy(r9, r1, r12, r1, r4)     // Catch: java.lang.Throwable -> L38
            int r2 = r4 - r7
            java.lang.System.arraycopy(r12, r1, r9, r2, r7)     // Catch: java.lang.Throwable -> L38
            java.lang.System.arraycopy(r12, r7, r9, r1, r2)     // Catch: java.lang.Throwable -> L38
        L58:
            if (r14 == 0) goto L6f
            char[] r12 = new char[r4]     // Catch: java.lang.Throwable -> L38
            com.netcetera.threeds.sdk.infrastructure.ConfigurationBuilder.ThreeDS2Service = r1     // Catch: java.lang.Throwable -> L38
        L5e:
            int r14 = com.netcetera.threeds.sdk.infrastructure.ConfigurationBuilder.ThreeDS2Service     // Catch: java.lang.Throwable -> L38
            if (r14 >= r4) goto L6e
            int r2 = r4 - r14
            int r2 = r2 - r3
            char r2 = r9[r2]     // Catch: java.lang.Throwable -> L38
            r12[r14] = r2     // Catch: java.lang.Throwable -> L38
            int r14 = r14 + 1
            com.netcetera.threeds.sdk.infrastructure.ConfigurationBuilder.ThreeDS2Service = r14     // Catch: java.lang.Throwable -> L38
            goto L5e
        L6e:
            r9 = r12
        L6f:
            if (r6 <= 0) goto L84
            com.netcetera.threeds.sdk.infrastructure.ConfigurationBuilder.ThreeDS2Service = r1     // Catch: java.lang.Throwable -> L38
        L73:
            int r12 = com.netcetera.threeds.sdk.infrastructure.ConfigurationBuilder.ThreeDS2Service     // Catch: java.lang.Throwable -> L38
            if (r12 >= r4) goto L84
            char r14 = r9[r12]     // Catch: java.lang.Throwable -> L38
            r2 = r13[r5]     // Catch: java.lang.Throwable -> L38
            int r14 = r14 - r2
            char r14 = (char) r14     // Catch: java.lang.Throwable -> L38
            r9[r12] = r14     // Catch: java.lang.Throwable -> L38
            int r12 = r12 + 1
            com.netcetera.threeds.sdk.infrastructure.ConfigurationBuilder.ThreeDS2Service = r12     // Catch: java.lang.Throwable -> L38
            goto L73
        L84:
            java.lang.String r12 = new java.lang.String     // Catch: java.lang.Throwable -> L38
            r12.<init>(r9)     // Catch: java.lang.Throwable -> L38
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L38
            r15[r1] = r12
            return
        L8d:
            monitor-exit(r0)
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.netcetera.threeds.sdk.infrastructure.setTextLocales.values(java.lang.String, int[], boolean, java.lang.Object[]):void");
    }

    @Override // com.netcetera.threeds.sdk.api.ThreeDS2Service
    public synchronized void cleanup(Context context) throws com.netcetera.threeds.sdk.api.exceptions.SDKNotInitializedException {
        get = (values + 19) % 128;
        this.valueOf.cleanup(context);
        int i = values + 81;
        get = i % 128;
        if (i % 2 != 0) {
            throw null;
        }
    }

    @Override // com.netcetera.threeds.sdk.api.ThreeDS2Service
    public synchronized com.netcetera.threeds.sdk.api.transaction.Transaction createTransaction(String str, String str2) throws com.netcetera.threeds.sdk.api.exceptions.InvalidInputException, com.netcetera.threeds.sdk.api.exceptions.SDKNotInitializedException, com.netcetera.threeds.sdk.api.exceptions.SDKRuntimeException {
        int i = get + 67;
        values = i % 128;
        if (i % 2 != 0) {
        } else {
            this.valueOf.createTransaction(str, str2);
            throw null;
        }
        return this.valueOf.createTransaction(str, str2);
    }

    @Override // com.netcetera.threeds.sdk.api.ThreeDS2Service
    public synchronized com.netcetera.threeds.sdk.api.info.SDKInfo getSDKInfo() throws com.netcetera.threeds.sdk.api.exceptions.SDKNotInitializedException, com.netcetera.threeds.sdk.api.exceptions.SDKRuntimeException {
        com.netcetera.threeds.sdk.api.info.SDKInfo sDKInfo;
        get = (values + 55) % 128;
        sDKInfo = this.valueOf.getSDKInfo();
        values = (get + 117) % 128;
        return sDKInfo;
    }

    @Override // com.netcetera.threeds.sdk.api.ThreeDS2Service
    public synchronized String getSDKVersion() throws com.netcetera.threeds.sdk.api.exceptions.SDKNotInitializedException, com.netcetera.threeds.sdk.api.exceptions.SDKRuntimeException {
        String sDKVersion;
        try {
            int i = values + 99;
            get = i % 128;
            if (i % 2 != 0) {
                sDKVersion = this.valueOf.getSDKVersion();
                int i2 = 74 / 0;
            } else {
                sDKVersion = this.valueOf.getSDKVersion();
            }
            values = (get + 93) % 128;
        } catch (Throwable th2) {
            throw th2;
        }
        return sDKVersion;
    }

    @Override // com.netcetera.threeds.sdk.api.ThreeDS2Service
    public synchronized List<com.netcetera.threeds.sdk.api.security.Warning> getWarnings() throws com.netcetera.threeds.sdk.api.exceptions.SDKNotInitializedException {
        List<com.netcetera.threeds.sdk.api.security.Warning> warnings;
        values = (get + 109) % 128;
        warnings = this.valueOf.getWarnings();
        values = (get + 55) % 128;
        return warnings;
    }

    @Override // com.netcetera.threeds.sdk.api.ThreeDS2Service
    public synchronized void initialize(Context context, com.netcetera.threeds.sdk.api.configparameters.ConfigParameters configParameters, String str, com.netcetera.threeds.sdk.api.p018ui.logic.UiCustomization uiCustomization) throws com.netcetera.threeds.sdk.api.exceptions.InvalidInputException, com.netcetera.threeds.sdk.api.exceptions.SDKAlreadyInitializedException, com.netcetera.threeds.sdk.api.exceptions.SDKRuntimeException {
        try {
            int i = get + 17;
            values = i % 128;
            if (i % 2 == 0) {
                C9620ni c9620ni = this.ThreeDS2Service;
                Object[] objArr = new Object[1];
                values("\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0001\u0000\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0001", new int[]{0, 31, 0, 12}, true, objArr);
                c9620ni.ThreeDS2Service(((String) objArr[0]).intern());
                this.valueOf.initialize(context, configParameters, str, uiCustomization);
            } else {
                C9620ni c9620ni2 = this.ThreeDS2Service;
                Object[] objArr2 = new Object[1];
                values("\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0001\u0000\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0001", new int[]{0, 31, 0, 12}, false, objArr2);
                c9620ni2.ThreeDS2Service(((String) objArr2[0]).intern());
                this.valueOf.initialize(context, configParameters, str, uiCustomization);
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // com.netcetera.threeds.sdk.api.ThreeDS2Service
    public void initialize(Context context, com.netcetera.threeds.sdk.api.configparameters.ConfigParameters configParameters, String str, Map<UiCustomization.UiCustomizationType, com.netcetera.threeds.sdk.api.p018ui.logic.UiCustomization> map) throws com.netcetera.threeds.sdk.api.exceptions.InvalidInputException, com.netcetera.threeds.sdk.api.exceptions.SDKAlreadyInitializedException, com.netcetera.threeds.sdk.api.exceptions.SDKRuntimeException {
        int i = values + 77;
        get = i % 128;
        if (i % 2 != 0) {
            C9620ni c9620ni = this.ThreeDS2Service;
            Object[] objArr = new Object[1];
            values("\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0001\u0000\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0001", new int[]{0, 31, 0, 12}, true, objArr);
            c9620ni.ThreeDS2Service(((String) objArr[0]).intern());
            this.valueOf.initialize(context, configParameters, str, map);
        } else {
            C9620ni c9620ni2 = this.ThreeDS2Service;
            Object[] objArr2 = new Object[1];
            values("\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0001\u0000\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0001", new int[]{0, 31, 0, 12}, false, objArr2);
            c9620ni2.ThreeDS2Service(((String) objArr2[0]).intern());
            this.valueOf.initialize(context, configParameters, str, map);
        }
        int i2 = values + 37;
        get = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
    }

    @Override // com.netcetera.threeds.sdk.api.ThreeDS2Service
    public void initialize(Context context, com.netcetera.threeds.sdk.api.configparameters.ConfigParameters configParameters, String str, Map<UiCustomization.UiCustomizationType, com.netcetera.threeds.sdk.api.p018ui.logic.UiCustomization> map, ThreeDS2Service.InitializationCallback initializationCallback) {
        get = (values + 63) % 128;
        C9620ni c9620ni = this.ThreeDS2Service;
        Object[] objArr = new Object[1];
        values("\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0001\u0000\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0001", new int[]{0, 31, 0, 12}, false, objArr);
        c9620ni.ThreeDS2Service(((String) objArr[0]).intern());
        this.valueOf.initialize(context, configParameters, str, map, initializationCallback);
        int i = values + 11;
        get = i % 128;
        if (i % 2 != 0) {
            int i2 = 17 / 0;
        }
    }
}
