package com.google.android.gms.internal.mlkit_vision_text_common;

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
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;

/* loaded from: classes3.dex */
public final class zzuc {

    /* renamed from: k */
    public static zzbk f47399k;

    /* renamed from: l */
    public static final zzbm f47400l = zzbm.zzc("optional-module-barcode", OptionalModuleUtils.BARCODE_MODULE_ID);

    /* renamed from: a */
    public final String f47401a;

    /* renamed from: b */
    public final String f47402b;

    /* renamed from: c */
    public final zzts f47403c;

    /* renamed from: d */
    public final SharedPrefManager f47404d;

    /* renamed from: e */
    public final Task f47405e;

    /* renamed from: f */
    public final Task f47406f;

    /* renamed from: g */
    public final String f47407g;

    /* renamed from: h */
    public final int f47408h;

    /* renamed from: i */
    public final Map f47409i = new HashMap();

    /* renamed from: j */
    public final Map f47410j = new HashMap();

    public zzuc(Context context, final SharedPrefManager sharedPrefManager, zzts zztsVar, String str) {
        int i;
        this.f47401a = context.getPackageName();
        this.f47402b = CommonUtils.getAppVersion(context);
        this.f47404d = sharedPrefManager;
        this.f47403c = zztsVar;
        zzuo.zza();
        this.f47407g = str;
        this.f47405e = MLTaskExecutor.getInstance().scheduleCallable(new Callable() { // from class: com.google.android.gms.internal.mlkit_vision_text_common.zzty
            {
                zzuc.this = this;
            }

            @Override // java.util.concurrent.Callable
            public final Object call() {
                return zzuc.this.m46669b();
            }
        });
        MLTaskExecutor mLTaskExecutor = MLTaskExecutor.getInstance();
        Objects.requireNonNull(sharedPrefManager);
        this.f47406f = mLTaskExecutor.scheduleCallable(new Callable() { // from class: com.google.android.gms.internal.mlkit_vision_text_common.zztz
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return SharedPrefManager.this.getMlSdkInstanceId();
            }
        });
        zzbm zzbmVar = f47400l;
        if (zzbmVar.containsKey(str)) {
            i = DynamiteModule.getRemoteVersion(context, (String) zzbmVar.get(str));
        } else {
            i = -1;
        }
        this.f47408h = i;
    }

    /* renamed from: a */
    public static long m46670a(List list, double d) {
        return ((Long) list.get(Math.max(((int) Math.ceil((d / 100.0d) * list.size())) - 1, 0))).longValue();
    }

    /* renamed from: f */
    public static synchronized zzbk m46665f() {
        synchronized (zzuc.class) {
            try {
                zzbk zzbkVar = f47399k;
                if (zzbkVar != null) {
                    return zzbkVar;
                }
                LocaleListCompat locales = ConfigurationCompat.getLocales(Resources.getSystem().getConfiguration());
                zzbh zzbhVar = new zzbh();
                for (int i = 0; i < locales.size(); i++) {
                    zzbhVar.zza(CommonUtils.languageTagFromLocale(locales.get(i)));
                }
                zzbk zzb = zzbhVar.zzb();
                f47399k = zzb;
                return zzb;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* renamed from: b */
    public final /* synthetic */ String m46669b() {
        return LibraryVersion.getInstance().getVersion(this.f47407g);
    }

    /* renamed from: c */
    public final /* synthetic */ void m46668c(zztr zztrVar, zzov zzovVar, String str) {
        String mlSdkInstanceId;
        zztrVar.zzb(zzovVar);
        String zzd = zztrVar.zzd();
        zzsr zzsrVar = new zzsr();
        zzsrVar.zzb(this.f47401a);
        zzsrVar.zzc(this.f47402b);
        zzsrVar.zzh(m46665f());
        zzsrVar.zzg(Boolean.TRUE);
        zzsrVar.zzl(zzd);
        zzsrVar.zzj(str);
        if (this.f47406f.isSuccessful()) {
            mlSdkInstanceId = (String) this.f47406f.getResult();
        } else {
            mlSdkInstanceId = this.f47404d.getMlSdkInstanceId();
        }
        zzsrVar.zzi(mlSdkInstanceId);
        zzsrVar.zzd(10);
        zzsrVar.zzk(Integer.valueOf(this.f47408h));
        zztrVar.zzc(zzsrVar);
        this.f47403c.zza(zztrVar);
    }

    /* renamed from: d */
    public final /* synthetic */ void m46667d(zzov zzovVar, com.google.mlkit.vision.text.internal.zzr zzrVar) {
        zzbp zzbpVar = (zzbp) this.f47410j.get(zzovVar);
        if (zzbpVar != null) {
            for (Object obj : zzbpVar.zzo()) {
                ArrayList<Long> arrayList = new ArrayList(zzbpVar.zzc(obj));
                Collections.sort(arrayList);
                zznu zznuVar = new zznu();
                long j = 0;
                for (Long l : arrayList) {
                    j += l.longValue();
                }
                zznuVar.zza(Long.valueOf(j / arrayList.size()));
                zznuVar.zzc(Long.valueOf(m46670a(arrayList, 100.0d)));
                zznuVar.zzf(Long.valueOf(m46670a(arrayList, 75.0d)));
                zznuVar.zzd(Long.valueOf(m46670a(arrayList, 50.0d)));
                zznuVar.zzb(Long.valueOf(m46670a(arrayList, 25.0d)));
                zznuVar.zze(Long.valueOf(m46670a(arrayList, 0.0d)));
                zze(zzrVar.zza(obj, arrayList.size(), zznuVar.zzg()), zzovVar, m46664g());
            }
            this.f47410j.remove(zzovVar);
        }
    }

    /* renamed from: e */
    public final /* synthetic */ void m46666e(final zzov zzovVar, Object obj, long j, final com.google.mlkit.vision.text.internal.zzr zzrVar) {
        if (!this.f47410j.containsKey(zzovVar)) {
            this.f47410j.put(zzovVar, zzao.zzp());
        }
        ((zzbp) this.f47410j.get(zzovVar)).zzm(obj, Long.valueOf(j));
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (!m46663h(zzovVar, elapsedRealtime, 30L)) {
            return;
        }
        this.f47409i.put(zzovVar, Long.valueOf(elapsedRealtime));
        MLTaskExecutor.workerThreadExecutor().execute(new Runnable() { // from class: com.google.android.gms.internal.mlkit_vision_text_common.zztx
            {
                zzuc.this = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                zzuc.this.m46667d(zzovVar, zzrVar);
            }
        });
    }

    /* renamed from: g */
    public final String m46664g() {
        if (this.f47405e.isSuccessful()) {
            return (String) this.f47405e.getResult();
        }
        return LibraryVersion.getInstance().getVersion(this.f47407g);
    }

    /* renamed from: h */
    public final boolean m46663h(zzov zzovVar, long j, long j2) {
        if (this.f47409i.get(zzovVar) == null || j - ((Long) this.f47409i.get(zzovVar)).longValue() > TimeUnit.SECONDS.toMillis(30L)) {
            return true;
        }
        return false;
    }

    public final void zzd(zztr zztrVar, zzov zzovVar) {
        zze(zztrVar, zzovVar, m46664g());
    }

    public final void zze(final zztr zztrVar, final zzov zzovVar, final String str) {
        MLTaskExecutor.workerThreadExecutor().execute(new Runnable() { // from class: com.google.android.gms.internal.mlkit_vision_text_common.zztw
            {
                zzuc.this = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                zzuc.this.m46668c(zztrVar, zzovVar, str);
            }
        });
    }

    @WorkerThread
    public final void zzf(zzub zzubVar, zzov zzovVar) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (!m46663h(zzovVar, elapsedRealtime, 30L)) {
            return;
        }
        this.f47409i.put(zzovVar, Long.valueOf(elapsedRealtime));
        zze(zzubVar.zza(), zzovVar, m46664g());
    }
}
