package th.p047co.dtac.android.dtacone.model.appOne.oneDeviceSaleTrue;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import th.p047co.dtac.android.dtacone.model.appOne.common.true_company.common_package.PriceplanListItem;
import th.p047co.dtac.android.dtacone.model.appOne.mailing.OneAddressMailingData;
import th.p047co.dtac.android.dtacone.model.appOne.oneDeviceSaleTrue.response.OneDeviceSaleAuthorizationData;
import th.p047co.dtac.android.dtacone.model.appOne.pre2post.response.PropositionListItem;
import th.p047co.dtac.android.dtacone.model.mnp.IdCardInformationCollection;
import th.p047co.dtac.android.dtacone.view.fragment.mrtr_prepaid_registration.family_sim.InputPostpaidFamilySimSubscriberFragment;

@StabilityInferred(parameters = 0)
@Metadata(m28851d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b+\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 K2\u00020\u0001:\u0001KB\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004B\u0089\u0001\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0010\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0012\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0014\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0016¢\u0006\u0002\u0010\u0017J\u000b\u00104\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u00105\u001a\u0004\u0018\u00010\u0014HÆ\u0003J\u000b\u00106\u001a\u0004\u0018\u00010\u0016HÆ\u0003J\u000b\u00107\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u0010\u00108\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0002\u0010(J\u000b\u00109\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010:\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010;\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010<\u001a\u0004\u0018\u00010\u000eHÆ\u0003J\u000b\u0010=\u001a\u0004\u0018\u00010\u0010HÆ\u0003J\u000b\u0010>\u001a\u0004\u0018\u00010\u0012HÆ\u0003J\u0092\u0001\u0010?\u001a\u00020\u00002\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00122\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00142\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0016HÆ\u0001¢\u0006\u0002\u0010@J\b\u0010A\u001a\u00020BH\u0016J\u0013\u0010C\u001a\u00020\t2\b\u0010D\u001a\u0004\u0018\u00010EHÖ\u0003J\t\u0010F\u001a\u00020BHÖ\u0001J\t\u0010G\u001a\u00020\u0006HÖ\u0001J\u0018\u0010H\u001a\u00020I2\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010J\u001a\u00020BH\u0016R\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u0012X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR\u0013\u0010\f\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b \u0010!R\u001c\u0010\r\u001a\u0004\u0018\u00010\u000eX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%R\u0013\u0010\n\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b&\u0010!R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b'\u0010!R\u0015\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\n\n\u0002\u0010)\u001a\u0004\b\b\u0010(R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b*\u0010!R\u001c\u0010\u0015\u001a\u0004\u0018\u00010\u0016X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b+\u0010,\"\u0004\b-\u0010.R\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u0014X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b/\u00100\"\u0004\b1\u00102R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b3\u0010!¨\u0006L"}, m28850d2 = {"Lth/co/dtac/android/dtacone/model/appOne/oneDeviceSaleTrue/OneDeviceSaleData;", "Landroid/os/Parcelable;", "parcel", "Landroid/os/Parcel;", "(Landroid/os/Parcel;)V", "idNumber", "", InputPostpaidFamilySimSubscriberFragment.SUB_NUM, "isSmartCard", "", "idCardType", "otpCode", "custImage", "idCardInformation", "Lth/co/dtac/android/dtacone/model/mnp/IdCardInformationCollection;", "addressMailing", "Lth/co/dtac/android/dtacone/model/appOne/mailing/OneAddressMailingData;", "authorizationData", "Lth/co/dtac/android/dtacone/model/appOne/oneDeviceSaleTrue/response/OneDeviceSaleAuthorizationData;", "propositionTrueItem", "Lth/co/dtac/android/dtacone/model/appOne/pre2post/response/PropositionListItem;", "packageTrueItem", "Lth/co/dtac/android/dtacone/model/appOne/common/true_company/common_package/PriceplanListItem;", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lth/co/dtac/android/dtacone/model/mnp/IdCardInformationCollection;Lth/co/dtac/android/dtacone/model/appOne/mailing/OneAddressMailingData;Lth/co/dtac/android/dtacone/model/appOne/oneDeviceSaleTrue/response/OneDeviceSaleAuthorizationData;Lth/co/dtac/android/dtacone/model/appOne/pre2post/response/PropositionListItem;Lth/co/dtac/android/dtacone/model/appOne/common/true_company/common_package/PriceplanListItem;)V", "getAddressMailing", "()Lth/co/dtac/android/dtacone/model/appOne/mailing/OneAddressMailingData;", "setAddressMailing", "(Lth/co/dtac/android/dtacone/model/appOne/mailing/OneAddressMailingData;)V", "getAuthorizationData", "()Lth/co/dtac/android/dtacone/model/appOne/oneDeviceSaleTrue/response/OneDeviceSaleAuthorizationData;", "setAuthorizationData", "(Lth/co/dtac/android/dtacone/model/appOne/oneDeviceSaleTrue/response/OneDeviceSaleAuthorizationData;)V", "getCustImage", "()Ljava/lang/String;", "getIdCardInformation", "()Lth/co/dtac/android/dtacone/model/mnp/IdCardInformationCollection;", "setIdCardInformation", "(Lth/co/dtac/android/dtacone/model/mnp/IdCardInformationCollection;)V", "getIdCardType", "getIdNumber", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getOtpCode", "getPackageTrueItem", "()Lth/co/dtac/android/dtacone/model/appOne/common/true_company/common_package/PriceplanListItem;", "setPackageTrueItem", "(Lth/co/dtac/android/dtacone/model/appOne/common/true_company/common_package/PriceplanListItem;)V", "getPropositionTrueItem", "()Lth/co/dtac/android/dtacone/model/appOne/pre2post/response/PropositionListItem;", "setPropositionTrueItem", "(Lth/co/dtac/android/dtacone/model/appOne/pre2post/response/PropositionListItem;)V", "getSubscriberNumber", "component1", "component10", "component11", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lth/co/dtac/android/dtacone/model/mnp/IdCardInformationCollection;Lth/co/dtac/android/dtacone/model/appOne/mailing/OneAddressMailingData;Lth/co/dtac/android/dtacone/model/appOne/oneDeviceSaleTrue/response/OneDeviceSaleAuthorizationData;Lth/co/dtac/android/dtacone/model/appOne/pre2post/response/PropositionListItem;Lth/co/dtac/android/dtacone/model/appOne/common/true_company/common_package/PriceplanListItem;)Lth/co/dtac/android/dtacone/model/appOne/oneDeviceSaleTrue/OneDeviceSaleData;", "describeContents", "", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "flags", "CREATOR", "app_prodRelease"}, m28849k = 1, m28848mv = {1, 8, 0}, m28846xi = 48)
/* renamed from: th.co.dtac.android.dtacone.model.appOne.oneDeviceSaleTrue.OneDeviceSaleData */
/* loaded from: classes8.dex */
public final class OneDeviceSaleData implements Parcelable {
    @Nullable
    private OneAddressMailingData addressMailing;
    @Nullable
    private OneDeviceSaleAuthorizationData authorizationData;
    @Nullable
    private final String custImage;
    @Nullable
    private IdCardInformationCollection idCardInformation;
    @Nullable
    private final String idCardType;
    @Nullable
    private final String idNumber;
    @Nullable
    private final Boolean isSmartCard;
    @Nullable
    private final String otpCode;
    @Nullable
    private PriceplanListItem packageTrueItem;
    @Nullable
    private PropositionListItem propositionTrueItem;
    @Nullable
    private final String subscriberNumber;
    @NotNull
    public static final CREATOR CREATOR = new CREATOR(null);
    public static final int $stable = 8;

    @Metadata(m28851d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u001d\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0016¢\u0006\u0002\u0010\u000b¨\u0006\f"}, m28850d2 = {"Lth/co/dtac/android/dtacone/model/appOne/oneDeviceSaleTrue/OneDeviceSaleData$CREATOR;", "Landroid/os/Parcelable$Creator;", "Lth/co/dtac/android/dtacone/model/appOne/oneDeviceSaleTrue/OneDeviceSaleData;", "()V", "createFromParcel", "parcel", "Landroid/os/Parcel;", "newArray", "", "size", "", "(I)[Lth/co/dtac/android/dtacone/model/appOne/oneDeviceSaleTrue/OneDeviceSaleData;", "app_prodRelease"}, m28849k = 1, m28848mv = {1, 8, 0}, m28846xi = 48)
    /* renamed from: th.co.dtac.android.dtacone.model.appOne.oneDeviceSaleTrue.OneDeviceSaleData$CREATOR */
    /* loaded from: classes8.dex */
    public static final class CREATOR implements Parcelable.Creator<OneDeviceSaleData> {
        public /* synthetic */ CREATOR(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private CREATOR() {
        }

        @Override // android.os.Parcelable.Creator
        @NotNull
        public OneDeviceSaleData createFromParcel(@NotNull Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new OneDeviceSaleData(parcel);
        }

        @Override // android.os.Parcelable.Creator
        @NotNull
        public OneDeviceSaleData[] newArray(int i) {
            return new OneDeviceSaleData[i];
        }
    }

    public OneDeviceSaleData() {
        this(null, null, null, null, null, null, null, null, null, null, null, 2047, null);
    }

    @Nullable
    public final String component1() {
        return this.idNumber;
    }

    @Nullable
    public final PropositionListItem component10() {
        return this.propositionTrueItem;
    }

    @Nullable
    public final PriceplanListItem component11() {
        return this.packageTrueItem;
    }

    @Nullable
    public final String component2() {
        return this.subscriberNumber;
    }

    @Nullable
    public final Boolean component3() {
        return this.isSmartCard;
    }

    @Nullable
    public final String component4() {
        return this.idCardType;
    }

    @Nullable
    public final String component5() {
        return this.otpCode;
    }

    @Nullable
    public final String component6() {
        return this.custImage;
    }

    @Nullable
    public final IdCardInformationCollection component7() {
        return this.idCardInformation;
    }

    @Nullable
    public final OneAddressMailingData component8() {
        return this.addressMailing;
    }

    @Nullable
    public final OneDeviceSaleAuthorizationData component9() {
        return this.authorizationData;
    }

    @NotNull
    public final OneDeviceSaleData copy(@Nullable String str, @Nullable String str2, @Nullable Boolean bool, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable IdCardInformationCollection idCardInformationCollection, @Nullable OneAddressMailingData oneAddressMailingData, @Nullable OneDeviceSaleAuthorizationData oneDeviceSaleAuthorizationData, @Nullable PropositionListItem propositionListItem, @Nullable PriceplanListItem priceplanListItem) {
        return new OneDeviceSaleData(str, str2, bool, str3, str4, str5, idCardInformationCollection, oneAddressMailingData, oneDeviceSaleAuthorizationData, propositionListItem, priceplanListItem);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof OneDeviceSaleData) {
            OneDeviceSaleData oneDeviceSaleData = (OneDeviceSaleData) obj;
            return Intrinsics.areEqual(this.idNumber, oneDeviceSaleData.idNumber) && Intrinsics.areEqual(this.subscriberNumber, oneDeviceSaleData.subscriberNumber) && Intrinsics.areEqual(this.isSmartCard, oneDeviceSaleData.isSmartCard) && Intrinsics.areEqual(this.idCardType, oneDeviceSaleData.idCardType) && Intrinsics.areEqual(this.otpCode, oneDeviceSaleData.otpCode) && Intrinsics.areEqual(this.custImage, oneDeviceSaleData.custImage) && Intrinsics.areEqual(this.idCardInformation, oneDeviceSaleData.idCardInformation) && Intrinsics.areEqual(this.addressMailing, oneDeviceSaleData.addressMailing) && Intrinsics.areEqual(this.authorizationData, oneDeviceSaleData.authorizationData) && Intrinsics.areEqual(this.propositionTrueItem, oneDeviceSaleData.propositionTrueItem) && Intrinsics.areEqual(this.packageTrueItem, oneDeviceSaleData.packageTrueItem);
        }
        return false;
    }

    @Nullable
    public final OneAddressMailingData getAddressMailing() {
        return this.addressMailing;
    }

    @Nullable
    public final OneDeviceSaleAuthorizationData getAuthorizationData() {
        return this.authorizationData;
    }

    @Nullable
    public final String getCustImage() {
        return this.custImage;
    }

    @Nullable
    public final IdCardInformationCollection getIdCardInformation() {
        return this.idCardInformation;
    }

    @Nullable
    public final String getIdCardType() {
        return this.idCardType;
    }

    @Nullable
    public final String getIdNumber() {
        return this.idNumber;
    }

    @Nullable
    public final String getOtpCode() {
        return this.otpCode;
    }

    @Nullable
    public final PriceplanListItem getPackageTrueItem() {
        return this.packageTrueItem;
    }

    @Nullable
    public final PropositionListItem getPropositionTrueItem() {
        return this.propositionTrueItem;
    }

    @Nullable
    public final String getSubscriberNumber() {
        return this.subscriberNumber;
    }

    public int hashCode() {
        String str = this.idNumber;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.subscriberNumber;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Boolean bool = this.isSmartCard;
        int hashCode3 = (hashCode2 + (bool == null ? 0 : bool.hashCode())) * 31;
        String str3 = this.idCardType;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.otpCode;
        int hashCode5 = (hashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.custImage;
        int hashCode6 = (hashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        IdCardInformationCollection idCardInformationCollection = this.idCardInformation;
        int hashCode7 = (hashCode6 + (idCardInformationCollection == null ? 0 : idCardInformationCollection.hashCode())) * 31;
        OneAddressMailingData oneAddressMailingData = this.addressMailing;
        int hashCode8 = (hashCode7 + (oneAddressMailingData == null ? 0 : oneAddressMailingData.hashCode())) * 31;
        OneDeviceSaleAuthorizationData oneDeviceSaleAuthorizationData = this.authorizationData;
        int hashCode9 = (hashCode8 + (oneDeviceSaleAuthorizationData == null ? 0 : oneDeviceSaleAuthorizationData.hashCode())) * 31;
        PropositionListItem propositionListItem = this.propositionTrueItem;
        int hashCode10 = (hashCode9 + (propositionListItem == null ? 0 : propositionListItem.hashCode())) * 31;
        PriceplanListItem priceplanListItem = this.packageTrueItem;
        return hashCode10 + (priceplanListItem != null ? priceplanListItem.hashCode() : 0);
    }

    @Nullable
    public final Boolean isSmartCard() {
        return this.isSmartCard;
    }

    public final void setAddressMailing(@Nullable OneAddressMailingData oneAddressMailingData) {
        this.addressMailing = oneAddressMailingData;
    }

    public final void setAuthorizationData(@Nullable OneDeviceSaleAuthorizationData oneDeviceSaleAuthorizationData) {
        this.authorizationData = oneDeviceSaleAuthorizationData;
    }

    public final void setIdCardInformation(@Nullable IdCardInformationCollection idCardInformationCollection) {
        this.idCardInformation = idCardInformationCollection;
    }

    public final void setPackageTrueItem(@Nullable PriceplanListItem priceplanListItem) {
        this.packageTrueItem = priceplanListItem;
    }

    public final void setPropositionTrueItem(@Nullable PropositionListItem propositionListItem) {
        this.propositionTrueItem = propositionListItem;
    }

    @NotNull
    public String toString() {
        String str = this.idNumber;
        String str2 = this.subscriberNumber;
        Boolean bool = this.isSmartCard;
        String str3 = this.idCardType;
        String str4 = this.otpCode;
        String str5 = this.custImage;
        IdCardInformationCollection idCardInformationCollection = this.idCardInformation;
        OneAddressMailingData oneAddressMailingData = this.addressMailing;
        OneDeviceSaleAuthorizationData oneDeviceSaleAuthorizationData = this.authorizationData;
        PropositionListItem propositionListItem = this.propositionTrueItem;
        PriceplanListItem priceplanListItem = this.packageTrueItem;
        return "OneDeviceSaleData(idNumber=" + str + ", subscriberNumber=" + str2 + ", isSmartCard=" + bool + ", idCardType=" + str3 + ", otpCode=" + str4 + ", custImage=" + str5 + ", idCardInformation=" + idCardInformationCollection + ", addressMailing=" + oneAddressMailingData + ", authorizationData=" + oneDeviceSaleAuthorizationData + ", propositionTrueItem=" + propositionListItem + ", packageTrueItem=" + priceplanListItem + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "parcel");
        parcel.writeString(this.idNumber);
        parcel.writeString(this.subscriberNumber);
        parcel.writeValue(this.isSmartCard);
        parcel.writeString(this.idCardType);
        parcel.writeString(this.otpCode);
        parcel.writeString(this.custImage);
        parcel.writeParcelable(this.idCardInformation, i);
        parcel.writeParcelable(this.addressMailing, i);
        parcel.writeParcelable(this.authorizationData, i);
        parcel.writeParcelable(this.propositionTrueItem, i);
        parcel.writeParcelable(this.packageTrueItem, i);
    }

    public OneDeviceSaleData(@Nullable String str, @Nullable String str2, @Nullable Boolean bool, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable IdCardInformationCollection idCardInformationCollection, @Nullable OneAddressMailingData oneAddressMailingData, @Nullable OneDeviceSaleAuthorizationData oneDeviceSaleAuthorizationData, @Nullable PropositionListItem propositionListItem, @Nullable PriceplanListItem priceplanListItem) {
        this.idNumber = str;
        this.subscriberNumber = str2;
        this.isSmartCard = bool;
        this.idCardType = str3;
        this.otpCode = str4;
        this.custImage = str5;
        this.idCardInformation = idCardInformationCollection;
        this.addressMailing = oneAddressMailingData;
        this.authorizationData = oneDeviceSaleAuthorizationData;
        this.propositionTrueItem = propositionListItem;
        this.packageTrueItem = priceplanListItem;
    }

    public /* synthetic */ OneDeviceSaleData(String str, String str2, Boolean bool, String str3, String str4, String str5, IdCardInformationCollection idCardInformationCollection, OneAddressMailingData oneAddressMailingData, OneDeviceSaleAuthorizationData oneDeviceSaleAuthorizationData, PropositionListItem propositionListItem, PriceplanListItem priceplanListItem, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? Boolean.FALSE : bool, (i & 8) != 0 ? "" : str3, (i & 16) != 0 ? "" : str4, (i & 32) == 0 ? str5 : "", (i & 64) != 0 ? null : idCardInformationCollection, (i & 128) != 0 ? null : oneAddressMailingData, (i & 256) != 0 ? null : oneDeviceSaleAuthorizationData, (i & 512) != 0 ? null : propositionListItem, (i & 1024) == 0 ? priceplanListItem : null);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public OneDeviceSaleData(@org.jetbrains.annotations.NotNull android.os.Parcel r14) {
        /*
            r13 = this;
            java.lang.String r0 = "parcel"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r14, r0)
            java.lang.String r2 = r14.readString()
            java.lang.String r3 = r14.readString()
            java.lang.Class r0 = java.lang.Boolean.TYPE
            java.lang.ClassLoader r0 = r0.getClassLoader()
            java.lang.Object r0 = r14.readValue(r0)
            boolean r1 = r0 instanceof java.lang.Boolean
            if (r1 == 0) goto L1f
            java.lang.Boolean r0 = (java.lang.Boolean) r0
        L1d:
            r4 = r0
            goto L21
        L1f:
            r0 = 0
            goto L1d
        L21:
            java.lang.String r5 = r14.readString()
            java.lang.String r6 = r14.readString()
            java.lang.String r7 = r14.readString()
            java.lang.Class<th.co.dtac.android.dtacone.model.mnp.IdCardInformationCollection> r0 = th.p047co.dtac.android.dtacone.model.mnp.IdCardInformationCollection.class
            java.lang.ClassLoader r0 = r0.getClassLoader()
            android.os.Parcelable r0 = r14.readParcelable(r0)
            r8 = r0
            th.co.dtac.android.dtacone.model.mnp.IdCardInformationCollection r8 = (th.p047co.dtac.android.dtacone.model.mnp.IdCardInformationCollection) r8
            java.lang.Class<th.co.dtac.android.dtacone.model.appOne.mailing.OneAddressMailingData> r0 = th.p047co.dtac.android.dtacone.model.appOne.mailing.OneAddressMailingData.class
            java.lang.ClassLoader r0 = r0.getClassLoader()
            android.os.Parcelable r0 = r14.readParcelable(r0)
            r9 = r0
            th.co.dtac.android.dtacone.model.appOne.mailing.OneAddressMailingData r9 = (th.p047co.dtac.android.dtacone.model.appOne.mailing.OneAddressMailingData) r9
            java.lang.Class<th.co.dtac.android.dtacone.model.appOne.oneDeviceSaleTrue.response.OneDeviceSaleAuthorizationData> r0 = th.p047co.dtac.android.dtacone.model.appOne.oneDeviceSaleTrue.response.OneDeviceSaleAuthorizationData.class
            java.lang.ClassLoader r0 = r0.getClassLoader()
            android.os.Parcelable r0 = r14.readParcelable(r0)
            r10 = r0
            th.co.dtac.android.dtacone.model.appOne.oneDeviceSaleTrue.response.OneDeviceSaleAuthorizationData r10 = (th.p047co.dtac.android.dtacone.model.appOne.oneDeviceSaleTrue.response.OneDeviceSaleAuthorizationData) r10
            java.lang.Class<th.co.dtac.android.dtacone.model.appOne.pre2post.response.PropositionListItem> r0 = th.p047co.dtac.android.dtacone.model.appOne.pre2post.response.PropositionListItem.class
            java.lang.ClassLoader r0 = r0.getClassLoader()
            android.os.Parcelable r0 = r14.readParcelable(r0)
            r11 = r0
            th.co.dtac.android.dtacone.model.appOne.pre2post.response.PropositionListItem r11 = (th.p047co.dtac.android.dtacone.model.appOne.pre2post.response.PropositionListItem) r11
            java.lang.Class<th.co.dtac.android.dtacone.model.appOne.common.true_company.common_package.PriceplanListItem> r0 = th.p047co.dtac.android.dtacone.model.appOne.common.true_company.common_package.PriceplanListItem.class
            java.lang.ClassLoader r0 = r0.getClassLoader()
            android.os.Parcelable r14 = r14.readParcelable(r0)
            r12 = r14
            th.co.dtac.android.dtacone.model.appOne.common.true_company.common_package.PriceplanListItem r12 = (th.p047co.dtac.android.dtacone.model.appOne.common.true_company.common_package.PriceplanListItem) r12
            r1 = r13
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: th.p047co.dtac.android.dtacone.model.appOne.oneDeviceSaleTrue.OneDeviceSaleData.<init>(android.os.Parcel):void");
    }
}
