package p000;

import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.WindowInsets;
import androidx.compose.foundation.layout.WindowInsetsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: vi1  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C22730vi1 extends AbstractC19082af0 {

    /* renamed from: d */
    public final PaddingValues f108185d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C22730vi1(PaddingValues paddingValues, Function1 inspectorInfo) {
        super(inspectorInfo, null);
        Intrinsics.checkNotNullParameter(paddingValues, "paddingValues");
        Intrinsics.checkNotNullParameter(inspectorInfo, "inspectorInfo");
        this.f108185d = paddingValues;
    }

    @Override // p000.AbstractC19082af0
    /* renamed from: d */
    public WindowInsets mo871d(WindowInsets modifierLocalInsets) {
        Intrinsics.checkNotNullParameter(modifierLocalInsets, "modifierLocalInsets");
        return WindowInsetsKt.add(WindowInsetsKt.asInsets(this.f108185d), modifierLocalInsets);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C22730vi1)) {
            return false;
        }
        return Intrinsics.areEqual(((C22730vi1) obj).f108185d, this.f108185d);
    }

    public int hashCode() {
        return this.f108185d.hashCode();
    }
}