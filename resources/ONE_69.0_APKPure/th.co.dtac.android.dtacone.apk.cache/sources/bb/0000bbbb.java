package com.netcetera.threeds.sdk.infrastructure;

import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.fasterxml.jackson.core.json.ByteSourceJsonBootstrapper;
import com.google.common.base.Ascii;

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
public final class fillInStackTrace implements printStackTrace {
    public static int ThreeDS2Service = 0;
    public static int ThreeDS2ServiceInstance = 0;
    private static final /* synthetic */ fillInStackTrace[] cleanup;
    public static final fillInStackTrace get;
    private static int getSDKVersion = 0;
    public static byte[] getWarnings = null;
    public static short[] initialize = null;
    private static int onCompleted = 1;
    public static final fillInStackTrace valueOf;
    public static int values;
    private final String getSDKInfo;

    static {
        ThreeDS2ServiceInstance();
        Object[] objArr = new Object[1];
        values((byte) (5 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1))), (short) ((-1) - Process.getGidForName("")), TextUtils.lastIndexOf("", '0', 0, 0) + 1223028793, (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) - 14, (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) - 740204141, objArr);
        String intern = ((String) objArr[0]).intern();
        Object[] objArr2 = new Object[1];
        values((byte) ((Process.myPid() >> 22) + 21), (short) (ViewConfiguration.getTouchSlop() >> 8), 1223028799 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), (-13) - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), (-740204170) - Color.alpha(0), objArr2);
        fillInStackTrace fillinstacktrace = new fillInStackTrace(intern, 0, ((String) objArr2[0]).intern());
        valueOf = fillinstacktrace;
        Object[] objArr3 = new Object[1];
        values((byte) (TextUtils.indexOf((CharSequence) "", '0') + 67), (short) (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), 1223028801 - View.resolveSize(0, 0), (-13) - View.resolveSizeAndState(0, 0, 0), (-740204154) - ImageFormat.getBitsPerPixel(0), objArr3);
        String intern2 = ((String) objArr3[0]).intern();
        Object[] objArr4 = new Object[1];
        values((byte) ((-36) - KeyEvent.keyCodeFromString("")), (short) (ExpandableListView.getPackedPositionChild(0L) + 1), 1223028814 - Color.green(0), (-14) - TextUtils.indexOf((CharSequence) "", '0', 0, 0), (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) - 740204171, objArr4);
        fillInStackTrace fillinstacktrace2 = new fillInStackTrace(intern2, 1, ((String) objArr4[0]).intern());
        get = fillinstacktrace2;
        cleanup = new fillInStackTrace[]{fillinstacktrace, fillinstacktrace2};
        getSDKVersion = (onCompleted + 69) % 128;
    }

    private fillInStackTrace(String str, int i, String str2) {
        this.getSDKInfo = str2;
    }

    public static void ThreeDS2ServiceInstance() {
        ThreeDS2Service = 740204218;
        getWarnings = new byte[]{-5, -2, -13, 9, -4, -4, 3, -10, Ascii.DC4, 1, -72, -75, 79, -70, -70, 69, -83, 92, ByteSourceJsonBootstrapper.UTF8_BOM_2, -70, 70, 73, -10, -34};
        ThreeDS2ServiceInstance = 12;
        values = -1223028792;
    }

    public static fillInStackTrace valueOf(String str) {
        int i = onCompleted + 67;
        getSDKVersion = i % 128;
        int i2 = i % 2;
        fillInStackTrace fillinstacktrace = (fillInStackTrace) Enum.valueOf(fillInStackTrace.class, str);
        if (i2 != 0) {
            int i3 = 13 / 0;
        }
        return fillinstacktrace;
    }

    public static fillInStackTrace[] values() {
        int i = getSDKVersion + 15;
        onCompleted = i % 128;
        if (i % 2 == 0) {
            cleanup.clone();
            throw null;
        }
        fillInStackTrace[] fillinstacktraceArr = (fillInStackTrace[]) cleanup.clone();
        onCompleted = (getSDKVersion + 53) % 128;
        return fillinstacktraceArr;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.printStackTrace
    public String ThreeDS2Service() {
        int i = onCompleted;
        String str = this.getSDKInfo;
        getSDKVersion = (i + 35) % 128;
        return str;
    }

    private static void values(byte b, short s, int i, int i2, int i3, Object[] objArr) {
        String obj;
        synchronized (createTransaction.ThreeDS2ServiceInstance) {
            try {
                StringBuilder sb = new StringBuilder();
                int i4 = ThreeDS2ServiceInstance;
                int i5 = i2 + i4;
                int i6 = i5 == -1 ? 1 : 0;
                if (i6 != 0) {
                    byte[] bArr = getWarnings;
                    if (bArr != null) {
                        i5 = (byte) (bArr[values + i] + i4);
                    } else {
                        i5 = (short) (initialize[values + i] + i4);
                    }
                }
                if (i5 > 0) {
                    createTransaction.values = ((i + i5) - 2) + values + i6;
                    char c = (char) (i3 + ThreeDS2Service);
                    createTransaction.get = c;
                    sb.append(c);
                    createTransaction.valueOf = createTransaction.get;
                    createTransaction.ThreeDS2Service = 1;
                    while (createTransaction.ThreeDS2Service < i5) {
                        byte[] bArr2 = getWarnings;
                        if (bArr2 != null) {
                            int i7 = createTransaction.values;
                            createTransaction.values = i7 - 1;
                            createTransaction.get = (char) (createTransaction.valueOf + (((byte) (bArr2[i7] + s)) ^ b));
                        } else {
                            short[] sArr = initialize;
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
}