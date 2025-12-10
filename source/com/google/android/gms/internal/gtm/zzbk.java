package com.google.android.gms.internal.gtm;

import android.text.TextUtils;
import androidx.annotation.VisibleForTesting;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import java.io.FileOutputStream;
import java.io.IOException;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.util.Locale;
import org.apache.commons.codec.digest.MessageDigestAlgorithms;

@VisibleForTesting
/* loaded from: classes3.dex */
public final class zzbk extends zzbu {
    public static boolean zza;
    private AdvertisingIdClient.Info zzb;
    private final zzfq zzc;
    private String zzd;
    private boolean zze;
    private final Object zzf;

    public zzbk(zzbx zzbxVar) {
        super(zzbxVar);
        this.zze = false;
        this.zzf = new Object();
        this.zzc = new zzfq(zzbxVar.zzr());
    }

    /* JADX WARN: Code restructure failed: missing block: B:70:0x013f, code lost:
        if (r0 == false) goto L30;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0038 A[Catch: all -> 0x001b, TryCatch #5 {, blocks: (B:3:0x0001, B:5:0x000b, B:7:0x0012, B:17:0x0032, B:21:0x003c, B:71:0x0141, B:24:0x0044, B:25:0x004e, B:72:0x0144, B:20:0x0038, B:12:0x001f, B:14:0x0023, B:16:0x002c, B:76:0x0155, B:26:0x004f, B:29:0x0054, B:31:0x006c, B:37:0x0085, B:38:0x008e, B:39:0x0093, B:45:0x009d, B:47:0x00b1, B:53:0x00c2, B:54:0x00d5, B:56:0x00d7, B:51:0x00bc, B:57:0x00ec, B:59:0x0105, B:61:0x0107, B:63:0x010f, B:65:0x0111, B:67:0x0119, B:68:0x012b, B:69:0x013e, B:46:0x00ac), top: B:88:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0044 A[Catch: all -> 0x001b, TryCatch #5 {, blocks: (B:3:0x0001, B:5:0x000b, B:7:0x0012, B:17:0x0032, B:21:0x003c, B:71:0x0141, B:24:0x0044, B:25:0x004e, B:72:0x0144, B:20:0x0038, B:12:0x001f, B:14:0x0023, B:16:0x002c, B:76:0x0155, B:26:0x004f, B:29:0x0054, B:31:0x006c, B:37:0x0085, B:38:0x008e, B:39:0x0093, B:45:0x009d, B:47:0x00b1, B:53:0x00c2, B:54:0x00d5, B:56:0x00d7, B:51:0x00bc, B:57:0x00ec, B:59:0x0105, B:61:0x0107, B:63:0x010f, B:65:0x0111, B:67:0x0119, B:68:0x012b, B:69:0x013e, B:46:0x00ac), top: B:88:0x0001 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final synchronized com.google.android.gms.ads.identifier.AdvertisingIdClient.Info zzc() {
        /*
            Method dump skipped, instructions count: 347
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.gtm.zzbk.zzc():com.google.android.gms.ads.identifier.AdvertisingIdClient$Info");
    }

    private static String zze(String str) {
        MessageDigest zze = zzfu.zze(MessageDigestAlgorithms.MD5);
        if (zze == null) {
            return null;
        }
        return String.format(Locale.US, "%032X", new BigInteger(1, zze.digest(str.getBytes())));
    }

    private final boolean zzf(String str) {
        try {
            String zze = zze(str);
            zzN("Storing hashed adid.");
            FileOutputStream openFileOutput = zzo().openFileOutput("gaClientIdData", 0);
            openFileOutput.write(zze.getBytes());
            openFileOutput.close();
            this.zzd = zze;
            return true;
        } catch (IOException e) {
            zzJ("Error creating hash file", e);
            return false;
        }
    }

    public final String zza() {
        String str;
        zzV();
        AdvertisingIdClient.Info zzc = zzc();
        if (zzc != null) {
            str = zzc.getId();
        } else {
            str = null;
        }
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return str;
    }

    public final boolean zzb() {
        zzV();
        AdvertisingIdClient.Info zzc = zzc();
        if (zzc == null || zzc.isLimitAdTrackingEnabled()) {
            return false;
        }
        return true;
    }

    @Override // com.google.android.gms.internal.gtm.zzbu
    public final void zzd() {
    }
}
