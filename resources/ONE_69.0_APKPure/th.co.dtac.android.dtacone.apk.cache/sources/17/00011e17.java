package th.p047co.dtac.android.dtacone.model.device_sale;

import androidx.compose.runtime.internal.StabilityInferred;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import th.p047co.dtac.android.dtacone.model.customerenquiry.ContractItem;
import th.p047co.dtac.android.dtacone.util.p052enum.DeviceSaleCampaignType;
import th.p047co.dtac.android.dtacone.view.fragment.mrtr_prepaid_registration.family_sim.InputPostpaidFamilySimSubscriberFragment;
import th.p047co.dtac.android.dtacone.viewmodel.device_sale.model.ReceiptInfo;

@StabilityInferred(parameters = 0)
@Metadata(m29143d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\bU\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B×\u0001\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u0012\u0010\b\u0002\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u0011\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0015\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0017\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0019\u0012\b\b\u0002\u0010\u001a\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u001c\u0012\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u001e\u0012\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010 \u0012\b\b\u0002\u0010!\u001a\u00020\u0003¢\u0006\u0002\u0010\"J\t\u0010_\u001a\u00020\u0003HÆ\u0003J\u000b\u0010`\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u0010\u0010a\u001a\u0004\u0018\u00010\u0015HÆ\u0003¢\u0006\u0002\u00108J\u000b\u0010b\u001a\u0004\u0018\u00010\u0017HÆ\u0003J\u000b\u0010c\u001a\u0004\u0018\u00010\u0019HÆ\u0003J\t\u0010d\u001a\u00020\u0003HÆ\u0003J\u000b\u0010e\u001a\u0004\u0018\u00010\u001cHÆ\u0003J\u000b\u0010f\u001a\u0004\u0018\u00010\u001eHÆ\u0003J\u000b\u0010g\u001a\u0004\u0018\u00010 HÆ\u0003J\t\u0010h\u001a\u00020\u0003HÆ\u0003J\t\u0010i\u001a\u00020\u0005HÆ\u0003J\t\u0010j\u001a\u00020\u0007HÆ\u0003J\t\u0010k\u001a\u00020\u0007HÆ\u0003J\u000b\u0010l\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010m\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\u000b\u0010n\u001a\u0004\u0018\u00010\rHÆ\u0003J\u000b\u0010o\u001a\u0004\u0018\u00010\u000fHÆ\u0003J\u0011\u0010p\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u0011HÆ\u0003Jà\u0001\u0010q\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\u0010\b\u0002\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u00112\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00152\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00172\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00192\b\b\u0002\u0010\u001a\u001a\u00020\u00032\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u001c2\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u001e2\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010 2\b\b\u0002\u0010!\u001a\u00020\u0003HÆ\u0001¢\u0006\u0002\u0010rJ\u0013\u0010s\u001a\u00020\u00032\b\u0010t\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010u\u001a\u00020vHÖ\u0001J\t\u0010w\u001a\u00020\u0007HÖ\u0001R\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b'\u0010(\"\u0004\b)\u0010*R\u001c\u0010\t\u001a\u0004\u0018\u00010\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b+\u0010$\"\u0004\b,\u0010&R\u001c\u0010\u001f\u001a\u0004\u0018\u00010 X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b-\u0010.\"\u0004\b/\u00100R\u001a\u0010\b\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b1\u0010$\"\u0004\b2\u0010&R\u001c\u0010\u001d\u001a\u0004\u0018\u00010\u001eX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b3\u00104\"\u0004\b5\u00106R\u001e\u0010\u0014\u001a\u0004\u0018\u00010\u0015X\u0086\u000e¢\u0006\u0010\n\u0002\u0010;\u001a\u0004\b7\u00108\"\u0004\b9\u0010:R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b<\u0010=\"\u0004\b>\u0010?R\"\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u0011X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b@\u0010A\"\u0004\bB\u0010CR\u001a\u0010\u001a\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010D\"\u0004\bE\u0010FR\u001a\u0010!\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b!\u0010D\"\u0004\bG\u0010FR\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0002\u0010D\"\u0004\bH\u0010FR\u001c\u0010\f\u001a\u0004\u0018\u00010\rX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bI\u0010J\"\u0004\bK\u0010LR\u001c\u0010\u0018\u001a\u0004\u0018\u00010\u0019X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bM\u0010N\"\u0004\bO\u0010PR\u001c\u0010\u0016\u001a\u0004\u0018\u00010\u0017X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bQ\u0010R\"\u0004\bS\u0010TR\u001c\u0010\u001b\u001a\u0004\u0018\u00010\u001cX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bU\u0010V\"\u0004\bW\u0010XR\u001a\u0010\u0006\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bY\u0010$\"\u0004\bZ\u0010&R\u001c\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b[\u0010\\\"\u0004\b]\u0010^¨\u0006x"}, m29142d2 = {"Lth/co/dtac/android/dtacone/model/device_sale/DeviceSaleModel;", "", "isRequirePaymentInfo", "", "flowIdCampaignType", "Lth/co/dtac/android/dtacone/util/enum/DeviceSaleCampaignType;", InputPostpaidFamilySimSubscriberFragment.SUB_NUM, "", "customerNumber", "canBuyDeviceWithContract", "verifySubscriberModel", "Lth/co/dtac/android/dtacone/model/device_sale/DeviceSaleVerifySubrResponse;", "itemInfo", "Lth/co/dtac/android/dtacone/model/device_sale/DeviceSaleItemInfo;", "campaign", "Lth/co/dtac/android/dtacone/model/device_sale/Campaign;", "inputFields", "", "Lth/co/dtac/android/dtacone/model/device_sale/FieldInput;", "blacklistSharingStatus", "extraAdvanceAmount", "", "receiptInfo", "Lth/co/dtac/android/dtacone/viewmodel/device_sale/model/ReceiptInfo;", "newIMEIResponse", "Lth/co/dtac/android/dtacone/model/device_sale/GetNewIMEIResponse;", "isFromPostpaid", "selectedDiscount", "Lth/co/dtac/android/dtacone/model/device_sale/Discount;", "deviceSummaryContractItem", "Lth/co/dtac/android/dtacone/model/customerenquiry/ContractItem;", "check1IDXDeviceResponse", "Lth/co/dtac/android/dtacone/model/device_sale/Check1IDXDeviceResponse;", "isOverruleSuccess", "(ZLth/co/dtac/android/dtacone/util/enum/DeviceSaleCampaignType;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lth/co/dtac/android/dtacone/model/device_sale/DeviceSaleVerifySubrResponse;Lth/co/dtac/android/dtacone/model/device_sale/DeviceSaleItemInfo;Lth/co/dtac/android/dtacone/model/device_sale/Campaign;Ljava/util/List;Ljava/lang/String;Ljava/lang/Float;Lth/co/dtac/android/dtacone/viewmodel/device_sale/model/ReceiptInfo;Lth/co/dtac/android/dtacone/model/device_sale/GetNewIMEIResponse;ZLth/co/dtac/android/dtacone/model/device_sale/Discount;Lth/co/dtac/android/dtacone/model/customerenquiry/ContractItem;Lth/co/dtac/android/dtacone/model/device_sale/Check1IDXDeviceResponse;Z)V", "getBlacklistSharingStatus", "()Ljava/lang/String;", "setBlacklistSharingStatus", "(Ljava/lang/String;)V", "getCampaign", "()Lth/co/dtac/android/dtacone/model/device_sale/Campaign;", "setCampaign", "(Lth/co/dtac/android/dtacone/model/device_sale/Campaign;)V", "getCanBuyDeviceWithContract", "setCanBuyDeviceWithContract", "getCheck1IDXDeviceResponse", "()Lth/co/dtac/android/dtacone/model/device_sale/Check1IDXDeviceResponse;", "setCheck1IDXDeviceResponse", "(Lth/co/dtac/android/dtacone/model/device_sale/Check1IDXDeviceResponse;)V", "getCustomerNumber", "setCustomerNumber", "getDeviceSummaryContractItem", "()Lth/co/dtac/android/dtacone/model/customerenquiry/ContractItem;", "setDeviceSummaryContractItem", "(Lth/co/dtac/android/dtacone/model/customerenquiry/ContractItem;)V", "getExtraAdvanceAmount", "()Ljava/lang/Float;", "setExtraAdvanceAmount", "(Ljava/lang/Float;)V", "Ljava/lang/Float;", "getFlowIdCampaignType", "()Lth/co/dtac/android/dtacone/util/enum/DeviceSaleCampaignType;", "setFlowIdCampaignType", "(Lth/co/dtac/android/dtacone/util/enum/DeviceSaleCampaignType;)V", "getInputFields", "()Ljava/util/List;", "setInputFields", "(Ljava/util/List;)V", "()Z", "setFromPostpaid", "(Z)V", "setOverruleSuccess", "setRequirePaymentInfo", "getItemInfo", "()Lth/co/dtac/android/dtacone/model/device_sale/DeviceSaleItemInfo;", "setItemInfo", "(Lth/co/dtac/android/dtacone/model/device_sale/DeviceSaleItemInfo;)V", "getNewIMEIResponse", "()Lth/co/dtac/android/dtacone/model/device_sale/GetNewIMEIResponse;", "setNewIMEIResponse", "(Lth/co/dtac/android/dtacone/model/device_sale/GetNewIMEIResponse;)V", "getReceiptInfo", "()Lth/co/dtac/android/dtacone/viewmodel/device_sale/model/ReceiptInfo;", "setReceiptInfo", "(Lth/co/dtac/android/dtacone/viewmodel/device_sale/model/ReceiptInfo;)V", "getSelectedDiscount", "()Lth/co/dtac/android/dtacone/model/device_sale/Discount;", "setSelectedDiscount", "(Lth/co/dtac/android/dtacone/model/device_sale/Discount;)V", "getSubscriberNumber", "setSubscriberNumber", "getVerifySubscriberModel", "()Lth/co/dtac/android/dtacone/model/device_sale/DeviceSaleVerifySubrResponse;", "setVerifySubscriberModel", "(Lth/co/dtac/android/dtacone/model/device_sale/DeviceSaleVerifySubrResponse;)V", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(ZLth/co/dtac/android/dtacone/util/enum/DeviceSaleCampaignType;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lth/co/dtac/android/dtacone/model/device_sale/DeviceSaleVerifySubrResponse;Lth/co/dtac/android/dtacone/model/device_sale/DeviceSaleItemInfo;Lth/co/dtac/android/dtacone/model/device_sale/Campaign;Ljava/util/List;Ljava/lang/String;Ljava/lang/Float;Lth/co/dtac/android/dtacone/viewmodel/device_sale/model/ReceiptInfo;Lth/co/dtac/android/dtacone/model/device_sale/GetNewIMEIResponse;ZLth/co/dtac/android/dtacone/model/device_sale/Discount;Lth/co/dtac/android/dtacone/model/customerenquiry/ContractItem;Lth/co/dtac/android/dtacone/model/device_sale/Check1IDXDeviceResponse;Z)Lth/co/dtac/android/dtacone/model/device_sale/DeviceSaleModel;", "equals", "other", "hashCode", "", "toString", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.model.device_sale.DeviceSaleModel */
/* loaded from: classes8.dex */
public final class DeviceSaleModel {
    public static final int $stable = 8;
    @Nullable
    private String blacklistSharingStatus;
    @Nullable
    private Campaign campaign;
    @Nullable
    private String canBuyDeviceWithContract;
    @Nullable
    private Check1IDXDeviceResponse check1IDXDeviceResponse;
    @NotNull
    private String customerNumber;
    @Nullable
    private ContractItem deviceSummaryContractItem;
    @Nullable
    private Float extraAdvanceAmount;
    @NotNull
    private DeviceSaleCampaignType flowIdCampaignType;
    @Nullable
    private List<FieldInput> inputFields;
    private boolean isFromPostpaid;
    private boolean isOverruleSuccess;
    private boolean isRequirePaymentInfo;
    @Nullable
    private DeviceSaleItemInfo itemInfo;
    @Nullable
    private GetNewIMEIResponse newIMEIResponse;
    @Nullable
    private ReceiptInfo receiptInfo;
    @Nullable
    private Discount selectedDiscount;
    @NotNull
    private String subscriberNumber;
    @Nullable
    private DeviceSaleVerifySubrResponse verifySubscriberModel;

    public DeviceSaleModel() {
        this(false, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, null, false, 262143, null);
    }

    public final boolean component1() {
        return this.isRequirePaymentInfo;
    }

    @Nullable
    public final String component10() {
        return this.blacklistSharingStatus;
    }

    @Nullable
    public final Float component11() {
        return this.extraAdvanceAmount;
    }

    @Nullable
    public final ReceiptInfo component12() {
        return this.receiptInfo;
    }

    @Nullable
    public final GetNewIMEIResponse component13() {
        return this.newIMEIResponse;
    }

    public final boolean component14() {
        return this.isFromPostpaid;
    }

    @Nullable
    public final Discount component15() {
        return this.selectedDiscount;
    }

    @Nullable
    public final ContractItem component16() {
        return this.deviceSummaryContractItem;
    }

    @Nullable
    public final Check1IDXDeviceResponse component17() {
        return this.check1IDXDeviceResponse;
    }

    public final boolean component18() {
        return this.isOverruleSuccess;
    }

    @NotNull
    public final DeviceSaleCampaignType component2() {
        return this.flowIdCampaignType;
    }

    @NotNull
    public final String component3() {
        return this.subscriberNumber;
    }

    @NotNull
    public final String component4() {
        return this.customerNumber;
    }

    @Nullable
    public final String component5() {
        return this.canBuyDeviceWithContract;
    }

    @Nullable
    public final DeviceSaleVerifySubrResponse component6() {
        return this.verifySubscriberModel;
    }

    @Nullable
    public final DeviceSaleItemInfo component7() {
        return this.itemInfo;
    }

    @Nullable
    public final Campaign component8() {
        return this.campaign;
    }

    @Nullable
    public final List<FieldInput> component9() {
        return this.inputFields;
    }

    @NotNull
    public final DeviceSaleModel copy(boolean z, @NotNull DeviceSaleCampaignType flowIdCampaignType, @NotNull String subscriberNumber, @NotNull String customerNumber, @Nullable String str, @Nullable DeviceSaleVerifySubrResponse deviceSaleVerifySubrResponse, @Nullable DeviceSaleItemInfo deviceSaleItemInfo, @Nullable Campaign campaign, @Nullable List<FieldInput> list, @Nullable String str2, @Nullable Float f, @Nullable ReceiptInfo receiptInfo, @Nullable GetNewIMEIResponse getNewIMEIResponse, boolean z2, @Nullable Discount discount, @Nullable ContractItem contractItem, @Nullable Check1IDXDeviceResponse check1IDXDeviceResponse, boolean z3) {
        Intrinsics.checkNotNullParameter(flowIdCampaignType, "flowIdCampaignType");
        Intrinsics.checkNotNullParameter(subscriberNumber, "subscriberNumber");
        Intrinsics.checkNotNullParameter(customerNumber, "customerNumber");
        return new DeviceSaleModel(z, flowIdCampaignType, subscriberNumber, customerNumber, str, deviceSaleVerifySubrResponse, deviceSaleItemInfo, campaign, list, str2, f, receiptInfo, getNewIMEIResponse, z2, discount, contractItem, check1IDXDeviceResponse, z3);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof DeviceSaleModel) {
            DeviceSaleModel deviceSaleModel = (DeviceSaleModel) obj;
            return this.isRequirePaymentInfo == deviceSaleModel.isRequirePaymentInfo && this.flowIdCampaignType == deviceSaleModel.flowIdCampaignType && Intrinsics.areEqual(this.subscriberNumber, deviceSaleModel.subscriberNumber) && Intrinsics.areEqual(this.customerNumber, deviceSaleModel.customerNumber) && Intrinsics.areEqual(this.canBuyDeviceWithContract, deviceSaleModel.canBuyDeviceWithContract) && Intrinsics.areEqual(this.verifySubscriberModel, deviceSaleModel.verifySubscriberModel) && Intrinsics.areEqual(this.itemInfo, deviceSaleModel.itemInfo) && Intrinsics.areEqual(this.campaign, deviceSaleModel.campaign) && Intrinsics.areEqual(this.inputFields, deviceSaleModel.inputFields) && Intrinsics.areEqual(this.blacklistSharingStatus, deviceSaleModel.blacklistSharingStatus) && Intrinsics.areEqual((Object) this.extraAdvanceAmount, (Object) deviceSaleModel.extraAdvanceAmount) && Intrinsics.areEqual(this.receiptInfo, deviceSaleModel.receiptInfo) && Intrinsics.areEqual(this.newIMEIResponse, deviceSaleModel.newIMEIResponse) && this.isFromPostpaid == deviceSaleModel.isFromPostpaid && Intrinsics.areEqual(this.selectedDiscount, deviceSaleModel.selectedDiscount) && Intrinsics.areEqual(this.deviceSummaryContractItem, deviceSaleModel.deviceSummaryContractItem) && Intrinsics.areEqual(this.check1IDXDeviceResponse, deviceSaleModel.check1IDXDeviceResponse) && this.isOverruleSuccess == deviceSaleModel.isOverruleSuccess;
        }
        return false;
    }

    @Nullable
    public final String getBlacklistSharingStatus() {
        return this.blacklistSharingStatus;
    }

    @Nullable
    public final Campaign getCampaign() {
        return this.campaign;
    }

    @Nullable
    public final String getCanBuyDeviceWithContract() {
        return this.canBuyDeviceWithContract;
    }

    @Nullable
    public final Check1IDXDeviceResponse getCheck1IDXDeviceResponse() {
        return this.check1IDXDeviceResponse;
    }

    @NotNull
    public final String getCustomerNumber() {
        return this.customerNumber;
    }

    @Nullable
    public final ContractItem getDeviceSummaryContractItem() {
        return this.deviceSummaryContractItem;
    }

    @Nullable
    public final Float getExtraAdvanceAmount() {
        return this.extraAdvanceAmount;
    }

    @NotNull
    public final DeviceSaleCampaignType getFlowIdCampaignType() {
        return this.flowIdCampaignType;
    }

    @Nullable
    public final List<FieldInput> getInputFields() {
        return this.inputFields;
    }

    @Nullable
    public final DeviceSaleItemInfo getItemInfo() {
        return this.itemInfo;
    }

    @Nullable
    public final GetNewIMEIResponse getNewIMEIResponse() {
        return this.newIMEIResponse;
    }

    @Nullable
    public final ReceiptInfo getReceiptInfo() {
        return this.receiptInfo;
    }

    @Nullable
    public final Discount getSelectedDiscount() {
        return this.selectedDiscount;
    }

    @NotNull
    public final String getSubscriberNumber() {
        return this.subscriberNumber;
    }

    @Nullable
    public final DeviceSaleVerifySubrResponse getVerifySubscriberModel() {
        return this.verifySubscriberModel;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v36 */
    /* JADX WARN: Type inference failed for: r0v37 */
    /* JADX WARN: Type inference failed for: r2v33, types: [boolean] */
    public int hashCode() {
        boolean z = this.isRequirePaymentInfo;
        ?? r0 = z;
        if (z) {
            r0 = 1;
        }
        int hashCode = ((((((r0 * 31) + this.flowIdCampaignType.hashCode()) * 31) + this.subscriberNumber.hashCode()) * 31) + this.customerNumber.hashCode()) * 31;
        String str = this.canBuyDeviceWithContract;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        DeviceSaleVerifySubrResponse deviceSaleVerifySubrResponse = this.verifySubscriberModel;
        int hashCode3 = (hashCode2 + (deviceSaleVerifySubrResponse == null ? 0 : deviceSaleVerifySubrResponse.hashCode())) * 31;
        DeviceSaleItemInfo deviceSaleItemInfo = this.itemInfo;
        int hashCode4 = (hashCode3 + (deviceSaleItemInfo == null ? 0 : deviceSaleItemInfo.hashCode())) * 31;
        Campaign campaign = this.campaign;
        int hashCode5 = (hashCode4 + (campaign == null ? 0 : campaign.hashCode())) * 31;
        List<FieldInput> list = this.inputFields;
        int hashCode6 = (hashCode5 + (list == null ? 0 : list.hashCode())) * 31;
        String str2 = this.blacklistSharingStatus;
        int hashCode7 = (hashCode6 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Float f = this.extraAdvanceAmount;
        int hashCode8 = (hashCode7 + (f == null ? 0 : f.hashCode())) * 31;
        ReceiptInfo receiptInfo = this.receiptInfo;
        int hashCode9 = (hashCode8 + (receiptInfo == null ? 0 : receiptInfo.hashCode())) * 31;
        GetNewIMEIResponse getNewIMEIResponse = this.newIMEIResponse;
        int hashCode10 = (hashCode9 + (getNewIMEIResponse == null ? 0 : getNewIMEIResponse.hashCode())) * 31;
        ?? r2 = this.isFromPostpaid;
        int i = r2;
        if (r2 != 0) {
            i = 1;
        }
        int i2 = (hashCode10 + i) * 31;
        Discount discount = this.selectedDiscount;
        int hashCode11 = (i2 + (discount == null ? 0 : discount.hashCode())) * 31;
        ContractItem contractItem = this.deviceSummaryContractItem;
        int hashCode12 = (hashCode11 + (contractItem == null ? 0 : contractItem.hashCode())) * 31;
        Check1IDXDeviceResponse check1IDXDeviceResponse = this.check1IDXDeviceResponse;
        int hashCode13 = (hashCode12 + (check1IDXDeviceResponse != null ? check1IDXDeviceResponse.hashCode() : 0)) * 31;
        boolean z2 = this.isOverruleSuccess;
        return hashCode13 + (z2 ? 1 : z2 ? 1 : 0);
    }

    public final boolean isFromPostpaid() {
        return this.isFromPostpaid;
    }

    public final boolean isOverruleSuccess() {
        return this.isOverruleSuccess;
    }

    public final boolean isRequirePaymentInfo() {
        return this.isRequirePaymentInfo;
    }

    public final void setBlacklistSharingStatus(@Nullable String str) {
        this.blacklistSharingStatus = str;
    }

    public final void setCampaign(@Nullable Campaign campaign) {
        this.campaign = campaign;
    }

    public final void setCanBuyDeviceWithContract(@Nullable String str) {
        this.canBuyDeviceWithContract = str;
    }

    public final void setCheck1IDXDeviceResponse(@Nullable Check1IDXDeviceResponse check1IDXDeviceResponse) {
        this.check1IDXDeviceResponse = check1IDXDeviceResponse;
    }

    public final void setCustomerNumber(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.customerNumber = str;
    }

    public final void setDeviceSummaryContractItem(@Nullable ContractItem contractItem) {
        this.deviceSummaryContractItem = contractItem;
    }

    public final void setExtraAdvanceAmount(@Nullable Float f) {
        this.extraAdvanceAmount = f;
    }

    public final void setFlowIdCampaignType(@NotNull DeviceSaleCampaignType deviceSaleCampaignType) {
        Intrinsics.checkNotNullParameter(deviceSaleCampaignType, "<set-?>");
        this.flowIdCampaignType = deviceSaleCampaignType;
    }

    public final void setFromPostpaid(boolean z) {
        this.isFromPostpaid = z;
    }

    public final void setInputFields(@Nullable List<FieldInput> list) {
        this.inputFields = list;
    }

    public final void setItemInfo(@Nullable DeviceSaleItemInfo deviceSaleItemInfo) {
        this.itemInfo = deviceSaleItemInfo;
    }

    public final void setNewIMEIResponse(@Nullable GetNewIMEIResponse getNewIMEIResponse) {
        this.newIMEIResponse = getNewIMEIResponse;
    }

    public final void setOverruleSuccess(boolean z) {
        this.isOverruleSuccess = z;
    }

    public final void setReceiptInfo(@Nullable ReceiptInfo receiptInfo) {
        this.receiptInfo = receiptInfo;
    }

    public final void setRequirePaymentInfo(boolean z) {
        this.isRequirePaymentInfo = z;
    }

    public final void setSelectedDiscount(@Nullable Discount discount) {
        this.selectedDiscount = discount;
    }

    public final void setSubscriberNumber(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.subscriberNumber = str;
    }

    public final void setVerifySubscriberModel(@Nullable DeviceSaleVerifySubrResponse deviceSaleVerifySubrResponse) {
        this.verifySubscriberModel = deviceSaleVerifySubrResponse;
    }

    @NotNull
    public String toString() {
        boolean z = this.isRequirePaymentInfo;
        DeviceSaleCampaignType deviceSaleCampaignType = this.flowIdCampaignType;
        String str = this.subscriberNumber;
        String str2 = this.customerNumber;
        String str3 = this.canBuyDeviceWithContract;
        DeviceSaleVerifySubrResponse deviceSaleVerifySubrResponse = this.verifySubscriberModel;
        DeviceSaleItemInfo deviceSaleItemInfo = this.itemInfo;
        Campaign campaign = this.campaign;
        List<FieldInput> list = this.inputFields;
        String str4 = this.blacklistSharingStatus;
        Float f = this.extraAdvanceAmount;
        ReceiptInfo receiptInfo = this.receiptInfo;
        GetNewIMEIResponse getNewIMEIResponse = this.newIMEIResponse;
        boolean z2 = this.isFromPostpaid;
        Discount discount = this.selectedDiscount;
        ContractItem contractItem = this.deviceSummaryContractItem;
        Check1IDXDeviceResponse check1IDXDeviceResponse = this.check1IDXDeviceResponse;
        boolean z3 = this.isOverruleSuccess;
        return "DeviceSaleModel(isRequirePaymentInfo=" + z + ", flowIdCampaignType=" + deviceSaleCampaignType + ", subscriberNumber=" + str + ", customerNumber=" + str2 + ", canBuyDeviceWithContract=" + str3 + ", verifySubscriberModel=" + deviceSaleVerifySubrResponse + ", itemInfo=" + deviceSaleItemInfo + ", campaign=" + campaign + ", inputFields=" + list + ", blacklistSharingStatus=" + str4 + ", extraAdvanceAmount=" + f + ", receiptInfo=" + receiptInfo + ", newIMEIResponse=" + getNewIMEIResponse + ", isFromPostpaid=" + z2 + ", selectedDiscount=" + discount + ", deviceSummaryContractItem=" + contractItem + ", check1IDXDeviceResponse=" + check1IDXDeviceResponse + ", isOverruleSuccess=" + z3 + ")";
    }

    public DeviceSaleModel(boolean z, @NotNull DeviceSaleCampaignType flowIdCampaignType, @NotNull String subscriberNumber, @NotNull String customerNumber, @Nullable String str, @Nullable DeviceSaleVerifySubrResponse deviceSaleVerifySubrResponse, @Nullable DeviceSaleItemInfo deviceSaleItemInfo, @Nullable Campaign campaign, @Nullable List<FieldInput> list, @Nullable String str2, @Nullable Float f, @Nullable ReceiptInfo receiptInfo, @Nullable GetNewIMEIResponse getNewIMEIResponse, boolean z2, @Nullable Discount discount, @Nullable ContractItem contractItem, @Nullable Check1IDXDeviceResponse check1IDXDeviceResponse, boolean z3) {
        Intrinsics.checkNotNullParameter(flowIdCampaignType, "flowIdCampaignType");
        Intrinsics.checkNotNullParameter(subscriberNumber, "subscriberNumber");
        Intrinsics.checkNotNullParameter(customerNumber, "customerNumber");
        this.isRequirePaymentInfo = z;
        this.flowIdCampaignType = flowIdCampaignType;
        this.subscriberNumber = subscriberNumber;
        this.customerNumber = customerNumber;
        this.canBuyDeviceWithContract = str;
        this.verifySubscriberModel = deviceSaleVerifySubrResponse;
        this.itemInfo = deviceSaleItemInfo;
        this.campaign = campaign;
        this.inputFields = list;
        this.blacklistSharingStatus = str2;
        this.extraAdvanceAmount = f;
        this.receiptInfo = receiptInfo;
        this.newIMEIResponse = getNewIMEIResponse;
        this.isFromPostpaid = z2;
        this.selectedDiscount = discount;
        this.deviceSummaryContractItem = contractItem;
        this.check1IDXDeviceResponse = check1IDXDeviceResponse;
        this.isOverruleSuccess = z3;
    }

    public /* synthetic */ DeviceSaleModel(boolean z, DeviceSaleCampaignType deviceSaleCampaignType, String str, String str2, String str3, DeviceSaleVerifySubrResponse deviceSaleVerifySubrResponse, DeviceSaleItemInfo deviceSaleItemInfo, Campaign campaign, List list, String str4, Float f, ReceiptInfo receiptInfo, GetNewIMEIResponse getNewIMEIResponse, boolean z2, Discount discount, ContractItem contractItem, Check1IDXDeviceResponse check1IDXDeviceResponse, boolean z3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? DeviceSaleCampaignType.NO_CONTRACT : deviceSaleCampaignType, (i & 4) != 0 ? "" : str, (i & 8) == 0 ? str2 : "", (i & 16) != 0 ? null : str3, (i & 32) != 0 ? null : deviceSaleVerifySubrResponse, (i & 64) != 0 ? null : deviceSaleItemInfo, (i & 128) != 0 ? null : campaign, (i & 256) != 0 ? null : list, (i & 512) != 0 ? null : str4, (i & 1024) != 0 ? null : f, (i & 2048) != 0 ? null : receiptInfo, (i & 4096) != 0 ? null : getNewIMEIResponse, (i & 8192) != 0 ? false : z2, (i & 16384) != 0 ? null : discount, (i & 32768) != 0 ? null : contractItem, (i & 65536) != 0 ? null : check1IDXDeviceResponse, (i & 131072) != 0 ? false : z3);
    }
}