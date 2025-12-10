package com.mixpanel.android.util;

import android.annotation.SuppressLint;
import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;

/* loaded from: classes5.dex */
public class HttpService implements RemoteService {

    /* renamed from: a */
    public static boolean f58751a;

    /* renamed from: com.mixpanel.android.util.HttpService$a */
    /* loaded from: classes5.dex */
    public class RunnableC9201a implements Runnable {
        public RunnableC9201a() {
        }

        /* JADX WARN: Removed duplicated region for block: B:15:0x0031 A[Catch: Exception -> 0x0038, TRY_LEAVE, TryCatch #0 {Exception -> 0x0038, blocks: (B:2:0x0000, B:4:0x0012, B:6:0x0018, B:8:0x001e, B:13:0x0028, B:15:0x0031), top: B:18:0x0000 }] */
        /* JADX WARN: Removed duplicated region for block: B:20:? A[RETURN, SYNTHETIC] */
        @Override // java.lang.Runnable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public void run() {
            /*
                r3 = this;
                java.lang.String r0 = "api.mixpanel.com"
                java.net.InetAddress r0 = java.net.InetAddress.getByName(r0)     // Catch: java.lang.Exception -> L38
                java.lang.String r1 = "decide.mixpanel.com"
                java.net.InetAddress r1 = java.net.InetAddress.getByName(r1)     // Catch: java.lang.Exception -> L38
                boolean r2 = r0.isLoopbackAddress()     // Catch: java.lang.Exception -> L38
                if (r2 != 0) goto L27
                boolean r0 = r0.isAnyLocalAddress()     // Catch: java.lang.Exception -> L38
                if (r0 != 0) goto L27
                boolean r0 = r1.isLoopbackAddress()     // Catch: java.lang.Exception -> L38
                if (r0 != 0) goto L27
                boolean r0 = r1.isAnyLocalAddress()     // Catch: java.lang.Exception -> L38
                if (r0 == 0) goto L25
                goto L27
            L25:
                r0 = 0
                goto L28
            L27:
                r0 = 1
            L28:
                com.mixpanel.android.util.HttpService.m33467b(r0)     // Catch: java.lang.Exception -> L38
                boolean r0 = com.mixpanel.android.util.HttpService.m33468a()     // Catch: java.lang.Exception -> L38
                if (r0 == 0) goto L38
                java.lang.String r0 = "MixpanelAPI.Message"
                java.lang.String r1 = "AdBlocker is enabled. Won't be able to use Mixpanel services."
                com.mixpanel.android.util.MPLog.m33453v(r0, r1)     // Catch: java.lang.Exception -> L38
            L38:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.mixpanel.android.util.HttpService.RunnableC9201a.run():void");
        }
    }

    /* renamed from: d */
    public static byte[] m33465d(InputStream inputStream) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[8192];
        while (true) {
            int read = inputStream.read(bArr, 0, 8192);
            if (read != -1) {
                byteArrayOutputStream.write(bArr, 0, read);
            } else {
                byteArrayOutputStream.flush();
                return byteArrayOutputStream.toByteArray();
            }
        }
    }

    /* renamed from: c */
    public final boolean m33466c(OfflineMode offlineMode) {
        if (offlineMode == null) {
            return false;
        }
        try {
            if (!offlineMode.isOffline()) {
                return false;
            }
            return true;
        } catch (Exception e) {
            MPLog.m33452v("MixpanelAPI.Message", "Client State should not throw exception, will assume is not on offline mode", e);
            return false;
        }
    }

    @Override // com.mixpanel.android.util.RemoteService
    public void checkIsMixpanelBlocked() {
        new Thread(new RunnableC9201a()).start();
    }

    @Override // com.mixpanel.android.util.RemoteService
    @SuppressLint({"MissingPermission"})
    public boolean isOnline(Context context, OfflineMode offlineMode) {
        String str;
        if (f58751a || m33466c(offlineMode)) {
            return false;
        }
        boolean z = true;
        try {
            NetworkInfo activeNetworkInfo = ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo();
            if (activeNetworkInfo == null) {
                MPLog.m33453v("MixpanelAPI.Message", "A default network has not been set so we cannot be certain whether we are offline");
            } else {
                boolean isConnectedOrConnecting = activeNetworkInfo.isConnectedOrConnecting();
                StringBuilder sb = new StringBuilder();
                sb.append("ConnectivityManager says we ");
                if (isConnectedOrConnecting) {
                    str = "are";
                } else {
                    str = "are not";
                }
                sb.append(str);
                sb.append(" online");
                MPLog.m33453v("MixpanelAPI.Message", sb.toString());
                z = isConnectedOrConnecting;
            }
        } catch (SecurityException unused) {
            MPLog.m33453v("MixpanelAPI.Message", "Don't have permission to check connectivity, will assume we are online");
        }
        return z;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:101:0x012e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:103:0x014c A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0127 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0145 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0120 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:112:0x013e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0135 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:131:0x001a A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00fd A[Catch: all -> 0x0113, TryCatch #12 {all -> 0x0113, blocks: (B:56:0x00f5, B:58:0x00fd, B:60:0x0105, B:61:0x0112, B:64:0x0116), top: B:109:0x00f5 }] */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0153  */
    /* JADX WARN: Type inference failed for: r9v0 */
    /* JADX WARN: Type inference failed for: r9v10, types: [java.io.OutputStream, java.io.BufferedOutputStream] */
    /* JADX WARN: Type inference failed for: r9v15 */
    /* JADX WARN: Type inference failed for: r9v17 */
    /* JADX WARN: Type inference failed for: r9v2 */
    /* JADX WARN: Type inference failed for: r9v3 */
    /* JADX WARN: Type inference failed for: r9v4, types: [java.io.OutputStream] */
    /* JADX WARN: Type inference failed for: r9v9 */
    @Override // com.mixpanel.android.util.RemoteService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public byte[] performRequest(java.lang.String r12, java.util.Map<java.lang.String, java.lang.Object> r13, javax.net.ssl.SSLSocketFactory r14) throws com.mixpanel.android.util.RemoteService.ServiceUnavailableException, java.io.IOException {
        /*
            Method dump skipped, instructions count: 351
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mixpanel.android.util.HttpService.performRequest(java.lang.String, java.util.Map, javax.net.ssl.SSLSocketFactory):byte[]");
    }
}
