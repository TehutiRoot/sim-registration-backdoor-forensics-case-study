package com.netcetera.threeds.sdk.infrastructure;

import android.content.Context;
import android.media.AudioTrack;
import android.os.Process;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import ch.qos.logback.core.CoreConstants;

/* loaded from: classes5.dex */
class setDivider {
    public static int ThreeDS2Service = 0;
    private static final String ThreeDS2ServiceInstance;
    public static char[] get = null;
    private static final String getSDKInfo;
    private static int getWarnings = 0;
    private static int initialize = 1;
    public static boolean valueOf;
    public static boolean values;
    private final Object getSDKVersion$7adc8007;

    static {
        values();
        Object[] objArr = new Object[1];
        get(127 - (ViewConfiguration.getMaximumFlingVelocity() >> 16), null, null, "\u008e\u0088\u008d\u0086\u008c\u0081\u0087\u008b\u0088\u0081\u0081\u0084\u0086\u008a\u0089\u0083\u0082\u0088\u0087\u0086\u0085\u0084\u0083\u0082\u0081", objArr);
        getSDKInfo = ((String) objArr[0]).intern();
        Object[] objArr2 = new Object[1];
        get((ViewConfiguration.getLongPressTimeout() >> 16) + 127, null, null, "\u008e\u0088\u008d\u0086\u0087\u008b\u0084\u0081\u008c\u0088\u008b\u0083\u0081\u0086\u008a\u0089\u0083\u0082\u0088\u0087\u0086\u0085\u0084\u0083\u0082\u0081", objArr2);
        ThreeDS2ServiceInstance = ((String) objArr2[0]).intern();
        getWarnings = (initialize + 49) % 128;
    }

    public setDivider(Object obj) {
        this.getSDKVersion$7adc8007 = obj;
    }

    public static setDivider get(Context context) {
        try {
            setDivider setdivider = new setDivider(((Class) get3DSServerTransactionID.ThreeDS2Service(3497 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), TextUtils.indexOf("", "") + 49, (char) (TextUtils.indexOf("", "", 0, 0) + 35504))).getMethod("get", Context.class).invoke(null, context));
            int i = initialize + 15;
            getWarnings = i % 128;
            if (i % 2 == 0) {
                return setdivider;
            }
            throw null;
        } catch (Throwable th2) {
            Throwable cause = th2.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th2;
        }
    }

    public static void values() {
        valueOf = true;
        get = new char[]{391, 389, 380, 372, 383, 370, 387, 376, 386, 375, 384, 390, 382, 396};
        values = true;
        ThreeDS2Service = 275;
    }

    public boolean get() {
        long currentTimeMillis = System.currentTimeMillis();
        Object obj = this.getSDKVersion$7adc8007;
        Object[] objArr = new Object[1];
        get(127 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), null, null, "\u008e\u0088\u008d\u0086\u0087\u008b\u0084\u0081\u008c\u0088\u008b\u0083\u0081\u0086\u008a\u0089\u0083\u0082\u0088\u0087\u0086\u0085\u0084\u0083\u0082\u0081", objArr);
        try {
            Object[] objArr2 = {((String) objArr[0]).intern(), 0L};
            Class<?> cls = Long.TYPE;
            long longValue = ((Long) ((Class) get3DSServerTransactionID.ThreeDS2Service(TextUtils.indexOf((CharSequence) "", '0', 0) + 3449, TextUtils.indexOf("", "") + 48, (char) (5412 - (Process.myTid() >> 22)))).getMethod("ThreeDS2ServiceInstance", String.class, cls).invoke(obj, objArr2)).longValue();
            Object obj2 = this.getSDKVersion$7adc8007;
            Object[] objArr3 = new Object[1];
            get(127 - (ViewConfiguration.getDoubleTapTimeout() >> 16), null, null, "\u008e\u0088\u008d\u0086\u008c\u0081\u0087\u008b\u0088\u0081\u0081\u0084\u0086\u008a\u0089\u0083\u0082\u0088\u0087\u0086\u0085\u0084\u0083\u0082\u0081", objArr3);
            try {
                Object[] objArr4 = {((String) objArr3[0]).intern(), 0};
                Class<?> cls2 = Integer.TYPE;
                int intValue = ((Integer) ((Class) get3DSServerTransactionID.ThreeDS2Service((ViewConfiguration.getTouchSlop() >> 8) + 3448, 48 - TextUtils.getOffsetAfter("", 0), (char) (5412 - (KeyEvent.getMaxKeyCode() >> 16)))).getMethod("ThreeDS2ServiceInstance", String.class, cls2).invoke(obj2, objArr4)).intValue() + 1;
                Object obj3 = this.getSDKVersion$7adc8007;
                Object[] objArr5 = new Object[1];
                get(127 - (ViewConfiguration.getScrollBarSize() >> 8), null, null, "\u008e\u0088\u008d\u0086\u008c\u0081\u0087\u008b\u0088\u0081\u0081\u0084\u0086\u008a\u0089\u0083\u0082\u0088\u0087\u0086\u0085\u0084\u0083\u0082\u0081", objArr5);
                try {
                    ((Class) get3DSServerTransactionID.ThreeDS2Service(3448 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), 48 - ExpandableListView.getPackedPositionType(0L), (char) (Gravity.getAbsoluteGravity(0, 0) + 5412))).getMethod("values", String.class, cls2).invoke(obj3, ((String) objArr5[0]).intern(), Integer.valueOf(intValue));
                    if (longValue != 0) {
                        if (currentTimeMillis - longValue >= CoreConstants.MILLIS_IN_ONE_WEEK) {
                            initialize = (getWarnings + 29) % 128;
                            if (intValue > 10) {
                                return false;
                            }
                        }
                        getWarnings = (initialize + 113) % 128;
                        return true;
                    }
                    Object obj4 = this.getSDKVersion$7adc8007;
                    Object[] objArr6 = new Object[1];
                    get(((byte) KeyEvent.getModifierMetaStateMask()) + 128, null, null, "\u008e\u0088\u008d\u0086\u0087\u008b\u0084\u0081\u008c\u0088\u008b\u0083\u0081\u0086\u008a\u0089\u0083\u0082\u0088\u0087\u0086\u0085\u0084\u0083\u0082\u0081", objArr6);
                    try {
                        ((Class) get3DSServerTransactionID.ThreeDS2Service(3449 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), 49 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), (char) (5412 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24)))).getMethod("values", String.class, cls).invoke(obj4, ((String) objArr6[0]).intern(), Long.valueOf(currentTimeMillis));
                        return true;
                    } catch (Throwable th2) {
                        Throwable cause = th2.getCause();
                        if (cause != null) {
                            throw cause;
                        }
                        throw th2;
                    }
                } catch (Throwable th3) {
                    Throwable cause2 = th3.getCause();
                    if (cause2 != null) {
                        throw cause2;
                    }
                    throw th3;
                }
            } catch (Throwable th4) {
                Throwable cause3 = th4.getCause();
                if (cause3 != null) {
                    throw cause3;
                }
                throw th4;
            }
        } catch (Throwable th5) {
            Throwable cause4 = th5.getCause();
            if (cause4 != null) {
                throw cause4;
            }
            throw th5;
        }
    }

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
            char[] r1 = com.netcetera.threeds.sdk.infrastructure.setDivider.get     // Catch: java.lang.Throwable -> L42
            int r2 = com.netcetera.threeds.sdk.infrastructure.setDivider.ThreeDS2Service     // Catch: java.lang.Throwable -> L42
            boolean r3 = com.netcetera.threeds.sdk.infrastructure.setDivider.valueOf     // Catch: java.lang.Throwable -> L42
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
            boolean r9 = com.netcetera.threeds.sdk.infrastructure.setDivider.values     // Catch: java.lang.Throwable -> L42
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
        throw new UnsupportedOperationException("Method not decompiled: com.netcetera.threeds.sdk.infrastructure.setDivider.get(int, int[], java.lang.String, java.lang.String, java.lang.Object[]):void");
    }
}
