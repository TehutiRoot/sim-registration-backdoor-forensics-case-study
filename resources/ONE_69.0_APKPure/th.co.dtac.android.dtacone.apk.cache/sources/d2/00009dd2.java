package com.google.android.gms.measurement.internal;

import com.google.android.gms.common.internal.Preconditions;
import java.net.URL;
import java.util.Map;

/* renamed from: com.google.android.gms.measurement.internal.B */
/* loaded from: classes3.dex */
public final class RunnableC6683B implements Runnable {

    /* renamed from: a */
    public final URL f48073a;

    /* renamed from: b */
    public final String f48074b;

    /* renamed from: c */
    public final /* synthetic */ zzih f48075c;

    /* renamed from: d */
    public final zzfw f48076d;

    public RunnableC6683B(zzih zzihVar, String str, URL url, byte[] bArr, Map map, zzfw zzfwVar, byte[] bArr2) {
        this.f48075c = zzihVar;
        Preconditions.checkNotEmpty(str);
        Preconditions.checkNotNull(url);
        Preconditions.checkNotNull(zzfwVar);
        this.f48073a = url;
        this.f48076d = zzfwVar;
        this.f48074b = str;
    }

    /* renamed from: a */
    public final /* synthetic */ void m46365a(int i, Exception exc, byte[] bArr, Map map) {
        zzfw zzfwVar = this.f48076d;
        zzfwVar.zza.m46261c(this.f48074b, i, exc, bArr, map);
    }

    /* renamed from: b */
    public final void m46364b(final int i, final Exception exc, final byte[] bArr, final Map map) {
        this.f48075c.zzs.zzaz().zzp(new Runnable() { // from class: com.google.android.gms.measurement.internal.zzif
            @Override // java.lang.Runnable
            public final void run() {
                RunnableC6683B.this.m46365a(i, exc, bArr, map);
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x009d  */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v12 */
    /* JADX WARN: Type inference failed for: r4v14 */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v4, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r4v5, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r4v9 */
    /* JADX WARN: Type inference failed for: r9v0, types: [com.google.android.gms.measurement.internal.B] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void run() {
        /*
            r9 = this;
            com.google.android.gms.measurement.internal.zzih r0 = r9.f48075c
            r0.zzax()
            r0 = 0
            r1 = 0
            com.google.android.gms.measurement.internal.zzih r2 = r9.f48075c     // Catch: java.lang.Throwable -> L80 java.io.IOException -> L82
            java.net.URL r3 = r9.f48073a     // Catch: java.lang.Throwable -> L80 java.io.IOException -> L82
            java.net.URLConnection r3 = r3.openConnection()     // Catch: java.lang.Throwable -> L80 java.io.IOException -> L82
            boolean r4 = r3 instanceof java.net.HttpURLConnection     // Catch: java.lang.Throwable -> L80 java.io.IOException -> L82
            if (r4 == 0) goto L84
            java.net.HttpURLConnection r3 = (java.net.HttpURLConnection) r3     // Catch: java.lang.Throwable -> L80 java.io.IOException -> L82
            r3.setDefaultUseCaches(r0)     // Catch: java.lang.Throwable -> L80 java.io.IOException -> L82
            com.google.android.gms.measurement.internal.zzfy r4 = r2.zzs     // Catch: java.lang.Throwable -> L80 java.io.IOException -> L82
            r4.zzf()     // Catch: java.lang.Throwable -> L80 java.io.IOException -> L82
            r4 = 60000(0xea60, float:8.4078E-41)
            r3.setConnectTimeout(r4)     // Catch: java.lang.Throwable -> L80 java.io.IOException -> L82
            com.google.android.gms.measurement.internal.zzfy r2 = r2.zzs     // Catch: java.lang.Throwable -> L80 java.io.IOException -> L82
            r2.zzf()     // Catch: java.lang.Throwable -> L80 java.io.IOException -> L82
            r2 = 61000(0xee48, float:8.5479E-41)
            r3.setReadTimeout(r2)     // Catch: java.lang.Throwable -> L80 java.io.IOException -> L82
            r3.setInstanceFollowRedirects(r0)     // Catch: java.lang.Throwable -> L80 java.io.IOException -> L82
            r2 = 1
            r3.setDoInput(r2)     // Catch: java.lang.Throwable -> L80 java.io.IOException -> L82
            int r2 = r3.getResponseCode()     // Catch: java.lang.Throwable -> L76 java.io.IOException -> L7b
            java.util.Map r4 = r3.getHeaderFields()     // Catch: java.lang.Throwable -> L70 java.io.IOException -> L73
            java.io.ByteArrayOutputStream r5 = new java.io.ByteArrayOutputStream     // Catch: java.lang.Throwable -> L68
            r5.<init>()     // Catch: java.lang.Throwable -> L68
            java.io.InputStream r6 = r3.getInputStream()     // Catch: java.lang.Throwable -> L68
            r7 = 1024(0x400, float:1.435E-42)
            byte[] r7 = new byte[r7]     // Catch: java.lang.Throwable -> L54
        L4a:
            int r8 = r6.read(r7)     // Catch: java.lang.Throwable -> L54
            if (r8 <= 0) goto L56
            r5.write(r7, r0, r8)     // Catch: java.lang.Throwable -> L54
            goto L4a
        L54:
            r0 = move-exception
            goto L6a
        L56:
            byte[] r0 = r5.toByteArray()     // Catch: java.lang.Throwable -> L54
            r6.close()     // Catch: java.lang.Throwable -> L64 java.io.IOException -> L66
            r3.disconnect()
            r9.m46364b(r2, r1, r0, r4)
            return
        L64:
            r0 = move-exception
            goto L8f
        L66:
            r0 = move-exception
            goto L9b
        L68:
            r0 = move-exception
            r6 = r1
        L6a:
            if (r6 == 0) goto L6f
            r6.close()     // Catch: java.lang.Throwable -> L64 java.io.IOException -> L66
        L6f:
            throw r0     // Catch: java.lang.Throwable -> L64 java.io.IOException -> L66
        L70:
            r0 = move-exception
            r4 = r1
            goto L8f
        L73:
            r0 = move-exception
            r4 = r1
            goto L9b
        L76:
            r2 = move-exception
            r4 = r1
        L78:
            r0 = r2
            r2 = 0
            goto L8f
        L7b:
            r2 = move-exception
            r4 = r1
        L7d:
            r0 = r2
            r2 = 0
            goto L9b
        L80:
            r2 = move-exception
            goto L8c
        L82:
            r2 = move-exception
            goto L98
        L84:
            java.io.IOException r2 = new java.io.IOException     // Catch: java.lang.Throwable -> L80 java.io.IOException -> L82
            java.lang.String r3 = "Failed to obtain HTTP connection"
            r2.<init>(r3)     // Catch: java.lang.Throwable -> L80 java.io.IOException -> L82
            throw r2     // Catch: java.lang.Throwable -> L80 java.io.IOException -> L82
        L8c:
            r3 = r1
            r4 = r3
            goto L78
        L8f:
            if (r3 == 0) goto L94
            r3.disconnect()
        L94:
            r9.m46364b(r2, r1, r1, r4)
            throw r0
        L98:
            r3 = r1
            r4 = r3
            goto L7d
        L9b:
            if (r3 == 0) goto La0
            r3.disconnect()
        La0:
            r9.m46364b(r2, r0, r1, r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.RunnableC6683B.run():void");
    }
}