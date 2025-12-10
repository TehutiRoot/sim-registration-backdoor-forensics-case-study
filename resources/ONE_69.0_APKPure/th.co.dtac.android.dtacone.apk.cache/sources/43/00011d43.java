package th.p047co.dtac.android.dtacone.model.change_pack;

import androidx.compose.runtime.internal.StabilityInferred;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import th.p047co.dtac.android.dtacone.model.customerenquiry.Offer;

@StabilityInferred(parameters = 0)
@Metadata(m29143d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0019\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BE\u0012\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\nJ\u0011\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0006HÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\u0006HÆ\u0003JI\u0010\u001e\u001a\u00020\u00002\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0006HÆ\u0001J\u0013\u0010\u001f\u001a\u00020 2\b\u0010!\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\"\u001a\u00020#HÖ\u0001J\t\u0010$\u001a\u00020\u0006HÖ\u0001R\"\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u001c\u0010\b\u001a\u0004\u0018\u00010\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0010\"\u0004\b\u0014\u0010\u0012R\u001a\u0010\u0005\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0010\"\u0004\b\u0016\u0010\u0012R\u001c\u0010\t\u001a\u0004\u0018\u00010\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0010\"\u0004\b\u0018\u0010\u0012¨\u0006%"}, m29142d2 = {"Lth/co/dtac/android/dtacone/model/change_pack/OfferPackageModel;", "", "offerList", "", "Lth/co/dtac/android/dtacone/model/customerenquiry/Offer;", "requesterId", "", "requesterApplication", "requesterChannel", "requesterZone", "(Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getOfferList", "()Ljava/util/List;", "setOfferList", "(Ljava/util/List;)V", "getRequesterApplication", "()Ljava/lang/String;", "setRequesterApplication", "(Ljava/lang/String;)V", "getRequesterChannel", "setRequesterChannel", "getRequesterId", "setRequesterId", "getRequesterZone", "setRequesterZone", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.model.change_pack.OfferPackageModel */
/* loaded from: classes8.dex */
public final class OfferPackageModel {
    public static final int $stable = 8;
    @Nullable
    private List<Offer> offerList;
    @Nullable
    private String requesterApplication;
    @Nullable
    private String requesterChannel;
    @NotNull
    private String requesterId;
    @Nullable
    private String requesterZone;

    public OfferPackageModel() {
        this(null, null, null, null, null, 31, null);
    }

    public static /* synthetic */ OfferPackageModel copy$default(OfferPackageModel offerPackageModel, List list, String str, String str2, String str3, String str4, int i, Object obj) {
        List<Offer> list2 = list;
        if ((i & 1) != 0) {
            list2 = offerPackageModel.offerList;
        }
        if ((i & 2) != 0) {
            str = offerPackageModel.requesterId;
        }
        String str5 = str;
        if ((i & 4) != 0) {
            str2 = offerPackageModel.requesterApplication;
        }
        String str6 = str2;
        if ((i & 8) != 0) {
            str3 = offerPackageModel.requesterChannel;
        }
        String str7 = str3;
        if ((i & 16) != 0) {
            str4 = offerPackageModel.requesterZone;
        }
        return offerPackageModel.copy(list2, str5, str6, str7, str4);
    }

    @Nullable
    public final List<Offer> component1() {
        return this.offerList;
    }

    @NotNull
    public final String component2() {
        return this.requesterId;
    }

    @Nullable
    public final String component3() {
        return this.requesterApplication;
    }

    @Nullable
    public final String component4() {
        return this.requesterChannel;
    }

    @Nullable
    public final String component5() {
        return this.requesterZone;
    }

    @NotNull
    public final OfferPackageModel copy(@Nullable List<Offer> list, @NotNull String requesterId, @Nullable String str, @Nullable String str2, @Nullable String str3) {
        Intrinsics.checkNotNullParameter(requesterId, "requesterId");
        return new OfferPackageModel(list, requesterId, str, str2, str3);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof OfferPackageModel) {
            OfferPackageModel offerPackageModel = (OfferPackageModel) obj;
            return Intrinsics.areEqual(this.offerList, offerPackageModel.offerList) && Intrinsics.areEqual(this.requesterId, offerPackageModel.requesterId) && Intrinsics.areEqual(this.requesterApplication, offerPackageModel.requesterApplication) && Intrinsics.areEqual(this.requesterChannel, offerPackageModel.requesterChannel) && Intrinsics.areEqual(this.requesterZone, offerPackageModel.requesterZone);
        }
        return false;
    }

    @Nullable
    public final List<Offer> getOfferList() {
        return this.offerList;
    }

    @Nullable
    public final String getRequesterApplication() {
        return this.requesterApplication;
    }

    @Nullable
    public final String getRequesterChannel() {
        return this.requesterChannel;
    }

    @NotNull
    public final String getRequesterId() {
        return this.requesterId;
    }

    @Nullable
    public final String getRequesterZone() {
        return this.requesterZone;
    }

    public int hashCode() {
        List<Offer> list = this.offerList;
        int hashCode = (((list == null ? 0 : list.hashCode()) * 31) + this.requesterId.hashCode()) * 31;
        String str = this.requesterApplication;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.requesterChannel;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.requesterZone;
        return hashCode3 + (str3 != null ? str3.hashCode() : 0);
    }

    public final void setOfferList(@Nullable List<Offer> list) {
        this.offerList = list;
    }

    public final void setRequesterApplication(@Nullable String str) {
        this.requesterApplication = str;
    }

    public final void setRequesterChannel(@Nullable String str) {
        this.requesterChannel = str;
    }

    public final void setRequesterId(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.requesterId = str;
    }

    public final void setRequesterZone(@Nullable String str) {
        this.requesterZone = str;
    }

    @NotNull
    public String toString() {
        List<Offer> list = this.offerList;
        String str = this.requesterId;
        String str2 = this.requesterApplication;
        String str3 = this.requesterChannel;
        String str4 = this.requesterZone;
        return "OfferPackageModel(offerList=" + list + ", requesterId=" + str + ", requesterApplication=" + str2 + ", requesterChannel=" + str3 + ", requesterZone=" + str4 + ")";
    }

    public OfferPackageModel(@Nullable List<Offer> list, @NotNull String requesterId, @Nullable String str, @Nullable String str2, @Nullable String str3) {
        Intrinsics.checkNotNullParameter(requesterId, "requesterId");
        this.offerList = list;
        this.requesterId = requesterId;
        this.requesterApplication = str;
        this.requesterChannel = str2;
        this.requesterZone = str3;
    }

    public /* synthetic */ OfferPackageModel(List list, String str, String str2, String str3, String str4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : list, (i & 2) != 0 ? "" : str, (i & 4) != 0 ? "" : str2, (i & 8) != 0 ? "" : str3, (i & 16) == 0 ? str4 : "");
    }
}