package com.netcetera.threeds.sdk.infrastructure;

import android.graphics.ImageFormat;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum values uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:444)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:391)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:320)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:258)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* loaded from: classes5.dex */
public final class putAll implements printStackTrace {
    public static final putAll ThreeDS2Service;
    public static int ThreeDS2ServiceInstance = 0;
    private static int cleanup = 0;
    private static int createTransaction = 1;
    public static int get;
    public static short[] getSDKInfo;
    private static final /* synthetic */ putAll[] getWarnings;
    public static byte[] initialize;
    public static int valueOf;
    public static final putAll values;
    private final String getSDKVersion;

    static {
        valueOf();
        Object[] objArr = new Object[1];
        valueOf((byte) TextUtils.indexOf("", "", 0, 0), (short) ((-1) - TextUtils.indexOf((CharSequence) "", '0', 0)), TextUtils.getTrimmedLength("") + 1944904325, (-96) - (ViewConfiguration.getKeyRepeatDelay() >> 16), 98343207 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), objArr);
        String intern = ((String) objArr[0]).intern();
        Object[] objArr2 = new Object[1];
        valueOf((byte) Drawable.resolveOpacity(0, 0), (short) (ViewConfiguration.getTapTimeout() >> 16), (KeyEvent.getMaxKeyCode() >> 16) + 1944904328, (-95) - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)), (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 98343207, objArr2);
        putAll putall = new putAll(intern, 0, ((String) objArr2[0]).intern());
        values = putall;
        Object[] objArr3 = new Object[1];
        valueOf((byte) TextUtils.getTrimmedLength(""), (short) (ImageFormat.getBitsPerPixel(0) + 1), TextUtils.lastIndexOf("", '0', 0) + 1944904330, View.MeasureSpec.getMode(0) - 96, (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 98343195, objArr3);
        String intern2 = ((String) objArr3[0]).intern();
        Object[] objArr4 = new Object[1];
        valueOf((byte) ((-1) - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1))), (short) Gravity.getAbsoluteGravity(0, 0), ExpandableListView.getPackedPositionGroup(0L) + 1944904331, View.MeasureSpec.makeMeasureSpec(0, 0) - 96, (ViewConfiguration.getWindowTouchSlop() >> 8) + 98343196, objArr4);
        putAll putall2 = new putAll(intern2, 1, ((String) objArr4[0]).intern());
        ThreeDS2Service = putall2;
        getWarnings = new putAll[]{putall, putall2};
        cleanup = (createTransaction + 79) % 128;
    }

    private putAll(String str, int i, String str2) {
        this.getSDKVersion = str2;
    }

    public static void valueOf() {
        ThreeDS2ServiceInstance = -98343118;
        initialize = new byte[]{-92, 14, -20, -94, -93, 1, -94};
        valueOf = 95;
        get = -1944904325;
    }

    public static putAll[] values() {
        putAll[] putallArr;
        int i = cleanup + 51;
        createTransaction = i % 128;
        if (i % 2 == 0) {
            putallArr = (putAll[]) getWarnings.clone();
            int i2 = 60 / 0;
        } else {
            putallArr = (putAll[]) getWarnings.clone();
        }
        cleanup = (createTransaction + 77) % 128;
        return putallArr;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.printStackTrace
    public String ThreeDS2Service() {
        int i = createTransaction + 95;
        cleanup = i % 128;
        if (i % 2 != 0) {
            int i2 = 0 / 0;
            return this.getSDKVersion;
        }
        return this.getSDKVersion;
    }

    public static putAll valueOf(String str) {
        cleanup = (createTransaction + 53) % 128;
        putAll putall = (putAll) Enum.valueOf(putAll.class, str);
        cleanup = (createTransaction + 9) % 128;
        return putall;
    }

    private static void valueOf(byte b, short s, int i, int i2, int i3, Object[] objArr) {
        String obj;
        synchronized (createTransaction.ThreeDS2ServiceInstance) {
            try {
                StringBuilder sb = new StringBuilder();
                int i4 = valueOf;
                int i5 = i2 + i4;
                int i6 = i5 == -1 ? 1 : 0;
                if (i6 != 0) {
                    byte[] bArr = initialize;
                    if (bArr != null) {
                        i5 = (byte) (bArr[get + i] + i4);
                    } else {
                        i5 = (short) (getSDKInfo[get + i] + i4);
                    }
                }
                if (i5 > 0) {
                    createTransaction.values = ((i + i5) - 2) + get + i6;
                    char c = (char) (i3 + ThreeDS2ServiceInstance);
                    createTransaction.get = c;
                    sb.append(c);
                    createTransaction.valueOf = createTransaction.get;
                    createTransaction.ThreeDS2Service = 1;
                    while (createTransaction.ThreeDS2Service < i5) {
                        byte[] bArr2 = initialize;
                        if (bArr2 != null) {
                            int i7 = createTransaction.values;
                            createTransaction.values = i7 - 1;
                            createTransaction.get = (char) (createTransaction.valueOf + (((byte) (bArr2[i7] + s)) ^ b));
                        } else {
                            short[] sArr = getSDKInfo;
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