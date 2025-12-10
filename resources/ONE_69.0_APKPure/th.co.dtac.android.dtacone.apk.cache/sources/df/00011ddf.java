package th.p047co.dtac.android.dtacone.model.customerenquiry;

import androidx.compose.runtime.internal.StabilityInferred;
import com.google.gson.annotations.SerializedName;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 0)
@Metadata(m29143d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R$\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR \u0010\n\u001a\u0004\u0018\u00010\u000b8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR&\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0007\"\u0004\b\u0013\u0010\tR\u001e\u0010\u0014\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u001e\u0010\u0019\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u0016\"\u0004\b\u001b\u0010\u0018R \u0010\u001c\u001a\u0004\u0018\u00010\u001d8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!¨\u0006\""}, m29142d2 = {"Lth/co/dtac/android/dtacone/model/customerenquiry/RecommendedPackageModel;", "", "()V", "flowIds", "", "", "getFlowIds", "()Ljava/util/List;", "setFlowIds", "(Ljava/util/List;)V", "offersInformation", "Lth/co/dtac/android/dtacone/model/customerenquiry/OffersInformation;", "getOffersInformation", "()Lth/co/dtac/android/dtacone/model/customerenquiry/OffersInformation;", "setOffersInformation", "(Lth/co/dtac/android/dtacone/model/customerenquiry/OffersInformation;)V", "offersPackage", "Lth/co/dtac/android/dtacone/model/customerenquiry/OffersPackage;", "getOffersPackage", "setOffersPackage", "packageGroupRefNo", "getPackageGroupRefNo", "()Ljava/lang/String;", "setPackageGroupRefNo", "(Ljava/lang/String;)V", "requesterId", "getRequesterId", "setRequesterId", "selectedOfferPackage", "Lth/co/dtac/android/dtacone/model/customerenquiry/Offer;", "getSelectedOfferPackage", "()Lth/co/dtac/android/dtacone/model/customerenquiry/Offer;", "setSelectedOfferPackage", "(Lth/co/dtac/android/dtacone/model/customerenquiry/Offer;)V", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.model.customerenquiry.RecommendedPackageModel */
/* loaded from: classes8.dex */
public final class RecommendedPackageModel {
    public static final int $stable = 8;
    @SerializedName("offersInformation")
    @Nullable
    private OffersInformation offersInformation;
    @SerializedName("offersPackage")
    @Nullable
    private List<OffersPackage> offersPackage;
    @SerializedName("selectedOfferPackage")
    @Nullable
    private Offer selectedOfferPackage;
    @SerializedName("requesterId")
    @NotNull
    private String requesterId = "";
    @SerializedName("flowIds")
    @NotNull
    private List<String> flowIds = CollectionsKt__CollectionsKt.emptyList();
    @SerializedName("packageGroupRefNo")
    @NotNull
    private String packageGroupRefNo = "";

    @NotNull
    public final List<String> getFlowIds() {
        return this.flowIds;
    }

    @Nullable
    public final OffersInformation getOffersInformation() {
        return this.offersInformation;
    }

    @Nullable
    public final List<OffersPackage> getOffersPackage() {
        return this.offersPackage;
    }

    @NotNull
    public final String getPackageGroupRefNo() {
        return this.packageGroupRefNo;
    }

    @NotNull
    public final String getRequesterId() {
        return this.requesterId;
    }

    @Nullable
    public final Offer getSelectedOfferPackage() {
        return this.selectedOfferPackage;
    }

    public final void setFlowIds(@NotNull List<String> list) {
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.flowIds = list;
    }

    public final void setOffersInformation(@Nullable OffersInformation offersInformation) {
        this.offersInformation = offersInformation;
    }

    public final void setOffersPackage(@Nullable List<OffersPackage> list) {
        this.offersPackage = list;
    }

    public final void setPackageGroupRefNo(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.packageGroupRefNo = str;
    }

    public final void setRequesterId(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.requesterId = str;
    }

    public final void setSelectedOfferPackage(@Nullable Offer offer) {
        this.selectedOfferPackage = offer;
    }
}