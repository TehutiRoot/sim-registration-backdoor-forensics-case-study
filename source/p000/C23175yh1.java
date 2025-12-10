package p000;

import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.WindowInsets;
import androidx.compose.foundation.layout.WindowInsetsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: yh1  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C23175yh1 extends AbstractC18553Ue0 {

    /* renamed from: d */
    public final PaddingValues f108825d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C23175yh1(PaddingValues paddingValues, Function1 inspectorInfo) {
        super(inspectorInfo, null);
        Intrinsics.checkNotNullParameter(paddingValues, "paddingValues");
        Intrinsics.checkNotNullParameter(inspectorInfo, "inspectorInfo");
        this.f108825d = paddingValues;
    }

    @Override // p000.AbstractC18553Ue0
    /* renamed from: d */
    public WindowInsets mo208d(WindowInsets modifierLocalInsets) {
        Intrinsics.checkNotNullParameter(modifierLocalInsets, "modifierLocalInsets");
        return WindowInsetsKt.add(WindowInsetsKt.asInsets(this.f108825d), modifierLocalInsets);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C23175yh1)) {
            return false;
        }
        return Intrinsics.areEqual(((C23175yh1) obj).f108825d, this.f108825d);
    }

    public int hashCode() {
        return this.f108825d.hashCode();
    }
}
