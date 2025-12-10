package androidx.compose.foundation.lazy.grid;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.p003ui.unit.Density;
import androidx.compose.p003ui.unit.LayoutDirection;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.AbstractC11695c;
import kotlin.ranges.IntProgression;

@Metadata(m29143d1 = {"\u0000\u0084\u0001\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010!\n\u0002\b\u0003\u001aè\u0001\u0010)\u001a\u00020&2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\u00002\u0006\u0010\u000b\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u00102\b\u0010\u0013\u001a\u0004\u0018\u00010\u00122\b\u0010\u0015\u001a\u0004\u0018\u00010\u00142\u0006\u0010\u0016\u001a\u00020\u00102\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001c\u001a\u00020\u001b2\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00000\u001d2/\u0010%\u001a+\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u0000\u0012\u0015\u0012\u0013\u0012\u0004\u0012\u00020!\u0012\u0004\u0012\u00020\"0 ¢\u0006\u0002\b#\u0012\u0004\u0012\u00020$0\u001fH\u0000ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b'\u0010(\u001a\u0093\u0001\u00105\u001a\b\u0012\u0004\u0012\u00020,042\f\u0010+\u001a\b\u0012\u0004\u0012\u00020*0\u001d2\f\u0010-\u001a\b\u0012\u0004\u0012\u00020,0\u001d2\f\u0010.\u001a\b\u0012\u0004\u0012\u00020,0\u001d2\u0006\u0010/\u001a\u00020\u00002\u0006\u00100\u001a\u00020\u00002\u0006\u00101\u001a\u00020\u00002\u0006\u00102\u001a\u00020\u00002\u0006\u00103\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u00102\b\u0010\u0013\u001a\u0004\u0018\u00010\u00122\b\u0010\u0015\u001a\u0004\u0018\u00010\u00142\u0006\u0010\u0016\u001a\u00020\u00102\u0006\u0010\u0018\u001a\u00020\u0017H\u0002¢\u0006\u0004\b5\u00106\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u00067"}, m29142d2 = {"", "itemsCount", "Landroidx/compose/foundation/lazy/grid/LazyGridMeasuredLineProvider;", "measuredLineProvider", "Landroidx/compose/foundation/lazy/grid/LazyGridMeasuredItemProvider;", "measuredItemProvider", "mainAxisAvailableSize", "beforeContentPadding", "afterContentPadding", "spaceBetweenLines", "firstVisibleLineIndex", "firstVisibleLineScrollOffset", "", "scrollToBeConsumed", "Landroidx/compose/ui/unit/Constraints;", "constraints", "", "isVertical", "Landroidx/compose/foundation/layout/Arrangement$Vertical;", "verticalArrangement", "Landroidx/compose/foundation/layout/Arrangement$Horizontal;", "horizontalArrangement", "reverseLayout", "Landroidx/compose/ui/unit/Density;", "density", "Landroidx/compose/foundation/lazy/grid/LazyGridItemPlacementAnimator;", "placementAnimator", "Landroidx/compose/foundation/lazy/grid/LazyGridSpanLayoutProvider;", "spanLayoutProvider", "", "pinnedItems", "Lkotlin/Function3;", "Lkotlin/Function1;", "Landroidx/compose/ui/layout/Placeable$PlacementScope;", "", "Lkotlin/ExtensionFunctionType;", "Landroidx/compose/ui/layout/MeasureResult;", "layout", "Landroidx/compose/foundation/lazy/grid/LazyGridMeasureResult;", "measureLazyGrid-ZRKPzZ8", "(ILandroidx/compose/foundation/lazy/grid/LazyGridMeasuredLineProvider;Landroidx/compose/foundation/lazy/grid/LazyGridMeasuredItemProvider;IIIIIIFJZLandroidx/compose/foundation/layout/Arrangement$Vertical;Landroidx/compose/foundation/layout/Arrangement$Horizontal;ZLandroidx/compose/ui/unit/Density;Landroidx/compose/foundation/lazy/grid/LazyGridItemPlacementAnimator;Landroidx/compose/foundation/lazy/grid/LazyGridSpanLayoutProvider;Ljava/util/List;Lkotlin/jvm/functions/Function3;)Landroidx/compose/foundation/lazy/grid/LazyGridMeasureResult;", "measureLazyGrid", "Landroidx/compose/foundation/lazy/grid/LazyGridMeasuredLine;", "lines", "Landroidx/compose/foundation/lazy/grid/LazyGridMeasuredItem;", "itemsBefore", "itemsAfter", "layoutWidth", "layoutHeight", "finalMainAxisOffset", "maxOffset", "firstLineScrollOffset", "", PDPageLabelRange.STYLE_LETTERS_LOWER, "(Ljava/util/List;Ljava/util/List;Ljava/util/List;IIIIIZLandroidx/compose/foundation/layout/Arrangement$Vertical;Landroidx/compose/foundation/layout/Arrangement$Horizontal;ZLandroidx/compose/ui/unit/Density;)Ljava/util/List;", "foundation_release"}, m29141k = 2, m29140mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nLazyGridMeasure.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyGridMeasure.kt\nandroidx/compose/foundation/lazy/grid/LazyGridMeasureKt\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n+ 3 TempListUtils.kt\nandroidx/compose/foundation/TempListUtilsKt\n*L\n1#1,416:1\n310#1,3:423\n313#1,12:430\n326#1:443\n310#1,3:444\n313#1,12:451\n326#1:464\n33#2,6:417\n33#2,4:426\n38#2:442\n33#2,4:447\n38#2:463\n33#2,4:468\n38#2:474\n33#2,6:476\n132#2,3:482\n33#2,4:485\n135#2,2:489\n38#2:491\n137#2:492\n33#2,6:493\n33#2,6:499\n33#2,6:505\n36#3,3:465\n39#3,2:472\n41#3:475\n*S KotlinDebug\n*F\n+ 1 LazyGridMeasure.kt\nandroidx/compose/foundation/lazy/grid/LazyGridMeasureKt\n*L\n210#1:423,3\n210#1:430,12\n210#1:443\n217#1:444,3\n217#1:451,12\n217#1:464\n138#1:417,6\n210#1:426,4\n210#1:442\n217#1:447,4\n217#1:463\n290#1:468,4\n290#1:474\n312#1:476,6\n353#1:482,3\n353#1:485,4\n353#1:489,2\n353#1:491\n353#1:492\n396#1:493,6\n403#1:499,6\n408#1:505,6\n290#1:465,3\n290#1:472,2\n290#1:475\n*E\n"})
/* loaded from: classes.dex */
public final class LazyGridMeasureKt {
    /* renamed from: a */
    public static final List m61190a(List list, List list2, List list3, int i, int i2, int i3, int i4, int i5, boolean z, Arrangement.Vertical vertical, Arrangement.Horizontal horizontal, boolean z2, Density density) {
        int i6;
        boolean z3;
        if (z) {
            i6 = i2;
        } else {
            i6 = i;
        }
        if (i3 < Math.min(i6, i4)) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (z3 && i5 != 0) {
            throw new IllegalStateException("Check failed.".toString());
        }
        int size = list.size();
        int i7 = 0;
        for (int i8 = 0; i8 < size; i8++) {
            i7 += ((LazyGridMeasuredLine) list.get(i8)).getItems().length;
        }
        ArrayList arrayList = new ArrayList(i7);
        if (z3) {
            if (list2.isEmpty() && list3.isEmpty()) {
                int size2 = list.size();
                int[] iArr = new int[size2];
                for (int i9 = 0; i9 < size2; i9++) {
                    iArr[i9] = ((LazyGridMeasuredLine) list.get(m61189b(i9, z2, size2))).getMainAxisSize();
                }
                int[] iArr2 = new int[size2];
                for (int i10 = 0; i10 < size2; i10++) {
                    iArr2[i10] = 0;
                }
                if (z) {
                    if (vertical != null) {
                        vertical.arrange(density, i6, iArr, iArr2);
                    } else {
                        throw new IllegalArgumentException("Required value was null.".toString());
                    }
                } else if (horizontal != null) {
                    horizontal.arrange(density, i6, iArr, LayoutDirection.Ltr, iArr2);
                } else {
                    throw new IllegalArgumentException("Required value was null.".toString());
                }
                IntProgression indices = ArraysKt___ArraysKt.getIndices(iArr2);
                if (z2) {
                    indices = AbstractC11695c.reversed(indices);
                }
                int first = indices.getFirst();
                int last = indices.getLast();
                int step = indices.getStep();
                if ((step > 0 && first <= last) || (step < 0 && last <= first)) {
                    while (true) {
                        int i11 = iArr2[first];
                        LazyGridMeasuredLine lazyGridMeasuredLine = (LazyGridMeasuredLine) list.get(m61189b(first, z2, size2));
                        if (z2) {
                            i11 = (i6 - i11) - lazyGridMeasuredLine.getMainAxisSize();
                        }
                        AbstractC10396hs.addAll(arrayList, lazyGridMeasuredLine.position(i11, i, i2));
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
            int size3 = list2.size();
            int i12 = i5;
            int i13 = 0;
            while (i13 < size3) {
                LazyGridMeasuredItem lazyGridMeasuredItem = (LazyGridMeasuredItem) list2.get(i13);
                int mainAxisSizeWithSpacings = i12 - lazyGridMeasuredItem.getMainAxisSizeWithSpacings();
                LazyGridMeasuredItem.position$default(lazyGridMeasuredItem, mainAxisSizeWithSpacings, 0, i, i2, 0, 0, 48, null);
                arrayList.add(lazyGridMeasuredItem);
                i13++;
                i12 = mainAxisSizeWithSpacings;
            }
            int size4 = list.size();
            int i14 = i5;
            for (int i15 = 0; i15 < size4; i15++) {
                LazyGridMeasuredLine lazyGridMeasuredLine2 = (LazyGridMeasuredLine) list.get(i15);
                AbstractC10396hs.addAll(arrayList, lazyGridMeasuredLine2.position(i14, i, i2));
                i14 += lazyGridMeasuredLine2.getMainAxisSizeWithSpacings();
            }
            int i16 = i14;
            int i17 = 0;
            for (int size5 = list3.size(); i17 < size5; size5 = size5) {
                LazyGridMeasuredItem lazyGridMeasuredItem2 = (LazyGridMeasuredItem) list3.get(i17);
                LazyGridMeasuredItem.position$default(lazyGridMeasuredItem2, i16, 0, i, i2, 0, 0, 48, null);
                arrayList.add(lazyGridMeasuredItem2);
                i16 += lazyGridMeasuredItem2.getMainAxisSizeWithSpacings();
                i17++;
            }
        }
        return arrayList;
    }

    /* renamed from: b */
    public static final int m61189b(int i, boolean z, int i2) {
        return !z ? i : (i2 - i) - 1;
    }

    /* JADX WARN: Removed duplicated region for block: B:151:0x03b5  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0195  */
    @org.jetbrains.annotations.NotNull
    /* renamed from: measureLazyGrid-ZRKPzZ8  reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final androidx.compose.foundation.lazy.grid.LazyGridMeasureResult m69811measureLazyGridZRKPzZ8(int r34, @org.jetbrains.annotations.NotNull androidx.compose.foundation.lazy.grid.LazyGridMeasuredLineProvider r35, @org.jetbrains.annotations.NotNull androidx.compose.foundation.lazy.grid.LazyGridMeasuredItemProvider r36, int r37, int r38, int r39, int r40, int r41, int r42, float r43, long r44, boolean r46, @org.jetbrains.annotations.Nullable androidx.compose.foundation.layout.Arrangement.Vertical r47, @org.jetbrains.annotations.Nullable androidx.compose.foundation.layout.Arrangement.Horizontal r48, boolean r49, @org.jetbrains.annotations.NotNull androidx.compose.p003ui.unit.Density r50, @org.jetbrains.annotations.NotNull androidx.compose.foundation.lazy.grid.LazyGridItemPlacementAnimator r51, @org.jetbrains.annotations.NotNull androidx.compose.foundation.lazy.grid.LazyGridSpanLayoutProvider r52, @org.jetbrains.annotations.NotNull java.util.List<java.lang.Integer> r53, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function3<? super java.lang.Integer, ? super java.lang.Integer, ? super kotlin.jvm.functions.Function1<? super androidx.compose.p003ui.layout.Placeable.PlacementScope, kotlin.Unit>, ? extends androidx.compose.p003ui.layout.MeasureResult> r54) {
        /*
            Method dump skipped, instructions count: 979
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.lazy.grid.LazyGridMeasureKt.m69811measureLazyGridZRKPzZ8(int, androidx.compose.foundation.lazy.grid.LazyGridMeasuredLineProvider, androidx.compose.foundation.lazy.grid.LazyGridMeasuredItemProvider, int, int, int, int, int, int, float, long, boolean, androidx.compose.foundation.layout.Arrangement$Vertical, androidx.compose.foundation.layout.Arrangement$Horizontal, boolean, androidx.compose.ui.unit.Density, androidx.compose.foundation.lazy.grid.LazyGridItemPlacementAnimator, androidx.compose.foundation.lazy.grid.LazyGridSpanLayoutProvider, java.util.List, kotlin.jvm.functions.Function3):androidx.compose.foundation.lazy.grid.LazyGridMeasureResult");
    }
}