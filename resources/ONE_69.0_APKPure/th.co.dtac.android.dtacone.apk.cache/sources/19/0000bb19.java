package com.netcetera.threeds.sdk.infrastructure;

import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import com.netcetera.threeds.sdk.infrastructure.AbstractC9749y;

/* renamed from: com.netcetera.threeds.sdk.infrastructure.av */
/* loaded from: classes5.dex */
public class C9246av extends AbstractC9749y {
    private static int getSDKVersion = 1;
    private static int initialize;

    public C9246av(AbstractC9749y.values valuesVar, Handler handler) {
        super(valuesVar, handler);
    }

    public static C9246av valueOf(AbstractC9749y.values valuesVar) {
        C9246av c9246av = new C9246av(valuesVar, new Handler(Looper.getMainLooper()));
        int i = initialize;
        int i2 = i & 37;
        int i3 = -(-((i ^ 37) | i2));
        int i4 = (i2 & i3) + (i3 | i2);
        getSDKVersion = i4 % 128;
        if (i4 % 2 != 0) {
            return c9246av;
        }
        throw null;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.AbstractC9749y
    public void ThreeDS2Service(Uri uri) {
        int i = initialize;
        int i2 = i & 109;
        getSDKVersion = (((i | 109) & (~i2)) + (i2 << 1)) % 128;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.AbstractC9749y, android.webkit.WebViewClient
    public /* bridge */ /* synthetic */ WebResourceResponse shouldInterceptRequest(WebView webView, WebResourceRequest webResourceRequest) {
        int i = initialize;
        int i2 = i & 79;
        int i3 = (i | 79) & (~i2);
        int i4 = -(-(i2 << 1));
        getSDKVersion = (((i3 | i4) << 1) - (i3 ^ i4)) % 128;
        WebResourceResponse shouldInterceptRequest = super.shouldInterceptRequest(webView, webResourceRequest);
        int i5 = initialize;
        int i6 = i5 & 83;
        int i7 = (i5 ^ 83) | i6;
        getSDKVersion = ((i6 ^ i7) + ((i7 & i6) << 1)) % 128;
        return shouldInterceptRequest;
    }
}