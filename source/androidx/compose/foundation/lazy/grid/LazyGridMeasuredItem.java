package androidx.compose.foundation.lazy.grid;

import androidx.compose.foundation.lazy.layout.LazyLayoutAnimateItemModifierNode;
import androidx.compose.p003ui.layout.Placeable;
import androidx.compose.p003ui.unit.IntOffset;
import androidx.compose.p003ui.unit.IntOffsetKt;
import androidx.compose.p003ui.unit.IntSizeKt;
import androidx.compose.p003ui.unit.LayoutDirection;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import ch.qos.logback.core.joran.action.Action;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.AbstractC11719c;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(m28851d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b'\n\u0002\u0018\u0002\n\u0002\b\u0013\b\u0000\u0018\u00002\u00020\u0001Br\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\u0006\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\r\u001a\u00020\u0002\u0012\u0006\u0010\u000e\u001a\u00020\u0002\u0012\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0004ø\u0001\u0000¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0017\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0017\u0010\u0018JA\u0010 \u001a\u00020\u001f2\u0006\u0010\u0019\u001a\u00020\u00022\u0006\u0010\u001a\u001a\u00020\u00022\u0006\u0010\u001b\u001a\u00020\u00022\u0006\u0010\u001c\u001a\u00020\u00022\b\b\u0002\u0010\u001d\u001a\u00020\u00022\b\b\u0002\u0010\u001e\u001a\u00020\u0002¢\u0006\u0004\b \u0010!J\u0015\u0010$\u001a\u00020\u001f2\u0006\u0010#\u001a\u00020\"¢\u0006\u0004\b$\u0010%R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)R\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b.\u0010/\u001a\u0004\b\u0007\u00100R\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b1\u0010'\u001a\u0004\b2\u0010)R\u0014\u0010\n\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u0010/R\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b4\u00105R\u0014\u0010\r\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b6\u0010'R\u0014\u0010\u000e\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b7\u0010'R\u001a\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b8\u00109R\u001d\u0010\u0013\u001a\u00020\u00128\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\n\u0004\b:\u0010;R\u001c\u0010\u0014\u001a\u0004\u0018\u00010\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b<\u0010+\u001a\u0004\b=\u0010-R\u0017\u0010@\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b>\u0010'\u001a\u0004\b?\u0010)R\u0017\u0010C\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bA\u0010'\u001a\u0004\bB\u0010)R\u0016\u0010E\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bD\u0010'R\u0016\u0010G\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bF\u0010'R\u0016\u0010I\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bH\u0010'R#\u0010N\u001a\u00020J8\u0016X\u0096\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\bK\u0010;\u001a\u0004\bL\u0010MR-\u0010R\u001a\u00020\u00122\u0006\u0010O\u001a\u00020\u00128\u0016@RX\u0096\u000eø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\bP\u0010;\u001a\u0004\bQ\u0010MR$\u0010\u001d\u001a\u00020\u00022\u0006\u0010O\u001a\u00020\u00028\u0016@RX\u0096\u000e¢\u0006\f\n\u0004\bS\u0010'\u001a\u0004\bT\u0010)R$\u0010\u001e\u001a\u00020\u00022\u0006\u0010O\u001a\u00020\u00028\u0016@RX\u0096\u000e¢\u0006\f\n\u0004\bU\u0010'\u001a\u0004\bV\u0010)R\u0011\u0010X\u001a\u00020\u00028F¢\u0006\u0006\u001a\u0004\bW\u0010)R\u0011\u0010\u001a\u001a\u00020\u00028F¢\u0006\u0006\u001a\u0004\bY\u0010)R\u001b\u0010[\u001a\u00020\u0002*\u00020\u00128BX\u0082\u0004ø\u0001\u0000¢\u0006\u0006\u001a\u0004\b&\u0010ZR\u0018\u0010@\u001a\u00020\u0002*\u00020\u00108BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b*\u0010\\\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006]"}, m28850d2 = {"Landroidx/compose/foundation/lazy/grid/LazyGridMeasuredItem;", "Landroidx/compose/foundation/lazy/grid/LazyGridItemInfo;", "", FirebaseAnalytics.Param.INDEX, "", Action.KEY_ATTRIBUTE, "", "isVertical", "crossAxisSize", "mainAxisSpacing", "reverseLayout", "Landroidx/compose/ui/unit/LayoutDirection;", "layoutDirection", "beforeContentPadding", "afterContentPadding", "", "Landroidx/compose/ui/layout/Placeable;", "placeables", "Landroidx/compose/ui/unit/IntOffset;", "visualOffset", "contentType", "<init>", "(ILjava/lang/Object;ZIIZLandroidx/compose/ui/unit/LayoutDirection;IILjava/util/List;JLjava/lang/Object;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "getParentData", "(I)Ljava/lang/Object;", "mainAxisOffset", "crossAxisOffset", "layoutWidth", "layoutHeight", "row", "column", "", "position", "(IIIIII)V", "Landroidx/compose/ui/layout/Placeable$PlacementScope;", Action.SCOPE_ATTRIBUTE, "place", "(Landroidx/compose/ui/layout/Placeable$PlacementScope;)V", PDPageLabelRange.STYLE_LETTERS_LOWER, "I", "getIndex", "()I", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "Ljava/lang/Object;", "getKey", "()Ljava/lang/Object;", OperatorName.CURVE_TO, "Z", "()Z", "d", "getCrossAxisSize", "e", OperatorName.FILL_NON_ZERO, "Landroidx/compose/ui/unit/LayoutDirection;", OperatorName.NON_STROKING_GRAY, OperatorName.CLOSE_PATH, "i", "Ljava/util/List;", OperatorName.SET_LINE_JOINSTYLE, OperatorName.SET_LINE_CAPSTYLE, OperatorName.NON_STROKING_CMYK, "getContentType", OperatorName.LINE_TO, "getMainAxisSize", "mainAxisSize", OperatorName.MOVE_TO, "getMainAxisSizeWithSpacings", "mainAxisSizeWithSpacings", OperatorName.ENDPATH, "mainAxisLayoutSize", "o", "minMainAxisOffset", "p", "maxMainAxisOffset", "Landroidx/compose/ui/unit/IntSize;", OperatorName.SAVE, "getSize-YbymL2g", "()J", "size", "<set-?>", PDPageLabelRange.STYLE_ROMAN_LOWER, "getOffset-nOcc-ac", TypedValues.CycleType.S_WAVE_OFFSET, OperatorName.CLOSE_AND_STROKE, "getRow", "t", "getColumn", "getPlaceablesCount", "placeablesCount", "getCrossAxisOffset", "(J)I", "mainAxis", "(Landroidx/compose/ui/layout/Placeable;)I", "foundation_release"}, m28849k = 1, m28848mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nLazyGridMeasuredItem.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyGridMeasuredItem.kt\nandroidx/compose/foundation/lazy/grid/LazyGridMeasuredItem\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 IntOffset.kt\nandroidx/compose/ui/unit/IntOffset\n*L\n1#1,167:1\n164#1:176\n33#2,6:168\n1#3:174\n86#4:175\n86#4:177\n*S KotlinDebug\n*F\n+ 1 LazyGridMeasuredItem.kt\nandroidx/compose/foundation/lazy/grid/LazyGridMeasuredItem\n*L\n148#1:176\n72#1:168,6\n138#1:175\n152#1:177\n*E\n"})
/* loaded from: classes.dex */
public final class LazyGridMeasuredItem implements LazyGridItemInfo {

    /* renamed from: a */
    public final int f13514a;

    /* renamed from: b */
    public final Object f13515b;

    /* renamed from: c */
    public final boolean f13516c;

    /* renamed from: d */
    public final int f13517d;

    /* renamed from: e */
    public final boolean f13518e;

    /* renamed from: f */
    public final LayoutDirection f13519f;

    /* renamed from: g */
    public final int f13520g;

    /* renamed from: h */
    public final int f13521h;

    /* renamed from: i */
    public final List f13522i;

    /* renamed from: j */
    public final long f13523j;

    /* renamed from: k */
    public final Object f13524k;

    /* renamed from: l */
    public final int f13525l;

    /* renamed from: m */
    public final int f13526m;

    /* renamed from: n */
    public int f13527n;

    /* renamed from: o */
    public int f13528o;

    /* renamed from: p */
    public int f13529p;

    /* renamed from: q */
    public final long f13530q;

    /* renamed from: r */
    public long f13531r;

    /* renamed from: s */
    public int f13532s;

    /* renamed from: t */
    public int f13533t;

    public /* synthetic */ LazyGridMeasuredItem(int i, Object obj, boolean z, int i2, int i3, boolean z2, LayoutDirection layoutDirection, int i4, int i5, List list, long j, Object obj2, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, obj, z, i2, i3, z2, layoutDirection, i4, i5, list, j, obj2);
    }

    public static /* synthetic */ void position$default(LazyGridMeasuredItem lazyGridMeasuredItem, int i, int i2, int i3, int i4, int i5, int i6, int i7, Object obj) {
        int i8;
        int i9;
        if ((i7 & 16) != 0) {
            i8 = -1;
        } else {
            i8 = i5;
        }
        if ((i7 & 32) != 0) {
            i9 = -1;
        } else {
            i9 = i6;
        }
        lazyGridMeasuredItem.position(i, i2, i3, i4, i8, i9);
    }

    /* renamed from: a */
    public final int m61238a(long j) {
        if (this.f13516c) {
            return IntOffset.m73777getYimpl(j);
        }
        return IntOffset.m73776getXimpl(j);
    }

    /* renamed from: b */
    public final int m61237b(Placeable placeable) {
        if (this.f13516c) {
            return placeable.getHeight();
        }
        return placeable.getWidth();
    }

    @Override // androidx.compose.foundation.lazy.grid.LazyGridItemInfo
    public int getColumn() {
        return this.f13533t;
    }

    @Override // androidx.compose.foundation.lazy.grid.LazyGridItemInfo
    @Nullable
    public Object getContentType() {
        return this.f13524k;
    }

    public final int getCrossAxisOffset() {
        if (this.f13516c) {
            return IntOffset.m73776getXimpl(mo69623getOffsetnOccac());
        }
        return IntOffset.m73777getYimpl(mo69623getOffsetnOccac());
    }

    public final int getCrossAxisSize() {
        return this.f13517d;
    }

    @Override // androidx.compose.foundation.lazy.grid.LazyGridItemInfo
    public int getIndex() {
        return this.f13514a;
    }

    @Override // androidx.compose.foundation.lazy.grid.LazyGridItemInfo
    @NotNull
    public Object getKey() {
        return this.f13515b;
    }

    public final int getMainAxisSize() {
        return this.f13525l;
    }

    public final int getMainAxisSizeWithSpacings() {
        return this.f13526m;
    }

    @Override // androidx.compose.foundation.lazy.grid.LazyGridItemInfo
    /* renamed from: getOffset-nOcc-ac */
    public long mo69623getOffsetnOccac() {
        return this.f13531r;
    }

    @Nullable
    public final Object getParentData(int i) {
        return ((Placeable) this.f13522i.get(i)).getParentData();
    }

    public final int getPlaceablesCount() {
        return this.f13522i.size();
    }

    @Override // androidx.compose.foundation.lazy.grid.LazyGridItemInfo
    public int getRow() {
        return this.f13532s;
    }

    @Override // androidx.compose.foundation.lazy.grid.LazyGridItemInfo
    /* renamed from: getSize-YbymL2g */
    public long mo69624getSizeYbymL2g() {
        return this.f13530q;
    }

    public final boolean isVertical() {
        return this.f13516c;
    }

    public final void place(@NotNull Placeable.PlacementScope scope) {
        LazyLayoutAnimateItemModifierNode lazyLayoutAnimateItemModifierNode;
        int m73776getXimpl;
        int m73777getYimpl;
        Intrinsics.checkNotNullParameter(scope, "scope");
        if (this.f13527n != Integer.MIN_VALUE) {
            int placeablesCount = getPlaceablesCount();
            for (int i = 0; i < placeablesCount; i++) {
                Placeable placeable = (Placeable) this.f13522i.get(i);
                int m61237b = this.f13528o - m61237b(placeable);
                int i2 = this.f13529p;
                long mo69623getOffsetnOccac = mo69623getOffsetnOccac();
                Object parentData = getParentData(i);
                if (parentData instanceof LazyLayoutAnimateItemModifierNode) {
                    lazyLayoutAnimateItemModifierNode = (LazyLayoutAnimateItemModifierNode) parentData;
                } else {
                    lazyLayoutAnimateItemModifierNode = null;
                }
                if (lazyLayoutAnimateItemModifierNode != null) {
                    long m69634getPlacementDeltanOccac = lazyLayoutAnimateItemModifierNode.m69634getPlacementDeltanOccac();
                    long IntOffset = IntOffsetKt.IntOffset(IntOffset.m73776getXimpl(mo69623getOffsetnOccac) + IntOffset.m73776getXimpl(m69634getPlacementDeltanOccac), IntOffset.m73777getYimpl(mo69623getOffsetnOccac) + IntOffset.m73777getYimpl(m69634getPlacementDeltanOccac));
                    if ((m61238a(mo69623getOffsetnOccac) <= m61237b && m61238a(IntOffset) <= m61237b) || (m61238a(mo69623getOffsetnOccac) >= i2 && m61238a(IntOffset) >= i2)) {
                        lazyLayoutAnimateItemModifierNode.cancelAnimation();
                    }
                    mo69623getOffsetnOccac = IntOffset;
                }
                if (this.f13518e) {
                    if (this.f13516c) {
                        m73776getXimpl = IntOffset.m73776getXimpl(mo69623getOffsetnOccac);
                    } else {
                        m73776getXimpl = (this.f13527n - IntOffset.m73776getXimpl(mo69623getOffsetnOccac)) - m61237b(placeable);
                    }
                    if (this.f13516c) {
                        m73777getYimpl = (this.f13527n - IntOffset.m73777getYimpl(mo69623getOffsetnOccac)) - m61237b(placeable);
                    } else {
                        m73777getYimpl = IntOffset.m73777getYimpl(mo69623getOffsetnOccac);
                    }
                    mo69623getOffsetnOccac = IntOffsetKt.IntOffset(m73776getXimpl, m73777getYimpl);
                }
                long j = this.f13523j;
                long IntOffset2 = IntOffsetKt.IntOffset(IntOffset.m73776getXimpl(mo69623getOffsetnOccac) + IntOffset.m73776getXimpl(j), IntOffset.m73777getYimpl(mo69623getOffsetnOccac) + IntOffset.m73777getYimpl(j));
                if (this.f13516c) {
                    Placeable.PlacementScope.m72853placeWithLayeraW9wM$default(scope, placeable, IntOffset2, 0.0f, null, 6, null);
                } else {
                    Placeable.PlacementScope.m72852placeRelativeWithLayeraW9wM$default(scope, placeable, IntOffset2, 0.0f, null, 6, null);
                }
            }
            return;
        }
        throw new IllegalArgumentException("position() should be called first".toString());
    }

    public final void position(int i, int i2, int i3, int i4, int i5, int i6) {
        int i7;
        long IntOffset;
        boolean z = this.f13516c;
        if (z) {
            i7 = i4;
        } else {
            i7 = i3;
        }
        this.f13527n = i7;
        if (!z) {
            i3 = i4;
        }
        if (z && this.f13519f == LayoutDirection.Rtl) {
            i2 = (i3 - i2) - this.f13517d;
        }
        if (z) {
            IntOffset = IntOffsetKt.IntOffset(i2, i);
        } else {
            IntOffset = IntOffsetKt.IntOffset(i, i2);
        }
        this.f13531r = IntOffset;
        this.f13532s = i5;
        this.f13533t = i6;
        this.f13528o = -this.f13520g;
        this.f13529p = this.f13527n + this.f13521h;
    }

    public LazyGridMeasuredItem(int i, Object key, boolean z, int i2, int i3, boolean z2, LayoutDirection layoutDirection, int i4, int i5, List placeables, long j, Object obj) {
        long IntSize;
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(layoutDirection, "layoutDirection");
        Intrinsics.checkNotNullParameter(placeables, "placeables");
        this.f13514a = i;
        this.f13515b = key;
        this.f13516c = z;
        this.f13517d = i2;
        this.f13518e = z2;
        this.f13519f = layoutDirection;
        this.f13520g = i4;
        this.f13521h = i5;
        this.f13522i = placeables;
        this.f13523j = j;
        this.f13524k = obj;
        this.f13527n = Integer.MIN_VALUE;
        int size = placeables.size();
        int i6 = 0;
        for (int i7 = 0; i7 < size; i7++) {
            Placeable placeable = (Placeable) placeables.get(i7);
            i6 = Math.max(i6, this.f13516c ? placeable.getHeight() : placeable.getWidth());
        }
        this.f13525l = i6;
        this.f13526m = AbstractC11719c.coerceAtLeast(i3 + i6, 0);
        if (this.f13516c) {
            IntSize = IntSizeKt.IntSize(this.f13517d, i6);
        } else {
            IntSize = IntSizeKt.IntSize(i6, this.f13517d);
        }
        this.f13530q = IntSize;
        this.f13531r = IntOffset.Companion.m73786getZeronOccac();
        this.f13532s = -1;
        this.f13533t = -1;
    }
}
