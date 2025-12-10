package p000;

import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.measurement.zzfs;
import com.google.android.gms.internal.measurement.zzgc;
import com.google.android.gms.measurement.internal.zzeb;
import com.google.android.gms.measurement.internal.zzkv;
import com.google.android.gms.measurement.internal.zzkz;
import java.util.ArrayList;
import java.util.List;

/* renamed from: uE2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C22481uE2 {

    /* renamed from: a */
    public zzgc f107662a;

    /* renamed from: b */
    public List f107663b;

    /* renamed from: c */
    public List f107664c;

    /* renamed from: d */
    public long f107665d;

    /* renamed from: e */
    public final /* synthetic */ zzkz f107666e;

    public /* synthetic */ C22481uE2(zzkz zzkzVar, zzkv zzkvVar) {
        this.f107666e = zzkzVar;
    }

    /* renamed from: b */
    public static final long m1243b(zzfs zzfsVar) {
        return ((zzfsVar.zzd() / 1000) / 60) / 60;
    }

    /* renamed from: a */
    public final boolean m1244a(long j, zzfs zzfsVar) {
        Preconditions.checkNotNull(zzfsVar);
        if (this.f107664c == null) {
            this.f107664c = new ArrayList();
        }
        if (this.f107663b == null) {
            this.f107663b = new ArrayList();
        }
        if (!this.f107664c.isEmpty() && m1243b((zzfs) this.f107664c.get(0)) != m1243b(zzfsVar)) {
            return false;
        }
        long zzbw = this.f107665d + zzfsVar.zzbw();
        this.f107666e.zzg();
        if (zzbw >= Math.max(0, ((Integer) zzeb.zzh.zza(null)).intValue())) {
            return false;
        }
        this.f107665d = zzbw;
        this.f107664c.add(zzfsVar);
        this.f107663b.add(Long.valueOf(j));
        int size = this.f107664c.size();
        this.f107666e.zzg();
        if (size >= Math.max(1, ((Integer) zzeb.zzi.zza(null)).intValue())) {
            return false;
        }
        return true;
    }
}