package th.p047co.dtac.android.dtacone.model.appOne.topup;

import androidx.compose.runtime.internal.StabilityInferred;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import th.p047co.dtac.android.dtacone.view.fragment.mrtr_prepaid_registration.family_sim.InputPostpaidFamilySimSubscriberFragment;

@StabilityInferred(parameters = 0)
@Metadata(m29143d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B)\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0007J\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\tJ\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0005HÆ\u0003J2\u0010\u0011\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0002\u0010\u0012J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0005HÖ\u0001R\u001a\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\n\u001a\u0004\b\b\u0010\tR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\f¨\u0006\u0019"}, m29142d2 = {"Lth/co/dtac/android/dtacone/model/appOne/topup/OneTopUpResponse;", "", "amount", "", "balance", "", InputPostpaidFamilySimSubscriberFragment.SUB_NUM, "(Ljava/lang/Double;Ljava/lang/String;Ljava/lang/String;)V", "getAmount", "()Ljava/lang/Double;", "Ljava/lang/Double;", "getBalance", "()Ljava/lang/String;", "getSubscriberNumber", "component1", "component2", "component3", "copy", "(Ljava/lang/Double;Ljava/lang/String;Ljava/lang/String;)Lth/co/dtac/android/dtacone/model/appOne/topup/OneTopUpResponse;", "equals", "", "other", "hashCode", "", "toString", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.model.appOne.topup.OneTopUpResponse */
/* loaded from: classes8.dex */
public final class OneTopUpResponse {
    public static final int $stable = 0;
    @SerializedName("amount")
    @Nullable
    private final Double amount;
    @SerializedName("balance")
    @Nullable
    private final String balance;
    @SerializedName(InputPostpaidFamilySimSubscriberFragment.SUB_NUM)
    @Nullable
    private final String subscriberNumber;

    public OneTopUpResponse() {
        this(null, null, null, 7, null);
    }

    public static /* synthetic */ OneTopUpResponse copy$default(OneTopUpResponse oneTopUpResponse, Double d, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            d = oneTopUpResponse.amount;
        }
        if ((i & 2) != 0) {
            str = oneTopUpResponse.balance;
        }
        if ((i & 4) != 0) {
            str2 = oneTopUpResponse.subscriberNumber;
        }
        return oneTopUpResponse.copy(d, str, str2);
    }

    @Nullable
    public final Double component1() {
        return this.amount;
    }

    @Nullable
    public final String component2() {
        return this.balance;
    }

    @Nullable
    public final String component3() {
        return this.subscriberNumber;
    }

    @NotNull
    public final OneTopUpResponse copy(@Nullable Double d, @Nullable String str, @Nullable String str2) {
        return new OneTopUpResponse(d, str, str2);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof OneTopUpResponse) {
            OneTopUpResponse oneTopUpResponse = (OneTopUpResponse) obj;
            return Intrinsics.areEqual((Object) this.amount, (Object) oneTopUpResponse.amount) && Intrinsics.areEqual(this.balance, oneTopUpResponse.balance) && Intrinsics.areEqual(this.subscriberNumber, oneTopUpResponse.subscriberNumber);
        }
        return false;
    }

    @Nullable
    public final Double getAmount() {
        return this.amount;
    }

    @Nullable
    public final String getBalance() {
        return this.balance;
    }

    @Nullable
    public final String getSubscriberNumber() {
        return this.subscriberNumber;
    }

    public int hashCode() {
        Double d = this.amount;
        int hashCode = (d == null ? 0 : d.hashCode()) * 31;
        String str = this.balance;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.subscriberNumber;
        return hashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        Double d = this.amount;
        String str = this.balance;
        String str2 = this.subscriberNumber;
        return "OneTopUpResponse(amount=" + d + ", balance=" + str + ", subscriberNumber=" + str2 + ")";
    }

    public OneTopUpResponse(@Nullable Double d, @Nullable String str, @Nullable String str2) {
        this.amount = d;
        this.balance = str;
        this.subscriberNumber = str2;
    }

    public /* synthetic */ OneTopUpResponse(Double d, String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : d, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : str2);
    }
}