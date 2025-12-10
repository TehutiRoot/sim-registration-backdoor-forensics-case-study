package th.p047co.dtac.android.dtacone.model.appOne.postpaid.saveOrder.request;

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
@Metadata(m29143d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b*\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B¡\u0001\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0011J\u000b\u0010!\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\"\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010#\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010$\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010%\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010&\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010'\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010(\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010)\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010*\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010+\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010,\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010-\u001a\u0004\u0018\u00010\u0005HÆ\u0003J¥\u0001\u0010.\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010/\u001a\u0002002\b\u00101\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00102\u001a\u000203HÖ\u0001J\t\u00104\u001a\u00020\u0005HÖ\u0001R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0015R\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0015R\u0018\u0010\b\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0015R\u0018\u0010\t\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0015R\u0018\u0010\n\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0015R\u0018\u0010\u000b\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0015R\u0018\u0010\f\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0015R\u0018\u0010\r\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0015R\u0018\u0010\u000e\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0015R\u0018\u0010\u000f\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0015R\u0018\u0010\u0010\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u0015¨\u00065"}, m29142d2 = {"Lth/co/dtac/android/dtacone/model/appOne/postpaid/saveOrder/request/OnePostPaidCustomer;", "", "addressList", "Lth/co/dtac/android/dtacone/model/appOne/postpaid/saveOrder/request/OnePostPaidAddressList;", "birthdate", "", "contactNumber", "customerType", "firstname", HintConstants.AUTOFILL_HINT_GENDER, "idExpireDate", "idNumber", "idType", "language", "lastname", MessageBundle.TITLE_ENTRY, "titleCode", "(Lth/co/dtac/android/dtacone/model/appOne/postpaid/saveOrder/request/OnePostPaidAddressList;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getAddressList", "()Lth/co/dtac/android/dtacone/model/appOne/postpaid/saveOrder/request/OnePostPaidAddressList;", "getBirthdate", "()Ljava/lang/String;", "getContactNumber", "getCustomerType", "getFirstname", "getGender", "getIdExpireDate", "getIdNumber", "getIdType", "getLanguage", "getLastname", "getTitle", "getTitleCode", "component1", "component10", "component11", "component12", "component13", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "", "other", "hashCode", "", "toString", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.model.appOne.postpaid.saveOrder.request.OnePostPaidCustomer */
/* loaded from: classes8.dex */
public final class OnePostPaidCustomer {
    public static final int $stable = 0;
    @SerializedName("addressList")
    @Nullable
    private final OnePostPaidAddressList addressList;
    @SerializedName("birthdate")
    @Nullable
    private final String birthdate;
    @SerializedName("contactNumber")
    @Nullable
    private final String contactNumber;
    @SerializedName("customerType")
    @Nullable
    private final String customerType;
    @SerializedName("firstname")
    @Nullable
    private final String firstname;
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
    private final String lastname;
    @SerializedName(MessageBundle.TITLE_ENTRY)
    @Nullable
    private final String title;
    @SerializedName("titleCode")
    @Nullable
    private final String titleCode;

    public OnePostPaidCustomer() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, 8191, null);
    }

    @Nullable
    public final OnePostPaidAddressList component1() {
        return this.addressList;
    }

    @Nullable
    public final String component10() {
        return this.language;
    }

    @Nullable
    public final String component11() {
        return this.lastname;
    }

    @Nullable
    public final String component12() {
        return this.title;
    }

    @Nullable
    public final String component13() {
        return this.titleCode;
    }

    @Nullable
    public final String component2() {
        return this.birthdate;
    }

    @Nullable
    public final String component3() {
        return this.contactNumber;
    }

    @Nullable
    public final String component4() {
        return this.customerType;
    }

    @Nullable
    public final String component5() {
        return this.firstname;
    }

    @Nullable
    public final String component6() {
        return this.gender;
    }

    @Nullable
    public final String component7() {
        return this.idExpireDate;
    }

    @Nullable
    public final String component8() {
        return this.idNumber;
    }

    @Nullable
    public final String component9() {
        return this.idType;
    }

    @NotNull
    public final OnePostPaidCustomer copy(@Nullable OnePostPaidAddressList onePostPaidAddressList, @Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable String str6, @Nullable String str7, @Nullable String str8, @Nullable String str9, @Nullable String str10, @Nullable String str11, @Nullable String str12) {
        return new OnePostPaidCustomer(onePostPaidAddressList, str, str2, str3, str4, str5, str6, str7, str8, str9, str10, str11, str12);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof OnePostPaidCustomer) {
            OnePostPaidCustomer onePostPaidCustomer = (OnePostPaidCustomer) obj;
            return Intrinsics.areEqual(this.addressList, onePostPaidCustomer.addressList) && Intrinsics.areEqual(this.birthdate, onePostPaidCustomer.birthdate) && Intrinsics.areEqual(this.contactNumber, onePostPaidCustomer.contactNumber) && Intrinsics.areEqual(this.customerType, onePostPaidCustomer.customerType) && Intrinsics.areEqual(this.firstname, onePostPaidCustomer.firstname) && Intrinsics.areEqual(this.gender, onePostPaidCustomer.gender) && Intrinsics.areEqual(this.idExpireDate, onePostPaidCustomer.idExpireDate) && Intrinsics.areEqual(this.idNumber, onePostPaidCustomer.idNumber) && Intrinsics.areEqual(this.idType, onePostPaidCustomer.idType) && Intrinsics.areEqual(this.language, onePostPaidCustomer.language) && Intrinsics.areEqual(this.lastname, onePostPaidCustomer.lastname) && Intrinsics.areEqual(this.title, onePostPaidCustomer.title) && Intrinsics.areEqual(this.titleCode, onePostPaidCustomer.titleCode);
        }
        return false;
    }

    @Nullable
    public final OnePostPaidAddressList getAddressList() {
        return this.addressList;
    }

    @Nullable
    public final String getBirthdate() {
        return this.birthdate;
    }

    @Nullable
    public final String getContactNumber() {
        return this.contactNumber;
    }

    @Nullable
    public final String getCustomerType() {
        return this.customerType;
    }

    @Nullable
    public final String getFirstname() {
        return this.firstname;
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
    public final String getLastname() {
        return this.lastname;
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
        OnePostPaidAddressList onePostPaidAddressList = this.addressList;
        int hashCode = (onePostPaidAddressList == null ? 0 : onePostPaidAddressList.hashCode()) * 31;
        String str = this.birthdate;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.contactNumber;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.customerType;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.firstname;
        int hashCode5 = (hashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.gender;
        int hashCode6 = (hashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.idExpireDate;
        int hashCode7 = (hashCode6 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.idNumber;
        int hashCode8 = (hashCode7 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.idType;
        int hashCode9 = (hashCode8 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.language;
        int hashCode10 = (hashCode9 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.lastname;
        int hashCode11 = (hashCode10 + (str10 == null ? 0 : str10.hashCode())) * 31;
        String str11 = this.title;
        int hashCode12 = (hashCode11 + (str11 == null ? 0 : str11.hashCode())) * 31;
        String str12 = this.titleCode;
        return hashCode12 + (str12 != null ? str12.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        OnePostPaidAddressList onePostPaidAddressList = this.addressList;
        String str = this.birthdate;
        String str2 = this.contactNumber;
        String str3 = this.customerType;
        String str4 = this.firstname;
        String str5 = this.gender;
        String str6 = this.idExpireDate;
        String str7 = this.idNumber;
        String str8 = this.idType;
        String str9 = this.language;
        String str10 = this.lastname;
        String str11 = this.title;
        String str12 = this.titleCode;
        return "OnePostPaidCustomer(addressList=" + onePostPaidAddressList + ", birthdate=" + str + ", contactNumber=" + str2 + ", customerType=" + str3 + ", firstname=" + str4 + ", gender=" + str5 + ", idExpireDate=" + str6 + ", idNumber=" + str7 + ", idType=" + str8 + ", language=" + str9 + ", lastname=" + str10 + ", title=" + str11 + ", titleCode=" + str12 + ")";
    }

    public OnePostPaidCustomer(@Nullable OnePostPaidAddressList onePostPaidAddressList, @Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable String str6, @Nullable String str7, @Nullable String str8, @Nullable String str9, @Nullable String str10, @Nullable String str11, @Nullable String str12) {
        this.addressList = onePostPaidAddressList;
        this.birthdate = str;
        this.contactNumber = str2;
        this.customerType = str3;
        this.firstname = str4;
        this.gender = str5;
        this.idExpireDate = str6;
        this.idNumber = str7;
        this.idType = str8;
        this.language = str9;
        this.lastname = str10;
        this.title = str11;
        this.titleCode = str12;
    }

    public /* synthetic */ OnePostPaidCustomer(OnePostPaidAddressList onePostPaidAddressList, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : onePostPaidAddressList, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? null : str3, (i & 16) != 0 ? null : str4, (i & 32) != 0 ? null : str5, (i & 64) != 0 ? null : str6, (i & 128) != 0 ? null : str7, (i & 256) != 0 ? null : str8, (i & 512) != 0 ? null : str9, (i & 1024) != 0 ? null : str10, (i & 2048) != 0 ? null : str11, (i & 4096) == 0 ? str12 : null);
    }
}