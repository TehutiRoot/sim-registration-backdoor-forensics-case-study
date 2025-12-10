package com.netcetera.threeds.sdk.infrastructure;

import android.graphics.Color;
import android.os.SystemClock;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewConfiguration;

/* loaded from: classes5.dex */
public class setFocusedSearchResultIndex extends setMinEms {
    public static char cleanup = 6;
    private static int getSDKInfo = 1;
    public static char[] getSDKVersion = {13817, 13827, 13802, 13795, 13810, 13824, 13818, 13819, 13816, 13820, 13803, 13782, 13775, 13829, 13801, 13811, 13791, 13806, 13823, 13768, 13800, 13807, 13826, 13805, 13769, 13780, 13825, 13821, 13822, 13813, 13814, 13785, 13790, 13812, 13787, 13828};
    private static int getWarnings;

    /* JADX WARN: Code restructure failed: missing block: B:0:?, code lost:
        r11 = r11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void values(int r10, java.lang.String r11, byte r12, java.lang.Object[] r13) {
        /*
            Method dump skipped, instructions count: 252
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.netcetera.threeds.sdk.infrastructure.setFocusedSearchResultIndex.values(int, java.lang.String, byte, java.lang.Object[]):void");
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.setMinEms
    public void ThreeDS2Service(C9651nr c9651nr, setLineSpacing setlinespacing) {
        getWarnings = (getSDKInfo + 65) % 128;
        Object[] objArr = new Object[1];
        values(11 - (ViewConfiguration.getLongPressTimeout() >> 16), "㙣㙣\u0007 \u001b#\f\u0010\u0003\u001b㙭", (byte) ((TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 110), objArr);
        c9651nr.get(((String) objArr[0]).intern(), setlinespacing.createTransaction());
        Object[] objArr2 = new Object[1];
        values((ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 15, "\u0001\u0005\u0006\u001f\u0000\u0018\u0003!\u0013\u0018\u001c\u0011#\u000f\u0015\u0002", (byte) (100 - Color.blue(0)), objArr2);
        c9651nr.ThreeDS2Service(((String) objArr2[0]).intern(), ThreeDS2ServiceInstance((setFocusedSearchResultIndex) setlinespacing.cleanup()));
        Object[] objArr3 = new Object[1];
        values(22 - (ViewConfiguration.getWindowTouchSlop() >> 8), "\u0010\u0005\u0015\u0013\u0014\u001e\u0019\u0012\u0016\u0006\u0016\u0013\u000f\f\u001a\u0017 \u0004\u0000\u000e\u0017\u0007", (byte) (Color.argb(0, 0, 0, 0) + 56), objArr3);
        c9651nr.ThreeDS2Service(((String) objArr3[0]).intern(), setlinespacing.addParam());
        Object[] objArr4 = new Object[1];
        values(21 - View.MeasureSpec.makeMeasureSpec(0, 0), "\u0016\u0005\u0010\f\u0018\u0000\u0010\u000f\f\u0010\u0003!\u001f\b\r\u000b\u000f\"\u000e\u0017㘥", (byte) (67 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1))), objArr4);
        c9651nr.ThreeDS2Service(((String) objArr4[0]).intern(), ThreeDS2ServiceInstance((setFocusedSearchResultIndex) setlinespacing.ThreeDS2Service$InitializationCallback()));
        getWarnings = (getSDKInfo + 83) % 128;
    }
}
