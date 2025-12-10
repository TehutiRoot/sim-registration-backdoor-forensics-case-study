package androidx.compose.foundation.lazy;

import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(m28851d1 = {"\u0000 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\b\n\u0002\b\u0004\u001aF\u0010\u0000\u001a\u0004\u0018\u00010\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00032\u0006\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\bH\u0000¨\u0006\f"}, m28850d2 = {"findOrComposeLazyListHeader", "Landroidx/compose/foundation/lazy/LazyListMeasuredItem;", "composedVisibleItems", "", "itemProvider", "Landroidx/compose/foundation/lazy/LazyListMeasuredItemProvider;", "headerIndexes", "", "", "beforeContentPadding", "layoutWidth", "layoutHeight", "foundation_release"}, m28849k = 2, m28848mv = {1, 8, 0}, m28846xi = 48)
@SourceDebugExtension({"SMAP\nLazyListHeaders.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyListHeaders.kt\nandroidx/compose/foundation/lazy/LazyListHeadersKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,94:1\n1#2:95\n69#3,6:96\n*S KotlinDebug\n*F\n+ 1 LazyListHeaders.kt\nandroidx/compose/foundation/lazy/LazyListHeadersKt\n*L\n57#1:96,6\n*E\n"})
/* loaded from: classes.dex */
public final class LazyListHeadersKt {
    @Nullable
    public static final LazyListMeasuredItem findOrComposeLazyListHeader(@NotNull List<LazyListMeasuredItem> composedVisibleItems, @NotNull LazyListMeasuredItemProvider itemProvider, @NotNull List<Integer> headerIndexes, int i, int i2, int i3) {
        int i4;
        int i5;
        Intrinsics.checkNotNullParameter(composedVisibleItems, "composedVisibleItems");
        Intrinsics.checkNotNullParameter(itemProvider, "itemProvider");
        Intrinsics.checkNotNullParameter(headerIndexes, "headerIndexes");
        int index = ((LazyListMeasuredItem) CollectionsKt___CollectionsKt.first((List<? extends Object>) composedVisibleItems)).getIndex();
        int size = headerIndexes.size();
        int i6 = 0;
        int i7 = -1;
        int i8 = -1;
        while (i6 < size && headerIndexes.get(i6).intValue() <= index) {
            i7 = headerIndexes.get(i6).intValue();
            i6++;
            if (i6 >= 0 && i6 <= CollectionsKt__CollectionsKt.getLastIndex(headerIndexes)) {
                i5 = headerIndexes.get(i6);
            } else {
                i5 = -1;
            }
            i8 = i5.intValue();
        }
        int size2 = composedVisibleItems.size();
        int i9 = Integer.MIN_VALUE;
        int i10 = Integer.MIN_VALUE;
        int i11 = -1;
        for (int i12 = 0; i12 < size2; i12++) {
            LazyListMeasuredItem lazyListMeasuredItem = composedVisibleItems.get(i12);
            if (lazyListMeasuredItem.getIndex() == i7) {
                i9 = lazyListMeasuredItem.getOffset();
                i11 = i12;
            } else if (lazyListMeasuredItem.getIndex() == i8) {
                i10 = lazyListMeasuredItem.getOffset();
            }
        }
        if (i7 == -1) {
            return null;
        }
        LazyListMeasuredItem andMeasure = itemProvider.getAndMeasure(i7);
        if (i9 != Integer.MIN_VALUE) {
            i4 = Math.max(-i, i9);
        } else {
            i4 = -i;
        }
        if (i10 != Integer.MIN_VALUE) {
            i4 = Math.min(i4, i10 - andMeasure.getSize());
        }
        andMeasure.position(i4, i2, i3);
        if (i11 != -1) {
            composedVisibleItems.set(i11, andMeasure);
        } else {
            composedVisibleItems.add(0, andMeasure);
        }
        return andMeasure;
    }
}
