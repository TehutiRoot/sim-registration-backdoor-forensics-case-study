package androidx.compose.material3;

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
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class OutlinedTextFieldMeasurePolicy implements MeasurePolicy {

    /* renamed from: a */
    public final Function1 f26027a;

    /* renamed from: b */
    public final boolean f26028b;

    /* renamed from: c */
    public final float f26029c;

    /* renamed from: d */
    public final PaddingValues f26030d;

    public OutlinedTextFieldMeasurePolicy(Function1 onLabelMeasured, boolean z, float f, PaddingValues paddingValues) {
        Intrinsics.checkNotNullParameter(onLabelMeasured, "onLabelMeasured");
        Intrinsics.checkNotNullParameter(paddingValues, "paddingValues");
        this.f26027a = onLabelMeasured;
        this.f26028b = z;
        this.f26029c = f;
        this.f26030d = paddingValues;
    }

    /* renamed from: d */
    private final int m60540d(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i, Function2 function2) {
        Object obj;
        Object obj2;
        int i2;
        Object obj3;
        int i3;
        Object obj4;
        int i4;
        Object obj5;
        int i5;
        Object obj6;
        int i6;
        Object obj7;
        int i7;
        int i8;
        int m60547a;
        List list2 = list;
        for (Object obj8 : list2) {
            if (Intrinsics.areEqual(TextFieldImplKt.getLayoutId((IntrinsicMeasurable) obj8), "TextField")) {
                int intValue = ((Number) function2.invoke(obj8, Integer.valueOf(i))).intValue();
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
                    if (it4.hasNext()) {
                        obj5 = it4.next();
                        if (Intrinsics.areEqual(TextFieldImplKt.getLayoutId((IntrinsicMeasurable) obj5), TextFieldImplKt.PrefixId)) {
                            break;
                        }
                    } else {
                        obj5 = null;
                        break;
                    }
                }
                IntrinsicMeasurable intrinsicMeasurable4 = (IntrinsicMeasurable) obj5;
                if (intrinsicMeasurable4 != null) {
                    i5 = ((Number) function2.invoke(intrinsicMeasurable4, Integer.valueOf(i))).intValue();
                } else {
                    i5 = 0;
                }
                Iterator it5 = list2.iterator();
                while (true) {
                    if (it5.hasNext()) {
                        obj6 = it5.next();
                        if (Intrinsics.areEqual(TextFieldImplKt.getLayoutId((IntrinsicMeasurable) obj6), TextFieldImplKt.SuffixId)) {
                            break;
                        }
                    } else {
                        obj6 = null;
                        break;
                    }
                }
                IntrinsicMeasurable intrinsicMeasurable5 = (IntrinsicMeasurable) obj6;
                if (intrinsicMeasurable5 != null) {
                    i6 = ((Number) function2.invoke(intrinsicMeasurable5, Integer.valueOf(i))).intValue();
                } else {
                    i6 = 0;
                }
                Iterator it6 = list2.iterator();
                while (true) {
                    if (it6.hasNext()) {
                        obj7 = it6.next();
                        if (Intrinsics.areEqual(TextFieldImplKt.getLayoutId((IntrinsicMeasurable) obj7), "Hint")) {
                            break;
                        }
                    } else {
                        obj7 = null;
                        break;
                    }
                }
                IntrinsicMeasurable intrinsicMeasurable6 = (IntrinsicMeasurable) obj7;
                if (intrinsicMeasurable6 != null) {
                    i7 = ((Number) function2.invoke(intrinsicMeasurable6, Integer.valueOf(i))).intValue();
                } else {
                    i7 = 0;
                }
                Iterator it7 = list2.iterator();
                while (true) {
                    if (!it7.hasNext()) {
                        break;
                    }
                    Object next = it7.next();
                    if (Intrinsics.areEqual(TextFieldImplKt.getLayoutId((IntrinsicMeasurable) next), TextFieldImplKt.SupportingId)) {
                        obj = next;
                        break;
                    }
                }
                IntrinsicMeasurable intrinsicMeasurable7 = (IntrinsicMeasurable) obj;
                if (intrinsicMeasurable7 != null) {
                    i8 = ((Number) function2.invoke(intrinsicMeasurable7, Integer.valueOf(i))).intValue();
                } else {
                    i8 = 0;
                }
                m60547a = OutlinedTextFieldKt.m60547a(i4, i3, i5, i6, intValue, i2, i7, i8, TextFieldImplKt.getZeroConstraints(), intrinsicMeasureScope.getDensity(), this.f26030d);
                return m60547a;
            }
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }

    /* renamed from: e */
    private final int m60539e(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i, Function2 function2) {
        Object obj;
        Object obj2;
        int i2;
        Object obj3;
        int i3;
        Object obj4;
        int i4;
        Object obj5;
        int i5;
        Object obj6;
        int i6;
        int i7;
        boolean z;
        int m60546b;
        List list2 = list;
        for (Object obj7 : list2) {
            if (Intrinsics.areEqual(TextFieldImplKt.getLayoutId((IntrinsicMeasurable) obj7), "TextField")) {
                int intValue = ((Number) function2.invoke(obj7, Integer.valueOf(i))).intValue();
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
                    if (it4.hasNext()) {
                        obj5 = it4.next();
                        if (Intrinsics.areEqual(TextFieldImplKt.getLayoutId((IntrinsicMeasurable) obj5), TextFieldImplKt.PrefixId)) {
                            break;
                        }
                    } else {
                        obj5 = null;
                        break;
                    }
                }
                IntrinsicMeasurable intrinsicMeasurable4 = (IntrinsicMeasurable) obj5;
                if (intrinsicMeasurable4 != null) {
                    i5 = ((Number) function2.invoke(intrinsicMeasurable4, Integer.valueOf(i))).intValue();
                } else {
                    i5 = 0;
                }
                Iterator it5 = list2.iterator();
                while (true) {
                    if (it5.hasNext()) {
                        obj6 = it5.next();
                        if (Intrinsics.areEqual(TextFieldImplKt.getLayoutId((IntrinsicMeasurable) obj6), TextFieldImplKt.SuffixId)) {
                            break;
                        }
                    } else {
                        obj6 = null;
                        break;
                    }
                }
                IntrinsicMeasurable intrinsicMeasurable5 = (IntrinsicMeasurable) obj6;
                if (intrinsicMeasurable5 != null) {
                    i6 = ((Number) function2.invoke(intrinsicMeasurable5, Integer.valueOf(i))).intValue();
                } else {
                    i6 = 0;
                }
                Iterator it6 = list2.iterator();
                while (true) {
                    if (!it6.hasNext()) {
                        break;
                    }
                    Object next = it6.next();
                    if (Intrinsics.areEqual(TextFieldImplKt.getLayoutId((IntrinsicMeasurable) next), "Hint")) {
                        obj = next;
                        break;
                    }
                }
                IntrinsicMeasurable intrinsicMeasurable6 = (IntrinsicMeasurable) obj;
                if (intrinsicMeasurable6 != null) {
                    i7 = ((Number) function2.invoke(intrinsicMeasurable6, Integer.valueOf(i))).intValue();
                } else {
                    i7 = 0;
                }
                if (this.f26029c < 1.0f) {
                    z = true;
                } else {
                    z = false;
                }
                m60546b = OutlinedTextFieldKt.m60546b(i4, i3, i5, i6, intValue, i2, i7, z, TextFieldImplKt.getZeroConstraints(), intrinsicMeasureScope.getDensity(), this.f26030d);
                return m60546b;
            }
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }

    @Override // androidx.compose.p003ui.layout.MeasurePolicy
    public int maxIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, List measurables, int i) {
        Intrinsics.checkNotNullParameter(intrinsicMeasureScope, "<this>");
        Intrinsics.checkNotNullParameter(measurables, "measurables");
        return m60540d(intrinsicMeasureScope, measurables, i, OutlinedTextFieldMeasurePolicy$maxIntrinsicHeight$1.INSTANCE);
    }

    @Override // androidx.compose.p003ui.layout.MeasurePolicy
    public int maxIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, List measurables, int i) {
        Intrinsics.checkNotNullParameter(intrinsicMeasureScope, "<this>");
        Intrinsics.checkNotNullParameter(measurables, "measurables");
        return m60539e(intrinsicMeasureScope, measurables, i, OutlinedTextFieldMeasurePolicy$maxIntrinsicWidth$1.INSTANCE);
    }

    @Override // androidx.compose.p003ui.layout.MeasurePolicy
    /* renamed from: measure-3p2s80s */
    public MeasureResult mo69380measure3p2s80s(MeasureScope measure, List measurables, long j) {
        Object obj;
        Object obj2;
        Object obj3;
        Object obj4;
        Placeable placeable;
        Placeable placeable2;
        Placeable placeable3;
        Object obj5;
        Object obj6;
        Object obj7;
        int m60546b;
        int m60547a;
        Intrinsics.checkNotNullParameter(measure, "$this$measure");
        Intrinsics.checkNotNullParameter(measurables, "measurables");
        int mo69616roundToPx0680j_4 = measure.mo69616roundToPx0680j_4(this.f26030d.mo69342calculateBottomPaddingD9Ej5fM());
        long m73802copyZbe2FdA$default = Constraints.m73802copyZbe2FdA$default(j, 0, 0, 0, 0, 10, null);
        List<Measurable> list = measurables;
        Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (Intrinsics.areEqual(LayoutIdKt.getLayoutId((Measurable) obj), "Leading")) {
                break;
            }
        }
        Measurable measurable = (Measurable) obj;
        Placeable mo72995measureBRTryo0 = measurable != null ? measurable.mo72995measureBRTryo0(m73802copyZbe2FdA$default) : null;
        int widthOrZero = TextFieldImplKt.widthOrZero(mo72995measureBRTryo0);
        int max = Math.max(0, TextFieldImplKt.heightOrZero(mo72995measureBRTryo0));
        Iterator it2 = list.iterator();
        while (true) {
            if (!it2.hasNext()) {
                obj2 = null;
                break;
            }
            obj2 = it2.next();
            if (Intrinsics.areEqual(LayoutIdKt.getLayoutId((Measurable) obj2), "Trailing")) {
                break;
            }
        }
        Measurable measurable2 = (Measurable) obj2;
        Placeable mo72995measureBRTryo02 = measurable2 != null ? measurable2.mo72995measureBRTryo0(ConstraintsKt.m73827offsetNN6EwU$default(m73802copyZbe2FdA$default, -widthOrZero, 0, 2, null)) : null;
        int widthOrZero2 = widthOrZero + TextFieldImplKt.widthOrZero(mo72995measureBRTryo02);
        int max2 = Math.max(max, TextFieldImplKt.heightOrZero(mo72995measureBRTryo02));
        Iterator it3 = list.iterator();
        while (true) {
            if (!it3.hasNext()) {
                obj3 = null;
                break;
            }
            obj3 = it3.next();
            if (Intrinsics.areEqual(LayoutIdKt.getLayoutId((Measurable) obj3), TextFieldImplKt.PrefixId)) {
                break;
            }
        }
        Measurable measurable3 = (Measurable) obj3;
        Placeable mo72995measureBRTryo03 = measurable3 != null ? measurable3.mo72995measureBRTryo0(ConstraintsKt.m73827offsetNN6EwU$default(m73802copyZbe2FdA$default, -widthOrZero2, 0, 2, null)) : null;
        int widthOrZero3 = widthOrZero2 + TextFieldImplKt.widthOrZero(mo72995measureBRTryo03);
        int max3 = Math.max(max2, TextFieldImplKt.heightOrZero(mo72995measureBRTryo03));
        Iterator it4 = list.iterator();
        while (true) {
            if (!it4.hasNext()) {
                obj4 = null;
                break;
            }
            obj4 = it4.next();
            if (Intrinsics.areEqual(LayoutIdKt.getLayoutId((Measurable) obj4), TextFieldImplKt.SuffixId)) {
                break;
            }
        }
        Measurable measurable4 = (Measurable) obj4;
        if (measurable4 != null) {
            placeable = mo72995measureBRTryo02;
            placeable2 = measurable4.mo72995measureBRTryo0(ConstraintsKt.m73827offsetNN6EwU$default(m73802copyZbe2FdA$default, -widthOrZero3, 0, 2, null));
        } else {
            placeable = mo72995measureBRTryo02;
            placeable2 = null;
        }
        int widthOrZero4 = widthOrZero3 + TextFieldImplKt.widthOrZero(placeable2);
        int max4 = Math.max(max3, TextFieldImplKt.heightOrZero(placeable2));
        boolean z = this.f26029c < 1.0f;
        int mo69616roundToPx0680j_42 = measure.mo69616roundToPx0680j_4(this.f26030d.mo69343calculateLeftPaddingu2uoSUM(measure.getLayoutDirection())) + measure.mo69616roundToPx0680j_4(this.f26030d.mo69344calculateRightPaddingu2uoSUM(measure.getLayoutDirection()));
        int i = z ? (-widthOrZero4) - mo69616roundToPx0680j_42 : -mo69616roundToPx0680j_42;
        int i2 = -mo69616roundToPx0680j_4;
        long m73826offsetNN6EwU = ConstraintsKt.m73826offsetNN6EwU(m73802copyZbe2FdA$default, i, i2);
        Iterator it5 = list.iterator();
        while (true) {
            if (!it5.hasNext()) {
                placeable3 = placeable2;
                obj5 = null;
                break;
            }
            obj5 = it5.next();
            placeable3 = placeable2;
            if (Intrinsics.areEqual(LayoutIdKt.getLayoutId((Measurable) obj5), "Label")) {
                break;
            }
            placeable2 = placeable3;
        }
        Measurable measurable5 = (Measurable) obj5;
        Placeable mo72995measureBRTryo04 = measurable5 != null ? measurable5.mo72995measureBRTryo0(m73826offsetNN6EwU) : null;
        if (mo72995measureBRTryo04 != null) {
            this.f26027a.invoke(Size.m71743boximpl(SizeKt.Size(mo72995measureBRTryo04.getWidth(), mo72995measureBRTryo04.getHeight())));
        }
        int max5 = Math.max(TextFieldImplKt.heightOrZero(mo72995measureBRTryo04) / 2, measure.mo69616roundToPx0680j_4(this.f26030d.mo69345calculateTopPaddingD9Ej5fM()));
        long m73802copyZbe2FdA$default2 = Constraints.m73802copyZbe2FdA$default(ConstraintsKt.m73826offsetNN6EwU(j, -widthOrZero4, i2 - max5), 0, 0, 0, 0, 11, null);
        Iterator it6 = list.iterator();
        while (it6.hasNext()) {
            Measurable measurable6 = (Measurable) it6.next();
            Iterator it7 = it6;
            if (Intrinsics.areEqual(LayoutIdKt.getLayoutId(measurable6), "TextField")) {
                Placeable mo72995measureBRTryo05 = measurable6.mo72995measureBRTryo0(m73802copyZbe2FdA$default2);
                long m73802copyZbe2FdA$default3 = Constraints.m73802copyZbe2FdA$default(m73802copyZbe2FdA$default2, 0, 0, 0, 0, 14, null);
                Iterator it8 = list.iterator();
                while (true) {
                    if (!it8.hasNext()) {
                        obj6 = null;
                        break;
                    }
                    Object next = it8.next();
                    Iterator it9 = it8;
                    if (Intrinsics.areEqual(LayoutIdKt.getLayoutId((Measurable) next), "Hint")) {
                        obj6 = next;
                        break;
                    }
                    it8 = it9;
                }
                Measurable measurable7 = (Measurable) obj6;
                Placeable mo72995measureBRTryo06 = measurable7 != null ? measurable7.mo72995measureBRTryo0(m73802copyZbe2FdA$default3) : null;
                long m73802copyZbe2FdA$default4 = Constraints.m73802copyZbe2FdA$default(ConstraintsKt.m73827offsetNN6EwU$default(m73802copyZbe2FdA$default, 0, -Math.max(max4, Math.max(TextFieldImplKt.heightOrZero(mo72995measureBRTryo05), TextFieldImplKt.heightOrZero(mo72995measureBRTryo06)) + max5 + mo69616roundToPx0680j_4), 1, null), 0, 0, 0, 0, 11, null);
                Iterator it10 = list.iterator();
                while (true) {
                    if (!it10.hasNext()) {
                        obj7 = null;
                        break;
                    }
                    obj7 = it10.next();
                    if (Intrinsics.areEqual(LayoutIdKt.getLayoutId((Measurable) obj7), TextFieldImplKt.SupportingId)) {
                        break;
                    }
                }
                Measurable measurable8 = (Measurable) obj7;
                Placeable mo72995measureBRTryo07 = measurable8 != null ? measurable8.mo72995measureBRTryo0(m73802copyZbe2FdA$default4) : null;
                int heightOrZero = TextFieldImplKt.heightOrZero(mo72995measureBRTryo07);
                m60546b = OutlinedTextFieldKt.m60546b(TextFieldImplKt.widthOrZero(mo72995measureBRTryo0), TextFieldImplKt.widthOrZero(placeable), TextFieldImplKt.widthOrZero(mo72995measureBRTryo03), TextFieldImplKt.widthOrZero(placeable3), mo72995measureBRTryo05.getWidth(), TextFieldImplKt.widthOrZero(mo72995measureBRTryo04), TextFieldImplKt.widthOrZero(mo72995measureBRTryo06), z, j, measure.getDensity(), this.f26030d);
                m60547a = OutlinedTextFieldKt.m60547a(TextFieldImplKt.heightOrZero(mo72995measureBRTryo0), TextFieldImplKt.heightOrZero(placeable), TextFieldImplKt.heightOrZero(mo72995measureBRTryo03), TextFieldImplKt.heightOrZero(placeable3), mo72995measureBRTryo05.getHeight(), TextFieldImplKt.heightOrZero(mo72995measureBRTryo04), TextFieldImplKt.heightOrZero(mo72995measureBRTryo06), TextFieldImplKt.heightOrZero(mo72995measureBRTryo07), j, measure.getDensity(), this.f26030d);
                int i3 = m60547a - heightOrZero;
                for (Measurable measurable9 : list) {
                    if (Intrinsics.areEqual(LayoutIdKt.getLayoutId(measurable9), TextFieldImplKt.ContainerId)) {
                        return MeasureScope.CC.m59482q(measure, m60546b, m60547a, null, new OutlinedTextFieldMeasurePolicy$measure$2(m60547a, m60546b, mo72995measureBRTryo0, placeable, mo72995measureBRTryo03, placeable3, mo72995measureBRTryo05, mo72995measureBRTryo04, mo72995measureBRTryo06, measurable9.mo72995measureBRTryo0(ConstraintsKt.Constraints(m60546b != Integer.MAX_VALUE ? m60546b : 0, m60546b, i3 != Integer.MAX_VALUE ? i3 : 0, i3)), mo72995measureBRTryo07, this, measure), 4, null);
                    }
                }
                throw new NoSuchElementException("Collection contains no element matching the predicate.");
            }
            it6 = it7;
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }

    @Override // androidx.compose.p003ui.layout.MeasurePolicy
    public int minIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, List measurables, int i) {
        Intrinsics.checkNotNullParameter(intrinsicMeasureScope, "<this>");
        Intrinsics.checkNotNullParameter(measurables, "measurables");
        return m60540d(intrinsicMeasureScope, measurables, i, OutlinedTextFieldMeasurePolicy$minIntrinsicHeight$1.INSTANCE);
    }

    @Override // androidx.compose.p003ui.layout.MeasurePolicy
    public int minIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, List measurables, int i) {
        Intrinsics.checkNotNullParameter(intrinsicMeasureScope, "<this>");
        Intrinsics.checkNotNullParameter(measurables, "measurables");
        return m60539e(intrinsicMeasureScope, measurables, i, OutlinedTextFieldMeasurePolicy$minIntrinsicWidth$1.INSTANCE);
    }
}