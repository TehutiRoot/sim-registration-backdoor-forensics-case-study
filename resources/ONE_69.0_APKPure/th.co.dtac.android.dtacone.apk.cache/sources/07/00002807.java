package androidx.compose.foundation.pager;

import androidx.compose.foundation.gestures.Orientation;
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
import org.jetbrains.annotations.NotNull;

@Metadata(m29143d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u001f\n\u0002\u0010\u0015\n\u0002\b\u000b\b\u0000\u0018\u00002\u00020\u0001Bd\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010\u0015\u001a\u00020\u0014ø\u0001\u0000¢\u0006\u0004\b\u0016\u0010\u0017J%\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u0018\u001a\u00020\u00022\u0006\u0010\u0019\u001a\u00020\u00022\u0006\u0010\u001a\u001a\u00020\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u0015\u0010 \u001a\u00020\u001b2\u0006\u0010\u001f\u001a\u00020\u001e¢\u0006\u0004\b \u0010!J \u0010\"\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u0002H\u0002ø\u0001\u0001ø\u0001\u0002ø\u0001\u0000¢\u0006\u0004\b\"\u0010#R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\"\u0010%\u001a\u0004\b(\u0010'R\u001a\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010*R\u001d\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0002ø\u0001\u0001¢\u0006\u0006\n\u0004\b+\u0010,R\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b-\u0010.\u001a\u0004\b/\u00100R\u0016\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u00102R\u0016\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u00104R\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b5\u00106R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b7\u00108R\u0014\u0010:\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b9\u00108R\u0017\u0010=\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b;\u0010%\u001a\u0004\b<\u0010'R\u0014\u0010A\u001a\u00020>8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b?\u0010@R$\u0010\u0018\u001a\u00020\u00022\u0006\u0010B\u001a\u00020\u00028\u0016@RX\u0096\u000e¢\u0006\f\n\u0004\bC\u0010%\u001a\u0004\bD\u0010'R\u0016\u0010F\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bE\u0010%R\u0018\u0010H\u001a\u00020\u0002*\u00020\u00068BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b$\u0010G\u0082\u0002\u000f\n\u0002\b\u0019\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u0006I"}, m29142d2 = {"Landroidx/compose/foundation/pager/MeasuredPage;", "Landroidx/compose/foundation/pager/PageInfo;", "", FirebaseAnalytics.Param.INDEX, "size", "", "Landroidx/compose/ui/layout/Placeable;", "placeables", "Landroidx/compose/ui/unit/IntOffset;", "visualOffset", "", Action.KEY_ATTRIBUTE, "Landroidx/compose/foundation/gestures/Orientation;", "orientation", "Landroidx/compose/ui/Alignment$Horizontal;", "horizontalAlignment", "Landroidx/compose/ui/Alignment$Vertical;", "verticalAlignment", "Landroidx/compose/ui/unit/LayoutDirection;", "layoutDirection", "", "reverseLayout", "<init>", "(IILjava/util/List;JLjava/lang/Object;Landroidx/compose/foundation/gestures/Orientation;Landroidx/compose/ui/Alignment$Horizontal;Landroidx/compose/ui/Alignment$Vertical;Landroidx/compose/ui/unit/LayoutDirection;ZLkotlin/jvm/internal/DefaultConstructorMarker;)V", TypedValues.CycleType.S_WAVE_OFFSET, "layoutWidth", "layoutHeight", "", "position", "(III)V", "Landroidx/compose/ui/layout/Placeable$PlacementScope;", Action.SCOPE_ATTRIBUTE, "place", "(Landroidx/compose/ui/layout/Placeable$PlacementScope;)V", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "(I)J", PDPageLabelRange.STYLE_LETTERS_LOWER, "I", "getIndex", "()I", "getSize", OperatorName.CURVE_TO, "Ljava/util/List;", "d", OperatorName.SET_LINE_CAPSTYLE, "e", "Ljava/lang/Object;", "getKey", "()Ljava/lang/Object;", OperatorName.FILL_NON_ZERO, "Landroidx/compose/ui/Alignment$Horizontal;", OperatorName.NON_STROKING_GRAY, "Landroidx/compose/ui/Alignment$Vertical;", OperatorName.CLOSE_PATH, "Landroidx/compose/ui/unit/LayoutDirection;", "i", "Z", OperatorName.SET_LINE_JOINSTYLE, "isVertical", OperatorName.NON_STROKING_CMYK, "getCrossAxisSize", "crossAxisSize", "", OperatorName.LINE_TO, "[I", "placeableOffsets", "<set-?>", OperatorName.MOVE_TO, "getOffset", OperatorName.ENDPATH, "mainAxisLayoutSize", "(Landroidx/compose/ui/layout/Placeable;)I", "mainAxisSize", "foundation_release"}, m29141k = 1, m29140mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nMeasuredPage.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MeasuredPage.kt\nandroidx/compose/foundation/pager/MeasuredPage\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 IntOffset.kt\nandroidx/compose/ui/unit/IntOffset\n*L\n1#1,119:1\n115#1:133\n33#2,6:120\n69#2,6:126\n1#3:132\n86#4:134\n*S KotlinDebug\n*F\n+ 1 MeasuredPage.kt\nandroidx/compose/foundation/pager/MeasuredPage\n*L\n98#1:133\n52#1:120,6\n76#1:126,6\n102#1:134\n*E\n"})
/* loaded from: classes.dex */
public final class MeasuredPage implements PageInfo {

    /* renamed from: a */
    public final int f13916a;

    /* renamed from: b */
    public final int f13917b;

    /* renamed from: c */
    public final List f13918c;

    /* renamed from: d */
    public final long f13919d;

    /* renamed from: e */
    public final Object f13920e;

    /* renamed from: f */
    public final Alignment.Horizontal f13921f;

    /* renamed from: g */
    public final Alignment.Vertical f13922g;

    /* renamed from: h */
    public final LayoutDirection f13923h;

    /* renamed from: i */
    public final boolean f13924i;

    /* renamed from: j */
    public final boolean f13925j;

    /* renamed from: k */
    public final int f13926k;

    /* renamed from: l */
    public final int[] f13927l;

    /* renamed from: m */
    public int f13928m;

    /* renamed from: n */
    public int f13929n;

    public /* synthetic */ MeasuredPage(int i, int i2, List list, long j, Object obj, Orientation orientation, Alignment.Horizontal horizontal, Alignment.Vertical vertical, LayoutDirection layoutDirection, boolean z, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, i2, list, j, obj, orientation, horizontal, vertical, layoutDirection, z);
    }

    /* renamed from: a */
    public final int m61077a(Placeable placeable) {
        if (this.f13925j) {
            return placeable.getHeight();
        }
        return placeable.getWidth();
    }

    /* renamed from: b */
    public final long m61076b(int i) {
        int[] iArr = this.f13927l;
        int i2 = i * 2;
        return IntOffsetKt.IntOffset(iArr[i2], iArr[i2 + 1]);
    }

    public final int getCrossAxisSize() {
        return this.f13926k;
    }

    @Override // androidx.compose.foundation.pager.PageInfo
    public int getIndex() {
        return this.f13916a;
    }

    @NotNull
    public final Object getKey() {
        return this.f13920e;
    }

    @Override // androidx.compose.foundation.pager.PageInfo
    public int getOffset() {
        return this.f13928m;
    }

    public final int getSize() {
        return this.f13917b;
    }

    public final void place(@NotNull Placeable.PlacementScope scope) {
        int m73960getXimpl;
        int m73961getYimpl;
        Intrinsics.checkNotNullParameter(scope, "scope");
        if (this.f13929n != Integer.MIN_VALUE) {
            int size = this.f13918c.size();
            for (int i = 0; i < size; i++) {
                Placeable placeable = (Placeable) this.f13918c.get(i);
                long m61076b = m61076b(i);
                if (this.f13924i) {
                    if (this.f13925j) {
                        m73960getXimpl = IntOffset.m73960getXimpl(m61076b);
                    } else {
                        m73960getXimpl = (this.f13929n - IntOffset.m73960getXimpl(m61076b)) - m61077a(placeable);
                    }
                    if (this.f13925j) {
                        m73961getYimpl = (this.f13929n - IntOffset.m73961getYimpl(m61076b)) - m61077a(placeable);
                    } else {
                        m73961getYimpl = IntOffset.m73961getYimpl(m61076b);
                    }
                    m61076b = IntOffsetKt.IntOffset(m73960getXimpl, m73961getYimpl);
                }
                long j = this.f13919d;
                long IntOffset = IntOffsetKt.IntOffset(IntOffset.m73960getXimpl(m61076b) + IntOffset.m73960getXimpl(j), IntOffset.m73961getYimpl(m61076b) + IntOffset.m73961getYimpl(j));
                if (this.f13925j) {
                    Placeable.PlacementScope.m73037placeWithLayeraW9wM$default(scope, placeable, IntOffset, 0.0f, null, 6, null);
                } else {
                    Placeable.PlacementScope.m73036placeRelativeWithLayeraW9wM$default(scope, placeable, IntOffset, 0.0f, null, 6, null);
                }
            }
            return;
        }
        throw new IllegalArgumentException("position() should be called first".toString());
    }

    public final void position(int i, int i2, int i3) {
        int i4;
        int width;
        this.f13928m = i;
        if (this.f13925j) {
            i4 = i3;
        } else {
            i4 = i2;
        }
        this.f13929n = i4;
        List list = this.f13918c;
        int size = list.size();
        for (int i5 = 0; i5 < size; i5++) {
            Placeable placeable = (Placeable) list.get(i5);
            int i6 = i5 * 2;
            if (this.f13925j) {
                int[] iArr = this.f13927l;
                Alignment.Horizontal horizontal = this.f13921f;
                if (horizontal != null) {
                    iArr[i6] = horizontal.align(placeable.getWidth(), i2, this.f13923h);
                    this.f13927l[i6 + 1] = i;
                    width = placeable.getHeight();
                } else {
                    throw new IllegalArgumentException("Required value was null.".toString());
                }
            } else {
                int[] iArr2 = this.f13927l;
                iArr2[i6] = i;
                int i7 = i6 + 1;
                Alignment.Vertical vertical = this.f13922g;
                if (vertical != null) {
                    iArr2[i7] = vertical.align(placeable.getHeight(), i3);
                    width = placeable.getWidth();
                } else {
                    throw new IllegalArgumentException("Required value was null.".toString());
                }
            }
            i += width;
        }
    }

    public MeasuredPage(int i, int i2, List placeables, long j, Object key, Orientation orientation, Alignment.Horizontal horizontal, Alignment.Vertical vertical, LayoutDirection layoutDirection, boolean z) {
        Intrinsics.checkNotNullParameter(placeables, "placeables");
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(orientation, "orientation");
        Intrinsics.checkNotNullParameter(layoutDirection, "layoutDirection");
        this.f13916a = i;
        this.f13917b = i2;
        this.f13918c = placeables;
        this.f13919d = j;
        this.f13920e = key;
        this.f13921f = horizontal;
        this.f13922g = vertical;
        this.f13923h = layoutDirection;
        this.f13924i = z;
        this.f13925j = orientation == Orientation.Vertical;
        int size = placeables.size();
        int i3 = 0;
        for (int i4 = 0; i4 < size; i4++) {
            Placeable placeable = (Placeable) placeables.get(i4);
            i3 = Math.max(i3, !this.f13925j ? placeable.getHeight() : placeable.getWidth());
        }
        this.f13926k = i3;
        this.f13927l = new int[this.f13918c.size() * 2];
        this.f13929n = Integer.MIN_VALUE;
    }
}