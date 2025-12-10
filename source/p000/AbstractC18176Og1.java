package p000;

import androidx.compose.p003ui.node.LayoutNode;
import androidx.compose.p003ui.node.Owner;

/* renamed from: Og1  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract /* synthetic */ class AbstractC18176Og1 {
    static {
        Owner.Companion companion = Owner.Companion;
    }

    /* renamed from: a */
    public static /* synthetic */ void m67009a(Owner owner, LayoutNode layoutNode, boolean z, int i, Object obj) {
        if (obj == null) {
            if ((i & 2) != 0) {
                z = false;
            }
            owner.forceMeasureTheSubtree(layoutNode, z);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: forceMeasureTheSubtree");
    }

    /* renamed from: f */
    public static /* synthetic */ void m67004f(Owner owner, boolean z, int i, Object obj) {
        if (obj == null) {
            if ((i & 1) != 0) {
                z = true;
            }
            owner.measureAndLayout(z);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: measureAndLayout");
    }

    /* renamed from: g */
    public static /* synthetic */ void m67003g(Owner owner, LayoutNode layoutNode, boolean z, boolean z2, boolean z3, int i, Object obj) {
        if (obj == null) {
            if ((i & 2) != 0) {
                z = false;
            }
            if ((i & 4) != 0) {
                z2 = false;
            }
            if ((i & 8) != 0) {
                z3 = true;
            }
            owner.onRequestMeasure(layoutNode, z, z2, z3);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: onRequestMeasure");
    }

    /* renamed from: h */
    public static /* synthetic */ void m67002h(Owner owner, LayoutNode layoutNode, boolean z, boolean z2, int i, Object obj) {
        if (obj == null) {
            if ((i & 2) != 0) {
                z = false;
            }
            if ((i & 4) != 0) {
                z2 = false;
            }
            owner.onRequestRelayout(layoutNode, z, z2);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: onRequestRelayout");
    }

    /* renamed from: b */
    public static /* synthetic */ void m67008b() {
    }

    /* renamed from: c */
    public static /* synthetic */ void m67007c() {
    }

    /* renamed from: d */
    public static /* synthetic */ void m67006d() {
    }

    /* renamed from: e */
    public static /* synthetic */ void m67005e() {
    }
}
