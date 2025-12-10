package com.netcetera.threeds.sdk.infrastructure;

import android.graphics.Color;
import android.media.AudioTrack;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum ThreeDS2ServiceInstance uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:444)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:391)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:320)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:258)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* loaded from: classes5.dex */
public final class keySet implements printStackTrace {
    public static char ConfigParameters = 0;
    public static final keySet ThreeDS2Service;
    public static char[] ThreeDS2Service$InitializationCallback = null;
    public static final keySet ThreeDS2ServiceInstance;
    private static final /* synthetic */ keySet[] addParam;
    private static int apiKey = 0;
    public static char cleanup = 0;
    public static char createTransaction = 0;
    public static final keySet get;
    private static int getParamValue = 1;
    public static final keySet getSDKInfo;
    public static final keySet getSDKVersion;
    public static final keySet getWarnings;
    public static final keySet initialize;
    public static char onCompleted;
    public static char onError;
    public static final keySet valueOf;
    public static final keySet values;
    private String removeParam;

    static {
        valueOf();
        Object[] objArr = new Object[1];
        get("䖨채磸㧾", (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 4, objArr);
        String intern = ((String) objArr[0]).intern();
        Object[] objArr2 = new Object[1];
        valueOf(4 - (KeyEvent.getMaxKeyCode() >> 16), "\u0004\u0002\u000e\r", (byte) (Color.green(0) + 17), objArr2);
        keySet keyset = new keySet(intern, 0, ((String) objArr2[0]).intern());
        ThreeDS2ServiceInstance = keyset;
        Object[] objArr3 = new Object[1];
        get("珻\ud7a5殺詩", 4 - (ViewConfiguration.getTapTimeout() >> 16), objArr3);
        String intern2 = ((String) objArr3[0]).intern();
        Object[] objArr4 = new Object[1];
        valueOf((ViewConfiguration.getFadingEdgeLength() >> 16) + 4, "\u0006\u0002\r\u0002", (byte) (Color.red(0) + 110), objArr4);
        keySet keyset2 = new keySet(intern2, 1, ((String) objArr4[0]).intern());
        ThreeDS2Service = keyset2;
        Object[] objArr5 = new Object[1];
        valueOf(4 - Color.argb(0, 0, 0, 0), "\b\u0004\u0001\n", (byte) ((-16777172) - Color.rgb(0, 0, 0)), objArr5);
        String intern3 = ((String) objArr5[0]).intern();
        Object[] objArr6 = new Object[1];
        get("\uf2bf蝽꡵씃", 3 - TextUtils.indexOf((CharSequence) "", '0'), objArr6);
        keySet keyset3 = new keySet(intern3, 2, ((String) objArr6[0]).intern());
        get = keyset3;
        Object[] objArr7 = new Object[1];
        get("\uf2bf蝽磸㧾", View.resolveSizeAndState(0, 0, 0) + 4, objArr7);
        String intern4 = ((String) objArr7[0]).intern();
        Object[] objArr8 = new Object[1];
        get("\uf2bf蝽賘뽇", TextUtils.getCapsMode("", 0, 0) + 4, objArr8);
        keySet keyset4 = new keySet(intern4, 3, ((String) objArr8[0]).intern());
        valueOf = keyset4;
        Object[] objArr9 = new Object[1];
        get("䖨채織躦", (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 4, objArr9);
        String intern5 = ((String) objArr9[0]).intern();
        Object[] objArr10 = new Object[1];
        valueOf(5 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), "\u0004\u0002\u000f\u0005", (byte) (25 - (ViewConfiguration.getScrollBarFadeDuration() >> 16)), objArr10);
        keySet keyset5 = new keySet(intern5, 4, ((String) objArr10[0]).intern());
        values = keyset5;
        Object[] objArr11 = new Object[1];
        get("\udd64윤織躦", (-16777212) - Color.rgb(0, 0, 0), objArr11);
        String intern6 = ((String) objArr11[0]).intern();
        Object[] objArr12 = new Object[1];
        get("\udd64윤꡵씃", TextUtils.getCapsMode("", 0, 0) + 4, objArr12);
        keySet keyset6 = new keySet(intern6, 5, ((String) objArr12[0]).intern());
        getSDKVersion = keyset6;
        Object[] objArr13 = new Object[1];
        get("\udd64윤磸㧾", ((byte) KeyEvent.getModifierMetaStateMask()) + 5, objArr13);
        String intern7 = ((String) objArr13[0]).intern();
        Object[] objArr14 = new Object[1];
        valueOf((SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 3, "\u0000\u0001\u000e\r", (byte) (102 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1))), objArr14);
        keySet keyset7 = new keySet(intern7, 6, ((String) objArr14[0]).intern());
        initialize = keyset7;
        Object[] objArr15 = new Object[1];
        get("匪李織躦", (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 4, objArr15);
        String intern8 = ((String) objArr15[0]).intern();
        Object[] objArr16 = new Object[1];
        valueOf((ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 3, "㗨㗨\u000f\u0005", (byte) ((ViewConfiguration.getJumpTapTimeout() >> 16) + 32), objArr16);
        keySet keyset8 = new keySet(intern8, 7, ((String) objArr16[0]).intern());
        getWarnings = keyset8;
        Object[] objArr17 = new Object[1];
        get("匪李磸㧾", 4 - View.MeasureSpec.makeMeasureSpec(0, 0), objArr17);
        String intern9 = ((String) objArr17[0]).intern();
        Object[] objArr18 = new Object[1];
        valueOf((TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 4, "㘣㘣\u000e\r", (byte) (91 - View.MeasureSpec.getSize(0)), objArr18);
        keySet keyset9 = new keySet(intern9, 8, ((String) objArr18[0]).intern());
        getSDKInfo = keyset9;
        addParam = new keySet[]{keyset, keyset2, keyset3, keyset4, keyset5, keyset6, keyset7, keyset8, keyset9};
        apiKey = (getParamValue + 17) % 128;
    }

    private keySet(String str, int i, String str2) {
        this.removeParam = str2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:0:?, code lost:
        r12 = r12;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void get(java.lang.String r12, int r13, java.lang.Object[] r14) {
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
            char r11 = com.netcetera.threeds.sdk.infrastructure.keySet.onError     // Catch: java.lang.Throwable -> L5b
            int r10 = r10 + r11
            r9 = r9 ^ r10
            int r10 = r8 >>> 5
            char r11 = com.netcetera.threeds.sdk.infrastructure.keySet.onCompleted     // Catch: java.lang.Throwable -> L5b
            int r10 = r10 + r11
            r9 = r9 ^ r10
            int r7 = r7 - r9
            char r7 = (char) r7     // Catch: java.lang.Throwable -> L5b
            r3[r5] = r7     // Catch: java.lang.Throwable -> L5b
            int r9 = r7 + r4
            int r10 = r7 << 4
            char r11 = com.netcetera.threeds.sdk.infrastructure.keySet.cleanup     // Catch: java.lang.Throwable -> L5b
            int r10 = r10 + r11
            r9 = r9 ^ r10
            int r7 = r7 >>> 5
            char r10 = com.netcetera.threeds.sdk.infrastructure.keySet.createTransaction     // Catch: java.lang.Throwable -> L5b
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
        throw new UnsupportedOperationException("Method not decompiled: com.netcetera.threeds.sdk.infrastructure.keySet.get(java.lang.String, int, java.lang.Object[]):void");
    }

    public static void valueOf() {
        cleanup = (char) 47697;
        createTransaction = (char) 27198;
        onCompleted = (char) 40011;
        onError = (char) 57348;
        ThreeDS2Service$InitializationCallback = new char[]{13768, 13813, 13791, 13770, 13787, 13775, 13785, 13803, 13774, 13771, 13772, 13773, 13801, 13823, 13800, 13769};
        ConfigParameters = (char) 4;
    }

    public static keySet[] values() {
        apiKey = (getParamValue + 3) % 128;
        keySet[] keysetArr = (keySet[]) addParam.clone();
        int i = apiKey + 63;
        getParamValue = i % 128;
        if (i % 2 != 0) {
            return keysetArr;
        }
        throw null;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.printStackTrace
    public String ThreeDS2Service() {
        String str;
        int i = getParamValue;
        int i2 = i + 17;
        apiKey = i2 % 128;
        if (i2 % 2 != 0) {
            str = this.removeParam;
            int i3 = 74 / 0;
        } else {
            str = this.removeParam;
        }
        apiKey = (i + 1) % 128;
        return str;
    }

    public static keySet valueOf(String str) {
        apiKey = (getParamValue + 57) % 128;
        keySet keyset = (keySet) Enum.valueOf(keySet.class, str);
        int i = apiKey + 27;
        getParamValue = i % 128;
        if (i % 2 != 0) {
            return keyset;
        }
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:0:?, code lost:
        r11 = r11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void valueOf(int r10, java.lang.String r11, byte r12, java.lang.Object[] r13) {
        /*
            Method dump skipped, instructions count: 252
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.netcetera.threeds.sdk.infrastructure.keySet.valueOf(int, java.lang.String, byte, java.lang.Object[]):void");
    }
}