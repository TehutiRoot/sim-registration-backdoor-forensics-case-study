package androidx.compose.foundation.lazy;

import androidx.compose.foundation.ExperimentalFoundationApi;
import androidx.compose.foundation.lazy.layout.LazyLayoutAnimateItemModifierNode;
import androidx.compose.p003ui.Alignment;
import androidx.compose.p003ui.layout.Placeable;
import androidx.compose.p003ui.unit.IntOffset;
import androidx.compose.p003ui.unit.IntOffsetKt;
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

@Metadata(m28851d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\t\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b/\n\u0002\u0010\u0015\n\u0002\b\n\b\u0000\u0018\u00002\u00020\u0001B\u0080\u0001\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u000f\u001a\u00020\u0007\u0012\u0006\u0010\u0010\u001a\u00020\u0002\u0012\u0006\u0010\u0011\u001a\u00020\u0002\u0012\u0006\u0010\u0012\u001a\u00020\u0002\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\u0006\u0010\u0016\u001a\u00020\u0015\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0015ø\u0001\u0000¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001a\u001a\u0004\u0018\u00010\u00152\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ%\u0010 \u001a\u00020\u001f2\u0006\u0010\u001c\u001a\u00020\u00022\u0006\u0010\u001d\u001a\u00020\u00022\u0006\u0010\u001e\u001a\u00020\u0002¢\u0006\u0004\b \u0010!J\u001e\u0010$\u001a\u00020\u00132\u0006\u0010\u0003\u001a\u00020\u0002ø\u0001\u0001ø\u0001\u0002ø\u0001\u0000¢\u0006\u0004\b\"\u0010#J\u0015\u0010'\u001a\u00020\u001f2\u0006\u0010&\u001a\u00020%¢\u0006\u0004\b'\u0010(R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010.R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b/\u00100\u001a\u0004\b\b\u00101R\u0016\u0010\n\u001a\u0004\u0018\u00010\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u00103R\u0016\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b4\u00105R\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b6\u00107R\u0014\u0010\u000f\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b8\u00100R\u0014\u0010\u0010\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b9\u0010*R\u0014\u0010\u0011\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b:\u0010*R\u0014\u0010\u0012\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b;\u0010*R\u001d\u0010\u0014\u001a\u00020\u00138\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0002ø\u0001\u0001¢\u0006\u0006\n\u0004\b<\u0010=R\u001a\u0010\u0016\u001a\u00020\u00158\u0016X\u0096\u0004¢\u0006\f\n\u0004\b>\u0010?\u001a\u0004\b@\u0010AR\u001c\u0010\u0017\u001a\u0004\u0018\u00010\u00158\u0016X\u0096\u0004¢\u0006\f\n\u0004\bB\u0010?\u001a\u0004\bC\u0010AR$\u0010\u001c\u001a\u00020\u00022\u0006\u0010D\u001a\u00020\u00028\u0016@RX\u0096\u000e¢\u0006\f\n\u0004\bE\u0010*\u001a\u0004\b$\u0010,R\u001a\u0010H\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\bF\u0010*\u001a\u0004\bG\u0010,R\u0017\u0010K\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bI\u0010*\u001a\u0004\bJ\u0010,R\u0017\u0010N\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bL\u0010*\u001a\u0004\bM\u0010,R\u0016\u0010P\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bO\u0010*R\u0016\u0010R\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bQ\u0010*R\u0016\u0010T\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bS\u0010*R\u0014\u0010X\u001a\u00020U8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bV\u0010WR\u0011\u0010Z\u001a\u00020\u00028F¢\u0006\u0006\u001a\u0004\bY\u0010,R\u001b\u0010\\\u001a\u00020\u0002*\u00020\u00138BX\u0082\u0004ø\u0001\u0000¢\u0006\u0006\u001a\u0004\b)\u0010[R\u0018\u0010^\u001a\u00020\u0002*\u00020\u00058BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b-\u0010]\u0082\u0002\u000f\n\u0002\b\u0019\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u0006_"}, m28850d2 = {"Landroidx/compose/foundation/lazy/LazyListMeasuredItem;", "Landroidx/compose/foundation/lazy/LazyListItemInfo;", "", FirebaseAnalytics.Param.INDEX, "", "Landroidx/compose/ui/layout/Placeable;", "placeables", "", "isVertical", "Landroidx/compose/ui/Alignment$Horizontal;", "horizontalAlignment", "Landroidx/compose/ui/Alignment$Vertical;", "verticalAlignment", "Landroidx/compose/ui/unit/LayoutDirection;", "layoutDirection", "reverseLayout", "beforeContentPadding", "afterContentPadding", "spacing", "Landroidx/compose/ui/unit/IntOffset;", "visualOffset", "", Action.KEY_ATTRIBUTE, "contentType", "<init>", "(ILjava/util/List;ZLandroidx/compose/ui/Alignment$Horizontal;Landroidx/compose/ui/Alignment$Vertical;Landroidx/compose/ui/unit/LayoutDirection;ZIIIJLjava/lang/Object;Ljava/lang/Object;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "getParentData", "(I)Ljava/lang/Object;", TypedValues.CycleType.S_WAVE_OFFSET, "layoutWidth", "layoutHeight", "", "position", "(III)V", "getOffset-Bjo55l4", "(I)J", "getOffset", "Landroidx/compose/ui/layout/Placeable$PlacementScope;", Action.SCOPE_ATTRIBUTE, "place", "(Landroidx/compose/ui/layout/Placeable$PlacementScope;)V", PDPageLabelRange.STYLE_LETTERS_LOWER, "I", "getIndex", "()I", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "Ljava/util/List;", OperatorName.CURVE_TO, "Z", "()Z", "d", "Landroidx/compose/ui/Alignment$Horizontal;", "e", "Landroidx/compose/ui/Alignment$Vertical;", OperatorName.FILL_NON_ZERO, "Landroidx/compose/ui/unit/LayoutDirection;", OperatorName.NON_STROKING_GRAY, OperatorName.CLOSE_PATH, "i", OperatorName.SET_LINE_JOINSTYLE, OperatorName.NON_STROKING_CMYK, OperatorName.SET_LINE_CAPSTYLE, OperatorName.LINE_TO, "Ljava/lang/Object;", "getKey", "()Ljava/lang/Object;", OperatorName.MOVE_TO, "getContentType", "<set-?>", OperatorName.ENDPATH, "o", "getSize", "size", "p", "getSizeWithSpacings", "sizeWithSpacings", OperatorName.SAVE, "getCrossAxisSize", "crossAxisSize", PDPageLabelRange.STYLE_ROMAN_LOWER, "mainAxisLayoutSize", OperatorName.CLOSE_AND_STROKE, "minMainAxisOffset", "t", "maxMainAxisOffset", "", "u", "[I", "placeableOffsets", "getPlaceablesCount", "placeablesCount", "(J)I", "mainAxis", "(Landroidx/compose/ui/layout/Placeable;)I", "mainAxisSize", "foundation_release"}, m28849k = 1, m28848mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nLazyListMeasuredItem.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyListMeasuredItem.kt\nandroidx/compose/foundation/lazy/LazyListMeasuredItem\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 IntOffset.kt\nandroidx/compose/ui/unit/IntOffset\n*L\n1#1,171:1\n168#1:186\n33#2,6:172\n69#2,6:178\n1#3:184\n86#4:185\n86#4:187\n*S KotlinDebug\n*F\n+ 1 LazyListMeasuredItem.kt\nandroidx/compose/foundation/lazy/LazyListMeasuredItem\n*L\n152#1:186\n84#1:172,6\n110#1:178,6\n142#1:185\n156#1:187\n*E\n"})
/* loaded from: classes.dex */
public final class LazyListMeasuredItem implements LazyListItemInfo {

    /* renamed from: a */
    public final int f13401a;

    /* renamed from: b */
    public final List f13402b;

    /* renamed from: c */
    public final boolean f13403c;

    /* renamed from: d */
    public final Alignment.Horizontal f13404d;

    /* renamed from: e */
    public final Alignment.Vertical f13405e;

    /* renamed from: f */
    public final LayoutDirection f13406f;

    /* renamed from: g */
    public final boolean f13407g;

    /* renamed from: h */
    public final int f13408h;

    /* renamed from: i */
    public final int f13409i;

    /* renamed from: j */
    public final int f13410j;

    /* renamed from: k */
    public final long f13411k;

    /* renamed from: l */
    public final Object f13412l;

    /* renamed from: m */
    public final Object f13413m;

    /* renamed from: n */
    public int f13414n;

    /* renamed from: o */
    public final int f13415o;

    /* renamed from: p */
    public final int f13416p;

    /* renamed from: q */
    public final int f13417q;

    /* renamed from: r */
    public int f13418r;

    /* renamed from: s */
    public int f13419s;

    /* renamed from: t */
    public int f13420t;

    /* renamed from: u */
    public final int[] f13421u;

    @ExperimentalFoundationApi
    public /* synthetic */ LazyListMeasuredItem(int i, List list, boolean z, Alignment.Horizontal horizontal, Alignment.Vertical vertical, LayoutDirection layoutDirection, boolean z2, int i2, int i3, int i4, long j, Object obj, Object obj2, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, list, z, horizontal, vertical, layoutDirection, z2, i2, i3, i4, j, obj, obj2);
    }

    /* renamed from: a */
    public final int m61283a(long j) {
        if (this.f13403c) {
            return IntOffset.m73777getYimpl(j);
        }
        return IntOffset.m73776getXimpl(j);
    }

    /* renamed from: b */
    public final int m61282b(Placeable placeable) {
        if (this.f13403c) {
            return placeable.getHeight();
        }
        return placeable.getWidth();
    }

    @Override // androidx.compose.foundation.lazy.LazyListItemInfo
    @Nullable
    public Object getContentType() {
        return this.f13413m;
    }

    public final int getCrossAxisSize() {
        return this.f13417q;
    }

    @Override // androidx.compose.foundation.lazy.LazyListItemInfo
    public int getIndex() {
        return this.f13401a;
    }

    @Override // androidx.compose.foundation.lazy.LazyListItemInfo
    @NotNull
    public Object getKey() {
        return this.f13412l;
    }

    @Override // androidx.compose.foundation.lazy.LazyListItemInfo
    public int getOffset() {
        return this.f13414n;
    }

    /* renamed from: getOffset-Bjo55l4  reason: not valid java name */
    public final long m69603getOffsetBjo55l4(int i) {
        int[] iArr = this.f13421u;
        int i2 = i * 2;
        return IntOffsetKt.IntOffset(iArr[i2], iArr[i2 + 1]);
    }

    @Nullable
    public final Object getParentData(int i) {
        return ((Placeable) this.f13402b.get(i)).getParentData();
    }

    public final int getPlaceablesCount() {
        return this.f13402b.size();
    }

    @Override // androidx.compose.foundation.lazy.LazyListItemInfo
    public int getSize() {
        return this.f13415o;
    }

    public final int getSizeWithSpacings() {
        return this.f13416p;
    }

    public final boolean isVertical() {
        return this.f13403c;
    }

    public final void place(@NotNull Placeable.PlacementScope scope) {
        LazyLayoutAnimateItemModifierNode lazyLayoutAnimateItemModifierNode;
        int m73776getXimpl;
        int m73777getYimpl;
        Intrinsics.checkNotNullParameter(scope, "scope");
        if (this.f13418r != Integer.MIN_VALUE) {
            int placeablesCount = getPlaceablesCount();
            for (int i = 0; i < placeablesCount; i++) {
                Placeable placeable = (Placeable) this.f13402b.get(i);
                int m61282b = this.f13419s - m61282b(placeable);
                int i2 = this.f13420t;
                long m69603getOffsetBjo55l4 = m69603getOffsetBjo55l4(i);
                Object parentData = getParentData(i);
                if (parentData instanceof LazyLayoutAnimateItemModifierNode) {
                    lazyLayoutAnimateItemModifierNode = (LazyLayoutAnimateItemModifierNode) parentData;
                } else {
                    lazyLayoutAnimateItemModifierNode = null;
                }
                if (lazyLayoutAnimateItemModifierNode != null) {
                    long m69634getPlacementDeltanOccac = lazyLayoutAnimateItemModifierNode.m69634getPlacementDeltanOccac();
                    long IntOffset = IntOffsetKt.IntOffset(IntOffset.m73776getXimpl(m69603getOffsetBjo55l4) + IntOffset.m73776getXimpl(m69634getPlacementDeltanOccac), IntOffset.m73777getYimpl(m69603getOffsetBjo55l4) + IntOffset.m73777getYimpl(m69634getPlacementDeltanOccac));
                    if ((m61283a(m69603getOffsetBjo55l4) <= m61282b && m61283a(IntOffset) <= m61282b) || (m61283a(m69603getOffsetBjo55l4) >= i2 && m61283a(IntOffset) >= i2)) {
                        lazyLayoutAnimateItemModifierNode.cancelAnimation();
                    }
                    m69603getOffsetBjo55l4 = IntOffset;
                }
                if (this.f13407g) {
                    if (this.f13403c) {
                        m73776getXimpl = IntOffset.m73776getXimpl(m69603getOffsetBjo55l4);
                    } else {
                        m73776getXimpl = (this.f13418r - IntOffset.m73776getXimpl(m69603getOffsetBjo55l4)) - m61282b(placeable);
                    }
                    if (this.f13403c) {
                        m73777getYimpl = (this.f13418r - IntOffset.m73777getYimpl(m69603getOffsetBjo55l4)) - m61282b(placeable);
                    } else {
                        m73777getYimpl = IntOffset.m73777getYimpl(m69603getOffsetBjo55l4);
                    }
                    m69603getOffsetBjo55l4 = IntOffsetKt.IntOffset(m73776getXimpl, m73777getYimpl);
                }
                long j = this.f13411k;
                long IntOffset2 = IntOffsetKt.IntOffset(IntOffset.m73776getXimpl(m69603getOffsetBjo55l4) + IntOffset.m73776getXimpl(j), IntOffset.m73777getYimpl(m69603getOffsetBjo55l4) + IntOffset.m73777getYimpl(j));
                if (this.f13403c) {
                    Placeable.PlacementScope.m72853placeWithLayeraW9wM$default(scope, placeable, IntOffset2, 0.0f, null, 6, null);
                } else {
                    Placeable.PlacementScope.m72852placeRelativeWithLayeraW9wM$default(scope, placeable, IntOffset2, 0.0f, null, 6, null);
                }
            }
            return;
        }
        throw new IllegalArgumentException("position() should be called first".toString());
    }

    public final void position(int i, int i2, int i3) {
        int i4;
        int width;
        this.f13414n = i;
        if (this.f13403c) {
            i4 = i3;
        } else {
            i4 = i2;
        }
        this.f13418r = i4;
        List list = this.f13402b;
        int size = list.size();
        for (int i5 = 0; i5 < size; i5++) {
            Placeable placeable = (Placeable) list.get(i5);
            int i6 = i5 * 2;
            if (this.f13403c) {
                int[] iArr = this.f13421u;
                Alignment.Horizontal horizontal = this.f13404d;
                if (horizontal != null) {
                    iArr[i6] = horizontal.align(placeable.getWidth(), i2, this.f13406f);
                    this.f13421u[i6 + 1] = i;
                    width = placeable.getHeight();
                } else {
                    throw new IllegalArgumentException("Required value was null.".toString());
                }
            } else {
                int[] iArr2 = this.f13421u;
                iArr2[i6] = i;
                int i7 = i6 + 1;
                Alignment.Vertical vertical = this.f13405e;
                if (vertical != null) {
                    iArr2[i7] = vertical.align(placeable.getHeight(), i3);
                    width = placeable.getWidth();
                } else {
                    throw new IllegalArgumentException("Required value was null.".toString());
                }
            }
            i += width;
        }
        this.f13419s = -this.f13408h;
        this.f13420t = this.f13418r + this.f13409i;
    }

    public LazyListMeasuredItem(int i, List placeables, boolean z, Alignment.Horizontal horizontal, Alignment.Vertical vertical, LayoutDirection layoutDirection, boolean z2, int i2, int i3, int i4, long j, Object key, Object obj) {
        Intrinsics.checkNotNullParameter(placeables, "placeables");
        Intrinsics.checkNotNullParameter(layoutDirection, "layoutDirection");
        Intrinsics.checkNotNullParameter(key, "key");
        this.f13401a = i;
        this.f13402b = placeables;
        this.f13403c = z;
        this.f13404d = horizontal;
        this.f13405e = vertical;
        this.f13406f = layoutDirection;
        this.f13407g = z2;
        this.f13408h = i2;
        this.f13409i = i3;
        this.f13410j = i4;
        this.f13411k = j;
        this.f13412l = key;
        this.f13413m = obj;
        this.f13418r = Integer.MIN_VALUE;
        int size = placeables.size();
        int i5 = 0;
        int i6 = 0;
        for (int i7 = 0; i7 < size; i7++) {
            Placeable placeable = (Placeable) placeables.get(i7);
            i5 += this.f13403c ? placeable.getHeight() : placeable.getWidth();
            i6 = Math.max(i6, !this.f13403c ? placeable.getHeight() : placeable.getWidth());
        }
        this.f13415o = i5;
        this.f13416p = AbstractC11719c.coerceAtLeast(getSize() + this.f13410j, 0);
        this.f13417q = i6;
        this.f13421u = new int[this.f13402b.size() * 2];
    }
}
