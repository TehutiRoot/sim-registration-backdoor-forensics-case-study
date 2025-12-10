package p000;

import androidx.compose.p003ui.C3461a;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: Ph0  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C18280Ph0 extends C3461a {

    /* renamed from: d */
    public final String f4859d;

    /* renamed from: e */
    public final Object f4860e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C18280Ph0(String fqName, Object obj, Function1 inspectorInfo, Function3 factory) {
        super(inspectorInfo, factory);
        Intrinsics.checkNotNullParameter(fqName, "fqName");
        Intrinsics.checkNotNullParameter(inspectorInfo, "inspectorInfo");
        Intrinsics.checkNotNullParameter(factory, "factory");
        this.f4859d = fqName;
        this.f4860e = obj;
    }

    public boolean equals(Object obj) {
        if (obj instanceof C18280Ph0) {
            C18280Ph0 c18280Ph0 = (C18280Ph0) obj;
            if (Intrinsics.areEqual(this.f4859d, c18280Ph0.f4859d) && Intrinsics.areEqual(this.f4860e, c18280Ph0.f4860e)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int i;
        int hashCode = this.f4859d.hashCode() * 31;
        Object obj = this.f4860e;
        if (obj != null) {
            i = obj.hashCode();
        } else {
            i = 0;
        }
        return hashCode + i;
    }
}