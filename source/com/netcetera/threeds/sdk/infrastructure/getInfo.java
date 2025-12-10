package com.netcetera.threeds.sdk.infrastructure;

import android.text.TextUtils;
import android.view.ViewConfiguration;

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
public final class getInfo implements printStackTrace {
    public static final getInfo ThreeDS2Service;
    public static long ThreeDS2ServiceInstance = 0;
    private static int getSDKInfo = 0;
    private static int initialize = 1;
    private static final /* synthetic */ getInfo[] valueOf;
    public static final getInfo values;
    private final String get;

    static {
        ThreeDS2ServiceInstance();
        Object[] objArr = new Object[1];
        ThreeDS2Service("ꆬી㛦ꇵ涢", 1 - TextUtils.indexOf("", ""), objArr);
        String intern = ((String) objArr[0]).intern();
        Object[] objArr2 = new Object[1];
        ThreeDS2Service("ꆬી㛦ꇵ涢", 1 - (ViewConfiguration.getTouchSlop() >> 8), objArr2);
        getInfo getinfo = new getInfo(intern, 0, ((String) objArr2[0]).intern());
        ThreeDS2Service = getinfo;
        Object[] objArr3 = new Object[1];
        ThreeDS2Service("돫ᧃꓻ뎥㼕", (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), objArr3);
        String intern2 = ((String) objArr3[0]).intern();
        Object[] objArr4 = new Object[1];
        ThreeDS2Service("돫ᧃꓻ뎥㼕", -TextUtils.lastIndexOf("", '0', 0), objArr4);
        getInfo getinfo2 = new getInfo(intern2, 1, ((String) objArr4[0]).intern());
        values = getinfo2;
        valueOf = new getInfo[]{getinfo, getinfo2};
        getSDKInfo = (initialize + 5) % 128;
    }

    private getInfo(String str, int i, String str2) {
        this.get = str2;
    }

    public static void ThreeDS2ServiceInstance() {
        ThreeDS2ServiceInstance = 1010248313033064919L;
    }

    public static getInfo valueOf(String str) {
        getSDKInfo = (initialize + 101) % 128;
        getInfo getinfo = (getInfo) Enum.valueOf(getInfo.class, str);
        getSDKInfo = (initialize + 71) % 128;
        return getinfo;
    }

    public static getInfo[] values() {
        initialize = (getSDKInfo + 27) % 128;
        getInfo[] getinfoArr = (getInfo[]) valueOf.clone();
        int i = getSDKInfo + 35;
        initialize = i % 128;
        if (i % 2 == 0) {
            int i2 = 15 / 0;
        }
        return getinfoArr;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.printStackTrace
    public String ThreeDS2Service() {
        String str;
        int i = getSDKInfo + 19;
        int i2 = i % 128;
        initialize = i2;
        if (i % 2 == 0) {
            str = this.get;
            int i3 = 2 / 0;
        } else {
            str = this.get;
        }
        int i4 = i2 + 95;
        getSDKInfo = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 90 / 0;
        }
        return str;
    }

    /* JADX WARN: Code restructure failed: missing block: B:0:?, code lost:
        r8 = r8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void ThreeDS2Service(java.lang.String r8, int r9, java.lang.Object[] r10) {
        /*
            if (r8 == 0) goto L6
            char[] r8 = r8.toCharArray()
        L6:
            char[] r8 = (char[]) r8
            java.lang.Object r0 = com.netcetera.threeds.sdk.infrastructure.getWarnings.valueOf
            monitor-enter(r0)
            long r1 = com.netcetera.threeds.sdk.infrastructure.getInfo.ThreeDS2ServiceInstance     // Catch: java.lang.Throwable -> L3a
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
            long r6 = com.netcetera.threeds.sdk.infrastructure.getInfo.ThreeDS2ServiceInstance     // Catch: java.lang.Throwable -> L3a
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
        throw new UnsupportedOperationException("Method not decompiled: com.netcetera.threeds.sdk.infrastructure.getInfo.ThreeDS2Service(java.lang.String, int, java.lang.Object[]):void");
    }
}
