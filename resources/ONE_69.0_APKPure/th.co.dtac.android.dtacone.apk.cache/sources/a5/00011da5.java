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
import th.p047co.dtac.android.dtacone.view.fragment.mrtr_prepaid_registration.family_sim.InputPostpaidFamilySimSubscriberFragment;

@StabilityInferred(parameters = 0)
@Metadata(m29143d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b:\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B±\u0001\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003\u0012\b\b\u0002\u0010\b\u001a\u00020\u0003\u0012\b\b\u0002\u0010\t\u001a\u00020\u0003\u0012\b\b\u0002\u0010\n\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0003\u0012\b\b\u0002\u0010\f\u001a\u00020\u0003\u0012\b\b\u0002\u0010\r\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u0003\u0012\u000e\b\u0002\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010\u0012\u000e\b\u0002\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0015¢\u0006\u0002\u0010\u0016J\t\u0010<\u001a\u00020\u0003HÆ\u0003J\t\u0010=\u001a\u00020\u0003HÆ\u0003J\t\u0010>\u001a\u00020\u0003HÆ\u0003J\t\u0010?\u001a\u00020\u0003HÆ\u0003J\u000f\u0010@\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010HÆ\u0003J\u000f\u0010A\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010HÆ\u0003J\t\u0010B\u001a\u00020\u0003HÆ\u0003J\t\u0010C\u001a\u00020\u0015HÆ\u0003J\t\u0010D\u001a\u00020\u0003HÆ\u0003J\t\u0010E\u001a\u00020\u0003HÆ\u0003J\t\u0010F\u001a\u00020\u0003HÆ\u0003J\t\u0010G\u001a\u00020\u0003HÆ\u0003J\t\u0010H\u001a\u00020\u0003HÆ\u0003J\t\u0010I\u001a\u00020\u0003HÆ\u0003J\t\u0010J\u001a\u00020\u0003HÆ\u0003J\t\u0010K\u001a\u00020\u0003HÆ\u0003Jµ\u0001\u0010L\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\u00032\b\b\u0002\u0010\f\u001a\u00020\u00032\b\b\u0002\u0010\r\u001a\u00020\u00032\b\b\u0002\u0010\u000e\u001a\u00020\u00032\u000e\b\u0002\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u00102\u000e\b\u0002\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u00102\b\b\u0002\u0010\u0013\u001a\u00020\u00032\b\b\u0002\u0010\u0014\u001a\u00020\u0015HÆ\u0001J\u0013\u0010M\u001a\u00020\u00152\b\u0010N\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010O\u001a\u00020PHÖ\u0001J\t\u0010Q\u001a\u00020\u0003HÖ\u0001R\u001e\u0010\u0002\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u001e\u0010\u0004\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u0018\"\u0004\b\u001c\u0010\u001aR\u001e\u0010\u0005\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u0018\"\u0004\b\u001e\u0010\u001aR\u001e\u0010\u0013\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010\u0018\"\u0004\b \u0010\u001aR\u001e\u0010\u0006\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\u0018\"\u0004\b\"\u0010\u001aR\u001e\u0010\u0007\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b#\u0010\u0018\"\u0004\b$\u0010\u001aR\u001e\u0010\u0014\u001a\u00020\u00158\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010%\"\u0004\b&\u0010'R\u001e\u0010\b\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b(\u0010\u0018\"\u0004\b)\u0010\u001aR$\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u00108\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b*\u0010+\"\u0004\b,\u0010-R$\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u00108\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b.\u0010+\"\u0004\b/\u0010-R\u001e\u0010\t\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b0\u0010\u0018\"\u0004\b1\u0010\u001aR\u001e\u0010\n\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b2\u0010\u0018\"\u0004\b3\u0010\u001aR\u001e\u0010\r\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b4\u0010\u0018\"\u0004\b5\u0010\u001aR\u001e\u0010\u000b\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b6\u0010\u0018\"\u0004\b7\u0010\u001aR\u001e\u0010\f\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b8\u0010\u0018\"\u0004\b9\u0010\u001aR\u001e\u0010\u000e\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b:\u0010\u0018\"\u0004\b;\u0010\u001a¨\u0006R"}, m29142d2 = {"Lth/co/dtac/android/dtacone/model/customerenquiry/DataUsageInfoModel;", "", "arpuaverage3months", "", "behavior", "customerNumber", "generatedPeriod", "internetusagevolumnaverage3months", "minuteofuseaverage3months", "refillamountaverage3months", "refillaverage3months", "retentionGrade", InputPostpaidFamilySimSubscriberFragment.SUB_NUM, "requestId", "upsellRequestId", "offerList", "", "Lth/co/dtac/android/dtacone/model/customerenquiry/Offer;", "offerDownsellList", "downsellMessage", "isOnline", "", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/lang/String;Z)V", "getArpuaverage3months", "()Ljava/lang/String;", "setArpuaverage3months", "(Ljava/lang/String;)V", "getBehavior", "setBehavior", "getCustomerNumber", "setCustomerNumber", "getDownsellMessage", "setDownsellMessage", "getGeneratedPeriod", "setGeneratedPeriod", "getInternetusagevolumnaverage3months", "setInternetusagevolumnaverage3months", "()Z", "setOnline", "(Z)V", "getMinuteofuseaverage3months", "setMinuteofuseaverage3months", "getOfferDownsellList", "()Ljava/util/List;", "setOfferDownsellList", "(Ljava/util/List;)V", "getOfferList", "setOfferList", "getRefillamountaverage3months", "setRefillamountaverage3months", "getRefillaverage3months", "setRefillaverage3months", "getRequestId", "setRequestId", "getRetentionGrade", "setRetentionGrade", "getSubscriberNumber", "setSubscriberNumber", "getUpsellRequestId", "setUpsellRequestId", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "other", "hashCode", "", "toString", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.model.customerenquiry.DataUsageInfoModel */
/* loaded from: classes8.dex */
public final class DataUsageInfoModel {
    public static final int $stable = 8;
    @SerializedName("arpuaverage3months")
    @NotNull
    private String arpuaverage3months;
    @SerializedName("behavior")
    @NotNull
    private String behavior;
    @SerializedName("customerNumber")
    @NotNull
    private String customerNumber;
    @SerializedName("downsellMessage")
    @NotNull
    private String downsellMessage;
    @SerializedName("generatedPeriod")
    @NotNull
    private String generatedPeriod;
    @SerializedName("internetusagevolumnaverage3months")
    @NotNull
    private String internetusagevolumnaverage3months;
    @SerializedName("isOnline")
    private boolean isOnline;
    @SerializedName("minuteofuseaverage3months")
    @NotNull
    private String minuteofuseaverage3months;
    @SerializedName("offerDownsellList")
    @NotNull
    private List<Offer> offerDownsellList;
    @SerializedName("offerList")
    @NotNull
    private List<Offer> offerList;
    @SerializedName("refillamountaverage3months")
    @NotNull
    private String refillamountaverage3months;
    @SerializedName("refillaverage3months")
    @NotNull
    private String refillaverage3months;
    @SerializedName("requestId")
    @NotNull
    private String requestId;
    @SerializedName("retentionGrade")
    @NotNull
    private String retentionGrade;
    @SerializedName(InputPostpaidFamilySimSubscriberFragment.SUB_NUM)
    @NotNull
    private String subscriberNumber;
    @SerializedName("upsellRequestId")
    @NotNull
    private String upsellRequestId;

    public DataUsageInfoModel() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, 65535, null);
    }

    @NotNull
    public final String component1() {
        return this.arpuaverage3months;
    }

    @NotNull
    public final String component10() {
        return this.subscriberNumber;
    }

    @NotNull
    public final String component11() {
        return this.requestId;
    }

    @NotNull
    public final String component12() {
        return this.upsellRequestId;
    }

    @NotNull
    public final List<Offer> component13() {
        return this.offerList;
    }

    @NotNull
    public final List<Offer> component14() {
        return this.offerDownsellList;
    }

    @NotNull
    public final String component15() {
        return this.downsellMessage;
    }

    public final boolean component16() {
        return this.isOnline;
    }

    @NotNull
    public final String component2() {
        return this.behavior;
    }

    @NotNull
    public final String component3() {
        return this.customerNumber;
    }

    @NotNull
    public final String component4() {
        return this.generatedPeriod;
    }

    @NotNull
    public final String component5() {
        return this.internetusagevolumnaverage3months;
    }

    @NotNull
    public final String component6() {
        return this.minuteofuseaverage3months;
    }

    @NotNull
    public final String component7() {
        return this.refillamountaverage3months;
    }

    @NotNull
    public final String component8() {
        return this.refillaverage3months;
    }

    @NotNull
    public final String component9() {
        return this.retentionGrade;
    }

    @NotNull
    public final DataUsageInfoModel copy(@NotNull String arpuaverage3months, @NotNull String behavior, @NotNull String customerNumber, @NotNull String generatedPeriod, @NotNull String internetusagevolumnaverage3months, @NotNull String minuteofuseaverage3months, @NotNull String refillamountaverage3months, @NotNull String refillaverage3months, @NotNull String retentionGrade, @NotNull String subscriberNumber, @NotNull String requestId, @NotNull String upsellRequestId, @NotNull List<Offer> offerList, @NotNull List<Offer> offerDownsellList, @NotNull String downsellMessage, boolean z) {
        Intrinsics.checkNotNullParameter(arpuaverage3months, "arpuaverage3months");
        Intrinsics.checkNotNullParameter(behavior, "behavior");
        Intrinsics.checkNotNullParameter(customerNumber, "customerNumber");
        Intrinsics.checkNotNullParameter(generatedPeriod, "generatedPeriod");
        Intrinsics.checkNotNullParameter(internetusagevolumnaverage3months, "internetusagevolumnaverage3months");
        Intrinsics.checkNotNullParameter(minuteofuseaverage3months, "minuteofuseaverage3months");
        Intrinsics.checkNotNullParameter(refillamountaverage3months, "refillamountaverage3months");
        Intrinsics.checkNotNullParameter(refillaverage3months, "refillaverage3months");
        Intrinsics.checkNotNullParameter(retentionGrade, "retentionGrade");
        Intrinsics.checkNotNullParameter(subscriberNumber, "subscriberNumber");
        Intrinsics.checkNotNullParameter(requestId, "requestId");
        Intrinsics.checkNotNullParameter(upsellRequestId, "upsellRequestId");
        Intrinsics.checkNotNullParameter(offerList, "offerList");
        Intrinsics.checkNotNullParameter(offerDownsellList, "offerDownsellList");
        Intrinsics.checkNotNullParameter(downsellMessage, "downsellMessage");
        return new DataUsageInfoModel(arpuaverage3months, behavior, customerNumber, generatedPeriod, internetusagevolumnaverage3months, minuteofuseaverage3months, refillamountaverage3months, refillaverage3months, retentionGrade, subscriberNumber, requestId, upsellRequestId, offerList, offerDownsellList, downsellMessage, z);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof DataUsageInfoModel) {
            DataUsageInfoModel dataUsageInfoModel = (DataUsageInfoModel) obj;
            return Intrinsics.areEqual(this.arpuaverage3months, dataUsageInfoModel.arpuaverage3months) && Intrinsics.areEqual(this.behavior, dataUsageInfoModel.behavior) && Intrinsics.areEqual(this.customerNumber, dataUsageInfoModel.customerNumber) && Intrinsics.areEqual(this.generatedPeriod, dataUsageInfoModel.generatedPeriod) && Intrinsics.areEqual(this.internetusagevolumnaverage3months, dataUsageInfoModel.internetusagevolumnaverage3months) && Intrinsics.areEqual(this.minuteofuseaverage3months, dataUsageInfoModel.minuteofuseaverage3months) && Intrinsics.areEqual(this.refillamountaverage3months, dataUsageInfoModel.refillamountaverage3months) && Intrinsics.areEqual(this.refillaverage3months, dataUsageInfoModel.refillaverage3months) && Intrinsics.areEqual(this.retentionGrade, dataUsageInfoModel.retentionGrade) && Intrinsics.areEqual(this.subscriberNumber, dataUsageInfoModel.subscriberNumber) && Intrinsics.areEqual(this.requestId, dataUsageInfoModel.requestId) && Intrinsics.areEqual(this.upsellRequestId, dataUsageInfoModel.upsellRequestId) && Intrinsics.areEqual(this.offerList, dataUsageInfoModel.offerList) && Intrinsics.areEqual(this.offerDownsellList, dataUsageInfoModel.offerDownsellList) && Intrinsics.areEqual(this.downsellMessage, dataUsageInfoModel.downsellMessage) && this.isOnline == dataUsageInfoModel.isOnline;
        }
        return false;
    }

    @NotNull
    public final String getArpuaverage3months() {
        return this.arpuaverage3months;
    }

    @NotNull
    public final String getBehavior() {
        return this.behavior;
    }

    @NotNull
    public final String getCustomerNumber() {
        return this.customerNumber;
    }

    @NotNull
    public final String getDownsellMessage() {
        return this.downsellMessage;
    }

    @NotNull
    public final String getGeneratedPeriod() {
        return this.generatedPeriod;
    }

    @NotNull
    public final String getInternetusagevolumnaverage3months() {
        return this.internetusagevolumnaverage3months;
    }

    @NotNull
    public final String getMinuteofuseaverage3months() {
        return this.minuteofuseaverage3months;
    }

    @NotNull
    public final List<Offer> getOfferDownsellList() {
        return this.offerDownsellList;
    }

    @NotNull
    public final List<Offer> getOfferList() {
        return this.offerList;
    }

    @NotNull
    public final String getRefillamountaverage3months() {
        return this.refillamountaverage3months;
    }

    @NotNull
    public final String getRefillaverage3months() {
        return this.refillaverage3months;
    }

    @NotNull
    public final String getRequestId() {
        return this.requestId;
    }

    @NotNull
    public final String getRetentionGrade() {
        return this.retentionGrade;
    }

    @NotNull
    public final String getSubscriberNumber() {
        return this.subscriberNumber;
    }

    @NotNull
    public final String getUpsellRequestId() {
        return this.upsellRequestId;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode = ((((((((((((((((((((((((((((this.arpuaverage3months.hashCode() * 31) + this.behavior.hashCode()) * 31) + this.customerNumber.hashCode()) * 31) + this.generatedPeriod.hashCode()) * 31) + this.internetusagevolumnaverage3months.hashCode()) * 31) + this.minuteofuseaverage3months.hashCode()) * 31) + this.refillamountaverage3months.hashCode()) * 31) + this.refillaverage3months.hashCode()) * 31) + this.retentionGrade.hashCode()) * 31) + this.subscriberNumber.hashCode()) * 31) + this.requestId.hashCode()) * 31) + this.upsellRequestId.hashCode()) * 31) + this.offerList.hashCode()) * 31) + this.offerDownsellList.hashCode()) * 31) + this.downsellMessage.hashCode()) * 31;
        boolean z = this.isOnline;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        return hashCode + i;
    }

    public final boolean isOnline() {
        return this.isOnline;
    }

    public final void setArpuaverage3months(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.arpuaverage3months = str;
    }

    public final void setBehavior(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.behavior = str;
    }

    public final void setCustomerNumber(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.customerNumber = str;
    }

    public final void setDownsellMessage(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.downsellMessage = str;
    }

    public final void setGeneratedPeriod(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.generatedPeriod = str;
    }

    public final void setInternetusagevolumnaverage3months(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.internetusagevolumnaverage3months = str;
    }

    public final void setMinuteofuseaverage3months(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.minuteofuseaverage3months = str;
    }

    public final void setOfferDownsellList(@NotNull List<Offer> list) {
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.offerDownsellList = list;
    }

    public final void setOfferList(@NotNull List<Offer> list) {
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.offerList = list;
    }

    public final void setOnline(boolean z) {
        this.isOnline = z;
    }

    public final void setRefillamountaverage3months(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.refillamountaverage3months = str;
    }

    public final void setRefillaverage3months(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.refillaverage3months = str;
    }

    public final void setRequestId(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.requestId = str;
    }

    public final void setRetentionGrade(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.retentionGrade = str;
    }

    public final void setSubscriberNumber(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.subscriberNumber = str;
    }

    public final void setUpsellRequestId(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.upsellRequestId = str;
    }

    @NotNull
    public String toString() {
        String str = this.arpuaverage3months;
        String str2 = this.behavior;
        String str3 = this.customerNumber;
        String str4 = this.generatedPeriod;
        String str5 = this.internetusagevolumnaverage3months;
        String str6 = this.minuteofuseaverage3months;
        String str7 = this.refillamountaverage3months;
        String str8 = this.refillaverage3months;
        String str9 = this.retentionGrade;
        String str10 = this.subscriberNumber;
        String str11 = this.requestId;
        String str12 = this.upsellRequestId;
        List<Offer> list = this.offerList;
        List<Offer> list2 = this.offerDownsellList;
        String str13 = this.downsellMessage;
        boolean z = this.isOnline;
        return "DataUsageInfoModel(arpuaverage3months=" + str + ", behavior=" + str2 + ", customerNumber=" + str3 + ", generatedPeriod=" + str4 + ", internetusagevolumnaverage3months=" + str5 + ", minuteofuseaverage3months=" + str6 + ", refillamountaverage3months=" + str7 + ", refillaverage3months=" + str8 + ", retentionGrade=" + str9 + ", subscriberNumber=" + str10 + ", requestId=" + str11 + ", upsellRequestId=" + str12 + ", offerList=" + list + ", offerDownsellList=" + list2 + ", downsellMessage=" + str13 + ", isOnline=" + z + ")";
    }

    public DataUsageInfoModel(@NotNull String arpuaverage3months, @NotNull String behavior, @NotNull String customerNumber, @NotNull String generatedPeriod, @NotNull String internetusagevolumnaverage3months, @NotNull String minuteofuseaverage3months, @NotNull String refillamountaverage3months, @NotNull String refillaverage3months, @NotNull String retentionGrade, @NotNull String subscriberNumber, @NotNull String requestId, @NotNull String upsellRequestId, @NotNull List<Offer> offerList, @NotNull List<Offer> offerDownsellList, @NotNull String downsellMessage, boolean z) {
        Intrinsics.checkNotNullParameter(arpuaverage3months, "arpuaverage3months");
        Intrinsics.checkNotNullParameter(behavior, "behavior");
        Intrinsics.checkNotNullParameter(customerNumber, "customerNumber");
        Intrinsics.checkNotNullParameter(generatedPeriod, "generatedPeriod");
        Intrinsics.checkNotNullParameter(internetusagevolumnaverage3months, "internetusagevolumnaverage3months");
        Intrinsics.checkNotNullParameter(minuteofuseaverage3months, "minuteofuseaverage3months");
        Intrinsics.checkNotNullParameter(refillamountaverage3months, "refillamountaverage3months");
        Intrinsics.checkNotNullParameter(refillaverage3months, "refillaverage3months");
        Intrinsics.checkNotNullParameter(retentionGrade, "retentionGrade");
        Intrinsics.checkNotNullParameter(subscriberNumber, "subscriberNumber");
        Intrinsics.checkNotNullParameter(requestId, "requestId");
        Intrinsics.checkNotNullParameter(upsellRequestId, "upsellRequestId");
        Intrinsics.checkNotNullParameter(offerList, "offerList");
        Intrinsics.checkNotNullParameter(offerDownsellList, "offerDownsellList");
        Intrinsics.checkNotNullParameter(downsellMessage, "downsellMessage");
        this.arpuaverage3months = arpuaverage3months;
        this.behavior = behavior;
        this.customerNumber = customerNumber;
        this.generatedPeriod = generatedPeriod;
        this.internetusagevolumnaverage3months = internetusagevolumnaverage3months;
        this.minuteofuseaverage3months = minuteofuseaverage3months;
        this.refillamountaverage3months = refillamountaverage3months;
        this.refillaverage3months = refillaverage3months;
        this.retentionGrade = retentionGrade;
        this.subscriberNumber = subscriberNumber;
        this.requestId = requestId;
        this.upsellRequestId = upsellRequestId;
        this.offerList = offerList;
        this.offerDownsellList = offerDownsellList;
        this.downsellMessage = downsellMessage;
        this.isOnline = z;
    }

    public /* synthetic */ DataUsageInfoModel(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, List list, List list2, String str13, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? "" : str4, (i & 16) != 0 ? "" : str5, (i & 32) != 0 ? "" : str6, (i & 64) != 0 ? "" : str7, (i & 128) != 0 ? "" : str8, (i & 256) != 0 ? "" : str9, (i & 512) != 0 ? "" : str10, (i & 1024) != 0 ? "" : str11, (i & 2048) != 0 ? "" : str12, (i & 4096) != 0 ? new ArrayList() : list, (i & 8192) != 0 ? new ArrayList() : list2, (i & 16384) != 0 ? "" : str13, (i & 32768) != 0 ? false : z);
    }
}