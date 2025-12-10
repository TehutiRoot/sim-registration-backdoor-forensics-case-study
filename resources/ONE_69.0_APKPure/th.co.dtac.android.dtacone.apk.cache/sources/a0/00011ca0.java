package th.p047co.dtac.android.dtacone.model.appOne.topup.trueCompany;

import androidx.compose.runtime.internal.StabilityInferred;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 0)
@Metadata(m29143d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B)\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0007J\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u000bJ\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0005HÆ\u0003J2\u0010\u0011\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0002\u0010\u0012J\u0013\u0010\u0013\u001a\u00020\u00032\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0005HÖ\u0001R\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u001a\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\f\u001a\u0004\b\n\u0010\u000bR\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\t¨\u0006\u0018"}, m29142d2 = {"Lth/co/dtac/android/dtacone/model/appOne/topup/trueCompany/OneTopUpGetMainBalanceTrueCompanyDataResponse;", "", "displayBalance", "", "balance", "", "message", "(Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;)V", "getBalance", "()Ljava/lang/String;", "getDisplayBalance", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getMessage", "component1", "component2", "component3", "copy", "(Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;)Lth/co/dtac/android/dtacone/model/appOne/topup/trueCompany/OneTopUpGetMainBalanceTrueCompanyDataResponse;", "equals", "other", "hashCode", "", "toString", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.model.appOne.topup.trueCompany.OneTopUpGetMainBalanceTrueCompanyDataResponse */
/* loaded from: classes8.dex */
public final class OneTopUpGetMainBalanceTrueCompanyDataResponse {
    public static final int $stable = 0;
    @SerializedName("balance")
    @Nullable
    private final String balance;
    @SerializedName("displayBalance")
    @Nullable
    private final Boolean displayBalance;
    @SerializedName("message")
    @Nullable
    private final String message;

    public OneTopUpGetMainBalanceTrueCompanyDataResponse() {
        this(null, null, null, 7, null);
    }

    public static /* synthetic */ OneTopUpGetMainBalanceTrueCompanyDataResponse copy$default(OneTopUpGetMainBalanceTrueCompanyDataResponse oneTopUpGetMainBalanceTrueCompanyDataResponse, Boolean bool, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            bool = oneTopUpGetMainBalanceTrueCompanyDataResponse.displayBalance;
        }
        if ((i & 2) != 0) {
            str = oneTopUpGetMainBalanceTrueCompanyDataResponse.balance;
        }
        if ((i & 4) != 0) {
            str2 = oneTopUpGetMainBalanceTrueCompanyDataResponse.message;
        }
        return oneTopUpGetMainBalanceTrueCompanyDataResponse.copy(bool, str, str2);
    }

    @Nullable
    public final Boolean component1() {
        return this.displayBalance;
    }

    @Nullable
    public final String component2() {
        return this.balance;
    }

    @Nullable
    public final String component3() {
        return this.message;
    }

    @NotNull
    public final OneTopUpGetMainBalanceTrueCompanyDataResponse copy(@Nullable Boolean bool, @Nullable String str, @Nullable String str2) {
        return new OneTopUpGetMainBalanceTrueCompanyDataResponse(bool, str, str2);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof OneTopUpGetMainBalanceTrueCompanyDataResponse) {
            OneTopUpGetMainBalanceTrueCompanyDataResponse oneTopUpGetMainBalanceTrueCompanyDataResponse = (OneTopUpGetMainBalanceTrueCompanyDataResponse) obj;
            return Intrinsics.areEqual(this.displayBalance, oneTopUpGetMainBalanceTrueCompanyDataResponse.displayBalance) && Intrinsics.areEqual(this.balance, oneTopUpGetMainBalanceTrueCompanyDataResponse.balance) && Intrinsics.areEqual(this.message, oneTopUpGetMainBalanceTrueCompanyDataResponse.message);
        }
        return false;
    }

    @Nullable
    public final String getBalance() {
        return this.balance;
    }

    @Nullable
    public final Boolean getDisplayBalance() {
        return this.displayBalance;
    }

    @Nullable
    public final String getMessage() {
        return this.message;
    }

    public int hashCode() {
        Boolean bool = this.displayBalance;
        int hashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        String str = this.balance;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.message;
        return hashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        Boolean bool = this.displayBalance;
        String str = this.balance;
        String str2 = this.message;
        return "OneTopUpGetMainBalanceTrueCompanyDataResponse(displayBalance=" + bool + ", balance=" + str + ", message=" + str2 + ")";
    }

    public OneTopUpGetMainBalanceTrueCompanyDataResponse(@Nullable Boolean bool, @Nullable String str, @Nullable String str2) {
        this.displayBalance = bool;
        this.balance = str;
        this.message = str2;
    }

    public /* synthetic */ OneTopUpGetMainBalanceTrueCompanyDataResponse(Boolean bool, String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? Boolean.FALSE : bool, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : str2);
    }
}