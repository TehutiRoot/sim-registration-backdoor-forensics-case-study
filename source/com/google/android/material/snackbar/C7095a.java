package com.google.android.material.snackbar;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.google.android.gms.common.ConnectionResult;
import java.lang.ref.WeakReference;

/* renamed from: com.google.android.material.snackbar.a */
/* loaded from: classes4.dex */
public class C7095a {

    /* renamed from: e */
    public static C7095a f50880e;

    /* renamed from: a */
    public final Object f50881a = new Object();

    /* renamed from: b */
    public final Handler f50882b = new Handler(Looper.getMainLooper(), new C7096a());

    /* renamed from: c */
    public C7098c f50883c;

    /* renamed from: d */
    public C7098c f50884d;

    /* renamed from: com.google.android.material.snackbar.a$a */
    /* loaded from: classes4.dex */
    public class C7096a implements Handler.Callback {
        public C7096a() {
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            if (message.what != 0) {
                return false;
            }
            C7095a.this.m43972d((C7098c) message.obj);
            return true;
        }
    }

    /* renamed from: com.google.android.material.snackbar.a$b */
    /* loaded from: classes4.dex */
    public interface InterfaceC7097b {
        /* renamed from: a */
        void mo43960a(int i);

        void show();
    }

    /* renamed from: com.google.android.material.snackbar.a$c */
    /* loaded from: classes4.dex */
    public static class C7098c {

        /* renamed from: a */
        public final WeakReference f50886a;

        /* renamed from: b */
        public int f50887b;

        /* renamed from: c */
        public boolean f50888c;

        public C7098c(int i, InterfaceC7097b interfaceC7097b) {
            this.f50886a = new WeakReference(interfaceC7097b);
            this.f50887b = i;
        }

        /* renamed from: a */
        public boolean m43959a(InterfaceC7097b interfaceC7097b) {
            if (interfaceC7097b != null && this.f50886a.get() == interfaceC7097b) {
                return true;
            }
            return false;
        }
    }

    /* renamed from: c */
    public static C7095a m43973c() {
        if (f50880e == null) {
            f50880e = new C7095a();
        }
        return f50880e;
    }

    /* renamed from: a */
    public final boolean m43975a(C7098c c7098c, int i) {
        InterfaceC7097b interfaceC7097b = (InterfaceC7097b) c7098c.f50886a.get();
        if (interfaceC7097b != null) {
            this.f50882b.removeCallbacksAndMessages(c7098c);
            interfaceC7097b.mo43960a(i);
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public void m43974b(InterfaceC7097b interfaceC7097b, int i) {
        synchronized (this.f50881a) {
            try {
                if (m43969g(interfaceC7097b)) {
                    m43975a(this.f50883c, i);
                } else if (m43968h(interfaceC7097b)) {
                    m43975a(this.f50884d, i);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* renamed from: d */
    public void m43972d(C7098c c7098c) {
        synchronized (this.f50881a) {
            try {
                if (this.f50883c != c7098c) {
                    if (this.f50884d == c7098c) {
                    }
                }
                m43975a(c7098c, 2);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* renamed from: e */
    public boolean m43971e(InterfaceC7097b interfaceC7097b) {
        boolean m43969g;
        synchronized (this.f50881a) {
            m43969g = m43969g(interfaceC7097b);
        }
        return m43969g;
    }

    /* renamed from: f */
    public boolean m43970f(InterfaceC7097b interfaceC7097b) {
        boolean z;
        synchronized (this.f50881a) {
            try {
                if (!m43969g(interfaceC7097b) && !m43968h(interfaceC7097b)) {
                    z = false;
                }
                z = true;
            } finally {
            }
        }
        return z;
    }

    /* renamed from: g */
    public final boolean m43969g(InterfaceC7097b interfaceC7097b) {
        C7098c c7098c = this.f50883c;
        if (c7098c != null && c7098c.m43959a(interfaceC7097b)) {
            return true;
        }
        return false;
    }

    /* renamed from: h */
    public final boolean m43968h(InterfaceC7097b interfaceC7097b) {
        C7098c c7098c = this.f50884d;
        if (c7098c != null && c7098c.m43959a(interfaceC7097b)) {
            return true;
        }
        return false;
    }

    /* renamed from: i */
    public void m43967i(InterfaceC7097b interfaceC7097b) {
        synchronized (this.f50881a) {
            try {
                if (m43969g(interfaceC7097b)) {
                    this.f50883c = null;
                    if (this.f50884d != null) {
                        m43961o();
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* renamed from: j */
    public void m43966j(InterfaceC7097b interfaceC7097b) {
        synchronized (this.f50881a) {
            try {
                if (m43969g(interfaceC7097b)) {
                    m43963m(this.f50883c);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* renamed from: k */
    public void m43965k(InterfaceC7097b interfaceC7097b) {
        synchronized (this.f50881a) {
            try {
                if (m43969g(interfaceC7097b)) {
                    C7098c c7098c = this.f50883c;
                    if (!c7098c.f50888c) {
                        c7098c.f50888c = true;
                        this.f50882b.removeCallbacksAndMessages(c7098c);
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* renamed from: l */
    public void m43964l(InterfaceC7097b interfaceC7097b) {
        synchronized (this.f50881a) {
            try {
                if (m43969g(interfaceC7097b)) {
                    C7098c c7098c = this.f50883c;
                    if (c7098c.f50888c) {
                        c7098c.f50888c = false;
                        m43963m(c7098c);
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* renamed from: m */
    public final void m43963m(C7098c c7098c) {
        int i = c7098c.f50887b;
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
        this.f50882b.removeCallbacksAndMessages(c7098c);
        Handler handler = this.f50882b;
        handler.sendMessageDelayed(Message.obtain(handler, 0, c7098c), i);
    }

    /* renamed from: n */
    public void m43962n(int i, InterfaceC7097b interfaceC7097b) {
        synchronized (this.f50881a) {
            try {
                if (m43969g(interfaceC7097b)) {
                    C7098c c7098c = this.f50883c;
                    c7098c.f50887b = i;
                    this.f50882b.removeCallbacksAndMessages(c7098c);
                    m43963m(this.f50883c);
                    return;
                }
                if (m43968h(interfaceC7097b)) {
                    this.f50884d.f50887b = i;
                } else {
                    this.f50884d = new C7098c(i, interfaceC7097b);
                }
                C7098c c7098c2 = this.f50883c;
                if (c7098c2 != null && m43975a(c7098c2, 4)) {
                    return;
                }
                this.f50883c = null;
                m43961o();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* renamed from: o */
    public final void m43961o() {
        C7098c c7098c = this.f50884d;
        if (c7098c != null) {
            this.f50883c = c7098c;
            this.f50884d = null;
            InterfaceC7097b interfaceC7097b = (InterfaceC7097b) c7098c.f50886a.get();
            if (interfaceC7097b != null) {
                interfaceC7097b.show();
            } else {
                this.f50883c = null;
            }
        }
    }
}
