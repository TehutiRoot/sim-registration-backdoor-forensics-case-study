package p000;

import androidx.compose.p003ui.Modifier;
import androidx.compose.p003ui.layout.LayoutCoordinates;
import androidx.compose.p003ui.node.LayoutAwareModifierNode;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: vK0  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C22603vK0 extends Modifier.Node implements LayoutAwareModifierNode {

    /* renamed from: n */
    public Function1 f107647n;

    public C22603vK0(Function1 callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        this.f107647n = callback;
    }

    /* renamed from: a */
    public final void m1058a(Function1 function1) {
        Intrinsics.checkNotNullParameter(function1, "<set-?>");
        this.f107647n = function1;
    }

    @Override // androidx.compose.p003ui.node.LayoutAwareModifierNode
    public void onPlaced(LayoutCoordinates coordinates) {
        Intrinsics.checkNotNullParameter(coordinates, "coordinates");
        this.f107647n.invoke(coordinates);
    }

    @Override // androidx.compose.p003ui.node.LayoutAwareModifierNode
    /* renamed from: onRemeasured-ozmzZPI */
    public /* synthetic */ void mo69362onRemeasuredozmzZPI(long j) {
        AbstractC19737ei0.m31500b(this, j);
    }
}
