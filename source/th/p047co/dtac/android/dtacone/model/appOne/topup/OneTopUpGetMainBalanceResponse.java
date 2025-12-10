package th.p047co.dtac.android.dtacone.model.appOne.topup;

import androidx.compose.runtime.internal.StabilityInferred;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 0)
@Metadata(m28851d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004J\u000b\u0010\u0007\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\b\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\f\u001a\u00020\rHÖ\u0001J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0010"}, m28850d2 = {"Lth/co/dtac/android/dtacone/model/appOne/topup/OneTopUpGetMainBalanceResponse;", "", "oneTopUpGetMainBalanceDataResponse", "Lth/co/dtac/android/dtacone/model/appOne/topup/OneTopUpGetMainBalanceDataResponse;", "(Lth/co/dtac/android/dtacone/model/appOne/topup/OneTopUpGetMainBalanceDataResponse;)V", "getOneTopUpGetMainBalanceDataResponse", "()Lth/co/dtac/android/dtacone/model/appOne/topup/OneTopUpGetMainBalanceDataResponse;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "app_prodRelease"}, m28849k = 1, m28848mv = {1, 8, 0}, m28846xi = 48)
/* renamed from: th.co.dtac.android.dtacone.model.appOne.topup.OneTopUpGetMainBalanceResponse */
/* loaded from: classes8.dex */
public final class OneTopUpGetMainBalanceResponse {
    public static final int $stable = 8;
    @SerializedName("data")
    @Nullable
    private final OneTopUpGetMainBalanceDataResponse oneTopUpGetMainBalanceDataResponse;

    public OneTopUpGetMainBalanceResponse() {
        this(null, 1, null);
    }

    public static /* synthetic */ OneTopUpGetMainBalanceResponse copy$default(OneTopUpGetMainBalanceResponse oneTopUpGetMainBalanceResponse, OneTopUpGetMainBalanceDataResponse oneTopUpGetMainBalanceDataResponse, int i, Object obj) {
        if ((i & 1) != 0) {
            oneTopUpGetMainBalanceDataResponse = oneTopUpGetMainBalanceResponse.oneTopUpGetMainBalanceDataResponse;
        }
        return oneTopUpGetMainBalanceResponse.copy(oneTopUpGetMainBalanceDataResponse);
    }

    @Nullable
    public final OneTopUpGetMainBalanceDataResponse component1() {
        return this.oneTopUpGetMainBalanceDataResponse;
    }

    @NotNull
    public final OneTopUpGetMainBalanceResponse copy(@Nullable OneTopUpGetMainBalanceDataResponse oneTopUpGetMainBalanceDataResponse) {
        return new OneTopUpGetMainBalanceResponse(oneTopUpGetMainBalanceDataResponse);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof OneTopUpGetMainBalanceResponse) && Intrinsics.areEqual(this.oneTopUpGetMainBalanceDataResponse, ((OneTopUpGetMainBalanceResponse) obj).oneTopUpGetMainBalanceDataResponse);
    }

    @Nullable
    public final OneTopUpGetMainBalanceDataResponse getOneTopUpGetMainBalanceDataResponse() {
        return this.oneTopUpGetMainBalanceDataResponse;
    }

    public int hashCode() {
        OneTopUpGetMainBalanceDataResponse oneTopUpGetMainBalanceDataResponse = this.oneTopUpGetMainBalanceDataResponse;
        if (oneTopUpGetMainBalanceDataResponse == null) {
            return 0;
        }
        return oneTopUpGetMainBalanceDataResponse.hashCode();
    }

    @NotNull
    public String toString() {
        OneTopUpGetMainBalanceDataResponse oneTopUpGetMainBalanceDataResponse = this.oneTopUpGetMainBalanceDataResponse;
        return "OneTopUpGetMainBalanceResponse(oneTopUpGetMainBalanceDataResponse=" + oneTopUpGetMainBalanceDataResponse + ")";
    }

    public OneTopUpGetMainBalanceResponse(@Nullable OneTopUpGetMainBalanceDataResponse oneTopUpGetMainBalanceDataResponse) {
        this.oneTopUpGetMainBalanceDataResponse = oneTopUpGetMainBalanceDataResponse;
    }

    public /* synthetic */ OneTopUpGetMainBalanceResponse(OneTopUpGetMainBalanceDataResponse oneTopUpGetMainBalanceDataResponse, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : oneTopUpGetMainBalanceDataResponse);
    }
}
