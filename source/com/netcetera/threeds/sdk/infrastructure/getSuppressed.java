package com.netcetera.threeds.sdk.infrastructure;

import android.util.TypedValue;
import android.view.MotionEvent;
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
public final class getSuppressed implements printStackTrace {
    public static final getSuppressed ThreeDS2Service;
    public static long ThreeDS2ServiceInstance = 0;
    private static int cleanup = 0;
    private static final /* synthetic */ getSuppressed[] get;
    private static int getSDKInfo = 1;
    public static final getSuppressed values;
    private String valueOf;

    static {
        valueOf();
        Object[] objArr = new Object[1];
        ThreeDS2Service("砭", 55817 - (ViewConfiguration.getScrollBarSize() >> 8), objArr);
        String intern = ((String) objArr[0]).intern();
        Object[] objArr2 = new Object[1];
        ThreeDS2Service("砭", (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 55817, objArr2);
        getSuppressed getsuppressed = new getSuppressed(intern, 0, ((String) objArr2[0]).intern());
        ThreeDS2Service = getsuppressed;
        Object[] objArr3 = new Object[1];
        ThreeDS2Service("砺", 55888 - MotionEvent.axisFromString(""), objArr3);
        String intern2 = ((String) objArr3[0]).intern();
        Object[] objArr4 = new Object[1];
        ThreeDS2Service("砺", 55889 - (ViewConfiguration.getEdgeSlop() >> 16), objArr4);
        getSuppressed getsuppressed2 = new getSuppressed(intern2, 1, ((String) objArr4[0]).intern());
        values = getsuppressed2;
        get = new getSuppressed[]{getsuppressed, getsuppressed2};
        int i = getSDKInfo + 109;
        cleanup = i % 128;
        if (i % 2 == 0) {
            return;
        }
        throw null;
    }

    private getSuppressed(String str, int i, String str2) {
        this.valueOf = str2;
    }

    public static void valueOf() {
        ThreeDS2ServiceInstance = -1180873658196723596L;
    }

    public static getSuppressed[] values() {
        getSDKInfo = (cleanup + 125) % 128;
        getSuppressed[] getsuppressedArr = (getSuppressed[]) get.clone();
        cleanup = (getSDKInfo + 5) % 128;
        return getsuppressedArr;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.printStackTrace
    public String ThreeDS2Service() {
        int i = getSDKInfo + 83;
        cleanup = i % 128;
        if (i % 2 == 0) {
            return this.valueOf;
        }
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:0:?, code lost:
        r7 = r7;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void ThreeDS2Service(java.lang.String r7, int r8, java.lang.Object[] r9) {
        /*
            if (r7 == 0) goto L6
            char[] r7 = r7.toCharArray()
        L6:
            char[] r7 = (char[]) r7
            java.lang.Object r0 = com.netcetera.threeds.sdk.infrastructure.initialize.values
            monitor-enter(r0)
            com.netcetera.threeds.sdk.infrastructure.initialize.ThreeDS2Service = r8     // Catch: java.lang.Throwable -> L2e
            int r8 = r7.length     // Catch: java.lang.Throwable -> L2e
            char[] r8 = new char[r8]     // Catch: java.lang.Throwable -> L2e
            r1 = 0
            com.netcetera.threeds.sdk.infrastructure.initialize.ThreeDS2ServiceInstance = r1     // Catch: java.lang.Throwable -> L2e
        L13:
            int r2 = com.netcetera.threeds.sdk.infrastructure.initialize.ThreeDS2ServiceInstance     // Catch: java.lang.Throwable -> L2e
            int r3 = r7.length     // Catch: java.lang.Throwable -> L2e
            if (r2 >= r3) goto L30
            char r3 = r7[r2]     // Catch: java.lang.Throwable -> L2e
            int r4 = com.netcetera.threeds.sdk.infrastructure.initialize.ThreeDS2Service     // Catch: java.lang.Throwable -> L2e
            int r4 = r4 * r2
            r3 = r3 ^ r4
            long r3 = (long) r3     // Catch: java.lang.Throwable -> L2e
            long r5 = com.netcetera.threeds.sdk.infrastructure.getSuppressed.ThreeDS2ServiceInstance     // Catch: java.lang.Throwable -> L2e
            long r3 = r3 ^ r5
            int r4 = (int) r3     // Catch: java.lang.Throwable -> L2e
            char r3 = (char) r4     // Catch: java.lang.Throwable -> L2e
            r8[r2] = r3     // Catch: java.lang.Throwable -> L2e
            int r2 = com.netcetera.threeds.sdk.infrastructure.initialize.ThreeDS2ServiceInstance     // Catch: java.lang.Throwable -> L2e
            int r2 = r2 + 1
            com.netcetera.threeds.sdk.infrastructure.initialize.ThreeDS2ServiceInstance = r2     // Catch: java.lang.Throwable -> L2e
            goto L13
        L2e:
            r7 = move-exception
            goto L39
        L30:
            java.lang.String r7 = new java.lang.String     // Catch: java.lang.Throwable -> L2e
            r7.<init>(r8)     // Catch: java.lang.Throwable -> L2e
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L2e
            r9[r1] = r7
            return
        L39:
            monitor-exit(r0)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.netcetera.threeds.sdk.infrastructure.getSuppressed.ThreeDS2Service(java.lang.String, int, java.lang.Object[]):void");
    }

    public static getSuppressed valueOf(String str) {
        cleanup = (getSDKInfo + 101) % 128;
        getSuppressed getsuppressed = (getSuppressed) Enum.valueOf(getSuppressed.class, str);
        getSDKInfo = (cleanup + 81) % 128;
        return getsuppressed;
    }
}
