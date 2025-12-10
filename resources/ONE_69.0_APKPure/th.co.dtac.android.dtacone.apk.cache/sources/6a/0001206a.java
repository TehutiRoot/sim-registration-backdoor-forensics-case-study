package th.p047co.dtac.android.dtacone.model.self_update;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;
import th.p047co.dtac.android.dtacone.model.address.AddressItemData;

@StabilityInferred(parameters = 0)
@Metadata(m29143d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\b\u0007\u0018\u00002\u00020\u0001B-\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0007R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\tR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\t¨\u0006\r"}, m29142d2 = {"Lth/co/dtac/android/dtacone/model/self_update/RtrAddressTag;", "", "subDistrict", "Lth/co/dtac/android/dtacone/model/address/AddressItemData;", "district", "province", "postcode", "(Lth/co/dtac/android/dtacone/model/address/AddressItemData;Lth/co/dtac/android/dtacone/model/address/AddressItemData;Lth/co/dtac/android/dtacone/model/address/AddressItemData;Lth/co/dtac/android/dtacone/model/address/AddressItemData;)V", "getDistrict", "()Lth/co/dtac/android/dtacone/model/address/AddressItemData;", "getPostcode", "getProvince", "getSubDistrict", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.model.self_update.RtrAddressTag */
/* loaded from: classes8.dex */
public final class RtrAddressTag {
    public static final int $stable = 8;
    @Nullable
    private final AddressItemData district;
    @Nullable
    private final AddressItemData postcode;
    @Nullable
    private final AddressItemData province;
    @Nullable
    private final AddressItemData subDistrict;

    public RtrAddressTag(@Nullable AddressItemData addressItemData, @Nullable AddressItemData addressItemData2, @Nullable AddressItemData addressItemData3, @Nullable AddressItemData addressItemData4) {
        this.subDistrict = addressItemData;
        this.district = addressItemData2;
        this.province = addressItemData3;
        this.postcode = addressItemData4;
    }

    @Nullable
    public final AddressItemData getDistrict() {
        return this.district;
    }

    @Nullable
    public final AddressItemData getPostcode() {
        return this.postcode;
    }

    @Nullable
    public final AddressItemData getProvince() {
        return this.province;
    }

    @Nullable
    public final AddressItemData getSubDistrict() {
        return this.subDistrict;
    }
}