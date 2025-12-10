package p000;

import android.os.Looper;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* renamed from: FX1 */
/* loaded from: classes5.dex */
public abstract class FX1 {

    /* renamed from: a */
    public Set f1711a = new HashSet();

    /* renamed from: a */
    public void m68406a(Object obj) {
        if (Thread.currentThread() == Looper.getMainLooper().getThread()) {
            this.f1711a.add(obj);
            return;
        }
        throw new RuntimeException("Can't add an activity when not on the UI thread");
    }

    /* renamed from: b */
    public Set m68405b() {
        if (Thread.currentThread() == Looper.getMainLooper().getThread()) {
            return Collections.unmodifiableSet(this.f1711a);
        }
        throw new RuntimeException("Can't remove an activity when not on the UI thread");
    }

    /* renamed from: c */
    public void m68404c(Object obj) {
        if (Thread.currentThread() == Looper.getMainLooper().getThread()) {
            this.f1711a.remove(obj);
            return;
        }
        throw new RuntimeException("Can't remove an activity when not on the UI thread");
    }
}