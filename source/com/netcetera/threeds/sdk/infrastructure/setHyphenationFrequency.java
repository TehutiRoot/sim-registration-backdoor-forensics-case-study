package com.netcetera.threeds.sdk.infrastructure;

import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import java.security.cert.X509Certificate;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* loaded from: classes5.dex */
public class setHyphenationFrequency {
    private static int ConfigParameters = 0;
    public static char ThreeDS2ServiceInstance = 0;
    public static char get = 0;
    private static final Set<String> initialize;
    private static int onCompleted = 1;
    public static char valueOf;
    public static char values;
    private final InterfaceC9652ns ThreeDS2Service = C9653nt.ThreeDS2ServiceInstance(setHyphenationFrequency.class);
    private final Object cleanup$30c565a5;
    private final setShadowLayer getSDKInfo;
    private final setTextMetricsParams getSDKVersion;
    private final Object getWarnings$3173ed5;

    static {
        ThreeDS2ServiceInstance();
        Object[] objArr = new Object[1];
        valueOf("ử碦ኝ\uefbd䳱䯹", View.MeasureSpec.getSize(0) + 5, objArr);
        String intern = ((String) objArr[0]).intern();
        Object[] objArr2 = new Object[1];
        valueOf("愯ꡅኝ\uefbd䳱䯹", (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 5, objArr2);
        initialize = new HashSet(Arrays.asList(intern, ((String) objArr2[0]).intern()));
        ConfigParameters = (onCompleted + 21) % 128;
    }

    public setHyphenationFrequency(Object obj, setTextMetricsParams settextmetricsparams, setShadowLayer setshadowlayer, Object obj2) {
        this.getWarnings$3173ed5 = obj;
        this.getSDKVersion = settextmetricsparams;
        this.getSDKInfo = setshadowlayer;
        this.cleanup$30c565a5 = obj2;
    }

    public static void ThreeDS2ServiceInstance() {
        values = (char) 6463;
        ThreeDS2ServiceInstance = (char) 13313;
        valueOf = (char) 20813;
        get = (char) 60662;
    }

    public static setHyphenationFrequency get$15db9c0f(Object obj) {
        try {
            Object newInstance = ((Class) get3DSServerTransactionID.ThreeDS2Service((KeyEvent.getMaxKeyCode() >> 16) + 448, Drawable.resolveOpacity(0, 0) + 65, (char) ((ViewConfiguration.getScrollBarSize() >> 8) + 45053))).getDeclaredConstructor(null).newInstance(null);
            setHyphenationFrequency sethyphenationfrequency = new setHyphenationFrequency(obj, new setTextMetricsParams(newInstance), new setShadowLayer(), newInstance);
            int i = ConfigParameters + 97;
            onCompleted = i % 128;
            if (i % 2 != 0) {
                return sethyphenationfrequency;
            }
            throw null;
        } catch (Throwable th2) {
            Throwable cause = th2.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th2;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:0:?, code lost:
        r12 = r12;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void valueOf(java.lang.String r12, int r13, java.lang.Object[] r14) {
        /*
            if (r12 == 0) goto L6
            char[] r12 = r12.toCharArray()
        L6:
            char[] r12 = (char[]) r12
            java.lang.Object r0 = com.netcetera.threeds.sdk.infrastructure.onCompleted.valueOf
            monitor-enter(r0)
            int r1 = r12.length     // Catch: java.lang.Throwable -> L5b
            char[] r1 = new char[r1]     // Catch: java.lang.Throwable -> L5b
            r2 = 0
            com.netcetera.threeds.sdk.infrastructure.onCompleted.values = r2     // Catch: java.lang.Throwable -> L5b
            r3 = 2
            char[] r3 = new char[r3]     // Catch: java.lang.Throwable -> L5b
        L14:
            int r4 = com.netcetera.threeds.sdk.infrastructure.onCompleted.values     // Catch: java.lang.Throwable -> L5b
            int r5 = r12.length     // Catch: java.lang.Throwable -> L5b
            if (r4 >= r5) goto L6e
            char r5 = r12[r4]     // Catch: java.lang.Throwable -> L5b
            r3[r2] = r5     // Catch: java.lang.Throwable -> L5b
            int r4 = r4 + 1
            char r4 = r12[r4]     // Catch: java.lang.Throwable -> L5b
            r5 = 1
            r3[r5] = r4     // Catch: java.lang.Throwable -> L5b
            r4 = 58224(0xe370, float:8.1589E-41)
            r6 = 0
        L28:
            r7 = 16
            if (r6 >= r7) goto L5d
            char r7 = r3[r5]     // Catch: java.lang.Throwable -> L5b
            char r8 = r3[r2]     // Catch: java.lang.Throwable -> L5b
            int r9 = r8 + r4
            int r10 = r8 << 4
            char r11 = com.netcetera.threeds.sdk.infrastructure.setHyphenationFrequency.get     // Catch: java.lang.Throwable -> L5b
            int r10 = r10 + r11
            r9 = r9 ^ r10
            int r10 = r8 >>> 5
            char r11 = com.netcetera.threeds.sdk.infrastructure.setHyphenationFrequency.valueOf     // Catch: java.lang.Throwable -> L5b
            int r10 = r10 + r11
            r9 = r9 ^ r10
            int r7 = r7 - r9
            char r7 = (char) r7     // Catch: java.lang.Throwable -> L5b
            r3[r5] = r7     // Catch: java.lang.Throwable -> L5b
            int r9 = r7 + r4
            int r10 = r7 << 4
            char r11 = com.netcetera.threeds.sdk.infrastructure.setHyphenationFrequency.values     // Catch: java.lang.Throwable -> L5b
            int r10 = r10 + r11
            r9 = r9 ^ r10
            int r7 = r7 >>> 5
            char r10 = com.netcetera.threeds.sdk.infrastructure.setHyphenationFrequency.ThreeDS2ServiceInstance     // Catch: java.lang.Throwable -> L5b
            int r7 = r7 + r10
            r7 = r7 ^ r9
            int r8 = r8 - r7
            char r7 = (char) r8     // Catch: java.lang.Throwable -> L5b
            r3[r2] = r7     // Catch: java.lang.Throwable -> L5b
            r7 = 40503(0x9e37, float:5.6757E-41)
            int r4 = r4 - r7
            int r6 = r6 + 1
            goto L28
        L5b:
            r12 = move-exception
            goto L77
        L5d:
            int r4 = com.netcetera.threeds.sdk.infrastructure.onCompleted.values     // Catch: java.lang.Throwable -> L5b
            char r6 = r3[r2]     // Catch: java.lang.Throwable -> L5b
            r1[r4] = r6     // Catch: java.lang.Throwable -> L5b
            int r6 = r4 + 1
            char r5 = r3[r5]     // Catch: java.lang.Throwable -> L5b
            r1[r6] = r5     // Catch: java.lang.Throwable -> L5b
            int r4 = r4 + 2
            com.netcetera.threeds.sdk.infrastructure.onCompleted.values = r4     // Catch: java.lang.Throwable -> L5b
            goto L14
        L6e:
            java.lang.String r12 = new java.lang.String     // Catch: java.lang.Throwable -> L5b
            r12.<init>(r1, r2, r13)     // Catch: java.lang.Throwable -> L5b
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L5b
            r14[r2] = r12
            return
        L77:
            monitor-exit(r0)
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.netcetera.threeds.sdk.infrastructure.setHyphenationFrequency.valueOf(java.lang.String, int, java.lang.Object[]):void");
    }

    public setBreakStrategy ThreeDS2Service(String str) throws setId {
        ConfigParameters = (onCompleted + 47) % 128;
        SystemClock.elapsedRealtime();
        try {
            C9702qn c9702qn = (C9702qn) ((Class) get3DSServerTransactionID.ThreeDS2Service(View.combineMeasuredStates(0, 0) + 448, 65 - Color.argb(0, 0, 0, 0), (char) (ExpandableListView.getPackedPositionGroup(0L) + 45053))).getMethod("get", null).invoke(this.cleanup$30c565a5, null);
            c9702qn.getSDKVersion(str);
            KeyEvent.keyCodeFromString("");
            List<X509Certificate> ThreeDS2ServiceInstance2 = this.getSDKInfo.ThreeDS2ServiceInstance(c9702qn.ConfigParameters());
            ((Class) get3DSServerTransactionID.ThreeDS2Service(132 - (ViewConfiguration.getMaximumFlingVelocity() >> 16), 64 - ImageFormat.getBitsPerPixel(0), (char) (19684 - ((byte) KeyEvent.getModifierMetaStateMask())))).getMethod("ThreeDS2Service", List.class).invoke(this.getWarnings$3173ed5, ThreeDS2ServiceInstance2);
            View.resolveSize(0, 0);
            InterfaceC9706qr ThreeDS2Service = c9702qn.ThreeDS2Service();
            if (!(!initialize.contains(ThreeDS2Service.valueOf()))) {
                c9702qn.values(ThreeDS2ServiceInstance2.get(0).getPublicKey());
                boolean valueOf2 = c9702qn.valueOf();
                KeyEvent.getModifierMetaStateMask();
                if (valueOf2) {
                    setBreakStrategy ThreeDS2ServiceInstance3 = this.getSDKVersion.ThreeDS2ServiceInstance(c9702qn.ThreeDS2ServiceInstance());
                    ConfigParameters = (onCompleted + 81) % 128;
                    return ThreeDS2ServiceInstance3;
                }
                throw setForegroundGravity.getEncryptionCertificateKid.valueOf(new Object[0]);
            }
            throw setForegroundGravity.SchemeInfo.valueOf(ThreeDS2Service.valueOf());
        } catch (C9727rl e) {
            throw setForegroundGravity.getRootCertificates.valueOf(e);
        }
    }
}
