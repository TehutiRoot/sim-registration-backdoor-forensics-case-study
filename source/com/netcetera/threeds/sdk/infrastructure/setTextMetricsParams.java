package com.netcetera.threeds.sdk.infrastructure;

import android.graphics.ImageFormat;
import android.os.Process;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes5.dex */
public class setTextMetricsParams {
    private static final String ThreeDS2Service;
    private static final String ThreeDS2ServiceInstance;
    private static int cleanup = 1;
    public static long get;
    private static int initialize;
    private static final String valueOf;
    public static char[] values;
    private final Object getWarnings$30c565a5;

    static {
        ThreeDS2Service();
        Object[] objArr = new Object[1];
        values((char) ((ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) - 1), (Process.myPid() >> 22) + 28, 6 - KeyEvent.normalizeMetaState(0), objArr);
        valueOf = ((String) objArr[0]).intern();
        Object[] objArr2 = new Object[1];
        values((char) (MotionEvent.axisFromString("") + 1), 14 - (ViewConfiguration.getTapTimeout() >> 16), TextUtils.indexOf("", "", 0) + 14, objArr2);
        ThreeDS2Service = ((String) objArr2[0]).intern();
        Object[] objArr3 = new Object[1];
        values((char) (ViewConfiguration.getScrollDefaultDelay() >> 16), ViewConfiguration.getKeyRepeatDelay() >> 16, (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 14, objArr3);
        ThreeDS2ServiceInstance = ((String) objArr3[0]).intern();
        initialize = (cleanup + 53) % 128;
    }

    public setTextMetricsParams(Object obj) {
        this.getWarnings$30c565a5 = obj;
    }

    public static void ThreeDS2Service() {
        values = new char[]{'a', 2492, 5069, 7640, 9996, 12595, 15199, 17780, 20136, 22690, 25300, 27870, 30225, 32810, 's', 2491, 5077, 7640, 9996, 12595, 15199, 17780, 20136, 22690, 25300, 27870, 30225, 32810, 'a', 2492, 5069, 7624, 10030, 12567, 37380, 39879, 33190, 36737, 46435, 41741};
        get = 1861348764647098847L;
    }

    private boolean valueOf(String str) {
        try {
            new JSONObject(str);
            int i = cleanup + 103;
            initialize = i % 128;
            if (i % 2 != 0) {
                int i2 = 62 / 0;
            }
            return true;
        } catch (JSONException unused) {
            return false;
        }
    }

    private static void values(char c, int i, int i2, Object[] objArr) {
        String str;
        synchronized (ConfigParameters.valueOf) {
            try {
                char[] cArr = new char[i2];
                ConfigParameters.ThreeDS2Service = 0;
                while (true) {
                    int i3 = ConfigParameters.ThreeDS2Service;
                    if (i3 < i2) {
                        cArr[i3] = (char) ((values[i + i3] ^ (i3 * get)) ^ c);
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

    public setBreakStrategy ThreeDS2ServiceInstance(String str) throws setId {
        int i = cleanup + 11;
        initialize = i % 128;
        try {
            if (i % 2 == 0) {
                if (valueOf(str)) {
                    C9651nr c9651nr = C9651nr.get(str);
                    Object[] objArr = new Object[1];
                    values((char) (ViewConfiguration.getMaximumFlingVelocity() >> 16), ViewConfiguration.getScrollDefaultDelay() >> 16, TextUtils.indexOf("", "", 0, 0) + 14, objArr);
                    String values2 = c9651nr.values(((String) objArr[0]).intern());
                    Object[] objArr2 = new Object[1];
                    values((char) ((Process.getThreadPriority(0) + 20) >> 6), 13 - ImageFormat.getBitsPerPixel(0), 14 - TextUtils.getTrimmedLength(""), objArr2);
                    String values3 = c9651nr.values(((String) objArr2[0]).intern());
                    Object[] objArr3 = new Object[1];
                    values((char) ((-1) - TextUtils.indexOf((CharSequence) "", '0', 0)), (ViewConfiguration.getLongPressTimeout() >> 16) + 28, (ViewConfiguration.getWindowTouchSlop() >> 8) + 6, objArr3);
                    String values4 = c9651nr.values(((String) objArr3[0]).intern());
                    String lowerCase = values4.trim().toLowerCase();
                    Object[] objArr4 = new Object[1];
                    values((char) (TextUtils.indexOf("", "", 0, 0) + 37484), Gravity.getAbsoluteGravity(0, 0) + 34, 5 - ((byte) KeyEvent.getModifierMetaStateMask()), objArr4);
                    if (lowerCase.startsWith(((String) objArr4[0]).intern())) {
                        setBreakStrategy setbreakstrategy = new setBreakStrategy(values4, values3, ((AbstractC9700ql) ((Class) get3DSServerTransactionID.ThreeDS2Service(448 - (ViewConfiguration.getJumpTapTimeout() >> 16), 64 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), (char) (45053 - (ViewConfiguration.getEdgeSlop() >> 16)))).getMethod("get", String.class).invoke(this.getWarnings$30c565a5, values2)).get());
                        initialize = (cleanup + 99) % 128;
                        return setbreakstrategy;
                    }
                    initialize = (cleanup + 81) % 128;
                    throw setForegroundGravity.getEncryptionCertificate.valueOf(values4);
                }
                throw setForegroundGravity.visaSchemeConfiguration.valueOf(new Object[0]);
            }
            valueOf(str);
            throw null;
        } catch (C9727rl e) {
            throw setForegroundGravity.dinersSchemeConfiguration.valueOf(e);
        }
    }
}
