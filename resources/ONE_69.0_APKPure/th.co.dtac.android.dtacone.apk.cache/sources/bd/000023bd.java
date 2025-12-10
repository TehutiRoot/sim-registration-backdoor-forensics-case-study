package androidx.compose.foundation;

import androidx.compose.p003ui.Modifier;
import androidx.compose.p003ui.focus.FocusRequesterModifierNode;
import androidx.compose.p003ui.node.SemanticsModifierNode;
import androidx.compose.p003ui.semantics.SemanticsConfiguration;
import androidx.compose.p003ui.semantics.SemanticsPropertiesKt;
import androidx.compose.p003ui.semantics.SemanticsPropertyReceiver;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class FocusableSemanticsNode extends Modifier.Node implements SemanticsModifierNode, FocusRequesterModifierNode {

    /* renamed from: n */
    public SemanticsConfiguration f12942n = new SemanticsConfiguration();

    /* renamed from: o */
    public boolean f12943o;

    @Override // androidx.compose.p003ui.node.SemanticsModifierNode
    public void applySemantics(SemanticsPropertyReceiver semanticsPropertyReceiver) {
        Intrinsics.checkNotNullParameter(semanticsPropertyReceiver, "<this>");
        SemanticsPropertiesKt.setFocused(semanticsPropertyReceiver, this.f12943o);
        SemanticsPropertiesKt.requestFocus$default(semanticsPropertyReceiver, null, new FocusableSemanticsNode$applySemantics$1(this), 1, null);
    }

    @Override // androidx.compose.p003ui.node.SemanticsModifierNode
    public /* synthetic */ boolean getShouldClearDescendantSemantics() {
        return CG1.m68982a(this);
    }

    @Override // androidx.compose.p003ui.node.SemanticsModifierNode
    public /* synthetic */ boolean getShouldMergeDescendantSemantics() {
        return CG1.m68981b(this);
    }

    public final void setFocus(boolean z) {
        this.f12943o = z;
    }
}