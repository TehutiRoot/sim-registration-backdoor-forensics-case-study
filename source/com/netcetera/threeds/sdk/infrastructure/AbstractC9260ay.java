package com.netcetera.threeds.sdk.infrastructure;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ExpandableListView;
import com.facebook.stetho.dumpapp.Framer;
import com.google.common.base.Ascii;

/* renamed from: com.netcetera.threeds.sdk.infrastructure.ay */
/* loaded from: classes5.dex */
public abstract class AbstractC9260ay extends AbstractC9758w<WebView> {
    private static int ConfigParameters = 1;
    public static byte[] ThreeDS2Service = {-88, -88, -88, -88, -88, -21, -96, -102, -83, -86, -105, -107, -73, -101, -97, -102, -86, -102, -95, -84, -102, -90, 94, Ascii.SUB, 69, 82, -117, Ascii.f52686FS, 98, 69, 84, 100, 76, 88, -106, 56, 34, 82, 76, Framer.STDIN_REQUEST_FRAME_PREFIX, -116, 14, 79, 102, 68, -103, 117, Byte.MIN_VALUE, -115, 0, 0, 0, 0};
    public static int ThreeDS2ServiceInstance = 806432297;
    public static short[] get = null;
    private static int onCompleted = 0;
    public static int valueOf = 1062165597;
    public static int values = 76;
    private final C9250ap getWarnings;
    private forEach initialize;

    public AbstractC9260ay(Context context, C9250ap c9250ap) {
        super(context);
        this.getWarnings = c9250ap;
    }

    public static /* synthetic */ void values(AbstractC9260ay abstractC9260ay, String str) {
        int i = onCompleted + 89;
        ConfigParameters = i % 128;
        int i2 = i % 2;
        abstractC9260ay.ThreeDS2Service(str);
        if (i2 == 0) {
            int i3 = 49 / 0;
        }
        int i4 = ConfigParameters + 17;
        onCompleted = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 23 / 0;
        }
    }

    public final void ThreeDS2Service(forEach foreach) {
        int i = (onCompleted + 13) % 128;
        ConfigParameters = i;
        this.initialize = foreach;
        int i2 = i + 45;
        onCompleted = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
    }

    public forEach ThreeDS2ServiceInstance() {
        int i = ConfigParameters;
        int i2 = i + 15;
        onCompleted = i2 % 128;
        if (i2 % 2 == 0) {
            forEach foreach = this.initialize;
            int i3 = i + 93;
            onCompleted = i3 % 128;
            if (i3 % 2 == 0) {
                return foreach;
            }
            throw null;
        }
        throw null;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.AbstractC9758w
    public /* synthetic */ WebView get(Context context) {
        int i = ConfigParameters + 77;
        onCompleted = i % 128;
        if (i % 2 != 0) {
            values(context);
            throw null;
        }
        WebView values2 = values(context);
        int i2 = ConfigParameters + 11;
        onCompleted = i2 % 128;
        if (i2 % 2 == 0) {
            return values2;
        }
        throw null;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.contains
    public void valueOf(setAllCaps setallcaps) {
        onCompleted = (ConfigParameters + 39) % 128;
        values();
        values(this.getWarnings.get(setallcaps.createTransaction()));
        onCompleted = (ConfigParameters + 67) % 128;
    }

    private /* synthetic */ void ThreeDS2Service(String str) {
        int i = onCompleted + 109;
        ConfigParameters = i % 128;
        if (i % 2 != 0) {
            forEach foreach = this.initialize;
            if (foreach != null) {
                foreach.ThreeDS2ServiceInstance(new C9273bi(str));
            }
            int i2 = ConfigParameters + 31;
            onCompleted = i2 % 128;
            if (i2 % 2 != 0) {
                int i3 = 60 / 0;
                return;
            }
            return;
        }
        throw null;
    }

    public WebViewClient ThreeDS2ServiceInstance(Context context) {
        C9257av valueOf2 = C9257av.valueOf(new C9265bb(this));
        ConfigParameters = (onCompleted + 105) % 128;
        return valueOf2;
    }

    public C9250ap get() {
        int i = (onCompleted + 117) % 128;
        ConfigParameters = i;
        C9250ap c9250ap = this.getWarnings;
        onCompleted = (i + 113) % 128;
        return c9250ap;
    }

    public final WebView values(Context context) {
        WebView webView = new WebView(context);
        Object[] objArr = new Object[1];
        values((byte) (ViewConfiguration.getLongPressTimeout() >> 16), (short) (89 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1))), (-1062165598) + (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)), (-70) - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), (-806432261) - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), objArr);
        webView.setBackgroundColor(Color.parseColor(((String) objArr[0]).intern()));
        webView.setWebViewClient(ThreeDS2ServiceInstance(context));
        webView.getSettings().setJavaScriptEnabled(false);
        webView.getSettings().setBuiltInZoomControls(true);
        webView.getSettings().setDisplayZoomControls(false);
        Object[] objArr2 = new Object[1];
        values((byte) (ViewConfiguration.getKeyRepeatTimeout() >> 16), (short) ((Process.myTid() >> 22) + 95), (-1062165591) - View.MeasureSpec.getMode(0), (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) - 60, (-806432197) - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), objArr2);
        values(webView, ((String) objArr2[0]).intern());
        ConfigParameters = (onCompleted + 69) % 128;
        return webView;
    }

    public final void values(String str) {
        onCompleted = (ConfigParameters + 15) % 128;
        WebView ThreeDS2Service2 = ThreeDS2Service();
        Object[] objArr = new Object[1];
        values((byte) (KeyEvent.getMaxKeyCode() >> 16), (short) (View.resolveSize(0, 0) - 83), TextUtils.getTrimmedLength("") - 1062165575, View.MeasureSpec.getSize(0) - 52, (-806432180) - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), objArr);
        String intern = ((String) objArr[0]).intern();
        Object[] objArr2 = new Object[1];
        values((byte) TextUtils.indexOf("", ""), (short) (114 - Drawable.resolveOpacity(0, 0)), (-1062165552) - (Process.myTid() >> 22), KeyEvent.keyCodeFromString("") - 71, (-806432213) - TextUtils.indexOf((CharSequence) "", '0', 0), objArr2);
        ThreeDS2Service2.loadDataWithBaseURL(null, str, intern, ((String) objArr2[0]).intern(), null);
        onCompleted = (ConfigParameters + 79) % 128;
    }

    private static void values(byte b, short s, int i, int i2, int i3, Object[] objArr) {
        String obj;
        synchronized (createTransaction.ThreeDS2ServiceInstance) {
            try {
                StringBuilder sb = new StringBuilder();
                int i4 = values;
                int i5 = i2 + i4;
                int i6 = i5 == -1 ? 1 : 0;
                if (i6 != 0) {
                    byte[] bArr = ThreeDS2Service;
                    if (bArr != null) {
                        i5 = (byte) (bArr[valueOf + i] + i4);
                    } else {
                        i5 = (short) (get[valueOf + i] + i4);
                    }
                }
                if (i5 > 0) {
                    createTransaction.values = ((i + i5) - 2) + valueOf + i6;
                    char c = (char) (i3 + ThreeDS2ServiceInstance);
                    createTransaction.get = c;
                    sb.append(c);
                    createTransaction.valueOf = createTransaction.get;
                    createTransaction.ThreeDS2Service = 1;
                    while (createTransaction.ThreeDS2Service < i5) {
                        byte[] bArr2 = ThreeDS2Service;
                        if (bArr2 != null) {
                            int i7 = createTransaction.values;
                            createTransaction.values = i7 - 1;
                            createTransaction.get = (char) (createTransaction.valueOf + (((byte) (bArr2[i7] + s)) ^ b));
                        } else {
                            short[] sArr = get;
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
}
