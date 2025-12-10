package th.p047co.dtac.android.dtacone.model.appOne.tol.saveOrder;

import androidx.compose.runtime.internal.StabilityInferred;
import com.google.gson.annotations.SerializedName;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 0)
@Metadata(m28851d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0002\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J#\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u001c\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, m28850d2 = {"Lth/co/dtac/android/dtacone/model/appOne/tol/saveOrder/SaveOrderFlpInfo;", "", "flpNumber", "", "marketingCodeList", "", "Lth/co/dtac/android/dtacone/model/appOne/tol/saveOrder/SaveOrderFlpMarketingCode;", "(Ljava/lang/String;Ljava/util/List;)V", "getFlpNumber", "()Ljava/lang/String;", "getMarketingCodeList", "()Ljava/util/List;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "app_prodRelease"}, m28849k = 1, m28848mv = {1, 8, 0}, m28846xi = 48)
/* renamed from: th.co.dtac.android.dtacone.model.appOne.tol.saveOrder.SaveOrderFlpInfo */
/* loaded from: classes8.dex */
public final class SaveOrderFlpInfo {
    public static final int $stable = 8;
    @SerializedName("flpNumber")
    @NotNull
    private final String flpNumber;
    @SerializedName("marketingCodeList")
    @NotNull
    private final List<SaveOrderFlpMarketingCode> marketingCodeList;

    public SaveOrderFlpInfo(@NotNull String flpNumber, @NotNull List<SaveOrderFlpMarketingCode> marketingCodeList) {
        Intrinsics.checkNotNullParameter(flpNumber, "flpNumber");
        Intrinsics.checkNotNullParameter(marketingCodeList, "marketingCodeList");
        this.flpNumber = flpNumber;
        this.marketingCodeList = marketingCodeList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ SaveOrderFlpInfo copy$default(SaveOrderFlpInfo saveOrderFlpInfo, String str, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = saveOrderFlpInfo.flpNumber;
        }
        if ((i & 2) != 0) {
            list = saveOrderFlpInfo.marketingCodeList;
        }
        return saveOrderFlpInfo.copy(str, list);
    }

    @NotNull
    public final String component1() {
        return this.flpNumber;
    }

    @NotNull
    public final List<SaveOrderFlpMarketingCode> component2() {
        return this.marketingCodeList;
    }

    @NotNull
    public final SaveOrderFlpInfo copy(@NotNull String flpNumber, @NotNull List<SaveOrderFlpMarketingCode> marketingCodeList) {
        Intrinsics.checkNotNullParameter(flpNumber, "flpNumber");
        Intrinsics.checkNotNullParameter(marketingCodeList, "marketingCodeList");
        return new SaveOrderFlpInfo(flpNumber, marketingCodeList);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof SaveOrderFlpInfo) {
            SaveOrderFlpInfo saveOrderFlpInfo = (SaveOrderFlpInfo) obj;
            return Intrinsics.areEqual(this.flpNumber, saveOrderFlpInfo.flpNumber) && Intrinsics.areEqual(this.marketingCodeList, saveOrderFlpInfo.marketingCodeList);
        }
        return false;
    }

    @NotNull
    public final String getFlpNumber() {
        return this.flpNumber;
    }

    @NotNull
    public final List<SaveOrderFlpMarketingCode> getMarketingCodeList() {
        return this.marketingCodeList;
    }

    public int hashCode() {
        return (this.flpNumber.hashCode() * 31) + this.marketingCodeList.hashCode();
    }

    @NotNull
    public String toString() {
        String str = this.flpNumber;
        List<SaveOrderFlpMarketingCode> list = this.marketingCodeList;
        return "SaveOrderFlpInfo(flpNumber=" + str + ", marketingCodeList=" + list + ")";
    }
}
