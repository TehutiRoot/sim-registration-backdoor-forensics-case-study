package com.google.android.gms.internal.firebase_ml;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.WorkerThread;
import com.google.android.gms.auth.api.AuthProxy;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.internal.GmsLogger;
import com.google.android.gms.common.util.AndroidUtilsLight;
import com.google.android.gms.common.util.Hex;
import com.google.android.gms.internal.firebase_ml.zzgd;
import com.google.firebase.FirebaseApp;
import com.google.firebase.p015ml.common.FirebaseMLException;
import java.io.IOException;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import javax.annotation.concurrent.Immutable;

@Immutable
/* loaded from: classes3.dex */
public final class zzsb implements zzqc<zzkl, zzsa> {

    /* renamed from: f */
    public static final zzhh f46009f = new zzht();

    /* renamed from: g */
    public static final zzhx f46010g = zzig.zzhz();

    /* renamed from: h */
    public static final GmsLogger f46011h = new GmsLogger("ImageAnnotatorTask", "");

    /* renamed from: i */
    public static final Map f46012i = new HashMap();

    /* renamed from: a */
    public String f46013a;

    /* renamed from: b */
    public final boolean f46014b;

    /* renamed from: c */
    public final GoogleApiClient f46015c;

    /* renamed from: d */
    public final zzkj f46016d;

    /* renamed from: e */
    public final String f46017e;

    public zzsb(FirebaseApp firebaseApp, boolean z, GoogleApiClient googleApiClient) {
        this.f46014b = z;
        if (z) {
            this.f46015c = googleApiClient;
            this.f46016d = new C22774wJ2(this);
        } else {
            this.f46015c = null;
            this.f46016d = new C22602vJ2(this, m47487d(firebaseApp), firebaseApp);
        }
        this.f46017e = String.format("FirebaseML_%s", firebaseApp.getName());
    }

    /* renamed from: c */
    public static String m47488c(Context context, String str) {
        String str2;
        String str3;
        try {
            byte[] packageCertificateHashBytes = AndroidUtilsLight.getPackageCertificateHashBytes(context, str);
            if (packageCertificateHashBytes == null) {
                GmsLogger gmsLogger = f46011h;
                String valueOf = String.valueOf(str);
                if (valueOf.length() != 0) {
                    str3 = "Could not get fingerprint hash: ".concat(valueOf);
                } else {
                    str3 = new String("Could not get fingerprint hash: ");
                }
                gmsLogger.m48406e("ImageAnnotatorTask", str3);
                return null;
            }
            return Hex.bytesToStringUppercase(packageCertificateHashBytes, false);
        } catch (PackageManager.NameNotFoundException e) {
            GmsLogger gmsLogger2 = f46011h;
            String valueOf2 = String.valueOf(str);
            if (valueOf2.length() != 0) {
                str2 = "No such package: ".concat(valueOf2);
            } else {
                str2 = new String("No such package: ");
            }
            gmsLogger2.m48405e("ImageAnnotatorTask", str2, e);
            return null;
        }
    }

    /* renamed from: d */
    public static String m47487d(FirebaseApp firebaseApp) {
        String str;
        Bundle bundle;
        String apiKey = firebaseApp.getOptions().getApiKey();
        Context applicationContext = firebaseApp.getApplicationContext();
        try {
            ApplicationInfo applicationInfo = applicationContext.getPackageManager().getApplicationInfo(applicationContext.getPackageName(), 128);
            if (applicationInfo != null && (bundle = applicationInfo.metaData) != null) {
                String string = bundle.getString("com.firebase.ml.cloud.ApiKeyForDebug");
                if (!TextUtils.isEmpty(string)) {
                    return string;
                }
                return apiKey;
            }
            return apiKey;
        } catch (PackageManager.NameNotFoundException e) {
            GmsLogger gmsLogger = f46011h;
            String valueOf = String.valueOf(applicationContext.getPackageName());
            if (valueOf.length() != 0) {
                str = "No such package: ".concat(valueOf);
            } else {
                str = new String("No such package: ");
            }
            gmsLogger.m48405e("ImageAnnotatorTask", str, e);
            return apiKey;
        }
    }

    public static synchronized zzsb zza(@NonNull FirebaseApp firebaseApp, boolean z, @Nullable GoogleApiClient googleApiClient) {
        zzsb zzsbVar;
        synchronized (zzsb.class) {
            Map map = f46012i;
            zzsbVar = (zzsb) map.get(firebaseApp);
            if (zzsbVar == null) {
                zzsbVar = new zzsb(firebaseApp, z, googleApiClient);
                map.put(firebaseApp, zzsbVar);
            }
        }
        return zzsbVar;
    }

    /* renamed from: a */
    public final String m47490a() {
        if (!this.f46015c.isConnected()) {
            this.f46015c.blockingConnect(3L, TimeUnit.SECONDS);
        }
        try {
            return AuthProxy.ProxyApi.getSpatulaHeader(this.f46015c).await(3L, TimeUnit.SECONDS).getSpatulaHeader();
        } catch (SecurityException unused) {
            return null;
        }
    }

    @Override // com.google.android.gms.internal.firebase_ml.zzqc
    public final zzqx zzon() {
        return null;
    }

    @Override // com.google.android.gms.internal.firebase_ml.zzqc
    @WorkerThread
    public final zzkl zza(zzsa zzsaVar) throws FirebaseMLException {
        zzkk zzc = new zzkk().zzc(Collections.singletonList(new zzki().zzb(zzsaVar.features).zza(new zzkx().zze(zzsaVar.zzbtw)).zza(zzsaVar.imageContext)));
        int i = 14;
        try {
            zzkc zzin = ((zzkf) new zzkf(f46009f, f46010g, new C22946xJ2(this)).zzm(this.f46017e)).zza(this.f46016d).zzin();
            if (this.f46014b) {
                String m47490a = m47490a();
                this.f46013a = m47490a;
                if (TextUtils.isEmpty(m47490a)) {
                    f46011h.m48406e("ImageAnnotatorTask", "Failed to contact Google Play services for certificate fingerprint matching. Please ensure you have latest Google Play services installed");
                    throw new FirebaseMLException("Failed to contact Google Play services for certificate fingerprint matching. Please ensure you have latest Google Play services installed", 14);
                }
            }
            List<zzkl> zzit = new zzke(zzin).zza(zzc).zzfs().zzit();
            if (zzit != null && !zzit.isEmpty()) {
                return zzit.get(0);
            }
            throw new FirebaseMLException("Empty response from cloud vision api.", 13);
        } catch (zzgf e) {
            GmsLogger gmsLogger = f46011h;
            String valueOf = String.valueOf(e.zzfp());
            StringBuilder sb = new StringBuilder(valueOf.length() + 44);
            sb.append("batchAnnotateImages call failed with error: ");
            sb.append(valueOf);
            gmsLogger.m48406e("ImageAnnotatorTask", sb.toString());
            String message = e.getMessage();
            if (e.getStatusCode() != 400) {
                if (e.zzfp() != null && e.zzfp().zzfk() != null) {
                    i = 13;
                    for (zzgd.zza zzaVar : e.zzfp().zzfk()) {
                        String reason = zzaVar.getReason();
                        if (reason != null) {
                            if (reason.equals("rateLimitExceeded") || reason.equals("dailyLimitExceeded") || reason.equals("userRateLimitExceeded")) {
                                i = 8;
                                continue;
                            } else {
                                if (!reason.equals("accessNotConfigured")) {
                                    if (reason.equals("forbidden") || reason.equals("inactiveBillingState")) {
                                        message = String.format("If you haven't set up billing, please go to Firebase console to set up billing: %s. If you are specifying a debug Api Key override and turned on Api Key restrictions, make sure the restrictions are set up correctly", "https://console.firebase.google.com/u/0/project/_/overview?purchaseBillingPlan=true");
                                    }
                                }
                                i = 7;
                                continue;
                            }
                        }
                        if (i != 13) {
                            break;
                        }
                    }
                } else {
                    i = 13;
                }
            }
            throw new FirebaseMLException(message, i);
        } catch (IOException e2) {
            f46011h.m48405e("ImageAnnotatorTask", "batchAnnotateImages call failed with exception: ", e2);
            throw new FirebaseMLException("Cloud Vision batchAnnotateImages call failure", 13, e2);
        }
    }
}
