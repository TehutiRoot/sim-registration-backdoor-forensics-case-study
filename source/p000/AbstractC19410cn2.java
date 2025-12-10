package p000;

import androidx.annotation.WorkerThread;
import com.google.android.gms.measurement.internal.zzfy;

/* renamed from: cn2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC19410cn2 extends AbstractC21121mk2 {

    /* renamed from: a */
    public boolean f40222a;

    public AbstractC19410cn2(zzfy zzfyVar) {
        super(zzfyVar);
        this.zzs.m46275d();
    }

    /* renamed from: a */
    public final boolean m51303a() {
        if (this.f40222a) {
            return true;
        }
        return false;
    }

    public final void zza() {
        if (m51303a()) {
            return;
        }
        throw new IllegalStateException("Not initialized");
    }

    public final void zzb() {
        if (!this.f40222a) {
            if (!zzf()) {
                this.zzs.m46277b();
                this.f40222a = true;
                return;
            }
            return;
        }
        throw new IllegalStateException("Can't initialize twice");
    }

    public final void zzc() {
        if (!this.f40222a) {
            zzd();
            this.zzs.m46277b();
            this.f40222a = true;
            return;
        }
        throw new IllegalStateException("Can't initialize twice");
    }

    public abstract boolean zzf();

    @WorkerThread
    public void zzd() {
    }
}
