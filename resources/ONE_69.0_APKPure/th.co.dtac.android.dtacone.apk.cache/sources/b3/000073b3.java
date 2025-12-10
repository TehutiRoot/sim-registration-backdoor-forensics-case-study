package androidx.recyclerview.widget;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;

/* renamed from: androidx.recyclerview.widget.b */
/* loaded from: classes2.dex */
public class C4931b {

    /* renamed from: a */
    public final InterfaceC4933b f37207a;

    /* renamed from: e */
    public View f37211e;

    /* renamed from: d */
    public int f37210d = 0;

    /* renamed from: b */
    public final C4932a f37208b = new C4932a();

    /* renamed from: c */
    public final List f37209c = new ArrayList();

    /* renamed from: androidx.recyclerview.widget.b$a */
    /* loaded from: classes2.dex */
    public static class C4932a {

        /* renamed from: a */
        public long f37212a = 0;

        /* renamed from: b */
        public C4932a f37213b;

        /* renamed from: a */
        public void m53035a(int i) {
            if (i >= 64) {
                C4932a c4932a = this.f37213b;
                if (c4932a != null) {
                    c4932a.m53035a(i - 64);
                    return;
                }
                return;
            }
            this.f37212a &= ~(1 << i);
        }

        /* renamed from: b */
        public int m53034b(int i) {
            C4932a c4932a = this.f37213b;
            if (c4932a == null) {
                if (i >= 64) {
                    return Long.bitCount(this.f37212a);
                }
                return Long.bitCount(this.f37212a & ((1 << i) - 1));
            } else if (i < 64) {
                return Long.bitCount(this.f37212a & ((1 << i) - 1));
            } else {
                return c4932a.m53034b(i - 64) + Long.bitCount(this.f37212a);
            }
        }

        /* renamed from: c */
        public final void m53033c() {
            if (this.f37213b == null) {
                this.f37213b = new C4932a();
            }
        }

        /* renamed from: d */
        public boolean m53032d(int i) {
            if (i >= 64) {
                m53033c();
                return this.f37213b.m53032d(i - 64);
            } else if ((this.f37212a & (1 << i)) != 0) {
                return true;
            } else {
                return false;
            }
        }

        /* renamed from: e */
        public void m53031e(int i, boolean z) {
            boolean z2;
            if (i >= 64) {
                m53033c();
                this.f37213b.m53031e(i - 64, z);
                return;
            }
            long j = this.f37212a;
            if ((Long.MIN_VALUE & j) != 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            long j2 = (1 << i) - 1;
            this.f37212a = ((j & (~j2)) << 1) | (j & j2);
            if (z) {
                m53028h(i);
            } else {
                m53035a(i);
            }
            if (z2 || this.f37213b != null) {
                m53033c();
                this.f37213b.m53031e(0, z2);
            }
        }

        /* renamed from: f */
        public boolean m53030f(int i) {
            boolean z;
            if (i >= 64) {
                m53033c();
                return this.f37213b.m53030f(i - 64);
            }
            long j = 1 << i;
            long j2 = this.f37212a;
            if ((j2 & j) != 0) {
                z = true;
            } else {
                z = false;
            }
            long j3 = j2 & (~j);
            this.f37212a = j3;
            long j4 = j - 1;
            this.f37212a = (j3 & j4) | Long.rotateRight((~j4) & j3, 1);
            C4932a c4932a = this.f37213b;
            if (c4932a != null) {
                if (c4932a.m53032d(0)) {
                    m53028h(63);
                }
                this.f37213b.m53030f(0);
            }
            return z;
        }

        /* renamed from: g */
        public void m53029g() {
            this.f37212a = 0L;
            C4932a c4932a = this.f37213b;
            if (c4932a != null) {
                c4932a.m53029g();
            }
        }

        /* renamed from: h */
        public void m53028h(int i) {
            if (i >= 64) {
                m53033c();
                this.f37213b.m53028h(i - 64);
                return;
            }
            this.f37212a |= 1 << i;
        }

        public String toString() {
            if (this.f37213b == null) {
                return Long.toBinaryString(this.f37212a);
            }
            return this.f37213b.toString() + "xx" + Long.toBinaryString(this.f37212a);
        }
    }

    /* renamed from: androidx.recyclerview.widget.b$b */
    /* loaded from: classes2.dex */
    public interface InterfaceC4933b {
        /* renamed from: a */
        View mo53027a(int i);

        /* renamed from: b */
        void mo53026b(View view);

        /* renamed from: c */
        int mo53025c();

        /* renamed from: d */
        RecyclerView.ViewHolder mo53024d(View view);

        /* renamed from: e */
        void mo53023e(View view, int i);

        /* renamed from: f */
        void mo53022f();

        /* renamed from: g */
        void mo53021g(View view, int i, ViewGroup.LayoutParams layoutParams);

        /* renamed from: h */
        void mo53020h(int i);

        /* renamed from: i */
        int mo53019i(View view);

        /* renamed from: j */
        void mo53018j(View view);

        /* renamed from: k */
        void mo53017k(int i);
    }

    public C4931b(InterfaceC4933b interfaceC4933b) {
        this.f37207a = interfaceC4933b;
    }

    /* renamed from: a */
    public void m53055a(View view, int i, boolean z) {
        int m53048h;
        if (i < 0) {
            m53048h = this.f37207a.mo53025c();
        } else {
            m53048h = m53048h(i);
        }
        this.f37208b.m53031e(m53048h, z);
        if (z) {
            m53044l(view);
        }
        this.f37207a.mo53023e(view, m53048h);
    }

    /* renamed from: b */
    public void m53054b(View view, boolean z) {
        m53055a(view, -1, z);
    }

    /* renamed from: c */
    public void m53053c(View view, int i, ViewGroup.LayoutParams layoutParams, boolean z) {
        int m53048h;
        if (i < 0) {
            m53048h = this.f37207a.mo53025c();
        } else {
            m53048h = m53048h(i);
        }
        this.f37208b.m53031e(m53048h, z);
        if (z) {
            m53044l(view);
        }
        this.f37207a.mo53021g(view, m53048h, layoutParams);
    }

    /* renamed from: d */
    public void m53052d(int i) {
        int m53048h = m53048h(i);
        this.f37208b.m53030f(m53048h);
        this.f37207a.mo53020h(m53048h);
    }

    /* renamed from: e */
    public View m53051e(int i) {
        int size = this.f37209c.size();
        for (int i2 = 0; i2 < size; i2++) {
            View view = (View) this.f37209c.get(i2);
            RecyclerView.ViewHolder mo53024d = this.f37207a.mo53024d(view);
            if (mo53024d.getLayoutPosition() == i && !mo53024d.isInvalid() && !mo53024d.isRemoved()) {
                return view;
            }
        }
        return null;
    }

    /* renamed from: f */
    public View m53050f(int i) {
        return this.f37207a.mo53027a(m53048h(i));
    }

    /* renamed from: g */
    public int m53049g() {
        return this.f37207a.mo53025c() - this.f37209c.size();
    }

    /* renamed from: h */
    public final int m53048h(int i) {
        if (i < 0) {
            return -1;
        }
        int mo53025c = this.f37207a.mo53025c();
        int i2 = i;
        while (i2 < mo53025c) {
            int m53034b = i - (i2 - this.f37208b.m53034b(i2));
            if (m53034b == 0) {
                while (this.f37208b.m53032d(i2)) {
                    i2++;
                }
                return i2;
            }
            i2 += m53034b;
        }
        return -1;
    }

    /* renamed from: i */
    public View m53047i(int i) {
        return this.f37207a.mo53027a(i);
    }

    /* renamed from: j */
    public int m53046j() {
        return this.f37207a.mo53025c();
    }

    /* renamed from: k */
    public void m53045k(View view) {
        int mo53019i = this.f37207a.mo53019i(view);
        if (mo53019i >= 0) {
            this.f37208b.m53028h(mo53019i);
            m53044l(view);
            return;
        }
        throw new IllegalArgumentException("view is not a child, cannot hide " + view);
    }

    /* renamed from: l */
    public final void m53044l(View view) {
        this.f37209c.add(view);
        this.f37207a.mo53026b(view);
    }

    /* renamed from: m */
    public int m53043m(View view) {
        int mo53019i = this.f37207a.mo53019i(view);
        if (mo53019i == -1 || this.f37208b.m53032d(mo53019i)) {
            return -1;
        }
        return mo53019i - this.f37208b.m53034b(mo53019i);
    }

    /* renamed from: n */
    public boolean m53042n(View view) {
        return this.f37209c.contains(view);
    }

    /* renamed from: o */
    public void m53041o() {
        this.f37208b.m53029g();
        for (int size = this.f37209c.size() - 1; size >= 0; size--) {
            this.f37207a.mo53018j((View) this.f37209c.get(size));
            this.f37209c.remove(size);
        }
        this.f37207a.mo53022f();
    }

    /* renamed from: p */
    public void m53040p(View view) {
        int i = this.f37210d;
        if (i != 1) {
            if (i != 2) {
                try {
                    this.f37210d = 1;
                    this.f37211e = view;
                    int mo53019i = this.f37207a.mo53019i(view);
                    if (mo53019i < 0) {
                        this.f37210d = 0;
                        this.f37211e = null;
                        return;
                    }
                    if (this.f37208b.m53030f(mo53019i)) {
                        m53036t(view);
                    }
                    this.f37207a.mo53017k(mo53019i);
                    this.f37210d = 0;
                    this.f37211e = null;
                    return;
                } catch (Throwable th2) {
                    this.f37210d = 0;
                    this.f37211e = null;
                    throw th2;
                }
            }
            throw new IllegalStateException("Cannot call removeView(At) within removeViewIfHidden");
        }
        throw new IllegalStateException("Cannot call removeView(At) within removeView(At)");
    }

    /* renamed from: q */
    public void m53039q(int i) {
        int i2 = this.f37210d;
        if (i2 != 1) {
            if (i2 != 2) {
                try {
                    int m53048h = m53048h(i);
                    View mo53027a = this.f37207a.mo53027a(m53048h);
                    if (mo53027a == null) {
                        this.f37210d = 0;
                        this.f37211e = null;
                        return;
                    }
                    this.f37210d = 1;
                    this.f37211e = mo53027a;
                    if (this.f37208b.m53030f(m53048h)) {
                        m53036t(mo53027a);
                    }
                    this.f37207a.mo53017k(m53048h);
                    this.f37210d = 0;
                    this.f37211e = null;
                    return;
                } catch (Throwable th2) {
                    this.f37210d = 0;
                    this.f37211e = null;
                    throw th2;
                }
            }
            throw new IllegalStateException("Cannot call removeView(At) within removeViewIfHidden");
        }
        throw new IllegalStateException("Cannot call removeView(At) within removeView(At)");
    }

    /* renamed from: r */
    public boolean m53038r(View view) {
        int i = this.f37210d;
        if (i == 1) {
            if (this.f37211e == view) {
                return false;
            }
            throw new IllegalStateException("Cannot call removeViewIfHidden within removeView(At) for a different view");
        } else if (i != 2) {
            try {
                this.f37210d = 2;
                int mo53019i = this.f37207a.mo53019i(view);
                if (mo53019i == -1) {
                    m53036t(view);
                    return true;
                } else if (!this.f37208b.m53032d(mo53019i)) {
                    return false;
                } else {
                    this.f37208b.m53030f(mo53019i);
                    m53036t(view);
                    this.f37207a.mo53017k(mo53019i);
                    return true;
                }
            } finally {
                this.f37210d = 0;
            }
        } else {
            throw new IllegalStateException("Cannot call removeViewIfHidden within removeViewIfHidden");
        }
    }

    /* renamed from: s */
    public void m53037s(View view) {
        int mo53019i = this.f37207a.mo53019i(view);
        if (mo53019i >= 0) {
            if (this.f37208b.m53032d(mo53019i)) {
                this.f37208b.m53035a(mo53019i);
                m53036t(view);
                return;
            }
            throw new RuntimeException("trying to unhide a view that was not hidden" + view);
        }
        throw new IllegalArgumentException("view is not a child, cannot hide " + view);
    }

    /* renamed from: t */
    public final boolean m53036t(View view) {
        if (this.f37209c.remove(view)) {
            this.f37207a.mo53018j(view);
            return true;
        }
        return false;
    }

    public String toString() {
        return this.f37208b.toString() + ", hidden list:" + this.f37209c.size();
    }
}