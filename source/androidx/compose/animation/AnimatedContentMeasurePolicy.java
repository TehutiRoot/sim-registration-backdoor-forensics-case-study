package androidx.compose.animation;

import androidx.compose.animation.AnimatedContentTransitionScopeImpl;
import androidx.compose.p003ui.layout.IntrinsicMeasureScope;
import androidx.compose.p003ui.layout.Measurable;
import androidx.compose.p003ui.layout.MeasurePolicy;
import androidx.compose.p003ui.layout.MeasureResult;
import androidx.compose.p003ui.layout.MeasureScope;
import androidx.compose.p003ui.layout.Placeable;
import androidx.compose.p003ui.unit.IntSizeKt;
import java.util.List;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import kotlin.sequences.Sequence;
import kotlin.sequences.SequencesKt___SequencesKt;

/* loaded from: classes.dex */
public final class AnimatedContentMeasurePolicy implements MeasurePolicy {

    /* renamed from: a */
    public final AnimatedContentTransitionScopeImpl f12331a;

    public AnimatedContentMeasurePolicy(AnimatedContentTransitionScopeImpl rootScope) {
        Intrinsics.checkNotNullParameter(rootScope, "rootScope");
        this.f12331a = rootScope;
    }

    /* renamed from: a */
    public final AnimatedContentTransitionScopeImpl m61759a() {
        return this.f12331a;
    }

    @Override // androidx.compose.p003ui.layout.MeasurePolicy
    public int maxIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, List measurables, int i) {
        Intrinsics.checkNotNullParameter(intrinsicMeasureScope, "<this>");
        Intrinsics.checkNotNullParameter(measurables, "measurables");
        Integer num = (Integer) SequencesKt___SequencesKt.maxOrNull((Sequence<? extends Comparable>) SequencesKt___SequencesKt.map(CollectionsKt___CollectionsKt.asSequence(measurables), new AnimatedContentMeasurePolicy$maxIntrinsicHeight$1(i)));
        if (num != null) {
            return num.intValue();
        }
        return 0;
    }

    @Override // androidx.compose.p003ui.layout.MeasurePolicy
    public int maxIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, List measurables, int i) {
        Intrinsics.checkNotNullParameter(intrinsicMeasureScope, "<this>");
        Intrinsics.checkNotNullParameter(measurables, "measurables");
        Integer num = (Integer) SequencesKt___SequencesKt.maxOrNull((Sequence<? extends Comparable>) SequencesKt___SequencesKt.map(CollectionsKt___CollectionsKt.asSequence(measurables), new AnimatedContentMeasurePolicy$maxIntrinsicWidth$1(i)));
        if (num != null) {
            return num.intValue();
        }
        return 0;
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [kotlin.collections.IntIterator, java.util.Iterator] */
    /* JADX WARN: Type inference failed for: r2v6, types: [kotlin.collections.IntIterator, java.util.Iterator] */
    @Override // androidx.compose.p003ui.layout.MeasurePolicy
    /* renamed from: measure-3p2s80s  reason: not valid java name */
    public MeasureResult mo69194measure3p2s80s(MeasureScope measure, List measurables, long j) {
        Placeable placeable;
        Placeable placeable2;
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        Intrinsics.checkNotNullParameter(measure, "$this$measure");
        Intrinsics.checkNotNullParameter(measurables, "measurables");
        int size = measurables.size();
        Placeable[] placeableArr = new Placeable[size];
        int size2 = measurables.size();
        int i7 = 0;
        while (true) {
            placeable = null;
            AnimatedContentTransitionScopeImpl.ChildData childData = null;
            if (i7 >= size2) {
                break;
            }
            Measurable measurable = (Measurable) measurables.get(i7);
            Object parentData = measurable.getParentData();
            if (parentData instanceof AnimatedContentTransitionScopeImpl.ChildData) {
                childData = (AnimatedContentTransitionScopeImpl.ChildData) parentData;
            }
            if (childData != null && childData.isTarget()) {
                placeableArr[i7] = measurable.mo72811measureBRTryo0(j);
            }
            i7++;
        }
        int size3 = measurables.size();
        for (int i8 = 0; i8 < size3; i8++) {
            Measurable measurable2 = (Measurable) measurables.get(i8);
            if (placeableArr[i8] == null) {
                placeableArr[i8] = measurable2.mo72811measureBRTryo0(j);
            }
        }
        if (size == 0) {
            placeable2 = null;
        } else {
            placeable2 = placeableArr[0];
            int lastIndex = ArraysKt___ArraysKt.getLastIndex(placeableArr);
            if (lastIndex != 0) {
                if (placeable2 != null) {
                    i = placeable2.getWidth();
                } else {
                    i = 0;
                }
                ?? it = new IntRange(1, lastIndex).iterator();
                while (it.hasNext()) {
                    Placeable placeable3 = placeableArr[it.nextInt()];
                    if (placeable3 != null) {
                        i2 = placeable3.getWidth();
                    } else {
                        i2 = 0;
                    }
                    if (i < i2) {
                        placeable2 = placeable3;
                        i = i2;
                    }
                }
            }
        }
        if (placeable2 != null) {
            i3 = placeable2.getWidth();
        } else {
            i3 = 0;
        }
        if (size != 0) {
            placeable = placeableArr[0];
            int lastIndex2 = ArraysKt___ArraysKt.getLastIndex(placeableArr);
            if (lastIndex2 != 0) {
                if (placeable != null) {
                    i5 = placeable.getHeight();
                } else {
                    i5 = 0;
                }
                ?? it2 = new IntRange(1, lastIndex2).iterator();
                while (it2.hasNext()) {
                    Placeable placeable4 = placeableArr[it2.nextInt()];
                    if (placeable4 != null) {
                        i6 = placeable4.getHeight();
                    } else {
                        i6 = 0;
                    }
                    if (i5 < i6) {
                        placeable = placeable4;
                        i5 = i6;
                    }
                }
            }
        }
        if (placeable != null) {
            i4 = placeable.getHeight();
        } else {
            i4 = 0;
        }
        this.f12331a.m69213setMeasuredSizeozmzZPI$animation_release(IntSizeKt.IntSize(i3, i4));
        return MeasureScope.CC.m59532q(measure, i3, i4, null, new AnimatedContentMeasurePolicy$measure$3(placeableArr, this, i3, i4), 4, null);
    }

    @Override // androidx.compose.p003ui.layout.MeasurePolicy
    public int minIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, List measurables, int i) {
        Intrinsics.checkNotNullParameter(intrinsicMeasureScope, "<this>");
        Intrinsics.checkNotNullParameter(measurables, "measurables");
        Integer num = (Integer) SequencesKt___SequencesKt.maxOrNull((Sequence<? extends Comparable>) SequencesKt___SequencesKt.map(CollectionsKt___CollectionsKt.asSequence(measurables), new AnimatedContentMeasurePolicy$minIntrinsicHeight$1(i)));
        if (num != null) {
            return num.intValue();
        }
        return 0;
    }

    @Override // androidx.compose.p003ui.layout.MeasurePolicy
    public int minIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, List measurables, int i) {
        Intrinsics.checkNotNullParameter(intrinsicMeasureScope, "<this>");
        Intrinsics.checkNotNullParameter(measurables, "measurables");
        Integer num = (Integer) SequencesKt___SequencesKt.maxOrNull((Sequence<? extends Comparable>) SequencesKt___SequencesKt.map(CollectionsKt___CollectionsKt.asSequence(measurables), new AnimatedContentMeasurePolicy$minIntrinsicWidth$1(i)));
        if (num != null) {
            return num.intValue();
        }
        return 0;
    }
}
