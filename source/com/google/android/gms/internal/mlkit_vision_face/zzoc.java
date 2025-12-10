package com.google.android.gms.internal.mlkit_vision_face;

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
public final class zzoc {

    /* renamed from: k */
    public static zzbn f47212k;

    /* renamed from: l */
    public static final zzbp f47213l = zzbp.zzc("optional-module-barcode", OptionalModuleUtils.BARCODE_MODULE_ID);

    /* renamed from: a */
    public final String f47214a;

    /* renamed from: b */
    public final String f47215b;

    /* renamed from: c */
    public final zzob f47216c;

    /* renamed from: d */
    public final SharedPrefManager f47217d;

    /* renamed from: e */
    public final Task f47218e;

    /* renamed from: f */
    public final Task f47219f;

    /* renamed from: g */
    public final String f47220g;

    /* renamed from: h */
    public final int f47221h;

    /* renamed from: i */
    public final Map f47222i = new HashMap();

    /* renamed from: j */
    public final Map f47223j = new HashMap();

    public zzoc(Context context, final SharedPrefManager sharedPrefManager, zzob zzobVar, String str) {
        int i;
        this.f47214a = context.getPackageName();
        this.f47215b = CommonUtils.getAppVersion(context);
        this.f47217d = sharedPrefManager;
        this.f47216c = zzobVar;
        zzoo.zza();
        this.f47220g = str;
        this.f47218e = MLTaskExecutor.getInstance().scheduleCallable(new Callable() { // from class: com.google.android.gms.internal.mlkit_vision_face.zznv
            {
                zzoc.this = this;
            }

            @Override // java.util.concurrent.Callable
            public final Object call() {
                return zzoc.this.m46734b();
            }
        });
        MLTaskExecutor mLTaskExecutor = MLTaskExecutor.getInstance();
        sharedPrefManager.getClass();
        this.f47219f = mLTaskExecutor.scheduleCallable(new Callable() { // from class: com.google.android.gms.internal.mlkit_vision_face.zznw
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return SharedPrefManager.this.getMlSdkInstanceId();
            }
        });
        zzbp zzbpVar = f47213l;
        if (zzbpVar.containsKey(str)) {
            i = DynamiteModule.getRemoteVersion(context, (String) zzbpVar.get(str));
        } else {
            i = -1;
        }
        this.f47221h = i;
    }

    /* renamed from: a */
    public static long m46735a(List list, double d) {
        return ((Long) list.get(Math.max(((int) Math.ceil((d / 100.0d) * list.size())) - 1, 0))).longValue();
    }

    /* renamed from: f */
    public static synchronized zzbn m46730f() {
        synchronized (zzoc.class) {
            try {
                zzbn zzbnVar = f47212k;
                if (zzbnVar != null) {
                    return zzbnVar;
                }
                LocaleListCompat locales = ConfigurationCompat.getLocales(Resources.getSystem().getConfiguration());
                zzbk zzbkVar = new zzbk();
                for (int i = 0; i < locales.size(); i++) {
                    zzbkVar.zzb(CommonUtils.languageTagFromLocale(locales.get(i)));
                }
                zzbn zzc = zzbkVar.zzc();
                f47212k = zzc;
                return zzc;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* renamed from: b */
    public final /* synthetic */ String m46734b() {
        return LibraryVersion.getInstance().getVersion(this.f47220g);
    }

    /* renamed from: c */
    public final /* synthetic */ void m46733c(zznr zznrVar, zzkt zzktVar, String str) {
        String mlSdkInstanceId;
        zznrVar.zzb(zzktVar);
        String zzd = zznrVar.zzd();
        zzmt zzmtVar = new zzmt();
        zzmtVar.zzb(this.f47214a);
        zzmtVar.zzc(this.f47215b);
        zzmtVar.zzh(m46730f());
        zzmtVar.zzg(Boolean.TRUE);
        zzmtVar.zzl(zzd);
        zzmtVar.zzj(str);
        if (this.f47219f.isSuccessful()) {
            mlSdkInstanceId = (String) this.f47219f.getResult();
        } else {
            mlSdkInstanceId = this.f47217d.getMlSdkInstanceId();
        }
        zzmtVar.zzi(mlSdkInstanceId);
        zzmtVar.zzd(10);
        zzmtVar.zzk(Integer.valueOf(this.f47221h));
        zznrVar.zzc(zzmtVar);
        this.f47216c.zza(zznrVar);
    }

    /* renamed from: d */
    public final /* synthetic */ void m46732d(zzkt zzktVar, com.google.mlkit.vision.face.internal.zzg zzgVar) {
        zzbs zzbsVar = (zzbs) this.f47223j.get(zzktVar);
        if (zzbsVar != null) {
            for (Object obj : zzbsVar.zzq()) {
                ArrayList<Long> arrayList = new ArrayList(zzbsVar.zzc(obj));
                Collections.sort(arrayList);
                zzjt zzjtVar = new zzjt();
                long j = 0;
                for (Long l : arrayList) {
                    j += l.longValue();
                }
                zzjtVar.zza(Long.valueOf(j / arrayList.size()));
                zzjtVar.zzc(Long.valueOf(m46735a(arrayList, 100.0d)));
                zzjtVar.zzf(Long.valueOf(m46735a(arrayList, 75.0d)));
                zzjtVar.zzd(Long.valueOf(m46735a(arrayList, 50.0d)));
                zzjtVar.zzb(Long.valueOf(m46735a(arrayList, 25.0d)));
                zzjtVar.zze(Long.valueOf(m46735a(arrayList, 0.0d)));
                zze(zzgVar.zza(obj, arrayList.size(), zzjtVar.zzg()), zzktVar, m46729g());
            }
            this.f47223j.remove(zzktVar);
        }
    }

    /* renamed from: e */
    public final /* synthetic */ void m46731e(zzkt zzktVar, Object obj, long j, com.google.mlkit.vision.face.internal.zzg zzgVar) {
        if (!this.f47223j.containsKey(zzktVar)) {
            this.f47223j.put(zzktVar, zzas.zzr());
        }
        ((zzbs) this.f47223j.get(zzktVar)).zzo(obj, Long.valueOf(j));
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (!m46728h(zzktVar, elapsedRealtime, 30L)) {
            return;
        }
        this.f47222i.put(zzktVar, Long.valueOf(elapsedRealtime));
        MLTaskExecutor.workerThreadExecutor().execute(new Runnable(zzktVar, zzgVar, null) { // from class: com.google.android.gms.internal.mlkit_vision_face.zznz
            public final /* synthetic */ zzkt zzb;
            public final /* synthetic */ com.google.mlkit.vision.face.internal.zzg zzc;

            {
                zzoc.this = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                zzoc.this.m46732d(this.zzb, this.zzc);
            }
        });
    }

    /* renamed from: g */
    public final String m46729g() {
        if (this.f47218e.isSuccessful()) {
            return (String) this.f47218e.getResult();
        }
        return LibraryVersion.getInstance().getVersion(this.f47220g);
    }

    /* renamed from: h */
    public final boolean m46728h(zzkt zzktVar, long j, long j2) {
        if (this.f47222i.get(zzktVar) == null || j - ((Long) this.f47222i.get(zzktVar)).longValue() > TimeUnit.SECONDS.toMillis(30L)) {
            return true;
        }
        return false;
    }

    public final void zzd(zznr zznrVar, zzkt zzktVar) {
        zze(zznrVar, zzktVar, m46729g());
    }

    public final void zze(final zznr zznrVar, final zzkt zzktVar, final String str) {
        MLTaskExecutor.workerThreadExecutor().execute(new Runnable() { // from class: com.google.android.gms.internal.mlkit_vision_face.zznx
            {
                zzoc.this = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                zzoc.this.m46733c(zznrVar, zzktVar, str);
            }
        });
    }

    @WorkerThread
    public final void zzf(zzoa zzoaVar, zzkt zzktVar) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (!m46728h(zzktVar, elapsedRealtime, 30L)) {
            return;
        }
        this.f47222i.put(zzktVar, Long.valueOf(elapsedRealtime));
        zze(zzoaVar.zza(), zzktVar, m46729g());
    }
}
