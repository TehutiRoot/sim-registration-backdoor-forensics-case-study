package com.netcetera.threeds.sdk.infrastructure;

import android.graphics.Color;
import android.os.Process;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import java.util.List;
import java.util.regex.Pattern;
import th.p047co.dtac.android.dtacone.view.activity.CameraActivity;

/* renamed from: com.netcetera.threeds.sdk.infrastructure.nj */
/* loaded from: classes5.dex */
public final class C9621nj {
    private static int ThreeDS2Service = 0;
    public static int[] ThreeDS2ServiceInstance = {-1002246154, 1507671421, 1088182147, -505646183, 1276640983, -385009435, -792940300, 2134698733, 1969934071, -216578660, -2071221498, -1402561478, -822433494, 2019385870, -821249745, 1005777890, 1758549167, 402855042};
    private static int get = 1;

    public static <T> void ThreeDS2Service(T t, String str) {
        int i = ThreeDS2Service + 5;
        get = i % 128;
        if (i % 2 != 0) {
            ThreeDS2Service(str);
            if (t != null) {
                ThreeDS2Service = (get + 37) % 128;
                return;
            }
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            Object[] objArr = new Object[1];
            get(new int[]{-745298942, 1412957570, -1015576182, -456931316, -1988462482, -951566316, 1625748863, -1432958447}, 16 - (ViewConfiguration.getPressedStateDuration() >> 16), objArr);
            sb.append(((String) objArr[0]).intern());
            throw new com.netcetera.threeds.sdk.api.exceptions.InvalidInputException(sb.toString());
        }
        ThreeDS2Service(str);
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x002d, code lost:
        if ((r6 % 2) == 0) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x002f, code lost:
        return r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0031, code lost:
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0032, code lost:
        r0 = new java.lang.StringBuilder();
        r0.append(r6);
        r1 = new java.lang.Object[1];
        get(new int[]{-745298942, 1412957570, -1015576182, -456931316, -1988462482, -951566316, 1016530521, -1724190059, -331537995, 207453461, -1398396263, -1268826953, 270096898, -394315263}, (android.view.ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (android.view.ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 24, r1);
        r0.append(((java.lang.String) r1[0]).intern());
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0063, code lost:
        throw new com.netcetera.threeds.sdk.api.exceptions.InvalidInputException(r0.toString());
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0018, code lost:
        if (com.netcetera.threeds.sdk.infrastructure.C9669om.values((java.lang.CharSequence) r5) == false) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0022, code lost:
        if (com.netcetera.threeds.sdk.infrastructure.C9669om.values((java.lang.CharSequence) r5) == false) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0024, code lost:
        r6 = com.netcetera.threeds.sdk.infrastructure.C9621nj.ThreeDS2Service + 1;
        com.netcetera.threeds.sdk.infrastructure.C9621nj.get = r6 % 128;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.String ThreeDS2ServiceInstance(java.lang.String r5, java.lang.String r6) {
        /*
            int r0 = com.netcetera.threeds.sdk.infrastructure.C9621nj.get
            int r0 = r0 + 45
            int r1 = r0 % 128
            com.netcetera.threeds.sdk.infrastructure.C9621nj.ThreeDS2Service = r1
            int r0 = r0 % 2
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L1b
            ThreeDS2Service(r6)
            boolean r0 = com.netcetera.threeds.sdk.infrastructure.C9669om.values(r5)
            r3 = 83
            int r3 = r3 / r2
            if (r0 != 0) goto L32
            goto L24
        L1b:
            ThreeDS2Service(r6)
            boolean r0 = com.netcetera.threeds.sdk.infrastructure.C9669om.values(r5)
            if (r0 != 0) goto L32
        L24:
            int r6 = com.netcetera.threeds.sdk.infrastructure.C9621nj.ThreeDS2Service
            int r6 = r6 + r1
            int r0 = r6 % 128
            com.netcetera.threeds.sdk.infrastructure.C9621nj.get = r0
            int r6 = r6 % 2
            if (r6 == 0) goto L30
            return r5
        L30:
            r5 = 0
            throw r5
        L32:
            com.netcetera.threeds.sdk.api.exceptions.InvalidInputException r5 = new com.netcetera.threeds.sdk.api.exceptions.InvalidInputException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r6)
            r6 = 14
            int[] r6 = new int[r6]
            r6 = {x0064: FILL_ARRAY_DATA  , data: [-745298942, 1412957570, -1015576182, -456931316, -1988462482, -951566316, 1016530521, -1724190059, -331537995, 207453461, -1398396263, -1268826953, 270096898, -394315263} // fill-array
            float r3 = android.view.ViewConfiguration.getScrollFriction()
            r4 = 0
            int r3 = (r3 > r4 ? 1 : (r3 == r4 ? 0 : -1))
            int r3 = r3 + 24
            java.lang.Object[] r1 = new java.lang.Object[r1]
            get(r6, r3, r1)
            r6 = r1[r2]
            java.lang.String r6 = (java.lang.String) r6
            java.lang.String r6 = r6.intern()
            r0.append(r6)
            java.lang.String r6 = r0.toString()
            r5.<init>(r6)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.netcetera.threeds.sdk.infrastructure.C9621nj.ThreeDS2ServiceInstance(java.lang.String, java.lang.String):java.lang.String");
    }

    public static <T> void get(List<T> list, String str) {
        ThreeDS2Service(str);
        if (list != null) {
            get = (ThreeDS2Service + 59) % 128;
            for (T t : list) {
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                Object[] objArr = new Object[1];
                get(new int[]{-1676433345, 1765342617, -96500296, -1962605363}, ExpandableListView.getPackedPositionType(0L) + 7, objArr);
                sb.append(((String) objArr[0]).intern());
                ThreeDS2Service(t, sb.toString());
            }
            ThreeDS2Service = (get + 99) % 128;
            return;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str);
        Object[] objArr2 = new Object[1];
        get(new int[]{-745298942, 1412957570, -1015576182, -456931316, -1988462482, -951566316, 1625748863, -1432958447}, 15 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), objArr2);
        sb2.append(((String) objArr2[0]).intern());
        throw new com.netcetera.threeds.sdk.api.exceptions.InvalidInputException(sb2.toString());
    }

    public static void valueOf(int i, String str) {
        ThreeDS2Service = (get + 37) % 128;
        ThreeDS2Service(str);
        if (i > 0) {
            ThreeDS2Service = (get + 9) % 128;
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        Object[] objArr = new Object[1];
        get(new int[]{1789391430, -362260544, -1135994936, -1090516995, -208881171, 1641856475, 116288796, -212720308, 960003984, -1629842702, 862196113, 330925267}, ((Process.getThreadPriority(0) + 20) >> 6) + 23, objArr);
        sb.append(((String) objArr[0]).intern());
        throw new com.netcetera.threeds.sdk.api.exceptions.InvalidInputException(sb.toString());
    }

    public static void ThreeDS2Service(String str, String str2) {
        ThreeDS2Service = (get + 9) % 128;
        ThreeDS2ServiceInstance(str, str2);
        Object[] objArr = new Object[1];
        get(new int[]{320167902, -598834046, -652677533, 588673546, -2054884648, -2026508669, 1071899125, -1863237950, 736704154, 1947755851, 1455492332, -761743703, -1911914191, -883987485, -1540734308, 1125681055, -1964877064, 1816842868}, View.MeasureSpec.getSize(0) + 36, objArr);
        if (Pattern.compile(((String) objArr[0]).intern()).matcher(str).matches()) {
            get = (ThreeDS2Service + 59) % 128;
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(str2);
        Object[] objArr2 = new Object[1];
        get(new int[]{1789391430, -362260544, -1135994936, -1090516995, -144148877, -1804349852, -1677414773, 1860084391, -1384285551, 1827825875, 358854636, -496730973, -1316285929, -854789346, -1347036820, -178150582, -1099308533, 1929138795, 535040694, 84193146, 1521362739, -979300260}, (ViewConfiguration.getLongPressTimeout() >> 16) + 43, objArr2);
        sb.append(((String) objArr2[0]).intern());
        throw new com.netcetera.threeds.sdk.api.exceptions.InvalidInputException(sb.toString());
    }

    public static void get(int i, int i2, String str) {
        ThreeDS2Service = (get + 97) % 128;
        ThreeDS2Service(str);
        if (i >= i2) {
            get = (ThreeDS2Service + CameraActivity.REQUEST_CODE) % 128;
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        Object[] objArr = new Object[1];
        get(new int[]{1789391430, -362260544, -1135994936, -1090516995, 2116493970, -923220283, -2122574735, -2045872370, -331537995, 207453461, 475186841, 1890424171, -1798711768, -660588813}, TextUtils.indexOf("", "", 0, 0) + 28, objArr);
        sb.append(((String) objArr[0]).intern());
        sb.append(i2);
        Object[] objArr2 = new Object[1];
        get(new int[]{270096898, -394315263}, (ViewConfiguration.getJumpTapTimeout() >> 16) + 1, objArr2);
        sb.append(((String) objArr2[0]).intern());
        throw new com.netcetera.threeds.sdk.api.exceptions.InvalidInputException(sb.toString());
    }

    public static void ThreeDS2ServiceInstance(int i, String str) {
        int i2 = get + 61;
        ThreeDS2Service = i2 % 128;
        if (i2 % 2 == 0) {
            ThreeDS2Service(str);
            if (i >= 0) {
                int i3 = get + 21;
                ThreeDS2Service = i3 % 128;
                if (i3 % 2 != 0) {
                    throw null;
                }
                return;
            }
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            Object[] objArr = new Object[1];
            get(new int[]{1789391430, -362260544, -1135994936, -1090516995, 2116493970, -923220283, -2122574735, -2045872370, -331537995, 207453461, 475186841, 1890424171, 1706576243, 2108653314, -300906971, 1408377111, -1668613826, 123974619}, 34 - Color.argb(0, 0, 0, 0), objArr);
            sb.append(((String) objArr[0]).intern());
            throw new com.netcetera.threeds.sdk.api.exceptions.InvalidInputException(sb.toString());
        }
        ThreeDS2Service(str);
        throw null;
    }

    private static void get(int[] iArr, int i, Object[] objArr) {
        String str;
        synchronized (onError.ThreeDS2ServiceInstance) {
            try {
                char[] cArr = new char[4];
                char[] cArr2 = new char[iArr.length << 1];
                int[] iArr2 = (int[]) ThreeDS2ServiceInstance.clone();
                onError.valueOf = 0;
                while (true) {
                    int i2 = onError.valueOf;
                    if (i2 < iArr.length) {
                        int i3 = iArr[i2];
                        char c = (char) (i3 >> 16);
                        cArr[0] = c;
                        char c2 = (char) i3;
                        cArr[1] = c2;
                        int i4 = iArr[i2 + 1];
                        char c3 = (char) (i4 >> 16);
                        cArr[2] = c3;
                        char c4 = (char) i4;
                        cArr[3] = c4;
                        onError.values = (c << 16) + c2;
                        onError.ThreeDS2Service = (c3 << 16) + c4;
                        onError.valueOf(iArr2);
                        for (int i5 = 0; i5 < 16; i5++) {
                            int i6 = onError.values ^ iArr2[i5];
                            onError.values = i6;
                            onError.ThreeDS2Service = onError.ThreeDS2Service(i6) ^ onError.ThreeDS2Service;
                            int i7 = onError.values;
                            onError.values = onError.ThreeDS2Service;
                            onError.ThreeDS2Service = i7;
                        }
                        int i8 = onError.values;
                        onError.values = onError.ThreeDS2Service;
                        onError.ThreeDS2Service = i8;
                        onError.ThreeDS2Service = i8 ^ iArr2[16];
                        onError.values ^= iArr2[17];
                        int i9 = onError.values;
                        cArr[0] = (char) (i9 >>> 16);
                        cArr[1] = (char) i9;
                        int i10 = onError.ThreeDS2Service;
                        cArr[2] = (char) (i10 >>> 16);
                        cArr[3] = (char) i10;
                        onError.valueOf(iArr2);
                        int i11 = onError.valueOf;
                        int i12 = i11 << 1;
                        cArr2[i12] = cArr[0];
                        cArr2[i12 + 1] = cArr[1];
                        cArr2[i12 + 2] = cArr[2];
                        cArr2[i12 + 3] = cArr[3];
                        onError.valueOf = i11 + 2;
                    } else {
                        str = new String(cArr2, 0, i);
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        objArr[0] = str;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x001d, code lost:
        if (r3.isEmpty() == false) goto L7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x001f, code lost:
        r3 = com.netcetera.threeds.sdk.infrastructure.C9621nj.get + 57;
        com.netcetera.threeds.sdk.infrastructure.C9621nj.ThreeDS2Service = r3 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0029, code lost:
        if ((r3 % 2) != 0) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x002b, code lost:
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x002d, code lost:
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0016, code lost:
        if (r3.isEmpty() == false) goto L7;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void ThreeDS2Service(java.lang.String r3) {
        /*
            r0 = 0
            if (r3 == 0) goto L2e
            int r1 = com.netcetera.threeds.sdk.infrastructure.C9621nj.ThreeDS2Service
            int r1 = r1 + 85
            int r2 = r1 % 128
            com.netcetera.threeds.sdk.infrastructure.C9621nj.get = r2
            int r1 = r1 % 2
            if (r1 != 0) goto L19
            boolean r3 = r3.isEmpty()
            r1 = 55
            int r1 = r1 / r0
            if (r3 != 0) goto L2e
            goto L1f
        L19:
            boolean r3 = r3.isEmpty()
            if (r3 != 0) goto L2e
        L1f:
            int r3 = com.netcetera.threeds.sdk.infrastructure.C9621nj.get
            int r3 = r3 + 57
            int r0 = r3 % 128
            com.netcetera.threeds.sdk.infrastructure.C9621nj.ThreeDS2Service = r0
            int r3 = r3 % 2
            if (r3 != 0) goto L2c
            return
        L2c:
            r3 = 0
            throw r3
        L2e:
            com.netcetera.threeds.sdk.infrastructure.setForegroundGravity r3 = com.netcetera.threeds.sdk.infrastructure.setForegroundGravity.valueOf
            java.lang.Object[] r0 = new java.lang.Object[r0]
            com.netcetera.threeds.sdk.infrastructure.setId r3 = r3.valueOf(r0)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.netcetera.threeds.sdk.infrastructure.C9621nj.ThreeDS2Service(java.lang.String):void");
    }
}
