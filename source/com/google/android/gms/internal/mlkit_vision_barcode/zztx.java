package com.google.android.gms.internal.mlkit_vision_barcode;

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
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;

/* loaded from: classes3.dex */
public final class zztx {

    /* renamed from: k */
    public static zzcv f46718k;

    /* renamed from: l */
    public static final zzcx f46719l = zzcx.zzc("optional-module-barcode", OptionalModuleUtils.BARCODE_MODULE_ID);

    /* renamed from: a */
    public final String f46720a;

    /* renamed from: b */
    public final String f46721b;

    /* renamed from: c */
    public final zztn f46722c;

    /* renamed from: d */
    public final SharedPrefManager f46723d;

    /* renamed from: e */
    public final Task f46724e;

    /* renamed from: f */
    public final Task f46725f;

    /* renamed from: g */
    public final String f46726g;

    /* renamed from: h */
    public final int f46727h;

    /* renamed from: i */
    public final Map f46728i = new HashMap();

    /* renamed from: j */
    public final Map f46729j = new HashMap();

    public zztx(Context context, final SharedPrefManager sharedPrefManager, zztn zztnVar, String str) {
        int i;
        this.f46720a = context.getPackageName();
        this.f46721b = CommonUtils.getAppVersion(context);
        this.f46723d = sharedPrefManager;
        this.f46722c = zztnVar;
        zzuj.zza();
        this.f46726g = str;
        this.f46724e = MLTaskExecutor.getInstance().scheduleCallable(new Callable() { // from class: com.google.android.gms.internal.mlkit_vision_barcode.zztr
            {
                zztx.this = this;
            }

            @Override // java.util.concurrent.Callable
            public final Object call() {
                return zztx.this.m46987b();
            }
        });
        MLTaskExecutor mLTaskExecutor = MLTaskExecutor.getInstance();
        sharedPrefManager.getClass();
        this.f46725f = mLTaskExecutor.scheduleCallable(new Callable() { // from class: com.google.android.gms.internal.mlkit_vision_barcode.zzts
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return SharedPrefManager.this.getMlSdkInstanceId();
            }
        });
        zzcx zzcxVar = f46719l;
        if (zzcxVar.containsKey(str)) {
            i = DynamiteModule.getRemoteVersion(context, (String) zzcxVar.get(str));
        } else {
            i = -1;
        }
        this.f46727h = i;
    }

    /* renamed from: a */
    public static long m46988a(List list, double d) {
        return ((Long) list.get(Math.max(((int) Math.ceil((d / 100.0d) * list.size())) - 1, 0))).longValue();
    }

    /* renamed from: f */
    public static synchronized zzcv m46983f() {
        synchronized (zztx.class) {
            try {
                zzcv zzcvVar = f46718k;
                if (zzcvVar != null) {
                    return zzcvVar;
                }
                LocaleListCompat locales = ConfigurationCompat.getLocales(Resources.getSystem().getConfiguration());
                zzcs zzcsVar = new zzcs();
                for (int i = 0; i < locales.size(); i++) {
                    zzcsVar.zzd(CommonUtils.languageTagFromLocale(locales.get(i)));
                }
                zzcv zzf = zzcsVar.zzf();
                f46718k = zzf;
                return zzf;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* renamed from: b */
    public final /* synthetic */ String m46987b() {
        return LibraryVersion.getInstance().getVersion(this.f46726g);
    }

    /* renamed from: c */
    public final /* synthetic */ void m46986c(zztm zztmVar, zzpk zzpkVar, String str) {
        String mlSdkInstanceId;
        zztmVar.zzb(zzpkVar);
        String zzd = zztmVar.zzd();
        zzsj zzsjVar = new zzsj();
        zzsjVar.zzb(this.f46720a);
        zzsjVar.zzc(this.f46721b);
        zzsjVar.zzh(m46983f());
        zzsjVar.zzg(Boolean.TRUE);
        zzsjVar.zzl(zzd);
        zzsjVar.zzj(str);
        if (this.f46725f.isSuccessful()) {
            mlSdkInstanceId = (String) this.f46725f.getResult();
        } else {
            mlSdkInstanceId = this.f46723d.getMlSdkInstanceId();
        }
        zzsjVar.zzi(mlSdkInstanceId);
        zzsjVar.zzd(10);
        zzsjVar.zzk(Integer.valueOf(this.f46727h));
        zztmVar.zzc(zzsjVar);
        this.f46722c.zza(zztmVar);
    }

    /* renamed from: d */
    public final /* synthetic */ void m46985d(zzpk zzpkVar, com.google.mlkit.vision.barcode.internal.zzj zzjVar) {
        zzdb zzdbVar = (zzdb) this.f46729j.get(zzpkVar);
        if (zzdbVar != null) {
            for (Object obj : zzdbVar.zzw()) {
                ArrayList<Long> arrayList = new ArrayList(zzdbVar.zze(obj));
                Collections.sort(arrayList);
                zzoj zzojVar = new zzoj();
                long j = 0;
                for (Long l : arrayList) {
                    j += l.longValue();
                }
                zzojVar.zza(Long.valueOf(j / arrayList.size()));
                zzojVar.zzc(Long.valueOf(m46988a(arrayList, 100.0d)));
                zzojVar.zzf(Long.valueOf(m46988a(arrayList, 75.0d)));
                zzojVar.zzd(Long.valueOf(m46988a(arrayList, 50.0d)));
                zzojVar.zzb(Long.valueOf(m46988a(arrayList, 25.0d)));
                zzojVar.zze(Long.valueOf(m46988a(arrayList, 0.0d)));
                zze(zzjVar.zza(obj, arrayList.size(), zzojVar.zzg()), zzpkVar, m46982g());
            }
            this.f46729j.remove(zzpkVar);
        }
    }

    /* renamed from: e */
    public final /* synthetic */ void m46984e(final zzpk zzpkVar, Object obj, long j, final com.google.mlkit.vision.barcode.internal.zzj zzjVar) {
        if (!this.f46729j.containsKey(zzpkVar)) {
            this.f46729j.put(zzpkVar, zzbz.zzz());
        }
        ((zzdb) this.f46729j.get(zzpkVar)).zzt(obj, Long.valueOf(j));
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (!m46981h(zzpkVar, elapsedRealtime, 30L)) {
            return;
        }
        this.f46728i.put(zzpkVar, Long.valueOf(elapsedRealtime));
        MLTaskExecutor.workerThreadExecutor().execute(new Runnable() { // from class: com.google.android.gms.internal.mlkit_vision_barcode.zztv
            {
                zztx.this = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                zztx.this.m46985d(zzpkVar, zzjVar);
            }
        });
    }

    /* renamed from: g */
    public final String m46982g() {
        if (this.f46724e.isSuccessful()) {
            return (String) this.f46724e.getResult();
        }
        return LibraryVersion.getInstance().getVersion(this.f46726g);
    }

    /* renamed from: h */
    public final boolean m46981h(zzpk zzpkVar, long j, long j2) {
        if (this.f46728i.get(zzpkVar) == null || j - ((Long) this.f46728i.get(zzpkVar)).longValue() > TimeUnit.SECONDS.toMillis(30L)) {
            return true;
        }
        return false;
    }

    public final void zzd(zztm zztmVar, zzpk zzpkVar) {
        zze(zztmVar, zzpkVar, m46982g());
    }

    public final void zze(final zztm zztmVar, final zzpk zzpkVar, final String str) {
        MLTaskExecutor.workerThreadExecutor().execute(new Runnable() { // from class: com.google.android.gms.internal.mlkit_vision_barcode.zztt
            {
                zztx.this = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                zztx.this.m46986c(zztmVar, zzpkVar, str);
            }
        });
    }

    @WorkerThread
    public final void zzf(zztw zztwVar, zzpk zzpkVar) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (!m46981h(zzpkVar, elapsedRealtime, 30L)) {
            return;
        }
        this.f46728i.put(zzpkVar, Long.valueOf(elapsedRealtime));
        zze(zztwVar.zza(), zzpkVar, m46982g());
    }
}
