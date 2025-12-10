package th.p047co.dtac.android.dtacone.model.mrtr_prepaid_reregist.validate;

import androidx.compose.runtime.internal.StabilityInferred;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import th.p047co.dtac.android.dtacone.view.fragment.mrtr_prepaid_registration.family_sim.InputPostpaidFamilySimSubscriberFragment;

@StabilityInferred(parameters = 0)
@Metadata(m29143d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0010\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B5\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\bJ\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\fJ>\u0010\u0013\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÆ\u0001¢\u0006\u0002\u0010\u0014J\u0013\u0010\u0015\u001a\u00020\u00072\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u0003HÖ\u0001R\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u001a\u0010\u0006\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\r\u001a\u0004\b\u0006\u0010\fR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\n¨\u0006\u001a"}, m29142d2 = {"Lth/co/dtac/android/dtacone/model/mrtr_prepaid_reregist/validate/ValidateCardRequest;", "", "identityType", "", "identityNumber", InputPostpaidFamilySimSubscriberFragment.SUB_NUM, "isOverruleXSim", "", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;)V", "getIdentityNumber", "()Ljava/lang/String;", "getIdentityType", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getSubscriberNumber", "component1", "component2", "component3", "component4", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;)Lth/co/dtac/android/dtacone/model/mrtr_prepaid_reregist/validate/ValidateCardRequest;", "equals", "other", "hashCode", "", "toString", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.model.mrtr_prepaid_reregist.validate.ValidateCardRequest */
/* loaded from: classes8.dex */
public final class ValidateCardRequest {
    public static final int $stable = 0;
    @SerializedName("identityNumber")
    @Nullable
    private final String identityNumber;
    @SerializedName("identityType")
    @Nullable
    private final String identityType;
    @SerializedName("isOverruleXSim")
    @Nullable
    private final Boolean isOverruleXSim;
    @SerializedName(InputPostpaidFamilySimSubscriberFragment.SUB_NUM)
    @Nullable
    private final String subscriberNumber;

    public ValidateCardRequest() {
        this(null, null, null, null, 15, null);
    }

    public static /* synthetic */ ValidateCardRequest copy$default(ValidateCardRequest validateCardRequest, String str, String str2, String str3, Boolean bool, int i, Object obj) {
        if ((i & 1) != 0) {
            str = validateCardRequest.identityType;
        }
        if ((i & 2) != 0) {
            str2 = validateCardRequest.identityNumber;
        }
        if ((i & 4) != 0) {
            str3 = validateCardRequest.subscriberNumber;
        }
        if ((i & 8) != 0) {
            bool = validateCardRequest.isOverruleXSim;
        }
        return validateCardRequest.copy(str, str2, str3, bool);
    }

    @Nullable
    public final String component1() {
        return this.identityType;
    }

    @Nullable
    public final String component2() {
        return this.identityNumber;
    }

    @Nullable
    public final String component3() {
        return this.subscriberNumber;
    }

    @Nullable
    public final Boolean component4() {
        return this.isOverruleXSim;
    }

    @NotNull
    public final ValidateCardRequest copy(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable Boolean bool) {
        return new ValidateCardRequest(str, str2, str3, bool);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ValidateCardRequest) {
            ValidateCardRequest validateCardRequest = (ValidateCardRequest) obj;
            return Intrinsics.areEqual(this.identityType, validateCardRequest.identityType) && Intrinsics.areEqual(this.identityNumber, validateCardRequest.identityNumber) && Intrinsics.areEqual(this.subscriberNumber, validateCardRequest.subscriberNumber) && Intrinsics.areEqual(this.isOverruleXSim, validateCardRequest.isOverruleXSim);
        }
        return false;
    }

    @Nullable
    public final String getIdentityNumber() {
        return this.identityNumber;
    }

    @Nullable
    public final String getIdentityType() {
        return this.identityType;
    }

    @Nullable
    public final String getSubscriberNumber() {
        return this.subscriberNumber;
    }

    public int hashCode() {
        String str = this.identityType;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.identityNumber;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.subscriberNumber;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Boolean bool = this.isOverruleXSim;
        return hashCode3 + (bool != null ? bool.hashCode() : 0);
    }

    @Nullable
    public final Boolean isOverruleXSim() {
        return this.isOverruleXSim;
    }

    @NotNull
    public String toString() {
        String str = this.identityType;
        String str2 = this.identityNumber;
        String str3 = this.subscriberNumber;
        Boolean bool = this.isOverruleXSim;
        return "ValidateCardRequest(identityType=" + str + ", identityNumber=" + str2 + ", subscriberNumber=" + str3 + ", isOverruleXSim=" + bool + ")";
    }

    public ValidateCardRequest(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable Boolean bool) {
        this.identityType = str;
        this.identityNumber = str2;
        this.subscriberNumber = str3;
        this.isOverruleXSim = bool;
    }

    public /* synthetic */ ValidateCardRequest(String str, String str2, String str3, Boolean bool, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : bool);
    }
}