package p000;

import androidx.compose.p003ui.Modifier;
import androidx.compose.p003ui.layout.LayoutCoordinates;
import androidx.compose.p003ui.node.LayoutAwareModifierNode;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: BK0 */
/* loaded from: classes2.dex */
public final class BK0 extends Modifier.Node implements LayoutAwareModifierNode {

    /* renamed from: n */
    public Function1 f377n;

    public BK0(Function1 callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        this.f377n = callback;
    }

    /* renamed from: a */
    public final void m69118a(Function1 function1) {
        Intrinsics.checkNotNullParameter(function1, "<set-?>");
        this.f377n = function1;
    }

    @Override // androidx.compose.p003ui.node.LayoutAwareModifierNode
    public void onPlaced(LayoutCoordinates coordinates) {
        Intrinsics.checkNotNullParameter(coordinates, "coordinates");
        this.f377n.invoke(coordinates);
    }

    @Override // androidx.compose.p003ui.node.LayoutAwareModifierNode
    /* renamed from: onRemeasured-ozmzZPI  reason: not valid java name */
    public /* synthetic */ void mo69339onRemeasuredozmzZPI(long j) {
        AbstractC20826ki0.m29163b(this, j);
    }
}