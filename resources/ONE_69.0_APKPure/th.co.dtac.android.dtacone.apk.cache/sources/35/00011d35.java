package th.p047co.dtac.android.dtacone.model.changeMainPack.submit.request;

import androidx.compose.runtime.internal.StabilityInferred;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import th.p047co.dtac.android.dtacone.view.fragment.mrtr_prepaid_registration.family_sim.InputPostpaidFamilySimSubscriberFragment;

@StabilityInferred(parameters = 0)
@Metadata(m29143d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BA\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\bJ\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003JE\u0010\u0014\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\nR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\n¨\u0006\u001b"}, m29142d2 = {"Lth/co/dtac/android/dtacone/model/changeMainPack/submit/request/SubmitChangeMainPackRequest;", "", "packageCode", "", InputPostpaidFamilySimSubscriberFragment.SUB_NUM, RemoteConfigConstants.RequestFieldKey.PACKAGE_NAME, "cardType", "cardNumber", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getCardNumber", "()Ljava/lang/String;", "getCardType", "getPackageCode", "getPackageName", "getSubscriberNumber", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.model.changeMainPack.submit.request.SubmitChangeMainPackRequest */
/* loaded from: classes8.dex */
public final class SubmitChangeMainPackRequest {
    public static final int $stable = 0;
    @Nullable
    private final transient String cardNumber;
    @Nullable
    private final transient String cardType;
    @SerializedName("packageCode")
    @Nullable
    private final String packageCode;
    @SerializedName(RemoteConfigConstants.RequestFieldKey.PACKAGE_NAME)
    @Nullable
    private final String packageName;
    @SerializedName(InputPostpaidFamilySimSubscriberFragment.SUB_NUM)
    @Nullable
    private final String subscriberNumber;

    public SubmitChangeMainPackRequest() {
        this(null, null, null, null, null, 31, null);
    }

    public static /* synthetic */ SubmitChangeMainPackRequest copy$default(SubmitChangeMainPackRequest submitChangeMainPackRequest, String str, String str2, String str3, String str4, String str5, int i, Object obj) {
        if ((i & 1) != 0) {
            str = submitChangeMainPackRequest.packageCode;
        }
        if ((i & 2) != 0) {
            str2 = submitChangeMainPackRequest.subscriberNumber;
        }
        String str6 = str2;
        if ((i & 4) != 0) {
            str3 = submitChangeMainPackRequest.packageName;
        }
        String str7 = str3;
        if ((i & 8) != 0) {
            str4 = submitChangeMainPackRequest.cardType;
        }
        String str8 = str4;
        if ((i & 16) != 0) {
            str5 = submitChangeMainPackRequest.cardNumber;
        }
        return submitChangeMainPackRequest.copy(str, str6, str7, str8, str5);
    }

    @Nullable
    public final String component1() {
        return this.packageCode;
    }

    @Nullable
    public final String component2() {
        return this.subscriberNumber;
    }

    @Nullable
    public final String component3() {
        return this.packageName;
    }

    @Nullable
    public final String component4() {
        return this.cardType;
    }

    @Nullable
    public final String component5() {
        return this.cardNumber;
    }

    @NotNull
    public final SubmitChangeMainPackRequest copy(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5) {
        return new SubmitChangeMainPackRequest(str, str2, str3, str4, str5);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof SubmitChangeMainPackRequest) {
            SubmitChangeMainPackRequest submitChangeMainPackRequest = (SubmitChangeMainPackRequest) obj;
            return Intrinsics.areEqual(this.packageCode, submitChangeMainPackRequest.packageCode) && Intrinsics.areEqual(this.subscriberNumber, submitChangeMainPackRequest.subscriberNumber) && Intrinsics.areEqual(this.packageName, submitChangeMainPackRequest.packageName) && Intrinsics.areEqual(this.cardType, submitChangeMainPackRequest.cardType) && Intrinsics.areEqual(this.cardNumber, submitChangeMainPackRequest.cardNumber);
        }
        return false;
    }

    @Nullable
    public final String getCardNumber() {
        return this.cardNumber;
    }

    @Nullable
    public final String getCardType() {
        return this.cardType;
    }

    @Nullable
    public final String getPackageCode() {
        return this.packageCode;
    }

    @Nullable
    public final String getPackageName() {
        return this.packageName;
    }

    @Nullable
    public final String getSubscriberNumber() {
        return this.subscriberNumber;
    }

    public int hashCode() {
        String str = this.packageCode;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.subscriberNumber;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.packageName;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.cardType;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.cardNumber;
        return hashCode4 + (str5 != null ? str5.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        String str = this.packageCode;
        String str2 = this.subscriberNumber;
        String str3 = this.packageName;
        String str4 = this.cardType;
        String str5 = this.cardNumber;
        return "SubmitChangeMainPackRequest(packageCode=" + str + ", subscriberNumber=" + str2 + ", packageName=" + str3 + ", cardType=" + str4 + ", cardNumber=" + str5 + ")";
    }

    public SubmitChangeMainPackRequest(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5) {
        this.packageCode = str;
        this.subscriberNumber = str2;
        this.packageName = str3;
        this.cardType = str4;
        this.cardNumber = str5;
    }

    public /* synthetic */ SubmitChangeMainPackRequest(String str, String str2, String str3, String str4, String str5, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : str5);
    }
}