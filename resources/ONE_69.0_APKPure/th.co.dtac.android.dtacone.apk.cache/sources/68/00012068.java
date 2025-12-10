package th.p047co.dtac.android.dtacone.model.self_update;

import androidx.compose.runtime.internal.StabilityInferred;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@StabilityInferred(parameters = 0)
@Metadata(m29143d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u000e\b\u0007\u0018\u00002\u00020\u0001B=\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\u0007¢\u0006\u0002\u0010\u000bR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0016\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0016\u0010\b\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0016\u0010\n\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010R\u0016\u0010\t\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0010R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\rR\u0016\u0010\u0006\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0010¨\u0006\u0015"}, m29142d2 = {"Lth/co/dtac/android/dtacone/model/self_update/RtrAddressRequest;", "", "rtrName", "", "address1", "address2", "subDistrict", "", "district", "province", "postcode", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IIII)V", "getAddress1", "()Ljava/lang/String;", "getAddress2", "getDistrict", "()I", "getPostcode", "getProvince", "getRtrName", "getSubDistrict", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.model.self_update.RtrAddressRequest */
/* loaded from: classes8.dex */
public final class RtrAddressRequest {
    public static final int $stable = 0;
    @SerializedName("address1")
    @NotNull
    private final String address1;
    @SerializedName("address2")
    @NotNull
    private final String address2;
    @SerializedName("district")
    private final int district;
    @SerializedName("postcode")
    private final int postcode;
    @SerializedName("province")
    private final int province;
    @SerializedName("rtrName")
    @NotNull
    private final String rtrName;
    @SerializedName("subDistrict")
    private final int subDistrict;

    public RtrAddressRequest(@NotNull String rtrName, @NotNull String address1, @NotNull String address2, int i, int i2, int i3, int i4) {
        Intrinsics.checkNotNullParameter(rtrName, "rtrName");
        Intrinsics.checkNotNullParameter(address1, "address1");
        Intrinsics.checkNotNullParameter(address2, "address2");
        this.rtrName = rtrName;
        this.address1 = address1;
        this.address2 = address2;
        this.subDistrict = i;
        this.district = i2;
        this.province = i3;
        this.postcode = i4;
    }

    @NotNull
    public final String getAddress1() {
        return this.address1;
    }

    @NotNull
    public final String getAddress2() {
        return this.address2;
    }

    public final int getDistrict() {
        return this.district;
    }

    public final int getPostcode() {
        return this.postcode;
    }

    public final int getProvince() {
        return this.province;
    }

    @NotNull
    public final String getRtrName() {
        return this.rtrName;
    }

    public final int getSubDistrict() {
        return this.subDistrict;
    }
}