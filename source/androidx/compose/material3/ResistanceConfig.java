package androidx.compose.material3;

import androidx.compose.runtime.Immutable;
import ch.qos.logback.core.CoreConstants;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.ranges.AbstractC11719c;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Immutable
@Metadata(m28851d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0007\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0001\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\t\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0016\u001a\u0004\b\u001a\u0010\u0018R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u0016\u001a\u0004\b\u001c\u0010\u0018¨\u0006\u001d"}, m28850d2 = {"Landroidx/compose/material3/ResistanceConfig;", "", "", "basis", "factorAtMin", "factorAtMax", "<init>", "(FFF)V", "overflow", "computeResistance", "(F)F", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", PDPageLabelRange.STYLE_LETTERS_LOWER, "F", "getBasis", "()F", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "getFactorAtMin", OperatorName.CURVE_TO, "getFactorAtMax", "material3_release"}, m28849k = 1, m28848mv = {1, 8, 0})
/* loaded from: classes2.dex */
public final class ResistanceConfig {

    /* renamed from: a */
    public final float f25976a;

    /* renamed from: b */
    public final float f25977b;

    /* renamed from: c */
    public final float f25978c;

    public ResistanceConfig(float f, float f2, float f3) {
        this.f25976a = f;
        this.f25977b = f2;
        this.f25978c = f3;
    }

    public final float computeResistance(float f) {
        float f2;
        if (f < 0.0f) {
            f2 = this.f25977b;
        } else {
            f2 = this.f25978c;
        }
        if (f2 == 0.0f) {
            return 0.0f;
        }
        return (this.f25976a / f2) * ((float) Math.sin((AbstractC11719c.coerceIn(f / this.f25976a, -1.0f, 1.0f) * 3.1415927f) / 2));
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ResistanceConfig)) {
            return false;
        }
        ResistanceConfig resistanceConfig = (ResistanceConfig) obj;
        if (this.f25976a == resistanceConfig.f25976a && this.f25977b == resistanceConfig.f25977b && this.f25978c == resistanceConfig.f25978c) {
            return true;
        }
        return false;
    }

    public final float getBasis() {
        return this.f25976a;
    }

    public final float getFactorAtMax() {
        return this.f25978c;
    }

    public final float getFactorAtMin() {
        return this.f25977b;
    }

    public int hashCode() {
        return (((Float.floatToIntBits(this.f25976a) * 31) + Float.floatToIntBits(this.f25977b)) * 31) + Float.floatToIntBits(this.f25978c);
    }

    @NotNull
    public String toString() {
        return "ResistanceConfig(basis=" + this.f25976a + ", factorAtMin=" + this.f25977b + ", factorAtMax=" + this.f25978c + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }

    public /* synthetic */ ResistanceConfig(float f, float f2, float f3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(f, (i & 2) != 0 ? 10.0f : f2, (i & 4) != 0 ? 10.0f : f3);
    }
}
