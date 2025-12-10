package p000;

import androidx.compose.p003ui.Modifier;
import androidx.compose.p003ui.graphics.drawscope.ContentDrawScope;
import androidx.compose.p003ui.node.DrawModifierNode;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: nK */
/* loaded from: classes2.dex */
public final class C12351nK extends Modifier.Node implements DrawModifierNode {

    /* renamed from: n */
    public Function1 f72204n;

    public C12351nK(Function1 onDraw) {
        Intrinsics.checkNotNullParameter(onDraw, "onDraw");
        this.f72204n = onDraw;
    }

    @Override // androidx.compose.p003ui.node.DrawModifierNode
    public void draw(ContentDrawScope contentDrawScope) {
        Intrinsics.checkNotNullParameter(contentDrawScope, "<this>");
        this.f72204n.invoke(contentDrawScope);
    }

    @Override // androidx.compose.p003ui.node.DrawModifierNode
    public /* synthetic */ void onMeasureResultChanged() {
        AbstractC11526jK.m29219a(this);
    }

    public final void setOnDraw(Function1 function1) {
        Intrinsics.checkNotNullParameter(function1, "<set-?>");
        this.f72204n = function1;
    }
}
