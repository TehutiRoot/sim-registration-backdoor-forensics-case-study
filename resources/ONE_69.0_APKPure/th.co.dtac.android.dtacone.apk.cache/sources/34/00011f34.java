package th.p047co.dtac.android.dtacone.model.mrtr_postpaid.registration;

import androidx.compose.runtime.internal.StabilityInferred;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 0)
@Metadata(m29143d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003¢\u0006\u0002\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J'\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\bR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0014"}, m29142d2 = {"Lth/co/dtac/android/dtacone/model/mrtr_postpaid/registration/MrtrPostpaidRegistrationResponse;", "", "transactionId", "", "isDupTran", "custNumb", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getCustNumb", "()Ljava/lang/String;", "getTransactionId", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.model.mrtr_postpaid.registration.MrtrPostpaidRegistrationResponse */
/* loaded from: classes8.dex */
public final class MrtrPostpaidRegistrationResponse {
    public static final int $stable = 0;
    @SerializedName("custNumb")
    @NotNull
    private final String custNumb;
    @SerializedName("isDupTran")
    @NotNull
    private final String isDupTran;
    @SerializedName("transactionId")
    @NotNull
    private final String transactionId;

    public MrtrPostpaidRegistrationResponse() {
        this(null, null, null, 7, null);
    }

    public static /* synthetic */ MrtrPostpaidRegistrationResponse copy$default(MrtrPostpaidRegistrationResponse mrtrPostpaidRegistrationResponse, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = mrtrPostpaidRegistrationResponse.transactionId;
        }
        if ((i & 2) != 0) {
            str2 = mrtrPostpaidRegistrationResponse.isDupTran;
        }
        if ((i & 4) != 0) {
            str3 = mrtrPostpaidRegistrationResponse.custNumb;
        }
        return mrtrPostpaidRegistrationResponse.copy(str, str2, str3);
    }

    @NotNull
    public final String component1() {
        return this.transactionId;
    }

    @NotNull
    public final String component2() {
        return this.isDupTran;
    }

    @NotNull
    public final String component3() {
        return this.custNumb;
    }

    @NotNull
    public final MrtrPostpaidRegistrationResponse copy(@NotNull String transactionId, @NotNull String isDupTran, @NotNull String custNumb) {
        Intrinsics.checkNotNullParameter(transactionId, "transactionId");
        Intrinsics.checkNotNullParameter(isDupTran, "isDupTran");
        Intrinsics.checkNotNullParameter(custNumb, "custNumb");
        return new MrtrPostpaidRegistrationResponse(transactionId, isDupTran, custNumb);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof MrtrPostpaidRegistrationResponse) {
            MrtrPostpaidRegistrationResponse mrtrPostpaidRegistrationResponse = (MrtrPostpaidRegistrationResponse) obj;
            return Intrinsics.areEqual(this.transactionId, mrtrPostpaidRegistrationResponse.transactionId) && Intrinsics.areEqual(this.isDupTran, mrtrPostpaidRegistrationResponse.isDupTran) && Intrinsics.areEqual(this.custNumb, mrtrPostpaidRegistrationResponse.custNumb);
        }
        return false;
    }

    @NotNull
    public final String getCustNumb() {
        return this.custNumb;
    }

    @NotNull
    public final String getTransactionId() {
        return this.transactionId;
    }

    public int hashCode() {
        return (((this.transactionId.hashCode() * 31) + this.isDupTran.hashCode()) * 31) + this.custNumb.hashCode();
    }

    @NotNull
    public final String isDupTran() {
        return this.isDupTran;
    }

    @NotNull
    public String toString() {
        String str = this.transactionId;
        String str2 = this.isDupTran;
        String str3 = this.custNumb;
        return "MrtrPostpaidRegistrationResponse(transactionId=" + str + ", isDupTran=" + str2 + ", custNumb=" + str3 + ")";
    }

    public MrtrPostpaidRegistrationResponse(@NotNull String transactionId, @NotNull String isDupTran, @NotNull String custNumb) {
        Intrinsics.checkNotNullParameter(transactionId, "transactionId");
        Intrinsics.checkNotNullParameter(isDupTran, "isDupTran");
        Intrinsics.checkNotNullParameter(custNumb, "custNumb");
        this.transactionId = transactionId;
        this.isDupTran = isDupTran;
        this.custNumb = custNumb;
    }

    public /* synthetic */ MrtrPostpaidRegistrationResponse(String str, String str2, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3);
    }
}