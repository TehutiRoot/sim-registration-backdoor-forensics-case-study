package androidx.compose.foundation.lazy.grid;

import androidx.compose.foundation.ExperimentalFoundationApi;
import androidx.compose.foundation.lazy.layout.LazyLayoutKeyIndexMap;
import androidx.compose.foundation.lazy.layout.LazyLayoutMeasureScope;
import androidx.compose.p003ui.layout.Placeable;
import androidx.compose.p003ui.unit.Constraints;
import ch.qos.logback.core.joran.action.Action;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(m28851d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\b \u0018\u00002\u00020\u0001B!\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ-\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\n\u001a\u00020\u00062\b\b\u0002\u0010\u000b\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\fø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u000f\u0010\u0010JG\u0010\u0018\u001a\u00020\u000e2\u0006\u0010\n\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u00012\b\u0010\u0013\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0014\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\u00062\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00160\u0015H&¢\u0006\u0004\b\u0018\u0010\u0019R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0011\u0010#\u001a\u00020 8F¢\u0006\u0006\u001a\u0004\b!\u0010\"\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006$"}, m28850d2 = {"Landroidx/compose/foundation/lazy/grid/LazyGridMeasuredItemProvider;", "", "Landroidx/compose/foundation/lazy/grid/LazyGridItemProvider;", "itemProvider", "Landroidx/compose/foundation/lazy/layout/LazyLayoutMeasureScope;", "measureScope", "", "defaultMainAxisSpacing", "<init>", "(Landroidx/compose/foundation/lazy/grid/LazyGridItemProvider;Landroidx/compose/foundation/lazy/layout/LazyLayoutMeasureScope;I)V", FirebaseAnalytics.Param.INDEX, "mainAxisSpacing", "Landroidx/compose/ui/unit/Constraints;", "constraints", "Landroidx/compose/foundation/lazy/grid/LazyGridMeasuredItem;", "getAndMeasure-3p2s80s", "(IIJ)Landroidx/compose/foundation/lazy/grid/LazyGridMeasuredItem;", "getAndMeasure", Action.KEY_ATTRIBUTE, "contentType", "crossAxisSize", "", "Landroidx/compose/ui/layout/Placeable;", "placeables", "createItem", "(ILjava/lang/Object;Ljava/lang/Object;IILjava/util/List;)Landroidx/compose/foundation/lazy/grid/LazyGridMeasuredItem;", PDPageLabelRange.STYLE_LETTERS_LOWER, "Landroidx/compose/foundation/lazy/grid/LazyGridItemProvider;", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "Landroidx/compose/foundation/lazy/layout/LazyLayoutMeasureScope;", OperatorName.CURVE_TO, "I", "Landroidx/compose/foundation/lazy/layout/LazyLayoutKeyIndexMap;", "getKeyIndexMap", "()Landroidx/compose/foundation/lazy/layout/LazyLayoutKeyIndexMap;", "keyIndexMap", "foundation_release"}, m28849k = 1, m28848mv = {1, 8, 0})
/* loaded from: classes.dex */
public abstract class LazyGridMeasuredItemProvider {

    /* renamed from: a */
    public final LazyGridItemProvider f13534a;

    /* renamed from: b */
    public final LazyLayoutMeasureScope f13535b;

    /* renamed from: c */
    public final int f13536c;

    @ExperimentalFoundationApi
    public LazyGridMeasuredItemProvider(@NotNull LazyGridItemProvider itemProvider, @NotNull LazyLayoutMeasureScope measureScope, int i) {
        Intrinsics.checkNotNullParameter(itemProvider, "itemProvider");
        Intrinsics.checkNotNullParameter(measureScope, "measureScope");
        this.f13534a = itemProvider;
        this.f13535b = measureScope;
        this.f13536c = i;
    }

    /* renamed from: getAndMeasure-3p2s80s$default  reason: not valid java name */
    public static /* synthetic */ LazyGridMeasuredItem m69628getAndMeasure3p2s80s$default(LazyGridMeasuredItemProvider lazyGridMeasuredItemProvider, int i, int i2, long j, int i3, Object obj) {
        if (obj == null) {
            if ((i3 & 2) != 0) {
                i2 = lazyGridMeasuredItemProvider.f13536c;
            }
            return lazyGridMeasuredItemProvider.m69629getAndMeasure3p2s80s(i, i2, j);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getAndMeasure-3p2s80s");
    }

    @NotNull
    public abstract LazyGridMeasuredItem createItem(int i, @NotNull Object obj, @Nullable Object obj2, int i2, int i3, @NotNull List<? extends Placeable> list);

    @NotNull
    /* renamed from: getAndMeasure-3p2s80s  reason: not valid java name */
    public final LazyGridMeasuredItem m69629getAndMeasure3p2s80s(int i, int i2, long j) {
        int m73627getMinHeightimpl;
        Object key = this.f13534a.getKey(i);
        Object contentType = this.f13534a.getContentType(i);
        List<Placeable> mo69642measure0kLqBqw = this.f13535b.mo69642measure0kLqBqw(i, j);
        if (Constraints.m73624getHasFixedWidthimpl(j)) {
            m73627getMinHeightimpl = Constraints.m73628getMinWidthimpl(j);
        } else if (Constraints.m73623getHasFixedHeightimpl(j)) {
            m73627getMinHeightimpl = Constraints.m73627getMinHeightimpl(j);
        } else {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        return createItem(i, key, contentType, m73627getMinHeightimpl, i2, mo69642measure0kLqBqw);
    }

    @NotNull
    public final LazyLayoutKeyIndexMap getKeyIndexMap() {
        return this.f13534a.getKeyIndexMap();
    }
}
