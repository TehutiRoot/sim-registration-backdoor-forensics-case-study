package com.netcetera.threeds.sdk.infrastructure;

import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.os.Process;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.google.common.base.Ascii;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Set;

/* loaded from: classes5.dex */
public class getAcsTransactionID {
    static final String ThreeDS2Service;
    static final String ThreeDS2ServiceInstance;
    public static char cleanup = 0;
    static final String get;
    static final String getSDKVersion;
    public static char[] getWarnings = null;
    static final String initialize;
    private static int onCompleted = 0;
    private static int onError = 1;
    static final String valueOf;
    static final String values;
    private final RuntimeErrorEvent getSDKInfo;

    static {
        get();
        Object[] objArr = new Object[1];
        ThreeDS2Service((byte) (100 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1))), "\u000e\u0001\u0001\u0004\u0004\u0011\u0014\u0017\u0013\u0012\u0013\u0017\t\u0010\u0000\u0015", ((Process.getThreadPriority(0) + 20) >> 6) + 16, objArr);
        getSDKVersion = ((String) objArr[0]).intern();
        Object[] objArr2 = new Object[1];
        ThreeDS2Service((byte) (77 - Color.green(0)), "\u000e\u0001\u0001\u0004\u0004\u0011\u0014\u0017\u0013\u0012㙂", (ViewConfiguration.getPressedStateDuration() >> 16) + 11, objArr2);
        initialize = ((String) objArr2[0]).intern();
        Object[] objArr3 = new Object[1];
        ThreeDS2Service((byte) (TextUtils.indexOf("", "", 0, 0) + 62), "\u000e\u0001\u0001\u0004\u0004\u0011\u0015\u0004㘳㘳\u0018\u0014\u0005\r\u0007\u0014\t\u0002\u0014\u0015\u0004\b", ((byte) KeyEvent.getModifierMetaStateMask()) + Ascii.ETB, objArr3);
        get = ((String) objArr3[0]).intern();
        Object[] objArr4 = new Object[1];
        ThreeDS2Service((byte) (66 - (ViewConfiguration.getDoubleTapTimeout() >> 16)), "\u000e\u0001\u0001\u0004\u0004\u0011\u0017\t\u000f\n\u0002\f\t\u0004\u0017\u0000\u000e\u0004\b\u0007", 20 - TextUtils.indexOf("", "", 0, 0), objArr4);
        ThreeDS2Service = ((String) objArr4[0]).intern();
        Object[] objArr5 = new Object[1];
        ThreeDS2Service((byte) (119 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1))), "\u000e\u0001\u0001\u0004\u0004\u0011\u0017\t\u000f\n\u0002\f\t\u0004\u0017\u0000㙛", Color.rgb(0, 0, 0) + 16777233, objArr5);
        values = ((String) objArr5[0]).intern();
        Object[] objArr6 = new Object[1];
        ThreeDS2Service((byte) (55 - TextUtils.getOffsetAfter("", 0)), "\u000e\u0001\u0001\u0004\u0004\u0011\u0014\u0016\u0011\u0004\u0001\r", 12 - KeyEvent.normalizeMetaState(0), objArr6);
        valueOf = ((String) objArr6[0]).intern();
        Object[] objArr7 = new Object[1];
        ThreeDS2Service((byte) (41 - (ViewConfiguration.getKeyRepeatTimeout() >> 16)), "\u000e\u0001\u0001\u0004\u0004\u0011\u0015\t\u000e\u0015\b\u0007㘒", 12 - TextUtils.indexOf((CharSequence) "", '0', 0, 0), objArr7);
        ThreeDS2ServiceInstance = ((String) objArr7[0]).intern();
        int i = onError + 95;
        onCompleted = i % 128;
        if (i % 2 != 0) {
            int i2 = 21 / 0;
        }
    }

    public getAcsTransactionID(RuntimeErrorEvent runtimeErrorEvent) {
        this.getSDKInfo = runtimeErrorEvent;
    }

    private String ThreeDS2Service(com.netcetera.threeds.sdk.api.configparameters.ConfigParameters configParameters, String str) {
        Object[] objArr = new Object[1];
        ThreeDS2Service((byte) (((byte) KeyEvent.getModifierMetaStateMask()) + 121), "\u000e\u0001\u0001\u0004\u0004\u0011\u0017\t\u000f\n\u0002\f\t\u0004\u0017\u0000㙛", (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 17, objArr);
        String paramValue = configParameters.getParamValue(((String) objArr[0]).intern(), str);
        if (paramValue != null) {
            onError = (onCompleted + 33) % 128;
            this.getSDKInfo.get(paramValue);
        }
        String str2 = (String) C9669om.ThreeDS2Service(paramValue, "");
        onError = (onCompleted + 43) % 128;
        return str2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0094, code lost:
        return java.util.Arrays.asList(com.netcetera.threeds.sdk.infrastructure.C9669om.ThreeDS2ServiceInstance(r7, ((java.lang.String) r1[0]).intern()));
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x009a, code lost:
        return new java.util.ArrayList();
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0038, code lost:
        if (com.netcetera.threeds.sdk.infrastructure.C9669om.ThreeDS2ServiceInstance(r7) != true) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0063, code lost:
        if (com.netcetera.threeds.sdk.infrastructure.C9669om.ThreeDS2ServiceInstance(r7) != false) goto L5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0065, code lost:
        com.netcetera.threeds.sdk.infrastructure.getAcsTransactionID.onCompleted = (com.netcetera.threeds.sdk.infrastructure.getAcsTransactionID.onError + 55) % 128;
        r1 = new java.lang.Object[1];
        ThreeDS2Service((byte) ((android.view.ViewConfiguration.getDoubleTapTimeout() >> 16) + 85), "㘋", (android.view.ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 1, r1);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private java.util.List<java.lang.String> ThreeDS2ServiceInstance(com.netcetera.threeds.sdk.api.configparameters.ConfigParameters r7, java.lang.String r8) {
        /*
            r6 = this;
            int r0 = com.netcetera.threeds.sdk.infrastructure.getAcsTransactionID.onError
            int r0 = r0 + 97
            int r1 = r0 % 128
            com.netcetera.threeds.sdk.infrastructure.getAcsTransactionID.onCompleted = r1
            int r0 = r0 % 2
            java.lang.String r1 = "\u000e\u0001\u0001\u0004\u0004\u0011\u0015\u0004㘳㘳\u0018\u0014\u0005\r\u0007\u0014\t\u0002\u0014\u0015\u0004\b"
            r2 = 0
            r3 = 1
            r4 = 0
            if (r0 == 0) goto L3b
            int r0 = android.os.Process.getThreadPriority(r4)
            int r0 = r0 + 58
            r5 = 44
            int r5 = r5 / r0
            byte r0 = (byte) r5
            float r5 = android.util.TypedValue.complexToFloat(r4)
            int r2 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1))
            int r2 = r2 + 66
            java.lang.Object[] r5 = new java.lang.Object[r3]
            ThreeDS2Service(r0, r1, r2, r5)
            r0 = r5[r4]
            java.lang.String r0 = (java.lang.String) r0
            java.lang.String r0 = r0.intern()
            java.lang.String r7 = r7.getParamValue(r0, r8)
            boolean r8 = com.netcetera.threeds.sdk.infrastructure.C9669om.ThreeDS2ServiceInstance(r7)
            if (r8 == r3) goto L65
            goto L95
        L3b:
            int r0 = android.os.Process.getThreadPriority(r4)
            int r0 = r0 + 20
            int r0 = r0 >> 6
            int r0 = r0 + 62
            byte r0 = (byte) r0
            float r5 = android.util.TypedValue.complexToFloat(r4)
            int r2 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1))
            int r2 = 22 - r2
            java.lang.Object[] r5 = new java.lang.Object[r3]
            ThreeDS2Service(r0, r1, r2, r5)
            r0 = r5[r4]
            java.lang.String r0 = (java.lang.String) r0
            java.lang.String r0 = r0.intern()
            java.lang.String r7 = r7.getParamValue(r0, r8)
            boolean r8 = com.netcetera.threeds.sdk.infrastructure.C9669om.ThreeDS2ServiceInstance(r7)
            if (r8 == 0) goto L95
        L65:
            int r8 = com.netcetera.threeds.sdk.infrastructure.getAcsTransactionID.onError
            int r8 = r8 + 55
            int r8 = r8 % 128
            com.netcetera.threeds.sdk.infrastructure.getAcsTransactionID.onCompleted = r8
            int r8 = android.view.ViewConfiguration.getDoubleTapTimeout()
            int r8 = r8 >> 16
            int r8 = r8 + 85
            byte r8 = (byte) r8
            int r0 = android.view.ViewConfiguration.getMaximumDrawingCacheSize()
            int r0 = r0 >> 24
            int r0 = r0 + r3
            java.lang.Object[] r1 = new java.lang.Object[r3]
            java.lang.String r2 = "㘋"
            ThreeDS2Service(r8, r2, r0, r1)
            r8 = r1[r4]
            java.lang.String r8 = (java.lang.String) r8
            java.lang.String r8 = r8.intern()
            java.lang.String[] r7 = com.netcetera.threeds.sdk.infrastructure.C9669om.ThreeDS2ServiceInstance(r7, r8)
            java.util.List r7 = java.util.Arrays.asList(r7)
            return r7
        L95:
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.netcetera.threeds.sdk.infrastructure.getAcsTransactionID.ThreeDS2ServiceInstance(com.netcetera.threeds.sdk.api.configparameters.ConfigParameters, java.lang.String):java.util.List");
    }

    public static void get() {
        getWarnings = new char[]{13810, 13800, 13815, 13823, 13817, 13816, 13822, 13811, 13802, 13795, 13807, 13801, 13818, 13820, 13750, 13825, 13824, 13821, 13813, 13819, 13809, 13812, 13814, 13806, 13765};
        cleanup = (char) 5;
    }

    public static getAcsTransactionID valueOf() {
        getAcsTransactionID getacstransactionid = new getAcsTransactionID(timedout.valueOf());
        int i = onError + 89;
        onCompleted = i % 128;
        if (i % 2 == 0) {
            return getacstransactionid;
        }
        throw null;
    }

    private List<String> values(com.netcetera.threeds.sdk.api.configparameters.ConfigParameters configParameters) {
        Object[] objArr = new Object[1];
        ThreeDS2Service((byte) (55 - (Process.myPid() >> 22)), "\u000e\u0001\u0001\u0004\u0004\u0011\u0014\u0016\u0011\u0004\u0001\r", (KeyEvent.getMaxKeyCode() >> 16) + 12, objArr);
        String paramValue = configParameters.getParamValue(null, ((String) objArr[0]).intern());
        Object[] objArr2 = new Object[1];
        ThreeDS2Service((byte) (85 - TextUtils.getTrimmedLength("")), "㘋", (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 1, objArr2);
        String[] ThreeDS2ServiceInstance2 = C9669om.ThreeDS2ServiceInstance(paramValue, ((String) objArr2[0]).intern());
        if (ThreeDS2ServiceInstance2 != null) {
            onCompleted = (onError + 53) % 128;
            if (ThreeDS2ServiceInstance2.length != 0) {
                ArrayList arrayList = new ArrayList();
                for (String str : ThreeDS2ServiceInstance2) {
                    onError = (onCompleted + 13) % 128;
                    if (C9669om.ThreeDS2ServiceInstance(str)) {
                        arrayList.add(str);
                    }
                }
                return arrayList;
            }
        }
        return Collections.emptyList();
    }

    public ChallengeParameters get(com.netcetera.threeds.sdk.api.configparameters.ConfigParameters configParameters) throws setId {
        List<String> values2 = values(configParameters);
        HashMap hashMap = new HashMap();
        for (String str : values2) {
            Set<String> set = get(configParameters, str);
            List<String> ThreeDS2ServiceInstance2 = ThreeDS2ServiceInstance(configParameters, str);
            showProgress ThreeDS2ServiceInstance3 = showProgress.ThreeDS2ServiceInstance(ThreeDS2Service(configParameters, str), valueOf(configParameters, str));
            Object[] objArr = new Object[1];
            ThreeDS2Service((byte) (View.combineMeasuredStates(0, 0) + 77), "\u000e\u0001\u0001\u0004\u0004\u0011\u0014\u0017\u0013\u0012㙂", Drawable.resolveOpacity(0, 0) + 11, objArr);
            hideProgress values3 = values(configParameters, ((String) objArr[0]).intern(), str);
            Object[] objArr2 = new Object[1];
            ThreeDS2Service((byte) (147 - AndroidCharacter.getMirror('0')), "\u000e\u0001\u0001\u0004\u0004\u0011\u0014\u0017\u0013\u0012\u0013\u0017\t\u0010\u0000\u0015", 16 - (ViewConfiguration.getMaximumFlingVelocity() >> 16), objArr2);
            getTransactionStatus gettransactionstatus = new getTransactionStatus(str, ThreeDS2ServiceInstance2, ThreeDS2ServiceInstance3, values3, values(configParameters, ((String) objArr2[0]).intern(), str));
            onError = (onCompleted + 113) % 128;
            for (String str2 : set) {
                onCompleted = (onError + 25) % 128;
                if (hashMap.containsKey(str2)) {
                    throw setForegroundGravity.removeParam.valueOf(str2);
                }
                hashMap.put(str2, gettransactionstatus);
            }
        }
        return new setAcsSignedContent(hashMap);
    }

    private String valueOf(com.netcetera.threeds.sdk.api.configparameters.ConfigParameters configParameters, String str) {
        String str2;
        int i = onError + 19;
        onCompleted = i % 128;
        if (i % 2 != 0) {
            Object[] objArr = new Object[1];
            ThreeDS2Service((byte) (104 >>> TextUtils.indexOf("", "")), "\u000e\u0001\u0001\u0004\u0004\u0011\u0017\t\u000f\n\u0002\f\t\u0004\u0017\u0000\u000e\u0004\b\u0007", 22 - (Process.myPid() << 69), objArr);
            str2 = (String) C9669om.ThreeDS2Service(configParameters.getParamValue(((String) objArr[0]).intern(), str), "");
        } else {
            Object[] objArr2 = new Object[1];
            ThreeDS2Service((byte) (TextUtils.indexOf("", "") + 66), "\u000e\u0001\u0001\u0004\u0004\u0011\u0017\t\u000f\n\u0002\f\t\u0004\u0017\u0000\u000e\u0004\b\u0007", 20 - (Process.myPid() >> 22), objArr2);
            str2 = (String) C9669om.ThreeDS2Service(configParameters.getParamValue(((String) objArr2[0]).intern(), str), "");
        }
        int i2 = onError + 15;
        onCompleted = i2 % 128;
        if (i2 % 2 == 0) {
            return str2;
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
    private static void ThreeDS2Service(byte r10, java.lang.String r11, int r12, java.lang.Object[] r13) {
        /*
            Method dump skipped, instructions count: 252
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.netcetera.threeds.sdk.infrastructure.getAcsTransactionID.ThreeDS2Service(byte, java.lang.String, int, java.lang.Object[]):void");
    }

    private hideProgress values(com.netcetera.threeds.sdk.api.configparameters.ConfigParameters configParameters, String str, String str2) throws setId {
        String paramValue = configParameters.getParamValue(str, str2);
        if (paramValue == null) {
            onCompleted = (onError + 25) % 128;
            return hideProgress.values();
        }
        try {
            hideProgress hideprogress = hideProgress.get(Integer.parseInt(paramValue.trim()));
            onError = (onCompleted + 81) % 128;
            return hideprogress;
        } catch (NumberFormatException e) {
            throw setForegroundGravity.ConfigurationBuilder.valueOf(str2, e);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0042, code lost:
        if (r9.isEmpty() != false) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0045, code lost:
        r2 = new java.lang.Object[1];
        ThreeDS2Service((byte) (android.widget.ExpandableListView.getPackedPositionType(0) + 85), "㘋", (android.os.SystemClock.uptimeMillis() > 0 ? 1 : (android.os.SystemClock.uptimeMillis() == 0 ? 0 : -1)), r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0070, code lost:
        return new java.util.HashSet(java.util.Arrays.asList(com.netcetera.threeds.sdk.infrastructure.C9669om.ThreeDS2ServiceInstance(r9, ((java.lang.String) r2[0]).intern())));
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x003b, code lost:
        if (r9.isEmpty() != false) goto L12;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private java.util.Set<java.lang.String> get(com.netcetera.threeds.sdk.api.configparameters.ConfigParameters r9, java.lang.String r10) {
        /*
            r8 = this;
            int r0 = android.view.ViewConfiguration.getLongPressTimeout()
            int r0 = r0 >> 16
            int r0 = r0 + 41
            byte r0 = (byte) r0
            java.lang.String r1 = ""
            int r1 = android.view.MotionEvent.axisFromString(r1)
            int r1 = 12 - r1
            r2 = 1
            java.lang.Object[] r3 = new java.lang.Object[r2]
            java.lang.String r4 = "\u000e\u0001\u0001\u0004\u0004\u0011\u0015\t\u000e\u0015\b\u0007㘒"
            ThreeDS2Service(r0, r4, r1, r3)
            r0 = 0
            r1 = r3[r0]
            java.lang.String r1 = (java.lang.String) r1
            java.lang.String r1 = r1.intern()
            java.lang.String r9 = r9.getParamValue(r1, r10)
            if (r9 == 0) goto L71
            int r10 = com.netcetera.threeds.sdk.infrastructure.getAcsTransactionID.onError
            int r10 = r10 + 105
            int r1 = r10 % 128
            com.netcetera.threeds.sdk.infrastructure.getAcsTransactionID.onCompleted = r1
            int r10 = r10 % 2
            if (r10 == 0) goto L3e
            boolean r10 = r9.isEmpty()
            r1 = 98
            int r1 = r1 / r0
            if (r10 == 0) goto L45
            goto L71
        L3e:
            boolean r10 = r9.isEmpty()
            if (r10 == 0) goto L45
            goto L71
        L45:
            java.util.HashSet r10 = new java.util.HashSet
            r3 = 0
            int r1 = android.widget.ExpandableListView.getPackedPositionType(r3)
            int r1 = r1 + 85
            byte r1 = (byte) r1
            long r5 = android.os.SystemClock.uptimeMillis()
            int r7 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            java.lang.Object[] r2 = new java.lang.Object[r2]
            java.lang.String r3 = "㘋"
            ThreeDS2Service(r1, r3, r7, r2)
            r0 = r2[r0]
            java.lang.String r0 = (java.lang.String) r0
            java.lang.String r0 = r0.intern()
            java.lang.String[] r9 = com.netcetera.threeds.sdk.infrastructure.C9669om.ThreeDS2ServiceInstance(r9, r0)
            java.util.List r9 = java.util.Arrays.asList(r9)
            r10.<init>(r9)
            return r10
        L71:
            java.util.Set r9 = java.util.Collections.emptySet()
            int r10 = com.netcetera.threeds.sdk.infrastructure.getAcsTransactionID.onError
            int r10 = r10 + 97
            int r10 = r10 % 128
            com.netcetera.threeds.sdk.infrastructure.getAcsTransactionID.onCompleted = r10
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.netcetera.threeds.sdk.infrastructure.getAcsTransactionID.get(com.netcetera.threeds.sdk.api.configparameters.ConfigParameters, java.lang.String):java.util.Set");
    }
}
