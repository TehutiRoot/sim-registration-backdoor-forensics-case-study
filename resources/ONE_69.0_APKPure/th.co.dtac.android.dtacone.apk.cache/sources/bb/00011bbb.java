package th.p047co.dtac.android.dtacone.model.appOne.postpaid.true_company;

import androidx.compose.runtime.internal.StabilityInferred;
import com.google.gson.annotations.SerializedName;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 0)
@Metadata(m29143d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0007J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J3\u0010\u0010\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0003HÖ\u0001R\u001e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000b¨\u0006\u0017"}, m29142d2 = {"Lth/co/dtac/android/dtacone/model/appOne/postpaid/true_company/ReserveMsisdnItem;", "", "result", "", "msisdnList", "", "resultDesc", "(Ljava/lang/String;Ljava/util/List;Ljava/lang/String;)V", "getMsisdnList", "()Ljava/util/List;", "getResult", "()Ljava/lang/String;", "getResultDesc", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.model.appOne.postpaid.true_company.ReserveMsisdnItem */
/* loaded from: classes8.dex */
public final class ReserveMsisdnItem {
    public static final int $stable = 8;
    @SerializedName("msisdnList")
    @Nullable
    private final List<String> msisdnList;
    @SerializedName("result")
    @Nullable
    private final String result;
    @SerializedName("resultDesc")
    @Nullable
    private final String resultDesc;

    public ReserveMsisdnItem() {
        this(null, null, null, 7, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ReserveMsisdnItem copy$default(ReserveMsisdnItem reserveMsisdnItem, String str, List list, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = reserveMsisdnItem.result;
        }
        if ((i & 2) != 0) {
            list = reserveMsisdnItem.msisdnList;
        }
        if ((i & 4) != 0) {
            str2 = reserveMsisdnItem.resultDesc;
        }
        return reserveMsisdnItem.copy(str, list, str2);
    }

    @Nullable
    public final String component1() {
        return this.result;
    }

    @Nullable
    public final List<String> component2() {
        return this.msisdnList;
    }

    @Nullable
    public final String component3() {
        return this.resultDesc;
    }

    @NotNull
    public final ReserveMsisdnItem copy(@Nullable String str, @Nullable List<String> list, @Nullable String str2) {
        return new ReserveMsisdnItem(str, list, str2);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ReserveMsisdnItem) {
            ReserveMsisdnItem reserveMsisdnItem = (ReserveMsisdnItem) obj;
            return Intrinsics.areEqual(this.result, reserveMsisdnItem.result) && Intrinsics.areEqual(this.msisdnList, reserveMsisdnItem.msisdnList) && Intrinsics.areEqual(this.resultDesc, reserveMsisdnItem.resultDesc);
        }
        return false;
    }

    @Nullable
    public final List<String> getMsisdnList() {
        return this.msisdnList;
    }

    @Nullable
    public final String getResult() {
        return this.result;
    }

    @Nullable
    public final String getResultDesc() {
        return this.resultDesc;
    }

    public int hashCode() {
        String str = this.result;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        List<String> list = this.msisdnList;
        int hashCode2 = (hashCode + (list == null ? 0 : list.hashCode())) * 31;
        String str2 = this.resultDesc;
        return hashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        String str = this.result;
        List<String> list = this.msisdnList;
        String str2 = this.resultDesc;
        return "ReserveMsisdnItem(result=" + str + ", msisdnList=" + list + ", resultDesc=" + str2 + ")";
    }

    public ReserveMsisdnItem(@Nullable String str, @Nullable List<String> list, @Nullable String str2) {
        this.result = str;
        this.msisdnList = list;
        this.resultDesc = str2;
    }

    public /* synthetic */ ReserveMsisdnItem(String str, List list, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : list, (i & 4) != 0 ? null : str2);
    }
}