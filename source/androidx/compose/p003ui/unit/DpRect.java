package androidx.compose.p003ui.unit;

import androidx.compose.runtime.Immutable;
import androidx.compose.runtime.Stable;
import ch.qos.logback.core.CoreConstants;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Immutable
@Metadata(m28851d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0012\b\u0087\b\u0018\u0000 22\u00020\u0001:\u00012B*\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002ø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\bB\u001c\b\u0016\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000bø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\rJ\u0019\u0010\u0010\u001a\u00020\u0002HÆ\u0003ø\u0001\u0001ø\u0001\u0002ø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\u000fJ\u0019\u0010\u0012\u001a\u00020\u0002HÆ\u0003ø\u0001\u0001ø\u0001\u0002ø\u0001\u0000¢\u0006\u0004\b\u0011\u0010\u000fJ\u0019\u0010\u0014\u001a\u00020\u0002HÆ\u0003ø\u0001\u0001ø\u0001\u0002ø\u0001\u0000¢\u0006\u0004\b\u0013\u0010\u000fJ\u0019\u0010\u0016\u001a\u00020\u0002HÆ\u0003ø\u0001\u0001ø\u0001\u0002ø\u0001\u0000¢\u0006\u0004\b\u0015\u0010\u000fJ>\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u0002HÆ\u0001ø\u0001\u0002ø\u0001\u0000¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u001b\u001a\u00020\u001aHÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001e\u001a\u00020\u001dHÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u001a\u0010\"\u001a\u00020!2\b\u0010 \u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\"\u0010#R)\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004ø\u0001\u0000ø\u0001\u0002ø\u0001\u0001¢\u0006\u0012\n\u0004\b$\u0010%\u0012\u0004\b'\u0010(\u001a\u0004\b&\u0010\u000fR)\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004ø\u0001\u0000ø\u0001\u0002ø\u0001\u0001¢\u0006\u0012\n\u0004\b)\u0010%\u0012\u0004\b+\u0010(\u001a\u0004\b*\u0010\u000fR)\u0010\u0005\u001a\u00020\u00028\u0006X\u0087\u0004ø\u0001\u0000ø\u0001\u0002ø\u0001\u0001¢\u0006\u0012\n\u0004\b,\u0010%\u0012\u0004\b.\u0010(\u001a\u0004\b-\u0010\u000fR)\u0010\u0006\u001a\u00020\u00028\u0006X\u0087\u0004ø\u0001\u0000ø\u0001\u0002ø\u0001\u0001¢\u0006\u0012\n\u0004\b/\u0010%\u0012\u0004\b1\u0010(\u001a\u0004\b0\u0010\u000f\u0082\u0002\u000f\n\u0002\b\u0019\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u00063"}, m28850d2 = {"Landroidx/compose/ui/unit/DpRect;", "", "Landroidx/compose/ui/unit/Dp;", "left", "top", "right", "bottom", "<init>", "(FFFFLkotlin/jvm/internal/DefaultConstructorMarker;)V", "Landroidx/compose/ui/unit/DpOffset;", "origin", "Landroidx/compose/ui/unit/DpSize;", "size", "(JJLkotlin/jvm/internal/DefaultConstructorMarker;)V", "component1-D9Ej5fM", "()F", "component1", "component2-D9Ej5fM", "component2", "component3-D9Ej5fM", "component3", "component4-D9Ej5fM", "component4", "copy-a9UjIt4", "(FFFF)Landroidx/compose/ui/unit/DpRect;", "copy", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", PDPageLabelRange.STYLE_LETTERS_LOWER, "F", "getLeft-D9Ej5fM", "getLeft-D9Ej5fM$annotations", "()V", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "getTop-D9Ej5fM", "getTop-D9Ej5fM$annotations", OperatorName.CURVE_TO, "getRight-D9Ej5fM", "getRight-D9Ej5fM$annotations", "d", "getBottom-D9Ej5fM", "getBottom-D9Ej5fM$annotations", "Companion", "ui-unit_release"}, m28849k = 1, m28848mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nDp.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Dp.kt\nandroidx/compose/ui/unit/DpRect\n+ 2 Dp.kt\nandroidx/compose/ui/unit/Dp\n*L\n1#1,557:1\n51#2:558\n*S KotlinDebug\n*F\n+ 1 Dp.kt\nandroidx/compose/ui/unit/DpRect\n*L\n535#1:558\n*E\n"})
/* renamed from: androidx.compose.ui.unit.DpRect */
/* loaded from: classes2.dex */
public final class DpRect {
    public static final int $stable = 0;
    @NotNull
    public static final Companion Companion = new Companion(null);

    /* renamed from: a */
    public final float f31751a;

    /* renamed from: b */
    public final float f31752b;

    /* renamed from: c */
    public final float f31753c;

    /* renamed from: d */
    public final float f31754d;

    @Metadata(m28851d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, m28850d2 = {"Landroidx/compose/ui/unit/DpRect$Companion;", "", "()V", "ui-unit_release"}, m28849k = 1, m28848mv = {1, 8, 0}, m28846xi = 48)
    /* renamed from: androidx.compose.ui.unit.DpRect$Companion */
    /* loaded from: classes2.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }
    }

    public /* synthetic */ DpRect(float f, float f2, float f3, float f4, DefaultConstructorMarker defaultConstructorMarker) {
        this(f, f2, f3, f4);
    }

    /* renamed from: copy-a9UjIt4$default */
    public static /* synthetic */ DpRect m73730copya9UjIt4$default(DpRect dpRect, float f, float f2, float f3, float f4, int i, Object obj) {
        if ((i & 1) != 0) {
            f = dpRect.f31751a;
        }
        if ((i & 2) != 0) {
            f2 = dpRect.f31752b;
        }
        if ((i & 4) != 0) {
            f3 = dpRect.f31753c;
        }
        if ((i & 8) != 0) {
            f4 = dpRect.f31754d;
        }
        return dpRect.m73739copya9UjIt4(f, f2, f3, f4);
    }

    @Stable
    /* renamed from: getBottom-D9Ej5fM$annotations */
    public static /* synthetic */ void m73731getBottomD9Ej5fM$annotations() {
    }

    @Stable
    /* renamed from: getLeft-D9Ej5fM$annotations */
    public static /* synthetic */ void m73732getLeftD9Ej5fM$annotations() {
    }

    @Stable
    /* renamed from: getRight-D9Ej5fM$annotations */
    public static /* synthetic */ void m73733getRightD9Ej5fM$annotations() {
    }

    @Stable
    /* renamed from: getTop-D9Ej5fM$annotations */
    public static /* synthetic */ void m73734getTopD9Ej5fM$annotations() {
    }

    /* renamed from: component1-D9Ej5fM */
    public final float m73735component1D9Ej5fM() {
        return this.f31751a;
    }

    /* renamed from: component2-D9Ej5fM */
    public final float m73736component2D9Ej5fM() {
        return this.f31752b;
    }

    /* renamed from: component3-D9Ej5fM */
    public final float m73737component3D9Ej5fM() {
        return this.f31753c;
    }

    /* renamed from: component4-D9Ej5fM */
    public final float m73738component4D9Ej5fM() {
        return this.f31754d;
    }

    @NotNull
    /* renamed from: copy-a9UjIt4 */
    public final DpRect m73739copya9UjIt4(float f, float f2, float f3, float f4) {
        return new DpRect(f, f2, f3, f4, null);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof DpRect) {
            DpRect dpRect = (DpRect) obj;
            return C3641Dp.m73663equalsimpl0(this.f31751a, dpRect.f31751a) && C3641Dp.m73663equalsimpl0(this.f31752b, dpRect.f31752b) && C3641Dp.m73663equalsimpl0(this.f31753c, dpRect.f31753c) && C3641Dp.m73663equalsimpl0(this.f31754d, dpRect.f31754d);
        }
        return false;
    }

    /* renamed from: getBottom-D9Ej5fM */
    public final float m73740getBottomD9Ej5fM() {
        return this.f31754d;
    }

    /* renamed from: getLeft-D9Ej5fM */
    public final float m73741getLeftD9Ej5fM() {
        return this.f31751a;
    }

    /* renamed from: getRight-D9Ej5fM */
    public final float m73742getRightD9Ej5fM() {
        return this.f31753c;
    }

    /* renamed from: getTop-D9Ej5fM */
    public final float m73743getTopD9Ej5fM() {
        return this.f31752b;
    }

    public int hashCode() {
        return (((((C3641Dp.m73664hashCodeimpl(this.f31751a) * 31) + C3641Dp.m73664hashCodeimpl(this.f31752b)) * 31) + C3641Dp.m73664hashCodeimpl(this.f31753c)) * 31) + C3641Dp.m73664hashCodeimpl(this.f31754d);
    }

    @NotNull
    public String toString() {
        return "DpRect(left=" + ((Object) C3641Dp.m73669toStringimpl(this.f31751a)) + ", top=" + ((Object) C3641Dp.m73669toStringimpl(this.f31752b)) + ", right=" + ((Object) C3641Dp.m73669toStringimpl(this.f31753c)) + ", bottom=" + ((Object) C3641Dp.m73669toStringimpl(this.f31754d)) + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }

    public /* synthetic */ DpRect(long j, long j2, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, j2);
    }

    public DpRect(float f, float f2, float f3, float f4) {
        this.f31751a = f;
        this.f31752b = f2;
        this.f31753c = f3;
        this.f31754d = f4;
    }

    public DpRect(long j, long j2) {
        this(DpOffset.m73719getXD9Ej5fM(j), DpOffset.m73721getYD9Ej5fM(j), C3641Dp.m73658constructorimpl(DpOffset.m73719getXD9Ej5fM(j) + DpSize.m73756getWidthD9Ej5fM(j2)), C3641Dp.m73658constructorimpl(DpOffset.m73721getYD9Ej5fM(j) + DpSize.m73754getHeightD9Ej5fM(j2)), null);
    }
}
