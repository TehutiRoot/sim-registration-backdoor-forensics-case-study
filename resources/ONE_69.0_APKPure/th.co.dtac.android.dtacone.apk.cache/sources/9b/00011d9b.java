package th.p047co.dtac.android.dtacone.model.customerenquiry;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.internal.StabilityInferred;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.android.parcel.Parcelize;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import th.p047co.dtac.android.dtacone.view.fragment.mrtr_prepaid_registration.family_sim.InputPostpaidFamilySimSubscriberFragment;

@StabilityInferred(parameters = 0)
@Parcelize
@Metadata(m29143d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0018\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BY\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\nJ\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0003HÆ\u0003J]\u0010\u001a\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001J\u0013\u0010\u001d\u001a\u00020\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010 HÖ\u0003J\t\u0010!\u001a\u00020\u001cHÖ\u0001J\t\u0010\"\u001a\u00020\u0003HÖ\u0001J\u0019\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020&2\u0006\u0010'\u001a\u00020\u001cHÖ\u0001R\u0018\u0010\b\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\fR\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\fR\u0018\u0010\t\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\fR\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\fR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\f¨\u0006("}, m29142d2 = {"Lth/co/dtac/android/dtacone/model/customerenquiry/CheckEsimStatusRequest;", "Landroid/os/Parcelable;", "simCardNumber", "", "userLan", "pendingEsimCard", InputPostpaidFamilySimSubscriberFragment.SUB_NUM, "userFormatType", "cardStyle", "userCode", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getCardStyle", "()Ljava/lang/String;", "getPendingEsimCard", "getSimCardNumber", "getSubscriberNumber", "getUserCode", "getUserFormatType", "getUserLan", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.model.customerenquiry.CheckEsimStatusRequest */
/* loaded from: classes8.dex */
public final class CheckEsimStatusRequest implements Parcelable {
    public static final int $stable = 0;
    @NotNull
    public static final Parcelable.Creator<CheckEsimStatusRequest> CREATOR = new Creator();
    @SerializedName("cardStyle")
    @Nullable
    private final String cardStyle;
    @SerializedName("pendingEsimCard")
    @Nullable
    private final String pendingEsimCard;
    @SerializedName("simCardNumber")
    @Nullable
    private final String simCardNumber;
    @SerializedName(InputPostpaidFamilySimSubscriberFragment.SUB_NUM)
    @Nullable
    private final String subscriberNumber;
    @SerializedName("userCode")
    @Nullable
    private final String userCode;
    @SerializedName("userFormatType")
    @Nullable
    private final String userFormatType;
    @SerializedName("userLan")
    @Nullable
    private final String userLan;

    @Metadata(m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
    /* renamed from: th.co.dtac.android.dtacone.model.customerenquiry.CheckEsimStatusRequest$Creator */
    /* loaded from: classes8.dex */
    public static final class Creator implements Parcelable.Creator<CheckEsimStatusRequest> {
        @Override // android.os.Parcelable.Creator
        @NotNull
        public final CheckEsimStatusRequest createFromParcel(@NotNull Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new CheckEsimStatusRequest(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        @NotNull
        public final CheckEsimStatusRequest[] newArray(int i) {
            return new CheckEsimStatusRequest[i];
        }
    }

    public CheckEsimStatusRequest() {
        this(null, null, null, null, null, null, null, 127, null);
    }

    public static /* synthetic */ CheckEsimStatusRequest copy$default(CheckEsimStatusRequest checkEsimStatusRequest, String str, String str2, String str3, String str4, String str5, String str6, String str7, int i, Object obj) {
        if ((i & 1) != 0) {
            str = checkEsimStatusRequest.simCardNumber;
        }
        if ((i & 2) != 0) {
            str2 = checkEsimStatusRequest.userLan;
        }
        String str8 = str2;
        if ((i & 4) != 0) {
            str3 = checkEsimStatusRequest.pendingEsimCard;
        }
        String str9 = str3;
        if ((i & 8) != 0) {
            str4 = checkEsimStatusRequest.subscriberNumber;
        }
        String str10 = str4;
        if ((i & 16) != 0) {
            str5 = checkEsimStatusRequest.userFormatType;
        }
        String str11 = str5;
        if ((i & 32) != 0) {
            str6 = checkEsimStatusRequest.cardStyle;
        }
        String str12 = str6;
        if ((i & 64) != 0) {
            str7 = checkEsimStatusRequest.userCode;
        }
        return checkEsimStatusRequest.copy(str, str8, str9, str10, str11, str12, str7);
    }

    @Nullable
    public final String component1() {
        return this.simCardNumber;
    }

    @Nullable
    public final String component2() {
        return this.userLan;
    }

    @Nullable
    public final String component3() {
        return this.pendingEsimCard;
    }

    @Nullable
    public final String component4() {
        return this.subscriberNumber;
    }

    @Nullable
    public final String component5() {
        return this.userFormatType;
    }

    @Nullable
    public final String component6() {
        return this.cardStyle;
    }

    @Nullable
    public final String component7() {
        return this.userCode;
    }

    @NotNull
    public final CheckEsimStatusRequest copy(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable String str6, @Nullable String str7) {
        return new CheckEsimStatusRequest(str, str2, str3, str4, str5, str6, str7);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof CheckEsimStatusRequest) {
            CheckEsimStatusRequest checkEsimStatusRequest = (CheckEsimStatusRequest) obj;
            return Intrinsics.areEqual(this.simCardNumber, checkEsimStatusRequest.simCardNumber) && Intrinsics.areEqual(this.userLan, checkEsimStatusRequest.userLan) && Intrinsics.areEqual(this.pendingEsimCard, checkEsimStatusRequest.pendingEsimCard) && Intrinsics.areEqual(this.subscriberNumber, checkEsimStatusRequest.subscriberNumber) && Intrinsics.areEqual(this.userFormatType, checkEsimStatusRequest.userFormatType) && Intrinsics.areEqual(this.cardStyle, checkEsimStatusRequest.cardStyle) && Intrinsics.areEqual(this.userCode, checkEsimStatusRequest.userCode);
        }
        return false;
    }

    @Nullable
    public final String getCardStyle() {
        return this.cardStyle;
    }

    @Nullable
    public final String getPendingEsimCard() {
        return this.pendingEsimCard;
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
    public final String getUserCode() {
        return this.userCode;
    }

    @Nullable
    public final String getUserFormatType() {
        return this.userFormatType;
    }

    @Nullable
    public final String getUserLan() {
        return this.userLan;
    }

    public int hashCode() {
        String str = this.simCardNumber;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.userLan;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.pendingEsimCard;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.subscriberNumber;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.userFormatType;
        int hashCode5 = (hashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.cardStyle;
        int hashCode6 = (hashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.userCode;
        return hashCode6 + (str7 != null ? str7.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        String str = this.simCardNumber;
        String str2 = this.userLan;
        String str3 = this.pendingEsimCard;
        String str4 = this.subscriberNumber;
        String str5 = this.userFormatType;
        String str6 = this.cardStyle;
        String str7 = this.userCode;
        return "CheckEsimStatusRequest(simCardNumber=" + str + ", userLan=" + str2 + ", pendingEsimCard=" + str3 + ", subscriberNumber=" + str4 + ", userFormatType=" + str5 + ", cardStyle=" + str6 + ", userCode=" + str7 + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel out, int i) {
        Intrinsics.checkNotNullParameter(out, "out");
        out.writeString(this.simCardNumber);
        out.writeString(this.userLan);
        out.writeString(this.pendingEsimCard);
        out.writeString(this.subscriberNumber);
        out.writeString(this.userFormatType);
        out.writeString(this.cardStyle);
        out.writeString(this.userCode);
    }

    public CheckEsimStatusRequest(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable String str6, @Nullable String str7) {
        this.simCardNumber = str;
        this.userLan = str2;
        this.pendingEsimCard = str3;
        this.subscriberNumber = str4;
        this.userFormatType = str5;
        this.cardStyle = str6;
        this.userCode = str7;
    }

    public /* synthetic */ CheckEsimStatusRequest(String str, String str2, String str3, String str4, String str5, String str6, String str7, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : str5, (i & 32) != 0 ? null : str6, (i & 64) != 0 ? null : str7);
    }
}