package androidx.compose.foundation.pager;

import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.gestures.snapping.SnapPositionInLayoutKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.lazy.layout.LazyLayoutMeasureScope;
import androidx.compose.p003ui.Alignment;
import androidx.compose.p003ui.layout.MeasureResult;
import androidx.compose.p003ui.layout.Placeable;
import androidx.compose.p003ui.unit.Constraints;
import androidx.compose.p003ui.unit.ConstraintsKt;
import androidx.compose.p003ui.unit.Density;
import androidx.compose.p003ui.unit.LayoutDirection;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.ArrayDeque;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.AbstractC11695c;
import kotlin.ranges.IntProgression;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(m29143d1 = {"\u0000\u0084\u0001\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\b\u0003\u001aä\u0001\u0010'\u001a\u00020$*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00012\u0006\u0010\u0006\u001a\u00020\u00012\u0006\u0010\u0007\u001a\u00020\u00012\u0006\u0010\b\u001a\u00020\u00012\u0006\u0010\t\u001a\u00020\u00012\u0006\u0010\n\u001a\u00020\u00012\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f2\b\u0010\u0012\u001a\u0004\u0018\u00010\u00112\b\u0010\u0014\u001a\u0004\u0018\u00010\u00132\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\u00012\u0006\u0010\u001a\u001a\u00020\u00012\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00010\u001b2/\u0010#\u001a+\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0001\u0012\u0015\u0012\u0013\u0012\u0004\u0012\u00020\u001f\u0012\u0004\u0012\u00020 0\u001e¢\u0006\u0002\b!\u0012\u0004\u0012\u00020\"0\u001dH\u0000ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b%\u0010&\u001aO\u0010,\u001a\b\u0012\u0004\u0012\u00020*0\u001b2\u0006\u0010(\u001a\u00020\u00012\u0006\u0010)\u001a\u00020\u00012\u0006\u0010\u001a\u001a\u00020\u00012\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00010\u001b2\u0012\u0010+\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020*0\u001eH\u0002¢\u0006\u0004\b,\u0010-\u001aG\u0010/\u001a\b\u0012\u0004\u0012\u00020*0\u001b2\u0006\u0010.\u001a\u00020\u00012\u0006\u0010\u001a\u001a\u00020\u00012\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00010\u001b2\u0012\u0010+\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020*0\u001eH\u0002¢\u0006\u0004\b/\u00100\u001am\u00105\u001a\u00020**\u00020\u00002\u0006\u00101\u001a\u00020\u00012\u0006\u00102\u001a\u00020\r2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0010\u001a\u00020\u000f2\b\u0010\u0014\u001a\u0004\u0018\u00010\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u00112\u0006\u00104\u001a\u0002032\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0019\u001a\u00020\u0001H\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b5\u00106\u001a\u0093\u0001\u0010B\u001a\b\u0012\u0004\u0012\u00020*0A*\u00020\u00002\f\u00107\u001a\b\u0012\u0004\u0012\u00020*0\u001b2\f\u00108\u001a\b\u0012\u0004\u0012\u00020*0\u001b2\f\u00109\u001a\b\u0012\u0004\u0012\u00020*0\u001b2\u0006\u0010:\u001a\u00020\u00012\u0006\u0010;\u001a\u00020\u00012\u0006\u0010<\u001a\u00020\u00012\u0006\u0010=\u001a\u00020\u00012\u0006\u0010>\u001a\u00020\u00012\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010@\u001a\u00020?2\u0006\u0010\b\u001a\u00020\u00012\u0006\u0010\u0019\u001a\u00020\u0001H\u0002¢\u0006\u0004\bB\u0010C\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006D"}, m29142d2 = {"Landroidx/compose/foundation/lazy/layout/LazyLayoutMeasureScope;", "", "pageCount", "Landroidx/compose/foundation/pager/PagerLazyLayoutItemProvider;", "pagerItemProvider", "mainAxisAvailableSize", "beforeContentPadding", "afterContentPadding", "spaceBetweenPages", "firstVisiblePage", "firstVisiblePageOffset", "", "scrollToBeConsumed", "Landroidx/compose/ui/unit/Constraints;", "constraints", "Landroidx/compose/foundation/gestures/Orientation;", "orientation", "Landroidx/compose/ui/Alignment$Vertical;", "verticalAlignment", "Landroidx/compose/ui/Alignment$Horizontal;", "horizontalAlignment", "", "reverseLayout", "Landroidx/compose/ui/unit/IntOffset;", "visualPageOffset", "pageAvailableSize", "beyondBoundsPageCount", "", "pinnedPages", "Lkotlin/Function3;", "Lkotlin/Function1;", "Landroidx/compose/ui/layout/Placeable$PlacementScope;", "", "Lkotlin/ExtensionFunctionType;", "Landroidx/compose/ui/layout/MeasureResult;", "layout", "Landroidx/compose/foundation/pager/PagerMeasureResult;", "measurePager-ntgEbfI", "(Landroidx/compose/foundation/lazy/layout/LazyLayoutMeasureScope;ILandroidx/compose/foundation/pager/PagerLazyLayoutItemProvider;IIIIIIFJLandroidx/compose/foundation/gestures/Orientation;Landroidx/compose/ui/Alignment$Vertical;Landroidx/compose/ui/Alignment$Horizontal;ZJIILjava/util/List;Lkotlin/jvm/functions/Function3;)Landroidx/compose/foundation/pager/PagerMeasureResult;", "measurePager", "currentLastPage", "pagesCount", "Landroidx/compose/foundation/pager/MeasuredPage;", "getAndMeasure", OperatorName.CURVE_TO, "(IIILjava/util/List;Lkotlin/jvm/functions/Function1;)Ljava/util/List;", "currentFirstPage", "d", "(IILjava/util/List;Lkotlin/jvm/functions/Function1;)Ljava/util/List;", FirebaseAnalytics.Param.INDEX, "childConstraints", "Landroidx/compose/ui/unit/LayoutDirection;", "layoutDirection", "e", "(Landroidx/compose/foundation/lazy/layout/LazyLayoutMeasureScope;IJLandroidx/compose/foundation/pager/PagerLazyLayoutItemProvider;JLandroidx/compose/foundation/gestures/Orientation;Landroidx/compose/ui/Alignment$Horizontal;Landroidx/compose/ui/Alignment$Vertical;Landroidx/compose/ui/unit/LayoutDirection;ZI)Landroidx/compose/foundation/pager/MeasuredPage;", "pages", "extraPagesBefore", "extraPagesAfter", "layoutWidth", "layoutHeight", "finalMainAxisOffset", "maxOffset", "pagesScrollOffset", "Landroidx/compose/ui/unit/Density;", "density", "", PDPageLabelRange.STYLE_LETTERS_LOWER, "(Landroidx/compose/foundation/lazy/layout/LazyLayoutMeasureScope;Ljava/util/List;Ljava/util/List;Ljava/util/List;IIIIILandroidx/compose/foundation/gestures/Orientation;ZLandroidx/compose/ui/unit/Density;II)Ljava/util/List;", "foundation_release"}, m29141k = 2, m29140mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nPagerMeasure.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PagerMeasure.kt\nandroidx/compose/foundation/pager/PagerMeasureKt\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n+ 3 TempListUtils.kt\nandroidx/compose/foundation/TempListUtilsKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,581:1\n578#1,4:582\n33#2,6:586\n33#2,6:592\n33#2,6:598\n33#2,4:607\n38#2:613\n171#2,13:615\n33#2,6:628\n33#2,6:634\n33#2,6:641\n33#2,6:647\n33#2,6:653\n36#3,3:604\n39#3,2:611\n41#3:614\n1#4:640\n*S KotlinDebug\n*F\n+ 1 PagerMeasure.kt\nandroidx/compose/foundation/pager/PagerMeasureKt\n*L\n65#1:582,4\n174#1:586,6\n302#1:592,6\n328#1:598,6\n368#1:607,4\n368#1:613\n373#1:615,13\n427#1:628,6\n452#1:634,6\n554#1:641,6\n561#1:647,6\n567#1:653,6\n368#1:604,3\n368#1:611,2\n368#1:614\n*E\n"})
/* loaded from: classes.dex */
public final class PagerMeasureKt {
    /* renamed from: a */
    public static final List m61070a(LazyLayoutMeasureScope lazyLayoutMeasureScope, List list, List list2, List list3, int i, int i2, int i3, int i4, int i5, Orientation orientation, boolean z, Density density, int i6, int i7) {
        int i8;
        int i9;
        int i10 = i7 + i6;
        if (orientation == Orientation.Vertical) {
            i8 = i4;
            i9 = i2;
        } else {
            i8 = i4;
            i9 = i;
        }
        boolean z2 = i3 < Math.min(i9, i8);
        if (z2 && i5 != 0) {
            throw new IllegalStateException("Check failed.".toString());
        }
        ArrayList arrayList = new ArrayList(list.size() + list2.size() + list3.size());
        if (z2) {
            if (list2.isEmpty() && list3.isEmpty()) {
                int size = list.size();
                int[] iArr = new int[size];
                for (int i11 = 0; i11 < size; i11++) {
                    iArr[i11] = i7;
                }
                int[] iArr2 = new int[size];
                for (int i12 = 0; i12 < size; i12++) {
                    iArr2[i12] = 0;
                }
                Arrangement.HorizontalOrVertical m69665spacedBy0680j_4 = Arrangement.Absolute.INSTANCE.m69665spacedBy0680j_4(lazyLayoutMeasureScope.mo69619toDpu2uoSUM(i7));
                if (orientation == Orientation.Vertical) {
                    m69665spacedBy0680j_4.arrange(density, i9, iArr, iArr2);
                } else {
                    m69665spacedBy0680j_4.arrange(density, i9, iArr, LayoutDirection.Ltr, iArr2);
                }
                IntProgression indices = ArraysKt___ArraysKt.getIndices(iArr2);
                if (z) {
                    indices = AbstractC11695c.reversed(indices);
                }
                int first = indices.getFirst();
                int last = indices.getLast();
                int step = indices.getStep();
                if ((step > 0 && first <= last) || (step < 0 && last <= first)) {
                    while (true) {
                        int i13 = iArr2[first];
                        MeasuredPage measuredPage = (MeasuredPage) list.get(m61069b(first, z, size));
                        if (z) {
                            i13 = (i9 - i13) - measuredPage.getSize();
                        }
                        measuredPage.position(i13, i, i2);
                        arrayList.add(measuredPage);
                        if (first == last) {
                            break;
                        }
                        first += step;
                    }
                }
            } else {
                throw new IllegalArgumentException("Failed requirement.".toString());
            }
        } else {
            int size2 = list2.size();
            int i14 = i5;
            for (int i15 = 0; i15 < size2; i15++) {
                MeasuredPage measuredPage2 = (MeasuredPage) list2.get(i15);
                i14 -= i10;
                measuredPage2.position(i14, i, i2);
                arrayList.add(measuredPage2);
            }
            int size3 = list.size();
            int i16 = i5;
            for (int i17 = 0; i17 < size3; i17++) {
                MeasuredPage measuredPage3 = (MeasuredPage) list.get(i17);
                measuredPage3.position(i16, i, i2);
                arrayList.add(measuredPage3);
                i16 += i10;
            }
            int size4 = list3.size();
            for (int i18 = 0; i18 < size4; i18++) {
                MeasuredPage measuredPage4 = (MeasuredPage) list3.get(i18);
                measuredPage4.position(i16, i, i2);
                arrayList.add(measuredPage4);
                i16 += i10;
            }
        }
        return arrayList;
    }

    /* renamed from: b */
    public static final int m61069b(int i, boolean z, int i2) {
        return !z ? i : (i2 - i) - 1;
    }

    /* renamed from: c */
    public static final List m61068c(int i, int i2, int i3, List list, Function1 function1) {
        int min = Math.min(i3 + i, i2 - 1);
        int i4 = i + 1;
        ArrayList arrayList = null;
        if (i4 <= min) {
            while (true) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(function1.invoke(Integer.valueOf(i4)));
                if (i4 == min) {
                    break;
                }
                i4++;
            }
        }
        int size = list.size();
        for (int i5 = 0; i5 < size; i5++) {
            int intValue = ((Number) list.get(i5)).intValue();
            if (min + 1 <= intValue && intValue < i2) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(function1.invoke(Integer.valueOf(intValue)));
            }
        }
        if (arrayList == null) {
            return CollectionsKt__CollectionsKt.emptyList();
        }
        return arrayList;
    }

    /* renamed from: d */
    public static final List m61067d(int i, int i2, List list, Function1 function1) {
        int max = Math.max(0, i - i2);
        int i3 = i - 1;
        ArrayList arrayList = null;
        if (max <= i3) {
            while (true) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(function1.invoke(Integer.valueOf(i3)));
                if (i3 == max) {
                    break;
                }
                i3--;
            }
        }
        int size = list.size();
        for (int i4 = 0; i4 < size; i4++) {
            int intValue = ((Number) list.get(i4)).intValue();
            if (intValue < max) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(function1.invoke(Integer.valueOf(intValue)));
            }
        }
        if (arrayList == null) {
            return CollectionsKt__CollectionsKt.emptyList();
        }
        return arrayList;
    }

    /* renamed from: e */
    public static final MeasuredPage m61066e(LazyLayoutMeasureScope lazyLayoutMeasureScope, int i, long j, PagerLazyLayoutItemProvider pagerLazyLayoutItemProvider, long j2, Orientation orientation, Alignment.Horizontal horizontal, Alignment.Vertical vertical, LayoutDirection layoutDirection, boolean z, int i2) {
        return new MeasuredPage(i, i2, lazyLayoutMeasureScope.mo69826measure0kLqBqw(i, j), j2, pagerLazyLayoutItemProvider.getKey(i), orientation, horizontal, vertical, layoutDirection, z, null);
    }

    @NotNull
    /* renamed from: measurePager-ntgEbfI  reason: not valid java name */
    public static final PagerMeasureResult m69865measurePagerntgEbfI(@NotNull LazyLayoutMeasureScope measurePager, int i, @NotNull PagerLazyLayoutItemProvider pagerItemProvider, int i2, int i3, int i4, int i5, int i6, int i7, float f, long j, @NotNull Orientation orientation, @Nullable Alignment.Vertical vertical, @Nullable Alignment.Horizontal horizontal, boolean z, long j2, int i8, int i9, @NotNull List<Integer> pinnedPages, @NotNull Function3<? super Integer, ? super Integer, ? super Function1<? super Placeable.PlacementScope, Unit>, ? extends MeasureResult> layout) {
        int i10;
        int i11;
        int i12;
        ArrayDeque arrayDeque;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        ArrayDeque arrayDeque2;
        int i21;
        int i22;
        int i23;
        int i24;
        int i25;
        MeasuredPage measuredPage;
        int i26;
        int i27;
        long j3;
        ArrayList arrayList;
        Object obj;
        ArrayDeque arrayDeque3;
        int i28;
        Intrinsics.checkNotNullParameter(measurePager, "$this$measurePager");
        Intrinsics.checkNotNullParameter(pagerItemProvider, "pagerItemProvider");
        Intrinsics.checkNotNullParameter(orientation, "orientation");
        Intrinsics.checkNotNullParameter(pinnedPages, "pinnedPages");
        Intrinsics.checkNotNullParameter(layout, "layout");
        if (i3 >= 0) {
            if (i4 >= 0) {
                int coerceAtLeast = AbstractC11695c.coerceAtLeast(i8 + i5, 0);
                if (i <= 0) {
                    return new PagerMeasureResult(CollectionsKt__CollectionsKt.emptyList(), 0, i8, i5, i4, orientation, -i3, i2 + i4, false, 0.0f, null, null, 0, false, layout.invoke(Integer.valueOf(Constraints.m73812getMinWidthimpl(j)), Integer.valueOf(Constraints.m73811getMinHeightimpl(j)), PagerMeasureKt$measurePager$2.INSTANCE));
                }
                Orientation orientation2 = Orientation.Vertical;
                long Constraints$default = ConstraintsKt.Constraints$default(0, orientation == orientation2 ? Constraints.m73810getMaxWidthimpl(j) : i8, 0, orientation != orientation2 ? Constraints.m73809getMaxHeightimpl(j) : i8, 5, null);
                int i29 = i6;
                if (i29 >= i) {
                    i29 = i - 1;
                    i10 = 0;
                } else {
                    i10 = i7;
                }
                int roundToInt = AbstractC22237sr0.roundToInt(f);
                int i30 = i10 - roundToInt;
                if (i29 != 0 || i30 >= 0) {
                    i11 = roundToInt;
                } else {
                    i11 = roundToInt + i30;
                    i30 = 0;
                }
                ArrayDeque arrayDeque4 = new ArrayDeque();
                int i31 = -i3;
                int i32 = (i5 < 0 ? i5 : 0) + i31;
                int i33 = i30 + i32;
                int i34 = 0;
                while (i33 < 0 && i29 > 0) {
                    int i35 = i29 - 1;
                    int i36 = coerceAtLeast;
                    ArrayDeque arrayDeque5 = arrayDeque4;
                    MeasuredPage m61066e = m61066e(measurePager, i35, Constraints$default, pagerItemProvider, j2, orientation, horizontal, vertical, measurePager.getLayoutDirection(), z, i8);
                    arrayDeque5.add(0, m61066e);
                    i34 = Math.max(i34, m61066e.getCrossAxisSize());
                    i33 += i36;
                    i32 = i32;
                    arrayDeque4 = arrayDeque5;
                    coerceAtLeast = i36;
                    i29 = i35;
                }
                int i37 = i33;
                int i38 = coerceAtLeast;
                ArrayDeque arrayDeque6 = arrayDeque4;
                int i39 = i32;
                if (i37 < i39) {
                    i11 += i37;
                    i12 = i39;
                } else {
                    i12 = i37;
                }
                int i40 = i12 - i39;
                ArrayDeque arrayDeque7 = arrayDeque6;
                int i41 = i2;
                int i42 = i41 + i4;
                int coerceAtLeast2 = AbstractC11695c.coerceAtLeast(i42, 0);
                int i43 = -i40;
                int size = arrayDeque7.size();
                int i44 = i29;
                for (int i45 = 0; i45 < size; i45++) {
                    MeasuredPage measuredPage2 = (MeasuredPage) arrayDeque7.get(i45);
                    i44++;
                    i43 += i38;
                }
                int i46 = i;
                int i47 = i38;
                int i48 = i29;
                int i49 = i40;
                int i50 = i43;
                while (true) {
                    if (i44 >= i46) {
                        arrayDeque = arrayDeque7;
                        i13 = i48;
                        i14 = i34;
                        i15 = i47;
                        i16 = i46;
                        i17 = i50;
                        i18 = i42;
                        i41 = i2;
                        i19 = i44;
                        break;
                    } else if (i50 >= coerceAtLeast2 && i50 > 0 && !arrayDeque7.isEmpty()) {
                        arrayDeque = arrayDeque7;
                        i13 = i48;
                        i14 = i34;
                        i15 = i47;
                        i19 = i44;
                        i16 = i46;
                        i17 = i50;
                        i18 = i42;
                        break;
                    } else {
                        int i51 = i47;
                        int i52 = i48;
                        int i53 = i44;
                        int i54 = i46;
                        ArrayDeque arrayDeque8 = arrayDeque7;
                        int i55 = coerceAtLeast2;
                        int i56 = i42;
                        int i57 = i34;
                        int i58 = i39;
                        MeasuredPage m61066e2 = m61066e(measurePager, i44, Constraints$default, pagerItemProvider, j2, orientation, horizontal, vertical, measurePager.getLayoutDirection(), z, i8);
                        i50 += i51;
                        if (i50 > i58 || i53 == i54 - 1) {
                            int max = Math.max(i57, m61066e2.getCrossAxisSize());
                            arrayDeque3 = arrayDeque8;
                            arrayDeque3.add(m61066e2);
                            i28 = i52;
                            i57 = max;
                        } else {
                            i28 = i53 + 1;
                            i49 -= i51;
                            arrayDeque3 = arrayDeque8;
                        }
                        i46 = i54;
                        i47 = i51;
                        i48 = i28;
                        arrayDeque7 = arrayDeque3;
                        coerceAtLeast2 = i55;
                        i42 = i56;
                        i44 = i53 + 1;
                        i39 = i58;
                        i34 = i57;
                        i41 = i2;
                    }
                }
                if (i17 < i41) {
                    int i59 = i41 - i17;
                    int i60 = i17 + i59;
                    int i61 = i3;
                    int i62 = i13;
                    int i63 = i14;
                    int i64 = i49 - i59;
                    while (i64 < i61 && i62 > 0) {
                        int i65 = i62 - 1;
                        ArrayDeque arrayDeque9 = arrayDeque;
                        MeasuredPage m61066e3 = m61066e(measurePager, i65, Constraints$default, pagerItemProvider, j2, orientation, horizontal, vertical, measurePager.getLayoutDirection(), z, i8);
                        arrayDeque9.add(0, m61066e3);
                        i63 = Math.max(i63, m61066e3.getCrossAxisSize());
                        i64 += i15;
                        i61 = i3;
                        i19 = i19;
                        arrayDeque = arrayDeque9;
                        i62 = i65;
                    }
                    i20 = i19;
                    int i66 = i64;
                    i22 = i63;
                    arrayDeque2 = arrayDeque;
                    int i67 = i11 + i59;
                    if (i66 < 0) {
                        int i68 = i60 + i66;
                        i25 = i62;
                        i21 = i68;
                        i23 = i67 + i66;
                        i24 = 0;
                    } else {
                        i21 = i60;
                        i25 = i62;
                        i23 = i67;
                        i24 = i66;
                    }
                } else {
                    i20 = i19;
                    arrayDeque2 = arrayDeque;
                    i21 = i17;
                    i22 = i14;
                    i23 = i11;
                    i24 = i49;
                    i25 = i13;
                }
                float f2 = (AbstractC22237sr0.getSign(AbstractC22237sr0.roundToInt(f)) != AbstractC22237sr0.getSign(i23) || Math.abs(AbstractC22237sr0.roundToInt(f)) < Math.abs(i23)) ? f : i23;
                if (i24 >= 0) {
                    int i69 = -i24;
                    MeasuredPage measuredPage3 = (MeasuredPage) arrayDeque2.first();
                    if (i3 > 0 || i5 < 0) {
                        int size2 = arrayDeque2.size();
                        int i70 = i24;
                        int i71 = 0;
                        while (i71 < size2 && i70 != 0 && i15 <= i70 && i71 != CollectionsKt__CollectionsKt.getLastIndex(arrayDeque2)) {
                            i70 -= i15;
                            i71++;
                            measuredPage3 = (MeasuredPage) arrayDeque2.get(i71);
                        }
                        measuredPage = measuredPage3;
                        i26 = i70;
                    } else {
                        measuredPage = measuredPage3;
                        i26 = i24;
                    }
                    int i72 = i22;
                    int i73 = i21;
                    List m61067d = m61067d(i25, i9, pinnedPages, new PagerMeasureKt$measurePager$extraPagesBefore$1(measurePager, Constraints$default, pagerItemProvider, j2, orientation, horizontal, vertical, z, i8));
                    int size3 = m61067d.size();
                    int i74 = i72;
                    for (int i75 = 0; i75 < size3; i75++) {
                        i74 = Math.max(i74, ((MeasuredPage) m61067d.get(i75)).getCrossAxisSize());
                    }
                    MeasuredPage measuredPage4 = measuredPage;
                    ArrayDeque arrayDeque10 = arrayDeque2;
                    List m61068c = m61068c(((MeasuredPage) arrayDeque2.last()).getIndex(), i16, i9, pinnedPages, new PagerMeasureKt$measurePager$extraPagesAfter$1(measurePager, Constraints$default, pagerItemProvider, j2, orientation, horizontal, vertical, z, i8));
                    int size4 = m61068c.size();
                    int i76 = i74;
                    for (int i77 = 0; i77 < size4; i77++) {
                        i76 = Math.max(i76, ((MeasuredPage) m61068c.get(i77)).getCrossAxisSize());
                    }
                    boolean z2 = Intrinsics.areEqual(measuredPage4, arrayDeque10.first()) && m61067d.isEmpty() && m61068c.isEmpty();
                    Orientation orientation3 = Orientation.Vertical;
                    if (orientation == orientation3) {
                        j3 = j;
                        i27 = i76;
                    } else {
                        i27 = i73;
                        j3 = j;
                    }
                    int m73824constrainWidthK40F9xA = ConstraintsKt.m73824constrainWidthK40F9xA(j3, i27);
                    if (orientation == orientation3) {
                        i76 = i73;
                    }
                    int m73823constrainHeightK40F9xA = ConstraintsKt.m73823constrainHeightK40F9xA(j3, i76);
                    int i78 = i20;
                    List m61070a = m61070a(measurePager, arrayDeque10, m61067d, m61068c, m73824constrainWidthK40F9xA, m73823constrainHeightK40F9xA, i73, i2, i69, orientation, z, measurePager, i5, i8);
                    if (z2) {
                        arrayList = m61070a;
                    } else {
                        ArrayList arrayList2 = new ArrayList(m61070a.size());
                        int size5 = m61070a.size();
                        for (int i79 = 0; i79 < size5; i79++) {
                            Object obj2 = m61070a.get(i79);
                            MeasuredPage measuredPage5 = (MeasuredPage) obj2;
                            if (measuredPage5.getIndex() >= ((MeasuredPage) arrayDeque10.first()).getIndex() && measuredPage5.getIndex() <= ((MeasuredPage) arrayDeque10.last()).getIndex()) {
                                arrayList2.add(obj2);
                            }
                        }
                        arrayList = arrayList2;
                    }
                    int i80 = orientation == Orientation.Vertical ? m73823constrainHeightK40F9xA : m73824constrainWidthK40F9xA;
                    if (arrayList.isEmpty()) {
                        obj = null;
                    } else {
                        Object obj3 = arrayList.get(0);
                        MeasuredPage measuredPage6 = (MeasuredPage) obj3;
                        float f3 = -Math.abs(SnapPositionInLayoutKt.calculateDistanceToDesiredSnapPosition(measurePager, i80, i3, i4, i8, measuredPage6.getOffset(), measuredPage6.getIndex(), PagerStateKt.getSnapAlignmentStartToStart()));
                        int lastIndex = CollectionsKt__CollectionsKt.getLastIndex(arrayList);
                        if (1 <= lastIndex) {
                            Object obj4 = obj3;
                            int i81 = 1;
                            float f4 = f3;
                            while (true) {
                                Object obj5 = arrayList.get(i81);
                                MeasuredPage measuredPage7 = (MeasuredPage) obj5;
                                int i82 = i81;
                                float f5 = -Math.abs(SnapPositionInLayoutKt.calculateDistanceToDesiredSnapPosition(measurePager, i80, i3, i4, i8, measuredPage7.getOffset(), measuredPage7.getIndex(), PagerStateKt.getSnapAlignmentStartToStart()));
                                if (Float.compare(f4, f5) < 0) {
                                    f4 = f5;
                                    obj4 = obj5;
                                }
                                if (i82 == lastIndex) {
                                    break;
                                }
                                i81 = i82 + 1;
                            }
                            obj = obj4;
                        } else {
                            obj = obj3;
                        }
                    }
                    return new PagerMeasureResult(arrayList, i, i8, i5, i4, orientation, i31, i18, z, f2, measuredPage4, (MeasuredPage) obj, i26, i78 < i16 || i73 > i2, layout.invoke(Integer.valueOf(m73824constrainWidthK40F9xA), Integer.valueOf(m73823constrainHeightK40F9xA), new PagerMeasureKt$measurePager$6(m61070a)));
                }
                throw new IllegalArgumentException("Failed requirement.".toString());
            }
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        throw new IllegalArgumentException("Failed requirement.".toString());
    }
}