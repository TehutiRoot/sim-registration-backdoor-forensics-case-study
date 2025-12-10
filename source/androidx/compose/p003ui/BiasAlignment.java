package androidx.compose.p003ui;

import androidx.compose.p003ui.Alignment;
import androidx.compose.p003ui.unit.IntOffsetKt;
import androidx.compose.p003ui.unit.IntSize;
import androidx.compose.p003ui.unit.LayoutDirection;
import androidx.compose.runtime.Immutable;
import ch.qos.logback.core.CoreConstants;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Immutable
@Metadata(m28851d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001:\u0002%&B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J-\u0010\u000f\u001a\u00020\f2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\nH\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0011J$\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u001a\u0010\u001e\u001a\u00020\u001d2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001bHÖ\u0003¢\u0006\u0004\b\u001e\u0010\u001fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010\u0011R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b#\u0010!\u001a\u0004\b$\u0010\u0011\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006'"}, m28850d2 = {"Landroidx/compose/ui/BiasAlignment;", "Landroidx/compose/ui/Alignment;", "", "horizontalBias", "verticalBias", "<init>", "(FF)V", "Landroidx/compose/ui/unit/IntSize;", "size", "space", "Landroidx/compose/ui/unit/LayoutDirection;", "layoutDirection", "Landroidx/compose/ui/unit/IntOffset;", "align-KFBX0sM", "(JJLandroidx/compose/ui/unit/LayoutDirection;)J", "align", "component1", "()F", "component2", "copy", "(FF)Landroidx/compose/ui/BiasAlignment;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", PDPageLabelRange.STYLE_LETTERS_LOWER, "F", "getHorizontalBias", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "getVerticalBias", "Horizontal", "Vertical", "ui_release"}, m28849k = 1, m28848mv = {1, 8, 0})
/* renamed from: androidx.compose.ui.BiasAlignment */
/* loaded from: classes2.dex */
public final class BiasAlignment implements Alignment {
    public static final int $stable = 0;

    /* renamed from: a */
    public final float f28837a;

    /* renamed from: b */
    public final float f28838b;

    @Immutable
    @Metadata(m28851d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J'\u0010\u000b\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001a¨\u0006\u001b"}, m28850d2 = {"Landroidx/compose/ui/BiasAlignment$Horizontal;", "Landroidx/compose/ui/Alignment$Horizontal;", "", "bias", "<init>", "(F)V", "", "size", "space", "Landroidx/compose/ui/unit/LayoutDirection;", "layoutDirection", "align", "(IILandroidx/compose/ui/unit/LayoutDirection;)I", "copy", "(F)Landroidx/compose/ui/BiasAlignment$Horizontal;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", PDPageLabelRange.STYLE_LETTERS_LOWER, "F", "ui_release"}, m28849k = 1, m28848mv = {1, 8, 0})
    /* renamed from: androidx.compose.ui.BiasAlignment$Horizontal */
    /* loaded from: classes2.dex */
    public static final class Horizontal implements Alignment.Horizontal {
        public static final int $stable = 0;

        /* renamed from: a */
        public final float f28839a;

        public Horizontal(float f) {
            this.f28839a = f;
        }

        public static /* synthetic */ Horizontal copy$default(Horizontal horizontal, float f, int i, Object obj) {
            if ((i & 1) != 0) {
                f = horizontal.f28839a;
            }
            return horizontal.copy(f);
        }

        @Override // androidx.compose.p003ui.Alignment.Horizontal
        public int align(int i, int i2, @NotNull LayoutDirection layoutDirection) {
            float f;
            Intrinsics.checkNotNullParameter(layoutDirection, "layoutDirection");
            float f2 = (i2 - i) / 2.0f;
            if (layoutDirection == LayoutDirection.Ltr) {
                f = this.f28839a;
            } else {
                f = (-1) * this.f28839a;
            }
            return AbstractC21140mr0.roundToInt(f2 * (1 + f));
        }

        @NotNull
        public final Horizontal copy(float f) {
            return new Horizontal(f);
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Horizontal) && Float.compare(this.f28839a, ((Horizontal) obj).f28839a) == 0;
        }

        public int hashCode() {
            return Float.floatToIntBits(this.f28839a);
        }

        @NotNull
        public String toString() {
            return "Horizontal(bias=" + this.f28839a + CoreConstants.RIGHT_PARENTHESIS_CHAR;
        }
    }

    @Immutable
    @Metadata(m28851d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\t\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, m28850d2 = {"Landroidx/compose/ui/BiasAlignment$Vertical;", "Landroidx/compose/ui/Alignment$Vertical;", "", "bias", "<init>", "(F)V", "", "size", "space", "align", "(II)I", "copy", "(F)Landroidx/compose/ui/BiasAlignment$Vertical;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", PDPageLabelRange.STYLE_LETTERS_LOWER, "F", "ui_release"}, m28849k = 1, m28848mv = {1, 8, 0})
    /* renamed from: androidx.compose.ui.BiasAlignment$Vertical */
    /* loaded from: classes2.dex */
    public static final class Vertical implements Alignment.Vertical {
        public static final int $stable = 0;

        /* renamed from: a */
        public final float f28840a;

        public Vertical(float f) {
            this.f28840a = f;
        }

        public static /* synthetic */ Vertical copy$default(Vertical vertical, float f, int i, Object obj) {
            if ((i & 1) != 0) {
                f = vertical.f28840a;
            }
            return vertical.copy(f);
        }

        @Override // androidx.compose.p003ui.Alignment.Vertical
        public int align(int i, int i2) {
            return AbstractC21140mr0.roundToInt(((i2 - i) / 2.0f) * (1 + this.f28840a));
        }

        @NotNull
        public final Vertical copy(float f) {
            return new Vertical(f);
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Vertical) && Float.compare(this.f28840a, ((Vertical) obj).f28840a) == 0;
        }

        public int hashCode() {
            return Float.floatToIntBits(this.f28840a);
        }

        @NotNull
        public String toString() {
            return "Vertical(bias=" + this.f28840a + CoreConstants.RIGHT_PARENTHESIS_CHAR;
        }
    }

    public BiasAlignment(float f, float f2) {
        this.f28837a = f;
        this.f28838b = f2;
    }

    public static /* synthetic */ BiasAlignment copy$default(BiasAlignment biasAlignment, float f, float f2, int i, Object obj) {
        if ((i & 1) != 0) {
            f = biasAlignment.f28837a;
        }
        if ((i & 2) != 0) {
            f2 = biasAlignment.f28838b;
        }
        return biasAlignment.copy(f, f2);
    }

    @Override // androidx.compose.p003ui.Alignment
    /* renamed from: align-KFBX0sM */
    public long mo71407alignKFBX0sM(long j, long j2, @NotNull LayoutDirection layoutDirection) {
        float f;
        Intrinsics.checkNotNullParameter(layoutDirection, "layoutDirection");
        float m73818getWidthimpl = (IntSize.m73818getWidthimpl(j2) - IntSize.m73818getWidthimpl(j)) / 2.0f;
        float m73817getHeightimpl = (IntSize.m73817getHeightimpl(j2) - IntSize.m73817getHeightimpl(j)) / 2.0f;
        if (layoutDirection == LayoutDirection.Ltr) {
            f = this.f28837a;
        } else {
            f = (-1) * this.f28837a;
        }
        float f2 = 1;
        return IntOffsetKt.IntOffset(AbstractC21140mr0.roundToInt(m73818getWidthimpl * (f + f2)), AbstractC21140mr0.roundToInt(m73817getHeightimpl * (f2 + this.f28838b)));
    }

    public final float component1() {
        return this.f28837a;
    }

    public final float component2() {
        return this.f28838b;
    }

    @NotNull
    public final BiasAlignment copy(float f, float f2) {
        return new BiasAlignment(f, f2);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof BiasAlignment) {
            BiasAlignment biasAlignment = (BiasAlignment) obj;
            return Float.compare(this.f28837a, biasAlignment.f28837a) == 0 && Float.compare(this.f28838b, biasAlignment.f28838b) == 0;
        }
        return false;
    }

    public final float getHorizontalBias() {
        return this.f28837a;
    }

    public final float getVerticalBias() {
        return this.f28838b;
    }

    public int hashCode() {
        return (Float.floatToIntBits(this.f28837a) * 31) + Float.floatToIntBits(this.f28838b);
    }

    @NotNull
    public String toString() {
        return "BiasAlignment(horizontalBias=" + this.f28837a + ", verticalBias=" + this.f28838b + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }
}
