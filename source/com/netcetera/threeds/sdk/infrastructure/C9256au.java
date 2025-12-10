package com.netcetera.threeds.sdk.infrastructure;

import android.content.Context;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import com.netcetera.threeds.sdk.infrastructure.AbstractC9760y;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.bouncycastle.pqc.math.linearalgebra.Matrix;
import th.p047co.dtac.android.dtacone.view.activity.CameraActivity;

/* renamed from: com.netcetera.threeds.sdk.infrastructure.au */
/* loaded from: classes5.dex */
public class C9256au extends AbstractC9760y {
    private static int ThreeDS2Service$InitializationCallback = 1;
    private static final String getSDKInfo;
    private static int getWarnings;
    public static char[] initialize;
    private final setLinksClickable cleanup;
    private final Context getSDKVersion;

    /* renamed from: com.netcetera.threeds.sdk.infrastructure.au$valueOf */
    /* loaded from: classes5.dex */
    public interface valueOf extends AbstractC9760y.values {
        void ThreeDS2Service(String str);

        void valueOf(String str);
    }

    static {
        valueOf();
        Object[] objArr = new Object[1];
        get("\u0000\u0000\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0001\u0001\u0001\u0000", new int[]{0, 25, 4, 0}, false, objArr);
        getSDKInfo = ((String) objArr[0]).intern();
        int i = ThreeDS2Service$InitializationCallback + 115;
        getWarnings = i % 128;
        if (i % 2 != 0) {
            int i2 = 13 / 0;
        }
    }

    public C9256au(Context context, Handler handler, setLinksClickable setlinksclickable, valueOf valueof) {
        super(valueof, handler);
        this.getSDKVersion = context;
        this.cleanup = setlinksclickable;
    }

    public static /* synthetic */ void ThreeDS2Service(C9256au c9256au, String str) {
        getWarnings = (ThreeDS2Service$InitializationCallback + 97) % 128;
        c9256au.ThreeDS2ServiceInstance(str);
        ThreeDS2Service$InitializationCallback = (getWarnings + 69) % 128;
    }

    public static C9256au ThreeDS2ServiceInstance(Context context, setLinksClickable setlinksclickable, valueOf valueof) {
        C9256au c9256au = new C9256au(context, new Handler(Looper.getMainLooper()), setlinksclickable, valueof);
        int i = getWarnings + 13;
        ThreeDS2Service$InitializationCallback = i % 128;
        if (i % 2 != 0) {
            return c9256au;
        }
        throw null;
    }

    public static /* synthetic */ void get(C9256au c9256au, String str) {
        int i = ThreeDS2Service$InitializationCallback + 9;
        getWarnings = i % 128;
        int i2 = i % 2;
        c9256au.get(str);
        if (i2 != 0) {
            int i3 = 56 / 0;
        }
        getWarnings = (ThreeDS2Service$InitializationCallback + 115) % 128;
    }

    public static void valueOf() {
        initialize = new char[]{'6', 'r', 'x', 'v', AbstractJsonLexerKt.UNICODE_ESC, Matrix.MATRIX_TYPE_ZERO, '8', '3', 'N', 'm', AbstractJsonLexerKt.UNICODE_ESC, 'X', 'O', 'o', Matrix.MATRIX_TYPE_RANDOM_UT, 'S', 's', 'n', 'm', 'b', 'c', 'l', Matrix.MATRIX_TYPE_RANDOM_UT, '\\', 't'};
    }

    public static /* synthetic */ void values(C9256au c9256au, String str) {
        int i = getWarnings + 31;
        ThreeDS2Service$InitializationCallback = i % 128;
        int i2 = i % 2;
        c9256au.ThreeDS2Service(str);
        if (i2 == 0) {
            throw null;
        }
        ThreeDS2Service$InitializationCallback = (getWarnings + 13) % 128;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.AbstractC9760y, android.webkit.WebViewClient
    public /* bridge */ /* synthetic */ WebResourceResponse shouldInterceptRequest(WebView webView, WebResourceRequest webResourceRequest) {
        int i = getWarnings + 83;
        ThreeDS2Service$InitializationCallback = i % 128;
        int i2 = i % 2;
        WebResourceResponse shouldInterceptRequest = super.shouldInterceptRequest(webView, webResourceRequest);
        if (i2 == 0) {
            int i3 = 56 / 0;
        }
        return shouldInterceptRequest;
    }

    private /* synthetic */ void get(String str) {
        ThreeDS2Service(new RunnableC9254as(this, str));
        int i = ThreeDS2Service$InitializationCallback + 53;
        getWarnings = i % 128;
        if (i % 2 != 0) {
            throw null;
        }
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.AbstractC9760y
    public void ThreeDS2Service(Uri uri) {
        getWarnings = (ThreeDS2Service$InitializationCallback + 97) % 128;
        String uri2 = uri.toString();
        Object[] objArr = new Object[1];
        get("\u0000\u0000\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0001\u0001\u0001\u0000", new int[]{0, 25, 4, 0}, false, objArr);
        if (C9669om.getWarnings(uri2, ((String) objArr[0]).intern())) {
            String str = (String) C9669om.cleanup(uri.getQuery(), "");
            ThreeDS2Service(new RunnableC9258aw(this, str));
            this.cleanup.values(this.getSDKVersion, new C9255at(this, str));
            ThreeDS2Service$InitializationCallback = (getWarnings + 65) % 128;
        }
    }

    private /* synthetic */ void ThreeDS2ServiceInstance(String str) {
        int i = getWarnings + 67;
        ThreeDS2Service$InitializationCallback = i % 128;
        if (i % 2 == 0) {
            ThreeDS2ServiceInstance().ThreeDS2Service(str);
            throw null;
        }
        ThreeDS2ServiceInstance().ThreeDS2Service(str);
        int i2 = ThreeDS2Service$InitializationCallback + CameraActivity.REQUEST_CODE;
        getWarnings = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:0:?, code lost:
        r12 = r12;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void get(java.lang.String r12, int[] r13, boolean r14, java.lang.Object[] r15) {
        /*
            if (r12 == 0) goto L8
            java.lang.String r0 = "ISO-8859-1"
            byte[] r12 = r12.getBytes(r0)
        L8:
            byte[] r12 = (byte[]) r12
            java.lang.Object r0 = com.netcetera.threeds.sdk.infrastructure.ConfigurationBuilder.values
            monitor-enter(r0)
            r1 = 0
            r2 = r13[r1]     // Catch: java.lang.Throwable -> L38
            r3 = 1
            r4 = r13[r3]     // Catch: java.lang.Throwable -> L38
            r5 = 2
            r6 = r13[r5]     // Catch: java.lang.Throwable -> L38
            r7 = 3
            r7 = r13[r7]     // Catch: java.lang.Throwable -> L38
            char[] r8 = com.netcetera.threeds.sdk.infrastructure.C9256au.initialize     // Catch: java.lang.Throwable -> L38
            char[] r9 = new char[r4]     // Catch: java.lang.Throwable -> L38
            java.lang.System.arraycopy(r8, r2, r9, r1, r4)     // Catch: java.lang.Throwable -> L38
            if (r12 == 0) goto L49
            char[] r2 = new char[r4]     // Catch: java.lang.Throwable -> L38
            com.netcetera.threeds.sdk.infrastructure.ConfigurationBuilder.ThreeDS2Service = r1     // Catch: java.lang.Throwable -> L38
            r8 = 0
        L27:
            int r10 = com.netcetera.threeds.sdk.infrastructure.ConfigurationBuilder.ThreeDS2Service     // Catch: java.lang.Throwable -> L38
            if (r10 >= r4) goto L48
            r11 = r12[r10]     // Catch: java.lang.Throwable -> L38
            if (r11 != r3) goto L3a
            char r11 = r9[r10]     // Catch: java.lang.Throwable -> L38
            int r11 = r11 << r3
            int r11 = r11 + r3
            int r11 = r11 - r8
            char r8 = (char) r11     // Catch: java.lang.Throwable -> L38
            r2[r10] = r8     // Catch: java.lang.Throwable -> L38
            goto L41
        L38:
            r12 = move-exception
            goto L8d
        L3a:
            char r11 = r9[r10]     // Catch: java.lang.Throwable -> L38
            int r11 = r11 << r3
            int r11 = r11 - r8
            char r8 = (char) r11     // Catch: java.lang.Throwable -> L38
            r2[r10] = r8     // Catch: java.lang.Throwable -> L38
        L41:
            char r8 = r2[r10]     // Catch: java.lang.Throwable -> L38
            int r10 = r10 + 1
            com.netcetera.threeds.sdk.infrastructure.ConfigurationBuilder.ThreeDS2Service = r10     // Catch: java.lang.Throwable -> L38
            goto L27
        L48:
            r9 = r2
        L49:
            if (r7 <= 0) goto L58
            char[] r12 = new char[r4]     // Catch: java.lang.Throwable -> L38
            java.lang.System.arraycopy(r9, r1, r12, r1, r4)     // Catch: java.lang.Throwable -> L38
            int r2 = r4 - r7
            java.lang.System.arraycopy(r12, r1, r9, r2, r7)     // Catch: java.lang.Throwable -> L38
            java.lang.System.arraycopy(r12, r7, r9, r1, r2)     // Catch: java.lang.Throwable -> L38
        L58:
            if (r14 == 0) goto L6f
            char[] r12 = new char[r4]     // Catch: java.lang.Throwable -> L38
            com.netcetera.threeds.sdk.infrastructure.ConfigurationBuilder.ThreeDS2Service = r1     // Catch: java.lang.Throwable -> L38
        L5e:
            int r14 = com.netcetera.threeds.sdk.infrastructure.ConfigurationBuilder.ThreeDS2Service     // Catch: java.lang.Throwable -> L38
            if (r14 >= r4) goto L6e
            int r2 = r4 - r14
            int r2 = r2 - r3
            char r2 = r9[r2]     // Catch: java.lang.Throwable -> L38
            r12[r14] = r2     // Catch: java.lang.Throwable -> L38
            int r14 = r14 + 1
            com.netcetera.threeds.sdk.infrastructure.ConfigurationBuilder.ThreeDS2Service = r14     // Catch: java.lang.Throwable -> L38
            goto L5e
        L6e:
            r9 = r12
        L6f:
            if (r6 <= 0) goto L84
            com.netcetera.threeds.sdk.infrastructure.ConfigurationBuilder.ThreeDS2Service = r1     // Catch: java.lang.Throwable -> L38
        L73:
            int r12 = com.netcetera.threeds.sdk.infrastructure.ConfigurationBuilder.ThreeDS2Service     // Catch: java.lang.Throwable -> L38
            if (r12 >= r4) goto L84
            char r14 = r9[r12]     // Catch: java.lang.Throwable -> L38
            r2 = r13[r5]     // Catch: java.lang.Throwable -> L38
            int r14 = r14 - r2
            char r14 = (char) r14     // Catch: java.lang.Throwable -> L38
            r9[r12] = r14     // Catch: java.lang.Throwable -> L38
            int r12 = r12 + 1
            com.netcetera.threeds.sdk.infrastructure.ConfigurationBuilder.ThreeDS2Service = r12     // Catch: java.lang.Throwable -> L38
            goto L73
        L84:
            java.lang.String r12 = new java.lang.String     // Catch: java.lang.Throwable -> L38
            r12.<init>(r9)     // Catch: java.lang.Throwable -> L38
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L38
            r15[r1] = r12
            return
        L8d:
            monitor-exit(r0)
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.netcetera.threeds.sdk.infrastructure.C9256au.get(java.lang.String, int[], boolean, java.lang.Object[]):void");
    }

    private valueOf ThreeDS2ServiceInstance() {
        int i = ThreeDS2Service$InitializationCallback + 109;
        getWarnings = i % 128;
        if (i % 2 == 0) {
            AbstractC9760y.values valuesVar = get();
            if (!(!(valuesVar instanceof valueOf))) {
                ThreeDS2Service$InitializationCallback = (getWarnings + 121) % 128;
                return (valueOf) valuesVar;
            }
            throw setForegroundGravity.getId.valueOf(new Object[0]);
        }
        boolean z = get() instanceof valueOf;
        throw null;
    }

    private /* synthetic */ void ThreeDS2Service(String str) {
        int i = ThreeDS2Service$InitializationCallback + 117;
        getWarnings = i % 128;
        if (i % 2 == 0) {
            ThreeDS2ServiceInstance().valueOf(str);
        } else {
            ThreeDS2ServiceInstance().valueOf(str);
            throw null;
        }
    }
}
