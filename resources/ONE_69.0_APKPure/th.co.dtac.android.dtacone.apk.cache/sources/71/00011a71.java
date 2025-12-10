package th.p047co.dtac.android.dtacone.model.appOne.mnp.request;

import androidx.compose.runtime.internal.StabilityInferred;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 0)
@Metadata(m29143d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004J\u000b\u0010\u0007\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\b\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\f\u001a\u00020\rHÖ\u0001J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0010"}, m29142d2 = {"Lth/co/dtac/android/dtacone/model/appOne/mnp/request/AddressListData;", "", "customerAddress", "Lth/co/dtac/android/dtacone/model/appOne/mnp/request/AddressData;", "(Lth/co/dtac/android/dtacone/model/appOne/mnp/request/AddressData;)V", "getCustomerAddress", "()Lth/co/dtac/android/dtacone/model/appOne/mnp/request/AddressData;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.model.appOne.mnp.request.AddressListData */
/* loaded from: classes8.dex */
public final class AddressListData {
    public static final int $stable = 0;
    @SerializedName("customerAddress")
    @Nullable
    private final AddressData customerAddress;

    public AddressListData() {
        this(null, 1, null);
    }

    public static /* synthetic */ AddressListData copy$default(AddressListData addressListData, AddressData addressData, int i, Object obj) {
        if ((i & 1) != 0) {
            addressData = addressListData.customerAddress;
        }
        return addressListData.copy(addressData);
    }

    @Nullable
    public final AddressData component1() {
        return this.customerAddress;
    }

    @NotNull
    public final AddressListData copy(@Nullable AddressData addressData) {
        return new AddressListData(addressData);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof AddressListData) && Intrinsics.areEqual(this.customerAddress, ((AddressListData) obj).customerAddress);
    }

    @Nullable
    public final AddressData getCustomerAddress() {
        return this.customerAddress;
    }

    public int hashCode() {
        AddressData addressData = this.customerAddress;
        if (addressData == null) {
            return 0;
        }
        return addressData.hashCode();
    }

    @NotNull
    public String toString() {
        AddressData addressData = this.customerAddress;
        return "AddressListData(customerAddress=" + addressData + ")";
    }

    public AddressListData(@Nullable AddressData addressData) {
        this.customerAddress = addressData;
    }

    public /* synthetic */ AddressListData(AddressData addressData, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : addressData);
    }
}