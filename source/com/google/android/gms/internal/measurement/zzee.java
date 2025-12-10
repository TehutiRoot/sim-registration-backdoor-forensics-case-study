package com.google.android.gms.internal.measurement;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.BadParcelableException;
import android.os.Bundle;
import android.os.NetworkOnMainThreadException;
import android.os.RemoteException;
import android.util.Log;
import android.util.Pair;
import androidx.annotation.NonNull;
import androidx.annotation.WorkerThread;
import androidx.lifecycle.CoroutineLiveDataKt;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.common.util.DefaultClock;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.android.gms.measurement.internal.zzgy;
import com.google.android.gms.measurement.internal.zzij;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes3.dex */
public final class zzee {

    /* renamed from: h */
    public static volatile zzee f46257h;

    /* renamed from: a */
    public final String f46258a;

    /* renamed from: b */
    public final AppMeasurementSdk f46259b;

    /* renamed from: c */
    public final List f46260c;

    /* renamed from: d */
    public int f46261d;

    /* renamed from: e */
    public boolean f46262e;

    /* renamed from: f */
    public final String f46263f;

    /* renamed from: g */
    public volatile zzcc f46264g;
    protected final Clock zza;
    protected final ExecutorService zzb;

    public zzee(Context context, String str, String str2, String str3, Bundle bundle) {
        boolean z;
        if (str != null && m47324f(str2, str3)) {
            this.f46258a = str;
        } else {
            this.f46258a = "FA";
        }
        this.zza = DefaultClock.getInstance();
        zzbx.zza();
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(1, 1, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new ThreadFactoryC17415Ci2(this));
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        this.zzb = Executors.unconfigurableExecutorService(threadPoolExecutor);
        this.f46259b = new AppMeasurementSdk(this);
        this.f46260c = new ArrayList();
        try {
            if (zzij.zzc(context, "google_app_id", com.google.android.gms.measurement.internal.zzfq.zza(context)) != null && !zzR()) {
                this.f46263f = null;
                this.f46262e = true;
                Log.w(this.f46258a, "Disabling data collection. Found google_app_id in strings.xml but Google Analytics for Firebase is missing. Remove this value or add Google Analytics for Firebase to resume data collection.");
                return;
            }
        } catch (IllegalStateException unused) {
        }
        if (!m47324f(str2, str3)) {
            this.f46263f = "fa";
            if (str2 == null || str3 == null) {
                if (str2 == null) {
                    z = true;
                } else {
                    z = false;
                }
                if (z ^ (str3 == null)) {
                    Log.w(this.f46258a, "Specified origin or custom app id is null. Both parameters will be ignored.");
                }
            }
        } else {
            this.f46263f = str2;
        }
        m47325e(new C19908fh2(this, str2, str3, context, bundle));
        Application application = (Application) context.getApplicationContext();
        if (application == null) {
            Log.w(this.f46258a, "Unable to register lifecycle notifications. Application null.");
        } else {
            application.registerActivityLifecycleCallbacks(new C17741Hk2(this));
        }
    }

    /* renamed from: f */
    public static final boolean m47324f(String str, String str2) {
        if (str2 != null && str != null && !zzR()) {
            return true;
        }
        return false;
    }

    public static final boolean zzR() {
        return true;
    }

    public static zzee zzg(Context context, String str, String str2, String str3, Bundle bundle) {
        Preconditions.checkNotNull(context);
        if (f46257h == null) {
            synchronized (zzee.class) {
                try {
                    if (f46257h == null) {
                        f46257h = new zzee(context, str, str2, str3, bundle);
                    }
                } finally {
                }
            }
        }
        return f46257h;
    }

    /* renamed from: c */
    public final void m47327c(Exception exc, boolean z, boolean z2) {
        this.f46262e |= z;
        if (z) {
            Log.w(this.f46258a, "Data collection startup failed. No data will be collected.", exc);
            return;
        }
        if (z2) {
            zzA(5, "Error with data collection. Data lost.", exc, null, null);
        }
        Log.w(this.f46258a, "Error with data collection. Data lost.", exc);
    }

    /* renamed from: d */
    public final void m47326d(String str, String str2, Bundle bundle, boolean z, boolean z2, Long l) {
        m47325e(new C22322tj2(this, l, str, str2, bundle, z, z2));
    }

    /* renamed from: e */
    public final void m47325e(AbstractRunnableC6527a abstractRunnableC6527a) {
        this.zzb.execute(abstractRunnableC6527a);
    }

    public final void zzA(int i, String str, Object obj, Object obj2, Object obj3) {
        m47325e(new C22491ui2(this, false, 5, str, obj, null, null));
    }

    public final void zzB(com.google.android.gms.measurement.internal.zzgz zzgzVar) {
        Preconditions.checkNotNull(zzgzVar);
        synchronized (this.f46260c) {
            for (int i = 0; i < this.f46260c.size(); i++) {
                try {
                    if (zzgzVar.equals(((Pair) this.f46260c.get(i)).first)) {
                        Log.w(this.f46258a, "OnEventListener already registered.");
                        return;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            BinderC17802Ij2 binderC17802Ij2 = new BinderC17802Ij2(zzgzVar);
            this.f46260c.add(new Pair(zzgzVar, binderC17802Ij2));
            if (this.f46264g != null) {
                try {
                    this.f46264g.registerOnMeasurementEventListener(binderC17802Ij2);
                    return;
                } catch (BadParcelableException | NetworkOnMainThreadException | RemoteException | IllegalArgumentException | IllegalStateException | NullPointerException | SecurityException | UnsupportedOperationException unused) {
                    Log.w(this.f46258a, "Failed to register event listener on calling thread. Trying again on the dynamite thread.");
                }
            }
            m47325e(new C20946lj2(this, binderC17802Ij2));
        }
    }

    public final void zzC() {
        m47325e(new C18881Zg2(this));
    }

    public final void zzD(Bundle bundle) {
        m47325e(new C22313tg2(this, bundle));
    }

    public final void zzE(Bundle bundle) {
        m47325e(new C18177Og2(this, bundle));
    }

    public final void zzF(Bundle bundle) {
        m47325e(new C18497Tg2(this, bundle));
    }

    public final void zzG(Activity activity, String str, String str2) {
        m47325e(new C17793Ig2(this, activity, str, str2));
    }

    public final void zzH(boolean z) {
        m47325e(new C18503Ti2(this, z));
    }

    public final void zzI(Bundle bundle) {
        m47325e(new C18823Yi2(this, bundle));
    }

    public final void zzJ(zzgy zzgyVar) {
        BinderC17546Ej2 binderC17546Ej2 = new BinderC17546Ej2(zzgyVar);
        if (this.f46264g != null) {
            try {
                this.f46264g.setEventInterceptor(binderC17546Ej2);
                return;
            } catch (BadParcelableException | NetworkOnMainThreadException | RemoteException | IllegalArgumentException | IllegalStateException | NullPointerException | SecurityException | UnsupportedOperationException unused) {
                Log.w(this.f46258a, "Failed to set event interceptor on calling thread. Trying again on the dynamite thread.");
            }
        }
        m47325e(new C20258hj2(this, binderC17546Ej2));
    }

    public final void zzK(Boolean bool) {
        m47325e(new C17857Jg2(this, bool));
    }

    public final void zzL(long j) {
        m47325e(new C19392ch2(this, j));
    }

    public final void zzM(String str) {
        m47325e(new C17537Eg2(this, str));
    }

    public final void zzN(String str, String str2, Object obj, boolean z) {
        m47325e(new C23010xj2(this, str, str2, obj, z));
    }

    public final void zzO(com.google.android.gms.measurement.internal.zzgz zzgzVar) {
        Pair pair;
        Preconditions.checkNotNull(zzgzVar);
        synchronized (this.f46260c) {
            int i = 0;
            while (true) {
                try {
                    if (i < this.f46260c.size()) {
                        if (zzgzVar.equals(((Pair) this.f46260c.get(i)).first)) {
                            pair = (Pair) this.f46260c.get(i);
                            break;
                        }
                        i++;
                    } else {
                        pair = null;
                        break;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            if (pair == null) {
                Log.w(this.f46258a, "OnEventListener had not been registered.");
                return;
            }
            this.f46260c.remove(pair);
            BinderC17802Ij2 binderC17802Ij2 = (BinderC17802Ij2) pair.second;
            if (this.f46264g != null) {
                try {
                    this.f46264g.unregisterOnMeasurementEventListener(binderC17802Ij2);
                    return;
                } catch (BadParcelableException | NetworkOnMainThreadException | RemoteException | IllegalArgumentException | IllegalStateException | NullPointerException | SecurityException | UnsupportedOperationException unused) {
                    Log.w(this.f46258a, "Failed to unregister event listener on calling thread. Trying again on the dynamite thread.");
                }
            }
            m47325e(new C21634pj2(this, binderC17802Ij2));
        }
    }

    public final int zza(String str) {
        zzbz zzbzVar = new zzbz();
        m47325e(new C17479Di2(this, str, zzbzVar));
        Integer num = (Integer) zzbz.zze(zzbzVar.zzb(10000L), Integer.class);
        if (num == null) {
            return 25;
        }
        return num.intValue();
    }

    public final long zzb() {
        zzbz zzbzVar = new zzbz();
        m47325e(new C18628Vh2(this, zzbzVar));
        Long l = (Long) zzbz.zze(zzbzVar.zzb(500L), Long.class);
        if (l == null) {
            long nextLong = new Random(System.nanoTime() ^ this.zza.currentTimeMillis()).nextLong();
            int i = this.f46261d + 1;
            this.f46261d = i;
            return nextLong + i;
        }
        return l.longValue();
    }

    public final Bundle zzc(Bundle bundle, boolean z) {
        zzbz zzbzVar = new zzbz();
        m47325e(new C22663vi2(this, bundle, zzbzVar));
        if (z) {
            return zzbzVar.zzb(CoroutineLiveDataKt.DEFAULT_TIMEOUT);
        }
        return null;
    }

    public final AppMeasurementSdk zzd() {
        return this.f46259b;
    }

    public final zzcc zzf(Context context, boolean z) {
        try {
            return zzcb.asInterface(DynamiteModule.load(context, DynamiteModule.PREFER_HIGHEST_OR_LOCAL_VERSION, ModuleDescriptor.MODULE_ID).instantiate("com.google.android.gms.measurement.internal.AppMeasurementDynamiteService"));
        } catch (DynamiteModule.LoadingException e) {
            m47327c(e, true, false);
            return null;
        }
    }

    public final Object zzh(int i) {
        zzbz zzbzVar = new zzbz();
        m47325e(new C18183Oi2(this, zzbzVar, i));
        return zzbz.zze(zzbzVar.zzb(15000L), Object.class);
    }

    public final String zzj() {
        return this.f46263f;
    }

    @WorkerThread
    public final String zzk() {
        zzbz zzbzVar = new zzbz();
        m47325e(new C17735Hi2(this, zzbzVar));
        return zzbzVar.zzc(120000L);
    }

    public final String zzl() {
        zzbz zzbzVar = new zzbz();
        m47325e(new C18308Qh2(this, zzbzVar));
        return zzbzVar.zzc(50L);
    }

    public final String zzm() {
        zzbz zzbzVar = new zzbz();
        m47325e(new C20255hi2(this, zzbzVar));
        return zzbzVar.zzc(500L);
    }

    public final String zzn() {
        zzbz zzbzVar = new zzbz();
        m47325e(new C19046ai2(this, zzbzVar));
        return zzbzVar.zzc(500L);
    }

    public final String zzo() {
        zzbz zzbzVar = new zzbz();
        m47325e(new C17860Jh2(this, zzbzVar));
        return zzbzVar.zzc(500L);
    }

    public final List zzp(String str, String str2) {
        zzbz zzbzVar = new zzbz();
        m47325e(new C17409Cg2(this, str, str2, zzbzVar));
        List list = (List) zzbz.zze(zzbzVar.zzb(CoroutineLiveDataKt.DEFAULT_TIMEOUT), List.class);
        if (list == null) {
            return Collections.emptyList();
        }
        return list;
    }

    public final Map zzq(String str, String str2, boolean z) {
        zzbz zzbzVar = new zzbz();
        m47325e(new C21115mi2(this, str, str2, z, zzbzVar));
        Bundle zzb = zzbzVar.zzb(CoroutineLiveDataKt.DEFAULT_TIMEOUT);
        if (zzb != null && zzb.size() != 0) {
            HashMap hashMap = new HashMap(zzb.size());
            for (String str3 : zzb.keySet()) {
                Object obj = zzb.get(str3);
                if ((obj instanceof Double) || (obj instanceof Long) || (obj instanceof String)) {
                    hashMap.put(str3, obj);
                }
            }
            return hashMap;
        }
        return Collections.emptyMap();
    }

    public final void zzu(String str) {
        m47325e(new C20080gh2(this, str));
    }

    public final void zzv(String str, String str2, Bundle bundle) {
        m47325e(new C23173yg2(this, str, str2, bundle));
    }

    public final void zzw(String str) {
        m47325e(new C20596jh2(this, str));
    }

    public final void zzx(@NonNull String str, Bundle bundle) {
        m47326d(null, str, bundle, false, true, null);
    }

    public final void zzy(String str, String str2, Bundle bundle) {
        m47326d(str, str2, bundle, true, true, null);
    }

    public final void zzz(String str, String str2, Bundle bundle, long j) {
        m47326d(str, str2, bundle, true, false, Long.valueOf(j));
    }
}
