package p000;

import androidx.compose.p003ui.C3479a;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: Lh0  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C17986Lh0 extends C3479a {

    /* renamed from: d */
    public final String f3527d;

    /* renamed from: e */
    public final Object f3528e;

    /* renamed from: f */
    public final Object f3529f;

    /* renamed from: g */
    public final Object f3530g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C17986Lh0(String fqName, Object obj, Object obj2, Object obj3, Function1 inspectorInfo, Function3 factory) {
        super(inspectorInfo, factory);
        Intrinsics.checkNotNullParameter(fqName, "fqName");
        Intrinsics.checkNotNullParameter(inspectorInfo, "inspectorInfo");
        Intrinsics.checkNotNullParameter(factory, "factory");
        this.f3527d = fqName;
        this.f3528e = obj;
        this.f3529f = obj2;
        this.f3530g = obj3;
    }

    public boolean equals(Object obj) {
        if (obj instanceof C17986Lh0) {
            C17986Lh0 c17986Lh0 = (C17986Lh0) obj;
            if (Intrinsics.areEqual(this.f3527d, c17986Lh0.f3527d) && Intrinsics.areEqual(this.f3528e, c17986Lh0.f3528e) && Intrinsics.areEqual(this.f3529f, c17986Lh0.f3529f) && Intrinsics.areEqual(this.f3530g, c17986Lh0.f3530g)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int i;
        int i2;
        int hashCode = this.f3527d.hashCode() * 31;
        Object obj = this.f3528e;
        int i3 = 0;
        if (obj != null) {
            i = obj.hashCode();
        } else {
            i = 0;
        }
        int i4 = (hashCode + i) * 31;
        Object obj2 = this.f3529f;
        if (obj2 != null) {
            i2 = obj2.hashCode();
        } else {
            i2 = 0;
        }
        int i5 = (i4 + i2) * 31;
        Object obj3 = this.f3530g;
        if (obj3 != null) {
            i3 = obj3.hashCode();
        }
        return i5 + i3;
    }
}
