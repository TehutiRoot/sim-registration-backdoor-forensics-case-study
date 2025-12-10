package th.p047co.dtac.android.dtacone.model.customerenquiry;

import androidx.compose.runtime.internal.StabilityInferred;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 0)
@Metadata(m29143d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J'\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0016\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\bR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\b¨\u0006\u0015"}, m29142d2 = {"Lth/co/dtac/android/dtacone/model/customerenquiry/GetSubscriberMainBalanceResponse;", "", "balance", "", "sos", "ceDate", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getBalance", "()Ljava/lang/String;", "getCeDate", "getSos", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.model.customerenquiry.GetSubscriberMainBalanceResponse */
/* loaded from: classes8.dex */
public final class GetSubscriberMainBalanceResponse {
    public static final int $stable = 0;
    @SerializedName("balance")
    @NotNull
    private final String balance;
    @SerializedName("ceDate")
    @NotNull
    private final String ceDate;
    @SerializedName("sos")
    @NotNull
    private final String sos;

    public GetSubscriberMainBalanceResponse() {
        this(null, null, null, 7, null);
    }

    public static /* synthetic */ GetSubscriberMainBalanceResponse copy$default(GetSubscriberMainBalanceResponse getSubscriberMainBalanceResponse, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = getSubscriberMainBalanceResponse.balance;
        }
        if ((i & 2) != 0) {
            str2 = getSubscriberMainBalanceResponse.sos;
        }
        if ((i & 4) != 0) {
            str3 = getSubscriberMainBalanceResponse.ceDate;
        }
        return getSubscriberMainBalanceResponse.copy(str, str2, str3);
    }

    @NotNull
    public final String component1() {
        return this.balance;
    }

    @NotNull
    public final String component2() {
        return this.sos;
    }

    @NotNull
    public final String component3() {
        return this.ceDate;
    }

    @NotNull
    public final GetSubscriberMainBalanceResponse copy(@NotNull String balance, @NotNull String sos, @NotNull String ceDate) {
        Intrinsics.checkNotNullParameter(balance, "balance");
        Intrinsics.checkNotNullParameter(sos, "sos");
        Intrinsics.checkNotNullParameter(ceDate, "ceDate");
        return new GetSubscriberMainBalanceResponse(balance, sos, ceDate);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof GetSubscriberMainBalanceResponse) {
            GetSubscriberMainBalanceResponse getSubscriberMainBalanceResponse = (GetSubscriberMainBalanceResponse) obj;
            return Intrinsics.areEqual(this.balance, getSubscriberMainBalanceResponse.balance) && Intrinsics.areEqual(this.sos, getSubscriberMainBalanceResponse.sos) && Intrinsics.areEqual(this.ceDate, getSubscriberMainBalanceResponse.ceDate);
        }
        return false;
    }

    @NotNull
    public final String getBalance() {
        return this.balance;
    }

    @NotNull
    public final String getCeDate() {
        return this.ceDate;
    }

    @NotNull
    public final String getSos() {
        return this.sos;
    }

    public int hashCode() {
        return (((this.balance.hashCode() * 31) + this.sos.hashCode()) * 31) + this.ceDate.hashCode();
    }

    @NotNull
    public String toString() {
        String str = this.balance;
        String str2 = this.sos;
        String str3 = this.ceDate;
        return "GetSubscriberMainBalanceResponse(balance=" + str + ", sos=" + str2 + ", ceDate=" + str3 + ")";
    }

    public GetSubscriberMainBalanceResponse(@NotNull String balance, @NotNull String sos, @NotNull String ceDate) {
        Intrinsics.checkNotNullParameter(balance, "balance");
        Intrinsics.checkNotNullParameter(sos, "sos");
        Intrinsics.checkNotNullParameter(ceDate, "ceDate");
        this.balance = balance;
        this.sos = sos;
        this.ceDate = ceDate;
    }

    public /* synthetic */ GetSubscriberMainBalanceResponse(String str, String str2, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3);
    }
}