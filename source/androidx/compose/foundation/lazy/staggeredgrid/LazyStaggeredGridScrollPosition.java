package androidx.compose.foundation.lazy.staggeredgrid;

import androidx.compose.foundation.ExperimentalFoundationApi;
import androidx.compose.foundation.lazy.layout.LazyLayoutItemProvider;
import androidx.compose.foundation.lazy.layout.LazyLayoutItemProviderKt;
import androidx.compose.foundation.lazy.layout.LazyLayoutNearestRangeState;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotMutationPolicy;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.snapshots.Snapshot;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import java.util.Arrays;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.IntRange;
import org.jetbrains.annotations.NotNull;

@ExperimentalFoundationApi
@Metadata(m28851d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0015\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u000f\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001BO\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u00126\u0010\u000b\u001a2\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\t\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\n\u0012\u0004\u0012\u00020\u00020\u0005¢\u0006\u0004\b\f\u0010\rJ\u0015\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0011\u0010\u0012J\u001d\u0010\u0015\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u00062\u0006\u0010\u0014\u001a\u00020\u0006¢\u0006\u0004\b\u0015\u0010\u0016J\u001f\u0010\u001a\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u001a\u0010\u001bJ\u001f\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u001c\u001a\u00020\u00022\u0006\u0010\u001d\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u001f\u0010 J\u001f\u0010\"\u001a\u00020\u00102\u0006\u0010\u0019\u001a\u00020\u00022\u0006\u0010!\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\"\u0010#RD\u0010\u000b\u001a2\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\t\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\n\u0012\u0004\u0012\u00020\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010$R+\u0010\u0019\u001a\u00020\u00022\u0006\u0010%\u001a\u00020\u00028F@BX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u001d\u0010&\u001a\u0004\b'\u0010(\"\u0004\b\u001c\u0010)R+\u0010!\u001a\u00020\u00022\u0006\u0010%\u001a\u00020\u00028F@BX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\"\u0010&\u001a\u0004\b*\u0010(\"\u0004\b\u001d\u0010)R\u0016\u0010-\u001a\u00020\u001e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b+\u0010,R\u0018\u00101\u001a\u0004\u0018\u00010.8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b/\u00100R\u0017\u00107\u001a\u0002028\u0006¢\u0006\f\n\u0004\b3\u00104\u001a\u0004\b5\u00106¨\u00068"}, m28850d2 = {"Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridScrollPosition;", "Landroidx/compose/runtime/SnapshotMutationPolicy;", "", "initialIndices", "initialOffsets", "Lkotlin/Function2;", "", "Lkotlin/ParameterName;", "name", "targetIndex", "laneCount", "fillIndices", "<init>", "([I[ILkotlin/jvm/functions/Function2;)V", "Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureResult;", "measureResult", "", "updateFromMeasureResult", "(Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureResult;)V", FirebaseAnalytics.Param.INDEX, "scrollOffset", "requestPosition", "(II)V", "Landroidx/compose/foundation/lazy/layout/LazyLayoutItemProvider;", "itemProvider", "indices", "updateScrollPositionIfTheFirstItemWasMoved", "(Landroidx/compose/foundation/lazy/layout/LazyLayoutItemProvider;[I)[I", PDPageLabelRange.STYLE_LETTERS_LOWER, OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "", "equivalent", "([I[I)Z", "offsets", OperatorName.CURVE_TO, "([I[I)V", "Lkotlin/jvm/functions/Function2;", "<set-?>", "Landroidx/compose/runtime/MutableState;", "getIndices", "()[I", "([I)V", "getOffsets", "d", "Z", "hadFirstNotEmptyLayout", "", "e", "Ljava/lang/Object;", "lastKnownFirstItemKey", "Landroidx/compose/foundation/lazy/layout/LazyLayoutNearestRangeState;", OperatorName.FILL_NON_ZERO, "Landroidx/compose/foundation/lazy/layout/LazyLayoutNearestRangeState;", "getNearestRangeState", "()Landroidx/compose/foundation/lazy/layout/LazyLayoutNearestRangeState;", "nearestRangeState", "foundation_release"}, m28849k = 1, m28848mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nLazyStaggeredGridScrollPosition.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyStaggeredGridScrollPosition.kt\nandroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridScrollPosition\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 3 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 5 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n+ 6 Snapshot.kt\nandroidx/compose/runtime/snapshots/Snapshot$Companion\n+ 7 Snapshot.kt\nandroidx/compose/runtime/snapshots/Snapshot\n*L\n1#1,143:1\n81#2:144\n107#2,2:145\n81#2:147\n107#2,2:148\n16594#3,14:150\n1#4:164\n116#5,2:165\n33#5,6:167\n118#5:173\n495#6,4:174\n500#6:183\n129#7,5:178\n*S KotlinDebug\n*F\n+ 1 LazyStaggeredGridScrollPosition.kt\nandroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridScrollPosition\n*L\n36#1:144\n36#1:145,2\n38#1:147\n38#1:148,2\n57#1:150,14\n61#1:165,2\n61#1:167,6\n61#1:173\n69#1:174,4\n69#1:183\n69#1:178,5\n*E\n"})
/* loaded from: classes.dex */
public final class LazyStaggeredGridScrollPosition implements SnapshotMutationPolicy<int[]> {

    /* renamed from: a */
    public final Function2 f13781a;

    /* renamed from: b */
    public final MutableState f13782b;

    /* renamed from: c */
    public final MutableState f13783c;

    /* renamed from: d */
    public boolean f13784d;

    /* renamed from: e */
    public Object f13785e;

    /* renamed from: f */
    public final LazyLayoutNearestRangeState f13786f;

    public LazyStaggeredGridScrollPosition(@NotNull int[] initialIndices, @NotNull int[] initialOffsets, @NotNull Function2<? super Integer, ? super Integer, int[]> fillIndices) {
        int i;
        Intrinsics.checkNotNullParameter(initialIndices, "initialIndices");
        Intrinsics.checkNotNullParameter(initialOffsets, "initialOffsets");
        Intrinsics.checkNotNullParameter(fillIndices, "fillIndices");
        this.f13781a = fillIndices;
        this.f13782b = SnapshotStateKt.mutableStateOf(initialIndices, this);
        this.f13783c = SnapshotStateKt.mutableStateOf(initialOffsets, this);
        Integer minOrNull = ArraysKt___ArraysKt.minOrNull(initialIndices);
        if (minOrNull != null) {
            i = minOrNull.intValue();
        } else {
            i = 0;
        }
        this.f13786f = new LazyLayoutNearestRangeState(i, 90, 200);
    }

    /* renamed from: a */
    public final void m61141a(int[] iArr) {
        this.f13782b.setValue(iArr);
    }

    /* renamed from: b */
    public final void m61140b(int[] iArr) {
        this.f13783c.setValue(iArr);
    }

    /* renamed from: c */
    public final void m61139c(int[] iArr, int[] iArr2) {
        m61141a(iArr);
        m61140b(iArr2);
    }

    @NotNull
    public final int[] getIndices() {
        return (int[]) this.f13782b.getValue();
    }

    @NotNull
    public final LazyLayoutNearestRangeState getNearestRangeState() {
        return this.f13786f;
    }

    @NotNull
    public final int[] getOffsets() {
        return (int[]) this.f13783c.getValue();
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, int[]] */
    @Override // androidx.compose.runtime.SnapshotMutationPolicy
    public /* synthetic */ int[] merge(int[] iArr, int[] iArr2, int[] iArr3) {
        return AbstractC18986aK1.m65109a(this, iArr, iArr2, iArr3);
    }

    public final void requestPosition(int i, int i2) {
        int[] iArr = (int[]) this.f13781a.invoke(Integer.valueOf(i), Integer.valueOf(getIndices().length));
        int length = iArr.length;
        int[] iArr2 = new int[length];
        for (int i3 = 0; i3 < length; i3++) {
            iArr2[i3] = i2;
        }
        m61139c(iArr, iArr2);
        this.f13786f.update(i);
        this.f13785e = null;
    }

    /* JADX WARN: Type inference failed for: r4v2, types: [kotlin.collections.IntIterator, java.util.Iterator] */
    public final void updateFromMeasureResult(@NotNull LazyStaggeredGridMeasureResult measureResult) {
        Object obj;
        LazyStaggeredGridItemInfo lazyStaggeredGridItemInfo;
        int i;
        int i2;
        Intrinsics.checkNotNullParameter(measureResult, "measureResult");
        int[] firstVisibleItemIndices = measureResult.getFirstVisibleItemIndices();
        if (firstVisibleItemIndices.length != 0) {
            int i3 = 0;
            int i4 = firstVisibleItemIndices[0];
            int lastIndex = ArraysKt___ArraysKt.getLastIndex(firstVisibleItemIndices);
            if (lastIndex != 0) {
                if (i4 == -1) {
                    i = Integer.MAX_VALUE;
                } else {
                    i = i4;
                }
                ?? it = new IntRange(1, lastIndex).iterator();
                while (it.hasNext()) {
                    int i5 = firstVisibleItemIndices[it.nextInt()];
                    if (i5 == -1) {
                        i2 = Integer.MAX_VALUE;
                    } else {
                        i2 = i5;
                    }
                    if (i > i2) {
                        i4 = i5;
                        i = i2;
                    }
                }
            }
            if (i4 == Integer.MAX_VALUE) {
                i4 = 0;
            }
            List<LazyStaggeredGridItemInfo> visibleItemsInfo = measureResult.getVisibleItemsInfo();
            int size = visibleItemsInfo.size();
            while (true) {
                obj = null;
                if (i3 < size) {
                    lazyStaggeredGridItemInfo = visibleItemsInfo.get(i3);
                    if (lazyStaggeredGridItemInfo.getIndex() == i4) {
                        break;
                    }
                    i3++;
                } else {
                    lazyStaggeredGridItemInfo = null;
                    break;
                }
            }
            LazyStaggeredGridItemInfo lazyStaggeredGridItemInfo2 = lazyStaggeredGridItemInfo;
            if (lazyStaggeredGridItemInfo2 != null) {
                obj = lazyStaggeredGridItemInfo2.getKey();
            }
            this.f13785e = obj;
            this.f13786f.update(i4);
            if (this.f13784d || measureResult.getTotalItemsCount() > 0) {
                this.f13784d = true;
                Snapshot createNonObservableSnapshot = Snapshot.Companion.createNonObservableSnapshot();
                try {
                    Snapshot makeCurrent = createNonObservableSnapshot.makeCurrent();
                    m61139c(measureResult.getFirstVisibleItemIndices(), measureResult.getFirstVisibleItemScrollOffsets());
                    Unit unit = Unit.INSTANCE;
                    createNonObservableSnapshot.restoreCurrent(makeCurrent);
                    return;
                } finally {
                    createNonObservableSnapshot.dispose();
                }
            }
            return;
        }
        throw new NoSuchElementException();
    }

    @ExperimentalFoundationApi
    @NotNull
    public final int[] updateScrollPositionIfTheFirstItemWasMoved(@NotNull LazyLayoutItemProvider itemProvider, @NotNull int[] indices) {
        Intrinsics.checkNotNullParameter(itemProvider, "itemProvider");
        Intrinsics.checkNotNullParameter(indices, "indices");
        Object obj = this.f13785e;
        int i = 0;
        Integer orNull = ArraysKt___ArraysKt.getOrNull(indices, 0);
        if (orNull != null) {
            i = orNull.intValue();
        }
        int findIndexByKey = LazyLayoutItemProviderKt.findIndexByKey(itemProvider, obj, i);
        if (!ArraysKt___ArraysKt.contains(indices, findIndexByKey)) {
            this.f13786f.update(findIndexByKey);
            int[] iArr = (int[]) this.f13781a.invoke(Integer.valueOf(findIndexByKey), Integer.valueOf(indices.length));
            m61141a(iArr);
            return iArr;
        }
        return indices;
    }

    @Override // androidx.compose.runtime.SnapshotMutationPolicy
    public boolean equivalent(@NotNull int[] a, @NotNull int[] b) {
        Intrinsics.checkNotNullParameter(a, "a");
        Intrinsics.checkNotNullParameter(b, "b");
        return Arrays.equals(a, b);
    }
}
