package p000;

import android.database.ContentObserver;
import android.os.Handler;
import com.google.android.gms.internal.clearcut.zzy;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: vM2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C22678vM2 extends ContentObserver {
    public C22678vM2(Handler handler) {
        super(null);
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z) {
        AtomicBoolean atomicBoolean;
        atomicBoolean = zzy.f45664c;
        atomicBoolean.set(true);
    }
}