package p000;

import androidx.compose.animation.core.FiniteAnimationSpec;
import androidx.compose.foundation.lazy.layout.LazyLayoutAnimateItemModifierNode;
import androidx.compose.p003ui.node.DelegatingNode;
import androidx.compose.p003ui.node.ParentDataModifierNode;
import androidx.compose.p003ui.unit.Density;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: u4 */
/* loaded from: classes.dex */
public final class C16794u4 extends DelegatingNode implements ParentDataModifierNode {

    /* renamed from: p */
    public final LazyLayoutAnimateItemModifierNode f107273p;

    public C16794u4(FiniteAnimationSpec animationSpec) {
        Intrinsics.checkNotNullParameter(animationSpec, "animationSpec");
        this.f107273p = (LazyLayoutAnimateItemModifierNode) delegate(new LazyLayoutAnimateItemModifierNode(animationSpec));
    }

    /* renamed from: c */
    public final LazyLayoutAnimateItemModifierNode m1319c() {
        return this.f107273p;
    }

    @Override // androidx.compose.p003ui.node.ParentDataModifierNode
    public Object modifyParentData(Density density, Object obj) {
        Intrinsics.checkNotNullParameter(density, "<this>");
        return this.f107273p;
    }
}
