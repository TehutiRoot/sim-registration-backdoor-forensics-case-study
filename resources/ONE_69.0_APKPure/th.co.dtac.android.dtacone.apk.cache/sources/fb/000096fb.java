package com.google.android.gms.internal.mlkit_vision_barcode;

import android.content.Context;
import androidx.annotation.VisibleForTesting;
import com.google.android.gms.common.internal.GmsLogger;
import com.google.mlkit.common.sdkinternal.SharedPrefManager;
import com.google.mlkit.vision.barcode.BarcodeScannerOptions;
import com.google.mlkit.vision.barcode.ZoomSuggestionOptions;
import com.google.mlkit.vision.barcode.internal.BarcodeScannerImpl;
import com.google.mlkit.vision.barcode.internal.zzf;
import java.util.HashSet;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes3.dex */
public final class zzus {

    /* renamed from: s */
    public static final GmsLogger f46752s = new GmsLogger("AutoZoom");

    /* renamed from: a */
    public final zzuu f46753a;

    /* renamed from: b */
    public final AtomicBoolean f46754b;

    /* renamed from: c */
    public final Object f46755c;

    /* renamed from: d */
    public final zzbz f46756d;

    /* renamed from: e */
    public final ScheduledExecutorService f46757e;

    /* renamed from: f */
    public final zzbf f46758f;

    /* renamed from: g */
    public final zztx f46759g;

    /* renamed from: h */
    public final String f46760h;

    /* renamed from: i */
    public Executor f46761i;

    /* renamed from: j */
    public float f46762j;

    /* renamed from: k */
    public float f46763k;

    /* renamed from: l */
    public long f46764l;

    /* renamed from: m */
    public long f46765m;

    /* renamed from: n */
    public ScheduledFuture f46766n;

    /* renamed from: o */
    public String f46767o;

    /* renamed from: p */
    public boolean f46768p;

    /* renamed from: q */
    public int f46769q;

    /* renamed from: r */
    public zzf f46770r;

    public zzus(Context context, zzuu zzuuVar, String str) {
        zzg.zza();
        ScheduledExecutorService unconfigurableScheduledExecutorService = Executors.unconfigurableScheduledExecutorService(Executors.newScheduledThreadPool(2));
        zzbf zza = zzar.zza();
        zztx zztxVar = new zztx(context, new SharedPrefManager(context), new zztq(context, zztp.zzd("scanner-auto-zoom").zzd()), "scanner-auto-zoom");
        this.f46755c = new Object();
        this.f46753a = zzuuVar;
        this.f46754b = new AtomicBoolean(false);
        this.f46756d = zzbz.zzz();
        this.f46757e = unconfigurableScheduledExecutorService;
        this.f46758f = zza;
        this.f46759g = zztxVar;
        this.f46760h = str;
        this.f46769q = 1;
        this.f46762j = 1.0f;
        this.f46763k = -1.0f;
        this.f46764l = zza.zza();
    }

    /* renamed from: d */
    public static /* bridge */ /* synthetic */ void m46984d(zzus zzusVar, float f) {
        synchronized (zzusVar.f46755c) {
            zzusVar.f46762j = f;
            zzusVar.m46979i(false);
        }
    }

    public static zzus zzd(Context context, String str) {
        return new zzus(context, zzuu.zzb, str);
    }

    public static /* synthetic */ void zzf(zzus zzusVar) {
        ScheduledFuture scheduledFuture;
        synchronized (zzusVar.f46755c) {
            try {
                if (zzusVar.f46769q == 2 && !zzusVar.f46754b.get() && (scheduledFuture = zzusVar.f46766n) != null && !scheduledFuture.isCancelled()) {
                    if (zzusVar.f46762j > 1.0f && zzusVar.zza() >= zzusVar.f46753a.mo46970i()) {
                        f46752s.m48401i("AutoZoom", "Reset zoom = 1");
                        zzusVar.m46982f(1.0f, zzpk.SCANNER_AUTO_ZOOM_AUTO_RESET, null);
                    }
                }
            } finally {
            }
        }
    }

    /* renamed from: b */
    public final /* synthetic */ zzev m46986b(float f) {
        zzf zzfVar = this.f46770r;
        float m46981g = m46981g(f);
        ZoomSuggestionOptions zoomSuggestionOptions = zzfVar.zza;
        BarcodeScannerOptions barcodeScannerOptions = BarcodeScannerImpl.f57078l;
        if (true != zoomSuggestionOptions.zzb().setZoom(m46981g)) {
            m46981g = 0.0f;
        }
        return zzem.zza(Float.valueOf(m46981g));
    }

    /* renamed from: f */
    public final void m46982f(float f, zzpk zzpkVar, zzuv zzuvVar) {
        synchronized (this.f46755c) {
            try {
                if (this.f46761i != null && this.f46770r != null && this.f46769q == 2) {
                    if (!this.f46754b.compareAndSet(false, true)) {
                        return;
                    }
                    zzem.zzb(zzem.zzc(new zzup(this, f), this.f46761i), new C19561dL2(this, zzpkVar, this.f46762j, zzuvVar, f), zzew.zza());
                }
            } finally {
            }
        }
    }

    /* renamed from: g */
    public final float m46981g(float f) {
        int i = (f > 1.0f ? 1 : (f == 1.0f ? 0 : -1));
        float f2 = this.f46763k;
        if (i < 0) {
            f = 1.0f;
        }
        return (f2 <= 0.0f || f <= f2) ? f : f2;
    }

    /* renamed from: h */
    public final void m46980h(zzpk zzpkVar, float f, float f2, zzuv zzuvVar) {
        long convert;
        if (this.f46767o != null) {
            zzsb zzsbVar = new zzsb();
            zzsbVar.zza(this.f46760h);
            String str = this.f46767o;
            str.getClass();
            zzsbVar.zze(str);
            zzsbVar.zzf(Float.valueOf(f));
            zzsbVar.zzc(Float.valueOf(f2));
            synchronized (this.f46755c) {
                convert = TimeUnit.MILLISECONDS.convert(this.f46758f.zza() - this.f46765m, TimeUnit.NANOSECONDS);
            }
            zzsbVar.zzb(Long.valueOf(convert));
            if (zzuvVar != null) {
                zzsc zzscVar = new zzsc();
                zzscVar.zzc(Float.valueOf(zzuvVar.mo46964c()));
                zzscVar.zze(Float.valueOf(zzuvVar.mo46962e()));
                zzscVar.zzb(Float.valueOf(zzuvVar.mo46965b()));
                zzscVar.zzd(Float.valueOf(zzuvVar.mo46963d()));
                zzscVar.zza(Float.valueOf(0.0f));
                zzsbVar.zzd(zzscVar.zzf());
            }
            zztx zztxVar = this.f46759g;
            zzpl zzplVar = new zzpl();
            zzplVar.zzi(zzsbVar.zzh());
            zztxVar.zzd(zzua.zzf(zzplVar), zzpkVar);
        }
    }

    /* renamed from: i */
    public final void m46979i(boolean z) {
        ScheduledFuture scheduledFuture;
        synchronized (this.f46755c) {
            try {
                this.f46756d.zzs();
                this.f46764l = this.f46758f.zza();
                if (z && (scheduledFuture = this.f46766n) != null) {
                    scheduledFuture.cancel(false);
                    this.f46766n = null;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @VisibleForTesting
    public final long zza() {
        long convert;
        synchronized (this.f46755c) {
            convert = TimeUnit.MILLISECONDS.convert(this.f46758f.zza() - this.f46764l, TimeUnit.NANOSECONDS);
        }
        return convert;
    }

    public final void zzi(int i, zzuv zzuvVar) {
        float f;
        synchronized (this.f46755c) {
            try {
                if (this.f46769q != 2) {
                    return;
                }
                if (zzuvVar.m46960g() && (!this.f46753a.mo46967l() || this.f46753a.mo46977b() <= 0.0f)) {
                    if (!this.f46768p) {
                        zzpk zzpkVar = zzpk.SCANNER_AUTO_ZOOM_FIRST_ATTEMPT;
                        float f2 = this.f46762j;
                        m46980h(zzpkVar, f2, f2, zzuvVar);
                        this.f46768p = true;
                    }
                    GmsLogger gmsLogger = f46752s;
                    Locale locale = Locale.getDefault();
                    Float valueOf = Float.valueOf(zzuvVar.mo46964c());
                    Float valueOf2 = Float.valueOf(zzuvVar.mo46962e());
                    Float valueOf3 = Float.valueOf(zzuvVar.mo46965b());
                    Float valueOf4 = Float.valueOf(zzuvVar.mo46963d());
                    Float valueOf5 = Float.valueOf(0.0f);
                    Integer valueOf6 = Integer.valueOf(i);
                    gmsLogger.m48401i("AutoZoom", String.format(locale, "Process PredictedArea: [%.2f, %.2f, %.2f, %.2f, %.2f], frameIndex = %d", valueOf, valueOf2, valueOf3, valueOf4, valueOf5, valueOf6));
                    this.f46756d.zzt(valueOf6, zzuvVar);
                    Set<Integer> zzw = this.f46756d.zzw();
                    if (zzw.size() - 1 > this.f46753a.mo46971h()) {
                        int i2 = i;
                        for (Integer num : zzw) {
                            int intValue = num.intValue();
                            if (i2 > intValue) {
                                i2 = intValue;
                            }
                        }
                        GmsLogger gmsLogger2 = f46752s;
                        gmsLogger2.m48401i("AutoZoom", "Removing recent frameIndex = " + i2);
                        this.f46756d.zzf(Integer.valueOf(i2));
                    }
                    HashSet hashSet = new HashSet();
                    for (Map.Entry entry : this.f46756d.zzu()) {
                        if (((Integer) entry.getKey()).intValue() != i) {
                            zzuv zzuvVar2 = (zzuv) entry.getValue();
                            if (!zzuvVar2.m46960g() || !zzuvVar.m46960g()) {
                                f = 0.0f;
                            } else {
                                zzuv zzg = zzuv.zzg(Math.max(zzuvVar2.mo46964c(), zzuvVar.mo46964c()), Math.max(zzuvVar2.mo46962e(), zzuvVar.mo46962e()), Math.min(zzuvVar2.mo46965b(), zzuvVar.mo46965b()), Math.min(zzuvVar2.mo46963d(), zzuvVar.mo46963d()), 0.0f);
                                f = zzg.m46961f() / ((zzuvVar2.m46961f() + zzuvVar.m46961f()) - zzg.m46961f());
                            }
                            if (f >= this.f46753a.mo46975d()) {
                                hashSet.add((Integer) entry.getKey());
                            }
                        }
                    }
                    if (hashSet.size() >= this.f46753a.mo46972g() || (this.f46753a.mo46967l() && this.f46753a.mo46978a() <= 0.0f)) {
                        synchronized (this.f46755c) {
                            if (zza() >= this.f46753a.mo46969j()) {
                                zzdy listIterator = zzcv.zzi(Float.valueOf(zzuvVar.mo46964c()), Float.valueOf(zzuvVar.mo46962e()), Float.valueOf(zzuvVar.mo46965b()), Float.valueOf(zzuvVar.mo46963d())).listIterator(0);
                                float f3 = 1.0E9f;
                                while (listIterator.hasNext()) {
                                    float mo46976c = (this.f46753a.mo46976c() / 2.0f) / Math.max(Math.abs(((Float) listIterator.next()).floatValue() - 0.5f), 0.001f);
                                    if (f3 > mo46976c) {
                                        f3 = mo46976c;
                                    }
                                }
                                float m46981g = m46981g(this.f46762j * f3);
                                if (this.f46753a.mo46968k()) {
                                    float f4 = this.f46762j;
                                    float f5 = (m46981g - f4) / f4;
                                    if (f5 <= this.f46753a.mo46974e() && f5 >= (-this.f46753a.mo46973f())) {
                                        GmsLogger gmsLogger3 = f46752s;
                                        gmsLogger3.m48401i("AutoZoom", "Auto zoom to " + m46981g + " is filtered by threshold");
                                        this.f46764l = this.f46758f.zza();
                                    }
                                }
                                GmsLogger gmsLogger4 = f46752s;
                                gmsLogger4.m48401i("AutoZoom", "Going to set zoom = " + m46981g);
                                m46982f(m46981g, zzpk.SCANNER_AUTO_ZOOM_AUTO_ZOOM, zzuvVar);
                            }
                        }
                    }
                }
            } finally {
            }
        }
    }

    public final void zzj() {
        synchronized (this.f46755c) {
            try {
                if (this.f46769q == 4) {
                    return;
                }
                zzn(false);
                this.f46757e.shutdown();
                this.f46769q = 4;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void zzk(float f) {
        boolean z;
        synchronized (this.f46755c) {
            if (f >= 1.0f) {
                z = true;
            } else {
                z = false;
            }
            zzbc.zzc(z);
            this.f46763k = f;
        }
    }

    public final void zzm() {
        synchronized (this.f46755c) {
            try {
                int i = this.f46769q;
                if (i != 2 && i != 4) {
                    m46979i(true);
                    this.f46766n = this.f46757e.scheduleWithFixedDelay(new Runnable() { // from class: com.google.android.gms.internal.mlkit_vision_barcode.zzuq
                        @Override // java.lang.Runnable
                        public final void run() {
                            zzus.zzf(zzus.this);
                        }
                    }, 500L, 500L, TimeUnit.MILLISECONDS);
                    if (this.f46769q == 1) {
                        this.f46767o = UUID.randomUUID().toString();
                        this.f46765m = this.f46758f.zza();
                        this.f46768p = false;
                        zzpk zzpkVar = zzpk.SCANNER_AUTO_ZOOM_START;
                        float f = this.f46762j;
                        m46980h(zzpkVar, f, f, null);
                    } else {
                        zzpk zzpkVar2 = zzpk.SCANNER_AUTO_ZOOM_RESUME;
                        float f2 = this.f46762j;
                        m46980h(zzpkVar2, f2, f2, null);
                    }
                    this.f46769q = 2;
                }
            } finally {
            }
        }
    }

    public final void zzn(boolean z) {
        synchronized (this.f46755c) {
            try {
                int i = this.f46769q;
                if (i != 1 && i != 4) {
                    m46979i(true);
                    if (z) {
                        if (!this.f46768p) {
                            zzpk zzpkVar = zzpk.SCANNER_AUTO_ZOOM_FIRST_ATTEMPT;
                            float f = this.f46762j;
                            m46980h(zzpkVar, f, f, null);
                        }
                        zzpk zzpkVar2 = zzpk.SCANNER_AUTO_ZOOM_SCAN_SUCCESS;
                        float f2 = this.f46762j;
                        m46980h(zzpkVar2, f2, f2, null);
                    } else {
                        zzpk zzpkVar3 = zzpk.SCANNER_AUTO_ZOOM_SCAN_FAILED;
                        float f3 = this.f46762j;
                        m46980h(zzpkVar3, f3, f3, null);
                    }
                    this.f46768p = false;
                    this.f46769q = 1;
                    this.f46767o = null;
                }
            } finally {
            }
        }
    }

    public final void zzo(zzf zzfVar, Executor executor) {
        this.f46770r = zzfVar;
        this.f46761i = executor;
    }
}