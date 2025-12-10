package com.netcetera.threeds.sdk.infrastructure;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.os.Process;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import ch.qos.logback.core.CoreConstants;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

/* loaded from: classes5.dex */
public class setIndeterminateTintBlendMode implements setProgressTintList {
    public static char ThreeDS2Service = 0;
    public static char[] ThreeDS2ServiceInstance = null;
    private static int getSDKInfo = 0;
    private static int getSDKVersion = 1;
    private static final String values;
    private final setProgressDrawable get;
    private final Object valueOf$7adc8007;

    static {
        values();
        Object[] objArr = new Object[1];
        get((Process.myTid() >> 22) + 37, "\u0006\u0007\u000b\u0002\u0001\u000b\u0000\u000e\n\r\u0001\u000f\u000f\u0004\u000f\u0006\n\u000e\u0001\b\n\u000f\f\u0003\n\t\b\u0001\n\u0001\t\r\u0006\u000f\u0005\b㘅", (byte) (Color.rgb(0, 0, 0) + 16777250), objArr);
        values = ((String) objArr[0]).intern();
        getSDKInfo = (getSDKVersion + 47) % 128;
    }

    public setIndeterminateTintBlendMode(Object obj, setProgressDrawable setprogressdrawable) {
        this.valueOf$7adc8007 = obj;
        this.get = setprogressdrawable;
    }

    /* JADX WARN: Code restructure failed: missing block: B:0:?, code lost:
        r11 = r11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void get(int r10, java.lang.String r11, byte r12, java.lang.Object[] r13) {
        /*
            Method dump skipped, instructions count: 252
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.netcetera.threeds.sdk.infrastructure.setIndeterminateTintBlendMode.get(int, java.lang.String, byte, java.lang.Object[]):void");
    }

    public static void values() {
        ThreeDS2ServiceInstance = new char[]{13800, 13795, 13812, 13814, 13809, 13817, 13810, 13801, 13820, 13823, 13819, 13822, 13821, 13813, 13765, 13802};
        ThreeDS2Service = (char) 4;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.setProgressTintList
    public void valueOf(List<setIndeterminateTintMode> list) {
        HashSet hashSet = new HashSet(valueOf());
        hashSet.addAll(list);
        String str = this.get.get(new ArrayList(hashSet));
        Object obj = this.valueOf$7adc8007;
        Object[] objArr = new Object[1];
        get(ExpandableListView.getPackedPositionGroup(0L) + 37, "\u0006\u0007\u000b\u0002\u0001\u000b\u0000\u000e\n\r\u0001\u000f\u000f\u0004\u000f\u0006\n\u000e\u0001\b\n\u000f\f\u0003\n\t\b\u0001\n\u0001\t\r\u0006\u000f\u0005\b㘅", (byte) (34 - View.MeasureSpec.getMode(0)), objArr);
        try {
            ((Class) get3DSServerTransactionID.ThreeDS2Service(Gravity.getAbsoluteGravity(0, 0) + 3448, 48 - (ViewConfiguration.getScrollDefaultDelay() >> 16), (char) ((ViewConfiguration.getEdgeSlop() >> 16) + 5412))).getMethod("ThreeDS2ServiceInstance", String.class, String.class).invoke(obj, ((String) objArr[0]).intern(), str);
            getSDKVersion = (getSDKInfo + 119) % 128;
        } catch (Throwable th2) {
            Throwable cause = th2.getCause();
            if (cause == null) {
                throw th2;
            }
            throw cause;
        }
    }

    public static setProgressTintList values(Context context) {
        try {
            setIndeterminateTintBlendMode setindeterminatetintblendmode = new setIndeterminateTintBlendMode(((Class) get3DSServerTransactionID.ThreeDS2Service(Color.rgb(0, 0, 0) + 16780712, 49 - View.combineMeasuredStates(0, 0), (char) (35504 - Drawable.resolveOpacity(0, 0)))).getMethod("get", Context.class).invoke(null, context), new setIndeterminateDrawableTiled());
            getSDKVersion = (getSDKInfo + 63) % 128;
            return setindeterminatetintblendmode;
        } catch (Throwable th2) {
            Throwable cause = th2.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th2;
        }
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.setProgressTintList
    public List<setIndeterminateTintMode> valueOf() {
        getSDKInfo = (getSDKVersion + 49) % 128;
        Object obj = this.valueOf$7adc8007;
        Object[] objArr = new Object[1];
        get(TextUtils.indexOf("", "", 0, 0) + 37, "\u0006\u0007\u000b\u0002\u0001\u000b\u0000\u000e\n\r\u0001\u000f\u000f\u0004\u000f\u0006\n\u000e\u0001\b\n\u000f\f\u0003\n\t\b\u0001\n\u0001\t\r\u0006\u000f\u0005\b㘅", (byte) (34 - (ViewConfiguration.getTapTimeout() >> 16)), objArr);
        try {
            List<setIndeterminateTintMode> ThreeDS2Service2 = this.get.ThreeDS2Service((String) ((Class) get3DSServerTransactionID.ThreeDS2Service(3447 - MotionEvent.axisFromString(""), 48 - TextUtils.indexOf("", "", 0), (char) (5412 - KeyEvent.normalizeMetaState(0)))).getMethod(CoreConstants.VALUE_OF, String.class, String.class).invoke(obj, ((String) objArr[0]).intern(), ""));
            getSDKVersion = (getSDKInfo + 41) % 128;
            return ThreeDS2Service2;
        } catch (Throwable th2) {
            Throwable cause = th2.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th2;
        }
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.setProgressTintList
    public void values(List<setIndeterminateTintMode> list) {
        HashSet hashSet = new HashSet(valueOf());
        getSDKInfo = (getSDKVersion + 7) % 128;
        for (setIndeterminateTintMode setindeterminatetintmode : list) {
            getSDKInfo = (getSDKVersion + 57) % 128;
            hashSet.remove(setindeterminatetintmode);
        }
        String str = this.get.get(new ArrayList(hashSet));
        Object obj = this.valueOf$7adc8007;
        Object[] objArr = new Object[1];
        get(37 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), "\u0006\u0007\u000b\u0002\u0001\u000b\u0000\u000e\n\r\u0001\u000f\u000f\u0004\u000f\u0006\n\u000e\u0001\b\n\u000f\f\u0003\n\t\b\u0001\n\u0001\t\r\u0006\u000f\u0005\b㘅", (byte) (34 - ((Process.getThreadPriority(0) + 20) >> 6)), objArr);
        try {
            ((Class) get3DSServerTransactionID.ThreeDS2Service(3448 - KeyEvent.getDeadChar(0, 0), 48 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), (char) (5412 - Drawable.resolveOpacity(0, 0)))).getMethod("ThreeDS2ServiceInstance", String.class, String.class).invoke(obj, ((String) objArr[0]).intern(), str);
        } catch (Throwable th2) {
            Throwable cause = th2.getCause();
            if (cause == null) {
                throw th2;
            }
            throw cause;
        }
    }
}