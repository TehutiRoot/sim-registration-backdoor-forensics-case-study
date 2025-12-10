package th.p047co.dtac.android.dtacone.model.appOne.nadOutbound.response;

import androidx.compose.runtime.internal.StabilityInferred;
import com.google.gson.annotations.SerializedName;
import java.util.Date;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 0)
@Metadata(m29143d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b'\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001Bg\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\r\u001a\u00020\u0003\u0012\u0006\u0010\u000e\u001a\u00020\u0003\u0012\u0006\u0010\u000f\u001a\u00020\u0003\u0012\u0006\u0010\u0010\u001a\u00020\u0003¢\u0006\u0002\u0010\u0011J\t\u0010#\u001a\u00020\u0003HÆ\u0003J\t\u0010$\u001a\u00020\u0003HÆ\u0003J\t\u0010%\u001a\u00020\u0003HÆ\u0003J\t\u0010&\u001a\u00020\u0003HÆ\u0003J\t\u0010'\u001a\u00020\u0003HÆ\u0003J\t\u0010(\u001a\u00020\u0003HÆ\u0003J\t\u0010)\u001a\u00020\u0007HÆ\u0003J\t\u0010*\u001a\u00020\u0003HÆ\u0003J\t\u0010+\u001a\u00020\u0003HÆ\u0003J\t\u0010,\u001a\u00020\u000bHÆ\u0003J\t\u0010-\u001a\u00020\u000bHÆ\u0003J\t\u0010.\u001a\u00020\u0003HÆ\u0003J\u0081\u0001\u0010/\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\r\u001a\u00020\u00032\b\b\u0002\u0010\u000e\u001a\u00020\u00032\b\b\u0002\u0010\u000f\u001a\u00020\u00032\b\b\u0002\u0010\u0010\u001a\u00020\u0003HÆ\u0001J\u0013\u00100\u001a\u00020\u00072\b\u00101\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00102\u001a\u000203HÖ\u0001J\t\u00104\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\b\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0016\u0010\f\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0016\u0010\u0006\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0016\u0010\u000e\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0013R\u0016\u0010\r\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0013R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0013R\u0016\u0010\n\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0015R\u0016\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0013R\u0016\u0010\u000f\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0013R\u0016\u0010\t\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0013R\u001e\u0010\u0004\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010\u0013\"\u0004\b \u0010!R\u0016\u0010\u0010\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u0013¨\u00065"}, m29142d2 = {"Lth/co/dtac/android/dtacone/model/appOne/nadOutbound/response/OneNadOutboundBillingItem;", "", "id", "", "serviceId", "orgName", "contactStatus", "", "ban", "saleCode", "inquiryDate", "Ljava/util/Date;", "billStatusDate", "dueStatus", "daysFromDue", "product", "unpaidBillCount", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Ljava/util/Date;Ljava/util/Date;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getBan", "()Ljava/lang/String;", "getBillStatusDate", "()Ljava/util/Date;", "getContactStatus", "()Z", "getDaysFromDue", "getDueStatus", "getId", "getInquiryDate", "getOrgName", "getProduct", "getSaleCode", "getServiceId", "setServiceId", "(Ljava/lang/String;)V", "getUnpaidBillCount", "component1", "component10", "component11", "component12", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "other", "hashCode", "", "toString", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.model.appOne.nadOutbound.response.OneNadOutboundBillingItem */
/* loaded from: classes8.dex */
public final class OneNadOutboundBillingItem {
    public static final int $stable = 8;
    @SerializedName("ban")
    @NotNull
    private final String ban;
    @SerializedName("billStatusDate")
    @NotNull
    private final Date billStatusDate;
    @SerializedName("contactStatus")
    private final boolean contactStatus;
    @SerializedName("daysFromDue")
    @NotNull
    private final String daysFromDue;
    @SerializedName("dueStatus")
    @NotNull
    private final String dueStatus;
    @SerializedName("id")
    @NotNull

    /* renamed from: id */
    private final String f85166id;
    @SerializedName("inquiryDate")
    @NotNull
    private final Date inquiryDate;
    @SerializedName("orgName")
    @NotNull
    private final String orgName;
    @SerializedName("product")
    @NotNull
    private final String product;
    @SerializedName("saleCode")
    @NotNull
    private final String saleCode;
    @SerializedName("serviceId")
    @NotNull
    private String serviceId;
    @SerializedName("unpaidBillCount")
    @NotNull
    private final String unpaidBillCount;

    public OneNadOutboundBillingItem(@NotNull String id2, @NotNull String serviceId, @NotNull String orgName, boolean z, @NotNull String ban, @NotNull String saleCode, @NotNull Date inquiryDate, @NotNull Date billStatusDate, @NotNull String dueStatus, @NotNull String daysFromDue, @NotNull String product, @NotNull String unpaidBillCount) {
        Intrinsics.checkNotNullParameter(id2, "id");
        Intrinsics.checkNotNullParameter(serviceId, "serviceId");
        Intrinsics.checkNotNullParameter(orgName, "orgName");
        Intrinsics.checkNotNullParameter(ban, "ban");
        Intrinsics.checkNotNullParameter(saleCode, "saleCode");
        Intrinsics.checkNotNullParameter(inquiryDate, "inquiryDate");
        Intrinsics.checkNotNullParameter(billStatusDate, "billStatusDate");
        Intrinsics.checkNotNullParameter(dueStatus, "dueStatus");
        Intrinsics.checkNotNullParameter(daysFromDue, "daysFromDue");
        Intrinsics.checkNotNullParameter(product, "product");
        Intrinsics.checkNotNullParameter(unpaidBillCount, "unpaidBillCount");
        this.f85166id = id2;
        this.serviceId = serviceId;
        this.orgName = orgName;
        this.contactStatus = z;
        this.ban = ban;
        this.saleCode = saleCode;
        this.inquiryDate = inquiryDate;
        this.billStatusDate = billStatusDate;
        this.dueStatus = dueStatus;
        this.daysFromDue = daysFromDue;
        this.product = product;
        this.unpaidBillCount = unpaidBillCount;
    }

    @NotNull
    public final String component1() {
        return this.f85166id;
    }

    @NotNull
    public final String component10() {
        return this.daysFromDue;
    }

    @NotNull
    public final String component11() {
        return this.product;
    }

    @NotNull
    public final String component12() {
        return this.unpaidBillCount;
    }

    @NotNull
    public final String component2() {
        return this.serviceId;
    }

    @NotNull
    public final String component3() {
        return this.orgName;
    }

    public final boolean component4() {
        return this.contactStatus;
    }

    @NotNull
    public final String component5() {
        return this.ban;
    }

    @NotNull
    public final String component6() {
        return this.saleCode;
    }

    @NotNull
    public final Date component7() {
        return this.inquiryDate;
    }

    @NotNull
    public final Date component8() {
        return this.billStatusDate;
    }

    @NotNull
    public final String component9() {
        return this.dueStatus;
    }

    @NotNull
    public final OneNadOutboundBillingItem copy(@NotNull String id2, @NotNull String serviceId, @NotNull String orgName, boolean z, @NotNull String ban, @NotNull String saleCode, @NotNull Date inquiryDate, @NotNull Date billStatusDate, @NotNull String dueStatus, @NotNull String daysFromDue, @NotNull String product, @NotNull String unpaidBillCount) {
        Intrinsics.checkNotNullParameter(id2, "id");
        Intrinsics.checkNotNullParameter(serviceId, "serviceId");
        Intrinsics.checkNotNullParameter(orgName, "orgName");
        Intrinsics.checkNotNullParameter(ban, "ban");
        Intrinsics.checkNotNullParameter(saleCode, "saleCode");
        Intrinsics.checkNotNullParameter(inquiryDate, "inquiryDate");
        Intrinsics.checkNotNullParameter(billStatusDate, "billStatusDate");
        Intrinsics.checkNotNullParameter(dueStatus, "dueStatus");
        Intrinsics.checkNotNullParameter(daysFromDue, "daysFromDue");
        Intrinsics.checkNotNullParameter(product, "product");
        Intrinsics.checkNotNullParameter(unpaidBillCount, "unpaidBillCount");
        return new OneNadOutboundBillingItem(id2, serviceId, orgName, z, ban, saleCode, inquiryDate, billStatusDate, dueStatus, daysFromDue, product, unpaidBillCount);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof OneNadOutboundBillingItem) {
            OneNadOutboundBillingItem oneNadOutboundBillingItem = (OneNadOutboundBillingItem) obj;
            return Intrinsics.areEqual(this.f85166id, oneNadOutboundBillingItem.f85166id) && Intrinsics.areEqual(this.serviceId, oneNadOutboundBillingItem.serviceId) && Intrinsics.areEqual(this.orgName, oneNadOutboundBillingItem.orgName) && this.contactStatus == oneNadOutboundBillingItem.contactStatus && Intrinsics.areEqual(this.ban, oneNadOutboundBillingItem.ban) && Intrinsics.areEqual(this.saleCode, oneNadOutboundBillingItem.saleCode) && Intrinsics.areEqual(this.inquiryDate, oneNadOutboundBillingItem.inquiryDate) && Intrinsics.areEqual(this.billStatusDate, oneNadOutboundBillingItem.billStatusDate) && Intrinsics.areEqual(this.dueStatus, oneNadOutboundBillingItem.dueStatus) && Intrinsics.areEqual(this.daysFromDue, oneNadOutboundBillingItem.daysFromDue) && Intrinsics.areEqual(this.product, oneNadOutboundBillingItem.product) && Intrinsics.areEqual(this.unpaidBillCount, oneNadOutboundBillingItem.unpaidBillCount);
        }
        return false;
    }

    @NotNull
    public final String getBan() {
        return this.ban;
    }

    @NotNull
    public final Date getBillStatusDate() {
        return this.billStatusDate;
    }

    public final boolean getContactStatus() {
        return this.contactStatus;
    }

    @NotNull
    public final String getDaysFromDue() {
        return this.daysFromDue;
    }

    @NotNull
    public final String getDueStatus() {
        return this.dueStatus;
    }

    @NotNull
    public final String getId() {
        return this.f85166id;
    }

    @NotNull
    public final Date getInquiryDate() {
        return this.inquiryDate;
    }

    @NotNull
    public final String getOrgName() {
        return this.orgName;
    }

    @NotNull
    public final String getProduct() {
        return this.product;
    }

    @NotNull
    public final String getSaleCode() {
        return this.saleCode;
    }

    @NotNull
    public final String getServiceId() {
        return this.serviceId;
    }

    @NotNull
    public final String getUnpaidBillCount() {
        return this.unpaidBillCount;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode = ((((this.f85166id.hashCode() * 31) + this.serviceId.hashCode()) * 31) + this.orgName.hashCode()) * 31;
        boolean z = this.contactStatus;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        return ((((((((((((((((hashCode + i) * 31) + this.ban.hashCode()) * 31) + this.saleCode.hashCode()) * 31) + this.inquiryDate.hashCode()) * 31) + this.billStatusDate.hashCode()) * 31) + this.dueStatus.hashCode()) * 31) + this.daysFromDue.hashCode()) * 31) + this.product.hashCode()) * 31) + this.unpaidBillCount.hashCode();
    }

    public final void setServiceId(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.serviceId = str;
    }

    @NotNull
    public String toString() {
        String str = this.f85166id;
        String str2 = this.serviceId;
        String str3 = this.orgName;
        boolean z = this.contactStatus;
        String str4 = this.ban;
        String str5 = this.saleCode;
        Date date = this.inquiryDate;
        Date date2 = this.billStatusDate;
        String str6 = this.dueStatus;
        String str7 = this.daysFromDue;
        String str8 = this.product;
        String str9 = this.unpaidBillCount;
        return "OneNadOutboundBillingItem(id=" + str + ", serviceId=" + str2 + ", orgName=" + str3 + ", contactStatus=" + z + ", ban=" + str4 + ", saleCode=" + str5 + ", inquiryDate=" + date + ", billStatusDate=" + date2 + ", dueStatus=" + str6 + ", daysFromDue=" + str7 + ", product=" + str8 + ", unpaidBillCount=" + str9 + ")";
    }

    public /* synthetic */ OneNadOutboundBillingItem(String str, String str2, String str3, boolean z, String str4, String str5, Date date, Date date2, String str6, String str7, String str8, String str9, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, (i & 8) != 0 ? false : z, str4, str5, date, date2, str6, str7, str8, str9);
    }
}