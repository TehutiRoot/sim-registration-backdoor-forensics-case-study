package com.netcetera.threeds.sdk.infrastructure;

import android.text.TextUtils;
import android.view.KeyEvent;
import android.widget.ExpandableListView;

/* renamed from: com.netcetera.threeds.sdk.infrastructure.kh */
/* loaded from: classes5.dex */
public final class C9521kh implements InterfaceC9500jo {
    public static char[] ThreeDS2Service = {137, 150, 217, 199, 212, 147, 203, 216, 207, 204};
    public static boolean ThreeDS2ServiceInstance = true;
    private static int get = 0;
    private static int getSDKInfo = 1;
    public static boolean valueOf = true;
    public static int values = 102;

    @Override // com.netcetera.threeds.sdk.infrastructure.InterfaceC9500jo
    public int ThreeDS2Service() {
        int i = get + 49;
        int i2 = i % 128;
        getSDKInfo = i2;
        int i3 = i % 2 == 0 ? 113 : 24;
        int i4 = i2 + 77;
        get = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 24 / 0;
        }
        return i3;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.InterfaceC9503jr
    public int ThreeDS2ServiceInstance() {
        getSDKInfo = (get + 65) % 128;
        return 16;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.InterfaceC9503jr
    public String get() {
        Object obj;
        int i = get + 89;
        getSDKInfo = i % 128;
        if (i % 2 == 0) {
            Object[] objArr = new Object[1];
            ThreeDS2Service(116 << ExpandableListView.getPackedPositionGroup(0L), null, null, "\u0082\u0082\u0082\u0082\u0082\u0082\u0081", objArr);
            obj = objArr[0];
        } else {
            Object[] objArr2 = new Object[1];
            ThreeDS2Service(ExpandableListView.getPackedPositionGroup(0L) + 127, null, null, "\u0082\u0082\u0082\u0082\u0082\u0082\u0081", objArr2);
            obj = objArr2[0];
        }
        return ((String) obj).intern();
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.InterfaceC9503jr
    public String valueOf() {
        getSDKInfo = (get + 105) % 128;
        Object[] objArr = new Object[1];
        ThreeDS2Service(TextUtils.indexOf((CharSequence) "", '0', 0) + 128, null, null, "\u008a\u0089\u0088\u0087\u0083\u0086\u0083\u0085\u0084\u0083", objArr);
        String intern = ((String) objArr[0]).intern();
        get = (getSDKInfo + 75) % 128;
        return intern;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.InterfaceC9500jo
    public String values() {
        Object obj;
        int i = getSDKInfo + 55;
        get = i % 128;
        if (i % 2 != 0) {
            Object[] objArr = new Object[1];
            ThreeDS2Service(53 - KeyEvent.getDeadChar(1, 0), null, null, "\u0082\u0082\u0082\u0082\u0082\u0082\u0081", objArr);
            obj = objArr[0];
        } else {
            Object[] objArr2 = new Object[1];
            ThreeDS2Service(KeyEvent.getDeadChar(0, 0) + 127, null, null, "\u0082\u0082\u0082\u0082\u0082\u0082\u0081", objArr2);
            obj = objArr2[0];
        }
        String intern = ((String) obj).intern();
        int i2 = getSDKInfo + 113;
        get = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 80 / 0;
        }
        return intern;
    }

    /* JADX WARN: Code restructure failed: missing block: B:0:?, code lost:
        r9 = r9;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void ThreeDS2Service(int r6, int[] r7, java.lang.String r8, java.lang.String r9, java.lang.Object[] r10) {
        /*
            if (r9 == 0) goto L8
            java.lang.String r0 = "ISO-8859-1"
            byte[] r9 = r9.getBytes(r0)
        L8:
            byte[] r9 = (byte[]) r9
            if (r8 == 0) goto L10
            char[] r8 = r8.toCharArray()
        L10:
            char[] r8 = (char[]) r8
            java.lang.Object r0 = com.netcetera.threeds.sdk.infrastructure.ThreeDS2Service.InitializationCallback.values
            monitor-enter(r0)
            char[] r1 = com.netcetera.threeds.sdk.infrastructure.C9521kh.ThreeDS2Service     // Catch: java.lang.Throwable -> L42
            int r2 = com.netcetera.threeds.sdk.infrastructure.C9521kh.values     // Catch: java.lang.Throwable -> L42
            boolean r3 = com.netcetera.threeds.sdk.infrastructure.C9521kh.valueOf     // Catch: java.lang.Throwable -> L42
            r4 = 0
            if (r3 == 0) goto L4d
            int r7 = r9.length     // Catch: java.lang.Throwable -> L42
            com.netcetera.threeds.sdk.infrastructure.ThreeDS2Service.InitializationCallback.ThreeDS2Service = r7     // Catch: java.lang.Throwable -> L42
            char[] r7 = new char[r7]     // Catch: java.lang.Throwable -> L42
            com.netcetera.threeds.sdk.infrastructure.ThreeDS2Service.InitializationCallback.ThreeDS2ServiceInstance = r4     // Catch: java.lang.Throwable -> L42
        L25:
            int r8 = com.netcetera.threeds.sdk.infrastructure.ThreeDS2Service.InitializationCallback.ThreeDS2ServiceInstance     // Catch: java.lang.Throwable -> L42
            int r3 = com.netcetera.threeds.sdk.infrastructure.ThreeDS2Service.InitializationCallback.ThreeDS2Service     // Catch: java.lang.Throwable -> L42
            if (r8 >= r3) goto L44
            int r8 = com.netcetera.threeds.sdk.infrastructure.ThreeDS2Service.InitializationCallback.ThreeDS2ServiceInstance     // Catch: java.lang.Throwable -> L42
            int r3 = com.netcetera.threeds.sdk.infrastructure.ThreeDS2Service.InitializationCallback.ThreeDS2Service     // Catch: java.lang.Throwable -> L42
            int r3 = r3 + (-1)
            int r5 = com.netcetera.threeds.sdk.infrastructure.ThreeDS2Service.InitializationCallback.ThreeDS2ServiceInstance     // Catch: java.lang.Throwable -> L42
            int r3 = r3 - r5
            r3 = r9[r3]     // Catch: java.lang.Throwable -> L42
            int r3 = r3 + r6
            char r3 = r1[r3]     // Catch: java.lang.Throwable -> L42
            int r3 = r3 - r2
            char r3 = (char) r3     // Catch: java.lang.Throwable -> L42
            r7[r8] = r3     // Catch: java.lang.Throwable -> L42
            int r5 = r5 + 1
            com.netcetera.threeds.sdk.infrastructure.ThreeDS2Service.InitializationCallback.ThreeDS2ServiceInstance = r5     // Catch: java.lang.Throwable -> L42
            goto L25
        L42:
            r6 = move-exception
            goto Lab
        L44:
            java.lang.String r6 = new java.lang.String     // Catch: java.lang.Throwable -> L42
            r6.<init>(r7)     // Catch: java.lang.Throwable -> L42
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L42
            r10[r4] = r6
            return
        L4d:
            boolean r9 = com.netcetera.threeds.sdk.infrastructure.C9521kh.ThreeDS2ServiceInstance     // Catch: java.lang.Throwable -> L42
            if (r9 == 0) goto L7e
            int r7 = r8.length     // Catch: java.lang.Throwable -> L42
            com.netcetera.threeds.sdk.infrastructure.ThreeDS2Service.InitializationCallback.ThreeDS2Service = r7     // Catch: java.lang.Throwable -> L42
            char[] r7 = new char[r7]     // Catch: java.lang.Throwable -> L42
            com.netcetera.threeds.sdk.infrastructure.ThreeDS2Service.InitializationCallback.ThreeDS2ServiceInstance = r4     // Catch: java.lang.Throwable -> L42
        L58:
            int r9 = com.netcetera.threeds.sdk.infrastructure.ThreeDS2Service.InitializationCallback.ThreeDS2ServiceInstance     // Catch: java.lang.Throwable -> L42
            int r3 = com.netcetera.threeds.sdk.infrastructure.ThreeDS2Service.InitializationCallback.ThreeDS2Service     // Catch: java.lang.Throwable -> L42
            if (r9 >= r3) goto L75
            int r9 = com.netcetera.threeds.sdk.infrastructure.ThreeDS2Service.InitializationCallback.ThreeDS2ServiceInstance     // Catch: java.lang.Throwable -> L42
            int r3 = com.netcetera.threeds.sdk.infrastructure.ThreeDS2Service.InitializationCallback.ThreeDS2Service     // Catch: java.lang.Throwable -> L42
            int r3 = r3 + (-1)
            int r5 = com.netcetera.threeds.sdk.infrastructure.ThreeDS2Service.InitializationCallback.ThreeDS2ServiceInstance     // Catch: java.lang.Throwable -> L42
            int r3 = r3 - r5
            char r3 = r8[r3]     // Catch: java.lang.Throwable -> L42
            int r3 = r3 - r6
            char r3 = r1[r3]     // Catch: java.lang.Throwable -> L42
            int r3 = r3 - r2
            char r3 = (char) r3     // Catch: java.lang.Throwable -> L42
            r7[r9] = r3     // Catch: java.lang.Throwable -> L42
            int r5 = r5 + 1
            com.netcetera.threeds.sdk.infrastructure.ThreeDS2Service.InitializationCallback.ThreeDS2ServiceInstance = r5     // Catch: java.lang.Throwable -> L42
            goto L58
        L75:
            java.lang.String r6 = new java.lang.String     // Catch: java.lang.Throwable -> L42
            r6.<init>(r7)     // Catch: java.lang.Throwable -> L42
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L42
            r10[r4] = r6
            return
        L7e:
            int r8 = r7.length     // Catch: java.lang.Throwable -> L42
            com.netcetera.threeds.sdk.infrastructure.ThreeDS2Service.InitializationCallback.ThreeDS2Service = r8     // Catch: java.lang.Throwable -> L42
            char[] r8 = new char[r8]     // Catch: java.lang.Throwable -> L42
            com.netcetera.threeds.sdk.infrastructure.ThreeDS2Service.InitializationCallback.ThreeDS2ServiceInstance = r4     // Catch: java.lang.Throwable -> L42
        L85:
            int r9 = com.netcetera.threeds.sdk.infrastructure.ThreeDS2Service.InitializationCallback.ThreeDS2ServiceInstance     // Catch: java.lang.Throwable -> L42
            int r3 = com.netcetera.threeds.sdk.infrastructure.ThreeDS2Service.InitializationCallback.ThreeDS2Service     // Catch: java.lang.Throwable -> L42
            if (r9 >= r3) goto La2
            int r9 = com.netcetera.threeds.sdk.infrastructure.ThreeDS2Service.InitializationCallback.ThreeDS2ServiceInstance     // Catch: java.lang.Throwable -> L42
            int r3 = com.netcetera.threeds.sdk.infrastructure.ThreeDS2Service.InitializationCallback.ThreeDS2Service     // Catch: java.lang.Throwable -> L42
            int r3 = r3 + (-1)
            int r5 = com.netcetera.threeds.sdk.infrastructure.ThreeDS2Service.InitializationCallback.ThreeDS2ServiceInstance     // Catch: java.lang.Throwable -> L42
            int r3 = r3 - r5
            r3 = r7[r3]     // Catch: java.lang.Throwable -> L42
            int r3 = r3 - r6
            char r3 = r1[r3]     // Catch: java.lang.Throwable -> L42
            int r3 = r3 - r2
            char r3 = (char) r3     // Catch: java.lang.Throwable -> L42
            r8[r9] = r3     // Catch: java.lang.Throwable -> L42
            int r5 = r5 + 1
            com.netcetera.threeds.sdk.infrastructure.ThreeDS2Service.InitializationCallback.ThreeDS2ServiceInstance = r5     // Catch: java.lang.Throwable -> L42
            goto L85
        La2:
            java.lang.String r6 = new java.lang.String     // Catch: java.lang.Throwable -> L42
            r6.<init>(r8)     // Catch: java.lang.Throwable -> L42
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L42
            r10[r4] = r6
            return
        Lab:
            monitor-exit(r0)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.netcetera.threeds.sdk.infrastructure.C9521kh.ThreeDS2Service(int, int[], java.lang.String, java.lang.String, java.lang.Object[]):void");
    }
}