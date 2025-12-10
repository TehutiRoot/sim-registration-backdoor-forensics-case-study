package androidx.dynamicanimation.animation;

import android.os.SystemClock;
import android.view.Choreographer;
import androidx.collection.SimpleArrayMap;
import java.util.ArrayList;

/* renamed from: androidx.dynamicanimation.animation.a */
/* loaded from: classes2.dex */
public class C4490a {

    /* renamed from: g */
    public static final ThreadLocal f35188g = new ThreadLocal();

    /* renamed from: d */
    public AbstractC4493c f35192d;

    /* renamed from: a */
    public final SimpleArrayMap f35189a = new SimpleArrayMap();

    /* renamed from: b */
    public final ArrayList f35190b = new ArrayList();

    /* renamed from: c */
    public final C4491a f35191c = new C4491a();

    /* renamed from: e */
    public long f35193e = 0;

    /* renamed from: f */
    public boolean f35194f = false;

    /* renamed from: androidx.dynamicanimation.animation.a$a */
    /* loaded from: classes2.dex */
    public class C4491a {
        public C4491a() {
        }

        /* renamed from: a */
        public void m54747a() {
            C4490a.this.f35193e = SystemClock.uptimeMillis();
            C4490a c4490a = C4490a.this;
            c4490a.m54752c(c4490a.f35193e);
            if (C4490a.this.f35190b.size() > 0) {
                C4490a.this.m54750e().mo54746a();
            }
        }
    }

    /* renamed from: androidx.dynamicanimation.animation.a$b */
    /* loaded from: classes2.dex */
    public interface InterfaceC4492b {
        boolean doAnimationFrame(long j);
    }

    /* renamed from: androidx.dynamicanimation.animation.a$c */
    /* loaded from: classes2.dex */
    public static abstract class AbstractC4493c {

        /* renamed from: a */
        public final C4491a f35196a;

        public AbstractC4493c(C4491a c4491a) {
            this.f35196a = c4491a;
        }

        /* renamed from: a */
        public abstract void mo54746a();
    }

    /* renamed from: androidx.dynamicanimation.animation.a$d */
    /* loaded from: classes2.dex */
    public static class C4494d extends AbstractC4493c {

        /* renamed from: b */
        public final Choreographer f35197b;

        /* renamed from: c */
        public final Choreographer.FrameCallback f35198c;

        /* renamed from: androidx.dynamicanimation.animation.a$d$a */
        /* loaded from: classes2.dex */
        public class Choreographer$FrameCallbackC4495a implements Choreographer.FrameCallback {
            public Choreographer$FrameCallbackC4495a() {
            }

            @Override // android.view.Choreographer.FrameCallback
            public void doFrame(long j) {
                C4494d.this.f35196a.m54747a();
            }
        }

        public C4494d(C4491a c4491a) {
            super(c4491a);
            this.f35197b = Choreographer.getInstance();
            this.f35198c = new Choreographer$FrameCallbackC4495a();
        }

        @Override // androidx.dynamicanimation.animation.C4490a.AbstractC4493c
        /* renamed from: a */
        public void mo54746a() {
            this.f35197b.postFrameCallback(this.f35198c);
        }
    }

    /* renamed from: d */
    public static C4490a m54751d() {
        ThreadLocal threadLocal = f35188g;
        if (threadLocal.get() == null) {
            threadLocal.set(new C4490a());
        }
        return (C4490a) threadLocal.get();
    }

    /* renamed from: a */
    public void m54754a(InterfaceC4492b interfaceC4492b, long j) {
        if (this.f35190b.size() == 0) {
            m54750e().mo54746a();
        }
        if (!this.f35190b.contains(interfaceC4492b)) {
            this.f35190b.add(interfaceC4492b);
        }
        if (j > 0) {
            this.f35189a.put(interfaceC4492b, Long.valueOf(SystemClock.uptimeMillis() + j));
        }
    }

    /* renamed from: b */
    public final void m54753b() {
        if (this.f35194f) {
            for (int size = this.f35190b.size() - 1; size >= 0; size--) {
                if (this.f35190b.get(size) == null) {
                    this.f35190b.remove(size);
                }
            }
            this.f35194f = false;
        }
    }

    /* renamed from: c */
    public void m54752c(long j) {
        long uptimeMillis = SystemClock.uptimeMillis();
        for (int i = 0; i < this.f35190b.size(); i++) {
            InterfaceC4492b interfaceC4492b = (InterfaceC4492b) this.f35190b.get(i);
            if (interfaceC4492b != null && m54749f(interfaceC4492b, uptimeMillis)) {
                interfaceC4492b.doAnimationFrame(j);
            }
        }
        m54753b();
    }

    /* renamed from: e */
    public AbstractC4493c m54750e() {
        if (this.f35192d == null) {
            this.f35192d = new C4494d(this.f35191c);
        }
        return this.f35192d;
    }

    /* renamed from: f */
    public final boolean m54749f(InterfaceC4492b interfaceC4492b, long j) {
        Long l = (Long) this.f35189a.get(interfaceC4492b);
        if (l == null) {
            return true;
        }
        if (l.longValue() < j) {
            this.f35189a.remove(interfaceC4492b);
            return true;
        }
        return false;
    }

    /* renamed from: g */
    public void m54748g(InterfaceC4492b interfaceC4492b) {
        this.f35189a.remove(interfaceC4492b);
        int indexOf = this.f35190b.indexOf(interfaceC4492b);
        if (indexOf >= 0) {
            this.f35190b.set(indexOf, null);
            this.f35194f = true;
        }
    }
}