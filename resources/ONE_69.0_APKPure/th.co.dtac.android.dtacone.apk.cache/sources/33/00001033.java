package p000;

import androidx.compose.p003ui.focus.FocusOrder;
import androidx.compose.p003ui.focus.FocusOrderModifier;
import androidx.compose.p003ui.focus.FocusProperties;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: R30 */
/* loaded from: classes2.dex */
public final class R30 implements Function1 {

    /* renamed from: a */
    public final FocusOrderModifier f5388a;

    public R30(FocusOrderModifier modifier) {
        Intrinsics.checkNotNullParameter(modifier, "modifier");
        this.f5388a = modifier;
    }

    /* renamed from: a */
    public void m66708a(FocusProperties focusProperties) {
        Intrinsics.checkNotNullParameter(focusProperties, "focusProperties");
        this.f5388a.populateFocusOrder(new FocusOrder(focusProperties));
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        m66708a((FocusProperties) obj);
        return Unit.INSTANCE;
    }
}