package com.netcetera.threeds.sdk.infrastructure;

import android.annotation.TargetApi;
import android.graphics.Insets;
import android.view.View;
import android.view.Window;
import android.view.WindowInsets;
import com.netcetera.threeds.sdk.infrastructure.C9597mn;

@TargetApi(30)
/* renamed from: com.netcetera.threeds.sdk.infrastructure.mi */
/* loaded from: classes5.dex */
class C9592mi implements InterfaceC9590mg, InterfaceC9591mh {
    private static int ThreeDS2ServiceInstance = 0;
    private static int valueOf = 1;

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ WindowInsets get(C9597mn c9597mn, C9597mn c9597mn2, C9597mn c9597mn3, C9597mn c9597mn4, View view, WindowInsets windowInsets) {
        int systemBars;
        int systemBars2;
        Insets insetsIgnoringVisibility;
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int unused;
        int unused2;
        int i6 = valueOf;
        int i7 = ((i6 ^ 55) - (~(-(-((i6 & 55) << 1))))) - 1;
        ThreeDS2ServiceInstance = i7 % 128;
        if (i7 % 2 == 0) {
            systemBars2 = WindowInsets.Type.systemBars();
            insetsIgnoringVisibility = windowInsets.getInsetsIgnoringVisibility(systemBars2);
            C9597mn.values values = c9597mn.values();
            C9597mn.values valuesVar = C9597mn.values.ThreeDS2Service;
            if (values == valuesVar) {
                int i8 = ThreeDS2ServiceInstance + 77;
                valueOf = i8 % 128;
                if (i8 % 2 != 0) {
                    i = insetsIgnoringVisibility.left;
                } else {
                    unused2 = insetsIgnoringVisibility.left;
                    throw null;
                }
            } else {
                i = c9597mn.get();
                int i9 = valueOf;
                ThreeDS2ServiceInstance = ((i9 ^ 17) + ((i9 & 17) << 1)) % 128;
            }
            if (c9597mn2.values() == valuesVar) {
                int i10 = ThreeDS2ServiceInstance;
                valueOf = (((i10 ^ 26) + ((i10 & 26) << 1)) - 1) % 128;
                i2 = insetsIgnoringVisibility.top;
                ThreeDS2ServiceInstance = (((i5 ^ 80) + ((i5 & 80) << 1)) - 1) % 128;
            } else {
                i2 = c9597mn2.get();
                int i11 = ThreeDS2ServiceInstance;
                valueOf = (((((i11 ^ 69) | (i11 & 69)) << 1) - (~(-(((~i11) & 69) | (i11 & (-70)))))) - 1) % 128;
            }
            if (c9597mn3.values() == valuesVar) {
                int i12 = ThreeDS2ServiceInstance;
                int i13 = i12 + 53;
                valueOf = i13 % 128;
                if (i13 % 2 != 0) {
                    i3 = insetsIgnoringVisibility.right;
                    int i14 = i12 ^ 17;
                    int i15 = -(-((i12 & 17) << 1));
                    valueOf = ((i14 & i15) + (i15 | i14)) % 128;
                } else {
                    unused = insetsIgnoringVisibility.right;
                    throw null;
                }
            } else {
                i3 = c9597mn3.get();
                int i16 = ThreeDS2ServiceInstance;
                int i17 = i16 & 85;
                int i18 = -(-((i16 ^ 85) | i17));
                valueOf = ((i17 ^ i18) + ((i18 & i17) << 1)) % 128;
            }
            if (c9597mn4.values() == valuesVar) {
                int i19 = (valueOf + 35) % 128;
                ThreeDS2ServiceInstance = i19;
                i4 = insetsIgnoringVisibility.bottom;
                int i20 = i19 & 109;
                valueOf = (i20 + ((i19 ^ 109) | i20)) % 128;
            } else {
                i4 = c9597mn4.get();
                int i21 = valueOf;
                int i22 = i21 & 87;
                int i23 = -(-((i21 ^ 87) | i22));
                ThreeDS2ServiceInstance = ((i22 ^ i23) + ((i23 & i22) << 1)) % 128;
            }
            view.setPadding(i, i2, i3, i4);
            int i24 = ThreeDS2ServiceInstance;
            int i25 = (i24 & 75) + (i24 | 75);
            valueOf = i25 % 128;
            if (i25 % 2 == 0) {
                int i26 = 50 / 0;
            }
            return windowInsets;
        }
        systemBars = WindowInsets.Type.systemBars();
        windowInsets.getInsetsIgnoringVisibility(systemBars);
        c9597mn.values();
        C9597mn.values valuesVar2 = C9597mn.values.ThreeDS2Service;
        throw null;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.InterfaceC9590mg
    public void ThreeDS2ServiceInstance(Window window) {
        int i = ThreeDS2ServiceInstance;
        int i2 = i & 11;
        int i3 = -(-(i | 11));
        valueOf = ((i2 ^ i3) + ((i3 & i2) << 1)) % 128;
        window.setDecorFitsSystemWindows(false);
        int i4 = valueOf + 67;
        ThreeDS2ServiceInstance = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.InterfaceC9591mh
    public void ThreeDS2ServiceInstance(View view, C9597mn c9597mn, C9597mn c9597mn2, C9597mn c9597mn3, C9597mn c9597mn4) {
        view.setOnApplyWindowInsetsListener(new View$OnApplyWindowInsetsListenerC9593mj(c9597mn, c9597mn2, c9597mn3, c9597mn4));
        int i = valueOf;
        int i2 = ((i | 1) << 1) - (i ^ 1);
        ThreeDS2ServiceInstance = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
    }
}
