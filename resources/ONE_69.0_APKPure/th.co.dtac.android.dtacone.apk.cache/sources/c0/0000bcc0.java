package com.netcetera.threeds.sdk.infrastructure;

import android.graphics.Color;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;

/* renamed from: com.netcetera.threeds.sdk.infrastructure.km */
/* loaded from: classes5.dex */
public class C9529km implements InterfaceC9509jw {
    public static char[] ThreeDS2Service = null;
    public static char ThreeDS2ServiceInstance = 0;
    private static int get = 1;
    private static int valueOf;
    private static final String values;

    static {
        valueOf();
        Object[] objArr = new Object[1];
        valueOf(7 - Color.blue(0), "\u0002\u0000㙚㙚㙚㙚㙚", (byte) (94 - View.resolveSize(0, 0)), objArr);
        values = ((String) objArr[0]).intern();
        valueOf = (get + 25) % 128;
    }

    public static void valueOf() {
        ThreeDS2Service = new char[]{13753, 13755, 13820, 13754};
        ThreeDS2ServiceInstance = (char) 2;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.InterfaceC9509jw
    public String ThreeDS2ServiceInstance() {
        Object obj;
        int i = valueOf + 83;
        get = i % 128;
        if (i % 2 == 0) {
            Object[] objArr = new Object[1];
            valueOf(23 >>> KeyEvent.keyCodeFromString(""), "\u0002\u0000㙚㙚㙚㙚㙚", (byte) (57 >> TextUtils.getOffsetBefore("", 1)), objArr);
            obj = objArr[0];
        } else {
            Object[] objArr2 = new Object[1];
            valueOf(7 - KeyEvent.keyCodeFromString(""), "\u0002\u0000㙚㙚㙚㙚㙚", (byte) (94 - TextUtils.getOffsetBefore("", 0)), objArr2);
            obj = objArr2[0];
        }
        return ((String) obj).intern();
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.InterfaceC9509jw
    public String values() {
        get = (valueOf + 1) % 128;
        Object[] objArr = new Object[1];
        valueOf((ViewConfiguration.getWindowTouchSlop() >> 8) + 7, "\u0002\u0000㙚㙚㙚㙚㙚", (byte) (94 - (ViewConfiguration.getScrollDefaultDelay() >> 16)), objArr);
        String intern = ((String) objArr[0]).intern();
        int i = get + 107;
        valueOf = i % 128;
        if (i % 2 == 0) {
            return intern;
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
    private static void valueOf(int r10, java.lang.String r11, byte r12, java.lang.Object[] r13) {
        /*
            Method dump skipped, instructions count: 252
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.netcetera.threeds.sdk.infrastructure.C9529km.valueOf(int, java.lang.String, byte, java.lang.Object[]):void");
    }
}