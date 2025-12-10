package androidx.recyclerview.widget;

import androidx.core.util.Pools;
import androidx.recyclerview.widget.C4956i;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.analytics.ecommerce.ProductAction;
import java.util.ArrayList;
import java.util.List;

/* renamed from: androidx.recyclerview.widget.a */
/* loaded from: classes2.dex */
public final class C4928a implements C4956i.InterfaceC4957a {

    /* renamed from: a */
    public Pools.Pool f37195a;

    /* renamed from: b */
    public final ArrayList f37196b;

    /* renamed from: c */
    public final ArrayList f37197c;

    /* renamed from: d */
    public final InterfaceC4929a f37198d;

    /* renamed from: e */
    public Runnable f37199e;

    /* renamed from: f */
    public final boolean f37200f;

    /* renamed from: g */
    public final C4956i f37201g;

    /* renamed from: h */
    public int f37202h;

    /* renamed from: androidx.recyclerview.widget.a$a */
    /* loaded from: classes2.dex */
    public interface InterfaceC4929a {
        /* renamed from: a */
        void mo53064a(int i, int i2);

        /* renamed from: b */
        void mo53063b(C4930b c4930b);

        /* renamed from: c */
        void mo53062c(C4930b c4930b);

        /* renamed from: d */
        RecyclerView.ViewHolder mo53061d(int i);

        /* renamed from: e */
        void mo53060e(int i, int i2);

        /* renamed from: f */
        void mo53059f(int i, int i2);

        /* renamed from: g */
        void mo53058g(int i, int i2);

        /* renamed from: h */
        void mo53057h(int i, int i2, Object obj);
    }

    /* renamed from: androidx.recyclerview.widget.a$b */
    /* loaded from: classes2.dex */
    public static final class C4930b {

        /* renamed from: a */
        public int f37203a;

        /* renamed from: b */
        public int f37204b;

        /* renamed from: c */
        public Object f37205c;

        /* renamed from: d */
        public int f37206d;

        public C4930b(int i, int i2, int i3, Object obj) {
            this.f37203a = i;
            this.f37204b = i2;
            this.f37206d = i3;
            this.f37205c = obj;
        }

        /* renamed from: a */
        public String m53056a() {
            int i = this.f37203a;
            if (i != 1) {
                if (i != 2) {
                    if (i != 4) {
                        if (i != 8) {
                            return "??";
                        }
                        return "mv";
                    }
                    return "up";
                }
                return "rm";
            }
            return ProductAction.ACTION_ADD;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C4930b)) {
                return false;
            }
            C4930b c4930b = (C4930b) obj;
            int i = this.f37203a;
            if (i != c4930b.f37203a) {
                return false;
            }
            if (i == 8 && Math.abs(this.f37206d - this.f37204b) == 1 && this.f37206d == c4930b.f37204b && this.f37204b == c4930b.f37206d) {
                return true;
            }
            if (this.f37206d != c4930b.f37206d || this.f37204b != c4930b.f37204b) {
                return false;
            }
            Object obj2 = this.f37205c;
            if (obj2 != null) {
                if (!obj2.equals(c4930b.f37205c)) {
                    return false;
                }
            } else if (c4930b.f37205c != null) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            return (((this.f37203a * 31) + this.f37204b) * 31) + this.f37206d;
        }

        public String toString() {
            return Integer.toHexString(System.identityHashCode(this)) + "[" + m53056a() + ",s:" + this.f37204b + "c:" + this.f37206d + ",p:" + this.f37205c + "]";
        }
    }

    public C4928a(InterfaceC4929a interfaceC4929a) {
        this(interfaceC4929a, false);
    }

    @Override // androidx.recyclerview.widget.C4956i.InterfaceC4957a
    /* renamed from: a */
    public C4930b mo52920a(int i, int i2, int i3, Object obj) {
        C4930b c4930b = (C4930b) this.f37195a.acquire();
        if (c4930b == null) {
            return new C4930b(i, i2, i3, obj);
        }
        c4930b.f37203a = i;
        c4930b.f37204b = i2;
        c4930b.f37206d = i3;
        c4930b.f37205c = obj;
        return c4930b;
    }

    @Override // androidx.recyclerview.widget.C4956i.InterfaceC4957a
    /* renamed from: b */
    public void mo52919b(C4930b c4930b) {
        if (!this.f37200f) {
            c4930b.f37205c = null;
            this.f37195a.release(c4930b);
        }
    }

    /* renamed from: c */
    public final void m53088c(C4930b c4930b) {
        m53069v(c4930b);
    }

    /* renamed from: d */
    public final void m53087d(C4930b c4930b) {
        m53069v(c4930b);
    }

    /* renamed from: e */
    public int m53086e(int i) {
        int size = this.f37196b.size();
        for (int i2 = 0; i2 < size; i2++) {
            C4930b c4930b = (C4930b) this.f37196b.get(i2);
            int i3 = c4930b.f37203a;
            if (i3 != 1) {
                if (i3 != 2) {
                    if (i3 == 8) {
                        int i4 = c4930b.f37204b;
                        if (i4 == i) {
                            i = c4930b.f37206d;
                        } else {
                            if (i4 < i) {
                                i--;
                            }
                            if (c4930b.f37206d <= i) {
                                i++;
                            }
                        }
                    }
                } else {
                    int i5 = c4930b.f37204b;
                    if (i5 <= i) {
                        int i6 = c4930b.f37206d;
                        if (i5 + i6 > i) {
                            return -1;
                        }
                        i -= i6;
                    } else {
                        continue;
                    }
                }
            } else if (c4930b.f37204b <= i) {
                i += c4930b.f37206d;
            }
        }
        return i;
    }

    /* renamed from: f */
    public final void m53085f(C4930b c4930b) {
        boolean z;
        char c;
        int i = c4930b.f37204b;
        int i2 = c4930b.f37206d + i;
        char c2 = 65535;
        int i3 = i;
        int i4 = 0;
        while (i3 < i2) {
            if (this.f37198d.mo53061d(i3) == null && !m53083h(i3)) {
                if (c2 == 1) {
                    m53069v(mo52920a(2, i, i4, null));
                    z = true;
                } else {
                    z = false;
                }
                c = 0;
            } else {
                if (c2 == 0) {
                    m53080k(mo52920a(2, i, i4, null));
                    z = true;
                } else {
                    z = false;
                }
                c = 1;
            }
            if (z) {
                i3 -= i4;
                i2 -= i4;
                i4 = 1;
            } else {
                i4++;
            }
            i3++;
            c2 = c;
        }
        if (i4 != c4930b.f37206d) {
            mo52919b(c4930b);
            c4930b = mo52920a(2, i, i4, null);
        }
        if (c2 == 0) {
            m53080k(c4930b);
        } else {
            m53069v(c4930b);
        }
    }

    /* renamed from: g */
    public final void m53084g(C4930b c4930b) {
        int i = c4930b.f37204b;
        int i2 = c4930b.f37206d + i;
        int i3 = i;
        char c = 65535;
        int i4 = 0;
        while (i < i2) {
            if (this.f37198d.mo53061d(i) == null && !m53083h(i)) {
                if (c == 1) {
                    m53069v(mo52920a(4, i3, i4, c4930b.f37205c));
                    i3 = i;
                    i4 = 0;
                }
                c = 0;
            } else {
                if (c == 0) {
                    m53080k(mo52920a(4, i3, i4, c4930b.f37205c));
                    i3 = i;
                    i4 = 0;
                }
                c = 1;
            }
            i4++;
            i++;
        }
        if (i4 != c4930b.f37206d) {
            Object obj = c4930b.f37205c;
            mo52919b(c4930b);
            c4930b = mo52920a(4, i3, i4, obj);
        }
        if (c == 0) {
            m53080k(c4930b);
        } else {
            m53069v(c4930b);
        }
    }

    /* renamed from: h */
    public final boolean m53083h(int i) {
        int size = this.f37197c.size();
        for (int i2 = 0; i2 < size; i2++) {
            C4930b c4930b = (C4930b) this.f37197c.get(i2);
            int i3 = c4930b.f37203a;
            if (i3 == 8) {
                if (m53077n(c4930b.f37206d, i2 + 1) == i) {
                    return true;
                }
            } else if (i3 == 1) {
                int i4 = c4930b.f37204b;
                int i5 = c4930b.f37206d + i4;
                while (i4 < i5) {
                    if (m53077n(i4, i2 + 1) == i) {
                        return true;
                    }
                    i4++;
                }
                continue;
            } else {
                continue;
            }
        }
        return false;
    }

    /* renamed from: i */
    public void m53082i() {
        int size = this.f37197c.size();
        for (int i = 0; i < size; i++) {
            this.f37198d.mo53062c((C4930b) this.f37197c.get(i));
        }
        m53067x(this.f37197c);
        this.f37202h = 0;
    }

    /* renamed from: j */
    public void m53081j() {
        m53082i();
        int size = this.f37196b.size();
        for (int i = 0; i < size; i++) {
            C4930b c4930b = (C4930b) this.f37196b.get(i);
            int i2 = c4930b.f37203a;
            if (i2 != 1) {
                if (i2 != 2) {
                    if (i2 != 4) {
                        if (i2 == 8) {
                            this.f37198d.mo53062c(c4930b);
                            this.f37198d.mo53064a(c4930b.f37204b, c4930b.f37206d);
                        }
                    } else {
                        this.f37198d.mo53062c(c4930b);
                        this.f37198d.mo53057h(c4930b.f37204b, c4930b.f37206d, c4930b.f37205c);
                    }
                } else {
                    this.f37198d.mo53062c(c4930b);
                    this.f37198d.mo53059f(c4930b.f37204b, c4930b.f37206d);
                }
            } else {
                this.f37198d.mo53062c(c4930b);
                this.f37198d.mo53060e(c4930b.f37204b, c4930b.f37206d);
            }
            Runnable runnable = this.f37199e;
            if (runnable != null) {
                runnable.run();
            }
        }
        m53067x(this.f37196b);
        this.f37202h = 0;
    }

    /* renamed from: k */
    public final void m53080k(C4930b c4930b) {
        int i;
        int i2 = c4930b.f37203a;
        if (i2 != 1 && i2 != 8) {
            int m53065z = m53065z(c4930b.f37204b, i2);
            int i3 = c4930b.f37204b;
            int i4 = c4930b.f37203a;
            if (i4 != 2) {
                if (i4 == 4) {
                    i = 1;
                } else {
                    throw new IllegalArgumentException("op should be remove or update." + c4930b);
                }
            } else {
                i = 0;
            }
            int i5 = 1;
            for (int i6 = 1; i6 < c4930b.f37206d; i6++) {
                int m53065z2 = m53065z(c4930b.f37204b + (i * i6), c4930b.f37203a);
                int i7 = c4930b.f37203a;
                if (i7 == 2 ? m53065z2 == m53065z : !(i7 != 4 || m53065z2 != m53065z + 1)) {
                    i5++;
                } else {
                    C4930b mo52920a = mo52920a(i7, m53065z, i5, c4930b.f37205c);
                    m53079l(mo52920a, i3);
                    mo52919b(mo52920a);
                    if (c4930b.f37203a == 4) {
                        i3 += i5;
                    }
                    m53065z = m53065z2;
                    i5 = 1;
                }
            }
            Object obj = c4930b.f37205c;
            mo52919b(c4930b);
            if (i5 > 0) {
                C4930b mo52920a2 = mo52920a(c4930b.f37203a, m53065z, i5, obj);
                m53079l(mo52920a2, i3);
                mo52919b(mo52920a2);
                return;
            }
            return;
        }
        throw new IllegalArgumentException("should not dispatch add or move for pre layout");
    }

    /* renamed from: l */
    public void m53079l(C4930b c4930b, int i) {
        this.f37198d.mo53063b(c4930b);
        int i2 = c4930b.f37203a;
        if (i2 != 2) {
            if (i2 == 4) {
                this.f37198d.mo53057h(i, c4930b.f37206d, c4930b.f37205c);
                return;
            }
            throw new IllegalArgumentException("only remove and update ops can be dispatched in first pass");
        }
        this.f37198d.mo53059f(i, c4930b.f37206d);
    }

    /* renamed from: m */
    public int m53078m(int i) {
        return m53077n(i, 0);
    }

    /* renamed from: n */
    public int m53077n(int i, int i2) {
        int size = this.f37197c.size();
        while (i2 < size) {
            C4930b c4930b = (C4930b) this.f37197c.get(i2);
            int i3 = c4930b.f37203a;
            if (i3 == 8) {
                int i4 = c4930b.f37204b;
                if (i4 == i) {
                    i = c4930b.f37206d;
                } else {
                    if (i4 < i) {
                        i--;
                    }
                    if (c4930b.f37206d <= i) {
                        i++;
                    }
                }
            } else {
                int i5 = c4930b.f37204b;
                if (i5 > i) {
                    continue;
                } else if (i3 == 2) {
                    int i6 = c4930b.f37206d;
                    if (i < i5 + i6) {
                        return -1;
                    }
                    i -= i6;
                } else if (i3 == 1) {
                    i += c4930b.f37206d;
                }
            }
            i2++;
        }
        return i;
    }

    /* renamed from: o */
    public boolean m53076o(int i) {
        if ((i & this.f37202h) != 0) {
            return true;
        }
        return false;
    }

    /* renamed from: p */
    public boolean m53075p() {
        if (this.f37196b.size() > 0) {
            return true;
        }
        return false;
    }

    /* renamed from: q */
    public boolean m53074q() {
        if (!this.f37197c.isEmpty() && !this.f37196b.isEmpty()) {
            return true;
        }
        return false;
    }

    /* renamed from: r */
    public boolean m53073r(int i, int i2, Object obj) {
        if (i2 < 1) {
            return false;
        }
        this.f37196b.add(mo52920a(4, i, i2, obj));
        this.f37202h |= 4;
        if (this.f37196b.size() != 1) {
            return false;
        }
        return true;
    }

    /* renamed from: s */
    public boolean m53072s(int i, int i2) {
        if (i2 < 1) {
            return false;
        }
        this.f37196b.add(mo52920a(1, i, i2, null));
        this.f37202h |= 1;
        if (this.f37196b.size() != 1) {
            return false;
        }
        return true;
    }

    /* renamed from: t */
    public boolean m53071t(int i, int i2, int i3) {
        if (i == i2) {
            return false;
        }
        if (i3 == 1) {
            this.f37196b.add(mo52920a(8, i, i2, null));
            this.f37202h |= 8;
            if (this.f37196b.size() != 1) {
                return false;
            }
            return true;
        }
        throw new IllegalArgumentException("Moving more than 1 item is not supported yet");
    }

    /* renamed from: u */
    public boolean m53070u(int i, int i2) {
        if (i2 < 1) {
            return false;
        }
        this.f37196b.add(mo52920a(2, i, i2, null));
        this.f37202h |= 2;
        if (this.f37196b.size() != 1) {
            return false;
        }
        return true;
    }

    /* renamed from: v */
    public final void m53069v(C4930b c4930b) {
        this.f37197c.add(c4930b);
        int i = c4930b.f37203a;
        if (i != 1) {
            if (i != 2) {
                if (i != 4) {
                    if (i == 8) {
                        this.f37198d.mo53064a(c4930b.f37204b, c4930b.f37206d);
                        return;
                    }
                    throw new IllegalArgumentException("Unknown update op type for " + c4930b);
                }
                this.f37198d.mo53057h(c4930b.f37204b, c4930b.f37206d, c4930b.f37205c);
                return;
            }
            this.f37198d.mo53058g(c4930b.f37204b, c4930b.f37206d);
            return;
        }
        this.f37198d.mo53060e(c4930b.f37204b, c4930b.f37206d);
    }

    /* renamed from: w */
    public void m53068w() {
        this.f37201g.m52925b(this.f37196b);
        int size = this.f37196b.size();
        for (int i = 0; i < size; i++) {
            C4930b c4930b = (C4930b) this.f37196b.get(i);
            int i2 = c4930b.f37203a;
            if (i2 != 1) {
                if (i2 != 2) {
                    if (i2 != 4) {
                        if (i2 == 8) {
                            m53087d(c4930b);
                        }
                    } else {
                        m53084g(c4930b);
                    }
                } else {
                    m53085f(c4930b);
                }
            } else {
                m53088c(c4930b);
            }
            Runnable runnable = this.f37199e;
            if (runnable != null) {
                runnable.run();
            }
        }
        this.f37196b.clear();
    }

    /* renamed from: x */
    public void m53067x(List list) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            mo52919b((C4930b) list.get(i));
        }
        list.clear();
    }

    /* renamed from: y */
    public void m53066y() {
        m53067x(this.f37196b);
        m53067x(this.f37197c);
        this.f37202h = 0;
    }

    /* renamed from: z */
    public final int m53065z(int i, int i2) {
        int i3;
        int i4;
        for (int size = this.f37197c.size() - 1; size >= 0; size--) {
            C4930b c4930b = (C4930b) this.f37197c.get(size);
            int i5 = c4930b.f37203a;
            if (i5 == 8) {
                int i6 = c4930b.f37204b;
                int i7 = c4930b.f37206d;
                if (i6 < i7) {
                    i4 = i6;
                    i3 = i7;
                } else {
                    i3 = i6;
                    i4 = i7;
                }
                if (i >= i4 && i <= i3) {
                    if (i4 == i6) {
                        if (i2 == 1) {
                            c4930b.f37206d = i7 + 1;
                        } else if (i2 == 2) {
                            c4930b.f37206d = i7 - 1;
                        }
                        i++;
                    } else {
                        if (i2 == 1) {
                            c4930b.f37204b = i6 + 1;
                        } else if (i2 == 2) {
                            c4930b.f37204b = i6 - 1;
                        }
                        i--;
                    }
                } else if (i < i6) {
                    if (i2 == 1) {
                        c4930b.f37204b = i6 + 1;
                        c4930b.f37206d = i7 + 1;
                    } else if (i2 == 2) {
                        c4930b.f37204b = i6 - 1;
                        c4930b.f37206d = i7 - 1;
                    }
                }
            } else {
                int i8 = c4930b.f37204b;
                if (i8 <= i) {
                    if (i5 == 1) {
                        i -= c4930b.f37206d;
                    } else if (i5 == 2) {
                        i += c4930b.f37206d;
                    }
                } else if (i2 == 1) {
                    c4930b.f37204b = i8 + 1;
                } else if (i2 == 2) {
                    c4930b.f37204b = i8 - 1;
                }
            }
        }
        for (int size2 = this.f37197c.size() - 1; size2 >= 0; size2--) {
            C4930b c4930b2 = (C4930b) this.f37197c.get(size2);
            if (c4930b2.f37203a == 8) {
                int i9 = c4930b2.f37206d;
                if (i9 == c4930b2.f37204b || i9 < 0) {
                    this.f37197c.remove(size2);
                    mo52919b(c4930b2);
                }
            } else if (c4930b2.f37206d <= 0) {
                this.f37197c.remove(size2);
                mo52919b(c4930b2);
            }
        }
        return i;
    }

    public C4928a(InterfaceC4929a interfaceC4929a, boolean z) {
        this.f37195a = new Pools.SimplePool(30);
        this.f37196b = new ArrayList();
        this.f37197c = new ArrayList();
        this.f37202h = 0;
        this.f37198d = interfaceC4929a;
        this.f37200f = z;
        this.f37201g = new C4956i(this);
    }
}