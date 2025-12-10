package p000;

import java.util.ArrayList;
import java.util.List;

/* renamed from: FT */
/* loaded from: classes5.dex */
public final class C0385FT {

    /* renamed from: a */
    public final List f1685a;

    /* renamed from: b */
    public final int f1686b;

    /* renamed from: c */
    public final boolean f1687c;

    public C0385FT(List list, int i, boolean z) {
        this.f1685a = new ArrayList(list);
        this.f1686b = i;
        this.f1687c = z;
    }

    /* renamed from: a */
    public List m68426a() {
        return this.f1685a;
    }

    /* renamed from: b */
    public int m68425b() {
        return this.f1686b;
    }

    /* renamed from: c */
    public boolean m68424c(List list) {
        return this.f1685a.equals(list);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C0385FT)) {
            return false;
        }
        C0385FT c0385ft = (C0385FT) obj;
        if (!this.f1685a.equals(c0385ft.m68426a()) || this.f1687c != c0385ft.f1687c) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return this.f1685a.hashCode() ^ Boolean.valueOf(this.f1687c).hashCode();
    }

    public String toString() {
        return "{ " + this.f1685a + " }";
    }
}