package p000;

import androidx.compose.animation.core.FiniteAnimationSpec;
import androidx.compose.foundation.lazy.layout.LazyLayoutAnimateItemModifierNode;
import androidx.compose.p003ui.node.DelegatingNode;
import androidx.compose.p003ui.node.ParentDataModifierNode;
import androidx.compose.p003ui.unit.Density;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: t4 */
/* loaded from: classes.dex */
public final class C13972t4 extends DelegatingNode implements ParentDataModifierNode {

    /* renamed from: p */
    public final LazyLayoutAnimateItemModifierNode f79984p;

    public C13972t4(FiniteAnimationSpec animationSpec) {
        Intrinsics.checkNotNullParameter(animationSpec, "animationSpec");
        this.f79984p = (LazyLayoutAnimateItemModifierNode) delegate(new LazyLayoutAnimateItemModifierNode(animationSpec));
    }

    /* renamed from: c */
    public final LazyLayoutAnimateItemModifierNode m22515c() {
        return this.f79984p;
    }

    @Override // androidx.compose.p003ui.node.ParentDataModifierNode
    public Object modifyParentData(Density density, Object obj) {
        Intrinsics.checkNotNullParameter(density, "<this>");
        return this.f79984p;
    }
}
