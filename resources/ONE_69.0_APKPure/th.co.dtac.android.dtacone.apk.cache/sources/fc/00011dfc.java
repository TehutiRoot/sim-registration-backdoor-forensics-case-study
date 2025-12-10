package th.p047co.dtac.android.dtacone.model.customerenquiry;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.core.app.NotificationCompat;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 0)
@Metadata(m29143d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005¢\u0006\u0002\u0010\u0007J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0005HÆ\u0003J'\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001J\t\u0010\u001b\u001a\u00020\u0005HÖ\u0001R\u001e\u0010\u0002\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001e\u0010\u0004\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001e\u0010\u0006\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\r\"\u0004\b\u0011\u0010\u000f¨\u0006\u001c"}, m29142d2 = {"Lth/co/dtac/android/dtacone/model/customerenquiry/ViewOfferResponse;", "", "CUSTOMER_IDENTIFIER", "Lth/co/dtac/android/dtacone/model/customerenquiry/CUSTOMERIDENTIFIER;", "REQUEST_ID", "", "STATUS", "(Lth/co/dtac/android/dtacone/model/customerenquiry/CUSTOMERIDENTIFIER;Ljava/lang/String;Ljava/lang/String;)V", "getCUSTOMER_IDENTIFIER", "()Lth/co/dtac/android/dtacone/model/customerenquiry/CUSTOMERIDENTIFIER;", "setCUSTOMER_IDENTIFIER", "(Lth/co/dtac/android/dtacone/model/customerenquiry/CUSTOMERIDENTIFIER;)V", "getREQUEST_ID", "()Ljava/lang/String;", "setREQUEST_ID", "(Ljava/lang/String;)V", "getSTATUS", "setSTATUS", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.model.customerenquiry.ViewOfferResponse */
/* loaded from: classes8.dex */
public final class ViewOfferResponse {
    public static final int $stable = 8;
    @SerializedName("customer_identifier")
    @NotNull
    private CUSTOMERIDENTIFIER CUSTOMER_IDENTIFIER;
    @SerializedName("request_id")
    @NotNull
    private String REQUEST_ID;
    @SerializedName(NotificationCompat.CATEGORY_STATUS)
    @NotNull
    private String STATUS;

    public ViewOfferResponse(@NotNull CUSTOMERIDENTIFIER CUSTOMER_IDENTIFIER, @NotNull String REQUEST_ID, @NotNull String STATUS) {
        Intrinsics.checkNotNullParameter(CUSTOMER_IDENTIFIER, "CUSTOMER_IDENTIFIER");
        Intrinsics.checkNotNullParameter(REQUEST_ID, "REQUEST_ID");
        Intrinsics.checkNotNullParameter(STATUS, "STATUS");
        this.CUSTOMER_IDENTIFIER = CUSTOMER_IDENTIFIER;
        this.REQUEST_ID = REQUEST_ID;
        this.STATUS = STATUS;
    }

    public static /* synthetic */ ViewOfferResponse copy$default(ViewOfferResponse viewOfferResponse, CUSTOMERIDENTIFIER customeridentifier, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            customeridentifier = viewOfferResponse.CUSTOMER_IDENTIFIER;
        }
        if ((i & 2) != 0) {
            str = viewOfferResponse.REQUEST_ID;
        }
        if ((i & 4) != 0) {
            str2 = viewOfferResponse.STATUS;
        }
        return viewOfferResponse.copy(customeridentifier, str, str2);
    }

    @NotNull
    public final CUSTOMERIDENTIFIER component1() {
        return this.CUSTOMER_IDENTIFIER;
    }

    @NotNull
    public final String component2() {
        return this.REQUEST_ID;
    }

    @NotNull
    public final String component3() {
        return this.STATUS;
    }

    @NotNull
    public final ViewOfferResponse copy(@NotNull CUSTOMERIDENTIFIER CUSTOMER_IDENTIFIER, @NotNull String REQUEST_ID, @NotNull String STATUS) {
        Intrinsics.checkNotNullParameter(CUSTOMER_IDENTIFIER, "CUSTOMER_IDENTIFIER");
        Intrinsics.checkNotNullParameter(REQUEST_ID, "REQUEST_ID");
        Intrinsics.checkNotNullParameter(STATUS, "STATUS");
        return new ViewOfferResponse(CUSTOMER_IDENTIFIER, REQUEST_ID, STATUS);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ViewOfferResponse) {
            ViewOfferResponse viewOfferResponse = (ViewOfferResponse) obj;
            return Intrinsics.areEqual(this.CUSTOMER_IDENTIFIER, viewOfferResponse.CUSTOMER_IDENTIFIER) && Intrinsics.areEqual(this.REQUEST_ID, viewOfferResponse.REQUEST_ID) && Intrinsics.areEqual(this.STATUS, viewOfferResponse.STATUS);
        }
        return false;
    }

    @NotNull
    public final CUSTOMERIDENTIFIER getCUSTOMER_IDENTIFIER() {
        return this.CUSTOMER_IDENTIFIER;
    }

    @NotNull
    public final String getREQUEST_ID() {
        return this.REQUEST_ID;
    }

    @NotNull
    public final String getSTATUS() {
        return this.STATUS;
    }

    public int hashCode() {
        return (((this.CUSTOMER_IDENTIFIER.hashCode() * 31) + this.REQUEST_ID.hashCode()) * 31) + this.STATUS.hashCode();
    }

    public final void setCUSTOMER_IDENTIFIER(@NotNull CUSTOMERIDENTIFIER customeridentifier) {
        Intrinsics.checkNotNullParameter(customeridentifier, "<set-?>");
        this.CUSTOMER_IDENTIFIER = customeridentifier;
    }

    public final void setREQUEST_ID(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.REQUEST_ID = str;
    }

    public final void setSTATUS(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.STATUS = str;
    }

    @NotNull
    public String toString() {
        CUSTOMERIDENTIFIER customeridentifier = this.CUSTOMER_IDENTIFIER;
        String str = this.REQUEST_ID;
        String str2 = this.STATUS;
        return "ViewOfferResponse(CUSTOMER_IDENTIFIER=" + customeridentifier + ", REQUEST_ID=" + str + ", STATUS=" + str2 + ")";
    }

    public /* synthetic */ ViewOfferResponse(CUSTOMERIDENTIFIER customeridentifier, String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(customeridentifier, (i & 2) != 0 ? "" : str, (i & 4) != 0 ? "" : str2);
    }
}