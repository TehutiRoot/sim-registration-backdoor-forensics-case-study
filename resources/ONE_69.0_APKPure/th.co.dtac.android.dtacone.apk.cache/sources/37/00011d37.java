package th.p047co.dtac.android.dtacone.model.change_pack;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import th.p047co.dtac.android.dtacone.model.customerenquiry.Offer;
import th.p047co.dtac.android.dtacone.model.customerenquiry.PackageGroupModel;
import th.p047co.dtac.android.dtacone.util.constant.customerenquiry.ConstsKt;
import th.p047co.dtac.android.dtacone.util.constant.device_sale.StartDataOption;
import th.p047co.dtac.android.dtacone.util.p052enum.SellingType;
import th.p047co.dtac.android.dtacone.view.fragment.mrtr_prepaid_registration.family_sim.InputPostpaidFamilySimSubscriberFragment;

@StabilityInferred(parameters = 0)
@Metadata(m29143d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\bB\n\u0002\u0010\u0002\n\u0002\b\u001b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0085\u0002\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003\u0012\b\b\u0002\u0010\b\u001a\u00020\u0003\u0012\b\b\u0002\u0010\t\u001a\u00020\u0003\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b\u0012\b\b\u0002\u0010\f\u001a\u00020\u0003\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0011\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0017\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0018\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0019\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u001b\u0012\b\b\u0002\u0010\u001c\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u001d\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u001e\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u001f\u001a\u00020\u0003¢\u0006\u0002\u0010 J\u0006\u0010]\u001a\u00020^J\t\u0010_\u001a\u00020\u0003HÆ\u0003J\u000b\u0010`\u001a\u0004\u0018\u00010\u000eHÆ\u0003J\t\u0010a\u001a\u00020\u0003HÆ\u0003J\u000b\u0010b\u001a\u0004\u0018\u00010\u0011HÆ\u0003J\t\u0010c\u001a\u00020\u0003HÆ\u0003J\t\u0010d\u001a\u00020\u0003HÆ\u0003J\t\u0010e\u001a\u00020\u0003HÆ\u0003J\t\u0010f\u001a\u00020\u0003HÆ\u0003J\t\u0010g\u001a\u00020\u0003HÆ\u0003J\t\u0010h\u001a\u00020\u0003HÆ\u0003J\t\u0010i\u001a\u00020\u0003HÆ\u0003J\t\u0010j\u001a\u00020\u0003HÆ\u0003J\t\u0010k\u001a\u00020\u0003HÆ\u0003J\u000b\u0010l\u001a\u0004\u0018\u00010\u001bHÆ\u0003J\t\u0010m\u001a\u00020\u0003HÆ\u0003J\t\u0010n\u001a\u00020\u0003HÆ\u0003J\t\u0010o\u001a\u00020\u0003HÆ\u0003J\t\u0010p\u001a\u00020\u0003HÆ\u0003J\t\u0010q\u001a\u00020\u0003HÆ\u0003J\t\u0010r\u001a\u00020\u0003HÆ\u0003J\t\u0010s\u001a\u00020\u0003HÆ\u0003J\t\u0010t\u001a\u00020\u0003HÆ\u0003J\t\u0010u\u001a\u00020\u0003HÆ\u0003J\t\u0010v\u001a\u00020\u000bHÆ\u0003J\t\u0010w\u001a\u00020\u0003HÆ\u0003J\u0089\u0002\u0010x\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\u00032\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u00032\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u00032\b\b\u0002\u0010\u0013\u001a\u00020\u00032\b\b\u0002\u0010\u0014\u001a\u00020\u00032\b\b\u0002\u0010\u0015\u001a\u00020\u00032\b\b\u0002\u0010\u0016\u001a\u00020\u00032\b\b\u0002\u0010\u0017\u001a\u00020\u00032\b\b\u0002\u0010\u0018\u001a\u00020\u00032\b\b\u0002\u0010\u0019\u001a\u00020\u00032\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u001b2\b\b\u0002\u0010\u001c\u001a\u00020\u00032\b\b\u0002\u0010\u001d\u001a\u00020\u00032\b\b\u0002\u0010\u001e\u001a\u00020\u00032\b\b\u0002\u0010\u001f\u001a\u00020\u0003HÆ\u0001J\u0013\u0010y\u001a\u00020z2\b\u0010{\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010|\u001a\u00020}HÖ\u0001J\t\u0010~\u001a\u00020\u0003HÖ\u0001R\u001a\u0010\u001d\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b%\u0010\"\"\u0004\b&\u0010$R\u001a\u0010\u0004\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b'\u0010\"\"\u0004\b(\u0010$R\u001a\u0010\u0005\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b)\u0010\"\"\u0004\b*\u0010$R\u001a\u0010\u001e\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b+\u0010\"\"\u0004\b,\u0010$R\u001a\u0010\u001f\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b-\u0010\"\"\u0004\b.\u0010$R\u001a\u0010\u0006\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b/\u0010\"\"\u0004\b0\u0010$R\u001a\u0010\u0007\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b1\u0010\"\"\u0004\b2\u0010$R\u001a\u0010\f\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b3\u0010\"\"\u0004\b4\u0010$R\u001c\u0010\r\u001a\u0004\u0018\u00010\u000eX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b5\u00106\"\u0004\b7\u00108R\u001a\u0010\u000f\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b9\u0010\"\"\u0004\b:\u0010$R\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b;\u0010<\"\u0004\b=\u0010>R\u001a\u0010\u0012\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b?\u0010\"\"\u0004\b@\u0010$R\u001c\u0010\u001a\u001a\u0004\u0018\u00010\u001bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bA\u0010B\"\u0004\bC\u0010DR\u001a\u0010\b\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bE\u0010\"\"\u0004\bF\u0010$R\u001a\u0010\t\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bG\u0010\"\"\u0004\bH\u0010$R\u001a\u0010\n\u001a\u00020\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bI\u0010J\"\u0004\bK\u0010LR\u001a\u0010\u0013\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bM\u0010\"\"\u0004\bN\u0010$R\u001a\u0010\u0014\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bO\u0010\"\"\u0004\bP\u0010$R\u001a\u0010\u0015\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bQ\u0010\"\"\u0004\bR\u0010$R\u001a\u0010\u0016\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bS\u0010\"\"\u0004\bT\u0010$R\u001a\u0010\u0017\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bU\u0010\"\"\u0004\bV\u0010$R\u001a\u0010\u0018\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bW\u0010\"\"\u0004\bX\u0010$R\u001a\u0010\u0019\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bY\u0010\"\"\u0004\bZ\u0010$R\u001a\u0010\u001c\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b[\u0010\"\"\u0004\b\\\u0010$¨\u0006\u007f"}, m29142d2 = {"Lth/co/dtac/android/dtacone/model/change_pack/ChangePackModel;", "", "channel", "", "companyCode", "customerNumber", "groupCode", "lastChangeDateTime", "selectPackageGroupCode", "selectPackageGroupDescription", "selectPackageSellingType", "Lth/co/dtac/android/dtacone/util/enum/SellingType;", "nextCycl", "nextCycle", "Lth/co/dtac/android/dtacone/model/change_pack/NextCycle;", "nextDay", "packageSelected", "Lth/co/dtac/android/dtacone/model/customerenquiry/PackageGroupModel;", "scenarioName", "startDateOption", InputPostpaidFamilySimSubscriberFragment.SUB_NUM, "subscriberNumberDisplay", "subscriberStatus", "subscriberType", ConstsKt.TELEPHONE_TYPE, "toDay", "selectFromOfferPackage", "Lth/co/dtac/android/dtacone/model/customerenquiry/Offer;", "waiveFee", "amount", "fromPackageCategory", "fromPackageGroupType", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lth/co/dtac/android/dtacone/util/enum/SellingType;Ljava/lang/String;Lth/co/dtac/android/dtacone/model/change_pack/NextCycle;Ljava/lang/String;Lth/co/dtac/android/dtacone/model/customerenquiry/PackageGroupModel;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lth/co/dtac/android/dtacone/model/customerenquiry/Offer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getAmount", "()Ljava/lang/String;", "setAmount", "(Ljava/lang/String;)V", "getChannel", "setChannel", "getCompanyCode", "setCompanyCode", "getCustomerNumber", "setCustomerNumber", "getFromPackageCategory", "setFromPackageCategory", "getFromPackageGroupType", "setFromPackageGroupType", "getGroupCode", "setGroupCode", "getLastChangeDateTime", "setLastChangeDateTime", "getNextCycl", "setNextCycl", "getNextCycle", "()Lth/co/dtac/android/dtacone/model/change_pack/NextCycle;", "setNextCycle", "(Lth/co/dtac/android/dtacone/model/change_pack/NextCycle;)V", "getNextDay", "setNextDay", "getPackageSelected", "()Lth/co/dtac/android/dtacone/model/customerenquiry/PackageGroupModel;", "setPackageSelected", "(Lth/co/dtac/android/dtacone/model/customerenquiry/PackageGroupModel;)V", "getScenarioName", "setScenarioName", "getSelectFromOfferPackage", "()Lth/co/dtac/android/dtacone/model/customerenquiry/Offer;", "setSelectFromOfferPackage", "(Lth/co/dtac/android/dtacone/model/customerenquiry/Offer;)V", "getSelectPackageGroupCode", "setSelectPackageGroupCode", "getSelectPackageGroupDescription", "setSelectPackageGroupDescription", "getSelectPackageSellingType", "()Lth/co/dtac/android/dtacone/util/enum/SellingType;", "setSelectPackageSellingType", "(Lth/co/dtac/android/dtacone/util/enum/SellingType;)V", "getStartDateOption", "setStartDateOption", "getSubscriberNumber", "setSubscriberNumber", "getSubscriberNumberDisplay", "setSubscriberNumberDisplay", "getSubscriberStatus", "setSubscriberStatus", "getSubscriberType", "setSubscriberType", "getTelephoneType", "setTelephoneType", "getToDay", "setToDay", "getWaiveFee", "setWaiveFee", "clearSelectPackageField", "", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component2", "component20", "component21", "component22", "component23", "component24", "component25", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "", "other", "hashCode", "", "toString", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.model.change_pack.ChangePackModel */
/* loaded from: classes8.dex */
public final class ChangePackModel {
    public static final int $stable = 8;
    @NotNull
    private String amount;
    @NotNull
    private String channel;
    @NotNull
    private String companyCode;
    @NotNull
    private String customerNumber;
    @NotNull
    private String fromPackageCategory;
    @NotNull
    private String fromPackageGroupType;
    @NotNull
    private String groupCode;
    @NotNull
    private String lastChangeDateTime;
    @NotNull
    private String nextCycl;
    @Nullable
    private NextCycle nextCycle;
    @NotNull
    private String nextDay;
    @Nullable
    private PackageGroupModel packageSelected;
    @NotNull
    private String scenarioName;
    @Nullable
    private Offer selectFromOfferPackage;
    @NotNull
    private String selectPackageGroupCode;
    @NotNull
    private String selectPackageGroupDescription;
    @NotNull
    private SellingType selectPackageSellingType;
    @NotNull
    private String startDateOption;
    @NotNull
    private String subscriberNumber;
    @NotNull
    private String subscriberNumberDisplay;
    @NotNull
    private String subscriberStatus;
    @NotNull
    private String subscriberType;
    @NotNull
    private String telephoneType;
    @NotNull
    private String toDay;
    @NotNull
    private String waiveFee;

    public ChangePackModel() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 33554431, null);
    }

    public final void clearSelectPackageField() {
        this.selectPackageGroupCode = "";
        this.selectPackageGroupDescription = "";
        this.selectPackageSellingType = SellingType.NONE;
    }

    @NotNull
    public final String component1() {
        return this.channel;
    }

    @Nullable
    public final NextCycle component10() {
        return this.nextCycle;
    }

    @NotNull
    public final String component11() {
        return this.nextDay;
    }

    @Nullable
    public final PackageGroupModel component12() {
        return this.packageSelected;
    }

    @NotNull
    public final String component13() {
        return this.scenarioName;
    }

    @NotNull
    public final String component14() {
        return this.startDateOption;
    }

    @NotNull
    public final String component15() {
        return this.subscriberNumber;
    }

    @NotNull
    public final String component16() {
        return this.subscriberNumberDisplay;
    }

    @NotNull
    public final String component17() {
        return this.subscriberStatus;
    }

    @NotNull
    public final String component18() {
        return this.subscriberType;
    }

    @NotNull
    public final String component19() {
        return this.telephoneType;
    }

    @NotNull
    public final String component2() {
        return this.companyCode;
    }

    @NotNull
    public final String component20() {
        return this.toDay;
    }

    @Nullable
    public final Offer component21() {
        return this.selectFromOfferPackage;
    }

    @NotNull
    public final String component22() {
        return this.waiveFee;
    }

    @NotNull
    public final String component23() {
        return this.amount;
    }

    @NotNull
    public final String component24() {
        return this.fromPackageCategory;
    }

    @NotNull
    public final String component25() {
        return this.fromPackageGroupType;
    }

    @NotNull
    public final String component3() {
        return this.customerNumber;
    }

    @NotNull
    public final String component4() {
        return this.groupCode;
    }

    @NotNull
    public final String component5() {
        return this.lastChangeDateTime;
    }

    @NotNull
    public final String component6() {
        return this.selectPackageGroupCode;
    }

    @NotNull
    public final String component7() {
        return this.selectPackageGroupDescription;
    }

    @NotNull
    public final SellingType component8() {
        return this.selectPackageSellingType;
    }

    @NotNull
    public final String component9() {
        return this.nextCycl;
    }

    @NotNull
    public final ChangePackModel copy(@NotNull String channel, @NotNull String companyCode, @NotNull String customerNumber, @NotNull String groupCode, @NotNull String lastChangeDateTime, @NotNull String selectPackageGroupCode, @NotNull String selectPackageGroupDescription, @NotNull SellingType selectPackageSellingType, @NotNull String nextCycl, @Nullable NextCycle nextCycle, @NotNull String nextDay, @Nullable PackageGroupModel packageGroupModel, @NotNull String scenarioName, @NotNull String startDateOption, @NotNull String subscriberNumber, @NotNull String subscriberNumberDisplay, @NotNull String subscriberStatus, @NotNull String subscriberType, @NotNull String telephoneType, @NotNull String toDay, @Nullable Offer offer, @NotNull String waiveFee, @NotNull String amount, @NotNull String fromPackageCategory, @NotNull String fromPackageGroupType) {
        Intrinsics.checkNotNullParameter(channel, "channel");
        Intrinsics.checkNotNullParameter(companyCode, "companyCode");
        Intrinsics.checkNotNullParameter(customerNumber, "customerNumber");
        Intrinsics.checkNotNullParameter(groupCode, "groupCode");
        Intrinsics.checkNotNullParameter(lastChangeDateTime, "lastChangeDateTime");
        Intrinsics.checkNotNullParameter(selectPackageGroupCode, "selectPackageGroupCode");
        Intrinsics.checkNotNullParameter(selectPackageGroupDescription, "selectPackageGroupDescription");
        Intrinsics.checkNotNullParameter(selectPackageSellingType, "selectPackageSellingType");
        Intrinsics.checkNotNullParameter(nextCycl, "nextCycl");
        Intrinsics.checkNotNullParameter(nextDay, "nextDay");
        Intrinsics.checkNotNullParameter(scenarioName, "scenarioName");
        Intrinsics.checkNotNullParameter(startDateOption, "startDateOption");
        Intrinsics.checkNotNullParameter(subscriberNumber, "subscriberNumber");
        Intrinsics.checkNotNullParameter(subscriberNumberDisplay, "subscriberNumberDisplay");
        Intrinsics.checkNotNullParameter(subscriberStatus, "subscriberStatus");
        Intrinsics.checkNotNullParameter(subscriberType, "subscriberType");
        Intrinsics.checkNotNullParameter(telephoneType, "telephoneType");
        Intrinsics.checkNotNullParameter(toDay, "toDay");
        Intrinsics.checkNotNullParameter(waiveFee, "waiveFee");
        Intrinsics.checkNotNullParameter(amount, "amount");
        Intrinsics.checkNotNullParameter(fromPackageCategory, "fromPackageCategory");
        Intrinsics.checkNotNullParameter(fromPackageGroupType, "fromPackageGroupType");
        return new ChangePackModel(channel, companyCode, customerNumber, groupCode, lastChangeDateTime, selectPackageGroupCode, selectPackageGroupDescription, selectPackageSellingType, nextCycl, nextCycle, nextDay, packageGroupModel, scenarioName, startDateOption, subscriberNumber, subscriberNumberDisplay, subscriberStatus, subscriberType, telephoneType, toDay, offer, waiveFee, amount, fromPackageCategory, fromPackageGroupType);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ChangePackModel) {
            ChangePackModel changePackModel = (ChangePackModel) obj;
            return Intrinsics.areEqual(this.channel, changePackModel.channel) && Intrinsics.areEqual(this.companyCode, changePackModel.companyCode) && Intrinsics.areEqual(this.customerNumber, changePackModel.customerNumber) && Intrinsics.areEqual(this.groupCode, changePackModel.groupCode) && Intrinsics.areEqual(this.lastChangeDateTime, changePackModel.lastChangeDateTime) && Intrinsics.areEqual(this.selectPackageGroupCode, changePackModel.selectPackageGroupCode) && Intrinsics.areEqual(this.selectPackageGroupDescription, changePackModel.selectPackageGroupDescription) && this.selectPackageSellingType == changePackModel.selectPackageSellingType && Intrinsics.areEqual(this.nextCycl, changePackModel.nextCycl) && Intrinsics.areEqual(this.nextCycle, changePackModel.nextCycle) && Intrinsics.areEqual(this.nextDay, changePackModel.nextDay) && Intrinsics.areEqual(this.packageSelected, changePackModel.packageSelected) && Intrinsics.areEqual(this.scenarioName, changePackModel.scenarioName) && Intrinsics.areEqual(this.startDateOption, changePackModel.startDateOption) && Intrinsics.areEqual(this.subscriberNumber, changePackModel.subscriberNumber) && Intrinsics.areEqual(this.subscriberNumberDisplay, changePackModel.subscriberNumberDisplay) && Intrinsics.areEqual(this.subscriberStatus, changePackModel.subscriberStatus) && Intrinsics.areEqual(this.subscriberType, changePackModel.subscriberType) && Intrinsics.areEqual(this.telephoneType, changePackModel.telephoneType) && Intrinsics.areEqual(this.toDay, changePackModel.toDay) && Intrinsics.areEqual(this.selectFromOfferPackage, changePackModel.selectFromOfferPackage) && Intrinsics.areEqual(this.waiveFee, changePackModel.waiveFee) && Intrinsics.areEqual(this.amount, changePackModel.amount) && Intrinsics.areEqual(this.fromPackageCategory, changePackModel.fromPackageCategory) && Intrinsics.areEqual(this.fromPackageGroupType, changePackModel.fromPackageGroupType);
        }
        return false;
    }

    @NotNull
    public final String getAmount() {
        return this.amount;
    }

    @NotNull
    public final String getChannel() {
        return this.channel;
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
    public final String getFromPackageCategory() {
        return this.fromPackageCategory;
    }

    @NotNull
    public final String getFromPackageGroupType() {
        return this.fromPackageGroupType;
    }

    @NotNull
    public final String getGroupCode() {
        return this.groupCode;
    }

    @NotNull
    public final String getLastChangeDateTime() {
        return this.lastChangeDateTime;
    }

    @NotNull
    public final String getNextCycl() {
        return this.nextCycl;
    }

    @Nullable
    public final NextCycle getNextCycle() {
        return this.nextCycle;
    }

    @NotNull
    public final String getNextDay() {
        return this.nextDay;
    }

    @Nullable
    public final PackageGroupModel getPackageSelected() {
        return this.packageSelected;
    }

    @NotNull
    public final String getScenarioName() {
        return this.scenarioName;
    }

    @Nullable
    public final Offer getSelectFromOfferPackage() {
        return this.selectFromOfferPackage;
    }

    @NotNull
    public final String getSelectPackageGroupCode() {
        return this.selectPackageGroupCode;
    }

    @NotNull
    public final String getSelectPackageGroupDescription() {
        return this.selectPackageGroupDescription;
    }

    @NotNull
    public final SellingType getSelectPackageSellingType() {
        return this.selectPackageSellingType;
    }

    @NotNull
    public final String getStartDateOption() {
        return this.startDateOption;
    }

    @NotNull
    public final String getSubscriberNumber() {
        return this.subscriberNumber;
    }

    @NotNull
    public final String getSubscriberNumberDisplay() {
        return this.subscriberNumberDisplay;
    }

    @NotNull
    public final String getSubscriberStatus() {
        return this.subscriberStatus;
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
    public final String getToDay() {
        return this.toDay;
    }

    @NotNull
    public final String getWaiveFee() {
        return this.waiveFee;
    }

    public int hashCode() {
        int hashCode = ((((((((((((((((this.channel.hashCode() * 31) + this.companyCode.hashCode()) * 31) + this.customerNumber.hashCode()) * 31) + this.groupCode.hashCode()) * 31) + this.lastChangeDateTime.hashCode()) * 31) + this.selectPackageGroupCode.hashCode()) * 31) + this.selectPackageGroupDescription.hashCode()) * 31) + this.selectPackageSellingType.hashCode()) * 31) + this.nextCycl.hashCode()) * 31;
        NextCycle nextCycle = this.nextCycle;
        int hashCode2 = (((hashCode + (nextCycle == null ? 0 : nextCycle.hashCode())) * 31) + this.nextDay.hashCode()) * 31;
        PackageGroupModel packageGroupModel = this.packageSelected;
        int hashCode3 = (((((((((((((((((hashCode2 + (packageGroupModel == null ? 0 : packageGroupModel.hashCode())) * 31) + this.scenarioName.hashCode()) * 31) + this.startDateOption.hashCode()) * 31) + this.subscriberNumber.hashCode()) * 31) + this.subscriberNumberDisplay.hashCode()) * 31) + this.subscriberStatus.hashCode()) * 31) + this.subscriberType.hashCode()) * 31) + this.telephoneType.hashCode()) * 31) + this.toDay.hashCode()) * 31;
        Offer offer = this.selectFromOfferPackage;
        return ((((((((hashCode3 + (offer != null ? offer.hashCode() : 0)) * 31) + this.waiveFee.hashCode()) * 31) + this.amount.hashCode()) * 31) + this.fromPackageCategory.hashCode()) * 31) + this.fromPackageGroupType.hashCode();
    }

    public final void setAmount(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.amount = str;
    }

    public final void setChannel(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.channel = str;
    }

    public final void setCompanyCode(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.companyCode = str;
    }

    public final void setCustomerNumber(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.customerNumber = str;
    }

    public final void setFromPackageCategory(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.fromPackageCategory = str;
    }

    public final void setFromPackageGroupType(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.fromPackageGroupType = str;
    }

    public final void setGroupCode(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.groupCode = str;
    }

    public final void setLastChangeDateTime(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.lastChangeDateTime = str;
    }

    public final void setNextCycl(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.nextCycl = str;
    }

    public final void setNextCycle(@Nullable NextCycle nextCycle) {
        this.nextCycle = nextCycle;
    }

    public final void setNextDay(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.nextDay = str;
    }

    public final void setPackageSelected(@Nullable PackageGroupModel packageGroupModel) {
        this.packageSelected = packageGroupModel;
    }

    public final void setScenarioName(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.scenarioName = str;
    }

    public final void setSelectFromOfferPackage(@Nullable Offer offer) {
        this.selectFromOfferPackage = offer;
    }

    public final void setSelectPackageGroupCode(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.selectPackageGroupCode = str;
    }

    public final void setSelectPackageGroupDescription(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.selectPackageGroupDescription = str;
    }

    public final void setSelectPackageSellingType(@NotNull SellingType sellingType) {
        Intrinsics.checkNotNullParameter(sellingType, "<set-?>");
        this.selectPackageSellingType = sellingType;
    }

    public final void setStartDateOption(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.startDateOption = str;
    }

    public final void setSubscriberNumber(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.subscriberNumber = str;
    }

    public final void setSubscriberNumberDisplay(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.subscriberNumberDisplay = str;
    }

    public final void setSubscriberStatus(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.subscriberStatus = str;
    }

    public final void setSubscriberType(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.subscriberType = str;
    }

    public final void setTelephoneType(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.telephoneType = str;
    }

    public final void setToDay(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.toDay = str;
    }

    public final void setWaiveFee(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.waiveFee = str;
    }

    @NotNull
    public String toString() {
        String str = this.channel;
        String str2 = this.companyCode;
        String str3 = this.customerNumber;
        String str4 = this.groupCode;
        String str5 = this.lastChangeDateTime;
        String str6 = this.selectPackageGroupCode;
        String str7 = this.selectPackageGroupDescription;
        SellingType sellingType = this.selectPackageSellingType;
        String str8 = this.nextCycl;
        NextCycle nextCycle = this.nextCycle;
        String str9 = this.nextDay;
        PackageGroupModel packageGroupModel = this.packageSelected;
        String str10 = this.scenarioName;
        String str11 = this.startDateOption;
        String str12 = this.subscriberNumber;
        String str13 = this.subscriberNumberDisplay;
        String str14 = this.subscriberStatus;
        String str15 = this.subscriberType;
        String str16 = this.telephoneType;
        String str17 = this.toDay;
        Offer offer = this.selectFromOfferPackage;
        String str18 = this.waiveFee;
        String str19 = this.amount;
        String str20 = this.fromPackageCategory;
        String str21 = this.fromPackageGroupType;
        return "ChangePackModel(channel=" + str + ", companyCode=" + str2 + ", customerNumber=" + str3 + ", groupCode=" + str4 + ", lastChangeDateTime=" + str5 + ", selectPackageGroupCode=" + str6 + ", selectPackageGroupDescription=" + str7 + ", selectPackageSellingType=" + sellingType + ", nextCycl=" + str8 + ", nextCycle=" + nextCycle + ", nextDay=" + str9 + ", packageSelected=" + packageGroupModel + ", scenarioName=" + str10 + ", startDateOption=" + str11 + ", subscriberNumber=" + str12 + ", subscriberNumberDisplay=" + str13 + ", subscriberStatus=" + str14 + ", subscriberType=" + str15 + ", telephoneType=" + str16 + ", toDay=" + str17 + ", selectFromOfferPackage=" + offer + ", waiveFee=" + str18 + ", amount=" + str19 + ", fromPackageCategory=" + str20 + ", fromPackageGroupType=" + str21 + ")";
    }

    public ChangePackModel(@NotNull String channel, @NotNull String companyCode, @NotNull String customerNumber, @NotNull String groupCode, @NotNull String lastChangeDateTime, @NotNull String selectPackageGroupCode, @NotNull String selectPackageGroupDescription, @NotNull SellingType selectPackageSellingType, @NotNull String nextCycl, @Nullable NextCycle nextCycle, @NotNull String nextDay, @Nullable PackageGroupModel packageGroupModel, @NotNull String scenarioName, @NotNull String startDateOption, @NotNull String subscriberNumber, @NotNull String subscriberNumberDisplay, @NotNull String subscriberStatus, @NotNull String subscriberType, @NotNull String telephoneType, @NotNull String toDay, @Nullable Offer offer, @NotNull String waiveFee, @NotNull String amount, @NotNull String fromPackageCategory, @NotNull String fromPackageGroupType) {
        Intrinsics.checkNotNullParameter(channel, "channel");
        Intrinsics.checkNotNullParameter(companyCode, "companyCode");
        Intrinsics.checkNotNullParameter(customerNumber, "customerNumber");
        Intrinsics.checkNotNullParameter(groupCode, "groupCode");
        Intrinsics.checkNotNullParameter(lastChangeDateTime, "lastChangeDateTime");
        Intrinsics.checkNotNullParameter(selectPackageGroupCode, "selectPackageGroupCode");
        Intrinsics.checkNotNullParameter(selectPackageGroupDescription, "selectPackageGroupDescription");
        Intrinsics.checkNotNullParameter(selectPackageSellingType, "selectPackageSellingType");
        Intrinsics.checkNotNullParameter(nextCycl, "nextCycl");
        Intrinsics.checkNotNullParameter(nextDay, "nextDay");
        Intrinsics.checkNotNullParameter(scenarioName, "scenarioName");
        Intrinsics.checkNotNullParameter(startDateOption, "startDateOption");
        Intrinsics.checkNotNullParameter(subscriberNumber, "subscriberNumber");
        Intrinsics.checkNotNullParameter(subscriberNumberDisplay, "subscriberNumberDisplay");
        Intrinsics.checkNotNullParameter(subscriberStatus, "subscriberStatus");
        Intrinsics.checkNotNullParameter(subscriberType, "subscriberType");
        Intrinsics.checkNotNullParameter(telephoneType, "telephoneType");
        Intrinsics.checkNotNullParameter(toDay, "toDay");
        Intrinsics.checkNotNullParameter(waiveFee, "waiveFee");
        Intrinsics.checkNotNullParameter(amount, "amount");
        Intrinsics.checkNotNullParameter(fromPackageCategory, "fromPackageCategory");
        Intrinsics.checkNotNullParameter(fromPackageGroupType, "fromPackageGroupType");
        this.channel = channel;
        this.companyCode = companyCode;
        this.customerNumber = customerNumber;
        this.groupCode = groupCode;
        this.lastChangeDateTime = lastChangeDateTime;
        this.selectPackageGroupCode = selectPackageGroupCode;
        this.selectPackageGroupDescription = selectPackageGroupDescription;
        this.selectPackageSellingType = selectPackageSellingType;
        this.nextCycl = nextCycl;
        this.nextCycle = nextCycle;
        this.nextDay = nextDay;
        this.packageSelected = packageGroupModel;
        this.scenarioName = scenarioName;
        this.startDateOption = startDateOption;
        this.subscriberNumber = subscriberNumber;
        this.subscriberNumberDisplay = subscriberNumberDisplay;
        this.subscriberStatus = subscriberStatus;
        this.subscriberType = subscriberType;
        this.telephoneType = telephoneType;
        this.toDay = toDay;
        this.selectFromOfferPackage = offer;
        this.waiveFee = waiveFee;
        this.amount = amount;
        this.fromPackageCategory = fromPackageCategory;
        this.fromPackageGroupType = fromPackageGroupType;
    }

    public /* synthetic */ ChangePackModel(String str, String str2, String str3, String str4, String str5, String str6, String str7, SellingType sellingType, String str8, NextCycle nextCycle, String str9, PackageGroupModel packageGroupModel, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, Offer offer, String str18, String str19, String str20, String str21, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? "" : str4, (i & 16) != 0 ? "" : str5, (i & 32) != 0 ? "" : str6, (i & 64) != 0 ? "" : str7, (i & 128) != 0 ? SellingType.NONE : sellingType, (i & 256) != 0 ? "" : str8, (i & 512) != 0 ? null : nextCycle, (i & 1024) != 0 ? "" : str9, (i & 2048) != 0 ? null : packageGroupModel, (i & 4096) != 0 ? "" : str10, (i & 8192) != 0 ? StartDataOption.INSTANCE.getNXDY() : str11, (i & 16384) != 0 ? "" : str12, (i & 32768) != 0 ? "" : str13, (i & 65536) != 0 ? "" : str14, (i & 131072) != 0 ? "" : str15, (i & 262144) != 0 ? "" : str16, (i & 524288) != 0 ? "" : str17, (i & 1048576) != 0 ? null : offer, (i & 2097152) != 0 ? "" : str18, (i & 4194304) != 0 ? "" : str19, (i & 8388608) != 0 ? "" : str20, (i & 16777216) != 0 ? "" : str21);
    }
}