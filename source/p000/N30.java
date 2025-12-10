package p000;

import androidx.compose.p003ui.focus.FocusOrder;
import androidx.compose.p003ui.focus.FocusOrderModifier;
import androidx.compose.p003ui.focus.FocusProperties;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: N30 */
/* loaded from: classes2.dex */
public final class N30 implements Function1 {

    /* renamed from: a */
    public final FocusOrderModifier f3994a;

    public N30(FocusOrderModifier modifier) {
        Intrinsics.checkNotNullParameter(modifier, "modifier");
        this.f3994a = modifier;
    }

    /* renamed from: a */
    public void m67254a(FocusProperties focusProperties) {
        Intrinsics.checkNotNullParameter(focusProperties, "focusProperties");
        this.f3994a.populateFocusOrder(new FocusOrder(focusProperties));
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        m67254a((FocusProperties) obj);
        return Unit.INSTANCE;
    }
}
