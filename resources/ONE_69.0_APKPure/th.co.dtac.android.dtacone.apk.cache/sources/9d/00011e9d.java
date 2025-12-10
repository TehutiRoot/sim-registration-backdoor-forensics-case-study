package th.p047co.dtac.android.dtacone.model.login_mrtr;

import androidx.compose.runtime.internal.StabilityInferred;
import com.google.android.gms.common.Scopes;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import th.p047co.dtac.android.dtacone.model.appOne.getProfile.OneGetProfileResponse;
import th.p047co.dtac.android.dtacone.model.profile.GetProfileResponse;

@StabilityInferred(parameters = 0)
@Metadata(m29143d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b!\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BQ\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\b\b\u0002\u0010\f\u001a\u00020\u0003¢\u0006\u0002\u0010\rJ\u000b\u0010\"\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010#\u001a\u00020\u0003HÆ\u0003J\t\u0010$\u001a\u00020\u0006HÆ\u0003J\t\u0010%\u001a\u00020\u0006HÆ\u0003J\u000b\u0010&\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010'\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\t\u0010(\u001a\u00020\u0003HÆ\u0003JU\u0010)\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\b\b\u0002\u0010\f\u001a\u00020\u0003HÆ\u0001J\u0013\u0010*\u001a\u00020\u00062\b\u0010+\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010,\u001a\u00020-HÖ\u0001J\t\u0010.\u001a\u00020\u0003HÖ\u0001R\u001a\u0010\u0005\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0007\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\u000e\"\u0004\b\u0011\u0010\u0010R\u001c\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u001c\u0010\b\u001a\u0004\u0018\u00010\tX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\u001a\u0010\f\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\u001a\u0010\u0004\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u001b\"\u0004\b\u001f\u0010\u001dR\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b \u0010\u001b\"\u0004\b!\u0010\u001d¨\u0006/"}, m29142d2 = {"Lth/co/dtac/android/dtacone/model/login_mrtr/LoginMrtr;", "", "token", "", "telephoneNumber", "isForceChangePassword", "", "isRequire2Factor", Scopes.PROFILE, "Lth/co/dtac/android/dtacone/model/profile/GetProfileResponse;", "oneProfile", "Lth/co/dtac/android/dtacone/model/appOne/getProfile/OneGetProfileResponse;", "promoterId", "(Ljava/lang/String;Ljava/lang/String;ZZLth/co/dtac/android/dtacone/model/profile/GetProfileResponse;Lth/co/dtac/android/dtacone/model/appOne/getProfile/OneGetProfileResponse;Ljava/lang/String;)V", "()Z", "setForceChangePassword", "(Z)V", "setRequire2Factor", "getOneProfile", "()Lth/co/dtac/android/dtacone/model/appOne/getProfile/OneGetProfileResponse;", "setOneProfile", "(Lth/co/dtac/android/dtacone/model/appOne/getProfile/OneGetProfileResponse;)V", "getProfile", "()Lth/co/dtac/android/dtacone/model/profile/GetProfileResponse;", "setProfile", "(Lth/co/dtac/android/dtacone/model/profile/GetProfileResponse;)V", "getPromoterId", "()Ljava/lang/String;", "setPromoterId", "(Ljava/lang/String;)V", "getTelephoneNumber", "setTelephoneNumber", "getToken", "setToken", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "other", "hashCode", "", "toString", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.model.login_mrtr.LoginMrtr */
/* loaded from: classes8.dex */
public final class LoginMrtr {
    public static final int $stable = 8;
    private boolean isForceChangePassword;
    private boolean isRequire2Factor;
    @Nullable
    private OneGetProfileResponse oneProfile;
    @Nullable
    private GetProfileResponse profile;
    @NotNull
    private String promoterId;
    @NotNull
    private String telephoneNumber;
    @Nullable
    private String token;

    public LoginMrtr() {
        this(null, null, false, false, null, null, null, 127, null);
    }

    public static /* synthetic */ LoginMrtr copy$default(LoginMrtr loginMrtr, String str, String str2, boolean z, boolean z2, GetProfileResponse getProfileResponse, OneGetProfileResponse oneGetProfileResponse, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = loginMrtr.token;
        }
        if ((i & 2) != 0) {
            str2 = loginMrtr.telephoneNumber;
        }
        String str4 = str2;
        if ((i & 4) != 0) {
            z = loginMrtr.isForceChangePassword;
        }
        boolean z3 = z;
        if ((i & 8) != 0) {
            z2 = loginMrtr.isRequire2Factor;
        }
        boolean z4 = z2;
        if ((i & 16) != 0) {
            getProfileResponse = loginMrtr.profile;
        }
        GetProfileResponse getProfileResponse2 = getProfileResponse;
        if ((i & 32) != 0) {
            oneGetProfileResponse = loginMrtr.oneProfile;
        }
        OneGetProfileResponse oneGetProfileResponse2 = oneGetProfileResponse;
        if ((i & 64) != 0) {
            str3 = loginMrtr.promoterId;
        }
        return loginMrtr.copy(str, str4, z3, z4, getProfileResponse2, oneGetProfileResponse2, str3);
    }

    @Nullable
    public final String component1() {
        return this.token;
    }

    @NotNull
    public final String component2() {
        return this.telephoneNumber;
    }

    public final boolean component3() {
        return this.isForceChangePassword;
    }

    public final boolean component4() {
        return this.isRequire2Factor;
    }

    @Nullable
    public final GetProfileResponse component5() {
        return this.profile;
    }

    @Nullable
    public final OneGetProfileResponse component6() {
        return this.oneProfile;
    }

    @NotNull
    public final String component7() {
        return this.promoterId;
    }

    @NotNull
    public final LoginMrtr copy(@Nullable String str, @NotNull String telephoneNumber, boolean z, boolean z2, @Nullable GetProfileResponse getProfileResponse, @Nullable OneGetProfileResponse oneGetProfileResponse, @NotNull String promoterId) {
        Intrinsics.checkNotNullParameter(telephoneNumber, "telephoneNumber");
        Intrinsics.checkNotNullParameter(promoterId, "promoterId");
        return new LoginMrtr(str, telephoneNumber, z, z2, getProfileResponse, oneGetProfileResponse, promoterId);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof LoginMrtr) {
            LoginMrtr loginMrtr = (LoginMrtr) obj;
            return Intrinsics.areEqual(this.token, loginMrtr.token) && Intrinsics.areEqual(this.telephoneNumber, loginMrtr.telephoneNumber) && this.isForceChangePassword == loginMrtr.isForceChangePassword && this.isRequire2Factor == loginMrtr.isRequire2Factor && Intrinsics.areEqual(this.profile, loginMrtr.profile) && Intrinsics.areEqual(this.oneProfile, loginMrtr.oneProfile) && Intrinsics.areEqual(this.promoterId, loginMrtr.promoterId);
        }
        return false;
    }

    @Nullable
    public final OneGetProfileResponse getOneProfile() {
        return this.oneProfile;
    }

    @Nullable
    public final GetProfileResponse getProfile() {
        return this.profile;
    }

    @NotNull
    public final String getPromoterId() {
        return this.promoterId;
    }

    @NotNull
    public final String getTelephoneNumber() {
        return this.telephoneNumber;
    }

    @Nullable
    public final String getToken() {
        return this.token;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        String str = this.token;
        int hashCode = (((str == null ? 0 : str.hashCode()) * 31) + this.telephoneNumber.hashCode()) * 31;
        boolean z = this.isForceChangePassword;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        int i2 = (hashCode + i) * 31;
        boolean z2 = this.isRequire2Factor;
        int i3 = (i2 + (z2 ? 1 : z2 ? 1 : 0)) * 31;
        GetProfileResponse getProfileResponse = this.profile;
        int hashCode2 = (i3 + (getProfileResponse == null ? 0 : getProfileResponse.hashCode())) * 31;
        OneGetProfileResponse oneGetProfileResponse = this.oneProfile;
        return ((hashCode2 + (oneGetProfileResponse != null ? oneGetProfileResponse.hashCode() : 0)) * 31) + this.promoterId.hashCode();
    }

    public final boolean isForceChangePassword() {
        return this.isForceChangePassword;
    }

    public final boolean isRequire2Factor() {
        return this.isRequire2Factor;
    }

    public final void setForceChangePassword(boolean z) {
        this.isForceChangePassword = z;
    }

    public final void setOneProfile(@Nullable OneGetProfileResponse oneGetProfileResponse) {
        this.oneProfile = oneGetProfileResponse;
    }

    public final void setProfile(@Nullable GetProfileResponse getProfileResponse) {
        this.profile = getProfileResponse;
    }

    public final void setPromoterId(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.promoterId = str;
    }

    public final void setRequire2Factor(boolean z) {
        this.isRequire2Factor = z;
    }

    public final void setTelephoneNumber(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.telephoneNumber = str;
    }

    public final void setToken(@Nullable String str) {
        this.token = str;
    }

    @NotNull
    public String toString() {
        String str = this.token;
        String str2 = this.telephoneNumber;
        boolean z = this.isForceChangePassword;
        boolean z2 = this.isRequire2Factor;
        GetProfileResponse getProfileResponse = this.profile;
        OneGetProfileResponse oneGetProfileResponse = this.oneProfile;
        String str3 = this.promoterId;
        return "LoginMrtr(token=" + str + ", telephoneNumber=" + str2 + ", isForceChangePassword=" + z + ", isRequire2Factor=" + z2 + ", profile=" + getProfileResponse + ", oneProfile=" + oneGetProfileResponse + ", promoterId=" + str3 + ")";
    }

    public LoginMrtr(@Nullable String str, @NotNull String telephoneNumber, boolean z, boolean z2, @Nullable GetProfileResponse getProfileResponse, @Nullable OneGetProfileResponse oneGetProfileResponse, @NotNull String promoterId) {
        Intrinsics.checkNotNullParameter(telephoneNumber, "telephoneNumber");
        Intrinsics.checkNotNullParameter(promoterId, "promoterId");
        this.token = str;
        this.telephoneNumber = telephoneNumber;
        this.isForceChangePassword = z;
        this.isRequire2Factor = z2;
        this.profile = getProfileResponse;
        this.oneProfile = oneGetProfileResponse;
        this.promoterId = promoterId;
    }

    public /* synthetic */ LoginMrtr(String str, String str2, boolean z, boolean z2, GetProfileResponse getProfileResponse, OneGetProfileResponse oneGetProfileResponse, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? false : z, (i & 8) != 0 ? false : z2, (i & 16) != 0 ? null : getProfileResponse, (i & 32) == 0 ? oneGetProfileResponse : null, (i & 64) != 0 ? "" : str3);
    }
}