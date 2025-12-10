package com.netcetera.threeds.sdk.infrastructure;

import android.graphics.Color;
import android.graphics.PointF;
import android.text.TextUtils;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: com.netcetera.threeds.sdk.infrastructure.mu */
/* loaded from: classes5.dex */
public class C9593mu {
    private static int ThreeDS2Service = 1;
    private static int ThreeDS2ServiceInstance;
    public static int[] get;
    private static final List<String> valueOf;

    static {
        ThreeDS2ServiceInstance();
        ArrayList arrayList = new ArrayList();
        Object[] objArr = new Object[1];
        get(new int[]{453858550, 2013913397, 109592385, -1711050766, -948296114, 608737425, -2073254969, 2091001105, 719046267, -446129658, -957503241, -1228671805, 696204370, 327224116, -768516560, 1621517060, -1634326435, -756365402, -1544379401, -794340711, -60766264, -1252028995, 1988836811, -274420984, -963449966, -1082614513, -1322006209, 1421907833}, 53 - (ViewConfiguration.getMaximumFlingVelocity() >> 16), objArr);
        arrayList.add(((String) objArr[0]).intern());
        Object[] objArr2 = new Object[1];
        get(new int[]{453858550, 2013913397, 109592385, -1711050766, -948296114, 608737425, -2073254969, 2091001105, 719046267, -446129658, -957503241, -1228671805, 696204370, 327224116, -768516560, 1621517060, 128815213, -2037856889, 325717252, 1463994889, -1808876985, -949233221, 1342835908, 1546335778, -1893655018, 841280241}, (-16777165) - Color.rgb(0, 0, 0), objArr2);
        arrayList.add(((String) objArr2[0]).intern());
        Object[] objArr3 = new Object[1];
        get(new int[]{453858550, 2013913397, 109592385, -1711050766, -948296114, 608737425, -2073254969, 2091001105, 719046267, -446129658, -957503241, -1228671805, -613455845, -2086226952, 1717717340, 13451827, -1338700885, -1358659006, -1714270709, 1436424433, 514205173, -56354246, 1512102520, -2124163404, 1342835908, 1546335778, -1893655018, 841280241}, (ViewConfiguration.getScrollBarSize() >> 8) + 55, objArr3);
        arrayList.add(((String) objArr3[0]).intern());
        Object[] objArr4 = new Object[1];
        get(new int[]{453858550, 2013913397, 109592385, -1711050766, -948296114, 608737425, -2073254969, 2091001105, 719046267, -446129658, -957503241, -1228671805, 948800142, -674335599, 1205738173, 1648978366, 1342835908, 1546335778, -1893655018, 841280241}, 38 - TextUtils.lastIndexOf("", '0'), objArr4);
        arrayList.add(((String) objArr4[0]).intern());
        Object[] objArr5 = new Object[1];
        get(new int[]{453858550, 2013913397, 109592385, -1711050766, 1612889759, -1711688182, 1016055820, -1992365842, -1649925983, 258698968, 1923868757, -417461954, -1149591057, -350164259, -100315161, 720172454, -444961451, 1314612723, 1342835908, 1546335778, -1893655018, 841280241}, (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 43, objArr5);
        arrayList.add(((String) objArr5[0]).intern());
        Object[] objArr6 = new Object[1];
        get(new int[]{453858550, 2013913397, 109592385, -1711050766, 1612889759, -1711688182, 1016055820, -1992365842, -1649925983, 258698968, 1923868757, -417461954, -1149591057, -350164259, -96748887, -1023246092, 1202763466, -1744913349, 1591867239, -1194129659}, 40 - (ViewConfiguration.getLongPressTimeout() >> 16), objArr6);
        arrayList.add(((String) objArr6[0]).intern());
        Object[] objArr7 = new Object[1];
        get(new int[]{453858550, 2013913397, 109592385, -1711050766, -948296114, 608737425, -2073254969, 2091001105, 719046267, -446129658, -80120485, -1134339185, 940821088, -861212674, 711671307, 772796034, 1342835908, 1546335778, -1893655018, 841280241}, (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 39, objArr7);
        arrayList.add(((String) objArr7[0]).intern());
        Object[] objArr8 = new Object[1];
        get(new int[]{453858550, 2013913397, 109592385, -1711050766, -948296114, 608737425, -2073254969, 2091001105, 719046267, -446129658, -80120485, -1134339185, -1418129645, 625068451, 1342835908, 1546335778, -1893655018, 841280241}, 35 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), objArr8);
        arrayList.add(((String) objArr8[0]).intern());
        valueOf = Collections.unmodifiableList(arrayList);
        ThreeDS2Service = (ThreeDS2ServiceInstance + 69) % 128;
    }

    public static void ThreeDS2ServiceInstance() {
        get = new int[]{1335759462, -96183984, -304880498, -1826248117, -1328779145, 1568844121, -1100608483, -675848618, -694697857, 474107013, -1652306988, -288101960, 4905959, 205143473, -1365372807, 775829351, 1756951924, -929378708};
    }

    private static void get(int[] iArr, int i, Object[] objArr) {
        String str;
        synchronized (onError.ThreeDS2ServiceInstance) {
            try {
                char[] cArr = new char[4];
                char[] cArr2 = new char[iArr.length << 1];
                int[] iArr2 = (int[]) get.clone();
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

    public Map<String, String> ThreeDS2Service() {
        HashMap hashMap = new HashMap();
        for (String str : valueOf) {
            ThreeDS2Service = (ThreeDS2ServiceInstance + 99) % 128;
            try {
                String values = C9654oi.values(getClass().getClassLoader().getResourceAsStream(str), StandardCharsets.UTF_8);
                Object[] objArr = new Object[1];
                get(new int[]{2053712776, -2056677895}, 1 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), objArr);
                hashMap.put(str, C9658om.values(values, ((String) objArr[0]).intern(), ""));
            } catch (IOException | NullPointerException unused) {
            }
        }
        ThreeDS2ServiceInstance = (ThreeDS2Service + 35) % 128;
        return hashMap;
    }
}