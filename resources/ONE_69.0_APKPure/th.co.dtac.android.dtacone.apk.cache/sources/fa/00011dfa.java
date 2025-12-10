package th.p047co.dtac.android.dtacone.model.customerenquiry;

import androidx.compose.runtime.internal.StabilityInferred;
import com.google.api.client.googleapis.media.MediaHttpDownloader;
import com.google.gson.annotations.SerializedName;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import th.p047co.dtac.android.dtacone.util.constant.customerenquiry.ConstsKt;
import th.p047co.dtac.android.dtacone.view.fragment.mrtr_prepaid_registration.family_sim.InputPostpaidFamilySimSubscriberFragment;

@StabilityInferred(parameters = 0)
@Metadata(m29143d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\bP\b\u0087\b\u0018\u00002\u00020\u0001B¯\u0002\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003\u0012\b\b\u0002\u0010\b\u001a\u00020\u0003\u0012\b\b\u0002\u0010\t\u001a\u00020\u0003\u0012\b\b\u0002\u0010\n\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u000b\u001a\u00020\f\u0012\u000e\b\u0002\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0017\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0018\u001a\u00020\u0019\u0012\b\b\u0002\u0010\u001a\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u001b\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u001c\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u001d\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u001e\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u001f\u001a\u00020\u0003\u0012\b\b\u0002\u0010 \u001a\u00020\u0003\u0012\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\"\u0012\b\b\u0002\u0010#\u001a\u00020\u0003\u0012\b\b\u0002\u0010$\u001a\u00020\u0003¢\u0006\u0002\u0010%J\t\u0010O\u001a\u00020\u0003HÆ\u0003J\u000f\u0010P\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eHÆ\u0003J\t\u0010Q\u001a\u00020\u0003HÆ\u0003J\t\u0010R\u001a\u00020\u0003HÆ\u0003J\t\u0010S\u001a\u00020\u0003HÆ\u0003J\t\u0010T\u001a\u00020\u0003HÆ\u0003J\t\u0010U\u001a\u00020\u0003HÆ\u0003J\t\u0010V\u001a\u00020\u0003HÆ\u0003J\t\u0010W\u001a\u00020\u0003HÆ\u0003J\t\u0010X\u001a\u00020\u0003HÆ\u0003J\t\u0010Y\u001a\u00020\u0019HÆ\u0003J\t\u0010Z\u001a\u00020\u0003HÆ\u0003J\t\u0010[\u001a\u00020\u0003HÆ\u0003J\t\u0010\\\u001a\u00020\u0003HÆ\u0003J\t\u0010]\u001a\u00020\u0003HÆ\u0003J\t\u0010^\u001a\u00020\u0003HÆ\u0003J\t\u0010_\u001a\u00020\u0003HÆ\u0003J\t\u0010`\u001a\u00020\u0003HÆ\u0003J\t\u0010a\u001a\u00020\u0003HÆ\u0003J\u0010\u0010b\u001a\u0004\u0018\u00010\"HÆ\u0003¢\u0006\u0002\u00105J\t\u0010c\u001a\u00020\u0003HÆ\u0003J\t\u0010d\u001a\u00020\u0003HÆ\u0003J\t\u0010e\u001a\u00020\u0003HÆ\u0003J\t\u0010f\u001a\u00020\u0003HÆ\u0003J\t\u0010g\u001a\u00020\u0003HÆ\u0003J\t\u0010h\u001a\u00020\u0003HÆ\u0003J\t\u0010i\u001a\u00020\u0003HÆ\u0003J\t\u0010j\u001a\u00020\u0003HÆ\u0003J\t\u0010k\u001a\u00020\fHÆ\u0003J¸\u0002\u0010l\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\f2\u000e\b\u0002\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e2\b\b\u0002\u0010\u0010\u001a\u00020\u00032\b\b\u0002\u0010\u0011\u001a\u00020\u00032\b\b\u0002\u0010\u0012\u001a\u00020\u00032\b\b\u0002\u0010\u0013\u001a\u00020\u00032\b\b\u0002\u0010\u0014\u001a\u00020\u00032\b\b\u0002\u0010\u0015\u001a\u00020\u00032\b\b\u0002\u0010\u0016\u001a\u00020\u00032\b\b\u0002\u0010\u0017\u001a\u00020\u00032\b\b\u0002\u0010\u0018\u001a\u00020\u00192\b\b\u0002\u0010\u001a\u001a\u00020\u00032\b\b\u0002\u0010\u001b\u001a\u00020\u00032\b\b\u0002\u0010\u001c\u001a\u00020\u00032\b\b\u0002\u0010\u001d\u001a\u00020\u00032\b\b\u0002\u0010\u001e\u001a\u00020\u00032\b\b\u0002\u0010\u001f\u001a\u00020\u00032\b\b\u0002\u0010 \u001a\u00020\u00032\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\"2\b\b\u0002\u0010#\u001a\u00020\u00032\b\b\u0002\u0010$\u001a\u00020\u0003HÆ\u0001¢\u0006\u0002\u0010mJ\u0013\u0010n\u001a\u00020\"2\b\u0010o\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010p\u001a\u00020\fHÖ\u0001J\t\u0010q\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b&\u0010'R\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b(\u0010'R\u0016\u0010\u001a\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b)\u0010'R\u0016\u0010$\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b*\u0010'R\u0016\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b+\u0010'R\u001e\u0010\u0006\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b,\u0010'\"\u0004\b-\u0010.R\u0016\u0010\u0007\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b/\u0010'R\u001e\u0010\b\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b0\u0010'\"\u0004\b1\u0010.R\u0016\u0010\t\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b2\u0010'R\u0016\u0010\n\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b3\u0010'R\u001a\u0010!\u001a\u0004\u0018\u00010\"8\u0006X\u0087\u0004¢\u0006\n\n\u0002\u00106\u001a\u0004\b4\u00105R\u0016\u0010\u001c\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b7\u0010'R\u0016\u0010\u001d\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b8\u0010'R\u001e\u0010\u0018\u001a\u00020\u00198\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b9\u0010:\"\u0004\b;\u0010<R\u0016\u0010\u000b\u001a\u00020\f8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b=\u0010>R\u001c\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b?\u0010@R\u0016\u0010\u001e\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bA\u0010'R\u0016\u0010#\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bB\u0010'R\u0016\u0010\u001f\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bC\u0010'R\u0016\u0010\u0010\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bD\u0010'R\u001a\u0010 \u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bE\u0010'\"\u0004\bF\u0010.R\u0016\u0010\u0011\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bG\u0010'R\u0016\u0010\u001b\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bH\u0010'R\u0016\u0010\u0012\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bI\u0010'R\u0016\u0010\u0013\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bJ\u0010'R\u0016\u0010\u0014\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bK\u0010'R\u0016\u0010\u0015\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bL\u0010'R\u0016\u0010\u0016\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bM\u0010'R\u0016\u0010\u0017\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bN\u0010'¨\u0006r"}, m29142d2 = {"Lth/co/dtac/android/dtacone/model/customerenquiry/VerifySubscriberNumberResponse;", "", "aouText", "", "aouTotalDays", "companyCode", "customerFirstName", "customerIDNumber", "customerLastName", "customerNumber", "customerTitle", "groupCode", "", "mainPackages", "", "Lth/co/dtac/android/dtacone/model/customerenquiry/MainPackage;", InputPostpaidFamilySimSubscriberFragment.SUB_NUM, "subscriberStatus", "switchOnBy", "switchOnDate", "switchOnDateTime", "switchOnResonCode", "switchOnResonDescription", ConstsKt.TELEPHONE_TYPE, "futureTransaction", "Lth/co/dtac/android/dtacone/model/customerenquiry/FutureTransaction;", "billDay", "subscriberType", "fromPackageCategory", "fromPackageGroupType", "packageGroupCode", "simCardNumber", "subscriberNumberDisplay", "eSIMFlag", "", "pendingEsimCard", "cardStyle", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lth/co/dtac/android/dtacone/model/customerenquiry/FutureTransaction;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;)V", "getAouText", "()Ljava/lang/String;", "getAouTotalDays", "getBillDay", "getCardStyle", "getCompanyCode", "getCustomerFirstName", "setCustomerFirstName", "(Ljava/lang/String;)V", "getCustomerIDNumber", "getCustomerLastName", "setCustomerLastName", "getCustomerNumber", "getCustomerTitle", "getESIMFlag", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getFromPackageCategory", "getFromPackageGroupType", "getFutureTransaction", "()Lth/co/dtac/android/dtacone/model/customerenquiry/FutureTransaction;", "setFutureTransaction", "(Lth/co/dtac/android/dtacone/model/customerenquiry/FutureTransaction;)V", "getGroupCode", "()I", "getMainPackages", "()Ljava/util/List;", "getPackageGroupCode", "getPendingEsimCard", "getSimCardNumber", "getSubscriberNumber", "getSubscriberNumberDisplay", "setSubscriberNumberDisplay", "getSubscriberStatus", "getSubscriberType", "getSwitchOnBy", "getSwitchOnDate", "getSwitchOnDateTime", "getSwitchOnResonCode", "getSwitchOnResonDescription", "getTelephoneType", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component2", "component20", "component21", "component22", "component23", "component24", "component25", "component26", "component27", "component28", "component29", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lth/co/dtac/android/dtacone/model/customerenquiry/FutureTransaction;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;)Lth/co/dtac/android/dtacone/model/customerenquiry/VerifySubscriberNumberResponse;", "equals", "other", "hashCode", "toString", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.model.customerenquiry.VerifySubscriberNumberResponse */
/* loaded from: classes8.dex */
public final class VerifySubscriberNumberResponse {
    public static final int $stable = 8;
    @SerializedName("aouText")
    @NotNull
    private final String aouText;
    @SerializedName("aouTotalDays")
    @NotNull
    private final String aouTotalDays;
    @SerializedName("billDay")
    @NotNull
    private final String billDay;
    @SerializedName("cardStyle")
    @NotNull
    private final String cardStyle;
    @SerializedName("companyCode")
    @NotNull
    private final String companyCode;
    @SerializedName("customerFirstName")
    @NotNull
    private String customerFirstName;
    @SerializedName("customerIDNumber")
    @NotNull
    private final String customerIDNumber;
    @SerializedName("customerLastName")
    @NotNull
    private String customerLastName;
    @SerializedName("customerNumber")
    @NotNull
    private final String customerNumber;
    @SerializedName("customerTitle")
    @NotNull
    private final String customerTitle;
    @SerializedName("eSIMFlag")
    @Nullable
    private final Boolean eSIMFlag;
    @SerializedName("fromPackageCategory")
    @NotNull
    private final String fromPackageCategory;
    @SerializedName("fromPackageGroupType")
    @NotNull
    private final String fromPackageGroupType;
    @SerializedName("futureTransaction")
    @NotNull
    private FutureTransaction futureTransaction;
    @SerializedName("groupCode")
    private final int groupCode;
    @SerializedName("mainPackages")
    @NotNull
    private final List<MainPackage> mainPackages;
    @SerializedName("packageGroupCode")
    @NotNull
    private final String packageGroupCode;
    @SerializedName("pendingEsimCard")
    @NotNull
    private final String pendingEsimCard;
    @SerializedName("simCardNumber")
    @NotNull
    private final String simCardNumber;
    @SerializedName(InputPostpaidFamilySimSubscriberFragment.SUB_NUM)
    @NotNull
    private final String subscriberNumber;
    @NotNull
    private transient String subscriberNumberDisplay;
    @SerializedName("subscriberStatus")
    @NotNull
    private final String subscriberStatus;
    @SerializedName("subscriberType")
    @NotNull
    private final String subscriberType;
    @SerializedName("switchOnBy")
    @NotNull
    private final String switchOnBy;
    @SerializedName("switchOnDate")
    @NotNull
    private final String switchOnDate;
    @SerializedName("switchOnDateTime")
    @NotNull
    private final String switchOnDateTime;
    @SerializedName("switchOnResonCode")
    @NotNull
    private final String switchOnResonCode;
    @SerializedName("switchOnResonDescription")
    @NotNull
    private final String switchOnResonDescription;
    @SerializedName(ConstsKt.TELEPHONE_TYPE)
    @NotNull
    private final String telephoneType;

    public VerifySubscriberNumberResponse() {
        this(null, null, null, null, null, null, null, null, 0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 536870911, null);
    }

    @NotNull
    public final String component1() {
        return this.aouText;
    }

    @NotNull
    public final List<MainPackage> component10() {
        return this.mainPackages;
    }

    @NotNull
    public final String component11() {
        return this.subscriberNumber;
    }

    @NotNull
    public final String component12() {
        return this.subscriberStatus;
    }

    @NotNull
    public final String component13() {
        return this.switchOnBy;
    }

    @NotNull
    public final String component14() {
        return this.switchOnDate;
    }

    @NotNull
    public final String component15() {
        return this.switchOnDateTime;
    }

    @NotNull
    public final String component16() {
        return this.switchOnResonCode;
    }

    @NotNull
    public final String component17() {
        return this.switchOnResonDescription;
    }

    @NotNull
    public final String component18() {
        return this.telephoneType;
    }

    @NotNull
    public final FutureTransaction component19() {
        return this.futureTransaction;
    }

    @NotNull
    public final String component2() {
        return this.aouTotalDays;
    }

    @NotNull
    public final String component20() {
        return this.billDay;
    }

    @NotNull
    public final String component21() {
        return this.subscriberType;
    }

    @NotNull
    public final String component22() {
        return this.fromPackageCategory;
    }

    @NotNull
    public final String component23() {
        return this.fromPackageGroupType;
    }

    @NotNull
    public final String component24() {
        return this.packageGroupCode;
    }

    @NotNull
    public final String component25() {
        return this.simCardNumber;
    }

    @NotNull
    public final String component26() {
        return this.subscriberNumberDisplay;
    }

    @Nullable
    public final Boolean component27() {
        return this.eSIMFlag;
    }

    @NotNull
    public final String component28() {
        return this.pendingEsimCard;
    }

    @NotNull
    public final String component29() {
        return this.cardStyle;
    }

    @NotNull
    public final String component3() {
        return this.companyCode;
    }

    @NotNull
    public final String component4() {
        return this.customerFirstName;
    }

    @NotNull
    public final String component5() {
        return this.customerIDNumber;
    }

    @NotNull
    public final String component6() {
        return this.customerLastName;
    }

    @NotNull
    public final String component7() {
        return this.customerNumber;
    }

    @NotNull
    public final String component8() {
        return this.customerTitle;
    }

    public final int component9() {
        return this.groupCode;
    }

    @NotNull
    public final VerifySubscriberNumberResponse copy(@NotNull String aouText, @NotNull String aouTotalDays, @NotNull String companyCode, @NotNull String customerFirstName, @NotNull String customerIDNumber, @NotNull String customerLastName, @NotNull String customerNumber, @NotNull String customerTitle, int i, @NotNull List<MainPackage> mainPackages, @NotNull String subscriberNumber, @NotNull String subscriberStatus, @NotNull String switchOnBy, @NotNull String switchOnDate, @NotNull String switchOnDateTime, @NotNull String switchOnResonCode, @NotNull String switchOnResonDescription, @NotNull String telephoneType, @NotNull FutureTransaction futureTransaction, @NotNull String billDay, @NotNull String subscriberType, @NotNull String fromPackageCategory, @NotNull String fromPackageGroupType, @NotNull String packageGroupCode, @NotNull String simCardNumber, @NotNull String subscriberNumberDisplay, @Nullable Boolean bool, @NotNull String pendingEsimCard, @NotNull String cardStyle) {
        Intrinsics.checkNotNullParameter(aouText, "aouText");
        Intrinsics.checkNotNullParameter(aouTotalDays, "aouTotalDays");
        Intrinsics.checkNotNullParameter(companyCode, "companyCode");
        Intrinsics.checkNotNullParameter(customerFirstName, "customerFirstName");
        Intrinsics.checkNotNullParameter(customerIDNumber, "customerIDNumber");
        Intrinsics.checkNotNullParameter(customerLastName, "customerLastName");
        Intrinsics.checkNotNullParameter(customerNumber, "customerNumber");
        Intrinsics.checkNotNullParameter(customerTitle, "customerTitle");
        Intrinsics.checkNotNullParameter(mainPackages, "mainPackages");
        Intrinsics.checkNotNullParameter(subscriberNumber, "subscriberNumber");
        Intrinsics.checkNotNullParameter(subscriberStatus, "subscriberStatus");
        Intrinsics.checkNotNullParameter(switchOnBy, "switchOnBy");
        Intrinsics.checkNotNullParameter(switchOnDate, "switchOnDate");
        Intrinsics.checkNotNullParameter(switchOnDateTime, "switchOnDateTime");
        Intrinsics.checkNotNullParameter(switchOnResonCode, "switchOnResonCode");
        Intrinsics.checkNotNullParameter(switchOnResonDescription, "switchOnResonDescription");
        Intrinsics.checkNotNullParameter(telephoneType, "telephoneType");
        Intrinsics.checkNotNullParameter(futureTransaction, "futureTransaction");
        Intrinsics.checkNotNullParameter(billDay, "billDay");
        Intrinsics.checkNotNullParameter(subscriberType, "subscriberType");
        Intrinsics.checkNotNullParameter(fromPackageCategory, "fromPackageCategory");
        Intrinsics.checkNotNullParameter(fromPackageGroupType, "fromPackageGroupType");
        Intrinsics.checkNotNullParameter(packageGroupCode, "packageGroupCode");
        Intrinsics.checkNotNullParameter(simCardNumber, "simCardNumber");
        Intrinsics.checkNotNullParameter(subscriberNumberDisplay, "subscriberNumberDisplay");
        Intrinsics.checkNotNullParameter(pendingEsimCard, "pendingEsimCard");
        Intrinsics.checkNotNullParameter(cardStyle, "cardStyle");
        return new VerifySubscriberNumberResponse(aouText, aouTotalDays, companyCode, customerFirstName, customerIDNumber, customerLastName, customerNumber, customerTitle, i, mainPackages, subscriberNumber, subscriberStatus, switchOnBy, switchOnDate, switchOnDateTime, switchOnResonCode, switchOnResonDescription, telephoneType, futureTransaction, billDay, subscriberType, fromPackageCategory, fromPackageGroupType, packageGroupCode, simCardNumber, subscriberNumberDisplay, bool, pendingEsimCard, cardStyle);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof VerifySubscriberNumberResponse) {
            VerifySubscriberNumberResponse verifySubscriberNumberResponse = (VerifySubscriberNumberResponse) obj;
            return Intrinsics.areEqual(this.aouText, verifySubscriberNumberResponse.aouText) && Intrinsics.areEqual(this.aouTotalDays, verifySubscriberNumberResponse.aouTotalDays) && Intrinsics.areEqual(this.companyCode, verifySubscriberNumberResponse.companyCode) && Intrinsics.areEqual(this.customerFirstName, verifySubscriberNumberResponse.customerFirstName) && Intrinsics.areEqual(this.customerIDNumber, verifySubscriberNumberResponse.customerIDNumber) && Intrinsics.areEqual(this.customerLastName, verifySubscriberNumberResponse.customerLastName) && Intrinsics.areEqual(this.customerNumber, verifySubscriberNumberResponse.customerNumber) && Intrinsics.areEqual(this.customerTitle, verifySubscriberNumberResponse.customerTitle) && this.groupCode == verifySubscriberNumberResponse.groupCode && Intrinsics.areEqual(this.mainPackages, verifySubscriberNumberResponse.mainPackages) && Intrinsics.areEqual(this.subscriberNumber, verifySubscriberNumberResponse.subscriberNumber) && Intrinsics.areEqual(this.subscriberStatus, verifySubscriberNumberResponse.subscriberStatus) && Intrinsics.areEqual(this.switchOnBy, verifySubscriberNumberResponse.switchOnBy) && Intrinsics.areEqual(this.switchOnDate, verifySubscriberNumberResponse.switchOnDate) && Intrinsics.areEqual(this.switchOnDateTime, verifySubscriberNumberResponse.switchOnDateTime) && Intrinsics.areEqual(this.switchOnResonCode, verifySubscriberNumberResponse.switchOnResonCode) && Intrinsics.areEqual(this.switchOnResonDescription, verifySubscriberNumberResponse.switchOnResonDescription) && Intrinsics.areEqual(this.telephoneType, verifySubscriberNumberResponse.telephoneType) && Intrinsics.areEqual(this.futureTransaction, verifySubscriberNumberResponse.futureTransaction) && Intrinsics.areEqual(this.billDay, verifySubscriberNumberResponse.billDay) && Intrinsics.areEqual(this.subscriberType, verifySubscriberNumberResponse.subscriberType) && Intrinsics.areEqual(this.fromPackageCategory, verifySubscriberNumberResponse.fromPackageCategory) && Intrinsics.areEqual(this.fromPackageGroupType, verifySubscriberNumberResponse.fromPackageGroupType) && Intrinsics.areEqual(this.packageGroupCode, verifySubscriberNumberResponse.packageGroupCode) && Intrinsics.areEqual(this.simCardNumber, verifySubscriberNumberResponse.simCardNumber) && Intrinsics.areEqual(this.subscriberNumberDisplay, verifySubscriberNumberResponse.subscriberNumberDisplay) && Intrinsics.areEqual(this.eSIMFlag, verifySubscriberNumberResponse.eSIMFlag) && Intrinsics.areEqual(this.pendingEsimCard, verifySubscriberNumberResponse.pendingEsimCard) && Intrinsics.areEqual(this.cardStyle, verifySubscriberNumberResponse.cardStyle);
        }
        return false;
    }

    @NotNull
    public final String getAouText() {
        return this.aouText;
    }

    @NotNull
    public final String getAouTotalDays() {
        return this.aouTotalDays;
    }

    @NotNull
    public final String getBillDay() {
        return this.billDay;
    }

    @NotNull
    public final String getCardStyle() {
        return this.cardStyle;
    }

    @NotNull
    public final String getCompanyCode() {
        return this.companyCode;
    }

    @NotNull
    public final String getCustomerFirstName() {
        return this.customerFirstName;
    }

    @NotNull
    public final String getCustomerIDNumber() {
        return this.customerIDNumber;
    }

    @NotNull
    public final String getCustomerLastName() {
        return this.customerLastName;
    }

    @NotNull
    public final String getCustomerNumber() {
        return this.customerNumber;
    }

    @NotNull
    public final String getCustomerTitle() {
        return this.customerTitle;
    }

    @Nullable
    public final Boolean getESIMFlag() {
        return this.eSIMFlag;
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
    public final FutureTransaction getFutureTransaction() {
        return this.futureTransaction;
    }

    public final int getGroupCode() {
        return this.groupCode;
    }

    @NotNull
    public final List<MainPackage> getMainPackages() {
        return this.mainPackages;
    }

    @NotNull
    public final String getPackageGroupCode() {
        return this.packageGroupCode;
    }

    @NotNull
    public final String getPendingEsimCard() {
        return this.pendingEsimCard;
    }

    @NotNull
    public final String getSimCardNumber() {
        return this.simCardNumber;
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
    public final String getSwitchOnBy() {
        return this.switchOnBy;
    }

    @NotNull
    public final String getSwitchOnDate() {
        return this.switchOnDate;
    }

    @NotNull
    public final String getSwitchOnDateTime() {
        return this.switchOnDateTime;
    }

    @NotNull
    public final String getSwitchOnResonCode() {
        return this.switchOnResonCode;
    }

    @NotNull
    public final String getSwitchOnResonDescription() {
        return this.switchOnResonDescription;
    }

    @NotNull
    public final String getTelephoneType() {
        return this.telephoneType;
    }

    public int hashCode() {
        int hashCode = ((((((((((((((((((((((((((((((((((((((((((((((((((this.aouText.hashCode() * 31) + this.aouTotalDays.hashCode()) * 31) + this.companyCode.hashCode()) * 31) + this.customerFirstName.hashCode()) * 31) + this.customerIDNumber.hashCode()) * 31) + this.customerLastName.hashCode()) * 31) + this.customerNumber.hashCode()) * 31) + this.customerTitle.hashCode()) * 31) + this.groupCode) * 31) + this.mainPackages.hashCode()) * 31) + this.subscriberNumber.hashCode()) * 31) + this.subscriberStatus.hashCode()) * 31) + this.switchOnBy.hashCode()) * 31) + this.switchOnDate.hashCode()) * 31) + this.switchOnDateTime.hashCode()) * 31) + this.switchOnResonCode.hashCode()) * 31) + this.switchOnResonDescription.hashCode()) * 31) + this.telephoneType.hashCode()) * 31) + this.futureTransaction.hashCode()) * 31) + this.billDay.hashCode()) * 31) + this.subscriberType.hashCode()) * 31) + this.fromPackageCategory.hashCode()) * 31) + this.fromPackageGroupType.hashCode()) * 31) + this.packageGroupCode.hashCode()) * 31) + this.simCardNumber.hashCode()) * 31) + this.subscriberNumberDisplay.hashCode()) * 31;
        Boolean bool = this.eSIMFlag;
        return ((((hashCode + (bool == null ? 0 : bool.hashCode())) * 31) + this.pendingEsimCard.hashCode()) * 31) + this.cardStyle.hashCode();
    }

    public final void setCustomerFirstName(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.customerFirstName = str;
    }

    public final void setCustomerLastName(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.customerLastName = str;
    }

    public final void setFutureTransaction(@NotNull FutureTransaction futureTransaction) {
        Intrinsics.checkNotNullParameter(futureTransaction, "<set-?>");
        this.futureTransaction = futureTransaction;
    }

    public final void setSubscriberNumberDisplay(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.subscriberNumberDisplay = str;
    }

    @NotNull
    public String toString() {
        String str = this.aouText;
        String str2 = this.aouTotalDays;
        String str3 = this.companyCode;
        String str4 = this.customerFirstName;
        String str5 = this.customerIDNumber;
        String str6 = this.customerLastName;
        String str7 = this.customerNumber;
        String str8 = this.customerTitle;
        int i = this.groupCode;
        List<MainPackage> list = this.mainPackages;
        String str9 = this.subscriberNumber;
        String str10 = this.subscriberStatus;
        String str11 = this.switchOnBy;
        String str12 = this.switchOnDate;
        String str13 = this.switchOnDateTime;
        String str14 = this.switchOnResonCode;
        String str15 = this.switchOnResonDescription;
        String str16 = this.telephoneType;
        FutureTransaction futureTransaction = this.futureTransaction;
        String str17 = this.billDay;
        String str18 = this.subscriberType;
        String str19 = this.fromPackageCategory;
        String str20 = this.fromPackageGroupType;
        String str21 = this.packageGroupCode;
        String str22 = this.simCardNumber;
        String str23 = this.subscriberNumberDisplay;
        Boolean bool = this.eSIMFlag;
        String str24 = this.pendingEsimCard;
        String str25 = this.cardStyle;
        return "VerifySubscriberNumberResponse(aouText=" + str + ", aouTotalDays=" + str2 + ", companyCode=" + str3 + ", customerFirstName=" + str4 + ", customerIDNumber=" + str5 + ", customerLastName=" + str6 + ", customerNumber=" + str7 + ", customerTitle=" + str8 + ", groupCode=" + i + ", mainPackages=" + list + ", subscriberNumber=" + str9 + ", subscriberStatus=" + str10 + ", switchOnBy=" + str11 + ", switchOnDate=" + str12 + ", switchOnDateTime=" + str13 + ", switchOnResonCode=" + str14 + ", switchOnResonDescription=" + str15 + ", telephoneType=" + str16 + ", futureTransaction=" + futureTransaction + ", billDay=" + str17 + ", subscriberType=" + str18 + ", fromPackageCategory=" + str19 + ", fromPackageGroupType=" + str20 + ", packageGroupCode=" + str21 + ", simCardNumber=" + str22 + ", subscriberNumberDisplay=" + str23 + ", eSIMFlag=" + bool + ", pendingEsimCard=" + str24 + ", cardStyle=" + str25 + ")";
    }

    public VerifySubscriberNumberResponse(@NotNull String aouText, @NotNull String aouTotalDays, @NotNull String companyCode, @NotNull String customerFirstName, @NotNull String customerIDNumber, @NotNull String customerLastName, @NotNull String customerNumber, @NotNull String customerTitle, int i, @NotNull List<MainPackage> mainPackages, @NotNull String subscriberNumber, @NotNull String subscriberStatus, @NotNull String switchOnBy, @NotNull String switchOnDate, @NotNull String switchOnDateTime, @NotNull String switchOnResonCode, @NotNull String switchOnResonDescription, @NotNull String telephoneType, @NotNull FutureTransaction futureTransaction, @NotNull String billDay, @NotNull String subscriberType, @NotNull String fromPackageCategory, @NotNull String fromPackageGroupType, @NotNull String packageGroupCode, @NotNull String simCardNumber, @NotNull String subscriberNumberDisplay, @Nullable Boolean bool, @NotNull String pendingEsimCard, @NotNull String cardStyle) {
        Intrinsics.checkNotNullParameter(aouText, "aouText");
        Intrinsics.checkNotNullParameter(aouTotalDays, "aouTotalDays");
        Intrinsics.checkNotNullParameter(companyCode, "companyCode");
        Intrinsics.checkNotNullParameter(customerFirstName, "customerFirstName");
        Intrinsics.checkNotNullParameter(customerIDNumber, "customerIDNumber");
        Intrinsics.checkNotNullParameter(customerLastName, "customerLastName");
        Intrinsics.checkNotNullParameter(customerNumber, "customerNumber");
        Intrinsics.checkNotNullParameter(customerTitle, "customerTitle");
        Intrinsics.checkNotNullParameter(mainPackages, "mainPackages");
        Intrinsics.checkNotNullParameter(subscriberNumber, "subscriberNumber");
        Intrinsics.checkNotNullParameter(subscriberStatus, "subscriberStatus");
        Intrinsics.checkNotNullParameter(switchOnBy, "switchOnBy");
        Intrinsics.checkNotNullParameter(switchOnDate, "switchOnDate");
        Intrinsics.checkNotNullParameter(switchOnDateTime, "switchOnDateTime");
        Intrinsics.checkNotNullParameter(switchOnResonCode, "switchOnResonCode");
        Intrinsics.checkNotNullParameter(switchOnResonDescription, "switchOnResonDescription");
        Intrinsics.checkNotNullParameter(telephoneType, "telephoneType");
        Intrinsics.checkNotNullParameter(futureTransaction, "futureTransaction");
        Intrinsics.checkNotNullParameter(billDay, "billDay");
        Intrinsics.checkNotNullParameter(subscriberType, "subscriberType");
        Intrinsics.checkNotNullParameter(fromPackageCategory, "fromPackageCategory");
        Intrinsics.checkNotNullParameter(fromPackageGroupType, "fromPackageGroupType");
        Intrinsics.checkNotNullParameter(packageGroupCode, "packageGroupCode");
        Intrinsics.checkNotNullParameter(simCardNumber, "simCardNumber");
        Intrinsics.checkNotNullParameter(subscriberNumberDisplay, "subscriberNumberDisplay");
        Intrinsics.checkNotNullParameter(pendingEsimCard, "pendingEsimCard");
        Intrinsics.checkNotNullParameter(cardStyle, "cardStyle");
        this.aouText = aouText;
        this.aouTotalDays = aouTotalDays;
        this.companyCode = companyCode;
        this.customerFirstName = customerFirstName;
        this.customerIDNumber = customerIDNumber;
        this.customerLastName = customerLastName;
        this.customerNumber = customerNumber;
        this.customerTitle = customerTitle;
        this.groupCode = i;
        this.mainPackages = mainPackages;
        this.subscriberNumber = subscriberNumber;
        this.subscriberStatus = subscriberStatus;
        this.switchOnBy = switchOnBy;
        this.switchOnDate = switchOnDate;
        this.switchOnDateTime = switchOnDateTime;
        this.switchOnResonCode = switchOnResonCode;
        this.switchOnResonDescription = switchOnResonDescription;
        this.telephoneType = telephoneType;
        this.futureTransaction = futureTransaction;
        this.billDay = billDay;
        this.subscriberType = subscriberType;
        this.fromPackageCategory = fromPackageCategory;
        this.fromPackageGroupType = fromPackageGroupType;
        this.packageGroupCode = packageGroupCode;
        this.simCardNumber = simCardNumber;
        this.subscriberNumberDisplay = subscriberNumberDisplay;
        this.eSIMFlag = bool;
        this.pendingEsimCard = pendingEsimCard;
        this.cardStyle = cardStyle;
    }

    public /* synthetic */ VerifySubscriberNumberResponse(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, int i, List list, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, FutureTransaction futureTransaction, String str17, String str18, String str19, String str20, String str21, String str22, String str23, Boolean bool, String str24, String str25, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? "" : str, (i2 & 2) != 0 ? "" : str2, (i2 & 4) != 0 ? "" : str3, (i2 & 8) != 0 ? "" : str4, (i2 & 16) != 0 ? "" : str5, (i2 & 32) != 0 ? "" : str6, (i2 & 64) != 0 ? "" : str7, (i2 & 128) != 0 ? "" : str8, (i2 & 256) != 0 ? 0 : i, (i2 & 512) != 0 ? CollectionsKt__CollectionsKt.emptyList() : list, (i2 & 1024) != 0 ? "" : str9, (i2 & 2048) != 0 ? "" : str10, (i2 & 4096) != 0 ? "" : str11, (i2 & 8192) != 0 ? "" : str12, (i2 & 16384) != 0 ? "" : str13, (i2 & 32768) != 0 ? "" : str14, (i2 & 65536) != 0 ? "" : str15, (i2 & 131072) != 0 ? "" : str16, (i2 & 262144) != 0 ? new FutureTransaction(null, null, null, 0, null, 31, null) : futureTransaction, (i2 & 524288) != 0 ? "" : str17, (i2 & 1048576) != 0 ? "" : str18, (i2 & 2097152) != 0 ? "" : str19, (i2 & 4194304) != 0 ? "" : str20, (i2 & 8388608) != 0 ? "" : str21, (i2 & 16777216) != 0 ? "" : str22, (i2 & MediaHttpDownloader.MAXIMUM_CHUNK_SIZE) != 0 ? "" : str23, (i2 & 67108864) != 0 ? null : bool, (i2 & 134217728) != 0 ? "" : str24, (i2 & 268435456) != 0 ? "" : str25);
    }
}