package com.google.android.material.carousel;

import com.google.android.material.animation.AnimationUtils;
import com.google.android.material.carousel.C6869a;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: com.google.android.material.carousel.b */
/* loaded from: classes4.dex */
public class C6873b {

    /* renamed from: a */
    public final C6869a f49419a;

    /* renamed from: b */
    public final List f49420b;

    /* renamed from: c */
    public final List f49421c;

    /* renamed from: d */
    public final float[] f49422d;

    /* renamed from: e */
    public final float[] f49423e;

    /* renamed from: f */
    public final float f49424f;

    /* renamed from: g */
    public final float f49425g;

    public C6873b(C6869a c6869a, List list, List list2) {
        this.f49419a = c6869a;
        this.f49420b = Collections.unmodifiableList(list);
        this.f49421c = Collections.unmodifiableList(list2);
        float f = ((C6869a) list.get(list.size() - 1)).m45474c().f49415a - c6869a.m45474c().f49415a;
        this.f49424f = f;
        float f2 = c6869a.m45469h().f49415a - ((C6869a) list2.get(list2.size() - 1)).m45469h().f49415a;
        this.f49425g = f2;
        this.f49422d = m45450j(f, list, true);
        this.f49423e = m45450j(f2, list2, false);
    }

    /* renamed from: a */
    public static int m45459a(C6869a c6869a) {
        for (int i = 0; i < c6869a.m45472e().size(); i++) {
            if (((C6869a.C6872c) c6869a.m45472e().get(i)).f49416b >= 0.0f) {
                return i;
            }
        }
        return -1;
    }

    /* renamed from: b */
    public static int m45458b(C6869a c6869a, float f) {
        for (int m45470g = c6869a.m45470g(); m45470g < c6869a.m45472e().size(); m45470g++) {
            if (f == ((C6869a.C6872c) c6869a.m45472e().get(m45470g)).f49417c) {
                return m45470g;
            }
        }
        return c6869a.m45472e().size() - 1;
    }

    /* renamed from: c */
    public static int m45457c(InterfaceC13206qm interfaceC13206qm, C6869a c6869a) {
        for (int size = c6869a.m45472e().size() - 1; size >= 0; size--) {
            if (((C6869a.C6872c) c6869a.m45472e().get(size)).f49416b <= interfaceC13206qm.getContainerWidth()) {
                return size;
            }
        }
        return -1;
    }

    /* renamed from: d */
    public static int m45456d(C6869a c6869a, float f) {
        for (int m45475b = c6869a.m45475b() - 1; m45475b >= 0; m45475b--) {
            if (f == ((C6869a.C6872c) c6869a.m45472e().get(m45475b)).f49417c) {
                return m45475b;
            }
        }
        return 0;
    }

    /* renamed from: e */
    public static C6873b m45455e(InterfaceC13206qm interfaceC13206qm, C6869a c6869a) {
        return new C6873b(c6869a, m45449k(c6869a), m45448l(interfaceC13206qm, c6869a));
    }

    /* renamed from: j */
    public static float[] m45450j(float f, List list, boolean z) {
        float f2;
        float f3;
        int size = list.size();
        float[] fArr = new float[size];
        for (int i = 1; i < size; i++) {
            int i2 = i - 1;
            C6869a c6869a = (C6869a) list.get(i2);
            C6869a c6869a2 = (C6869a) list.get(i);
            if (z) {
                f2 = c6869a2.m45474c().f49415a - c6869a.m45474c().f49415a;
            } else {
                f2 = c6869a.m45469h().f49415a - c6869a2.m45469h().f49415a;
            }
            float f4 = f2 / f;
            if (i == size - 1) {
                f3 = 1.0f;
            } else {
                f3 = fArr[i2] + f4;
            }
            fArr[i] = f3;
        }
        return fArr;
    }

    /* renamed from: k */
    public static List m45449k(C6869a c6869a) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(c6869a);
        int m45459a = m45459a(c6869a);
        if (!m45447m(c6869a) && m45459a != -1) {
            int m45475b = (c6869a.m45475b() - 1) - m45459a;
            float f = c6869a.m45474c().f49416b - (c6869a.m45474c().f49418d / 2.0f);
            for (int i = 0; i <= m45475b; i++) {
                C6869a c6869a2 = (C6869a) arrayList.get(arrayList.size() - 1);
                int size = c6869a.m45472e().size() - 1;
                int i2 = (m45459a + i) - 1;
                if (i2 >= 0) {
                    size = m45458b(c6869a2, ((C6869a.C6872c) c6869a.m45472e().get(i2)).f49417c) - 1;
                }
                arrayList.add(m45444p(c6869a2, m45459a, size, f, (c6869a.m45475b() - i) - 1, (c6869a.m45470g() - i) - 1));
            }
        }
        return arrayList;
    }

    /* renamed from: l */
    public static List m45448l(InterfaceC13206qm interfaceC13206qm, C6869a c6869a) {
        int i;
        ArrayList arrayList = new ArrayList();
        arrayList.add(c6869a);
        int m45457c = m45457c(interfaceC13206qm, c6869a);
        if (!m45446n(interfaceC13206qm, c6869a) && m45457c != -1) {
            int m45470g = m45457c - c6869a.m45470g();
            float f = c6869a.m45474c().f49416b - (c6869a.m45474c().f49418d / 2.0f);
            for (int i2 = 0; i2 < m45470g; i2++) {
                C6869a c6869a2 = (C6869a) arrayList.get(arrayList.size() - 1);
                int i3 = (m45457c - i2) + 1;
                if (i3 < c6869a.m45472e().size()) {
                    i = m45456d(c6869a2, ((C6869a.C6872c) c6869a.m45472e().get(i3)).f49417c) + 1;
                } else {
                    i = 0;
                }
                arrayList.add(m45444p(c6869a2, m45457c, i, f, c6869a.m45475b() + i2 + 1, c6869a.m45470g() + i2 + 1));
            }
        }
        return arrayList;
    }

    /* renamed from: m */
    public static boolean m45447m(C6869a c6869a) {
        if (c6869a.m45476a().f49416b - (c6869a.m45476a().f49418d / 2.0f) > 0.0f && c6869a.m45476a() != c6869a.m45474c()) {
            return false;
        }
        return true;
    }

    /* renamed from: n */
    public static boolean m45446n(InterfaceC13206qm interfaceC13206qm, C6869a c6869a) {
        if (c6869a.m45471f().f49416b + (c6869a.m45471f().f49418d / 2.0f) < interfaceC13206qm.getContainerWidth() && c6869a.m45471f() != c6869a.m45469h()) {
            return false;
        }
        return true;
    }

    /* renamed from: o */
    public static C6869a m45445o(List list, float f, float[] fArr) {
        int size = list.size();
        float f2 = fArr[0];
        int i = 1;
        while (i < size) {
            float f3 = fArr[i];
            if (f <= f3) {
                return C6869a.m45468i((C6869a) list.get(i - 1), (C6869a) list.get(i), AnimationUtils.lerp(0.0f, 1.0f, f2, f3, f));
            }
            i++;
            f2 = f3;
        }
        return (C6869a) list.get(0);
    }

    /* renamed from: p */
    public static C6869a m45444p(C6869a c6869a, int i, int i2, float f, int i3, int i4) {
        boolean z;
        ArrayList arrayList = new ArrayList(c6869a.m45472e());
        arrayList.add(i2, (C6869a.C6872c) arrayList.remove(i));
        C6869a.C6871b c6871b = new C6869a.C6871b(c6869a.m45473d());
        for (int i5 = 0; i5 < arrayList.size(); i5++) {
            C6869a.C6872c c6872c = (C6869a.C6872c) arrayList.get(i5);
            float f2 = c6872c.f49418d;
            float f3 = (f2 / 2.0f) + f;
            if (i5 >= i3 && i5 <= i4) {
                z = true;
            } else {
                z = false;
            }
            c6871b.m45465b(f3, c6872c.f49417c, f2, z);
            f += c6872c.f49418d;
        }
        return c6871b.m45462e();
    }

    /* renamed from: f */
    public C6869a m45454f() {
        return this.f49419a;
    }

    /* renamed from: g */
    public C6869a m45453g() {
        List list = this.f49420b;
        return (C6869a) list.get(list.size() - 1);
    }

    /* renamed from: h */
    public C6869a m45452h() {
        List list = this.f49421c;
        return (C6869a) list.get(list.size() - 1);
    }

    /* renamed from: i */
    public C6869a m45451i(float f, float f2, float f3) {
        float f4 = this.f49424f + f2;
        float f5 = f3 - this.f49425g;
        if (f < f4) {
            return m45445o(this.f49420b, AnimationUtils.lerp(1.0f, 0.0f, f2, f4, f), this.f49422d);
        } else if (f > f5) {
            return m45445o(this.f49421c, AnimationUtils.lerp(0.0f, 1.0f, f5, f3, f), this.f49423e);
        } else {
            return this.f49419a;
        }
    }
}
