package th.p047co.dtac.android.dtacone.model.customerenquiry;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.internal.StabilityInferred;
import com.google.gson.annotations.SerializedName;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.android.parcel.Parcelize;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 0)
@Parcelize
@Metadata(m28851d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B)\u0012\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u0012\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0006J\u0011\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0003J-\u0010\f\u001a\u00020\u00002\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0001J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÖ\u0003J\t\u0010\u0013\u001a\u00020\u000eHÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\u0019\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u000eHÖ\u0001R\u001e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u001e\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u001b"}, m28850d2 = {"Lth/co/dtac/android/dtacone/model/customerenquiry/DeviceContractResponse;", "Landroid/os/Parcelable;", "deviceContract", "", "Lth/co/dtac/android/dtacone/model/customerenquiry/ContractItem;", "deviceContractSamesub", "(Ljava/util/List;Ljava/util/List;)V", "getDeviceContract", "()Ljava/util/List;", "getDeviceContractSamesub", "component1", "component2", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "app_prodRelease"}, m28849k = 1, m28848mv = {1, 8, 0}, m28846xi = 48)
/* renamed from: th.co.dtac.android.dtacone.model.customerenquiry.DeviceContractResponse */
/* loaded from: classes8.dex */
public final class DeviceContractResponse implements Parcelable {
    public static final int $stable = 8;
    @NotNull
    public static final Parcelable.Creator<DeviceContractResponse> CREATOR = new Creator();
    @SerializedName("deviceContract")
    @Nullable
    private final List<ContractItem> deviceContract;
    @SerializedName("deviceContractSamesub")
    @Nullable
    private final List<ContractItem> deviceContractSamesub;

    @Metadata(m28849k = 3, m28848mv = {1, 8, 0}, m28846xi = 48)
    /* renamed from: th.co.dtac.android.dtacone.model.customerenquiry.DeviceContractResponse$Creator */
    /* loaded from: classes8.dex */
    public static final class Creator implements Parcelable.Creator<DeviceContractResponse> {
        @Override // android.os.Parcelable.Creator
        @NotNull
        public final DeviceContractResponse createFromParcel(@NotNull Parcel parcel) {
            ArrayList arrayList;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            ArrayList arrayList2 = null;
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int readInt = parcel.readInt();
                arrayList = new ArrayList(readInt);
                for (int i = 0; i != readInt; i++) {
                    arrayList.add(ContractItem.CREATOR.createFromParcel(parcel));
                }
            }
            if (parcel.readInt() != 0) {
                int readInt2 = parcel.readInt();
                arrayList2 = new ArrayList(readInt2);
                for (int i2 = 0; i2 != readInt2; i2++) {
                    arrayList2.add(ContractItem.CREATOR.createFromParcel(parcel));
                }
            }
            return new DeviceContractResponse(arrayList, arrayList2);
        }

        @Override // android.os.Parcelable.Creator
        @NotNull
        public final DeviceContractResponse[] newArray(int i) {
            return new DeviceContractResponse[i];
        }
    }

    public DeviceContractResponse() {
        this(null, null, 3, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ DeviceContractResponse copy$default(DeviceContractResponse deviceContractResponse, List list, List list2, int i, Object obj) {
        if ((i & 1) != 0) {
            list = deviceContractResponse.deviceContract;
        }
        if ((i & 2) != 0) {
            list2 = deviceContractResponse.deviceContractSamesub;
        }
        return deviceContractResponse.copy(list, list2);
    }

    @Nullable
    public final List<ContractItem> component1() {
        return this.deviceContract;
    }

    @Nullable
    public final List<ContractItem> component2() {
        return this.deviceContractSamesub;
    }

    @NotNull
    public final DeviceContractResponse copy(@Nullable List<ContractItem> list, @Nullable List<ContractItem> list2) {
        return new DeviceContractResponse(list, list2);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof DeviceContractResponse) {
            DeviceContractResponse deviceContractResponse = (DeviceContractResponse) obj;
            return Intrinsics.areEqual(this.deviceContract, deviceContractResponse.deviceContract) && Intrinsics.areEqual(this.deviceContractSamesub, deviceContractResponse.deviceContractSamesub);
        }
        return false;
    }

    @Nullable
    public final List<ContractItem> getDeviceContract() {
        return this.deviceContract;
    }

    @Nullable
    public final List<ContractItem> getDeviceContractSamesub() {
        return this.deviceContractSamesub;
    }

    public int hashCode() {
        List<ContractItem> list = this.deviceContract;
        int hashCode = (list == null ? 0 : list.hashCode()) * 31;
        List<ContractItem> list2 = this.deviceContractSamesub;
        return hashCode + (list2 != null ? list2.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        List<ContractItem> list = this.deviceContract;
        List<ContractItem> list2 = this.deviceContractSamesub;
        return "DeviceContractResponse(deviceContract=" + list + ", deviceContractSamesub=" + list2 + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel out, int i) {
        Intrinsics.checkNotNullParameter(out, "out");
        List<ContractItem> list = this.deviceContract;
        if (list == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            out.writeInt(list.size());
            for (ContractItem contractItem : list) {
                contractItem.writeToParcel(out, i);
            }
        }
        List<ContractItem> list2 = this.deviceContractSamesub;
        if (list2 == null) {
            out.writeInt(0);
            return;
        }
        out.writeInt(1);
        out.writeInt(list2.size());
        for (ContractItem contractItem2 : list2) {
            contractItem2.writeToParcel(out, i);
        }
    }

    public DeviceContractResponse(@Nullable List<ContractItem> list, @Nullable List<ContractItem> list2) {
        this.deviceContract = list;
        this.deviceContractSamesub = list2;
    }

    public /* synthetic */ DeviceContractResponse(List list, List list2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : list, (i & 2) != 0 ? null : list2);
    }
}
