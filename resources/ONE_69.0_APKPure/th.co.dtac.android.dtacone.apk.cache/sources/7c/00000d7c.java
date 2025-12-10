package p000;

import com.google.android.gms.measurement.internal.AbstractC6724i0;
import com.google.android.gms.measurement.internal.zzkz;

/* renamed from: OD2 */
/* loaded from: classes3.dex */
public abstract class OD2 extends AbstractC6724i0 {

    /* renamed from: a */
    public boolean f4391a;

    public OD2(zzkz zzkzVar) {
        super(zzkzVar);
        this.zzf.m46159m();
    }

    /* renamed from: a */
    public final boolean m67142a() {
        if (this.f4391a) {
            return true;
        }
        return false;
    }

    public final void zzW() {
        if (m67142a()) {
            return;
        }
        throw new IllegalStateException("Not initialized");
    }

    public final void zzX() {
        if (!this.f4391a) {
            zzb();
            this.zzf.m46164h();
            this.f4391a = true;
            return;
        }
        throw new IllegalStateException("Can't initialize twice");
    }

    public abstract boolean zzb();
}