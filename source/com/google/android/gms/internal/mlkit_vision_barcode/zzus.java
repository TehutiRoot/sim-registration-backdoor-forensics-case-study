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
    public static final GmsLogger f46740s = new GmsLogger("AutoZoom");

    /* renamed from: a */
    public final zzuu f46741a;

    /* renamed from: b */
    public final AtomicBoolean f46742b;

    /* renamed from: c */
    public final Object f46743c;

    /* renamed from: d */
    public final zzbz f46744d;

    /* renamed from: e */
    public final ScheduledExecutorService f46745e;

    /* renamed from: f */
    public final zzbf f46746f;

    /* renamed from: g */
    public final zztx f46747g;

    /* renamed from: h */
    public final String f46748h;

    /* renamed from: i */
    public Executor f46749i;

    /* renamed from: j */
    public float f46750j;

    /* renamed from: k */
    public float f46751k;

    /* renamed from: l */
    public long f46752l;

    /* renamed from: m */
    public long f46753m;

    /* renamed from: n */
    public ScheduledFuture f46754n;

    /* renamed from: o */
    public String f46755o;

    /* renamed from: p */
    public boolean f46756p;

    /* renamed from: q */
    public int f46757q;

    /* renamed from: r */
    public zzf f46758r;

    public zzus(Context context, zzuu zzuuVar, String str) {
        zzg.zza();
        ScheduledExecutorService unconfigurableScheduledExecutorService = Executors.unconfigurableScheduledExecutorService(Executors.newScheduledThreadPool(2));
        zzbf zza = zzar.zza();
        zztx zztxVar = new zztx(context, new SharedPrefManager(context), new zztq(context, zztp.zzd("scanner-auto-zoom").zzd()), "scanner-auto-zoom");
        this.f46743c = new Object();
        this.f46741a = zzuuVar;
        this.f46742b = new AtomicBoolean(false);
        this.f46744d = zzbz.zzz();
        this.f46745e = unconfigurableScheduledExecutorService;
        this.f46746f = zza;
        this.f46747g = zztxVar;
        this.f46748h = str;
        this.f46757q = 1;
        this.f46750j = 1.0f;
        this.f46751k = -1.0f;
        this.f46752l = zza.zza();
    }

    /* renamed from: d */
    public static /* bridge */ /* synthetic */ void m46975d(zzus zzusVar, float f) {
        synchronized (zzusVar.f46743c) {
            zzusVar.f46750j = f;
            zzusVar.m46970i(false);
        }
    }

    public static zzus zzd(Context context, String str) {
        return new zzus(context, zzuu.zzb, str);
    }

    public static /* synthetic */ void zzf(zzus zzusVar) {
        ScheduledFuture scheduledFuture;
        synchronized (zzusVar.f46743c) {
            try {
                if (zzusVar.f46757q == 2 && !zzusVar.f46742b.get() && (scheduledFuture = zzusVar.f46754n) != null && !scheduledFuture.isCancelled()) {
                    if (zzusVar.f46750j > 1.0f && zzusVar.zza() >= zzusVar.f46741a.mo31571i()) {
                        f46740s.m48404i("AutoZoom", "Reset zoom = 1");
                        zzusVar.m46973f(1.0f, zzpk.SCANNER_AUTO_ZOOM_AUTO_RESET, null);
                    }
                }
            } finally {
            }
        }
    }

    /* renamed from: b */
    public final /* synthetic */ zzev m46977b(float f) {
        zzf zzfVar = this.f46758r;
        float m46972g = m46972g(f);
        ZoomSuggestionOptions zoomSuggestionOptions = zzfVar.zza;
        BarcodeScannerOptions barcodeScannerOptions = BarcodeScannerImpl.f57066l;
        if (true != zoomSuggestionOptions.zzb().setZoom(m46972g)) {
            m46972g = 0.0f;
        }
        return zzem.zza(Float.valueOf(m46972g));
    }

    /* renamed from: f */
    public final void m46973f(float f, zzpk zzpkVar, zzuv zzuvVar) {
        synchronized (this.f46743c) {
            try {
                if (this.f46749i != null && this.f46758r != null && this.f46757q == 2) {
                    if (!this.f46742b.compareAndSet(false, true)) {
                        return;
                    }
                    zzem.zzb(zzem.zzc(new zzup(this, f), this.f46749i), new C20025gK2(this, zzpkVar, this.f46750j, zzuvVar, f), zzew.zza());
                }
            } finally {
            }
        }
    }

    /* renamed from: g */
    public final float m46972g(float f) {
        int i = (f > 1.0f ? 1 : (f == 1.0f ? 0 : -1));
        float f2 = this.f46751k;
        if (i < 0) {
            f = 1.0f;
        }
        return (f2 <= 0.0f || f <= f2) ? f : f2;
    }

    /* renamed from: h */
    public final void m46971h(zzpk zzpkVar, float f, float f2, zzuv zzuvVar) {
        long convert;
        if (this.f46755o != null) {
            zzsb zzsbVar = new zzsb();
            zzsbVar.zza(this.f46748h);
            String str = this.f46755o;
            str.getClass();
            zzsbVar.zze(str);
            zzsbVar.zzf(Float.valueOf(f));
            zzsbVar.zzc(Float.valueOf(f2));
            synchronized (this.f46743c) {
                convert = TimeUnit.MILLISECONDS.convert(this.f46746f.zza() - this.f46753m, TimeUnit.NANOSECONDS);
            }
            zzsbVar.zzb(Long.valueOf(convert));
            if (zzuvVar != null) {
                zzsc zzscVar = new zzsc();
                zzscVar.zzc(Float.valueOf(zzuvVar.mo31316c()));
                zzscVar.zze(Float.valueOf(zzuvVar.mo31314e()));
                zzscVar.zzb(Float.valueOf(zzuvVar.mo31317b()));
                zzscVar.zzd(Float.valueOf(zzuvVar.mo31315d()));
                zzscVar.zza(Float.valueOf(0.0f));
                zzsbVar.zzd(zzscVar.zzf());
            }
            zztx zztxVar = this.f46747g;
            zzpl zzplVar = new zzpl();
            zzplVar.zzi(zzsbVar.zzh());
            zztxVar.zzd(zzua.zzf(zzplVar), zzpkVar);
        }
    }

    /* renamed from: i */
    public final void m46970i(boolean z) {
        ScheduledFuture scheduledFuture;
        synchronized (this.f46743c) {
            try {
                this.f46744d.zzs();
                this.f46752l = this.f46746f.zza();
                if (z && (scheduledFuture = this.f46754n) != null) {
                    scheduledFuture.cancel(false);
                    this.f46754n = null;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @VisibleForTesting
    public final long zza() {
        long convert;
        synchronized (this.f46743c) {
            convert = TimeUnit.MILLISECONDS.convert(this.f46746f.zza() - this.f46752l, TimeUnit.NANOSECONDS);
        }
        return convert;
    }

    public final void zzi(int i, zzuv zzuvVar) {
        float f;
        synchronized (this.f46743c) {
            try {
                if (this.f46757q != 2) {
                    return;
                }
                if (zzuvVar.m46968g() && (!this.f46741a.mo31568l() || this.f46741a.mo31578b() <= 0.0f)) {
                    if (!this.f46756p) {
                        zzpk zzpkVar = zzpk.SCANNER_AUTO_ZOOM_FIRST_ATTEMPT;
                        float f2 = this.f46750j;
                        m46971h(zzpkVar, f2, f2, zzuvVar);
                        this.f46756p = true;
                    }
                    GmsLogger gmsLogger = f46740s;
                    Locale locale = Locale.getDefault();
                    Float valueOf = Float.valueOf(zzuvVar.mo31316c());
                    Float valueOf2 = Float.valueOf(zzuvVar.mo31314e());
                    Float valueOf3 = Float.valueOf(zzuvVar.mo31317b());
                    Float valueOf4 = Float.valueOf(zzuvVar.mo31315d());
                    Float valueOf5 = Float.valueOf(0.0f);
                    Integer valueOf6 = Integer.valueOf(i);
                    gmsLogger.m48404i("AutoZoom", String.format(locale, "Process PredictedArea: [%.2f, %.2f, %.2f, %.2f, %.2f], frameIndex = %d", valueOf, valueOf2, valueOf3, valueOf4, valueOf5, valueOf6));
                    this.f46744d.zzt(valueOf6, zzuvVar);
                    Set<Integer> zzw = this.f46744d.zzw();
                    if (zzw.size() - 1 > this.f46741a.mo31572h()) {
                        int i2 = i;
                        for (Integer num : zzw) {
                            int intValue = num.intValue();
                            if (i2 > intValue) {
                                i2 = intValue;
                            }
                        }
                        GmsLogger gmsLogger2 = f46740s;
                        gmsLogger2.m48404i("AutoZoom", "Removing recent frameIndex = " + i2);
                        this.f46744d.zzf(Integer.valueOf(i2));
                    }
                    HashSet hashSet = new HashSet();
                    for (Map.Entry entry : this.f46744d.zzu()) {
                        if (((Integer) entry.getKey()).intValue() != i) {
                            zzuv zzuvVar2 = (zzuv) entry.getValue();
                            if (!zzuvVar2.m46968g() || !zzuvVar.m46968g()) {
                                f = 0.0f;
                            } else {
                                zzuv zzg = zzuv.zzg(Math.max(zzuvVar2.mo31316c(), zzuvVar.mo31316c()), Math.max(zzuvVar2.mo31314e(), zzuvVar.mo31314e()), Math.min(zzuvVar2.mo31317b(), zzuvVar.mo31317b()), Math.min(zzuvVar2.mo31315d(), zzuvVar.mo31315d()), 0.0f);
                                f = zzg.m46969f() / ((zzuvVar2.m46969f() + zzuvVar.m46969f()) - zzg.m46969f());
                            }
                            if (f >= this.f46741a.mo31576d()) {
                                hashSet.add((Integer) entry.getKey());
                            }
                        }
                    }
                    if (hashSet.size() >= this.f46741a.mo31573g() || (this.f46741a.mo31568l() && this.f46741a.mo31579a() <= 0.0f)) {
                        synchronized (this.f46743c) {
                            if (zza() >= this.f46741a.mo31570j()) {
                                zzdy listIterator = zzcv.zzi(Float.valueOf(zzuvVar.mo31316c()), Float.valueOf(zzuvVar.mo31314e()), Float.valueOf(zzuvVar.mo31317b()), Float.valueOf(zzuvVar.mo31315d())).listIterator(0);
                                float f3 = 1.0E9f;
                                while (listIterator.hasNext()) {
                                    float mo31577c = (this.f46741a.mo31577c() / 2.0f) / Math.max(Math.abs(((Float) listIterator.next()).floatValue() - 0.5f), 0.001f);
                                    if (f3 > mo31577c) {
                                        f3 = mo31577c;
                                    }
                                }
                                float m46972g = m46972g(this.f46750j * f3);
                                if (this.f46741a.mo31569k()) {
                                    float f4 = this.f46750j;
                                    float f5 = (m46972g - f4) / f4;
                                    if (f5 <= this.f46741a.mo31575e() && f5 >= (-this.f46741a.mo31574f())) {
                                        GmsLogger gmsLogger3 = f46740s;
                                        gmsLogger3.m48404i("AutoZoom", "Auto zoom to " + m46972g + " is filtered by threshold");
                                        this.f46752l = this.f46746f.zza();
                                    }
                                }
                                GmsLogger gmsLogger4 = f46740s;
                                gmsLogger4.m48404i("AutoZoom", "Going to set zoom = " + m46972g);
                                m46973f(m46972g, zzpk.SCANNER_AUTO_ZOOM_AUTO_ZOOM, zzuvVar);
                            }
                        }
                    }
                }
            } finally {
            }
        }
    }

    public final void zzj() {
        synchronized (this.f46743c) {
            try {
                if (this.f46757q == 4) {
                    return;
                }
                zzn(false);
                this.f46745e.shutdown();
                this.f46757q = 4;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void zzk(float f) {
        boolean z;
        synchronized (this.f46743c) {
            if (f >= 1.0f) {
                z = true;
            } else {
                z = false;
            }
            zzbc.zzc(z);
            this.f46751k = f;
        }
    }

    public final void zzm() {
        synchronized (this.f46743c) {
            try {
                int i = this.f46757q;
                if (i != 2 && i != 4) {
                    m46970i(true);
                    this.f46754n = this.f46745e.scheduleWithFixedDelay(new Runnable() { // from class: com.google.android.gms.internal.mlkit_vision_barcode.zzuq
                        {
                            zzus.this = this;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            zzus.zzf(zzus.this);
                        }
                    }, 500L, 500L, TimeUnit.MILLISECONDS);
                    if (this.f46757q == 1) {
                        this.f46755o = UUID.randomUUID().toString();
                        this.f46753m = this.f46746f.zza();
                        this.f46756p = false;
                        zzpk zzpkVar = zzpk.SCANNER_AUTO_ZOOM_START;
                        float f = this.f46750j;
                        m46971h(zzpkVar, f, f, null);
                    } else {
                        zzpk zzpkVar2 = zzpk.SCANNER_AUTO_ZOOM_RESUME;
                        float f2 = this.f46750j;
                        m46971h(zzpkVar2, f2, f2, null);
                    }
                    this.f46757q = 2;
                }
            } finally {
            }
        }
    }

    public final void zzn(boolean z) {
        synchronized (this.f46743c) {
            try {
                int i = this.f46757q;
                if (i != 1 && i != 4) {
                    m46970i(true);
                    if (z) {
                        if (!this.f46756p) {
                            zzpk zzpkVar = zzpk.SCANNER_AUTO_ZOOM_FIRST_ATTEMPT;
                            float f = this.f46750j;
                            m46971h(zzpkVar, f, f, null);
                        }
                        zzpk zzpkVar2 = zzpk.SCANNER_AUTO_ZOOM_SCAN_SUCCESS;
                        float f2 = this.f46750j;
                        m46971h(zzpkVar2, f2, f2, null);
                    } else {
                        zzpk zzpkVar3 = zzpk.SCANNER_AUTO_ZOOM_SCAN_FAILED;
                        float f3 = this.f46750j;
                        m46971h(zzpkVar3, f3, f3, null);
                    }
                    this.f46756p = false;
                    this.f46757q = 1;
                    this.f46755o = null;
                }
            } finally {
            }
        }
    }

    public final void zzo(zzf zzfVar, Executor executor) {
        this.f46758r = zzfVar;
        this.f46749i = executor;
    }
}
