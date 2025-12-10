package p000;

import androidx.compose.p003ui.C3479a;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: Jh0  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C17858Jh0 extends C3479a {

    /* renamed from: d */
    public final String f2884d;

    /* renamed from: e */
    public final Object f2885e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C17858Jh0(String fqName, Object obj, Function1 inspectorInfo, Function3 factory) {
        super(inspectorInfo, factory);
        Intrinsics.checkNotNullParameter(fqName, "fqName");
        Intrinsics.checkNotNullParameter(inspectorInfo, "inspectorInfo");
        Intrinsics.checkNotNullParameter(factory, "factory");
        this.f2884d = fqName;
        this.f2885e = obj;
    }

    public boolean equals(Object obj) {
        if (obj instanceof C17858Jh0) {
            C17858Jh0 c17858Jh0 = (C17858Jh0) obj;
            if (Intrinsics.areEqual(this.f2884d, c17858Jh0.f2884d) && Intrinsics.areEqual(this.f2885e, c17858Jh0.f2885e)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int i;
        int hashCode = this.f2884d.hashCode() * 31;
        Object obj = this.f2885e;
        if (obj != null) {
            i = obj.hashCode();
        } else {
            i = 0;
        }
        return hashCode + i;
    }
}
