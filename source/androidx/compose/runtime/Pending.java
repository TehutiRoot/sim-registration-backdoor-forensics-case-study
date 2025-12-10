package androidx.compose.runtime;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class Pending {

    /* renamed from: a */
    public final List f28365a;

    /* renamed from: b */
    public final int f28366b;

    /* renamed from: c */
    public int f28367c;

    /* renamed from: d */
    public final List f28368d;

    /* renamed from: e */
    public final HashMap f28369e;

    /* renamed from: f */
    public final Lazy f28370f;

    public Pending(List keyInfos, int i) {
        Intrinsics.checkNotNullParameter(keyInfos, "keyInfos");
        this.f28365a = keyInfos;
        this.f28366b = i;
        if (i >= 0) {
            this.f28368d = new ArrayList();
            HashMap hashMap = new HashMap();
            int size = keyInfos.size();
            int i2 = 0;
            for (int i3 = 0; i3 < size; i3++) {
                KeyInfo keyInfo = (KeyInfo) this.f28365a.get(i3);
                hashMap.put(Integer.valueOf(keyInfo.getLocation()), new C19124b70(i3, i2, keyInfo.getNodes()));
                i2 += keyInfo.getNodes();
            }
            this.f28369e = hashMap;
            this.f28370f = LazyKt__LazyJVMKt.lazy(new Pending$keyMap$2(this));
            return;
        }
        throw new IllegalArgumentException("Invalid start index".toString());
    }

    /* renamed from: a */
    public final int m60263a() {
        return this.f28367c;
    }

    /* renamed from: b */
    public final List m60262b() {
        return this.f28365a;
    }

    /* renamed from: c */
    public final HashMap m60261c() {
        return (HashMap) this.f28370f.getValue();
    }

    /* renamed from: d */
    public final KeyInfo m60260d(int i, Object obj) {
        Object valueOf;
        Object m60298o;
        if (obj != null) {
            valueOf = new JoinedKey(Integer.valueOf(i), obj);
        } else {
            valueOf = Integer.valueOf(i);
        }
        m60298o = ComposerKt.m60298o(m60261c(), valueOf);
        return (KeyInfo) m60298o;
    }

    /* renamed from: e */
    public final int m60259e() {
        return this.f28366b;
    }

    /* renamed from: f */
    public final List m60258f() {
        return this.f28368d;
    }

    /* renamed from: g */
    public final int m60257g(KeyInfo keyInfo) {
        Intrinsics.checkNotNullParameter(keyInfo, "keyInfo");
        C19124b70 c19124b70 = (C19124b70) this.f28369e.get(Integer.valueOf(keyInfo.getLocation()));
        if (c19124b70 != null) {
            return c19124b70.m52043b();
        }
        return -1;
    }

    /* renamed from: h */
    public final boolean m60256h(KeyInfo keyInfo) {
        Intrinsics.checkNotNullParameter(keyInfo, "keyInfo");
        return this.f28368d.add(keyInfo);
    }

    /* renamed from: i */
    public final void m60255i(KeyInfo keyInfo, int i) {
        Intrinsics.checkNotNullParameter(keyInfo, "keyInfo");
        this.f28369e.put(Integer.valueOf(keyInfo.getLocation()), new C19124b70(-1, i, 0));
    }

    /* renamed from: j */
    public final void m60254j(int i, int i2, int i3) {
        if (i > i2) {
            Collection<C19124b70> values = this.f28369e.values();
            Intrinsics.checkNotNullExpressionValue(values, "groupInfos.values");
            for (C19124b70 c19124b70 : values) {
                int m52043b = c19124b70.m52043b();
                if (i <= m52043b && m52043b < i + i3) {
                    c19124b70.m52040e((m52043b - i) + i2);
                } else if (i2 <= m52043b && m52043b < i) {
                    c19124b70.m52040e(m52043b + i3);
                }
            }
        } else if (i2 > i) {
            Collection<C19124b70> values2 = this.f28369e.values();
            Intrinsics.checkNotNullExpressionValue(values2, "groupInfos.values");
            for (C19124b70 c19124b702 : values2) {
                int m52043b2 = c19124b702.m52043b();
                if (i <= m52043b2 && m52043b2 < i + i3) {
                    c19124b702.m52040e((m52043b2 - i) + i2);
                } else if (i + 1 <= m52043b2 && m52043b2 < i2) {
                    c19124b702.m52040e(m52043b2 - i3);
                }
            }
        }
    }

    /* renamed from: k */
    public final void m60253k(int i, int i2) {
        if (i > i2) {
            Collection<C19124b70> values = this.f28369e.values();
            Intrinsics.checkNotNullExpressionValue(values, "groupInfos.values");
            for (C19124b70 c19124b70 : values) {
                int m52042c = c19124b70.m52042c();
                if (m52042c == i) {
                    c19124b70.m52039f(i2);
                } else if (i2 <= m52042c && m52042c < i) {
                    c19124b70.m52039f(m52042c + 1);
                }
            }
        } else if (i2 > i) {
            Collection<C19124b70> values2 = this.f28369e.values();
            Intrinsics.checkNotNullExpressionValue(values2, "groupInfos.values");
            for (C19124b70 c19124b702 : values2) {
                int m52042c2 = c19124b702.m52042c();
                if (m52042c2 == i) {
                    c19124b702.m52039f(i2);
                } else if (i + 1 <= m52042c2 && m52042c2 < i2) {
                    c19124b702.m52039f(m52042c2 - 1);
                }
            }
        }
    }

    /* renamed from: l */
    public final void m60252l(int i) {
        this.f28367c = i;
    }

    /* renamed from: m */
    public final int m60251m(KeyInfo keyInfo) {
        Intrinsics.checkNotNullParameter(keyInfo, "keyInfo");
        C19124b70 c19124b70 = (C19124b70) this.f28369e.get(Integer.valueOf(keyInfo.getLocation()));
        if (c19124b70 != null) {
            return c19124b70.m52042c();
        }
        return -1;
    }

    /* renamed from: n */
    public final boolean m60250n(int i, int i2) {
        int m52043b;
        C19124b70 c19124b70 = (C19124b70) this.f28369e.get(Integer.valueOf(i));
        if (c19124b70 != null) {
            int m52043b2 = c19124b70.m52043b();
            int m52044a = i2 - c19124b70.m52044a();
            c19124b70.m52041d(i2);
            if (m52044a != 0) {
                Collection<C19124b70> values = this.f28369e.values();
                Intrinsics.checkNotNullExpressionValue(values, "groupInfos.values");
                for (C19124b70 c19124b702 : values) {
                    if (c19124b702.m52043b() >= m52043b2 && !Intrinsics.areEqual(c19124b702, c19124b70) && (m52043b = c19124b702.m52043b() + m52044a) >= 0) {
                        c19124b702.m52040e(m52043b);
                    }
                }
                return true;
            }
            return true;
        }
        return false;
    }

    /* renamed from: o */
    public final int m60249o(KeyInfo keyInfo) {
        Intrinsics.checkNotNullParameter(keyInfo, "keyInfo");
        C19124b70 c19124b70 = (C19124b70) this.f28369e.get(Integer.valueOf(keyInfo.getLocation()));
        if (c19124b70 != null) {
            return c19124b70.m52044a();
        }
        return keyInfo.getNodes();
    }
}
