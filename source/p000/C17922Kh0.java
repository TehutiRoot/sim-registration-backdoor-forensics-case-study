package p000;

import androidx.compose.p003ui.C3479a;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: Kh0  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C17922Kh0 extends C3479a {

    /* renamed from: d */
    public final String f3254d;

    /* renamed from: e */
    public final Object f3255e;

    /* renamed from: f */
    public final Object f3256f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C17922Kh0(String fqName, Object obj, Object obj2, Function1 inspectorInfo, Function3 factory) {
        super(inspectorInfo, factory);
        Intrinsics.checkNotNullParameter(fqName, "fqName");
        Intrinsics.checkNotNullParameter(inspectorInfo, "inspectorInfo");
        Intrinsics.checkNotNullParameter(factory, "factory");
        this.f3254d = fqName;
        this.f3255e = obj;
        this.f3256f = obj2;
    }

    public boolean equals(Object obj) {
        if (obj instanceof C17922Kh0) {
            C17922Kh0 c17922Kh0 = (C17922Kh0) obj;
            if (Intrinsics.areEqual(this.f3254d, c17922Kh0.f3254d) && Intrinsics.areEqual(this.f3255e, c17922Kh0.f3255e) && Intrinsics.areEqual(this.f3256f, c17922Kh0.f3256f)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int i;
        int hashCode = this.f3254d.hashCode() * 31;
        Object obj = this.f3255e;
        int i2 = 0;
        if (obj != null) {
            i = obj.hashCode();
        } else {
            i = 0;
        }
        int i3 = (hashCode + i) * 31;
        Object obj2 = this.f3256f;
        if (obj2 != null) {
            i2 = obj2.hashCode();
        }
        return i3 + i2;
    }
}
