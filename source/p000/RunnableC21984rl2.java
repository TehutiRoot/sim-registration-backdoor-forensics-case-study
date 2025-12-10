package p000;

import com.google.android.gms.internal.mlkit_vision_barcode.zzaw;
import com.google.android.gms.internal.mlkit_vision_barcode.zzax;
import com.google.android.gms.internal.mlkit_vision_barcode.zzbd;
import com.google.android.gms.internal.mlkit_vision_barcode.zzek;
import com.google.android.gms.internal.mlkit_vision_barcode.zzez;
import com.google.android.gms.internal.mlkit_vision_barcode.zzfa;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

/* renamed from: rl2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class RunnableC21984rl2 implements Runnable {

    /* renamed from: a */
    public final Future f77397a;

    /* renamed from: b */
    public final zzek f77398b;

    public RunnableC21984rl2(Future future, zzek zzekVar) {
        this.f77397a = future;
        this.f77398b = zzekVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object obj;
        boolean z = false;
        Throwable zza = zzfa.zza((zzez) this.f77397a);
        if (zza == null) {
            try {
                Future future = this.f77397a;
                if (future.isDone()) {
                    while (true) {
                        try {
                            obj = future.get();
                            break;
                        } catch (InterruptedException unused) {
                            z = true;
                        } catch (Throwable th2) {
                            if (z) {
                                Thread.currentThread().interrupt();
                            }
                            throw th2;
                        }
                    }
                    if (z) {
                        Thread.currentThread().interrupt();
                    }
                    this.f77398b.zzb(obj);
                    return;
                }
                throw new IllegalStateException(zzbd.zzb("Future was expected to be done: %s", future));
            } catch (Error e) {
                e = e;
                this.f77398b.zza(e);
                return;
            } catch (RuntimeException e2) {
                e = e2;
                this.f77398b.zza(e);
                return;
            } catch (ExecutionException e3) {
                this.f77398b.zza(e3.getCause());
                return;
            }
        }
        this.f77398b.zza(zza);
    }

    public final String toString() {
        zzaw zza = zzax.zza(this);
        zza.zza(this.f77398b);
        return zza.toString();
    }
}
