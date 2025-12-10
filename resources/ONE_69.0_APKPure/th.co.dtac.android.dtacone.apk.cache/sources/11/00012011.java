package th.p047co.dtac.android.dtacone.model.prepaid;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.internal.StabilityInferred;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 0)
@Metadata(m29143d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0013\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 '2\u00020\u0001:\u0001'B\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004B?\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\t\u001a\u00020\n\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\rJ\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\t\u0010\u0019\u001a\u00020\nHÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0006HÆ\u0003JO\u0010\u001c\u001a\u00020\u00002\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\t\u001a\u00020\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0006HÆ\u0001J\b\u0010\u001d\u001a\u00020\u001eH\u0016J\u0013\u0010\u001f\u001a\u00020\n2\b\u0010 \u001a\u0004\u0018\u00010!HÖ\u0003J\t\u0010\"\u001a\u00020\u001eHÖ\u0001J\t\u0010#\u001a\u00020\u0006HÖ\u0001J\u0018\u0010$\u001a\u00020%2\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010&\u001a\u00020\u001eH\u0016R\u0018\u0010\b\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000fR\u0013\u0010\u000b\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000fR\u0013\u0010\f\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u000fR\u0016\u0010\t\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015¨\u0006("}, m29142d2 = {"Lth/co/dtac/android/dtacone/model/prepaid/PrepaidActivationRequest;", "Landroid/os/Parcelable;", "parcel", "Landroid/os/Parcel;", "(Landroid/os/Parcel;)V", "rtrTransactionId", "", "nontelcoConsentType", "consentVersionLabel", "updateConsent", "", "simType", "subscribeNumber", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;)V", "getConsentVersionLabel", "()Ljava/lang/String;", "getNontelcoConsentType", "getRtrTransactionId", "getSimType", "getSubscribeNumber", "getUpdateConsent", "()Z", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "describeContents", "", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "flags", "CREATOR", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.model.prepaid.PrepaidActivationRequest */
/* loaded from: classes8.dex */
public final class PrepaidActivationRequest implements Parcelable {
    public static final int $stable = 0;
    @NotNull
    public static final CREATOR CREATOR = new CREATOR(null);
    @SerializedName("consentVersionLabel")
    @Nullable
    private final String consentVersionLabel;
    @SerializedName("nontelcoConsentType")
    @Nullable
    private final String nontelcoConsentType;
    @SerializedName("rtrTransactionId")
    @Nullable
    private final String rtrTransactionId;
    @Nullable
    private final transient String simType;
    @Nullable
    private final transient String subscribeNumber;
    @SerializedName("updateConsent")
    private final boolean updateConsent;

    @Metadata(m29143d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u001d\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0016¢\u0006\u0002\u0010\u000b¨\u0006\f"}, m29142d2 = {"Lth/co/dtac/android/dtacone/model/prepaid/PrepaidActivationRequest$CREATOR;", "Landroid/os/Parcelable$Creator;", "Lth/co/dtac/android/dtacone/model/prepaid/PrepaidActivationRequest;", "()V", "createFromParcel", "parcel", "Landroid/os/Parcel;", "newArray", "", "size", "", "(I)[Lth/co/dtac/android/dtacone/model/prepaid/PrepaidActivationRequest;", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0}, m29138xi = 48)
    /* renamed from: th.co.dtac.android.dtacone.model.prepaid.PrepaidActivationRequest$CREATOR */
    /* loaded from: classes8.dex */
    public static final class CREATOR implements Parcelable.Creator<PrepaidActivationRequest> {
        public /* synthetic */ CREATOR(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private CREATOR() {
        }

        @Override // android.os.Parcelable.Creator
        @NotNull
        public PrepaidActivationRequest createFromParcel(@NotNull Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new PrepaidActivationRequest(parcel);
        }

        @Override // android.os.Parcelable.Creator
        @NotNull
        public PrepaidActivationRequest[] newArray(int i) {
            return new PrepaidActivationRequest[i];
        }
    }

    public PrepaidActivationRequest(@Nullable String str, @Nullable String str2, @Nullable String str3, boolean z, @Nullable String str4, @Nullable String str5) {
        this.rtrTransactionId = str;
        this.nontelcoConsentType = str2;
        this.consentVersionLabel = str3;
        this.updateConsent = z;
        this.simType = str4;
        this.subscribeNumber = str5;
    }

    public static /* synthetic */ PrepaidActivationRequest copy$default(PrepaidActivationRequest prepaidActivationRequest, String str, String str2, String str3, boolean z, String str4, String str5, int i, Object obj) {
        if ((i & 1) != 0) {
            str = prepaidActivationRequest.rtrTransactionId;
        }
        if ((i & 2) != 0) {
            str2 = prepaidActivationRequest.nontelcoConsentType;
        }
        String str6 = str2;
        if ((i & 4) != 0) {
            str3 = prepaidActivationRequest.consentVersionLabel;
        }
        String str7 = str3;
        if ((i & 8) != 0) {
            z = prepaidActivationRequest.updateConsent;
        }
        boolean z2 = z;
        if ((i & 16) != 0) {
            str4 = prepaidActivationRequest.simType;
        }
        String str8 = str4;
        if ((i & 32) != 0) {
            str5 = prepaidActivationRequest.subscribeNumber;
        }
        return prepaidActivationRequest.copy(str, str6, str7, z2, str8, str5);
    }

    @Nullable
    public final String component1() {
        return this.rtrTransactionId;
    }

    @Nullable
    public final String component2() {
        return this.nontelcoConsentType;
    }

    @Nullable
    public final String component3() {
        return this.consentVersionLabel;
    }

    public final boolean component4() {
        return this.updateConsent;
    }

    @Nullable
    public final String component5() {
        return this.simType;
    }

    @Nullable
    public final String component6() {
        return this.subscribeNumber;
    }

    @NotNull
    public final PrepaidActivationRequest copy(@Nullable String str, @Nullable String str2, @Nullable String str3, boolean z, @Nullable String str4, @Nullable String str5) {
        return new PrepaidActivationRequest(str, str2, str3, z, str4, str5);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof PrepaidActivationRequest) {
            PrepaidActivationRequest prepaidActivationRequest = (PrepaidActivationRequest) obj;
            return Intrinsics.areEqual(this.rtrTransactionId, prepaidActivationRequest.rtrTransactionId) && Intrinsics.areEqual(this.nontelcoConsentType, prepaidActivationRequest.nontelcoConsentType) && Intrinsics.areEqual(this.consentVersionLabel, prepaidActivationRequest.consentVersionLabel) && this.updateConsent == prepaidActivationRequest.updateConsent && Intrinsics.areEqual(this.simType, prepaidActivationRequest.simType) && Intrinsics.areEqual(this.subscribeNumber, prepaidActivationRequest.subscribeNumber);
        }
        return false;
    }

    @Nullable
    public final String getConsentVersionLabel() {
        return this.consentVersionLabel;
    }

    @Nullable
    public final String getNontelcoConsentType() {
        return this.nontelcoConsentType;
    }

    @Nullable
    public final String getRtrTransactionId() {
        return this.rtrTransactionId;
    }

    @Nullable
    public final String getSimType() {
        return this.simType;
    }

    @Nullable
    public final String getSubscribeNumber() {
        return this.subscribeNumber;
    }

    public final boolean getUpdateConsent() {
        return this.updateConsent;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        String str = this.rtrTransactionId;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.nontelcoConsentType;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.consentVersionLabel;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        boolean z = this.updateConsent;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        int i2 = (hashCode3 + i) * 31;
        String str4 = this.simType;
        int hashCode4 = (i2 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.subscribeNumber;
        return hashCode4 + (str5 != null ? str5.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        String str = this.rtrTransactionId;
        String str2 = this.nontelcoConsentType;
        String str3 = this.consentVersionLabel;
        boolean z = this.updateConsent;
        String str4 = this.simType;
        String str5 = this.subscribeNumber;
        return "PrepaidActivationRequest(rtrTransactionId=" + str + ", nontelcoConsentType=" + str2 + ", consentVersionLabel=" + str3 + ", updateConsent=" + z + ", simType=" + str4 + ", subscribeNumber=" + str5 + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "parcel");
        parcel.writeString(this.rtrTransactionId);
        parcel.writeString(this.nontelcoConsentType);
        parcel.writeString(this.consentVersionLabel);
        parcel.writeByte(this.updateConsent ? (byte) 1 : (byte) 0);
        parcel.writeString(this.simType);
        parcel.writeString(this.subscribeNumber);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public PrepaidActivationRequest(@NotNull Parcel parcel) {
        this(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readByte() != 0, parcel.readString(), parcel.readString());
        Intrinsics.checkNotNullParameter(parcel, "parcel");
    }
}