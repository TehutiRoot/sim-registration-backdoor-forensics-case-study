package p000;

import org.apache.http.util.Args;

/* renamed from: oO1  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C21410oO1 {

    /* renamed from: a */
    public final String f72694a;

    /* renamed from: b */
    public final int f72695b;

    public C21410oO1(String str, int i) {
        this.f72694a = (String) Args.notNull(str, "Value");
        this.f72695b = Args.positive(i, "Type");
    }

    /* renamed from: a */
    public int m25927a() {
        return this.f72695b;
    }

    /* renamed from: b */
    public String m25926b() {
        return this.f72694a;
    }

    public String toString() {
        return this.f72694a;
    }
}
