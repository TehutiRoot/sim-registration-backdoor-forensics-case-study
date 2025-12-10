package th.p047co.dtac.android.dtacone.model.mrtr_prepaid.register.request;

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
@Metadata(m29143d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b'\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B¹\u0001\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0013J\u000b\u0010%\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010&\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010'\u001a\u0004\u0018\u00010\u000eHÆ\u0003J\u000b\u0010(\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010)\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010*\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010+\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010,\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010-\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010.\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010/\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00100\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00101\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00102\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00103\u001a\u0004\u0018\u00010\u0003HÆ\u0003J½\u0001\u00104\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u00105\u001a\u0002062\b\u00107\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00108\u001a\u000209HÖ\u0001J\t\u0010:\u001a\u00020\u0003HÖ\u0001R\u0018\u0010\f\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0015R\u0018\u0010\u0012\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0015R\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0015R\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0015R\u0018\u0010\u000f\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0015R\u0018\u0010\b\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0015R\u0018\u0010\n\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0015R\u0018\u0010\t\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0015R\u0018\u0010\u0011\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0015R\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0015R\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u0015R\u0018\u0010\u0010\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u0015R\u0018\u0010\r\u001a\u0004\u0018\u00010\u000e8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010#R\u0018\u0010\u000b\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b$\u0010\u0015¨\u0006;"}, m29142d2 = {"Lth/co/dtac/android/dtacone/model/mrtr_prepaid/register/request/Profile;", "", "companyCode", "", "firstName", "lastName", "filename", "lastChangeDateTime", HintConstants.AUTOFILL_HINT_GENDER, "identityType", "identityNumber", MessageBundle.TITLE_ENTRY, "birthDate", "legalAddress", "Lth/co/dtac/android/dtacone/model/mrtr_prepaid/register/request/LegalAddress;", "firstNameEng", "lastNameEng", "issueDate", "expireDate", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lth/co/dtac/android/dtacone/model/mrtr_prepaid/register/request/LegalAddress;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getBirthDate", "()Ljava/lang/String;", "getCompanyCode", "getExpireDate", "getFilename", "getFirstName", "getFirstNameEng", "getGender", "getIdentityNumber", "getIdentityType", "getIssueDate", "getLastChangeDateTime", "getLastName", "getLastNameEng", "getLegalAddress", "()Lth/co/dtac/android/dtacone/model/mrtr_prepaid/register/request/LegalAddress;", "getTitle", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "", "other", "hashCode", "", "toString", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.model.mrtr_prepaid.register.request.Profile */
/* loaded from: classes8.dex */
public final class Profile {
    public static final int $stable = 0;
    @SerializedName("birthDate")
    @Nullable
    private final String birthDate;
    @SerializedName("companyCode")
    @Nullable
    private final String companyCode;
    @SerializedName("expireDate")
    @Nullable
    private final String expireDate;
    @SerializedName("filename")
    @Nullable
    private final String filename;
    @SerializedName("firstName")
    @Nullable
    private final String firstName;
    @SerializedName("firstNameEng")
    @Nullable
    private final String firstNameEng;
    @SerializedName(HintConstants.AUTOFILL_HINT_GENDER)
    @Nullable
    private final String gender;
    @SerializedName("identityNumber")
    @Nullable
    private final String identityNumber;
    @SerializedName("identityType")
    @Nullable
    private final String identityType;
    @SerializedName("issueDate")
    @Nullable
    private final String issueDate;
    @SerializedName("lastChangeDateTime")
    @Nullable
    private final String lastChangeDateTime;
    @SerializedName("lastName")
    @Nullable
    private final String lastName;
    @SerializedName("lastNameEng")
    @Nullable
    private final String lastNameEng;
    @SerializedName("legalAddress")
    @Nullable
    private final LegalAddress legalAddress;
    @SerializedName(MessageBundle.TITLE_ENTRY)
    @Nullable
    private final String title;

    public Profile() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 32767, null);
    }

    @Nullable
    public final String component1() {
        return this.companyCode;
    }

    @Nullable
    public final String component10() {
        return this.birthDate;
    }

    @Nullable
    public final LegalAddress component11() {
        return this.legalAddress;
    }

    @Nullable
    public final String component12() {
        return this.firstNameEng;
    }

    @Nullable
    public final String component13() {
        return this.lastNameEng;
    }

    @Nullable
    public final String component14() {
        return this.issueDate;
    }

    @Nullable
    public final String component15() {
        return this.expireDate;
    }

    @Nullable
    public final String component2() {
        return this.firstName;
    }

    @Nullable
    public final String component3() {
        return this.lastName;
    }

    @Nullable
    public final String component4() {
        return this.filename;
    }

    @Nullable
    public final String component5() {
        return this.lastChangeDateTime;
    }

    @Nullable
    public final String component6() {
        return this.gender;
    }

    @Nullable
    public final String component7() {
        return this.identityType;
    }

    @Nullable
    public final String component8() {
        return this.identityNumber;
    }

    @Nullable
    public final String component9() {
        return this.title;
    }

    @NotNull
    public final Profile copy(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable String str6, @Nullable String str7, @Nullable String str8, @Nullable String str9, @Nullable String str10, @Nullable LegalAddress legalAddress, @Nullable String str11, @Nullable String str12, @Nullable String str13, @Nullable String str14) {
        return new Profile(str, str2, str3, str4, str5, str6, str7, str8, str9, str10, legalAddress, str11, str12, str13, str14);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Profile) {
            Profile profile = (Profile) obj;
            return Intrinsics.areEqual(this.companyCode, profile.companyCode) && Intrinsics.areEqual(this.firstName, profile.firstName) && Intrinsics.areEqual(this.lastName, profile.lastName) && Intrinsics.areEqual(this.filename, profile.filename) && Intrinsics.areEqual(this.lastChangeDateTime, profile.lastChangeDateTime) && Intrinsics.areEqual(this.gender, profile.gender) && Intrinsics.areEqual(this.identityType, profile.identityType) && Intrinsics.areEqual(this.identityNumber, profile.identityNumber) && Intrinsics.areEqual(this.title, profile.title) && Intrinsics.areEqual(this.birthDate, profile.birthDate) && Intrinsics.areEqual(this.legalAddress, profile.legalAddress) && Intrinsics.areEqual(this.firstNameEng, profile.firstNameEng) && Intrinsics.areEqual(this.lastNameEng, profile.lastNameEng) && Intrinsics.areEqual(this.issueDate, profile.issueDate) && Intrinsics.areEqual(this.expireDate, profile.expireDate);
        }
        return false;
    }

    @Nullable
    public final String getBirthDate() {
        return this.birthDate;
    }

    @Nullable
    public final String getCompanyCode() {
        return this.companyCode;
    }

    @Nullable
    public final String getExpireDate() {
        return this.expireDate;
    }

    @Nullable
    public final String getFilename() {
        return this.filename;
    }

    @Nullable
    public final String getFirstName() {
        return this.firstName;
    }

    @Nullable
    public final String getFirstNameEng() {
        return this.firstNameEng;
    }

    @Nullable
    public final String getGender() {
        return this.gender;
    }

    @Nullable
    public final String getIdentityNumber() {
        return this.identityNumber;
    }

    @Nullable
    public final String getIdentityType() {
        return this.identityType;
    }

    @Nullable
    public final String getIssueDate() {
        return this.issueDate;
    }

    @Nullable
    public final String getLastChangeDateTime() {
        return this.lastChangeDateTime;
    }

    @Nullable
    public final String getLastName() {
        return this.lastName;
    }

    @Nullable
    public final String getLastNameEng() {
        return this.lastNameEng;
    }

    @Nullable
    public final LegalAddress getLegalAddress() {
        return this.legalAddress;
    }

    @Nullable
    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        String str = this.companyCode;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.firstName;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.lastName;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.filename;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.lastChangeDateTime;
        int hashCode5 = (hashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.gender;
        int hashCode6 = (hashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.identityType;
        int hashCode7 = (hashCode6 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.identityNumber;
        int hashCode8 = (hashCode7 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.title;
        int hashCode9 = (hashCode8 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.birthDate;
        int hashCode10 = (hashCode9 + (str10 == null ? 0 : str10.hashCode())) * 31;
        LegalAddress legalAddress = this.legalAddress;
        int hashCode11 = (hashCode10 + (legalAddress == null ? 0 : legalAddress.hashCode())) * 31;
        String str11 = this.firstNameEng;
        int hashCode12 = (hashCode11 + (str11 == null ? 0 : str11.hashCode())) * 31;
        String str12 = this.lastNameEng;
        int hashCode13 = (hashCode12 + (str12 == null ? 0 : str12.hashCode())) * 31;
        String str13 = this.issueDate;
        int hashCode14 = (hashCode13 + (str13 == null ? 0 : str13.hashCode())) * 31;
        String str14 = this.expireDate;
        return hashCode14 + (str14 != null ? str14.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        String str = this.companyCode;
        String str2 = this.firstName;
        String str3 = this.lastName;
        String str4 = this.filename;
        String str5 = this.lastChangeDateTime;
        String str6 = this.gender;
        String str7 = this.identityType;
        String str8 = this.identityNumber;
        String str9 = this.title;
        String str10 = this.birthDate;
        LegalAddress legalAddress = this.legalAddress;
        String str11 = this.firstNameEng;
        String str12 = this.lastNameEng;
        String str13 = this.issueDate;
        String str14 = this.expireDate;
        return "Profile(companyCode=" + str + ", firstName=" + str2 + ", lastName=" + str3 + ", filename=" + str4 + ", lastChangeDateTime=" + str5 + ", gender=" + str6 + ", identityType=" + str7 + ", identityNumber=" + str8 + ", title=" + str9 + ", birthDate=" + str10 + ", legalAddress=" + legalAddress + ", firstNameEng=" + str11 + ", lastNameEng=" + str12 + ", issueDate=" + str13 + ", expireDate=" + str14 + ")";
    }

    public Profile(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable String str6, @Nullable String str7, @Nullable String str8, @Nullable String str9, @Nullable String str10, @Nullable LegalAddress legalAddress, @Nullable String str11, @Nullable String str12, @Nullable String str13, @Nullable String str14) {
        this.companyCode = str;
        this.firstName = str2;
        this.lastName = str3;
        this.filename = str4;
        this.lastChangeDateTime = str5;
        this.gender = str6;
        this.identityType = str7;
        this.identityNumber = str8;
        this.title = str9;
        this.birthDate = str10;
        this.legalAddress = legalAddress;
        this.firstNameEng = str11;
        this.lastNameEng = str12;
        this.issueDate = str13;
        this.expireDate = str14;
    }

    public /* synthetic */ Profile(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, LegalAddress legalAddress, String str11, String str12, String str13, String str14, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : str5, (i & 32) != 0 ? null : str6, (i & 64) != 0 ? null : str7, (i & 128) != 0 ? null : str8, (i & 256) != 0 ? null : str9, (i & 512) != 0 ? null : str10, (i & 1024) != 0 ? null : legalAddress, (i & 2048) != 0 ? null : str11, (i & 4096) != 0 ? null : str12, (i & 8192) != 0 ? null : str13, (i & 16384) == 0 ? str14 : null);
    }
}