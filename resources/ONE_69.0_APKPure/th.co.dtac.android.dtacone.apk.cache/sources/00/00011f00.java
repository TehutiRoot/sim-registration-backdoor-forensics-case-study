package th.p047co.dtac.android.dtacone.model.mrtr_online_registration.submit;

import androidx.autofill.HintConstants;
import androidx.compose.runtime.internal.StabilityInferred;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 0)
@Metadata(m29143d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0018\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BA\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\bJ\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0003HÆ\u0003JE\u0010\u001a\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001e\u001a\u00020\u001fHÖ\u0001J\t\u0010 \u001a\u00020\u0003HÖ\u0001R \u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR \u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\n\"\u0004\b\u000e\u0010\fR \u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\n\"\u0004\b\u0010\u0010\fR \u0010\u0007\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\n\"\u0004\b\u0012\u0010\fR \u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\n\"\u0004\b\u0014\u0010\f¨\u0006!"}, m29142d2 = {"Lth/co/dtac/android/dtacone/model/mrtr_online_registration/submit/PartnerContact;", "", "mobileSms", "", HintConstants.AUTOFILL_HINT_EMAIL_ADDRESS, "contactPersonName", "contactType", "mobileNo", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getContactPersonName", "()Ljava/lang/String;", "setContactPersonName", "(Ljava/lang/String;)V", "getContactType", "setContactType", "getEmailAddress", "setEmailAddress", "getMobileNo", "setMobileNo", "getMobileSms", "setMobileSms", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.model.mrtr_online_registration.submit.PartnerContact */
/* loaded from: classes8.dex */
public final class PartnerContact {
    public static final int $stable = 8;
    @SerializedName("contactPersonName")
    @Nullable
    private String contactPersonName;
    @SerializedName("contactType")
    @Nullable
    private String contactType;
    @SerializedName(HintConstants.AUTOFILL_HINT_EMAIL_ADDRESS)
    @Nullable
    private String emailAddress;
    @SerializedName("mobileNo")
    @Nullable
    private String mobileNo;
    @SerializedName("mobileSms")
    @Nullable
    private String mobileSms;

    public PartnerContact() {
        this(null, null, null, null, null, 31, null);
    }

    public static /* synthetic */ PartnerContact copy$default(PartnerContact partnerContact, String str, String str2, String str3, String str4, String str5, int i, Object obj) {
        if ((i & 1) != 0) {
            str = partnerContact.mobileSms;
        }
        if ((i & 2) != 0) {
            str2 = partnerContact.emailAddress;
        }
        String str6 = str2;
        if ((i & 4) != 0) {
            str3 = partnerContact.contactPersonName;
        }
        String str7 = str3;
        if ((i & 8) != 0) {
            str4 = partnerContact.contactType;
        }
        String str8 = str4;
        if ((i & 16) != 0) {
            str5 = partnerContact.mobileNo;
        }
        return partnerContact.copy(str, str6, str7, str8, str5);
    }

    @Nullable
    public final String component1() {
        return this.mobileSms;
    }

    @Nullable
    public final String component2() {
        return this.emailAddress;
    }

    @Nullable
    public final String component3() {
        return this.contactPersonName;
    }

    @Nullable
    public final String component4() {
        return this.contactType;
    }

    @Nullable
    public final String component5() {
        return this.mobileNo;
    }

    @NotNull
    public final PartnerContact copy(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5) {
        return new PartnerContact(str, str2, str3, str4, str5);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof PartnerContact) {
            PartnerContact partnerContact = (PartnerContact) obj;
            return Intrinsics.areEqual(this.mobileSms, partnerContact.mobileSms) && Intrinsics.areEqual(this.emailAddress, partnerContact.emailAddress) && Intrinsics.areEqual(this.contactPersonName, partnerContact.contactPersonName) && Intrinsics.areEqual(this.contactType, partnerContact.contactType) && Intrinsics.areEqual(this.mobileNo, partnerContact.mobileNo);
        }
        return false;
    }

    @Nullable
    public final String getContactPersonName() {
        return this.contactPersonName;
    }

    @Nullable
    public final String getContactType() {
        return this.contactType;
    }

    @Nullable
    public final String getEmailAddress() {
        return this.emailAddress;
    }

    @Nullable
    public final String getMobileNo() {
        return this.mobileNo;
    }

    @Nullable
    public final String getMobileSms() {
        return this.mobileSms;
    }

    public int hashCode() {
        String str = this.mobileSms;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.emailAddress;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.contactPersonName;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.contactType;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.mobileNo;
        return hashCode4 + (str5 != null ? str5.hashCode() : 0);
    }

    public final void setContactPersonName(@Nullable String str) {
        this.contactPersonName = str;
    }

    public final void setContactType(@Nullable String str) {
        this.contactType = str;
    }

    public final void setEmailAddress(@Nullable String str) {
        this.emailAddress = str;
    }

    public final void setMobileNo(@Nullable String str) {
        this.mobileNo = str;
    }

    public final void setMobileSms(@Nullable String str) {
        this.mobileSms = str;
    }

    @NotNull
    public String toString() {
        String str = this.mobileSms;
        String str2 = this.emailAddress;
        String str3 = this.contactPersonName;
        String str4 = this.contactType;
        String str5 = this.mobileNo;
        return "PartnerContact(mobileSms=" + str + ", emailAddress=" + str2 + ", contactPersonName=" + str3 + ", contactType=" + str4 + ", mobileNo=" + str5 + ")";
    }

    public PartnerContact(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5) {
        this.mobileSms = str;
        this.emailAddress = str2;
        this.contactPersonName = str3;
        this.contactType = str4;
        this.mobileNo = str5;
    }

    public /* synthetic */ PartnerContact(String str, String str2, String str3, String str4, String str5, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : str5);
    }
}