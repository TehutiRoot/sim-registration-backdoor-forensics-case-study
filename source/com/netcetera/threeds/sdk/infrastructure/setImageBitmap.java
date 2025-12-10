package com.netcetera.threeds.sdk.infrastructure;

import android.graphics.Color;
import android.text.TextUtils;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import java.security.KeyManagementException;
import java.security.NoSuchAlgorithmException;
import javax.net.ssl.KeyManager;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManager;

/* loaded from: classes5.dex */
public class setImageBitmap {
    private static int ThreeDS2Service = 0;
    static final String ThreeDS2ServiceInstance;
    public static char[] get = null;
    private static int getSDKVersion = 1;
    public static char valueOf;
    static final String values;

    static {
        ThreeDS2ServiceInstance();
        Object[] objArr = new Object[1];
        ThreeDS2ServiceInstance(7 - (ViewConfiguration.getTapTimeout() >> 16), "\u0000\b\u0002\u0007\u0005\u0003㘊", (byte) (TextUtils.indexOf("", "", 0, 0) + 97), objArr);
        values = ((String) objArr[0]).intern();
        Object[] objArr2 = new Object[1];
        ThreeDS2ServiceInstance(7 - (ViewConfiguration.getScrollBarFadeDuration() >> 16), "\u0000\b\u0002\u0007\u0005\u0003㖱", (byte) (9 - ExpandableListView.getPackedPositionType(0L)), objArr2);
        ThreeDS2ServiceInstance = ((String) objArr2[0]).intern();
        int i = getSDKVersion + 111;
        ThreeDS2Service = i % 128;
        if (i % 2 != 0) {
            int i2 = 60 / 0;
        }
    }

    public static void ThreeDS2ServiceInstance() {
        get = new char[]{13737, 13769, 13774, 13736, 13739, 13748, 13782, 13738, 13804};
        valueOf = (char) 3;
    }

    public SSLSocketFactory ThreeDS2ServiceInstance(KeyManager[] keyManagerArr, TrustManager[] trustManagerArr) throws setId {
        try {
            Object[] objArr = new Object[1];
            ThreeDS2ServiceInstance(Color.green(0) + 7, "\u0000\b\u0002\u0007\u0005\u0003㖱", (byte) ((ViewConfiguration.getEdgeSlop() >> 16) + 9), objArr);
            SSLContext sSLContext = SSLContext.getInstance(((String) objArr[0]).intern());
            sSLContext.init(keyManagerArr, trustManagerArr, null);
            setImageMatrix setimagematrix = new setImageMatrix(sSLContext.getSocketFactory());
            ThreeDS2Service = (getSDKVersion + 95) % 128;
            return setimagematrix;
        } catch (KeyManagementException | NoSuchAlgorithmException e) {
            throw setForegroundGravity.getIds.valueOf(e);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:0:?, code lost:
        r11 = r11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void ThreeDS2ServiceInstance(int r10, java.lang.String r11, byte r12, java.lang.Object[] r13) {
        /*
            Method dump skipped, instructions count: 252
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.netcetera.threeds.sdk.infrastructure.setImageBitmap.ThreeDS2ServiceInstance(int, java.lang.String, byte, java.lang.Object[]):void");
    }
}
