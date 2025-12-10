package com.netcetera.threeds.sdk.infrastructure;

import androidx.appcompat.app.AppCompatDelegate;
import java.io.IOException;
import java.io.OutputStream;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLSocketFactory;
import th.p047co.dtac.android.dtacone.view.activity.CameraActivity;

/* loaded from: classes5.dex */
class setVerticalScrollbarOverlay extends setLayoutAnimationListener {
    private static int ThreeDS2ServiceInstance = 1;
    private static int values;
    private final SSLSocketFactory get;

    public setVerticalScrollbarOverlay(setOnHierarchyChangeListener setonhierarchychangelistener, SSLSocketFactory sSLSocketFactory) {
        super(setonhierarchychangelistener);
        this.get = sSLSocketFactory;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.setLayoutAnimationListener
    public void ThreeDS2Service(HttpsURLConnection httpsURLConnection) throws IOException {
        int i = values;
        int i2 = i ^ CameraActivity.REQUEST_CODE;
        int i3 = ((i & CameraActivity.REQUEST_CODE) | i2) << 1;
        int i4 = -i2;
        int i5 = (i3 ^ i4) + ((i3 & i4) << 1);
        ThreeDS2ServiceInstance = i5 % 128;
        if (i5 % 2 == 0) {
            super.ThreeDS2Service(httpsURLConnection);
            httpsURLConnection.setSSLSocketFactory(this.get);
            httpsURLConnection.setDoInput(false);
            return;
        }
        super.ThreeDS2Service(httpsURLConnection);
        httpsURLConnection.setSSLSocketFactory(this.get);
        httpsURLConnection.setDoInput(true);
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.setLayoutAnimationListener
    public void ThreeDS2ServiceInstance(HttpsURLConnection httpsURLConnection) throws IOException {
        int i = values;
        ThreeDS2ServiceInstance = ((i ^ 37) + ((i & 37) << 1)) % 128;
        super.ThreeDS2ServiceInstance(httpsURLConnection);
        OutputStream outputStream = httpsURLConnection.getOutputStream();
        try {
            byte[] bArr = ThreeDS2ServiceInstance().valueOf().get();
            outputStream.write(bArr, 0, bArr.length);
            int i2 = values + 9;
            ThreeDS2ServiceInstance = i2 % 128;
            if (i2 % 2 != 0) {
                outputStream.close();
                int i3 = ThreeDS2ServiceInstance;
                values = ((-2) - (~(((i3 | AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR) << 1) - (i3 ^ AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR)))) % 128;
                return;
            }
            outputStream.close();
            throw null;
        } catch (Throwable th2) {
            if (outputStream != null) {
                try {
                    outputStream.close();
                    int i4 = values;
                    ThreeDS2ServiceInstance = (((i4 | 49) << 1) - (i4 ^ 49)) % 128;
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
            }
            throw th2;
        }
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.setLayoutAnimationListener
    public setAnimationCacheEnabled ThreeDS2Service() {
        setVerticalScrollbarOverlay setverticalscrollbaroverlay = new setVerticalScrollbarOverlay(ThreeDS2ServiceInstance(), this.get);
        values = (ThreeDS2ServiceInstance + CameraActivity.REQUEST_CODE) % 128;
        return setverticalscrollbaroverlay;
    }
}
