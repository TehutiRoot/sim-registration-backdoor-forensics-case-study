package th.p047co.dtac.android.dtacone.model.blacklist;

import androidx.compose.runtime.internal.StabilityInferred;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import th.p047co.dtac.android.dtacone.util.constant.customerenquiry.ConstsKt;
import th.p047co.dtac.android.dtacone.view.fragment.mrtr_prepaid_registration.family_sim.InputPostpaidFamilySimSubscriberFragment;

@StabilityInferred(parameters = 0)
@Metadata(m29143d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u001e\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BY\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\n\u001a\u00020\u0003\u0012\u0006\u0010\u000b\u001a\u00020\u0003¢\u0006\u0002\u0010\fJ\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001f\u001a\u00020\u0003HÆ\u0003Ji\u0010 \u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\n\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\u0003HÆ\u0001J\u0013\u0010!\u001a\u00020\"2\b\u0010#\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010$\u001a\u00020%HÖ\u0001J\t\u0010&\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\n\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0016\u0010\u000b\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0018\u0010\b\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000eR\u0018\u0010\t\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000eR\u0016\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000eR\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u000eR\u0016\u0010\u0006\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u000eR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u000eR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u000e¨\u0006'"}, m29142d2 = {"Lth/co/dtac/android/dtacone/model/blacklist/SaveBlacklistSharingConsentRequest;", "", "userCode", "", "userLan", "retailerNumber", ConstsKt.TELEPHONE_TYPE, InputPostpaidFamilySimSubscriberFragment.SUB_NUM, "idNumber", "idType", "customerNumber", "customerSignatureImage", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getCustomerNumber", "()Ljava/lang/String;", "getCustomerSignatureImage", "getIdNumber", "getIdType", "getRetailerNumber", "getSubscriberNumber", "getTelephoneType", "getUserCode", "getUserLan", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "", "other", "hashCode", "", "toString", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.model.blacklist.SaveBlacklistSharingConsentRequest */
/* loaded from: classes8.dex */
public final class SaveBlacklistSharingConsentRequest {
    public static final int $stable = 0;
    @SerializedName("customerNumber")
    @NotNull
    private final String customerNumber;
    @SerializedName("customerSignatureImage")
    @NotNull
    private final String customerSignatureImage;
    @SerializedName("idNumber")
    @Nullable
    private final String idNumber;
    @SerializedName("idType")
    @Nullable
    private final String idType;
    @SerializedName("retailerNumber")
    @NotNull
    private final String retailerNumber;
    @SerializedName(InputPostpaidFamilySimSubscriberFragment.SUB_NUM)
    @Nullable
    private final String subscriberNumber;
    @SerializedName(ConstsKt.TELEPHONE_TYPE)
    @NotNull
    private final String telephoneType;
    @SerializedName("userCode")
    @NotNull
    private final String userCode;
    @SerializedName("userLan")
    @NotNull
    private final String userLan;

    public SaveBlacklistSharingConsentRequest(@NotNull String userCode, @NotNull String userLan, @NotNull String retailerNumber, @NotNull String telephoneType, @Nullable String str, @Nullable String str2, @Nullable String str3, @NotNull String customerNumber, @NotNull String customerSignatureImage) {
        Intrinsics.checkNotNullParameter(userCode, "userCode");
        Intrinsics.checkNotNullParameter(userLan, "userLan");
        Intrinsics.checkNotNullParameter(retailerNumber, "retailerNumber");
        Intrinsics.checkNotNullParameter(telephoneType, "telephoneType");
        Intrinsics.checkNotNullParameter(customerNumber, "customerNumber");
        Intrinsics.checkNotNullParameter(customerSignatureImage, "customerSignatureImage");
        this.userCode = userCode;
        this.userLan = userLan;
        this.retailerNumber = retailerNumber;
        this.telephoneType = telephoneType;
        this.subscriberNumber = str;
        this.idNumber = str2;
        this.idType = str3;
        this.customerNumber = customerNumber;
        this.customerSignatureImage = customerSignatureImage;
    }

    @NotNull
    public final String component1() {
        return this.userCode;
    }

    @NotNull
    public final String component2() {
        return this.userLan;
    }

    @NotNull
    public final String component3() {
        return this.retailerNumber;
    }

    @NotNull
    public final String component4() {
        return this.telephoneType;
    }

    @Nullable
    public final String component5() {
        return this.subscriberNumber;
    }

    @Nullable
    public final String component6() {
        return this.idNumber;
    }

    @Nullable
    public final String component7() {
        return this.idType;
    }

    @NotNull
    public final String component8() {
        return this.customerNumber;
    }

    @NotNull
    public final String component9() {
        return this.customerSignatureImage;
    }

    @NotNull
    public final SaveBlacklistSharingConsentRequest copy(@NotNull String userCode, @NotNull String userLan, @NotNull String retailerNumber, @NotNull String telephoneType, @Nullable String str, @Nullable String str2, @Nullable String str3, @NotNull String customerNumber, @NotNull String customerSignatureImage) {
        Intrinsics.checkNotNullParameter(userCode, "userCode");
        Intrinsics.checkNotNullParameter(userLan, "userLan");
        Intrinsics.checkNotNullParameter(retailerNumber, "retailerNumber");
        Intrinsics.checkNotNullParameter(telephoneType, "telephoneType");
        Intrinsics.checkNotNullParameter(customerNumber, "customerNumber");
        Intrinsics.checkNotNullParameter(customerSignatureImage, "customerSignatureImage");
        return new SaveBlacklistSharingConsentRequest(userCode, userLan, retailerNumber, telephoneType, str, str2, str3, customerNumber, customerSignatureImage);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof SaveBlacklistSharingConsentRequest) {
            SaveBlacklistSharingConsentRequest saveBlacklistSharingConsentRequest = (SaveBlacklistSharingConsentRequest) obj;
            return Intrinsics.areEqual(this.userCode, saveBlacklistSharingConsentRequest.userCode) && Intrinsics.areEqual(this.userLan, saveBlacklistSharingConsentRequest.userLan) && Intrinsics.areEqual(this.retailerNumber, saveBlacklistSharingConsentRequest.retailerNumber) && Intrinsics.areEqual(this.telephoneType, saveBlacklistSharingConsentRequest.telephoneType) && Intrinsics.areEqual(this.subscriberNumber, saveBlacklistSharingConsentRequest.subscriberNumber) && Intrinsics.areEqual(this.idNumber, saveBlacklistSharingConsentRequest.idNumber) && Intrinsics.areEqual(this.idType, saveBlacklistSharingConsentRequest.idType) && Intrinsics.areEqual(this.customerNumber, saveBlacklistSharingConsentRequest.customerNumber) && Intrinsics.areEqual(this.customerSignatureImage, saveBlacklistSharingConsentRequest.customerSignatureImage);
        }
        return false;
    }

    @NotNull
    public final String getCustomerNumber() {
        return this.customerNumber;
    }

    @NotNull
    public final String getCustomerSignatureImage() {
        return this.customerSignatureImage;
    }

    @Nullable
    public final String getIdNumber() {
        return this.idNumber;
    }

    @Nullable
    public final String getIdType() {
        return this.idType;
    }

    @NotNull
    public final String getRetailerNumber() {
        return this.retailerNumber;
    }

    @Nullable
    public final String getSubscriberNumber() {
        return this.subscriberNumber;
    }

    @NotNull
    public final String getTelephoneType() {
        return this.telephoneType;
    }

    @NotNull
    public final String getUserCode() {
        return this.userCode;
    }

    @NotNull
    public final String getUserLan() {
        return this.userLan;
    }

    public int hashCode() {
        int hashCode = ((((((this.userCode.hashCode() * 31) + this.userLan.hashCode()) * 31) + this.retailerNumber.hashCode()) * 31) + this.telephoneType.hashCode()) * 31;
        String str = this.subscriberNumber;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.idNumber;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.idType;
        return ((((hashCode3 + (str3 != null ? str3.hashCode() : 0)) * 31) + this.customerNumber.hashCode()) * 31) + this.customerSignatureImage.hashCode();
    }

    @NotNull
    public String toString() {
        String str = this.userCode;
        String str2 = this.userLan;
        String str3 = this.retailerNumber;
        String str4 = this.telephoneType;
        String str5 = this.subscriberNumber;
        String str6 = this.idNumber;
        String str7 = this.idType;
        String str8 = this.customerNumber;
        String str9 = this.customerSignatureImage;
        return "SaveBlacklistSharingConsentRequest(userCode=" + str + ", userLan=" + str2 + ", retailerNumber=" + str3 + ", telephoneType=" + str4 + ", subscriberNumber=" + str5 + ", idNumber=" + str6 + ", idType=" + str7 + ", customerNumber=" + str8 + ", customerSignatureImage=" + str9 + ")";
    }

    public /* synthetic */ SaveBlacklistSharingConsentRequest(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, str4, (i & 16) != 0 ? null : str5, (i & 32) != 0 ? null : str6, (i & 64) != 0 ? null : str7, str8, str9);
    }
}