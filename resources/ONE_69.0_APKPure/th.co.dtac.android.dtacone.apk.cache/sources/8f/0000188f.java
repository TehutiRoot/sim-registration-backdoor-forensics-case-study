package p000;

import androidx.annotation.WorkerThread;
import com.google.android.gms.measurement.internal.zzfy;

/* renamed from: Zn2 */
/* loaded from: classes3.dex */
public abstract class Zn2 extends AbstractC20664jl2 {

    /* renamed from: a */
    public boolean f8274a;

    public Zn2(zzfy zzfyVar) {
        super(zzfyVar);
        this.zzs.m46260d();
    }

    /* renamed from: a */
    public final boolean m65199a() {
        if (this.f8274a) {
            return true;
        }
        return false;
    }

    public final void zza() {
        if (m65199a()) {
            return;
        }
        throw new IllegalStateException("Not initialized");
    }

    public final void zzb() {
        if (!this.f8274a) {
            if (!zzf()) {
                this.zzs.m46262b();
                this.f8274a = true;
                return;
            }
            return;
        }
        throw new IllegalStateException("Can't initialize twice");
    }

    public final void zzc() {
        if (!this.f8274a) {
            zzd();
            this.zzs.m46262b();
            this.f8274a = true;
            return;
        }
        throw new IllegalStateException("Can't initialize twice");
    }

    public abstract boolean zzf();

    @WorkerThread
    public void zzd() {
    }
}