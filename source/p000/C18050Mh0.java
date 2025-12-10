package p000;

import androidx.compose.p003ui.C3479a;
import java.util.Arrays;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: Mh0  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C18050Mh0 extends C3479a {

    /* renamed from: d */
    public final String f3843d;

    /* renamed from: e */
    public final Object[] f3844e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C18050Mh0(String fqName, Object[] keys, Function1 inspectorInfo, Function3 factory) {
        super(inspectorInfo, factory);
        Intrinsics.checkNotNullParameter(fqName, "fqName");
        Intrinsics.checkNotNullParameter(keys, "keys");
        Intrinsics.checkNotNullParameter(inspectorInfo, "inspectorInfo");
        Intrinsics.checkNotNullParameter(factory, "factory");
        this.f3843d = fqName;
        this.f3844e = keys;
    }

    public boolean equals(Object obj) {
        if (obj instanceof C18050Mh0) {
            C18050Mh0 c18050Mh0 = (C18050Mh0) obj;
            if (Intrinsics.areEqual(this.f3843d, c18050Mh0.f3843d) && Arrays.equals(this.f3844e, c18050Mh0.f3844e)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return (this.f3843d.hashCode() * 31) + Arrays.hashCode(this.f3844e);
    }
}
