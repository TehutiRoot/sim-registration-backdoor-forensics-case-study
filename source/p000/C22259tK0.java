package p000;

import androidx.compose.p003ui.Modifier;
import androidx.compose.p003ui.layout.LayoutCoordinates;
import androidx.compose.p003ui.node.GlobalPositionAwareModifierNode;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: tK0  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C22259tK0 extends Modifier.Node implements GlobalPositionAwareModifierNode {

    /* renamed from: n */
    public Function1 f80074n;

    public C22259tK0(Function1 callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        this.f80074n = callback;
    }

    /* renamed from: a */
    public final void m22460a(Function1 function1) {
        Intrinsics.checkNotNullParameter(function1, "<set-?>");
        this.f80074n = function1;
    }

    @Override // androidx.compose.p003ui.node.GlobalPositionAwareModifierNode
    public void onGloballyPositioned(LayoutCoordinates coordinates) {
        Intrinsics.checkNotNullParameter(coordinates, "coordinates");
        this.f80074n.invoke(coordinates);
    }
}
