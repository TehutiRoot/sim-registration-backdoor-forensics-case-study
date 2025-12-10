package p000;

import android.database.ContentObserver;
import android.os.Handler;
import com.google.android.gms.internal.vision.zzaq;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: Cc2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C17397Cc2 extends ContentObserver {
    public C17397Cc2(Handler handler) {
        super(null);
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z) {
        AtomicBoolean atomicBoolean;
        atomicBoolean = zzaq.f47543c;
        atomicBoolean.set(true);
    }
}
