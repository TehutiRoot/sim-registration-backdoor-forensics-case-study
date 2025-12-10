package p000;

import com.google.android.gms.measurement.internal.AbstractC6736j;
import com.google.android.gms.measurement.internal.zzfy;

/* renamed from: hs2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC20285hs2 extends AbstractC6736j {

    /* renamed from: a */
    public boolean f62621a;

    public AbstractC20285hs2(zzfy zzfyVar) {
        super(zzfyVar);
        this.zzs.m46275d();
    }

    /* renamed from: a */
    public final boolean m30739a() {
        if (this.f62621a) {
            return true;
        }
        return false;
    }

    public abstract boolean zzf();

    public final void zzu() {
        if (m30739a()) {
            return;
        }
        throw new IllegalStateException("Not initialized");
    }

    public final void zzv() {
        if (!this.f62621a) {
            if (!zzf()) {
                this.zzs.m46277b();
                this.f62621a = true;
                return;
            }
            return;
        }
        throw new IllegalStateException("Can't initialize twice");
    }

    public final void zzw() {
        if (!this.f62621a) {
            zzaA();
            this.zzs.m46277b();
            this.f62621a = true;
            return;
        }
        throw new IllegalStateException("Can't initialize twice");
    }

    public void zzaA() {
    }
}
