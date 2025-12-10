package th.p047co.dtac.android.dtacone.model.mrtr_postpaid.registration;

import androidx.compose.runtime.internal.StabilityInferred;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import th.p047co.dtac.android.dtacone.view.fragment.mrtr_prepaid_registration.family_sim.InputPostpaidFamilySimSubscriberFragment;

@StabilityInferred(parameters = 0)
@Metadata(m29143d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\bJ\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0007HÆ\u0003J3\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÆ\u0001J\u0013\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001d\u001a\u00020\u001eHÖ\u0001J\t\u0010\u001f\u001a\u00020\u0003HÖ\u0001R\u001e\u0010\u0005\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR \u0010\u0006\u001a\u0004\u0018\u00010\u00078\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001e\u0010\u0002\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\n\"\u0004\b\u0012\u0010\fR\u001e\u0010\u0004\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\n\"\u0004\b\u0014\u0010\f¨\u0006 "}, m29142d2 = {"Lth/co/dtac/android/dtacone/model/mrtr_postpaid/registration/SimCard;", "", "simCardNumber", "", InputPostpaidFamilySimSubscriberFragment.SUB_NUM, "companyCode", "niceNumber", "Lth/co/dtac/android/dtacone/model/mrtr_postpaid/registration/NiceNumber;", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lth/co/dtac/android/dtacone/model/mrtr_postpaid/registration/NiceNumber;)V", "getCompanyCode", "()Ljava/lang/String;", "setCompanyCode", "(Ljava/lang/String;)V", "getNiceNumber", "()Lth/co/dtac/android/dtacone/model/mrtr_postpaid/registration/NiceNumber;", "setNiceNumber", "(Lth/co/dtac/android/dtacone/model/mrtr_postpaid/registration/NiceNumber;)V", "getSimCardNumber", "setSimCardNumber", "getSubscriberNumber", "setSubscriberNumber", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.model.mrtr_postpaid.registration.SimCard */
/* loaded from: classes8.dex */
public final class SimCard {
    public static final int $stable = 8;
    @SerializedName("companyCode")
    @NotNull
    private String companyCode;
    @SerializedName("niceNumber")
    @Nullable
    private NiceNumber niceNumber;
    @SerializedName("simCardNumber")
    @NotNull
    private String simCardNumber;
    @SerializedName(InputPostpaidFamilySimSubscriberFragment.SUB_NUM)
    @NotNull
    private String subscriberNumber;

    public SimCard(@NotNull String simCardNumber, @NotNull String subscriberNumber, @NotNull String companyCode, @Nullable NiceNumber niceNumber) {
        Intrinsics.checkNotNullParameter(simCardNumber, "simCardNumber");
        Intrinsics.checkNotNullParameter(subscriberNumber, "subscriberNumber");
        Intrinsics.checkNotNullParameter(companyCode, "companyCode");
        this.simCardNumber = simCardNumber;
        this.subscriberNumber = subscriberNumber;
        this.companyCode = companyCode;
        this.niceNumber = niceNumber;
    }

    public static /* synthetic */ SimCard copy$default(SimCard simCard, String str, String str2, String str3, NiceNumber niceNumber, int i, Object obj) {
        if ((i & 1) != 0) {
            str = simCard.simCardNumber;
        }
        if ((i & 2) != 0) {
            str2 = simCard.subscriberNumber;
        }
        if ((i & 4) != 0) {
            str3 = simCard.companyCode;
        }
        if ((i & 8) != 0) {
            niceNumber = simCard.niceNumber;
        }
        return simCard.copy(str, str2, str3, niceNumber);
    }

    @NotNull
    public final String component1() {
        return this.simCardNumber;
    }

    @NotNull
    public final String component2() {
        return this.subscriberNumber;
    }

    @NotNull
    public final String component3() {
        return this.companyCode;
    }

    @Nullable
    public final NiceNumber component4() {
        return this.niceNumber;
    }

    @NotNull
    public final SimCard copy(@NotNull String simCardNumber, @NotNull String subscriberNumber, @NotNull String companyCode, @Nullable NiceNumber niceNumber) {
        Intrinsics.checkNotNullParameter(simCardNumber, "simCardNumber");
        Intrinsics.checkNotNullParameter(subscriberNumber, "subscriberNumber");
        Intrinsics.checkNotNullParameter(companyCode, "companyCode");
        return new SimCard(simCardNumber, subscriberNumber, companyCode, niceNumber);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof SimCard) {
            SimCard simCard = (SimCard) obj;
            return Intrinsics.areEqual(this.simCardNumber, simCard.simCardNumber) && Intrinsics.areEqual(this.subscriberNumber, simCard.subscriberNumber) && Intrinsics.areEqual(this.companyCode, simCard.companyCode) && Intrinsics.areEqual(this.niceNumber, simCard.niceNumber);
        }
        return false;
    }

    @NotNull
    public final String getCompanyCode() {
        return this.companyCode;
    }

    @Nullable
    public final NiceNumber getNiceNumber() {
        return this.niceNumber;
    }

    @NotNull
    public final String getSimCardNumber() {
        return this.simCardNumber;
    }

    @NotNull
    public final String getSubscriberNumber() {
        return this.subscriberNumber;
    }

    public int hashCode() {
        int hashCode = ((((this.simCardNumber.hashCode() * 31) + this.subscriberNumber.hashCode()) * 31) + this.companyCode.hashCode()) * 31;
        NiceNumber niceNumber = this.niceNumber;
        return hashCode + (niceNumber == null ? 0 : niceNumber.hashCode());
    }

    public final void setCompanyCode(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.companyCode = str;
    }

    public final void setNiceNumber(@Nullable NiceNumber niceNumber) {
        this.niceNumber = niceNumber;
    }

    public final void setSimCardNumber(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.simCardNumber = str;
    }

    public final void setSubscriberNumber(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.subscriberNumber = str;
    }

    @NotNull
    public String toString() {
        String str = this.simCardNumber;
        String str2 = this.subscriberNumber;
        String str3 = this.companyCode;
        NiceNumber niceNumber = this.niceNumber;
        return "SimCard(simCardNumber=" + str + ", subscriberNumber=" + str2 + ", companyCode=" + str3 + ", niceNumber=" + niceNumber + ")";
    }

    public /* synthetic */ SimCard(String str, String str2, String str3, NiceNumber niceNumber, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, (i & 8) != 0 ? null : niceNumber);
    }
}