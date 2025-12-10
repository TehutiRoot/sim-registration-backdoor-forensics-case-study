package androidx.recyclerview.widget;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;

/* renamed from: androidx.recyclerview.widget.b */
/* loaded from: classes2.dex */
public class C4949b {

    /* renamed from: a */
    public final InterfaceC4951b f37119a;

    /* renamed from: e */
    public View f37123e;

    /* renamed from: d */
    public int f37122d = 0;

    /* renamed from: b */
    public final C4950a f37120b = new C4950a();

    /* renamed from: c */
    public final List f37121c = new ArrayList();

    /* renamed from: androidx.recyclerview.widget.b$a */
    /* loaded from: classes2.dex */
    public static class C4950a {

        /* renamed from: a */
        public long f37124a = 0;

        /* renamed from: b */
        public C4950a f37125b;

        /* renamed from: a */
        public void m53084a(int i) {
            if (i >= 64) {
                C4950a c4950a = this.f37125b;
                if (c4950a != null) {
                    c4950a.m53084a(i - 64);
                    return;
                }
                return;
            }
            this.f37124a &= ~(1 << i);
        }

        /* renamed from: b */
        public int m53083b(int i) {
            C4950a c4950a = this.f37125b;
            if (c4950a == null) {
                if (i >= 64) {
                    return Long.bitCount(this.f37124a);
                }
                return Long.bitCount(this.f37124a & ((1 << i) - 1));
            } else if (i < 64) {
                return Long.bitCount(this.f37124a & ((1 << i) - 1));
            } else {
                return c4950a.m53083b(i - 64) + Long.bitCount(this.f37124a);
            }
        }

        /* renamed from: c */
        public final void m53082c() {
            if (this.f37125b == null) {
                this.f37125b = new C4950a();
            }
        }

        /* renamed from: d */
        public boolean m53081d(int i) {
            if (i >= 64) {
                m53082c();
                return this.f37125b.m53081d(i - 64);
            } else if ((this.f37124a & (1 << i)) != 0) {
                return true;
            } else {
                return false;
            }
        }

        /* renamed from: e */
        public void m53080e(int i, boolean z) {
            boolean z2;
            if (i >= 64) {
                m53082c();
                this.f37125b.m53080e(i - 64, z);
                return;
            }
            long j = this.f37124a;
            if ((Long.MIN_VALUE & j) != 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            long j2 = (1 << i) - 1;
            this.f37124a = ((j & (~j2)) << 1) | (j & j2);
            if (z) {
                m53077h(i);
            } else {
                m53084a(i);
            }
            if (z2 || this.f37125b != null) {
                m53082c();
                this.f37125b.m53080e(0, z2);
            }
        }

        /* renamed from: f */
        public boolean m53079f(int i) {
            boolean z;
            if (i >= 64) {
                m53082c();
                return this.f37125b.m53079f(i - 64);
            }
            long j = 1 << i;
            long j2 = this.f37124a;
            if ((j2 & j) != 0) {
                z = true;
            } else {
                z = false;
            }
            long j3 = j2 & (~j);
            this.f37124a = j3;
            long j4 = j - 1;
            this.f37124a = (j3 & j4) | Long.rotateRight((~j4) & j3, 1);
            C4950a c4950a = this.f37125b;
            if (c4950a != null) {
                if (c4950a.m53081d(0)) {
                    m53077h(63);
                }
                this.f37125b.m53079f(0);
            }
            return z;
        }

        /* renamed from: g */
        public void m53078g() {
            this.f37124a = 0L;
            C4950a c4950a = this.f37125b;
            if (c4950a != null) {
                c4950a.m53078g();
            }
        }

        /* renamed from: h */
        public void m53077h(int i) {
            if (i >= 64) {
                m53082c();
                this.f37125b.m53077h(i - 64);
                return;
            }
            this.f37124a |= 1 << i;
        }

        public String toString() {
            if (this.f37125b == null) {
                return Long.toBinaryString(this.f37124a);
            }
            return this.f37125b.toString() + "xx" + Long.toBinaryString(this.f37124a);
        }
    }

    /* renamed from: androidx.recyclerview.widget.b$b */
    /* loaded from: classes2.dex */
    public interface InterfaceC4951b {
        /* renamed from: a */
        View mo53076a(int i);

        /* renamed from: b */
        void mo53075b(View view);

        /* renamed from: c */
        int mo53074c();

        /* renamed from: d */
        RecyclerView.ViewHolder mo53073d(View view);

        /* renamed from: e */
        void mo53072e(View view, int i);

        /* renamed from: f */
        void mo53071f();

        /* renamed from: g */
        void mo53070g(View view, int i, ViewGroup.LayoutParams layoutParams);

        /* renamed from: h */
        void mo53069h(int i);

        /* renamed from: i */
        int mo53068i(View view);

        /* renamed from: j */
        void mo53067j(View view);

        /* renamed from: k */
        void mo53066k(int i);
    }

    public C4949b(InterfaceC4951b interfaceC4951b) {
        this.f37119a = interfaceC4951b;
    }

    /* renamed from: a */
    public void m53104a(View view, int i, boolean z) {
        int m53097h;
        if (i < 0) {
            m53097h = this.f37119a.mo53074c();
        } else {
            m53097h = m53097h(i);
        }
        this.f37120b.m53080e(m53097h, z);
        if (z) {
            m53093l(view);
        }
        this.f37119a.mo53072e(view, m53097h);
    }

    /* renamed from: b */
    public void m53103b(View view, boolean z) {
        m53104a(view, -1, z);
    }

    /* renamed from: c */
    public void m53102c(View view, int i, ViewGroup.LayoutParams layoutParams, boolean z) {
        int m53097h;
        if (i < 0) {
            m53097h = this.f37119a.mo53074c();
        } else {
            m53097h = m53097h(i);
        }
        this.f37120b.m53080e(m53097h, z);
        if (z) {
            m53093l(view);
        }
        this.f37119a.mo53070g(view, m53097h, layoutParams);
    }

    /* renamed from: d */
    public void m53101d(int i) {
        int m53097h = m53097h(i);
        this.f37120b.m53079f(m53097h);
        this.f37119a.mo53069h(m53097h);
    }

    /* renamed from: e */
    public View m53100e(int i) {
        int size = this.f37121c.size();
        for (int i2 = 0; i2 < size; i2++) {
            View view = (View) this.f37121c.get(i2);
            RecyclerView.ViewHolder mo53073d = this.f37119a.mo53073d(view);
            if (mo53073d.getLayoutPosition() == i && !mo53073d.isInvalid() && !mo53073d.isRemoved()) {
                return view;
            }
        }
        return null;
    }

    /* renamed from: f */
    public View m53099f(int i) {
        return this.f37119a.mo53076a(m53097h(i));
    }

    /* renamed from: g */
    public int m53098g() {
        return this.f37119a.mo53074c() - this.f37121c.size();
    }

    /* renamed from: h */
    public final int m53097h(int i) {
        if (i < 0) {
            return -1;
        }
        int mo53074c = this.f37119a.mo53074c();
        int i2 = i;
        while (i2 < mo53074c) {
            int m53083b = i - (i2 - this.f37120b.m53083b(i2));
            if (m53083b == 0) {
                while (this.f37120b.m53081d(i2)) {
                    i2++;
                }
                return i2;
            }
            i2 += m53083b;
        }
        return -1;
    }

    /* renamed from: i */
    public View m53096i(int i) {
        return this.f37119a.mo53076a(i);
    }

    /* renamed from: j */
    public int m53095j() {
        return this.f37119a.mo53074c();
    }

    /* renamed from: k */
    public void m53094k(View view) {
        int mo53068i = this.f37119a.mo53068i(view);
        if (mo53068i >= 0) {
            this.f37120b.m53077h(mo53068i);
            m53093l(view);
            return;
        }
        throw new IllegalArgumentException("view is not a child, cannot hide " + view);
    }

    /* renamed from: l */
    public final void m53093l(View view) {
        this.f37121c.add(view);
        this.f37119a.mo53075b(view);
    }

    /* renamed from: m */
    public int m53092m(View view) {
        int mo53068i = this.f37119a.mo53068i(view);
        if (mo53068i == -1 || this.f37120b.m53081d(mo53068i)) {
            return -1;
        }
        return mo53068i - this.f37120b.m53083b(mo53068i);
    }

    /* renamed from: n */
    public boolean m53091n(View view) {
        return this.f37121c.contains(view);
    }

    /* renamed from: o */
    public void m53090o() {
        this.f37120b.m53078g();
        for (int size = this.f37121c.size() - 1; size >= 0; size--) {
            this.f37119a.mo53067j((View) this.f37121c.get(size));
            this.f37121c.remove(size);
        }
        this.f37119a.mo53071f();
    }

    /* renamed from: p */
    public void m53089p(View view) {
        int i = this.f37122d;
        if (i != 1) {
            if (i != 2) {
                try {
                    this.f37122d = 1;
                    this.f37123e = view;
                    int mo53068i = this.f37119a.mo53068i(view);
                    if (mo53068i < 0) {
                        this.f37122d = 0;
                        this.f37123e = null;
                        return;
                    }
                    if (this.f37120b.m53079f(mo53068i)) {
                        m53085t(view);
                    }
                    this.f37119a.mo53066k(mo53068i);
                    this.f37122d = 0;
                    this.f37123e = null;
                    return;
                } catch (Throwable th2) {
                    this.f37122d = 0;
                    this.f37123e = null;
                    throw th2;
                }
            }
            throw new IllegalStateException("Cannot call removeView(At) within removeViewIfHidden");
        }
        throw new IllegalStateException("Cannot call removeView(At) within removeView(At)");
    }

    /* renamed from: q */
    public void m53088q(int i) {
        int i2 = this.f37122d;
        if (i2 != 1) {
            if (i2 != 2) {
                try {
                    int m53097h = m53097h(i);
                    View mo53076a = this.f37119a.mo53076a(m53097h);
                    if (mo53076a == null) {
                        this.f37122d = 0;
                        this.f37123e = null;
                        return;
                    }
                    this.f37122d = 1;
                    this.f37123e = mo53076a;
                    if (this.f37120b.m53079f(m53097h)) {
                        m53085t(mo53076a);
                    }
                    this.f37119a.mo53066k(m53097h);
                    this.f37122d = 0;
                    this.f37123e = null;
                    return;
                } catch (Throwable th2) {
                    this.f37122d = 0;
                    this.f37123e = null;
                    throw th2;
                }
            }
            throw new IllegalStateException("Cannot call removeView(At) within removeViewIfHidden");
        }
        throw new IllegalStateException("Cannot call removeView(At) within removeView(At)");
    }

    /* renamed from: r */
    public boolean m53087r(View view) {
        int i = this.f37122d;
        if (i == 1) {
            if (this.f37123e == view) {
                return false;
            }
            throw new IllegalStateException("Cannot call removeViewIfHidden within removeView(At) for a different view");
        } else if (i != 2) {
            try {
                this.f37122d = 2;
                int mo53068i = this.f37119a.mo53068i(view);
                if (mo53068i == -1) {
                    m53085t(view);
                    return true;
                } else if (!this.f37120b.m53081d(mo53068i)) {
                    return false;
                } else {
                    this.f37120b.m53079f(mo53068i);
                    m53085t(view);
                    this.f37119a.mo53066k(mo53068i);
                    return true;
                }
            } finally {
                this.f37122d = 0;
            }
        } else {
            throw new IllegalStateException("Cannot call removeViewIfHidden within removeViewIfHidden");
        }
    }

    /* renamed from: s */
    public void m53086s(View view) {
        int mo53068i = this.f37119a.mo53068i(view);
        if (mo53068i >= 0) {
            if (this.f37120b.m53081d(mo53068i)) {
                this.f37120b.m53084a(mo53068i);
                m53085t(view);
                return;
            }
            throw new RuntimeException("trying to unhide a view that was not hidden" + view);
        }
        throw new IllegalArgumentException("view is not a child, cannot hide " + view);
    }

    /* renamed from: t */
    public final boolean m53085t(View view) {
        if (this.f37121c.remove(view)) {
            this.f37119a.mo53067j(view);
            return true;
        }
        return false;
    }

    public String toString() {
        return this.f37120b.toString() + ", hidden list:" + this.f37121c.size();
    }
}
