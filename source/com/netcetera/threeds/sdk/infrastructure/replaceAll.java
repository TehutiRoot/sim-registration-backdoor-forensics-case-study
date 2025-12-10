package com.netcetera.threeds.sdk.infrastructure;

import android.graphics.Color;
import android.os.Process;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import th.p047co.dtac.android.dtacone.view.activity.CameraActivity;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum ThreeDS2Service uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:444)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:391)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:320)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:258)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* loaded from: classes5.dex */
public final class replaceAll implements printStackTrace {
    public static final replaceAll ThreeDS2Service;
    public static final replaceAll ThreeDS2ServiceInstance;
    private static int cleanup = 1;
    public static char get;
    private static int getSDKVersion;
    private static final /* synthetic */ replaceAll[] initialize;
    public static char[] values;
    private final String valueOf;

    static {
        valueOf();
        Object[] objArr = new Object[1];
        ThreeDS2Service((ViewConfiguration.getWindowTouchSlop() >> 8) + 3, "\u0000\u0005㘝", (byte) (Color.alpha(0) + 84), objArr);
        String intern = ((String) objArr[0]).intern();
        Object[] objArr2 = new Object[1];
        ThreeDS2Service(1 - (ViewConfiguration.getMaximumFlingVelocity() >> 16), "㗚", (byte) (23 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1))), objArr2);
        replaceAll replaceall = new replaceAll(intern, 0, ((String) objArr2[0]).intern());
        ThreeDS2Service = replaceall;
        Object[] objArr3 = new Object[1];
        ThreeDS2Service(2 - ExpandableListView.getPackedPositionType(0L), "\u0006\b", (byte) (ExpandableListView.getPackedPositionChild(0L) + 97), objArr3);
        String intern2 = ((String) objArr3[0]).intern();
        Object[] objArr4 = new Object[1];
        ThreeDS2Service(1 - ((Process.getThreadPriority(0) + 20) >> 6), "㗥", (byte) (17 - View.MeasureSpec.getSize(0)), objArr4);
        replaceAll replaceall2 = new replaceAll(intern2, 1, ((String) objArr4[0]).intern());
        ThreeDS2ServiceInstance = replaceall2;
        initialize = new replaceAll[]{replaceall, replaceall2};
        cleanup = (getSDKVersion + 85) % 128;
    }

    private replaceAll(String str, int i, String str2) {
        this.valueOf = str2;
    }

    public static void valueOf() {
        values = new char[]{2, 1, 13763, 13791, 3, 13769, 4, 13781, 13780};
        get = (char) 3;
    }

    public static replaceAll[] values() {
        int i = getSDKVersion + CameraActivity.REQUEST_CODE;
        cleanup = i % 128;
        if (i % 2 != 0) {
            replaceAll[] replaceallArr = (replaceAll[]) initialize.clone();
            int i2 = getSDKVersion + 105;
            cleanup = i2 % 128;
            if (i2 % 2 == 0) {
                int i3 = 58 / 0;
            }
            return replaceallArr;
        }
        initialize.clone();
        throw null;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.printStackTrace
    public String ThreeDS2Service() {
        int i = (getSDKVersion + 121) % 128;
        cleanup = i;
        String str = this.valueOf;
        int i2 = i + 119;
        getSDKVersion = i2 % 128;
        if (i2 % 2 == 0) {
            return str;
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
    private static void ThreeDS2Service(int r10, java.lang.String r11, byte r12, java.lang.Object[] r13) {
        /*
            Method dump skipped, instructions count: 252
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.netcetera.threeds.sdk.infrastructure.replaceAll.ThreeDS2Service(int, java.lang.String, byte, java.lang.Object[]):void");
    }

    public static replaceAll valueOf(String str) {
        int i = cleanup + CameraActivity.REQUEST_CODE;
        getSDKVersion = i % 128;
        if (i % 2 == 0) {
            return (replaceAll) Enum.valueOf(replaceAll.class, str);
        }
        Enum.valueOf(replaceAll.class, str);
        throw null;
    }
}
