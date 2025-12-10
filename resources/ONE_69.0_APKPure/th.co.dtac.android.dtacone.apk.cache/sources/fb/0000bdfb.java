package com.netcetera.threeds.sdk.infrastructure;

import android.graphics.Color;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes5.dex */
public class setCollapseIcon implements setSubtitleTextColor<setTitleMargin, C9640nr> {
    public static char[] ThreeDS2Service = {48092, 32721, 13279, 63447, 43984, 28613, 'h', 50284, 34925, 19559, 46921, 29521, 16210, 64337, 42841, 25469, 12123, 60264, 38764};
    private static int ThreeDS2ServiceInstance = 1;
    private static int get = 0;
    public static long values = 7449908977124099077L;

    public setTitleMargin ThreeDS2ServiceInstance(C9640nr c9640nr) {
        get = (ThreeDS2ServiceInstance + 3) % 128;
        Object[] objArr = new Object[1];
        ThreeDS2ServiceInstance((char) (48049 - View.resolveSizeAndState(0, 0, 0)), KeyEvent.getMaxKeyCode() >> 16, MotionEvent.axisFromString("") + 7, objArr);
        String values2 = c9640nr.values(((String) objArr[0]).intern());
        Object[] objArr2 = new Object[1];
        ThreeDS2ServiceInstance((char) ((-1) - ExpandableListView.getPackedPositionChild(0L)), (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 6, 4 - View.resolveSizeAndState(0, 0, 0), objArr2);
        String values3 = c9640nr.values(((String) objArr2[0]).intern());
        Object[] objArr3 = new Object[1];
        ThreeDS2ServiceInstance((char) (46892 - Color.blue(0)), 10 - View.combineMeasuredStates(0, 0), (ViewConfiguration.getLongPressTimeout() >> 16) + 9, objArr3);
        setTitleMargin ThreeDS2ServiceInstance2 = setSubtitle.ThreeDS2ServiceInstance(values2, values3, c9640nr.values(((String) objArr3[0]).intern()));
        int i = ThreeDS2ServiceInstance + 59;
        get = i % 128;
        if (i % 2 == 0) {
            return ThreeDS2ServiceInstance2;
        }
        throw null;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.setSubtitleTextColor
    public /* synthetic */ setTitleMargin valueOf(C9640nr c9640nr) {
        int i = get + 45;
        ThreeDS2ServiceInstance = i % 128;
        int i2 = i % 2;
        setTitleMargin ThreeDS2ServiceInstance2 = ThreeDS2ServiceInstance(c9640nr);
        if (i2 == 0) {
            int i3 = 32 / 0;
        }
        get = (ThreeDS2ServiceInstance + 17) % 128;
        return ThreeDS2ServiceInstance2;
    }

    private static void ThreeDS2ServiceInstance(char c, int i, int i2, Object[] objArr) {
        String str;
        synchronized (ConfigParameters.valueOf) {
            try {
                char[] cArr = new char[i2];
                ConfigParameters.ThreeDS2Service = 0;
                while (true) {
                    int i3 = ConfigParameters.ThreeDS2Service;
                    if (i3 < i2) {
                        cArr[i3] = (char) ((ThreeDS2Service[i + i3] ^ (i3 * values)) ^ c);
                        ConfigParameters.ThreeDS2Service = i3 + 1;
                    } else {
                        str = new String(cArr);
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        objArr[0] = str;
    }
}