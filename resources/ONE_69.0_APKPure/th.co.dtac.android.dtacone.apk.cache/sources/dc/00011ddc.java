package th.p047co.dtac.android.dtacone.model.customerenquiry;

import androidx.compose.runtime.internal.StabilityInferred;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import th.p047co.dtac.android.dtacone.view.fragment.mrtr_prepaid_registration.family_sim.InputPostpaidFamilySimSubscriberFragment;

@StabilityInferred(parameters = 0)
@Metadata(m29143d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0017\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B7\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\bJ\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0003HÆ\u0003J=\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001d\u001a\u00020\u001eHÖ\u0001J\t\u0010\u001f\u001a\u00020\u0003HÖ\u0001R\u001e\u0010\u0006\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\nR\u001e\u0010\u0004\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\n\"\u0004\b\u000f\u0010\fR\u001e\u0010\u0005\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\n\"\u0004\b\u0011\u0010\fR\u001e\u0010\u0002\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\n\"\u0004\b\u0013\u0010\f¨\u0006 "}, m29142d2 = {"Lth/co/dtac/android/dtacone/model/customerenquiry/Pre2PostRecommendPackageRequest;", "", "userLan", "", "userCode", "userFormatType", InputPostpaidFamilySimSubscriberFragment.SUB_NUM, "togglePrepaidEnable", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getSubscriberNumber", "()Ljava/lang/String;", "setSubscriberNumber", "(Ljava/lang/String;)V", "getTogglePrepaidEnable", "getUserCode", "setUserCode", "getUserFormatType", "setUserFormatType", "getUserLan", "setUserLan", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.model.customerenquiry.Pre2PostRecommendPackageRequest */
/* loaded from: classes8.dex */
public final class Pre2PostRecommendPackageRequest {
    public static final int $stable = 8;
    @SerializedName(InputPostpaidFamilySimSubscriberFragment.SUB_NUM)
    @NotNull
    private String subscriberNumber;
    @SerializedName("togglePrepaidEnable")
    @Nullable
    private final String togglePrepaidEnable;
    @SerializedName("userCode")
    @NotNull
    private String userCode;
    @SerializedName("userFormatType")
    @NotNull
    private String userFormatType;
    @SerializedName("userLan")
    @NotNull
    private String userLan;

    public Pre2PostRecommendPackageRequest(@NotNull String userLan, @NotNull String userCode, @NotNull String userFormatType, @NotNull String subscriberNumber, @Nullable String str) {
        Intrinsics.checkNotNullParameter(userLan, "userLan");
        Intrinsics.checkNotNullParameter(userCode, "userCode");
        Intrinsics.checkNotNullParameter(userFormatType, "userFormatType");
        Intrinsics.checkNotNullParameter(subscriberNumber, "subscriberNumber");
        this.userLan = userLan;
        this.userCode = userCode;
        this.userFormatType = userFormatType;
        this.subscriberNumber = subscriberNumber;
        this.togglePrepaidEnable = str;
    }

    public static /* synthetic */ Pre2PostRecommendPackageRequest copy$default(Pre2PostRecommendPackageRequest pre2PostRecommendPackageRequest, String str, String str2, String str3, String str4, String str5, int i, Object obj) {
        if ((i & 1) != 0) {
            str = pre2PostRecommendPackageRequest.userLan;
        }
        if ((i & 2) != 0) {
            str2 = pre2PostRecommendPackageRequest.userCode;
        }
        String str6 = str2;
        if ((i & 4) != 0) {
            str3 = pre2PostRecommendPackageRequest.userFormatType;
        }
        String str7 = str3;
        if ((i & 8) != 0) {
            str4 = pre2PostRecommendPackageRequest.subscriberNumber;
        }
        String str8 = str4;
        if ((i & 16) != 0) {
            str5 = pre2PostRecommendPackageRequest.togglePrepaidEnable;
        }
        return pre2PostRecommendPackageRequest.copy(str, str6, str7, str8, str5);
    }

    @NotNull
    public final String component1() {
        return this.userLan;
    }

    @NotNull
    public final String component2() {
        return this.userCode;
    }

    @NotNull
    public final String component3() {
        return this.userFormatType;
    }

    @NotNull
    public final String component4() {
        return this.subscriberNumber;
    }

    @Nullable
    public final String component5() {
        return this.togglePrepaidEnable;
    }

    @NotNull
    public final Pre2PostRecommendPackageRequest copy(@NotNull String userLan, @NotNull String userCode, @NotNull String userFormatType, @NotNull String subscriberNumber, @Nullable String str) {
        Intrinsics.checkNotNullParameter(userLan, "userLan");
        Intrinsics.checkNotNullParameter(userCode, "userCode");
        Intrinsics.checkNotNullParameter(userFormatType, "userFormatType");
        Intrinsics.checkNotNullParameter(subscriberNumber, "subscriberNumber");
        return new Pre2PostRecommendPackageRequest(userLan, userCode, userFormatType, subscriberNumber, str);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Pre2PostRecommendPackageRequest) {
            Pre2PostRecommendPackageRequest pre2PostRecommendPackageRequest = (Pre2PostRecommendPackageRequest) obj;
            return Intrinsics.areEqual(this.userLan, pre2PostRecommendPackageRequest.userLan) && Intrinsics.areEqual(this.userCode, pre2PostRecommendPackageRequest.userCode) && Intrinsics.areEqual(this.userFormatType, pre2PostRecommendPackageRequest.userFormatType) && Intrinsics.areEqual(this.subscriberNumber, pre2PostRecommendPackageRequest.subscriberNumber) && Intrinsics.areEqual(this.togglePrepaidEnable, pre2PostRecommendPackageRequest.togglePrepaidEnable);
        }
        return false;
    }

    @NotNull
    public final String getSubscriberNumber() {
        return this.subscriberNumber;
    }

    @Nullable
    public final String getTogglePrepaidEnable() {
        return this.togglePrepaidEnable;
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
        int hashCode = ((((((this.userLan.hashCode() * 31) + this.userCode.hashCode()) * 31) + this.userFormatType.hashCode()) * 31) + this.subscriberNumber.hashCode()) * 31;
        String str = this.togglePrepaidEnable;
        return hashCode + (str == null ? 0 : str.hashCode());
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

    public final void setUserLan(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.userLan = str;
    }

    @NotNull
    public String toString() {
        String str = this.userLan;
        String str2 = this.userCode;
        String str3 = this.userFormatType;
        String str4 = this.subscriberNumber;
        String str5 = this.togglePrepaidEnable;
        return "Pre2PostRecommendPackageRequest(userLan=" + str + ", userCode=" + str2 + ", userFormatType=" + str3 + ", subscriberNumber=" + str4 + ", togglePrepaidEnable=" + str5 + ")";
    }

    public /* synthetic */ Pre2PostRecommendPackageRequest(String str, String str2, String str3, String str4, String str5, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, str3, (i & 8) != 0 ? "" : str4, (i & 16) != 0 ? null : str5);
    }
}