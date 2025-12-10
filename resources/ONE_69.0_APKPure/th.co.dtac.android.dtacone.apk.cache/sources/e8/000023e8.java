package androidx.compose.foundation;

import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.AnimatableKt;
import androidx.compose.p003ui.Modifier;
import androidx.compose.p003ui.focus.FocusEventModifierNode;
import androidx.compose.p003ui.focus.FocusState;
import androidx.compose.p003ui.geometry.Size;
import androidx.compose.p003ui.graphics.ClipOp;
import androidx.compose.p003ui.graphics.drawscope.ContentDrawScope;
import androidx.compose.p003ui.graphics.drawscope.DrawContext;
import androidx.compose.p003ui.layout.IntrinsicMeasurable;
import androidx.compose.p003ui.layout.IntrinsicMeasureScope;
import androidx.compose.p003ui.layout.Measurable;
import androidx.compose.p003ui.layout.MeasureResult;
import androidx.compose.p003ui.layout.MeasureScope;
import androidx.compose.p003ui.layout.Placeable;
import androidx.compose.p003ui.node.DelegatableNodeKt;
import androidx.compose.p003ui.node.DrawModifierNode;
import androidx.compose.p003ui.node.LayoutModifierNode;
import androidx.compose.p003ui.unit.C3623Dp;
import androidx.compose.p003ui.unit.Constraints;
import androidx.compose.p003ui.unit.ConstraintsKt;
import androidx.compose.p003ui.unit.LayoutDirection;
import androidx.compose.runtime.MutableIntState;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotIntStateKt;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;

/* loaded from: classes.dex */
public final class MarqueeModifierNode extends Modifier.Node implements LayoutModifierNode, DrawModifierNode, FocusEventModifierNode {

    /* renamed from: n */
    public int f12971n;

    /* renamed from: o */
    public int f12972o;

    /* renamed from: p */
    public int f12973p;

    /* renamed from: q */
    public float f12974q;

    /* renamed from: r */
    public final MutableIntState f12975r;

    /* renamed from: s */
    public final MutableIntState f12976s;

    /* renamed from: t */
    public final MutableState f12977t;

    /* renamed from: u */
    public final MutableState f12978u;

    /* renamed from: v */
    public final MutableState f12979v;

    /* renamed from: w */
    public final Animatable f12980w;

    /* renamed from: x */
    public final State f12981x;

    @Metadata(m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
    /* loaded from: classes.dex */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[LayoutDirection.values().length];
            try {
                iArr[LayoutDirection.Ltr.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[LayoutDirection.Rtl.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public /* synthetic */ MarqueeModifierNode(int i, int i2, int i3, int i4, MarqueeSpacing marqueeSpacing, float f, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, i2, i3, i4, marqueeSpacing, f);
    }

    @Override // androidx.compose.p003ui.node.DrawModifierNode
    public void draw(ContentDrawScope contentDrawScope) {
        boolean z;
        int m61502q;
        Intrinsics.checkNotNullParameter(contentDrawScope, "<this>");
        float floatValue = ((Number) this.f12980w.getValue()).floatValue() * m61504o();
        boolean z2 = false;
        if (m61504o() != 1.0f ? ((Number) this.f12980w.getValue()).floatValue() < m61506m() : ((Number) this.f12980w.getValue()).floatValue() < m61505n()) {
            z = true;
        } else {
            z = false;
        }
        if (m61504o() != 1.0f ? ((Number) this.f12980w.getValue()).floatValue() > m61502q() : ((Number) this.f12980w.getValue()).floatValue() > (m61505n() + m61502q()) - m61506m()) {
            z2 = true;
        }
        if (m61504o() == 1.0f) {
            m61502q = m61505n() + m61502q();
        } else {
            m61502q = (-m61505n()) - m61502q();
        }
        float f = m61502q;
        float m71752getHeightimpl = Size.m71752getHeightimpl(contentDrawScope.mo72328getSizeNHjbRc());
        int m71908getIntersectrtfAjoo = ClipOp.Companion.m71908getIntersectrtfAjoo();
        DrawContext drawContext = contentDrawScope.getDrawContext();
        long mo72334getSizeNHjbRc = drawContext.mo72334getSizeNHjbRc();
        drawContext.getCanvas().save();
        drawContext.getTransform().mo72337clipRectN_I0leg(floatValue, 0.0f, floatValue + m61506m(), m71752getHeightimpl, m71908getIntersectrtfAjoo);
        if (z) {
            contentDrawScope.drawContent();
        }
        if (z2) {
            contentDrawScope.getDrawContext().getTransform().translate(f, 0.0f);
            contentDrawScope.drawContent();
            contentDrawScope.getDrawContext().getTransform().translate(-f, -0.0f);
        }
        drawContext.getCanvas().restore();
        drawContext.mo72335setSizeuvyYCjk(mo72334getSizeNHjbRc);
    }

    /* renamed from: l */
    public final int m61507l() {
        return ((MarqueeAnimationMode) this.f12979v.getValue()).m69560unboximpl();
    }

    /* renamed from: m */
    public final int m61506m() {
        return this.f12976s.getIntValue();
    }

    @Override // androidx.compose.p003ui.node.LayoutModifierNode
    public int maxIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable measurable, int i) {
        Intrinsics.checkNotNullParameter(intrinsicMeasureScope, "<this>");
        Intrinsics.checkNotNullParameter(measurable, "measurable");
        return measurable.maxIntrinsicHeight(Integer.MAX_VALUE);
    }

    @Override // androidx.compose.p003ui.node.LayoutModifierNode
    public int maxIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable measurable, int i) {
        Intrinsics.checkNotNullParameter(intrinsicMeasureScope, "<this>");
        Intrinsics.checkNotNullParameter(measurable, "measurable");
        return measurable.maxIntrinsicWidth(i);
    }

    @Override // androidx.compose.p003ui.node.LayoutModifierNode
    /* renamed from: measure-3p2s80s */
    public MeasureResult mo69341measure3p2s80s(MeasureScope measure, Measurable measurable, long j) {
        Intrinsics.checkNotNullParameter(measure, "$this$measure");
        Intrinsics.checkNotNullParameter(measurable, "measurable");
        Placeable mo72995measureBRTryo0 = measurable.mo72995measureBRTryo0(Constraints.m73802copyZbe2FdA$default(j, 0, Integer.MAX_VALUE, 0, 0, 13, null));
        m61498u(ConstraintsKt.m73824constrainWidthK40F9xA(j, mo72995measureBRTryo0.getWidth()));
        m61497v(mo72995measureBRTryo0.getWidth());
        return MeasureScope.CC.m59482q(measure, m61506m(), mo72995measureBRTryo0.getHeight(), null, new MarqueeModifierNode$measure$1(mo72995measureBRTryo0, this), 4, null);
    }

    @Override // androidx.compose.p003ui.node.LayoutModifierNode
    public int minIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable measurable, int i) {
        Intrinsics.checkNotNullParameter(intrinsicMeasureScope, "<this>");
        Intrinsics.checkNotNullParameter(measurable, "measurable");
        return measurable.minIntrinsicHeight(Integer.MAX_VALUE);
    }

    @Override // androidx.compose.p003ui.node.LayoutModifierNode
    public int minIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable measurable, int i) {
        Intrinsics.checkNotNullParameter(intrinsicMeasureScope, "<this>");
        Intrinsics.checkNotNullParameter(measurable, "measurable");
        return 0;
    }

    /* renamed from: n */
    public final int m61505n() {
        return this.f12975r.getIntValue();
    }

    /* renamed from: o */
    public final float m61504o() {
        float signum = Math.signum(this.f12974q);
        int i = WhenMappings.$EnumSwitchMapping$0[DelegatableNodeKt.requireLayoutDirection(this).ordinal()];
        int i2 = 1;
        if (i != 1) {
            if (i == 2) {
                i2 = -1;
            } else {
                throw new NoWhenBranchMatchedException();
            }
        }
        return signum * i2;
    }

    @Override // androidx.compose.p003ui.Modifier.Node
    public void onAttach() {
        m61501r();
    }

    @Override // androidx.compose.p003ui.focus.FocusEventModifierNode
    public void onFocusEvent(FocusState focusState) {
        Intrinsics.checkNotNullParameter(focusState, "focusState");
        m61496w(focusState.getHasFocus());
    }

    @Override // androidx.compose.p003ui.node.DrawModifierNode
    public /* synthetic */ void onMeasureResultChanged() {
        AbstractC11623kK.m29224a(this);
    }

    /* renamed from: p */
    public final boolean m61503p() {
        return ((Boolean) this.f12977t.getValue()).booleanValue();
    }

    /* renamed from: q */
    public final int m61502q() {
        return ((Number) this.f12981x.getValue()).intValue();
    }

    /* renamed from: r */
    public final void m61501r() {
        if (isAttached()) {
            AbstractC1539Vc.m65885e(getCoroutineScope(), null, null, new MarqueeModifierNode$restartAnimation$1(this, null), 3, null);
        }
    }

    /* renamed from: s */
    public final Object m61500s(Continuation continuation) {
        if (this.f12971n <= 0) {
            return Unit.INSTANCE;
        }
        Object withContext = BuildersKt.withContext(L20.f3488a, new MarqueeModifierNode$runAnimation$2(this, null), continuation);
        if (withContext == AbstractC19782eg0.getCOROUTINE_SUSPENDED()) {
            return withContext;
        }
        return Unit.INSTANCE;
    }

    /* renamed from: t */
    public final void m61499t(int i) {
        this.f12979v.setValue(MarqueeAnimationMode.m69555boximpl(i));
    }

    /* renamed from: u */
    public final void m61498u(int i) {
        this.f12976s.setIntValue(i);
    }

    /* renamed from: v */
    public final void m61497v(int i) {
        this.f12975r.setIntValue(i);
    }

    /* renamed from: w */
    public final void m61496w(boolean z) {
        this.f12977t.setValue(Boolean.valueOf(z));
    }

    /* renamed from: x */
    public final void m61495x(MarqueeSpacing marqueeSpacing) {
        Intrinsics.checkNotNullParameter(marqueeSpacing, "<set-?>");
        this.f12978u.setValue(marqueeSpacing);
    }

    /* renamed from: y */
    public final void m61494y(int i, int i2, int i3, int i4, MarqueeSpacing spacing, float f) {
        Intrinsics.checkNotNullParameter(spacing, "spacing");
        m61495x(spacing);
        m61499t(i2);
        if (this.f12971n != i || this.f12972o != i3 || this.f12973p != i4 || !C3623Dp.m73847equalsimpl0(this.f12974q, f)) {
            this.f12971n = i;
            this.f12972o = i3;
            this.f12973p = i4;
            this.f12974q = f;
            m61501r();
        }
    }

    public MarqueeModifierNode(int i, int i2, int i3, int i4, MarqueeSpacing spacing, float f) {
        MutableState m65148g;
        MutableState m65148g2;
        MutableState m65148g3;
        Intrinsics.checkNotNullParameter(spacing, "spacing");
        this.f12971n = i;
        this.f12972o = i3;
        this.f12973p = i4;
        this.f12974q = f;
        this.f12975r = SnapshotIntStateKt.mutableIntStateOf(0);
        this.f12976s = SnapshotIntStateKt.mutableIntStateOf(0);
        m65148g = AbstractC19036aL1.m65148g(Boolean.FALSE, null, 2, null);
        this.f12977t = m65148g;
        m65148g2 = AbstractC19036aL1.m65148g(spacing, null, 2, null);
        this.f12978u = m65148g2;
        m65148g3 = AbstractC19036aL1.m65148g(MarqueeAnimationMode.m69555boximpl(i2), null, 2, null);
        this.f12979v = m65148g3;
        this.f12980w = AnimatableKt.Animatable$default(0.0f, 0.0f, 2, null);
        this.f12981x = SnapshotStateKt.derivedStateOf(new MarqueeModifierNode$spacingPx$2(spacing, this));
    }
}