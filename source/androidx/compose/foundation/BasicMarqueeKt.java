package androidx.compose.foundation;

import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.EasingKt;
import androidx.compose.animation.core.StartOffset;
import androidx.compose.animation.core.TweenSpec;
import androidx.compose.p003ui.Modifier;
import androidx.compose.p003ui.unit.C3641Dp;
import androidx.compose.p003ui.unit.Density;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

@Metadata(m28851d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u001b\u001aU\u0010\r\u001a\u00020\u0000*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00012\b\b\u0002\u0010\u0006\u001a\u00020\u00012\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\tH\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u000b\u0010\f\u001aK\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00122\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0006\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u00012\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u0011\u001a\u00020\u0010H\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0013\u0010\u0014\u001a-\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00152\u0006\u0010\n\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0005\u001a\u00020\u0001H\u0002¢\u0006\u0004\b\u0016\u0010\u0017\u001a\u001d\u0010\u001a\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0018\u0010\u0019\" \u0010 \u001a\u00020\u00018GX\u0087D¢\u0006\u0012\n\u0004\b\u0013\u0010\u001b\u0012\u0004\b\u001e\u0010\u001f\u001a\u0004\b\u001c\u0010\u001d\" \u0010#\u001a\u00020\u00018GX\u0087D¢\u0006\u0012\n\u0004\b\u0016\u0010\u001b\u0012\u0004\b\"\u0010\u001f\u001a\u0004\b!\u0010\u001d\" \u0010)\u001a\u00020\u00078GX\u0087\u0004¢\u0006\u0012\n\u0004\b$\u0010%\u0012\u0004\b(\u0010\u001f\u001a\u0004\b&\u0010'\"#\u0010/\u001a\u00020\t8GX\u0087\u0004ø\u0001\u0001¢\u0006\u0012\n\u0004\b*\u0010+\u0012\u0004\b.\u0010\u001f\u001a\u0004\b,\u0010-\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u00060"}, m28850d2 = {"Landroidx/compose/ui/Modifier;", "", "iterations", "Landroidx/compose/foundation/MarqueeAnimationMode;", "animationMode", "delayMillis", "initialDelayMillis", "Landroidx/compose/foundation/MarqueeSpacing;", "spacing", "Landroidx/compose/ui/unit/Dp;", "velocity", "basicMarquee-1Mj1MLw", "(Landroidx/compose/ui/Modifier;IIIILandroidx/compose/foundation/MarqueeSpacing;F)Landroidx/compose/ui/Modifier;", "basicMarquee", "", "targetValue", "Landroidx/compose/ui/unit/Density;", "density", "Landroidx/compose/animation/core/AnimationSpec;", PDPageLabelRange.STYLE_LETTERS_LOWER, "(IFIIFLandroidx/compose/ui/unit/Density;)Landroidx/compose/animation/core/AnimationSpec;", "Landroidx/compose/animation/core/TweenSpec;", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "(FFI)Landroidx/compose/animation/core/TweenSpec;", "MarqueeSpacing-0680j_4", "(F)Landroidx/compose/foundation/MarqueeSpacing;", "MarqueeSpacing", "I", "getDefaultMarqueeIterations", "()I", "getDefaultMarqueeIterations$annotations", "()V", "DefaultMarqueeIterations", "getDefaultMarqueeDelayMillis", "getDefaultMarqueeDelayMillis$annotations", "DefaultMarqueeDelayMillis", OperatorName.CURVE_TO, "Landroidx/compose/foundation/MarqueeSpacing;", "getDefaultMarqueeSpacing", "()Landroidx/compose/foundation/MarqueeSpacing;", "getDefaultMarqueeSpacing$annotations", "DefaultMarqueeSpacing", "d", "F", "getDefaultMarqueeVelocity", "()F", "getDefaultMarqueeVelocity$annotations", "DefaultMarqueeVelocity", "foundation_release"}, m28849k = 2, m28848mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nBasicMarquee.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BasicMarquee.kt\nandroidx/compose/foundation/BasicMarqueeKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,497:1\n1#2:498\n154#3:499\n*S KotlinDebug\n*F\n+ 1 BasicMarquee.kt\nandroidx/compose/foundation/BasicMarqueeKt\n*L\n94#1:499\n*E\n"})
/* loaded from: classes.dex */
public final class BasicMarqueeKt {

    /* renamed from: a */
    public static final int f12793a = 3;

    /* renamed from: b */
    public static final int f12794b = 1200;

    /* renamed from: c */
    public static final MarqueeSpacing f12795c = MarqueeSpacing.Companion.fractionOfContainer(0.33333334f);

    /* renamed from: d */
    public static final float f12796d = C3641Dp.m73658constructorimpl(30);

    /* renamed from: androidx.compose.foundation.BasicMarqueeKt$a */
    /* loaded from: classes.dex */
    public static final class C2770a implements MarqueeSpacing {

        /* renamed from: a */
        public final /* synthetic */ float f12797a;

        public C2770a(float f) {
            this.f12797a = f;
        }

        @Override // androidx.compose.foundation.MarqueeSpacing
        public final int calculateSpacing(Density MarqueeSpacing, int i, int i2) {
            Intrinsics.checkNotNullParameter(MarqueeSpacing, "$this$MarqueeSpacing");
            return MarqueeSpacing.mo69432roundToPx0680j_4(this.f12797a);
        }
    }

    @ExperimentalFoundationApi
    @NotNull
    /* renamed from: MarqueeSpacing-0680j_4  reason: not valid java name */
    public static final MarqueeSpacing m69320MarqueeSpacing0680j_4(float f) {
        return new C2770a(f);
    }

    /* renamed from: a */
    public static final AnimationSpec m61618a(int i, float f, int i2, int i3, float f2, Density density) {
        TweenSpec m61617b = m61617b(Math.abs(density.mo69438toPx0680j_4(f2)), f, i3);
        long m69281constructorimpl$default = StartOffset.m69281constructorimpl$default((-i3) + i2, 0, 2, null);
        if (i == Integer.MAX_VALUE) {
            return AnimationSpecKt.m69262infiniteRepeatable9IiC70o$default(m61617b, null, m69281constructorimpl$default, 2, null);
        }
        return AnimationSpecKt.m69264repeatable91I0pcU$default(i, m61617b, null, m69281constructorimpl$default, 4, null);
    }

    /* renamed from: b */
    public static final TweenSpec m61617b(float f, float f2, int i) {
        return AnimationSpecKt.tween((int) Math.ceil(f2 / (f / 1000.0f)), i, EasingKt.getLinearEasing());
    }

    @ExperimentalFoundationApi
    @NotNull
    /* renamed from: basicMarquee-1Mj1MLw  reason: not valid java name */
    public static final Modifier m69322basicMarquee1Mj1MLw(@NotNull Modifier basicMarquee, int i, int i2, int i3, int i4, @NotNull MarqueeSpacing spacing, float f) {
        Intrinsics.checkNotNullParameter(basicMarquee, "$this$basicMarquee");
        Intrinsics.checkNotNullParameter(spacing, "spacing");
        return basicMarquee.then(new MarqueeModifierElement(i, i2, i3, i4, spacing, f, null));
    }

    /* renamed from: basicMarquee-1Mj1MLw$default  reason: not valid java name */
    public static /* synthetic */ Modifier m69323basicMarquee1Mj1MLw$default(Modifier modifier, int i, int i2, int i3, int i4, MarqueeSpacing marqueeSpacing, float f, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            i = f12793a;
        }
        if ((i5 & 2) != 0) {
            i2 = MarqueeAnimationMode.Companion.m69378getImmediatelyZbEOnfQ();
        }
        int i6 = i2;
        if ((i5 & 4) != 0) {
            i3 = f12794b;
        }
        int i7 = i3;
        if ((i5 & 8) != 0) {
            if (MarqueeAnimationMode.m69372equalsimpl0(i6, MarqueeAnimationMode.Companion.m69378getImmediatelyZbEOnfQ())) {
                i4 = i7;
            } else {
                i4 = 0;
            }
        }
        int i8 = i4;
        if ((i5 & 16) != 0) {
            marqueeSpacing = f12795c;
        }
        MarqueeSpacing marqueeSpacing2 = marqueeSpacing;
        if ((i5 & 32) != 0) {
            f = f12796d;
        }
        return m69322basicMarquee1Mj1MLw(modifier, i, i6, i7, i8, marqueeSpacing2, f);
    }

    @ExperimentalFoundationApi
    public static final int getDefaultMarqueeDelayMillis() {
        return f12794b;
    }

    @ExperimentalFoundationApi
    public static /* synthetic */ void getDefaultMarqueeDelayMillis$annotations() {
    }

    @ExperimentalFoundationApi
    public static final int getDefaultMarqueeIterations() {
        return f12793a;
    }

    @ExperimentalFoundationApi
    public static /* synthetic */ void getDefaultMarqueeIterations$annotations() {
    }

    @ExperimentalFoundationApi
    @NotNull
    public static final MarqueeSpacing getDefaultMarqueeSpacing() {
        return f12795c;
    }

    @ExperimentalFoundationApi
    public static /* synthetic */ void getDefaultMarqueeSpacing$annotations() {
    }

    @ExperimentalFoundationApi
    public static final float getDefaultMarqueeVelocity() {
        return f12796d;
    }

    @ExperimentalFoundationApi
    public static /* synthetic */ void getDefaultMarqueeVelocity$annotations() {
    }
}
