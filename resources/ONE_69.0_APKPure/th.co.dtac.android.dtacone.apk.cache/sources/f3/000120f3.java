package th.p047co.dtac.android.dtacone.model.upPass.kyc2ndLine;

import androidx.compose.runtime.internal.StabilityInferred;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 0)
@Metadata(m29143d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0015\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BA\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003\u0012\b\b\u0002\u0010\b\u001a\u00020\u0003¢\u0006\u0002\u0010\tJ\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003JE\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001J\t\u0010\u001d\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0016\u0010\u0007\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000bR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000bR\u0016\u0010\b\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000bR\u0016\u0010\u0006\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000b¨\u0006\u001e"}, m29142d2 = {"Lth/co/dtac/android/dtacone/model/upPass/kyc2ndLine/Kyc2SubmitRequest;", "", "orderType", "", "customerMobileNumber", "cardType", "slugID", "frResult", "simCardNumber", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getCardType", "()Ljava/lang/String;", "getCustomerMobileNumber", "getFrResult", "getOrderType", "getSimCardNumber", "getSlugID", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "", "toString", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.model.upPass.kyc2ndLine.Kyc2SubmitRequest */
/* loaded from: classes8.dex */
public final class Kyc2SubmitRequest {
    public static final int $stable = 0;
    @SerializedName("cardType")
    @NotNull
    private final String cardType;
    @SerializedName("customerMobileNumber")
    @NotNull
    private final String customerMobileNumber;
    @SerializedName("frResult")
    @NotNull
    private final String frResult;
    @SerializedName("orderType")
    @NotNull
    private final String orderType;
    @SerializedName("simCardNumber")
    @NotNull
    private final String simCardNumber;
    @SerializedName("slugID")
    @NotNull
    private final String slugID;

    public Kyc2SubmitRequest() {
        this(null, null, null, null, null, null, 63, null);
    }

    public static /* synthetic */ Kyc2SubmitRequest copy$default(Kyc2SubmitRequest kyc2SubmitRequest, String str, String str2, String str3, String str4, String str5, String str6, int i, Object obj) {
        if ((i & 1) != 0) {
            str = kyc2SubmitRequest.orderType;
        }
        if ((i & 2) != 0) {
            str2 = kyc2SubmitRequest.customerMobileNumber;
        }
        String str7 = str2;
        if ((i & 4) != 0) {
            str3 = kyc2SubmitRequest.cardType;
        }
        String str8 = str3;
        if ((i & 8) != 0) {
            str4 = kyc2SubmitRequest.slugID;
        }
        String str9 = str4;
        if ((i & 16) != 0) {
            str5 = kyc2SubmitRequest.frResult;
        }
        String str10 = str5;
        if ((i & 32) != 0) {
            str6 = kyc2SubmitRequest.simCardNumber;
        }
        return kyc2SubmitRequest.copy(str, str7, str8, str9, str10, str6);
    }

    @NotNull
    public final String component1() {
        return this.orderType;
    }

    @NotNull
    public final String component2() {
        return this.customerMobileNumber;
    }

    @NotNull
    public final String component3() {
        return this.cardType;
    }

    @NotNull
    public final String component4() {
        return this.slugID;
    }

    @NotNull
    public final String component5() {
        return this.frResult;
    }

    @NotNull
    public final String component6() {
        return this.simCardNumber;
    }

    @NotNull
    public final Kyc2SubmitRequest copy(@NotNull String orderType, @NotNull String customerMobileNumber, @NotNull String cardType, @NotNull String slugID, @NotNull String frResult, @NotNull String simCardNumber) {
        Intrinsics.checkNotNullParameter(orderType, "orderType");
        Intrinsics.checkNotNullParameter(customerMobileNumber, "customerMobileNumber");
        Intrinsics.checkNotNullParameter(cardType, "cardType");
        Intrinsics.checkNotNullParameter(slugID, "slugID");
        Intrinsics.checkNotNullParameter(frResult, "frResult");
        Intrinsics.checkNotNullParameter(simCardNumber, "simCardNumber");
        return new Kyc2SubmitRequest(orderType, customerMobileNumber, cardType, slugID, frResult, simCardNumber);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Kyc2SubmitRequest) {
            Kyc2SubmitRequest kyc2SubmitRequest = (Kyc2SubmitRequest) obj;
            return Intrinsics.areEqual(this.orderType, kyc2SubmitRequest.orderType) && Intrinsics.areEqual(this.customerMobileNumber, kyc2SubmitRequest.customerMobileNumber) && Intrinsics.areEqual(this.cardType, kyc2SubmitRequest.cardType) && Intrinsics.areEqual(this.slugID, kyc2SubmitRequest.slugID) && Intrinsics.areEqual(this.frResult, kyc2SubmitRequest.frResult) && Intrinsics.areEqual(this.simCardNumber, kyc2SubmitRequest.simCardNumber);
        }
        return false;
    }

    @NotNull
    public final String getCardType() {
        return this.cardType;
    }

    @NotNull
    public final String getCustomerMobileNumber() {
        return this.customerMobileNumber;
    }

    @NotNull
    public final String getFrResult() {
        return this.frResult;
    }

    @NotNull
    public final String getOrderType() {
        return this.orderType;
    }

    @NotNull
    public final String getSimCardNumber() {
        return this.simCardNumber;
    }

    @NotNull
    public final String getSlugID() {
        return this.slugID;
    }

    public int hashCode() {
        return (((((((((this.orderType.hashCode() * 31) + this.customerMobileNumber.hashCode()) * 31) + this.cardType.hashCode()) * 31) + this.slugID.hashCode()) * 31) + this.frResult.hashCode()) * 31) + this.simCardNumber.hashCode();
    }

    @NotNull
    public String toString() {
        String str = this.orderType;
        String str2 = this.customerMobileNumber;
        String str3 = this.cardType;
        String str4 = this.slugID;
        String str5 = this.frResult;
        String str6 = this.simCardNumber;
        return "Kyc2SubmitRequest(orderType=" + str + ", customerMobileNumber=" + str2 + ", cardType=" + str3 + ", slugID=" + str4 + ", frResult=" + str5 + ", simCardNumber=" + str6 + ")";
    }

    public Kyc2SubmitRequest(@NotNull String orderType, @NotNull String customerMobileNumber, @NotNull String cardType, @NotNull String slugID, @NotNull String frResult, @NotNull String simCardNumber) {
        Intrinsics.checkNotNullParameter(orderType, "orderType");
        Intrinsics.checkNotNullParameter(customerMobileNumber, "customerMobileNumber");
        Intrinsics.checkNotNullParameter(cardType, "cardType");
        Intrinsics.checkNotNullParameter(slugID, "slugID");
        Intrinsics.checkNotNullParameter(frResult, "frResult");
        Intrinsics.checkNotNullParameter(simCardNumber, "simCardNumber");
        this.orderType = orderType;
        this.customerMobileNumber = customerMobileNumber;
        this.cardType = cardType;
        this.slugID = slugID;
        this.frResult = frResult;
        this.simCardNumber = simCardNumber;
    }

    public /* synthetic */ Kyc2SubmitRequest(String str, String str2, String str3, String str4, String str5, String str6, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? "" : str4, (i & 16) != 0 ? "" : str5, (i & 32) != 0 ? "" : str6);
    }
}