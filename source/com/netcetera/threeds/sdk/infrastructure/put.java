package com.netcetera.threeds.sdk.infrastructure;

import android.graphics.Color;
import android.graphics.ImageFormat;
import android.media.AudioTrack;
import android.os.Process;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewConfiguration;
import com.netcetera.threeds.sdk.infrastructure.setFastScrollEnabled;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum valueOf uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:444)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:391)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:320)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:258)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* loaded from: classes5.dex */
public final class put implements printStackTrace {
    public static char[] ThreeDS2Service = null;
    public static final put ThreeDS2ServiceInstance;
    private static int cleanup = 1;
    public static final put get;
    private static int getSDKInfo;
    public static long getSDKVersion;
    private static final /* synthetic */ put[] initialize;
    @Deprecated
    public static final put valueOf;
    public static final put values;
    private String getWarnings;

    static {
        get();
        Object[] objArr = new Object[1];
        ThreeDS2ServiceInstance((char) ((ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 52255), Color.alpha(0) + 4, (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 3, objArr);
        String intern = ((String) objArr[0]).intern();
        Object[] objArr2 = new Object[1];
        ThreeDS2ServiceInstance((char) (23128 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1))), 8 - View.MeasureSpec.makeMeasureSpec(0, 0), TextUtils.getTrimmedLength("") + 5, objArr2);
        put putVar = new put(intern, 0, ((String) objArr2[0]).intern());
        valueOf = putVar;
        Object[] objArr3 = new Object[1];
        ThreeDS2ServiceInstance((char) ((ViewConfiguration.getTapTimeout() >> 16) + 60084), ImageFormat.getBitsPerPixel(0) + 14, TextUtils.getOffsetBefore("", 0) + 4, objArr3);
        put putVar2 = new put(((String) objArr3[0]).intern(), 1, setFastScrollEnabled.valueOf.valueOf.ThreeDS2Service());
        values = putVar2;
        Object[] objArr4 = new Object[1];
        ThreeDS2ServiceInstance((char) ((ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) - 1), Color.green(0) + 17, TextUtils.getTrimmedLength("") + 4, objArr4);
        put putVar3 = new put(((String) objArr4[0]).intern(), 2, setFastScrollEnabled.valueOf.ThreeDS2ServiceInstance.ThreeDS2Service());
        ThreeDS2ServiceInstance = putVar3;
        Object[] objArr5 = new Object[1];
        ThreeDS2ServiceInstance((char) (TextUtils.getTrimmedLength("") + 10639), 21 - (Process.myTid() >> 22), TextUtils.indexOf((CharSequence) "", '0') + 5, objArr5);
        put putVar4 = new put(((String) objArr5[0]).intern(), 3, setFastScrollEnabled.valueOf.get.ThreeDS2Service());
        get = putVar4;
        initialize = new put[]{putVar, putVar2, putVar3, putVar4};
        getSDKInfo = (cleanup + 5) % 128;
    }

    private put(String str, int i, String str2) {
        this.getWarnings = str2;
    }

    private static void ThreeDS2ServiceInstance(char c, int i, int i2, Object[] objArr) {
        String str;
        synchronized (ConfigParameters.valueOf) {
            try {
                char[] cArr = new char[i2];
                ConfigParameters.ThreeDS2Service = 0;
                while (true) {
                    int i3 = ConfigParameters.ThreeDS2Service;
                    if (i3 < i2) {
                        cArr[i3] = (char) ((ThreeDS2Service[i + i3] ^ (i3 * getSDKVersion)) ^ c);
                        ConfigParameters.ThreeDS2Service = i3 + 1;
                    } else {
                        str = new String(cArr);
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        objArr[0] = str;
    }

    public static void get() {
        ThreeDS2Service = new char[]{'n', 32830, 250, 32909, 52342, 19545, 52358, 19697, 23146, 55869, 23294, 55959, 23364, 60130, 27341, 59923, 27237, 'V', 32889, 164, 32977, 10713, 43510, 10538, 43359};
        getSDKVersion = 411107475773292619L;
    }

    public static put valueOf(String str) {
        getSDKInfo = (cleanup + 107) % 128;
        put putVar = (put) Enum.valueOf(put.class, str);
        cleanup = (getSDKInfo + 27) % 128;
        return putVar;
    }

    public static put[] values() {
        int i = getSDKInfo + 63;
        cleanup = i % 128;
        if (i % 2 == 0) {
            int i2 = 87 / 0;
            return (put[]) initialize.clone();
        }
        return (put[]) initialize.clone();
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.printStackTrace
    public String ThreeDS2Service() {
        int i = cleanup + 29;
        getSDKInfo = i % 128;
        if (i % 2 == 0) {
            return this.getWarnings;
        }
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x001e, code lost:
        r5 = com.netcetera.threeds.sdk.infrastructure.put.getSDKInfo + 15;
        com.netcetera.threeds.sdk.infrastructure.put.cleanup = r5 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0028, code lost:
        if ((r5 % 2) == 0) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x002a, code lost:
        r5 = r1[r4];
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0036, code lost:
        if (r5.getWarnings.equals(r8.ThreeDS2Service()) == false) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0038, code lost:
        return r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0039, code lost:
        r4 = r4 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x003b, code lost:
        r1[r4].getWarnings.equals(r8.ThreeDS2Service());
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0047, code lost:
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0011, code lost:
        if (r8 != null) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0014, code lost:
        if (r8 != null) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0016, code lost:
        r1 = values();
        r3 = r1.length;
        r4 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x001c, code lost:
        if (r4 >= r3) goto L24;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static com.netcetera.threeds.sdk.infrastructure.put ThreeDS2Service(com.netcetera.threeds.sdk.infrastructure.setFastScrollEnabled.valueOf r8) throws com.netcetera.threeds.sdk.infrastructure.setId {
        /*
            r0 = 1
            int r1 = com.netcetera.threeds.sdk.infrastructure.put.cleanup
            int r1 = r1 + 63
            int r2 = r1 % 128
            com.netcetera.threeds.sdk.infrastructure.put.getSDKInfo = r2
            int r1 = r1 % 2
            r2 = 0
            if (r1 == 0) goto L14
            r1 = 82
            int r1 = r1 / r2
            if (r8 == 0) goto L48
            goto L16
        L14:
            if (r8 == 0) goto L48
        L16:
            com.netcetera.threeds.sdk.infrastructure.put[] r1 = values()
            int r3 = r1.length
            r4 = 0
        L1c:
            if (r4 >= r3) goto L48
            int r5 = com.netcetera.threeds.sdk.infrastructure.put.getSDKInfo
            int r5 = r5 + 15
            int r6 = r5 % 128
            com.netcetera.threeds.sdk.infrastructure.put.cleanup = r6
            int r5 = r5 % 2
            if (r5 == 0) goto L3b
            r5 = r1[r4]
            java.lang.String r6 = r5.getWarnings
            java.lang.String r7 = r8.ThreeDS2Service()
            boolean r6 = r6.equals(r7)
            if (r6 == 0) goto L39
            return r5
        L39:
            int r4 = r4 + r0
            goto L1c
        L3b:
            r0 = r1[r4]
            java.lang.String r0 = r0.getWarnings
            java.lang.String r8 = r8.ThreeDS2Service()
            r0.equals(r8)
            r8 = 0
            throw r8
        L48:
            com.netcetera.threeds.sdk.infrastructure.setForegroundGravity r1 = com.netcetera.threeds.sdk.infrastructure.setForegroundGravity.restrictedParameters
            if (r8 == 0) goto L59
            java.lang.String r8 = r8.name()
            int r3 = com.netcetera.threeds.sdk.infrastructure.put.cleanup
            int r3 = r3 + 89
            int r3 = r3 % 128
            com.netcetera.threeds.sdk.infrastructure.put.getSDKInfo = r3
            goto L79
        L59:
            int r8 = android.view.View.MeasureSpec.makeMeasureSpec(r2, r2)
            char r8 = (char) r8
            int r3 = android.view.ViewConfiguration.getMaximumFlingVelocity()
            int r3 = r3 >> 16
            int r4 = android.view.ViewConfiguration.getScrollBarFadeDuration()
            int r4 = r4 >> 16
            int r4 = 4 - r4
            java.lang.Object[] r5 = new java.lang.Object[r0]
            ThreeDS2ServiceInstance(r8, r3, r4, r5)
            r8 = r5[r2]
            java.lang.String r8 = (java.lang.String) r8
            java.lang.String r8 = r8.intern()
        L79:
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r0[r2] = r8
            com.netcetera.threeds.sdk.infrastructure.setId r8 = r1.valueOf(r0)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.netcetera.threeds.sdk.infrastructure.put.ThreeDS2Service(com.netcetera.threeds.sdk.infrastructure.setFastScrollEnabled$valueOf):com.netcetera.threeds.sdk.infrastructure.put");
    }
}
