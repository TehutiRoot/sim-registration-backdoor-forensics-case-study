package p000;

import android.database.ContentObserver;
import android.os.Handler;
import com.google.android.gms.internal.measurement.zzgz;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: Lt2 */
/* loaded from: classes3.dex */
public final class Lt2 extends ContentObserver {
    public Lt2(Handler handler) {
        super(null);
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z) {
        AtomicBoolean atomicBoolean;
        atomicBoolean = zzgz.f46287a;
        atomicBoolean.set(true);
    }
}