package th.p047co.dtac.android.dtacone.model.appOne.onlineRegister.request;

import androidx.autofill.HintConstants;
import androidx.compose.runtime.internal.StabilityInferred;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import th.p047co.dtac.android.dtacone.view.appOne.nadOutbound.fragment.OneNadOutboundSearchFragment;

@StabilityInferred(parameters = 0)
@Metadata(m29143d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b8\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B¡\u0001\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0010J\u000b\u0010-\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010.\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010/\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00100\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00101\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00102\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00103\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00104\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00105\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00106\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00107\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00108\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00109\u001a\u0004\u0018\u00010\u0003HÆ\u0003J¥\u0001\u0010:\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010;\u001a\u00020<2\b\u0010=\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010>\u001a\u00020?HÖ\u0001J\t\u0010@\u001a\u00020\u0003HÖ\u0001R \u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R \u0010\r\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0012\"\u0004\b\u0016\u0010\u0014R \u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0012\"\u0004\b\u0018\u0010\u0014R \u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u0012\"\u0004\b\u001a\u0010\u0014R \u0010\t\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u0012\"\u0004\b\u001c\u0010\u0014R \u0010\b\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u0012\"\u0004\b\u001e\u0010\u0014R \u0010\f\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010\u0012\"\u0004\b \u0010\u0014R \u0010\u0007\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\u0012\"\u0004\b\"\u0010\u0014R \u0010\u000e\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b#\u0010\u0012\"\u0004\b$\u0010\u0014R \u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b%\u0010\u0012\"\u0004\b&\u0010\u0014R \u0010\n\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b'\u0010\u0012\"\u0004\b(\u0010\u0014R \u0010\u000b\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b)\u0010\u0012\"\u0004\b*\u0010\u0014R \u0010\u000f\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b+\u0010\u0012\"\u0004\b,\u0010\u0014¨\u0006A"}, m29142d2 = {"Lth/co/dtac/android/dtacone/model/appOne/onlineRegister/request/PartnerOwner;", "", "bankCode", "", "ownerLastName", "accountName", "bankBranch", "msisdnNo", "dateOfBirth", "bankName", "ownerPersonalId", "ownerTitle", HintConstants.AUTOFILL_HINT_EMAIL_ADDRESS, "accountNo", "ownerFirstName", "thaiPersonalIdFlag", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getAccountName", "()Ljava/lang/String;", "setAccountName", "(Ljava/lang/String;)V", "getAccountNo", "setAccountNo", "getBankBranch", "setBankBranch", "getBankCode", "setBankCode", "getBankName", "setBankName", "getDateOfBirth", "setDateOfBirth", "getEmailAddress", "setEmailAddress", "getMsisdnNo", "setMsisdnNo", "getOwnerFirstName", "setOwnerFirstName", "getOwnerLastName", "setOwnerLastName", "getOwnerPersonalId", "setOwnerPersonalId", "getOwnerTitle", "setOwnerTitle", "getThaiPersonalIdFlag", "setThaiPersonalIdFlag", "component1", "component10", "component11", "component12", "component13", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "", "other", "hashCode", "", "toString", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.model.appOne.onlineRegister.request.PartnerOwner */
/* loaded from: classes8.dex */
public final class PartnerOwner {
    public static final int $stable = 8;
    @SerializedName("accountName")
    @Nullable
    private String accountName;
    @SerializedName("accountNo")
    @Nullable
    private String accountNo;
    @SerializedName("bankBranch")
    @Nullable
    private String bankBranch;
    @SerializedName("bankCode")
    @Nullable
    private String bankCode;
    @SerializedName("bankName")
    @Nullable
    private String bankName;
    @SerializedName("dateOfBirth")
    @Nullable
    private String dateOfBirth;
    @SerializedName(HintConstants.AUTOFILL_HINT_EMAIL_ADDRESS)
    @Nullable
    private String emailAddress;
    @SerializedName("msisdnNo")
    @Nullable
    private String msisdnNo;
    @SerializedName("ownerFirstName")
    @Nullable
    private String ownerFirstName;
    @SerializedName("ownerLastName")
    @Nullable
    private String ownerLastName;
    @SerializedName("ownerPersonalId")
    @Nullable
    private String ownerPersonalId;
    @SerializedName("ownerTitle")
    @Nullable
    private String ownerTitle;
    @SerializedName("thaiPersonalIdFlag")
    @Nullable
    private String thaiPersonalIdFlag;

    public PartnerOwner() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, 8191, null);
    }

    @Nullable
    public final String component1() {
        return this.bankCode;
    }

    @Nullable
    public final String component10() {
        return this.emailAddress;
    }

    @Nullable
    public final String component11() {
        return this.accountNo;
    }

    @Nullable
    public final String component12() {
        return this.ownerFirstName;
    }

    @Nullable
    public final String component13() {
        return this.thaiPersonalIdFlag;
    }

    @Nullable
    public final String component2() {
        return this.ownerLastName;
    }

    @Nullable
    public final String component3() {
        return this.accountName;
    }

    @Nullable
    public final String component4() {
        return this.bankBranch;
    }

    @Nullable
    public final String component5() {
        return this.msisdnNo;
    }

    @Nullable
    public final String component6() {
        return this.dateOfBirth;
    }

    @Nullable
    public final String component7() {
        return this.bankName;
    }

    @Nullable
    public final String component8() {
        return this.ownerPersonalId;
    }

    @Nullable
    public final String component9() {
        return this.ownerTitle;
    }

    @NotNull
    public final PartnerOwner copy(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable String str6, @Nullable String str7, @Nullable String str8, @Nullable String str9, @Nullable String str10, @Nullable String str11, @Nullable String str12, @Nullable String str13) {
        return new PartnerOwner(str, str2, str3, str4, str5, str6, str7, str8, str9, str10, str11, str12, str13);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof PartnerOwner) {
            PartnerOwner partnerOwner = (PartnerOwner) obj;
            return Intrinsics.areEqual(this.bankCode, partnerOwner.bankCode) && Intrinsics.areEqual(this.ownerLastName, partnerOwner.ownerLastName) && Intrinsics.areEqual(this.accountName, partnerOwner.accountName) && Intrinsics.areEqual(this.bankBranch, partnerOwner.bankBranch) && Intrinsics.areEqual(this.msisdnNo, partnerOwner.msisdnNo) && Intrinsics.areEqual(this.dateOfBirth, partnerOwner.dateOfBirth) && Intrinsics.areEqual(this.bankName, partnerOwner.bankName) && Intrinsics.areEqual(this.ownerPersonalId, partnerOwner.ownerPersonalId) && Intrinsics.areEqual(this.ownerTitle, partnerOwner.ownerTitle) && Intrinsics.areEqual(this.emailAddress, partnerOwner.emailAddress) && Intrinsics.areEqual(this.accountNo, partnerOwner.accountNo) && Intrinsics.areEqual(this.ownerFirstName, partnerOwner.ownerFirstName) && Intrinsics.areEqual(this.thaiPersonalIdFlag, partnerOwner.thaiPersonalIdFlag);
        }
        return false;
    }

    @Nullable
    public final String getAccountName() {
        return this.accountName;
    }

    @Nullable
    public final String getAccountNo() {
        return this.accountNo;
    }

    @Nullable
    public final String getBankBranch() {
        return this.bankBranch;
    }

    @Nullable
    public final String getBankCode() {
        return this.bankCode;
    }

    @Nullable
    public final String getBankName() {
        return this.bankName;
    }

    @Nullable
    public final String getDateOfBirth() {
        return this.dateOfBirth;
    }

    @Nullable
    public final String getEmailAddress() {
        return this.emailAddress;
    }

    @Nullable
    public final String getMsisdnNo() {
        return this.msisdnNo;
    }

    @Nullable
    public final String getOwnerFirstName() {
        return this.ownerFirstName;
    }

    @Nullable
    public final String getOwnerLastName() {
        return this.ownerLastName;
    }

    @Nullable
    public final String getOwnerPersonalId() {
        return this.ownerPersonalId;
    }

    @Nullable
    public final String getOwnerTitle() {
        return this.ownerTitle;
    }

    @Nullable
    public final String getThaiPersonalIdFlag() {
        return this.thaiPersonalIdFlag;
    }

    public int hashCode() {
        String str = this.bankCode;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.ownerLastName;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.accountName;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.bankBranch;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.msisdnNo;
        int hashCode5 = (hashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.dateOfBirth;
        int hashCode6 = (hashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.bankName;
        int hashCode7 = (hashCode6 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.ownerPersonalId;
        int hashCode8 = (hashCode7 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.ownerTitle;
        int hashCode9 = (hashCode8 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.emailAddress;
        int hashCode10 = (hashCode9 + (str10 == null ? 0 : str10.hashCode())) * 31;
        String str11 = this.accountNo;
        int hashCode11 = (hashCode10 + (str11 == null ? 0 : str11.hashCode())) * 31;
        String str12 = this.ownerFirstName;
        int hashCode12 = (hashCode11 + (str12 == null ? 0 : str12.hashCode())) * 31;
        String str13 = this.thaiPersonalIdFlag;
        return hashCode12 + (str13 != null ? str13.hashCode() : 0);
    }

    public final void setAccountName(@Nullable String str) {
        this.accountName = str;
    }

    public final void setAccountNo(@Nullable String str) {
        this.accountNo = str;
    }

    public final void setBankBranch(@Nullable String str) {
        this.bankBranch = str;
    }

    public final void setBankCode(@Nullable String str) {
        this.bankCode = str;
    }

    public final void setBankName(@Nullable String str) {
        this.bankName = str;
    }

    public final void setDateOfBirth(@Nullable String str) {
        this.dateOfBirth = str;
    }

    public final void setEmailAddress(@Nullable String str) {
        this.emailAddress = str;
    }

    public final void setMsisdnNo(@Nullable String str) {
        this.msisdnNo = str;
    }

    public final void setOwnerFirstName(@Nullable String str) {
        this.ownerFirstName = str;
    }

    public final void setOwnerLastName(@Nullable String str) {
        this.ownerLastName = str;
    }

    public final void setOwnerPersonalId(@Nullable String str) {
        this.ownerPersonalId = str;
    }

    public final void setOwnerTitle(@Nullable String str) {
        this.ownerTitle = str;
    }

    public final void setThaiPersonalIdFlag(@Nullable String str) {
        this.thaiPersonalIdFlag = str;
    }

    @NotNull
    public String toString() {
        String str = this.bankCode;
        String str2 = this.ownerLastName;
        String str3 = this.accountName;
        String str4 = this.bankBranch;
        String str5 = this.msisdnNo;
        String str6 = this.dateOfBirth;
        String str7 = this.bankName;
        String str8 = this.ownerPersonalId;
        String str9 = this.ownerTitle;
        String str10 = this.emailAddress;
        String str11 = this.accountNo;
        String str12 = this.ownerFirstName;
        String str13 = this.thaiPersonalIdFlag;
        return "PartnerOwner(bankCode=" + str + ", ownerLastName=" + str2 + ", accountName=" + str3 + ", bankBranch=" + str4 + ", msisdnNo=" + str5 + ", dateOfBirth=" + str6 + ", bankName=" + str7 + ", ownerPersonalId=" + str8 + ", ownerTitle=" + str9 + ", emailAddress=" + str10 + ", accountNo=" + str11 + ", ownerFirstName=" + str12 + ", thaiPersonalIdFlag=" + str13 + ")";
    }

    public PartnerOwner(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable String str6, @Nullable String str7, @Nullable String str8, @Nullable String str9, @Nullable String str10, @Nullable String str11, @Nullable String str12, @Nullable String str13) {
        this.bankCode = str;
        this.ownerLastName = str2;
        this.accountName = str3;
        this.bankBranch = str4;
        this.msisdnNo = str5;
        this.dateOfBirth = str6;
        this.bankName = str7;
        this.ownerPersonalId = str8;
        this.ownerTitle = str9;
        this.emailAddress = str10;
        this.accountNo = str11;
        this.ownerFirstName = str12;
        this.thaiPersonalIdFlag = str13;
    }

    public /* synthetic */ PartnerOwner(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : str5, (i & 32) != 0 ? null : str6, (i & 64) != 0 ? null : str7, (i & 128) != 0 ? null : str8, (i & 256) != 0 ? OneNadOutboundSearchFragment.BILL_REMAINING_3_PLUS : str9, (i & 512) != 0 ? null : str10, (i & 1024) != 0 ? null : str11, (i & 2048) != 0 ? null : str12, (i & 4096) == 0 ? str13 : null);
    }
}