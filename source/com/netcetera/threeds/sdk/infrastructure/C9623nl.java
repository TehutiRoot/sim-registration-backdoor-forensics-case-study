package com.netcetera.threeds.sdk.infrastructure;

import android.graphics.Color;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.facebook.stetho.dumpapp.Framer;
import com.fasterxml.jackson.core.json.ByteSourceJsonBootstrapper;
import com.google.common.base.Ascii;
import com.google.common.primitives.SignedBytes;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.p023io.encoding.Base64;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.netcetera.threeds.sdk.infrastructure.nl */
/* loaded from: classes5.dex */
public class C9623nl {
    public static int ThreeDS2Service = 0;
    public static byte[] ThreeDS2ServiceInstance = null;
    private static int cleanup = 0;
    public static int get = 0;
    private static int getSDKVersion = 1;
    private static final InterfaceC9652ns getWarnings;
    public static short[] valueOf;
    public static int values;
    private final JSONArray getSDKInfo;

    static {
        ThreeDS2Service();
        getWarnings = C9653nt.ThreeDS2ServiceInstance(C9623nl.class);
        getSDKVersion = (cleanup + 109) % 128;
    }

    private C9623nl(JSONArray jSONArray) {
        this.getSDKInfo = jSONArray;
    }

    public static void ThreeDS2Service() {
        get = -1833250753;
        ThreeDS2ServiceInstance = new byte[]{-3, 107, 58, Ascii.CAN, -6, 17, -124, Ascii.f52684EM, 35, -36, -111, 74, 35, Framer.ENTER_FRAME_PREFIX, 65, -20, -121, 40, -37, 89, 58, Ascii.CAN, -6, 17, -106, 85, 75, 43, Ascii.CAN, 69, 84, 86, 9, 15, 82, 123, 75, Ascii.DC4, -55, -119, 77, -121, -122, -123, 81, 83, Byte.MAX_VALUE, 32, 126, -109, 114, 80, Framer.STDERR_FRAME_PREFIX, 71, -55, -119, 77, 125, 97, 80, 115, -124, -122, Framer.STDIN_REQUEST_FRAME_PREFIX, 13, -64, 89, -123, -127, Ascii.ESC, -58, -125, Byte.MAX_VALUE, 82, -123, 96, 82, 126, 19, -57, -126, 80, 82, 56, -10, 71, 35, -123, 99, -103, 91, 51, -116, -114, 46, -55, -117, -30, Byte.MIN_VALUE, Byte.MAX_VALUE, -122, -117, -64, -24, -107, -60, 70, 35, -123, 99, -3, 109, 126, -100, -66, -45, SignedBytes.MAX_POWER_OF_TWO, -101, -91, -40, 83, -114, -91, -93, -125, -24, 65, -84, -35, 91, 126, -100, -66, -45, 85, -107, -103, -109, -110, -111, -99, -97, -85, Ascii.f52687GS, -20, -3, Ascii.ESC, Base64.padSymbol, 82, Ascii.f52687GS, 9, -34, -3, Ascii.ESC, Base64.padSymbol, 82, ByteSourceJsonBootstrapper.UTF8_BOM_3, 36, 37, 12, 109, -46, 13, 36, 34, 2, 86, -58, 42, Ascii.f52686FS, 7, Ascii.CAN, 100, ByteSourceJsonBootstrapper.UTF8_BOM_3, Ascii.SUB, 36, 87, -53, 14, Ascii.ETB, 8, 42, -2, 32, 8, Ascii.f52686FS, 94, -63, 14, Ascii.CAN, 109, -46, 12, 14, 43, 15, 0, 42, 88, -63, Ascii.CAN, Ascii.f52686FS, Framer.STDIN_REQUEST_FRAME_PREFIX, -47, Ascii.NAK, 6, Ascii.ETB, 65};
        values = 36;
        ThreeDS2Service = 94151364;
    }

    public static <V> C9623nl valueOf(Collection<V> collection) {
        C9623nl values2 = values(new JSONArray((Collection) collection));
        int i = cleanup + 7;
        getSDKVersion = i % 128;
        if (i % 2 == 0) {
            int i2 = 88 / 0;
        }
        return values2;
    }

    public static C9623nl values() {
        int i = cleanup + 83;
        getSDKVersion = i % 128;
        if (i % 2 == 0) {
            values((JSONArray) null);
            throw null;
        }
        C9623nl values2 = values((JSONArray) null);
        getSDKVersion = (cleanup + 53) % 128;
        return values2;
    }

    public int ThreeDS2ServiceInstance() {
        cleanup = (getSDKVersion + 105) % 128;
        int length = this.getSDKInfo.length();
        cleanup = (getSDKVersion + 75) % 128;
        return length;
    }

    public void get(String str) {
        getSDKVersion = (cleanup + 51) % 128;
        if (!(!C9669om.ThreeDS2ServiceInstance(str))) {
            int i = cleanup + 19;
            getSDKVersion = i % 128;
            if (i % 2 == 0) {
                this.getSDKInfo.put(str);
                throw null;
            }
            this.getSDKInfo.put(str);
        }
        cleanup = (getSDKVersion + 63) % 128;
    }

    public String toString() {
        cleanup = (getSDKVersion + 71) % 128;
        String jSONArray = this.getSDKInfo.toString();
        int i = cleanup + 13;
        getSDKVersion = i % 128;
        if (i % 2 == 0) {
            int i2 = 7 / 0;
        }
        return jSONArray;
    }

    private static void ThreeDS2ServiceInstance(byte b, short s, int i, int i2, int i3, Object[] objArr) {
        String obj;
        synchronized (createTransaction.ThreeDS2ServiceInstance) {
            try {
                StringBuilder sb = new StringBuilder();
                int i4 = values;
                int i5 = i2 + i4;
                int i6 = i5 == -1 ? 1 : 0;
                if (i6 != 0) {
                    byte[] bArr = ThreeDS2ServiceInstance;
                    if (bArr != null) {
                        i5 = (byte) (bArr[ThreeDS2Service + i] + i4);
                    } else {
                        i5 = (short) (valueOf[ThreeDS2Service + i] + i4);
                    }
                }
                if (i5 > 0) {
                    createTransaction.values = ((i + i5) - 2) + ThreeDS2Service + i6;
                    char c = (char) (i3 + get);
                    createTransaction.get = c;
                    sb.append(c);
                    createTransaction.valueOf = createTransaction.get;
                    createTransaction.ThreeDS2Service = 1;
                    while (createTransaction.ThreeDS2Service < i5) {
                        byte[] bArr2 = ThreeDS2ServiceInstance;
                        if (bArr2 != null) {
                            int i7 = createTransaction.values;
                            createTransaction.values = i7 - 1;
                            createTransaction.get = (char) (createTransaction.valueOf + (((byte) (bArr2[i7] + s)) ^ b));
                        } else {
                            short[] sArr = valueOf;
                            int i8 = createTransaction.values;
                            createTransaction.values = i8 - 1;
                            createTransaction.get = (char) (createTransaction.valueOf + (((short) (sArr[i8] + s)) ^ b));
                        }
                        sb.append(createTransaction.get);
                        createTransaction.valueOf = createTransaction.get;
                        createTransaction.ThreeDS2Service++;
                    }
                }
                obj = sb.toString();
            } catch (Throwable th2) {
                throw th2;
            }
        }
        objArr[0] = obj;
    }

    public static C9623nl values(String str) {
        try {
            C9623nl values2 = values(new JSONArray(str));
            getSDKVersion = (cleanup + 111) % 128;
            return values2;
        } catch (JSONException e) {
            throw setForegroundGravity.onCompleted.valueOf(e);
        }
    }

    public C9651nr ThreeDS2Service(int i) {
        getSDKVersion = (cleanup + 87) % 128;
        JSONObject optJSONObject = this.getSDKInfo.optJSONObject(i);
        Process.myPid();
        ViewConfiguration.getMaximumDrawingCacheSize();
        Process.getElapsedCpuTime();
        SystemClock.elapsedRealtime();
        Process.getThreadPriority(0);
        C9651nr ThreeDS2Service2 = C9651nr.ThreeDS2Service(optJSONObject);
        int i2 = getSDKVersion + 37;
        cleanup = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 14 / 0;
        }
        return ThreeDS2Service2;
    }

    public String valueOf(int i) {
        cleanup = (getSDKVersion + 15) % 128;
        String optString = this.getSDKInfo.isNull(i) ? null : this.getSDKInfo.optString(i, null);
        if (!(!C9669om.values((CharSequence) optString))) {
            InterfaceC9652ns interfaceC9652ns = getWarnings;
            Object[] objArr = new Object[1];
            ThreeDS2ServiceInstance((byte) ((Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 35), (short) ((-95) - TextUtils.getOffsetBefore("", 0)), (-94151280) - (ViewConfiguration.getMinimumFlingVelocity() >> 16), (-37) - Color.argb(0, 0, 0, 0), TextUtils.lastIndexOf("", '0', 0) + 1833250845, objArr);
            interfaceC9652ns.ThreeDS2Service(((String) objArr[0]).intern(), Integer.valueOf(i), optString);
            getSDKVersion = (cleanup + 111) % 128;
            return null;
        }
        KeyEvent.getDeadChar(0, 0);
        View.getDefaultSize(0, 0);
        View.MeasureSpec.getSize(0);
        ExpandableListView.getPackedPositionForChild(0, 0);
        SystemClock.currentThreadTimeMillis();
        return optString;
    }

    public void get(int i, C9651nr c9651nr) {
        int i2 = getSDKVersion + 71;
        cleanup = i2 % 128;
        if (i2 % 2 == 0 ? !C9664oh.get(c9651nr) : (!C9664oh.get(c9651nr))) {
            return;
        }
        cleanup = (getSDKVersion + 33) % 128;
        try {
            try {
                this.getSDKInfo.put(i, c9651nr.values());
            } catch (JSONException unused) {
                InterfaceC9652ns interfaceC9652ns = getWarnings;
                Object[] objArr = new Object[1];
                ThreeDS2ServiceInstance((byte) ((-122) - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1))), (short) ((ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 107), (-94151221) - (ViewConfiguration.getLongPressTimeout() >> 16), (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) - 36, 1833250821 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), objArr);
                interfaceC9652ns.ThreeDS2Service(((String) objArr[0]).intern(), Integer.valueOf(i), c9651nr);
            }
        } catch (JSONException unused2) {
        }
    }

    public static C9623nl values(JSONArray jSONArray) {
        C9623nl c9623nl = new C9623nl((JSONArray) C9664oh.ThreeDS2Service(jSONArray, new JSONArray()));
        getSDKVersion = (cleanup + 109) % 128;
        return c9623nl;
    }

    public void ThreeDS2Service(C9651nr c9651nr) {
        getSDKVersion = (cleanup + 43) % 128;
        if (C9664oh.get(c9651nr)) {
            getSDKVersion = (cleanup + 75) % 128;
            this.getSDKInfo.put(c9651nr.values());
        }
    }

    public Object values(int i) {
        cleanup = (getSDKVersion + 79) % 128;
        try {
            Object obj = this.getSDKInfo.get(i);
            ExpandableListView.getPackedPositionForGroup(0);
            Color.green(0);
            TextUtils.lastIndexOf("", '0', 0);
            TextUtils.getOffsetAfter("", 0);
            Process.getGidForName("");
            obj.toString();
            cleanup = (getSDKVersion + 125) % 128;
            return obj;
        } catch (JSONException unused) {
            InterfaceC9652ns interfaceC9652ns = getWarnings;
            Object[] objArr = new Object[1];
            ThreeDS2ServiceInstance((byte) ((-24) - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1))), (short) (KeyEvent.getDeadChar(0, 0) - 107), (-94151331) + (ViewConfiguration.getKeyRepeatTimeout() >> 16), (-38) - MotionEvent.axisFromString(""), 1833250826 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), objArr);
            interfaceC9652ns.ThreeDS2Service(((String) objArr[0]).intern(), Integer.valueOf(i));
            return null;
        }
    }

    public List<Object> get() {
        try {
            ArrayList arrayList = new ArrayList();
            int i = 0;
            while (i < this.getSDKInfo.length()) {
                Object obj = this.getSDKInfo.get(i);
                if (!(obj instanceof JSONArray)) {
                    if (obj instanceof JSONObject) {
                        obj = C9651nr.ThreeDS2Service((JSONObject) obj).valueOf();
                    }
                } else {
                    obj = values((JSONArray) obj).get();
                    cleanup = (getSDKVersion + 39) % 128;
                }
                arrayList.add(obj);
                i++;
                getSDKVersion = (cleanup + 65) % 128;
            }
            return arrayList;
        } catch (JSONException e) {
            throw setForegroundGravity.onCompleted.valueOf(e);
        }
    }

    public JSONArray valueOf() {
        int i = getSDKVersion + 69;
        cleanup = i % 128;
        if (i % 2 == 0) {
            return this.getSDKInfo;
        }
        throw null;
    }
}
