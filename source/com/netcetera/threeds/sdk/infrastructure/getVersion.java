package com.netcetera.threeds.sdk.infrastructure;

import android.os.Process;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;

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
public final class getVersion implements printStackTrace {
    public static char ThreeDS2ServiceInstance = 0;
    public static char[] get = null;
    private static int getSDKInfo = 1;
    private static final /* synthetic */ getVersion[] getSDKVersion;
    private static int initialize;
    public static final getVersion valueOf;
    public static final getVersion values;
    private final String ThreeDS2Service;

    static {
        ThreeDS2ServiceInstance();
        Object[] objArr = new Object[1];
        ThreeDS2Service((ViewConfiguration.getTouchSlop() >> 8) + 3, "\u0006\u0002㗜", (byte) (18 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1))), objArr);
        String intern = ((String) objArr[0]).intern();
        Object[] objArr2 = new Object[1];
        ThreeDS2Service((ViewConfiguration.getWindowTouchSlop() >> 8) + 1, "㗢", (byte) (31 - TextUtils.getTrimmedLength("")), objArr2);
        getVersion getversion = new getVersion(intern, 0, ((String) objArr2[0]).intern());
        valueOf = getversion;
        Object[] objArr3 = new Object[1];
        ThreeDS2Service((ViewConfiguration.getDoubleTapTimeout() >> 16) + 2, "\u0002\u0000", (byte) (17 - Process.getGidForName("")), objArr3);
        String intern2 = ((String) objArr3[0]).intern();
        Object[] objArr4 = new Object[1];
        ThreeDS2Service(1 - KeyEvent.normalizeMetaState(0), "㗚", (byte) (6 - TextUtils.indexOf("", "", 0, 0)), objArr4);
        getVersion getversion2 = new getVersion(intern2, 1, ((String) objArr4[0]).intern());
        values = getversion2;
        getSDKVersion = new getVersion[]{getversion, getversion2};
        int i = initialize + 29;
        getSDKInfo = i % 128;
        if (i % 2 == 0) {
            int i2 = 77 / 0;
        }
    }

    private getVersion(String str, int i, String str2) {
        this.ThreeDS2Service = str2;
    }

    public static void ThreeDS2ServiceInstance() {
        get = new char[]{13791, 13780, 13781, 13792, 13794, 13793, 13795, 13769, 13763};
        ThreeDS2ServiceInstance = (char) 3;
    }

    public static getVersion valueOf(String str) {
        int i = getSDKInfo + 41;
        initialize = i % 128;
        if (i % 2 == 0) {
            return (getVersion) Enum.valueOf(getVersion.class, str);
        }
        Enum.valueOf(getVersion.class, str);
        throw null;
    }

    public static getVersion[] values() {
        int i = getSDKInfo + 81;
        initialize = i % 128;
        if (i % 2 == 0) {
            getVersion[] getversionArr = (getVersion[]) getSDKVersion.clone();
            getSDKInfo = (initialize + 41) % 128;
            return getversionArr;
        }
        getSDKVersion.clone();
        throw null;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.printStackTrace
    public String ThreeDS2Service() {
        int i = getSDKInfo + 101;
        initialize = i % 128;
        if (i % 2 == 0) {
            return this.ThreeDS2Service;
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
        throw new UnsupportedOperationException("Method not decompiled: com.netcetera.threeds.sdk.infrastructure.getVersion.ThreeDS2Service(int, java.lang.String, byte, java.lang.Object[]):void");
    }
}
