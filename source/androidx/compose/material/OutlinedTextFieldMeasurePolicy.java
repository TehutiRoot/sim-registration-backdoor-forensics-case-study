package androidx.compose.material;

import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.p003ui.geometry.Size;
import androidx.compose.p003ui.geometry.SizeKt;
import androidx.compose.p003ui.layout.IntrinsicMeasurable;
import androidx.compose.p003ui.layout.IntrinsicMeasureScope;
import androidx.compose.p003ui.layout.LayoutIdKt;
import androidx.compose.p003ui.layout.Measurable;
import androidx.compose.p003ui.layout.MeasurePolicy;
import androidx.compose.p003ui.layout.MeasureResult;
import androidx.compose.p003ui.layout.MeasureScope;
import androidx.compose.p003ui.layout.Placeable;
import androidx.compose.p003ui.unit.Constraints;
import androidx.compose.p003ui.unit.ConstraintsKt;
import androidx.compose.p003ui.util.MathHelpersKt;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class OutlinedTextFieldMeasurePolicy implements MeasurePolicy {

    /* renamed from: a */
    public final Function1 f14550a;

    /* renamed from: b */
    public final boolean f14551b;

    /* renamed from: c */
    public final float f14552c;

    /* renamed from: d */
    public final PaddingValues f14553d;

    public OutlinedTextFieldMeasurePolicy(Function1 onLabelMeasured, boolean z, float f, PaddingValues paddingValues) {
        Intrinsics.checkNotNullParameter(onLabelMeasured, "onLabelMeasured");
        Intrinsics.checkNotNullParameter(paddingValues, "paddingValues");
        this.f14550a = onLabelMeasured;
        this.f14551b = z;
        this.f14552c = f;
        this.f14553d = paddingValues;
    }

    /* renamed from: d */
    public final int m60858d(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i, Function2 function2) {
        Object obj;
        Object obj2;
        int i2;
        Object obj3;
        int i3;
        Object obj4;
        int i4;
        int i5;
        int m60864a;
        List list2 = list;
        for (Object obj5 : list2) {
            if (Intrinsics.areEqual(TextFieldImplKt.getLayoutId((IntrinsicMeasurable) obj5), "TextField")) {
                int intValue = ((Number) function2.invoke(obj5, Integer.valueOf(i))).intValue();
                Iterator it = list2.iterator();
                while (true) {
                    obj = null;
                    if (it.hasNext()) {
                        obj2 = it.next();
                        if (Intrinsics.areEqual(TextFieldImplKt.getLayoutId((IntrinsicMeasurable) obj2), "Label")) {
                            break;
                        }
                    } else {
                        obj2 = null;
                        break;
                    }
                }
                IntrinsicMeasurable intrinsicMeasurable = (IntrinsicMeasurable) obj2;
                if (intrinsicMeasurable != null) {
                    i2 = ((Number) function2.invoke(intrinsicMeasurable, Integer.valueOf(i))).intValue();
                } else {
                    i2 = 0;
                }
                Iterator it2 = list2.iterator();
                while (true) {
                    if (it2.hasNext()) {
                        obj3 = it2.next();
                        if (Intrinsics.areEqual(TextFieldImplKt.getLayoutId((IntrinsicMeasurable) obj3), "Trailing")) {
                            break;
                        }
                    } else {
                        obj3 = null;
                        break;
                    }
                }
                IntrinsicMeasurable intrinsicMeasurable2 = (IntrinsicMeasurable) obj3;
                if (intrinsicMeasurable2 != null) {
                    i3 = ((Number) function2.invoke(intrinsicMeasurable2, Integer.valueOf(i))).intValue();
                } else {
                    i3 = 0;
                }
                Iterator it3 = list2.iterator();
                while (true) {
                    if (it3.hasNext()) {
                        obj4 = it3.next();
                        if (Intrinsics.areEqual(TextFieldImplKt.getLayoutId((IntrinsicMeasurable) obj4), "Leading")) {
                            break;
                        }
                    } else {
                        obj4 = null;
                        break;
                    }
                }
                IntrinsicMeasurable intrinsicMeasurable3 = (IntrinsicMeasurable) obj4;
                if (intrinsicMeasurable3 != null) {
                    i4 = ((Number) function2.invoke(intrinsicMeasurable3, Integer.valueOf(i))).intValue();
                } else {
                    i4 = 0;
                }
                Iterator it4 = list2.iterator();
                while (true) {
                    if (!it4.hasNext()) {
                        break;
                    }
                    Object next = it4.next();
                    if (Intrinsics.areEqual(TextFieldImplKt.getLayoutId((IntrinsicMeasurable) next), "Hint")) {
                        obj = next;
                        break;
                    }
                }
                IntrinsicMeasurable intrinsicMeasurable4 = (IntrinsicMeasurable) obj;
                if (intrinsicMeasurable4 != null) {
                    i5 = ((Number) function2.invoke(intrinsicMeasurable4, Integer.valueOf(i))).intValue();
                } else {
                    i5 = 0;
                }
                m60864a = OutlinedTextFieldKt.m60864a(i4, i3, intValue, i2, i5, this.f14552c, TextFieldImplKt.getZeroConstraints(), intrinsicMeasureScope.getDensity(), this.f14553d);
                return m60864a;
            }
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }

    /* renamed from: e */
    public final int m60857e(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i, Function2 function2) {
        Object obj;
        Object obj2;
        int i2;
        Object obj3;
        int i3;
        Object obj4;
        int i4;
        int i5;
        int m60863b;
        List list2 = list;
        for (Object obj5 : list2) {
            if (Intrinsics.areEqual(TextFieldImplKt.getLayoutId((IntrinsicMeasurable) obj5), "TextField")) {
                int intValue = ((Number) function2.invoke(obj5, Integer.valueOf(i))).intValue();
                Iterator it = list2.iterator();
                while (true) {
                    obj = null;
                    if (it.hasNext()) {
                        obj2 = it.next();
                        if (Intrinsics.areEqual(TextFieldImplKt.getLayoutId((IntrinsicMeasurable) obj2), "Label")) {
                            break;
                        }
                    } else {
                        obj2 = null;
                        break;
                    }
                }
                IntrinsicMeasurable intrinsicMeasurable = (IntrinsicMeasurable) obj2;
                if (intrinsicMeasurable != null) {
                    i2 = ((Number) function2.invoke(intrinsicMeasurable, Integer.valueOf(i))).intValue();
                } else {
                    i2 = 0;
                }
                Iterator it2 = list2.iterator();
                while (true) {
                    if (it2.hasNext()) {
                        obj3 = it2.next();
                        if (Intrinsics.areEqual(TextFieldImplKt.getLayoutId((IntrinsicMeasurable) obj3), "Trailing")) {
                            break;
                        }
                    } else {
                        obj3 = null;
                        break;
                    }
                }
                IntrinsicMeasurable intrinsicMeasurable2 = (IntrinsicMeasurable) obj3;
                if (intrinsicMeasurable2 != null) {
                    i3 = ((Number) function2.invoke(intrinsicMeasurable2, Integer.valueOf(i))).intValue();
                } else {
                    i3 = 0;
                }
                Iterator it3 = list2.iterator();
                while (true) {
                    if (it3.hasNext()) {
                        obj4 = it3.next();
                        if (Intrinsics.areEqual(TextFieldImplKt.getLayoutId((IntrinsicMeasurable) obj4), "Leading")) {
                            break;
                        }
                    } else {
                        obj4 = null;
                        break;
                    }
                }
                IntrinsicMeasurable intrinsicMeasurable3 = (IntrinsicMeasurable) obj4;
                if (intrinsicMeasurable3 != null) {
                    i4 = ((Number) function2.invoke(intrinsicMeasurable3, Integer.valueOf(i))).intValue();
                } else {
                    i4 = 0;
                }
                Iterator it4 = list2.iterator();
                while (true) {
                    if (!it4.hasNext()) {
                        break;
                    }
                    Object next = it4.next();
                    if (Intrinsics.areEqual(TextFieldImplKt.getLayoutId((IntrinsicMeasurable) next), "Hint")) {
                        obj = next;
                        break;
                    }
                }
                IntrinsicMeasurable intrinsicMeasurable4 = (IntrinsicMeasurable) obj;
                if (intrinsicMeasurable4 != null) {
                    i5 = ((Number) function2.invoke(intrinsicMeasurable4, Integer.valueOf(i))).intValue();
                } else {
                    i5 = 0;
                }
                m60863b = OutlinedTextFieldKt.m60863b(i4, i3, intValue, i2, i5, this.f14552c, TextFieldImplKt.getZeroConstraints(), intrinsicMeasureScope.getDensity(), this.f14553d);
                return m60863b;
            }
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }

    @Override // androidx.compose.p003ui.layout.MeasurePolicy
    public int maxIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, List measurables, int i) {
        Intrinsics.checkNotNullParameter(intrinsicMeasureScope, "<this>");
        Intrinsics.checkNotNullParameter(measurables, "measurables");
        return m60858d(intrinsicMeasureScope, measurables, i, OutlinedTextFieldMeasurePolicy$maxIntrinsicHeight$1.INSTANCE);
    }

    @Override // androidx.compose.p003ui.layout.MeasurePolicy
    public int maxIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, List measurables, int i) {
        Intrinsics.checkNotNullParameter(intrinsicMeasureScope, "<this>");
        Intrinsics.checkNotNullParameter(measurables, "measurables");
        return m60857e(intrinsicMeasureScope, measurables, i, OutlinedTextFieldMeasurePolicy$maxIntrinsicWidth$1.INSTANCE);
    }

    @Override // androidx.compose.p003ui.layout.MeasurePolicy
    /* renamed from: measure-3p2s80s */
    public MeasureResult mo69194measure3p2s80s(MeasureScope measure, List measurables, long j) {
        Object obj;
        Placeable placeable;
        Object obj2;
        Placeable placeable2;
        Object obj3;
        Placeable placeable3;
        Object obj4;
        Placeable placeable4;
        int m60863b;
        int m60864a;
        int i;
        Intrinsics.checkNotNullParameter(measure, "$this$measure");
        Intrinsics.checkNotNullParameter(measurables, "measurables");
        int mo69432roundToPx0680j_4 = measure.mo69432roundToPx0680j_4(this.f14553d.mo69156calculateBottomPaddingD9Ej5fM());
        long m73618copyZbe2FdA$default = Constraints.m73618copyZbe2FdA$default(j, 0, 0, 0, 0, 10, null);
        List<Measurable> list = measurables;
        Iterator it = list.iterator();
        while (true) {
            if (it.hasNext()) {
                obj = it.next();
                if (Intrinsics.areEqual(LayoutIdKt.getLayoutId((Measurable) obj), "Leading")) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        Measurable measurable = (Measurable) obj;
        if (measurable != null) {
            placeable = measurable.mo72811measureBRTryo0(m73618copyZbe2FdA$default);
        } else {
            placeable = null;
        }
        int widthOrZero = TextFieldImplKt.widthOrZero(placeable);
        Iterator it2 = list.iterator();
        while (true) {
            if (it2.hasNext()) {
                obj2 = it2.next();
                if (Intrinsics.areEqual(LayoutIdKt.getLayoutId((Measurable) obj2), "Trailing")) {
                    break;
                }
            } else {
                obj2 = null;
                break;
            }
        }
        Measurable measurable2 = (Measurable) obj2;
        if (measurable2 != null) {
            placeable2 = measurable2.mo72811measureBRTryo0(ConstraintsKt.m73643offsetNN6EwU$default(m73618copyZbe2FdA$default, -widthOrZero, 0, 2, null));
        } else {
            placeable2 = null;
        }
        int widthOrZero2 = widthOrZero + TextFieldImplKt.widthOrZero(placeable2);
        int mo69432roundToPx0680j_42 = measure.mo69432roundToPx0680j_4(this.f14553d.mo69157calculateLeftPaddingu2uoSUM(measure.getLayoutDirection())) + measure.mo69432roundToPx0680j_4(this.f14553d.mo69158calculateRightPaddingu2uoSUM(measure.getLayoutDirection()));
        int i2 = -widthOrZero2;
        int i3 = -mo69432roundToPx0680j_4;
        long m73642offsetNN6EwU = ConstraintsKt.m73642offsetNN6EwU(m73618copyZbe2FdA$default, MathHelpersKt.lerp(i2 - mo69432roundToPx0680j_42, -mo69432roundToPx0680j_42, this.f14552c), i3);
        Iterator it3 = list.iterator();
        while (true) {
            if (it3.hasNext()) {
                obj3 = it3.next();
                if (Intrinsics.areEqual(LayoutIdKt.getLayoutId((Measurable) obj3), "Label")) {
                    break;
                }
            } else {
                obj3 = null;
                break;
            }
        }
        Measurable measurable3 = (Measurable) obj3;
        if (measurable3 != null) {
            placeable3 = measurable3.mo72811measureBRTryo0(m73642offsetNN6EwU);
        } else {
            placeable3 = null;
        }
        if (placeable3 != null) {
            this.f14550a.invoke(Size.m71559boximpl(SizeKt.Size(placeable3.getWidth(), placeable3.getHeight())));
        }
        long m73618copyZbe2FdA$default2 = Constraints.m73618copyZbe2FdA$default(ConstraintsKt.m73642offsetNN6EwU(j, i2, i3 - Math.max(TextFieldImplKt.heightOrZero(placeable3) / 2, measure.mo69432roundToPx0680j_4(this.f14553d.mo69159calculateTopPaddingD9Ej5fM()))), 0, 0, 0, 0, 11, null);
        for (Measurable measurable4 : list) {
            if (Intrinsics.areEqual(LayoutIdKt.getLayoutId(measurable4), "TextField")) {
                Placeable mo72811measureBRTryo0 = measurable4.mo72811measureBRTryo0(m73618copyZbe2FdA$default2);
                long m73618copyZbe2FdA$default3 = Constraints.m73618copyZbe2FdA$default(m73618copyZbe2FdA$default2, 0, 0, 0, 0, 14, null);
                Iterator it4 = list.iterator();
                while (true) {
                    if (it4.hasNext()) {
                        obj4 = it4.next();
                        if (Intrinsics.areEqual(LayoutIdKt.getLayoutId((Measurable) obj4), "Hint")) {
                            break;
                        }
                    } else {
                        obj4 = null;
                        break;
                    }
                }
                Measurable measurable5 = (Measurable) obj4;
                if (measurable5 != null) {
                    placeable4 = measurable5.mo72811measureBRTryo0(m73618copyZbe2FdA$default3);
                } else {
                    placeable4 = null;
                }
                m60863b = OutlinedTextFieldKt.m60863b(TextFieldImplKt.widthOrZero(placeable), TextFieldImplKt.widthOrZero(placeable2), mo72811measureBRTryo0.getWidth(), TextFieldImplKt.widthOrZero(placeable3), TextFieldImplKt.widthOrZero(placeable4), this.f14552c, j, measure.getDensity(), this.f14553d);
                m60864a = OutlinedTextFieldKt.m60864a(TextFieldImplKt.heightOrZero(placeable), TextFieldImplKt.heightOrZero(placeable2), mo72811measureBRTryo0.getHeight(), TextFieldImplKt.heightOrZero(placeable3), TextFieldImplKt.heightOrZero(placeable4), this.f14552c, j, measure.getDensity(), this.f14553d);
                for (Measurable measurable6 : list) {
                    if (Intrinsics.areEqual(LayoutIdKt.getLayoutId(measurable6), OutlinedTextFieldKt.BorderId)) {
                        int i4 = 0;
                        if (m60863b != Integer.MAX_VALUE) {
                            i = m60863b;
                        } else {
                            i = 0;
                        }
                        if (m60864a != Integer.MAX_VALUE) {
                            i4 = m60864a;
                        }
                        return MeasureScope.CC.m59532q(measure, m60863b, m60864a, null, new OutlinedTextFieldMeasurePolicy$measure$2(m60864a, m60863b, placeable, placeable2, mo72811measureBRTryo0, placeable3, placeable4, measurable6.mo72811measureBRTryo0(ConstraintsKt.Constraints(i, m60863b, i4, m60864a)), this, measure), 4, null);
                    }
                }
                throw new NoSuchElementException("Collection contains no element matching the predicate.");
            }
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }

    @Override // androidx.compose.p003ui.layout.MeasurePolicy
    public int minIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, List measurables, int i) {
        Intrinsics.checkNotNullParameter(intrinsicMeasureScope, "<this>");
        Intrinsics.checkNotNullParameter(measurables, "measurables");
        return m60858d(intrinsicMeasureScope, measurables, i, OutlinedTextFieldMeasurePolicy$minIntrinsicHeight$1.INSTANCE);
    }

    @Override // androidx.compose.p003ui.layout.MeasurePolicy
    public int minIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, List measurables, int i) {
        Intrinsics.checkNotNullParameter(intrinsicMeasureScope, "<this>");
        Intrinsics.checkNotNullParameter(measurables, "measurables");
        return m60857e(intrinsicMeasureScope, measurables, i, OutlinedTextFieldMeasurePolicy$minIntrinsicWidth$1.INSTANCE);
    }
}
