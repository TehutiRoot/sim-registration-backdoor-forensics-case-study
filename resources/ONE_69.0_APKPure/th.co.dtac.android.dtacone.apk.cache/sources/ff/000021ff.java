package androidx.compose.animation;

import androidx.compose.p003ui.layout.IntrinsicMeasureScope;
import androidx.compose.p003ui.layout.Measurable;
import androidx.compose.p003ui.layout.MeasurePolicy;
import androidx.compose.p003ui.layout.MeasureResult;
import androidx.compose.p003ui.layout.MeasureScope;
import androidx.compose.p003ui.layout.Placeable;
import androidx.compose.p003ui.unit.IntSize;
import androidx.compose.p003ui.unit.IntSizeKt;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.Sequence;
import kotlin.sequences.SequencesKt___SequencesKt;

/* loaded from: classes.dex */
public final class AnimatedEnterExitMeasurePolicy implements MeasurePolicy {

    /* renamed from: a */
    public final AnimatedVisibilityScopeImpl f12437a;

    public AnimatedEnterExitMeasurePolicy(AnimatedVisibilityScopeImpl scope) {
        Intrinsics.checkNotNullParameter(scope, "scope");
        this.f12437a = scope;
    }

    @Override // androidx.compose.p003ui.layout.MeasurePolicy
    public int maxIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, List measurables, int i) {
        Intrinsics.checkNotNullParameter(intrinsicMeasureScope, "<this>");
        Intrinsics.checkNotNullParameter(measurables, "measurables");
        Integer num = (Integer) SequencesKt___SequencesKt.maxOrNull((Sequence<? extends Comparable>) SequencesKt___SequencesKt.map(CollectionsKt___CollectionsKt.asSequence(measurables), new AnimatedEnterExitMeasurePolicy$maxIntrinsicHeight$1(i)));
        if (num != null) {
            return num.intValue();
        }
        return 0;
    }

    @Override // androidx.compose.p003ui.layout.MeasurePolicy
    public int maxIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, List measurables, int i) {
        Intrinsics.checkNotNullParameter(intrinsicMeasureScope, "<this>");
        Intrinsics.checkNotNullParameter(measurables, "measurables");
        Integer num = (Integer) SequencesKt___SequencesKt.maxOrNull((Sequence<? extends Comparable>) SequencesKt___SequencesKt.map(CollectionsKt___CollectionsKt.asSequence(measurables), new AnimatedEnterExitMeasurePolicy$maxIntrinsicWidth$1(i)));
        if (num != null) {
            return num.intValue();
        }
        return 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v14 */
    /* JADX WARN: Type inference failed for: r11v16 */
    @Override // androidx.compose.p003ui.layout.MeasurePolicy
    /* renamed from: measure-3p2s80s */
    public MeasureResult mo69380measure3p2s80s(MeasureScope measure, List measurables, long j) {
        Object obj;
        int i;
        int i2;
        Intrinsics.checkNotNullParameter(measure, "$this$measure");
        Intrinsics.checkNotNullParameter(measurables, "measurables");
        List<Measurable> list = measurables;
        ArrayList arrayList = new ArrayList(AbstractC10172es.collectionSizeOrDefault(list, 10));
        for (Measurable measurable : list) {
            arrayList.add(measurable.mo72995measureBRTryo0(j));
        }
        Placeable placeable = null;
        int i3 = 1;
        if (arrayList.isEmpty()) {
            obj = null;
        } else {
            obj = arrayList.get(0);
            int width = ((Placeable) obj).getWidth();
            int lastIndex = CollectionsKt__CollectionsKt.getLastIndex(arrayList);
            if (1 <= lastIndex) {
                int i4 = 1;
                while (true) {
                    Object obj2 = arrayList.get(i4);
                    int width2 = ((Placeable) obj2).getWidth();
                    if (width < width2) {
                        obj = obj2;
                        width = width2;
                    }
                    if (i4 == lastIndex) {
                        break;
                    }
                    i4++;
                }
            }
        }
        Placeable placeable2 = (Placeable) obj;
        if (placeable2 != null) {
            i = placeable2.getWidth();
        } else {
            i = 0;
        }
        if (!arrayList.isEmpty()) {
            Object obj3 = arrayList.get(0);
            int height = ((Placeable) obj3).getHeight();
            int lastIndex2 = CollectionsKt__CollectionsKt.getLastIndex(arrayList);
            Object obj4 = obj3;
            if (1 <= lastIndex2) {
                while (true) {
                    Object obj5 = arrayList.get(i3);
                    int height2 = ((Placeable) obj5).getHeight();
                    obj3 = obj4;
                    if (height < height2) {
                        obj3 = obj5;
                        height = height2;
                    }
                    if (i3 == lastIndex2) {
                        break;
                    }
                    i3++;
                    obj4 = obj3;
                }
            }
            placeable = obj3;
        }
        Placeable placeable3 = placeable;
        if (placeable3 != null) {
            i2 = placeable3.getHeight();
        } else {
            i2 = 0;
        }
        this.f12437a.getTargetSize$animation_release().setValue(IntSize.m73994boximpl(IntSizeKt.IntSize(i, i2)));
        return MeasureScope.CC.m59482q(measure, i, i2, null, new AnimatedEnterExitMeasurePolicy$measure$1(arrayList), 4, null);
    }

    @Override // androidx.compose.p003ui.layout.MeasurePolicy
    public int minIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, List measurables, int i) {
        Intrinsics.checkNotNullParameter(intrinsicMeasureScope, "<this>");
        Intrinsics.checkNotNullParameter(measurables, "measurables");
        Integer num = (Integer) SequencesKt___SequencesKt.maxOrNull((Sequence<? extends Comparable>) SequencesKt___SequencesKt.map(CollectionsKt___CollectionsKt.asSequence(measurables), new AnimatedEnterExitMeasurePolicy$minIntrinsicHeight$1(i)));
        if (num != null) {
            return num.intValue();
        }
        return 0;
    }

    @Override // androidx.compose.p003ui.layout.MeasurePolicy
    public int minIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, List measurables, int i) {
        Intrinsics.checkNotNullParameter(intrinsicMeasureScope, "<this>");
        Intrinsics.checkNotNullParameter(measurables, "measurables");
        Integer num = (Integer) SequencesKt___SequencesKt.maxOrNull((Sequence<? extends Comparable>) SequencesKt___SequencesKt.map(CollectionsKt___CollectionsKt.asSequence(measurables), new AnimatedEnterExitMeasurePolicy$minIntrinsicWidth$1(i)));
        if (num != null) {
            return num.intValue();
        }
        return 0;
    }
}