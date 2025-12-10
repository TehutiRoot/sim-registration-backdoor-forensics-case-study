package th.p047co.dtac.android.dtacone.model.login_mrtr;

import androidx.autofill.HintConstants;
import androidx.compose.runtime.internal.StabilityInferred;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 0)
@Metadata(m29143d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J'\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\bR\u0016\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\b¨\u0006\u0015"}, m29142d2 = {"Lth/co/dtac/android/dtacone/model/login_mrtr/LoginMrtrRequest;", "", HintConstants.AUTOFILL_HINT_PASSWORD, "", "userFormatType", "userName", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getPassword", "()Ljava/lang/String;", "getUserFormatType", "getUserName", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.model.login_mrtr.LoginMrtrRequest */
/* loaded from: classes8.dex */
public final class LoginMrtrRequest {
    public static final int $stable = 0;
    @SerializedName(HintConstants.AUTOFILL_HINT_PASSWORD)
    @NotNull
    private final String password;
    @SerializedName("userFormatType")
    @NotNull
    private final String userFormatType;
    @SerializedName("userName")
    @NotNull
    private final String userName;

    public LoginMrtrRequest(@NotNull String password, @NotNull String userFormatType, @NotNull String userName) {
        Intrinsics.checkNotNullParameter(password, "password");
        Intrinsics.checkNotNullParameter(userFormatType, "userFormatType");
        Intrinsics.checkNotNullParameter(userName, "userName");
        this.password = password;
        this.userFormatType = userFormatType;
        this.userName = userName;
    }

    public static /* synthetic */ LoginMrtrRequest copy$default(LoginMrtrRequest loginMrtrRequest, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = loginMrtrRequest.password;
        }
        if ((i & 2) != 0) {
            str2 = loginMrtrRequest.userFormatType;
        }
        if ((i & 4) != 0) {
            str3 = loginMrtrRequest.userName;
        }
        return loginMrtrRequest.copy(str, str2, str3);
    }

    @NotNull
    public final String component1() {
        return this.password;
    }

    @NotNull
    public final String component2() {
        return this.userFormatType;
    }

    @NotNull
    public final String component3() {
        return this.userName;
    }

    @NotNull
    public final LoginMrtrRequest copy(@NotNull String password, @NotNull String userFormatType, @NotNull String userName) {
        Intrinsics.checkNotNullParameter(password, "password");
        Intrinsics.checkNotNullParameter(userFormatType, "userFormatType");
        Intrinsics.checkNotNullParameter(userName, "userName");
        return new LoginMrtrRequest(password, userFormatType, userName);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof LoginMrtrRequest) {
            LoginMrtrRequest loginMrtrRequest = (LoginMrtrRequest) obj;
            return Intrinsics.areEqual(this.password, loginMrtrRequest.password) && Intrinsics.areEqual(this.userFormatType, loginMrtrRequest.userFormatType) && Intrinsics.areEqual(this.userName, loginMrtrRequest.userName);
        }
        return false;
    }

    @NotNull
    public final String getPassword() {
        return this.password;
    }

    @NotNull
    public final String getUserFormatType() {
        return this.userFormatType;
    }

    @NotNull
    public final String getUserName() {
        return this.userName;
    }

    public int hashCode() {
        return (((this.password.hashCode() * 31) + this.userFormatType.hashCode()) * 31) + this.userName.hashCode();
    }

    @NotNull
    public String toString() {
        String str = this.password;
        String str2 = this.userFormatType;
        String str3 = this.userName;
        return "LoginMrtrRequest(password=" + str + ", userFormatType=" + str2 + ", userName=" + str3 + ")";
    }
}