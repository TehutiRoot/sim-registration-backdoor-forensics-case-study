package th.p047co.dtac.android.dtacone.model.appOne.topup;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.core.app.FrameMetricsAggregator;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import th.p047co.dtac.android.dtacone.manager.security.SecurePin;
import th.p047co.dtac.android.dtacone.view.fragment.mrtr_prepaid_registration.family_sim.InputPostpaidFamilySimSubscriberFragment;

@StabilityInferred(parameters = 0)
@Metadata(m29143d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b \n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001Bq\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\u000fJ\u000b\u0010\u001e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\u001f\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u0011J\u000b\u0010 \u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010!\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010\"\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010#\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010$\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010%\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010&\u001a\u0004\u0018\u00010\u0007HÆ\u0003Jz\u0010'\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0007HÆ\u0001¢\u0006\u0002\u0010(J\u0013\u0010)\u001a\u00020*2\b\u0010+\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010,\u001a\u00020-HÖ\u0001J\t\u0010.\u001a\u00020\u0007HÖ\u0001R\u001a\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u0012\u001a\u0004\b\u0010\u0010\u0011R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0018\u0010\b\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0018\u0010\f\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0018\u0010\n\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0018R\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0018R\u0018\u0010\u000e\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0018R\u0018\u0010\u000b\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0018R\u0018\u0010\r\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0018¨\u0006/"}, m29142d2 = {"Lth/co/dtac/android/dtacone/model/appOne/topup/OneTopUpRequest;", "", "offer", "Lth/co/dtac/android/dtacone/model/appOne/topup/Offer;", "amount", "", "requesterId", "", "pin", "Lth/co/dtac/android/dtacone/manager/security/SecurePin;", "requesterChannel", InputPostpaidFamilySimSubscriberFragment.SUB_NUM, "requesterApplication", "userCode", "requesterZone", "(Lth/co/dtac/android/dtacone/model/appOne/topup/Offer;Ljava/lang/Double;Ljava/lang/String;Lth/co/dtac/android/dtacone/manager/security/SecurePin;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getAmount", "()Ljava/lang/Double;", "Ljava/lang/Double;", "getOffer", "()Lth/co/dtac/android/dtacone/model/appOne/topup/Offer;", "getPin", "()Lth/co/dtac/android/dtacone/manager/security/SecurePin;", "getRequesterApplication", "()Ljava/lang/String;", "getRequesterChannel", "getRequesterId", "getRequesterZone", "getSubscriberNumber", "getUserCode", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Lth/co/dtac/android/dtacone/model/appOne/topup/Offer;Ljava/lang/Double;Ljava/lang/String;Lth/co/dtac/android/dtacone/manager/security/SecurePin;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lth/co/dtac/android/dtacone/model/appOne/topup/OneTopUpRequest;", "equals", "", "other", "hashCode", "", "toString", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.model.appOne.topup.OneTopUpRequest */
/* loaded from: classes8.dex */
public final class OneTopUpRequest {
    public static final int $stable = 8;
    @SerializedName("amount")
    @Nullable
    private final Double amount;
    @SerializedName("offer")
    @Nullable
    private final Offer offer;
    @SerializedName("pin")
    @Nullable
    private final SecurePin pin;
    @SerializedName("requesterApplication")
    @Nullable
    private final String requesterApplication;
    @SerializedName("requesterChannel")
    @Nullable
    private final String requesterChannel;
    @SerializedName("requesterId")
    @Nullable
    private final String requesterId;
    @SerializedName("requesterZone")
    @Nullable
    private final String requesterZone;
    @SerializedName(InputPostpaidFamilySimSubscriberFragment.SUB_NUM)
    @Nullable
    private final String subscriberNumber;
    @SerializedName("userCode")
    @Nullable
    private final String userCode;

    public OneTopUpRequest() {
        this(null, null, null, null, null, null, null, null, null, FrameMetricsAggregator.EVERY_DURATION, null);
    }

    @Nullable
    public final Offer component1() {
        return this.offer;
    }

    @Nullable
    public final Double component2() {
        return this.amount;
    }

    @Nullable
    public final String component3() {
        return this.requesterId;
    }

    @Nullable
    public final SecurePin component4() {
        return this.pin;
    }

    @Nullable
    public final String component5() {
        return this.requesterChannel;
    }

    @Nullable
    public final String component6() {
        return this.subscriberNumber;
    }

    @Nullable
    public final String component7() {
        return this.requesterApplication;
    }

    @Nullable
    public final String component8() {
        return this.userCode;
    }

    @Nullable
    public final String component9() {
        return this.requesterZone;
    }

    @NotNull
    public final OneTopUpRequest copy(@Nullable Offer offer, @Nullable Double d, @Nullable String str, @Nullable SecurePin securePin, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable String str6) {
        return new OneTopUpRequest(offer, d, str, securePin, str2, str3, str4, str5, str6);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof OneTopUpRequest) {
            OneTopUpRequest oneTopUpRequest = (OneTopUpRequest) obj;
            return Intrinsics.areEqual(this.offer, oneTopUpRequest.offer) && Intrinsics.areEqual((Object) this.amount, (Object) oneTopUpRequest.amount) && Intrinsics.areEqual(this.requesterId, oneTopUpRequest.requesterId) && Intrinsics.areEqual(this.pin, oneTopUpRequest.pin) && Intrinsics.areEqual(this.requesterChannel, oneTopUpRequest.requesterChannel) && Intrinsics.areEqual(this.subscriberNumber, oneTopUpRequest.subscriberNumber) && Intrinsics.areEqual(this.requesterApplication, oneTopUpRequest.requesterApplication) && Intrinsics.areEqual(this.userCode, oneTopUpRequest.userCode) && Intrinsics.areEqual(this.requesterZone, oneTopUpRequest.requesterZone);
        }
        return false;
    }

    @Nullable
    public final Double getAmount() {
        return this.amount;
    }

    @Nullable
    public final Offer getOffer() {
        return this.offer;
    }

    @Nullable
    public final SecurePin getPin() {
        return this.pin;
    }

    @Nullable
    public final String getRequesterApplication() {
        return this.requesterApplication;
    }

    @Nullable
    public final String getRequesterChannel() {
        return this.requesterChannel;
    }

    @Nullable
    public final String getRequesterId() {
        return this.requesterId;
    }

    @Nullable
    public final String getRequesterZone() {
        return this.requesterZone;
    }

    @Nullable
    public final String getSubscriberNumber() {
        return this.subscriberNumber;
    }

    @Nullable
    public final String getUserCode() {
        return this.userCode;
    }

    public int hashCode() {
        Offer offer = this.offer;
        int hashCode = (offer == null ? 0 : offer.hashCode()) * 31;
        Double d = this.amount;
        int hashCode2 = (hashCode + (d == null ? 0 : d.hashCode())) * 31;
        String str = this.requesterId;
        int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        SecurePin securePin = this.pin;
        int hashCode4 = (hashCode3 + (securePin == null ? 0 : securePin.hashCode())) * 31;
        String str2 = this.requesterChannel;
        int hashCode5 = (hashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.subscriberNumber;
        int hashCode6 = (hashCode5 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.requesterApplication;
        int hashCode7 = (hashCode6 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.userCode;
        int hashCode8 = (hashCode7 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.requesterZone;
        return hashCode8 + (str6 != null ? str6.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        Offer offer = this.offer;
        Double d = this.amount;
        String str = this.requesterId;
        SecurePin securePin = this.pin;
        String str2 = this.requesterChannel;
        String str3 = this.subscriberNumber;
        String str4 = this.requesterApplication;
        String str5 = this.userCode;
        String str6 = this.requesterZone;
        return "OneTopUpRequest(offer=" + offer + ", amount=" + d + ", requesterId=" + str + ", pin=" + securePin + ", requesterChannel=" + str2 + ", subscriberNumber=" + str3 + ", requesterApplication=" + str4 + ", userCode=" + str5 + ", requesterZone=" + str6 + ")";
    }

    public OneTopUpRequest(@Nullable Offer offer, @Nullable Double d, @Nullable String str, @Nullable SecurePin securePin, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable String str6) {
        this.offer = offer;
        this.amount = d;
        this.requesterId = str;
        this.pin = securePin;
        this.requesterChannel = str2;
        this.subscriberNumber = str3;
        this.requesterApplication = str4;
        this.userCode = str5;
        this.requesterZone = str6;
    }

    public /* synthetic */ OneTopUpRequest(Offer offer, Double d, String str, SecurePin securePin, String str2, String str3, String str4, String str5, String str6, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : offer, (i & 2) != 0 ? null : d, (i & 4) != 0 ? null : str, (i & 8) != 0 ? null : securePin, (i & 16) != 0 ? null : str2, (i & 32) != 0 ? null : str3, (i & 64) != 0 ? null : str4, (i & 128) != 0 ? null : str5, (i & 256) == 0 ? str6 : null);
    }
}