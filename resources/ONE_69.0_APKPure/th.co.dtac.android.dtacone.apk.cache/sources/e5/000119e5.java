package th.p047co.dtac.android.dtacone.model;

import androidx.compose.runtime.internal.StabilityInferred;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@StabilityInferred(parameters = 0)
@Metadata(m29143d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tR\u0016\u0010\u0007\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0016\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0016\u0010\u0006\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\rR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\r¨\u0006\u0011"}, m29142d2 = {"Lth/co/dtac/android/dtacone/model/GetReceiptBase64Request;", "", "userLan", "", "locationCode", "orderID", "orderNumber", "base64", "", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V", "getBase64", "()Z", "getLocationCode", "()Ljava/lang/String;", "getOrderID", "getOrderNumber", "getUserLan", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.model.GetReceiptBase64Request */
/* loaded from: classes8.dex */
public final class GetReceiptBase64Request {
    public static final int $stable = 0;
    @SerializedName("base64")
    private final boolean base64;
    @SerializedName("locationCode")
    @NotNull
    private final String locationCode;
    @SerializedName("orderID")
    @NotNull
    private final String orderID;
    @SerializedName("orderNumber")
    @NotNull
    private final String orderNumber;
    @SerializedName("userLan")
    @NotNull
    private final String userLan;

    public GetReceiptBase64Request(@NotNull String userLan, @NotNull String locationCode, @NotNull String orderID, @NotNull String orderNumber, boolean z) {
        Intrinsics.checkNotNullParameter(userLan, "userLan");
        Intrinsics.checkNotNullParameter(locationCode, "locationCode");
        Intrinsics.checkNotNullParameter(orderID, "orderID");
        Intrinsics.checkNotNullParameter(orderNumber, "orderNumber");
        this.userLan = userLan;
        this.locationCode = locationCode;
        this.orderID = orderID;
        this.orderNumber = orderNumber;
        this.base64 = z;
    }

    public final boolean getBase64() {
        return this.base64;
    }

    @NotNull
    public final String getLocationCode() {
        return this.locationCode;
    }

    @NotNull
    public final String getOrderID() {
        return this.orderID;
    }

    @NotNull
    public final String getOrderNumber() {
        return this.orderNumber;
    }

    @NotNull
    public final String getUserLan() {
        return this.userLan;
    }

    public /* synthetic */ GetReceiptBase64Request(String str, String str2, String str3, String str4, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, str4, (i & 16) != 0 ? true : z);
    }
}