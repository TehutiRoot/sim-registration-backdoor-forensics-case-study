package th.p047co.dtac.android.dtacone.model.appOne.mnp.request;

import androidx.compose.runtime.internal.StabilityInferred;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import th.p047co.dtac.android.dtacone.view.fragment.mrtr_prepaid_registration.family_sim.InputPostpaidFamilySimSubscriberFragment;

@StabilityInferred(parameters = 0)
@Metadata(m28851d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u001b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001Be\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u000bJ\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0003HÆ\u0003Ji\u0010\u001d\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u001e\u001a\u00020\u001f2\b\u0010 \u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010!\u001a\u00020\"HÖ\u0001J\t\u0010#\u001a\u00020\u0003HÖ\u0001R\u0018\u0010\t\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\rR\u0018\u0010\b\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\rR\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\rR\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\rR\u0018\u0010\n\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\rR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\r¨\u0006$"}, m28850d2 = {"Lth/co/dtac/android/dtacone/model/appOne/mnp/request/SubscriberInfo;", "", "simCardNumber", "", "subscriberType", "pinCode", "operatorDesc", InputPostpaidFamilySimSubscriberFragment.SUB_NUM, "pricePlanCode", "operatorCode", "subscriberPortIn", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getOperatorCode", "()Ljava/lang/String;", "getOperatorDesc", "getPinCode", "getPricePlanCode", "getSimCardNumber", "getSubscriberNumber", "getSubscriberPortIn", "getSubscriberType", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "equals", "", "other", "hashCode", "", "toString", "app_prodRelease"}, m28849k = 1, m28848mv = {1, 8, 0}, m28846xi = 48)
/* renamed from: th.co.dtac.android.dtacone.model.appOne.mnp.request.SubscriberInfo */
/* loaded from: classes8.dex */
public final class SubscriberInfo {
    public static final int $stable = 0;
    @SerializedName("operatorCode")
    @Nullable
    private final String operatorCode;
    @SerializedName("operatorDesc")
    @Nullable
    private final String operatorDesc;
    @SerializedName("pinCode")
    @Nullable
    private final String pinCode;
    @SerializedName("pricePlanCode")
    @Nullable
    private final String pricePlanCode;
    @SerializedName("simCardNumber")
    @Nullable
    private final String simCardNumber;
    @SerializedName(InputPostpaidFamilySimSubscriberFragment.SUB_NUM)
    @Nullable
    private final String subscriberNumber;
    @SerializedName("subscriberPortIn")
    @Nullable
    private final String subscriberPortIn;
    @SerializedName("subscriberType")
    @Nullable
    private final String subscriberType;

    public SubscriberInfo() {
        this(null, null, null, null, null, null, null, null, 255, null);
    }

    @Nullable
    public final String component1() {
        return this.simCardNumber;
    }

    @Nullable
    public final String component2() {
        return this.subscriberType;
    }

    @Nullable
    public final String component3() {
        return this.pinCode;
    }

    @Nullable
    public final String component4() {
        return this.operatorDesc;
    }

    @Nullable
    public final String component5() {
        return this.subscriberNumber;
    }

    @Nullable
    public final String component6() {
        return this.pricePlanCode;
    }

    @Nullable
    public final String component7() {
        return this.operatorCode;
    }

    @Nullable
    public final String component8() {
        return this.subscriberPortIn;
    }

    @NotNull
    public final SubscriberInfo copy(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable String str6, @Nullable String str7, @Nullable String str8) {
        return new SubscriberInfo(str, str2, str3, str4, str5, str6, str7, str8);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof SubscriberInfo) {
            SubscriberInfo subscriberInfo = (SubscriberInfo) obj;
            return Intrinsics.areEqual(this.simCardNumber, subscriberInfo.simCardNumber) && Intrinsics.areEqual(this.subscriberType, subscriberInfo.subscriberType) && Intrinsics.areEqual(this.pinCode, subscriberInfo.pinCode) && Intrinsics.areEqual(this.operatorDesc, subscriberInfo.operatorDesc) && Intrinsics.areEqual(this.subscriberNumber, subscriberInfo.subscriberNumber) && Intrinsics.areEqual(this.pricePlanCode, subscriberInfo.pricePlanCode) && Intrinsics.areEqual(this.operatorCode, subscriberInfo.operatorCode) && Intrinsics.areEqual(this.subscriberPortIn, subscriberInfo.subscriberPortIn);
        }
        return false;
    }

    @Nullable
    public final String getOperatorCode() {
        return this.operatorCode;
    }

    @Nullable
    public final String getOperatorDesc() {
        return this.operatorDesc;
    }

    @Nullable
    public final String getPinCode() {
        return this.pinCode;
    }

    @Nullable
    public final String getPricePlanCode() {
        return this.pricePlanCode;
    }

    @Nullable
    public final String getSimCardNumber() {
        return this.simCardNumber;
    }

    @Nullable
    public final String getSubscriberNumber() {
        return this.subscriberNumber;
    }

    @Nullable
    public final String getSubscriberPortIn() {
        return this.subscriberPortIn;
    }

    @Nullable
    public final String getSubscriberType() {
        return this.subscriberType;
    }

    public int hashCode() {
        String str = this.simCardNumber;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.subscriberType;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.pinCode;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.operatorDesc;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.subscriberNumber;
        int hashCode5 = (hashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.pricePlanCode;
        int hashCode6 = (hashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.operatorCode;
        int hashCode7 = (hashCode6 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.subscriberPortIn;
        return hashCode7 + (str8 != null ? str8.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        String str = this.simCardNumber;
        String str2 = this.subscriberType;
        String str3 = this.pinCode;
        String str4 = this.operatorDesc;
        String str5 = this.subscriberNumber;
        String str6 = this.pricePlanCode;
        String str7 = this.operatorCode;
        String str8 = this.subscriberPortIn;
        return "SubscriberInfo(simCardNumber=" + str + ", subscriberType=" + str2 + ", pinCode=" + str3 + ", operatorDesc=" + str4 + ", subscriberNumber=" + str5 + ", pricePlanCode=" + str6 + ", operatorCode=" + str7 + ", subscriberPortIn=" + str8 + ")";
    }

    public SubscriberInfo(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable String str6, @Nullable String str7, @Nullable String str8) {
        this.simCardNumber = str;
        this.subscriberType = str2;
        this.pinCode = str3;
        this.operatorDesc = str4;
        this.subscriberNumber = str5;
        this.pricePlanCode = str6;
        this.operatorCode = str7;
        this.subscriberPortIn = str8;
    }

    public /* synthetic */ SubscriberInfo(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : str5, (i & 32) != 0 ? null : str6, (i & 64) != 0 ? null : str7, (i & 128) == 0 ? str8 : null);
    }
}
