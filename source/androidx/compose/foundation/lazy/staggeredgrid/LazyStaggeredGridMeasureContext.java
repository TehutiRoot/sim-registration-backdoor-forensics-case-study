package androidx.compose.foundation.lazy.staggeredgrid;

import androidx.compose.foundation.lazy.layout.LazyLayoutMeasureScope;
import androidx.compose.p003ui.layout.Placeable;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.bouncycastle.asn1.cmc.BodyPartID;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(m28851d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b,\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\r\b\u0000\u0018\u00002\u00020\u0001Bx\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0006\u0010\u0011\u001a\u00020\u0005\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010\u0014\u001a\u00020\u0005\u0012\u0006\u0010\u0015\u001a\u00020\u0005\u0012\u0006\u0010\u0016\u001a\u00020\r\u0012\u0006\u0010\u0017\u001a\u00020\u0005ø\u0001\u0000¢\u0006\u0004\b\u0018\u0010\u0019J\u0019\u0010\u001b\u001a\u00020\r*\u00020\u00072\u0006\u0010\u001a\u001a\u00020\u0005¢\u0006\u0004\b\u001b\u0010\u001cJ*\u0010!\u001a\u00020\u001e*\u00020\u00072\u0006\u0010\u001a\u001a\u00020\u00052\u0006\u0010\u001d\u001a\u00020\u0005ø\u0001\u0001ø\u0001\u0002ø\u0001\u0000¢\u0006\u0004\b\u001f\u0010 R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b.\u0010/\u001a\u0004\b0\u00101R \u0010\f\u001a\u00020\u000b8\u0006ø\u0001\u0000ø\u0001\u0002ø\u0001\u0001¢\u0006\f\n\u0004\b2\u00103\u001a\u0004\b4\u00105R\u0017\u0010\u000e\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b6\u00107\u001a\u0004\b\u000e\u00108R\u0017\u0010\u0010\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\b9\u0010:\u001a\u0004\b;\u0010<R\u0017\u0010\u0011\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b=\u0010>\u001a\u0004\b?\u0010@R \u0010\u0013\u001a\u00020\u00128\u0006ø\u0001\u0000ø\u0001\u0002ø\u0001\u0001¢\u0006\f\n\u0004\bA\u00103\u001a\u0004\bB\u00105R\u0017\u0010\u0014\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\bC\u0010>\u001a\u0004\bD\u0010@R\u0017\u0010\u0015\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\bE\u0010>\u001a\u0004\bF\u0010@R\u0017\u0010\u0016\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\bG\u00107\u001a\u0004\bH\u00108R\u0017\u0010\u0017\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\bI\u0010>\u001a\u0004\bJ\u0010@R\u0017\u0010P\u001a\u00020K8\u0006¢\u0006\f\n\u0004\bL\u0010M\u001a\u0004\bN\u0010OR\u0017\u0010V\u001a\u00020Q8\u0006¢\u0006\f\n\u0004\bR\u0010S\u001a\u0004\bT\u0010UR\u0017\u0010Y\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\bW\u0010>\u001a\u0004\bX\u0010@R\u0019\u0010\u001b\u001a\u00020\r*\u00020\u001e8Æ\u0002ø\u0001\u0000¢\u0006\u0006\u001a\u0004\bZ\u0010[R\u0019\u0010V\u001a\u00020\u0005*\u00020\u001e8Æ\u0002ø\u0001\u0000¢\u0006\u0006\u001a\u0004\b\\\u0010]\u0082\u0002\u000f\n\u0002\b\u0019\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u0006^"}, m28850d2 = {"Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureContext;", "", "Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridState;", RemoteConfigConstants.ResponseFieldKey.STATE, "", "", "pinnedItems", "Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridItemProvider;", "itemProvider", "Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridSlots;", "resolvedSlots", "Landroidx/compose/ui/unit/Constraints;", "constraints", "", "isVertical", "Landroidx/compose/foundation/lazy/layout/LazyLayoutMeasureScope;", "measureScope", "mainAxisAvailableSize", "Landroidx/compose/ui/unit/IntOffset;", "contentOffset", "beforeContentPadding", "afterContentPadding", "reverseLayout", "mainAxisSpacing", "<init>", "(Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridState;Ljava/util/List;Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridItemProvider;Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridSlots;JZLandroidx/compose/foundation/lazy/layout/LazyLayoutMeasureScope;IJIIZILkotlin/jvm/internal/DefaultConstructorMarker;)V", "itemIndex", "isFullSpan", "(Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridItemProvider;I)Z", "lane", "Landroidx/compose/foundation/lazy/staggeredgrid/SpanRange;", "getSpanRange-lOCCd4c", "(Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridItemProvider;II)J", "getSpanRange", PDPageLabelRange.STYLE_LETTERS_LOWER, "Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridState;", "getState", "()Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridState;", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "Ljava/util/List;", "getPinnedItems", "()Ljava/util/List;", OperatorName.CURVE_TO, "Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridItemProvider;", "getItemProvider", "()Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridItemProvider;", "d", "Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridSlots;", "getResolvedSlots", "()Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridSlots;", "e", OperatorName.SET_LINE_CAPSTYLE, "getConstraints-msEJaDk", "()J", OperatorName.FILL_NON_ZERO, "Z", "()Z", OperatorName.NON_STROKING_GRAY, "Landroidx/compose/foundation/lazy/layout/LazyLayoutMeasureScope;", "getMeasureScope", "()Landroidx/compose/foundation/lazy/layout/LazyLayoutMeasureScope;", OperatorName.CLOSE_PATH, "I", "getMainAxisAvailableSize", "()I", "i", "getContentOffset-nOcc-ac", OperatorName.SET_LINE_JOINSTYLE, "getBeforeContentPadding", OperatorName.NON_STROKING_CMYK, "getAfterContentPadding", OperatorName.LINE_TO, "getReverseLayout", OperatorName.MOVE_TO, "getMainAxisSpacing", "Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureProvider;", OperatorName.ENDPATH, "Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureProvider;", "getMeasuredItemProvider", "()Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureProvider;", "measuredItemProvider", "Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridLaneInfo;", "o", "Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridLaneInfo;", "getLaneInfo", "()Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridLaneInfo;", "laneInfo", "p", "getLaneCount", "laneCount", "isFullSpan-SZVOQXA", "(J)Z", "getLaneInfo-SZVOQXA", "(J)I", "foundation_release"}, m28849k = 1, m28848mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nLazyStaggeredGridMeasure.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyStaggeredGridMeasure.kt\nandroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureContext\n+ 2 LazyStaggeredGridMeasure.kt\nandroidx/compose/foundation/lazy/staggeredgrid/SpanRange\n+ 3 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n*L\n1#1,1158:1\n231#1:1164\n908#2:1159\n907#2:1160\n906#2:1162\n908#2:1165\n907#2:1166\n906#2:1168\n62#3:1161\n55#3:1163\n62#3:1167\n55#3:1169\n*S KotlinDebug\n*F\n+ 1 LazyStaggeredGridMeasure.kt\nandroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureContext\n*L\n234#1:1164\n231#1:1159\n231#1:1160\n231#1:1162\n234#1:1165\n234#1:1166\n234#1:1168\n231#1:1161\n231#1:1163\n234#1:1167\n234#1:1169\n*E\n"})
/* loaded from: classes.dex */
public final class LazyStaggeredGridMeasureContext {

    /* renamed from: a */
    public final LazyStaggeredGridState f13726a;

    /* renamed from: b */
    public final List f13727b;

    /* renamed from: c */
    public final LazyStaggeredGridItemProvider f13728c;

    /* renamed from: d */
    public final LazyStaggeredGridSlots f13729d;

    /* renamed from: e */
    public final long f13730e;

    /* renamed from: f */
    public final boolean f13731f;

    /* renamed from: g */
    public final LazyLayoutMeasureScope f13732g;

    /* renamed from: h */
    public final int f13733h;

    /* renamed from: i */
    public final long f13734i;

    /* renamed from: j */
    public final int f13735j;

    /* renamed from: k */
    public final int f13736k;

    /* renamed from: l */
    public final boolean f13737l;

    /* renamed from: m */
    public final int f13738m;

    /* renamed from: n */
    public final LazyStaggeredGridMeasureProvider f13739n;

    /* renamed from: o */
    public final LazyStaggeredGridLaneInfo f13740o;

    /* renamed from: p */
    public final int f13741p;

    public /* synthetic */ LazyStaggeredGridMeasureContext(LazyStaggeredGridState lazyStaggeredGridState, List list, LazyStaggeredGridItemProvider lazyStaggeredGridItemProvider, LazyStaggeredGridSlots lazyStaggeredGridSlots, long j, boolean z, LazyLayoutMeasureScope lazyLayoutMeasureScope, int i, long j2, int i2, int i3, boolean z2, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this(lazyStaggeredGridState, list, lazyStaggeredGridItemProvider, lazyStaggeredGridSlots, j, z, lazyLayoutMeasureScope, i, j2, i2, i3, z2, i4);
    }

    public final int getAfterContentPadding() {
        return this.f13736k;
    }

    public final int getBeforeContentPadding() {
        return this.f13735j;
    }

    /* renamed from: getConstraints-msEJaDk  reason: not valid java name */
    public final long m69653getConstraintsmsEJaDk() {
        return this.f13730e;
    }

    /* renamed from: getContentOffset-nOcc-ac  reason: not valid java name */
    public final long m69654getContentOffsetnOccac() {
        return this.f13734i;
    }

    @NotNull
    public final LazyStaggeredGridItemProvider getItemProvider() {
        return this.f13728c;
    }

    public final int getLaneCount() {
        return this.f13741p;
    }

    @NotNull
    public final LazyStaggeredGridLaneInfo getLaneInfo() {
        return this.f13740o;
    }

    /* renamed from: getLaneInfo-SZVOQXA  reason: not valid java name */
    public final int m69655getLaneInfoSZVOQXA(long j) {
        int i = (int) (j >> 32);
        if (((int) (BodyPartID.bodyIdMax & j)) - i != 1) {
            return -2;
        }
        return i;
    }

    public final int getMainAxisAvailableSize() {
        return this.f13733h;
    }

    public final int getMainAxisSpacing() {
        return this.f13738m;
    }

    @NotNull
    public final LazyLayoutMeasureScope getMeasureScope() {
        return this.f13732g;
    }

    @NotNull
    public final LazyStaggeredGridMeasureProvider getMeasuredItemProvider() {
        return this.f13739n;
    }

    @NotNull
    public final List<Integer> getPinnedItems() {
        return this.f13727b;
    }

    @NotNull
    public final LazyStaggeredGridSlots getResolvedSlots() {
        return this.f13729d;
    }

    public final boolean getReverseLayout() {
        return this.f13737l;
    }

    /* renamed from: getSpanRange-lOCCd4c  reason: not valid java name */
    public final long m69656getSpanRangelOCCd4c(@NotNull LazyStaggeredGridItemProvider getSpanRange, int i, int i2) {
        int i3;
        Intrinsics.checkNotNullParameter(getSpanRange, "$this$getSpanRange");
        boolean isFullSpan = getSpanRange.getSpanProvider().isFullSpan(i);
        if (isFullSpan) {
            i3 = this.f13741p;
        } else {
            i3 = 1;
        }
        if (isFullSpan) {
            i2 = 0;
        }
        return SpanRange.m69663constructorimpl(i2, i3);
    }

    @NotNull
    public final LazyStaggeredGridState getState() {
        return this.f13726a;
    }

    public final boolean isFullSpan(@NotNull LazyStaggeredGridItemProvider lazyStaggeredGridItemProvider, int i) {
        Intrinsics.checkNotNullParameter(lazyStaggeredGridItemProvider, "<this>");
        return lazyStaggeredGridItemProvider.getSpanProvider().isFullSpan(i);
    }

    /* renamed from: isFullSpan-SZVOQXA  reason: not valid java name */
    public final boolean m69657isFullSpanSZVOQXA(long j) {
        return ((int) (BodyPartID.bodyIdMax & j)) - ((int) (j >> 32)) != 1;
    }

    public final boolean isVertical() {
        return this.f13731f;
    }

    public LazyStaggeredGridMeasureContext(LazyStaggeredGridState state, List pinnedItems, final LazyStaggeredGridItemProvider itemProvider, final LazyStaggeredGridSlots resolvedSlots, long j, final boolean z, final LazyLayoutMeasureScope measureScope, int i, long j2, int i2, int i3, boolean z2, int i4) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(pinnedItems, "pinnedItems");
        Intrinsics.checkNotNullParameter(itemProvider, "itemProvider");
        Intrinsics.checkNotNullParameter(resolvedSlots, "resolvedSlots");
        Intrinsics.checkNotNullParameter(measureScope, "measureScope");
        this.f13726a = state;
        this.f13727b = pinnedItems;
        this.f13728c = itemProvider;
        this.f13729d = resolvedSlots;
        this.f13730e = j;
        this.f13731f = z;
        this.f13732g = measureScope;
        this.f13733h = i;
        this.f13734i = j2;
        this.f13735j = i2;
        this.f13736k = i3;
        this.f13737l = z2;
        this.f13738m = i4;
        this.f13739n = new LazyStaggeredGridMeasureProvider(z, itemProvider, measureScope, resolvedSlots) { // from class: androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridMeasureContext$measuredItemProvider$1
            @Override // androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridMeasureProvider
            @NotNull
            public LazyStaggeredGridMeasuredItem createItem(int i5, int i6, int i7, @NotNull Object key, @Nullable Object obj, @NotNull List<? extends Placeable> placeables) {
                Intrinsics.checkNotNullParameter(key, "key");
                Intrinsics.checkNotNullParameter(placeables, "placeables");
                return new LazyStaggeredGridMeasuredItem(i5, key, placeables, LazyStaggeredGridMeasureContext.this.isVertical(), LazyStaggeredGridMeasureContext.this.getMainAxisSpacing(), i6, i7, LazyStaggeredGridMeasureContext.this.getBeforeContentPadding(), LazyStaggeredGridMeasureContext.this.getAfterContentPadding(), obj);
            }
        };
        this.f13740o = state.getLaneInfo$foundation_release();
        this.f13741p = resolvedSlots.getSizes().length;
    }
}
