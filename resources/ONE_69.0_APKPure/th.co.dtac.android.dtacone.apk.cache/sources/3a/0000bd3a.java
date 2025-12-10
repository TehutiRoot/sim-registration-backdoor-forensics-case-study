package com.netcetera.threeds.sdk.infrastructure;

import android.graphics.Color;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import java.io.Serializable;
import java.nio.charset.StandardCharsets;
import java.util.Objects;
import kotlin.text.Typography;
import org.slf4j.Logger;
import org.slf4j.helpers.MessageFormatter;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.netcetera.threeds.sdk.infrastructure.np */
/* loaded from: classes5.dex */
public class C9639np implements InterfaceC9641ns, Serializable {
    public static char[] ThreeDS2ServiceInstance = {173, 218, 208, 222, 219, 213, 140, 158, 154, 161, 156, 145, 223, 207, 212, 205, 216, 209, 211, Typography.degree, 224, Typography.plusMinus, 229, 192, 227, 180, 185, 184, 220, 203};
    private static int cleanup = 1;
    public static boolean get = true;
    private static int getSDKVersion = 0;
    public static int valueOf = 108;
    public static boolean values = true;
    private final Logger ThreeDS2Service;

    /* renamed from: com.netcetera.threeds.sdk.infrastructure.np$get */
    /* loaded from: classes5.dex */
    public interface get {
        void valueOf(String str);
    }

    public C9639np(Logger logger) {
        this.ThreeDS2Service = logger;
    }

    public static /* synthetic */ void ThreeDS2Service(String str) {
        getSDKVersion = (cleanup + 121) % 128;
        get(str);
        int i = cleanup + 27;
        getSDKVersion = i % 128;
        if (i % 2 != 0) {
            throw null;
        }
    }

    private static /* synthetic */ void get(String str) {
        Object obj;
        int i = cleanup + 5;
        getSDKVersion = i % 128;
        if (i % 2 != 0) {
            Object[] objArr = new Object[1];
            valueOf((CdmaCellLocation.convertQuartSecToDecDegrees(1) > 1.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(1) == 1.0d ? 0 : -1)) * 115, null, null, "\u0093\u0085\u0091\u009e\u0092\u0093\u0082\u0092\u0091\u0091\u0090\u008f\u008e\u009e\u0083\u0092\u0095\u009d\u0097\u0084\u008e\u0082\u0092", objArr);
            obj = objArr[0];
        } else {
            Object[] objArr2 = new Object[1];
            valueOf(127 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), null, null, "\u0093\u0085\u0091\u009e\u0092\u0093\u0082\u0092\u0091\u0091\u0090\u008f\u008e\u009e\u0083\u0092\u0095\u009d\u0097\u0084\u008e\u0082\u0092", objArr2);
            obj = objArr2[0];
        }
        ((String) obj).intern();
        int i2 = getSDKVersion + 99;
        cleanup = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
    }

    private void values(get getVar, String str, Object... objArr) {
        int i = getSDKVersion + 83;
        cleanup = i % 128;
        try {
            if (i % 2 != 0) {
                if (C9658om.ThreeDS2ServiceInstance(str) && objArr != null && objArr.length > 0) {
                    getSDKVersion = (cleanup + 11) % 128;
                    getVar.valueOf(MessageFormatter.arrayFormat(str, objArr).getMessage());
                    return;
                }
                getVar.valueOf(str);
                return;
            }
            C9658om.ThreeDS2ServiceInstance(str);
            throw null;
        } catch (Throwable unused) {
        }
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.InterfaceC9641ns
    public void ThreeDS2ServiceInstance(String str) {
        Logger logger = this.ThreeDS2Service;
        Objects.requireNonNull(logger);
        get(str, new C9647ny(logger));
        cleanup = (getSDKVersion + 85) % 128;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.InterfaceC9641ns
    public void valueOf(String str) {
        Logger logger = this.ThreeDS2Service;
        Objects.requireNonNull(logger);
        get(str, new C9644nv(logger));
        int i = getSDKVersion + 17;
        cleanup = i % 128;
        if (i % 2 == 0) {
            throw null;
        }
    }

    private void get(String str, get getVar) {
        try {
            if (C9658om.ThreeDS2ServiceInstance(str)) {
                cleanup = (getSDKVersion + 99) % 128;
                if (str.length() > 3584) {
                    getVar.valueOf(str.substring(0, 3584));
                    get(str.substring(3584), getVar);
                } else {
                    getVar.valueOf(str);
                    cleanup = (getSDKVersion + 43) % 128;
                }
            }
        } catch (Throwable unused) {
        }
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.InterfaceC9641ns
    public void ThreeDS2Service(String str, Object... objArr) {
        values(new C9646nx(this), str, objArr);
        int i = cleanup + 113;
        getSDKVersion = i % 128;
        if (i % 2 != 0) {
            throw null;
        }
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.InterfaceC9641ns
    public void valueOf(String str, Object... objArr) {
        values(new C9643nu(this), str, objArr);
        cleanup = (getSDKVersion + 95) % 128;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.InterfaceC9641ns
    public void valueOf(String str, C9602nb c9602nb) {
        if (c9602nb.ThreeDS2ServiceInstance()) {
            getSDKVersion = (cleanup + 51) % 128;
            try {
                try {
                    Object invoke = ((Class) get3DSServerTransactionID.ThreeDS2Service(3350 - KeyEvent.normalizeMetaState(0), (ViewConfiguration.getJumpTapTimeout() >> 16) + 49, (char) ((Process.myTid() >> 22) + 14971))).getMethod("ThreeDS2Service", String.class).invoke(((Class) get3DSServerTransactionID.ThreeDS2Service((ViewConfiguration.getLongPressTimeout() >> 16) + 3350, 50 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), (char) (MotionEvent.axisFromString("") + 14972))).getDeclaredMethod("ThreeDS2ServiceInstance", null).invoke(null, null), values(str));
                    Object[] objArr = new Object[1];
                    valueOf(127 - TextUtils.indexOf("", ""), null, null, "\u008b\u0089\u008b\u0089\u008a\u0089\u0088\u0087\u0083\u0086\u0085\u0084\u0083\u0082\u0081", objArr);
                    byte[] bytes = ((String) objArr[0]).intern().getBytes(StandardCharsets.UTF_8);
                    Object[] objArr2 = new Object[1];
                    valueOf(126 - TextUtils.indexOf((CharSequence) "", '0', 0), null, null, "\u008d\u008c\u0089\u008d\u008c", objArr2);
                    get(String.format(((String) objArr2[0]).intern(), invoke, C9657ol.get(bytes)), C9645nw.values);
                    cleanup = (getSDKVersion + 121) % 128;
                } catch (Throwable th2) {
                    Throwable cause = th2.getCause();
                    if (cause == null) {
                        throw th2;
                    }
                    throw cause;
                }
            } catch (Throwable th3) {
                Throwable cause2 = th3.getCause();
                if (cause2 == null) {
                    throw th3;
                }
                throw cause2;
            }
        }
    }

    private String values(String str) {
        cleanup = (getSDKVersion + 91) % 128;
        try {
            C9640nr ThreeDS2Service = C9640nr.ThreeDS2Service(str);
            Object[] objArr = new Object[1];
            valueOf(126 - Process.getGidForName(""), null, null, "\u0097\u0084\u0095\u0082\u0096\u0090\u0095\u0090\u0094\u0092\u0093\u0082\u0092\u0091\u0091\u0090\u008f\u008e", objArr);
            values(ThreeDS2Service, ((String) objArr[0]).intern());
            Object[] objArr2 = new Object[1];
            valueOf(Color.red(0) + 127, null, null, "\u0085\u0099\u0098\u0097\u0084\u0095\u0082\u0096\u0090\u0095\u0090\u0094\u0092\u0093\u0082\u0092\u0091\u0091\u0090\u008f\u008e", objArr2);
            values(ThreeDS2Service, ((String) objArr2[0]).intern());
            Object[] objArr3 = new Object[1];
            valueOf(126 - ((byte) KeyEvent.getModifierMetaStateMask()), null, null, "\u0097\u0084\u0095\u0082\u0096\u0090\u0095\u0090\u0094\u009c\u009b\u0098\u009a\u0092\u0093\u0082\u0092\u0091\u0091\u0090\u008f\u008e", objArr3);
            values(ThreeDS2Service, ((String) objArr3[0]).intern());
            str = ThreeDS2Service.toString();
            int i = cleanup + 89;
            getSDKVersion = i % 128;
            if (i % 2 != 0) {
                int i2 = 27 / 0;
            }
        } catch (setId unused) {
        }
        return str;
    }

    /* JADX WARN: Code restructure failed: missing block: B:0:?, code lost:
        r9 = r9;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void valueOf(int r6, int[] r7, java.lang.String r8, java.lang.String r9, java.lang.Object[] r10) {
        /*
            if (r9 == 0) goto L8
            java.lang.String r0 = "ISO-8859-1"
            byte[] r9 = r9.getBytes(r0)
        L8:
            byte[] r9 = (byte[]) r9
            if (r8 == 0) goto L10
            char[] r8 = r8.toCharArray()
        L10:
            char[] r8 = (char[]) r8
            java.lang.Object r0 = com.netcetera.threeds.sdk.infrastructure.ThreeDS2Service.InitializationCallback.values
            monitor-enter(r0)
            char[] r1 = com.netcetera.threeds.sdk.infrastructure.C9639np.ThreeDS2ServiceInstance     // Catch: java.lang.Throwable -> L42
            int r2 = com.netcetera.threeds.sdk.infrastructure.C9639np.valueOf     // Catch: java.lang.Throwable -> L42
            boolean r3 = com.netcetera.threeds.sdk.infrastructure.C9639np.get     // Catch: java.lang.Throwable -> L42
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
            boolean r9 = com.netcetera.threeds.sdk.infrastructure.C9639np.values     // Catch: java.lang.Throwable -> L42
            if (r9 == 0) goto L7e
            int r7 = r8.length     // Catch: java.lang.Throwable -> L42
            com.netcetera.threeds.sdk.infrastructure.ThreeDS2Service.InitializationCallback.ThreeDS2Service = r7     // Catch: java.lang.Throwable -> L42
            char[] r7 = new char[r7]     // Catch: java.lang.Throwable -> L42
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
            char r3 = r8[r3]     // Catch: java.lang.Throwable -> L42
            int r3 = r3 - r6
            char r3 = r1[r3]     // Catch: java.lang.Throwable -> L42
            int r3 = r3 - r2
            char r3 = (char) r3     // Catch: java.lang.Throwable -> L42
            r7[r9] = r3     // Catch: java.lang.Throwable -> L42
            int r5 = r5 + 1
            com.netcetera.threeds.sdk.infrastructure.ThreeDS2Service.InitializationCallback.ThreeDS2ServiceInstance = r5     // Catch: java.lang.Throwable -> L42
            goto L58
        L75:
            java.lang.String r6 = new java.lang.String     // Catch: java.lang.Throwable -> L42
            r6.<init>(r7)     // Catch: java.lang.Throwable -> L42
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L42
            r10[r4] = r6
            return
        L7e:
            int r8 = r7.length     // Catch: java.lang.Throwable -> L42
            com.netcetera.threeds.sdk.infrastructure.ThreeDS2Service.InitializationCallback.ThreeDS2Service = r8     // Catch: java.lang.Throwable -> L42
            char[] r8 = new char[r8]     // Catch: java.lang.Throwable -> L42
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
            r3 = r7[r3]     // Catch: java.lang.Throwable -> L42
            int r3 = r3 - r6
            char r3 = r1[r3]     // Catch: java.lang.Throwable -> L42
            int r3 = r3 - r2
            char r3 = (char) r3     // Catch: java.lang.Throwable -> L42
            r8[r9] = r3     // Catch: java.lang.Throwable -> L42
            int r5 = r5 + 1
            com.netcetera.threeds.sdk.infrastructure.ThreeDS2Service.InitializationCallback.ThreeDS2ServiceInstance = r5     // Catch: java.lang.Throwable -> L42
            goto L85
        La2:
            java.lang.String r6 = new java.lang.String     // Catch: java.lang.Throwable -> L42
            r6.<init>(r8)     // Catch: java.lang.Throwable -> L42
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L42
            r10[r4] = r6
            return
        Lab:
            monitor-exit(r0)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.netcetera.threeds.sdk.infrastructure.C9639np.valueOf(int, int[], java.lang.String, java.lang.String, java.lang.Object[]):void");
    }

    private void values(C9640nr c9640nr, String str) {
        getSDKVersion = (cleanup + 17) % 128;
        if (c9640nr.getWarnings(str)) {
            cleanup = (getSDKVersion + 91) % 128;
            c9640nr.ThreeDS2Service(str, C9658om.get('*', c9640nr.values(str).length()));
        }
    }
}