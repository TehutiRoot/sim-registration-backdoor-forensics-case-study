package p000;

import androidx.compose.p003ui.Alignment;
import androidx.compose.p003ui.Modifier;
import androidx.compose.p003ui.node.ParentDataModifierNode;
import androidx.compose.p003ui.unit.Density;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: sc */
/* loaded from: classes.dex */
public final class C13939sc extends Modifier.Node implements ParentDataModifierNode {

    /* renamed from: n */
    public Alignment f79838n;

    /* renamed from: o */
    public boolean f79839o;

    public C13939sc(Alignment alignment, boolean z) {
        Intrinsics.checkNotNullParameter(alignment, "alignment");
        this.f79838n = alignment;
        this.f79839o = z;
    }

    /* renamed from: a */
    public final Alignment m22569a() {
        return this.f79838n;
    }

    /* renamed from: b */
    public final boolean m22568b() {
        return this.f79839o;
    }

    @Override // androidx.compose.p003ui.node.ParentDataModifierNode
    /* renamed from: c */
    public C13939sc modifyParentData(Density density, Object obj) {
        Intrinsics.checkNotNullParameter(density, "<this>");
        return this;
    }

    /* renamed from: d */
    public final void m22566d(Alignment alignment) {
        Intrinsics.checkNotNullParameter(alignment, "<set-?>");
        this.f79838n = alignment;
    }

    /* renamed from: e */
    public final void m22565e(boolean z) {
        this.f79839o = z;
    }
}
