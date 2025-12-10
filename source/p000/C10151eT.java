package p000;

import android.graphics.Rect;
import android.view.View;
import androidx.compose.p003ui.Modifier;
import androidx.compose.p003ui.geometry.Offset;
import androidx.compose.p003ui.layout.LayoutCoordinates;
import androidx.compose.p003ui.layout.LayoutCoordinatesKt;
import androidx.compose.p003ui.node.CompositionLocalConsumerModifierNode;
import androidx.compose.p003ui.node.CompositionLocalConsumerModifierNodeKt;
import androidx.compose.p003ui.node.GlobalPositionAwareModifierNode;
import androidx.compose.p003ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.runtime.collection.MutableVector;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: eT */
/* loaded from: classes.dex */
public final class C10151eT extends Modifier.Node implements GlobalPositionAwareModifierNode, CompositionLocalConsumerModifierNode {

    /* renamed from: n */
    public Function1 f61514n;

    /* renamed from: o */
    public Rect f61515o;

    public C10151eT(Function1 function1) {
        this.f61514n = function1;
    }

    /* renamed from: c */
    private final View m31537c() {
        return (View) CompositionLocalConsumerModifierNodeKt.currentValueOf(this, AndroidCompositionLocals_androidKt.getLocalView());
    }

    /* renamed from: a */
    public final Rect m31539a(LayoutCoordinates layoutCoordinates, androidx.compose.p003ui.geometry.Rect rect) {
        LayoutCoordinates m31538b = m31538b(layoutCoordinates);
        long mo72817localPositionOfR5De75A = m31538b.mo72817localPositionOfR5De75A(layoutCoordinates, rect.m71537getTopLeftF1C5BW0());
        long mo72817localPositionOfR5De75A2 = m31538b.mo72817localPositionOfR5De75A(layoutCoordinates, rect.m71538getTopRightF1C5BW0());
        long mo72817localPositionOfR5De75A3 = m31538b.mo72817localPositionOfR5De75A(layoutCoordinates, rect.m71530getBottomLeftF1C5BW0());
        long mo72817localPositionOfR5De75A4 = m31538b.mo72817localPositionOfR5De75A(layoutCoordinates, rect.m71531getBottomRightF1C5BW0());
        return new Rect(AbstractC21140mr0.roundToInt(AbstractC16931vu.minOf(Offset.m71502getXimpl(mo72817localPositionOfR5De75A), Offset.m71502getXimpl(mo72817localPositionOfR5De75A2), Offset.m71502getXimpl(mo72817localPositionOfR5De75A3), Offset.m71502getXimpl(mo72817localPositionOfR5De75A4))), AbstractC21140mr0.roundToInt(AbstractC16931vu.minOf(Offset.m71503getYimpl(mo72817localPositionOfR5De75A), Offset.m71503getYimpl(mo72817localPositionOfR5De75A2), Offset.m71503getYimpl(mo72817localPositionOfR5De75A3), Offset.m71503getYimpl(mo72817localPositionOfR5De75A4))), AbstractC21140mr0.roundToInt(AbstractC16931vu.maxOf(Offset.m71502getXimpl(mo72817localPositionOfR5De75A), Offset.m71502getXimpl(mo72817localPositionOfR5De75A2), Offset.m71502getXimpl(mo72817localPositionOfR5De75A3), Offset.m71502getXimpl(mo72817localPositionOfR5De75A4))), AbstractC21140mr0.roundToInt(AbstractC16931vu.maxOf(Offset.m71503getYimpl(mo72817localPositionOfR5De75A), Offset.m71503getYimpl(mo72817localPositionOfR5De75A2), Offset.m71503getYimpl(mo72817localPositionOfR5De75A3), Offset.m71503getYimpl(mo72817localPositionOfR5De75A4))));
    }

    /* renamed from: b */
    public final LayoutCoordinates m31538b(LayoutCoordinates layoutCoordinates) {
        LayoutCoordinates parentLayoutCoordinates = layoutCoordinates.getParentLayoutCoordinates();
        while (true) {
            LayoutCoordinates layoutCoordinates2 = parentLayoutCoordinates;
            LayoutCoordinates layoutCoordinates3 = layoutCoordinates;
            layoutCoordinates = layoutCoordinates2;
            if (layoutCoordinates != null) {
                parentLayoutCoordinates = layoutCoordinates.getParentLayoutCoordinates();
            } else {
                return layoutCoordinates3;
            }
        }
    }

    /* renamed from: d */
    public final void m31536d(Rect rect) {
        List systemGestureExclusionRects;
        MutableVector mutableVector = new MutableVector(new Rect[16], 0);
        systemGestureExclusionRects = m31537c().getSystemGestureExclusionRects();
        Intrinsics.checkNotNullExpressionValue(systemGestureExclusionRects, "view.systemGestureExclusionRects");
        mutableVector.addAll(mutableVector.getSize(), systemGestureExclusionRects);
        Rect rect2 = this.f61515o;
        if (rect2 != null) {
            mutableVector.remove(rect2);
        }
        if (rect != null && !rect.isEmpty()) {
            mutableVector.add(rect);
        }
        m31537c().setSystemGestureExclusionRects(mutableVector.asMutableList());
        this.f61515o = rect;
    }

    /* renamed from: e */
    public final void m31535e(Function1 function1) {
        this.f61514n = function1;
    }

    @Override // androidx.compose.p003ui.Modifier.Node
    public void onDetach() {
        super.onDetach();
        m31536d(null);
    }

    @Override // androidx.compose.p003ui.node.GlobalPositionAwareModifierNode
    public void onGloballyPositioned(LayoutCoordinates coordinates) {
        Rect m31539a;
        Intrinsics.checkNotNullParameter(coordinates, "coordinates");
        Function1 function1 = this.f61514n;
        if (function1 == null) {
            androidx.compose.p003ui.geometry.Rect boundsInRoot = LayoutCoordinatesKt.boundsInRoot(coordinates);
            m31539a = new Rect(AbstractC21140mr0.roundToInt(boundsInRoot.getLeft()), AbstractC21140mr0.roundToInt(boundsInRoot.getTop()), AbstractC21140mr0.roundToInt(boundsInRoot.getRight()), AbstractC21140mr0.roundToInt(boundsInRoot.getBottom()));
        } else {
            Intrinsics.checkNotNull(function1);
            m31539a = m31539a(coordinates, (androidx.compose.p003ui.geometry.Rect) function1.invoke(coordinates));
        }
        m31536d(m31539a);
    }
}
