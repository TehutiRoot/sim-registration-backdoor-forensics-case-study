package com.netcetera.threeds.sdk.infrastructure;

import android.graphics.Color;
import android.os.Process;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
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
public final class replace implements printStackTrace {
    private static int ConfigParameters = 1;
    public static final replace ThreeDS2Service;
    public static final replace ThreeDS2ServiceInstance;
    public static long cleanup;
    private static int createTransaction;
    public static final replace get;
    public static final replace getSDKInfo;
    public static final replace getSDKVersion;
    public static final replace getWarnings;
    public static final replace initialize;
    private static final /* synthetic */ replace[] onCompleted;
    public static final replace valueOf;
    public static final replace values;
    private String ThreeDS2Service$InitializationCallback;

    static {
        ThreeDS2ServiceInstance();
        Object[] objArr = new Object[1];
        values("圠坹\uf55c\udcda䱐", (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 1, objArr);
        String intern = ((String) objArr[0]).intern();
        Object[] objArr2 = new Object[1];
        values("圠坹\uf55c\udcda䱐", View.MeasureSpec.getSize(0) + 1, objArr2);
        replace replaceVar = new replace(intern, 0, ((String) objArr2[0]).intern());
        valueOf = replaceVar;
        Object[] objArr3 = new Object[1];
        values("ꨅꩋ䣁쿿￣", -TextUtils.indexOf((CharSequence) "", '0', 0), objArr3);
        String intern2 = ((String) objArr3[0]).intern();
        Object[] objArr4 = new Object[1];
        values("ꨅꩋ䣁쿿￣", -TextUtils.lastIndexOf("", '0'), objArr4);
        replace replaceVar2 = new replace(intern2, 1, ((String) objArr4[0]).intern());
        ThreeDS2Service = replaceVar2;
        Object[] objArr5 = new Object[1];
        values("䛝䚈ᡊ僫ݨ", (ViewConfiguration.getKeyRepeatDelay() >> 16) + 1, objArr5);
        String intern3 = ((String) objArr5[0]).intern();
        Object[] objArr6 = new Object[1];
        values("䛝䚈ᡊ僫ݨ", KeyEvent.getDeadChar(0, 0) + 1, objArr6);
        replace replaceVar3 = new replace(intern3, 2, ((String) objArr6[0]).intern());
        values = replaceVar3;
        Object[] objArr7 = new Object[1];
        values("쨔쩕쟹\ue5d3걘", 1 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), objArr7);
        String intern4 = ((String) objArr7[0]).intern();
        Object[] objArr8 = new Object[1];
        values("쨔쩕쟹\ue5d3걘", 1 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), objArr8);
        replace replaceVar4 = new replace(intern4, 3, ((String) objArr8[0]).intern());
        ThreeDS2ServiceInstance = replaceVar4;
        Object[] objArr9 = new Object[1];
        values("㡭㠮ꧢ蝊㋇", (ViewConfiguration.getTapTimeout() >> 16) + 1, objArr9);
        String intern5 = ((String) objArr9[0]).intern();
        Object[] objArr10 = new Object[1];
        values("㡭㠮ꧢ蝊㋇", (KeyEvent.getMaxKeyCode() >> 16) + 1, objArr10);
        replace replaceVar5 = new replace(intern5, 4, ((String) objArr10[0]).intern());
        get = replaceVar5;
        Object[] objArr11 = new Object[1];
        values("\uda67\uda23좺證㿉", 1 - View.resolveSizeAndState(0, 0, 0), objArr11);
        String intern6 = ((String) objArr11[0]).intern();
        Object[] objArr12 = new Object[1];
        values("\uda67\uda23좺證㿉", 1 - Color.red(0), objArr12);
        replace replaceVar6 = new replace(intern6, 5, ((String) objArr12[0]).intern());
        getSDKInfo = replaceVar6;
        Object[] objArr13 = new Object[1];
        values("浐洂ñ폻聁", 1 - (ViewConfiguration.getLongPressTimeout() >> 16), objArr13);
        String intern7 = ((String) objArr13[0]).intern();
        Object[] objArr14 = new Object[1];
        values("浐洂ñ폻聁", (ViewConfiguration.getKeyRepeatDelay() >> 16) + 1, objArr14);
        replace replaceVar7 = new replace(intern7, 6, ((String) objArr14[0]).intern());
        getSDKVersion = replaceVar7;
        Object[] objArr15 = new Object[1];
        values("عٰὢ꩒夨", '1' - AndroidCharacter.getMirror('0'), objArr15);
        String intern8 = ((String) objArr15[0]).intern();
        Object[] objArr16 = new Object[1];
        values("عٰὢ꩒夨", 1 - (Process.myTid() >> 22), objArr16);
        replace replaceVar8 = new replace(intern8, 7, ((String) objArr16[0]).intern());
        getWarnings = replaceVar8;
        Object[] objArr17 = new Object[1];
        values("姖妅턫⢻䊠", 1 - (ViewConfiguration.getKeyRepeatTimeout() >> 16), objArr17);
        String intern9 = ((String) objArr17[0]).intern();
        Object[] objArr18 = new Object[1];
        values("姖妅턫⢻䊠", -TextUtils.indexOf((CharSequence) "", '0', 0, 0), objArr18);
        replace replaceVar9 = new replace(intern9, 8, ((String) objArr18[0]).intern());
        initialize = replaceVar9;
        onCompleted = new replace[]{replaceVar, replaceVar2, replaceVar3, replaceVar4, replaceVar5, replaceVar6, replaceVar7, replaceVar8, replaceVar9};
        int i = createTransaction + 99;
        ConfigParameters = i % 128;
        if (i % 2 != 0) {
            return;
        }
        throw null;
    }

    private replace(String str, int i, String str2) {
        this.ThreeDS2Service$InitializationCallback = str2;
    }

    public static void ThreeDS2ServiceInstance() {
        cleanup = -5202004693266056575L;
    }

    public static replace valueOf(String str) {
        int i = createTransaction + 27;
        ConfigParameters = i % 128;
        int i2 = i % 2;
        replace replaceVar = (replace) Enum.valueOf(replace.class, str);
        if (i2 == 0) {
            int i3 = 88 / 0;
        }
        return replaceVar;
    }

    public static replace[] values() {
        replace[] replaceVarArr;
        int i = createTransaction + 83;
        ConfigParameters = i % 128;
        if (i % 2 == 0) {
            replaceVarArr = (replace[]) onCompleted.clone();
            int i2 = 53 / 0;
        } else {
            replaceVarArr = (replace[]) onCompleted.clone();
        }
        createTransaction = (ConfigParameters + 91) % 128;
        return replaceVarArr;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.printStackTrace
    public String ThreeDS2Service() {
        int i = (ConfigParameters + 65) % 128;
        createTransaction = i;
        String str = this.ThreeDS2Service$InitializationCallback;
        ConfigParameters = (i + 73) % 128;
        return str;
    }

    /* JADX WARN: Code restructure failed: missing block: B:0:?, code lost:
        r8 = r8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void values(java.lang.String r8, int r9, java.lang.Object[] r10) {
        /*
            if (r8 == 0) goto L6
            char[] r8 = r8.toCharArray()
        L6:
            char[] r8 = (char[]) r8
            java.lang.Object r0 = com.netcetera.threeds.sdk.infrastructure.getWarnings.valueOf
            monitor-enter(r0)
            long r1 = com.netcetera.threeds.sdk.infrastructure.replace.cleanup     // Catch: java.lang.Throwable -> L3a
            char[] r8 = com.netcetera.threeds.sdk.infrastructure.getWarnings.ThreeDS2Service(r1, r8, r9)     // Catch: java.lang.Throwable -> L3a
            r9 = 4
            com.netcetera.threeds.sdk.infrastructure.getWarnings.values = r9     // Catch: java.lang.Throwable -> L3a
        L14:
            int r1 = com.netcetera.threeds.sdk.infrastructure.getWarnings.values     // Catch: java.lang.Throwable -> L3a
            int r2 = r8.length     // Catch: java.lang.Throwable -> L3a
            if (r1 >= r2) goto L3c
            int r1 = r1 + (-4)
            com.netcetera.threeds.sdk.infrastructure.getWarnings.ThreeDS2ServiceInstance = r1     // Catch: java.lang.Throwable -> L3a
            int r1 = com.netcetera.threeds.sdk.infrastructure.getWarnings.values     // Catch: java.lang.Throwable -> L3a
            char r2 = r8[r1]     // Catch: java.lang.Throwable -> L3a
            int r3 = r1 % 4
            char r3 = r8[r3]     // Catch: java.lang.Throwable -> L3a
            r2 = r2 ^ r3
            long r2 = (long) r2     // Catch: java.lang.Throwable -> L3a
            int r4 = com.netcetera.threeds.sdk.infrastructure.getWarnings.ThreeDS2ServiceInstance     // Catch: java.lang.Throwable -> L3a
            long r4 = (long) r4     // Catch: java.lang.Throwable -> L3a
            long r6 = com.netcetera.threeds.sdk.infrastructure.replace.cleanup     // Catch: java.lang.Throwable -> L3a
            long r4 = r4 * r6
            long r2 = r2 ^ r4
            int r3 = (int) r2     // Catch: java.lang.Throwable -> L3a
            char r2 = (char) r3     // Catch: java.lang.Throwable -> L3a
            r8[r1] = r2     // Catch: java.lang.Throwable -> L3a
            int r1 = com.netcetera.threeds.sdk.infrastructure.getWarnings.values     // Catch: java.lang.Throwable -> L3a
            int r1 = r1 + 1
            com.netcetera.threeds.sdk.infrastructure.getWarnings.values = r1     // Catch: java.lang.Throwable -> L3a
            goto L14
        L3a:
            r8 = move-exception
            goto L48
        L3c:
            java.lang.String r1 = new java.lang.String     // Catch: java.lang.Throwable -> L3a
            int r2 = r8.length     // Catch: java.lang.Throwable -> L3a
            int r2 = r2 - r9
            r1.<init>(r8, r9, r2)     // Catch: java.lang.Throwable -> L3a
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L3a
            r8 = 0
            r10[r8] = r1
            return
        L48:
            monitor-exit(r0)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.netcetera.threeds.sdk.infrastructure.replace.values(java.lang.String, int, java.lang.Object[]):void");
    }
}
