package th.p047co.dtac.android.dtacone.model.appOne.tol.fixedLinePlus;

import androidx.compose.runtime.internal.StabilityInferred;
import com.google.gson.annotations.SerializedName;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 0)
@Metadata(m28851d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u0003¢\u0006\u0002\u0010\tJ\u000f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0006HÆ\u0003J\u000f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\b0\u0003HÆ\u0003J3\u0010\u0012\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u0003HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0006HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001R\u001c\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u001c\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000b¨\u0006\u0019"}, m28850d2 = {"Lth/co/dtac/android/dtacone/model/appOne/tol/fixedLinePlus/OfferData;", "", "flpOfferList", "", "Lth/co/dtac/android/dtacone/model/appOne/tol/fixedLinePlus/FlpOffer;", "maxNum", "", "vasInfoList", "Lth/co/dtac/android/dtacone/model/appOne/tol/fixedLinePlus/VasInfo;", "(Ljava/util/List;ILjava/util/List;)V", "getFlpOfferList", "()Ljava/util/List;", "getMaxNum", "()I", "getVasInfoList", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "", "app_prodRelease"}, m28849k = 1, m28848mv = {1, 8, 0}, m28846xi = 48)
/* renamed from: th.co.dtac.android.dtacone.model.appOne.tol.fixedLinePlus.OfferData */
/* loaded from: classes8.dex */
public final class OfferData {
    public static final int $stable = 8;
    @SerializedName("flpOfferList")
    @NotNull
    private final List<FlpOffer> flpOfferList;
    @SerializedName("maxNum")
    private final int maxNum;
    @SerializedName("vasInfoList")
    @NotNull
    private final List<VasInfo> vasInfoList;

    public OfferData() {
        this(null, 0, null, 7, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ OfferData copy$default(OfferData offerData, List list, int i, List list2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            list = offerData.flpOfferList;
        }
        if ((i2 & 2) != 0) {
            i = offerData.maxNum;
        }
        if ((i2 & 4) != 0) {
            list2 = offerData.vasInfoList;
        }
        return offerData.copy(list, i, list2);
    }

    @NotNull
    public final List<FlpOffer> component1() {
        return this.flpOfferList;
    }

    public final int component2() {
        return this.maxNum;
    }

    @NotNull
    public final List<VasInfo> component3() {
        return this.vasInfoList;
    }

    @NotNull
    public final OfferData copy(@NotNull List<FlpOffer> flpOfferList, int i, @NotNull List<VasInfo> vasInfoList) {
        Intrinsics.checkNotNullParameter(flpOfferList, "flpOfferList");
        Intrinsics.checkNotNullParameter(vasInfoList, "vasInfoList");
        return new OfferData(flpOfferList, i, vasInfoList);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof OfferData) {
            OfferData offerData = (OfferData) obj;
            return Intrinsics.areEqual(this.flpOfferList, offerData.flpOfferList) && this.maxNum == offerData.maxNum && Intrinsics.areEqual(this.vasInfoList, offerData.vasInfoList);
        }
        return false;
    }

    @NotNull
    public final List<FlpOffer> getFlpOfferList() {
        return this.flpOfferList;
    }

    public final int getMaxNum() {
        return this.maxNum;
    }

    @NotNull
    public final List<VasInfo> getVasInfoList() {
        return this.vasInfoList;
    }

    public int hashCode() {
        return (((this.flpOfferList.hashCode() * 31) + this.maxNum) * 31) + this.vasInfoList.hashCode();
    }

    @NotNull
    public String toString() {
        List<FlpOffer> list = this.flpOfferList;
        int i = this.maxNum;
        List<VasInfo> list2 = this.vasInfoList;
        return "OfferData(flpOfferList=" + list + ", maxNum=" + i + ", vasInfoList=" + list2 + ")";
    }

    public OfferData(@NotNull List<FlpOffer> flpOfferList, int i, @NotNull List<VasInfo> vasInfoList) {
        Intrinsics.checkNotNullParameter(flpOfferList, "flpOfferList");
        Intrinsics.checkNotNullParameter(vasInfoList, "vasInfoList");
        this.flpOfferList = flpOfferList;
        this.maxNum = i;
        this.vasInfoList = vasInfoList;
    }

    public /* synthetic */ OfferData(List list, int i, List list2, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? CollectionsKt__CollectionsKt.emptyList() : list, (i2 & 2) != 0 ? 0 : i, (i2 & 4) != 0 ? CollectionsKt__CollectionsKt.emptyList() : list2);
    }
}
