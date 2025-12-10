package com.netcetera.threeds.sdk.infrastructure;

import android.view.KeyEvent;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import th.p047co.dtac.android.dtacone.view.activity.CameraActivity;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum get uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:444)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:391)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:320)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:258)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* loaded from: classes5.dex */
public final class computeIfPresent implements printStackTrace {
    public static long ThreeDS2Service = 0;
    private static final /* synthetic */ computeIfPresent[] ThreeDS2ServiceInstance;
    private static int cleanup = 1;
    public static final computeIfPresent get;
    private static int getSDKVersion;
    public static final computeIfPresent valueOf;
    private final String values;

    static {
        ThreeDS2ServiceInstance();
        Object[] objArr = new Object[1];
        get("豌", ExpandableListView.getPackedPositionGroup(0L) + 24943, objArr);
        String intern = ((String) objArr[0]).intern();
        Object[] objArr2 = new Object[1];
        get("豌", 24943 - (ViewConfiguration.getPressedStateDuration() >> 16), objArr2);
        computeIfPresent computeifpresent = new computeIfPresent(intern, 0, ((String) objArr2[0]).intern());
        get = computeifpresent;
        Object[] objArr3 = new Object[1];
        get("豛", 49664 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), objArr3);
        String intern2 = ((String) objArr3[0]).intern();
        Object[] objArr4 = new Object[1];
        get("豛", 49663 - (KeyEvent.getMaxKeyCode() >> 16), objArr4);
        computeIfPresent computeifpresent2 = new computeIfPresent(intern2, 1, ((String) objArr4[0]).intern());
        valueOf = computeifpresent2;
        ThreeDS2ServiceInstance = new computeIfPresent[]{computeifpresent, computeifpresent2};
        cleanup = (getSDKVersion + 73) % 128;
    }

    private computeIfPresent(String str, int i, String str2) {
        this.values = str2;
    }

    public static void ThreeDS2ServiceInstance() {
        ThreeDS2Service = 1408198399905598485L;
    }

    /* JADX WARN: Code restructure failed: missing block: B:0:?, code lost:
        r7 = r7;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void get(java.lang.String r7, int r8, java.lang.Object[] r9) {
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
            long r5 = com.netcetera.threeds.sdk.infrastructure.computeIfPresent.ThreeDS2Service     // Catch: java.lang.Throwable -> L2e
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
        throw new UnsupportedOperationException("Method not decompiled: com.netcetera.threeds.sdk.infrastructure.computeIfPresent.get(java.lang.String, int, java.lang.Object[]):void");
    }

    public static computeIfPresent valueOf(String str) {
        getSDKVersion = (cleanup + 9) % 128;
        computeIfPresent computeifpresent = (computeIfPresent) Enum.valueOf(computeIfPresent.class, str);
        getSDKVersion = (cleanup + 99) % 128;
        return computeifpresent;
    }

    public static computeIfPresent[] values() {
        getSDKVersion = (cleanup + 95) % 128;
        computeIfPresent[] computeifpresentArr = (computeIfPresent[]) ThreeDS2ServiceInstance.clone();
        getSDKVersion = (cleanup + 111) % 128;
        return computeifpresentArr;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.printStackTrace
    public String ThreeDS2Service() {
        int i = getSDKVersion + CameraActivity.REQUEST_CODE;
        int i2 = i % 128;
        cleanup = i2;
        if (i % 2 != 0) {
            String str = this.values;
            getSDKVersion = (i2 + 107) % 128;
            return str;
        }
        throw null;
    }
}
