package th.p047co.dtac.android.dtacone.model.appOne.mailing;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.internal.StabilityInferred;
import com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.StandardStructureTypes;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import th.p047co.dtac.android.dtacone.extension.format.StringExtKt;
import th.p047co.dtac.android.dtacone.util.Constant;

@StabilityInferred(parameters = 0)
@Metadata(m28851d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0018\n\u0002\u0010\u0000\n\u0002\b\u0017\b\u0087\b\u0018\u0000 M2\u00020\u0001:\u0001MB¯\u0001\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0013\u0010\u0014B1\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u000e\u001a\u00020\u0002\u0012\u0006\u0010\u0012\u001a\u00020\u0015¢\u0006\u0004\b\u0013\u0010\u0016B\u0099\u0001\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\u0006\u0010\u000b\u001a\u00020\u0002\u0012\u0006\u0010\f\u001a\u00020\u0002\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u000e\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0002\u0012\u0006\u0010\u0017\u001a\u00020\u0015\u0012\u0006\u0010\u0012\u001a\u00020\u0015¢\u0006\u0004\b\u0013\u0010\u0018B\u0011\b\u0016\u0012\u0006\u0010\u001a\u001a\u00020\u0019¢\u0006\u0004\b\u0013\u0010\u001bJ\u001f\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001d\u001a\u00020\u001cH\u0016¢\u0006\u0004\b\u001f\u0010 J\u000f\u0010!\u001a\u00020\u001cH\u0016¢\u0006\u0004\b!\u0010\"J\u0012\u0010#\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b#\u0010$J\u0012\u0010%\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b%\u0010$J\u0012\u0010&\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b&\u0010$J\u0012\u0010'\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b'\u0010$J\u0012\u0010(\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b(\u0010$J\u0012\u0010)\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b)\u0010$J\u0012\u0010*\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b*\u0010$J\u0012\u0010+\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b+\u0010$J\u0012\u0010,\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b,\u0010$J\u0012\u0010-\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b-\u0010$J\u0012\u0010.\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b.\u0010$J\u0012\u0010/\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b/\u0010$J\u0012\u00100\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b0\u0010$J\u0012\u00101\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b1\u0010$J\u0012\u00102\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b2\u0010$JÐ\u0001\u00103\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b3\u00104J\u0010\u00105\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b5\u0010$J\u0010\u00106\u001a\u00020\u001cHÖ\u0001¢\u0006\u0004\b6\u0010\"J\u001a\u00109\u001a\u00020\u00152\b\u00108\u001a\u0004\u0018\u000107HÖ\u0003¢\u0006\u0004\b9\u0010:R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010;\u001a\u0004\b<\u0010$R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010;\u001a\u0004\b=\u0010$R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010;\u001a\u0004\b>\u0010$R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010;\u001a\u0004\b?\u0010$R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010;\u001a\u0004\b@\u0010$R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010;\u001a\u0004\bA\u0010$R\u0019\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010;\u001a\u0004\bB\u0010$R\u0019\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010;\u001a\u0004\bC\u0010$R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u0010;\u001a\u0004\bD\u0010$R\u0019\u0010\f\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\f\u0010;\u001a\u0004\bE\u0010$R\u0019\u0010\r\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\r\u0010;\u001a\u0004\bF\u0010$R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u000e\u0010;\u001a\u0004\bG\u0010$R\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u000f\u0010;\u001a\u0004\bH\u0010$R\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010;\u001a\u0004\bI\u0010$R\u0019\u0010\u0011\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010;\u001a\u0004\bJ\u0010$R\u0016\u0010\u0012\u001a\u0004\u0018\u00010\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010;R\u0011\u0010K\u001a\u00020\u00158F¢\u0006\u0006\u001a\u0004\bK\u0010L¨\u0006N"}, m28850d2 = {"Lth/co/dtac/android/dtacone/model/appOne/mailing/OneAddressMailingData;", "Landroid/os/Parcelable;", "", "firstName", "lastName", "birthDate", "houseNo", "addressNo", "province", "district", "subDistrict", "postcode", "postcodeSeq", "email", "phoneNumberContact", "invoiceLanguage", "mailingAddressType", "eInvoiceType", "isCompanyTrue", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V", "removeSpecialCharacter", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZ)V", "Landroid/os/Parcel;", "parcel", "(Landroid/os/Parcel;)V", "", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lth/co/dtac/android/dtacone/model/appOne/mailing/OneAddressMailingData;", "toString", "hashCode", "", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getFirstName", "getLastName", "getBirthDate", "getHouseNo", "getAddressNo", "getProvince", "getDistrict", "getSubDistrict", "getPostcode", "getPostcodeSeq", "getEmail", "getPhoneNumberContact", "getInvoiceLanguage", "getMailingAddressType", "getEInvoiceType", "isTrue", "()Z", "CREATOR", "app_prodRelease"}, m28849k = 1, m28848mv = {1, 8, 0})
/* renamed from: th.co.dtac.android.dtacone.model.appOne.mailing.OneAddressMailingData */
/* loaded from: classes8.dex */
public final class OneAddressMailingData implements Parcelable {
    public static final int $stable = 0;
    @NotNull
    public static final CREATOR CREATOR = new CREATOR(null);
    @Nullable
    private final String addressNo;
    @Nullable
    private final String birthDate;
    @Nullable
    private final String district;
    @Nullable
    private final String eInvoiceType;
    @Nullable
    private final String email;
    @Nullable
    private final String firstName;
    @Nullable
    private final String houseNo;
    @Nullable
    private final String invoiceLanguage;
    @Nullable
    private final String isCompanyTrue;
    @Nullable
    private final String lastName;
    @Nullable
    private final String mailingAddressType;
    @Nullable
    private final String phoneNumberContact;
    @Nullable
    private final String postcode;
    @Nullable
    private final String postcodeSeq;
    @Nullable
    private final String province;
    @Nullable
    private final String subDistrict;

    @Metadata(m28851d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u001d\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0016¢\u0006\u0002\u0010\u000b¨\u0006\f"}, m28850d2 = {"Lth/co/dtac/android/dtacone/model/appOne/mailing/OneAddressMailingData$CREATOR;", "Landroid/os/Parcelable$Creator;", "Lth/co/dtac/android/dtacone/model/appOne/mailing/OneAddressMailingData;", "()V", "createFromParcel", "parcel", "Landroid/os/Parcel;", "newArray", "", "size", "", "(I)[Lth/co/dtac/android/dtacone/model/appOne/mailing/OneAddressMailingData;", "app_prodRelease"}, m28849k = 1, m28848mv = {1, 8, 0}, m28846xi = 48)
    /* renamed from: th.co.dtac.android.dtacone.model.appOne.mailing.OneAddressMailingData$CREATOR */
    /* loaded from: classes8.dex */
    public static final class CREATOR implements Parcelable.Creator<OneAddressMailingData> {
        public /* synthetic */ CREATOR(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private CREATOR() {
        }

        @Override // android.os.Parcelable.Creator
        @NotNull
        public OneAddressMailingData createFromParcel(@NotNull Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new OneAddressMailingData(parcel);
        }

        @Override // android.os.Parcelable.Creator
        @NotNull
        public OneAddressMailingData[] newArray(int i) {
            return new OneAddressMailingData[i];
        }
    }

    public OneAddressMailingData(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable String str6, @Nullable String str7, @Nullable String str8, @Nullable String str9, @Nullable String str10, @Nullable String str11, @Nullable String str12, @Nullable String str13, @Nullable String str14, @Nullable String str15, @Nullable String str16) {
        this.firstName = str;
        this.lastName = str2;
        this.birthDate = str3;
        this.houseNo = str4;
        this.addressNo = str5;
        this.province = str6;
        this.district = str7;
        this.subDistrict = str8;
        this.postcode = str9;
        this.postcodeSeq = str10;
        this.email = str11;
        this.phoneNumberContact = str12;
        this.invoiceLanguage = str13;
        this.mailingAddressType = str14;
        this.eInvoiceType = str15;
        this.isCompanyTrue = str16;
    }

    @Nullable
    public final String component1() {
        return this.firstName;
    }

    @Nullable
    public final String component10() {
        return this.postcodeSeq;
    }

    @Nullable
    public final String component11() {
        return this.email;
    }

    @Nullable
    public final String component12() {
        return this.phoneNumberContact;
    }

    @Nullable
    public final String component13() {
        return this.invoiceLanguage;
    }

    @Nullable
    public final String component14() {
        return this.mailingAddressType;
    }

    @Nullable
    public final String component15() {
        return this.eInvoiceType;
    }

    @Nullable
    public final String component2() {
        return this.lastName;
    }

    @Nullable
    public final String component3() {
        return this.birthDate;
    }

    @Nullable
    public final String component4() {
        return this.houseNo;
    }

    @Nullable
    public final String component5() {
        return this.addressNo;
    }

    @Nullable
    public final String component6() {
        return this.province;
    }

    @Nullable
    public final String component7() {
        return this.district;
    }

    @Nullable
    public final String component8() {
        return this.subDistrict;
    }

    @Nullable
    public final String component9() {
        return this.postcode;
    }

    @NotNull
    public final OneAddressMailingData copy(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable String str6, @Nullable String str7, @Nullable String str8, @Nullable String str9, @Nullable String str10, @Nullable String str11, @Nullable String str12, @Nullable String str13, @Nullable String str14, @Nullable String str15, @Nullable String str16) {
        return new OneAddressMailingData(str, str2, str3, str4, str5, str6, str7, str8, str9, str10, str11, str12, str13, str14, str15, str16);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof OneAddressMailingData) {
            OneAddressMailingData oneAddressMailingData = (OneAddressMailingData) obj;
            return Intrinsics.areEqual(this.firstName, oneAddressMailingData.firstName) && Intrinsics.areEqual(this.lastName, oneAddressMailingData.lastName) && Intrinsics.areEqual(this.birthDate, oneAddressMailingData.birthDate) && Intrinsics.areEqual(this.houseNo, oneAddressMailingData.houseNo) && Intrinsics.areEqual(this.addressNo, oneAddressMailingData.addressNo) && Intrinsics.areEqual(this.province, oneAddressMailingData.province) && Intrinsics.areEqual(this.district, oneAddressMailingData.district) && Intrinsics.areEqual(this.subDistrict, oneAddressMailingData.subDistrict) && Intrinsics.areEqual(this.postcode, oneAddressMailingData.postcode) && Intrinsics.areEqual(this.postcodeSeq, oneAddressMailingData.postcodeSeq) && Intrinsics.areEqual(this.email, oneAddressMailingData.email) && Intrinsics.areEqual(this.phoneNumberContact, oneAddressMailingData.phoneNumberContact) && Intrinsics.areEqual(this.invoiceLanguage, oneAddressMailingData.invoiceLanguage) && Intrinsics.areEqual(this.mailingAddressType, oneAddressMailingData.mailingAddressType) && Intrinsics.areEqual(this.eInvoiceType, oneAddressMailingData.eInvoiceType) && Intrinsics.areEqual(this.isCompanyTrue, oneAddressMailingData.isCompanyTrue);
        }
        return false;
    }

    @Nullable
    public final String getAddressNo() {
        return this.addressNo;
    }

    @Nullable
    public final String getBirthDate() {
        return this.birthDate;
    }

    @Nullable
    public final String getDistrict() {
        return this.district;
    }

    @Nullable
    public final String getEInvoiceType() {
        return this.eInvoiceType;
    }

    @Nullable
    public final String getEmail() {
        return this.email;
    }

    @Nullable
    public final String getFirstName() {
        return this.firstName;
    }

    @Nullable
    public final String getHouseNo() {
        return this.houseNo;
    }

    @Nullable
    public final String getInvoiceLanguage() {
        return this.invoiceLanguage;
    }

    @Nullable
    public final String getLastName() {
        return this.lastName;
    }

    @Nullable
    public final String getMailingAddressType() {
        return this.mailingAddressType;
    }

    @Nullable
    public final String getPhoneNumberContact() {
        return this.phoneNumberContact;
    }

    @Nullable
    public final String getPostcode() {
        return this.postcode;
    }

    @Nullable
    public final String getPostcodeSeq() {
        return this.postcodeSeq;
    }

    @Nullable
    public final String getProvince() {
        return this.province;
    }

    @Nullable
    public final String getSubDistrict() {
        return this.subDistrict;
    }

    public int hashCode() {
        String str = this.firstName;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.lastName;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.birthDate;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.houseNo;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.addressNo;
        int hashCode5 = (hashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.province;
        int hashCode6 = (hashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.district;
        int hashCode7 = (hashCode6 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.subDistrict;
        int hashCode8 = (hashCode7 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.postcode;
        int hashCode9 = (hashCode8 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.postcodeSeq;
        int hashCode10 = (hashCode9 + (str10 == null ? 0 : str10.hashCode())) * 31;
        String str11 = this.email;
        int hashCode11 = (hashCode10 + (str11 == null ? 0 : str11.hashCode())) * 31;
        String str12 = this.phoneNumberContact;
        int hashCode12 = (hashCode11 + (str12 == null ? 0 : str12.hashCode())) * 31;
        String str13 = this.invoiceLanguage;
        int hashCode13 = (hashCode12 + (str13 == null ? 0 : str13.hashCode())) * 31;
        String str14 = this.mailingAddressType;
        int hashCode14 = (hashCode13 + (str14 == null ? 0 : str14.hashCode())) * 31;
        String str15 = this.eInvoiceType;
        int hashCode15 = (hashCode14 + (str15 == null ? 0 : str15.hashCode())) * 31;
        String str16 = this.isCompanyTrue;
        return hashCode15 + (str16 != null ? str16.hashCode() : 0);
    }

    public final boolean isTrue() {
        return Intrinsics.areEqual(this.isCompanyTrue, "true");
    }

    @NotNull
    public String toString() {
        String str = this.firstName;
        String str2 = this.lastName;
        String str3 = this.birthDate;
        String str4 = this.houseNo;
        String str5 = this.addressNo;
        String str6 = this.province;
        String str7 = this.district;
        String str8 = this.subDistrict;
        String str9 = this.postcode;
        String str10 = this.postcodeSeq;
        String str11 = this.email;
        String str12 = this.phoneNumberContact;
        String str13 = this.invoiceLanguage;
        String str14 = this.mailingAddressType;
        String str15 = this.eInvoiceType;
        String str16 = this.isCompanyTrue;
        return "OneAddressMailingData(firstName=" + str + ", lastName=" + str2 + ", birthDate=" + str3 + ", houseNo=" + str4 + ", addressNo=" + str5 + ", province=" + str6 + ", district=" + str7 + ", subDistrict=" + str8 + ", postcode=" + str9 + ", postcodeSeq=" + str10 + ", email=" + str11 + ", phoneNumberContact=" + str12 + ", invoiceLanguage=" + str13 + ", mailingAddressType=" + str14 + ", eInvoiceType=" + str15 + ", isCompanyTrue=" + str16 + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "parcel");
        parcel.writeString(this.firstName);
        parcel.writeString(this.lastName);
        parcel.writeString(this.birthDate);
        parcel.writeString(this.houseNo);
        parcel.writeString(this.addressNo);
        parcel.writeString(this.province);
        parcel.writeString(this.district);
        parcel.writeString(this.subDistrict);
        parcel.writeString(this.postcode);
        parcel.writeString(this.postcodeSeq);
        parcel.writeString(this.email);
        parcel.writeString(this.phoneNumberContact);
        parcel.writeString(this.invoiceLanguage);
        parcel.writeString(this.mailingAddressType);
        parcel.writeString(this.eInvoiceType);
        parcel.writeString(this.isCompanyTrue);
    }

    public /* synthetic */ OneAddressMailingData(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, str4, str5, str6, str7, str8, str9, str10, str11, str12, (i & 4096) != 0 ? StandardStructureTypes.f60295TH : str13, (i & 8192) != 0 ? "ID_CARD" : str14, (i & 16384) != 0 ? Constant.EInvoice.SMS_ONLY : str15, (i & 32768) != 0 ? "false" : str16);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public OneAddressMailingData(@NotNull String firstName, @NotNull String lastName, @NotNull String birthDate, @NotNull String phoneNumberContact, boolean z) {
        this(firstName, lastName, birthDate, "", "", "", "", "", "", "", "", phoneNumberContact, "", "", "", z ? "true" : "false");
        Intrinsics.checkNotNullParameter(firstName, "firstName");
        Intrinsics.checkNotNullParameter(lastName, "lastName");
        Intrinsics.checkNotNullParameter(birthDate, "birthDate");
        Intrinsics.checkNotNullParameter(phoneNumberContact, "phoneNumberContact");
    }

    public /* synthetic */ OneAddressMailingData(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, boolean z, boolean z2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, str4, str5, str6, str7, str8, str9, str10, str11, str12, (i & 4096) != 0 ? StandardStructureTypes.f60295TH : str13, (i & 8192) != 0 ? "ID_CARD" : str14, (i & 16384) != 0 ? Constant.EInvoice.SMS_ONLY : str15, z, z2);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public OneAddressMailingData(@NotNull String firstName, @NotNull String lastName, @NotNull String birthDate, @NotNull String houseNo, @NotNull String addressNo, @NotNull String province, @NotNull String district, @NotNull String subDistrict, @NotNull String postcode, @NotNull String postcodeSeq, @Nullable String str, @NotNull String phoneNumberContact, @NotNull String invoiceLanguage, @NotNull String mailingAddressType, @NotNull String eInvoiceType, boolean z, boolean z2) {
        this(firstName, lastName, birthDate, houseNo, addressNo, z ? StringExtKt.toRemoveAllSpecialCharacter(province) : province, z ? StringExtKt.toRemoveAllSpecialCharacter(district) : district, z ? StringExtKt.toRemoveAllSpecialCharacter(subDistrict) : subDistrict, postcode, postcodeSeq, str, phoneNumberContact, invoiceLanguage, mailingAddressType, eInvoiceType, z2 ? "true" : "false");
        Intrinsics.checkNotNullParameter(firstName, "firstName");
        Intrinsics.checkNotNullParameter(lastName, "lastName");
        Intrinsics.checkNotNullParameter(birthDate, "birthDate");
        Intrinsics.checkNotNullParameter(houseNo, "houseNo");
        Intrinsics.checkNotNullParameter(addressNo, "addressNo");
        Intrinsics.checkNotNullParameter(province, "province");
        Intrinsics.checkNotNullParameter(district, "district");
        Intrinsics.checkNotNullParameter(subDistrict, "subDistrict");
        Intrinsics.checkNotNullParameter(postcode, "postcode");
        Intrinsics.checkNotNullParameter(postcodeSeq, "postcodeSeq");
        Intrinsics.checkNotNullParameter(phoneNumberContact, "phoneNumberContact");
        Intrinsics.checkNotNullParameter(invoiceLanguage, "invoiceLanguage");
        Intrinsics.checkNotNullParameter(mailingAddressType, "mailingAddressType");
        Intrinsics.checkNotNullParameter(eInvoiceType, "eInvoiceType");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public OneAddressMailingData(@NotNull Parcel parcel) {
        this(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        Intrinsics.checkNotNullParameter(parcel, "parcel");
    }
}
