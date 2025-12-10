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
import androidx.compose.p003ui.unit.C3641Dp;
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
    public int f12883n;

    /* renamed from: o */
    public int f12884o;

    /* renamed from: p */
    public int f12885p;

    /* renamed from: q */
    public float f12886q;

    /* renamed from: r */
    public final MutableIntState f12887r;

    /* renamed from: s */
    public final MutableIntState f12888s;

    /* renamed from: t */
    public final MutableState f12889t;

    /* renamed from: u */
    public final MutableState f12890u;

    /* renamed from: v */
    public final MutableState f12891v;

    /* renamed from: w */
    public final Animatable f12892w;

    /* renamed from: x */
    public final State f12893x;

    @Metadata(m28849k = 3, m28848mv = {1, 8, 0}, m28846xi = 48)
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
        int m61552q;
        Intrinsics.checkNotNullParameter(contentDrawScope, "<this>");
        float floatValue = ((Number) this.f12892w.getValue()).floatValue() * m61554o();
        boolean z2 = false;
        if (m61554o() != 1.0f ? ((Number) this.f12892w.getValue()).floatValue() < m61556m() : ((Number) this.f12892w.getValue()).floatValue() < m61555n()) {
            z = true;
        } else {
            z = false;
        }
        if (m61554o() != 1.0f ? ((Number) this.f12892w.getValue()).floatValue() > m61552q() : ((Number) this.f12892w.getValue()).floatValue() > (m61555n() + m61552q()) - m61556m()) {
            z2 = true;
        }
        if (m61554o() == 1.0f) {
            m61552q = m61555n() + m61552q();
        } else {
            m61552q = (-m61555n()) - m61552q();
        }
        float f = m61552q;
        float m71568getHeightimpl = Size.m71568getHeightimpl(contentDrawScope.mo72144getSizeNHjbRc());
        int m71724getIntersectrtfAjoo = ClipOp.Companion.m71724getIntersectrtfAjoo();
        DrawContext drawContext = contentDrawScope.getDrawContext();
        long mo72150getSizeNHjbRc = drawContext.mo72150getSizeNHjbRc();
        drawContext.getCanvas().save();
        drawContext.getTransform().mo72153clipRectN_I0leg(floatValue, 0.0f, floatValue + m61556m(), m71568getHeightimpl, m71724getIntersectrtfAjoo);
        if (z) {
            contentDrawScope.drawContent();
        }
        if (z2) {
            contentDrawScope.getDrawContext().getTransform().translate(f, 0.0f);
            contentDrawScope.drawContent();
            contentDrawScope.getDrawContext().getTransform().translate(-f, -0.0f);
        }
        drawContext.getCanvas().restore();
        drawContext.mo72151setSizeuvyYCjk(mo72150getSizeNHjbRc);
    }

    /* renamed from: l */
    public final int m61557l() {
        return ((MarqueeAnimationMode) this.f12891v.getValue()).m69375unboximpl();
    }

    /* renamed from: m */
    public final int m61556m() {
        return this.f12888s.getIntValue();
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
    public MeasureResult mo69155measure3p2s80s(MeasureScope measure, Measurable measurable, long j) {
        Intrinsics.checkNotNullParameter(measure, "$this$measure");
        Intrinsics.checkNotNullParameter(measurable, "measurable");
        Placeable mo72811measureBRTryo0 = measurable.mo72811measureBRTryo0(Constraints.m73618copyZbe2FdA$default(j, 0, Integer.MAX_VALUE, 0, 0, 13, null));
        m61548u(ConstraintsKt.m73640constrainWidthK40F9xA(j, mo72811measureBRTryo0.getWidth()));
        m61547v(mo72811measureBRTryo0.getWidth());
        return MeasureScope.CC.m59532q(measure, m61556m(), mo72811measureBRTryo0.getHeight(), null, new MarqueeModifierNode$measure$1(mo72811measureBRTryo0, this), 4, null);
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
    public final int m61555n() {
        return this.f12887r.getIntValue();
    }

    /* renamed from: o */
    public final float m61554o() {
        float signum = Math.signum(this.f12886q);
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
        m61551r();
    }

    @Override // androidx.compose.p003ui.focus.FocusEventModifierNode
    public void onFocusEvent(FocusState focusState) {
        Intrinsics.checkNotNullParameter(focusState, "focusState");
        m61546w(focusState.getHasFocus());
    }

    @Override // androidx.compose.p003ui.node.DrawModifierNode
    public /* synthetic */ void onMeasureResultChanged() {
        AbstractC11526jK.m29219a(this);
    }

    /* renamed from: p */
    public final boolean m61553p() {
        return ((Boolean) this.f12889t.getValue()).booleanValue();
    }

    /* renamed from: q */
    public final int m61552q() {
        return ((Number) this.f12893x.getValue()).intValue();
    }

    /* renamed from: r */
    public final void m61551r() {
        if (isAttached()) {
            AbstractC1552Vc.m65753e(getCoroutineScope(), null, null, new MarqueeModifierNode$restartAnimation$1(this, null), 3, null);
        }
    }

    /* renamed from: s */
    public final Object m61550s(Continuation continuation) {
        if (this.f12883n <= 0) {
            return Unit.INSTANCE;
        }
        Object withContext = BuildersKt.withContext(H20.f2092a, new MarqueeModifierNode$runAnimation$2(this, null), continuation);
        if (withContext == AbstractC18812Yf0.getCOROUTINE_SUSPENDED()) {
            return withContext;
        }
        return Unit.INSTANCE;
    }

    /* renamed from: t */
    public final void m61549t(int i) {
        this.f12891v.setValue(MarqueeAnimationMode.m69370boximpl(i));
    }

    /* renamed from: u */
    public final void m61548u(int i) {
        this.f12888s.setIntValue(i);
    }

    /* renamed from: v */
    public final void m61547v(int i) {
        this.f12887r.setIntValue(i);
    }

    /* renamed from: w */
    public final void m61546w(boolean z) {
        this.f12889t.setValue(Boolean.valueOf(z));
    }

    /* renamed from: x */
    public final void m61545x(MarqueeSpacing marqueeSpacing) {
        Intrinsics.checkNotNullParameter(marqueeSpacing, "<set-?>");
        this.f12890u.setValue(marqueeSpacing);
    }

    /* renamed from: y */
    public final void m61544y(int i, int i2, int i3, int i4, MarqueeSpacing spacing, float f) {
        Intrinsics.checkNotNullParameter(spacing, "spacing");
        m61545x(spacing);
        m61549t(i2);
        if (this.f12883n != i || this.f12884o != i3 || this.f12885p != i4 || !C3641Dp.m73663equalsimpl0(this.f12886q, f)) {
            this.f12883n = i;
            this.f12884o = i3;
            this.f12885p = i4;
            this.f12886q = f;
            m61551r();
        }
    }

    public MarqueeModifierNode(int i, int i2, int i3, int i4, MarqueeSpacing spacing, float f) {
        MutableState m31891g;
        MutableState m31891g2;
        MutableState m31891g3;
        Intrinsics.checkNotNullParameter(spacing, "spacing");
        this.f12883n = i;
        this.f12884o = i3;
        this.f12885p = i4;
        this.f12886q = f;
        this.f12887r = SnapshotIntStateKt.mutableIntStateOf(0);
        this.f12888s = SnapshotIntStateKt.mutableIntStateOf(0);
        m31891g = AbstractC19508dK1.m31891g(Boolean.FALSE, null, 2, null);
        this.f12889t = m31891g;
        m31891g2 = AbstractC19508dK1.m31891g(spacing, null, 2, null);
        this.f12890u = m31891g2;
        m31891g3 = AbstractC19508dK1.m31891g(MarqueeAnimationMode.m69370boximpl(i2), null, 2, null);
        this.f12891v = m31891g3;
        this.f12892w = AnimatableKt.Animatable$default(0.0f, 0.0f, 2, null);
        this.f12893x = SnapshotStateKt.derivedStateOf(new MarqueeModifierNode$spacingPx$2(spacing, this));
    }
}
