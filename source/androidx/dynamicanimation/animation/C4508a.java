package androidx.dynamicanimation.animation;

import android.os.SystemClock;
import android.view.Choreographer;
import androidx.collection.SimpleArrayMap;
import java.util.ArrayList;

/* renamed from: androidx.dynamicanimation.animation.a */
/* loaded from: classes2.dex */
public class C4508a {

    /* renamed from: g */
    public static final ThreadLocal f35100g = new ThreadLocal();

    /* renamed from: d */
    public AbstractC4511c f35104d;

    /* renamed from: a */
    public final SimpleArrayMap f35101a = new SimpleArrayMap();

    /* renamed from: b */
    public final ArrayList f35102b = new ArrayList();

    /* renamed from: c */
    public final C4509a f35103c = new C4509a();

    /* renamed from: e */
    public long f35105e = 0;

    /* renamed from: f */
    public boolean f35106f = false;

    /* renamed from: androidx.dynamicanimation.animation.a$a */
    /* loaded from: classes2.dex */
    public class C4509a {
        public C4509a() {
        }

        /* renamed from: a */
        public void m54797a() {
            C4508a.this.f35105e = SystemClock.uptimeMillis();
            C4508a c4508a = C4508a.this;
            c4508a.m54802c(c4508a.f35105e);
            if (C4508a.this.f35102b.size() > 0) {
                C4508a.this.m54800e().mo54796a();
            }
        }
    }

    /* renamed from: androidx.dynamicanimation.animation.a$b */
    /* loaded from: classes2.dex */
    public interface InterfaceC4510b {
        boolean doAnimationFrame(long j);
    }

    /* renamed from: androidx.dynamicanimation.animation.a$c */
    /* loaded from: classes2.dex */
    public static abstract class AbstractC4511c {

        /* renamed from: a */
        public final C4509a f35108a;

        public AbstractC4511c(C4509a c4509a) {
            this.f35108a = c4509a;
        }

        /* renamed from: a */
        public abstract void mo54796a();
    }

    /* renamed from: androidx.dynamicanimation.animation.a$d */
    /* loaded from: classes2.dex */
    public static class C4512d extends AbstractC4511c {

        /* renamed from: b */
        public final Choreographer f35109b;

        /* renamed from: c */
        public final Choreographer.FrameCallback f35110c;

        /* renamed from: androidx.dynamicanimation.animation.a$d$a */
        /* loaded from: classes2.dex */
        public class Choreographer$FrameCallbackC4513a implements Choreographer.FrameCallback {
            public Choreographer$FrameCallbackC4513a() {
            }

            @Override // android.view.Choreographer.FrameCallback
            public void doFrame(long j) {
                C4512d.this.f35108a.m54797a();
            }
        }

        public C4512d(C4509a c4509a) {
            super(c4509a);
            this.f35109b = Choreographer.getInstance();
            this.f35110c = new Choreographer$FrameCallbackC4513a();
        }

        @Override // androidx.dynamicanimation.animation.C4508a.AbstractC4511c
        /* renamed from: a */
        public void mo54796a() {
            this.f35109b.postFrameCallback(this.f35110c);
        }
    }

    /* renamed from: d */
    public static C4508a m54801d() {
        ThreadLocal threadLocal = f35100g;
        if (threadLocal.get() == null) {
            threadLocal.set(new C4508a());
        }
        return (C4508a) threadLocal.get();
    }

    /* renamed from: a */
    public void m54804a(InterfaceC4510b interfaceC4510b, long j) {
        if (this.f35102b.size() == 0) {
            m54800e().mo54796a();
        }
        if (!this.f35102b.contains(interfaceC4510b)) {
            this.f35102b.add(interfaceC4510b);
        }
        if (j > 0) {
            this.f35101a.put(interfaceC4510b, Long.valueOf(SystemClock.uptimeMillis() + j));
        }
    }

    /* renamed from: b */
    public final void m54803b() {
        if (this.f35106f) {
            for (int size = this.f35102b.size() - 1; size >= 0; size--) {
                if (this.f35102b.get(size) == null) {
                    this.f35102b.remove(size);
                }
            }
            this.f35106f = false;
        }
    }

    /* renamed from: c */
    public void m54802c(long j) {
        long uptimeMillis = SystemClock.uptimeMillis();
        for (int i = 0; i < this.f35102b.size(); i++) {
            InterfaceC4510b interfaceC4510b = (InterfaceC4510b) this.f35102b.get(i);
            if (interfaceC4510b != null && m54799f(interfaceC4510b, uptimeMillis)) {
                interfaceC4510b.doAnimationFrame(j);
            }
        }
        m54803b();
    }

    /* renamed from: e */
    public AbstractC4511c m54800e() {
        if (this.f35104d == null) {
            this.f35104d = new C4512d(this.f35103c);
        }
        return this.f35104d;
    }

    /* renamed from: f */
    public final boolean m54799f(InterfaceC4510b interfaceC4510b, long j) {
        Long l = (Long) this.f35101a.get(interfaceC4510b);
        if (l == null) {
            return true;
        }
        if (l.longValue() < j) {
            this.f35101a.remove(interfaceC4510b);
            return true;
        }
        return false;
    }

    /* renamed from: g */
    public void m54798g(InterfaceC4510b interfaceC4510b) {
        this.f35101a.remove(interfaceC4510b);
        int indexOf = this.f35102b.indexOf(interfaceC4510b);
        if (indexOf >= 0) {
            this.f35102b.set(indexOf, null);
            this.f35106f = true;
        }
    }
}
