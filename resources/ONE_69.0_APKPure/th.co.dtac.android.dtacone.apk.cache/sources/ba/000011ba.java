package p000;

import androidx.compose.p003ui.C3461a;
import java.util.Arrays;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: Sh0  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C18475Sh0 extends C3461a {

    /* renamed from: d */
    public final String f5892d;

    /* renamed from: e */
    public final Object[] f5893e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C18475Sh0(String fqName, Object[] keys, Function1 inspectorInfo, Function3 factory) {
        super(inspectorInfo, factory);
        Intrinsics.checkNotNullParameter(fqName, "fqName");
        Intrinsics.checkNotNullParameter(keys, "keys");
        Intrinsics.checkNotNullParameter(inspectorInfo, "inspectorInfo");
        Intrinsics.checkNotNullParameter(factory, "factory");
        this.f5892d = fqName;
        this.f5893e = keys;
    }

    public boolean equals(Object obj) {
        if (obj instanceof C18475Sh0) {
            C18475Sh0 c18475Sh0 = (C18475Sh0) obj;
            if (Intrinsics.areEqual(this.f5892d, c18475Sh0.f5892d) && Arrays.equals(this.f5893e, c18475Sh0.f5893e)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return (this.f5892d.hashCode() * 31) + Arrays.hashCode(this.f5893e);
    }
}