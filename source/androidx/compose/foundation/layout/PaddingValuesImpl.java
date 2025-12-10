package androidx.compose.foundation.layout;

import androidx.compose.p003ui.unit.C3641Dp;
import androidx.compose.p003ui.unit.LayoutDirection;
import androidx.compose.runtime.Immutable;
import androidx.compose.runtime.Stable;
import ch.qos.logback.core.CoreConstants;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Immutable
@Metadata(m28851d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0011\b\u0001\u0018\u00002\u00020\u0001B2\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0002ø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\bJ \u0010\r\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tH\u0016ø\u0001\u0001ø\u0001\u0002ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\fJ\u0018\u0010\u0010\u001a\u00020\u0002H\u0016ø\u0001\u0001ø\u0001\u0002ø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\u000fJ \u0010\u0012\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tH\u0016ø\u0001\u0001ø\u0001\u0002ø\u0001\u0000¢\u0006\u0004\b\u0011\u0010\fJ\u0018\u0010\u0014\u001a\u00020\u0002H\u0016ø\u0001\u0001ø\u0001\u0002ø\u0001\u0000¢\u0006\u0004\b\u0013\u0010\u000fJ\u001a\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015H\u0096\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001b\u001a\u00020\u001aH\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001e\u001a\u00020\u001dH\u0016¢\u0006\u0004\b\u001e\u0010\u001fR)\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004ø\u0001\u0000ø\u0001\u0002ø\u0001\u0001¢\u0006\u0012\n\u0004\b \u0010!\u0012\u0004\b#\u0010$\u001a\u0004\b\"\u0010\u000fR)\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004ø\u0001\u0000ø\u0001\u0002ø\u0001\u0001¢\u0006\u0012\n\u0004\b%\u0010!\u0012\u0004\b'\u0010$\u001a\u0004\b&\u0010\u000fR)\u0010\u0005\u001a\u00020\u00028\u0006X\u0087\u0004ø\u0001\u0000ø\u0001\u0002ø\u0001\u0001¢\u0006\u0012\n\u0004\b(\u0010!\u0012\u0004\b*\u0010$\u001a\u0004\b)\u0010\u000fR)\u0010\u0006\u001a\u00020\u00028\u0006X\u0087\u0004ø\u0001\u0000ø\u0001\u0002ø\u0001\u0001¢\u0006\u0012\n\u0004\b+\u0010!\u0012\u0004\b-\u0010$\u001a\u0004\b,\u0010\u000f\u0082\u0002\u000f\n\u0002\b\u0019\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u0006."}, m28850d2 = {"Landroidx/compose/foundation/layout/PaddingValuesImpl;", "Landroidx/compose/foundation/layout/PaddingValues;", "Landroidx/compose/ui/unit/Dp;", "start", "top", "end", "bottom", "<init>", "(FFFFLkotlin/jvm/internal/DefaultConstructorMarker;)V", "Landroidx/compose/ui/unit/LayoutDirection;", "layoutDirection", "calculateLeftPadding-u2uoSUM", "(Landroidx/compose/ui/unit/LayoutDirection;)F", "calculateLeftPadding", "calculateTopPadding-D9Ej5fM", "()F", "calculateTopPadding", "calculateRightPadding-u2uoSUM", "calculateRightPadding", "calculateBottomPadding-D9Ej5fM", "calculateBottomPadding", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", PDPageLabelRange.STYLE_LETTERS_LOWER, "F", "getStart-D9Ej5fM", "getStart-D9Ej5fM$annotations", "()V", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "getTop-D9Ej5fM", "getTop-D9Ej5fM$annotations", OperatorName.CURVE_TO, "getEnd-D9Ej5fM", "getEnd-D9Ej5fM$annotations", "d", "getBottom-D9Ej5fM", "getBottom-D9Ej5fM$annotations", "foundation-layout_release"}, m28849k = 1, m28848mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nPadding.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Padding.kt\nandroidx/compose/foundation/layout/PaddingValuesImpl\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,467:1\n154#2:468\n154#2:469\n154#2:470\n154#2:471\n*S KotlinDebug\n*F\n+ 1 Padding.kt\nandroidx/compose/foundation/layout/PaddingValuesImpl\n*L\n294#1:468\n296#1:469\n298#1:470\n300#1:471\n*E\n"})
/* loaded from: classes.dex */
public final class PaddingValuesImpl implements PaddingValues {

    /* renamed from: a */
    public final float f13213a;

    /* renamed from: b */
    public final float f13214b;

    /* renamed from: c */
    public final float f13215c;

    /* renamed from: d */
    public final float f13216d;

    public /* synthetic */ PaddingValuesImpl(float f, float f2, float f3, float f4, DefaultConstructorMarker defaultConstructorMarker) {
        this(f, f2, f3, f4);
    }

    @Stable
    /* renamed from: getBottom-D9Ej5fM$annotations  reason: not valid java name */
    public static /* synthetic */ void m69534getBottomD9Ej5fM$annotations() {
    }

    @Stable
    /* renamed from: getEnd-D9Ej5fM$annotations  reason: not valid java name */
    public static /* synthetic */ void m69535getEndD9Ej5fM$annotations() {
    }

    @Stable
    /* renamed from: getStart-D9Ej5fM$annotations  reason: not valid java name */
    public static /* synthetic */ void m69536getStartD9Ej5fM$annotations() {
    }

    @Stable
    /* renamed from: getTop-D9Ej5fM$annotations  reason: not valid java name */
    public static /* synthetic */ void m69537getTopD9Ej5fM$annotations() {
    }

    @Override // androidx.compose.foundation.layout.PaddingValues
    /* renamed from: calculateBottomPadding-D9Ej5fM */
    public float mo69156calculateBottomPaddingD9Ej5fM() {
        return this.f13216d;
    }

    @Override // androidx.compose.foundation.layout.PaddingValues
    /* renamed from: calculateLeftPadding-u2uoSUM */
    public float mo69157calculateLeftPaddingu2uoSUM(@NotNull LayoutDirection layoutDirection) {
        Intrinsics.checkNotNullParameter(layoutDirection, "layoutDirection");
        if (layoutDirection == LayoutDirection.Ltr) {
            return this.f13213a;
        }
        return this.f13215c;
    }

    @Override // androidx.compose.foundation.layout.PaddingValues
    /* renamed from: calculateRightPadding-u2uoSUM */
    public float mo69158calculateRightPaddingu2uoSUM(@NotNull LayoutDirection layoutDirection) {
        Intrinsics.checkNotNullParameter(layoutDirection, "layoutDirection");
        if (layoutDirection == LayoutDirection.Ltr) {
            return this.f13215c;
        }
        return this.f13213a;
    }

    @Override // androidx.compose.foundation.layout.PaddingValues
    /* renamed from: calculateTopPadding-D9Ej5fM */
    public float mo69159calculateTopPaddingD9Ej5fM() {
        return this.f13214b;
    }

    public boolean equals(@Nullable Object obj) {
        if (!(obj instanceof PaddingValuesImpl)) {
            return false;
        }
        PaddingValuesImpl paddingValuesImpl = (PaddingValuesImpl) obj;
        if (!C3641Dp.m73663equalsimpl0(this.f13213a, paddingValuesImpl.f13213a) || !C3641Dp.m73663equalsimpl0(this.f13214b, paddingValuesImpl.f13214b) || !C3641Dp.m73663equalsimpl0(this.f13215c, paddingValuesImpl.f13215c) || !C3641Dp.m73663equalsimpl0(this.f13216d, paddingValuesImpl.f13216d)) {
            return false;
        }
        return true;
    }

    /* renamed from: getBottom-D9Ej5fM  reason: not valid java name */
    public final float m69538getBottomD9Ej5fM() {
        return this.f13216d;
    }

    /* renamed from: getEnd-D9Ej5fM  reason: not valid java name */
    public final float m69539getEndD9Ej5fM() {
        return this.f13215c;
    }

    /* renamed from: getStart-D9Ej5fM  reason: not valid java name */
    public final float m69540getStartD9Ej5fM() {
        return this.f13213a;
    }

    /* renamed from: getTop-D9Ej5fM  reason: not valid java name */
    public final float m69541getTopD9Ej5fM() {
        return this.f13214b;
    }

    public int hashCode() {
        return (((((C3641Dp.m73664hashCodeimpl(this.f13213a) * 31) + C3641Dp.m73664hashCodeimpl(this.f13214b)) * 31) + C3641Dp.m73664hashCodeimpl(this.f13215c)) * 31) + C3641Dp.m73664hashCodeimpl(this.f13216d);
    }

    @NotNull
    public String toString() {
        return "PaddingValues(start=" + ((Object) C3641Dp.m73669toStringimpl(this.f13213a)) + ", top=" + ((Object) C3641Dp.m73669toStringimpl(this.f13214b)) + ", end=" + ((Object) C3641Dp.m73669toStringimpl(this.f13215c)) + ", bottom=" + ((Object) C3641Dp.m73669toStringimpl(this.f13216d)) + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }

    public PaddingValuesImpl(float f, float f2, float f3, float f4) {
        this.f13213a = f;
        this.f13214b = f2;
        this.f13215c = f3;
        this.f13216d = f4;
    }

    public /* synthetic */ PaddingValuesImpl(float f, float f2, float f3, float f4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? C3641Dp.m73658constructorimpl(0) : f, (i & 2) != 0 ? C3641Dp.m73658constructorimpl(0) : f2, (i & 4) != 0 ? C3641Dp.m73658constructorimpl(0) : f3, (i & 8) != 0 ? C3641Dp.m73658constructorimpl(0) : f4, null);
    }
}
