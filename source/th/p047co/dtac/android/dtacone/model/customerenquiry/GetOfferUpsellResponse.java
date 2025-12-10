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
@Metadata(m28851d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0016\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BS\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\n\u001a\u00020\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\b\u0012\b\b\u0002\u0010\f\u001a\u00020\r¢\u0006\u0002\u0010\u000eJ\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\u0011\u0010\u001a\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005HÆ\u0003J\t\u0010\u001b\u001a\u00020\bHÆ\u0003J\t\u0010\u001c\u001a\u00020\bHÆ\u0003J\t\u0010\u001d\u001a\u00020\bHÆ\u0003J\t\u0010\u001e\u001a\u00020\bHÆ\u0003J\t\u0010\u001f\u001a\u00020\rHÆ\u0003JW\u0010 \u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00052\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\b2\b\b\u0002\u0010\f\u001a\u00020\rHÆ\u0001J\u0013\u0010!\u001a\u00020\r2\b\u0010\"\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010#\u001a\u00020$HÖ\u0001J\t\u0010%\u001a\u00020\bHÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\f\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u0011R\u001e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0016\u0010\u0007\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0016\u0010\n\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0015R\u0016\u0010\t\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0015R\u0016\u0010\u000b\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0015¨\u0006&"}, m28850d2 = {"Lth/co/dtac/android/dtacone/model/customerenquiry/GetOfferUpsellResponse;", "", "averageArpu3Months", "", "offerList", "", "Lth/co/dtac/android/dtacone/model/customerenquiry/Offer;", "requestID", "", "requesterChannel", "requesterApplication", "requesterZone", "isError", "", "(FLjava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V", "getAverageArpu3Months", "()F", "()Z", "getOfferList", "()Ljava/util/List;", "getRequestID", "()Ljava/lang/String;", "getRequesterApplication", "getRequesterChannel", "getRequesterZone", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "other", "hashCode", "", "toString", "app_prodRelease"}, m28849k = 1, m28848mv = {1, 8, 0}, m28846xi = 48)
/* renamed from: th.co.dtac.android.dtacone.model.customerenquiry.GetOfferUpsellResponse */
/* loaded from: classes8.dex */
public final class GetOfferUpsellResponse {
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
    @SerializedName("requesterApplication")
    @NotNull
    private final String requesterApplication;
    @SerializedName("requesterChannel")
    @NotNull
    private final String requesterChannel;
    @SerializedName("requesterZone")
    @NotNull
    private final String requesterZone;

    public GetOfferUpsellResponse() {
        this(0.0f, null, null, null, null, null, false, 127, null);
    }

    public static /* synthetic */ GetOfferUpsellResponse copy$default(GetOfferUpsellResponse getOfferUpsellResponse, float f, List list, String str, String str2, String str3, String str4, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            f = getOfferUpsellResponse.averageArpu3Months;
        }
        List<Offer> list2 = list;
        if ((i & 2) != 0) {
            list2 = getOfferUpsellResponse.offerList;
        }
        List list3 = list2;
        if ((i & 4) != 0) {
            str = getOfferUpsellResponse.requestID;
        }
        String str5 = str;
        if ((i & 8) != 0) {
            str2 = getOfferUpsellResponse.requesterChannel;
        }
        String str6 = str2;
        if ((i & 16) != 0) {
            str3 = getOfferUpsellResponse.requesterApplication;
        }
        String str7 = str3;
        if ((i & 32) != 0) {
            str4 = getOfferUpsellResponse.requesterZone;
        }
        String str8 = str4;
        if ((i & 64) != 0) {
            z = getOfferUpsellResponse.isError;
        }
        return getOfferUpsellResponse.copy(f, list3, str5, str6, str7, str8, z);
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

    @NotNull
    public final String component4() {
        return this.requesterChannel;
    }

    @NotNull
    public final String component5() {
        return this.requesterApplication;
    }

    @NotNull
    public final String component6() {
        return this.requesterZone;
    }

    public final boolean component7() {
        return this.isError;
    }

    @NotNull
    public final GetOfferUpsellResponse copy(float f, @Nullable List<Offer> list, @NotNull String requestID, @NotNull String requesterChannel, @NotNull String requesterApplication, @NotNull String requesterZone, boolean z) {
        Intrinsics.checkNotNullParameter(requestID, "requestID");
        Intrinsics.checkNotNullParameter(requesterChannel, "requesterChannel");
        Intrinsics.checkNotNullParameter(requesterApplication, "requesterApplication");
        Intrinsics.checkNotNullParameter(requesterZone, "requesterZone");
        return new GetOfferUpsellResponse(f, list, requestID, requesterChannel, requesterApplication, requesterZone, z);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof GetOfferUpsellResponse) {
            GetOfferUpsellResponse getOfferUpsellResponse = (GetOfferUpsellResponse) obj;
            return Float.compare(this.averageArpu3Months, getOfferUpsellResponse.averageArpu3Months) == 0 && Intrinsics.areEqual(this.offerList, getOfferUpsellResponse.offerList) && Intrinsics.areEqual(this.requestID, getOfferUpsellResponse.requestID) && Intrinsics.areEqual(this.requesterChannel, getOfferUpsellResponse.requesterChannel) && Intrinsics.areEqual(this.requesterApplication, getOfferUpsellResponse.requesterApplication) && Intrinsics.areEqual(this.requesterZone, getOfferUpsellResponse.requesterZone) && this.isError == getOfferUpsellResponse.isError;
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

    @NotNull
    public final String getRequesterApplication() {
        return this.requesterApplication;
    }

    @NotNull
    public final String getRequesterChannel() {
        return this.requesterChannel;
    }

    @NotNull
    public final String getRequesterZone() {
        return this.requesterZone;
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
        int hashCode2 = (((((((((floatToIntBits + hashCode) * 31) + this.requestID.hashCode()) * 31) + this.requesterChannel.hashCode()) * 31) + this.requesterApplication.hashCode()) * 31) + this.requesterZone.hashCode()) * 31;
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
        String str2 = this.requesterChannel;
        String str3 = this.requesterApplication;
        String str4 = this.requesterZone;
        boolean z = this.isError;
        return "GetOfferUpsellResponse(averageArpu3Months=" + f + ", offerList=" + list + ", requestID=" + str + ", requesterChannel=" + str2 + ", requesterApplication=" + str3 + ", requesterZone=" + str4 + ", isError=" + z + ")";
    }

    public GetOfferUpsellResponse(float f, @Nullable List<Offer> list, @NotNull String requestID, @NotNull String requesterChannel, @NotNull String requesterApplication, @NotNull String requesterZone, boolean z) {
        Intrinsics.checkNotNullParameter(requestID, "requestID");
        Intrinsics.checkNotNullParameter(requesterChannel, "requesterChannel");
        Intrinsics.checkNotNullParameter(requesterApplication, "requesterApplication");
        Intrinsics.checkNotNullParameter(requesterZone, "requesterZone");
        this.averageArpu3Months = f;
        this.offerList = list;
        this.requestID = requestID;
        this.requesterChannel = requesterChannel;
        this.requesterApplication = requesterApplication;
        this.requesterZone = requesterZone;
        this.isError = z;
    }

    public /* synthetic */ GetOfferUpsellResponse(float f, List list, String str, String str2, String str3, String str4, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? 0.0f : f, (i & 2) != 0 ? new ArrayList() : list, (i & 4) != 0 ? "" : str, (i & 8) != 0 ? "" : str2, (i & 16) != 0 ? "" : str3, (i & 32) == 0 ? str4 : "", (i & 64) != 0 ? false : z);
    }
}
