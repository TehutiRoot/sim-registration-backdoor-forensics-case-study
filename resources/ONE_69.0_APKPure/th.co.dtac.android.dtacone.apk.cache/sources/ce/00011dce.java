package th.p047co.dtac.android.dtacone.model.customerenquiry;

import androidx.compose.runtime.internal.StabilityInferred;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import th.p047co.dtac.android.dtacone.util.constant.customerenquiry.ConstsKt;
import th.p047co.dtac.android.dtacone.view.fragment.mrtr_prepaid_registration.family_sim.InputPostpaidFamilySimSubscriberFragment;

@StabilityInferred(parameters = 0)
@Metadata(m29143d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0018\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B=\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0003¢\u0006\u0002\u0010\nJ\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003JO\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001e\u001a\u00020\u001fHÖ\u0001J\t\u0010 \u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0016\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\fR\u0016\u0010\u0006\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\fR\u0016\u0010\u0007\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\fR\u0016\u0010\t\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\fR\u0016\u0010\b\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\f¨\u0006!"}, m29142d2 = {"Lth/co/dtac/android/dtacone/model/customerenquiry/NBTCVerifyRequest;", "", "customerNumber", "", "simCardNumber", InputPostpaidFamilySimSubscriberFragment.SUB_NUM, ConstsKt.TELEPHONE_TYPE, "userCode", "userLan", "userFormatType", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getCustomerNumber", "()Ljava/lang/String;", "getSimCardNumber", "getSubscriberNumber", "getTelephoneType", "getUserCode", "getUserFormatType", "getUserLan", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "", "other", "hashCode", "", "toString", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.model.customerenquiry.NBTCVerifyRequest */
/* loaded from: classes8.dex */
public final class NBTCVerifyRequest {
    public static final int $stable = 0;
    @SerializedName("customerNumber")
    @NotNull
    private final String customerNumber;
    @SerializedName("simCardNumber")
    @NotNull
    private final String simCardNumber;
    @SerializedName(InputPostpaidFamilySimSubscriberFragment.SUB_NUM)
    @NotNull
    private final String subscriberNumber;
    @SerializedName(ConstsKt.TELEPHONE_TYPE)
    @NotNull
    private final String telephoneType;
    @SerializedName("userCode")
    @NotNull
    private final String userCode;
    @SerializedName("userFormatType")
    @NotNull
    private final String userFormatType;
    @SerializedName("userLan")
    @NotNull
    private final String userLan;

    public NBTCVerifyRequest(@NotNull String customerNumber, @NotNull String simCardNumber, @NotNull String subscriberNumber, @NotNull String telephoneType, @NotNull String userCode, @NotNull String userLan, @NotNull String userFormatType) {
        Intrinsics.checkNotNullParameter(customerNumber, "customerNumber");
        Intrinsics.checkNotNullParameter(simCardNumber, "simCardNumber");
        Intrinsics.checkNotNullParameter(subscriberNumber, "subscriberNumber");
        Intrinsics.checkNotNullParameter(telephoneType, "telephoneType");
        Intrinsics.checkNotNullParameter(userCode, "userCode");
        Intrinsics.checkNotNullParameter(userLan, "userLan");
        Intrinsics.checkNotNullParameter(userFormatType, "userFormatType");
        this.customerNumber = customerNumber;
        this.simCardNumber = simCardNumber;
        this.subscriberNumber = subscriberNumber;
        this.telephoneType = telephoneType;
        this.userCode = userCode;
        this.userLan = userLan;
        this.userFormatType = userFormatType;
    }

    public static /* synthetic */ NBTCVerifyRequest copy$default(NBTCVerifyRequest nBTCVerifyRequest, String str, String str2, String str3, String str4, String str5, String str6, String str7, int i, Object obj) {
        if ((i & 1) != 0) {
            str = nBTCVerifyRequest.customerNumber;
        }
        if ((i & 2) != 0) {
            str2 = nBTCVerifyRequest.simCardNumber;
        }
        String str8 = str2;
        if ((i & 4) != 0) {
            str3 = nBTCVerifyRequest.subscriberNumber;
        }
        String str9 = str3;
        if ((i & 8) != 0) {
            str4 = nBTCVerifyRequest.telephoneType;
        }
        String str10 = str4;
        if ((i & 16) != 0) {
            str5 = nBTCVerifyRequest.userCode;
        }
        String str11 = str5;
        if ((i & 32) != 0) {
            str6 = nBTCVerifyRequest.userLan;
        }
        String str12 = str6;
        if ((i & 64) != 0) {
            str7 = nBTCVerifyRequest.userFormatType;
        }
        return nBTCVerifyRequest.copy(str, str8, str9, str10, str11, str12, str7);
    }

    @NotNull
    public final String component1() {
        return this.customerNumber;
    }

    @NotNull
    public final String component2() {
        return this.simCardNumber;
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
    public final NBTCVerifyRequest copy(@NotNull String customerNumber, @NotNull String simCardNumber, @NotNull String subscriberNumber, @NotNull String telephoneType, @NotNull String userCode, @NotNull String userLan, @NotNull String userFormatType) {
        Intrinsics.checkNotNullParameter(customerNumber, "customerNumber");
        Intrinsics.checkNotNullParameter(simCardNumber, "simCardNumber");
        Intrinsics.checkNotNullParameter(subscriberNumber, "subscriberNumber");
        Intrinsics.checkNotNullParameter(telephoneType, "telephoneType");
        Intrinsics.checkNotNullParameter(userCode, "userCode");
        Intrinsics.checkNotNullParameter(userLan, "userLan");
        Intrinsics.checkNotNullParameter(userFormatType, "userFormatType");
        return new NBTCVerifyRequest(customerNumber, simCardNumber, subscriberNumber, telephoneType, userCode, userLan, userFormatType);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof NBTCVerifyRequest) {
            NBTCVerifyRequest nBTCVerifyRequest = (NBTCVerifyRequest) obj;
            return Intrinsics.areEqual(this.customerNumber, nBTCVerifyRequest.customerNumber) && Intrinsics.areEqual(this.simCardNumber, nBTCVerifyRequest.simCardNumber) && Intrinsics.areEqual(this.subscriberNumber, nBTCVerifyRequest.subscriberNumber) && Intrinsics.areEqual(this.telephoneType, nBTCVerifyRequest.telephoneType) && Intrinsics.areEqual(this.userCode, nBTCVerifyRequest.userCode) && Intrinsics.areEqual(this.userLan, nBTCVerifyRequest.userLan) && Intrinsics.areEqual(this.userFormatType, nBTCVerifyRequest.userFormatType);
        }
        return false;
    }

    @NotNull
    public final String getCustomerNumber() {
        return this.customerNumber;
    }

    @NotNull
    public final String getSimCardNumber() {
        return this.simCardNumber;
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
        return (((((((((((this.customerNumber.hashCode() * 31) + this.simCardNumber.hashCode()) * 31) + this.subscriberNumber.hashCode()) * 31) + this.telephoneType.hashCode()) * 31) + this.userCode.hashCode()) * 31) + this.userLan.hashCode()) * 31) + this.userFormatType.hashCode();
    }

    @NotNull
    public String toString() {
        String str = this.customerNumber;
        String str2 = this.simCardNumber;
        String str3 = this.subscriberNumber;
        String str4 = this.telephoneType;
        String str5 = this.userCode;
        String str6 = this.userLan;
        String str7 = this.userFormatType;
        return "NBTCVerifyRequest(customerNumber=" + str + ", simCardNumber=" + str2 + ", subscriberNumber=" + str3 + ", telephoneType=" + str4 + ", userCode=" + str5 + ", userLan=" + str6 + ", userFormatType=" + str7 + ")";
    }
}