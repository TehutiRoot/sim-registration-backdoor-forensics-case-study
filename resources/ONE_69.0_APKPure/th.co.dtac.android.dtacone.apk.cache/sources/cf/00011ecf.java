package th.p047co.dtac.android.dtacone.model.mrtr_change_sim.submit.request;

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
@Metadata(m29143d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b1\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BÑ\u0001\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0015J\u000b\u0010)\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010*\u001a\u0004\u0018\u00010\rHÆ\u0003¢\u0006\u0002\u0010 J\u000b\u0010+\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010,\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010-\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010.\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010/\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00100\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00101\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00102\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00103\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00104\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00105\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00106\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00107\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00108\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00109\u001a\u0004\u0018\u00010\u0003HÆ\u0003JÚ\u0001\u0010:\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010;J\u0013\u0010<\u001a\u00020\r2\b\u0010=\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010>\u001a\u00020?HÖ\u0001J\t\u0010@\u001a\u00020\u0003HÖ\u0001R\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0017R\u0018\u0010\u000e\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0017R\u0018\u0010\u000f\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0017R\u0018\u0010\u0010\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0017R\u0018\u0010\n\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0017R\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0017R\u0018\u0010\t\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0017R\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0017R\u001a\u0010\f\u001a\u0004\u0018\u00010\r8\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010!\u001a\u0004\b\f\u0010 R\u0018\u0010\u0013\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u0017R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b#\u0010\u0017R\u0018\u0010\u0014\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b$\u0010\u0017R\u0018\u0010\u0012\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b%\u0010\u0017R\u0018\u0010\b\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b&\u0010\u0017R\u0018\u0010\u000b\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b'\u0010\u0017R\u0018\u0010\u0011\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b(\u0010\u0017¨\u0006A"}, m29142d2 = {"Lth/co/dtac/android/dtacone/model/mrtr_change_sim/submit/request/Attorney;", "", "lastName", "", "idType", HintConstants.AUTOFILL_HINT_GENDER, "address2", "address1", "profileImage", "idNumber", "firstNameEnglish", MessageBundle.TITLE_ENTRY, "isSmartCard", "", "birthDate", "expiryDate", "firstName", "titleEnglish", "pictureID", "issueDate", "lastNameEnglish", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getAddress1", "()Ljava/lang/String;", "getAddress2", "getBirthDate", "getExpiryDate", "getFirstName", "getFirstNameEnglish", "getGender", "getIdNumber", "getIdType", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getIssueDate", "getLastName", "getLastNameEnglish", "getPictureID", "getProfileImage", "getTitle", "getTitleEnglish", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lth/co/dtac/android/dtacone/model/mrtr_change_sim/submit/request/Attorney;", "equals", "other", "hashCode", "", "toString", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.model.mrtr_change_sim.submit.request.Attorney */
/* loaded from: classes8.dex */
public final class Attorney {
    public static final int $stable = 0;
    @SerializedName("address1")
    @Nullable
    private final String address1;
    @SerializedName("address2")
    @Nullable
    private final String address2;
    @SerializedName("birthDate")
    @Nullable
    private final String birthDate;
    @SerializedName("expiryDate")
    @Nullable
    private final String expiryDate;
    @SerializedName("firstName")
    @Nullable
    private final String firstName;
    @SerializedName("firstNameEnglish")
    @Nullable
    private final String firstNameEnglish;
    @SerializedName(HintConstants.AUTOFILL_HINT_GENDER)
    @Nullable
    private final String gender;
    @SerializedName("idNumber")
    @Nullable
    private final String idNumber;
    @SerializedName("idType")
    @Nullable
    private final String idType;
    @SerializedName("isSmartCard")
    @Nullable
    private final Boolean isSmartCard;
    @SerializedName("issueDate")
    @Nullable
    private final String issueDate;
    @SerializedName("lastName")
    @Nullable
    private final String lastName;
    @SerializedName("lastNameEnglish")
    @Nullable
    private final String lastNameEnglish;
    @SerializedName("pictureID")
    @Nullable
    private final String pictureID;
    @SerializedName("profileImage")
    @Nullable
    private final String profileImage;
    @SerializedName(MessageBundle.TITLE_ENTRY)
    @Nullable
    private final String title;
    @SerializedName("titleEnglish")
    @Nullable
    private final String titleEnglish;

    public Attorney() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 131071, null);
    }

    @Nullable
    public final String component1() {
        return this.lastName;
    }

    @Nullable
    public final Boolean component10() {
        return this.isSmartCard;
    }

    @Nullable
    public final String component11() {
        return this.birthDate;
    }

    @Nullable
    public final String component12() {
        return this.expiryDate;
    }

    @Nullable
    public final String component13() {
        return this.firstName;
    }

    @Nullable
    public final String component14() {
        return this.titleEnglish;
    }

    @Nullable
    public final String component15() {
        return this.pictureID;
    }

    @Nullable
    public final String component16() {
        return this.issueDate;
    }

    @Nullable
    public final String component17() {
        return this.lastNameEnglish;
    }

    @Nullable
    public final String component2() {
        return this.idType;
    }

    @Nullable
    public final String component3() {
        return this.gender;
    }

    @Nullable
    public final String component4() {
        return this.address2;
    }

    @Nullable
    public final String component5() {
        return this.address1;
    }

    @Nullable
    public final String component6() {
        return this.profileImage;
    }

    @Nullable
    public final String component7() {
        return this.idNumber;
    }

    @Nullable
    public final String component8() {
        return this.firstNameEnglish;
    }

    @Nullable
    public final String component9() {
        return this.title;
    }

    @NotNull
    public final Attorney copy(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable String str6, @Nullable String str7, @Nullable String str8, @Nullable String str9, @Nullable Boolean bool, @Nullable String str10, @Nullable String str11, @Nullable String str12, @Nullable String str13, @Nullable String str14, @Nullable String str15, @Nullable String str16) {
        return new Attorney(str, str2, str3, str4, str5, str6, str7, str8, str9, bool, str10, str11, str12, str13, str14, str15, str16);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Attorney) {
            Attorney attorney = (Attorney) obj;
            return Intrinsics.areEqual(this.lastName, attorney.lastName) && Intrinsics.areEqual(this.idType, attorney.idType) && Intrinsics.areEqual(this.gender, attorney.gender) && Intrinsics.areEqual(this.address2, attorney.address2) && Intrinsics.areEqual(this.address1, attorney.address1) && Intrinsics.areEqual(this.profileImage, attorney.profileImage) && Intrinsics.areEqual(this.idNumber, attorney.idNumber) && Intrinsics.areEqual(this.firstNameEnglish, attorney.firstNameEnglish) && Intrinsics.areEqual(this.title, attorney.title) && Intrinsics.areEqual(this.isSmartCard, attorney.isSmartCard) && Intrinsics.areEqual(this.birthDate, attorney.birthDate) && Intrinsics.areEqual(this.expiryDate, attorney.expiryDate) && Intrinsics.areEqual(this.firstName, attorney.firstName) && Intrinsics.areEqual(this.titleEnglish, attorney.titleEnglish) && Intrinsics.areEqual(this.pictureID, attorney.pictureID) && Intrinsics.areEqual(this.issueDate, attorney.issueDate) && Intrinsics.areEqual(this.lastNameEnglish, attorney.lastNameEnglish);
        }
        return false;
    }

    @Nullable
    public final String getAddress1() {
        return this.address1;
    }

    @Nullable
    public final String getAddress2() {
        return this.address2;
    }

    @Nullable
    public final String getBirthDate() {
        return this.birthDate;
    }

    @Nullable
    public final String getExpiryDate() {
        return this.expiryDate;
    }

    @Nullable
    public final String getFirstName() {
        return this.firstName;
    }

    @Nullable
    public final String getFirstNameEnglish() {
        return this.firstNameEnglish;
    }

    @Nullable
    public final String getGender() {
        return this.gender;
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
    public final String getIssueDate() {
        return this.issueDate;
    }

    @Nullable
    public final String getLastName() {
        return this.lastName;
    }

    @Nullable
    public final String getLastNameEnglish() {
        return this.lastNameEnglish;
    }

    @Nullable
    public final String getPictureID() {
        return this.pictureID;
    }

    @Nullable
    public final String getProfileImage() {
        return this.profileImage;
    }

    @Nullable
    public final String getTitle() {
        return this.title;
    }

    @Nullable
    public final String getTitleEnglish() {
        return this.titleEnglish;
    }

    public int hashCode() {
        String str = this.lastName;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.idType;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.gender;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.address2;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.address1;
        int hashCode5 = (hashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.profileImage;
        int hashCode6 = (hashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.idNumber;
        int hashCode7 = (hashCode6 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.firstNameEnglish;
        int hashCode8 = (hashCode7 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.title;
        int hashCode9 = (hashCode8 + (str9 == null ? 0 : str9.hashCode())) * 31;
        Boolean bool = this.isSmartCard;
        int hashCode10 = (hashCode9 + (bool == null ? 0 : bool.hashCode())) * 31;
        String str10 = this.birthDate;
        int hashCode11 = (hashCode10 + (str10 == null ? 0 : str10.hashCode())) * 31;
        String str11 = this.expiryDate;
        int hashCode12 = (hashCode11 + (str11 == null ? 0 : str11.hashCode())) * 31;
        String str12 = this.firstName;
        int hashCode13 = (hashCode12 + (str12 == null ? 0 : str12.hashCode())) * 31;
        String str13 = this.titleEnglish;
        int hashCode14 = (hashCode13 + (str13 == null ? 0 : str13.hashCode())) * 31;
        String str14 = this.pictureID;
        int hashCode15 = (hashCode14 + (str14 == null ? 0 : str14.hashCode())) * 31;
        String str15 = this.issueDate;
        int hashCode16 = (hashCode15 + (str15 == null ? 0 : str15.hashCode())) * 31;
        String str16 = this.lastNameEnglish;
        return hashCode16 + (str16 != null ? str16.hashCode() : 0);
    }

    @Nullable
    public final Boolean isSmartCard() {
        return this.isSmartCard;
    }

    @NotNull
    public String toString() {
        String str = this.lastName;
        String str2 = this.idType;
        String str3 = this.gender;
        String str4 = this.address2;
        String str5 = this.address1;
        String str6 = this.profileImage;
        String str7 = this.idNumber;
        String str8 = this.firstNameEnglish;
        String str9 = this.title;
        Boolean bool = this.isSmartCard;
        String str10 = this.birthDate;
        String str11 = this.expiryDate;
        String str12 = this.firstName;
        String str13 = this.titleEnglish;
        String str14 = this.pictureID;
        String str15 = this.issueDate;
        String str16 = this.lastNameEnglish;
        return "Attorney(lastName=" + str + ", idType=" + str2 + ", gender=" + str3 + ", address2=" + str4 + ", address1=" + str5 + ", profileImage=" + str6 + ", idNumber=" + str7 + ", firstNameEnglish=" + str8 + ", title=" + str9 + ", isSmartCard=" + bool + ", birthDate=" + str10 + ", expiryDate=" + str11 + ", firstName=" + str12 + ", titleEnglish=" + str13 + ", pictureID=" + str14 + ", issueDate=" + str15 + ", lastNameEnglish=" + str16 + ")";
    }

    public Attorney(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable String str6, @Nullable String str7, @Nullable String str8, @Nullable String str9, @Nullable Boolean bool, @Nullable String str10, @Nullable String str11, @Nullable String str12, @Nullable String str13, @Nullable String str14, @Nullable String str15, @Nullable String str16) {
        this.lastName = str;
        this.idType = str2;
        this.gender = str3;
        this.address2 = str4;
        this.address1 = str5;
        this.profileImage = str6;
        this.idNumber = str7;
        this.firstNameEnglish = str8;
        this.title = str9;
        this.isSmartCard = bool;
        this.birthDate = str10;
        this.expiryDate = str11;
        this.firstName = str12;
        this.titleEnglish = str13;
        this.pictureID = str14;
        this.issueDate = str15;
        this.lastNameEnglish = str16;
    }

    public /* synthetic */ Attorney(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, Boolean bool, String str10, String str11, String str12, String str13, String str14, String str15, String str16, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : str5, (i & 32) != 0 ? null : str6, (i & 64) != 0 ? null : str7, (i & 128) != 0 ? null : str8, (i & 256) != 0 ? null : str9, (i & 512) != 0 ? null : bool, (i & 1024) != 0 ? null : str10, (i & 2048) != 0 ? null : str11, (i & 4096) != 0 ? null : str12, (i & 8192) != 0 ? null : str13, (i & 16384) != 0 ? null : str14, (i & 32768) != 0 ? null : str15, (i & 65536) != 0 ? null : str16);
    }
}