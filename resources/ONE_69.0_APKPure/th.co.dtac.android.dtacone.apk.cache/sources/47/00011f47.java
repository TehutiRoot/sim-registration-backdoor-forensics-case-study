package th.p047co.dtac.android.dtacone.model.mrtr_pre2post;

import androidx.compose.runtime.internal.StabilityInferred;
import com.google.gson.annotations.SerializedName;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import th.p047co.dtac.android.dtacone.view.fragment.mrtr_prepaid_registration.family_sim.InputPostpaidFamilySimSubscriberFragment;

@StabilityInferred(parameters = 0)
@Metadata(m29143d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B9\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0002\u0010\nJ\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\t0\bHÆ\u0003JA\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bHÆ\u0001J\u0013\u0010\u001e\u001a\u00020\u001f2\b\u0010 \u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010!\u001a\u00020\"HÖ\u0001J\t\u0010#\u001a\u00020\u0003HÖ\u0001R$\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u0016\u0010\u0006\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u001e\u0010\u0005\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0010\"\u0004\b\u0012\u0010\u0013R\u001e\u0010\u0004\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0010\"\u0004\b\u0015\u0010\u0013R\u001e\u0010\u0002\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0010\"\u0004\b\u0017\u0010\u0013¨\u0006$"}, m29142d2 = {"Lth/co/dtac/android/dtacone/model/mrtr_pre2post/Pre2PostViewOfferRequest;", "", "userFormatType", "", "userCode", InputPostpaidFamilySimSubscriberFragment.SUB_NUM, "requestId", "locations", "", "Lth/co/dtac/android/dtacone/model/mrtr_pre2post/Location;", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "getLocations", "()Ljava/util/List;", "setLocations", "(Ljava/util/List;)V", "getRequestId", "()Ljava/lang/String;", "getSubscriberNumber", "setSubscriberNumber", "(Ljava/lang/String;)V", "getUserCode", "setUserCode", "getUserFormatType", "setUserFormatType", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.model.mrtr_pre2post.Pre2PostViewOfferRequest */
/* loaded from: classes8.dex */
public final class Pre2PostViewOfferRequest {
    public static final int $stable = 8;
    @SerializedName("locations")
    @NotNull
    private List<Location> locations;
    @SerializedName("requestId")
    @NotNull
    private final String requestId;
    @SerializedName(InputPostpaidFamilySimSubscriberFragment.SUB_NUM)
    @NotNull
    private String subscriberNumber;
    @SerializedName("userCode")
    @NotNull
    private String userCode;
    @SerializedName("userFormatType")
    @NotNull
    private String userFormatType;

    public Pre2PostViewOfferRequest(@NotNull String userFormatType, @NotNull String userCode, @NotNull String subscriberNumber, @NotNull String requestId, @NotNull List<Location> locations) {
        Intrinsics.checkNotNullParameter(userFormatType, "userFormatType");
        Intrinsics.checkNotNullParameter(userCode, "userCode");
        Intrinsics.checkNotNullParameter(subscriberNumber, "subscriberNumber");
        Intrinsics.checkNotNullParameter(requestId, "requestId");
        Intrinsics.checkNotNullParameter(locations, "locations");
        this.userFormatType = userFormatType;
        this.userCode = userCode;
        this.subscriberNumber = subscriberNumber;
        this.requestId = requestId;
        this.locations = locations;
    }

    public static /* synthetic */ Pre2PostViewOfferRequest copy$default(Pre2PostViewOfferRequest pre2PostViewOfferRequest, String str, String str2, String str3, String str4, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = pre2PostViewOfferRequest.userFormatType;
        }
        if ((i & 2) != 0) {
            str2 = pre2PostViewOfferRequest.userCode;
        }
        String str5 = str2;
        if ((i & 4) != 0) {
            str3 = pre2PostViewOfferRequest.subscriberNumber;
        }
        String str6 = str3;
        if ((i & 8) != 0) {
            str4 = pre2PostViewOfferRequest.requestId;
        }
        String str7 = str4;
        List<Location> list2 = list;
        if ((i & 16) != 0) {
            list2 = pre2PostViewOfferRequest.locations;
        }
        return pre2PostViewOfferRequest.copy(str, str5, str6, str7, list2);
    }

    @NotNull
    public final String component1() {
        return this.userFormatType;
    }

    @NotNull
    public final String component2() {
        return this.userCode;
    }

    @NotNull
    public final String component3() {
        return this.subscriberNumber;
    }

    @NotNull
    public final String component4() {
        return this.requestId;
    }

    @NotNull
    public final List<Location> component5() {
        return this.locations;
    }

    @NotNull
    public final Pre2PostViewOfferRequest copy(@NotNull String userFormatType, @NotNull String userCode, @NotNull String subscriberNumber, @NotNull String requestId, @NotNull List<Location> locations) {
        Intrinsics.checkNotNullParameter(userFormatType, "userFormatType");
        Intrinsics.checkNotNullParameter(userCode, "userCode");
        Intrinsics.checkNotNullParameter(subscriberNumber, "subscriberNumber");
        Intrinsics.checkNotNullParameter(requestId, "requestId");
        Intrinsics.checkNotNullParameter(locations, "locations");
        return new Pre2PostViewOfferRequest(userFormatType, userCode, subscriberNumber, requestId, locations);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Pre2PostViewOfferRequest) {
            Pre2PostViewOfferRequest pre2PostViewOfferRequest = (Pre2PostViewOfferRequest) obj;
            return Intrinsics.areEqual(this.userFormatType, pre2PostViewOfferRequest.userFormatType) && Intrinsics.areEqual(this.userCode, pre2PostViewOfferRequest.userCode) && Intrinsics.areEqual(this.subscriberNumber, pre2PostViewOfferRequest.subscriberNumber) && Intrinsics.areEqual(this.requestId, pre2PostViewOfferRequest.requestId) && Intrinsics.areEqual(this.locations, pre2PostViewOfferRequest.locations);
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
    public final String getSubscriberNumber() {
        return this.subscriberNumber;
    }

    @NotNull
    public final String getUserCode() {
        return this.userCode;
    }

    @NotNull
    public final String getUserFormatType() {
        return this.userFormatType;
    }

    public int hashCode() {
        return (((((((this.userFormatType.hashCode() * 31) + this.userCode.hashCode()) * 31) + this.subscriberNumber.hashCode()) * 31) + this.requestId.hashCode()) * 31) + this.locations.hashCode();
    }

    public final void setLocations(@NotNull List<Location> list) {
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.locations = list;
    }

    public final void setSubscriberNumber(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.subscriberNumber = str;
    }

    public final void setUserCode(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.userCode = str;
    }

    public final void setUserFormatType(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.userFormatType = str;
    }

    @NotNull
    public String toString() {
        String str = this.userFormatType;
        String str2 = this.userCode;
        String str3 = this.subscriberNumber;
        String str4 = this.requestId;
        List<Location> list = this.locations;
        return "Pre2PostViewOfferRequest(userFormatType=" + str + ", userCode=" + str2 + ", subscriberNumber=" + str3 + ", requestId=" + str4 + ", locations=" + list + ")";
    }

    public /* synthetic */ Pre2PostViewOfferRequest(String str, String str2, String str3, String str4, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, str4, (i & 16) != 0 ? new ArrayList() : list);
    }
}