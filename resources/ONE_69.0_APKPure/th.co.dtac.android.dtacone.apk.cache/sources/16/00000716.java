package p000;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: HT1 */
/* loaded from: classes9.dex */
public final class HT1 {

    /* renamed from: a */
    public final String f2390a;

    /* renamed from: b */
    public final List f2391b;

    public HT1(String title, List colors) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(colors, "colors");
        this.f2390a = title;
        this.f2391b = colors;
    }

    /* renamed from: a */
    public final List m68112a() {
        return this.f2391b;
    }

    /* renamed from: b */
    public final String m68111b() {
        return this.f2390a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof HT1)) {
            return false;
        }
        HT1 ht1 = (HT1) obj;
        if (Intrinsics.areEqual(this.f2390a, ht1.f2390a) && Intrinsics.areEqual(this.f2391b, ht1.f2391b)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (this.f2390a.hashCode() * 31) + this.f2391b.hashCode();
    }

    public String toString() {
        String str = this.f2390a;
        List list = this.f2391b;
        return "ThemeButtonData(title=" + str + ", colors=" + list + ")";
    }
}