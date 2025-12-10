package th.p047co.dtac.android.dtacone.extension;

import androidx.compose.runtime.internal.StabilityInferred;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 0)
@Metadata(m28851d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\r\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\nJ\u0010\u0010\f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\nJ\u0010\u0010\r\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\nJ8\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0013\u0010\nJ\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\nR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u0019\u001a\u0004\b\u001c\u0010\nR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u0019\u001a\u0004\b\u001e\u0010\nR\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001f\u0010\u0019\u001a\u0004\b \u0010\n¨\u0006!"}, m28850d2 = {"Lth/co/dtac/android/dtacone/extension/Four;", "", "", "x", OperatorName.CURVE_TO_REPLICATE_FINAL_POINT, OperatorName.SET_LINE_WIDTH, OperatorName.CLOSE_PATH, "<init>", "(IIII)V", "component1", "()I", "component2", "component3", "component4", "copy", "(IIII)Lth/co/dtac/android/dtacone/extension/Four;", "", "toString", "()Ljava/lang/String;", "hashCode", "other", "", "equals", "(Ljava/lang/Object;)Z", PDPageLabelRange.STYLE_LETTERS_LOWER, "I", "getX", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "getY", OperatorName.CURVE_TO, "getW", "d", "getH", "app_prodRelease"}, m28849k = 1, m28848mv = {1, 8, 0})
/* renamed from: th.co.dtac.android.dtacone.extension.Four */
/* loaded from: classes7.dex */
public final class Four {
    public static final int $stable = 0;

    /* renamed from: a */
    public final int f84743a;

    /* renamed from: b */
    public final int f84744b;

    /* renamed from: c */
    public final int f84745c;

    /* renamed from: d */
    public final int f84746d;

    public Four(int i, int i2, int i3, int i4) {
        this.f84743a = i;
        this.f84744b = i2;
        this.f84745c = i3;
        this.f84746d = i4;
    }

    public static /* synthetic */ Four copy$default(Four four, int i, int i2, int i3, int i4, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            i = four.f84743a;
        }
        if ((i5 & 2) != 0) {
            i2 = four.f84744b;
        }
        if ((i5 & 4) != 0) {
            i3 = four.f84745c;
        }
        if ((i5 & 8) != 0) {
            i4 = four.f84746d;
        }
        return four.copy(i, i2, i3, i4);
    }

    public final int component1() {
        return this.f84743a;
    }

    public final int component2() {
        return this.f84744b;
    }

    public final int component3() {
        return this.f84745c;
    }

    public final int component4() {
        return this.f84746d;
    }

    @NotNull
    public final Four copy(int i, int i2, int i3, int i4) {
        return new Four(i, i2, i3, i4);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Four) {
            Four four = (Four) obj;
            return this.f84743a == four.f84743a && this.f84744b == four.f84744b && this.f84745c == four.f84745c && this.f84746d == four.f84746d;
        }
        return false;
    }

    public final int getH() {
        return this.f84746d;
    }

    public final int getW() {
        return this.f84745c;
    }

    public final int getX() {
        return this.f84743a;
    }

    public final int getY() {
        return this.f84744b;
    }

    public int hashCode() {
        return (((((this.f84743a * 31) + this.f84744b) * 31) + this.f84745c) * 31) + this.f84746d;
    }

    @NotNull
    public String toString() {
        int i = this.f84743a;
        int i2 = this.f84744b;
        int i3 = this.f84745c;
        int i4 = this.f84746d;
        return "Four(x=" + i + ", y=" + i2 + ", w=" + i3 + ", h=" + i4 + ")";
    }
}
