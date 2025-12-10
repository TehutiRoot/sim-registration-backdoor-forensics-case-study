package th.p047co.dtac.android.dtacone.model.mrtr_mnp.package_set.request;

import androidx.compose.runtime.internal.StabilityInferred;
import com.google.gson.annotations.SerializedName;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import th.p047co.dtac.android.dtacone.util.constant.customerenquiry.ConstsKt;
import th.p047co.dtac.android.dtacone.view.fragment.mrtr_prepaid_registration.family_sim.InputPostpaidFamilySimSubscriberFragment;

@StabilityInferred(parameters = 0)
@Metadata(m29143d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BI\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\u0012\b\u0002\u0010\u0006\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\b\u0018\u00010\u0007\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\nJ\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0013\u0010\u0015\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\b\u0018\u00010\u0007HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0003HÆ\u0003JM\u0010\u0017\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\u0012\b\u0002\u0010\u0006\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\b\u0018\u00010\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001J\t\u0010\u001d\u001a\u00020\u0003HÖ\u0001R \u0010\u0006\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\b\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000eR\u0018\u0010\t\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000e¨\u0006\u001e"}, m29142d2 = {"Lth/co/dtac/android/dtacone/model/mrtr_mnp/package_set/request/MnpQueryPackageSetRequest;", "", "userFormatType", "", InputPostpaidFamilySimSubscriberFragment.SUB_NUM, ConstsKt.TELEPHONE_TYPE, "params", "", "Lth/co/dtac/android/dtacone/model/mrtr_mnp/package_set/request/ParamsItem;", "userNameLogin", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;)V", "getParams", "()Ljava/util/List;", "getSubscriberNumber", "()Ljava/lang/String;", "getTelephoneType", "getUserFormatType", "getUserNameLogin", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.model.mrtr_mnp.package_set.request.MnpQueryPackageSetRequest */
/* loaded from: classes8.dex */
public final class MnpQueryPackageSetRequest {
    public static final int $stable = 8;
    @SerializedName("params")
    @Nullable
    private final List<ParamsItem> params;
    @SerializedName(InputPostpaidFamilySimSubscriberFragment.SUB_NUM)
    @Nullable
    private final String subscriberNumber;
    @SerializedName(ConstsKt.TELEPHONE_TYPE)
    @Nullable
    private final String telephoneType;
    @SerializedName("userFormatType")
    @Nullable
    private final String userFormatType;
    @SerializedName("userNameLogin")
    @Nullable
    private final String userNameLogin;

    public MnpQueryPackageSetRequest() {
        this(null, null, null, null, null, 31, null);
    }

    public static /* synthetic */ MnpQueryPackageSetRequest copy$default(MnpQueryPackageSetRequest mnpQueryPackageSetRequest, String str, String str2, String str3, List list, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = mnpQueryPackageSetRequest.userFormatType;
        }
        if ((i & 2) != 0) {
            str2 = mnpQueryPackageSetRequest.subscriberNumber;
        }
        String str5 = str2;
        if ((i & 4) != 0) {
            str3 = mnpQueryPackageSetRequest.telephoneType;
        }
        String str6 = str3;
        List<ParamsItem> list2 = list;
        if ((i & 8) != 0) {
            list2 = mnpQueryPackageSetRequest.params;
        }
        List list3 = list2;
        if ((i & 16) != 0) {
            str4 = mnpQueryPackageSetRequest.userNameLogin;
        }
        return mnpQueryPackageSetRequest.copy(str, str5, str6, list3, str4);
    }

    @Nullable
    public final String component1() {
        return this.userFormatType;
    }

    @Nullable
    public final String component2() {
        return this.subscriberNumber;
    }

    @Nullable
    public final String component3() {
        return this.telephoneType;
    }

    @Nullable
    public final List<ParamsItem> component4() {
        return this.params;
    }

    @Nullable
    public final String component5() {
        return this.userNameLogin;
    }

    @NotNull
    public final MnpQueryPackageSetRequest copy(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable List<ParamsItem> list, @Nullable String str4) {
        return new MnpQueryPackageSetRequest(str, str2, str3, list, str4);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof MnpQueryPackageSetRequest) {
            MnpQueryPackageSetRequest mnpQueryPackageSetRequest = (MnpQueryPackageSetRequest) obj;
            return Intrinsics.areEqual(this.userFormatType, mnpQueryPackageSetRequest.userFormatType) && Intrinsics.areEqual(this.subscriberNumber, mnpQueryPackageSetRequest.subscriberNumber) && Intrinsics.areEqual(this.telephoneType, mnpQueryPackageSetRequest.telephoneType) && Intrinsics.areEqual(this.params, mnpQueryPackageSetRequest.params) && Intrinsics.areEqual(this.userNameLogin, mnpQueryPackageSetRequest.userNameLogin);
        }
        return false;
    }

    @Nullable
    public final List<ParamsItem> getParams() {
        return this.params;
    }

    @Nullable
    public final String getSubscriberNumber() {
        return this.subscriberNumber;
    }

    @Nullable
    public final String getTelephoneType() {
        return this.telephoneType;
    }

    @Nullable
    public final String getUserFormatType() {
        return this.userFormatType;
    }

    @Nullable
    public final String getUserNameLogin() {
        return this.userNameLogin;
    }

    public int hashCode() {
        String str = this.userFormatType;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.subscriberNumber;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.telephoneType;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        List<ParamsItem> list = this.params;
        int hashCode4 = (hashCode3 + (list == null ? 0 : list.hashCode())) * 31;
        String str4 = this.userNameLogin;
        return hashCode4 + (str4 != null ? str4.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        String str = this.userFormatType;
        String str2 = this.subscriberNumber;
        String str3 = this.telephoneType;
        List<ParamsItem> list = this.params;
        String str4 = this.userNameLogin;
        return "MnpQueryPackageSetRequest(userFormatType=" + str + ", subscriberNumber=" + str2 + ", telephoneType=" + str3 + ", params=" + list + ", userNameLogin=" + str4 + ")";
    }

    public MnpQueryPackageSetRequest(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable List<ParamsItem> list, @Nullable String str4) {
        this.userFormatType = str;
        this.subscriberNumber = str2;
        this.telephoneType = str3;
        this.params = list;
        this.userNameLogin = str4;
    }

    public /* synthetic */ MnpQueryPackageSetRequest(String str, String str2, String str3, List list, String str4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : list, (i & 16) != 0 ? null : str4);
    }
}