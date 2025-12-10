package p000;

import android.database.ContentObserver;
import android.os.Handler;
import com.google.android.gms.internal.clearcut.zzy;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: yL2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C23124yL2 extends ContentObserver {
    public C23124yL2(Handler handler) {
        super(null);
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z) {
        AtomicBoolean atomicBoolean;
        atomicBoolean = zzy.f45652c;
        atomicBoolean.set(true);
    }
}
