package th.p047co.dtac.android.dtacone.model.change_pack;

import androidx.autofill.HintConstants;
import androidx.compose.runtime.internal.StabilityInferred;
import com.google.gson.annotations.SerializedName;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 0)
@Metadata(m28851d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b:\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001BË\u0001\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\u0006\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\u0006\u0012\u0006\u0010\r\u001a\u00020\u0006\u0012\u0006\u0010\u000e\u001a\u00020\u0006\u0012\u0006\u0010\u000f\u001a\u00020\u0006\u0012\u0006\u0010\u0010\u001a\u00020\u0006\u0012\u0006\u0010\u0011\u001a\u00020\u0006\u0012\u0006\u0010\u0012\u001a\u00020\u0006\u0012\u0006\u0010\u0013\u001a\u00020\u0006\u0012\u0006\u0010\u0014\u001a\u00020\u0006\u0012\u0006\u0010\u0015\u001a\u00020\u0006\u0012\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00170\u0003\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019\u0012\u0006\u0010\u001a\u001a\u00020\u0006\u0012\u0006\u0010\u001b\u001a\u00020\u0006\u0012\u0006\u0010\u001c\u001a\u00020\u0006\u0012\u0006\u0010\u001d\u001a\u00020\u0006\u0012\u0006\u0010\u001e\u001a\u00020\u0006¢\u0006\u0002\u0010\u001fJ\u000f\u0010;\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\t\u0010<\u001a\u00020\u0006HÆ\u0003J\t\u0010=\u001a\u00020\u0006HÆ\u0003J\t\u0010>\u001a\u00020\u0006HÆ\u0003J\t\u0010?\u001a\u00020\u0006HÆ\u0003J\t\u0010@\u001a\u00020\u0006HÆ\u0003J\t\u0010A\u001a\u00020\u0006HÆ\u0003J\t\u0010B\u001a\u00020\u0006HÆ\u0003J\u000f\u0010C\u001a\b\u0012\u0004\u0012\u00020\u00170\u0003HÆ\u0003J\u000b\u0010D\u001a\u0004\u0018\u00010\u0019HÆ\u0003J\t\u0010E\u001a\u00020\u0006HÆ\u0003J\t\u0010F\u001a\u00020\u0006HÆ\u0003J\t\u0010G\u001a\u00020\u0006HÆ\u0003J\t\u0010H\u001a\u00020\u0006HÆ\u0003J\t\u0010I\u001a\u00020\u0006HÆ\u0003J\t\u0010J\u001a\u00020\u0006HÆ\u0003J\t\u0010K\u001a\u00020\u0006HÆ\u0003J\t\u0010L\u001a\u00020\u0006HÆ\u0003J\t\u0010M\u001a\u00020\u0006HÆ\u0003J\t\u0010N\u001a\u00020\u000bHÆ\u0003J\t\u0010O\u001a\u00020\u0006HÆ\u0003J\t\u0010P\u001a\u00020\u0006HÆ\u0003J\t\u0010Q\u001a\u00020\u0006HÆ\u0003Jý\u0001\u0010R\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\u00062\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\u00062\b\b\u0002\u0010\r\u001a\u00020\u00062\b\b\u0002\u0010\u000e\u001a\u00020\u00062\b\b\u0002\u0010\u000f\u001a\u00020\u00062\b\b\u0002\u0010\u0010\u001a\u00020\u00062\b\b\u0002\u0010\u0011\u001a\u00020\u00062\b\b\u0002\u0010\u0012\u001a\u00020\u00062\b\b\u0002\u0010\u0013\u001a\u00020\u00062\b\b\u0002\u0010\u0014\u001a\u00020\u00062\b\b\u0002\u0010\u0015\u001a\u00020\u00062\u000e\b\u0002\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00170\u00032\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00192\b\b\u0002\u0010\u001a\u001a\u00020\u00062\b\b\u0002\u0010\u001b\u001a\u00020\u00062\b\b\u0002\u0010\u001c\u001a\u00020\u00062\b\b\u0002\u0010\u001d\u001a\u00020\u00062\b\b\u0002\u0010\u001e\u001a\u00020\u0006HÆ\u0001J\u0013\u0010S\u001a\u00020T2\b\u0010U\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010V\u001a\u00020\u000bHÖ\u0001J\t\u0010W\u001a\u00020\u0006HÖ\u0001R\u001c\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b \u0010!R\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010#R\u0016\u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b$\u0010#R\u0016\u0010\b\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b%\u0010#R\u0016\u0010\t\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b&\u0010#R\u0016\u0010\n\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b'\u0010(R\u0016\u0010\f\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b)\u0010#R\u0016\u0010\r\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b*\u0010#R\u0016\u0010\u000e\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b+\u0010#R\u0016\u0010\u000f\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b,\u0010#R\u0016\u0010\u0010\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b-\u0010#R\u0016\u0010\u0011\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b.\u0010#R\u0016\u0010\u0012\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b/\u0010#R\u0016\u0010\u0013\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b0\u0010#R\u0016\u0010\u0014\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b1\u0010#R\u0016\u0010\u0015\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b2\u0010#R\u001c\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00170\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b3\u0010!R\u0018\u0010\u0018\u001a\u0004\u0018\u00010\u00198\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b4\u00105R\u0016\u0010\u001a\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b6\u0010#R\u0016\u0010\u001b\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b7\u0010#R\u0016\u0010\u001c\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b8\u0010#R\u0016\u0010\u001d\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b9\u0010#R\u0016\u0010\u001e\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b:\u0010#¨\u0006X"}, m28850d2 = {"Lth/co/dtac/android/dtacone/model/change_pack/CurrentPromotion;", "", "additionalPackages", "", "Lth/co/dtac/android/dtacone/model/change_pack/AdditionalPackage;", "authExprFlag", "", "authUserFlag", "billingProductCode", "code", "csCustGrupCode", "", "csCustGrupName", "description", "firstPkgpCode", "fromPackCatg", "fromPkgpType", "futureInvoiceDate", HintConstants.AUTOFILL_HINT_GENDER, "hardwareNumber", "lastChangeDateTime", "lastInvoiceDate", "mainPackages", "Lth/co/dtac/android/dtacone/model/change_pack/MainPackage;", "nextCycle", "Lth/co/dtac/android/dtacone/model/change_pack/NextCycle;", "nextInvoiceDate", "subscriberType", "switchOnDateTime", "telpType", "waiveFee", "(Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lth/co/dtac/android/dtacone/model/change_pack/NextCycle;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getAdditionalPackages", "()Ljava/util/List;", "getAuthExprFlag", "()Ljava/lang/String;", "getAuthUserFlag", "getBillingProductCode", "getCode", "getCsCustGrupCode", "()I", "getCsCustGrupName", "getDescription", "getFirstPkgpCode", "getFromPackCatg", "getFromPkgpType", "getFutureInvoiceDate", "getGender", "getHardwareNumber", "getLastChangeDateTime", "getLastInvoiceDate", "getMainPackages", "getNextCycle", "()Lth/co/dtac/android/dtacone/model/change_pack/NextCycle;", "getNextInvoiceDate", "getSubscriberType", "getSwitchOnDateTime", "getTelpType", "getWaiveFee", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component2", "component20", "component21", "component22", "component23", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "", "other", "hashCode", "toString", "app_prodRelease"}, m28849k = 1, m28848mv = {1, 8, 0}, m28846xi = 48)
/* renamed from: th.co.dtac.android.dtacone.model.change_pack.CurrentPromotion */
/* loaded from: classes8.dex */
public final class CurrentPromotion {
    public static final int $stable = 8;
    @SerializedName("additionalPackages")
    @NotNull
    private final List<AdditionalPackage> additionalPackages;
    @SerializedName("authExprFlag")
    @NotNull
    private final String authExprFlag;
    @SerializedName("authUserFlag")
    @NotNull
    private final String authUserFlag;
    @SerializedName("billingProductCode")
    @NotNull
    private final String billingProductCode;
    @SerializedName("code")
    @NotNull
    private final String code;
    @SerializedName("csCustGrupCode")
    private final int csCustGrupCode;
    @SerializedName("csCustGrupName")
    @NotNull
    private final String csCustGrupName;
    @SerializedName("description")
    @NotNull
    private final String description;
    @SerializedName("firstPkgpCode")
    @NotNull
    private final String firstPkgpCode;
    @SerializedName("fromPackCatg")
    @NotNull
    private final String fromPackCatg;
    @SerializedName("fromPkgpType")
    @NotNull
    private final String fromPkgpType;
    @SerializedName("futureInvoiceDate")
    @NotNull
    private final String futureInvoiceDate;
    @SerializedName(HintConstants.AUTOFILL_HINT_GENDER)
    @NotNull
    private final String gender;
    @SerializedName("hardwareNumber")
    @NotNull
    private final String hardwareNumber;
    @SerializedName("lastChangeDateTime")
    @NotNull
    private final String lastChangeDateTime;
    @SerializedName("lastInvoiceDate")
    @NotNull
    private final String lastInvoiceDate;
    @SerializedName("mainPackages")
    @NotNull
    private final List<MainPackage> mainPackages;
    @SerializedName("nextCycle")
    @Nullable
    private final NextCycle nextCycle;
    @SerializedName("nextInvoiceDate")
    @NotNull
    private final String nextInvoiceDate;
    @SerializedName("subscriberType")
    @NotNull
    private final String subscriberType;
    @SerializedName("switchOnDateTime")
    @NotNull
    private final String switchOnDateTime;
    @SerializedName("telpType")
    @NotNull
    private final String telpType;
    @SerializedName("waiveFee")
    @NotNull
    private final String waiveFee;

    public CurrentPromotion(@NotNull List<AdditionalPackage> additionalPackages, @NotNull String authExprFlag, @NotNull String authUserFlag, @NotNull String billingProductCode, @NotNull String code, int i, @NotNull String csCustGrupName, @NotNull String description, @NotNull String firstPkgpCode, @NotNull String fromPackCatg, @NotNull String fromPkgpType, @NotNull String futureInvoiceDate, @NotNull String gender, @NotNull String hardwareNumber, @NotNull String lastChangeDateTime, @NotNull String lastInvoiceDate, @NotNull List<MainPackage> mainPackages, @Nullable NextCycle nextCycle, @NotNull String nextInvoiceDate, @NotNull String subscriberType, @NotNull String switchOnDateTime, @NotNull String telpType, @NotNull String waiveFee) {
        Intrinsics.checkNotNullParameter(additionalPackages, "additionalPackages");
        Intrinsics.checkNotNullParameter(authExprFlag, "authExprFlag");
        Intrinsics.checkNotNullParameter(authUserFlag, "authUserFlag");
        Intrinsics.checkNotNullParameter(billingProductCode, "billingProductCode");
        Intrinsics.checkNotNullParameter(code, "code");
        Intrinsics.checkNotNullParameter(csCustGrupName, "csCustGrupName");
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(firstPkgpCode, "firstPkgpCode");
        Intrinsics.checkNotNullParameter(fromPackCatg, "fromPackCatg");
        Intrinsics.checkNotNullParameter(fromPkgpType, "fromPkgpType");
        Intrinsics.checkNotNullParameter(futureInvoiceDate, "futureInvoiceDate");
        Intrinsics.checkNotNullParameter(gender, "gender");
        Intrinsics.checkNotNullParameter(hardwareNumber, "hardwareNumber");
        Intrinsics.checkNotNullParameter(lastChangeDateTime, "lastChangeDateTime");
        Intrinsics.checkNotNullParameter(lastInvoiceDate, "lastInvoiceDate");
        Intrinsics.checkNotNullParameter(mainPackages, "mainPackages");
        Intrinsics.checkNotNullParameter(nextInvoiceDate, "nextInvoiceDate");
        Intrinsics.checkNotNullParameter(subscriberType, "subscriberType");
        Intrinsics.checkNotNullParameter(switchOnDateTime, "switchOnDateTime");
        Intrinsics.checkNotNullParameter(telpType, "telpType");
        Intrinsics.checkNotNullParameter(waiveFee, "waiveFee");
        this.additionalPackages = additionalPackages;
        this.authExprFlag = authExprFlag;
        this.authUserFlag = authUserFlag;
        this.billingProductCode = billingProductCode;
        this.code = code;
        this.csCustGrupCode = i;
        this.csCustGrupName = csCustGrupName;
        this.description = description;
        this.firstPkgpCode = firstPkgpCode;
        this.fromPackCatg = fromPackCatg;
        this.fromPkgpType = fromPkgpType;
        this.futureInvoiceDate = futureInvoiceDate;
        this.gender = gender;
        this.hardwareNumber = hardwareNumber;
        this.lastChangeDateTime = lastChangeDateTime;
        this.lastInvoiceDate = lastInvoiceDate;
        this.mainPackages = mainPackages;
        this.nextCycle = nextCycle;
        this.nextInvoiceDate = nextInvoiceDate;
        this.subscriberType = subscriberType;
        this.switchOnDateTime = switchOnDateTime;
        this.telpType = telpType;
        this.waiveFee = waiveFee;
    }

    @NotNull
    public final List<AdditionalPackage> component1() {
        return this.additionalPackages;
    }

    @NotNull
    public final String component10() {
        return this.fromPackCatg;
    }

    @NotNull
    public final String component11() {
        return this.fromPkgpType;
    }

    @NotNull
    public final String component12() {
        return this.futureInvoiceDate;
    }

    @NotNull
    public final String component13() {
        return this.gender;
    }

    @NotNull
    public final String component14() {
        return this.hardwareNumber;
    }

    @NotNull
    public final String component15() {
        return this.lastChangeDateTime;
    }

    @NotNull
    public final String component16() {
        return this.lastInvoiceDate;
    }

    @NotNull
    public final List<MainPackage> component17() {
        return this.mainPackages;
    }

    @Nullable
    public final NextCycle component18() {
        return this.nextCycle;
    }

    @NotNull
    public final String component19() {
        return this.nextInvoiceDate;
    }

    @NotNull
    public final String component2() {
        return this.authExprFlag;
    }

    @NotNull
    public final String component20() {
        return this.subscriberType;
    }

    @NotNull
    public final String component21() {
        return this.switchOnDateTime;
    }

    @NotNull
    public final String component22() {
        return this.telpType;
    }

    @NotNull
    public final String component23() {
        return this.waiveFee;
    }

    @NotNull
    public final String component3() {
        return this.authUserFlag;
    }

    @NotNull
    public final String component4() {
        return this.billingProductCode;
    }

    @NotNull
    public final String component5() {
        return this.code;
    }

    public final int component6() {
        return this.csCustGrupCode;
    }

    @NotNull
    public final String component7() {
        return this.csCustGrupName;
    }

    @NotNull
    public final String component8() {
        return this.description;
    }

    @NotNull
    public final String component9() {
        return this.firstPkgpCode;
    }

    @NotNull
    public final CurrentPromotion copy(@NotNull List<AdditionalPackage> additionalPackages, @NotNull String authExprFlag, @NotNull String authUserFlag, @NotNull String billingProductCode, @NotNull String code, int i, @NotNull String csCustGrupName, @NotNull String description, @NotNull String firstPkgpCode, @NotNull String fromPackCatg, @NotNull String fromPkgpType, @NotNull String futureInvoiceDate, @NotNull String gender, @NotNull String hardwareNumber, @NotNull String lastChangeDateTime, @NotNull String lastInvoiceDate, @NotNull List<MainPackage> mainPackages, @Nullable NextCycle nextCycle, @NotNull String nextInvoiceDate, @NotNull String subscriberType, @NotNull String switchOnDateTime, @NotNull String telpType, @NotNull String waiveFee) {
        Intrinsics.checkNotNullParameter(additionalPackages, "additionalPackages");
        Intrinsics.checkNotNullParameter(authExprFlag, "authExprFlag");
        Intrinsics.checkNotNullParameter(authUserFlag, "authUserFlag");
        Intrinsics.checkNotNullParameter(billingProductCode, "billingProductCode");
        Intrinsics.checkNotNullParameter(code, "code");
        Intrinsics.checkNotNullParameter(csCustGrupName, "csCustGrupName");
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(firstPkgpCode, "firstPkgpCode");
        Intrinsics.checkNotNullParameter(fromPackCatg, "fromPackCatg");
        Intrinsics.checkNotNullParameter(fromPkgpType, "fromPkgpType");
        Intrinsics.checkNotNullParameter(futureInvoiceDate, "futureInvoiceDate");
        Intrinsics.checkNotNullParameter(gender, "gender");
        Intrinsics.checkNotNullParameter(hardwareNumber, "hardwareNumber");
        Intrinsics.checkNotNullParameter(lastChangeDateTime, "lastChangeDateTime");
        Intrinsics.checkNotNullParameter(lastInvoiceDate, "lastInvoiceDate");
        Intrinsics.checkNotNullParameter(mainPackages, "mainPackages");
        Intrinsics.checkNotNullParameter(nextInvoiceDate, "nextInvoiceDate");
        Intrinsics.checkNotNullParameter(subscriberType, "subscriberType");
        Intrinsics.checkNotNullParameter(switchOnDateTime, "switchOnDateTime");
        Intrinsics.checkNotNullParameter(telpType, "telpType");
        Intrinsics.checkNotNullParameter(waiveFee, "waiveFee");
        return new CurrentPromotion(additionalPackages, authExprFlag, authUserFlag, billingProductCode, code, i, csCustGrupName, description, firstPkgpCode, fromPackCatg, fromPkgpType, futureInvoiceDate, gender, hardwareNumber, lastChangeDateTime, lastInvoiceDate, mainPackages, nextCycle, nextInvoiceDate, subscriberType, switchOnDateTime, telpType, waiveFee);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof CurrentPromotion) {
            CurrentPromotion currentPromotion = (CurrentPromotion) obj;
            return Intrinsics.areEqual(this.additionalPackages, currentPromotion.additionalPackages) && Intrinsics.areEqual(this.authExprFlag, currentPromotion.authExprFlag) && Intrinsics.areEqual(this.authUserFlag, currentPromotion.authUserFlag) && Intrinsics.areEqual(this.billingProductCode, currentPromotion.billingProductCode) && Intrinsics.areEqual(this.code, currentPromotion.code) && this.csCustGrupCode == currentPromotion.csCustGrupCode && Intrinsics.areEqual(this.csCustGrupName, currentPromotion.csCustGrupName) && Intrinsics.areEqual(this.description, currentPromotion.description) && Intrinsics.areEqual(this.firstPkgpCode, currentPromotion.firstPkgpCode) && Intrinsics.areEqual(this.fromPackCatg, currentPromotion.fromPackCatg) && Intrinsics.areEqual(this.fromPkgpType, currentPromotion.fromPkgpType) && Intrinsics.areEqual(this.futureInvoiceDate, currentPromotion.futureInvoiceDate) && Intrinsics.areEqual(this.gender, currentPromotion.gender) && Intrinsics.areEqual(this.hardwareNumber, currentPromotion.hardwareNumber) && Intrinsics.areEqual(this.lastChangeDateTime, currentPromotion.lastChangeDateTime) && Intrinsics.areEqual(this.lastInvoiceDate, currentPromotion.lastInvoiceDate) && Intrinsics.areEqual(this.mainPackages, currentPromotion.mainPackages) && Intrinsics.areEqual(this.nextCycle, currentPromotion.nextCycle) && Intrinsics.areEqual(this.nextInvoiceDate, currentPromotion.nextInvoiceDate) && Intrinsics.areEqual(this.subscriberType, currentPromotion.subscriberType) && Intrinsics.areEqual(this.switchOnDateTime, currentPromotion.switchOnDateTime) && Intrinsics.areEqual(this.telpType, currentPromotion.telpType) && Intrinsics.areEqual(this.waiveFee, currentPromotion.waiveFee);
        }
        return false;
    }

    @NotNull
    public final List<AdditionalPackage> getAdditionalPackages() {
        return this.additionalPackages;
    }

    @NotNull
    public final String getAuthExprFlag() {
        return this.authExprFlag;
    }

    @NotNull
    public final String getAuthUserFlag() {
        return this.authUserFlag;
    }

    @NotNull
    public final String getBillingProductCode() {
        return this.billingProductCode;
    }

    @NotNull
    public final String getCode() {
        return this.code;
    }

    public final int getCsCustGrupCode() {
        return this.csCustGrupCode;
    }

    @NotNull
    public final String getCsCustGrupName() {
        return this.csCustGrupName;
    }

    @NotNull
    public final String getDescription() {
        return this.description;
    }

    @NotNull
    public final String getFirstPkgpCode() {
        return this.firstPkgpCode;
    }

    @NotNull
    public final String getFromPackCatg() {
        return this.fromPackCatg;
    }

    @NotNull
    public final String getFromPkgpType() {
        return this.fromPkgpType;
    }

    @NotNull
    public final String getFutureInvoiceDate() {
        return this.futureInvoiceDate;
    }

    @NotNull
    public final String getGender() {
        return this.gender;
    }

    @NotNull
    public final String getHardwareNumber() {
        return this.hardwareNumber;
    }

    @NotNull
    public final String getLastChangeDateTime() {
        return this.lastChangeDateTime;
    }

    @NotNull
    public final String getLastInvoiceDate() {
        return this.lastInvoiceDate;
    }

    @NotNull
    public final List<MainPackage> getMainPackages() {
        return this.mainPackages;
    }

    @Nullable
    public final NextCycle getNextCycle() {
        return this.nextCycle;
    }

    @NotNull
    public final String getNextInvoiceDate() {
        return this.nextInvoiceDate;
    }

    @NotNull
    public final String getSubscriberType() {
        return this.subscriberType;
    }

    @NotNull
    public final String getSwitchOnDateTime() {
        return this.switchOnDateTime;
    }

    @NotNull
    public final String getTelpType() {
        return this.telpType;
    }

    @NotNull
    public final String getWaiveFee() {
        return this.waiveFee;
    }

    public int hashCode() {
        int hashCode = ((((((((((((((((((((((((((((((((this.additionalPackages.hashCode() * 31) + this.authExprFlag.hashCode()) * 31) + this.authUserFlag.hashCode()) * 31) + this.billingProductCode.hashCode()) * 31) + this.code.hashCode()) * 31) + this.csCustGrupCode) * 31) + this.csCustGrupName.hashCode()) * 31) + this.description.hashCode()) * 31) + this.firstPkgpCode.hashCode()) * 31) + this.fromPackCatg.hashCode()) * 31) + this.fromPkgpType.hashCode()) * 31) + this.futureInvoiceDate.hashCode()) * 31) + this.gender.hashCode()) * 31) + this.hardwareNumber.hashCode()) * 31) + this.lastChangeDateTime.hashCode()) * 31) + this.lastInvoiceDate.hashCode()) * 31) + this.mainPackages.hashCode()) * 31;
        NextCycle nextCycle = this.nextCycle;
        return ((((((((((hashCode + (nextCycle == null ? 0 : nextCycle.hashCode())) * 31) + this.nextInvoiceDate.hashCode()) * 31) + this.subscriberType.hashCode()) * 31) + this.switchOnDateTime.hashCode()) * 31) + this.telpType.hashCode()) * 31) + this.waiveFee.hashCode();
    }

    @NotNull
    public String toString() {
        List<AdditionalPackage> list = this.additionalPackages;
        String str = this.authExprFlag;
        String str2 = this.authUserFlag;
        String str3 = this.billingProductCode;
        String str4 = this.code;
        int i = this.csCustGrupCode;
        String str5 = this.csCustGrupName;
        String str6 = this.description;
        String str7 = this.firstPkgpCode;
        String str8 = this.fromPackCatg;
        String str9 = this.fromPkgpType;
        String str10 = this.futureInvoiceDate;
        String str11 = this.gender;
        String str12 = this.hardwareNumber;
        String str13 = this.lastChangeDateTime;
        String str14 = this.lastInvoiceDate;
        List<MainPackage> list2 = this.mainPackages;
        NextCycle nextCycle = this.nextCycle;
        String str15 = this.nextInvoiceDate;
        String str16 = this.subscriberType;
        String str17 = this.switchOnDateTime;
        String str18 = this.telpType;
        String str19 = this.waiveFee;
        return "CurrentPromotion(additionalPackages=" + list + ", authExprFlag=" + str + ", authUserFlag=" + str2 + ", billingProductCode=" + str3 + ", code=" + str4 + ", csCustGrupCode=" + i + ", csCustGrupName=" + str5 + ", description=" + str6 + ", firstPkgpCode=" + str7 + ", fromPackCatg=" + str8 + ", fromPkgpType=" + str9 + ", futureInvoiceDate=" + str10 + ", gender=" + str11 + ", hardwareNumber=" + str12 + ", lastChangeDateTime=" + str13 + ", lastInvoiceDate=" + str14 + ", mainPackages=" + list2 + ", nextCycle=" + nextCycle + ", nextInvoiceDate=" + str15 + ", subscriberType=" + str16 + ", switchOnDateTime=" + str17 + ", telpType=" + str18 + ", waiveFee=" + str19 + ")";
    }
}
