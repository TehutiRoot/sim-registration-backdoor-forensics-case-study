package com.google.android.gms.internal.measurement;

import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;

/* loaded from: classes3.dex */
public final class zzc {

    /* renamed from: a */
    public final zzf f46253a;

    /* renamed from: b */
    public zzg f46254b;

    /* renamed from: c */
    public final zzab f46255c;

    /* renamed from: d */
    public final zzz f46256d;

    public zzc() {
        zzf zzfVar = new zzf();
        this.f46253a = zzfVar;
        this.f46254b = zzfVar.f46268b.zza();
        this.f46255c = new zzab();
        this.f46256d = new zzz();
        zzfVar.f46270d.zza("internal.registerCallback", new Callable() { // from class: com.google.android.gms.internal.measurement.zza
            {
                zzc.this = this;
            }

            @Override // java.util.concurrent.Callable
            public final Object call() {
                return zzc.this.m47330a();
            }
        });
        zzfVar.f46270d.zza("internal.eventLogger", new Callable() { // from class: com.google.android.gms.internal.measurement.zzb
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return new zzk(zzc.this.f46255c);
            }
        });
    }

    /* renamed from: a */
    public final /* synthetic */ zzai m47330a() {
        return new zzv(this.f46256d);
    }

    public final zzab zza() {
        return this.f46255c;
    }

    public final void zzc(zzgs zzgsVar) throws zzd {
        zzai zzaiVar;
        try {
            this.f46254b = this.f46253a.f46268b.zza();
            if (!(this.f46253a.zza(this.f46254b, (zzgx[]) zzgsVar.zzc().toArray(new zzgx[0])) instanceof zzag)) {
                for (zzgq zzgqVar : zzgsVar.zza().zzd()) {
                    List zzc = zzgqVar.zzc();
                    String zzb = zzgqVar.zzb();
                    Iterator it = zzc.iterator();
                    while (it.hasNext()) {
                        zzap zza = this.f46253a.zza(this.f46254b, (zzgx) it.next());
                        if (zza instanceof zzam) {
                            zzg zzgVar = this.f46254b;
                            if (!zzgVar.zzh(zzb)) {
                                zzaiVar = null;
                            } else {
                                zzap zzd = zzgVar.zzd(zzb);
                                if (zzd instanceof zzai) {
                                    zzaiVar = (zzai) zzd;
                                } else {
                                    throw new IllegalStateException("Invalid function name: ".concat(String.valueOf(zzb)));
                                }
                            }
                            if (zzaiVar != null) {
                                zzaiVar.zza(this.f46254b, Collections.singletonList(zza));
                            } else {
                                throw new IllegalStateException("Rule function is undefined: ".concat(String.valueOf(zzb)));
                            }
                        } else {
                            throw new IllegalArgumentException("Invalid rule definition");
                        }
                    }
                }
                return;
            }
            throw new IllegalStateException("Program loading failed");
        } catch (Throwable th2) {
            throw new zzd(th2);
        }
    }

    public final void zzd(String str, Callable callable) {
        this.f46253a.f46270d.zza(str, callable);
    }

    public final boolean zze(zzaa zzaaVar) throws zzd {
        try {
            this.f46255c.zzd(zzaaVar);
            this.f46253a.f46269c.zzg("runtime.counter", new zzah(Double.valueOf(0.0d)));
            this.f46256d.zzb(this.f46254b.zza(), this.f46255c);
            if (!zzg()) {
                if (!zzf()) {
                    return false;
                }
                return true;
            }
            return true;
        } catch (Throwable th2) {
            throw new zzd(th2);
        }
    }

    public final boolean zzf() {
        if (!this.f46255c.zzc().isEmpty()) {
            return true;
        }
        return false;
    }

    public final boolean zzg() {
        zzab zzabVar = this.f46255c;
        if (!zzabVar.zzb().equals(zzabVar.zza())) {
            return true;
        }
        return false;
    }
}
