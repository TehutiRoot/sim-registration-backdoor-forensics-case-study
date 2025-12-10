package p000;

import android.os.Looper;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* renamed from: IW1 */
/* loaded from: classes5.dex */
public abstract class IW1 {

    /* renamed from: a */
    public Set f2533a = new HashSet();

    /* renamed from: a */
    public void m67895a(Object obj) {
        if (Thread.currentThread() == Looper.getMainLooper().getThread()) {
            this.f2533a.add(obj);
            return;
        }
        throw new RuntimeException("Can't add an activity when not on the UI thread");
    }

    /* renamed from: b */
    public Set m67894b() {
        if (Thread.currentThread() == Looper.getMainLooper().getThread()) {
            return Collections.unmodifiableSet(this.f2533a);
        }
        throw new RuntimeException("Can't remove an activity when not on the UI thread");
    }

    /* renamed from: c */
    public void m67893c(Object obj) {
        if (Thread.currentThread() == Looper.getMainLooper().getThread()) {
            this.f2533a.remove(obj);
            return;
        }
        throw new RuntimeException("Can't remove an activity when not on the UI thread");
    }
}
