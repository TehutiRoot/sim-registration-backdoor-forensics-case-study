package th.p047co.dtac.android.dtacone.view.appOne.retailerProfileUpdate.model.request;

import androidx.compose.runtime.internal.StabilityInferred;
import com.google.gson.annotations.SerializedName;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@StabilityInferred(parameters = 0)
@Metadata(m29143d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0019\b\u0007\u0018\u00002\u00020\u0001B?\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\u0006\u0012\u0006\u0010\n\u001a\u00020\u0006¢\u0006\u0004\b\u000b\u0010\fR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u000e\u001a\u0004\b\u0012\u0010\u0010R\u001a\u0010\u0005\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u000e\u001a\u0004\b\u0014\u0010\u0010R\u001a\u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u001a\u0010\b\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u0016\u001a\u0004\b\u001a\u0010\u0018R\u001a\u0010\t\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u0016\u001a\u0004\b\u001c\u0010\u0018R\u001a\u0010\n\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u0016\u001a\u0004\b\u001e\u0010\u0018¨\u0006\u001f"}, m29142d2 = {"Lth/co/dtac/android/dtacone/view/appOne/retailerProfileUpdate/model/request/OneRetailerProfileUpdateAddressRequest;", "", "", "retailerName", "address1", "address2", "", "subDistrict", "district", "province", "postcode", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IIII)V", PDPageLabelRange.STYLE_LETTERS_LOWER, "Ljava/lang/String;", "getRetailerName", "()Ljava/lang/String;", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "getAddress1", OperatorName.CURVE_TO, "getAddress2", "d", "I", "getSubDistrict", "()I", "e", "getDistrict", OperatorName.FILL_NON_ZERO, "getProvince", OperatorName.NON_STROKING_GRAY, "getPostcode", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0})
/* renamed from: th.co.dtac.android.dtacone.view.appOne.retailerProfileUpdate.model.request.OneRetailerProfileUpdateAddressRequest */
/* loaded from: classes10.dex */
public final class OneRetailerProfileUpdateAddressRequest {
    public static final int $stable = 0;
    @SerializedName("rtrName")
    @NotNull

    /* renamed from: a */
    private final String f96942a;
    @SerializedName("address1")
    @NotNull

    /* renamed from: b */
    private final String f96943b;
    @SerializedName("address2")
    @NotNull

    /* renamed from: c */
    private final String f96944c;
    @SerializedName("subDistrict")

    /* renamed from: d */
    private final int f96945d;
    @SerializedName("district")

    /* renamed from: e */
    private final int f96946e;
    @SerializedName("province")

    /* renamed from: f */
    private final int f96947f;
    @SerializedName("postcode")

    /* renamed from: g */
    private final int f96948g;

    public OneRetailerProfileUpdateAddressRequest(@NotNull String retailerName, @NotNull String address1, @NotNull String address2, int i, int i2, int i3, int i4) {
        Intrinsics.checkNotNullParameter(retailerName, "retailerName");
        Intrinsics.checkNotNullParameter(address1, "address1");
        Intrinsics.checkNotNullParameter(address2, "address2");
        this.f96942a = retailerName;
        this.f96943b = address1;
        this.f96944c = address2;
        this.f96945d = i;
        this.f96946e = i2;
        this.f96947f = i3;
        this.f96948g = i4;
    }

    @NotNull
    public final String getAddress1() {
        return this.f96943b;
    }

    @NotNull
    public final String getAddress2() {
        return this.f96944c;
    }

    public final int getDistrict() {
        return this.f96946e;
    }

    public final int getPostcode() {
        return this.f96948g;
    }

    public final int getProvince() {
        return this.f96947f;
    }

    @NotNull
    public final String getRetailerName() {
        return this.f96942a;
    }

    public final int getSubDistrict() {
        return this.f96945d;
    }
}