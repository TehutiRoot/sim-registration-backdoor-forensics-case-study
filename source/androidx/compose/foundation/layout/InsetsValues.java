package androidx.compose.foundation.layout;

import androidx.compose.runtime.Immutable;
import ch.qos.logback.core.CoreConstants;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Immutable
@Metadata(m28851d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\f\b\u0001\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u001a\u0010\u000b\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u000eR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0013\u001a\u0004\b\u0016\u0010\u000eR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0013\u001a\u0004\b\u0018\u0010\u000eR\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0013\u001a\u0004\b\u001a\u0010\u000e¨\u0006\u001b"}, m28850d2 = {"Landroidx/compose/foundation/layout/InsetsValues;", "", "", "left", "top", "right", "bottom", "<init>", "(IIII)V", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", PDPageLabelRange.STYLE_LETTERS_LOWER, "I", "getLeft", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "getTop", OperatorName.CURVE_TO, "getRight", "d", "getBottom", "foundation-layout_release"}, m28849k = 1, m28848mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class InsetsValues {

    /* renamed from: a */
    public final int f13161a;

    /* renamed from: b */
    public final int f13162b;

    /* renamed from: c */
    public final int f13163c;

    /* renamed from: d */
    public final int f13164d;

    public InsetsValues(int i, int i2, int i3, int i4) {
        this.f13161a = i;
        this.f13162b = i2;
        this.f13163c = i3;
        this.f13164d = i4;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof InsetsValues)) {
            return false;
        }
        InsetsValues insetsValues = (InsetsValues) obj;
        if (this.f13161a == insetsValues.f13161a && this.f13162b == insetsValues.f13162b && this.f13163c == insetsValues.f13163c && this.f13164d == insetsValues.f13164d) {
            return true;
        }
        return false;
    }

    public final int getBottom() {
        return this.f13164d;
    }

    public final int getLeft() {
        return this.f13161a;
    }

    public final int getRight() {
        return this.f13163c;
    }

    public final int getTop() {
        return this.f13162b;
    }

    public int hashCode() {
        return (((((this.f13161a * 31) + this.f13162b) * 31) + this.f13163c) * 31) + this.f13164d;
    }

    @NotNull
    public String toString() {
        return "InsetsValues(left=" + this.f13161a + ", top=" + this.f13162b + ", right=" + this.f13163c + ", bottom=" + this.f13164d + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }
}
