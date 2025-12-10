package th.p047co.dtac.android.dtacone.model.appOne.nadOutbound.response;

import androidx.compose.runtime.internal.StabilityInferred;
import com.google.gson.annotations.SerializedName;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 0)
@Metadata(m29143d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\u001c\b\u0002\u0010\u0002\u001a\u0016\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003j\n\u0012\u0004\u0012\u00020\u0004\u0018\u0001`\u0005¢\u0006\u0002\u0010\u0006J\u001d\u0010\t\u001a\u0016\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003j\n\u0012\u0004\u0012\u00020\u0004\u0018\u0001`\u0005HÆ\u0003J'\u0010\n\u001a\u00020\u00002\u001c\b\u0002\u0010\u0002\u001a\u0016\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003j\n\u0012\u0004\u0012\u00020\u0004\u0018\u0001`\u0005HÆ\u0001J\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R*\u0010\u0002\u001a\u0016\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003j\n\u0012\u0004\u0012\u00020\u0004\u0018\u0001`\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u0012"}, m29142d2 = {"Lth/co/dtac/android/dtacone/model/appOne/nadOutbound/response/OneNadOutboundInvoiceDataItem;", "", "invoiceList", "Ljava/util/ArrayList;", "Lth/co/dtac/android/dtacone/model/appOne/nadOutbound/response/OneNadOutboundInvoiceItem;", "Lkotlin/collections/ArrayList;", "(Ljava/util/ArrayList;)V", "getInvoiceList", "()Ljava/util/ArrayList;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.model.appOne.nadOutbound.response.OneNadOutboundInvoiceDataItem */
/* loaded from: classes8.dex */
public final class OneNadOutboundInvoiceDataItem {
    public static final int $stable = 8;
    @SerializedName("invoice")
    @Nullable
    private final ArrayList<OneNadOutboundInvoiceItem> invoiceList;

    public OneNadOutboundInvoiceDataItem() {
        this(null, 1, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ OneNadOutboundInvoiceDataItem copy$default(OneNadOutboundInvoiceDataItem oneNadOutboundInvoiceDataItem, ArrayList arrayList, int i, Object obj) {
        if ((i & 1) != 0) {
            arrayList = oneNadOutboundInvoiceDataItem.invoiceList;
        }
        return oneNadOutboundInvoiceDataItem.copy(arrayList);
    }

    @Nullable
    public final ArrayList<OneNadOutboundInvoiceItem> component1() {
        return this.invoiceList;
    }

    @NotNull
    public final OneNadOutboundInvoiceDataItem copy(@Nullable ArrayList<OneNadOutboundInvoiceItem> arrayList) {
        return new OneNadOutboundInvoiceDataItem(arrayList);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof OneNadOutboundInvoiceDataItem) && Intrinsics.areEqual(this.invoiceList, ((OneNadOutboundInvoiceDataItem) obj).invoiceList);
    }

    @Nullable
    public final ArrayList<OneNadOutboundInvoiceItem> getInvoiceList() {
        return this.invoiceList;
    }

    public int hashCode() {
        ArrayList<OneNadOutboundInvoiceItem> arrayList = this.invoiceList;
        if (arrayList == null) {
            return 0;
        }
        return arrayList.hashCode();
    }

    @NotNull
    public String toString() {
        ArrayList<OneNadOutboundInvoiceItem> arrayList = this.invoiceList;
        return "OneNadOutboundInvoiceDataItem(invoiceList=" + arrayList + ")";
    }

    public OneNadOutboundInvoiceDataItem(@Nullable ArrayList<OneNadOutboundInvoiceItem> arrayList) {
        this.invoiceList = arrayList;
    }

    public /* synthetic */ OneNadOutboundInvoiceDataItem(ArrayList arrayList, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : arrayList);
    }
}