package p000;

import java.util.ArrayList;
import java.util.List;

/* renamed from: BT */
/* loaded from: classes5.dex */
public final class C0105BT {

    /* renamed from: a */
    public final List f401a;

    /* renamed from: b */
    public final int f402b;

    /* renamed from: c */
    public final boolean f403c;

    public C0105BT(List list, int i, boolean z) {
        this.f401a = new ArrayList(list);
        this.f402b = i;
        this.f403c = z;
    }

    /* renamed from: a */
    public List m68915a() {
        return this.f401a;
    }

    /* renamed from: b */
    public int m68914b() {
        return this.f402b;
    }

    /* renamed from: c */
    public boolean m68913c(List list) {
        return this.f401a.equals(list);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C0105BT)) {
            return false;
        }
        C0105BT c0105bt = (C0105BT) obj;
        if (!this.f401a.equals(c0105bt.m68915a()) || this.f403c != c0105bt.f403c) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return this.f401a.hashCode() ^ Boolean.valueOf(this.f403c).hashCode();
    }

    public String toString() {
        return "{ " + this.f401a + " }";
    }
}
