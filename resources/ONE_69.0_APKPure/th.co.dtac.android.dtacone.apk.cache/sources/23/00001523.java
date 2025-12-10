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
public final class C1577W9 extends Modifier.Node implements DrawModifierNode {

    /* renamed from: n */
    public long f7199n;

    /* renamed from: o */
    public Brush f7200o;

    /* renamed from: p */
    public float f7201p;

    /* renamed from: q */
    public Shape f7202q;

    /* renamed from: r */
    public Size f7203r;

    /* renamed from: s */
    public LayoutDirection f7204s;

    /* renamed from: t */
    public Outline f7205t;

    /* renamed from: u */
    public Shape f7206u;

    public /* synthetic */ C1577W9(long j, Brush brush, float f, Shape shape, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, brush, f, shape);
    }

    /* renamed from: a */
    public final void m65811a(ContentDrawScope contentDrawScope) {
        Outline mo69543createOutlinePq9zytI;
        if (Size.m71750equalsimpl(contentDrawScope.mo72328getSizeNHjbRc(), this.f7203r) && contentDrawScope.getLayoutDirection() == this.f7204s && Intrinsics.areEqual(this.f7206u, this.f7202q)) {
            mo69543createOutlinePq9zytI = this.f7205t;
            Intrinsics.checkNotNull(mo69543createOutlinePq9zytI);
        } else {
            mo69543createOutlinePq9zytI = this.f7202q.mo69543createOutlinePq9zytI(contentDrawScope.mo72328getSizeNHjbRc(), contentDrawScope.getLayoutDirection(), contentDrawScope);
        }
        if (!Color.m71920equalsimpl0(this.f7199n, Color.Companion.m71955getUnspecified0d7_KjU())) {
            OutlineKt.m72138drawOutlinewDX37Ww$default(contentDrawScope, mo69543createOutlinePq9zytI, this.f7199n, 0.0f, null, null, 0, 60, null);
        }
        Brush brush = this.f7200o;
        if (brush != null) {
            OutlineKt.m72136drawOutlinehn5TExg$default(contentDrawScope, mo69543createOutlinePq9zytI, brush, this.f7201p, null, null, 0, 56, null);
        }
        this.f7205t = mo69543createOutlinePq9zytI;
        this.f7203r = Size.m71743boximpl(contentDrawScope.mo72328getSizeNHjbRc());
        this.f7204s = contentDrawScope.getLayoutDirection();
        this.f7206u = this.f7202q;
    }

    /* renamed from: b */
    public final void m65810b(ContentDrawScope contentDrawScope) {
        if (!Color.m71920equalsimpl0(this.f7199n, Color.Companion.m71955getUnspecified0d7_KjU())) {
            AbstractC12264mK.m26705K(contentDrawScope, this.f7199n, 0L, 0L, 0.0f, null, null, 0, WebSocketProtocol.PAYLOAD_SHORT, null);
        }
        Brush brush = this.f7200o;
        if (brush != null) {
            AbstractC12264mK.m26706J(contentDrawScope, brush, 0L, 0L, this.f7201p, null, null, 0, 118, null);
        }
    }

    /* renamed from: c */
    public final void m65809c(long j) {
        this.f7199n = j;
    }

    @Override // androidx.compose.p003ui.node.DrawModifierNode
    public void draw(ContentDrawScope contentDrawScope) {
        Intrinsics.checkNotNullParameter(contentDrawScope, "<this>");
        if (this.f7202q == RectangleShapeKt.getRectangleShape()) {
            m65810b(contentDrawScope);
        } else {
            m65811a(contentDrawScope);
        }
        contentDrawScope.drawContent();
    }

    @Override // androidx.compose.p003ui.node.DrawModifierNode
    public /* synthetic */ void onMeasureResultChanged() {
        AbstractC11623kK.m29224a(this);
    }

    public final void setAlpha(float f) {
        this.f7201p = f;
    }

    public final void setBrush(Brush brush) {
        this.f7200o = brush;
    }

    public final void setShape(Shape shape) {
        Intrinsics.checkNotNullParameter(shape, "<set-?>");
        this.f7202q = shape;
    }

    public C1577W9(long j, Brush brush, float f, Shape shape) {
        Intrinsics.checkNotNullParameter(shape, "shape");
        this.f7199n = j;
        this.f7200o = brush;
        this.f7201p = f;
        this.f7202q = shape;
    }
}