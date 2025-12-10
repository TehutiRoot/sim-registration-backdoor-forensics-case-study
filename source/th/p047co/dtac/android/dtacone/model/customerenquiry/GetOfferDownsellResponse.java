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
@Metadata(m28851d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0018\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B]\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\n\u001a\u00020\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\b\u0012\b\b\u0002\u0010\f\u001a\u00020\b\u0012\b\b\u0002\u0010\r\u001a\u00020\u000e¢\u0006\u0002\u0010\u000fJ\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J\u0011\u0010\u001c\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005HÆ\u0003J\t\u0010\u001d\u001a\u00020\bHÆ\u0003J\t\u0010\u001e\u001a\u00020\bHÆ\u0003J\t\u0010\u001f\u001a\u00020\bHÆ\u0003J\t\u0010 \u001a\u00020\bHÆ\u0003J\t\u0010!\u001a\u00020\bHÆ\u0003J\t\u0010\"\u001a\u00020\u000eHÆ\u0003Ja\u0010#\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00052\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\b2\b\b\u0002\u0010\f\u001a\u00020\b2\b\b\u0002\u0010\r\u001a\u00020\u000eHÆ\u0001J\u0013\u0010$\u001a\u00020\u000e2\b\u0010%\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010&\u001a\u00020'HÖ\u0001J\t\u0010(\u001a\u00020\bHÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\r\u001a\u00020\u000e¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u0012R\u001e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0007\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0016\u0010\n\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0016R\u0016\u0010\t\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0016R\u0016\u0010\u000b\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0016R\u0016\u0010\f\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0016¨\u0006)"}, m28850d2 = {"Lth/co/dtac/android/dtacone/model/customerenquiry/GetOfferDownsellResponse;", "", "averageArpu3Months", "", "offerList", "", "Lth/co/dtac/android/dtacone/model/customerenquiry/Offer;", "requestID", "", "requesterChannel", "requesterApplication", "requesterZone", "textMessage", "isError", "", "(FLjava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V", "getAverageArpu3Months", "()F", "()Z", "getOfferList", "()Ljava/util/List;", "getRequestID", "()Ljava/lang/String;", "getRequesterApplication", "getRequesterChannel", "getRequesterZone", "getTextMessage", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "equals", "other", "hashCode", "", "toString", "app_prodRelease"}, m28849k = 1, m28848mv = {1, 8, 0}, m28846xi = 48)
/* renamed from: th.co.dtac.android.dtacone.model.customerenquiry.GetOfferDownsellResponse */
/* loaded from: classes8.dex */
public final class GetOfferDownsellResponse {
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
    @SerializedName("textMessage")
    @NotNull
    private final String textMessage;

    public GetOfferDownsellResponse() {
        this(0.0f, null, null, null, null, null, null, false, 255, null);
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

    @NotNull
    public final String component7() {
        return this.textMessage;
    }

    public final boolean component8() {
        return this.isError;
    }

    @NotNull
    public final GetOfferDownsellResponse copy(float f, @Nullable List<Offer> list, @NotNull String requestID, @NotNull String requesterChannel, @NotNull String requesterApplication, @NotNull String requesterZone, @NotNull String textMessage, boolean z) {
        Intrinsics.checkNotNullParameter(requestID, "requestID");
        Intrinsics.checkNotNullParameter(requesterChannel, "requesterChannel");
        Intrinsics.checkNotNullParameter(requesterApplication, "requesterApplication");
        Intrinsics.checkNotNullParameter(requesterZone, "requesterZone");
        Intrinsics.checkNotNullParameter(textMessage, "textMessage");
        return new GetOfferDownsellResponse(f, list, requestID, requesterChannel, requesterApplication, requesterZone, textMessage, z);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof GetOfferDownsellResponse) {
            GetOfferDownsellResponse getOfferDownsellResponse = (GetOfferDownsellResponse) obj;
            return Float.compare(this.averageArpu3Months, getOfferDownsellResponse.averageArpu3Months) == 0 && Intrinsics.areEqual(this.offerList, getOfferDownsellResponse.offerList) && Intrinsics.areEqual(this.requestID, getOfferDownsellResponse.requestID) && Intrinsics.areEqual(this.requesterChannel, getOfferDownsellResponse.requesterChannel) && Intrinsics.areEqual(this.requesterApplication, getOfferDownsellResponse.requesterApplication) && Intrinsics.areEqual(this.requesterZone, getOfferDownsellResponse.requesterZone) && Intrinsics.areEqual(this.textMessage, getOfferDownsellResponse.textMessage) && this.isError == getOfferDownsellResponse.isError;
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

    @NotNull
    public final String getTextMessage() {
        return this.textMessage;
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
        int hashCode2 = (((((((((((floatToIntBits + hashCode) * 31) + this.requestID.hashCode()) * 31) + this.requesterChannel.hashCode()) * 31) + this.requesterApplication.hashCode()) * 31) + this.requesterZone.hashCode()) * 31) + this.textMessage.hashCode()) * 31;
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
        String str5 = this.textMessage;
        boolean z = this.isError;
        return "GetOfferDownsellResponse(averageArpu3Months=" + f + ", offerList=" + list + ", requestID=" + str + ", requesterChannel=" + str2 + ", requesterApplication=" + str3 + ", requesterZone=" + str4 + ", textMessage=" + str5 + ", isError=" + z + ")";
    }

    public GetOfferDownsellResponse(float f, @Nullable List<Offer> list, @NotNull String requestID, @NotNull String requesterChannel, @NotNull String requesterApplication, @NotNull String requesterZone, @NotNull String textMessage, boolean z) {
        Intrinsics.checkNotNullParameter(requestID, "requestID");
        Intrinsics.checkNotNullParameter(requesterChannel, "requesterChannel");
        Intrinsics.checkNotNullParameter(requesterApplication, "requesterApplication");
        Intrinsics.checkNotNullParameter(requesterZone, "requesterZone");
        Intrinsics.checkNotNullParameter(textMessage, "textMessage");
        this.averageArpu3Months = f;
        this.offerList = list;
        this.requestID = requestID;
        this.requesterChannel = requesterChannel;
        this.requesterApplication = requesterApplication;
        this.requesterZone = requesterZone;
        this.textMessage = textMessage;
        this.isError = z;
    }

    public /* synthetic */ GetOfferDownsellResponse(float f, List list, String str, String str2, String str3, String str4, String str5, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? 0.0f : f, (i & 2) != 0 ? new ArrayList() : list, (i & 4) != 0 ? "" : str, (i & 8) != 0 ? "" : str2, (i & 16) != 0 ? "" : str3, (i & 32) != 0 ? "" : str4, (i & 64) == 0 ? str5 : "", (i & 128) != 0 ? false : z);
    }
}
