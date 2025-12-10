package androidx.compose.animation.graphics.vector;

import androidx.compose.animation.core.AnimationVector1D;
import androidx.compose.animation.core.RepeatMode;
import androidx.compose.animation.core.Transition;
import androidx.compose.animation.core.TransitionKt;
import androidx.compose.animation.core.TwoWayConverter;
import androidx.compose.animation.core.VectorConvertersKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import java.util.List;
import java.util.ListIterator;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.FloatCompanionObject;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class PathPropertyValues extends PropertyValues {
    public PathPropertyValues() {
        super(null);
    }

    /* renamed from: b */
    public final List m61653b(float f) {
        Object obj;
        List timestamps = getTimestamps();
        ListIterator listIterator = timestamps.listIterator(timestamps.size());
        while (true) {
            if (listIterator.hasPrevious()) {
                obj = listIterator.previous();
                if (((Timestamp) obj).getTimeMillis() <= f) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        Timestamp timestamp = (Timestamp) obj;
        if (timestamp == null) {
            timestamp = (Timestamp) CollectionsKt___CollectionsKt.first((List<? extends Object>) getTimestamps());
        }
        float timeMillis = (f - timestamp.getTimeMillis()) / timestamp.getDurationMillis();
        if (timestamp.getRepeatCount() != 0) {
            int i = 0;
            while (timeMillis > 1.0f) {
                timeMillis -= 1.0f;
                i++;
            }
            if (timestamp.getRepeatMode() == RepeatMode.Reverse && i % 2 != 0) {
                timeMillis = 1.0f - timeMillis;
            }
        }
        PropertyValuesHolder holder = timestamp.getHolder();
        Intrinsics.checkNotNull(holder, "null cannot be cast to non-null type androidx.compose.animation.graphics.vector.PropertyValuesHolderPath");
        return ((PropertyValuesHolderPath) holder).interpolate(timeMillis);
    }

    @Override // androidx.compose.animation.graphics.vector.PropertyValues
    public State createState(Transition transition, String propertyName, int i, Composer composer, int i2) {
        float f;
        Intrinsics.checkNotNullParameter(transition, "transition");
        Intrinsics.checkNotNullParameter(propertyName, "propertyName");
        composer.startReplaceableGroup(119461169);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(119461169, i2, -1, "androidx.compose.animation.graphics.vector.PathPropertyValues.createState (Animator.kt:207)");
        }
        PathPropertyValues$createState$timeState$1 pathPropertyValues$createState$timeState$1 = new PathPropertyValues$createState$timeState$1(i);
        int i3 = ((i2 << 3) & 896) | (i2 & 14);
        composer.startReplaceableGroup(-1338768149);
        TwoWayConverter<Float, AnimationVector1D> vectorConverter = VectorConvertersKt.getVectorConverter(FloatCompanionObject.INSTANCE);
        int i4 = ((i3 << 3) & 7168) | (i3 & 14);
        composer.startReplaceableGroup(-142660079);
        boolean booleanValue = ((Boolean) transition.getCurrentState()).booleanValue();
        composer.startReplaceableGroup(-1210845840);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1210845840, 0, -1, "androidx.compose.animation.graphics.vector.PathPropertyValues.createState.<anonymous> (Animator.kt:218)");
        }
        float f2 = 0.0f;
        if (booleanValue) {
            f = i;
        } else {
            f = 0.0f;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        Float valueOf = Float.valueOf(f);
        boolean booleanValue2 = ((Boolean) transition.getTargetState()).booleanValue();
        composer.startReplaceableGroup(-1210845840);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1210845840, 0, -1, "androidx.compose.animation.graphics.vector.PathPropertyValues.createState.<anonymous> (Animator.kt:218)");
        }
        if (booleanValue2) {
            f2 = i;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        State createTransitionAnimation = TransitionKt.createTransitionAnimation(transition, valueOf, Float.valueOf(f2), pathPropertyValues$createState$timeState$1.invoke((PathPropertyValues$createState$timeState$1) transition.getSegment(), (Transition.Segment) composer, (Composer) 0), vectorConverter, propertyName, composer, (i4 & 14) | ((i4 << 6) & 458752));
        composer.endReplaceableGroup();
        composer.endReplaceableGroup();
        composer.startReplaceableGroup(511388516);
        boolean changed = composer.changed(this) | composer.changed(createTransitionAnimation);
        Object rememberedValue = composer.rememberedValue();
        if (changed || rememberedValue == Composer.Companion.getEmpty()) {
            rememberedValue = new PathPropertyValues$createState$1$1(this, createTransitionAnimation);
            composer.updateRememberedValue(rememberedValue);
        }
        composer.endReplaceableGroup();
        State derivedStateOf = SnapshotStateKt.derivedStateOf((Function0) rememberedValue);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return derivedStateOf;
    }
}
