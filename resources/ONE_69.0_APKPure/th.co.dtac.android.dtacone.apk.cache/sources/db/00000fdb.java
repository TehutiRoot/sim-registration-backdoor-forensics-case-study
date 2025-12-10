package p000;

import androidx.compose.p003ui.C3461a;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: Qh0  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C18345Qh0 extends C3461a {

    /* renamed from: d */
    public final String f5281d;

    /* renamed from: e */
    public final Object f5282e;

    /* renamed from: f */
    public final Object f5283f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C18345Qh0(String fqName, Object obj, Object obj2, Function1 inspectorInfo, Function3 factory) {
        super(inspectorInfo, factory);
        Intrinsics.checkNotNullParameter(fqName, "fqName");
        Intrinsics.checkNotNullParameter(inspectorInfo, "inspectorInfo");
        Intrinsics.checkNotNullParameter(factory, "factory");
        this.f5281d = fqName;
        this.f5282e = obj;
        this.f5283f = obj2;
    }

    public boolean equals(Object obj) {
        if (obj instanceof C18345Qh0) {
            C18345Qh0 c18345Qh0 = (C18345Qh0) obj;
            if (Intrinsics.areEqual(this.f5281d, c18345Qh0.f5281d) && Intrinsics.areEqual(this.f5282e, c18345Qh0.f5282e) && Intrinsics.areEqual(this.f5283f, c18345Qh0.f5283f)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int i;
        int hashCode = this.f5281d.hashCode() * 31;
        Object obj = this.f5282e;
        int i2 = 0;
        if (obj != null) {
            i = obj.hashCode();
        } else {
            i = 0;
        }
        int i3 = (hashCode + i) * 31;
        Object obj2 = this.f5283f;
        if (obj2 != null) {
            i2 = obj2.hashCode();
        }
        return i3 + i2;
    }
}