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
@Metadata(m29143d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u001c\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BQ\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\u0010\b\u0002\u0010\t\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0005\u0012\b\b\u0002\u0010\n\u001a\u00020\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\f¢\u0006\u0002\u0010\rJ\t\u0010\u001f\u001a\u00020\u0003HÆ\u0003J\u0011\u0010 \u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005HÆ\u0003J\t\u0010!\u001a\u00020\bHÆ\u0003J\u0011\u0010\"\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0005HÆ\u0003J\t\u0010#\u001a\u00020\bHÆ\u0003J\t\u0010$\u001a\u00020\fHÆ\u0003JU\u0010%\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00052\b\b\u0002\u0010\u0007\u001a\u00020\b2\u0010\b\u0002\u0010\t\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00052\b\b\u0002\u0010\n\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\fHÆ\u0001J\u0013\u0010&\u001a\u00020\f2\b\u0010'\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010(\u001a\u00020)HÖ\u0001J\t\u0010*\u001a\u00020\bHÖ\u0001R&\u0010\t\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001a\u0010\u000b\u001a\u00020\fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R&\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u000f\"\u0004\b\u0018\u0010\u0011R\u001e\u0010\n\u001a\u00020\b8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\u001e\u0010\u0007\u001a\u00020\b8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u001a\"\u0004\b\u001e\u0010\u001c¨\u0006+"}, m29142d2 = {"Lth/co/dtac/android/dtacone/model/customerenquiry/RecomendPackageResponse;", "", "offersInformation", "Lth/co/dtac/android/dtacone/model/customerenquiry/OffersInformation;", "offersPackage", "", "Lth/co/dtac/android/dtacone/model/customerenquiry/OffersPackage;", "requesterId", "", "flowIds", "packageGroupRefNo", "isError", "", "(Lth/co/dtac/android/dtacone/model/customerenquiry/OffersInformation;Ljava/util/List;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Z)V", "getFlowIds", "()Ljava/util/List;", "setFlowIds", "(Ljava/util/List;)V", "()Z", "setError", "(Z)V", "getOffersInformation", "()Lth/co/dtac/android/dtacone/model/customerenquiry/OffersInformation;", "getOffersPackage", "setOffersPackage", "getPackageGroupRefNo", "()Ljava/lang/String;", "setPackageGroupRefNo", "(Ljava/lang/String;)V", "getRequesterId", "setRequesterId", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "other", "hashCode", "", "toString", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.model.customerenquiry.RecomendPackageResponse */
/* loaded from: classes8.dex */
public final class RecomendPackageResponse {
    public static final int $stable = 8;
    @SerializedName("flowIds")
    @Nullable
    private List<String> flowIds;
    private transient boolean isError;
    @SerializedName("offersInformation")
    @NotNull
    private final OffersInformation offersInformation;
    @SerializedName("offersPackage")
    @Nullable
    private List<OffersPackage> offersPackage;
    @SerializedName("packageGroupRefNo")
    @NotNull
    private String packageGroupRefNo;
    @SerializedName("requesterId")
    @NotNull
    private String requesterId;

    public RecomendPackageResponse() {
        this(null, null, null, null, null, false, 63, null);
    }

    public static /* synthetic */ RecomendPackageResponse copy$default(RecomendPackageResponse recomendPackageResponse, OffersInformation offersInformation, List list, String str, List list2, String str2, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            offersInformation = recomendPackageResponse.offersInformation;
        }
        List<OffersPackage> list3 = list;
        if ((i & 2) != 0) {
            list3 = recomendPackageResponse.offersPackage;
        }
        List list4 = list3;
        if ((i & 4) != 0) {
            str = recomendPackageResponse.requesterId;
        }
        String str3 = str;
        List<String> list5 = list2;
        if ((i & 8) != 0) {
            list5 = recomendPackageResponse.flowIds;
        }
        List list6 = list5;
        if ((i & 16) != 0) {
            str2 = recomendPackageResponse.packageGroupRefNo;
        }
        String str4 = str2;
        if ((i & 32) != 0) {
            z = recomendPackageResponse.isError;
        }
        return recomendPackageResponse.copy(offersInformation, list4, str3, list6, str4, z);
    }

    @NotNull
    public final OffersInformation component1() {
        return this.offersInformation;
    }

    @Nullable
    public final List<OffersPackage> component2() {
        return this.offersPackage;
    }

    @NotNull
    public final String component3() {
        return this.requesterId;
    }

    @Nullable
    public final List<String> component4() {
        return this.flowIds;
    }

    @NotNull
    public final String component5() {
        return this.packageGroupRefNo;
    }

    public final boolean component6() {
        return this.isError;
    }

    @NotNull
    public final RecomendPackageResponse copy(@NotNull OffersInformation offersInformation, @Nullable List<OffersPackage> list, @NotNull String requesterId, @Nullable List<String> list2, @NotNull String packageGroupRefNo, boolean z) {
        Intrinsics.checkNotNullParameter(offersInformation, "offersInformation");
        Intrinsics.checkNotNullParameter(requesterId, "requesterId");
        Intrinsics.checkNotNullParameter(packageGroupRefNo, "packageGroupRefNo");
        return new RecomendPackageResponse(offersInformation, list, requesterId, list2, packageGroupRefNo, z);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof RecomendPackageResponse) {
            RecomendPackageResponse recomendPackageResponse = (RecomendPackageResponse) obj;
            return Intrinsics.areEqual(this.offersInformation, recomendPackageResponse.offersInformation) && Intrinsics.areEqual(this.offersPackage, recomendPackageResponse.offersPackage) && Intrinsics.areEqual(this.requesterId, recomendPackageResponse.requesterId) && Intrinsics.areEqual(this.flowIds, recomendPackageResponse.flowIds) && Intrinsics.areEqual(this.packageGroupRefNo, recomendPackageResponse.packageGroupRefNo) && this.isError == recomendPackageResponse.isError;
        }
        return false;
    }

    @Nullable
    public final List<String> getFlowIds() {
        return this.flowIds;
    }

    @NotNull
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

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode = this.offersInformation.hashCode() * 31;
        List<OffersPackage> list = this.offersPackage;
        int hashCode2 = (((hashCode + (list == null ? 0 : list.hashCode())) * 31) + this.requesterId.hashCode()) * 31;
        List<String> list2 = this.flowIds;
        int hashCode3 = (((hashCode2 + (list2 != null ? list2.hashCode() : 0)) * 31) + this.packageGroupRefNo.hashCode()) * 31;
        boolean z = this.isError;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        return hashCode3 + i;
    }

    public final boolean isError() {
        return this.isError;
    }

    public final void setError(boolean z) {
        this.isError = z;
    }

    public final void setFlowIds(@Nullable List<String> list) {
        this.flowIds = list;
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

    @NotNull
    public String toString() {
        OffersInformation offersInformation = this.offersInformation;
        List<OffersPackage> list = this.offersPackage;
        String str = this.requesterId;
        List<String> list2 = this.flowIds;
        String str2 = this.packageGroupRefNo;
        boolean z = this.isError;
        return "RecomendPackageResponse(offersInformation=" + offersInformation + ", offersPackage=" + list + ", requesterId=" + str + ", flowIds=" + list2 + ", packageGroupRefNo=" + str2 + ", isError=" + z + ")";
    }

    public RecomendPackageResponse(@NotNull OffersInformation offersInformation, @Nullable List<OffersPackage> list, @NotNull String requesterId, @Nullable List<String> list2, @NotNull String packageGroupRefNo, boolean z) {
        Intrinsics.checkNotNullParameter(offersInformation, "offersInformation");
        Intrinsics.checkNotNullParameter(requesterId, "requesterId");
        Intrinsics.checkNotNullParameter(packageGroupRefNo, "packageGroupRefNo");
        this.offersInformation = offersInformation;
        this.offersPackage = list;
        this.requesterId = requesterId;
        this.flowIds = list2;
        this.packageGroupRefNo = packageGroupRefNo;
        this.isError = z;
    }

    public /* synthetic */ RecomendPackageResponse(OffersInformation offersInformation, List list, String str, List list2, String str2, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new OffersInformation(null, null, null, null, null, 31, null) : offersInformation, (i & 2) != 0 ? new ArrayList() : list, (i & 4) != 0 ? "" : str, (i & 8) != 0 ? new ArrayList() : list2, (i & 16) == 0 ? str2 : "", (i & 32) != 0 ? false : z);
    }
}