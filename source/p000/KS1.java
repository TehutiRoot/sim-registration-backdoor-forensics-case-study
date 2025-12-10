package p000;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: KS1 */
/* loaded from: classes9.dex */
public final class KS1 {

    /* renamed from: a */
    public final String f3194a;

    /* renamed from: b */
    public final List f3195b;

    public KS1(String title, List colors) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(colors, "colors");
        this.f3194a = title;
        this.f3195b = colors;
    }

    /* renamed from: a */
    public final List m67614a() {
        return this.f3195b;
    }

    /* renamed from: b */
    public final String m67613b() {
        return this.f3194a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof KS1)) {
            return false;
        }
        KS1 ks1 = (KS1) obj;
        if (Intrinsics.areEqual(this.f3194a, ks1.f3194a) && Intrinsics.areEqual(this.f3195b, ks1.f3195b)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (this.f3194a.hashCode() * 31) + this.f3195b.hashCode();
    }

    public String toString() {
        String str = this.f3194a;
        List list = this.f3195b;
        return "ThemeButtonData(title=" + str + ", colors=" + list + ")";
    }
}
