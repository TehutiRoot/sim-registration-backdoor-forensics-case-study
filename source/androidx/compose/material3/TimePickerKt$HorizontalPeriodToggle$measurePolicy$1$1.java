package androidx.compose.material3;

import androidx.compose.material3.tokens.TimePickerTokens;
import androidx.compose.p003ui.layout.IntrinsicMeasureScope;
import androidx.compose.p003ui.layout.LayoutIdKt;
import androidx.compose.p003ui.layout.Measurable;
import androidx.compose.p003ui.layout.MeasurePolicy;
import androidx.compose.p003ui.layout.MeasureResult;
import androidx.compose.p003ui.layout.MeasureScope;
import androidx.compose.p003ui.layout.Placeable;
import androidx.compose.p003ui.unit.Constraints;
import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class TimePickerKt$HorizontalPeriodToggle$measurePolicy$1$1 implements MeasurePolicy {

    /* renamed from: a */
    public static final TimePickerKt$HorizontalPeriodToggle$measurePolicy$1$1 f26396a = new TimePickerKt$HorizontalPeriodToggle$measurePolicy$1$1();

    @Override // androidx.compose.p003ui.layout.MeasurePolicy
    public /* synthetic */ int maxIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i) {
        return AbstractC22344tr0.m1366a(this, intrinsicMeasureScope, list, i);
    }

    @Override // androidx.compose.p003ui.layout.MeasurePolicy
    public /* synthetic */ int maxIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i) {
        return AbstractC22344tr0.m1365b(this, intrinsicMeasureScope, list, i);
    }

    @Override // androidx.compose.p003ui.layout.MeasurePolicy
    /* renamed from: measure-3p2s80s */
    public final MeasureResult mo69194measure3p2s80s(MeasureScope MeasurePolicy, List measurables, long j) {
        Intrinsics.checkNotNullParameter(MeasurePolicy, "$this$MeasurePolicy");
        Intrinsics.checkNotNullParameter(measurables, "measurables");
        List<Measurable> list = measurables;
        for (Measurable measurable : list) {
            if (Intrinsics.areEqual(LayoutIdKt.getLayoutId(measurable), "Spacer")) {
                Placeable mo72811measureBRTryo0 = measurable.mo72811measureBRTryo0(Constraints.m73618copyZbe2FdA$default(j, 0, AbstractC21140mr0.roundToInt(MeasurePolicy.mo69438toPx0680j_4(TimePickerTokens.INSTANCE.m71307getPeriodSelectorOutlineWidthD9Ej5fM())), 0, 0, 12, null));
                ArrayList<Measurable> arrayList = new ArrayList();
                for (Object obj : list) {
                    if (!Intrinsics.areEqual(LayoutIdKt.getLayoutId((Measurable) obj), "Spacer")) {
                        arrayList.add(obj);
                    }
                }
                ArrayList arrayList2 = new ArrayList(AbstractC10176es.collectionSizeOrDefault(arrayList, 10));
                for (Measurable measurable2 : arrayList) {
                    arrayList2.add(measurable2.mo72811measureBRTryo0(Constraints.m73618copyZbe2FdA$default(j, 0, Constraints.m73626getMaxWidthimpl(j) / 2, 0, 0, 12, null)));
                }
                return MeasureScope.CC.m59532q(MeasurePolicy, Constraints.m73626getMaxWidthimpl(j), Constraints.m73625getMaxHeightimpl(j), null, new TimePickerKt$HorizontalPeriodToggle$measurePolicy$1$1$measure$1(arrayList2, mo72811measureBRTryo0), 4, null);
            }
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }

    @Override // androidx.compose.p003ui.layout.MeasurePolicy
    public /* synthetic */ int minIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i) {
        return AbstractC22344tr0.m1364c(this, intrinsicMeasureScope, list, i);
    }

    @Override // androidx.compose.p003ui.layout.MeasurePolicy
    public /* synthetic */ int minIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i) {
        return AbstractC22344tr0.m1363d(this, intrinsicMeasureScope, list, i);
    }
}
