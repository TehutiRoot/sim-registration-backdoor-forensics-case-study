package androidx.compose.foundation.lazy.staggeredgrid;

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
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.AbstractC11719c;
import org.bouncycastle.asn1.cmc.BodyPartID;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(m28851d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\b \u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ#\u0010\u0013\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0011\u0010\u0012JG\u0010\u001a\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u0014\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\f2\u0006\u0010\u0015\u001a\u00020\u00012\b\u0010\u0016\u001a\u0004\u0018\u00010\u00012\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00180\u0017H&¢\u0006\u0004\b\u001a\u0010\u001bJ(\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u001c\u001a\u00020\f2\u0006\u0010\u001d\u001a\u00020\fH\u0002ø\u0001\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u001f\u0010 R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010!R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'R\u0011\u0010+\u001a\u00020(8F¢\u0006\u0006\u001a\u0004\b)\u0010*\u0082\u0002\u000f\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019\n\u0002\b!¨\u0006,"}, m28850d2 = {"Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureProvider;", "", "", "isVertical", "Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridItemProvider;", "itemProvider", "Landroidx/compose/foundation/lazy/layout/LazyLayoutMeasureScope;", "measureScope", "Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridSlots;", "resolvedSlots", "<init>", "(ZLandroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridItemProvider;Landroidx/compose/foundation/lazy/layout/LazyLayoutMeasureScope;Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridSlots;)V", "", FirebaseAnalytics.Param.INDEX, "Landroidx/compose/foundation/lazy/staggeredgrid/SpanRange;", "span", "Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasuredItem;", "getAndMeasure-jy6DScQ", "(IJ)Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasuredItem;", "getAndMeasure", "lane", Action.KEY_ATTRIBUTE, "contentType", "", "Landroidx/compose/ui/layout/Placeable;", "placeables", "createItem", "(IIILjava/lang/Object;Ljava/lang/Object;Ljava/util/List;)Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasuredItem;", "requestedSlot", "requestedSpan", "Landroidx/compose/ui/unit/Constraints;", PDPageLabelRange.STYLE_LETTERS_LOWER, "(II)J", "Z", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridItemProvider;", OperatorName.CURVE_TO, "Landroidx/compose/foundation/lazy/layout/LazyLayoutMeasureScope;", "d", "Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridSlots;", "Landroidx/compose/foundation/lazy/layout/LazyLayoutKeyIndexMap;", "getKeyIndexMap", "()Landroidx/compose/foundation/lazy/layout/LazyLayoutKeyIndexMap;", "keyIndexMap", "foundation_release"}, m28849k = 1, m28848mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nLazyStaggeredGridMeasure.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyStaggeredGridMeasure.kt\nandroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureProvider\n+ 2 LazyStaggeredGridMeasure.kt\nandroidx/compose/foundation/lazy/staggeredgrid/SpanRange\n+ 3 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n*L\n1#1,1158:1\n906#2:1159\n908#2:1161\n907#2:1162\n906#2:1164\n908#2:1166\n907#2:1167\n906#2:1169\n55#3:1160\n62#3:1163\n55#3:1165\n62#3:1168\n55#3:1170\n*S KotlinDebug\n*F\n+ 1 LazyStaggeredGridMeasure.kt\nandroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureProvider\n*L\n1031#1:1159\n1031#1:1161\n1031#1:1162\n1034#1:1164\n1035#1:1166\n1035#1:1167\n1035#1:1169\n1031#1:1160\n1031#1:1163\n1034#1:1165\n1035#1:1168\n1035#1:1170\n*E\n"})
/* loaded from: classes.dex */
public abstract class LazyStaggeredGridMeasureProvider {

    /* renamed from: a */
    public final boolean f13743a;

    /* renamed from: b */
    public final LazyStaggeredGridItemProvider f13744b;

    /* renamed from: c */
    public final LazyLayoutMeasureScope f13745c;

    /* renamed from: d */
    public final LazyStaggeredGridSlots f13746d;

    public LazyStaggeredGridMeasureProvider(boolean z, @NotNull LazyStaggeredGridItemProvider itemProvider, @NotNull LazyLayoutMeasureScope measureScope, @NotNull LazyStaggeredGridSlots resolvedSlots) {
        Intrinsics.checkNotNullParameter(itemProvider, "itemProvider");
        Intrinsics.checkNotNullParameter(measureScope, "measureScope");
        Intrinsics.checkNotNullParameter(resolvedSlots, "resolvedSlots");
        this.f13743a = z;
        this.f13744b = itemProvider;
        this.f13745c = measureScope;
        this.f13746d = resolvedSlots;
    }

    /* renamed from: a */
    public final long m61145a(int i, int i2) {
        int i3;
        int length = this.f13746d.getSizes().length;
        int coerceAtMost = AbstractC11719c.coerceAtMost(i, length - 1);
        int coerceAtMost2 = AbstractC11719c.coerceAtMost(i2, length - coerceAtMost);
        if (coerceAtMost2 == 1) {
            i3 = this.f13746d.getSizes()[coerceAtMost];
        } else {
            int i4 = this.f13746d.getPositions()[coerceAtMost];
            int i5 = (coerceAtMost + coerceAtMost2) - 1;
            i3 = (this.f13746d.getPositions()[i5] + this.f13746d.getSizes()[i5]) - i4;
        }
        if (this.f13743a) {
            return Constraints.Companion.m73636fixedWidthOenEA2s(i3);
        }
        return Constraints.Companion.m73635fixedHeightOenEA2s(i3);
    }

    @NotNull
    public abstract LazyStaggeredGridMeasuredItem createItem(int i, int i2, int i3, @NotNull Object obj, @Nullable Object obj2, @NotNull List<? extends Placeable> list);

    @NotNull
    /* renamed from: getAndMeasure-jy6DScQ  reason: not valid java name */
    public final LazyStaggeredGridMeasuredItem m69661getAndMeasurejy6DScQ(int i, long j) {
        Object key = this.f13744b.getKey(i);
        Object contentType = this.f13744b.getContentType(i);
        LazyLayoutMeasureScope lazyLayoutMeasureScope = this.f13745c;
        int i2 = (int) (j >> 32);
        int i3 = ((int) (j & BodyPartID.bodyIdMax)) - i2;
        return createItem(i, i2, i3, key, contentType, lazyLayoutMeasureScope.mo69642measure0kLqBqw(i, m61145a(i2, i3)));
    }

    @NotNull
    public final LazyLayoutKeyIndexMap getKeyIndexMap() {
        return this.f13744b.getKeyIndexMap();
    }
}
