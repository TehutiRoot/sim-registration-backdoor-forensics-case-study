package p000;

import androidx.compose.p003ui.Modifier;
import androidx.compose.p003ui.focus.FocusProperties;
import androidx.compose.p003ui.focus.FocusPropertiesModifierNode;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: S30 */
/* loaded from: classes2.dex */
public final class S30 extends Modifier.Node implements FocusPropertiesModifierNode {

    /* renamed from: n */
    public Function1 f5719n;

    public S30(Function1 focusPropertiesScope) {
        Intrinsics.checkNotNullParameter(focusPropertiesScope, "focusPropertiesScope");
        this.f5719n = focusPropertiesScope;
    }

    /* renamed from: a */
    public final void m66550a(Function1 function1) {
        Intrinsics.checkNotNullParameter(function1, "<set-?>");
        this.f5719n = function1;
    }

    @Override // androidx.compose.p003ui.focus.FocusPropertiesModifierNode
    public void applyFocusProperties(FocusProperties focusProperties) {
        Intrinsics.checkNotNullParameter(focusProperties, "focusProperties");
        this.f5719n.invoke(focusProperties);
    }
}