package com.netcetera.threeds.sdk.infrastructure;

import android.graphics.Color;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;

/* renamed from: com.netcetera.threeds.sdk.infrastructure.kg */
/* loaded from: classes5.dex */
public final class C9520kg implements InterfaceC9496jk {
    private static int ThreeDS2Service = 0;
    public static long ThreeDS2ServiceInstance = 8666481798136479634L;
    private static int getSDKVersion = 1;
    public static char[] values = {'#', 16368, 32582, 48850, 65066, 15804, 32010, 44946, 36883, 53413, 4407, 20937, 37467, 53997, 43024, 38801, 55079, 5813, 22091, 38361, 54639, 5373, 21651, '#', 16290, 32532, 48768, 65068, 15804, 32010, '#', 16372, 32578, 48848, 65070, 15804, 32010, 34926, 47086, 63319, 14040, 30328, 46516, 62740, 13457, 29924, 46169};
    private final String get;
    private final String valueOf;

    public C9520kg(String str, String str2) {
        this.get = str;
        this.valueOf = str2;
    }

    public static InterfaceC9496jk ConfigParameters() {
        Object[] objArr = new Object[1];
        valueOf((char) ExpandableListView.getPackedPositionGroup(0L), 23 - TextUtils.getOffsetBefore("", 0), View.resolveSize(0, 0) + 7, objArr);
        String intern = ((String) objArr[0]).intern();
        Object[] objArr2 = new Object[1];
        valueOf((char) (ViewConfiguration.getScrollBarSize() >> 8), TextUtils.indexOf("", "") + 30, 7 - TextUtils.indexOf("", "", 0), objArr2);
        C9520kg c9520kg = new C9520kg(intern, ((String) objArr2[0]).intern());
        ThreeDS2Service = (getSDKVersion + 119) % 128;
        return c9520kg;
    }

    public static InterfaceC9496jk cleanup() {
        getSDKVersion = (ThreeDS2Service + 85) % 128;
        InterfaceC9496jk ConfigParameters = ConfigParameters();
        int i = getSDKVersion + 101;
        ThreeDS2Service = i % 128;
        if (i % 2 == 0) {
            return ConfigParameters;
        }
        throw null;
    }

    public static InterfaceC9496jk createTransaction() {
        Object[] objArr = new Object[1];
        valueOf((char) (ViewConfiguration.getEdgeSlop() >> 16), ViewConfiguration.getScrollBarFadeDuration() >> 16, 7 - (ViewConfiguration.getTapTimeout() >> 16), objArr);
        String intern = ((String) objArr[0]).intern();
        Object[] objArr2 = new Object[1];
        valueOf((char) (44976 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1))), (ViewConfiguration.getWindowTouchSlop() >> 8) + 7, View.resolveSizeAndState(0, 0, 0) + 7, objArr2);
        C9520kg c9520kg = new C9520kg(intern, ((String) objArr2[0]).intern());
        int i = ThreeDS2Service + 51;
        getSDKVersion = i % 128;
        if (i % 2 != 0) {
            return c9520kg;
        }
        throw null;
    }

    public static InterfaceC9496jk getSDKInfo() {
        int i = getSDKVersion + 79;
        ThreeDS2Service = i % 128;
        if (i % 2 == 0) {
            InterfaceC9496jk ConfigParameters = ConfigParameters();
            getSDKVersion = (ThreeDS2Service + 73) % 128;
            return ConfigParameters;
        }
        ConfigParameters();
        throw null;
    }

    public static InterfaceC9496jk getSDKVersion() {
        Object[] objArr = new Object[1];
        valueOf((char) (View.MeasureSpec.makeMeasureSpec(0, 0) + 43059), 14 - (KeyEvent.getMaxKeyCode() >> 16), (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 8, objArr);
        String intern = ((String) objArr[0]).intern();
        Object[] objArr2 = new Object[1];
        valueOf((char) (45025 - AndroidCharacter.getMirror('0')), 8 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), (ViewConfiguration.getScrollDefaultDelay() >> 16) + 7, objArr2);
        C9520kg c9520kg = new C9520kg(intern, ((String) objArr2[0]).intern());
        ThreeDS2Service = (getSDKVersion + 121) % 128;
        return c9520kg;
    }

    public static InterfaceC9496jk getWarnings() {
        Object[] objArr = new Object[1];
        valueOf((char) ((-1) - TextUtils.indexOf((CharSequence) "", '0')), View.resolveSize(0, 0), (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 6, objArr);
        String intern = ((String) objArr[0]).intern();
        Object[] objArr2 = new Object[1];
        valueOf((char) (44977 - (ViewConfiguration.getMaximumFlingVelocity() >> 16)), Color.argb(0, 0, 0, 0) + 7, 7 - TextUtils.indexOf("", "", 0, 0), objArr2);
        C9520kg c9520kg = new C9520kg(intern, ((String) objArr2[0]).intern());
        int i = getSDKVersion + 69;
        ThreeDS2Service = i % 128;
        if (i % 2 != 0) {
            int i2 = 75 / 0;
        }
        return c9520kg;
    }

    public static InterfaceC9496jk initialize() {
        ThreeDS2Service = (getSDKVersion + 21) % 128;
        InterfaceC9496jk ConfigParameters = ConfigParameters();
        getSDKVersion = (ThreeDS2Service + 39) % 128;
        return ConfigParameters;
    }

    public static InterfaceC9496jk onError() {
        getSDKVersion = (ThreeDS2Service + 31) % 128;
        InterfaceC9496jk ConfigParameters = ConfigParameters();
        getSDKVersion = (ThreeDS2Service + 81) % 128;
        return ConfigParameters;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.InterfaceC9496jk
    public String ThreeDS2Service() {
        int i = (getSDKVersion + 77) % 128;
        ThreeDS2Service = i;
        String str = this.get;
        int i2 = i + 125;
        getSDKVersion = i2 % 128;
        if (i2 % 2 != 0) {
            return str;
        }
        throw null;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.InterfaceC9503jr
    public int ThreeDS2ServiceInstance() {
        int i = ThreeDS2Service + 53;
        getSDKVersion = i % 128;
        if (i % 2 != 0) {
            return 16;
        }
        throw null;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.InterfaceC9503jr
    public String get() {
        int i = ThreeDS2Service + 5;
        getSDKVersion = i % 128;
        if (i % 2 != 0) {
            return this.valueOf;
        }
        throw null;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.InterfaceC9503jr
    public String valueOf() {
        getSDKVersion = (ThreeDS2Service + 1) % 128;
        Object[] objArr = new Object[1];
        valueOf((char) (34845 - Color.blue(0)), View.MeasureSpec.getMode(0) + 37, 10 - View.MeasureSpec.getMode(0), objArr);
        String intern = ((String) objArr[0]).intern();
        int i = ThreeDS2Service + 43;
        getSDKVersion = i % 128;
        if (i % 2 == 0) {
            int i2 = 21 / 0;
        }
        return intern;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.InterfaceC9496jk
    public int values() {
        int i = getSDKVersion + 81;
        ThreeDS2Service = i % 128;
        if (i % 2 == 0) {
            return 4;
        }
        throw null;
    }

    private static void valueOf(char c, int i, int i2, Object[] objArr) {
        String str;
        synchronized (ConfigParameters.valueOf) {
            try {
                char[] cArr = new char[i2];
                ConfigParameters.ThreeDS2Service = 0;
                while (true) {
                    int i3 = ConfigParameters.ThreeDS2Service;
                    if (i3 < i2) {
                        cArr[i3] = (char) ((values[i + i3] ^ (i3 * ThreeDS2ServiceInstance)) ^ c);
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