package androidx.compose.foundation.layout;

import ch.qos.logback.core.CoreConstants;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(m28851d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0015\b\u0080\b\u0018\u00002\u00020\u0001B'\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ0\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u0019\u001a\u00020\u00042\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aR\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u000b\"\u0004\b\u001e\u0010\u001fR\"\u0010\u0005\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b \u0010!\u001a\u0004\b\"\u0010\r\"\u0004\b#\u0010$R$\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b%\u0010&\u001a\u0004\b'\u0010\u000f\"\u0004\b(\u0010)¨\u0006*"}, m28850d2 = {"Landroidx/compose/foundation/layout/RowColumnParentData;", "", "", "weight", "", "fill", "Landroidx/compose/foundation/layout/CrossAxisAlignment;", "crossAxisAlignment", "<init>", "(FZLandroidx/compose/foundation/layout/CrossAxisAlignment;)V", "component1", "()F", "component2", "()Z", "component3", "()Landroidx/compose/foundation/layout/CrossAxisAlignment;", "copy", "(FZLandroidx/compose/foundation/layout/CrossAxisAlignment;)Landroidx/compose/foundation/layout/RowColumnParentData;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", PDPageLabelRange.STYLE_LETTERS_LOWER, "F", "getWeight", "setWeight", "(F)V", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "Z", "getFill", "setFill", "(Z)V", OperatorName.CURVE_TO, "Landroidx/compose/foundation/layout/CrossAxisAlignment;", "getCrossAxisAlignment", "setCrossAxisAlignment", "(Landroidx/compose/foundation/layout/CrossAxisAlignment;)V", "foundation-layout_release"}, m28849k = 1, m28848mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class RowColumnParentData {

    /* renamed from: a */
    public float f13237a;

    /* renamed from: b */
    public boolean f13238b;

    /* renamed from: c */
    public CrossAxisAlignment f13239c;

    public RowColumnParentData() {
        this(0.0f, false, null, 7, null);
    }

    public static /* synthetic */ RowColumnParentData copy$default(RowColumnParentData rowColumnParentData, float f, boolean z, CrossAxisAlignment crossAxisAlignment, int i, Object obj) {
        if ((i & 1) != 0) {
            f = rowColumnParentData.f13237a;
        }
        if ((i & 2) != 0) {
            z = rowColumnParentData.f13238b;
        }
        if ((i & 4) != 0) {
            crossAxisAlignment = rowColumnParentData.f13239c;
        }
        return rowColumnParentData.copy(f, z, crossAxisAlignment);
    }

    public final float component1() {
        return this.f13237a;
    }

    public final boolean component2() {
        return this.f13238b;
    }

    @Nullable
    public final CrossAxisAlignment component3() {
        return this.f13239c;
    }

    @NotNull
    public final RowColumnParentData copy(float f, boolean z, @Nullable CrossAxisAlignment crossAxisAlignment) {
        return new RowColumnParentData(f, z, crossAxisAlignment);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof RowColumnParentData) {
            RowColumnParentData rowColumnParentData = (RowColumnParentData) obj;
            return Float.compare(this.f13237a, rowColumnParentData.f13237a) == 0 && this.f13238b == rowColumnParentData.f13238b && Intrinsics.areEqual(this.f13239c, rowColumnParentData.f13239c);
        }
        return false;
    }

    @Nullable
    public final CrossAxisAlignment getCrossAxisAlignment() {
        return this.f13239c;
    }

    public final boolean getFill() {
        return this.f13238b;
    }

    public final float getWeight() {
        return this.f13237a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode;
        int floatToIntBits = Float.floatToIntBits(this.f13237a) * 31;
        boolean z = this.f13238b;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        int i2 = (floatToIntBits + i) * 31;
        CrossAxisAlignment crossAxisAlignment = this.f13239c;
        if (crossAxisAlignment == null) {
            hashCode = 0;
        } else {
            hashCode = crossAxisAlignment.hashCode();
        }
        return i2 + hashCode;
    }

    public final void setCrossAxisAlignment(@Nullable CrossAxisAlignment crossAxisAlignment) {
        this.f13239c = crossAxisAlignment;
    }

    public final void setFill(boolean z) {
        this.f13238b = z;
    }

    public final void setWeight(float f) {
        this.f13237a = f;
    }

    @NotNull
    public String toString() {
        return "RowColumnParentData(weight=" + this.f13237a + ", fill=" + this.f13238b + ", crossAxisAlignment=" + this.f13239c + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }

    public RowColumnParentData(float f, boolean z, @Nullable CrossAxisAlignment crossAxisAlignment) {
        this.f13237a = f;
        this.f13238b = z;
        this.f13239c = crossAxisAlignment;
    }

    public /* synthetic */ RowColumnParentData(float f, boolean z, CrossAxisAlignment crossAxisAlignment, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? 0.0f : f, (i & 2) != 0 ? true : z, (i & 4) != 0 ? null : crossAxisAlignment);
    }
}
