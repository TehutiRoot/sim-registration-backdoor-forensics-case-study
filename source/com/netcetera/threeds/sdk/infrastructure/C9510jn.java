package com.netcetera.threeds.sdk.infrastructure;

import android.os.Bundle;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import th.p047co.dtac.android.dtacone.view.activity.CameraActivity;

/* renamed from: com.netcetera.threeds.sdk.infrastructure.jn */
/* loaded from: classes5.dex */
public class C9510jn extends AbstractC9599mp implements com.netcetera.threeds.sdk.api.p018ui.ProgressView {
    public static char[] ThreeDS2ServiceInstance = {'D', 38928, 12417, 51462, 24973, 64046, 37541, 11046, 50086, 23590, 62618, 36167, 9668, 48704, 22206, 61283, 34786, 8296, 47340, 20616, 59669, 33166, 6674, 45750, 19255, 58303, 31850, 5299, 44366, 17882, 56905, 30421, 3909, 42986, 16481, 55467, 29042, 2324, 41363, 14872};
    private static int getSDKInfo = 1;
    private static int initialize = 0;
    public static long values = -2659614364491343751L;
    private getErrorMessageType ThreeDS2Service;
    private InterfaceC9515js get;
    private final InterfaceC9652ns valueOf = C9653nt.ThreeDS2ServiceInstance(C9510jn.class);

    public void ThreeDS2ServiceInstance(InterfaceC9515js interfaceC9515js) {
        int i = getSDKInfo + 75;
        initialize = i % 128;
        int i2 = i % 2;
        this.get = interfaceC9515js;
        if (i2 == 0) {
            return;
        }
        throw null;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.AbstractC9599mp, com.netcetera.threeds.sdk.infrastructure.InterfaceC9602ms
    public final View get(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle, boolean z) {
        int i = getSDKInfo;
        initialize = (i + 7) % 128;
        if (!z) {
            return new C9585mb(layoutInflater.getContext()).ThreeDS2Service(this.ThreeDS2Service.ThreeDS2ServiceInstance()).ThreeDS2Service(this.get.get().values());
        }
        initialize = (i + 41) % 128;
        return super.get(layoutInflater, viewGroup, bundle, true);
    }

    @Override // com.netcetera.threeds.sdk.api.p018ui.ProgressView
    public void hideProgress() {
        int i = initialize + 35;
        getSDKInfo = i % 128;
        if (i % 2 != 0) {
            getSDKInfo().ThreeDS2ServiceInstance();
            int i2 = initialize + 19;
            getSDKInfo = i2 % 128;
            if (i2 % 2 != 0) {
                return;
            }
            throw null;
        }
        getSDKInfo().ThreeDS2ServiceInstance();
        throw null;
    }

    @Override // com.netcetera.threeds.sdk.api.p018ui.ProgressView
    public boolean isProgressShown() {
        initialize = (getSDKInfo + 47) % 128;
        boolean z = getSDKInfo().get();
        int i = initialize + CameraActivity.REQUEST_CODE;
        getSDKInfo = i % 128;
        if (i % 2 != 0) {
            return z;
        }
        throw null;
    }

    @Override // com.netcetera.threeds.sdk.api.p018ui.ProgressView
    public void showProgress() {
        initialize = (getSDKInfo + 3) % 128;
        getSDKInfo().valueOf();
        int i = getSDKInfo + 31;
        initialize = i % 128;
        if (i % 2 == 0) {
            return;
        }
        throw null;
    }

    public void valueOf() {
        int i = initialize + 107;
        getSDKInfo = i % 128;
        if (i % 2 == 0) {
            ViewConfiguration.getFadingEdgeLength();
            KeyEvent.getMaxKeyCode();
            TypedValue.complexToFraction(1, 0.0f, 1.0f);
            getSDKInfo().values();
            return;
        }
        ViewConfiguration.getFadingEdgeLength();
        KeyEvent.getMaxKeyCode();
        TypedValue.complexToFraction(0, 0.0f, 0.0f);
        getSDKInfo().values();
    }

    public void values(getErrorMessageType geterrormessagetype) {
        int i = (getSDKInfo + 61) % 128;
        initialize = i;
        this.ThreeDS2Service = geterrormessagetype;
        getSDKInfo = (i + 23) % 128;
    }
}
