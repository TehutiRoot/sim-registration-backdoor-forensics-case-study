package th.p047co.dtac.android.dtacone.model.customerenquiry;

import androidx.compose.runtime.internal.StabilityInferred;
import com.google.gson.annotations.SerializedName;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 0)
@Metadata(m28851d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0010\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B5\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\b\b\u0002\u0010\t\u001a\u00020\n¢\u0006\u0002\u0010\u000bJ\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\u0011\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005HÆ\u0003J\t\u0010\u0015\u001a\u00020\bHÆ\u0003J\t\u0010\u0016\u001a\u00020\nHÆ\u0003J9\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00052\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\nHÆ\u0001J\u0013\u0010\u0018\u001a\u00020\n2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001J\t\u0010\u001c\u001a\u00020\bHÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u000eR\u001e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0007\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u001d"}, m28850d2 = {"Lth/co/dtac/android/dtacone/model/customerenquiry/GetOfferUpdateResponse;", "", "averageArpu3Months", "", "offerList", "", "Lth/co/dtac/android/dtacone/model/customerenquiry/Offer;", "requestID", "", "isError", "", "(FLjava/util/List;Ljava/lang/String;Z)V", "getAverageArpu3Months", "()F", "()Z", "getOfferList", "()Ljava/util/List;", "getRequestID", "()Ljava/lang/String;", "component1", "component2", "component3", "component4", "copy", "equals", "other", "hashCode", "", "toString", "app_prodRelease"}, m28849k = 1, m28848mv = {1, 8, 0}, m28846xi = 48)
/* renamed from: th.co.dtac.android.dtacone.model.customerenquiry.GetOfferUpdateResponse */
/* loaded from: classes8.dex */
public final class GetOfferUpdateResponse {
    public static final int $stable = 8;
    @SerializedName("averageArpu3Months")
    private final float averageArpu3Months;
    private final transient boolean isError;
    @SerializedName("offerList")
    @Nullable
    private final List<Offer> offerList;
    @SerializedName("requestID")
    @NotNull
    private final String requestID;

    public GetOfferUpdateResponse() {
        this(0.0f, null, null, false, 15, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ GetOfferUpdateResponse copy$default(GetOfferUpdateResponse getOfferUpdateResponse, float f, List list, String str, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            f = getOfferUpdateResponse.averageArpu3Months;
        }
        if ((i & 2) != 0) {
            list = getOfferUpdateResponse.offerList;
        }
        if ((i & 4) != 0) {
            str = getOfferUpdateResponse.requestID;
        }
        if ((i & 8) != 0) {
            z = getOfferUpdateResponse.isError;
        }
        return getOfferUpdateResponse.copy(f, list, str, z);
    }

    public final float component1() {
        return this.averageArpu3Months;
    }

    @Nullable
    public final List<Offer> component2() {
        return this.offerList;
    }

    @NotNull
    public final String component3() {
        return this.requestID;
    }

    public final boolean component4() {
        return this.isError;
    }

    @NotNull
    public final GetOfferUpdateResponse copy(float f, @Nullable List<Offer> list, @NotNull String requestID, boolean z) {
        Intrinsics.checkNotNullParameter(requestID, "requestID");
        return new GetOfferUpdateResponse(f, list, requestID, z);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof GetOfferUpdateResponse) {
            GetOfferUpdateResponse getOfferUpdateResponse = (GetOfferUpdateResponse) obj;
            return Float.compare(this.averageArpu3Months, getOfferUpdateResponse.averageArpu3Months) == 0 && Intrinsics.areEqual(this.offerList, getOfferUpdateResponse.offerList) && Intrinsics.areEqual(this.requestID, getOfferUpdateResponse.requestID) && this.isError == getOfferUpdateResponse.isError;
        }
        return false;
    }

    public final float getAverageArpu3Months() {
        return this.averageArpu3Months;
    }

    @Nullable
    public final List<Offer> getOfferList() {
        return this.offerList;
    }

    @NotNull
    public final String getRequestID() {
        return this.requestID;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode;
        int floatToIntBits = Float.floatToIntBits(this.averageArpu3Months) * 31;
        List<Offer> list = this.offerList;
        if (list == null) {
            hashCode = 0;
        } else {
            hashCode = list.hashCode();
        }
        int hashCode2 = (((floatToIntBits + hashCode) * 31) + this.requestID.hashCode()) * 31;
        boolean z = this.isError;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        return hashCode2 + i;
    }

    public final boolean isError() {
        return this.isError;
    }

    @NotNull
    public String toString() {
        float f = this.averageArpu3Months;
        List<Offer> list = this.offerList;
        String str = this.requestID;
        boolean z = this.isError;
        return "GetOfferUpdateResponse(averageArpu3Months=" + f + ", offerList=" + list + ", requestID=" + str + ", isError=" + z + ")";
    }

    public GetOfferUpdateResponse(float f, @Nullable List<Offer> list, @NotNull String requestID, boolean z) {
        Intrinsics.checkNotNullParameter(requestID, "requestID");
        this.averageArpu3Months = f;
        this.offerList = list;
        this.requestID = requestID;
        this.isError = z;
    }

    public /* synthetic */ GetOfferUpdateResponse(float f, List list, String str, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? 0.0f : f, (i & 2) != 0 ? new ArrayList() : list, (i & 4) != 0 ? "" : str, (i & 8) != 0 ? false : z);
    }
}
