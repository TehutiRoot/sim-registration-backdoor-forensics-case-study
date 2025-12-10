package com.netcetera.threeds.sdk.infrastructure;

import android.graphics.Color;
import android.os.Process;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes5.dex */
public class setMeasureWithLargestChildEnabled implements setWeightSum {
    public static char[] ThreeDS2ServiceInstance = {52476, 18962, 49499, 22718, 55285, 27956, 58369, 25436, 64236, 29162, 36647, 1543, 40274, 5328, 37863, 10551, 40985, 16204, 46736, 52648, 19250, 49791, 22864, 53464, 28654, 58661, 31796, 64331, 29331, 35294, 1842, 40573, 5470, 44180, 11217, 41260, 14396, 47012, 52875, 17816, 49950, 23141, 53689, 26759, 59336, 32021, 62535, 29623, 35458, 454, 40733, 5743, 44457, 9442, 41925, 14604, 45157, 53167, 18170, 27682, 60105, 24965, 63598, 30519, 52734, 17607, 50143, 23135, 53566, 12259, 42698, 15835, 46161, 13100, 35309, 139, 40885, 5718, 27938, 60404, 25251, 63878, 28703, 53000, 17896, 56509, 23433, 53842, 10512, 42998, 16045, 46474, 3155, 35610, 480, 39093, 5943, 28229, 58640, 25598, 64169, 29047, 2985, 36167, 1550, 40939, 4256, 43617, 9044, 41993, 15801, 46783, 18546, 49490, 23047, 54149, 21682, 61026, 26444, 63513, 29125, 2813, 35943, 1322, 40453, 6029, 43195, 8816, 47969, 15390, 46534, 20107, 49255, 22824, 53771, 27585, 60548, 26233, 65385, 28913, 2526, 33485, 1099, 40240, 5868, 45010, 8349, 47680, 13074, 46306, 19927, 50835, 22600, 53562, 27388, 58295, 25744, 65113, 30512, 2298, 33199, 6832, 40008, 5397, 'I', 34466, 3566, 37893, 7004, 41365, 10412, 44980, 13876, 48469, 17288, 51873, 20912, 55354, 24391, 58758, 27872, 62400, 31289, 343, 34692, 3823, 38397, 7223, 41795, 10633, 45259, 14327, 48694, 17769, 52100, 21222, 55781, 24637, 59245, 28033, 62659, 31496, 540, 35197, 3981, 38601, 7435, 42032, 11121, 45489, 14552, 48980, 17958, 52579, 21421, 56010, 24852, 'P', 34494, 3575, 37906, 7001, 41368, 10413, 45040, 13888, 48454, 17291, 51883, 20990, 55420, 24395, 58779, 27829, 62432, 31292, 260, 34718, 3795, 38396, 7284, 41794, 10633, 45208, 14311, 48703, 17778, 52126, 21201, 55794, 24632, 59261, 28032, 62608, 31496, 551, 35124, 4012, 38605, 7435, 42032, 11075, 45481, 14539, 48919, 17957, 52607, 21419, 56002, 24837, 59472, 28506, 62897, 31953, 793, 35421, 4471, 38820, 7880, 42241, 11353, 45925, 14783, 49388, 18181, 52829, 21644, 56197, 25333, 59664};
    public static long get = 9192641699336521420L;
    private static int getSDKVersion = 1;
    private static int values;
    private final InterfaceC9641ns ThreeDS2Service = C9642nt.ThreeDS2ServiceInstance(setMeasureWithLargestChildEnabled.class);
    private final setImageAlpha valueOf;

    public setMeasureWithLargestChildEnabled(setImageAlpha setimagealpha) {
        this.valueOf = setimagealpha;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.setWeightSum
    public String ThreeDS2Service(Map<String, setOverscrollHeader> map) {
        HashMap hashMap = new HashMap();
        for (String str : map.keySet()) {
            getSDKVersion = (values + 87) % 128;
            hashMap.put(str, this.valueOf.get(map.get(str)));
        }
        String c9640nr = C9640nr.values(hashMap).toString();
        int i = getSDKVersion + 83;
        values = i % 128;
        if (i % 2 == 0) {
            return c9640nr;
        }
        throw null;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.setWeightSum
    public Map<String, Long> get(String str) {
        if (C9658om.ThreeDS2Service(str)) {
            HashMap hashMap = new HashMap();
            values = (getSDKVersion + 1) % 128;
            return hashMap;
        }
        try {
            Map<String, Object> valueOf = C9640nr.ThreeDS2Service(str).valueOf();
            HashMap hashMap2 = new HashMap();
            Iterator<String> it = valueOf.keySet().iterator();
            getSDKVersion = (values + 55) % 128;
            while (it.hasNext()) {
                int i = getSDKVersion + 113;
                values = i % 128;
                if (i % 2 == 0) {
                    String next = it.next();
                    Object obj = valueOf.get(next);
                    if (obj instanceof Number) {
                        hashMap2.put(next, (Long) obj);
                    } else {
                        InterfaceC9641ns interfaceC9641ns = this.ThreeDS2Service;
                        Object[] objArr = new Object[1];
                        get((char) (ExpandableListView.getPackedPositionChild(0L) + 1), TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 165, (ViewConfiguration.getLongPressTimeout() >> 16) + 53, objArr);
                        interfaceC9641ns.valueOf(((String) objArr[0]).intern());
                    }
                } else {
                    boolean z = valueOf.get(it.next()) instanceof Number;
                    throw null;
                }
            }
            getSDKVersion = (values + 51) % 128;
            return hashMap2;
        } catch (setId e) {
            InterfaceC9641ns interfaceC9641ns2 = this.ThreeDS2Service;
            Object[] objArr2 = new Object[1];
            get((char) (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), (Process.myTid() >> 22) + 217, MotionEvent.axisFromString("") + 74, objArr2);
            interfaceC9641ns2.ThreeDS2Service(((String) objArr2[0]).intern(), e);
            return new HashMap();
        }
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.setWeightSum
    public Map<String, setOverscrollHeader> valueOf(String str) {
        values = (getSDKVersion + 97) % 128;
        if (C9658om.ThreeDS2Service(str)) {
            return new HashMap();
        }
        try {
            Map<String, Object> valueOf = C9640nr.ThreeDS2Service(str).valueOf();
            HashMap hashMap = new HashMap();
            for (String str2 : valueOf.keySet()) {
                Object obj = valueOf.get(str2);
                if (obj instanceof String) {
                    int i = values + 91;
                    getSDKVersion = i % 128;
                    if (i % 2 == 0) {
                        try {
                            hashMap.put(str2, this.valueOf.get((String) obj));
                            int i2 = 36 / 0;
                        } catch (setId e) {
                            InterfaceC9641ns interfaceC9641ns = this.ThreeDS2Service;
                            Object[] objArr = new Object[1];
                            get((char) (View.MeasureSpec.getSize(0) + 52396), View.combineMeasuredStates(0, 0), 59 - KeyEvent.normalizeMetaState(0), objArr);
                            interfaceC9641ns.ThreeDS2Service(((String) objArr[0]).intern(), e);
                        }
                    } else {
                        hashMap.put(str2, this.valueOf.get((String) obj));
                    }
                } else {
                    InterfaceC9641ns interfaceC9641ns2 = this.ThreeDS2Service;
                    Object[] objArr2 = new Object[1];
                    get((char) (Color.blue(0) + 27755), 58 - Process.getGidForName(""), ExpandableListView.getPackedPositionChild(0L) + 44, objArr2);
                    interfaceC9641ns2.valueOf(((String) objArr2[0]).intern());
                }
            }
            getSDKVersion = (values + 87) % 128;
            return hashMap;
        } catch (setId e2) {
            InterfaceC9641ns interfaceC9641ns3 = this.ThreeDS2Service;
            Object[] objArr3 = new Object[1];
            get((char) (TextUtils.indexOf("", "", 0, 0) + 3065), View.MeasureSpec.getMode(0) + 102, (ViewConfiguration.getScrollBarSize() >> 8) + 62, objArr3);
            interfaceC9641ns3.ThreeDS2Service(((String) objArr3[0]).intern(), e2);
            return new HashMap();
        }
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.setWeightSum
    public String valueOf(Map<String, Long> map) {
        int i = getSDKVersion + 13;
        values = i % 128;
        if (i % 2 == 0) {
            String c9640nr = C9640nr.values(map).toString();
            getSDKVersion = (values + 87) % 128;
            return c9640nr;
        }
        C9640nr.values(map).toString();
        throw null;
    }

    private static void get(char c, int i, int i2, Object[] objArr) {
        String str;
        synchronized (ConfigParameters.valueOf) {
            try {
                char[] cArr = new char[i2];
                ConfigParameters.ThreeDS2Service = 0;
                while (true) {
                    int i3 = ConfigParameters.ThreeDS2Service;
                    if (i3 < i2) {
                        cArr[i3] = (char) ((ThreeDS2ServiceInstance[i + i3] ^ (i3 * get)) ^ c);
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
}