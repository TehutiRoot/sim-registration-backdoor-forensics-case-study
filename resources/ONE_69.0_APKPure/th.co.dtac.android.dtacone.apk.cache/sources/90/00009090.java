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
    public static final zzhh f46021f = new zzht();

    /* renamed from: g */
    public static final zzhx f46022g = zzig.zzhz();

    /* renamed from: h */
    public static final GmsLogger f46023h = new GmsLogger("ImageAnnotatorTask", "");

    /* renamed from: i */
    public static final Map f46024i = new HashMap();

    /* renamed from: a */
    public String f46025a;

    /* renamed from: b */
    public final boolean f46026b;

    /* renamed from: c */
    public final GoogleApiClient f46027c;

    /* renamed from: d */
    public final zzkj f46028d;

    /* renamed from: e */
    public final String f46029e;

    public zzsb(FirebaseApp firebaseApp, boolean z, GoogleApiClient googleApiClient) {
        this.f46026b = z;
        if (z) {
            this.f46027c = googleApiClient;
            this.f46028d = new C22326tK2(this);
        } else {
            this.f46027c = null;
            this.f46028d = new C22153sK2(this, m47496d(firebaseApp), firebaseApp);
        }
        this.f46029e = String.format("FirebaseML_%s", firebaseApp.getName());
    }

    /* renamed from: c */
    public static String m47497c(Context context, String str) {
        String str2;
        String str3;
        try {
            byte[] packageCertificateHashBytes = AndroidUtilsLight.getPackageCertificateHashBytes(context, str);
            if (packageCertificateHashBytes == null) {
                GmsLogger gmsLogger = f46023h;
                String valueOf = String.valueOf(str);
                if (valueOf.length() != 0) {
                    str3 = "Could not get fingerprint hash: ".concat(valueOf);
                } else {
                    str3 = new String("Could not get fingerprint hash: ");
                }
                gmsLogger.m48403e("ImageAnnotatorTask", str3);
                return null;
            }
            return Hex.bytesToStringUppercase(packageCertificateHashBytes, false);
        } catch (PackageManager.NameNotFoundException e) {
            GmsLogger gmsLogger2 = f46023h;
            String valueOf2 = String.valueOf(str);
            if (valueOf2.length() != 0) {
                str2 = "No such package: ".concat(valueOf2);
            } else {
                str2 = new String("No such package: ");
            }
            gmsLogger2.m48402e("ImageAnnotatorTask", str2, e);
            return null;
        }
    }

    /* renamed from: d */
    public static String m47496d(FirebaseApp firebaseApp) {
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
            GmsLogger gmsLogger = f46023h;
            String valueOf = String.valueOf(applicationContext.getPackageName());
            if (valueOf.length() != 0) {
                str = "No such package: ".concat(valueOf);
            } else {
                str = new String("No such package: ");
            }
            gmsLogger.m48402e("ImageAnnotatorTask", str, e);
            return apiKey;
        }
    }

    public static synchronized zzsb zza(@NonNull FirebaseApp firebaseApp, boolean z, @Nullable GoogleApiClient googleApiClient) {
        zzsb zzsbVar;
        synchronized (zzsb.class) {
            Map map = f46024i;
            zzsbVar = (zzsb) map.get(firebaseApp);
            if (zzsbVar == null) {
                zzsbVar = new zzsb(firebaseApp, z, googleApiClient);
                map.put(firebaseApp, zzsbVar);
            }
        }
        return zzsbVar;
    }

    /* renamed from: a */
    public final String m47499a() {
        if (!this.f46027c.isConnected()) {
            this.f46027c.blockingConnect(3L, TimeUnit.SECONDS);
        }
        try {
            return AuthProxy.ProxyApi.getSpatulaHeader(this.f46027c).await(3L, TimeUnit.SECONDS).getSpatulaHeader();
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
            zzkc zzin = ((zzkf) new zzkf(f46021f, f46022g, new C22499uK2(this)).zzm(this.f46029e)).zza(this.f46028d).zzin();
            if (this.f46026b) {
                String m47499a = m47499a();
                this.f46025a = m47499a;
                if (TextUtils.isEmpty(m47499a)) {
                    f46023h.m48403e("ImageAnnotatorTask", "Failed to contact Google Play services for certificate fingerprint matching. Please ensure you have latest Google Play services installed");
                    throw new FirebaseMLException("Failed to contact Google Play services for certificate fingerprint matching. Please ensure you have latest Google Play services installed", 14);
                }
            }
            List<zzkl> zzit = new zzke(zzin).zza(zzc).zzfs().zzit();
            if (zzit != null && !zzit.isEmpty()) {
                return zzit.get(0);
            }
            throw new FirebaseMLException("Empty response from cloud vision api.", 13);
        } catch (zzgf e) {
            GmsLogger gmsLogger = f46023h;
            String valueOf = String.valueOf(e.zzfp());
            StringBuilder sb = new StringBuilder(valueOf.length() + 44);
            sb.append("batchAnnotateImages call failed with error: ");
            sb.append(valueOf);
            gmsLogger.m48403e("ImageAnnotatorTask", sb.toString());
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
            f46023h.m48402e("ImageAnnotatorTask", "batchAnnotateImages call failed with exception: ", e2);
            throw new FirebaseMLException("Cloud Vision batchAnnotateImages call failure", 13, e2);
        }
    }
}