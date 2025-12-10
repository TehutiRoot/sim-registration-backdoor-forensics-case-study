package p000;

import androidx.compose.p003ui.Modifier;
import androidx.compose.p003ui.geometry.Size;
import androidx.compose.p003ui.graphics.Brush;
import androidx.compose.p003ui.graphics.Color;
import androidx.compose.p003ui.graphics.Outline;
import androidx.compose.p003ui.graphics.OutlineKt;
import androidx.compose.p003ui.graphics.RectangleShapeKt;
import androidx.compose.p003ui.graphics.Shape;
import androidx.compose.p003ui.graphics.drawscope.ContentDrawScope;
import androidx.compose.p003ui.node.DrawModifierNode;
import androidx.compose.p003ui.unit.LayoutDirection;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.internal.p026ws.WebSocketProtocol;

/* renamed from: W9 */
/* loaded from: classes.dex */
public final class C1589W9 extends Modifier.Node implements DrawModifierNode {

    /* renamed from: n */
    public long f7143n;

    /* renamed from: o */
    public Brush f7144o;

    /* renamed from: p */
    public float f7145p;

    /* renamed from: q */
    public Shape f7146q;

    /* renamed from: r */
    public Size f7147r;

    /* renamed from: s */
    public LayoutDirection f7148s;

    /* renamed from: t */
    public Outline f7149t;

    /* renamed from: u */
    public Shape f7150u;

    public /* synthetic */ C1589W9(long j, Brush brush, float f, Shape shape, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, brush, f, shape);
    }

    /* renamed from: a */
    public final void m65656a(ContentDrawScope contentDrawScope) {
        Outline mo69357createOutlinePq9zytI;
        if (Size.m71566equalsimpl(contentDrawScope.mo72144getSizeNHjbRc(), this.f7147r) && contentDrawScope.getLayoutDirection() == this.f7148s && Intrinsics.areEqual(this.f7150u, this.f7146q)) {
            mo69357createOutlinePq9zytI = this.f7149t;
            Intrinsics.checkNotNull(mo69357createOutlinePq9zytI);
        } else {
            mo69357createOutlinePq9zytI = this.f7146q.mo69357createOutlinePq9zytI(contentDrawScope.mo72144getSizeNHjbRc(), contentDrawScope.getLayoutDirection(), contentDrawScope);
        }
        if (!Color.m71736equalsimpl0(this.f7143n, Color.Companion.m71771getUnspecified0d7_KjU())) {
            OutlineKt.m71954drawOutlinewDX37Ww$default(contentDrawScope, mo69357createOutlinePq9zytI, this.f7143n, 0.0f, null, null, 0, 60, null);
        }
        Brush brush = this.f7144o;
        if (brush != null) {
            OutlineKt.m71952drawOutlinehn5TExg$default(contentDrawScope, mo69357createOutlinePq9zytI, brush, this.f7145p, null, null, 0, 56, null);
        }
        this.f7149t = mo69357createOutlinePq9zytI;
        this.f7147r = Size.m71559boximpl(contentDrawScope.mo72144getSizeNHjbRc());
        this.f7148s = contentDrawScope.getLayoutDirection();
        this.f7150u = this.f7146q;
    }

    /* renamed from: b */
    public final void m65655b(ContentDrawScope contentDrawScope) {
        if (!Color.m71736equalsimpl0(this.f7143n, Color.Companion.m71771getUnspecified0d7_KjU())) {
            AbstractC12212lK.m26516K(contentDrawScope, this.f7143n, 0L, 0L, 0.0f, null, null, 0, WebSocketProtocol.PAYLOAD_SHORT, null);
        }
        Brush brush = this.f7144o;
        if (brush != null) {
            AbstractC12212lK.m26517J(contentDrawScope, brush, 0L, 0L, this.f7145p, null, null, 0, 118, null);
        }
    }

    /* renamed from: c */
    public final void m65654c(long j) {
        this.f7143n = j;
    }

    @Override // androidx.compose.p003ui.node.DrawModifierNode
    public void draw(ContentDrawScope contentDrawScope) {
        Intrinsics.checkNotNullParameter(contentDrawScope, "<this>");
        if (this.f7146q == RectangleShapeKt.getRectangleShape()) {
            m65655b(contentDrawScope);
        } else {
            m65656a(contentDrawScope);
        }
        contentDrawScope.drawContent();
    }

    @Override // androidx.compose.p003ui.node.DrawModifierNode
    public /* synthetic */ void onMeasureResultChanged() {
        AbstractC11526jK.m29219a(this);
    }

    public final void setAlpha(float f) {
        this.f7145p = f;
    }

    public final void setBrush(Brush brush) {
        this.f7144o = brush;
    }

    public final void setShape(Shape shape) {
        Intrinsics.checkNotNullParameter(shape, "<set-?>");
        this.f7146q = shape;
    }

    public C1589W9(long j, Brush brush, float f, Shape shape) {
        Intrinsics.checkNotNullParameter(shape, "shape");
        this.f7143n = j;
        this.f7144o = brush;
        this.f7145p = f;
        this.f7146q = shape;
    }
}
