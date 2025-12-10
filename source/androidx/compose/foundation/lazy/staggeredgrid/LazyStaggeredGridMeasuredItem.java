package androidx.compose.foundation.lazy.staggeredgrid;

import androidx.compose.foundation.lazy.layout.LazyLayoutAnimateItemModifierNode;
import androidx.compose.p003ui.layout.Placeable;
import androidx.compose.p003ui.unit.IntOffset;
import androidx.compose.p003ui.unit.IntOffsetKt;
import androidx.compose.p003ui.unit.IntSizeKt;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.joran.action.Action;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.AbstractC11719c;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(m28851d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000e\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b)\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\n\b\u0000\u0018\u00002\u00020\u0001B_\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00020\u0002\u0012\u0006\u0010\f\u001a\u00020\u0002\u0012\u0006\u0010\r\u001a\u00020\u0002\u0012\u0006\u0010\u000e\u001a\u00020\u0002\u0012\u0006\u0010\u000f\u001a\u00020\u0002\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0013\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0013\u0010\u0014J%\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0015\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\u00022\u0006\u0010\u0017\u001a\u00020\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u001d\u0010\u001f\u001a\u00020\u00182\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001e\u001a\u00020\u001d¢\u0006\u0004\b\u001f\u0010 J\u000f\u0010\"\u001a\u00020!H\u0016¢\u0006\u0004\b\"\u0010#R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'R\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+R\u001a\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010-R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b.\u0010/\u001a\u0004\b\n\u00100R\u001a\u0010\f\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b1\u0010%\u001a\u0004\b2\u0010'R\u0017\u0010\r\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b3\u0010%\u001a\u0004\b4\u0010'R\u0014\u0010\u000e\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b5\u0010%R\u0014\u0010\u000f\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b6\u0010%R\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b7\u0010)\u001a\u0004\b8\u0010+R\"\u0010:\u001a\u00020\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b9\u0010/\u001a\u0004\b:\u00100\"\u0004\b;\u0010<R\u0017\u0010?\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b=\u0010%\u001a\u0004\b>\u0010'R\u0017\u0010B\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b@\u0010%\u001a\u0004\bA\u0010'R\u0017\u0010E\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bC\u0010%\u001a\u0004\bD\u0010'R\u0016\u0010\u0017\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bF\u0010%R\u0016\u0010H\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bG\u0010%R\u0016\u0010J\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bI\u0010%R#\u0010P\u001a\u00020K8\u0016X\u0096\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\bL\u0010M\u001a\u0004\bN\u0010OR-\u0010U\u001a\u00020Q2\u0006\u0010R\u001a\u00020Q8\u0016@RX\u0096\u000eø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\bS\u0010M\u001a\u0004\bT\u0010OR\u0011\u0010W\u001a\u00020\u00028F¢\u0006\u0006\u001a\u0004\bV\u0010'R\u0011\u0010Y\u001a\u00020\u00028F¢\u0006\u0006\u001a\u0004\bX\u0010'R\u001b\u0010\u0015\u001a\u00020\u0002*\u00020Q8BX\u0082\u0004ø\u0001\u0000¢\u0006\u0006\u001a\u0004\b$\u0010Z\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006["}, m28850d2 = {"Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasuredItem;", "Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridItemInfo;", "", FirebaseAnalytics.Param.INDEX, "", Action.KEY_ATTRIBUTE, "", "Landroidx/compose/ui/layout/Placeable;", "placeables", "", "isVertical", "spacing", "lane", "span", "beforeContentPadding", "afterContentPadding", "contentType", "<init>", "(ILjava/lang/Object;Ljava/util/List;ZIIIIILjava/lang/Object;)V", "getParentData", "(I)Ljava/lang/Object;", "mainAxis", "crossAxis", "mainAxisLayoutSize", "", "position", "(III)V", "Landroidx/compose/ui/layout/Placeable$PlacementScope;", Action.SCOPE_ATTRIBUTE, "Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureContext;", CoreConstants.CONTEXT_SCOPE_VALUE, "place", "(Landroidx/compose/ui/layout/Placeable$PlacementScope;Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureContext;)V", "", "toString", "()Ljava/lang/String;", PDPageLabelRange.STYLE_LETTERS_LOWER, "I", "getIndex", "()I", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "Ljava/lang/Object;", "getKey", "()Ljava/lang/Object;", OperatorName.CURVE_TO, "Ljava/util/List;", "d", "Z", "()Z", "e", "getLane", OperatorName.FILL_NON_ZERO, "getSpan", OperatorName.NON_STROKING_GRAY, OperatorName.CLOSE_PATH, "i", "getContentType", OperatorName.SET_LINE_JOINSTYLE, "isVisible", "setVisible", "(Z)V", OperatorName.NON_STROKING_CMYK, "getMainAxisSize", "mainAxisSize", OperatorName.LINE_TO, "getSizeWithSpacings", "sizeWithSpacings", OperatorName.MOVE_TO, "getCrossAxisSize", "crossAxisSize", OperatorName.ENDPATH, "o", "minMainAxisOffset", "p", "maxMainAxisOffset", "Landroidx/compose/ui/unit/IntSize;", OperatorName.SAVE, OperatorName.SET_LINE_CAPSTYLE, "getSize-YbymL2g", "()J", "size", "Landroidx/compose/ui/unit/IntOffset;", "<set-?>", PDPageLabelRange.STYLE_ROMAN_LOWER, "getOffset-nOcc-ac", TypedValues.CycleType.S_WAVE_OFFSET, "getPlaceablesCount", "placeablesCount", "getCrossAxisOffset", "crossAxisOffset", "(J)I", "foundation_release"}, m28849k = 1, m28848mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nLazyStaggeredGridMeasure.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyStaggeredGridMeasure.kt\nandroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasuredItem\n+ 2 TempListUtils.kt\nandroidx/compose/foundation/TempListUtilsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n+ 5 IntOffset.kt\nandroidx/compose/ui/unit/IntOffset\n*L\n1#1,1158:1\n1145#1:1180\n1147#1:1182\n1145#1:1183\n99#2,8:1159\n99#2,8:1167\n1#3:1175\n69#4,4:1176\n74#4:1185\n86#5:1181\n86#5:1184\n*S KotlinDebug\n*F\n+ 1 LazyStaggeredGridMeasure.kt\nandroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasuredItem\n*L\n1118#1:1180\n1134#1:1182\n1135#1:1183\n1072#1:1159,8\n1078#1:1167,8\n1117#1:1176,4\n1117#1:1185\n1124#1:1181\n1138#1:1184\n*E\n"})
/* loaded from: classes.dex */
public final class LazyStaggeredGridMeasuredItem implements LazyStaggeredGridItemInfo {

    /* renamed from: a */
    public final int f13763a;

    /* renamed from: b */
    public final Object f13764b;

    /* renamed from: c */
    public final List f13765c;

    /* renamed from: d */
    public final boolean f13766d;

    /* renamed from: e */
    public final int f13767e;

    /* renamed from: f */
    public final int f13768f;

    /* renamed from: g */
    public final int f13769g;

    /* renamed from: h */
    public final int f13770h;

    /* renamed from: i */
    public final Object f13771i;

    /* renamed from: j */
    public boolean f13772j;

    /* renamed from: k */
    public final int f13773k;

    /* renamed from: l */
    public final int f13774l;

    /* renamed from: m */
    public final int f13775m;

    /* renamed from: n */
    public int f13776n;

    /* renamed from: o */
    public int f13777o;

    /* renamed from: p */
    public int f13778p;

    /* renamed from: q */
    public final long f13779q;

    /* renamed from: r */
    public long f13780r;

    public LazyStaggeredGridMeasuredItem(int i, @NotNull Object key, @NotNull List<? extends Placeable> placeables, boolean z, int i2, int i3, int i4, int i5, int i6, @Nullable Object obj) {
        int width;
        Integer valueOf;
        int width2;
        int i7;
        long IntSize;
        int height;
        int height2;
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(placeables, "placeables");
        this.f13763a = i;
        this.f13764b = key;
        this.f13765c = placeables;
        this.f13766d = z;
        this.f13767e = i3;
        this.f13768f = i4;
        this.f13769g = i5;
        this.f13770h = i6;
        this.f13771i = obj;
        int i8 = 1;
        this.f13772j = true;
        Integer num = null;
        if (placeables.isEmpty()) {
            valueOf = null;
        } else {
            Placeable placeable = placeables.get(0);
            if (z) {
                width = placeable.getHeight();
            } else {
                width = placeable.getWidth();
            }
            valueOf = Integer.valueOf(width);
            int lastIndex = CollectionsKt__CollectionsKt.getLastIndex(placeables);
            if (1 <= lastIndex) {
                int i9 = 1;
                while (true) {
                    Placeable placeable2 = placeables.get(i9);
                    if (this.f13766d) {
                        width2 = placeable2.getHeight();
                    } else {
                        width2 = placeable2.getWidth();
                    }
                    Integer valueOf2 = Integer.valueOf(width2);
                    valueOf = valueOf2.compareTo(valueOf) > 0 ? valueOf2 : valueOf;
                    if (i9 == lastIndex) {
                        break;
                    }
                    i9++;
                }
            }
        }
        if (valueOf != null) {
            i7 = valueOf.intValue();
        } else {
            i7 = 0;
        }
        this.f13773k = i7;
        this.f13774l = AbstractC11719c.coerceAtLeast(i7 + i2, 0);
        List list = this.f13765c;
        if (!list.isEmpty()) {
            Placeable placeable3 = (Placeable) list.get(0);
            if (this.f13766d) {
                height = placeable3.getWidth();
            } else {
                height = placeable3.getHeight();
            }
            Integer valueOf3 = Integer.valueOf(height);
            int lastIndex2 = CollectionsKt__CollectionsKt.getLastIndex(list);
            if (1 <= lastIndex2) {
                while (true) {
                    Placeable placeable4 = (Placeable) list.get(i8);
                    if (this.f13766d) {
                        height2 = placeable4.getWidth();
                    } else {
                        height2 = placeable4.getHeight();
                    }
                    Integer valueOf4 = Integer.valueOf(height2);
                    valueOf3 = valueOf4.compareTo(valueOf3) > 0 ? valueOf4 : valueOf3;
                    if (i8 == lastIndex2) {
                        break;
                    }
                    i8++;
                }
            }
            num = valueOf3;
        }
        int intValue = num != null ? num.intValue() : 0;
        this.f13775m = intValue;
        this.f13776n = -1;
        if (this.f13766d) {
            IntSize = IntSizeKt.IntSize(intValue, this.f13773k);
        } else {
            IntSize = IntSizeKt.IntSize(this.f13773k, intValue);
        }
        this.f13779q = IntSize;
        this.f13780r = IntOffset.Companion.m73786getZeronOccac();
    }

    /* renamed from: a */
    public final int m61144a(long j) {
        if (this.f13766d) {
            return IntOffset.m73777getYimpl(j);
        }
        return IntOffset.m73776getXimpl(j);
    }

    @Override // androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridItemInfo
    @Nullable
    public Object getContentType() {
        return this.f13771i;
    }

    public final int getCrossAxisOffset() {
        if (this.f13766d) {
            return IntOffset.m73776getXimpl(mo69650getOffsetnOccac());
        }
        return IntOffset.m73777getYimpl(mo69650getOffsetnOccac());
    }

    public final int getCrossAxisSize() {
        return this.f13775m;
    }

    @Override // androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridItemInfo
    public int getIndex() {
        return this.f13763a;
    }

    @Override // androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridItemInfo
    @NotNull
    public Object getKey() {
        return this.f13764b;
    }

    @Override // androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridItemInfo
    public int getLane() {
        return this.f13767e;
    }

    public final int getMainAxisSize() {
        return this.f13773k;
    }

    @Override // androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridItemInfo
    /* renamed from: getOffset-nOcc-ac */
    public long mo69650getOffsetnOccac() {
        return this.f13780r;
    }

    @Nullable
    public final Object getParentData(int i) {
        return ((Placeable) this.f13765c.get(i)).getParentData();
    }

    public final int getPlaceablesCount() {
        return this.f13765c.size();
    }

    @Override // androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridItemInfo
    /* renamed from: getSize-YbymL2g */
    public long mo69651getSizeYbymL2g() {
        return this.f13779q;
    }

    public final int getSizeWithSpacings() {
        return this.f13774l;
    }

    public final int getSpan() {
        return this.f13768f;
    }

    public final boolean isVertical() {
        return this.f13766d;
    }

    public final boolean isVisible() {
        return this.f13772j;
    }

    public final void place(@NotNull Placeable.PlacementScope scope, @NotNull LazyStaggeredGridMeasureContext context) {
        int width;
        LazyLayoutAnimateItemModifierNode lazyLayoutAnimateItemModifierNode;
        int width2;
        int i;
        int m73777getYimpl;
        int width3;
        Intrinsics.checkNotNullParameter(scope, "scope");
        Intrinsics.checkNotNullParameter(context, "context");
        if (this.f13776n != -1) {
            List list = this.f13765c;
            int size = list.size();
            for (int i2 = 0; i2 < size; i2++) {
                Placeable placeable = (Placeable) list.get(i2);
                int i3 = this.f13777o;
                if (this.f13766d) {
                    width = placeable.getHeight();
                } else {
                    width = placeable.getWidth();
                }
                int i4 = i3 - width;
                int i5 = this.f13778p;
                long mo69650getOffsetnOccac = mo69650getOffsetnOccac();
                Object parentData = getParentData(i2);
                if (parentData instanceof LazyLayoutAnimateItemModifierNode) {
                    lazyLayoutAnimateItemModifierNode = (LazyLayoutAnimateItemModifierNode) parentData;
                } else {
                    lazyLayoutAnimateItemModifierNode = null;
                }
                if (lazyLayoutAnimateItemModifierNode != null) {
                    long m69634getPlacementDeltanOccac = lazyLayoutAnimateItemModifierNode.m69634getPlacementDeltanOccac();
                    long IntOffset = IntOffsetKt.IntOffset(IntOffset.m73776getXimpl(mo69650getOffsetnOccac) + IntOffset.m73776getXimpl(m69634getPlacementDeltanOccac), IntOffset.m73777getYimpl(mo69650getOffsetnOccac) + IntOffset.m73777getYimpl(m69634getPlacementDeltanOccac));
                    if ((m61144a(mo69650getOffsetnOccac) <= i4 && m61144a(IntOffset) <= i4) || (m61144a(mo69650getOffsetnOccac) >= i5 && m61144a(IntOffset) >= i5)) {
                        lazyLayoutAnimateItemModifierNode.cancelAnimation();
                    }
                    mo69650getOffsetnOccac = IntOffset;
                }
                if (context.getReverseLayout()) {
                    if (this.f13766d) {
                        i = IntOffset.m73776getXimpl(mo69650getOffsetnOccac);
                    } else {
                        int m73776getXimpl = this.f13776n - IntOffset.m73776getXimpl(mo69650getOffsetnOccac);
                        if (this.f13766d) {
                            width2 = placeable.getHeight();
                        } else {
                            width2 = placeable.getWidth();
                        }
                        i = m73776getXimpl - width2;
                    }
                    if (this.f13766d) {
                        int m73777getYimpl2 = this.f13776n - IntOffset.m73777getYimpl(mo69650getOffsetnOccac);
                        if (this.f13766d) {
                            width3 = placeable.getHeight();
                        } else {
                            width3 = placeable.getWidth();
                        }
                        m73777getYimpl = m73777getYimpl2 - width3;
                    } else {
                        m73777getYimpl = IntOffset.m73777getYimpl(mo69650getOffsetnOccac);
                    }
                    mo69650getOffsetnOccac = IntOffsetKt.IntOffset(i, m73777getYimpl);
                }
                long m69654getContentOffsetnOccac = context.m69654getContentOffsetnOccac();
                Placeable.PlacementScope.m72852placeRelativeWithLayeraW9wM$default(scope, placeable, IntOffsetKt.IntOffset(IntOffset.m73776getXimpl(mo69650getOffsetnOccac) + IntOffset.m73776getXimpl(m69654getContentOffsetnOccac), IntOffset.m73777getYimpl(mo69650getOffsetnOccac) + IntOffset.m73777getYimpl(m69654getContentOffsetnOccac)), 0.0f, null, 6, null);
            }
            return;
        }
        throw new IllegalArgumentException("position() should be called first".toString());
    }

    public final void position(int i, int i2, int i3) {
        long IntOffset;
        this.f13776n = i3;
        this.f13777o = -this.f13769g;
        this.f13778p = i3 + this.f13770h;
        if (this.f13766d) {
            IntOffset = IntOffsetKt.IntOffset(i2, i);
        } else {
            IntOffset = IntOffsetKt.IntOffset(i, i2);
        }
        this.f13780r = IntOffset;
    }

    public final void setVisible(boolean z) {
        this.f13772j = z;
    }

    @NotNull
    public String toString() {
        return super.toString();
    }
}
