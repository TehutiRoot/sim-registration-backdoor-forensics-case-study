package th.p047co.dtac.android.dtacone.app_one.model.commission;

import androidx.compose.runtime.internal.StabilityInferred;
import com.google.gson.annotations.SerializedName;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 0)
@Metadata(m28851d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0012\b\u0002\u0010\u0004\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u001a\u0010\t\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0012\u0010\u000b\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ0\u0010\r\u001a\u00020\u00002\u0012\b\u0002\u0010\u0004\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u000f\u0010\fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R$\u0010\u0004\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\nR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\f¨\u0006\u001d"}, m28850d2 = {"Lth/co/dtac/android/dtacone/app_one/model/commission/PayByCommissionTypeListItem;", "", "", "Lth/co/dtac/android/dtacone/app_one/model/commission/CommissionDetailItem;", "commissionDetail", "", "commissionType", "<init>", "(Ljava/util/List;Ljava/lang/String;)V", "component1", "()Ljava/util/List;", "component2", "()Ljava/lang/String;", "copy", "(Ljava/util/List;Ljava/lang/String;)Lth/co/dtac/android/dtacone/app_one/model/commission/PayByCommissionTypeListItem;", "toString", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", PDPageLabelRange.STYLE_LETTERS_LOWER, "Ljava/util/List;", "getCommissionDetail", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "Ljava/lang/String;", "getCommissionType", "app_prodRelease"}, m28849k = 1, m28848mv = {1, 8, 0})
/* renamed from: th.co.dtac.android.dtacone.app_one.model.commission.PayByCommissionTypeListItem */
/* loaded from: classes7.dex */
public final class PayByCommissionTypeListItem {
    public static final int $stable = 8;
    @SerializedName("commissionDetail")
    @Nullable

    /* renamed from: a */
    private final List<CommissionDetailItem> f81689a;
    @SerializedName("commissionType")
    @Nullable

    /* renamed from: b */
    private final String f81690b;

    public PayByCommissionTypeListItem() {
        this(null, null, 3, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ PayByCommissionTypeListItem copy$default(PayByCommissionTypeListItem payByCommissionTypeListItem, List list, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            list = payByCommissionTypeListItem.f81689a;
        }
        if ((i & 2) != 0) {
            str = payByCommissionTypeListItem.f81690b;
        }
        return payByCommissionTypeListItem.copy(list, str);
    }

    @Nullable
    public final List<CommissionDetailItem> component1() {
        return this.f81689a;
    }

    @Nullable
    public final String component2() {
        return this.f81690b;
    }

    @NotNull
    public final PayByCommissionTypeListItem copy(@Nullable List<CommissionDetailItem> list, @Nullable String str) {
        return new PayByCommissionTypeListItem(list, str);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof PayByCommissionTypeListItem) {
            PayByCommissionTypeListItem payByCommissionTypeListItem = (PayByCommissionTypeListItem) obj;
            return Intrinsics.areEqual(this.f81689a, payByCommissionTypeListItem.f81689a) && Intrinsics.areEqual(this.f81690b, payByCommissionTypeListItem.f81690b);
        }
        return false;
    }

    @Nullable
    public final List<CommissionDetailItem> getCommissionDetail() {
        return this.f81689a;
    }

    @Nullable
    public final String getCommissionType() {
        return this.f81690b;
    }

    public int hashCode() {
        List<CommissionDetailItem> list = this.f81689a;
        int hashCode = (list == null ? 0 : list.hashCode()) * 31;
        String str = this.f81690b;
        return hashCode + (str != null ? str.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        List<CommissionDetailItem> list = this.f81689a;
        String str = this.f81690b;
        return "PayByCommissionTypeListItem(commissionDetail=" + list + ", commissionType=" + str + ")";
    }

    public PayByCommissionTypeListItem(@Nullable List<CommissionDetailItem> list, @Nullable String str) {
        this.f81689a = list;
        this.f81690b = str;
    }

    public /* synthetic */ PayByCommissionTypeListItem(List list, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : list, (i & 2) != 0 ? null : str);
    }
}
