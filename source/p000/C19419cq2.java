package p000;

import android.database.ContentObserver;
import android.os.Handler;
import com.google.android.gms.internal.phenotype.zzf;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: cq2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C19419cq2 extends ContentObserver {
    public C19419cq2(Handler handler) {
        super(null);
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z) {
        AtomicBoolean atomicBoolean;
        atomicBoolean = zzf.f47466e;
        atomicBoolean.set(true);
    }
}
