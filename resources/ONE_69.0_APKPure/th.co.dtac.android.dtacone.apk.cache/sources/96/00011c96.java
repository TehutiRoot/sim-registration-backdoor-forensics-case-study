package th.p047co.dtac.android.dtacone.model.appOne.topup;

import androidx.compose.runtime.internal.StabilityInferred;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 0)
@Metadata(m29143d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006J\u0010\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\nJ\u000b\u0010\r\u001a\u0004\u0018\u00010\u0005HÆ\u0003J&\u0010\u000e\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0002\u0010\u000fJ\u0013\u0010\u0010\u001a\u00020\u00032\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0005HÖ\u0001R\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u001a\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u000b\u001a\u0004\b\t\u0010\n¨\u0006\u0015"}, m29142d2 = {"Lth/co/dtac/android/dtacone/model/appOne/topup/OneTopUpCheckSubscriberDataResponse;", "", "displayBalance", "", "customerNumber", "", "(Ljava/lang/Boolean;Ljava/lang/String;)V", "getCustomerNumber", "()Ljava/lang/String;", "getDisplayBalance", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "component1", "component2", "copy", "(Ljava/lang/Boolean;Ljava/lang/String;)Lth/co/dtac/android/dtacone/model/appOne/topup/OneTopUpCheckSubscriberDataResponse;", "equals", "other", "hashCode", "", "toString", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.model.appOne.topup.OneTopUpCheckSubscriberDataResponse */
/* loaded from: classes8.dex */
public final class OneTopUpCheckSubscriberDataResponse {
    public static final int $stable = 0;
    @SerializedName("customerNumber")
    @Nullable
    private final String customerNumber;
    @SerializedName("displayBalance")
    @Nullable
    private final Boolean displayBalance;

    public OneTopUpCheckSubscriberDataResponse() {
        this(null, null, 3, null);
    }

    public static /* synthetic */ OneTopUpCheckSubscriberDataResponse copy$default(OneTopUpCheckSubscriberDataResponse oneTopUpCheckSubscriberDataResponse, Boolean bool, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            bool = oneTopUpCheckSubscriberDataResponse.displayBalance;
        }
        if ((i & 2) != 0) {
            str = oneTopUpCheckSubscriberDataResponse.customerNumber;
        }
        return oneTopUpCheckSubscriberDataResponse.copy(bool, str);
    }

    @Nullable
    public final Boolean component1() {
        return this.displayBalance;
    }

    @Nullable
    public final String component2() {
        return this.customerNumber;
    }

    @NotNull
    public final OneTopUpCheckSubscriberDataResponse copy(@Nullable Boolean bool, @Nullable String str) {
        return new OneTopUpCheckSubscriberDataResponse(bool, str);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof OneTopUpCheckSubscriberDataResponse) {
            OneTopUpCheckSubscriberDataResponse oneTopUpCheckSubscriberDataResponse = (OneTopUpCheckSubscriberDataResponse) obj;
            return Intrinsics.areEqual(this.displayBalance, oneTopUpCheckSubscriberDataResponse.displayBalance) && Intrinsics.areEqual(this.customerNumber, oneTopUpCheckSubscriberDataResponse.customerNumber);
        }
        return false;
    }

    @Nullable
    public final String getCustomerNumber() {
        return this.customerNumber;
    }

    @Nullable
    public final Boolean getDisplayBalance() {
        return this.displayBalance;
    }

    public int hashCode() {
        Boolean bool = this.displayBalance;
        int hashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        String str = this.customerNumber;
        return hashCode + (str != null ? str.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        Boolean bool = this.displayBalance;
        String str = this.customerNumber;
        return "OneTopUpCheckSubscriberDataResponse(displayBalance=" + bool + ", customerNumber=" + str + ")";
    }

    public OneTopUpCheckSubscriberDataResponse(@Nullable Boolean bool, @Nullable String str) {
        this.displayBalance = bool;
        this.customerNumber = str;
    }

    public /* synthetic */ OneTopUpCheckSubscriberDataResponse(Boolean bool, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? Boolean.FALSE : bool, (i & 2) != 0 ? null : str);
    }
}