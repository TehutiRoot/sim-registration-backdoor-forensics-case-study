package th.p047co.dtac.android.dtacone.model.appOne.mnp.request;

import androidx.autofill.HintConstants;
import androidx.compose.runtime.internal.StabilityInferred;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.i18n.MessageBundle;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 0)
@Metadata(m28851d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u001f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u009f\u0001\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\n\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0010¢\u0006\u0002\u0010\u0011J\u000b\u0010!\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\"\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010#\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010$\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010%\u001a\u0004\u0018\u00010\u0010HÆ\u0003J\u000b\u0010&\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010'\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010(\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010)\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010*\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010+\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010,\u001a\u00020\u0003HÆ\u0003J\u000b\u0010-\u001a\u0004\u0018\u00010\u0003HÆ\u0003J£\u0001\u0010.\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\n\u001a\u00020\u00032\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0010HÆ\u0001J\u0013\u0010/\u001a\u0002002\b\u00101\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00102\u001a\u000203HÖ\u0001J\t\u00104\u001a\u00020\u0003HÖ\u0001R\u0018\u0010\u000f\u001a\u0004\u0018\u00010\u00108\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0018\u0010\t\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0018\u0010\u000b\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0015R\u0016\u0010\n\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0015R\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0015R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0015R\u0018\u0010\u000e\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0015R\u0018\u0010\r\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0015R\u0018\u0010\f\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0015R\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0015R\u0018\u0010\b\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0015R\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0015R\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u0015¨\u00065"}, m28850d2 = {"Lth/co/dtac/android/dtacone/model/appOne/mnp/request/CustomerData;", "", HintConstants.AUTOFILL_HINT_GENDER, "", MessageBundle.TITLE_ENTRY, "language", "titleCode", "firstName", "lastName", "birthDate", "customerType", "contactNumber", "idType", "idNumber", "idExpireDate", "addressList", "Lth/co/dtac/android/dtacone/model/appOne/mnp/request/AddressListData;", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lth/co/dtac/android/dtacone/model/appOne/mnp/request/AddressListData;)V", "getAddressList", "()Lth/co/dtac/android/dtacone/model/appOne/mnp/request/AddressListData;", "getBirthDate", "()Ljava/lang/String;", "getContactNumber", "getCustomerType", "getFirstName", "getGender", "getIdExpireDate", "getIdNumber", "getIdType", "getLanguage", "getLastName", "getTitle", "getTitleCode", "component1", "component10", "component11", "component12", "component13", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "", "other", "hashCode", "", "toString", "app_prodRelease"}, m28849k = 1, m28848mv = {1, 8, 0}, m28846xi = 48)
/* renamed from: th.co.dtac.android.dtacone.model.appOne.mnp.request.CustomerData */
/* loaded from: classes8.dex */
public final class CustomerData {
    public static final int $stable = 0;
    @SerializedName("addressList")
    @Nullable
    private final AddressListData addressList;
    @SerializedName("birthdate")
    @Nullable
    private final String birthDate;
    @SerializedName("contactNumber")
    @Nullable
    private final String contactNumber;
    @SerializedName("customerType")
    @NotNull
    private final String customerType;
    @SerializedName("firstname")
    @Nullable
    private final String firstName;
    @SerializedName(HintConstants.AUTOFILL_HINT_GENDER)
    @Nullable
    private final String gender;
    @SerializedName("idExpireDate")
    @Nullable
    private final String idExpireDate;
    @SerializedName("idNumber")
    @Nullable
    private final String idNumber;
    @SerializedName("idType")
    @Nullable
    private final String idType;
    @SerializedName("language")
    @Nullable
    private final String language;
    @SerializedName("lastname")
    @Nullable
    private final String lastName;
    @SerializedName(MessageBundle.TITLE_ENTRY)
    @Nullable
    private final String title;
    @SerializedName("titleCode")
    @Nullable
    private final String titleCode;

    public CustomerData() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, 8191, null);
    }

    @Nullable
    public final String component1() {
        return this.gender;
    }

    @Nullable
    public final String component10() {
        return this.idType;
    }

    @Nullable
    public final String component11() {
        return this.idNumber;
    }

    @Nullable
    public final String component12() {
        return this.idExpireDate;
    }

    @Nullable
    public final AddressListData component13() {
        return this.addressList;
    }

    @Nullable
    public final String component2() {
        return this.title;
    }

    @Nullable
    public final String component3() {
        return this.language;
    }

    @Nullable
    public final String component4() {
        return this.titleCode;
    }

    @Nullable
    public final String component5() {
        return this.firstName;
    }

    @Nullable
    public final String component6() {
        return this.lastName;
    }

    @Nullable
    public final String component7() {
        return this.birthDate;
    }

    @NotNull
    public final String component8() {
        return this.customerType;
    }

    @Nullable
    public final String component9() {
        return this.contactNumber;
    }

    @NotNull
    public final CustomerData copy(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable String str6, @Nullable String str7, @NotNull String customerType, @Nullable String str8, @Nullable String str9, @Nullable String str10, @Nullable String str11, @Nullable AddressListData addressListData) {
        Intrinsics.checkNotNullParameter(customerType, "customerType");
        return new CustomerData(str, str2, str3, str4, str5, str6, str7, customerType, str8, str9, str10, str11, addressListData);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof CustomerData) {
            CustomerData customerData = (CustomerData) obj;
            return Intrinsics.areEqual(this.gender, customerData.gender) && Intrinsics.areEqual(this.title, customerData.title) && Intrinsics.areEqual(this.language, customerData.language) && Intrinsics.areEqual(this.titleCode, customerData.titleCode) && Intrinsics.areEqual(this.firstName, customerData.firstName) && Intrinsics.areEqual(this.lastName, customerData.lastName) && Intrinsics.areEqual(this.birthDate, customerData.birthDate) && Intrinsics.areEqual(this.customerType, customerData.customerType) && Intrinsics.areEqual(this.contactNumber, customerData.contactNumber) && Intrinsics.areEqual(this.idType, customerData.idType) && Intrinsics.areEqual(this.idNumber, customerData.idNumber) && Intrinsics.areEqual(this.idExpireDate, customerData.idExpireDate) && Intrinsics.areEqual(this.addressList, customerData.addressList);
        }
        return false;
    }

    @Nullable
    public final AddressListData getAddressList() {
        return this.addressList;
    }

    @Nullable
    public final String getBirthDate() {
        return this.birthDate;
    }

    @Nullable
    public final String getContactNumber() {
        return this.contactNumber;
    }

    @NotNull
    public final String getCustomerType() {
        return this.customerType;
    }

    @Nullable
    public final String getFirstName() {
        return this.firstName;
    }

    @Nullable
    public final String getGender() {
        return this.gender;
    }

    @Nullable
    public final String getIdExpireDate() {
        return this.idExpireDate;
    }

    @Nullable
    public final String getIdNumber() {
        return this.idNumber;
    }

    @Nullable
    public final String getIdType() {
        return this.idType;
    }

    @Nullable
    public final String getLanguage() {
        return this.language;
    }

    @Nullable
    public final String getLastName() {
        return this.lastName;
    }

    @Nullable
    public final String getTitle() {
        return this.title;
    }

    @Nullable
    public final String getTitleCode() {
        return this.titleCode;
    }

    public int hashCode() {
        String str = this.gender;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.title;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.language;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.titleCode;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.firstName;
        int hashCode5 = (hashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.lastName;
        int hashCode6 = (hashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.birthDate;
        int hashCode7 = (((hashCode6 + (str7 == null ? 0 : str7.hashCode())) * 31) + this.customerType.hashCode()) * 31;
        String str8 = this.contactNumber;
        int hashCode8 = (hashCode7 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.idType;
        int hashCode9 = (hashCode8 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.idNumber;
        int hashCode10 = (hashCode9 + (str10 == null ? 0 : str10.hashCode())) * 31;
        String str11 = this.idExpireDate;
        int hashCode11 = (hashCode10 + (str11 == null ? 0 : str11.hashCode())) * 31;
        AddressListData addressListData = this.addressList;
        return hashCode11 + (addressListData != null ? addressListData.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        String str = this.gender;
        String str2 = this.title;
        String str3 = this.language;
        String str4 = this.titleCode;
        String str5 = this.firstName;
        String str6 = this.lastName;
        String str7 = this.birthDate;
        String str8 = this.customerType;
        String str9 = this.contactNumber;
        String str10 = this.idType;
        String str11 = this.idNumber;
        String str12 = this.idExpireDate;
        AddressListData addressListData = this.addressList;
        return "CustomerData(gender=" + str + ", title=" + str2 + ", language=" + str3 + ", titleCode=" + str4 + ", firstName=" + str5 + ", lastName=" + str6 + ", birthDate=" + str7 + ", customerType=" + str8 + ", contactNumber=" + str9 + ", idType=" + str10 + ", idNumber=" + str11 + ", idExpireDate=" + str12 + ", addressList=" + addressListData + ")";
    }

    public CustomerData(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable String str6, @Nullable String str7, @NotNull String customerType, @Nullable String str8, @Nullable String str9, @Nullable String str10, @Nullable String str11, @Nullable AddressListData addressListData) {
        Intrinsics.checkNotNullParameter(customerType, "customerType");
        this.gender = str;
        this.title = str2;
        this.language = str3;
        this.titleCode = str4;
        this.firstName = str5;
        this.lastName = str6;
        this.birthDate = str7;
        this.customerType = customerType;
        this.contactNumber = str8;
        this.idType = str9;
        this.idNumber = str10;
        this.idExpireDate = str11;
        this.addressList = addressListData;
    }

    public /* synthetic */ CustomerData(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, AddressListData addressListData, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : str5, (i & 32) != 0 ? null : str6, (i & 64) != 0 ? null : str7, (i & 128) != 0 ? "I" : str8, (i & 256) != 0 ? null : str9, (i & 512) != 0 ? null : str10, (i & 1024) != 0 ? null : str11, (i & 2048) != 0 ? null : str12, (i & 4096) == 0 ? addressListData : null);
    }
}
