package p000;

import androidx.compose.foundation.layout.WindowInsets;
import androidx.compose.foundation.layout.WindowInsetsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: pY1  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C21602pY1 extends AbstractC18553Ue0 {

    /* renamed from: d */
    public final WindowInsets f76613d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C21602pY1(WindowInsets insets, Function1 inspectorInfo) {
        super(inspectorInfo, null);
        Intrinsics.checkNotNullParameter(insets, "insets");
        Intrinsics.checkNotNullParameter(inspectorInfo, "inspectorInfo");
        this.f76613d = insets;
    }

    @Override // p000.AbstractC18553Ue0
    /* renamed from: d */
    public WindowInsets mo208d(WindowInsets modifierLocalInsets) {
        Intrinsics.checkNotNullParameter(modifierLocalInsets, "modifierLocalInsets");
        return WindowInsetsKt.union(this.f76613d, modifierLocalInsets);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C21602pY1)) {
            return false;
        }
        return Intrinsics.areEqual(((C21602pY1) obj).f76613d, this.f76613d);
    }

    public int hashCode() {
        return this.f76613d.hashCode();
    }
}
