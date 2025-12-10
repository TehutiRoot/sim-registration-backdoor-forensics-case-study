package androidx.compose.foundation.pager;

import androidx.compose.animation.SplineBasedFloatDecayAnimationSpec_androidKt;
import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.DecayAnimationSpec;
import androidx.compose.animation.core.EasingKt;
import androidx.compose.animation.core.SpringSpec;
import androidx.compose.animation.core.TweenSpec;
import androidx.compose.foundation.ExperimentalFoundationApi;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.gestures.snapping.SnapFlingBehavior;
import androidx.compose.foundation.gestures.snapping.SnapFlingBehaviorKt;
import androidx.compose.foundation.gestures.snapping.SnapLayoutInfoProvider;
import androidx.compose.p003ui.input.nestedscroll.NestedScrollConnection;
import androidx.compose.p003ui.platform.CompositionLocalsKt;
import androidx.compose.p003ui.unit.Density;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.StabilityInferred;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 0)
@Metadata(m28851d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002Jk\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\r2\u000e\b\u0002\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\b\b\u0002\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u000bH\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u000e\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0017\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\u0018"}, m28850d2 = {"Landroidx/compose/foundation/pager/PagerDefaults;", "", "()V", "flingBehavior", "Landroidx/compose/foundation/gestures/snapping/SnapFlingBehavior;", RemoteConfigConstants.ResponseFieldKey.STATE, "Landroidx/compose/foundation/pager/PagerState;", "pagerSnapDistance", "Landroidx/compose/foundation/pager/PagerSnapDistance;", "lowVelocityAnimationSpec", "Landroidx/compose/animation/core/AnimationSpec;", "", "highVelocityAnimationSpec", "Landroidx/compose/animation/core/DecayAnimationSpec;", "snapAnimationSpec", "snapVelocityThreshold", "Landroidx/compose/ui/unit/Dp;", "snapPositionalThreshold", "flingBehavior-PfoAEA0", "(Landroidx/compose/foundation/pager/PagerState;Landroidx/compose/foundation/pager/PagerSnapDistance;Landroidx/compose/animation/core/AnimationSpec;Landroidx/compose/animation/core/DecayAnimationSpec;Landroidx/compose/animation/core/AnimationSpec;FFLandroidx/compose/runtime/Composer;II)Landroidx/compose/foundation/gestures/snapping/SnapFlingBehavior;", "pageNestedScrollConnection", "Landroidx/compose/ui/input/nestedscroll/NestedScrollConnection;", "orientation", "Landroidx/compose/foundation/gestures/Orientation;", "foundation_release"}, m28849k = 1, m28848mv = {1, 8, 0}, m28846xi = 48)
@ExperimentalFoundationApi
@SourceDebugExtension({"SMAP\nPager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Pager.kt\nandroidx/compose/foundation/pager/PagerDefaults\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 4 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,895:1\n76#2:896\n83#3,3:897\n1097#4,6:900\n*S KotlinDebug\n*F\n+ 1 Pager.kt\nandroidx/compose/foundation/pager/PagerDefaults\n*L\n539#1:896\n540#1:897,3\n540#1:900,6\n*E\n"})
/* loaded from: classes.dex */
public final class PagerDefaults {
    public static final int $stable = 0;
    @NotNull
    public static final PagerDefaults INSTANCE = new PagerDefaults();

    @Composable
    @NotNull
    /* renamed from: flingBehavior-PfoAEA0  reason: not valid java name */
    public final SnapFlingBehavior m69674flingBehaviorPfoAEA0(@NotNull PagerState state, @Nullable PagerSnapDistance pagerSnapDistance, @Nullable AnimationSpec<Float> animationSpec, @Nullable DecayAnimationSpec<Float> decayAnimationSpec, @Nullable AnimationSpec<Float> animationSpec2, float f, float f2, @Nullable Composer composer, int i, int i2) {
        PagerSnapDistance pagerSnapDistance2;
        TweenSpec tweenSpec;
        DecayAnimationSpec<Float> decayAnimationSpec2;
        SpringSpec springSpec;
        float f3;
        float f4;
        SnapLayoutInfoProvider m61125a;
        Intrinsics.checkNotNullParameter(state, "state");
        composer.startReplaceableGroup(-705378306);
        if ((i2 & 2) != 0) {
            pagerSnapDistance2 = PagerSnapDistance.Companion.atMost(1);
        } else {
            pagerSnapDistance2 = pagerSnapDistance;
        }
        if ((i2 & 4) != 0) {
            tweenSpec = AnimationSpecKt.tween$default(500, 0, EasingKt.getLinearEasing(), 2, null);
        } else {
            tweenSpec = animationSpec;
        }
        if ((i2 & 8) != 0) {
            decayAnimationSpec2 = SplineBasedFloatDecayAnimationSpec_androidKt.rememberSplineBasedDecay(composer, 0);
        } else {
            decayAnimationSpec2 = decayAnimationSpec;
        }
        if ((i2 & 16) != 0) {
            springSpec = AnimationSpecKt.spring$default(0.0f, 400.0f, null, 5, null);
        } else {
            springSpec = animationSpec2;
        }
        if ((i2 & 32) != 0) {
            f3 = SnapFlingBehaviorKt.getMinFlingVelocityDp();
        } else {
            f3 = f;
        }
        if ((i2 & 64) != 0) {
            f4 = 0.5f;
        } else {
            f4 = f2;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-705378306, i, -1, "androidx.compose.foundation.pager.PagerDefaults.flingBehavior (Pager.kt:522)");
        }
        if (0.0f <= f4 && f4 <= 1.0f) {
            Density density = (Density) composer.consume(CompositionLocalsKt.getLocalDensity());
            Object[] objArr = {state, tweenSpec, decayAnimationSpec2, springSpec, pagerSnapDistance2, density};
            composer.startReplaceableGroup(-568225417);
            boolean z = false;
            for (int i3 = 0; i3 < 6; i3++) {
                z |= composer.changed(objArr[i3]);
            }
            Object rememberedValue = composer.rememberedValue();
            if (z || rememberedValue == Composer.Companion.getEmpty()) {
                m61125a = PagerKt.m61125a(state, pagerSnapDistance2, decayAnimationSpec2, f4);
                rememberedValue = new SnapFlingBehavior(m61125a, tweenSpec, decayAnimationSpec2, springSpec, density, f3, null);
                composer.updateRememberedValue(rememberedValue);
            }
            composer.endReplaceableGroup();
            SnapFlingBehavior snapFlingBehavior = (SnapFlingBehavior) rememberedValue;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            composer.endReplaceableGroup();
            return snapFlingBehavior;
        }
        throw new IllegalArgumentException(("snapPositionalThreshold should be a number between 0 and 1. You've specified " + f4).toString());
    }

    @NotNull
    public final NestedScrollConnection pageNestedScrollConnection(@NotNull Orientation orientation) {
        C13310rx c13310rx;
        C13310rx c13310rx2;
        Intrinsics.checkNotNullParameter(orientation, "orientation");
        if (orientation == Orientation.Horizontal) {
            c13310rx2 = PagerKt.f13847a;
            return c13310rx2;
        }
        c13310rx = PagerKt.f13848b;
        return c13310rx;
    }
}
