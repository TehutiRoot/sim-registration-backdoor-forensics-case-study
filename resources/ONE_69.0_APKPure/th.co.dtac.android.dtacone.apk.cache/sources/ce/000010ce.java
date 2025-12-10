package p000;

import androidx.compose.p003ui.C3461a;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: Rh0  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C18410Rh0 extends C3461a {

    /* renamed from: d */
    public final String f5603d;

    /* renamed from: e */
    public final Object f5604e;

    /* renamed from: f */
    public final Object f5605f;

    /* renamed from: g */
    public final Object f5606g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C18410Rh0(String fqName, Object obj, Object obj2, Object obj3, Function1 inspectorInfo, Function3 factory) {
        super(inspectorInfo, factory);
        Intrinsics.checkNotNullParameter(fqName, "fqName");
        Intrinsics.checkNotNullParameter(inspectorInfo, "inspectorInfo");
        Intrinsics.checkNotNullParameter(factory, "factory");
        this.f5603d = fqName;
        this.f5604e = obj;
        this.f5605f = obj2;
        this.f5606g = obj3;
    }

    public boolean equals(Object obj) {
        if (obj instanceof C18410Rh0) {
            C18410Rh0 c18410Rh0 = (C18410Rh0) obj;
            if (Intrinsics.areEqual(this.f5603d, c18410Rh0.f5603d) && Intrinsics.areEqual(this.f5604e, c18410Rh0.f5604e) && Intrinsics.areEqual(this.f5605f, c18410Rh0.f5605f) && Intrinsics.areEqual(this.f5606g, c18410Rh0.f5606g)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int i;
        int i2;
        int hashCode = this.f5603d.hashCode() * 31;
        Object obj = this.f5604e;
        int i3 = 0;
        if (obj != null) {
            i = obj.hashCode();
        } else {
            i = 0;
        }
        int i4 = (hashCode + i) * 31;
        Object obj2 = this.f5605f;
        if (obj2 != null) {
            i2 = obj2.hashCode();
        } else {
            i2 = 0;
        }
        int i5 = (i4 + i2) * 31;
        Object obj3 = this.f5606g;
        if (obj3 != null) {
            i3 = obj3.hashCode();
        }
        return i5 + i3;
    }
}