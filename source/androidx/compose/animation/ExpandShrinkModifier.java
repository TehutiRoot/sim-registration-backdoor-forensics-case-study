package androidx.compose.animation;

import androidx.compose.animation.core.Transition;
import androidx.compose.p003ui.Alignment;
import androidx.compose.p003ui.layout.Measurable;
import androidx.compose.p003ui.layout.MeasureResult;
import androidx.compose.p003ui.layout.MeasureScope;
import androidx.compose.p003ui.layout.Placeable;
import androidx.compose.p003ui.unit.IntOffset;
import androidx.compose.p003ui.unit.IntOffsetKt;
import androidx.compose.p003ui.unit.IntSize;
import androidx.compose.p003ui.unit.IntSizeKt;
import androidx.compose.p003ui.unit.LayoutDirection;
import androidx.compose.runtime.State;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class ExpandShrinkModifier extends LayoutModifierWithPassThroughIntrinsics {

    /* renamed from: a */
    public final Transition.DeferredAnimation f12369a;

    /* renamed from: b */
    public final Transition.DeferredAnimation f12370b;

    /* renamed from: c */
    public final State f12371c;

    /* renamed from: d */
    public final State f12372d;

    /* renamed from: e */
    public final State f12373e;

    /* renamed from: f */
    public Alignment f12374f;

    /* renamed from: g */
    public final Function1 f12375g;

    @Metadata(m28849k = 3, m28848mv = {1, 8, 0}, m28846xi = 48)
    /* loaded from: classes.dex */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[EnterExitState.values().length];
            try {
                iArr[EnterExitState.Visible.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnterExitState.PreEnter.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[EnterExitState.PostExit.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public ExpandShrinkModifier(Transition.DeferredAnimation sizeAnimation, Transition.DeferredAnimation offsetAnimation, State expand, State shrink, State alignment) {
        Intrinsics.checkNotNullParameter(sizeAnimation, "sizeAnimation");
        Intrinsics.checkNotNullParameter(offsetAnimation, "offsetAnimation");
        Intrinsics.checkNotNullParameter(expand, "expand");
        Intrinsics.checkNotNullParameter(shrink, "shrink");
        Intrinsics.checkNotNullParameter(alignment, "alignment");
        this.f12369a = sizeAnimation;
        this.f12370b = offsetAnimation;
        this.f12371c = expand;
        this.f12372d = shrink;
        this.f12373e = alignment;
        this.f12375g = new ExpandShrinkModifier$sizeTransitionSpec$1(this);
    }

    /* renamed from: c */
    public final Alignment m61732c() {
        return this.f12374f;
    }

    /* renamed from: d */
    public final State m61731d() {
        return this.f12371c;
    }

    /* renamed from: e */
    public final State m61730e() {
        return this.f12372d;
    }

    /* renamed from: f */
    public final void m61729f(Alignment alignment) {
        this.f12374f = alignment;
    }

    /* renamed from: g */
    public final long m61728g(EnterExitState targetState, long j) {
        long j2;
        long j3;
        Intrinsics.checkNotNullParameter(targetState, "targetState");
        ChangeSize changeSize = (ChangeSize) this.f12371c.getValue();
        if (changeSize != null) {
            j2 = changeSize.getSize().invoke(IntSize.m73810boximpl(j)).m73822unboximpl();
        } else {
            j2 = j;
        }
        ChangeSize changeSize2 = (ChangeSize) this.f12372d.getValue();
        if (changeSize2 != null) {
            j3 = changeSize2.getSize().invoke(IntSize.m73810boximpl(j)).m73822unboximpl();
        } else {
            j3 = j;
        }
        int i = WhenMappings.$EnumSwitchMapping$0[targetState.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i == 3) {
                    return j3;
                }
                throw new NoWhenBranchMatchedException();
            }
            return j2;
        }
        return j;
    }

    /* renamed from: h */
    public final long m61727h(EnterExitState targetState, long j) {
        Intrinsics.checkNotNullParameter(targetState, "targetState");
        if (this.f12374f == null) {
            return IntOffset.Companion.m73786getZeronOccac();
        }
        if (this.f12373e.getValue() == null) {
            return IntOffset.Companion.m73786getZeronOccac();
        }
        if (Intrinsics.areEqual(this.f12374f, this.f12373e.getValue())) {
            return IntOffset.Companion.m73786getZeronOccac();
        }
        int i = WhenMappings.$EnumSwitchMapping$0[targetState.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i == 3) {
                    ChangeSize changeSize = (ChangeSize) this.f12372d.getValue();
                    if (changeSize != null) {
                        long m73822unboximpl = changeSize.getSize().invoke(IntSize.m73810boximpl(j)).m73822unboximpl();
                        Object value = this.f12373e.getValue();
                        Intrinsics.checkNotNull(value);
                        Alignment alignment = (Alignment) value;
                        LayoutDirection layoutDirection = LayoutDirection.Ltr;
                        long mo71407alignKFBX0sM = alignment.mo71407alignKFBX0sM(j, m73822unboximpl, layoutDirection);
                        Alignment alignment2 = this.f12374f;
                        Intrinsics.checkNotNull(alignment2);
                        long mo71407alignKFBX0sM2 = alignment2.mo71407alignKFBX0sM(j, m73822unboximpl, layoutDirection);
                        return IntOffsetKt.IntOffset(IntOffset.m73776getXimpl(mo71407alignKFBX0sM) - IntOffset.m73776getXimpl(mo71407alignKFBX0sM2), IntOffset.m73777getYimpl(mo71407alignKFBX0sM) - IntOffset.m73777getYimpl(mo71407alignKFBX0sM2));
                    }
                    return IntOffset.Companion.m73786getZeronOccac();
                }
                throw new NoWhenBranchMatchedException();
            }
            return IntOffset.Companion.m73786getZeronOccac();
        }
        return IntOffset.Companion.m73786getZeronOccac();
    }

    @Override // androidx.compose.p003ui.layout.LayoutModifier
    /* renamed from: measure-3p2s80s */
    public MeasureResult mo69160measure3p2s80s(MeasureScope measure, Measurable measurable, long j) {
        long m73786getZeronOccac;
        Intrinsics.checkNotNullParameter(measure, "$this$measure");
        Intrinsics.checkNotNullParameter(measurable, "measurable");
        Placeable mo72811measureBRTryo0 = measurable.mo72811measureBRTryo0(j);
        long IntSize = IntSizeKt.IntSize(mo72811measureBRTryo0.getWidth(), mo72811measureBRTryo0.getHeight());
        long m73822unboximpl = ((IntSize) this.f12369a.animate(this.f12375g, new ExpandShrinkModifier$measure$currentSize$1(this, IntSize)).getValue()).m73822unboximpl();
        long m73785unboximpl = ((IntOffset) this.f12370b.animate(ExpandShrinkModifier$measure$offsetDelta$1.INSTANCE, new ExpandShrinkModifier$measure$offsetDelta$2(this, IntSize)).getValue()).m73785unboximpl();
        Alignment alignment = this.f12374f;
        if (alignment != null) {
            m73786getZeronOccac = alignment.mo71407alignKFBX0sM(IntSize, m73822unboximpl, LayoutDirection.Ltr);
        } else {
            m73786getZeronOccac = IntOffset.Companion.m73786getZeronOccac();
        }
        return MeasureScope.CC.m59532q(measure, IntSize.m73818getWidthimpl(m73822unboximpl), IntSize.m73817getHeightimpl(m73822unboximpl), null, new ExpandShrinkModifier$measure$1(mo72811measureBRTryo0, m73786getZeronOccac, m73785unboximpl), 4, null);
    }
}
