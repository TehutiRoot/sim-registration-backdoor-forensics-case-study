package th.p047co.dtac.android.dtacone.viewmodel.device_sale.model;

import androidx.compose.runtime.internal.StabilityInferred;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 0)
@Metadata(m29143d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\bJ$\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\f\u0010\bJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\b\"\u0004\b\u0017\u0010\u0018R\"\u0010\u0004\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0019\u0010\u0015\u001a\u0004\b\u001a\u0010\b\"\u0004\b\u001b\u0010\u0018¨\u0006\u001c"}, m29142d2 = {"Lth/co/dtac/android/dtacone/viewmodel/device_sale/model/SelectedPackage;", "", "", "code", "description", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "copy", "(Ljava/lang/String;Ljava/lang/String;)Lth/co/dtac/android/dtacone/viewmodel/device_sale/model/SelectedPackage;", "toString", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", PDPageLabelRange.STYLE_LETTERS_LOWER, "Ljava/lang/String;", "getCode", "setCode", "(Ljava/lang/String;)V", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "getDescription", "setDescription", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0})
/* renamed from: th.co.dtac.android.dtacone.viewmodel.device_sale.model.SelectedPackage */
/* loaded from: classes9.dex */
public final class SelectedPackage {
    public static final int $stable = 8;

    /* renamed from: a */
    public String f105660a;

    /* renamed from: b */
    public String f105661b;

    public SelectedPackage() {
        this(null, null, 3, null);
    }

    public static /* synthetic */ SelectedPackage copy$default(SelectedPackage selectedPackage, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = selectedPackage.f105660a;
        }
        if ((i & 2) != 0) {
            str2 = selectedPackage.f105661b;
        }
        return selectedPackage.copy(str, str2);
    }

    @NotNull
    public final String component1() {
        return this.f105660a;
    }

    @NotNull
    public final String component2() {
        return this.f105661b;
    }

    @NotNull
    public final SelectedPackage copy(@NotNull String code, @NotNull String description) {
        Intrinsics.checkNotNullParameter(code, "code");
        Intrinsics.checkNotNullParameter(description, "description");
        return new SelectedPackage(code, description);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof SelectedPackage) {
            SelectedPackage selectedPackage = (SelectedPackage) obj;
            return Intrinsics.areEqual(this.f105660a, selectedPackage.f105660a) && Intrinsics.areEqual(this.f105661b, selectedPackage.f105661b);
        }
        return false;
    }

    @NotNull
    public final String getCode() {
        return this.f105660a;
    }

    @NotNull
    public final String getDescription() {
        return this.f105661b;
    }

    public int hashCode() {
        return (this.f105660a.hashCode() * 31) + this.f105661b.hashCode();
    }

    public final void setCode(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.f105660a = str;
    }

    public final void setDescription(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.f105661b = str;
    }

    @NotNull
    public String toString() {
        String str = this.f105660a;
        String str2 = this.f105661b;
        return "SelectedPackage(code=" + str + ", description=" + str2 + ")";
    }

    public SelectedPackage(@NotNull String code, @NotNull String description) {
        Intrinsics.checkNotNullParameter(code, "code");
        Intrinsics.checkNotNullParameter(description, "description");
        this.f105660a = code;
        this.f105661b = description;
    }

    public /* synthetic */ SelectedPackage(String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2);
    }
}