package th.p047co.dtac.android.dtacone.model.mnp;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.internal.StabilityInferred;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 0)
@Metadata(m29143d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u001c\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 72\u00020\u0001:\u00017Bs\b\u0016\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\r\u001a\u00020\u000e¢\u0006\u0002\u0010\u000fB\u000f\b\u0016\u0012\u0006\u0010\u0010\u001a\u00020\u0011¢\u0006\u0002\u0010\u0012Bs\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0003¢\u0006\u0002\u0010\u0014J\u000b\u0010!\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\"\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010#\u001a\u00020\u0003HÆ\u0003J\u000b\u0010$\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010%\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010&\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010'\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010(\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010)\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010*\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010+\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u008b\u0001\u0010,\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0013\u001a\u00020\u0003HÆ\u0001J\b\u0010-\u001a\u00020.H\u0016J\u0013\u0010/\u001a\u00020\u000e2\b\u00100\u001a\u0004\u0018\u000101HÖ\u0003J\t\u00102\u001a\u00020.HÖ\u0001J\t\u00103\u001a\u00020\u0003HÖ\u0001J\u0018\u00104\u001a\u0002052\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u00106\u001a\u00020.H\u0016R\u0018\u0010\n\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0016R\u0018\u0010\t\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0016R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0016R\u0018\u0010\f\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0016R\u0018\u0010\u000b\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0016R\u0018\u0010\b\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0016R\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0016R\u0016\u0010\u0013\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0016R\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0016R\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u0016¨\u00068"}, m29142d2 = {"Lth/co/dtac/android/dtacone/model/mnp/MailingAddressCollection;", "Landroid/os/Parcelable;", "houseNo", "", "province", "district", "subDistrict", "postCode", "mailingAddressType", "email", "contactNumber", "language", "invoiceType", "removeSpecialCharacter", "", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V", "parcel", "Landroid/os/Parcel;", "(Landroid/os/Parcel;)V", "postCodeSeqn", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getContactNumber", "()Ljava/lang/String;", "getDistrict", "getEmail", "getHouseNo", "getInvoiceType", "getLanguage", "getMailingAddressType", "getPostCode", "getPostCodeSeqn", "getProvince", "getSubDistrict", "component1", "component10", "component11", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "describeContents", "", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "flags", "CREATOR", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.model.mnp.MailingAddressCollection */
/* loaded from: classes8.dex */
public final class MailingAddressCollection implements Parcelable {
    public static final int $stable = 0;
    @NotNull
    public static final CREATOR CREATOR = new CREATOR(null);
    @SerializedName("contactPhoneNumber")
    @Nullable
    private final String contactNumber;
    @SerializedName("district")
    @Nullable
    private final String district;
    @SerializedName("email")
    @Nullable
    private final String email;
    @SerializedName("houseNo")
    @Nullable
    private final String houseNo;
    @SerializedName("invoiceType")
    @Nullable
    private final String invoiceType;
    @SerializedName("invoiceLanguage")
    @Nullable
    private final String language;
    @SerializedName("mailingAddressType")
    @Nullable
    private final String mailingAddressType;
    @SerializedName("postCode")
    @Nullable
    private final String postCode;
    @SerializedName("postCodeSeqn")
    @NotNull
    private final String postCodeSeqn;
    @SerializedName("province")
    @Nullable
    private final String province;
    @SerializedName("subDistrict")
    @Nullable
    private final String subDistrict;

    @Metadata(m29143d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u001d\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0016¢\u0006\u0002\u0010\u000b¨\u0006\f"}, m29142d2 = {"Lth/co/dtac/android/dtacone/model/mnp/MailingAddressCollection$CREATOR;", "Landroid/os/Parcelable$Creator;", "Lth/co/dtac/android/dtacone/model/mnp/MailingAddressCollection;", "()V", "createFromParcel", "parcel", "Landroid/os/Parcel;", "newArray", "", "size", "", "(I)[Lth/co/dtac/android/dtacone/model/mnp/MailingAddressCollection;", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0}, m29138xi = 48)
    /* renamed from: th.co.dtac.android.dtacone.model.mnp.MailingAddressCollection$CREATOR */
    /* loaded from: classes8.dex */
    public static final class CREATOR implements Parcelable.Creator<MailingAddressCollection> {
        public /* synthetic */ CREATOR(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private CREATOR() {
        }

        @Override // android.os.Parcelable.Creator
        @NotNull
        public MailingAddressCollection createFromParcel(@NotNull Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new MailingAddressCollection(parcel);
        }

        @Override // android.os.Parcelable.Creator
        @NotNull
        public MailingAddressCollection[] newArray(int i) {
            return new MailingAddressCollection[i];
        }
    }

    public MailingAddressCollection(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable String str6, @Nullable String str7, @Nullable String str8, @Nullable String str9, @Nullable String str10, @NotNull String postCodeSeqn) {
        Intrinsics.checkNotNullParameter(postCodeSeqn, "postCodeSeqn");
        this.houseNo = str;
        this.province = str2;
        this.district = str3;
        this.subDistrict = str4;
        this.postCode = str5;
        this.mailingAddressType = str6;
        this.email = str7;
        this.contactNumber = str8;
        this.language = str9;
        this.invoiceType = str10;
        this.postCodeSeqn = postCodeSeqn;
    }

    @Nullable
    public final String component1() {
        return this.houseNo;
    }

    @Nullable
    public final String component10() {
        return this.invoiceType;
    }

    @NotNull
    public final String component11() {
        return this.postCodeSeqn;
    }

    @Nullable
    public final String component2() {
        return this.province;
    }

    @Nullable
    public final String component3() {
        return this.district;
    }

    @Nullable
    public final String component4() {
        return this.subDistrict;
    }

    @Nullable
    public final String component5() {
        return this.postCode;
    }

    @Nullable
    public final String component6() {
        return this.mailingAddressType;
    }

    @Nullable
    public final String component7() {
        return this.email;
    }

    @Nullable
    public final String component8() {
        return this.contactNumber;
    }

    @Nullable
    public final String component9() {
        return this.language;
    }

    @NotNull
    public final MailingAddressCollection copy(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable String str6, @Nullable String str7, @Nullable String str8, @Nullable String str9, @Nullable String str10, @NotNull String postCodeSeqn) {
        Intrinsics.checkNotNullParameter(postCodeSeqn, "postCodeSeqn");
        return new MailingAddressCollection(str, str2, str3, str4, str5, str6, str7, str8, str9, str10, postCodeSeqn);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof MailingAddressCollection) {
            MailingAddressCollection mailingAddressCollection = (MailingAddressCollection) obj;
            return Intrinsics.areEqual(this.houseNo, mailingAddressCollection.houseNo) && Intrinsics.areEqual(this.province, mailingAddressCollection.province) && Intrinsics.areEqual(this.district, mailingAddressCollection.district) && Intrinsics.areEqual(this.subDistrict, mailingAddressCollection.subDistrict) && Intrinsics.areEqual(this.postCode, mailingAddressCollection.postCode) && Intrinsics.areEqual(this.mailingAddressType, mailingAddressCollection.mailingAddressType) && Intrinsics.areEqual(this.email, mailingAddressCollection.email) && Intrinsics.areEqual(this.contactNumber, mailingAddressCollection.contactNumber) && Intrinsics.areEqual(this.language, mailingAddressCollection.language) && Intrinsics.areEqual(this.invoiceType, mailingAddressCollection.invoiceType) && Intrinsics.areEqual(this.postCodeSeqn, mailingAddressCollection.postCodeSeqn);
        }
        return false;
    }

    @Nullable
    public final String getContactNumber() {
        return this.contactNumber;
    }

    @Nullable
    public final String getDistrict() {
        return this.district;
    }

    @Nullable
    public final String getEmail() {
        return this.email;
    }

    @Nullable
    public final String getHouseNo() {
        return this.houseNo;
    }

    @Nullable
    public final String getInvoiceType() {
        return this.invoiceType;
    }

    @Nullable
    public final String getLanguage() {
        return this.language;
    }

    @Nullable
    public final String getMailingAddressType() {
        return this.mailingAddressType;
    }

    @Nullable
    public final String getPostCode() {
        return this.postCode;
    }

    @NotNull
    public final String getPostCodeSeqn() {
        return this.postCodeSeqn;
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
        String str = this.houseNo;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.province;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.district;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.subDistrict;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.postCode;
        int hashCode5 = (hashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.mailingAddressType;
        int hashCode6 = (hashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.email;
        int hashCode7 = (hashCode6 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.contactNumber;
        int hashCode8 = (hashCode7 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.language;
        int hashCode9 = (hashCode8 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.invoiceType;
        return ((hashCode9 + (str10 != null ? str10.hashCode() : 0)) * 31) + this.postCodeSeqn.hashCode();
    }

    @NotNull
    public String toString() {
        String str = this.houseNo;
        String str2 = this.province;
        String str3 = this.district;
        String str4 = this.subDistrict;
        String str5 = this.postCode;
        String str6 = this.mailingAddressType;
        String str7 = this.email;
        String str8 = this.contactNumber;
        String str9 = this.language;
        String str10 = this.invoiceType;
        String str11 = this.postCodeSeqn;
        return "MailingAddressCollection(houseNo=" + str + ", province=" + str2 + ", district=" + str3 + ", subDistrict=" + str4 + ", postCode=" + str5 + ", mailingAddressType=" + str6 + ", email=" + str7 + ", contactNumber=" + str8 + ", language=" + str9 + ", invoiceType=" + str10 + ", postCodeSeqn=" + str11 + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "parcel");
        parcel.writeString(this.houseNo);
        parcel.writeString(this.province);
        parcel.writeString(this.district);
        parcel.writeString(this.subDistrict);
        parcel.writeString(this.postCode);
        parcel.writeString(this.mailingAddressType);
        parcel.writeString(this.email);
        parcel.writeString(this.contactNumber);
        parcel.writeString(this.language);
        parcel.writeString(this.invoiceType);
    }

    public /* synthetic */ MailingAddressCollection(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, str4, str5, str6, str7, str8, str9, str10, (i & 1024) != 0 ? "" : str11);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public MailingAddressCollection(@org.jetbrains.annotations.Nullable java.lang.String r15, @org.jetbrains.annotations.Nullable java.lang.String r16, @org.jetbrains.annotations.Nullable java.lang.String r17, @org.jetbrains.annotations.Nullable java.lang.String r18, @org.jetbrains.annotations.Nullable java.lang.String r19, @org.jetbrains.annotations.Nullable java.lang.String r20, @org.jetbrains.annotations.Nullable java.lang.String r21, @org.jetbrains.annotations.Nullable java.lang.String r22, @org.jetbrains.annotations.Nullable java.lang.String r23, @org.jetbrains.annotations.Nullable java.lang.String r24, boolean r25) {
        /*
            r14 = this;
            r0 = 0
            if (r25 == 0) goto Ld
            if (r16 == 0) goto Lb
            java.lang.String r1 = th.p047co.dtac.android.dtacone.extension.format.StringExtKt.toRemoveAllSpecialCharacter(r16)
            r4 = r1
            goto Lf
        Lb:
            r4 = r0
            goto Lf
        Ld:
            r4 = r16
        Lf:
            if (r25 == 0) goto L1b
            if (r17 == 0) goto L19
            java.lang.String r1 = th.p047co.dtac.android.dtacone.extension.format.StringExtKt.toRemoveAllSpecialCharacter(r17)
            r5 = r1
            goto L1d
        L19:
            r5 = r0
            goto L1d
        L1b:
            r5 = r17
        L1d:
            if (r25 == 0) goto L27
            if (r18 == 0) goto L25
            java.lang.String r0 = th.p047co.dtac.android.dtacone.extension.format.StringExtKt.toRemoveAllSpecialCharacter(r18)
        L25:
            r6 = r0
            goto L29
        L27:
            r6 = r18
        L29:
            java.lang.String r13 = ""
            r2 = r14
            r3 = r15
            r7 = r19
            r8 = r20
            r9 = r21
            r10 = r22
            r11 = r23
            r12 = r24
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: th.p047co.dtac.android.dtacone.model.mnp.MailingAddressCollection.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, boolean):void");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public MailingAddressCollection(@NotNull Parcel parcel) {
        this(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), null, 1024, null);
        Intrinsics.checkNotNullParameter(parcel, "parcel");
    }
}