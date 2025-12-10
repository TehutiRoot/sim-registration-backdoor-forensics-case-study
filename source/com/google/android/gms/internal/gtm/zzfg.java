package com.google.android.gms.internal.gtm;

import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import androidx.annotation.VisibleForTesting;
import ch.qos.logback.classic.spi.CallerData;
import com.google.android.gms.common.internal.Preconditions;
import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.net.URLEncoder;
import java.util.Locale;
import java.util.Map;
import kotlin.text.Typography;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class zzfg extends zzbu {
    private static final byte[] zza = "\n".getBytes();
    private final String zzb;
    private final zzfq zzc;

    public zzfg(zzbx zzbxVar) {
        super(zzbxVar);
        this.zzb = String.format("%s/%s (Linux; U; Android %s; %s; %s Build/%s)", "GoogleAnalytics", zzbv.zza, Build.VERSION.RELEASE, zzfu.zzd(Locale.getDefault()), Build.MODEL, Build.ID);
        this.zzc = new zzfq(zzbxVar.zzr());
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0083 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final int zzg(java.net.URL r4, byte[] r5, int r6) {
        /*
            r3 = this;
            java.lang.String r6 = "Error closing http post connection output stream"
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r4)
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r5)
            int r0 = r5.length
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            java.lang.String r2 = "POST bytes, url"
            r3.zzG(r2, r1, r4)
            boolean r1 = com.google.android.gms.internal.gtm.zzbt.zzU()
            if (r1 == 0) goto L22
            java.lang.String r1 = new java.lang.String
            r1.<init>(r5)
            java.lang.String r2 = "Post payload\n"
            r3.zzO(r2, r1)
        L22:
            r1 = 0
            java.net.HttpURLConnection r4 = r3.zzb(r4)     // Catch: java.lang.Throwable -> L66 java.io.IOException -> L69
            r2 = 1
            r4.setDoOutput(r2)     // Catch: java.lang.Throwable -> L4d java.io.IOException -> L4f
            r4.setFixedLengthStreamingMode(r0)     // Catch: java.lang.Throwable -> L4d java.io.IOException -> L4f
            r4.connect()     // Catch: java.lang.Throwable -> L4d java.io.IOException -> L4f
            java.io.OutputStream r1 = r4.getOutputStream()     // Catch: java.lang.Throwable -> L4d java.io.IOException -> L4f
            r1.write(r5)     // Catch: java.lang.Throwable -> L4d java.io.IOException -> L4f
            r3.zzk(r4)     // Catch: java.lang.Throwable -> L4d java.io.IOException -> L4f
            int r5 = r4.getResponseCode()     // Catch: java.lang.Throwable -> L4d java.io.IOException -> L4f
            r0 = 200(0xc8, float:2.8E-43)
            if (r5 != r0) goto L51
            com.google.android.gms.internal.gtm.zzbs r5 = r3.zzs()     // Catch: java.lang.Throwable -> L4d java.io.IOException -> L4f
            r5.zzi()     // Catch: java.lang.Throwable -> L4d java.io.IOException -> L4f
            r5 = 200(0xc8, float:2.8E-43)
            goto L51
        L4d:
            r5 = move-exception
            goto L81
        L4f:
            r5 = move-exception
            goto L6b
        L51:
            java.lang.String r0 = "POST status"
            java.lang.Integer r2 = java.lang.Integer.valueOf(r5)     // Catch: java.lang.Throwable -> L4d java.io.IOException -> L4f
            r3.zzF(r0, r2)     // Catch: java.lang.Throwable -> L4d java.io.IOException -> L4f
            r1.close()     // Catch: java.io.IOException -> L5e
            goto L62
        L5e:
            r0 = move-exception
            r3.zzJ(r6, r0)
        L62:
            r4.disconnect()
            return r5
        L66:
            r5 = move-exception
            r4 = r1
            goto L81
        L69:
            r5 = move-exception
            r4 = r1
        L6b:
            java.lang.String r0 = "Network POST connection error"
            r3.zzR(r0, r5)     // Catch: java.lang.Throwable -> L4d
            if (r1 == 0) goto L7a
            r1.close()     // Catch: java.io.IOException -> L76
            goto L7a
        L76:
            r5 = move-exception
            r3.zzJ(r6, r5)
        L7a:
            if (r4 == 0) goto L7f
            r4.disconnect()
        L7f:
            r4 = 0
            return r4
        L81:
            if (r1 == 0) goto L8b
            r1.close()     // Catch: java.io.IOException -> L87
            goto L8b
        L87:
            r0 = move-exception
            r3.zzJ(r6, r0)
        L8b:
            if (r4 == 0) goto L90
            r4.disconnect()
        L90:
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.gtm.zzfg.zzg(java.net.URL, byte[], int):int");
    }

    private final URL zzh() {
        zzw();
        String zzi = zzcv.zzi();
        zzw();
        try {
            return new URL(zzi.concat((String) zzew.zzt.zzb()));
        } catch (MalformedURLException e) {
            zzJ("Error trying to parse the hardcoded host url", e);
            return null;
        }
    }

    private final URL zzi(zzez zzezVar) {
        String concat;
        if (zzezVar.zzh()) {
            zzw();
            String zzi = zzcv.zzi();
            zzw();
            concat = zzi.concat(zzcv.zzj());
        } else {
            zzw();
            String zzk = zzcv.zzk();
            zzw();
            concat = zzk.concat(zzcv.zzj());
        }
        try {
            return new URL(concat);
        } catch (MalformedURLException e) {
            zzJ("Error trying to parse the hardcoded host url", e);
            return null;
        }
    }

    private final URL zzj(zzez zzezVar, String str) {
        String str2;
        if (zzezVar.zzh()) {
            zzw();
            String zzi = zzcv.zzi();
            zzw();
            str2 = zzi + zzcv.zzj() + CallerData.f39639NA + str;
        } else {
            zzw();
            String zzk = zzcv.zzk();
            zzw();
            str2 = zzk + zzcv.zzj() + CallerData.f39639NA + str;
        }
        try {
            return new URL(str2);
        } catch (MalformedURLException e) {
            zzJ("Error trying to parse the hardcoded host url", e);
            return null;
        }
    }

    private final void zzk(HttpURLConnection httpURLConnection) throws IOException {
        InputStream inputStream;
        try {
            inputStream = httpURLConnection.getInputStream();
        } catch (Throwable th2) {
            th = th2;
            inputStream = null;
        }
        try {
            do {
            } while (inputStream.read(new byte[1024]) > 0);
            try {
                inputStream.close();
            } catch (IOException e) {
                zzJ("Error closing http connection input stream", e);
            }
        } catch (Throwable th3) {
            th = th3;
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (IOException e2) {
                    zzJ("Error closing http connection input stream", e2);
                }
            }
            throw th;
        }
    }

    private static final void zzl(StringBuilder sb, String str, String str2) throws UnsupportedEncodingException {
        if (sb.length() != 0) {
            sb.append(Typography.amp);
        }
        sb.append(URLEncoder.encode(str, "UTF-8"));
        sb.append('=');
        sb.append(URLEncoder.encode(str2, "UTF-8"));
    }

    @VisibleForTesting
    public final String zza(zzez zzezVar, boolean z) {
        String valueOf;
        Preconditions.checkNotNull(zzezVar);
        StringBuilder sb = new StringBuilder();
        try {
            for (Map.Entry entry : zzezVar.zzg().entrySet()) {
                String str = (String) entry.getKey();
                if (!"ht".equals(str) && !"qt".equals(str) && !"AppUID".equals(str) && !"z".equals(str) && !"_gmsv".equals(str)) {
                    zzl(sb, str, (String) entry.getValue());
                }
            }
            zzl(sb, "ht", String.valueOf(zzezVar.zzd()));
            zzl(sb, "qt", String.valueOf(zzC().currentTimeMillis() - zzezVar.zzd()));
            zzw();
            if (z) {
                long zzc = zzezVar.zzc();
                if (zzc != 0) {
                    valueOf = String.valueOf(zzc);
                } else {
                    valueOf = String.valueOf(zzezVar.zzb());
                }
                zzl(sb, "z", valueOf);
            }
            return sb.toString();
        } catch (UnsupportedEncodingException e) {
            zzJ("Failed to encode name or value", e);
            return null;
        }
    }

    @VisibleForTesting
    public final HttpURLConnection zzb(URL url) throws IOException {
        URLConnection openConnection = url.openConnection();
        if (openConnection instanceof HttpURLConnection) {
            HttpURLConnection httpURLConnection = (HttpURLConnection) openConnection;
            httpURLConnection.setDefaultUseCaches(false);
            zzw();
            httpURLConnection.setConnectTimeout(((Integer) zzew.zzE.zzb()).intValue());
            zzw();
            httpURLConnection.setReadTimeout(((Integer) zzew.zzF.zzb()).intValue());
            httpURLConnection.setInstanceFollowRedirects(false);
            httpURLConnection.setRequestProperty("User-Agent", this.zzb);
            httpURLConnection.setDoInput(true);
            return httpURLConnection;
        }
        throw new IOException("Failed to obtain http connection");
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x01f2  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0200  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0226  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x02c8  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x01c3 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:166:0x01d9 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:186:0x032b A[EDGE_INSN: B:186:0x032b->B:159:0x032b ?: BREAK  , SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x01ce  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x01e4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.util.List zzc(java.util.List r20) {
        /*
            Method dump skipped, instructions count: 812
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.gtm.zzfg.zzc(java.util.List):java.util.List");
    }

    @Override // com.google.android.gms.internal.gtm.zzbu
    public final void zzd() {
        zzO("Network initialized. User agent", this.zzb);
    }

    public final boolean zze() {
        NetworkInfo networkInfo;
        com.google.android.gms.analytics.zzr.zzh();
        zzV();
        try {
            networkInfo = ((ConnectivityManager) zzo().getSystemService("connectivity")).getActiveNetworkInfo();
        } catch (SecurityException unused) {
            networkInfo = null;
        }
        if (networkInfo != null && networkInfo.isConnected()) {
            return true;
        }
        zzN("No network connectivity");
        return false;
    }
}
