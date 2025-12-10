package androidx.compose.foundation.lazy;

import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.layout.Arrangement;
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
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.AbstractC11719c;
import kotlin.ranges.IntProgression;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(m28851d1 = {"\u0000p\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0011\u001aî\u0001\u0010'\u001a\u00020$2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u00002\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00000\u00102\b\u0010\u0013\u001a\u0004\u0018\u00010\u00122\b\u0010\u0015\u001a\u0004\u0018\u00010\u00142\u0006\u0010\u0016\u001a\u00020\u000e2\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001b\u001a\u00020\u00002\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00000\u00102/\u0010#\u001a+\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u0000\u0012\u0015\u0012\u0013\u0012\u0004\u0012\u00020\u001f\u0012\u0004\u0012\u00020 0\u001e¢\u0006\u0002\b!\u0012\u0004\u0012\u00020\"0\u001dH\u0000ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b%\u0010&\u001aI\u0010+\u001a\b\u0012\u0004\u0012\u00020)0\u00102\f\u0010*\u001a\b\u0012\u0004\u0012\u00020)0(2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u001b\u001a\u00020\u00002\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00000\u0010H\u0002¢\u0006\u0004\b+\u0010,\u001a;\u0010.\u001a\b\u0012\u0004\u0012\u00020)0\u00102\u0006\u0010-\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u001b\u001a\u00020\u00002\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00000\u0010H\u0002¢\u0006\u0004\b.\u0010/\u001a\u0093\u0001\u00108\u001a\b\u0012\u0004\u0012\u00020)0(2\f\u00100\u001a\b\u0012\u0004\u0012\u00020)0\u00102\f\u00101\u001a\b\u0012\u0004\u0012\u00020)0\u00102\f\u00102\u001a\b\u0012\u0004\u0012\u00020)0\u00102\u0006\u00103\u001a\u00020\u00002\u0006\u00104\u001a\u00020\u00002\u0006\u00105\u001a\u00020\u00002\u0006\u00106\u001a\u00020\u00002\u0006\u00107\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0013\u001a\u0004\u0018\u00010\u00122\b\u0010\u0015\u001a\u0004\u0018\u00010\u00142\u0006\u0010\u0016\u001a\u00020\u000e2\u0006\u0010\u0018\u001a\u00020\u0017H\u0002¢\u0006\u0004\b8\u00109\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006:"}, m28850d2 = {"", "itemsCount", "Landroidx/compose/foundation/lazy/LazyListMeasuredItemProvider;", "measuredItemProvider", "mainAxisAvailableSize", "beforeContentPadding", "afterContentPadding", "spaceBetweenItems", "firstVisibleItemIndex", "firstVisibleItemScrollOffset", "", "scrollToBeConsumed", "Landroidx/compose/ui/unit/Constraints;", "constraints", "", "isVertical", "", "headerIndexes", "Landroidx/compose/foundation/layout/Arrangement$Vertical;", "verticalArrangement", "Landroidx/compose/foundation/layout/Arrangement$Horizontal;", "horizontalArrangement", "reverseLayout", "Landroidx/compose/ui/unit/Density;", "density", "Landroidx/compose/foundation/lazy/LazyListItemPlacementAnimator;", "placementAnimator", "beyondBoundsItemCount", "pinnedItems", "Lkotlin/Function3;", "Lkotlin/Function1;", "Landroidx/compose/ui/layout/Placeable$PlacementScope;", "", "Lkotlin/ExtensionFunctionType;", "Landroidx/compose/ui/layout/MeasureResult;", "layout", "Landroidx/compose/foundation/lazy/LazyListMeasureResult;", "measureLazyList-CD5nmq0", "(ILandroidx/compose/foundation/lazy/LazyListMeasuredItemProvider;IIIIIIFJZLjava/util/List;Landroidx/compose/foundation/layout/Arrangement$Vertical;Landroidx/compose/foundation/layout/Arrangement$Horizontal;ZLandroidx/compose/ui/unit/Density;Landroidx/compose/foundation/lazy/LazyListItemPlacementAnimator;ILjava/util/List;Lkotlin/jvm/functions/Function3;)Landroidx/compose/foundation/lazy/LazyListMeasureResult;", "measureLazyList", "", "Landroidx/compose/foundation/lazy/LazyListMeasuredItem;", "visibleItems", OperatorName.CURVE_TO, "(Ljava/util/List;Landroidx/compose/foundation/lazy/LazyListMeasuredItemProvider;IILjava/util/List;)Ljava/util/List;", "currentFirstItemIndex", "d", "(ILandroidx/compose/foundation/lazy/LazyListMeasuredItemProvider;ILjava/util/List;)Ljava/util/List;", FirebaseAnalytics.Param.ITEMS, "extraItemsBefore", "extraItemsAfter", "layoutWidth", "layoutHeight", "finalMainAxisOffset", "maxOffset", "itemsScrollOffset", PDPageLabelRange.STYLE_LETTERS_LOWER, "(Ljava/util/List;Ljava/util/List;Ljava/util/List;IIIIIZLandroidx/compose/foundation/layout/Arrangement$Vertical;Landroidx/compose/foundation/layout/Arrangement$Horizontal;ZLandroidx/compose/ui/unit/Density;)Ljava/util/List;", "foundation_release"}, m28849k = 2, m28848mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nLazyListMeasure.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyListMeasure.kt\nandroidx/compose/foundation/lazy/LazyListMeasureKt\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n+ 3 TempListUtils.kt\nandroidx/compose/foundation/TempListUtilsKt\n*L\n1#1,476:1\n33#2,6:477\n33#2,6:483\n33#2,6:489\n33#2,4:498\n38#2:504\n33#2,6:506\n33#2,6:512\n33#2,6:518\n33#2,6:524\n33#2,6:530\n36#3,3:495\n39#3,2:502\n41#3:505\n*S KotlinDebug\n*F\n+ 1 LazyListMeasure.kt\nandroidx/compose/foundation/lazy/LazyListMeasureKt\n*L\n146#1:477,6\n240#1:483,6\n254#1:489,6\n321#1:498,4\n321#1:504\n352#1:506,6\n379#1:512,6\n455#1:518,6\n462#1:524,6\n468#1:530,6\n321#1:495,3\n321#1:502,2\n321#1:505\n*E\n"})
/* loaded from: classes.dex */
public final class LazyListMeasureKt {
    /* renamed from: a */
    public static final List m61287a(List list, List list2, List list3, int i, int i2, int i3, int i4, int i5, boolean z, Arrangement.Vertical vertical, Arrangement.Horizontal horizontal, boolean z2, Density density) {
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
        ArrayList arrayList = new ArrayList(list.size() + list2.size() + list3.size());
        if (z3) {
            if (list2.isEmpty() && list3.isEmpty()) {
                int size = list.size();
                int[] iArr = new int[size];
                for (int i7 = 0; i7 < size; i7++) {
                    iArr[i7] = ((LazyListMeasuredItem) list.get(m61286b(i7, z2, size))).getSize();
                }
                int[] iArr2 = new int[size];
                for (int i8 = 0; i8 < size; i8++) {
                    iArr2[i8] = 0;
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
                    indices = AbstractC11719c.reversed(indices);
                }
                int first = indices.getFirst();
                int last = indices.getLast();
                int step = indices.getStep();
                if ((step > 0 && first <= last) || (step < 0 && last <= first)) {
                    while (true) {
                        int i9 = iArr2[first];
                        LazyListMeasuredItem lazyListMeasuredItem = (LazyListMeasuredItem) list.get(m61286b(first, z2, size));
                        if (z2) {
                            i9 = (i6 - i9) - lazyListMeasuredItem.getSize();
                        }
                        lazyListMeasuredItem.position(i9, i, i2);
                        arrayList.add(lazyListMeasuredItem);
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
            int i10 = i5;
            for (int i11 = 0; i11 < size2; i11++) {
                LazyListMeasuredItem lazyListMeasuredItem2 = (LazyListMeasuredItem) list2.get(i11);
                i10 -= lazyListMeasuredItem2.getSizeWithSpacings();
                lazyListMeasuredItem2.position(i10, i, i2);
                arrayList.add(lazyListMeasuredItem2);
            }
            int size3 = list.size();
            int i12 = i5;
            for (int i13 = 0; i13 < size3; i13++) {
                LazyListMeasuredItem lazyListMeasuredItem3 = (LazyListMeasuredItem) list.get(i13);
                lazyListMeasuredItem3.position(i12, i, i2);
                arrayList.add(lazyListMeasuredItem3);
                i12 += lazyListMeasuredItem3.getSizeWithSpacings();
            }
            int size4 = list3.size();
            for (int i14 = 0; i14 < size4; i14++) {
                LazyListMeasuredItem lazyListMeasuredItem4 = (LazyListMeasuredItem) list3.get(i14);
                lazyListMeasuredItem4.position(i12, i, i2);
                arrayList.add(lazyListMeasuredItem4);
                i12 += lazyListMeasuredItem4.getSizeWithSpacings();
            }
        }
        return arrayList;
    }

    /* renamed from: b */
    public static final int m61286b(int i, boolean z, int i2) {
        return !z ? i : (i2 - i) - 1;
    }

    /* renamed from: c */
    public static final List m61285c(List list, LazyListMeasuredItemProvider lazyListMeasuredItemProvider, int i, int i2, List list2) {
        int min = Math.min(((LazyListMeasuredItem) CollectionsKt___CollectionsKt.last((List<? extends Object>) list)).getIndex() + i2, i - 1);
        int index = ((LazyListMeasuredItem) CollectionsKt___CollectionsKt.last((List<? extends Object>) list)).getIndex() + 1;
        ArrayList arrayList = null;
        if (index <= min) {
            while (true) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(lazyListMeasuredItemProvider.getAndMeasure(index));
                if (index == min) {
                    break;
                }
                index++;
            }
        }
        int size = list2.size();
        for (int i3 = 0; i3 < size; i3++) {
            int intValue = ((Number) list2.get(i3)).intValue();
            if (intValue > min) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(lazyListMeasuredItemProvider.getAndMeasure(intValue));
            }
        }
        if (arrayList == null) {
            return CollectionsKt__CollectionsKt.emptyList();
        }
        return arrayList;
    }

    /* renamed from: d */
    public static final List m61284d(int i, LazyListMeasuredItemProvider lazyListMeasuredItemProvider, int i2, List list) {
        int max = Math.max(0, i - i2);
        int i3 = i - 1;
        ArrayList arrayList = null;
        if (max <= i3) {
            while (true) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(lazyListMeasuredItemProvider.getAndMeasure(i3));
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
                arrayList.add(lazyListMeasuredItemProvider.getAndMeasure(intValue));
            }
        }
        if (arrayList == null) {
            return CollectionsKt__CollectionsKt.emptyList();
        }
        return arrayList;
    }

    @NotNull
    /* renamed from: measureLazyList-CD5nmq0  reason: not valid java name */
    public static final LazyListMeasureResult m69602measureLazyListCD5nmq0(int i, @NotNull LazyListMeasuredItemProvider measuredItemProvider, int i2, int i3, int i4, int i5, int i6, int i7, float f, long j, boolean z, @NotNull List<Integer> headerIndexes, @Nullable Arrangement.Vertical vertical, @Nullable Arrangement.Horizontal horizontal, boolean z2, @NotNull Density density, @NotNull LazyListItemPlacementAnimator placementAnimator, int i8, @NotNull List<Integer> pinnedItems, @NotNull Function3<? super Integer, ? super Integer, ? super Function1<? super Placeable.PlacementScope, Unit>, ? extends MeasureResult> layout) {
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        LazyListMeasuredItem lazyListMeasuredItem;
        int i16;
        LazyListMeasuredItem lazyListMeasuredItem2;
        ArrayList arrayList;
        int i17;
        int i18;
        Intrinsics.checkNotNullParameter(measuredItemProvider, "measuredItemProvider");
        Intrinsics.checkNotNullParameter(headerIndexes, "headerIndexes");
        Intrinsics.checkNotNullParameter(density, "density");
        Intrinsics.checkNotNullParameter(placementAnimator, "placementAnimator");
        Intrinsics.checkNotNullParameter(pinnedItems, "pinnedItems");
        Intrinsics.checkNotNullParameter(layout, "layout");
        if (i3 >= 0) {
            if (i4 >= 0) {
                if (i <= 0) {
                    return new LazyListMeasureResult(null, 0, false, 0.0f, layout.invoke(Integer.valueOf(Constraints.m73628getMinWidthimpl(j)), Integer.valueOf(Constraints.m73627getMinHeightimpl(j)), LazyListMeasureKt$measureLazyList$1.INSTANCE), CollectionsKt__CollectionsKt.emptyList(), -i3, i2 + i4, 0, z2, z ? Orientation.Vertical : Orientation.Horizontal, i4, i5);
                }
                int i19 = i6;
                if (i19 >= i) {
                    i19 = i - 1;
                    i9 = 0;
                } else {
                    i9 = i7;
                }
                int roundToInt = AbstractC21140mr0.roundToInt(f);
                int i20 = i9 - roundToInt;
                if (i19 == 0 && i20 < 0) {
                    roundToInt += i20;
                    i20 = 0;
                }
                ArrayDeque arrayDeque = new ArrayDeque();
                int i21 = -i3;
                int i22 = i21 + (i5 < 0 ? i5 : 0);
                int i23 = i20 + i22;
                int i24 = 0;
                while (i23 < 0 && i19 > 0) {
                    int i25 = i19 - 1;
                    LazyListMeasuredItem andMeasure = measuredItemProvider.getAndMeasure(i25);
                    arrayDeque.add(0, andMeasure);
                    i24 = Math.max(i24, andMeasure.getCrossAxisSize());
                    i23 += andMeasure.getSizeWithSpacings();
                    i19 = i25;
                }
                if (i23 < i22) {
                    roundToInt += i23;
                    i23 = i22;
                }
                int i26 = i23 - i22;
                int i27 = i2 + i4;
                int i28 = i24;
                int i29 = i19;
                int coerceAtLeast = AbstractC11719c.coerceAtLeast(i27, 0);
                int i30 = -i26;
                int size = arrayDeque.size();
                int i31 = i29;
                int i32 = i26;
                for (int i33 = 0; i33 < size; i33++) {
                    i31++;
                    i30 += ((LazyListMeasuredItem) arrayDeque.get(i33)).getSizeWithSpacings();
                }
                int i34 = i28;
                int i35 = i30;
                int i36 = i31;
                while (i36 < i && (i35 < coerceAtLeast || i35 <= 0 || arrayDeque.isEmpty())) {
                    int i37 = coerceAtLeast;
                    LazyListMeasuredItem andMeasure2 = measuredItemProvider.getAndMeasure(i36);
                    i35 += andMeasure2.getSizeWithSpacings();
                    if (i35 <= i22) {
                        i17 = i22;
                        if (i36 != i - 1) {
                            i18 = i36 + 1;
                            i32 -= andMeasure2.getSizeWithSpacings();
                            i36++;
                            i29 = i18;
                            coerceAtLeast = i37;
                            i22 = i17;
                        }
                    } else {
                        i17 = i22;
                    }
                    int max = Math.max(i34, andMeasure2.getCrossAxisSize());
                    arrayDeque.add(andMeasure2);
                    i34 = max;
                    i18 = i29;
                    i36++;
                    i29 = i18;
                    coerceAtLeast = i37;
                    i22 = i17;
                }
                if (i35 < i2) {
                    int i38 = i2 - i35;
                    int i39 = i35 + i38;
                    int i40 = i29;
                    i14 = i32 - i38;
                    while (i14 < i3 && i40 > 0) {
                        int i41 = i27;
                        int i42 = i40 - 1;
                        int i43 = i36;
                        LazyListMeasuredItem andMeasure3 = measuredItemProvider.getAndMeasure(i42);
                        arrayDeque.add(0, andMeasure3);
                        i34 = Math.max(i34, andMeasure3.getCrossAxisSize());
                        i14 += andMeasure3.getSizeWithSpacings();
                        i40 = i42;
                        i27 = i41;
                        i36 = i43;
                    }
                    i10 = i27;
                    i11 = i36;
                    int i44 = roundToInt + i38;
                    if (i14 < 0) {
                        i12 = i39 + i14;
                        i13 = i44 + i14;
                        i15 = i40;
                        i14 = 0;
                    } else {
                        i12 = i39;
                        i13 = i44;
                        i15 = i40;
                    }
                } else {
                    i10 = i27;
                    i11 = i36;
                    i12 = i35;
                    i13 = roundToInt;
                    i14 = i32;
                    i15 = i29;
                }
                int i45 = i34;
                float f2 = (AbstractC21140mr0.getSign(AbstractC21140mr0.roundToInt(f)) != AbstractC21140mr0.getSign(i13) || Math.abs(AbstractC21140mr0.roundToInt(f)) < Math.abs(i13)) ? f : i13;
                if (i14 >= 0) {
                    int i46 = -i14;
                    LazyListMeasuredItem lazyListMeasuredItem3 = (LazyListMeasuredItem) arrayDeque.first();
                    if (i3 > 0 || i5 < 0) {
                        int size2 = arrayDeque.size();
                        int i47 = i14;
                        int i48 = 0;
                        while (true) {
                            if (i48 >= size2) {
                                lazyListMeasuredItem = lazyListMeasuredItem3;
                                break;
                            }
                            lazyListMeasuredItem = lazyListMeasuredItem3;
                            int sizeWithSpacings = ((LazyListMeasuredItem) arrayDeque.get(i48)).getSizeWithSpacings();
                            if (i47 == 0 || sizeWithSpacings > i47) {
                                break;
                            }
                            int i49 = size2;
                            if (i48 == CollectionsKt__CollectionsKt.getLastIndex(arrayDeque)) {
                                break;
                            }
                            i47 -= sizeWithSpacings;
                            i48++;
                            lazyListMeasuredItem3 = (LazyListMeasuredItem) arrayDeque.get(i48);
                            size2 = i49;
                        }
                        i16 = i47;
                        lazyListMeasuredItem2 = lazyListMeasuredItem;
                    } else {
                        lazyListMeasuredItem2 = lazyListMeasuredItem3;
                        i16 = i14;
                    }
                    List m61284d = m61284d(i15, measuredItemProvider, i8, pinnedItems);
                    int i50 = i45;
                    int i51 = 0;
                    for (int size3 = m61284d.size(); i51 < size3; size3 = size3) {
                        i50 = Math.max(i50, ((LazyListMeasuredItem) m61284d.get(i51)).getCrossAxisSize());
                        i51++;
                    }
                    List m61285c = m61285c(arrayDeque, measuredItemProvider, i, i8, pinnedItems);
                    int size4 = m61285c.size();
                    for (int i52 = 0; i52 < size4; i52++) {
                        i50 = Math.max(i50, ((LazyListMeasuredItem) m61285c.get(i52)).getCrossAxisSize());
                    }
                    boolean z3 = Intrinsics.areEqual(lazyListMeasuredItem2, arrayDeque.first()) && m61284d.isEmpty() && m61285c.isEmpty();
                    int m73640constrainWidthK40F9xA = ConstraintsKt.m73640constrainWidthK40F9xA(j, z ? i50 : i12);
                    if (z) {
                        i50 = i12;
                    }
                    int m73639constrainHeightK40F9xA = ConstraintsKt.m73639constrainHeightK40F9xA(j, i50);
                    int i53 = i10;
                    int i54 = i11;
                    List<LazyListMeasuredItem> m61287a = m61287a(arrayDeque, m61284d, m61285c, m73640constrainWidthK40F9xA, m73639constrainHeightK40F9xA, i12, i2, i46, z, vertical, horizontal, z2, density);
                    int i55 = i12;
                    float f3 = f2;
                    LazyListMeasuredItem lazyListMeasuredItem4 = lazyListMeasuredItem2;
                    placementAnimator.onMeasured((int) f2, m73640constrainWidthK40F9xA, m73639constrainHeightK40F9xA, m61287a, measuredItemProvider, z);
                    LazyListMeasuredItem findOrComposeLazyListHeader = headerIndexes.isEmpty() ^ true ? LazyListHeadersKt.findOrComposeLazyListHeader(m61287a, measuredItemProvider, headerIndexes, i3, m73640constrainWidthK40F9xA, m73639constrainHeightK40F9xA) : null;
                    boolean z4 = i54 < i || i55 > i2;
                    MeasureResult invoke = layout.invoke(Integer.valueOf(m73640constrainWidthK40F9xA), Integer.valueOf(m73639constrainHeightK40F9xA), new LazyListMeasureKt$measureLazyList$5(m61287a, findOrComposeLazyListHeader));
                    if (z3) {
                        arrayList = m61287a;
                    } else {
                        ArrayList arrayList2 = new ArrayList(m61287a.size());
                        int size5 = m61287a.size();
                        for (int i56 = 0; i56 < size5; i56++) {
                            LazyListMeasuredItem lazyListMeasuredItem5 = m61287a.get(i56);
                            LazyListMeasuredItem lazyListMeasuredItem6 = lazyListMeasuredItem5;
                            if ((lazyListMeasuredItem6.getIndex() >= ((LazyListMeasuredItem) arrayDeque.first()).getIndex() && lazyListMeasuredItem6.getIndex() <= ((LazyListMeasuredItem) arrayDeque.last()).getIndex()) || lazyListMeasuredItem6 == findOrComposeLazyListHeader) {
                                arrayList2.add(lazyListMeasuredItem5);
                            }
                        }
                        arrayList = arrayList2;
                    }
                    return new LazyListMeasureResult(lazyListMeasuredItem4, i16, z4, f3, invoke, arrayList, i21, i53, i, z2, z ? Orientation.Vertical : Orientation.Horizontal, i4, i5);
                }
                throw new IllegalArgumentException("Failed requirement.".toString());
            }
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        throw new IllegalArgumentException("Failed requirement.".toString());
    }
}
