package th.p047co.dtac.android.dtacone.model.appOne.tol.device;

import androidx.compose.runtime.internal.StabilityInferred;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 0)
@Metadata(m28851d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B7\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0002\u0010\tJ\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0007HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0007HÆ\u0003J;\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001c\u001a\u00020\u0007HÖ\u0001J\t\u0010\u001d\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0006\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0016\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\rR\u001e\u0010\b\u001a\u00020\u00078\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u000b\"\u0004\b\u0011\u0010\u0012¨\u0006\u001e"}, m28850d2 = {"Lth/co/dtac/android/dtacone/model/appOne/tol/device/DeviceMeshItem;", "", "meshOfferCode", "", "meshOfferName", "meshOfferValue", "meshAvailableValue", "", "meshQuantity", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;II)V", "getMeshAvailableValue", "()I", "getMeshOfferCode", "()Ljava/lang/String;", "getMeshOfferName", "getMeshOfferValue", "getMeshQuantity", "setMeshQuantity", "(I)V", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "toString", "app_prodRelease"}, m28849k = 1, m28848mv = {1, 8, 0}, m28846xi = 48)
/* renamed from: th.co.dtac.android.dtacone.model.appOne.tol.device.DeviceMeshItem */
/* loaded from: classes8.dex */
public final class DeviceMeshItem {
    public static final int $stable = 8;
    @SerializedName("meshAvailableValue")
    private final int meshAvailableValue;
    @SerializedName("meshOfferCode")
    @NotNull
    private final String meshOfferCode;
    @SerializedName("meshOfferName")
    @NotNull
    private final String meshOfferName;
    @SerializedName("meshOfferValue")
    @NotNull
    private final String meshOfferValue;
    @SerializedName("meshQuantity")
    private int meshQuantity;

    public DeviceMeshItem() {
        this(null, null, null, 0, 0, 31, null);
    }

    public static /* synthetic */ DeviceMeshItem copy$default(DeviceMeshItem deviceMeshItem, String str, String str2, String str3, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            str = deviceMeshItem.meshOfferCode;
        }
        if ((i3 & 2) != 0) {
            str2 = deviceMeshItem.meshOfferName;
        }
        String str4 = str2;
        if ((i3 & 4) != 0) {
            str3 = deviceMeshItem.meshOfferValue;
        }
        String str5 = str3;
        if ((i3 & 8) != 0) {
            i = deviceMeshItem.meshAvailableValue;
        }
        int i4 = i;
        if ((i3 & 16) != 0) {
            i2 = deviceMeshItem.meshQuantity;
        }
        return deviceMeshItem.copy(str, str4, str5, i4, i2);
    }

    @NotNull
    public final String component1() {
        return this.meshOfferCode;
    }

    @NotNull
    public final String component2() {
        return this.meshOfferName;
    }

    @NotNull
    public final String component3() {
        return this.meshOfferValue;
    }

    public final int component4() {
        return this.meshAvailableValue;
    }

    public final int component5() {
        return this.meshQuantity;
    }

    @NotNull
    public final DeviceMeshItem copy(@NotNull String meshOfferCode, @NotNull String meshOfferName, @NotNull String meshOfferValue, int i, int i2) {
        Intrinsics.checkNotNullParameter(meshOfferCode, "meshOfferCode");
        Intrinsics.checkNotNullParameter(meshOfferName, "meshOfferName");
        Intrinsics.checkNotNullParameter(meshOfferValue, "meshOfferValue");
        return new DeviceMeshItem(meshOfferCode, meshOfferName, meshOfferValue, i, i2);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof DeviceMeshItem) {
            DeviceMeshItem deviceMeshItem = (DeviceMeshItem) obj;
            return Intrinsics.areEqual(this.meshOfferCode, deviceMeshItem.meshOfferCode) && Intrinsics.areEqual(this.meshOfferName, deviceMeshItem.meshOfferName) && Intrinsics.areEqual(this.meshOfferValue, deviceMeshItem.meshOfferValue) && this.meshAvailableValue == deviceMeshItem.meshAvailableValue && this.meshQuantity == deviceMeshItem.meshQuantity;
        }
        return false;
    }

    public final int getMeshAvailableValue() {
        return this.meshAvailableValue;
    }

    @NotNull
    public final String getMeshOfferCode() {
        return this.meshOfferCode;
    }

    @NotNull
    public final String getMeshOfferName() {
        return this.meshOfferName;
    }

    @NotNull
    public final String getMeshOfferValue() {
        return this.meshOfferValue;
    }

    public final int getMeshQuantity() {
        return this.meshQuantity;
    }

    public int hashCode() {
        return (((((((this.meshOfferCode.hashCode() * 31) + this.meshOfferName.hashCode()) * 31) + this.meshOfferValue.hashCode()) * 31) + this.meshAvailableValue) * 31) + this.meshQuantity;
    }

    public final void setMeshQuantity(int i) {
        this.meshQuantity = i;
    }

    @NotNull
    public String toString() {
        String str = this.meshOfferCode;
        String str2 = this.meshOfferName;
        String str3 = this.meshOfferValue;
        int i = this.meshAvailableValue;
        int i2 = this.meshQuantity;
        return "DeviceMeshItem(meshOfferCode=" + str + ", meshOfferName=" + str2 + ", meshOfferValue=" + str3 + ", meshAvailableValue=" + i + ", meshQuantity=" + i2 + ")";
    }

    public DeviceMeshItem(@NotNull String meshOfferCode, @NotNull String meshOfferName, @NotNull String meshOfferValue, int i, int i2) {
        Intrinsics.checkNotNullParameter(meshOfferCode, "meshOfferCode");
        Intrinsics.checkNotNullParameter(meshOfferName, "meshOfferName");
        Intrinsics.checkNotNullParameter(meshOfferValue, "meshOfferValue");
        this.meshOfferCode = meshOfferCode;
        this.meshOfferName = meshOfferName;
        this.meshOfferValue = meshOfferValue;
        this.meshAvailableValue = i;
        this.meshQuantity = i2;
    }

    public /* synthetic */ DeviceMeshItem(String str, String str2, String str3, int i, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? "" : str, (i3 & 2) != 0 ? "" : str2, (i3 & 4) == 0 ? str3 : "", (i3 & 8) != 0 ? Integer.MAX_VALUE : i, (i3 & 16) != 0 ? 0 : i2);
    }
}
