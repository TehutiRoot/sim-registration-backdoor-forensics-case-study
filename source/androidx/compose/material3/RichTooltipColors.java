package androidx.compose.material3;

import androidx.compose.p003ui.graphics.Color;
import androidx.compose.runtime.Immutable;
import androidx.compose.runtime.Stable;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.Nullable;

@ExperimentalMaterial3Api
@Metadata(m28851d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\r\b\u0007\u0018\u00002\u00020\u0001B*\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002ø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\bJ\u001a\u0010\u000b\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000fR \u0010\u0003\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R \u0010\u0004\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\u0014\u0010\u0011\u001a\u0004\b\u0015\u0010\u0013R \u0010\u0005\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\u0016\u0010\u0011\u001a\u0004\b\u0017\u0010\u0013R \u0010\u0006\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\u0018\u0010\u0011\u001a\u0004\b\u0019\u0010\u0013\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u001a"}, m28850d2 = {"Landroidx/compose/material3/RichTooltipColors;", "", "Landroidx/compose/ui/graphics/Color;", "containerColor", "contentColor", "titleContentColor", "actionContentColor", "<init>", "(JJJJLkotlin/jvm/internal/DefaultConstructorMarker;)V", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", PDPageLabelRange.STYLE_LETTERS_LOWER, OperatorName.SET_LINE_CAPSTYLE, "getContainerColor-0d7_KjU", "()J", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "getContentColor-0d7_KjU", OperatorName.CURVE_TO, "getTitleContentColor-0d7_KjU", "d", "getActionContentColor-0d7_KjU", "material3_release"}, m28849k = 1, m28848mv = {1, 8, 0})
@Stable
@Immutable
/* loaded from: classes2.dex */
public final class RichTooltipColors {
    public static final int $stable = 0;

    /* renamed from: a */
    public final long f25979a;

    /* renamed from: b */
    public final long f25980b;

    /* renamed from: c */
    public final long f25981c;

    /* renamed from: d */
    public final long f25982d;

    public /* synthetic */ RichTooltipColors(long j, long j2, long j3, long j4, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, j2, j3, j4);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RichTooltipColors)) {
            return false;
        }
        RichTooltipColors richTooltipColors = (RichTooltipColors) obj;
        if (Color.m71736equalsimpl0(this.f25979a, richTooltipColors.f25979a) && Color.m71736equalsimpl0(this.f25980b, richTooltipColors.f25980b) && Color.m71736equalsimpl0(this.f25981c, richTooltipColors.f25981c) && Color.m71736equalsimpl0(this.f25982d, richTooltipColors.f25982d)) {
            return true;
        }
        return false;
    }

    /* renamed from: getActionContentColor-0d7_KjU  reason: not valid java name */
    public final long m70513getActionContentColor0d7_KjU() {
        return this.f25982d;
    }

    /* renamed from: getContainerColor-0d7_KjU  reason: not valid java name */
    public final long m70514getContainerColor0d7_KjU() {
        return this.f25979a;
    }

    /* renamed from: getContentColor-0d7_KjU  reason: not valid java name */
    public final long m70515getContentColor0d7_KjU() {
        return this.f25980b;
    }

    /* renamed from: getTitleContentColor-0d7_KjU  reason: not valid java name */
    public final long m70516getTitleContentColor0d7_KjU() {
        return this.f25981c;
    }

    public int hashCode() {
        return (((((Color.m71742hashCodeimpl(this.f25979a) * 31) + Color.m71742hashCodeimpl(this.f25980b)) * 31) + Color.m71742hashCodeimpl(this.f25981c)) * 31) + Color.m71742hashCodeimpl(this.f25982d);
    }

    public RichTooltipColors(long j, long j2, long j3, long j4) {
        this.f25979a = j;
        this.f25980b = j2;
        this.f25981c = j3;
        this.f25982d = j4;
    }
}
