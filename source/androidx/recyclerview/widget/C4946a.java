package androidx.recyclerview.widget;

import androidx.core.util.Pools;
import androidx.recyclerview.widget.C4974i;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.analytics.ecommerce.ProductAction;
import java.util.ArrayList;
import java.util.List;

/* renamed from: androidx.recyclerview.widget.a */
/* loaded from: classes2.dex */
public final class C4946a implements C4974i.InterfaceC4975a {

    /* renamed from: a */
    public Pools.Pool f37107a;

    /* renamed from: b */
    public final ArrayList f37108b;

    /* renamed from: c */
    public final ArrayList f37109c;

    /* renamed from: d */
    public final InterfaceC4947a f37110d;

    /* renamed from: e */
    public Runnable f37111e;

    /* renamed from: f */
    public final boolean f37112f;

    /* renamed from: g */
    public final C4974i f37113g;

    /* renamed from: h */
    public int f37114h;

    /* renamed from: androidx.recyclerview.widget.a$a */
    /* loaded from: classes2.dex */
    public interface InterfaceC4947a {
        /* renamed from: a */
        void mo53113a(int i, int i2);

        /* renamed from: b */
        void mo53112b(C4948b c4948b);

        /* renamed from: c */
        void mo53111c(C4948b c4948b);

        /* renamed from: d */
        RecyclerView.ViewHolder mo53110d(int i);

        /* renamed from: e */
        void mo53109e(int i, int i2);

        /* renamed from: f */
        void mo53108f(int i, int i2);

        /* renamed from: g */
        void mo53107g(int i, int i2);

        /* renamed from: h */
        void mo53106h(int i, int i2, Object obj);
    }

    /* renamed from: androidx.recyclerview.widget.a$b */
    /* loaded from: classes2.dex */
    public static final class C4948b {

        /* renamed from: a */
        public int f37115a;

        /* renamed from: b */
        public int f37116b;

        /* renamed from: c */
        public Object f37117c;

        /* renamed from: d */
        public int f37118d;

        public C4948b(int i, int i2, int i3, Object obj) {
            this.f37115a = i;
            this.f37116b = i2;
            this.f37118d = i3;
            this.f37117c = obj;
        }

        /* renamed from: a */
        public String m53105a() {
            int i = this.f37115a;
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
            if (!(obj instanceof C4948b)) {
                return false;
            }
            C4948b c4948b = (C4948b) obj;
            int i = this.f37115a;
            if (i != c4948b.f37115a) {
                return false;
            }
            if (i == 8 && Math.abs(this.f37118d - this.f37116b) == 1 && this.f37118d == c4948b.f37116b && this.f37116b == c4948b.f37118d) {
                return true;
            }
            if (this.f37118d != c4948b.f37118d || this.f37116b != c4948b.f37116b) {
                return false;
            }
            Object obj2 = this.f37117c;
            if (obj2 != null) {
                if (!obj2.equals(c4948b.f37117c)) {
                    return false;
                }
            } else if (c4948b.f37117c != null) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            return (((this.f37115a * 31) + this.f37116b) * 31) + this.f37118d;
        }

        public String toString() {
            return Integer.toHexString(System.identityHashCode(this)) + "[" + m53105a() + ",s:" + this.f37116b + "c:" + this.f37118d + ",p:" + this.f37117c + "]";
        }
    }

    public C4946a(InterfaceC4947a interfaceC4947a) {
        this(interfaceC4947a, false);
    }

    @Override // androidx.recyclerview.widget.C4974i.InterfaceC4975a
    /* renamed from: a */
    public C4948b mo52969a(int i, int i2, int i3, Object obj) {
        C4948b c4948b = (C4948b) this.f37107a.acquire();
        if (c4948b == null) {
            return new C4948b(i, i2, i3, obj);
        }
        c4948b.f37115a = i;
        c4948b.f37116b = i2;
        c4948b.f37118d = i3;
        c4948b.f37117c = obj;
        return c4948b;
    }

    @Override // androidx.recyclerview.widget.C4974i.InterfaceC4975a
    /* renamed from: b */
    public void mo52968b(C4948b c4948b) {
        if (!this.f37112f) {
            c4948b.f37117c = null;
            this.f37107a.release(c4948b);
        }
    }

    /* renamed from: c */
    public final void m53137c(C4948b c4948b) {
        m53118v(c4948b);
    }

    /* renamed from: d */
    public final void m53136d(C4948b c4948b) {
        m53118v(c4948b);
    }

    /* renamed from: e */
    public int m53135e(int i) {
        int size = this.f37108b.size();
        for (int i2 = 0; i2 < size; i2++) {
            C4948b c4948b = (C4948b) this.f37108b.get(i2);
            int i3 = c4948b.f37115a;
            if (i3 != 1) {
                if (i3 != 2) {
                    if (i3 == 8) {
                        int i4 = c4948b.f37116b;
                        if (i4 == i) {
                            i = c4948b.f37118d;
                        } else {
                            if (i4 < i) {
                                i--;
                            }
                            if (c4948b.f37118d <= i) {
                                i++;
                            }
                        }
                    }
                } else {
                    int i5 = c4948b.f37116b;
                    if (i5 <= i) {
                        int i6 = c4948b.f37118d;
                        if (i5 + i6 > i) {
                            return -1;
                        }
                        i -= i6;
                    } else {
                        continue;
                    }
                }
            } else if (c4948b.f37116b <= i) {
                i += c4948b.f37118d;
            }
        }
        return i;
    }

    /* renamed from: f */
    public final void m53134f(C4948b c4948b) {
        boolean z;
        char c;
        int i = c4948b.f37116b;
        int i2 = c4948b.f37118d + i;
        char c2 = 65535;
        int i3 = i;
        int i4 = 0;
        while (i3 < i2) {
            if (this.f37110d.mo53110d(i3) == null && !m53132h(i3)) {
                if (c2 == 1) {
                    m53118v(mo52969a(2, i, i4, null));
                    z = true;
                } else {
                    z = false;
                }
                c = 0;
            } else {
                if (c2 == 0) {
                    m53129k(mo52969a(2, i, i4, null));
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
        if (i4 != c4948b.f37118d) {
            mo52968b(c4948b);
            c4948b = mo52969a(2, i, i4, null);
        }
        if (c2 == 0) {
            m53129k(c4948b);
        } else {
            m53118v(c4948b);
        }
    }

    /* renamed from: g */
    public final void m53133g(C4948b c4948b) {
        int i = c4948b.f37116b;
        int i2 = c4948b.f37118d + i;
        int i3 = i;
        char c = 65535;
        int i4 = 0;
        while (i < i2) {
            if (this.f37110d.mo53110d(i) == null && !m53132h(i)) {
                if (c == 1) {
                    m53118v(mo52969a(4, i3, i4, c4948b.f37117c));
                    i3 = i;
                    i4 = 0;
                }
                c = 0;
            } else {
                if (c == 0) {
                    m53129k(mo52969a(4, i3, i4, c4948b.f37117c));
                    i3 = i;
                    i4 = 0;
                }
                c = 1;
            }
            i4++;
            i++;
        }
        if (i4 != c4948b.f37118d) {
            Object obj = c4948b.f37117c;
            mo52968b(c4948b);
            c4948b = mo52969a(4, i3, i4, obj);
        }
        if (c == 0) {
            m53129k(c4948b);
        } else {
            m53118v(c4948b);
        }
    }

    /* renamed from: h */
    public final boolean m53132h(int i) {
        int size = this.f37109c.size();
        for (int i2 = 0; i2 < size; i2++) {
            C4948b c4948b = (C4948b) this.f37109c.get(i2);
            int i3 = c4948b.f37115a;
            if (i3 == 8) {
                if (m53126n(c4948b.f37118d, i2 + 1) == i) {
                    return true;
                }
            } else if (i3 == 1) {
                int i4 = c4948b.f37116b;
                int i5 = c4948b.f37118d + i4;
                while (i4 < i5) {
                    if (m53126n(i4, i2 + 1) == i) {
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
    public void m53131i() {
        int size = this.f37109c.size();
        for (int i = 0; i < size; i++) {
            this.f37110d.mo53111c((C4948b) this.f37109c.get(i));
        }
        m53116x(this.f37109c);
        this.f37114h = 0;
    }

    /* renamed from: j */
    public void m53130j() {
        m53131i();
        int size = this.f37108b.size();
        for (int i = 0; i < size; i++) {
            C4948b c4948b = (C4948b) this.f37108b.get(i);
            int i2 = c4948b.f37115a;
            if (i2 != 1) {
                if (i2 != 2) {
                    if (i2 != 4) {
                        if (i2 == 8) {
                            this.f37110d.mo53111c(c4948b);
                            this.f37110d.mo53113a(c4948b.f37116b, c4948b.f37118d);
                        }
                    } else {
                        this.f37110d.mo53111c(c4948b);
                        this.f37110d.mo53106h(c4948b.f37116b, c4948b.f37118d, c4948b.f37117c);
                    }
                } else {
                    this.f37110d.mo53111c(c4948b);
                    this.f37110d.mo53108f(c4948b.f37116b, c4948b.f37118d);
                }
            } else {
                this.f37110d.mo53111c(c4948b);
                this.f37110d.mo53109e(c4948b.f37116b, c4948b.f37118d);
            }
            Runnable runnable = this.f37111e;
            if (runnable != null) {
                runnable.run();
            }
        }
        m53116x(this.f37108b);
        this.f37114h = 0;
    }

    /* renamed from: k */
    public final void m53129k(C4948b c4948b) {
        int i;
        int i2 = c4948b.f37115a;
        if (i2 != 1 && i2 != 8) {
            int m53114z = m53114z(c4948b.f37116b, i2);
            int i3 = c4948b.f37116b;
            int i4 = c4948b.f37115a;
            if (i4 != 2) {
                if (i4 == 4) {
                    i = 1;
                } else {
                    throw new IllegalArgumentException("op should be remove or update." + c4948b);
                }
            } else {
                i = 0;
            }
            int i5 = 1;
            for (int i6 = 1; i6 < c4948b.f37118d; i6++) {
                int m53114z2 = m53114z(c4948b.f37116b + (i * i6), c4948b.f37115a);
                int i7 = c4948b.f37115a;
                if (i7 == 2 ? m53114z2 == m53114z : !(i7 != 4 || m53114z2 != m53114z + 1)) {
                    i5++;
                } else {
                    C4948b mo52969a = mo52969a(i7, m53114z, i5, c4948b.f37117c);
                    m53128l(mo52969a, i3);
                    mo52968b(mo52969a);
                    if (c4948b.f37115a == 4) {
                        i3 += i5;
                    }
                    m53114z = m53114z2;
                    i5 = 1;
                }
            }
            Object obj = c4948b.f37117c;
            mo52968b(c4948b);
            if (i5 > 0) {
                C4948b mo52969a2 = mo52969a(c4948b.f37115a, m53114z, i5, obj);
                m53128l(mo52969a2, i3);
                mo52968b(mo52969a2);
                return;
            }
            return;
        }
        throw new IllegalArgumentException("should not dispatch add or move for pre layout");
    }

    /* renamed from: l */
    public void m53128l(C4948b c4948b, int i) {
        this.f37110d.mo53112b(c4948b);
        int i2 = c4948b.f37115a;
        if (i2 != 2) {
            if (i2 == 4) {
                this.f37110d.mo53106h(i, c4948b.f37118d, c4948b.f37117c);
                return;
            }
            throw new IllegalArgumentException("only remove and update ops can be dispatched in first pass");
        }
        this.f37110d.mo53108f(i, c4948b.f37118d);
    }

    /* renamed from: m */
    public int m53127m(int i) {
        return m53126n(i, 0);
    }

    /* renamed from: n */
    public int m53126n(int i, int i2) {
        int size = this.f37109c.size();
        while (i2 < size) {
            C4948b c4948b = (C4948b) this.f37109c.get(i2);
            int i3 = c4948b.f37115a;
            if (i3 == 8) {
                int i4 = c4948b.f37116b;
                if (i4 == i) {
                    i = c4948b.f37118d;
                } else {
                    if (i4 < i) {
                        i--;
                    }
                    if (c4948b.f37118d <= i) {
                        i++;
                    }
                }
            } else {
                int i5 = c4948b.f37116b;
                if (i5 > i) {
                    continue;
                } else if (i3 == 2) {
                    int i6 = c4948b.f37118d;
                    if (i < i5 + i6) {
                        return -1;
                    }
                    i -= i6;
                } else if (i3 == 1) {
                    i += c4948b.f37118d;
                }
            }
            i2++;
        }
        return i;
    }

    /* renamed from: o */
    public boolean m53125o(int i) {
        if ((i & this.f37114h) != 0) {
            return true;
        }
        return false;
    }

    /* renamed from: p */
    public boolean m53124p() {
        if (this.f37108b.size() > 0) {
            return true;
        }
        return false;
    }

    /* renamed from: q */
    public boolean m53123q() {
        if (!this.f37109c.isEmpty() && !this.f37108b.isEmpty()) {
            return true;
        }
        return false;
    }

    /* renamed from: r */
    public boolean m53122r(int i, int i2, Object obj) {
        if (i2 < 1) {
            return false;
        }
        this.f37108b.add(mo52969a(4, i, i2, obj));
        this.f37114h |= 4;
        if (this.f37108b.size() != 1) {
            return false;
        }
        return true;
    }

    /* renamed from: s */
    public boolean m53121s(int i, int i2) {
        if (i2 < 1) {
            return false;
        }
        this.f37108b.add(mo52969a(1, i, i2, null));
        this.f37114h |= 1;
        if (this.f37108b.size() != 1) {
            return false;
        }
        return true;
    }

    /* renamed from: t */
    public boolean m53120t(int i, int i2, int i3) {
        if (i == i2) {
            return false;
        }
        if (i3 == 1) {
            this.f37108b.add(mo52969a(8, i, i2, null));
            this.f37114h |= 8;
            if (this.f37108b.size() != 1) {
                return false;
            }
            return true;
        }
        throw new IllegalArgumentException("Moving more than 1 item is not supported yet");
    }

    /* renamed from: u */
    public boolean m53119u(int i, int i2) {
        if (i2 < 1) {
            return false;
        }
        this.f37108b.add(mo52969a(2, i, i2, null));
        this.f37114h |= 2;
        if (this.f37108b.size() != 1) {
            return false;
        }
        return true;
    }

    /* renamed from: v */
    public final void m53118v(C4948b c4948b) {
        this.f37109c.add(c4948b);
        int i = c4948b.f37115a;
        if (i != 1) {
            if (i != 2) {
                if (i != 4) {
                    if (i == 8) {
                        this.f37110d.mo53113a(c4948b.f37116b, c4948b.f37118d);
                        return;
                    }
                    throw new IllegalArgumentException("Unknown update op type for " + c4948b);
                }
                this.f37110d.mo53106h(c4948b.f37116b, c4948b.f37118d, c4948b.f37117c);
                return;
            }
            this.f37110d.mo53107g(c4948b.f37116b, c4948b.f37118d);
            return;
        }
        this.f37110d.mo53109e(c4948b.f37116b, c4948b.f37118d);
    }

    /* renamed from: w */
    public void m53117w() {
        this.f37113g.m52974b(this.f37108b);
        int size = this.f37108b.size();
        for (int i = 0; i < size; i++) {
            C4948b c4948b = (C4948b) this.f37108b.get(i);
            int i2 = c4948b.f37115a;
            if (i2 != 1) {
                if (i2 != 2) {
                    if (i2 != 4) {
                        if (i2 == 8) {
                            m53136d(c4948b);
                        }
                    } else {
                        m53133g(c4948b);
                    }
                } else {
                    m53134f(c4948b);
                }
            } else {
                m53137c(c4948b);
            }
            Runnable runnable = this.f37111e;
            if (runnable != null) {
                runnable.run();
            }
        }
        this.f37108b.clear();
    }

    /* renamed from: x */
    public void m53116x(List list) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            mo52968b((C4948b) list.get(i));
        }
        list.clear();
    }

    /* renamed from: y */
    public void m53115y() {
        m53116x(this.f37108b);
        m53116x(this.f37109c);
        this.f37114h = 0;
    }

    /* renamed from: z */
    public final int m53114z(int i, int i2) {
        int i3;
        int i4;
        for (int size = this.f37109c.size() - 1; size >= 0; size--) {
            C4948b c4948b = (C4948b) this.f37109c.get(size);
            int i5 = c4948b.f37115a;
            if (i5 == 8) {
                int i6 = c4948b.f37116b;
                int i7 = c4948b.f37118d;
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
                            c4948b.f37118d = i7 + 1;
                        } else if (i2 == 2) {
                            c4948b.f37118d = i7 - 1;
                        }
                        i++;
                    } else {
                        if (i2 == 1) {
                            c4948b.f37116b = i6 + 1;
                        } else if (i2 == 2) {
                            c4948b.f37116b = i6 - 1;
                        }
                        i--;
                    }
                } else if (i < i6) {
                    if (i2 == 1) {
                        c4948b.f37116b = i6 + 1;
                        c4948b.f37118d = i7 + 1;
                    } else if (i2 == 2) {
                        c4948b.f37116b = i6 - 1;
                        c4948b.f37118d = i7 - 1;
                    }
                }
            } else {
                int i8 = c4948b.f37116b;
                if (i8 <= i) {
                    if (i5 == 1) {
                        i -= c4948b.f37118d;
                    } else if (i5 == 2) {
                        i += c4948b.f37118d;
                    }
                } else if (i2 == 1) {
                    c4948b.f37116b = i8 + 1;
                } else if (i2 == 2) {
                    c4948b.f37116b = i8 - 1;
                }
            }
        }
        for (int size2 = this.f37109c.size() - 1; size2 >= 0; size2--) {
            C4948b c4948b2 = (C4948b) this.f37109c.get(size2);
            if (c4948b2.f37115a == 8) {
                int i9 = c4948b2.f37118d;
                if (i9 == c4948b2.f37116b || i9 < 0) {
                    this.f37109c.remove(size2);
                    mo52968b(c4948b2);
                }
            } else if (c4948b2.f37118d <= 0) {
                this.f37109c.remove(size2);
                mo52968b(c4948b2);
            }
        }
        return i;
    }

    public C4946a(InterfaceC4947a interfaceC4947a, boolean z) {
        this.f37107a = new Pools.SimplePool(30);
        this.f37108b = new ArrayList();
        this.f37109c = new ArrayList();
        this.f37114h = 0;
        this.f37110d = interfaceC4947a;
        this.f37112f = z;
        this.f37113g = new C4974i(this);
    }
}
