package th.p047co.dtac.android.dtacone.model.stv;

import androidx.compose.runtime.internal.StabilityInferred;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 0)
@Metadata(m29143d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B)\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0006J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0003J-\u0010\u000e\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\bR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\b¨\u0006\u0015"}, m29142d2 = {"Lth/co/dtac/android/dtacone/model/stv/StvOffer;", "", "offerType", "", "flowId", "transactionId", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getFlowId", "()Ljava/lang/String;", "getOfferType", "getTransactionId", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.model.stv.StvOffer */
/* loaded from: classes8.dex */
public final class StvOffer {
    public static final int $stable = 0;
    @SerializedName("flowId")
    @Nullable
    private final String flowId;
    @SerializedName("offerType")
    @Nullable
    private final String offerType;
    @SerializedName("transactionId")
    @Nullable
    private final String transactionId;

    public StvOffer() {
        this(null, null, null, 7, null);
    }

    public static /* synthetic */ StvOffer copy$default(StvOffer stvOffer, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = stvOffer.offerType;
        }
        if ((i & 2) != 0) {
            str2 = stvOffer.flowId;
        }
        if ((i & 4) != 0) {
            str3 = stvOffer.transactionId;
        }
        return stvOffer.copy(str, str2, str3);
    }

    @Nullable
    public final String component1() {
        return this.offerType;
    }

    @Nullable
    public final String component2() {
        return this.flowId;
    }

    @Nullable
    public final String component3() {
        return this.transactionId;
    }

    @NotNull
    public final StvOffer copy(@Nullable String str, @Nullable String str2, @Nullable String str3) {
        return new StvOffer(str, str2, str3);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof StvOffer) {
            StvOffer stvOffer = (StvOffer) obj;
            return Intrinsics.areEqual(this.offerType, stvOffer.offerType) && Intrinsics.areEqual(this.flowId, stvOffer.flowId) && Intrinsics.areEqual(this.transactionId, stvOffer.transactionId);
        }
        return false;
    }

    @Nullable
    public final String getFlowId() {
        return this.flowId;
    }

    @Nullable
    public final String getOfferType() {
        return this.offerType;
    }

    @Nullable
    public final String getTransactionId() {
        return this.transactionId;
    }

    public int hashCode() {
        String str = this.offerType;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.flowId;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.transactionId;
        return hashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        String str = this.offerType;
        String str2 = this.flowId;
        String str3 = this.transactionId;
        return "StvOffer(offerType=" + str + ", flowId=" + str2 + ", transactionId=" + str3 + ")";
    }

    public StvOffer(@Nullable String str, @Nullable String str2, @Nullable String str3) {
        this.offerType = str;
        this.flowId = str2;
        this.transactionId = str3;
    }

    public /* synthetic */ StvOffer(String str, String str2, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3);
    }
}