package p000;

import com.google.android.gms.measurement.internal.AbstractC6735i0;
import com.google.android.gms.measurement.internal.zzkz;

/* renamed from: RC2 */
/* loaded from: classes3.dex */
public abstract class RC2 extends AbstractC6735i0 {

    /* renamed from: a */
    public boolean f5289a;

    public RC2(zzkz zzkzVar) {
        super(zzkzVar);
        this.zzf.m46174m();
    }

    /* renamed from: a */
    public final boolean m66488a() {
        if (this.f5289a) {
            return true;
        }
        return false;
    }

    public final void zzW() {
        if (m66488a()) {
            return;
        }
        throw new IllegalStateException("Not initialized");
    }

    public final void zzX() {
        if (!this.f5289a) {
            zzb();
            this.zzf.m46179h();
            this.f5289a = true;
            return;
        }
        throw new IllegalStateException("Can't initialize twice");
    }

    public abstract boolean zzb();
}
