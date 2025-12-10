package th.p047co.dtac.android.dtacone.view.appOne.mnp.states;

import androidx.compose.runtime.internal.StabilityInferred;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import th.p047co.dtac.android.dtacone.util.Constant;

@StabilityInferred(parameters = 0)
@Metadata(m29143d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u000e\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000e\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bJ\r\u0010\t\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\nJ\u0010\u0010\f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\nJ\u0010\u0010\r\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\nJ\u0010\u0010\u000e\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000e\u0010\nJ8\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u0018\u001a\u00020\u00022\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\nR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001b\u001a\u0004\b\u001e\u0010\nR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001f\u0010\u001b\u001a\u0004\b \u0010\nR\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b!\u0010\u001b\u001a\u0004\b\u0006\u0010\n¨\u0006\""}, m29142d2 = {"Lth/co/dtac/android/dtacone/view/appOne/mnp/states/OneMnpUpdateFormsState;", "", "", Constant.ConsentDomain.PDPA, "ESIG", Constant.ConsentDomain.TMN, "isSmartCard", "<init>", "(ZZZZ)V", "isFormValid", "()Z", "component1", "component2", "component3", "component4", "copy", "(ZZZZ)Lth/co/dtac/android/dtacone/view/appOne/mnp/states/OneMnpUpdateFormsState;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", PDPageLabelRange.STYLE_LETTERS_LOWER, "Z", "getPDPA", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "getESIG", OperatorName.CURVE_TO, "getTMN", "d", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0})
/* renamed from: th.co.dtac.android.dtacone.view.appOne.mnp.states.OneMnpUpdateFormsState */
/* loaded from: classes10.dex */
public final class OneMnpUpdateFormsState {
    public static final int $stable = 0;

    /* renamed from: a */
    public final boolean f92002a;

    /* renamed from: b */
    public final boolean f92003b;

    /* renamed from: c */
    public final boolean f92004c;

    /* renamed from: d */
    public final boolean f92005d;

    public OneMnpUpdateFormsState() {
        this(false, false, false, false, 15, null);
    }

    public static /* synthetic */ OneMnpUpdateFormsState copy$default(OneMnpUpdateFormsState oneMnpUpdateFormsState, boolean z, boolean z2, boolean z3, boolean z4, int i, Object obj) {
        if ((i & 1) != 0) {
            z = oneMnpUpdateFormsState.f92002a;
        }
        if ((i & 2) != 0) {
            z2 = oneMnpUpdateFormsState.f92003b;
        }
        if ((i & 4) != 0) {
            z3 = oneMnpUpdateFormsState.f92004c;
        }
        if ((i & 8) != 0) {
            z4 = oneMnpUpdateFormsState.f92005d;
        }
        return oneMnpUpdateFormsState.copy(z, z2, z3, z4);
    }

    public final boolean component1() {
        return this.f92002a;
    }

    public final boolean component2() {
        return this.f92003b;
    }

    public final boolean component3() {
        return this.f92004c;
    }

    public final boolean component4() {
        return this.f92005d;
    }

    @NotNull
    public final OneMnpUpdateFormsState copy(boolean z, boolean z2, boolean z3, boolean z4) {
        return new OneMnpUpdateFormsState(z, z2, z3, z4);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof OneMnpUpdateFormsState) {
            OneMnpUpdateFormsState oneMnpUpdateFormsState = (OneMnpUpdateFormsState) obj;
            return this.f92002a == oneMnpUpdateFormsState.f92002a && this.f92003b == oneMnpUpdateFormsState.f92003b && this.f92004c == oneMnpUpdateFormsState.f92004c && this.f92005d == oneMnpUpdateFormsState.f92005d;
        }
        return false;
    }

    public final boolean getESIG() {
        return this.f92003b;
    }

    public final boolean getPDPA() {
        return this.f92002a;
    }

    public final boolean getTMN() {
        return this.f92004c;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r0v9 */
    /* JADX WARN: Type inference failed for: r2v0, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v2, types: [boolean] */
    public int hashCode() {
        boolean z = this.f92002a;
        ?? r0 = z;
        if (z) {
            r0 = 1;
        }
        int i = r0 * 31;
        ?? r2 = this.f92003b;
        int i2 = r2;
        if (r2 != 0) {
            i2 = 1;
        }
        int i3 = (i + i2) * 31;
        ?? r22 = this.f92004c;
        int i4 = r22;
        if (r22 != 0) {
            i4 = 1;
        }
        int i5 = (i3 + i4) * 31;
        boolean z2 = this.f92005d;
        return i5 + (z2 ? 1 : z2 ? 1 : 0);
    }

    public final boolean isFormValid() {
        if (this.f92005d) {
            if (!this.f92002a || !this.f92003b || !this.f92004c) {
                return false;
            }
        } else if (!this.f92002a || !this.f92003b) {
            return false;
        }
        return true;
    }

    public final boolean isSmartCard() {
        return this.f92005d;
    }

    @NotNull
    public String toString() {
        boolean z = this.f92002a;
        boolean z2 = this.f92003b;
        boolean z3 = this.f92004c;
        boolean z4 = this.f92005d;
        return "OneMnpUpdateFormsState(PDPA=" + z + ", ESIG=" + z2 + ", TMN=" + z3 + ", isSmartCard=" + z4 + ")";
    }

    public OneMnpUpdateFormsState(boolean z, boolean z2, boolean z3, boolean z4) {
        this.f92002a = z;
        this.f92003b = z2;
        this.f92004c = z3;
        this.f92005d = z4;
    }

    public /* synthetic */ OneMnpUpdateFormsState(boolean z, boolean z2, boolean z3, boolean z4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? false : z2, (i & 4) != 0 ? false : z3, (i & 8) != 0 ? false : z4);
    }
}