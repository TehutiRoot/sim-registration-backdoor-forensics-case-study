package th.p047co.dtac.android.dtacone.model.appOne.consent_tmn;

import androidx.autofill.HintConstants;
import androidx.compose.runtime.internal.StabilityInferred;
import com.chuckerteam.chucker.internal.support.ResponseProcessor;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 0)
@Metadata(m28851d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b0\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BÝ\u0001\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0016J\u000b\u0010+\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010,\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010-\u001a\u0004\u0018\u00010\u000eHÆ\u0003J\u000b\u0010.\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010/\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00100\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00101\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00102\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00103\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00104\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00105\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00106\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00107\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00108\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00109\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010:\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010;\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010<\u001a\u0004\u0018\u00010\u0003HÆ\u0003Já\u0001\u0010=\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010>\u001a\u00020?2\b\u0010@\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010A\u001a\u00020BHÖ\u0001J\t\u0010C\u001a\u00020\u0003HÖ\u0001R\u0018\u0010\t\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0018R\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0018R\u0018\u0010\u0011\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0018R\u0018\u0010\u000f\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0018R\u0018\u0010\u000b\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0018R\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0018R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0018R\u0018\u0010\u0013\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u0018R\u0018\u0010\u0012\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u0018R\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u0018R\u0018\u0010\r\u001a\u0004\u0018\u00010\u000e8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b#\u0010$R\u0018\u0010\b\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b%\u0010\u0018R\u0018\u0010\f\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b&\u0010\u0018R\u0018\u0010\n\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b'\u0010\u0018R\u0018\u0010\u0010\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b(\u0010\u0018R\u0018\u0010\u0015\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b)\u0010\u0018R\u0018\u0010\u0014\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b*\u0010\u0018¨\u0006D"}, m28850d2 = {"Lth/co/dtac/android/dtacone/model/appOne/consent_tmn/Profile;", "", ResponseProcessor.CONTENT_TYPE_IMAGE, "", HintConstants.AUTOFILL_HINT_GENDER, "issuerPlace", "englishFirstName", "englishLastName", "requestNo", "birthDate", "thaiID", "expiryDate", "thaiFirstName", "registerAddress", "Lth/co/dtac/android/dtacone/model/appOne/consent_tmn/RegisterAddress;", "englishTitles", "thaiLastName", "englishMiddleName", "issuerCode", "issueDate", "thaiTitles", "thaiMiddleName", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lth/co/dtac/android/dtacone/model/appOne/consent_tmn/RegisterAddress;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getBirthDate", "()Ljava/lang/String;", "getEnglishFirstName", "getEnglishLastName", "getEnglishMiddleName", "getEnglishTitles", "getExpiryDate", "getGender", "getImage", "getIssueDate", "getIssuerCode", "getIssuerPlace", "getRegisterAddress", "()Lth/co/dtac/android/dtacone/model/appOne/consent_tmn/RegisterAddress;", "getRequestNo", "getThaiFirstName", "getThaiID", "getThaiLastName", "getThaiMiddleName", "getThaiTitles", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "", "other", "hashCode", "", "toString", "app_prodRelease"}, m28849k = 1, m28848mv = {1, 8, 0}, m28846xi = 48)
/* renamed from: th.co.dtac.android.dtacone.model.appOne.consent_tmn.Profile */
/* loaded from: classes8.dex */
public final class Profile {
    public static final int $stable = 0;
    @SerializedName("birthDate")
    @Nullable
    private final String birthDate;
    @SerializedName("englishFirstName")
    @Nullable
    private final String englishFirstName;
    @SerializedName("englishLastName")
    @Nullable
    private final String englishLastName;
    @SerializedName("englishMiddleName")
    @Nullable
    private final String englishMiddleName;
    @SerializedName("englishTitles")
    @Nullable
    private final String englishTitles;
    @SerializedName("expiryDate")
    @Nullable
    private final String expiryDate;
    @SerializedName(HintConstants.AUTOFILL_HINT_GENDER)
    @Nullable
    private final String gender;
    @SerializedName(ResponseProcessor.CONTENT_TYPE_IMAGE)
    @Nullable
    private final String image;
    @SerializedName("issueDate")
    @Nullable
    private final String issueDate;
    @SerializedName("issuerCode")
    @Nullable
    private final String issuerCode;
    @SerializedName("issuerPlace")
    @Nullable
    private final String issuerPlace;
    @SerializedName("registerAddress")
    @Nullable
    private final RegisterAddress registerAddress;
    @SerializedName("requestNo")
    @Nullable
    private final String requestNo;
    @SerializedName("thaiFirstName")
    @Nullable
    private final String thaiFirstName;
    @SerializedName("thaiID")
    @Nullable
    private final String thaiID;
    @SerializedName("thaiLastName")
    @Nullable
    private final String thaiLastName;
    @SerializedName("thaiMiddleName")
    @Nullable
    private final String thaiMiddleName;
    @SerializedName("thaiTitles")
    @Nullable
    private final String thaiTitles;

    public Profile() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 262143, null);
    }

    @Nullable
    public final String component1() {
        return this.image;
    }

    @Nullable
    public final String component10() {
        return this.thaiFirstName;
    }

    @Nullable
    public final RegisterAddress component11() {
        return this.registerAddress;
    }

    @Nullable
    public final String component12() {
        return this.englishTitles;
    }

    @Nullable
    public final String component13() {
        return this.thaiLastName;
    }

    @Nullable
    public final String component14() {
        return this.englishMiddleName;
    }

    @Nullable
    public final String component15() {
        return this.issuerCode;
    }

    @Nullable
    public final String component16() {
        return this.issueDate;
    }

    @Nullable
    public final String component17() {
        return this.thaiTitles;
    }

    @Nullable
    public final String component18() {
        return this.thaiMiddleName;
    }

    @Nullable
    public final String component2() {
        return this.gender;
    }

    @Nullable
    public final String component3() {
        return this.issuerPlace;
    }

    @Nullable
    public final String component4() {
        return this.englishFirstName;
    }

    @Nullable
    public final String component5() {
        return this.englishLastName;
    }

    @Nullable
    public final String component6() {
        return this.requestNo;
    }

    @Nullable
    public final String component7() {
        return this.birthDate;
    }

    @Nullable
    public final String component8() {
        return this.thaiID;
    }

    @Nullable
    public final String component9() {
        return this.expiryDate;
    }

    @NotNull
    public final Profile copy(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable String str6, @Nullable String str7, @Nullable String str8, @Nullable String str9, @Nullable String str10, @Nullable RegisterAddress registerAddress, @Nullable String str11, @Nullable String str12, @Nullable String str13, @Nullable String str14, @Nullable String str15, @Nullable String str16, @Nullable String str17) {
        return new Profile(str, str2, str3, str4, str5, str6, str7, str8, str9, str10, registerAddress, str11, str12, str13, str14, str15, str16, str17);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Profile) {
            Profile profile = (Profile) obj;
            return Intrinsics.areEqual(this.image, profile.image) && Intrinsics.areEqual(this.gender, profile.gender) && Intrinsics.areEqual(this.issuerPlace, profile.issuerPlace) && Intrinsics.areEqual(this.englishFirstName, profile.englishFirstName) && Intrinsics.areEqual(this.englishLastName, profile.englishLastName) && Intrinsics.areEqual(this.requestNo, profile.requestNo) && Intrinsics.areEqual(this.birthDate, profile.birthDate) && Intrinsics.areEqual(this.thaiID, profile.thaiID) && Intrinsics.areEqual(this.expiryDate, profile.expiryDate) && Intrinsics.areEqual(this.thaiFirstName, profile.thaiFirstName) && Intrinsics.areEqual(this.registerAddress, profile.registerAddress) && Intrinsics.areEqual(this.englishTitles, profile.englishTitles) && Intrinsics.areEqual(this.thaiLastName, profile.thaiLastName) && Intrinsics.areEqual(this.englishMiddleName, profile.englishMiddleName) && Intrinsics.areEqual(this.issuerCode, profile.issuerCode) && Intrinsics.areEqual(this.issueDate, profile.issueDate) && Intrinsics.areEqual(this.thaiTitles, profile.thaiTitles) && Intrinsics.areEqual(this.thaiMiddleName, profile.thaiMiddleName);
        }
        return false;
    }

    @Nullable
    public final String getBirthDate() {
        return this.birthDate;
    }

    @Nullable
    public final String getEnglishFirstName() {
        return this.englishFirstName;
    }

    @Nullable
    public final String getEnglishLastName() {
        return this.englishLastName;
    }

    @Nullable
    public final String getEnglishMiddleName() {
        return this.englishMiddleName;
    }

    @Nullable
    public final String getEnglishTitles() {
        return this.englishTitles;
    }

    @Nullable
    public final String getExpiryDate() {
        return this.expiryDate;
    }

    @Nullable
    public final String getGender() {
        return this.gender;
    }

    @Nullable
    public final String getImage() {
        return this.image;
    }

    @Nullable
    public final String getIssueDate() {
        return this.issueDate;
    }

    @Nullable
    public final String getIssuerCode() {
        return this.issuerCode;
    }

    @Nullable
    public final String getIssuerPlace() {
        return this.issuerPlace;
    }

    @Nullable
    public final RegisterAddress getRegisterAddress() {
        return this.registerAddress;
    }

    @Nullable
    public final String getRequestNo() {
        return this.requestNo;
    }

    @Nullable
    public final String getThaiFirstName() {
        return this.thaiFirstName;
    }

    @Nullable
    public final String getThaiID() {
        return this.thaiID;
    }

    @Nullable
    public final String getThaiLastName() {
        return this.thaiLastName;
    }

    @Nullable
    public final String getThaiMiddleName() {
        return this.thaiMiddleName;
    }

    @Nullable
    public final String getThaiTitles() {
        return this.thaiTitles;
    }

    public int hashCode() {
        String str = this.image;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.gender;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.issuerPlace;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.englishFirstName;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.englishLastName;
        int hashCode5 = (hashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.requestNo;
        int hashCode6 = (hashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.birthDate;
        int hashCode7 = (hashCode6 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.thaiID;
        int hashCode8 = (hashCode7 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.expiryDate;
        int hashCode9 = (hashCode8 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.thaiFirstName;
        int hashCode10 = (hashCode9 + (str10 == null ? 0 : str10.hashCode())) * 31;
        RegisterAddress registerAddress = this.registerAddress;
        int hashCode11 = (hashCode10 + (registerAddress == null ? 0 : registerAddress.hashCode())) * 31;
        String str11 = this.englishTitles;
        int hashCode12 = (hashCode11 + (str11 == null ? 0 : str11.hashCode())) * 31;
        String str12 = this.thaiLastName;
        int hashCode13 = (hashCode12 + (str12 == null ? 0 : str12.hashCode())) * 31;
        String str13 = this.englishMiddleName;
        int hashCode14 = (hashCode13 + (str13 == null ? 0 : str13.hashCode())) * 31;
        String str14 = this.issuerCode;
        int hashCode15 = (hashCode14 + (str14 == null ? 0 : str14.hashCode())) * 31;
        String str15 = this.issueDate;
        int hashCode16 = (hashCode15 + (str15 == null ? 0 : str15.hashCode())) * 31;
        String str16 = this.thaiTitles;
        int hashCode17 = (hashCode16 + (str16 == null ? 0 : str16.hashCode())) * 31;
        String str17 = this.thaiMiddleName;
        return hashCode17 + (str17 != null ? str17.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        String str = this.image;
        String str2 = this.gender;
        String str3 = this.issuerPlace;
        String str4 = this.englishFirstName;
        String str5 = this.englishLastName;
        String str6 = this.requestNo;
        String str7 = this.birthDate;
        String str8 = this.thaiID;
        String str9 = this.expiryDate;
        String str10 = this.thaiFirstName;
        RegisterAddress registerAddress = this.registerAddress;
        String str11 = this.englishTitles;
        String str12 = this.thaiLastName;
        String str13 = this.englishMiddleName;
        String str14 = this.issuerCode;
        String str15 = this.issueDate;
        String str16 = this.thaiTitles;
        String str17 = this.thaiMiddleName;
        return "Profile(image=" + str + ", gender=" + str2 + ", issuerPlace=" + str3 + ", englishFirstName=" + str4 + ", englishLastName=" + str5 + ", requestNo=" + str6 + ", birthDate=" + str7 + ", thaiID=" + str8 + ", expiryDate=" + str9 + ", thaiFirstName=" + str10 + ", registerAddress=" + registerAddress + ", englishTitles=" + str11 + ", thaiLastName=" + str12 + ", englishMiddleName=" + str13 + ", issuerCode=" + str14 + ", issueDate=" + str15 + ", thaiTitles=" + str16 + ", thaiMiddleName=" + str17 + ")";
    }

    public Profile(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable String str6, @Nullable String str7, @Nullable String str8, @Nullable String str9, @Nullable String str10, @Nullable RegisterAddress registerAddress, @Nullable String str11, @Nullable String str12, @Nullable String str13, @Nullable String str14, @Nullable String str15, @Nullable String str16, @Nullable String str17) {
        this.image = str;
        this.gender = str2;
        this.issuerPlace = str3;
        this.englishFirstName = str4;
        this.englishLastName = str5;
        this.requestNo = str6;
        this.birthDate = str7;
        this.thaiID = str8;
        this.expiryDate = str9;
        this.thaiFirstName = str10;
        this.registerAddress = registerAddress;
        this.englishTitles = str11;
        this.thaiLastName = str12;
        this.englishMiddleName = str13;
        this.issuerCode = str14;
        this.issueDate = str15;
        this.thaiTitles = str16;
        this.thaiMiddleName = str17;
    }

    public /* synthetic */ Profile(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, RegisterAddress registerAddress, String str11, String str12, String str13, String str14, String str15, String str16, String str17, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : str5, (i & 32) != 0 ? null : str6, (i & 64) != 0 ? null : str7, (i & 128) != 0 ? null : str8, (i & 256) != 0 ? null : str9, (i & 512) != 0 ? null : str10, (i & 1024) != 0 ? null : registerAddress, (i & 2048) != 0 ? null : str11, (i & 4096) != 0 ? null : str12, (i & 8192) != 0 ? null : str13, (i & 16384) != 0 ? null : str14, (i & 32768) != 0 ? null : str15, (i & 65536) != 0 ? null : str16, (i & 131072) != 0 ? null : str17);
    }
}
