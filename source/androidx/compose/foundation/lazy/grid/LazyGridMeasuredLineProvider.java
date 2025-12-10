package androidx.compose.foundation.lazy.grid;

import androidx.compose.foundation.lazy.grid.LazyGridSpanLayoutProvider;
import androidx.compose.foundation.lazy.layout.LazyLayoutKeyIndexMap;
import androidx.compose.p003ui.unit.Constraints;
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

@Metadata(m28851d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0004\b \u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ(\u0010\u0014\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u0006H\u0000ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u001e\u0010\u0018\u001a\u00020\u00112\u0006\u0010\u0015\u001a\u00020\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u0015\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0019\u001a\u00020\u0006¢\u0006\u0004\b\u001b\u0010\u001cJ>\u0010%\u001a\u00020\u001a2\u0006\u0010\u001d\u001a\u00020\u00062\f\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001f0\u001e2\f\u0010#\u001a\b\u0012\u0004\u0012\u00020\"0!2\u0006\u0010$\u001a\u00020\u0006H&ø\u0001\u0002¢\u0006\u0004\b%\u0010&R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010*R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010,R\u0014\u0010\b\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010,R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010/R\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u00101R\u0011\u00105\u001a\u0002028F¢\u0006\u0006\u001a\u0004\b3\u00104\u0082\u0002\u000f\n\u0002\b!\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u00066"}, m28850d2 = {"Landroidx/compose/foundation/lazy/grid/LazyGridMeasuredLineProvider;", "", "", "isVertical", "Landroidx/compose/foundation/lazy/grid/LazyGridSlots;", "slots", "", "gridItemsCount", "spaceBetweenLines", "Landroidx/compose/foundation/lazy/grid/LazyGridMeasuredItemProvider;", "measuredItemProvider", "Landroidx/compose/foundation/lazy/grid/LazyGridSpanLayoutProvider;", "spanLayoutProvider", "<init>", "(ZLandroidx/compose/foundation/lazy/grid/LazyGridSlots;IILandroidx/compose/foundation/lazy/grid/LazyGridMeasuredItemProvider;Landroidx/compose/foundation/lazy/grid/LazyGridSpanLayoutProvider;)V", "startSlot", "span", "Landroidx/compose/ui/unit/Constraints;", "childConstraints-JhjzzOo$foundation_release", "(II)J", "childConstraints", "itemIndex", "itemConstraints-OenEA2s", "(I)J", "itemConstraints", "lineIndex", "Landroidx/compose/foundation/lazy/grid/LazyGridMeasuredLine;", "getAndMeasure", "(I)Landroidx/compose/foundation/lazy/grid/LazyGridMeasuredLine;", FirebaseAnalytics.Param.INDEX, "", "Landroidx/compose/foundation/lazy/grid/LazyGridMeasuredItem;", FirebaseAnalytics.Param.ITEMS, "", "Landroidx/compose/foundation/lazy/grid/GridItemSpan;", "spans", "mainAxisSpacing", "createLine", "(I[Landroidx/compose/foundation/lazy/grid/LazyGridMeasuredItem;Ljava/util/List;I)Landroidx/compose/foundation/lazy/grid/LazyGridMeasuredLine;", PDPageLabelRange.STYLE_LETTERS_LOWER, "Z", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "Landroidx/compose/foundation/lazy/grid/LazyGridSlots;", OperatorName.CURVE_TO, "I", "d", "e", "Landroidx/compose/foundation/lazy/grid/LazyGridMeasuredItemProvider;", OperatorName.FILL_NON_ZERO, "Landroidx/compose/foundation/lazy/grid/LazyGridSpanLayoutProvider;", "Landroidx/compose/foundation/lazy/layout/LazyLayoutKeyIndexMap;", "getKeyIndexMap", "()Landroidx/compose/foundation/lazy/layout/LazyLayoutKeyIndexMap;", "keyIndexMap", "foundation_release"}, m28849k = 1, m28848mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nLazyGridMeasuredLineProvider.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyGridMeasuredLineProvider.kt\nandroidx/compose/foundation/lazy/grid/LazyGridMeasuredLineProvider\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,107:1\n1#2:108\n*E\n"})
/* loaded from: classes.dex */
public abstract class LazyGridMeasuredLineProvider {

    /* renamed from: a */
    public final boolean f13545a;

    /* renamed from: b */
    public final LazyGridSlots f13546b;

    /* renamed from: c */
    public final int f13547c;

    /* renamed from: d */
    public final int f13548d;

    /* renamed from: e */
    public final LazyGridMeasuredItemProvider f13549e;

    /* renamed from: f */
    public final LazyGridSpanLayoutProvider f13550f;

    public LazyGridMeasuredLineProvider(boolean z, @NotNull LazyGridSlots slots, int i, int i2, @NotNull LazyGridMeasuredItemProvider measuredItemProvider, @NotNull LazyGridSpanLayoutProvider spanLayoutProvider) {
        Intrinsics.checkNotNullParameter(slots, "slots");
        Intrinsics.checkNotNullParameter(measuredItemProvider, "measuredItemProvider");
        Intrinsics.checkNotNullParameter(spanLayoutProvider, "spanLayoutProvider");
        this.f13545a = z;
        this.f13546b = slots;
        this.f13547c = i;
        this.f13548d = i2;
        this.f13549e = measuredItemProvider;
        this.f13550f = spanLayoutProvider;
    }

    /* renamed from: childConstraints-JhjzzOo$foundation_release  reason: not valid java name */
    public final long m69630childConstraintsJhjzzOo$foundation_release(int i, int i2) {
        int i3;
        if (i2 == 1) {
            i3 = this.f13546b.getSizes()[i];
        } else {
            int i4 = (i2 + i) - 1;
            i3 = (this.f13546b.getPositions()[i4] + this.f13546b.getSizes()[i4]) - this.f13546b.getPositions()[i];
        }
        int coerceAtLeast = AbstractC11719c.coerceAtLeast(i3, 0);
        if (this.f13545a) {
            return Constraints.Companion.m73636fixedWidthOenEA2s(coerceAtLeast);
        }
        return Constraints.Companion.m73635fixedHeightOenEA2s(coerceAtLeast);
    }

    @NotNull
    public abstract LazyGridMeasuredLine createLine(int i, @NotNull LazyGridMeasuredItem[] lazyGridMeasuredItemArr, @NotNull List<GridItemSpan> list, int i2);

    @NotNull
    public final LazyGridMeasuredLine getAndMeasure(int i) {
        int i2;
        LazyGridSpanLayoutProvider.LineConfiguration lineConfiguration = this.f13550f.getLineConfiguration(i);
        int size = lineConfiguration.getSpans().size();
        if (size != 0 && lineConfiguration.getFirstItemIndex() + size != this.f13547c) {
            i2 = this.f13548d;
        } else {
            i2 = 0;
        }
        LazyGridMeasuredItem[] lazyGridMeasuredItemArr = new LazyGridMeasuredItem[size];
        int i3 = 0;
        for (int i4 = 0; i4 < size; i4++) {
            int m69611getCurrentLineSpanimpl = GridItemSpan.m69611getCurrentLineSpanimpl(lineConfiguration.getSpans().get(i4).m69614unboximpl());
            LazyGridMeasuredItem m69629getAndMeasure3p2s80s = this.f13549e.m69629getAndMeasure3p2s80s(lineConfiguration.getFirstItemIndex() + i4, i2, m69630childConstraintsJhjzzOo$foundation_release(i3, m69611getCurrentLineSpanimpl));
            i3 += m69611getCurrentLineSpanimpl;
            Unit unit = Unit.INSTANCE;
            lazyGridMeasuredItemArr[i4] = m69629getAndMeasure3p2s80s;
        }
        return createLine(i, lazyGridMeasuredItemArr, lineConfiguration.getSpans(), i2);
    }

    @NotNull
    public final LazyLayoutKeyIndexMap getKeyIndexMap() {
        return this.f13549e.getKeyIndexMap();
    }

    /* renamed from: itemConstraints-OenEA2s  reason: not valid java name */
    public final long m69631itemConstraintsOenEA2s(int i) {
        LazyGridSpanLayoutProvider lazyGridSpanLayoutProvider = this.f13550f;
        return m69630childConstraintsJhjzzOo$foundation_release(0, lazyGridSpanLayoutProvider.spanOf(i, lazyGridSpanLayoutProvider.getSlotsPerLine()));
    }
}
