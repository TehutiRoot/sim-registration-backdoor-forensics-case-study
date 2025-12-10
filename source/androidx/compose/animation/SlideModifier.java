package androidx.compose.animation;

import androidx.compose.animation.core.Transition;
import androidx.compose.p003ui.layout.Measurable;
import androidx.compose.p003ui.layout.MeasureResult;
import androidx.compose.p003ui.layout.MeasureScope;
import androidx.compose.p003ui.layout.Placeable;
import androidx.compose.p003ui.unit.IntOffset;
import androidx.compose.p003ui.unit.IntSize;
import androidx.compose.p003ui.unit.IntSizeKt;
import androidx.compose.runtime.State;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class SlideModifier extends LayoutModifierWithPassThroughIntrinsics {

    /* renamed from: a */
    public final Transition.DeferredAnimation f12397a;

    /* renamed from: b */
    public final State f12398b;

    /* renamed from: c */
    public final State f12399c;

    /* renamed from: d */
    public final Function1 f12400d;

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

    public SlideModifier(Transition.DeferredAnimation lazyAnimation, State slideIn, State slideOut) {
        Intrinsics.checkNotNullParameter(lazyAnimation, "lazyAnimation");
        Intrinsics.checkNotNullParameter(slideIn, "slideIn");
        Intrinsics.checkNotNullParameter(slideOut, "slideOut");
        this.f12397a = lazyAnimation;
        this.f12398b = slideIn;
        this.f12399c = slideOut;
        this.f12400d = new SlideModifier$transitionSpec$1(this);
    }

    /* renamed from: c */
    public final Transition.DeferredAnimation m61717c() {
        return this.f12397a;
    }

    /* renamed from: d */
    public final State m61716d() {
        return this.f12398b;
    }

    /* renamed from: e */
    public final State m61715e() {
        return this.f12399c;
    }

    /* renamed from: f */
    public final Function1 m61714f() {
        return this.f12400d;
    }

    /* renamed from: g */
    public final long m61713g(EnterExitState targetState, long j) {
        long m73786getZeronOccac;
        long m73786getZeronOccac2;
        Function1<IntSize, IntOffset> slideOffset;
        Function1<IntSize, IntOffset> slideOffset2;
        Intrinsics.checkNotNullParameter(targetState, "targetState");
        Slide slide = (Slide) this.f12398b.getValue();
        if (slide != null && (slideOffset2 = slide.getSlideOffset()) != null) {
            m73786getZeronOccac = slideOffset2.invoke(IntSize.m73810boximpl(j)).m73785unboximpl();
        } else {
            m73786getZeronOccac = IntOffset.Companion.m73786getZeronOccac();
        }
        Slide slide2 = (Slide) this.f12399c.getValue();
        if (slide2 != null && (slideOffset = slide2.getSlideOffset()) != null) {
            m73786getZeronOccac2 = slideOffset.invoke(IntSize.m73810boximpl(j)).m73785unboximpl();
        } else {
            m73786getZeronOccac2 = IntOffset.Companion.m73786getZeronOccac();
        }
        int i = WhenMappings.$EnumSwitchMapping$0[targetState.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i == 3) {
                    return m73786getZeronOccac2;
                }
                throw new NoWhenBranchMatchedException();
            }
            return m73786getZeronOccac;
        }
        return IntOffset.Companion.m73786getZeronOccac();
    }

    @Override // androidx.compose.p003ui.layout.LayoutModifier
    /* renamed from: measure-3p2s80s */
    public MeasureResult mo69160measure3p2s80s(MeasureScope measure, Measurable measurable, long j) {
        Intrinsics.checkNotNullParameter(measure, "$this$measure");
        Intrinsics.checkNotNullParameter(measurable, "measurable");
        Placeable mo72811measureBRTryo0 = measurable.mo72811measureBRTryo0(j);
        return MeasureScope.CC.m59532q(measure, mo72811measureBRTryo0.getWidth(), mo72811measureBRTryo0.getHeight(), null, new SlideModifier$measure$1(this, mo72811measureBRTryo0, IntSizeKt.IntSize(mo72811measureBRTryo0.getWidth(), mo72811measureBRTryo0.getHeight())), 4, null);
    }
}
