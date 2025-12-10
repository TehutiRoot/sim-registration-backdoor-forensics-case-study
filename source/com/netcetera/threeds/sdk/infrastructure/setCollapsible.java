package com.netcetera.threeds.sdk.infrastructure;

import android.graphics.Color;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.util.Base64;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.fasterxml.jackson.core.json.ByteSourceJsonBootstrapper;
import com.google.common.base.Ascii;
import com.netcetera.threeds.sdk.infrastructure.C9605mv;
import com.netcetera.threeds.sdk.infrastructure.setIndeterminateTintMode;
import es.dmoral.toasty.BuildConfig;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import org.bouncycastle.crypto.signers.PSSSigner;
import org.bouncycastle.pqc.math.linearalgebra.Matrix;
import org.json.JSONException;
import org.json.JSONObject;
import th.p047co.dtac.android.dtacone.view.activity.CameraActivity;

/* loaded from: classes5.dex */
public class setCollapsible {
    private static int ConfigParameters = 1;
    public static short[] ThreeDS2Service;
    public static int ThreeDS2ServiceInstance;
    private static final List<String> cleanup;
    public static int get;
    public static long getSDKVersion;
    public static char[] initialize;
    private static int onError;
    public static byte[] valueOf;
    public static int values;
    private final setIndeterminateTintMode.ThreeDS2Service ThreeDS2Service$InitializationCallback;
    private final C9613nb createTransaction;
    private final InterfaceC9652ns getSDKInfo = C9653nt.ThreeDS2ServiceInstance(setCollapsible.class);
    private final setHighlights getWarnings;

    static {
        ThreeDS2ServiceInstance();
        ArrayList arrayList = new ArrayList();
        Object[] objArr = new Object[1];
        ThreeDS2ServiceInstance((char) (34073 - TextUtils.indexOf((CharSequence) "", '0', 0, 0)), 128 - TextUtils.lastIndexOf("", '0', 0, 0), 1 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), objArr);
        arrayList.add(((String) objArr[0]).intern());
        Object[] objArr2 = new Object[1];
        values((byte) (ViewConfiguration.getEdgeSlop() >> 16), (short) (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), View.MeasureSpec.getSize(0) - 638799919, (-18) - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), KeyEvent.keyCodeFromString("") + 393151780, objArr2);
        arrayList.add(((String) objArr2[0]).intern());
        Object[] objArr3 = new Object[1];
        ThreeDS2ServiceInstance((char) (20676 - MotionEvent.axisFromString("")), ExpandableListView.getPackedPositionType(0L) + BuildConfig.VERSION_CODE, 1 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), objArr3);
        arrayList.add(((String) objArr3[0]).intern());
        Object[] objArr4 = new Object[1];
        values((byte) (ViewConfiguration.getLongPressTimeout() >> 16), (short) ExpandableListView.getPackedPositionGroup(0L), ((byte) KeyEvent.getModifierMetaStateMask()) - 638799917, TextUtils.indexOf((CharSequence) "", '0') - 18, 393151790 - ExpandableListView.getPackedPositionChild(0L), objArr4);
        arrayList.add(((String) objArr4[0]).intern());
        Object[] objArr5 = new Object[1];
        ThreeDS2ServiceInstance((char) View.resolveSize(0, 0), 131 - KeyEvent.getDeadChar(0, 0), Gravity.getAbsoluteGravity(0, 0) + 1, objArr5);
        arrayList.add(((String) objArr5[0]).intern());
        cleanup = Collections.unmodifiableList(arrayList);
        int i = onError + 61;
        ConfigParameters = i % 128;
        if (i % 2 != 0) {
            return;
        }
        throw null;
    }

    public setCollapsible(setHighlights sethighlights, C9613nb c9613nb, setIndeterminateTintMode.ThreeDS2Service threeDS2Service) {
        this.getWarnings = sethighlights;
        this.createTransaction = c9613nb;
        this.ThreeDS2Service$InitializationCallback = threeDS2Service;
    }

    private boolean ThreeDS2Service(String str) {
        ConfigParameters = (onError + 91) % 128;
        Object[] objArr = new Object[1];
        values((byte) (ViewConfiguration.getKeyRepeatTimeout() >> 16), (short) (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), (ViewConfiguration.getScrollBarSize() >> 8) - 638799952, Color.rgb(0, 0, 0) + 16777197, 393151841 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)), objArr);
        String[] split = str.split(((String) objArr[0]).intern());
        if (split.length != 5) {
            onError = (ConfigParameters + 35) % 128;
            return false;
        }
        int length = split.length;
        int i = 0;
        while (i < length) {
            onError = (ConfigParameters + CameraActivity.REQUEST_CODE) % 128;
            try {
                Base64.decode(split[i], 8);
                i++;
                ConfigParameters = (onError + 31) % 128;
            } catch (IllegalArgumentException unused) {
                return false;
            }
        }
        return true;
    }

    public static void ThreeDS2ServiceInstance() {
        ThreeDS2ServiceInstance = -393151748;
        valueOf = new byte[]{-14, 14, 19, 15, 58, -64, -1, -4, 18, -4, -13, 82, -82, 13, -3, -12, 5, 79, -82, 3, 79, -76, 11, -2, -6, -5, 6, 5, -2, -15, 84, -79, -5, 84, ByteSourceJsonBootstrapper.UTF8_BOM_2, -16, 17, 68, -43, 7, -15, 51, -51, 15, 17, 19, ByteSourceJsonBootstrapper.UTF8_BOM_2, -3, -12, 84, -89, Ascii.ETB, 66, PSSSigner.TRAILER_IMPLICIT, -1, -15, 4, -9, 7, 15, -2, 1, 68, ByteSourceJsonBootstrapper.UTF8_BOM_2, 3, 66, -84, 5, 1, 78, PSSSigner.TRAILER_IMPLICIT, -8, -9, 6, 12, 67, -83, 14, 19, 15, -16, -46, 4, -10, 37, -37, -1, 6, -11, 15, -7, -4, 3, -2, 44, -34, -2, -7, 9, -7, 0, 11, -7, 5, -9, -11, -9, 37, -21, Ascii.DC4, -30, 16, 2, ByteSourceJsonBootstrapper.UTF8_BOM_1, ByteSourceJsonBootstrapper.UTF8_BOM_1};
        values = 18;
        get = 638800032;
        initialize = new char[]{Matrix.MATRIX_TYPE_RANDOM_REGULAR, 26350, 52597, 13252, 39493, 193, 26407, 52649, 13432, 39584, 316, 26524, 52983, 13615, 39935, 584, 26816, 53071, 13759, 40063, 17742, 9202, 34921, 30424, 57177, 17885, 8763, 34997, 29028, 57276, 17440, 8832, 35819, 28723, 57061, 18262, 11714, 35411, 28859, 55588, 18350, 11272, 35534, 29448, 55418, 18169, 12131, 38361, 29249, 55495, 16758, 12171, 37917, 29316, 56079, 16427, 11940, 38750, 32236, 55933, 16516, 10537, 38835, 31785, 55949, 17174, 10696, Matrix.MATRIX_TYPE_RANDOM_REGULAR, 26350, 52597, 13252, 39493, 193, 26407, 52649, 13432, 39584, 316, 26524, 52983, 13615, 39934, 586, 26837, 53064, 13798, 39999, 691, 26899, 53202, 13845, 40297, 997, 27259, 53385, 14165, 40351, 1084, 27316, 53516, 14210, 40466, 1313, 27590, 53828, 14573, 40803, 1432, 27685, 53921, 14635, 40841, 1550, 27790, 54187, 34857, 61098, 17697, 48022, 4617, 34964, 61283, 17885, 48229, 4823, 35151, 'N', 26276, 52567, 34064, 20714, '='};
        getSDKVersion = -6422727561731152245L;
    }

    private static void values(byte b, short s, int i, int i2, int i3, Object[] objArr) {
        int i4;
        String obj;
        synchronized (createTransaction.ThreeDS2ServiceInstance) {
            try {
                StringBuilder sb = new StringBuilder();
                int i5 = values;
                int i6 = i2 + i5;
                if (i6 == -1) {
                    i4 = 1;
                } else {
                    i4 = 0;
                }
                if (i4 != 0) {
                    byte[] bArr = valueOf;
                    if (bArr != null) {
                        i6 = (byte) (bArr[get + i] + i5);
                    } else {
                        i6 = (short) (ThreeDS2Service[get + i] + i5);
                    }
                }
                if (i6 > 0) {
                    createTransaction.values = ((i + i6) - 2) + get + i4;
                    char c = (char) (i3 + ThreeDS2ServiceInstance);
                    createTransaction.get = c;
                    sb.append(c);
                    createTransaction.valueOf = createTransaction.get;
                    createTransaction.ThreeDS2Service = 1;
                    while (createTransaction.ThreeDS2Service < i6) {
                        byte[] bArr2 = valueOf;
                        if (bArr2 != null) {
                            int i7 = createTransaction.values;
                            createTransaction.values = i7 - 1;
                            createTransaction.get = (char) (createTransaction.valueOf + (((byte) (bArr2[i7] + s)) ^ b));
                        } else {
                            short[] sArr = ThreeDS2Service;
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

    public setTitleMarginBottom valueOf(String str) throws setId {
        String str2;
        boolean z;
        ConfigParameters = (onError + 7) % 128;
        if (!C9669om.values((CharSequence) str)) {
            if (!this.createTransaction.get()) {
                int i = ConfigParameters + 19;
                onError = i % 128;
                if (i % 2 == 0) {
                    if (ThreeDS2Service(str)) {
                        onError = (ConfigParameters + 15) % 128;
                        if (ThreeDS2ServiceInstance(str)) {
                            setForegroundGravity setforegroundgravity = setForegroundGravity.Transaction$BridgingMessageExtensionVersion;
                            Object[] objArr = new Object[1];
                            values((byte) Gravity.getAbsoluteGravity(0, 0), (short) (ViewConfiguration.getPressedStateDuration() >> 16), (ViewConfiguration.getKeyRepeatDelay() >> 16) - 638800032, (-18) - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), 393151816 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)), objArr);
                            String intern = ((String) objArr[0]).intern();
                            Object[] objArr2 = new Object[1];
                            ThreeDS2ServiceInstance((char) ((TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 17692), 20 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), 47 - ExpandableListView.getPackedPositionType(0L), objArr2);
                            throw new setMenuCallbacks(setforegroundgravity, intern, ((String) objArr2[0]).intern()).values();
                        }
                    }
                } else {
                    ThreeDS2Service(str);
                    throw null;
                }
            }
            try {
                if (ThreeDS2Service(str)) {
                    str2 = this.getWarnings.get(str);
                    z = true;
                } else {
                    str2 = str;
                    z = false;
                }
                try {
                    JSONObject jSONObject = new JSONObject(str2);
                    ThreeDS2ServiceInstance(jSONObject);
                    return new setTitleMarginBottom(C9651nr.ThreeDS2Service(jSONObject), z);
                } catch (JSONException e) {
                    setForegroundGravity setforegroundgravity2 = setForegroundGravity.getSDKTransactionID;
                    Object[] objArr3 = new Object[1];
                    values((byte) (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), (short) ((SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) - 1), (ViewConfiguration.getScrollDefaultDelay() >> 16) - 638800032, (ViewConfiguration.getKeyRepeatTimeout() >> 16) - 19, (ViewConfiguration.getKeyRepeatDelay() >> 16) + 393151815, objArr3);
                    String intern2 = ((String) objArr3[0]).intern();
                    Object[] objArr4 = new Object[1];
                    ThreeDS2ServiceInstance((char) Color.red(0), 67 - TextUtils.indexOf("", ""), 48 - (ViewConfiguration.getTouchSlop() >> 8), objArr4);
                    throw new setMenuCallbacks(setforegroundgravity2, intern2, ((String) objArr4[0]).intern()).ThreeDS2ServiceInstance(e);
                }
            } catch (setId e2) {
                setForegroundGravity setforegroundgravity3 = setForegroundGravity.Transaction$BridgingMessageExtensionVersion;
                Object[] objArr5 = new Object[1];
                values((byte) (ViewConfiguration.getJumpTapTimeout() >> 16), (short) (ViewConfiguration.getLongPressTimeout() >> 16), (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) - 638800032, (-19) - (ViewConfiguration.getWindowTouchSlop() >> 8), Drawable.resolveOpacity(0, 0) + 393151815, objArr5);
                String intern3 = ((String) objArr5[0]).intern();
                Object[] objArr6 = new Object[1];
                values((byte) View.MeasureSpec.makeMeasureSpec(0, 0), (short) View.MeasureSpec.getMode(0), (-638800028) + TextUtils.getTrimmedLength(""), (-20) - TextUtils.lastIndexOf("", '0'), 393151815 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), objArr6);
                throw new setMenuCallbacks(setforegroundgravity3, intern3, ((String) objArr6[0]).intern()).ThreeDS2ServiceInstance(e2);
            }
        }
        setForegroundGravity setforegroundgravity4 = setForegroundGravity.getSDKTransactionID;
        Object[] objArr7 = new Object[1];
        values((byte) TextUtils.getCapsMode("", 0, 0), (short) (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), (-638800032) - TextUtils.getOffsetAfter("", 0), (-18) - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), 393151815 - Color.red(0), objArr7);
        String intern4 = ((String) objArr7[0]).intern();
        Object[] objArr8 = new Object[1];
        ThreeDS2ServiceInstance((char) (Process.myPid() >> 22), Color.green(0), 20 - (ViewConfiguration.getMinimumFlingVelocity() >> 16), objArr8);
        throw new setMenuCallbacks(setforegroundgravity4, intern4, ((String) objArr8[0]).intern()).values();
    }

    private boolean ThreeDS2ServiceInstance(String str) {
        Iterator<String> it = cleanup.iterator();
        while (!(!it.hasNext())) {
            if (C9669om.get(str, it.next())) {
                int i = onError + 33;
                ConfigParameters = i % 128;
                if (i % 2 == 0) {
                    int i2 = 68 / 0;
                }
                return true;
            }
        }
        int i3 = onError + 105;
        ConfigParameters = i3 % 128;
        if (i3 % 2 != 0) {
            return false;
        }
        throw null;
    }

    private void ThreeDS2ServiceInstance(JSONObject jSONObject) {
        C9605mv.ThreeDS2ServiceInstance threeDS2ServiceInstance = C9605mv.ThreeDS2ServiceInstance.ThreeDS2Service;
        Object[] objArr = new Object[1];
        ThreeDS2ServiceInstance((char) ((ViewConfiguration.getTapTimeout() >> 16) + 34884), 115 - (ViewConfiguration.getFadingEdgeLength() >> 16), 12 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), objArr);
        String optString = jSONObject.optString(((String) objArr[0]).intern(), "");
        Object[] objArr2 = new Object[1];
        values((byte) TextUtils.indexOf("", "", 0), (short) (ViewConfiguration.getKeyRepeatDelay() >> 16), (ViewConfiguration.getWindowTouchSlop() >> 8) - 638799950, (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) - 19, (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 393151846, objArr2);
        String optString2 = jSONObject.optString(((String) objArr2[0]).intern(), "");
        if (C9669om.ThreeDS2ServiceInstance((CharSequence) keySet.ThreeDS2ServiceInstance.ThreeDS2Service(), (CharSequence) optString) && C9669om.ThreeDS2ServiceInstance((CharSequence) getSuppressed.values.ThreeDS2Service(), (CharSequence) optString2)) {
            ConfigParameters = (onError + 37) % 128;
            setIndeterminateTintMode.ThreeDS2Service threeDS2Service = this.ThreeDS2Service$InitializationCallback;
            Object[] objArr3 = new Object[1];
            values((byte) TextUtils.getOffsetBefore("", 0), (short) (KeyEvent.getMaxKeyCode() >> 16), (-638799928) - ((Process.getThreadPriority(0) + 20) >> 6), View.MeasureSpec.getMode(0) - 19, 393151844 - TextUtils.indexOf((CharSequence) "", '0', 0, 0), objArr3);
            String intern = ((String) objArr3[0]).intern();
            Object[] objArr4 = new Object[1];
            ThreeDS2ServiceInstance((char) (TextUtils.lastIndexOf("", '0') + 1), 126 - (ViewConfiguration.getWindowTouchSlop() >> 8), (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 3, objArr4);
            threeDS2Service.valueOf(jSONObject.optString(intern, ((String) objArr4[0]).intern()));
            onError = (ConfigParameters + 75) % 128;
        }
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
                        cArr[i3] = (char) ((initialize[i + i3] ^ (i3 * getSDKVersion)) ^ c);
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
