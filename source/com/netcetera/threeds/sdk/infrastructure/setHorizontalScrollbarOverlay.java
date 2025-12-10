package com.netcetera.threeds.sdk.infrastructure;

import android.graphics.Color;
import android.os.SystemClock;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.ViewConfiguration;
import com.google.common.base.Ascii;
import com.netcetera.threeds.sdk.infrastructure.setHttpAuthUsernamePassword;
import java.util.HashMap;
import javax.net.ssl.SSLSocketFactory;
import kotlin.text.Typography;
import okhttp3.internal.p026ws.WebSocketProtocol;

/* loaded from: classes5.dex */
public class setHorizontalScrollbarOverlay implements setPersistentDrawingCache {
    public static char[] ThreeDS2Service = {133, Typography.plusMinus, Typography.degree, Typography.paragraph, Typography.section, 'o', 150, 187, 178, '}', 'b', 165, 170, Typography.pound, 180, 181, Ascii.MAX, Typography.middleDot, 168, 'z', 131, 142, Typography.copyright, 154, 148, 179, 139, 134, 151, 146, 145, 149, 137, 135};
    public static boolean ThreeDS2ServiceInstance = true;
    private static int cleanup = 0;
    public static boolean get = true;
    private static int getSDKVersion = 1;
    public static int values = 66;
    private final String initialize;
    private final SSLSocketFactory valueOf;

    public setHorizontalScrollbarOverlay(SSLSocketFactory sSLSocketFactory, String str) {
        this.valueOf = sSLSocketFactory;
        this.initialize = str;
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
            char[] r1 = com.netcetera.threeds.sdk.infrastructure.setHorizontalScrollbarOverlay.ThreeDS2Service     // Catch: java.lang.Throwable -> L42
            int r2 = com.netcetera.threeds.sdk.infrastructure.setHorizontalScrollbarOverlay.values     // Catch: java.lang.Throwable -> L42
            boolean r3 = com.netcetera.threeds.sdk.infrastructure.setHorizontalScrollbarOverlay.get     // Catch: java.lang.Throwable -> L42
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
            boolean r9 = com.netcetera.threeds.sdk.infrastructure.setHorizontalScrollbarOverlay.ThreeDS2ServiceInstance     // Catch: java.lang.Throwable -> L42
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
        throw new UnsupportedOperationException("Method not decompiled: com.netcetera.threeds.sdk.infrastructure.setHorizontalScrollbarOverlay.ThreeDS2Service(int, int[], java.lang.String, java.lang.String, java.lang.Object[]):void");
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.setPersistentDrawingCache
    public setAnimationCacheEnabled valueOf(String str, String str2, String str3) {
        cleanup = (getSDKVersion + 105) % 128;
        setAnimationCacheEnabled values2 = values(str, str2, str3, null);
        int i = cleanup + 121;
        getSDKVersion = i % 128;
        if (i % 2 != 0) {
            return values2;
        }
        throw null;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.setPersistentDrawingCache
    public setAnimationCacheEnabled values(String str, String str2, String str3, String str4) {
        HashMap hashMap = new HashMap();
        Object[] objArr = new Object[1];
        ThreeDS2Service(KeyEvent.getDeadChar(0, 0) + 127, null, null, "\u0085\u0089\u0088\u0087\u0086\u0084\u0083\u0085\u0084\u0083\u0082\u0081", objArr);
        String intern = ((String) objArr[0]).intern();
        StringBuilder sb = new StringBuilder();
        sb.append(str3);
        Object[] objArr2 = new Object[1];
        ThreeDS2Service(128 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), null, null, "\u0094\u0086\u0093\u0084\u0092\u0091\u0084\u0085\u0090\u008f\u008e\u008d\u008c\u008b\u008a", objArr2);
        sb.append(((String) objArr2[0]).intern());
        hashMap.put(intern, sb.toString());
        Object[] objArr3 = new Object[1];
        ThreeDS2Service(Color.alpha(0) + 127, null, null, "\u0084\u0089\u0085\u008c\u008c\u0095", objArr3);
        hashMap.put(((String) objArr3[0]).intern(), str3);
        Object[] objArr4 = new Object[1];
        ThreeDS2Service(127 - (ViewConfiguration.getJumpTapTimeout() >> 16), null, null, "\u008d\u0084\u0097\u0083\u0085\u0096\u0086\u0084\u0083\u0085\u0084\u0083\u0082\u0081", objArr4);
        hashMap.put(((String) objArr4[0]).intern(), String.valueOf(C9669om.get(str2)));
        Object[] objArr5 = new Object[1];
        ThreeDS2Service(127 - (ViewConfiguration.getMinimumFlingVelocity() >> 16), null, null, "\u009c\u009b\u0086\u0084\u0090\u0085\u0092\u009a\u0085\u0099\u0086\u0098", objArr5);
        hashMap.put(((String) objArr5[0]).intern(), this.initialize);
        if (C9669om.ThreeDS2ServiceInstance(str4)) {
            Object[] objArr6 = new Object[1];
            ThreeDS2Service(127 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), null, null, "\u0084\u0083\u0085\u0097\u0095\u0086\u008f\u0085\u0090\u009d", objArr6);
            hashMap.put(((String) objArr6[0]).intern(), str4);
            cleanup = (getSDKVersion + 25) % 128;
        }
        Object[] objArr7 = new Object[1];
        ThreeDS2Service((ViewConfiguration.getTouchSlop() >> 8) + 127, null, null, "\u0087 \u009f\u009e", objArr7);
        setVerticalScrollbarOverlay setverticalscrollbaroverlay = new setVerticalScrollbarOverlay(new setHttpAuthUsernamePassword.ThreeDS2Service(str, ((String) objArr7[0]).intern()).valueOf(str2).ThreeDS2ServiceInstance(hashMap).values(), this.valueOf);
        int i = cleanup + 1;
        getSDKVersion = i % 128;
        if (i % 2 != 0) {
            return setverticalscrollbaroverlay;
        }
        throw null;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.setPersistentDrawingCache
    public setAnimationCacheEnabled values(String str) {
        Object[] objArr = new Object[1];
        ThreeDS2Service((SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + WebSocketProtocol.PAYLOAD_SHORT, null, null, "\u0087¢¡", objArr);
        setAddStatesFromChildren setaddstatesfromchildren = new setAddStatesFromChildren(new setHttpAuthUsernamePassword.ThreeDS2Service(str, ((String) objArr[0]).intern()).values());
        cleanup = (getSDKVersion + 67) % 128;
        return setaddstatesfromchildren;
    }
}
