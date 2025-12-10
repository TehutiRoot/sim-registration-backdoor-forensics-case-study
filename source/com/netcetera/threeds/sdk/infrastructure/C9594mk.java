package com.netcetera.threeds.sdk.infrastructure;

import android.view.View;
import android.view.Window;
import android.view.WindowInsets;
import com.netcetera.threeds.sdk.infrastructure.C9597mn;
import th.p047co.dtac.android.dtacone.view.activity.CameraActivity;

/* renamed from: com.netcetera.threeds.sdk.infrastructure.mk */
/* loaded from: classes5.dex */
class C9594mk implements InterfaceC9590mg, InterfaceC9591mh {
    private static int ThreeDS2ServiceInstance = 1;
    private static int values;

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ WindowInsets values(C9597mn c9597mn, C9597mn c9597mn2, C9597mn c9597mn3, C9597mn c9597mn4, View view, WindowInsets windowInsets) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5 = values;
        int i6 = (i5 ^ 12) + ((i5 & 12) << 1);
        ThreeDS2ServiceInstance = ((~i6) + (i6 << 1)) % 128;
        C9597mn.values values2 = c9597mn.values();
        C9597mn.values valuesVar = C9597mn.values.ThreeDS2Service;
        if (values2 == valuesVar) {
            int i7 = ThreeDS2ServiceInstance;
            int i8 = i7 & CameraActivity.REQUEST_CODE;
            int i9 = ((i7 | CameraActivity.REQUEST_CODE) & (~i8)) + (i8 << 1);
            values = i9 % 128;
            if (i9 % 2 != 0) {
                i = windowInsets.getSystemWindowInsetLeft();
                int i10 = 71 / 0;
            } else {
                i = windowInsets.getSystemWindowInsetLeft();
            }
            int i11 = values;
            int i12 = i11 & 15;
            ThreeDS2ServiceInstance = ((((i11 | 15) & (~i12)) - (~(-(-(i12 << 1))))) - 1) % 128;
        } else {
            i = c9597mn.get();
            values = (ThreeDS2ServiceInstance + 81) % 128;
        }
        if (c9597mn2.values() == valuesVar) {
            int i13 = ThreeDS2ServiceInstance;
            values = ((i13 ^ 47) + ((i13 & 47) << 1)) % 128;
            i2 = windowInsets.getSystemWindowInsetTop();
            int i14 = values;
            int i15 = i14 ^ 67;
            int i16 = ((i14 & 67) | i15) << 1;
            int i17 = -i15;
            ThreeDS2ServiceInstance = ((i16 ^ i17) + ((i16 & i17) << 1)) % 128;
        } else {
            i2 = c9597mn2.get();
            int i18 = values;
            int i19 = i18 & 61;
            int i20 = (i18 | 61) & (~i19);
            int i21 = i19 << 1;
            ThreeDS2ServiceInstance = (((i20 | i21) << 1) - (i20 ^ i21)) % 128;
        }
        if (c9597mn3.values() == valuesVar) {
            int i22 = ThreeDS2ServiceInstance;
            int i23 = i22 & 89;
            int i24 = (i22 | 89) & (~i23);
            int i25 = -(-(i23 << 1));
            values = ((i24 & i25) + (i24 | i25)) % 128;
            i3 = windowInsets.getSystemWindowInsetRight();
            values = (ThreeDS2ServiceInstance + 13) % 128;
        } else {
            i3 = c9597mn3.get();
            int i26 = ThreeDS2ServiceInstance;
            values = ((i26 & 19) + (i26 | 19)) % 128;
        }
        if (c9597mn4.values() == valuesVar) {
            int i27 = ThreeDS2ServiceInstance + 33;
            values = i27 % 128;
            if (i27 % 2 == 0) {
                i4 = windowInsets.getSystemWindowInsetBottom();
            } else {
                windowInsets.getSystemWindowInsetBottom();
                throw null;
            }
        } else {
            i4 = c9597mn4.get();
            int i28 = values;
            ThreeDS2ServiceInstance = (((i28 & 122) + (i28 | 122)) - 1) % 128;
        }
        view.setPadding(i, i2, i3, i4);
        int i29 = ThreeDS2ServiceInstance;
        int i30 = i29 ^ 41;
        values = ((((i29 & 41) | i30) << 1) - i30) % 128;
        return windowInsets;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.InterfaceC9590mg
    public void ThreeDS2ServiceInstance(Window window) {
        int i = values;
        int i2 = i | 87;
        int i3 = i2 << 1;
        int i4 = -((~(i & 87)) & i2);
        int i5 = ((i3 | i4) << 1) - (i4 ^ i3);
        ThreeDS2ServiceInstance = i5 % 128;
        if (i5 % 2 == 0) {
            window.getDecorView().setSystemUiVisibility(22273);
        } else {
            window.getDecorView().setSystemUiVisibility(1792);
        }
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.InterfaceC9591mh
    public void ThreeDS2ServiceInstance(View view, C9597mn c9597mn, C9597mn c9597mn2, C9597mn c9597mn3, C9597mn c9597mn4) {
        view.setOnApplyWindowInsetsListener(new View$OnApplyWindowInsetsListenerC9598mo(c9597mn, c9597mn2, c9597mn3, c9597mn4));
        int i = ThreeDS2ServiceInstance;
        int i2 = (i ^ 87) + ((i & 87) << 1);
        values = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
    }
}
