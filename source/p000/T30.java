package p000;

import androidx.compose.p003ui.Modifier;
import androidx.compose.p003ui.focus.FocusProperties;
import androidx.compose.p003ui.focus.FocusPropertiesModifierNode;
import androidx.compose.p003ui.input.InputMode;
import androidx.compose.p003ui.input.InputModeManager;
import androidx.compose.p003ui.node.CompositionLocalConsumerModifierNode;
import androidx.compose.p003ui.node.CompositionLocalConsumerModifierNodeKt;
import androidx.compose.p003ui.platform.CompositionLocalsKt;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: T30 */
/* loaded from: classes.dex */
public final class T30 extends Modifier.Node implements CompositionLocalConsumerModifierNode, FocusPropertiesModifierNode {
    /* renamed from: a */
    private final InputModeManager m66237a() {
        return (InputModeManager) CompositionLocalConsumerModifierNodeKt.currentValueOf(this, CompositionLocalsKt.getLocalInputModeManager());
    }

    @Override // androidx.compose.p003ui.focus.FocusPropertiesModifierNode
    public void applyFocusProperties(FocusProperties focusProperties) {
        Intrinsics.checkNotNullParameter(focusProperties, "focusProperties");
        focusProperties.setCanFocus(!InputMode.m72284equalsimpl0(m66237a().mo72290getInputModeaOaMEAU(), InputMode.Companion.m72289getTouchaOaMEAU()));
    }
}
