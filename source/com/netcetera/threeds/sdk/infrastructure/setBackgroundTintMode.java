package com.netcetera.threeds.sdk.infrastructure;

import android.annotation.SuppressLint;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.TransportInfo;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import android.os.Build;
import th.p047co.dtac.android.dtacone.view.activity.CameraActivity;

/* loaded from: classes5.dex */
public class setBackgroundTintMode {
    private static int get = 0;
    private static int values = 1;
    private final WifiManager ThreeDS2Service;
    private final ConnectivityManager valueOf;

    /* loaded from: classes5.dex */
    public interface ThreeDS2ServiceInstance {
        String valueOf(WifiInfo wifiInfo);
    }

    public setBackgroundTintMode(WifiManager wifiManager, ConnectivityManager connectivityManager) {
        this.ThreeDS2Service = wifiManager;
        this.valueOf = connectivityManager;
    }

    @SuppressLint({"MissingPermission"})
    public getHeadingTextColor ThreeDS2Service(ThreeDS2ServiceInstance threeDS2ServiceInstance, setSmoothScrollbarEnabled setsmoothscrollbarenabled) {
        Network activeNetwork;
        WifiInfo wifiInfo;
        TransportInfo transportInfo;
        TransportInfo transportInfo2;
        int i = get;
        int i2 = ((i | 35) << 1) - (i ^ 35);
        values = i2 % 128;
        if (i2 % 2 != 0 ? setsmoothscrollbarenabled.ThreeDS2Service(setFastScrollStyle.valueOf) : !(!setsmoothscrollbarenabled.ThreeDS2Service(setFastScrollStyle.valueOf))) {
            int i3 = get;
            int i4 = (i3 & 109) + (i3 | 109);
            values = i4 % 128;
            if (i4 % 2 != 0) {
                getHeadingTextColor ThreeDS2ServiceInstance2 = getHeadingTextColor.ThreeDS2ServiceInstance();
                int i5 = get;
                int i6 = i5 & 5;
                int i7 = -(-((i5 ^ 5) | i6));
                values = ((i6 ^ i7) + ((i7 & i6) << 1)) % 128;
                return ThreeDS2ServiceInstance2;
            }
            getHeadingTextColor.ThreeDS2ServiceInstance();
            throw null;
        }
        if (Build.VERSION.SDK_INT < 31) {
            get = (values + 79) % 128;
            wifiInfo = this.ThreeDS2Service.getConnectionInfo();
            values = (get + 113) % 128;
        } else if (!setsmoothscrollbarenabled.ThreeDS2Service(setFastScrollStyle.ThreeDS2Service)) {
            activeNetwork = this.valueOf.getActiveNetwork();
            if (activeNetwork != null) {
                int i8 = values;
                int i9 = (i8 ^ CameraActivity.REQUEST_CODE) + ((i8 & CameraActivity.REQUEST_CODE) << 1);
                get = i9 % 128;
                if (i9 % 2 == 0) {
                    transportInfo2 = this.valueOf.getNetworkCapabilities(activeNetwork).getTransportInfo();
                    wifiInfo = (WifiInfo) transportInfo2;
                    int i10 = values;
                    get = (((i10 & 4) + (i10 | 4)) - 1) % 128;
                } else {
                    transportInfo = this.valueOf.getNetworkCapabilities(activeNetwork).getTransportInfo();
                    WifiInfo wifiInfo2 = (WifiInfo) transportInfo;
                    throw null;
                }
            } else {
                wifiInfo = null;
            }
        } else {
            values = (get + 71) % 128;
            getHeadingTextColor ThreeDS2ServiceInstance3 = getHeadingTextColor.ThreeDS2ServiceInstance();
            int i11 = values + 29;
            get = i11 % 128;
            if (i11 % 2 != 0) {
                int i12 = 44 / 0;
            }
            return ThreeDS2ServiceInstance3;
        }
        if (wifiInfo != null) {
            int i13 = get;
            int i14 = (i13 & (-80)) | ((~i13) & 79);
            int i15 = (i13 & 79) << 1;
            int i16 = (i14 & i15) + (i15 | i14);
            values = i16 % 128;
            if (i16 % 2 != 0) {
                return getHeadingTextColor.ThreeDS2Service(threeDS2ServiceInstance.valueOf(wifiInfo));
            }
            getHeadingTextColor.ThreeDS2Service(threeDS2ServiceInstance.valueOf(wifiInfo));
            throw null;
        }
        getHeadingTextColor ThreeDS2Service = getHeadingTextColor.ThreeDS2Service();
        int i17 = values;
        int i18 = i17 & 119;
        int i19 = ((i17 | 119) & (~i18)) + (i18 << 1);
        get = i19 % 128;
        if (i19 % 2 == 0) {
            return ThreeDS2Service;
        }
        throw null;
    }
}
