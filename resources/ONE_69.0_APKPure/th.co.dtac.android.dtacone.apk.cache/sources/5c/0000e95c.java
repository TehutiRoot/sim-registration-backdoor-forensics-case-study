package p000;

import org.apache.http.util.Args;

/* renamed from: lP1  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C20954lP1 {

    /* renamed from: a */
    public final String f71723a;

    /* renamed from: b */
    public final int f71724b;

    public C20954lP1(String str, int i) {
        this.f71723a = (String) Args.notNull(str, "Value");
        this.f71724b = Args.positive(i, "Type");
    }

    /* renamed from: a */
    public int m26813a() {
        return this.f71724b;
    }

    /* renamed from: b */
    public String m26812b() {
        return this.f71723a;
    }

    public String toString() {
        return this.f71723a;
    }
}