package p000;

import androidx.compose.p003ui.Modifier;
import androidx.compose.p003ui.focus.FocusProperties;
import androidx.compose.p003ui.focus.FocusPropertiesModifierNode;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: O30 */
/* loaded from: classes2.dex */
public final class O30 extends Modifier.Node implements FocusPropertiesModifierNode {

    /* renamed from: n */
    public Function1 f4285n;

    public O30(Function1 focusPropertiesScope) {
        Intrinsics.checkNotNullParameter(focusPropertiesScope, "focusPropertiesScope");
        this.f4285n = focusPropertiesScope;
    }

    /* renamed from: a */
    public final void m67136a(Function1 function1) {
        Intrinsics.checkNotNullParameter(function1, "<set-?>");
        this.f4285n = function1;
    }

    @Override // androidx.compose.p003ui.focus.FocusPropertiesModifierNode
    public void applyFocusProperties(FocusProperties focusProperties) {
        Intrinsics.checkNotNullParameter(focusProperties, "focusProperties");
        this.f4285n.invoke(focusProperties);
    }
}
