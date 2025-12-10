package th.p047co.dtac.android.dtacone.model.changepack;

import androidx.compose.runtime.internal.StabilityInferred;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import th.p047co.dtac.android.dtacone.util.constant.customerenquiry.ConstsKt;
import th.p047co.dtac.android.dtacone.view.fragment.mrtr_prepaid_registration.family_sim.InputPostpaidFamilySimSubscriberFragment;

@StabilityInferred(parameters = 0)
@Metadata(m29143d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b`\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001Bí\u0001\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003\u0012\b\b\u0002\u0010\b\u001a\u00020\u0003\u0012\b\b\u0002\u0010\t\u001a\u00020\u0003\u0012\b\b\u0002\u0010\n\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0003\u0012\u0006\u0010\f\u001a\u00020\u0003\u0012\u0006\u0010\r\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0017\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0018\u001a\u00020\u0003\u0012\u0006\u0010\u0019\u001a\u00020\u0003\u0012\u0006\u0010\u001a\u001a\u00020\u0003¢\u0006\u0002\u0010\u001bJ\t\u0010J\u001a\u00020\u0003HÆ\u0003J\t\u0010K\u001a\u00020\u0003HÆ\u0003J\t\u0010L\u001a\u00020\u0003HÆ\u0003J\t\u0010M\u001a\u00020\u0003HÆ\u0003J\t\u0010N\u001a\u00020\u0003HÆ\u0003J\t\u0010O\u001a\u00020\u0003HÆ\u0003J\t\u0010P\u001a\u00020\u0003HÆ\u0003J\t\u0010Q\u001a\u00020\u0003HÆ\u0003J\t\u0010R\u001a\u00020\u0003HÆ\u0003J\t\u0010S\u001a\u00020\u0003HÆ\u0003J\t\u0010T\u001a\u00020\u0003HÆ\u0003J\t\u0010U\u001a\u00020\u0003HÆ\u0003J\t\u0010V\u001a\u00020\u0003HÆ\u0003J\t\u0010W\u001a\u00020\u0003HÆ\u0003J\t\u0010X\u001a\u00020\u0003HÆ\u0003J\t\u0010Y\u001a\u00020\u0003HÆ\u0003J\t\u0010Z\u001a\u00020\u0003HÆ\u0003J\t\u0010[\u001a\u00020\u0003HÆ\u0003J\t\u0010\\\u001a\u00020\u0003HÆ\u0003J\t\u0010]\u001a\u00020\u0003HÆ\u0003J\t\u0010^\u001a\u00020\u0003HÆ\u0003J\t\u0010_\u001a\u00020\u0003HÆ\u0003J\t\u0010`\u001a\u00020\u0003HÆ\u0003J\t\u0010a\u001a\u00020\u0003HÆ\u0003Jù\u0001\u0010b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\u00032\b\b\u0002\u0010\f\u001a\u00020\u00032\b\b\u0002\u0010\r\u001a\u00020\u00032\b\b\u0002\u0010\u000e\u001a\u00020\u00032\b\b\u0002\u0010\u000f\u001a\u00020\u00032\b\b\u0002\u0010\u0010\u001a\u00020\u00032\b\b\u0002\u0010\u0011\u001a\u00020\u00032\b\b\u0002\u0010\u0012\u001a\u00020\u00032\b\b\u0002\u0010\u0013\u001a\u00020\u00032\b\b\u0002\u0010\u0014\u001a\u00020\u00032\b\b\u0002\u0010\u0015\u001a\u00020\u00032\b\b\u0002\u0010\u0016\u001a\u00020\u00032\b\b\u0002\u0010\u0017\u001a\u00020\u00032\b\b\u0002\u0010\u0018\u001a\u00020\u00032\b\b\u0002\u0010\u0019\u001a\u00020\u00032\b\b\u0002\u0010\u001a\u001a\u00020\u0003HÆ\u0001J\u0013\u0010c\u001a\u00020d2\b\u0010e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010f\u001a\u00020gHÖ\u0001J\t\u0010h\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u001a\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u001e\u0010\u0006\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u001d\"\u0004\b\u001f\u0010 R\u001e\u0010\u0015\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\u001d\"\u0004\b\"\u0010 R\u001e\u0010\n\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b#\u0010\u001d\"\u0004\b$\u0010 R\u001e\u0010\u000b\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b%\u0010\u001d\"\u0004\b&\u0010 R\u001e\u0010\u000f\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b'\u0010\u001d\"\u0004\b(\u0010 R\u001e\u0010\u0010\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b)\u0010\u001d\"\u0004\b*\u0010 R\u001e\u0010\u0011\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b+\u0010\u001d\"\u0004\b,\u0010 R\u001e\u0010\u0012\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b-\u0010\u001d\"\u0004\b.\u0010 R\u001e\u0010\u0013\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b/\u0010\u001d\"\u0004\b0\u0010 R\u001e\u0010\b\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b1\u0010\u001d\"\u0004\b2\u0010 R\u001e\u0010\t\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b3\u0010\u001d\"\u0004\b4\u0010 R\u001e\u0010\u0018\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b5\u0010\u001d\"\u0004\b6\u0010 R\u001e\u0010\u0016\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b7\u0010\u001d\"\u0004\b8\u0010 R\u001e\u0010\u0014\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b9\u0010\u001d\"\u0004\b:\u0010 R\u001e\u0010\u0007\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b;\u0010\u001d\"\u0004\b<\u0010 R\u0016\u0010\f\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b=\u0010\u001dR\u0016\u0010\r\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b>\u0010\u001dR\u001e\u0010\u000e\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b?\u0010\u001d\"\u0004\b@\u0010 R\u0016\u0010\u0019\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bA\u0010\u001dR\u001e\u0010\u0004\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bB\u0010\u001d\"\u0004\bC\u0010 R\u001e\u0010\u0005\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bD\u0010\u001d\"\u0004\bE\u0010 R\u001e\u0010\u0002\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bF\u0010\u001d\"\u0004\bG\u0010 R\u001e\u0010\u0017\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bH\u0010\u001d\"\u0004\bI\u0010 ¨\u0006i"}, m29142d2 = {"Lth/co/dtac/android/dtacone/model/changepack/SaveChangePackage;", "", "userLan", "", "userCode", "userFormatType", "channel", "subChannel", "rtrCode", "rtrName", "companyCode", "customerNumber", InputPostpaidFamilySimSubscriberFragment.SUB_NUM, "subscriberType", ConstsKt.TELEPHONE_TYPE, "lastChangeDateTime", "newPackageGroupCode", "newPackageGroupDescription", "packageCode", "packageDescription", "startDateOption", "cmpFlag", "scenarioName", "waiveFeeFlag", "saveFlag", "togglePostpaidEnable", "allowExtendContractFlag", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getAllowExtendContractFlag", "()Ljava/lang/String;", "getChannel", "setChannel", "(Ljava/lang/String;)V", "getCmpFlag", "setCmpFlag", "getCompanyCode", "setCompanyCode", "getCustomerNumber", "setCustomerNumber", "getLastChangeDateTime", "setLastChangeDateTime", "getNewPackageGroupCode", "setNewPackageGroupCode", "getNewPackageGroupDescription", "setNewPackageGroupDescription", "getPackageCode", "setPackageCode", "getPackageDescription", "setPackageDescription", "getRtrCode", "setRtrCode", "getRtrName", "setRtrName", "getSaveFlag", "setSaveFlag", "getScenarioName", "setScenarioName", "getStartDateOption", "setStartDateOption", "getSubChannel", "setSubChannel", "getSubscriberNumber", "getSubscriberType", "getTelephoneType", "setTelephoneType", "getTogglePostpaidEnable", "getUserCode", "setUserCode", "getUserFormatType", "setUserFormatType", "getUserLan", "setUserLan", "getWaiveFeeFlag", "setWaiveFeeFlag", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component2", "component20", "component21", "component22", "component23", "component24", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "", "other", "hashCode", "", "toString", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.model.changepack.SaveChangePackage */
/* loaded from: classes8.dex */
public final class SaveChangePackage {
    public static final int $stable = 8;
    @SerializedName("allowExtendContractFlag")
    @NotNull
    private final String allowExtendContractFlag;
    @SerializedName("channel")
    @NotNull
    private String channel;
    @SerializedName("cmpFlag")
    @NotNull
    private String cmpFlag;
    @SerializedName("companyCode")
    @NotNull
    private String companyCode;
    @SerializedName("customerNumber")
    @NotNull
    private String customerNumber;
    @SerializedName("lastChangeDateTime")
    @NotNull
    private String lastChangeDateTime;
    @SerializedName("newPackageGroupCode")
    @NotNull
    private String newPackageGroupCode;
    @SerializedName("newPackageGroupDescription")
    @NotNull
    private String newPackageGroupDescription;
    @SerializedName("packageCode")
    @NotNull
    private String packageCode;
    @SerializedName("packageDescription")
    @NotNull
    private String packageDescription;
    @SerializedName("rtrCode")
    @NotNull
    private String rtrCode;
    @SerializedName("rtrName")
    @NotNull
    private String rtrName;
    @SerializedName("saveFlag")
    @NotNull
    private String saveFlag;
    @SerializedName("scenarioName")
    @NotNull
    private String scenarioName;
    @SerializedName("startDateOption")
    @NotNull
    private String startDateOption;
    @SerializedName("subChannel")
    @NotNull
    private String subChannel;
    @SerializedName(InputPostpaidFamilySimSubscriberFragment.SUB_NUM)
    @NotNull
    private final String subscriberNumber;
    @SerializedName("subscriberType")
    @NotNull
    private final String subscriberType;
    @SerializedName(ConstsKt.TELEPHONE_TYPE)
    @NotNull
    private String telephoneType;
    @SerializedName("togglePostpaidEnable")
    @NotNull
    private final String togglePostpaidEnable;
    @SerializedName("userCode")
    @NotNull
    private String userCode;
    @SerializedName("userFormatType")
    @NotNull
    private String userFormatType;
    @SerializedName("userLan")
    @NotNull
    private String userLan;
    @SerializedName("waiveFeeFlag")
    @NotNull
    private String waiveFeeFlag;

    public SaveChangePackage(@NotNull String userLan, @NotNull String userCode, @NotNull String userFormatType, @NotNull String channel, @NotNull String subChannel, @NotNull String rtrCode, @NotNull String rtrName, @NotNull String companyCode, @NotNull String customerNumber, @NotNull String subscriberNumber, @NotNull String subscriberType, @NotNull String telephoneType, @NotNull String lastChangeDateTime, @NotNull String newPackageGroupCode, @NotNull String newPackageGroupDescription, @NotNull String packageCode, @NotNull String packageDescription, @NotNull String startDateOption, @NotNull String cmpFlag, @NotNull String scenarioName, @NotNull String waiveFeeFlag, @NotNull String saveFlag, @NotNull String togglePostpaidEnable, @NotNull String allowExtendContractFlag) {
        Intrinsics.checkNotNullParameter(userLan, "userLan");
        Intrinsics.checkNotNullParameter(userCode, "userCode");
        Intrinsics.checkNotNullParameter(userFormatType, "userFormatType");
        Intrinsics.checkNotNullParameter(channel, "channel");
        Intrinsics.checkNotNullParameter(subChannel, "subChannel");
        Intrinsics.checkNotNullParameter(rtrCode, "rtrCode");
        Intrinsics.checkNotNullParameter(rtrName, "rtrName");
        Intrinsics.checkNotNullParameter(companyCode, "companyCode");
        Intrinsics.checkNotNullParameter(customerNumber, "customerNumber");
        Intrinsics.checkNotNullParameter(subscriberNumber, "subscriberNumber");
        Intrinsics.checkNotNullParameter(subscriberType, "subscriberType");
        Intrinsics.checkNotNullParameter(telephoneType, "telephoneType");
        Intrinsics.checkNotNullParameter(lastChangeDateTime, "lastChangeDateTime");
        Intrinsics.checkNotNullParameter(newPackageGroupCode, "newPackageGroupCode");
        Intrinsics.checkNotNullParameter(newPackageGroupDescription, "newPackageGroupDescription");
        Intrinsics.checkNotNullParameter(packageCode, "packageCode");
        Intrinsics.checkNotNullParameter(packageDescription, "packageDescription");
        Intrinsics.checkNotNullParameter(startDateOption, "startDateOption");
        Intrinsics.checkNotNullParameter(cmpFlag, "cmpFlag");
        Intrinsics.checkNotNullParameter(scenarioName, "scenarioName");
        Intrinsics.checkNotNullParameter(waiveFeeFlag, "waiveFeeFlag");
        Intrinsics.checkNotNullParameter(saveFlag, "saveFlag");
        Intrinsics.checkNotNullParameter(togglePostpaidEnable, "togglePostpaidEnable");
        Intrinsics.checkNotNullParameter(allowExtendContractFlag, "allowExtendContractFlag");
        this.userLan = userLan;
        this.userCode = userCode;
        this.userFormatType = userFormatType;
        this.channel = channel;
        this.subChannel = subChannel;
        this.rtrCode = rtrCode;
        this.rtrName = rtrName;
        this.companyCode = companyCode;
        this.customerNumber = customerNumber;
        this.subscriberNumber = subscriberNumber;
        this.subscriberType = subscriberType;
        this.telephoneType = telephoneType;
        this.lastChangeDateTime = lastChangeDateTime;
        this.newPackageGroupCode = newPackageGroupCode;
        this.newPackageGroupDescription = newPackageGroupDescription;
        this.packageCode = packageCode;
        this.packageDescription = packageDescription;
        this.startDateOption = startDateOption;
        this.cmpFlag = cmpFlag;
        this.scenarioName = scenarioName;
        this.waiveFeeFlag = waiveFeeFlag;
        this.saveFlag = saveFlag;
        this.togglePostpaidEnable = togglePostpaidEnable;
        this.allowExtendContractFlag = allowExtendContractFlag;
    }

    @NotNull
    public final String component1() {
        return this.userLan;
    }

    @NotNull
    public final String component10() {
        return this.subscriberNumber;
    }

    @NotNull
    public final String component11() {
        return this.subscriberType;
    }

    @NotNull
    public final String component12() {
        return this.telephoneType;
    }

    @NotNull
    public final String component13() {
        return this.lastChangeDateTime;
    }

    @NotNull
    public final String component14() {
        return this.newPackageGroupCode;
    }

    @NotNull
    public final String component15() {
        return this.newPackageGroupDescription;
    }

    @NotNull
    public final String component16() {
        return this.packageCode;
    }

    @NotNull
    public final String component17() {
        return this.packageDescription;
    }

    @NotNull
    public final String component18() {
        return this.startDateOption;
    }

    @NotNull
    public final String component19() {
        return this.cmpFlag;
    }

    @NotNull
    public final String component2() {
        return this.userCode;
    }

    @NotNull
    public final String component20() {
        return this.scenarioName;
    }

    @NotNull
    public final String component21() {
        return this.waiveFeeFlag;
    }

    @NotNull
    public final String component22() {
        return this.saveFlag;
    }

    @NotNull
    public final String component23() {
        return this.togglePostpaidEnable;
    }

    @NotNull
    public final String component24() {
        return this.allowExtendContractFlag;
    }

    @NotNull
    public final String component3() {
        return this.userFormatType;
    }

    @NotNull
    public final String component4() {
        return this.channel;
    }

    @NotNull
    public final String component5() {
        return this.subChannel;
    }

    @NotNull
    public final String component6() {
        return this.rtrCode;
    }

    @NotNull
    public final String component7() {
        return this.rtrName;
    }

    @NotNull
    public final String component8() {
        return this.companyCode;
    }

    @NotNull
    public final String component9() {
        return this.customerNumber;
    }

    @NotNull
    public final SaveChangePackage copy(@NotNull String userLan, @NotNull String userCode, @NotNull String userFormatType, @NotNull String channel, @NotNull String subChannel, @NotNull String rtrCode, @NotNull String rtrName, @NotNull String companyCode, @NotNull String customerNumber, @NotNull String subscriberNumber, @NotNull String subscriberType, @NotNull String telephoneType, @NotNull String lastChangeDateTime, @NotNull String newPackageGroupCode, @NotNull String newPackageGroupDescription, @NotNull String packageCode, @NotNull String packageDescription, @NotNull String startDateOption, @NotNull String cmpFlag, @NotNull String scenarioName, @NotNull String waiveFeeFlag, @NotNull String saveFlag, @NotNull String togglePostpaidEnable, @NotNull String allowExtendContractFlag) {
        Intrinsics.checkNotNullParameter(userLan, "userLan");
        Intrinsics.checkNotNullParameter(userCode, "userCode");
        Intrinsics.checkNotNullParameter(userFormatType, "userFormatType");
        Intrinsics.checkNotNullParameter(channel, "channel");
        Intrinsics.checkNotNullParameter(subChannel, "subChannel");
        Intrinsics.checkNotNullParameter(rtrCode, "rtrCode");
        Intrinsics.checkNotNullParameter(rtrName, "rtrName");
        Intrinsics.checkNotNullParameter(companyCode, "companyCode");
        Intrinsics.checkNotNullParameter(customerNumber, "customerNumber");
        Intrinsics.checkNotNullParameter(subscriberNumber, "subscriberNumber");
        Intrinsics.checkNotNullParameter(subscriberType, "subscriberType");
        Intrinsics.checkNotNullParameter(telephoneType, "telephoneType");
        Intrinsics.checkNotNullParameter(lastChangeDateTime, "lastChangeDateTime");
        Intrinsics.checkNotNullParameter(newPackageGroupCode, "newPackageGroupCode");
        Intrinsics.checkNotNullParameter(newPackageGroupDescription, "newPackageGroupDescription");
        Intrinsics.checkNotNullParameter(packageCode, "packageCode");
        Intrinsics.checkNotNullParameter(packageDescription, "packageDescription");
        Intrinsics.checkNotNullParameter(startDateOption, "startDateOption");
        Intrinsics.checkNotNullParameter(cmpFlag, "cmpFlag");
        Intrinsics.checkNotNullParameter(scenarioName, "scenarioName");
        Intrinsics.checkNotNullParameter(waiveFeeFlag, "waiveFeeFlag");
        Intrinsics.checkNotNullParameter(saveFlag, "saveFlag");
        Intrinsics.checkNotNullParameter(togglePostpaidEnable, "togglePostpaidEnable");
        Intrinsics.checkNotNullParameter(allowExtendContractFlag, "allowExtendContractFlag");
        return new SaveChangePackage(userLan, userCode, userFormatType, channel, subChannel, rtrCode, rtrName, companyCode, customerNumber, subscriberNumber, subscriberType, telephoneType, lastChangeDateTime, newPackageGroupCode, newPackageGroupDescription, packageCode, packageDescription, startDateOption, cmpFlag, scenarioName, waiveFeeFlag, saveFlag, togglePostpaidEnable, allowExtendContractFlag);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof SaveChangePackage) {
            SaveChangePackage saveChangePackage = (SaveChangePackage) obj;
            return Intrinsics.areEqual(this.userLan, saveChangePackage.userLan) && Intrinsics.areEqual(this.userCode, saveChangePackage.userCode) && Intrinsics.areEqual(this.userFormatType, saveChangePackage.userFormatType) && Intrinsics.areEqual(this.channel, saveChangePackage.channel) && Intrinsics.areEqual(this.subChannel, saveChangePackage.subChannel) && Intrinsics.areEqual(this.rtrCode, saveChangePackage.rtrCode) && Intrinsics.areEqual(this.rtrName, saveChangePackage.rtrName) && Intrinsics.areEqual(this.companyCode, saveChangePackage.companyCode) && Intrinsics.areEqual(this.customerNumber, saveChangePackage.customerNumber) && Intrinsics.areEqual(this.subscriberNumber, saveChangePackage.subscriberNumber) && Intrinsics.areEqual(this.subscriberType, saveChangePackage.subscriberType) && Intrinsics.areEqual(this.telephoneType, saveChangePackage.telephoneType) && Intrinsics.areEqual(this.lastChangeDateTime, saveChangePackage.lastChangeDateTime) && Intrinsics.areEqual(this.newPackageGroupCode, saveChangePackage.newPackageGroupCode) && Intrinsics.areEqual(this.newPackageGroupDescription, saveChangePackage.newPackageGroupDescription) && Intrinsics.areEqual(this.packageCode, saveChangePackage.packageCode) && Intrinsics.areEqual(this.packageDescription, saveChangePackage.packageDescription) && Intrinsics.areEqual(this.startDateOption, saveChangePackage.startDateOption) && Intrinsics.areEqual(this.cmpFlag, saveChangePackage.cmpFlag) && Intrinsics.areEqual(this.scenarioName, saveChangePackage.scenarioName) && Intrinsics.areEqual(this.waiveFeeFlag, saveChangePackage.waiveFeeFlag) && Intrinsics.areEqual(this.saveFlag, saveChangePackage.saveFlag) && Intrinsics.areEqual(this.togglePostpaidEnable, saveChangePackage.togglePostpaidEnable) && Intrinsics.areEqual(this.allowExtendContractFlag, saveChangePackage.allowExtendContractFlag);
        }
        return false;
    }

    @NotNull
    public final String getAllowExtendContractFlag() {
        return this.allowExtendContractFlag;
    }

    @NotNull
    public final String getChannel() {
        return this.channel;
    }

    @NotNull
    public final String getCmpFlag() {
        return this.cmpFlag;
    }

    @NotNull
    public final String getCompanyCode() {
        return this.companyCode;
    }

    @NotNull
    public final String getCustomerNumber() {
        return this.customerNumber;
    }

    @NotNull
    public final String getLastChangeDateTime() {
        return this.lastChangeDateTime;
    }

    @NotNull
    public final String getNewPackageGroupCode() {
        return this.newPackageGroupCode;
    }

    @NotNull
    public final String getNewPackageGroupDescription() {
        return this.newPackageGroupDescription;
    }

    @NotNull
    public final String getPackageCode() {
        return this.packageCode;
    }

    @NotNull
    public final String getPackageDescription() {
        return this.packageDescription;
    }

    @NotNull
    public final String getRtrCode() {
        return this.rtrCode;
    }

    @NotNull
    public final String getRtrName() {
        return this.rtrName;
    }

    @NotNull
    public final String getSaveFlag() {
        return this.saveFlag;
    }

    @NotNull
    public final String getScenarioName() {
        return this.scenarioName;
    }

    @NotNull
    public final String getStartDateOption() {
        return this.startDateOption;
    }

    @NotNull
    public final String getSubChannel() {
        return this.subChannel;
    }

    @NotNull
    public final String getSubscriberNumber() {
        return this.subscriberNumber;
    }

    @NotNull
    public final String getSubscriberType() {
        return this.subscriberType;
    }

    @NotNull
    public final String getTelephoneType() {
        return this.telephoneType;
    }

    @NotNull
    public final String getTogglePostpaidEnable() {
        return this.togglePostpaidEnable;
    }

    @NotNull
    public final String getUserCode() {
        return this.userCode;
    }

    @NotNull
    public final String getUserFormatType() {
        return this.userFormatType;
    }

    @NotNull
    public final String getUserLan() {
        return this.userLan;
    }

    @NotNull
    public final String getWaiveFeeFlag() {
        return this.waiveFeeFlag;
    }

    public int hashCode() {
        return (((((((((((((((((((((((((((((((((((((((((((((this.userLan.hashCode() * 31) + this.userCode.hashCode()) * 31) + this.userFormatType.hashCode()) * 31) + this.channel.hashCode()) * 31) + this.subChannel.hashCode()) * 31) + this.rtrCode.hashCode()) * 31) + this.rtrName.hashCode()) * 31) + this.companyCode.hashCode()) * 31) + this.customerNumber.hashCode()) * 31) + this.subscriberNumber.hashCode()) * 31) + this.subscriberType.hashCode()) * 31) + this.telephoneType.hashCode()) * 31) + this.lastChangeDateTime.hashCode()) * 31) + this.newPackageGroupCode.hashCode()) * 31) + this.newPackageGroupDescription.hashCode()) * 31) + this.packageCode.hashCode()) * 31) + this.packageDescription.hashCode()) * 31) + this.startDateOption.hashCode()) * 31) + this.cmpFlag.hashCode()) * 31) + this.scenarioName.hashCode()) * 31) + this.waiveFeeFlag.hashCode()) * 31) + this.saveFlag.hashCode()) * 31) + this.togglePostpaidEnable.hashCode()) * 31) + this.allowExtendContractFlag.hashCode();
    }

    public final void setChannel(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.channel = str;
    }

    public final void setCmpFlag(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.cmpFlag = str;
    }

    public final void setCompanyCode(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.companyCode = str;
    }

    public final void setCustomerNumber(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.customerNumber = str;
    }

    public final void setLastChangeDateTime(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.lastChangeDateTime = str;
    }

    public final void setNewPackageGroupCode(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.newPackageGroupCode = str;
    }

    public final void setNewPackageGroupDescription(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.newPackageGroupDescription = str;
    }

    public final void setPackageCode(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.packageCode = str;
    }

    public final void setPackageDescription(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.packageDescription = str;
    }

    public final void setRtrCode(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.rtrCode = str;
    }

    public final void setRtrName(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.rtrName = str;
    }

    public final void setSaveFlag(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.saveFlag = str;
    }

    public final void setScenarioName(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.scenarioName = str;
    }

    public final void setStartDateOption(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.startDateOption = str;
    }

    public final void setSubChannel(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.subChannel = str;
    }

    public final void setTelephoneType(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.telephoneType = str;
    }

    public final void setUserCode(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.userCode = str;
    }

    public final void setUserFormatType(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.userFormatType = str;
    }

    public final void setUserLan(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.userLan = str;
    }

    public final void setWaiveFeeFlag(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.waiveFeeFlag = str;
    }

    @NotNull
    public String toString() {
        String str = this.userLan;
        String str2 = this.userCode;
        String str3 = this.userFormatType;
        String str4 = this.channel;
        String str5 = this.subChannel;
        String str6 = this.rtrCode;
        String str7 = this.rtrName;
        String str8 = this.companyCode;
        String str9 = this.customerNumber;
        String str10 = this.subscriberNumber;
        String str11 = this.subscriberType;
        String str12 = this.telephoneType;
        String str13 = this.lastChangeDateTime;
        String str14 = this.newPackageGroupCode;
        String str15 = this.newPackageGroupDescription;
        String str16 = this.packageCode;
        String str17 = this.packageDescription;
        String str18 = this.startDateOption;
        String str19 = this.cmpFlag;
        String str20 = this.scenarioName;
        String str21 = this.waiveFeeFlag;
        String str22 = this.saveFlag;
        String str23 = this.togglePostpaidEnable;
        String str24 = this.allowExtendContractFlag;
        return "SaveChangePackage(userLan=" + str + ", userCode=" + str2 + ", userFormatType=" + str3 + ", channel=" + str4 + ", subChannel=" + str5 + ", rtrCode=" + str6 + ", rtrName=" + str7 + ", companyCode=" + str8 + ", customerNumber=" + str9 + ", subscriberNumber=" + str10 + ", subscriberType=" + str11 + ", telephoneType=" + str12 + ", lastChangeDateTime=" + str13 + ", newPackageGroupCode=" + str14 + ", newPackageGroupDescription=" + str15 + ", packageCode=" + str16 + ", packageDescription=" + str17 + ", startDateOption=" + str18 + ", cmpFlag=" + str19 + ", scenarioName=" + str20 + ", waiveFeeFlag=" + str21 + ", saveFlag=" + str22 + ", togglePostpaidEnable=" + str23 + ", allowExtendContractFlag=" + str24 + ")";
    }

    public /* synthetic */ SaveChangePackage(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, String str18, String str19, String str20, String str21, String str22, String str23, String str24, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? "" : str4, (i & 16) != 0 ? "" : str5, (i & 32) != 0 ? "" : str6, (i & 64) != 0 ? "" : str7, (i & 128) != 0 ? "" : str8, (i & 256) != 0 ? "" : str9, str10, str11, (i & 2048) != 0 ? "" : str12, (i & 4096) != 0 ? "" : str13, (i & 8192) != 0 ? "" : str14, (i & 16384) != 0 ? "" : str15, (32768 & i) != 0 ? "" : str16, (65536 & i) != 0 ? "" : str17, (131072 & i) != 0 ? "" : str18, (262144 & i) != 0 ? "" : str19, (524288 & i) != 0 ? "" : str20, (1048576 & i) != 0 ? "" : str21, (i & 2097152) != 0 ? "" : str22, str23, str24);
    }
}