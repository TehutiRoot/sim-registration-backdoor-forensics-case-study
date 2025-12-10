package p000;

import androidx.compose.animation.core.AnimationVector1D;
import androidx.compose.animation.core.FiniteAnimationSpec;
import androidx.compose.animation.core.Transition;
import androidx.compose.animation.core.TransitionKt;
import androidx.compose.animation.core.TwoWayConverter;
import androidx.compose.animation.core.VectorConvertersKt;
import androidx.compose.animation.graphics.vector.Keyframe;
import androidx.compose.animation.graphics.vector.PropertyValues;
import androidx.compose.animation.graphics.vector.PropertyValuesHolder;
import androidx.compose.animation.graphics.vector.PropertyValuesHolderFloat;
import androidx.compose.animation.graphics.vector.Timestamp;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.State;
import java.util.List;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.FloatCompanionObject;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: a30  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C18981a30 extends PropertyValues {
    public C18981a30() {
        super(null);
    }

    @Override // androidx.compose.animation.graphics.vector.PropertyValues
    public State createState(Transition transition, String propertyName, int i, Composer composer, int i2) {
        float floatValue;
        float floatValue2;
        Intrinsics.checkNotNullParameter(transition, "transition");
        Intrinsics.checkNotNullParameter(propertyName, "propertyName");
        composer.startReplaceableGroup(2006928772);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(2006928772, i2, -1, "androidx.compose.animation.graphics.vector.FloatPropertyValues.createState (Animator.kt:159)");
        }
        Function3 createAnimationSpec = createAnimationSpec(i);
        int i3 = ((i2 << 3) & 896) | (i2 & 14);
        composer.startReplaceableGroup(-1338768149);
        TwoWayConverter<Float, AnimationVector1D> vectorConverter = VectorConvertersKt.getVectorConverter(FloatCompanionObject.INSTANCE);
        int i4 = ((i3 << 3) & 7168) | (i3 & 14);
        composer.startReplaceableGroup(-142660079);
        boolean booleanValue = ((Boolean) transition.getCurrentState()).booleanValue();
        composer.startReplaceableGroup(-1743438372);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1743438372, 0, -1, "androidx.compose.animation.graphics.vector.FloatPropertyValues.createState.<anonymous> (Animator.kt:167)");
        }
        if (booleanValue) {
            PropertyValuesHolder holder = ((Timestamp) CollectionsKt___CollectionsKt.last((List<? extends Object>) getTimestamps())).getHolder();
            Intrinsics.checkNotNull(holder, "null cannot be cast to non-null type androidx.compose.animation.graphics.vector.PropertyValuesHolderFloat");
            floatValue = ((Number) ((Keyframe) CollectionsKt___CollectionsKt.last((List<? extends Object>) ((PropertyValuesHolderFloat) holder).getAnimatorKeyframes())).getValue()).floatValue();
        } else {
            PropertyValuesHolder holder2 = ((Timestamp) CollectionsKt___CollectionsKt.first((List<? extends Object>) getTimestamps())).getHolder();
            Intrinsics.checkNotNull(holder2, "null cannot be cast to non-null type androidx.compose.animation.graphics.vector.PropertyValuesHolderFloat");
            floatValue = ((Number) ((Keyframe) CollectionsKt___CollectionsKt.first((List<? extends Object>) ((PropertyValuesHolderFloat) holder2).getAnimatorKeyframes())).getValue()).floatValue();
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        Float valueOf = Float.valueOf(floatValue);
        boolean booleanValue2 = ((Boolean) transition.getTargetState()).booleanValue();
        composer.startReplaceableGroup(-1743438372);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1743438372, 0, -1, "androidx.compose.animation.graphics.vector.FloatPropertyValues.createState.<anonymous> (Animator.kt:167)");
        }
        if (booleanValue2) {
            PropertyValuesHolder holder3 = ((Timestamp) CollectionsKt___CollectionsKt.last((List<? extends Object>) getTimestamps())).getHolder();
            Intrinsics.checkNotNull(holder3, "null cannot be cast to non-null type androidx.compose.animation.graphics.vector.PropertyValuesHolderFloat");
            floatValue2 = ((Number) ((Keyframe) CollectionsKt___CollectionsKt.last((List<? extends Object>) ((PropertyValuesHolderFloat) holder3).getAnimatorKeyframes())).getValue()).floatValue();
        } else {
            PropertyValuesHolder holder4 = ((Timestamp) CollectionsKt___CollectionsKt.first((List<? extends Object>) getTimestamps())).getHolder();
            Intrinsics.checkNotNull(holder4, "null cannot be cast to non-null type androidx.compose.animation.graphics.vector.PropertyValuesHolderFloat");
            floatValue2 = ((Number) ((Keyframe) CollectionsKt___CollectionsKt.first((List<? extends Object>) ((PropertyValuesHolderFloat) holder4).getAnimatorKeyframes())).getValue()).floatValue();
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        State createTransitionAnimation = TransitionKt.createTransitionAnimation(transition, valueOf, Float.valueOf(floatValue2), (FiniteAnimationSpec) createAnimationSpec.invoke(transition.getSegment(), composer, 0), vectorConverter, propertyName, composer, (i4 & 14) | ((i4 << 6) & 458752));
        composer.endReplaceableGroup();
        composer.endReplaceableGroup();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return createTransitionAnimation;
    }
}