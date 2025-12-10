package th.p047co.dtac.android.dtacone.model.esim;

import androidx.compose.runtime.internal.StabilityInferred;
import com.google.gson.annotations.SerializedName;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import th.p047co.dtac.android.dtacone.util.Constant;
import th.p047co.dtac.android.dtacone.view.fragment.mrtr_prepaid_registration.family_sim.InputPostpaidFamilySimSubscriberFragment;

@StabilityInferred(parameters = 0)
@Metadata(m29143d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b;\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001Bï\u0001\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0005\u0012\u0010\b\u0002\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\f\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0019J\u000b\u00100\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00101\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u00102\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u00103\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u00104\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u00105\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u00106\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u00107\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0010\u00108\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0002\u0010!J\u0010\u00109\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0002\u0010!J\u000b\u0010:\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010;\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010<\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0010\u0010=\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0002\u0010!J\u000b\u0010>\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010?\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0011\u0010@\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\fHÆ\u0003J\u000b\u0010A\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010B\u001a\u0004\u0018\u00010\u0005HÆ\u0003Jø\u0001\u0010C\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00052\u0010\b\u0002\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0002\u0010DJ\u0013\u0010E\u001a\u00020\b2\b\u0010F\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010G\u001a\u00020HHÖ\u0001J\t\u0010I\u001a\u00020\u0005HÖ\u0001R\u001e\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0018\u0010\u000e\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0018\u0010\u0010\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001dR\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u001dR\u0018\u0010\r\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u001dR\u001a\u0010\u0016\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\"\u001a\u0004\b\u0016\u0010!R\u001a\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\"\u001a\u0004\b\u0007\u0010!R\u0018\u0010\t\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b#\u0010\u001dR\u0018\u0010\u000f\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b$\u0010\u001dR\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b%\u0010&R\u001a\u0010\u0017\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\"\u001a\u0004\b'\u0010!R\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b(\u0010\u001dR\u0018\u0010\u0012\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b)\u0010\u001dR\u0018\u0010\u0013\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b*\u0010\u001dR\u0018\u0010\u0015\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b+\u0010\u001dR\u0018\u0010\n\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b,\u0010\u001dR\u0018\u0010\u0014\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b-\u0010\u001dR\u0018\u0010\u0011\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b.\u0010\u001dR\u0018\u0010\u0018\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b/\u0010\u001d¨\u0006J"}, m29142d2 = {"Lth/co/dtac/android/dtacone/model/esim/SubmitESimFromPhysicalRequest;", "", Constant.REGISTER_LEVEL_OWNER, "Lth/co/dtac/android/dtacone/model/esim/Owner;", "rtrCode", "", "channel", "isSaveESIMOrder", "", "newSIMCardNumber", "userCode", "attachmentNames", "", "identityPhotoNameOwner", "changeReasonCode", "objectReferenceID", "changeReasonDescription", "userLan", "rtrName", "subChannel", "userFormatType", InputPostpaidFamilySimSubscriberFragment.SUB_NUM, "isOperatedByOwner", "requireFaceRecognition", "userNameLogin", "(Lth/co/dtac/android/dtacone/model/esim/Owner;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;)V", "getAttachmentNames", "()Ljava/util/List;", "getChangeReasonCode", "()Ljava/lang/String;", "getChangeReasonDescription", "getChannel", "getIdentityPhotoNameOwner", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getNewSIMCardNumber", "getObjectReferenceID", "getOwner", "()Lth/co/dtac/android/dtacone/model/esim/Owner;", "getRequireFaceRecognition", "getRtrCode", "getRtrName", "getSubChannel", "getSubscriberNumber", "getUserCode", "getUserFormatType", "getUserLan", "getUserNameLogin", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Lth/co/dtac/android/dtacone/model/esim/Owner;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;)Lth/co/dtac/android/dtacone/model/esim/SubmitESimFromPhysicalRequest;", "equals", "other", "hashCode", "", "toString", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.model.esim.SubmitESimFromPhysicalRequest */
/* loaded from: classes8.dex */
public final class SubmitESimFromPhysicalRequest {
    public static final int $stable = 8;
    @SerializedName("attachmentNames")
    @Nullable
    private final List<String> attachmentNames;
    @SerializedName("changeReasonCode")
    @Nullable
    private final String changeReasonCode;
    @SerializedName("changeReasonDescription")
    @Nullable
    private final String changeReasonDescription;
    @SerializedName("channel")
    @Nullable
    private final String channel;
    @SerializedName("identityPhotoNameOwner")
    @Nullable
    private final String identityPhotoNameOwner;
    @SerializedName("isOperatedByOwner")
    @Nullable
    private final Boolean isOperatedByOwner;
    @SerializedName("isSaveESIMOrder")
    @Nullable
    private final Boolean isSaveESIMOrder;
    @SerializedName("newSIMCardNumber")
    @Nullable
    private final String newSIMCardNumber;
    @SerializedName("objectReferenceID")
    @Nullable
    private final String objectReferenceID;
    @SerializedName(Constant.REGISTER_LEVEL_OWNER)
    @Nullable
    private final Owner owner;
    @SerializedName("requireFaceRecognition")
    @Nullable
    private final Boolean requireFaceRecognition;
    @SerializedName("rtrCode")
    @Nullable
    private final String rtrCode;
    @SerializedName("rtrName")
    @Nullable
    private final String rtrName;
    @SerializedName("subChannel")
    @Nullable
    private final String subChannel;
    @SerializedName(InputPostpaidFamilySimSubscriberFragment.SUB_NUM)
    @Nullable
    private final String subscriberNumber;
    @SerializedName("userCode")
    @Nullable
    private final String userCode;
    @SerializedName("userFormatType")
    @Nullable
    private final String userFormatType;
    @SerializedName("userLan")
    @Nullable
    private final String userLan;
    @SerializedName("userNameLogin")
    @Nullable
    private final String userNameLogin;

    public SubmitESimFromPhysicalRequest() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 524287, null);
    }

    @Nullable
    public final Owner component1() {
        return this.owner;
    }

    @Nullable
    public final String component10() {
        return this.objectReferenceID;
    }

    @Nullable
    public final String component11() {
        return this.changeReasonDescription;
    }

    @Nullable
    public final String component12() {
        return this.userLan;
    }

    @Nullable
    public final String component13() {
        return this.rtrName;
    }

    @Nullable
    public final String component14() {
        return this.subChannel;
    }

    @Nullable
    public final String component15() {
        return this.userFormatType;
    }

    @Nullable
    public final String component16() {
        return this.subscriberNumber;
    }

    @Nullable
    public final Boolean component17() {
        return this.isOperatedByOwner;
    }

    @Nullable
    public final Boolean component18() {
        return this.requireFaceRecognition;
    }

    @Nullable
    public final String component19() {
        return this.userNameLogin;
    }

    @Nullable
    public final String component2() {
        return this.rtrCode;
    }

    @Nullable
    public final String component3() {
        return this.channel;
    }

    @Nullable
    public final Boolean component4() {
        return this.isSaveESIMOrder;
    }

    @Nullable
    public final String component5() {
        return this.newSIMCardNumber;
    }

    @Nullable
    public final String component6() {
        return this.userCode;
    }

    @Nullable
    public final List<String> component7() {
        return this.attachmentNames;
    }

    @Nullable
    public final String component8() {
        return this.identityPhotoNameOwner;
    }

    @Nullable
    public final String component9() {
        return this.changeReasonCode;
    }

    @NotNull
    public final SubmitESimFromPhysicalRequest copy(@Nullable Owner owner, @Nullable String str, @Nullable String str2, @Nullable Boolean bool, @Nullable String str3, @Nullable String str4, @Nullable List<String> list, @Nullable String str5, @Nullable String str6, @Nullable String str7, @Nullable String str8, @Nullable String str9, @Nullable String str10, @Nullable String str11, @Nullable String str12, @Nullable String str13, @Nullable Boolean bool2, @Nullable Boolean bool3, @Nullable String str14) {
        return new SubmitESimFromPhysicalRequest(owner, str, str2, bool, str3, str4, list, str5, str6, str7, str8, str9, str10, str11, str12, str13, bool2, bool3, str14);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof SubmitESimFromPhysicalRequest) {
            SubmitESimFromPhysicalRequest submitESimFromPhysicalRequest = (SubmitESimFromPhysicalRequest) obj;
            return Intrinsics.areEqual(this.owner, submitESimFromPhysicalRequest.owner) && Intrinsics.areEqual(this.rtrCode, submitESimFromPhysicalRequest.rtrCode) && Intrinsics.areEqual(this.channel, submitESimFromPhysicalRequest.channel) && Intrinsics.areEqual(this.isSaveESIMOrder, submitESimFromPhysicalRequest.isSaveESIMOrder) && Intrinsics.areEqual(this.newSIMCardNumber, submitESimFromPhysicalRequest.newSIMCardNumber) && Intrinsics.areEqual(this.userCode, submitESimFromPhysicalRequest.userCode) && Intrinsics.areEqual(this.attachmentNames, submitESimFromPhysicalRequest.attachmentNames) && Intrinsics.areEqual(this.identityPhotoNameOwner, submitESimFromPhysicalRequest.identityPhotoNameOwner) && Intrinsics.areEqual(this.changeReasonCode, submitESimFromPhysicalRequest.changeReasonCode) && Intrinsics.areEqual(this.objectReferenceID, submitESimFromPhysicalRequest.objectReferenceID) && Intrinsics.areEqual(this.changeReasonDescription, submitESimFromPhysicalRequest.changeReasonDescription) && Intrinsics.areEqual(this.userLan, submitESimFromPhysicalRequest.userLan) && Intrinsics.areEqual(this.rtrName, submitESimFromPhysicalRequest.rtrName) && Intrinsics.areEqual(this.subChannel, submitESimFromPhysicalRequest.subChannel) && Intrinsics.areEqual(this.userFormatType, submitESimFromPhysicalRequest.userFormatType) && Intrinsics.areEqual(this.subscriberNumber, submitESimFromPhysicalRequest.subscriberNumber) && Intrinsics.areEqual(this.isOperatedByOwner, submitESimFromPhysicalRequest.isOperatedByOwner) && Intrinsics.areEqual(this.requireFaceRecognition, submitESimFromPhysicalRequest.requireFaceRecognition) && Intrinsics.areEqual(this.userNameLogin, submitESimFromPhysicalRequest.userNameLogin);
        }
        return false;
    }

    @Nullable
    public final List<String> getAttachmentNames() {
        return this.attachmentNames;
    }

    @Nullable
    public final String getChangeReasonCode() {
        return this.changeReasonCode;
    }

    @Nullable
    public final String getChangeReasonDescription() {
        return this.changeReasonDescription;
    }

    @Nullable
    public final String getChannel() {
        return this.channel;
    }

    @Nullable
    public final String getIdentityPhotoNameOwner() {
        return this.identityPhotoNameOwner;
    }

    @Nullable
    public final String getNewSIMCardNumber() {
        return this.newSIMCardNumber;
    }

    @Nullable
    public final String getObjectReferenceID() {
        return this.objectReferenceID;
    }

    @Nullable
    public final Owner getOwner() {
        return this.owner;
    }

    @Nullable
    public final Boolean getRequireFaceRecognition() {
        return this.requireFaceRecognition;
    }

    @Nullable
    public final String getRtrCode() {
        return this.rtrCode;
    }

    @Nullable
    public final String getRtrName() {
        return this.rtrName;
    }

    @Nullable
    public final String getSubChannel() {
        return this.subChannel;
    }

    @Nullable
    public final String getSubscriberNumber() {
        return this.subscriberNumber;
    }

    @Nullable
    public final String getUserCode() {
        return this.userCode;
    }

    @Nullable
    public final String getUserFormatType() {
        return this.userFormatType;
    }

    @Nullable
    public final String getUserLan() {
        return this.userLan;
    }

    @Nullable
    public final String getUserNameLogin() {
        return this.userNameLogin;
    }

    public int hashCode() {
        Owner owner = this.owner;
        int hashCode = (owner == null ? 0 : owner.hashCode()) * 31;
        String str = this.rtrCode;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.channel;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Boolean bool = this.isSaveESIMOrder;
        int hashCode4 = (hashCode3 + (bool == null ? 0 : bool.hashCode())) * 31;
        String str3 = this.newSIMCardNumber;
        int hashCode5 = (hashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.userCode;
        int hashCode6 = (hashCode5 + (str4 == null ? 0 : str4.hashCode())) * 31;
        List<String> list = this.attachmentNames;
        int hashCode7 = (hashCode6 + (list == null ? 0 : list.hashCode())) * 31;
        String str5 = this.identityPhotoNameOwner;
        int hashCode8 = (hashCode7 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.changeReasonCode;
        int hashCode9 = (hashCode8 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.objectReferenceID;
        int hashCode10 = (hashCode9 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.changeReasonDescription;
        int hashCode11 = (hashCode10 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.userLan;
        int hashCode12 = (hashCode11 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.rtrName;
        int hashCode13 = (hashCode12 + (str10 == null ? 0 : str10.hashCode())) * 31;
        String str11 = this.subChannel;
        int hashCode14 = (hashCode13 + (str11 == null ? 0 : str11.hashCode())) * 31;
        String str12 = this.userFormatType;
        int hashCode15 = (hashCode14 + (str12 == null ? 0 : str12.hashCode())) * 31;
        String str13 = this.subscriberNumber;
        int hashCode16 = (hashCode15 + (str13 == null ? 0 : str13.hashCode())) * 31;
        Boolean bool2 = this.isOperatedByOwner;
        int hashCode17 = (hashCode16 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Boolean bool3 = this.requireFaceRecognition;
        int hashCode18 = (hashCode17 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        String str14 = this.userNameLogin;
        return hashCode18 + (str14 != null ? str14.hashCode() : 0);
    }

    @Nullable
    public final Boolean isOperatedByOwner() {
        return this.isOperatedByOwner;
    }

    @Nullable
    public final Boolean isSaveESIMOrder() {
        return this.isSaveESIMOrder;
    }

    @NotNull
    public String toString() {
        Owner owner = this.owner;
        String str = this.rtrCode;
        String str2 = this.channel;
        Boolean bool = this.isSaveESIMOrder;
        String str3 = this.newSIMCardNumber;
        String str4 = this.userCode;
        List<String> list = this.attachmentNames;
        String str5 = this.identityPhotoNameOwner;
        String str6 = this.changeReasonCode;
        String str7 = this.objectReferenceID;
        String str8 = this.changeReasonDescription;
        String str9 = this.userLan;
        String str10 = this.rtrName;
        String str11 = this.subChannel;
        String str12 = this.userFormatType;
        String str13 = this.subscriberNumber;
        Boolean bool2 = this.isOperatedByOwner;
        Boolean bool3 = this.requireFaceRecognition;
        String str14 = this.userNameLogin;
        return "SubmitESimFromPhysicalRequest(owner=" + owner + ", rtrCode=" + str + ", channel=" + str2 + ", isSaveESIMOrder=" + bool + ", newSIMCardNumber=" + str3 + ", userCode=" + str4 + ", attachmentNames=" + list + ", identityPhotoNameOwner=" + str5 + ", changeReasonCode=" + str6 + ", objectReferenceID=" + str7 + ", changeReasonDescription=" + str8 + ", userLan=" + str9 + ", rtrName=" + str10 + ", subChannel=" + str11 + ", userFormatType=" + str12 + ", subscriberNumber=" + str13 + ", isOperatedByOwner=" + bool2 + ", requireFaceRecognition=" + bool3 + ", userNameLogin=" + str14 + ")";
    }

    public SubmitESimFromPhysicalRequest(@Nullable Owner owner, @Nullable String str, @Nullable String str2, @Nullable Boolean bool, @Nullable String str3, @Nullable String str4, @Nullable List<String> list, @Nullable String str5, @Nullable String str6, @Nullable String str7, @Nullable String str8, @Nullable String str9, @Nullable String str10, @Nullable String str11, @Nullable String str12, @Nullable String str13, @Nullable Boolean bool2, @Nullable Boolean bool3, @Nullable String str14) {
        this.owner = owner;
        this.rtrCode = str;
        this.channel = str2;
        this.isSaveESIMOrder = bool;
        this.newSIMCardNumber = str3;
        this.userCode = str4;
        this.attachmentNames = list;
        this.identityPhotoNameOwner = str5;
        this.changeReasonCode = str6;
        this.objectReferenceID = str7;
        this.changeReasonDescription = str8;
        this.userLan = str9;
        this.rtrName = str10;
        this.subChannel = str11;
        this.userFormatType = str12;
        this.subscriberNumber = str13;
        this.isOperatedByOwner = bool2;
        this.requireFaceRecognition = bool3;
        this.userNameLogin = str14;
    }

    public /* synthetic */ SubmitESimFromPhysicalRequest(Owner owner, String str, String str2, Boolean bool, String str3, String str4, List list, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, Boolean bool2, Boolean bool3, String str14, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : owner, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? null : bool, (i & 16) != 0 ? null : str3, (i & 32) != 0 ? null : str4, (i & 64) != 0 ? null : list, (i & 128) != 0 ? null : str5, (i & 256) != 0 ? null : str6, (i & 512) != 0 ? null : str7, (i & 1024) != 0 ? null : str8, (i & 2048) != 0 ? null : str9, (i & 4096) != 0 ? null : str10, (i & 8192) != 0 ? null : str11, (i & 16384) != 0 ? null : str12, (i & 32768) != 0 ? null : str13, (i & 65536) != 0 ? null : bool2, (i & 131072) != 0 ? null : bool3, (i & 262144) != 0 ? null : str14);
    }
}