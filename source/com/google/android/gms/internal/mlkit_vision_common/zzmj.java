package com.google.android.gms.internal.mlkit_vision_common;

import android.content.Context;
import android.content.res.Resources;
import android.os.SystemClock;
import androidx.annotation.WorkerThread;
import androidx.core.p005os.ConfigurationCompat;
import androidx.core.p005os.LocaleListCompat;
import com.google.android.gms.common.internal.LibraryVersion;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.tasks.Task;
import com.google.mlkit.common.sdkinternal.CommonUtils;
import com.google.mlkit.common.sdkinternal.MLTaskExecutor;
import com.google.mlkit.common.sdkinternal.OptionalModuleUtils;
import com.google.mlkit.common.sdkinternal.SharedPrefManager;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;

/* loaded from: classes3.dex */
public final class zzmj {

    /* renamed from: k */
    public static zzp f47044k;

    /* renamed from: l */
    public static final zzr f47045l = zzr.zzc("optional-module-barcode", OptionalModuleUtils.BARCODE_MODULE_ID);

    /* renamed from: a */
    public final String f47046a;

    /* renamed from: b */
    public final String f47047b;

    /* renamed from: c */
    public final zzmc f47048c;

    /* renamed from: d */
    public final SharedPrefManager f47049d;

    /* renamed from: e */
    public final Task f47050e;

    /* renamed from: f */
    public final Task f47051f;

    /* renamed from: g */
    public final String f47052g;

    /* renamed from: h */
    public final int f47053h;

    /* renamed from: i */
    public final Map f47054i = new HashMap();

    /* renamed from: j */
    public final Map f47055j = new HashMap();

    public zzmj(Context context, final SharedPrefManager sharedPrefManager, zzmc zzmcVar, String str) {
        int i;
        this.f47046a = context.getPackageName();
        this.f47047b = CommonUtils.getAppVersion(context);
        this.f47049d = sharedPrefManager;
        this.f47048c = zzmcVar;
        zzmw.zza();
        this.f47052g = str;
        this.f47050e = MLTaskExecutor.getInstance().scheduleCallable(new Callable() { // from class: com.google.android.gms.internal.mlkit_vision_common.zzmg
            {
                zzmj.this = this;
            }

            @Override // java.util.concurrent.Callable
            public final Object call() {
                return zzmj.this.m46805a();
            }
        });
        MLTaskExecutor mLTaskExecutor = MLTaskExecutor.getInstance();
        sharedPrefManager.getClass();
        this.f47051f = mLTaskExecutor.scheduleCallable(new Callable() { // from class: com.google.android.gms.internal.mlkit_vision_common.zzmh
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return SharedPrefManager.this.getMlSdkInstanceId();
            }
        });
        zzr zzrVar = f47045l;
        if (zzrVar.containsKey(str)) {
            i = DynamiteModule.getRemoteVersion(context, (String) zzrVar.get(str));
        } else {
            i = -1;
        }
        this.f47053h = i;
    }

    /* renamed from: c */
    public static synchronized zzp m46803c() {
        synchronized (zzmj.class) {
            try {
                zzp zzpVar = f47044k;
                if (zzpVar != null) {
                    return zzpVar;
                }
                LocaleListCompat locales = ConfigurationCompat.getLocales(Resources.getSystem().getConfiguration());
                zzm zzmVar = new zzm();
                for (int i = 0; i < locales.size(); i++) {
                    zzmVar.zzb(CommonUtils.languageTagFromLocale(locales.get(i)));
                }
                zzp zzc = zzmVar.zzc();
                f47044k = zzc;
                return zzc;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* renamed from: a */
    public final /* synthetic */ String m46805a() {
        return LibraryVersion.getInstance().getVersion(this.f47052g);
    }

    /* renamed from: b */
    public final /* synthetic */ void m46804b(zzmb zzmbVar, zziv zzivVar, String str) {
        String mlSdkInstanceId;
        zzmbVar.zza(zzivVar);
        String zzc = zzmbVar.zzc();
        zzky zzkyVar = new zzky();
        zzkyVar.zzb(this.f47046a);
        zzkyVar.zzc(this.f47047b);
        zzkyVar.zzh(m46803c());
        zzkyVar.zzg(Boolean.TRUE);
        zzkyVar.zzl(zzc);
        zzkyVar.zzj(str);
        if (this.f47051f.isSuccessful()) {
            mlSdkInstanceId = (String) this.f47051f.getResult();
        } else {
            mlSdkInstanceId = this.f47049d.getMlSdkInstanceId();
        }
        zzkyVar.zzi(mlSdkInstanceId);
        zzkyVar.zzd(10);
        zzkyVar.zzk(Integer.valueOf(this.f47053h));
        zzmbVar.zzb(zzkyVar);
        this.f47048c.zza(zzmbVar);
    }

    @WorkerThread
    public final void zzc(zzmt zzmtVar, final zziv zzivVar) {
        zzii zziiVar;
        zzio zzioVar;
        final String version;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (this.f47054i.get(zzivVar) != null && elapsedRealtime - ((Long) this.f47054i.get(zzivVar)).longValue() <= TimeUnit.SECONDS.toMillis(30L)) {
            return;
        }
        this.f47054i.put(zzivVar, Long.valueOf(elapsedRealtime));
        int i = zzmtVar.zza;
        int i2 = zzmtVar.zzb;
        int i3 = zzmtVar.zzc;
        int i4 = zzmtVar.zzd;
        int i5 = zzmtVar.zze;
        long j = zzmtVar.zzf;
        int i6 = zzmtVar.zzg;
        zzin zzinVar = new zzin();
        if (i != -1) {
            if (i != 35) {
                if (i != 842094169) {
                    if (i != 16) {
                        if (i != 17) {
                            zziiVar = zzii.UNKNOWN_FORMAT;
                        } else {
                            zziiVar = zzii.NV21;
                        }
                    } else {
                        zziiVar = zzii.NV16;
                    }
                } else {
                    zziiVar = zzii.YV12;
                }
            } else {
                zziiVar = zzii.YUV_420_888;
            }
        } else {
            zziiVar = zzii.BITMAP;
        }
        zzinVar.zzd(zziiVar);
        if (i2 != 1) {
            if (i2 != 2) {
                if (i2 != 3) {
                    if (i2 != 4) {
                        zzioVar = zzio.ANDROID_MEDIA_IMAGE;
                    } else {
                        zzioVar = zzio.FILEPATH;
                    }
                } else {
                    zzioVar = zzio.BYTEBUFFER;
                }
            } else {
                zzioVar = zzio.BYTEARRAY;
            }
        } else {
            zzioVar = zzio.BITMAP;
        }
        zzinVar.zzf(zzioVar);
        zzinVar.zzc(Integer.valueOf(i3));
        zzinVar.zze(Integer.valueOf(i4));
        zzinVar.zzg(Integer.valueOf(i5));
        zzinVar.zzb(Long.valueOf(j));
        zzinVar.zzh(Integer.valueOf(i6));
        zziq zzj = zzinVar.zzj();
        zziw zziwVar = new zziw();
        zziwVar.zzd(zzj);
        final zzmb zze = zzmk.zze(zziwVar);
        if (this.f47050e.isSuccessful()) {
            version = (String) this.f47050e.getResult();
        } else {
            version = LibraryVersion.getInstance().getVersion(this.f47052g);
        }
        MLTaskExecutor.workerThreadExecutor().execute(new Runnable() { // from class: com.google.android.gms.internal.mlkit_vision_common.zzmi
            {
                zzmj.this = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                zzmj.this.m46804b(zze, zzivVar, version);
            }
        });
    }
}
