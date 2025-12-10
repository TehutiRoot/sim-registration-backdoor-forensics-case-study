package p000;

import androidx.compose.animation.ColorVectorConverterKt;
import androidx.compose.animation.core.AnimationVector4D;
import androidx.compose.animation.core.FiniteAnimationSpec;
import androidx.compose.animation.core.Transition;
import androidx.compose.animation.core.TransitionKt;
import androidx.compose.animation.core.TwoWayConverter;
import androidx.compose.animation.graphics.vector.Keyframe;
import androidx.compose.animation.graphics.vector.PropertyValues;
import androidx.compose.animation.graphics.vector.PropertyValuesHolder;
import androidx.compose.animation.graphics.vector.PropertyValuesHolderColor;
import androidx.compose.animation.graphics.vector.Timestamp;
import androidx.compose.p003ui.graphics.Color;
import androidx.compose.p003ui.graphics.colorspace.ColorSpace;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.State;
import java.util.List;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: Ds */
/* loaded from: classes.dex */
public final class C0282Ds extends PropertyValues {
    public C0282Ds() {
        super(null);
    }

    @Override // androidx.compose.animation.graphics.vector.PropertyValues
    public State createState(Transition transition, String propertyName, int i, Composer composer, int i2) {
        long m71745unboximpl;
        long m71745unboximpl2;
        long m71745unboximpl3;
        Intrinsics.checkNotNullParameter(transition, "transition");
        Intrinsics.checkNotNullParameter(propertyName, "propertyName");
        composer.startReplaceableGroup(-2133734837);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-2133734837, i2, -1, "androidx.compose.animation.graphics.vector.ColorPropertyValues.createState (Animator.kt:183)");
        }
        Function3 createAnimationSpec = createAnimationSpec(i);
        int i3 = ((i2 << 3) & 896) | (i2 & 14);
        composer.startReplaceableGroup(-1939694975);
        boolean booleanValue = ((Boolean) transition.getTargetState()).booleanValue();
        composer.startReplaceableGroup(1880460593);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1880460593, 0, -1, "androidx.compose.animation.graphics.vector.ColorPropertyValues.createState.<anonymous> (Animator.kt:191)");
        }
        if (booleanValue) {
            PropertyValuesHolder holder = ((Timestamp) CollectionsKt___CollectionsKt.last((List<? extends Object>) getTimestamps())).getHolder();
            Intrinsics.checkNotNull(holder, "null cannot be cast to non-null type androidx.compose.animation.graphics.vector.PropertyValuesHolderColor");
            m71745unboximpl = ((Color) ((Keyframe) CollectionsKt___CollectionsKt.last((List<? extends Object>) ((PropertyValuesHolderColor) holder).getAnimatorKeyframes())).getValue()).m71745unboximpl();
        } else {
            PropertyValuesHolder holder2 = ((Timestamp) CollectionsKt___CollectionsKt.first((List<? extends Object>) getTimestamps())).getHolder();
            Intrinsics.checkNotNull(holder2, "null cannot be cast to non-null type androidx.compose.animation.graphics.vector.PropertyValuesHolderColor");
            m71745unboximpl = ((Color) ((Keyframe) CollectionsKt___CollectionsKt.first((List<? extends Object>) ((PropertyValuesHolderColor) holder2).getAnimatorKeyframes())).getValue()).m71745unboximpl();
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        ColorSpace m71739getColorSpaceimpl = Color.m71739getColorSpaceimpl(m71745unboximpl);
        composer.startReplaceableGroup(1157296644);
        boolean changed = composer.changed(m71739getColorSpaceimpl);
        TwoWayConverter<Color, AnimationVector4D> rememberedValue = composer.rememberedValue();
        if (changed || rememberedValue == Composer.Companion.getEmpty()) {
            rememberedValue = ColorVectorConverterKt.getVectorConverter(Color.Companion).invoke(m71739getColorSpaceimpl);
            composer.updateRememberedValue(rememberedValue);
        }
        composer.endReplaceableGroup();
        TwoWayConverter twoWayConverter = (TwoWayConverter) rememberedValue;
        int i4 = ((i3 << 3) & 7168) | (i3 & 14) | 64;
        composer.startReplaceableGroup(-142660079);
        boolean booleanValue2 = ((Boolean) transition.getCurrentState()).booleanValue();
        composer.startReplaceableGroup(1880460593);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1880460593, 0, -1, "androidx.compose.animation.graphics.vector.ColorPropertyValues.createState.<anonymous> (Animator.kt:191)");
        }
        if (booleanValue2) {
            PropertyValuesHolder holder3 = ((Timestamp) CollectionsKt___CollectionsKt.last((List<? extends Object>) getTimestamps())).getHolder();
            Intrinsics.checkNotNull(holder3, "null cannot be cast to non-null type androidx.compose.animation.graphics.vector.PropertyValuesHolderColor");
            m71745unboximpl2 = ((Color) ((Keyframe) CollectionsKt___CollectionsKt.last((List<? extends Object>) ((PropertyValuesHolderColor) holder3).getAnimatorKeyframes())).getValue()).m71745unboximpl();
        } else {
            PropertyValuesHolder holder4 = ((Timestamp) CollectionsKt___CollectionsKt.first((List<? extends Object>) getTimestamps())).getHolder();
            Intrinsics.checkNotNull(holder4, "null cannot be cast to non-null type androidx.compose.animation.graphics.vector.PropertyValuesHolderColor");
            m71745unboximpl2 = ((Color) ((Keyframe) CollectionsKt___CollectionsKt.first((List<? extends Object>) ((PropertyValuesHolderColor) holder4).getAnimatorKeyframes())).getValue()).m71745unboximpl();
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        Color m71725boximpl = Color.m71725boximpl(m71745unboximpl2);
        boolean booleanValue3 = ((Boolean) transition.getTargetState()).booleanValue();
        composer.startReplaceableGroup(1880460593);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1880460593, 0, -1, "androidx.compose.animation.graphics.vector.ColorPropertyValues.createState.<anonymous> (Animator.kt:191)");
        }
        if (booleanValue3) {
            PropertyValuesHolder holder5 = ((Timestamp) CollectionsKt___CollectionsKt.last((List<? extends Object>) getTimestamps())).getHolder();
            Intrinsics.checkNotNull(holder5, "null cannot be cast to non-null type androidx.compose.animation.graphics.vector.PropertyValuesHolderColor");
            m71745unboximpl3 = ((Color) ((Keyframe) CollectionsKt___CollectionsKt.last((List<? extends Object>) ((PropertyValuesHolderColor) holder5).getAnimatorKeyframes())).getValue()).m71745unboximpl();
        } else {
            PropertyValuesHolder holder6 = ((Timestamp) CollectionsKt___CollectionsKt.first((List<? extends Object>) getTimestamps())).getHolder();
            Intrinsics.checkNotNull(holder6, "null cannot be cast to non-null type androidx.compose.animation.graphics.vector.PropertyValuesHolderColor");
            m71745unboximpl3 = ((Color) ((Keyframe) CollectionsKt___CollectionsKt.first((List<? extends Object>) ((PropertyValuesHolderColor) holder6).getAnimatorKeyframes())).getValue()).m71745unboximpl();
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        State createTransitionAnimation = TransitionKt.createTransitionAnimation(transition, m71725boximpl, Color.m71725boximpl(m71745unboximpl3), (FiniteAnimationSpec) createAnimationSpec.invoke(transition.getSegment(), composer, 0), twoWayConverter, propertyName, composer, (i4 & 14) | 32768 | ((i4 << 6) & 458752));
        composer.endReplaceableGroup();
        composer.endReplaceableGroup();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return createTransitionAnimation;
    }
}
