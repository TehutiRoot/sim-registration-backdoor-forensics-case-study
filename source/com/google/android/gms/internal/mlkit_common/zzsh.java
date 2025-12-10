package com.google.android.gms.internal.mlkit_common;

import android.content.Context;
import android.content.res.Resources;
import androidx.core.p005os.ConfigurationCompat;
import androidx.core.p005os.LocaleListCompat;
import com.google.android.gms.common.internal.LibraryVersion;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.tasks.Task;
import com.google.mlkit.common.model.RemoteModel;
import com.google.mlkit.common.sdkinternal.CommonUtils;
import com.google.mlkit.common.sdkinternal.MLTaskExecutor;
import com.google.mlkit.common.sdkinternal.ModelType;
import com.google.mlkit.common.sdkinternal.OptionalModuleUtils;
import com.google.mlkit.common.sdkinternal.SharedPrefManager;
import java.util.HashMap;
import java.util.Objects;
import java.util.concurrent.Callable;

/* loaded from: classes3.dex */
public final class zzsh {

    /* renamed from: i */
    public static zzaf f46492i;

    /* renamed from: j */
    public static final zzai f46493j = zzai.zzc("optional-module-barcode", OptionalModuleUtils.BARCODE_MODULE_ID);

    /* renamed from: a */
    public final String f46494a;

    /* renamed from: b */
    public final String f46495b;

    /* renamed from: c */
    public final zzrz f46496c;

    /* renamed from: d */
    public final SharedPrefManager f46497d;

    /* renamed from: e */
    public final Task f46498e;

    /* renamed from: f */
    public final Task f46499f;

    /* renamed from: g */
    public final String f46500g;

    /* renamed from: h */
    public final int f46501h;

    public zzsh(Context context, final SharedPrefManager sharedPrefManager, zzrz zzrzVar, String str) {
        int i;
        new HashMap();
        new HashMap();
        this.f46494a = context.getPackageName();
        this.f46495b = CommonUtils.getAppVersion(context);
        this.f46497d = sharedPrefManager;
        this.f46496c = zzrzVar;
        zzsv.zza();
        this.f46500g = str;
        this.f46498e = MLTaskExecutor.getInstance().scheduleCallable(new Callable() { // from class: com.google.android.gms.internal.mlkit_common.zzse
            {
                zzsh.this = this;
            }

            @Override // java.util.concurrent.Callable
            public final Object call() {
                return zzsh.this.m47092a();
            }
        });
        MLTaskExecutor mLTaskExecutor = MLTaskExecutor.getInstance();
        Objects.requireNonNull(sharedPrefManager);
        this.f46499f = mLTaskExecutor.scheduleCallable(new Callable() { // from class: com.google.android.gms.internal.mlkit_common.zzsf
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return SharedPrefManager.this.getMlSdkInstanceId();
            }
        });
        zzai zzaiVar = f46493j;
        if (zzaiVar.containsKey(str)) {
            i = DynamiteModule.getRemoteVersion(context, (String) zzaiVar.get(str));
        } else {
            i = -1;
        }
        this.f46501h = i;
    }

    /* renamed from: d */
    public static synchronized zzaf m47089d() {
        synchronized (zzsh.class) {
            try {
                zzaf zzafVar = f46492i;
                if (zzafVar != null) {
                    return zzafVar;
                }
                LocaleListCompat locales = ConfigurationCompat.getLocales(Resources.getSystem().getConfiguration());
                zzac zzacVar = new zzac();
                for (int i = 0; i < locales.size(); i++) {
                    zzacVar.zzb(CommonUtils.languageTagFromLocale(locales.get(i)));
                }
                zzaf zzc = zzacVar.zzc();
                f46492i = zzc;
                return zzc;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* renamed from: a */
    public final /* synthetic */ String m47092a() {
        return LibraryVersion.getInstance().getVersion(this.f46500g);
    }

    /* renamed from: b */
    public final /* synthetic */ void m47091b(zzry zzryVar, zzmv zzmvVar, String str) {
        zzryVar.zza(zzmvVar);
        zzryVar.zzc(m47088e(zzryVar.zzd(), str));
        this.f46496c.zza(zzryVar);
    }

    /* renamed from: c */
    public final /* synthetic */ void m47090c(zzry zzryVar, zzsj zzsjVar, RemoteModel remoteModel) {
        zzryVar.zza(zzmv.MODEL_DOWNLOAD);
        zzryVar.zzc(m47088e(zzsjVar.zze(), m47087f()));
        zzryVar.zzb(zzst.zza(remoteModel, this.f46497d, zzsjVar));
        this.f46496c.zza(zzryVar);
    }

    /* renamed from: e */
    public final zzqt m47088e(String str, String str2) {
        String mlSdkInstanceId;
        zzqt zzqtVar = new zzqt();
        zzqtVar.zzb(this.f46494a);
        zzqtVar.zzc(this.f46495b);
        zzqtVar.zzh(m47089d());
        zzqtVar.zzg(Boolean.TRUE);
        zzqtVar.zzl(str);
        zzqtVar.zzj(str2);
        if (this.f46499f.isSuccessful()) {
            mlSdkInstanceId = (String) this.f46499f.getResult();
        } else {
            mlSdkInstanceId = this.f46497d.getMlSdkInstanceId();
        }
        zzqtVar.zzi(mlSdkInstanceId);
        zzqtVar.zzd(10);
        zzqtVar.zzk(Integer.valueOf(this.f46501h));
        return zzqtVar;
    }

    /* renamed from: f */
    public final String m47087f() {
        if (this.f46498e.isSuccessful()) {
            return (String) this.f46498e.getResult();
        }
        return LibraryVersion.getInstance().getVersion(this.f46500g);
    }

    public final void zzd(final zzry zzryVar, final zzmv zzmvVar) {
        final String m47087f = m47087f();
        MLTaskExecutor.workerThreadExecutor().execute(new Runnable() { // from class: com.google.android.gms.internal.mlkit_common.zzsd
            {
                zzsh.this = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                zzsh.this.m47091b(zzryVar, zzmvVar, m47087f);
            }
        });
    }

    public final void zze(zzry zzryVar, RemoteModel remoteModel, boolean z, int i) {
        zzsi zzh = zzsj.zzh();
        zzh.zzf(false);
        zzh.zzd(remoteModel.getModelType());
        zzh.zza(zzna.FAILED);
        zzh.zzb(zzmu.DOWNLOAD_FAILED);
        zzh.zzc(i);
        zzg(zzryVar, remoteModel, zzh.zzh());
    }

    public final void zzf(zzry zzryVar, RemoteModel remoteModel, zzmu zzmuVar, boolean z, ModelType modelType, zzna zznaVar) {
        zzsi zzh = zzsj.zzh();
        zzh.zzf(z);
        zzh.zzd(modelType);
        zzh.zzb(zzmuVar);
        zzh.zza(zznaVar);
        zzg(zzryVar, remoteModel, zzh.zzh());
    }

    public final void zzg(final zzry zzryVar, final RemoteModel remoteModel, final zzsj zzsjVar) {
        MLTaskExecutor.workerThreadExecutor().execute(new Runnable() { // from class: com.google.android.gms.internal.mlkit_common.zzsg
            @Override // java.lang.Runnable
            public final void run() {
                zzsh.this.m47090c(zzryVar, zzsjVar, remoteModel);
            }
        });
    }
}
