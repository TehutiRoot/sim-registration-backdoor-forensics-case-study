package th.p047co.dtac.android.dtacone.model.appOne.topup;

import androidx.compose.runtime.internal.StabilityInferred;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 0)
@Metadata(m29143d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B5\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0007J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0003J9\u0010\u0013\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u0003HÖ\u0001R \u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\tR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\tR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\t¨\u0006\u001a"}, m29142d2 = {"Lth/co/dtac/android/dtacone/model/appOne/topup/OneTopUpGetMainBalanceDataResponse;", "", "balance", "", "reserveAmountBalance", "sos", "ceDate", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getBalance", "()Ljava/lang/String;", "setBalance", "(Ljava/lang/String;)V", "getCeDate", "getReserveAmountBalance", "getSos", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.model.appOne.topup.OneTopUpGetMainBalanceDataResponse */
/* loaded from: classes8.dex */
public final class OneTopUpGetMainBalanceDataResponse {
    public static final int $stable = 8;
    @SerializedName("balance")
    @Nullable
    private String balance;
    @SerializedName("ceDate")
    @Nullable
    private final String ceDate;
    @SerializedName("reserveAmountbalance")
    @Nullable
    private final String reserveAmountBalance;
    @SerializedName("sos")
    @Nullable
    private final String sos;

    public OneTopUpGetMainBalanceDataResponse() {
        this(null, null, null, null, 15, null);
    }

    public static /* synthetic */ OneTopUpGetMainBalanceDataResponse copy$default(OneTopUpGetMainBalanceDataResponse oneTopUpGetMainBalanceDataResponse, String str, String str2, String str3, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = oneTopUpGetMainBalanceDataResponse.balance;
        }
        if ((i & 2) != 0) {
            str2 = oneTopUpGetMainBalanceDataResponse.reserveAmountBalance;
        }
        if ((i & 4) != 0) {
            str3 = oneTopUpGetMainBalanceDataResponse.sos;
        }
        if ((i & 8) != 0) {
            str4 = oneTopUpGetMainBalanceDataResponse.ceDate;
        }
        return oneTopUpGetMainBalanceDataResponse.copy(str, str2, str3, str4);
    }

    @Nullable
    public final String component1() {
        return this.balance;
    }

    @Nullable
    public final String component2() {
        return this.reserveAmountBalance;
    }

    @Nullable
    public final String component3() {
        return this.sos;
    }

    @Nullable
    public final String component4() {
        return this.ceDate;
    }

    @NotNull
    public final OneTopUpGetMainBalanceDataResponse copy(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4) {
        return new OneTopUpGetMainBalanceDataResponse(str, str2, str3, str4);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof OneTopUpGetMainBalanceDataResponse) {
            OneTopUpGetMainBalanceDataResponse oneTopUpGetMainBalanceDataResponse = (OneTopUpGetMainBalanceDataResponse) obj;
            return Intrinsics.areEqual(this.balance, oneTopUpGetMainBalanceDataResponse.balance) && Intrinsics.areEqual(this.reserveAmountBalance, oneTopUpGetMainBalanceDataResponse.reserveAmountBalance) && Intrinsics.areEqual(this.sos, oneTopUpGetMainBalanceDataResponse.sos) && Intrinsics.areEqual(this.ceDate, oneTopUpGetMainBalanceDataResponse.ceDate);
        }
        return false;
    }

    @Nullable
    public final String getBalance() {
        return this.balance;
    }

    @Nullable
    public final String getCeDate() {
        return this.ceDate;
    }

    @Nullable
    public final String getReserveAmountBalance() {
        return this.reserveAmountBalance;
    }

    @Nullable
    public final String getSos() {
        return this.sos;
    }

    public int hashCode() {
        String str = this.balance;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.reserveAmountBalance;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.sos;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.ceDate;
        return hashCode3 + (str4 != null ? str4.hashCode() : 0);
    }

    public final void setBalance(@Nullable String str) {
        this.balance = str;
    }

    @NotNull
    public String toString() {
        String str = this.balance;
        String str2 = this.reserveAmountBalance;
        String str3 = this.sos;
        String str4 = this.ceDate;
        return "OneTopUpGetMainBalanceDataResponse(balance=" + str + ", reserveAmountBalance=" + str2 + ", sos=" + str3 + ", ceDate=" + str4 + ")";
    }

    public OneTopUpGetMainBalanceDataResponse(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4) {
        this.balance = str;
        this.reserveAmountBalance = str2;
        this.sos = str3;
        this.ceDate = str4;
    }

    public /* synthetic */ OneTopUpGetMainBalanceDataResponse(String str, String str2, String str3, String str4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4);
    }
}