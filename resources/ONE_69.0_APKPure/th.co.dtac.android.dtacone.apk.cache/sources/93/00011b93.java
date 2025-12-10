package th.p047co.dtac.android.dtacone.model.appOne.postpaid.true_company;

import androidx.compose.runtime.internal.StabilityInferred;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 0)
@Metadata(m29143d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B)\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0006J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0003J-\u0010\u000e\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\bR\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\b¨\u0006\u0015"}, m29142d2 = {"Lth/co/dtac/android/dtacone/model/appOne/postpaid/true_company/OnePostpaidValidateBlacklist3OperRequest;", "", "orderId", "", "idNumber", "customerScreening", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getCustomerScreening", "()Ljava/lang/String;", "getIdNumber", "getOrderId", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.model.appOne.postpaid.true_company.OnePostpaidValidateBlacklist3OperRequest */
/* loaded from: classes8.dex */
public final class OnePostpaidValidateBlacklist3OperRequest {
    public static final int $stable = 0;
    @SerializedName("customerScreening")
    @Nullable
    private final String customerScreening;
    @SerializedName("idNumber")
    @Nullable
    private final String idNumber;
    @SerializedName("orderId")
    @Nullable
    private final String orderId;

    public OnePostpaidValidateBlacklist3OperRequest() {
        this(null, null, null, 7, null);
    }

    public static /* synthetic */ OnePostpaidValidateBlacklist3OperRequest copy$default(OnePostpaidValidateBlacklist3OperRequest onePostpaidValidateBlacklist3OperRequest, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = onePostpaidValidateBlacklist3OperRequest.orderId;
        }
        if ((i & 2) != 0) {
            str2 = onePostpaidValidateBlacklist3OperRequest.idNumber;
        }
        if ((i & 4) != 0) {
            str3 = onePostpaidValidateBlacklist3OperRequest.customerScreening;
        }
        return onePostpaidValidateBlacklist3OperRequest.copy(str, str2, str3);
    }

    @Nullable
    public final String component1() {
        return this.orderId;
    }

    @Nullable
    public final String component2() {
        return this.idNumber;
    }

    @Nullable
    public final String component3() {
        return this.customerScreening;
    }

    @NotNull
    public final OnePostpaidValidateBlacklist3OperRequest copy(@Nullable String str, @Nullable String str2, @Nullable String str3) {
        return new OnePostpaidValidateBlacklist3OperRequest(str, str2, str3);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof OnePostpaidValidateBlacklist3OperRequest) {
            OnePostpaidValidateBlacklist3OperRequest onePostpaidValidateBlacklist3OperRequest = (OnePostpaidValidateBlacklist3OperRequest) obj;
            return Intrinsics.areEqual(this.orderId, onePostpaidValidateBlacklist3OperRequest.orderId) && Intrinsics.areEqual(this.idNumber, onePostpaidValidateBlacklist3OperRequest.idNumber) && Intrinsics.areEqual(this.customerScreening, onePostpaidValidateBlacklist3OperRequest.customerScreening);
        }
        return false;
    }

    @Nullable
    public final String getCustomerScreening() {
        return this.customerScreening;
    }

    @Nullable
    public final String getIdNumber() {
        return this.idNumber;
    }

    @Nullable
    public final String getOrderId() {
        return this.orderId;
    }

    public int hashCode() {
        String str = this.orderId;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.idNumber;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.customerScreening;
        return hashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        String str = this.orderId;
        String str2 = this.idNumber;
        String str3 = this.customerScreening;
        return "OnePostpaidValidateBlacklist3OperRequest(orderId=" + str + ", idNumber=" + str2 + ", customerScreening=" + str3 + ")";
    }

    public OnePostpaidValidateBlacklist3OperRequest(@Nullable String str, @Nullable String str2, @Nullable String str3) {
        this.orderId = str;
        this.idNumber = str2;
        this.customerScreening = str3;
    }

    public /* synthetic */ OnePostpaidValidateBlacklist3OperRequest(String str, String str2, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3);
    }
}