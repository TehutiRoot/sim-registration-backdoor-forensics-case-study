package com.google.android.material.snackbar;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.google.android.gms.common.ConnectionResult;
import java.lang.ref.WeakReference;

/* renamed from: com.google.android.material.snackbar.a */
/* loaded from: classes4.dex */
public class C7084a {

    /* renamed from: e */
    public static C7084a f50892e;

    /* renamed from: a */
    public final Object f50893a = new Object();

    /* renamed from: b */
    public final Handler f50894b = new Handler(Looper.getMainLooper(), new C7085a());

    /* renamed from: c */
    public C7087c f50895c;

    /* renamed from: d */
    public C7087c f50896d;

    /* renamed from: com.google.android.material.snackbar.a$a */
    /* loaded from: classes4.dex */
    public class C7085a implements Handler.Callback {
        public C7085a() {
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            if (message.what != 0) {
                return false;
            }
            C7084a.this.m43959d((C7087c) message.obj);
            return true;
        }
    }

    /* renamed from: com.google.android.material.snackbar.a$b */
    /* loaded from: classes4.dex */
    public interface InterfaceC7086b {
        /* renamed from: a */
        void mo43947a(int i);

        void show();
    }

    /* renamed from: com.google.android.material.snackbar.a$c */
    /* loaded from: classes4.dex */
    public static class C7087c {

        /* renamed from: a */
        public final WeakReference f50898a;

        /* renamed from: b */
        public int f50899b;

        /* renamed from: c */
        public boolean f50900c;

        public C7087c(int i, InterfaceC7086b interfaceC7086b) {
            this.f50898a = new WeakReference(interfaceC7086b);
            this.f50899b = i;
        }

        /* renamed from: a */
        public boolean m43946a(InterfaceC7086b interfaceC7086b) {
            if (interfaceC7086b != null && this.f50898a.get() == interfaceC7086b) {
                return true;
            }
            return false;
        }
    }

    /* renamed from: c */
    public static C7084a m43960c() {
        if (f50892e == null) {
            f50892e = new C7084a();
        }
        return f50892e;
    }

    /* renamed from: a */
    public final boolean m43962a(C7087c c7087c, int i) {
        InterfaceC7086b interfaceC7086b = (InterfaceC7086b) c7087c.f50898a.get();
        if (interfaceC7086b != null) {
            this.f50894b.removeCallbacksAndMessages(c7087c);
            interfaceC7086b.mo43947a(i);
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public void m43961b(InterfaceC7086b interfaceC7086b, int i) {
        synchronized (this.f50893a) {
            try {
                if (m43956g(interfaceC7086b)) {
                    m43962a(this.f50895c, i);
                } else if (m43955h(interfaceC7086b)) {
                    m43962a(this.f50896d, i);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* renamed from: d */
    public void m43959d(C7087c c7087c) {
        synchronized (this.f50893a) {
            try {
                if (this.f50895c != c7087c) {
                    if (this.f50896d == c7087c) {
                    }
                }
                m43962a(c7087c, 2);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* renamed from: e */
    public boolean m43958e(InterfaceC7086b interfaceC7086b) {
        boolean m43956g;
        synchronized (this.f50893a) {
            m43956g = m43956g(interfaceC7086b);
        }
        return m43956g;
    }

    /* renamed from: f */
    public boolean m43957f(InterfaceC7086b interfaceC7086b) {
        boolean z;
        synchronized (this.f50893a) {
            try {
                if (!m43956g(interfaceC7086b) && !m43955h(interfaceC7086b)) {
                    z = false;
                }
                z = true;
            } finally {
            }
        }
        return z;
    }

    /* renamed from: g */
    public final boolean m43956g(InterfaceC7086b interfaceC7086b) {
        C7087c c7087c = this.f50895c;
        if (c7087c != null && c7087c.m43946a(interfaceC7086b)) {
            return true;
        }
        return false;
    }

    /* renamed from: h */
    public final boolean m43955h(InterfaceC7086b interfaceC7086b) {
        C7087c c7087c = this.f50896d;
        if (c7087c != null && c7087c.m43946a(interfaceC7086b)) {
            return true;
        }
        return false;
    }

    /* renamed from: i */
    public void m43954i(InterfaceC7086b interfaceC7086b) {
        synchronized (this.f50893a) {
            try {
                if (m43956g(interfaceC7086b)) {
                    this.f50895c = null;
                    if (this.f50896d != null) {
                        m43948o();
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* renamed from: j */
    public void m43953j(InterfaceC7086b interfaceC7086b) {
        synchronized (this.f50893a) {
            try {
                if (m43956g(interfaceC7086b)) {
                    m43950m(this.f50895c);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* renamed from: k */
    public void m43952k(InterfaceC7086b interfaceC7086b) {
        synchronized (this.f50893a) {
            try {
                if (m43956g(interfaceC7086b)) {
                    C7087c c7087c = this.f50895c;
                    if (!c7087c.f50900c) {
                        c7087c.f50900c = true;
                        this.f50894b.removeCallbacksAndMessages(c7087c);
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* renamed from: l */
    public void m43951l(InterfaceC7086b interfaceC7086b) {
        synchronized (this.f50893a) {
            try {
                if (m43956g(interfaceC7086b)) {
                    C7087c c7087c = this.f50895c;
                    if (c7087c.f50900c) {
                        c7087c.f50900c = false;
                        m43950m(c7087c);
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* renamed from: m */
    public final void m43950m(C7087c c7087c) {
        int i = c7087c.f50899b;
        if (i == -2) {
            return;
        }
        if (i <= 0) {
            if (i == -1) {
                i = ConnectionResult.DRIVE_EXTERNAL_STORAGE_REQUIRED;
            } else {
                i = 2750;
            }
        }
        this.f50894b.removeCallbacksAndMessages(c7087c);
        Handler handler = this.f50894b;
        handler.sendMessageDelayed(Message.obtain(handler, 0, c7087c), i);
    }

    /* renamed from: n */
    public void m43949n(int i, InterfaceC7086b interfaceC7086b) {
        synchronized (this.f50893a) {
            try {
                if (m43956g(interfaceC7086b)) {
                    C7087c c7087c = this.f50895c;
                    c7087c.f50899b = i;
                    this.f50894b.removeCallbacksAndMessages(c7087c);
                    m43950m(this.f50895c);
                    return;
                }
                if (m43955h(interfaceC7086b)) {
                    this.f50896d.f50899b = i;
                } else {
                    this.f50896d = new C7087c(i, interfaceC7086b);
                }
                C7087c c7087c2 = this.f50895c;
                if (c7087c2 != null && m43962a(c7087c2, 4)) {
                    return;
                }
                this.f50895c = null;
                m43948o();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* renamed from: o */
    public final void m43948o() {
        C7087c c7087c = this.f50896d;
        if (c7087c != null) {
            this.f50895c = c7087c;
            this.f50896d = null;
            InterfaceC7086b interfaceC7086b = (InterfaceC7086b) c7087c.f50898a.get();
            if (interfaceC7086b != null) {
                interfaceC7086b.show();
            } else {
                this.f50895c = null;
            }
        }
    }
}