package th.p047co.dtac.android.dtacone.model.customerenquiry;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.core.app.NotificationCompat;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.android.parcel.Parcelize;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 0)
@Parcelize
@Metadata(m28851d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u001b\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001Be\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u000bJ\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0003HÆ\u0003Ji\u0010\u001d\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\t\u0010\u001e\u001a\u00020\u001fHÖ\u0001J\u0013\u0010 \u001a\u00020!2\b\u0010\"\u001a\u0004\u0018\u00010#HÖ\u0003J\t\u0010$\u001a\u00020\u001fHÖ\u0001J\t\u0010%\u001a\u00020\u0003HÖ\u0001J\u0019\u0010&\u001a\u00020'2\u0006\u0010(\u001a\u00020)2\u0006\u0010*\u001a\u00020\u001fHÖ\u0001R\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0018\u0010\n\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\rR\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\rR\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\rR\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\rR\u0018\u0010\t\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\rR\u0018\u0010\b\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\r¨\u0006+"}, m28850d2 = {"Lth/co/dtac/android/dtacone/model/customerenquiry/InfoItem;", "Landroid/os/Parcelable;", "reason", "", "contractStartDate", "contractEndDate", FirebaseAnalytics.Param.DISCOUNT, "model", NotificationCompat.CATEGORY_STATUS, "remainingPeriod", "contractPeriod", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getContractEndDate", "()Ljava/lang/String;", "getContractPeriod", "getContractStartDate", "getDiscount", "getModel", "getReason", "getRemainingPeriod", "getStatus", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "app_prodRelease"}, m28849k = 1, m28848mv = {1, 8, 0}, m28846xi = 48)
/* renamed from: th.co.dtac.android.dtacone.model.customerenquiry.InfoItem */
/* loaded from: classes8.dex */
public final class InfoItem implements Parcelable {
    public static final int $stable = 0;
    @NotNull
    public static final Parcelable.Creator<InfoItem> CREATOR = new Creator();
    @SerializedName("contractEndDate")
    @Nullable
    private final String contractEndDate;
    @SerializedName("contractPeriod")
    @Nullable
    private final String contractPeriod;
    @SerializedName("contractStartDate")
    @Nullable
    private final String contractStartDate;
    @SerializedName(FirebaseAnalytics.Param.DISCOUNT)
    @Nullable
    private final String discount;
    @SerializedName("model")
    @Nullable
    private final String model;
    @SerializedName("reason")
    @Nullable
    private final String reason;
    @SerializedName("remainingPeriod")
    @Nullable
    private final String remainingPeriod;
    @SerializedName(NotificationCompat.CATEGORY_STATUS)
    @Nullable
    private final String status;

    @Metadata(m28849k = 3, m28848mv = {1, 8, 0}, m28846xi = 48)
    /* renamed from: th.co.dtac.android.dtacone.model.customerenquiry.InfoItem$Creator */
    /* loaded from: classes8.dex */
    public static final class Creator implements Parcelable.Creator<InfoItem> {
        @Override // android.os.Parcelable.Creator
        @NotNull
        public final InfoItem createFromParcel(@NotNull Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new InfoItem(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        @NotNull
        public final InfoItem[] newArray(int i) {
            return new InfoItem[i];
        }
    }

    public InfoItem() {
        this(null, null, null, null, null, null, null, null, 255, null);
    }

    @Nullable
    public final String component1() {
        return this.reason;
    }

    @Nullable
    public final String component2() {
        return this.contractStartDate;
    }

    @Nullable
    public final String component3() {
        return this.contractEndDate;
    }

    @Nullable
    public final String component4() {
        return this.discount;
    }

    @Nullable
    public final String component5() {
        return this.model;
    }

    @Nullable
    public final String component6() {
        return this.status;
    }

    @Nullable
    public final String component7() {
        return this.remainingPeriod;
    }

    @Nullable
    public final String component8() {
        return this.contractPeriod;
    }

    @NotNull
    public final InfoItem copy(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable String str6, @Nullable String str7, @Nullable String str8) {
        return new InfoItem(str, str2, str3, str4, str5, str6, str7, str8);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof InfoItem) {
            InfoItem infoItem = (InfoItem) obj;
            return Intrinsics.areEqual(this.reason, infoItem.reason) && Intrinsics.areEqual(this.contractStartDate, infoItem.contractStartDate) && Intrinsics.areEqual(this.contractEndDate, infoItem.contractEndDate) && Intrinsics.areEqual(this.discount, infoItem.discount) && Intrinsics.areEqual(this.model, infoItem.model) && Intrinsics.areEqual(this.status, infoItem.status) && Intrinsics.areEqual(this.remainingPeriod, infoItem.remainingPeriod) && Intrinsics.areEqual(this.contractPeriod, infoItem.contractPeriod);
        }
        return false;
    }

    @Nullable
    public final String getContractEndDate() {
        return this.contractEndDate;
    }

    @Nullable
    public final String getContractPeriod() {
        return this.contractPeriod;
    }

    @Nullable
    public final String getContractStartDate() {
        return this.contractStartDate;
    }

    @Nullable
    public final String getDiscount() {
        return this.discount;
    }

    @Nullable
    public final String getModel() {
        return this.model;
    }

    @Nullable
    public final String getReason() {
        return this.reason;
    }

    @Nullable
    public final String getRemainingPeriod() {
        return this.remainingPeriod;
    }

    @Nullable
    public final String getStatus() {
        return this.status;
    }

    public int hashCode() {
        String str = this.reason;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.contractStartDate;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.contractEndDate;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.discount;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.model;
        int hashCode5 = (hashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.status;
        int hashCode6 = (hashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.remainingPeriod;
        int hashCode7 = (hashCode6 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.contractPeriod;
        return hashCode7 + (str8 != null ? str8.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        String str = this.reason;
        String str2 = this.contractStartDate;
        String str3 = this.contractEndDate;
        String str4 = this.discount;
        String str5 = this.model;
        String str6 = this.status;
        String str7 = this.remainingPeriod;
        String str8 = this.contractPeriod;
        return "InfoItem(reason=" + str + ", contractStartDate=" + str2 + ", contractEndDate=" + str3 + ", discount=" + str4 + ", model=" + str5 + ", status=" + str6 + ", remainingPeriod=" + str7 + ", contractPeriod=" + str8 + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel out, int i) {
        Intrinsics.checkNotNullParameter(out, "out");
        out.writeString(this.reason);
        out.writeString(this.contractStartDate);
        out.writeString(this.contractEndDate);
        out.writeString(this.discount);
        out.writeString(this.model);
        out.writeString(this.status);
        out.writeString(this.remainingPeriod);
        out.writeString(this.contractPeriod);
    }

    public InfoItem(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable String str6, @Nullable String str7, @Nullable String str8) {
        this.reason = str;
        this.contractStartDate = str2;
        this.contractEndDate = str3;
        this.discount = str4;
        this.model = str5;
        this.status = str6;
        this.remainingPeriod = str7;
        this.contractPeriod = str8;
    }

    public /* synthetic */ InfoItem(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : str5, (i & 32) != 0 ? null : str6, (i & 64) != 0 ? null : str7, (i & 128) == 0 ? str8 : null);
    }
}
