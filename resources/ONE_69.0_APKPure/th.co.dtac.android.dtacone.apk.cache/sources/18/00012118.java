package th.p047co.dtac.android.dtacone.model.withDevice.comfirm;

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
@Metadata(m29143d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 \u00172\u00020\u0001:\u0001\u0017B\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004B-\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\n\u001a\u0004\u0018\u00010\b¢\u0006\u0002\u0010\u000bJ\b\u0010\u0012\u001a\u00020\u0013H\u0016J\u0018\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0016\u001a\u00020\u0013H\u0016R\u0018\u0010\t\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0018\u0010\n\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\rR\u0018\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\r¨\u0006\u0018"}, m29142d2 = {"Lth/co/dtac/android/dtacone/model/withDevice/comfirm/WithDeviceConfirmRequest;", "Landroid/os/Parcelable;", "parcel", "Landroid/os/Parcel;", "(Landroid/os/Parcel;)V", "saveLegalAddress", "Lth/co/dtac/android/dtacone/model/withDevice/comfirm/LegalAddress;", "transactionId", "", "saleOrderTranId", "signatureImage", "(Lth/co/dtac/android/dtacone/model/withDevice/comfirm/LegalAddress;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getSaleOrderTranId", "()Ljava/lang/String;", "getSaveLegalAddress", "()Lth/co/dtac/android/dtacone/model/withDevice/comfirm/LegalAddress;", "getSignatureImage", "getTransactionId", "describeContents", "", "writeToParcel", "", "flags", "CREATOR", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.model.withDevice.comfirm.WithDeviceConfirmRequest */
/* loaded from: classes8.dex */
public final class WithDeviceConfirmRequest implements Parcelable {
    public static final int $stable = 0;
    @NotNull
    public static final CREATOR CREATOR = new CREATOR(null);
    @SerializedName("saleOrderTranId")
    @Nullable
    private final String saleOrderTranId;
    @SerializedName("legalAddress")
    @Nullable
    private final LegalAddress saveLegalAddress;
    @SerializedName("signatureImage")
    @Nullable
    private final String signatureImage;
    @SerializedName("transactionId")
    @Nullable
    private final String transactionId;

    @Metadata(m29143d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u001d\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0016¢\u0006\u0002\u0010\u000b¨\u0006\f"}, m29142d2 = {"Lth/co/dtac/android/dtacone/model/withDevice/comfirm/WithDeviceConfirmRequest$CREATOR;", "Landroid/os/Parcelable$Creator;", "Lth/co/dtac/android/dtacone/model/withDevice/comfirm/WithDeviceConfirmRequest;", "()V", "createFromParcel", "parcel", "Landroid/os/Parcel;", "newArray", "", "size", "", "(I)[Lth/co/dtac/android/dtacone/model/withDevice/comfirm/WithDeviceConfirmRequest;", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0}, m29138xi = 48)
    /* renamed from: th.co.dtac.android.dtacone.model.withDevice.comfirm.WithDeviceConfirmRequest$CREATOR */
    /* loaded from: classes8.dex */
    public static final class CREATOR implements Parcelable.Creator<WithDeviceConfirmRequest> {
        public /* synthetic */ CREATOR(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private CREATOR() {
        }

        @Override // android.os.Parcelable.Creator
        @NotNull
        public WithDeviceConfirmRequest createFromParcel(@NotNull Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new WithDeviceConfirmRequest(parcel);
        }

        @Override // android.os.Parcelable.Creator
        @NotNull
        public WithDeviceConfirmRequest[] newArray(int i) {
            return new WithDeviceConfirmRequest[i];
        }
    }

    public WithDeviceConfirmRequest(@Nullable LegalAddress legalAddress, @Nullable String str, @Nullable String str2, @Nullable String str3) {
        this.saveLegalAddress = legalAddress;
        this.transactionId = str;
        this.saleOrderTranId = str2;
        this.signatureImage = str3;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Nullable
    public final String getSaleOrderTranId() {
        return this.saleOrderTranId;
    }

    @Nullable
    public final LegalAddress getSaveLegalAddress() {
        return this.saveLegalAddress;
    }

    @Nullable
    public final String getSignatureImage() {
        return this.signatureImage;
    }

    @Nullable
    public final String getTransactionId() {
        return this.transactionId;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "parcel");
        parcel.writeParcelable(this.saveLegalAddress, i);
        parcel.writeString(this.transactionId);
        parcel.writeString(this.saleOrderTranId);
        parcel.writeString(this.signatureImage);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public WithDeviceConfirmRequest(@NotNull Parcel parcel) {
        this((LegalAddress) parcel.readParcelable(LegalAddress.class.getClassLoader()), parcel.readString(), parcel.readString(), parcel.readString());
        Intrinsics.checkNotNullParameter(parcel, "parcel");
    }
}