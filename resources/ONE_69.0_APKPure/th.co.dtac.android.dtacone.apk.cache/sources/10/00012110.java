package th.p047co.dtac.android.dtacone.model.withDevice.CheckInputUssd.response;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.internal.StabilityInferred;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.android.parcel.Parcelize;
import org.apache.commons.cli.HelpFormatter;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 0)
@Parcelize
@Metadata(m29143d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u001d\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u007f\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003\u0012\b\b\u0002\u0010\b\u001a\u00020\u0003\u0012\b\b\u0002\u0010\t\u001a\u00020\u0003\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0010¢\u0006\u0002\u0010\u0011J\u000b\u0010!\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\"\u001a\u0004\u0018\u00010\u000eHÆ\u0003J\t\u0010#\u001a\u00020\u0010HÆ\u0003J\u000b\u0010$\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010%\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010&\u001a\u00020\u0003HÆ\u0003J\t\u0010'\u001a\u00020\u0003HÆ\u0003J\t\u0010(\u001a\u00020\u0003HÆ\u0003J\t\u0010)\u001a\u00020\u0003HÆ\u0003J\u000b\u0010*\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010+\u001a\u0004\u0018\u00010\fHÆ\u0003J\u0083\u0001\u0010,\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u0010HÆ\u0001J\t\u0010-\u001a\u00020.HÖ\u0001J\u0013\u0010/\u001a\u00020\u00102\b\u00100\u001a\u0004\u0018\u000101HÖ\u0003J\t\u00102\u001a\u00020.HÖ\u0001J\t\u00103\u001a\u00020\u0003HÖ\u0001J\u0019\u00104\u001a\u0002052\u0006\u00106\u001a\u0002072\u0006\u00108\u001a\u00020.HÖ\u0001R\u0018\u0010\n\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0018\u0010\r\u001a\u0004\u0018\u00010\u000e8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0013R\u0018\u0010\u000b\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0016\u0010\u0007\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0013R\u0016\u0010\u0006\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0013R\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0013R\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0013R\u0016\u0010\u000f\u001a\u00020\u00108\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0016\u0010\t\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0013R\u0016\u0010\b\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u0013¨\u00069"}, m29142d2 = {"Lth/co/dtac/android/dtacone/model/withDevice/CheckInputUssd/response/CheckInputUssdResponse;", "Landroid/os/Parcelable;", "deviceType", "", "inputFieldId", "penalty", "extraAdvanceAmountText", "extraAdvanceAmount", "totalPaymentText", "totalPayment", "campaignUssdText", FirebaseAnalytics.Param.DISCOUNT, "Lth/co/dtac/android/dtacone/model/withDevice/CheckInputUssd/response/Discount;", "customerInfo", "Lth/co/dtac/android/dtacone/model/withDevice/CheckInputUssd/response/CustomerInfo;", "requireUssdCode", "", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lth/co/dtac/android/dtacone/model/withDevice/CheckInputUssd/response/Discount;Lth/co/dtac/android/dtacone/model/withDevice/CheckInputUssd/response/CustomerInfo;Z)V", "getCampaignUssdText", "()Ljava/lang/String;", "getCustomerInfo", "()Lth/co/dtac/android/dtacone/model/withDevice/CheckInputUssd/response/CustomerInfo;", "getDeviceType", "getDiscount", "()Lth/co/dtac/android/dtacone/model/withDevice/CheckInputUssd/response/Discount;", "getExtraAdvanceAmount", "getExtraAdvanceAmountText", "getInputFieldId", "getPenalty", "getRequireUssdCode", "()Z", "getTotalPayment", "getTotalPaymentText", "component1", "component10", "component11", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "describeContents", "", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.model.withDevice.CheckInputUssd.response.CheckInputUssdResponse */
/* loaded from: classes8.dex */
public final class CheckInputUssdResponse implements Parcelable {
    public static final int $stable = 0;
    @NotNull
    public static final Parcelable.Creator<CheckInputUssdResponse> CREATOR = new Creator();
    @SerializedName("campaignUssdText")
    @Nullable
    private final String campaignUssdText;
    @SerializedName("customerInfo")
    @Nullable
    private final CustomerInfo customerInfo;
    @SerializedName("deviceType")
    @Nullable
    private final String deviceType;
    @SerializedName(FirebaseAnalytics.Param.DISCOUNT)
    @Nullable
    private final Discount discount;
    @SerializedName("extraAdvanceAmount")
    @NotNull
    private final String extraAdvanceAmount;
    @SerializedName("extraAdvanceAmountText")
    @NotNull
    private final String extraAdvanceAmountText;
    @SerializedName("inputFieldId")
    @Nullable
    private final String inputFieldId;
    @SerializedName("penalty")
    @Nullable
    private final String penalty;
    @SerializedName("requireUssdCode")
    private final boolean requireUssdCode;
    @SerializedName("totalPayment")
    @NotNull
    private final String totalPayment;
    @SerializedName("totalPaymentText")
    @NotNull
    private final String totalPaymentText;

    @Metadata(m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
    /* renamed from: th.co.dtac.android.dtacone.model.withDevice.CheckInputUssd.response.CheckInputUssdResponse$Creator */
    /* loaded from: classes8.dex */
    public static final class Creator implements Parcelable.Creator<CheckInputUssdResponse> {
        @Override // android.os.Parcelable.Creator
        @NotNull
        public final CheckInputUssdResponse createFromParcel(@NotNull Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new CheckInputUssdResponse(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), (Discount) parcel.readParcelable(CheckInputUssdResponse.class.getClassLoader()), (CustomerInfo) parcel.readParcelable(CheckInputUssdResponse.class.getClassLoader()), parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        @NotNull
        public final CheckInputUssdResponse[] newArray(int i) {
            return new CheckInputUssdResponse[i];
        }
    }

    public CheckInputUssdResponse() {
        this(null, null, null, null, null, null, null, null, null, null, false, 2047, null);
    }

    @Nullable
    public final String component1() {
        return this.deviceType;
    }

    @Nullable
    public final CustomerInfo component10() {
        return this.customerInfo;
    }

    public final boolean component11() {
        return this.requireUssdCode;
    }

    @Nullable
    public final String component2() {
        return this.inputFieldId;
    }

    @Nullable
    public final String component3() {
        return this.penalty;
    }

    @NotNull
    public final String component4() {
        return this.extraAdvanceAmountText;
    }

    @NotNull
    public final String component5() {
        return this.extraAdvanceAmount;
    }

    @NotNull
    public final String component6() {
        return this.totalPaymentText;
    }

    @NotNull
    public final String component7() {
        return this.totalPayment;
    }

    @Nullable
    public final String component8() {
        return this.campaignUssdText;
    }

    @Nullable
    public final Discount component9() {
        return this.discount;
    }

    @NotNull
    public final CheckInputUssdResponse copy(@Nullable String str, @Nullable String str2, @Nullable String str3, @NotNull String extraAdvanceAmountText, @NotNull String extraAdvanceAmount, @NotNull String totalPaymentText, @NotNull String totalPayment, @Nullable String str4, @Nullable Discount discount, @Nullable CustomerInfo customerInfo, boolean z) {
        Intrinsics.checkNotNullParameter(extraAdvanceAmountText, "extraAdvanceAmountText");
        Intrinsics.checkNotNullParameter(extraAdvanceAmount, "extraAdvanceAmount");
        Intrinsics.checkNotNullParameter(totalPaymentText, "totalPaymentText");
        Intrinsics.checkNotNullParameter(totalPayment, "totalPayment");
        return new CheckInputUssdResponse(str, str2, str3, extraAdvanceAmountText, extraAdvanceAmount, totalPaymentText, totalPayment, str4, discount, customerInfo, z);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof CheckInputUssdResponse) {
            CheckInputUssdResponse checkInputUssdResponse = (CheckInputUssdResponse) obj;
            return Intrinsics.areEqual(this.deviceType, checkInputUssdResponse.deviceType) && Intrinsics.areEqual(this.inputFieldId, checkInputUssdResponse.inputFieldId) && Intrinsics.areEqual(this.penalty, checkInputUssdResponse.penalty) && Intrinsics.areEqual(this.extraAdvanceAmountText, checkInputUssdResponse.extraAdvanceAmountText) && Intrinsics.areEqual(this.extraAdvanceAmount, checkInputUssdResponse.extraAdvanceAmount) && Intrinsics.areEqual(this.totalPaymentText, checkInputUssdResponse.totalPaymentText) && Intrinsics.areEqual(this.totalPayment, checkInputUssdResponse.totalPayment) && Intrinsics.areEqual(this.campaignUssdText, checkInputUssdResponse.campaignUssdText) && Intrinsics.areEqual(this.discount, checkInputUssdResponse.discount) && Intrinsics.areEqual(this.customerInfo, checkInputUssdResponse.customerInfo) && this.requireUssdCode == checkInputUssdResponse.requireUssdCode;
        }
        return false;
    }

    @Nullable
    public final String getCampaignUssdText() {
        return this.campaignUssdText;
    }

    @Nullable
    public final CustomerInfo getCustomerInfo() {
        return this.customerInfo;
    }

    @Nullable
    public final String getDeviceType() {
        return this.deviceType;
    }

    @Nullable
    public final Discount getDiscount() {
        return this.discount;
    }

    @NotNull
    public final String getExtraAdvanceAmount() {
        return this.extraAdvanceAmount;
    }

    @NotNull
    public final String getExtraAdvanceAmountText() {
        return this.extraAdvanceAmountText;
    }

    @Nullable
    public final String getInputFieldId() {
        return this.inputFieldId;
    }

    @Nullable
    public final String getPenalty() {
        return this.penalty;
    }

    public final boolean getRequireUssdCode() {
        return this.requireUssdCode;
    }

    @NotNull
    public final String getTotalPayment() {
        return this.totalPayment;
    }

    @NotNull
    public final String getTotalPaymentText() {
        return this.totalPaymentText;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        String str = this.deviceType;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.inputFieldId;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.penalty;
        int hashCode3 = (((((((((hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31) + this.extraAdvanceAmountText.hashCode()) * 31) + this.extraAdvanceAmount.hashCode()) * 31) + this.totalPaymentText.hashCode()) * 31) + this.totalPayment.hashCode()) * 31;
        String str4 = this.campaignUssdText;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Discount discount = this.discount;
        int hashCode5 = (hashCode4 + (discount == null ? 0 : discount.hashCode())) * 31;
        CustomerInfo customerInfo = this.customerInfo;
        int hashCode6 = (hashCode5 + (customerInfo != null ? customerInfo.hashCode() : 0)) * 31;
        boolean z = this.requireUssdCode;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        return hashCode6 + i;
    }

    @NotNull
    public String toString() {
        String str = this.deviceType;
        String str2 = this.inputFieldId;
        String str3 = this.penalty;
        String str4 = this.extraAdvanceAmountText;
        String str5 = this.extraAdvanceAmount;
        String str6 = this.totalPaymentText;
        String str7 = this.totalPayment;
        String str8 = this.campaignUssdText;
        Discount discount = this.discount;
        CustomerInfo customerInfo = this.customerInfo;
        boolean z = this.requireUssdCode;
        return "CheckInputUssdResponse(deviceType=" + str + ", inputFieldId=" + str2 + ", penalty=" + str3 + ", extraAdvanceAmountText=" + str4 + ", extraAdvanceAmount=" + str5 + ", totalPaymentText=" + str6 + ", totalPayment=" + str7 + ", campaignUssdText=" + str8 + ", discount=" + discount + ", customerInfo=" + customerInfo + ", requireUssdCode=" + z + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel out, int i) {
        Intrinsics.checkNotNullParameter(out, "out");
        out.writeString(this.deviceType);
        out.writeString(this.inputFieldId);
        out.writeString(this.penalty);
        out.writeString(this.extraAdvanceAmountText);
        out.writeString(this.extraAdvanceAmount);
        out.writeString(this.totalPaymentText);
        out.writeString(this.totalPayment);
        out.writeString(this.campaignUssdText);
        out.writeParcelable(this.discount, i);
        out.writeParcelable(this.customerInfo, i);
        out.writeInt(this.requireUssdCode ? 1 : 0);
    }

    public CheckInputUssdResponse(@Nullable String str, @Nullable String str2, @Nullable String str3, @NotNull String extraAdvanceAmountText, @NotNull String extraAdvanceAmount, @NotNull String totalPaymentText, @NotNull String totalPayment, @Nullable String str4, @Nullable Discount discount, @Nullable CustomerInfo customerInfo, boolean z) {
        Intrinsics.checkNotNullParameter(extraAdvanceAmountText, "extraAdvanceAmountText");
        Intrinsics.checkNotNullParameter(extraAdvanceAmount, "extraAdvanceAmount");
        Intrinsics.checkNotNullParameter(totalPaymentText, "totalPaymentText");
        Intrinsics.checkNotNullParameter(totalPayment, "totalPayment");
        this.deviceType = str;
        this.inputFieldId = str2;
        this.penalty = str3;
        this.extraAdvanceAmountText = extraAdvanceAmountText;
        this.extraAdvanceAmount = extraAdvanceAmount;
        this.totalPaymentText = totalPaymentText;
        this.totalPayment = totalPayment;
        this.campaignUssdText = str4;
        this.discount = discount;
        this.customerInfo = customerInfo;
        this.requireUssdCode = z;
    }

    public /* synthetic */ CheckInputUssdResponse(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, Discount discount, CustomerInfo customerInfo, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? HelpFormatter.DEFAULT_OPT_PREFIX : str4, (i & 16) != 0 ? HelpFormatter.DEFAULT_OPT_PREFIX : str5, (i & 32) != 0 ? HelpFormatter.DEFAULT_OPT_PREFIX : str6, (i & 64) == 0 ? str7 : HelpFormatter.DEFAULT_OPT_PREFIX, (i & 128) != 0 ? null : str8, (i & 256) != 0 ? null : discount, (i & 512) == 0 ? customerInfo : null, (i & 1024) != 0 ? false : z);
    }
}