package th.p047co.dtac.android.dtacone.view.appOne.tol.model.installation;

import androidx.autofill.HintConstants;
import androidx.compose.runtime.internal.StabilityInferred;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.apache.commons.cli.HelpFormatter;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 0)
@Metadata(m29143d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\tJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\tJ.\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000e\u0010\tJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\tR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0017\u001a\u0004\b\u001a\u0010\tR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u0017\u001a\u0004\b\u001c\u0010\tR\u0011\u0010\u001e\u001a\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u001d\u0010\t¨\u0006\u001f"}, m29142d2 = {"Lth/co/dtac/android/dtacone/view/appOne/tol/model/installation/InstallContactInfo;", "", "", "firstName", "lastName", HintConstants.AUTOFILL_HINT_PHONE, "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lth/co/dtac/android/dtacone/view/appOne/tol/model/installation/InstallContactInfo;", "toString", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", PDPageLabelRange.STYLE_LETTERS_LOWER, "Ljava/lang/String;", "getFirstName", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "getLastName", OperatorName.CURVE_TO, "getPhone", "getFullName", "fullName", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0})
/* renamed from: th.co.dtac.android.dtacone.view.appOne.tol.model.installation.InstallContactInfo */
/* loaded from: classes10.dex */
public final class InstallContactInfo {
    public static final int $stable = 0;

    /* renamed from: a */
    public final String f98041a;

    /* renamed from: b */
    public final String f98042b;

    /* renamed from: c */
    public final String f98043c;

    public InstallContactInfo() {
        this(null, null, null, 7, null);
    }

    public static /* synthetic */ InstallContactInfo copy$default(InstallContactInfo installContactInfo, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = installContactInfo.f98041a;
        }
        if ((i & 2) != 0) {
            str2 = installContactInfo.f98042b;
        }
        if ((i & 4) != 0) {
            str3 = installContactInfo.f98043c;
        }
        return installContactInfo.copy(str, str2, str3);
    }

    @NotNull
    public final String component1() {
        return this.f98041a;
    }

    @NotNull
    public final String component2() {
        return this.f98042b;
    }

    @NotNull
    public final String component3() {
        return this.f98043c;
    }

    @NotNull
    public final InstallContactInfo copy(@NotNull String firstName, @NotNull String lastName, @NotNull String phone) {
        Intrinsics.checkNotNullParameter(firstName, "firstName");
        Intrinsics.checkNotNullParameter(lastName, "lastName");
        Intrinsics.checkNotNullParameter(phone, "phone");
        return new InstallContactInfo(firstName, lastName, phone);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof InstallContactInfo) {
            InstallContactInfo installContactInfo = (InstallContactInfo) obj;
            return Intrinsics.areEqual(this.f98041a, installContactInfo.f98041a) && Intrinsics.areEqual(this.f98042b, installContactInfo.f98042b) && Intrinsics.areEqual(this.f98043c, installContactInfo.f98043c);
        }
        return false;
    }

    @NotNull
    public final String getFirstName() {
        return this.f98041a;
    }

    @NotNull
    public final String getFullName() {
        String str = this.f98041a;
        String str2 = this.f98042b;
        return str + HelpFormatter.DEFAULT_LONG_OPT_SEPARATOR + str2;
    }

    @NotNull
    public final String getLastName() {
        return this.f98042b;
    }

    @NotNull
    public final String getPhone() {
        return this.f98043c;
    }

    public int hashCode() {
        return (((this.f98041a.hashCode() * 31) + this.f98042b.hashCode()) * 31) + this.f98043c.hashCode();
    }

    @NotNull
    public String toString() {
        String str = this.f98041a;
        String str2 = this.f98042b;
        String str3 = this.f98043c;
        return "InstallContactInfo(firstName=" + str + ", lastName=" + str2 + ", phone=" + str3 + ")";
    }

    public InstallContactInfo(@NotNull String firstName, @NotNull String lastName, @NotNull String phone) {
        Intrinsics.checkNotNullParameter(firstName, "firstName");
        Intrinsics.checkNotNullParameter(lastName, "lastName");
        Intrinsics.checkNotNullParameter(phone, "phone");
        this.f98041a = firstName;
        this.f98042b = lastName;
        this.f98043c = phone;
    }

    public /* synthetic */ InstallContactInfo(String str, String str2, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3);
    }
}