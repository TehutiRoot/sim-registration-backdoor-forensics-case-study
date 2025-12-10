package androidx.compose.foundation.lazy.grid;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.AbstractC11719c;
import org.jetbrains.annotations.NotNull;

@Metadata(m28851d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b!\b\u0000\u0018\u00002\u00020\u0001BF\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000e\u001a\u00020\u0002ø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\u0010J\r\u0010\u0011\u001a\u00020\f¢\u0006\u0004\b\u0011\u0010\u0012J+\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0013\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u0002¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u001d\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0002X\u0082\u0004ø\u0001\u0000¢\u0006\u0006\n\u0004\b\"\u0010#R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u0014\u0010\u000e\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010\u0019R\u0017\u0010)\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b'\u0010\u0019\u001a\u0004\b(\u0010\u001bR\u0017\u0010,\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b*\u0010\u0019\u001a\u0004\b+\u0010\u001b\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006-"}, m28850d2 = {"Landroidx/compose/foundation/lazy/grid/LazyGridMeasuredLine;", "", "", FirebaseAnalytics.Param.INDEX, "", "Landroidx/compose/foundation/lazy/grid/LazyGridMeasuredItem;", FirebaseAnalytics.Param.ITEMS, "Landroidx/compose/foundation/lazy/grid/LazyGridSlots;", "slots", "", "Landroidx/compose/foundation/lazy/grid/GridItemSpan;", "spans", "", "isVertical", "mainAxisSpacing", "<init>", "(I[Landroidx/compose/foundation/lazy/grid/LazyGridMeasuredItem;Landroidx/compose/foundation/lazy/grid/LazyGridSlots;Ljava/util/List;ZI)V", "isEmpty", "()Z", TypedValues.CycleType.S_WAVE_OFFSET, "layoutWidth", "layoutHeight", "position", "(III)[Landroidx/compose/foundation/lazy/grid/LazyGridMeasuredItem;", PDPageLabelRange.STYLE_LETTERS_LOWER, "I", "getIndex", "()I", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "[Landroidx/compose/foundation/lazy/grid/LazyGridMeasuredItem;", "getItems", "()[Landroidx/compose/foundation/lazy/grid/LazyGridMeasuredItem;", OperatorName.CURVE_TO, "Landroidx/compose/foundation/lazy/grid/LazyGridSlots;", "d", "Ljava/util/List;", "e", "Z", OperatorName.FILL_NON_ZERO, OperatorName.NON_STROKING_GRAY, "getMainAxisSize", "mainAxisSize", OperatorName.CLOSE_PATH, "getMainAxisSizeWithSpacings", "mainAxisSizeWithSpacings", "foundation_release"}, m28849k = 1, m28848mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nLazyGridMeasuredLine.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyGridMeasuredLine.kt\nandroidx/compose/foundation/lazy/grid/LazyGridMeasuredLine\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,89:1\n13579#2,2:90\n13644#2,3:92\n*S KotlinDebug\n*F\n+ 1 LazyGridMeasuredLine.kt\nandroidx/compose/foundation/lazy/grid/LazyGridMeasuredLine\n*L\n49#1:90,2\n71#1:92,3\n*E\n"})
/* loaded from: classes.dex */
public final class LazyGridMeasuredLine {

    /* renamed from: a */
    public final int f13537a;

    /* renamed from: b */
    public final LazyGridMeasuredItem[] f13538b;

    /* renamed from: c */
    public final LazyGridSlots f13539c;

    /* renamed from: d */
    public final List f13540d;

    /* renamed from: e */
    public final boolean f13541e;

    /* renamed from: f */
    public final int f13542f;

    /* renamed from: g */
    public final int f13543g;

    /* renamed from: h */
    public final int f13544h;

    public LazyGridMeasuredLine(int i, @NotNull LazyGridMeasuredItem[] items, @NotNull LazyGridSlots slots, @NotNull List<GridItemSpan> spans, boolean z, int i2) {
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(slots, "slots");
        Intrinsics.checkNotNullParameter(spans, "spans");
        this.f13537a = i;
        this.f13538b = items;
        this.f13539c = slots;
        this.f13540d = spans;
        this.f13541e = z;
        this.f13542f = i2;
        int i3 = 0;
        for (LazyGridMeasuredItem lazyGridMeasuredItem : items) {
            i3 = Math.max(i3, lazyGridMeasuredItem.getMainAxisSize());
        }
        this.f13543g = i3;
        this.f13544h = AbstractC11719c.coerceAtLeast(i3 + this.f13542f, 0);
    }

    public final int getIndex() {
        return this.f13537a;
    }

    @NotNull
    public final LazyGridMeasuredItem[] getItems() {
        return this.f13538b;
    }

    public final int getMainAxisSize() {
        return this.f13543g;
    }

    public final int getMainAxisSizeWithSpacings() {
        return this.f13544h;
    }

    public final boolean isEmpty() {
        if (this.f13538b.length == 0) {
            return true;
        }
        return false;
    }

    @NotNull
    public final LazyGridMeasuredItem[] position(int i, int i2, int i3) {
        int i4;
        int i5;
        LazyGridMeasuredItem[] lazyGridMeasuredItemArr = this.f13538b;
        int length = lazyGridMeasuredItemArr.length;
        int i6 = 0;
        int i7 = 0;
        int i8 = 0;
        while (i6 < length) {
            LazyGridMeasuredItem lazyGridMeasuredItem = lazyGridMeasuredItemArr[i6];
            int i9 = i7 + 1;
            int m69611getCurrentLineSpanimpl = GridItemSpan.m69611getCurrentLineSpanimpl(((GridItemSpan) this.f13540d.get(i7)).m69614unboximpl());
            int i10 = this.f13539c.getPositions()[i8];
            boolean z = this.f13541e;
            if (z) {
                i4 = this.f13537a;
            } else {
                i4 = i8;
            }
            if (z) {
                i5 = i8;
            } else {
                i5 = this.f13537a;
            }
            lazyGridMeasuredItem.position(i, i10, i2, i3, i4, i5);
            Unit unit = Unit.INSTANCE;
            i8 += m69611getCurrentLineSpanimpl;
            i6++;
            i7 = i9;
        }
        return this.f13538b;
    }
}
