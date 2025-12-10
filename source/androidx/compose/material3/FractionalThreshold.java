package androidx.compose.material3;

import androidx.compose.p003ui.unit.Density;
import androidx.compose.p003ui.util.MathHelpersKt;
import androidx.compose.runtime.Immutable;
import ch.qos.logback.core.CoreConstants;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Immutable
@ExperimentalMaterial3Api
@Metadata(m28851d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0081\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J#\u0010\t\u001a\u00020\u0002*\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019¨\u0006\u001a"}, m28850d2 = {"Landroidx/compose/material3/FractionalThreshold;", "Landroidx/compose/material3/ThresholdConfig;", "", "fraction", "<init>", "(F)V", "Landroidx/compose/ui/unit/Density;", "fromValue", "toValue", "computeThreshold", "(Landroidx/compose/ui/unit/Density;FF)F", "copy", "(F)Landroidx/compose/material3/FractionalThreshold;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", PDPageLabelRange.STYLE_LETTERS_LOWER, "F", "material3_release"}, m28849k = 1, m28848mv = {1, 8, 0})
/* loaded from: classes2.dex */
public final class FractionalThreshold implements ThresholdConfig {

    /* renamed from: a */
    public final float f25813a;

    public FractionalThreshold(float f) {
        this.f25813a = f;
    }

    public static /* synthetic */ FractionalThreshold copy$default(FractionalThreshold fractionalThreshold, float f, int i, Object obj) {
        if ((i & 1) != 0) {
            f = fractionalThreshold.f25813a;
        }
        return fractionalThreshold.copy(f);
    }

    @Override // androidx.compose.material3.ThresholdConfig
    public float computeThreshold(@NotNull Density density, float f, float f2) {
        Intrinsics.checkNotNullParameter(density, "<this>");
        return MathHelpersKt.lerp(f, f2, this.f25813a);
    }

    @NotNull
    public final FractionalThreshold copy(float f) {
        return new FractionalThreshold(f);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof FractionalThreshold) && Float.compare(this.f25813a, ((FractionalThreshold) obj).f25813a) == 0;
    }

    public int hashCode() {
        return Float.floatToIntBits(this.f25813a);
    }

    @NotNull
    public String toString() {
        return "FractionalThreshold(fraction=" + this.f25813a + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }
}
