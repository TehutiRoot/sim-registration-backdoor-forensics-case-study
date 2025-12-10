package p000;

import androidx.compose.foundation.layout.WindowInsets;
import androidx.compose.foundation.layout.WindowInsetsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: mZ1  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C21147mZ1 extends AbstractC19082af0 {

    /* renamed from: d */
    public final WindowInsets f72027d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C21147mZ1(WindowInsets insets, Function1 inspectorInfo) {
        super(inspectorInfo, null);
        Intrinsics.checkNotNullParameter(insets, "insets");
        Intrinsics.checkNotNullParameter(inspectorInfo, "inspectorInfo");
        this.f72027d = insets;
    }

    @Override // p000.AbstractC19082af0
    /* renamed from: d */
    public WindowInsets mo871d(WindowInsets modifierLocalInsets) {
        Intrinsics.checkNotNullParameter(modifierLocalInsets, "modifierLocalInsets");
        return WindowInsetsKt.union(this.f72027d, modifierLocalInsets);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C21147mZ1)) {
            return false;
        }
        return Intrinsics.areEqual(((C21147mZ1) obj).f72027d, this.f72027d);
    }

    public int hashCode() {
        return this.f72027d.hashCode();
    }
}