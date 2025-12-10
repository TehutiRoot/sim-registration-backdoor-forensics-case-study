package th.p047co.dtac.android.dtacone.model.change_pack;

import androidx.compose.runtime.internal.StabilityInferred;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 0)
@Metadata(m28851d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b6\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u008d\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\u0003\u0012\u0006\u0010\u000b\u001a\u00020\u0003\u0012\u0006\u0010\f\u001a\u00020\u0003\u0012\u0006\u0010\r\u001a\u00020\u0003\u0012\u0006\u0010\u000e\u001a\u00020\u0003\u0012\u0006\u0010\u000f\u001a\u00020\u0003\u0012\u0006\u0010\u0010\u001a\u00020\u0003\u0012\u0006\u0010\u0011\u001a\u00020\u0003\u0012\u0006\u0010\u0012\u001a\u00020\u0003\u0012\u0006\u0010\u0013\u001a\u00020\u0003¢\u0006\u0002\u0010\u0014J\t\u0010'\u001a\u00020\u0003HÆ\u0003J\t\u0010(\u001a\u00020\u0003HÆ\u0003J\t\u0010)\u001a\u00020\u0003HÆ\u0003J\t\u0010*\u001a\u00020\u0003HÆ\u0003J\t\u0010+\u001a\u00020\u0003HÆ\u0003J\t\u0010,\u001a\u00020\u0003HÆ\u0003J\t\u0010-\u001a\u00020\u0003HÆ\u0003J\t\u0010.\u001a\u00020\u0003HÆ\u0003J\t\u0010/\u001a\u00020\u0003HÆ\u0003J\t\u00100\u001a\u00020\u0003HÆ\u0003J\t\u00101\u001a\u00020\u0003HÆ\u0003J\t\u00102\u001a\u00020\u0003HÆ\u0003J\t\u00103\u001a\u00020\u0003HÆ\u0003J\t\u00104\u001a\u00020\u0003HÆ\u0003J\t\u00105\u001a\u00020\u0003HÆ\u0003J\t\u00106\u001a\u00020\u0003HÆ\u0003J\t\u00107\u001a\u00020\u0003HÆ\u0003J³\u0001\u00108\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\u00032\b\b\u0002\u0010\f\u001a\u00020\u00032\b\b\u0002\u0010\r\u001a\u00020\u00032\b\b\u0002\u0010\u000e\u001a\u00020\u00032\b\b\u0002\u0010\u000f\u001a\u00020\u00032\b\b\u0002\u0010\u0010\u001a\u00020\u00032\b\b\u0002\u0010\u0011\u001a\u00020\u00032\b\b\u0002\u0010\u0012\u001a\u00020\u00032\b\b\u0002\u0010\u0013\u001a\u00020\u0003HÆ\u0001J\u0013\u00109\u001a\u00020:2\b\u0010;\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010<\u001a\u00020=HÖ\u0001J\t\u0010>\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0016R\u0016\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0016R\u0016\u0010\u0006\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0016R\u0016\u0010\u0007\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0016R\u0016\u0010\b\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0016R\u0016\u0010\t\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0016R\u0016\u0010\n\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0016R\u0016\u0010\u000b\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0016R\u0016\u0010\f\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0016R\u0016\u0010\r\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u0016R\u0016\u0010\u000e\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u0016R\u0016\u0010\u000f\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u0016R\u0016\u0010\u0010\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b#\u0010\u0016R\u0016\u0010\u0011\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b$\u0010\u0016R\u0016\u0010\u0012\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b%\u0010\u0016R\u0016\u0010\u0013\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b&\u0010\u0016¨\u0006?"}, m28850d2 = {"Lth/co/dtac/android/dtacone/model/change_pack/MainPackage;", "", "code", "", "createBy", "createDateTime", "description", "endDateTime", "expireFlag", "externalRecurring", "lastChangeBy", "lastChangeDateTime", "offerID", "provisioningStartDateTime", "sequenceReference", "specificExpireFlag", "spkdSequence", "startDateTime", "thaiDescription", "type", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getCode", "()Ljava/lang/String;", "getCreateBy", "getCreateDateTime", "getDescription", "getEndDateTime", "getExpireFlag", "getExternalRecurring", "getLastChangeBy", "getLastChangeDateTime", "getOfferID", "getProvisioningStartDateTime", "getSequenceReference", "getSpecificExpireFlag", "getSpkdSequence", "getStartDateTime", "getThaiDescription", "getType", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "", "other", "hashCode", "", "toString", "app_prodRelease"}, m28849k = 1, m28848mv = {1, 8, 0}, m28846xi = 48)
/* renamed from: th.co.dtac.android.dtacone.model.change_pack.MainPackage */
/* loaded from: classes8.dex */
public final class MainPackage {
    public static final int $stable = 0;
    @SerializedName("code")
    @NotNull
    private final String code;
    @SerializedName("createBy")
    @NotNull
    private final String createBy;
    @SerializedName("createDateTime")
    @NotNull
    private final String createDateTime;
    @SerializedName("description")
    @NotNull
    private final String description;
    @SerializedName("endDateTime")
    @NotNull
    private final String endDateTime;
    @SerializedName("expireFlag")
    @NotNull
    private final String expireFlag;
    @SerializedName("externalRecurring")
    @NotNull
    private final String externalRecurring;
    @SerializedName("lastChangeBy")
    @NotNull
    private final String lastChangeBy;
    @SerializedName("lastChangeDateTime")
    @NotNull
    private final String lastChangeDateTime;
    @SerializedName("offerID")
    @NotNull
    private final String offerID;
    @SerializedName("provisioningStartDateTime")
    @NotNull
    private final String provisioningStartDateTime;
    @SerializedName("sequenceReference")
    @NotNull
    private final String sequenceReference;
    @SerializedName("specificExpireFlag")
    @NotNull
    private final String specificExpireFlag;
    @SerializedName("spkdSequence")
    @NotNull
    private final String spkdSequence;
    @SerializedName("startDateTime")
    @NotNull
    private final String startDateTime;
    @SerializedName("thaiDescription")
    @NotNull
    private final String thaiDescription;
    @SerializedName("type")
    @NotNull
    private final String type;

    public MainPackage(@NotNull String code, @NotNull String createBy, @NotNull String createDateTime, @NotNull String description, @NotNull String endDateTime, @NotNull String expireFlag, @NotNull String externalRecurring, @NotNull String lastChangeBy, @NotNull String lastChangeDateTime, @NotNull String offerID, @NotNull String provisioningStartDateTime, @NotNull String sequenceReference, @NotNull String specificExpireFlag, @NotNull String spkdSequence, @NotNull String startDateTime, @NotNull String thaiDescription, @NotNull String type) {
        Intrinsics.checkNotNullParameter(code, "code");
        Intrinsics.checkNotNullParameter(createBy, "createBy");
        Intrinsics.checkNotNullParameter(createDateTime, "createDateTime");
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(endDateTime, "endDateTime");
        Intrinsics.checkNotNullParameter(expireFlag, "expireFlag");
        Intrinsics.checkNotNullParameter(externalRecurring, "externalRecurring");
        Intrinsics.checkNotNullParameter(lastChangeBy, "lastChangeBy");
        Intrinsics.checkNotNullParameter(lastChangeDateTime, "lastChangeDateTime");
        Intrinsics.checkNotNullParameter(offerID, "offerID");
        Intrinsics.checkNotNullParameter(provisioningStartDateTime, "provisioningStartDateTime");
        Intrinsics.checkNotNullParameter(sequenceReference, "sequenceReference");
        Intrinsics.checkNotNullParameter(specificExpireFlag, "specificExpireFlag");
        Intrinsics.checkNotNullParameter(spkdSequence, "spkdSequence");
        Intrinsics.checkNotNullParameter(startDateTime, "startDateTime");
        Intrinsics.checkNotNullParameter(thaiDescription, "thaiDescription");
        Intrinsics.checkNotNullParameter(type, "type");
        this.code = code;
        this.createBy = createBy;
        this.createDateTime = createDateTime;
        this.description = description;
        this.endDateTime = endDateTime;
        this.expireFlag = expireFlag;
        this.externalRecurring = externalRecurring;
        this.lastChangeBy = lastChangeBy;
        this.lastChangeDateTime = lastChangeDateTime;
        this.offerID = offerID;
        this.provisioningStartDateTime = provisioningStartDateTime;
        this.sequenceReference = sequenceReference;
        this.specificExpireFlag = specificExpireFlag;
        this.spkdSequence = spkdSequence;
        this.startDateTime = startDateTime;
        this.thaiDescription = thaiDescription;
        this.type = type;
    }

    @NotNull
    public final String component1() {
        return this.code;
    }

    @NotNull
    public final String component10() {
        return this.offerID;
    }

    @NotNull
    public final String component11() {
        return this.provisioningStartDateTime;
    }

    @NotNull
    public final String component12() {
        return this.sequenceReference;
    }

    @NotNull
    public final String component13() {
        return this.specificExpireFlag;
    }

    @NotNull
    public final String component14() {
        return this.spkdSequence;
    }

    @NotNull
    public final String component15() {
        return this.startDateTime;
    }

    @NotNull
    public final String component16() {
        return this.thaiDescription;
    }

    @NotNull
    public final String component17() {
        return this.type;
    }

    @NotNull
    public final String component2() {
        return this.createBy;
    }

    @NotNull
    public final String component3() {
        return this.createDateTime;
    }

    @NotNull
    public final String component4() {
        return this.description;
    }

    @NotNull
    public final String component5() {
        return this.endDateTime;
    }

    @NotNull
    public final String component6() {
        return this.expireFlag;
    }

    @NotNull
    public final String component7() {
        return this.externalRecurring;
    }

    @NotNull
    public final String component8() {
        return this.lastChangeBy;
    }

    @NotNull
    public final String component9() {
        return this.lastChangeDateTime;
    }

    @NotNull
    public final MainPackage copy(@NotNull String code, @NotNull String createBy, @NotNull String createDateTime, @NotNull String description, @NotNull String endDateTime, @NotNull String expireFlag, @NotNull String externalRecurring, @NotNull String lastChangeBy, @NotNull String lastChangeDateTime, @NotNull String offerID, @NotNull String provisioningStartDateTime, @NotNull String sequenceReference, @NotNull String specificExpireFlag, @NotNull String spkdSequence, @NotNull String startDateTime, @NotNull String thaiDescription, @NotNull String type) {
        Intrinsics.checkNotNullParameter(code, "code");
        Intrinsics.checkNotNullParameter(createBy, "createBy");
        Intrinsics.checkNotNullParameter(createDateTime, "createDateTime");
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(endDateTime, "endDateTime");
        Intrinsics.checkNotNullParameter(expireFlag, "expireFlag");
        Intrinsics.checkNotNullParameter(externalRecurring, "externalRecurring");
        Intrinsics.checkNotNullParameter(lastChangeBy, "lastChangeBy");
        Intrinsics.checkNotNullParameter(lastChangeDateTime, "lastChangeDateTime");
        Intrinsics.checkNotNullParameter(offerID, "offerID");
        Intrinsics.checkNotNullParameter(provisioningStartDateTime, "provisioningStartDateTime");
        Intrinsics.checkNotNullParameter(sequenceReference, "sequenceReference");
        Intrinsics.checkNotNullParameter(specificExpireFlag, "specificExpireFlag");
        Intrinsics.checkNotNullParameter(spkdSequence, "spkdSequence");
        Intrinsics.checkNotNullParameter(startDateTime, "startDateTime");
        Intrinsics.checkNotNullParameter(thaiDescription, "thaiDescription");
        Intrinsics.checkNotNullParameter(type, "type");
        return new MainPackage(code, createBy, createDateTime, description, endDateTime, expireFlag, externalRecurring, lastChangeBy, lastChangeDateTime, offerID, provisioningStartDateTime, sequenceReference, specificExpireFlag, spkdSequence, startDateTime, thaiDescription, type);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof MainPackage) {
            MainPackage mainPackage = (MainPackage) obj;
            return Intrinsics.areEqual(this.code, mainPackage.code) && Intrinsics.areEqual(this.createBy, mainPackage.createBy) && Intrinsics.areEqual(this.createDateTime, mainPackage.createDateTime) && Intrinsics.areEqual(this.description, mainPackage.description) && Intrinsics.areEqual(this.endDateTime, mainPackage.endDateTime) && Intrinsics.areEqual(this.expireFlag, mainPackage.expireFlag) && Intrinsics.areEqual(this.externalRecurring, mainPackage.externalRecurring) && Intrinsics.areEqual(this.lastChangeBy, mainPackage.lastChangeBy) && Intrinsics.areEqual(this.lastChangeDateTime, mainPackage.lastChangeDateTime) && Intrinsics.areEqual(this.offerID, mainPackage.offerID) && Intrinsics.areEqual(this.provisioningStartDateTime, mainPackage.provisioningStartDateTime) && Intrinsics.areEqual(this.sequenceReference, mainPackage.sequenceReference) && Intrinsics.areEqual(this.specificExpireFlag, mainPackage.specificExpireFlag) && Intrinsics.areEqual(this.spkdSequence, mainPackage.spkdSequence) && Intrinsics.areEqual(this.startDateTime, mainPackage.startDateTime) && Intrinsics.areEqual(this.thaiDescription, mainPackage.thaiDescription) && Intrinsics.areEqual(this.type, mainPackage.type);
        }
        return false;
    }

    @NotNull
    public final String getCode() {
        return this.code;
    }

    @NotNull
    public final String getCreateBy() {
        return this.createBy;
    }

    @NotNull
    public final String getCreateDateTime() {
        return this.createDateTime;
    }

    @NotNull
    public final String getDescription() {
        return this.description;
    }

    @NotNull
    public final String getEndDateTime() {
        return this.endDateTime;
    }

    @NotNull
    public final String getExpireFlag() {
        return this.expireFlag;
    }

    @NotNull
    public final String getExternalRecurring() {
        return this.externalRecurring;
    }

    @NotNull
    public final String getLastChangeBy() {
        return this.lastChangeBy;
    }

    @NotNull
    public final String getLastChangeDateTime() {
        return this.lastChangeDateTime;
    }

    @NotNull
    public final String getOfferID() {
        return this.offerID;
    }

    @NotNull
    public final String getProvisioningStartDateTime() {
        return this.provisioningStartDateTime;
    }

    @NotNull
    public final String getSequenceReference() {
        return this.sequenceReference;
    }

    @NotNull
    public final String getSpecificExpireFlag() {
        return this.specificExpireFlag;
    }

    @NotNull
    public final String getSpkdSequence() {
        return this.spkdSequence;
    }

    @NotNull
    public final String getStartDateTime() {
        return this.startDateTime;
    }

    @NotNull
    public final String getThaiDescription() {
        return this.thaiDescription;
    }

    @NotNull
    public final String getType() {
        return this.type;
    }

    public int hashCode() {
        return (((((((((((((((((((((((((((((((this.code.hashCode() * 31) + this.createBy.hashCode()) * 31) + this.createDateTime.hashCode()) * 31) + this.description.hashCode()) * 31) + this.endDateTime.hashCode()) * 31) + this.expireFlag.hashCode()) * 31) + this.externalRecurring.hashCode()) * 31) + this.lastChangeBy.hashCode()) * 31) + this.lastChangeDateTime.hashCode()) * 31) + this.offerID.hashCode()) * 31) + this.provisioningStartDateTime.hashCode()) * 31) + this.sequenceReference.hashCode()) * 31) + this.specificExpireFlag.hashCode()) * 31) + this.spkdSequence.hashCode()) * 31) + this.startDateTime.hashCode()) * 31) + this.thaiDescription.hashCode()) * 31) + this.type.hashCode();
    }

    @NotNull
    public String toString() {
        String str = this.code;
        String str2 = this.createBy;
        String str3 = this.createDateTime;
        String str4 = this.description;
        String str5 = this.endDateTime;
        String str6 = this.expireFlag;
        String str7 = this.externalRecurring;
        String str8 = this.lastChangeBy;
        String str9 = this.lastChangeDateTime;
        String str10 = this.offerID;
        String str11 = this.provisioningStartDateTime;
        String str12 = this.sequenceReference;
        String str13 = this.specificExpireFlag;
        String str14 = this.spkdSequence;
        String str15 = this.startDateTime;
        String str16 = this.thaiDescription;
        String str17 = this.type;
        return "MainPackage(code=" + str + ", createBy=" + str2 + ", createDateTime=" + str3 + ", description=" + str4 + ", endDateTime=" + str5 + ", expireFlag=" + str6 + ", externalRecurring=" + str7 + ", lastChangeBy=" + str8 + ", lastChangeDateTime=" + str9 + ", offerID=" + str10 + ", provisioningStartDateTime=" + str11 + ", sequenceReference=" + str12 + ", specificExpireFlag=" + str13 + ", spkdSequence=" + str14 + ", startDateTime=" + str15 + ", thaiDescription=" + str16 + ", type=" + str17 + ")";
    }
}
