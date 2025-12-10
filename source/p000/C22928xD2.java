package p000;

import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.measurement.zzfs;
import com.google.android.gms.internal.measurement.zzgc;
import com.google.android.gms.measurement.internal.zzeb;
import com.google.android.gms.measurement.internal.zzkv;
import com.google.android.gms.measurement.internal.zzkz;
import java.util.ArrayList;
import java.util.List;

/* renamed from: xD2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C22928xD2 {

    /* renamed from: a */
    public zzgc f108275a;

    /* renamed from: b */
    public List f108276b;

    /* renamed from: c */
    public List f108277c;

    /* renamed from: d */
    public long f108278d;

    /* renamed from: e */
    public final /* synthetic */ zzkz f108279e;

    public /* synthetic */ C22928xD2(zzkz zzkzVar, zzkv zzkvVar) {
        this.f108279e = zzkzVar;
    }

    /* renamed from: b */
    public static final long m592b(zzfs zzfsVar) {
        return ((zzfsVar.zzd() / 1000) / 60) / 60;
    }

    /* renamed from: a */
    public final boolean m593a(long j, zzfs zzfsVar) {
        Preconditions.checkNotNull(zzfsVar);
        if (this.f108277c == null) {
            this.f108277c = new ArrayList();
        }
        if (this.f108276b == null) {
            this.f108276b = new ArrayList();
        }
        if (!this.f108277c.isEmpty() && m592b((zzfs) this.f108277c.get(0)) != m592b(zzfsVar)) {
            return false;
        }
        long zzbw = this.f108278d + zzfsVar.zzbw();
        this.f108279e.zzg();
        if (zzbw >= Math.max(0, ((Integer) zzeb.zzh.zza(null)).intValue())) {
            return false;
        }
        this.f108278d = zzbw;
        this.f108277c.add(zzfsVar);
        this.f108276b.add(Long.valueOf(j));
        int size = this.f108277c.size();
        this.f108279e.zzg();
        if (size >= Math.max(1, ((Integer) zzeb.zzi.zza(null)).intValue())) {
            return false;
        }
        return true;
    }
}
