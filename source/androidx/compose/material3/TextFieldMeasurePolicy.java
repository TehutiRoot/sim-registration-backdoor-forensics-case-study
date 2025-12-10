package androidx.compose.material3;

import androidx.compose.foundation.layout.PaddingValues;
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
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class TextFieldMeasurePolicy implements MeasurePolicy {

    /* renamed from: a */
    public final boolean f26363a;

    /* renamed from: b */
    public final float f26364b;

    /* renamed from: c */
    public final PaddingValues f26365c;

    public TextFieldMeasurePolicy(boolean z, float f, PaddingValues paddingValues) {
        Intrinsics.checkNotNullParameter(paddingValues, "paddingValues");
        this.f26363a = z;
        this.f26364b = f;
        this.f26365c = paddingValues;
    }

    /* renamed from: d */
    private final int m60454d(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i, Function2 function2) {
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
        boolean z;
        int m60462a;
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
                if (this.f26364b == 1.0f) {
                    z = true;
                } else {
                    z = false;
                }
                m60462a = TextFieldKt.m60462a(intValue, i2, i4, i3, i5, i6, i7, i8, z, TextFieldImplKt.getZeroConstraints(), intrinsicMeasureScope.getDensity(), this.f26365c);
                return m60462a;
            }
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }

    /* renamed from: e */
    private final int m60453e(List list, int i, Function2 function2) {
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
        int m60461b;
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
                        if (Intrinsics.areEqual(TextFieldImplKt.getLayoutId((IntrinsicMeasurable) obj4), TextFieldImplKt.PrefixId)) {
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
                        if (Intrinsics.areEqual(TextFieldImplKt.getLayoutId((IntrinsicMeasurable) obj5), TextFieldImplKt.SuffixId)) {
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
                        if (Intrinsics.areEqual(TextFieldImplKt.getLayoutId((IntrinsicMeasurable) obj6), "Leading")) {
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
                m60461b = TextFieldKt.m60461b(i6, i3, i4, i5, intValue, i2, i7, TextFieldImplKt.getZeroConstraints());
                return m60461b;
            }
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }

    @Override // androidx.compose.p003ui.layout.MeasurePolicy
    public int maxIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, List measurables, int i) {
        Intrinsics.checkNotNullParameter(intrinsicMeasureScope, "<this>");
        Intrinsics.checkNotNullParameter(measurables, "measurables");
        return m60454d(intrinsicMeasureScope, measurables, i, TextFieldMeasurePolicy$maxIntrinsicHeight$1.INSTANCE);
    }

    @Override // androidx.compose.p003ui.layout.MeasurePolicy
    public int maxIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, List measurables, int i) {
        Intrinsics.checkNotNullParameter(intrinsicMeasureScope, "<this>");
        Intrinsics.checkNotNullParameter(measurables, "measurables");
        return m60453e(measurables, i, TextFieldMeasurePolicy$maxIntrinsicWidth$1.INSTANCE);
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
        Placeable placeable4;
        Object obj4;
        Placeable placeable5;
        Object obj5;
        Placeable placeable6;
        Object obj6;
        Placeable placeable7;
        Object obj7;
        Placeable placeable8;
        int m60461b;
        boolean z;
        int m60462a;
        int i;
        int i2;
        Intrinsics.checkNotNullParameter(measure, "$this$measure");
        Intrinsics.checkNotNullParameter(measurables, "measurables");
        int mo69432roundToPx0680j_4 = measure.mo69432roundToPx0680j_4(this.f26365c.mo69159calculateTopPaddingD9Ej5fM());
        int mo69432roundToPx0680j_42 = measure.mo69432roundToPx0680j_4(this.f26365c.mo69156calculateBottomPaddingD9Ej5fM());
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
        int max = Math.max(0, TextFieldImplKt.heightOrZero(placeable));
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
        int max2 = Math.max(max, TextFieldImplKt.heightOrZero(placeable2));
        Iterator it3 = list.iterator();
        while (true) {
            if (it3.hasNext()) {
                obj3 = it3.next();
                if (Intrinsics.areEqual(LayoutIdKt.getLayoutId((Measurable) obj3), TextFieldImplKt.PrefixId)) {
                    break;
                }
            } else {
                obj3 = null;
                break;
            }
        }
        Measurable measurable3 = (Measurable) obj3;
        if (measurable3 != null) {
            placeable3 = placeable2;
            placeable4 = measurable3.mo72811measureBRTryo0(ConstraintsKt.m73643offsetNN6EwU$default(m73618copyZbe2FdA$default, -widthOrZero2, 0, 2, null));
        } else {
            placeable3 = placeable2;
            placeable4 = null;
        }
        int widthOrZero3 = widthOrZero2 + TextFieldImplKt.widthOrZero(placeable4);
        int max3 = Math.max(max2, TextFieldImplKt.heightOrZero(placeable4));
        Iterator it4 = list.iterator();
        while (true) {
            if (it4.hasNext()) {
                obj4 = it4.next();
                if (Intrinsics.areEqual(LayoutIdKt.getLayoutId((Measurable) obj4), TextFieldImplKt.SuffixId)) {
                    break;
                }
            } else {
                obj4 = null;
                break;
            }
        }
        Measurable measurable4 = (Measurable) obj4;
        if (measurable4 != null) {
            placeable5 = measurable4.mo72811measureBRTryo0(ConstraintsKt.m73643offsetNN6EwU$default(m73618copyZbe2FdA$default, -widthOrZero3, 0, 2, null));
        } else {
            placeable5 = null;
        }
        int widthOrZero4 = widthOrZero3 + TextFieldImplKt.widthOrZero(placeable5);
        int max4 = Math.max(max3, TextFieldImplKt.heightOrZero(placeable5));
        int i3 = -widthOrZero4;
        long m73642offsetNN6EwU = ConstraintsKt.m73642offsetNN6EwU(m73618copyZbe2FdA$default, i3, -mo69432roundToPx0680j_42);
        Iterator it5 = list.iterator();
        while (true) {
            if (it5.hasNext()) {
                obj5 = it5.next();
                Iterator it6 = it5;
                if (Intrinsics.areEqual(LayoutIdKt.getLayoutId((Measurable) obj5), "Label")) {
                    break;
                }
                it5 = it6;
            } else {
                obj5 = null;
                break;
            }
        }
        Measurable measurable5 = (Measurable) obj5;
        if (measurable5 != null) {
            placeable6 = measurable5.mo72811measureBRTryo0(m73642offsetNN6EwU);
        } else {
            placeable6 = null;
        }
        int heightOrZero = TextFieldImplKt.heightOrZero(placeable6) + mo69432roundToPx0680j_4;
        long m73642offsetNN6EwU2 = ConstraintsKt.m73642offsetNN6EwU(Constraints.m73618copyZbe2FdA$default(j, 0, 0, 0, 0, 11, null), i3, (-heightOrZero) - mo69432roundToPx0680j_42);
        Iterator it7 = list.iterator();
        while (true) {
            int i4 = mo69432roundToPx0680j_4;
            if (it7.hasNext()) {
                Measurable measurable6 = (Measurable) it7.next();
                Iterator it8 = it7;
                if (Intrinsics.areEqual(LayoutIdKt.getLayoutId(measurable6), "TextField")) {
                    Placeable mo72811measureBRTryo0 = measurable6.mo72811measureBRTryo0(m73642offsetNN6EwU2);
                    long m73618copyZbe2FdA$default2 = Constraints.m73618copyZbe2FdA$default(m73642offsetNN6EwU2, 0, 0, 0, 0, 14, null);
                    Iterator it9 = list.iterator();
                    while (true) {
                        if (it9.hasNext()) {
                            Object next = it9.next();
                            Iterator it10 = it9;
                            if (Intrinsics.areEqual(LayoutIdKt.getLayoutId((Measurable) next), "Hint")) {
                                obj6 = next;
                                break;
                            }
                            it9 = it10;
                        } else {
                            obj6 = null;
                            break;
                        }
                    }
                    Measurable measurable7 = (Measurable) obj6;
                    if (measurable7 != null) {
                        placeable7 = measurable7.mo72811measureBRTryo0(m73618copyZbe2FdA$default2);
                    } else {
                        placeable7 = null;
                    }
                    long m73618copyZbe2FdA$default3 = Constraints.m73618copyZbe2FdA$default(ConstraintsKt.m73643offsetNN6EwU$default(m73618copyZbe2FdA$default, 0, -Math.max(max4, Math.max(TextFieldImplKt.heightOrZero(mo72811measureBRTryo0), TextFieldImplKt.heightOrZero(placeable7)) + heightOrZero + mo69432roundToPx0680j_42), 1, null), 0, 0, 0, 0, 11, null);
                    Iterator it11 = list.iterator();
                    while (true) {
                        if (it11.hasNext()) {
                            obj7 = it11.next();
                            if (Intrinsics.areEqual(LayoutIdKt.getLayoutId((Measurable) obj7), TextFieldImplKt.SupportingId)) {
                                break;
                            }
                        } else {
                            obj7 = null;
                            break;
                        }
                    }
                    Measurable measurable8 = (Measurable) obj7;
                    if (measurable8 != null) {
                        placeable8 = measurable8.mo72811measureBRTryo0(m73618copyZbe2FdA$default3);
                    } else {
                        placeable8 = null;
                    }
                    int heightOrZero2 = TextFieldImplKt.heightOrZero(placeable8);
                    m60461b = TextFieldKt.m60461b(TextFieldImplKt.widthOrZero(placeable), TextFieldImplKt.widthOrZero(placeable3), TextFieldImplKt.widthOrZero(placeable4), TextFieldImplKt.widthOrZero(placeable5), mo72811measureBRTryo0.getWidth(), TextFieldImplKt.widthOrZero(placeable6), TextFieldImplKt.widthOrZero(placeable7), j);
                    int height = mo72811measureBRTryo0.getHeight();
                    int heightOrZero3 = TextFieldImplKt.heightOrZero(placeable6);
                    int heightOrZero4 = TextFieldImplKt.heightOrZero(placeable);
                    int heightOrZero5 = TextFieldImplKt.heightOrZero(placeable3);
                    int heightOrZero6 = TextFieldImplKt.heightOrZero(placeable4);
                    int heightOrZero7 = TextFieldImplKt.heightOrZero(placeable5);
                    int heightOrZero8 = TextFieldImplKt.heightOrZero(placeable7);
                    int heightOrZero9 = TextFieldImplKt.heightOrZero(placeable8);
                    if (this.f26364b == 1.0f) {
                        z = true;
                    } else {
                        z = false;
                    }
                    m60462a = TextFieldKt.m60462a(height, heightOrZero3, heightOrZero4, heightOrZero5, heightOrZero6, heightOrZero7, heightOrZero8, heightOrZero9, z, j, measure.getDensity(), this.f26365c);
                    int i5 = m60462a - heightOrZero2;
                    for (Measurable measurable9 : list) {
                        if (Intrinsics.areEqual(LayoutIdKt.getLayoutId(measurable9), TextFieldImplKt.ContainerId)) {
                            if (m60461b != Integer.MAX_VALUE) {
                                i = m60461b;
                            } else {
                                i = 0;
                            }
                            if (i5 != Integer.MAX_VALUE) {
                                i2 = i5;
                            } else {
                                i2 = 0;
                            }
                            return MeasureScope.CC.m59532q(measure, m60461b, m60462a, null, new TextFieldMeasurePolicy$measure$1(placeable6, m60461b, m60462a, mo72811measureBRTryo0, placeable7, placeable, placeable3, placeable4, placeable5, measurable9.mo72811measureBRTryo0(ConstraintsKt.Constraints(i, m60461b, i2, i5)), placeable8, this, i4, measure), 4, null);
                        }
                    }
                    throw new NoSuchElementException("Collection contains no element matching the predicate.");
                }
                it7 = it8;
                mo69432roundToPx0680j_4 = i4;
            } else {
                throw new NoSuchElementException("Collection contains no element matching the predicate.");
            }
        }
    }

    @Override // androidx.compose.p003ui.layout.MeasurePolicy
    public int minIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, List measurables, int i) {
        Intrinsics.checkNotNullParameter(intrinsicMeasureScope, "<this>");
        Intrinsics.checkNotNullParameter(measurables, "measurables");
        return m60454d(intrinsicMeasureScope, measurables, i, TextFieldMeasurePolicy$minIntrinsicHeight$1.INSTANCE);
    }

    @Override // androidx.compose.p003ui.layout.MeasurePolicy
    public int minIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, List measurables, int i) {
        Intrinsics.checkNotNullParameter(intrinsicMeasureScope, "<this>");
        Intrinsics.checkNotNullParameter(measurables, "measurables");
        return m60453e(measurables, i, TextFieldMeasurePolicy$minIntrinsicWidth$1.INSTANCE);
    }
}
