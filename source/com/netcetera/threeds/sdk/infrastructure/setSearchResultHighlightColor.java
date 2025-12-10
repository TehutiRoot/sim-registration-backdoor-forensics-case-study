package com.netcetera.threeds.sdk.infrastructure;

import android.os.Process;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.ViewConfiguration;

/* loaded from: classes5.dex */
public class setSearchResultHighlightColor extends setMinEms {
    private static int ThreeDS2Service$InitializationCallback = 1;
    public static boolean cleanup = true;
    public static int getSDKInfo = 294;
    public static boolean getSDKVersion = true;
    public static char[] getWarnings = {393, 398, 391, 402, 395, 404, 397, 372, 405, 363, 410, 408, 415, 362, 378, 413, 377, 376, 407, 411, 409, 359, 406, 379, 370, 392, 361, 399, 394, 412, 360, 367};
    private static int initialize;

    /* JADX WARN: Code restructure failed: missing block: B:0:?, code lost:
        r9 = r9;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void get(int r6, int[] r7, java.lang.String r8, java.lang.String r9, java.lang.Object[] r10) {
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
            char[] r1 = com.netcetera.threeds.sdk.infrastructure.setSearchResultHighlightColor.getWarnings     // Catch: java.lang.Throwable -> L42
            int r2 = com.netcetera.threeds.sdk.infrastructure.setSearchResultHighlightColor.getSDKInfo     // Catch: java.lang.Throwable -> L42
            boolean r3 = com.netcetera.threeds.sdk.infrastructure.setSearchResultHighlightColor.cleanup     // Catch: java.lang.Throwable -> L42
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
            boolean r9 = com.netcetera.threeds.sdk.infrastructure.setSearchResultHighlightColor.getSDKVersion     // Catch: java.lang.Throwable -> L42
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
        throw new UnsupportedOperationException("Method not decompiled: com.netcetera.threeds.sdk.infrastructure.setSearchResultHighlightColor.get(int, int[], java.lang.String, java.lang.String, java.lang.Object[]):void");
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.setMinEms
    public void ThreeDS2Service(C9651nr c9651nr, setLineSpacing setlinespacing) {
        ThreeDS2Service$InitializationCallback = (initialize + 77) % 128;
        Object[] objArr = new Object[1];
        get(127 - TextUtils.indexOf("", "", 0, 0), null, null, "\u008d\u008c\u008b\u0086\u008a\u0089\u0088\u0085\u0087\u0086\u0085\u0084\u0084\u0083\u0082\u0081", objArr);
        c9651nr.ThreeDS2Service(((String) objArr[0]).intern(), ThreeDS2ServiceInstance((setSearchResultHighlightColor) setlinespacing.cleanup()));
        Object[] objArr2 = new Object[1];
        get(126 - Process.getGidForName(""), null, null, "\u0089\u0090\u008f\u008d\u008c\u008b\u0086\u008a\u0083\u008b\u0083\u008e\u0085\u0087\u0086\u0085\u0084\u0084\u0083\u0082\u0081", objArr2);
        c9651nr.ThreeDS2Service(((String) objArr2[0]).intern(), setlinespacing.valueOf());
        Object[] objArr3 = new Object[1];
        get(127 - (ViewConfiguration.getScrollDefaultDelay() >> 16), null, null, "\u0099\u0092\u0098\u0097\u0097\u0096\u008c\u0089\u008b\u0095\u0085\u0094\u0093\u0085\u0092\u0091\u008e\u0085\u0085\u008c\u0082\u008b", objArr3);
        c9651nr.ThreeDS2Service(((String) objArr3[0]).intern(), setlinespacing.addParam());
        Object[] objArr4 = new Object[1];
        get(127 - (ViewConfiguration.getPressedStateDuration() >> 16), null, null, "\u0085\u0094\u0086\u009c\u008b\u0086\u0089\u009b\u009a\u0089\u0089", objArr4);
        c9651nr.ThreeDS2Service(((String) objArr4[0]).intern(), setlinespacing.onCompleted());
        Object[] objArr5 = new Object[1];
        get(126 - MotionEvent.axisFromString(""), null, null, "\u0095\u0094\u008b\u0083\u008b\u0091\u0097\u0097\u0096\u009a\u0089\u0089", objArr5);
        c9651nr.ThreeDS2Service(((String) objArr5[0]).intern(), setlinespacing.SchemeConfiguration());
        c9651nr.get(wait.getSDKVersion, setlinespacing.getParamValue());
        Object[] objArr6 = new Object[1];
        get((ViewConfiguration.getScrollBarSize() >> 8) + 127, null, null, "\u008d\u008c\u008b\u0086\u008a\u0083\u008b\u0083\u008e\u008b\u0095\u009c\u0099\u008b\u0095\u0094\u008c\u008b", objArr6);
        c9651nr.ThreeDS2Service(((String) objArr6[0]).intern(), ThreeDS2ServiceInstance((setSearchResultHighlightColor) setlinespacing.onError()));
        Object[] objArr7 = new Object[1];
        get(TextUtils.getOffsetBefore("", 0) + 127, null, null, "\u008d\u008c\u008b\u0086\u008a\u0083\u008b\u0083\u008e\u0087\u0086\u009c\u009d\u0086\u009c\u009f\u0085\u0081\u009c\u009e\u0085\u009d", objArr7);
        c9651nr.ThreeDS2Service(((String) objArr7[0]).intern(), ThreeDS2ServiceInstance((setSearchResultHighlightColor) setlinespacing.ConfigParameters()));
        Object[] objArr8 = new Object[1];
        get((ViewConfiguration.getScrollDefaultDelay() >> 16) + 127, null, null, "\u0085\u009d\u0089\u009b\u009d\u009d\u0096\u0085\u0087\u0086\u0085\u0084\u0084\u0083\u0082\u0081", objArr8);
        c9651nr.ThreeDS2Service(((String) objArr8[0]).intern(), ThreeDS2ServiceInstance((setSearchResultHighlightColor) setlinespacing.configureScheme()));
        Object[] objArr9 = new Object[1];
        get(TextUtils.indexOf("", "") + 127, null, null, "\u009d\u0086 \u0099\u0092\u0098\u0097\u0097\u0096\u009a\u0089\u0089", objArr9);
        c9651nr.ThreeDS2Service(((String) objArr9[0]).intern(), setlinespacing.build());
        int i = ThreeDS2Service$InitializationCallback + 99;
        initialize = i % 128;
        if (i % 2 == 0) {
            return;
        }
        throw null;
    }
}
