package p000;

import android.database.ContentObserver;
import android.os.Handler;
import com.google.android.gms.internal.phenotype.zzf;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: Zq2 */
/* loaded from: classes3.dex */
public final class Zq2 extends ContentObserver {
    public Zq2(Handler handler) {
        super(null);
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z) {
        AtomicBoolean atomicBoolean;
        atomicBoolean = zzf.f47478e;
        atomicBoolean.set(true);
    }
}