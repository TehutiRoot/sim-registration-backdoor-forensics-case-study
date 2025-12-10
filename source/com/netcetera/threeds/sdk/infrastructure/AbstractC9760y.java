package com.netcetera.threeds.sdk.infrastructure;

import android.graphics.Color;
import android.graphics.PointF;
import android.media.AudioTrack;
import android.net.Uri;
import android.os.Handler;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ExpandableListView;
import com.fasterxml.jackson.core.json.ByteSourceJsonBootstrapper;
import com.google.common.base.Ascii;
import java.io.ByteArrayInputStream;
import org.bouncycastle.crypto.signers.PSSSigner;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.netcetera.threeds.sdk.infrastructure.y */
/* loaded from: classes5.dex */
public abstract class AbstractC9760y extends WebViewClient {
    private static int ConfigParameters = 1;
    public static short[] ThreeDS2Service;
    public static int ThreeDS2ServiceInstance;
    public static int get;
    private static final String getSDKVersion;
    private static int getWarnings;
    public static int valueOf;
    public static byte[] values;
    private final values cleanup;
    private final Handler getSDKInfo;
    private final InterfaceC9652ns initialize = C9653nt.ThreeDS2ServiceInstance(C9257av.class);

    /* renamed from: com.netcetera.threeds.sdk.infrastructure.y$values */
    /* loaded from: classes5.dex */
    public interface values {
        void values(String str);
    }

    static {
        ThreeDS2Service();
        Object[] objArr = new Object[1];
        ThreeDS2ServiceInstance((byte) View.resolveSizeAndState(0, 0, 0), (short) (75 - TextUtils.indexOf((CharSequence) "", '0', 0, 0)), (-527733603) - TextUtils.indexOf((CharSequence) "", '0'), Gravity.getAbsoluteGravity(0, 0) - 36, TextUtils.getTrimmedLength("") + 1580436643, objArr);
        getSDKVersion = ((String) objArr[0]).intern();
        int i = ConfigParameters + 99;
        getWarnings = i % 128;
        if (i % 2 != 0) {
            throw null;
        }
    }

    public AbstractC9760y(values valuesVar, Handler handler) {
        this.cleanup = valuesVar;
        this.getSDKInfo = handler;
    }

    public static void ThreeDS2Service() {
        get = -1580436539;
        values = new byte[]{PSSSigner.TRAILER_IMPLICIT, Ascii.NAK, -96, -120, -76, -73, 15, 102, -66, -59, PSSSigner.TRAILER_IMPLICIT, -85, -57, -85, -64, -33, -60, -66, -47, -2, Byte.MIN_VALUE, -63, -40, -74, -1, -98, -78, -40, -62, -78, -83, -67, -83, -76, ByteSourceJsonBootstrapper.UTF8_BOM_3, -83, -71, -24, 112, -61, -27, 113, -67, PSSSigner.TRAILER_IMPLICIT, -22, -76, -87, 123, -73, -80, -76, -64, 7, -29, -18, -5, 0, 0, 0, 0};
        ThreeDS2ServiceInstance = 60;
        valueOf = 527733631;
    }

    private WebResourceResponse ThreeDS2ServiceInstance() {
        Object[] objArr = new Object[1];
        ThreeDS2ServiceInstance((byte) (ExpandableListView.getPackedPositionChild(0L) + 1), (short) ((ViewConfiguration.getFadingEdgeLength() >> 16) + 59), (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) - 527733615, (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) - 46, KeyEvent.keyCodeFromString("") + 1580436639, objArr);
        String intern = ((String) objArr[0]).intern();
        Object[] objArr2 = new Object[1];
        ThreeDS2ServiceInstance((byte) (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), (short) (5 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1))), (-527733579) - (ViewConfiguration.getTapTimeout() >> 16), View.combineMeasuredStates(0, 0) - 55, ExpandableListView.getPackedPositionType(0L) + 1580436624, objArr2);
        WebResourceResponse webResourceResponse = new WebResourceResponse(intern, ((String) objArr2[0]).intern(), new ByteArrayInputStream(new byte[0]));
        int i = ConfigParameters + 35;
        getWarnings = i % 128;
        if (i % 2 == 0) {
            return webResourceResponse;
        }
        throw null;
    }

    public static /* synthetic */ void valueOf(AbstractC9760y abstractC9760y, String str) {
        int i = getWarnings + 89;
        ConfigParameters = i % 128;
        int i2 = i % 2;
        abstractC9760y.values(str);
        if (i2 == 0) {
            throw null;
        }
    }

    private /* synthetic */ void values(String str) {
        int i = getWarnings + 99;
        ConfigParameters = i % 128;
        if (i % 2 == 0) {
            this.cleanup.values(str);
            int i2 = 25 / 0;
            return;
        }
        this.cleanup.values(str);
    }

    public abstract void ThreeDS2Service(Uri uri);

    public values get() {
        int i = ConfigParameters;
        values valuesVar = this.cleanup;
        int i2 = i + 37;
        getWarnings = i2 % 128;
        if (i2 % 2 == 0) {
            return valuesVar;
        }
        throw null;
    }

    @Override // android.webkit.WebViewClient
    public WebResourceResponse shouldInterceptRequest(WebView webView, WebResourceRequest webResourceRequest) {
        Uri url = webResourceRequest.getUrl();
        TypedValue.complexToFloat(0);
        Process.getGidForName("");
        TextUtils.indexOf((CharSequence) "", '0', 0);
        TextUtils.indexOf((CharSequence) "", '0', 0, 0);
        Color.green(0);
        String uri = url.toString();
        Object[] objArr = new Object[1];
        ThreeDS2ServiceInstance((byte) (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), (short) (59 - Color.red(0)), (-527733616) - Process.getGidForName(""), (-45) - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)), 1580436640 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), objArr);
        if (!uri.startsWith(((String) objArr[0]).intern())) {
            String uri2 = url.toString();
            Object[] objArr2 = new Object[1];
            ThreeDS2ServiceInstance((byte) (TextUtils.lastIndexOf("", '0', 0) + 1), (short) (76 - KeyEvent.keyCodeFromString("")), (ViewConfiguration.getMinimumFlingVelocity() >> 16) - 527733602, TextUtils.indexOf((CharSequence) "", '0', 0) - 35, (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 1580436642, objArr2);
            if (C9669om.getWarnings(uri2, ((String) objArr2[0]).intern())) {
                ThreeDS2Service(new RunnableC9235ab(this, (String) C9669om.cleanup(url.getQuery(), "")));
                ConfigParameters = (getWarnings + 111) % 128;
            }
            ThreeDS2Service(url);
            return ThreeDS2ServiceInstance();
        }
        ConfigParameters = (getWarnings + 63) % 128;
        return null;
    }

    private static void ThreeDS2ServiceInstance(byte b, short s, int i, int i2, int i3, Object[] objArr) {
        String obj;
        synchronized (createTransaction.ThreeDS2ServiceInstance) {
            try {
                StringBuilder sb = new StringBuilder();
                int i4 = ThreeDS2ServiceInstance;
                int i5 = i2 + i4;
                int i6 = i5 == -1 ? 1 : 0;
                if (i6 != 0) {
                    byte[] bArr = values;
                    if (bArr != null) {
                        i5 = (byte) (bArr[valueOf + i] + i4);
                    } else {
                        i5 = (short) (ThreeDS2Service[valueOf + i] + i4);
                    }
                }
                if (i5 > 0) {
                    createTransaction.values = ((i + i5) - 2) + valueOf + i6;
                    char c = (char) (i3 + get);
                    createTransaction.get = c;
                    sb.append(c);
                    createTransaction.valueOf = createTransaction.get;
                    createTransaction.ThreeDS2Service = 1;
                    while (createTransaction.ThreeDS2Service < i5) {
                        byte[] bArr2 = values;
                        if (bArr2 != null) {
                            int i7 = createTransaction.values;
                            createTransaction.values = i7 - 1;
                            createTransaction.get = (char) (createTransaction.valueOf + (((byte) (bArr2[i7] + s)) ^ b));
                        } else {
                            short[] sArr = ThreeDS2Service;
                            int i8 = createTransaction.values;
                            createTransaction.values = i8 - 1;
                            createTransaction.get = (char) (createTransaction.valueOf + (((short) (sArr[i8] + s)) ^ b));
                        }
                        sb.append(createTransaction.get);
                        createTransaction.valueOf = createTransaction.get;
                        createTransaction.ThreeDS2Service++;
                    }
                }
                obj = sb.toString();
            } catch (Throwable th2) {
                throw th2;
            }
        }
        objArr[0] = obj;
    }

    public void ThreeDS2Service(Runnable runnable) {
        ConfigParameters = (getWarnings + 35) % 128;
        this.getSDKInfo.post(runnable);
        ConfigParameters = (getWarnings + 101) % 128;
    }
}
