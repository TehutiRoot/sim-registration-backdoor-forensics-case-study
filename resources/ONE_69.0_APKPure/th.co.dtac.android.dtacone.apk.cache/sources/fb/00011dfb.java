package th.p047co.dtac.android.dtacone.model.customerenquiry;

import androidx.compose.runtime.internal.StabilityInferred;
import com.google.gson.annotations.SerializedName;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import th.p047co.dtac.android.dtacone.util.constant.customerenquiry.ConstsKt;
import th.p047co.dtac.android.dtacone.view.fragment.mrtr_prepaid_registration.family_sim.InputPostpaidFamilySimSubscriberFragment;

@StabilityInferred(parameters = 0)
@Metadata(m29143d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b'\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B_\u0012\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\u0006\u0012\b\b\u0002\u0010\n\u001a\u00020\u0006\u0012\u0006\u0010\u000b\u001a\u00020\u0006\u0012\b\b\u0002\u0010\f\u001a\u00020\u0006\u0012\u0006\u0010\r\u001a\u00020\u0006¢\u0006\u0002\u0010\u000eJ\u000f\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\t\u0010$\u001a\u00020\u0006HÆ\u0003J\t\u0010%\u001a\u00020\u0006HÆ\u0003J\t\u0010&\u001a\u00020\u0006HÆ\u0003J\t\u0010'\u001a\u00020\u0006HÆ\u0003J\t\u0010(\u001a\u00020\u0006HÆ\u0003J\t\u0010)\u001a\u00020\u0006HÆ\u0003J\t\u0010*\u001a\u00020\u0006HÆ\u0003J\t\u0010+\u001a\u00020\u0006HÆ\u0003Ji\u0010,\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\u00062\b\b\u0002\u0010\n\u001a\u00020\u00062\b\b\u0002\u0010\u000b\u001a\u00020\u00062\b\b\u0002\u0010\f\u001a\u00020\u00062\b\b\u0002\u0010\r\u001a\u00020\u0006HÆ\u0001J\u0013\u0010-\u001a\u00020.2\b\u0010/\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00100\u001a\u000201HÖ\u0001J\t\u00102\u001a\u00020\u0006HÖ\u0001R$\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u001e\u0010\f\u001a\u00020\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0014\"\u0004\b\u0016\u0010\u0017R\u001e\u0010\u0007\u001a\u00020\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0014\"\u0004\b\u0019\u0010\u0017R\u001e\u0010\b\u001a\u00020\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u0014\"\u0004\b\u001b\u0010\u0017R\u0016\u0010\r\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0014R\u001e\u0010\t\u001a\u00020\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u0014\"\u0004\b\u001e\u0010\u0017R\u001e\u0010\u000b\u001a\u00020\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010\u0014\"\u0004\b \u0010\u0017R\u001e\u0010\n\u001a\u00020\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\u0014\"\u0004\b\"\u0010\u0017¨\u00063"}, m29142d2 = {"Lth/co/dtac/android/dtacone/model/customerenquiry/ViewOfferRequest;", "", "locations", "", "Lth/co/dtac/android/dtacone/model/customerenquiry/Location;", "requestId", "", InputPostpaidFamilySimSubscriberFragment.SUB_NUM, ConstsKt.TELEPHONE_TYPE, "userCode", "userLan", "userFormatType", "requesterApplication", "togglePostpaidEnable", "(Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getLocations", "()Ljava/util/List;", "setLocations", "(Ljava/util/List;)V", "getRequestId", "()Ljava/lang/String;", "getRequesterApplication", "setRequesterApplication", "(Ljava/lang/String;)V", "getSubscriberNumber", "setSubscriberNumber", "getTelephoneType", "setTelephoneType", "getTogglePostpaidEnable", "getUserCode", "setUserCode", "getUserFormatType", "setUserFormatType", "getUserLan", "setUserLan", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "", "other", "hashCode", "", "toString", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.model.customerenquiry.ViewOfferRequest */
/* loaded from: classes8.dex */
public final class ViewOfferRequest {
    public static final int $stable = 8;
    @SerializedName("locations")
    @NotNull
    private List<Location> locations;
    @SerializedName("requestId")
    @NotNull
    private final String requestId;
    @SerializedName("requesterApplication")
    @NotNull
    private String requesterApplication;
    @SerializedName(InputPostpaidFamilySimSubscriberFragment.SUB_NUM)
    @NotNull
    private String subscriberNumber;
    @SerializedName(ConstsKt.TELEPHONE_TYPE)
    @NotNull
    private String telephoneType;
    @SerializedName("togglePostpaidEnable")
    @NotNull
    private final String togglePostpaidEnable;
    @SerializedName("userCode")
    @NotNull
    private String userCode;
    @SerializedName("userFormatType")
    @NotNull
    private String userFormatType;
    @SerializedName("userLan")
    @NotNull
    private String userLan;

    public ViewOfferRequest(@NotNull List<Location> locations, @NotNull String requestId, @NotNull String subscriberNumber, @NotNull String telephoneType, @NotNull String userCode, @NotNull String userLan, @NotNull String userFormatType, @NotNull String requesterApplication, @NotNull String togglePostpaidEnable) {
        Intrinsics.checkNotNullParameter(locations, "locations");
        Intrinsics.checkNotNullParameter(requestId, "requestId");
        Intrinsics.checkNotNullParameter(subscriberNumber, "subscriberNumber");
        Intrinsics.checkNotNullParameter(telephoneType, "telephoneType");
        Intrinsics.checkNotNullParameter(userCode, "userCode");
        Intrinsics.checkNotNullParameter(userLan, "userLan");
        Intrinsics.checkNotNullParameter(userFormatType, "userFormatType");
        Intrinsics.checkNotNullParameter(requesterApplication, "requesterApplication");
        Intrinsics.checkNotNullParameter(togglePostpaidEnable, "togglePostpaidEnable");
        this.locations = locations;
        this.requestId = requestId;
        this.subscriberNumber = subscriberNumber;
        this.telephoneType = telephoneType;
        this.userCode = userCode;
        this.userLan = userLan;
        this.userFormatType = userFormatType;
        this.requesterApplication = requesterApplication;
        this.togglePostpaidEnable = togglePostpaidEnable;
    }

    @NotNull
    public final List<Location> component1() {
        return this.locations;
    }

    @NotNull
    public final String component2() {
        return this.requestId;
    }

    @NotNull
    public final String component3() {
        return this.subscriberNumber;
    }

    @NotNull
    public final String component4() {
        return this.telephoneType;
    }

    @NotNull
    public final String component5() {
        return this.userCode;
    }

    @NotNull
    public final String component6() {
        return this.userLan;
    }

    @NotNull
    public final String component7() {
        return this.userFormatType;
    }

    @NotNull
    public final String component8() {
        return this.requesterApplication;
    }

    @NotNull
    public final String component9() {
        return this.togglePostpaidEnable;
    }

    @NotNull
    public final ViewOfferRequest copy(@NotNull List<Location> locations, @NotNull String requestId, @NotNull String subscriberNumber, @NotNull String telephoneType, @NotNull String userCode, @NotNull String userLan, @NotNull String userFormatType, @NotNull String requesterApplication, @NotNull String togglePostpaidEnable) {
        Intrinsics.checkNotNullParameter(locations, "locations");
        Intrinsics.checkNotNullParameter(requestId, "requestId");
        Intrinsics.checkNotNullParameter(subscriberNumber, "subscriberNumber");
        Intrinsics.checkNotNullParameter(telephoneType, "telephoneType");
        Intrinsics.checkNotNullParameter(userCode, "userCode");
        Intrinsics.checkNotNullParameter(userLan, "userLan");
        Intrinsics.checkNotNullParameter(userFormatType, "userFormatType");
        Intrinsics.checkNotNullParameter(requesterApplication, "requesterApplication");
        Intrinsics.checkNotNullParameter(togglePostpaidEnable, "togglePostpaidEnable");
        return new ViewOfferRequest(locations, requestId, subscriberNumber, telephoneType, userCode, userLan, userFormatType, requesterApplication, togglePostpaidEnable);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ViewOfferRequest) {
            ViewOfferRequest viewOfferRequest = (ViewOfferRequest) obj;
            return Intrinsics.areEqual(this.locations, viewOfferRequest.locations) && Intrinsics.areEqual(this.requestId, viewOfferRequest.requestId) && Intrinsics.areEqual(this.subscriberNumber, viewOfferRequest.subscriberNumber) && Intrinsics.areEqual(this.telephoneType, viewOfferRequest.telephoneType) && Intrinsics.areEqual(this.userCode, viewOfferRequest.userCode) && Intrinsics.areEqual(this.userLan, viewOfferRequest.userLan) && Intrinsics.areEqual(this.userFormatType, viewOfferRequest.userFormatType) && Intrinsics.areEqual(this.requesterApplication, viewOfferRequest.requesterApplication) && Intrinsics.areEqual(this.togglePostpaidEnable, viewOfferRequest.togglePostpaidEnable);
        }
        return false;
    }

    @NotNull
    public final List<Location> getLocations() {
        return this.locations;
    }

    @NotNull
    public final String getRequestId() {
        return this.requestId;
    }

    @NotNull
    public final String getRequesterApplication() {
        return this.requesterApplication;
    }

    @NotNull
    public final String getSubscriberNumber() {
        return this.subscriberNumber;
    }

    @NotNull
    public final String getTelephoneType() {
        return this.telephoneType;
    }

    @NotNull
    public final String getTogglePostpaidEnable() {
        return this.togglePostpaidEnable;
    }

    @NotNull
    public final String getUserCode() {
        return this.userCode;
    }

    @NotNull
    public final String getUserFormatType() {
        return this.userFormatType;
    }

    @NotNull
    public final String getUserLan() {
        return this.userLan;
    }

    public int hashCode() {
        return (((((((((((((((this.locations.hashCode() * 31) + this.requestId.hashCode()) * 31) + this.subscriberNumber.hashCode()) * 31) + this.telephoneType.hashCode()) * 31) + this.userCode.hashCode()) * 31) + this.userLan.hashCode()) * 31) + this.userFormatType.hashCode()) * 31) + this.requesterApplication.hashCode()) * 31) + this.togglePostpaidEnable.hashCode();
    }

    public final void setLocations(@NotNull List<Location> list) {
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.locations = list;
    }

    public final void setRequesterApplication(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.requesterApplication = str;
    }

    public final void setSubscriberNumber(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.subscriberNumber = str;
    }

    public final void setTelephoneType(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.telephoneType = str;
    }

    public final void setUserCode(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.userCode = str;
    }

    public final void setUserFormatType(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.userFormatType = str;
    }

    public final void setUserLan(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.userLan = str;
    }

    @NotNull
    public String toString() {
        List<Location> list = this.locations;
        String str = this.requestId;
        String str2 = this.subscriberNumber;
        String str3 = this.telephoneType;
        String str4 = this.userCode;
        String str5 = this.userLan;
        String str6 = this.userFormatType;
        String str7 = this.requesterApplication;
        String str8 = this.togglePostpaidEnable;
        return "ViewOfferRequest(locations=" + list + ", requestId=" + str + ", subscriberNumber=" + str2 + ", telephoneType=" + str3 + ", userCode=" + str4 + ", userLan=" + str5 + ", userFormatType=" + str6 + ", requesterApplication=" + str7 + ", togglePostpaidEnable=" + str8 + ")";
    }

    public /* synthetic */ ViewOfferRequest(List list, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new ArrayList() : list, str, (i & 4) != 0 ? "" : str2, (i & 8) != 0 ? "" : str3, (i & 16) != 0 ? "" : str4, (i & 32) != 0 ? "" : str5, str6, (i & 128) != 0 ? RequestKt.REQUESTER_APPLICATION : str7, str8);
    }
}