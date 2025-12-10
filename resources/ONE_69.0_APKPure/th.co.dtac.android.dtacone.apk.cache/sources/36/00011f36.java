package th.p047co.dtac.android.dtacone.model.mrtr_postpaid.registration;

import androidx.compose.runtime.internal.StabilityInferred;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 0)
@Metadata(m29143d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b \n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BI\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\nJ\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010 \u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010!\u001a\u0004\u0018\u00010\u0003HÆ\u0003JU\u0010\"\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010#\u001a\u00020$2\b\u0010%\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010&\u001a\u00020'HÖ\u0001J\t\u0010(\u001a\u00020\u0003HÖ\u0001R \u0010\u0007\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001e\u0010\u0002\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\f\"\u0004\b\u0010\u0010\u000eR\u001e\u0010\u0005\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\f\"\u0004\b\u0012\u0010\u000eR\u001e\u0010\u0004\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\f\"\u0004\b\u0014\u0010\u000eR \u0010\b\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\f\"\u0004\b\u0016\u0010\u000eR \u0010\t\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\f\"\u0004\b\u0018\u0010\u000eR\u001e\u0010\u0006\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\f\"\u0004\b\u001a\u0010\u000e¨\u0006)"}, m29142d2 = {"Lth/co/dtac/android/dtacone/model/mrtr_postpaid/registration/Package;", "", "code", "", "name", "description", "switchOnReasonCode", "campaignID", "offerPOID", "requesterLocation", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getCampaignID", "()Ljava/lang/String;", "setCampaignID", "(Ljava/lang/String;)V", "getCode", "setCode", "getDescription", "setDescription", "getName", "setName", "getOfferPOID", "setOfferPOID", "getRequesterLocation", "setRequesterLocation", "getSwitchOnReasonCode", "setSwitchOnReasonCode", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "", "other", "hashCode", "", "toString", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.model.mrtr_postpaid.registration.Package */
/* loaded from: classes8.dex */
public final class Package {
    public static final int $stable = 8;
    @SerializedName("campaignID")
    @Nullable
    private String campaignID;
    @SerializedName("code")
    @NotNull
    private String code;
    @SerializedName("description")
    @NotNull
    private String description;
    @SerializedName("name")
    @NotNull
    private String name;
    @SerializedName("offerPOID")
    @Nullable
    private String offerPOID;
    @SerializedName("requesterLocation")
    @Nullable
    private String requesterLocation;
    @SerializedName("switchOnReasonCode")
    @NotNull
    private String switchOnReasonCode;

    public Package(@NotNull String code, @NotNull String name, @NotNull String description, @NotNull String switchOnReasonCode, @Nullable String str, @Nullable String str2, @Nullable String str3) {
        Intrinsics.checkNotNullParameter(code, "code");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(switchOnReasonCode, "switchOnReasonCode");
        this.code = code;
        this.name = name;
        this.description = description;
        this.switchOnReasonCode = switchOnReasonCode;
        this.campaignID = str;
        this.offerPOID = str2;
        this.requesterLocation = str3;
    }

    public static /* synthetic */ Package copy$default(Package r5, String str, String str2, String str3, String str4, String str5, String str6, String str7, int i, Object obj) {
        if ((i & 1) != 0) {
            str = r5.code;
        }
        if ((i & 2) != 0) {
            str2 = r5.name;
        }
        String str8 = str2;
        if ((i & 4) != 0) {
            str3 = r5.description;
        }
        String str9 = str3;
        if ((i & 8) != 0) {
            str4 = r5.switchOnReasonCode;
        }
        String str10 = str4;
        if ((i & 16) != 0) {
            str5 = r5.campaignID;
        }
        String str11 = str5;
        if ((i & 32) != 0) {
            str6 = r5.offerPOID;
        }
        String str12 = str6;
        if ((i & 64) != 0) {
            str7 = r5.requesterLocation;
        }
        return r5.copy(str, str8, str9, str10, str11, str12, str7);
    }

    @NotNull
    public final String component1() {
        return this.code;
    }

    @NotNull
    public final String component2() {
        return this.name;
    }

    @NotNull
    public final String component3() {
        return this.description;
    }

    @NotNull
    public final String component4() {
        return this.switchOnReasonCode;
    }

    @Nullable
    public final String component5() {
        return this.campaignID;
    }

    @Nullable
    public final String component6() {
        return this.offerPOID;
    }

    @Nullable
    public final String component7() {
        return this.requesterLocation;
    }

    @NotNull
    public final Package copy(@NotNull String code, @NotNull String name, @NotNull String description, @NotNull String switchOnReasonCode, @Nullable String str, @Nullable String str2, @Nullable String str3) {
        Intrinsics.checkNotNullParameter(code, "code");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(switchOnReasonCode, "switchOnReasonCode");
        return new Package(code, name, description, switchOnReasonCode, str, str2, str3);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Package) {
            Package r5 = (Package) obj;
            return Intrinsics.areEqual(this.code, r5.code) && Intrinsics.areEqual(this.name, r5.name) && Intrinsics.areEqual(this.description, r5.description) && Intrinsics.areEqual(this.switchOnReasonCode, r5.switchOnReasonCode) && Intrinsics.areEqual(this.campaignID, r5.campaignID) && Intrinsics.areEqual(this.offerPOID, r5.offerPOID) && Intrinsics.areEqual(this.requesterLocation, r5.requesterLocation);
        }
        return false;
    }

    @Nullable
    public final String getCampaignID() {
        return this.campaignID;
    }

    @NotNull
    public final String getCode() {
        return this.code;
    }

    @NotNull
    public final String getDescription() {
        return this.description;
    }

    @NotNull
    public final String getName() {
        return this.name;
    }

    @Nullable
    public final String getOfferPOID() {
        return this.offerPOID;
    }

    @Nullable
    public final String getRequesterLocation() {
        return this.requesterLocation;
    }

    @NotNull
    public final String getSwitchOnReasonCode() {
        return this.switchOnReasonCode;
    }

    public int hashCode() {
        int hashCode = ((((((this.code.hashCode() * 31) + this.name.hashCode()) * 31) + this.description.hashCode()) * 31) + this.switchOnReasonCode.hashCode()) * 31;
        String str = this.campaignID;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.offerPOID;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.requesterLocation;
        return hashCode3 + (str3 != null ? str3.hashCode() : 0);
    }

    public final void setCampaignID(@Nullable String str) {
        this.campaignID = str;
    }

    public final void setCode(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.code = str;
    }

    public final void setDescription(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.description = str;
    }

    public final void setName(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.name = str;
    }

    public final void setOfferPOID(@Nullable String str) {
        this.offerPOID = str;
    }

    public final void setRequesterLocation(@Nullable String str) {
        this.requesterLocation = str;
    }

    public final void setSwitchOnReasonCode(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.switchOnReasonCode = str;
    }

    @NotNull
    public String toString() {
        String str = this.code;
        String str2 = this.name;
        String str3 = this.description;
        String str4 = this.switchOnReasonCode;
        String str5 = this.campaignID;
        String str6 = this.offerPOID;
        String str7 = this.requesterLocation;
        return "Package(code=" + str + ", name=" + str2 + ", description=" + str3 + ", switchOnReasonCode=" + str4 + ", campaignID=" + str5 + ", offerPOID=" + str6 + ", requesterLocation=" + str7 + ")";
    }

    public /* synthetic */ Package(String str, String str2, String str3, String str4, String str5, String str6, String str7, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, str4, (i & 16) != 0 ? "" : str5, (i & 32) != 0 ? "" : str6, (i & 64) != 0 ? "" : str7);
    }
}