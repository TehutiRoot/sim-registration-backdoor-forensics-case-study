package th.p047co.dtac.android.dtacone.model.login_mrtr;

import androidx.compose.runtime.internal.StabilityInferred;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 0)
@Metadata(m29143d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000e\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0002\u0010\bJ\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0006HÆ\u0003J1\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00032\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0006HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\tR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\tR\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0016\u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000b¨\u0006\u0017"}, m29142d2 = {"Lth/co/dtac/android/dtacone/model/login_mrtr/LoginMrtrResponse;", "", "isForceChangePassword", "", "isRequire2Factor", "telephoneNumber", "", "token", "(ZZLjava/lang/String;Ljava/lang/String;)V", "()Z", "getTelephoneNumber", "()Ljava/lang/String;", "getToken", "component1", "component2", "component3", "component4", "copy", "equals", "other", "hashCode", "", "toString", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.model.login_mrtr.LoginMrtrResponse */
/* loaded from: classes8.dex */
public final class LoginMrtrResponse {
    public static final int $stable = 0;
    @SerializedName("isForceChangePassword")
    private final boolean isForceChangePassword;
    @SerializedName("isRequire2Factor")
    private final boolean isRequire2Factor;
    @SerializedName("telephoneNumber")
    @NotNull
    private final String telephoneNumber;
    @SerializedName("token")
    @NotNull
    private final String token;

    public LoginMrtrResponse(boolean z, boolean z2, @NotNull String telephoneNumber, @NotNull String token) {
        Intrinsics.checkNotNullParameter(telephoneNumber, "telephoneNumber");
        Intrinsics.checkNotNullParameter(token, "token");
        this.isForceChangePassword = z;
        this.isRequire2Factor = z2;
        this.telephoneNumber = telephoneNumber;
        this.token = token;
    }

    public static /* synthetic */ LoginMrtrResponse copy$default(LoginMrtrResponse loginMrtrResponse, boolean z, boolean z2, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            z = loginMrtrResponse.isForceChangePassword;
        }
        if ((i & 2) != 0) {
            z2 = loginMrtrResponse.isRequire2Factor;
        }
        if ((i & 4) != 0) {
            str = loginMrtrResponse.telephoneNumber;
        }
        if ((i & 8) != 0) {
            str2 = loginMrtrResponse.token;
        }
        return loginMrtrResponse.copy(z, z2, str, str2);
    }

    public final boolean component1() {
        return this.isForceChangePassword;
    }

    public final boolean component2() {
        return this.isRequire2Factor;
    }

    @NotNull
    public final String component3() {
        return this.telephoneNumber;
    }

    @NotNull
    public final String component4() {
        return this.token;
    }

    @NotNull
    public final LoginMrtrResponse copy(boolean z, boolean z2, @NotNull String telephoneNumber, @NotNull String token) {
        Intrinsics.checkNotNullParameter(telephoneNumber, "telephoneNumber");
        Intrinsics.checkNotNullParameter(token, "token");
        return new LoginMrtrResponse(z, z2, telephoneNumber, token);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof LoginMrtrResponse) {
            LoginMrtrResponse loginMrtrResponse = (LoginMrtrResponse) obj;
            return this.isForceChangePassword == loginMrtrResponse.isForceChangePassword && this.isRequire2Factor == loginMrtrResponse.isRequire2Factor && Intrinsics.areEqual(this.telephoneNumber, loginMrtrResponse.telephoneNumber) && Intrinsics.areEqual(this.token, loginMrtrResponse.token);
        }
        return false;
    }

    @NotNull
    public final String getTelephoneNumber() {
        return this.telephoneNumber;
    }

    @NotNull
    public final String getToken() {
        return this.token;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r0v9 */
    public int hashCode() {
        boolean z = this.isForceChangePassword;
        ?? r0 = z;
        if (z) {
            r0 = 1;
        }
        int i = r0 * 31;
        boolean z2 = this.isRequire2Factor;
        return ((((i + (z2 ? 1 : z2 ? 1 : 0)) * 31) + this.telephoneNumber.hashCode()) * 31) + this.token.hashCode();
    }

    public final boolean isForceChangePassword() {
        return this.isForceChangePassword;
    }

    public final boolean isRequire2Factor() {
        return this.isRequire2Factor;
    }

    @NotNull
    public String toString() {
        boolean z = this.isForceChangePassword;
        boolean z2 = this.isRequire2Factor;
        String str = this.telephoneNumber;
        String str2 = this.token;
        return "LoginMrtrResponse(isForceChangePassword=" + z + ", isRequire2Factor=" + z2 + ", telephoneNumber=" + str + ", token=" + str2 + ")";
    }
}