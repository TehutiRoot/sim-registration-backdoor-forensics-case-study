package p000;

import android.database.ContentObserver;
import android.os.Handler;
import com.google.android.gms.internal.measurement.zzgz;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: Os2 */
/* loaded from: classes3.dex */
public final class Os2 extends ContentObserver {
    public Os2(Handler handler) {
        super(null);
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z) {
        AtomicBoolean atomicBoolean;
        atomicBoolean = zzgz.f46275a;
        atomicBoolean.set(true);
    }
}
