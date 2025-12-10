package th.p047co.dtac.android.dtacone.model.appOne.nadOutbound;

import androidx.compose.runtime.internal.StabilityInferred;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import th.p047co.dtac.android.dtacone.model.appOne.nadOutbound.response.OneNadOutboundBillingItem;
import th.p047co.dtac.android.dtacone.model.appOne.nadOutbound.response.OneNadOutboundCustomerInfoItem;
import th.p047co.dtac.android.dtacone.model.appOne.nadOutbound.response.OneNadOutboundInvoiceItem;
import th.p047co.dtac.android.dtacone.view.appOne.nadOutbound.activity.OneNadOutboundActivity;

@StabilityInferred(parameters = 0)
@Metadata(m29143d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b2\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0097\u0001\u0012\u001c\b\u0002\u0010\u0002\u001a\u0016\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003j\n\u0012\u0004\u0012\u00020\u0004\u0018\u0001`\u0005\u0012\u001c\b\u0002\u0010\u0006\u001a\u0016\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0003j\n\u0012\u0004\u0012\u00020\u0007\u0018\u0001`\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u000f\u001a\u00020\r\u0012\b\b\u0002\u0010\u0010\u001a\u00020\r\u0012\b\b\u0002\u0010\u0011\u001a\u00020\t\u0012\b\b\u0002\u0010\u0012\u001a\u00020\r¢\u0006\u0002\u0010\u0013J\u001d\u00102\u001a\u0016\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003j\n\u0012\u0004\u0012\u00020\u0004\u0018\u0001`\u0005HÆ\u0003J\t\u00103\u001a\u00020\rHÆ\u0003J\u001d\u00104\u001a\u0016\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0003j\n\u0012\u0004\u0012\u00020\u0007\u0018\u0001`\u0005HÆ\u0003J\t\u00105\u001a\u00020\tHÆ\u0003J\u000b\u00106\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\u000b\u00107\u001a\u0004\u0018\u00010\rHÆ\u0003J\u000b\u00108\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\t\u00109\u001a\u00020\rHÆ\u0003J\t\u0010:\u001a\u00020\rHÆ\u0003J\t\u0010;\u001a\u00020\tHÆ\u0003J\u009b\u0001\u0010<\u001a\u00020\u00002\u001c\b\u0002\u0010\u0002\u001a\u0016\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003j\n\u0012\u0004\u0012\u00020\u0004\u0018\u0001`\u00052\u001c\b\u0002\u0010\u0006\u001a\u0016\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0003j\n\u0012\u0004\u0012\u00020\u0007\u0018\u0001`\u00052\b\b\u0002\u0010\b\u001a\u00020\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u000f\u001a\u00020\r2\b\b\u0002\u0010\u0010\u001a\u00020\r2\b\b\u0002\u0010\u0011\u001a\u00020\t2\b\b\u0002\u0010\u0012\u001a\u00020\rHÆ\u0001J\u0013\u0010=\u001a\u00020\t2\b\u0010>\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010?\u001a\u00020@HÖ\u0001J\t\u0010A\u001a\u00020\rHÖ\u0001R\u001a\u0010\u0011\u001a\u00020\tX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u001c\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\u001a\u0010\u0012\u001a\u00020\rX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR.\u0010\u0006\u001a\u0016\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0003j\n\u0012\u0004\u0012\u00020\u0007\u0018\u0001`\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R\u001a\u0010\b\u001a\u00020\tX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b$\u0010\u0015\"\u0004\b%\u0010\u0017R\u001c\u0010\f\u001a\u0004\u0018\u00010\rX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b&\u0010\u001d\"\u0004\b'\u0010\u001fR.\u0010\u0002\u001a\u0016\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003j\n\u0012\u0004\u0012\u00020\u0004\u0018\u0001`\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b(\u0010!\"\u0004\b)\u0010#R\u001a\u0010\u0010\u001a\u00020\rX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b*\u0010\u001d\"\u0004\b+\u0010\u001fR\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b,\u0010-\"\u0004\b.\u0010/R\u001a\u0010\u000f\u001a\u00020\rX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b0\u0010\u001d\"\u0004\b1\u0010\u001f¨\u0006B"}, m29142d2 = {"Lth/co/dtac/android/dtacone/model/appOne/nadOutbound/OneNadOutboundModel;", "", "noFilterReminderList", "Ljava/util/ArrayList;", "Lth/co/dtac/android/dtacone/model/appOne/nadOutbound/response/OneNadOutboundBillingItem;", "Lkotlin/collections/ArrayList;", "invoiceList", "Lth/co/dtac/android/dtacone/model/appOne/nadOutbound/response/OneNadOutboundInvoiceItem;", "invoiceNotFound", "", "customerInfo", "Lth/co/dtac/android/dtacone/model/appOne/nadOutbound/response/OneNadOutboundCustomerInfoItem;", "lastCallDate", "", "selectedNadItem", "unpaidBillCount", "product", "contactStatus", "dueStatus", "(Ljava/util/ArrayList;Ljava/util/ArrayList;ZLth/co/dtac/android/dtacone/model/appOne/nadOutbound/response/OneNadOutboundCustomerInfoItem;Ljava/lang/String;Lth/co/dtac/android/dtacone/model/appOne/nadOutbound/response/OneNadOutboundBillingItem;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;)V", "getContactStatus", "()Z", "setContactStatus", "(Z)V", "getCustomerInfo", "()Lth/co/dtac/android/dtacone/model/appOne/nadOutbound/response/OneNadOutboundCustomerInfoItem;", "setCustomerInfo", "(Lth/co/dtac/android/dtacone/model/appOne/nadOutbound/response/OneNadOutboundCustomerInfoItem;)V", "getDueStatus", "()Ljava/lang/String;", "setDueStatus", "(Ljava/lang/String;)V", "getInvoiceList", "()Ljava/util/ArrayList;", "setInvoiceList", "(Ljava/util/ArrayList;)V", "getInvoiceNotFound", "setInvoiceNotFound", "getLastCallDate", "setLastCallDate", "getNoFilterReminderList", "setNoFilterReminderList", "getProduct", "setProduct", "getSelectedNadItem", "()Lth/co/dtac/android/dtacone/model/appOne/nadOutbound/response/OneNadOutboundBillingItem;", "setSelectedNadItem", "(Lth/co/dtac/android/dtacone/model/appOne/nadOutbound/response/OneNadOutboundBillingItem;)V", "getUnpaidBillCount", "setUnpaidBillCount", "component1", "component10", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "other", "hashCode", "", "toString", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.model.appOne.nadOutbound.OneNadOutboundModel */
/* loaded from: classes8.dex */
public final class OneNadOutboundModel {
    public static final int $stable = 8;
    private boolean contactStatus;
    @Nullable
    private OneNadOutboundCustomerInfoItem customerInfo;
    @NotNull
    private String dueStatus;
    @Nullable
    private ArrayList<OneNadOutboundInvoiceItem> invoiceList;
    private boolean invoiceNotFound;
    @Nullable
    private String lastCallDate;
    @Nullable
    private ArrayList<OneNadOutboundBillingItem> noFilterReminderList;
    @NotNull
    private String product;
    @Nullable
    private OneNadOutboundBillingItem selectedNadItem;
    @NotNull
    private String unpaidBillCount;

    public OneNadOutboundModel() {
        this(null, null, false, null, null, null, null, null, false, null, 1023, null);
    }

    @Nullable
    public final ArrayList<OneNadOutboundBillingItem> component1() {
        return this.noFilterReminderList;
    }

    @NotNull
    public final String component10() {
        return this.dueStatus;
    }

    @Nullable
    public final ArrayList<OneNadOutboundInvoiceItem> component2() {
        return this.invoiceList;
    }

    public final boolean component3() {
        return this.invoiceNotFound;
    }

    @Nullable
    public final OneNadOutboundCustomerInfoItem component4() {
        return this.customerInfo;
    }

    @Nullable
    public final String component5() {
        return this.lastCallDate;
    }

    @Nullable
    public final OneNadOutboundBillingItem component6() {
        return this.selectedNadItem;
    }

    @NotNull
    public final String component7() {
        return this.unpaidBillCount;
    }

    @NotNull
    public final String component8() {
        return this.product;
    }

    public final boolean component9() {
        return this.contactStatus;
    }

    @NotNull
    public final OneNadOutboundModel copy(@Nullable ArrayList<OneNadOutboundBillingItem> arrayList, @Nullable ArrayList<OneNadOutboundInvoiceItem> arrayList2, boolean z, @Nullable OneNadOutboundCustomerInfoItem oneNadOutboundCustomerInfoItem, @Nullable String str, @Nullable OneNadOutboundBillingItem oneNadOutboundBillingItem, @NotNull String unpaidBillCount, @NotNull String product, boolean z2, @NotNull String dueStatus) {
        Intrinsics.checkNotNullParameter(unpaidBillCount, "unpaidBillCount");
        Intrinsics.checkNotNullParameter(product, "product");
        Intrinsics.checkNotNullParameter(dueStatus, "dueStatus");
        return new OneNadOutboundModel(arrayList, arrayList2, z, oneNadOutboundCustomerInfoItem, str, oneNadOutboundBillingItem, unpaidBillCount, product, z2, dueStatus);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof OneNadOutboundModel) {
            OneNadOutboundModel oneNadOutboundModel = (OneNadOutboundModel) obj;
            return Intrinsics.areEqual(this.noFilterReminderList, oneNadOutboundModel.noFilterReminderList) && Intrinsics.areEqual(this.invoiceList, oneNadOutboundModel.invoiceList) && this.invoiceNotFound == oneNadOutboundModel.invoiceNotFound && Intrinsics.areEqual(this.customerInfo, oneNadOutboundModel.customerInfo) && Intrinsics.areEqual(this.lastCallDate, oneNadOutboundModel.lastCallDate) && Intrinsics.areEqual(this.selectedNadItem, oneNadOutboundModel.selectedNadItem) && Intrinsics.areEqual(this.unpaidBillCount, oneNadOutboundModel.unpaidBillCount) && Intrinsics.areEqual(this.product, oneNadOutboundModel.product) && this.contactStatus == oneNadOutboundModel.contactStatus && Intrinsics.areEqual(this.dueStatus, oneNadOutboundModel.dueStatus);
        }
        return false;
    }

    public final boolean getContactStatus() {
        return this.contactStatus;
    }

    @Nullable
    public final OneNadOutboundCustomerInfoItem getCustomerInfo() {
        return this.customerInfo;
    }

    @NotNull
    public final String getDueStatus() {
        return this.dueStatus;
    }

    @Nullable
    public final ArrayList<OneNadOutboundInvoiceItem> getInvoiceList() {
        return this.invoiceList;
    }

    public final boolean getInvoiceNotFound() {
        return this.invoiceNotFound;
    }

    @Nullable
    public final String getLastCallDate() {
        return this.lastCallDate;
    }

    @Nullable
    public final ArrayList<OneNadOutboundBillingItem> getNoFilterReminderList() {
        return this.noFilterReminderList;
    }

    @NotNull
    public final String getProduct() {
        return this.product;
    }

    @Nullable
    public final OneNadOutboundBillingItem getSelectedNadItem() {
        return this.selectedNadItem;
    }

    @NotNull
    public final String getUnpaidBillCount() {
        return this.unpaidBillCount;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        ArrayList<OneNadOutboundBillingItem> arrayList = this.noFilterReminderList;
        int hashCode = (arrayList == null ? 0 : arrayList.hashCode()) * 31;
        ArrayList<OneNadOutboundInvoiceItem> arrayList2 = this.invoiceList;
        int hashCode2 = (hashCode + (arrayList2 == null ? 0 : arrayList2.hashCode())) * 31;
        boolean z = this.invoiceNotFound;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        int i2 = (hashCode2 + i) * 31;
        OneNadOutboundCustomerInfoItem oneNadOutboundCustomerInfoItem = this.customerInfo;
        int hashCode3 = (i2 + (oneNadOutboundCustomerInfoItem == null ? 0 : oneNadOutboundCustomerInfoItem.hashCode())) * 31;
        String str = this.lastCallDate;
        int hashCode4 = (hashCode3 + (str == null ? 0 : str.hashCode())) * 31;
        OneNadOutboundBillingItem oneNadOutboundBillingItem = this.selectedNadItem;
        int hashCode5 = (((((hashCode4 + (oneNadOutboundBillingItem != null ? oneNadOutboundBillingItem.hashCode() : 0)) * 31) + this.unpaidBillCount.hashCode()) * 31) + this.product.hashCode()) * 31;
        boolean z2 = this.contactStatus;
        return ((hashCode5 + (z2 ? 1 : z2 ? 1 : 0)) * 31) + this.dueStatus.hashCode();
    }

    public final void setContactStatus(boolean z) {
        this.contactStatus = z;
    }

    public final void setCustomerInfo(@Nullable OneNadOutboundCustomerInfoItem oneNadOutboundCustomerInfoItem) {
        this.customerInfo = oneNadOutboundCustomerInfoItem;
    }

    public final void setDueStatus(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.dueStatus = str;
    }

    public final void setInvoiceList(@Nullable ArrayList<OneNadOutboundInvoiceItem> arrayList) {
        this.invoiceList = arrayList;
    }

    public final void setInvoiceNotFound(boolean z) {
        this.invoiceNotFound = z;
    }

    public final void setLastCallDate(@Nullable String str) {
        this.lastCallDate = str;
    }

    public final void setNoFilterReminderList(@Nullable ArrayList<OneNadOutboundBillingItem> arrayList) {
        this.noFilterReminderList = arrayList;
    }

    public final void setProduct(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.product = str;
    }

    public final void setSelectedNadItem(@Nullable OneNadOutboundBillingItem oneNadOutboundBillingItem) {
        this.selectedNadItem = oneNadOutboundBillingItem;
    }

    public final void setUnpaidBillCount(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.unpaidBillCount = str;
    }

    @NotNull
    public String toString() {
        ArrayList<OneNadOutboundBillingItem> arrayList = this.noFilterReminderList;
        ArrayList<OneNadOutboundInvoiceItem> arrayList2 = this.invoiceList;
        boolean z = this.invoiceNotFound;
        OneNadOutboundCustomerInfoItem oneNadOutboundCustomerInfoItem = this.customerInfo;
        String str = this.lastCallDate;
        OneNadOutboundBillingItem oneNadOutboundBillingItem = this.selectedNadItem;
        String str2 = this.unpaidBillCount;
        String str3 = this.product;
        boolean z2 = this.contactStatus;
        String str4 = this.dueStatus;
        return "OneNadOutboundModel(noFilterReminderList=" + arrayList + ", invoiceList=" + arrayList2 + ", invoiceNotFound=" + z + ", customerInfo=" + oneNadOutboundCustomerInfoItem + ", lastCallDate=" + str + ", selectedNadItem=" + oneNadOutboundBillingItem + ", unpaidBillCount=" + str2 + ", product=" + str3 + ", contactStatus=" + z2 + ", dueStatus=" + str4 + ")";
    }

    public OneNadOutboundModel(@Nullable ArrayList<OneNadOutboundBillingItem> arrayList, @Nullable ArrayList<OneNadOutboundInvoiceItem> arrayList2, boolean z, @Nullable OneNadOutboundCustomerInfoItem oneNadOutboundCustomerInfoItem, @Nullable String str, @Nullable OneNadOutboundBillingItem oneNadOutboundBillingItem, @NotNull String unpaidBillCount, @NotNull String product, boolean z2, @NotNull String dueStatus) {
        Intrinsics.checkNotNullParameter(unpaidBillCount, "unpaidBillCount");
        Intrinsics.checkNotNullParameter(product, "product");
        Intrinsics.checkNotNullParameter(dueStatus, "dueStatus");
        this.noFilterReminderList = arrayList;
        this.invoiceList = arrayList2;
        this.invoiceNotFound = z;
        this.customerInfo = oneNadOutboundCustomerInfoItem;
        this.lastCallDate = str;
        this.selectedNadItem = oneNadOutboundBillingItem;
        this.unpaidBillCount = unpaidBillCount;
        this.product = product;
        this.contactStatus = z2;
        this.dueStatus = dueStatus;
    }

    public /* synthetic */ OneNadOutboundModel(ArrayList arrayList, ArrayList arrayList2, boolean z, OneNadOutboundCustomerInfoItem oneNadOutboundCustomerInfoItem, String str, OneNadOutboundBillingItem oneNadOutboundBillingItem, String str2, String str3, boolean z2, String str4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : arrayList, (i & 2) != 0 ? null : arrayList2, (i & 4) != 0 ? false : z, (i & 8) != 0 ? null : oneNadOutboundCustomerInfoItem, (i & 16) != 0 ? null : str, (i & 32) == 0 ? oneNadOutboundBillingItem : null, (i & 64) != 0 ? "1" : str2, (i & 128) != 0 ? "ONLINE" : str3, (i & 256) == 0 ? z2 : false, (i & 512) != 0 ? OneNadOutboundActivity.DUE_STATUS_UPCOMING : str4);
    }
}