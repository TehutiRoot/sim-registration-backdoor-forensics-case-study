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

/* renamed from: X30 */
/* loaded from: classes.dex */
public final class X30 extends Modifier.Node implements CompositionLocalConsumerModifierNode, FocusPropertiesModifierNode {
    /* renamed from: a */
    private final InputModeManager m65636a() {
        return (InputModeManager) CompositionLocalConsumerModifierNodeKt.currentValueOf(this, CompositionLocalsKt.getLocalInputModeManager());
    }

    @Override // androidx.compose.p003ui.focus.FocusPropertiesModifierNode
    public void applyFocusProperties(FocusProperties focusProperties) {
        Intrinsics.checkNotNullParameter(focusProperties, "focusProperties");
        focusProperties.setCanFocus(!InputMode.m72468equalsimpl0(m65636a().mo72474getInputModeaOaMEAU(), InputMode.Companion.m72473getTouchaOaMEAU()));
    }
}