package th.p047co.dtac.android.dtacone.model.appOne.onlineRegister.request;

import androidx.autofill.HintConstants;
import androidx.compose.runtime.internal.StabilityInferred;
import com.google.gson.annotations.SerializedName;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 0)
@Metadata(m28851d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\bW\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u0093\u0002\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0010\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0018\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u001a\u0012\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u001fJ\u000b\u0010Y\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010Z\u001a\u0004\u0018\u00010\u0010HÆ\u0003J\u000b\u0010[\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\\\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010]\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010^\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010_\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010`\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010a\u001a\u0004\u0018\u00010\u0018HÆ\u0003J\u0010\u0010b\u001a\u0004\u0018\u00010\u001aHÆ\u0003¢\u0006\u0002\u0010/J\u000b\u0010c\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010d\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010g\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010h\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010i\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007HÆ\u0003J\u000b\u0010j\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010k\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010l\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010m\u001a\u0004\u0018\u00010\rHÆ\u0003J\u000b\u0010n\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u009c\u0002\u0010o\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00182\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u001a2\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010pJ\u0013\u0010q\u001a\u00020r2\b\u0010s\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010t\u001a\u00020\u001aHÖ\u0001J\t\u0010u\u001a\u00020\u0003HÖ\u0001R \u0010\u0011\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R \u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b$\u0010!\"\u0004\b%\u0010#R \u0010\u000b\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b&\u0010!\"\u0004\b'\u0010#R \u0010\u001d\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b(\u0010!\"\u0004\b)\u0010#R \u0010\u001b\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b*\u0010!\"\u0004\b+\u0010#R \u0010\u0013\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b,\u0010!\"\u0004\b-\u0010#R\"\u0010\u0019\u001a\u0004\u0018\u00010\u001a8\u0006@\u0006X\u0087\u000e¢\u0006\u0010\n\u0002\u00102\u001a\u0004\b.\u0010/\"\u0004\b0\u00101R&\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00078\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b3\u00104\"\u0004\b5\u00106R \u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b7\u0010!\"\u0004\b8\u0010#R \u0010\u0017\u001a\u0004\u0018\u00010\u00188\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b9\u0010:\"\u0004\b;\u0010<R \u0010\u0016\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b=\u0010!\"\u0004\b>\u0010#R \u0010\f\u001a\u0004\u0018\u00010\r8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b?\u0010@\"\u0004\bA\u0010BR \u0010\t\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bC\u0010!\"\u0004\bD\u0010#R \u0010\u000f\u001a\u0004\u0018\u00010\u00108\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bE\u0010F\"\u0004\bG\u0010HR \u0010\u0015\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bI\u0010!\"\u0004\bJ\u0010#R \u0010\u000e\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bK\u0010!\"\u0004\bL\u0010#R \u0010\u0014\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bM\u0010!\"\u0004\bN\u0010#R \u0010\u001e\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bO\u0010!\"\u0004\bP\u0010#R \u0010\u001c\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bQ\u0010!\"\u0004\bR\u0010#R \u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bS\u0010!\"\u0004\bT\u0010#R \u0010\n\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bU\u0010!\"\u0004\bV\u0010#R \u0010\u0012\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bW\u0010!\"\u0004\bX\u0010#¨\u0006v"}, m28850d2 = {"Lth/co/dtac/android/dtacone/model/appOne/onlineRegister/request/OneOnlineRegisterCreateRetailerProfileRequest;", "", "rtrCode", "", "clusterCode", "partnerBusinessType", "partnerAddress", "", "Lth/co/dtac/android/dtacone/model/appOne/onlineRegister/request/PartnerAddressItem;", "partnerName", "salesCode", "companyName", "partnerErefillSim", "Lth/co/dtac/android/dtacone/model/appOne/onlineRegister/request/PartnerErefillSim;", "physiclLoctnId", "partnerOwner", "Lth/co/dtac/android/dtacone/model/appOne/onlineRegister/request/PartnerOwner;", "businessTypeCode", "simFlag", "dolFlag", "preSIMRTR", HintConstants.AUTOFILL_HINT_PASSWORD, "partnerDocumentCompleteDocList", "partnerContact", "Lth/co/dtac/android/dtacone/model/appOne/onlineRegister/request/PartnerContact;", "parentPartnerId", "", "comsnPaymntType", "retailBusinessType", "comsnMsisdn", "remark10", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lth/co/dtac/android/dtacone/model/appOne/onlineRegister/request/PartnerErefillSim;Ljava/lang/String;Lth/co/dtac/android/dtacone/model/appOne/onlineRegister/request/PartnerOwner;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lth/co/dtac/android/dtacone/model/appOne/onlineRegister/request/PartnerContact;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getBusinessTypeCode", "()Ljava/lang/String;", "setBusinessTypeCode", "(Ljava/lang/String;)V", "getClusterCode", "setClusterCode", "getCompanyName", "setCompanyName", "getComsnMsisdn", "setComsnMsisdn", "getComsnPaymntType", "setComsnPaymntType", "getDolFlag", "setDolFlag", "getParentPartnerId", "()Ljava/lang/Integer;", "setParentPartnerId", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "getPartnerAddress", "()Ljava/util/List;", "setPartnerAddress", "(Ljava/util/List;)V", "getPartnerBusinessType", "setPartnerBusinessType", "getPartnerContact", "()Lth/co/dtac/android/dtacone/model/appOne/onlineRegister/request/PartnerContact;", "setPartnerContact", "(Lth/co/dtac/android/dtacone/model/appOne/onlineRegister/request/PartnerContact;)V", "getPartnerDocumentCompleteDocList", "setPartnerDocumentCompleteDocList", "getPartnerErefillSim", "()Lth/co/dtac/android/dtacone/model/appOne/onlineRegister/request/PartnerErefillSim;", "setPartnerErefillSim", "(Lth/co/dtac/android/dtacone/model/appOne/onlineRegister/request/PartnerErefillSim;)V", "getPartnerName", "setPartnerName", "getPartnerOwner", "()Lth/co/dtac/android/dtacone/model/appOne/onlineRegister/request/PartnerOwner;", "setPartnerOwner", "(Lth/co/dtac/android/dtacone/model/appOne/onlineRegister/request/PartnerOwner;)V", "getPassword", "setPassword", "getPhysiclLoctnId", "setPhysiclLoctnId", "getPreSIMRTR", "setPreSIMRTR", "getRemark10", "setRemark10", "getRetailBusinessType", "setRetailBusinessType", "getRtrCode", "setRtrCode", "getSalesCode", "setSalesCode", "getSimFlag", "setSimFlag", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component2", "component20", "component21", "component22", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lth/co/dtac/android/dtacone/model/appOne/onlineRegister/request/PartnerErefillSim;Ljava/lang/String;Lth/co/dtac/android/dtacone/model/appOne/onlineRegister/request/PartnerOwner;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lth/co/dtac/android/dtacone/model/appOne/onlineRegister/request/PartnerContact;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lth/co/dtac/android/dtacone/model/appOne/onlineRegister/request/OneOnlineRegisterCreateRetailerProfileRequest;", "equals", "", "other", "hashCode", "toString", "app_prodRelease"}, m28849k = 1, m28848mv = {1, 8, 0}, m28846xi = 48)
/* renamed from: th.co.dtac.android.dtacone.model.appOne.onlineRegister.request.OneOnlineRegisterCreateRetailerProfileRequest */
/* loaded from: classes8.dex */
public final class OneOnlineRegisterCreateRetailerProfileRequest {
    public static final int $stable = 8;
    @SerializedName("businessTypeCode")
    @Nullable
    private String businessTypeCode;
    @SerializedName("clusterCode")
    @Nullable
    private String clusterCode;
    @SerializedName("companyName")
    @Nullable
    private String companyName;
    @SerializedName("comsnMsisdn")
    @Nullable
    private String comsnMsisdn;
    @SerializedName("comsnPaymntType")
    @Nullable
    private String comsnPaymntType;
    @SerializedName("dolFlag")
    @Nullable
    private String dolFlag;
    @SerializedName("parentPartnerId")
    @Nullable
    private Integer parentPartnerId;
    @SerializedName("partnerAddress")
    @Nullable
    private List<PartnerAddressItem> partnerAddress;
    @SerializedName("partnerBusinessType")
    @Nullable
    private String partnerBusinessType;
    @SerializedName("partnerContact")
    @Nullable
    private PartnerContact partnerContact;
    @SerializedName("partnerDocumentCompleteDocList")
    @Nullable
    private String partnerDocumentCompleteDocList;
    @SerializedName("partnerErefillSim")
    @Nullable
    private PartnerErefillSim partnerErefillSim;
    @SerializedName("partnerName")
    @Nullable
    private String partnerName;
    @SerializedName("partnerOwner")
    @Nullable
    private PartnerOwner partnerOwner;
    @SerializedName(HintConstants.AUTOFILL_HINT_PASSWORD)
    @Nullable
    private String password;
    @SerializedName("physiclLoctnId")
    @Nullable
    private String physiclLoctnId;
    @SerializedName("preSIMRTR")
    @Nullable
    private String preSIMRTR;
    @SerializedName("remark10")
    @Nullable
    private String remark10;
    @SerializedName("retailBusinessType")
    @Nullable
    private String retailBusinessType;
    @SerializedName("rtrCode")
    @Nullable
    private String rtrCode;
    @SerializedName("salesCode")
    @Nullable
    private String salesCode;
    @SerializedName("simFlag")
    @Nullable
    private String simFlag;

    public OneOnlineRegisterCreateRetailerProfileRequest() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 4194303, null);
    }

    @Nullable
    public final String component1() {
        return this.rtrCode;
    }

    @Nullable
    public final PartnerOwner component10() {
        return this.partnerOwner;
    }

    @Nullable
    public final String component11() {
        return this.businessTypeCode;
    }

    @Nullable
    public final String component12() {
        return this.simFlag;
    }

    @Nullable
    public final String component13() {
        return this.dolFlag;
    }

    @Nullable
    public final String component14() {
        return this.preSIMRTR;
    }

    @Nullable
    public final String component15() {
        return this.password;
    }

    @Nullable
    public final String component16() {
        return this.partnerDocumentCompleteDocList;
    }

    @Nullable
    public final PartnerContact component17() {
        return this.partnerContact;
    }

    @Nullable
    public final Integer component18() {
        return this.parentPartnerId;
    }

    @Nullable
    public final String component19() {
        return this.comsnPaymntType;
    }

    @Nullable
    public final String component2() {
        return this.clusterCode;
    }

    @Nullable
    public final String component20() {
        return this.retailBusinessType;
    }

    @Nullable
    public final String component21() {
        return this.comsnMsisdn;
    }

    @Nullable
    public final String component22() {
        return this.remark10;
    }

    @Nullable
    public final String component3() {
        return this.partnerBusinessType;
    }

    @Nullable
    public final List<PartnerAddressItem> component4() {
        return this.partnerAddress;
    }

    @Nullable
    public final String component5() {
        return this.partnerName;
    }

    @Nullable
    public final String component6() {
        return this.salesCode;
    }

    @Nullable
    public final String component7() {
        return this.companyName;
    }

    @Nullable
    public final PartnerErefillSim component8() {
        return this.partnerErefillSim;
    }

    @Nullable
    public final String component9() {
        return this.physiclLoctnId;
    }

    @NotNull
    public final OneOnlineRegisterCreateRetailerProfileRequest copy(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable List<PartnerAddressItem> list, @Nullable String str4, @Nullable String str5, @Nullable String str6, @Nullable PartnerErefillSim partnerErefillSim, @Nullable String str7, @Nullable PartnerOwner partnerOwner, @Nullable String str8, @Nullable String str9, @Nullable String str10, @Nullable String str11, @Nullable String str12, @Nullable String str13, @Nullable PartnerContact partnerContact, @Nullable Integer num, @Nullable String str14, @Nullable String str15, @Nullable String str16, @Nullable String str17) {
        return new OneOnlineRegisterCreateRetailerProfileRequest(str, str2, str3, list, str4, str5, str6, partnerErefillSim, str7, partnerOwner, str8, str9, str10, str11, str12, str13, partnerContact, num, str14, str15, str16, str17);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof OneOnlineRegisterCreateRetailerProfileRequest) {
            OneOnlineRegisterCreateRetailerProfileRequest oneOnlineRegisterCreateRetailerProfileRequest = (OneOnlineRegisterCreateRetailerProfileRequest) obj;
            return Intrinsics.areEqual(this.rtrCode, oneOnlineRegisterCreateRetailerProfileRequest.rtrCode) && Intrinsics.areEqual(this.clusterCode, oneOnlineRegisterCreateRetailerProfileRequest.clusterCode) && Intrinsics.areEqual(this.partnerBusinessType, oneOnlineRegisterCreateRetailerProfileRequest.partnerBusinessType) && Intrinsics.areEqual(this.partnerAddress, oneOnlineRegisterCreateRetailerProfileRequest.partnerAddress) && Intrinsics.areEqual(this.partnerName, oneOnlineRegisterCreateRetailerProfileRequest.partnerName) && Intrinsics.areEqual(this.salesCode, oneOnlineRegisterCreateRetailerProfileRequest.salesCode) && Intrinsics.areEqual(this.companyName, oneOnlineRegisterCreateRetailerProfileRequest.companyName) && Intrinsics.areEqual(this.partnerErefillSim, oneOnlineRegisterCreateRetailerProfileRequest.partnerErefillSim) && Intrinsics.areEqual(this.physiclLoctnId, oneOnlineRegisterCreateRetailerProfileRequest.physiclLoctnId) && Intrinsics.areEqual(this.partnerOwner, oneOnlineRegisterCreateRetailerProfileRequest.partnerOwner) && Intrinsics.areEqual(this.businessTypeCode, oneOnlineRegisterCreateRetailerProfileRequest.businessTypeCode) && Intrinsics.areEqual(this.simFlag, oneOnlineRegisterCreateRetailerProfileRequest.simFlag) && Intrinsics.areEqual(this.dolFlag, oneOnlineRegisterCreateRetailerProfileRequest.dolFlag) && Intrinsics.areEqual(this.preSIMRTR, oneOnlineRegisterCreateRetailerProfileRequest.preSIMRTR) && Intrinsics.areEqual(this.password, oneOnlineRegisterCreateRetailerProfileRequest.password) && Intrinsics.areEqual(this.partnerDocumentCompleteDocList, oneOnlineRegisterCreateRetailerProfileRequest.partnerDocumentCompleteDocList) && Intrinsics.areEqual(this.partnerContact, oneOnlineRegisterCreateRetailerProfileRequest.partnerContact) && Intrinsics.areEqual(this.parentPartnerId, oneOnlineRegisterCreateRetailerProfileRequest.parentPartnerId) && Intrinsics.areEqual(this.comsnPaymntType, oneOnlineRegisterCreateRetailerProfileRequest.comsnPaymntType) && Intrinsics.areEqual(this.retailBusinessType, oneOnlineRegisterCreateRetailerProfileRequest.retailBusinessType) && Intrinsics.areEqual(this.comsnMsisdn, oneOnlineRegisterCreateRetailerProfileRequest.comsnMsisdn) && Intrinsics.areEqual(this.remark10, oneOnlineRegisterCreateRetailerProfileRequest.remark10);
        }
        return false;
    }

    @Nullable
    public final String getBusinessTypeCode() {
        return this.businessTypeCode;
    }

    @Nullable
    public final String getClusterCode() {
        return this.clusterCode;
    }

    @Nullable
    public final String getCompanyName() {
        return this.companyName;
    }

    @Nullable
    public final String getComsnMsisdn() {
        return this.comsnMsisdn;
    }

    @Nullable
    public final String getComsnPaymntType() {
        return this.comsnPaymntType;
    }

    @Nullable
    public final String getDolFlag() {
        return this.dolFlag;
    }

    @Nullable
    public final Integer getParentPartnerId() {
        return this.parentPartnerId;
    }

    @Nullable
    public final List<PartnerAddressItem> getPartnerAddress() {
        return this.partnerAddress;
    }

    @Nullable
    public final String getPartnerBusinessType() {
        return this.partnerBusinessType;
    }

    @Nullable
    public final PartnerContact getPartnerContact() {
        return this.partnerContact;
    }

    @Nullable
    public final String getPartnerDocumentCompleteDocList() {
        return this.partnerDocumentCompleteDocList;
    }

    @Nullable
    public final PartnerErefillSim getPartnerErefillSim() {
        return this.partnerErefillSim;
    }

    @Nullable
    public final String getPartnerName() {
        return this.partnerName;
    }

    @Nullable
    public final PartnerOwner getPartnerOwner() {
        return this.partnerOwner;
    }

    @Nullable
    public final String getPassword() {
        return this.password;
    }

    @Nullable
    public final String getPhysiclLoctnId() {
        return this.physiclLoctnId;
    }

    @Nullable
    public final String getPreSIMRTR() {
        return this.preSIMRTR;
    }

    @Nullable
    public final String getRemark10() {
        return this.remark10;
    }

    @Nullable
    public final String getRetailBusinessType() {
        return this.retailBusinessType;
    }

    @Nullable
    public final String getRtrCode() {
        return this.rtrCode;
    }

    @Nullable
    public final String getSalesCode() {
        return this.salesCode;
    }

    @Nullable
    public final String getSimFlag() {
        return this.simFlag;
    }

    public int hashCode() {
        String str = this.rtrCode;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.clusterCode;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.partnerBusinessType;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        List<PartnerAddressItem> list = this.partnerAddress;
        int hashCode4 = (hashCode3 + (list == null ? 0 : list.hashCode())) * 31;
        String str4 = this.partnerName;
        int hashCode5 = (hashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.salesCode;
        int hashCode6 = (hashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.companyName;
        int hashCode7 = (hashCode6 + (str6 == null ? 0 : str6.hashCode())) * 31;
        PartnerErefillSim partnerErefillSim = this.partnerErefillSim;
        int hashCode8 = (hashCode7 + (partnerErefillSim == null ? 0 : partnerErefillSim.hashCode())) * 31;
        String str7 = this.physiclLoctnId;
        int hashCode9 = (hashCode8 + (str7 == null ? 0 : str7.hashCode())) * 31;
        PartnerOwner partnerOwner = this.partnerOwner;
        int hashCode10 = (hashCode9 + (partnerOwner == null ? 0 : partnerOwner.hashCode())) * 31;
        String str8 = this.businessTypeCode;
        int hashCode11 = (hashCode10 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.simFlag;
        int hashCode12 = (hashCode11 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.dolFlag;
        int hashCode13 = (hashCode12 + (str10 == null ? 0 : str10.hashCode())) * 31;
        String str11 = this.preSIMRTR;
        int hashCode14 = (hashCode13 + (str11 == null ? 0 : str11.hashCode())) * 31;
        String str12 = this.password;
        int hashCode15 = (hashCode14 + (str12 == null ? 0 : str12.hashCode())) * 31;
        String str13 = this.partnerDocumentCompleteDocList;
        int hashCode16 = (hashCode15 + (str13 == null ? 0 : str13.hashCode())) * 31;
        PartnerContact partnerContact = this.partnerContact;
        int hashCode17 = (hashCode16 + (partnerContact == null ? 0 : partnerContact.hashCode())) * 31;
        Integer num = this.parentPartnerId;
        int hashCode18 = (hashCode17 + (num == null ? 0 : num.hashCode())) * 31;
        String str14 = this.comsnPaymntType;
        int hashCode19 = (hashCode18 + (str14 == null ? 0 : str14.hashCode())) * 31;
        String str15 = this.retailBusinessType;
        int hashCode20 = (hashCode19 + (str15 == null ? 0 : str15.hashCode())) * 31;
        String str16 = this.comsnMsisdn;
        int hashCode21 = (hashCode20 + (str16 == null ? 0 : str16.hashCode())) * 31;
        String str17 = this.remark10;
        return hashCode21 + (str17 != null ? str17.hashCode() : 0);
    }

    public final void setBusinessTypeCode(@Nullable String str) {
        this.businessTypeCode = str;
    }

    public final void setClusterCode(@Nullable String str) {
        this.clusterCode = str;
    }

    public final void setCompanyName(@Nullable String str) {
        this.companyName = str;
    }

    public final void setComsnMsisdn(@Nullable String str) {
        this.comsnMsisdn = str;
    }

    public final void setComsnPaymntType(@Nullable String str) {
        this.comsnPaymntType = str;
    }

    public final void setDolFlag(@Nullable String str) {
        this.dolFlag = str;
    }

    public final void setParentPartnerId(@Nullable Integer num) {
        this.parentPartnerId = num;
    }

    public final void setPartnerAddress(@Nullable List<PartnerAddressItem> list) {
        this.partnerAddress = list;
    }

    public final void setPartnerBusinessType(@Nullable String str) {
        this.partnerBusinessType = str;
    }

    public final void setPartnerContact(@Nullable PartnerContact partnerContact) {
        this.partnerContact = partnerContact;
    }

    public final void setPartnerDocumentCompleteDocList(@Nullable String str) {
        this.partnerDocumentCompleteDocList = str;
    }

    public final void setPartnerErefillSim(@Nullable PartnerErefillSim partnerErefillSim) {
        this.partnerErefillSim = partnerErefillSim;
    }

    public final void setPartnerName(@Nullable String str) {
        this.partnerName = str;
    }

    public final void setPartnerOwner(@Nullable PartnerOwner partnerOwner) {
        this.partnerOwner = partnerOwner;
    }

    public final void setPassword(@Nullable String str) {
        this.password = str;
    }

    public final void setPhysiclLoctnId(@Nullable String str) {
        this.physiclLoctnId = str;
    }

    public final void setPreSIMRTR(@Nullable String str) {
        this.preSIMRTR = str;
    }

    public final void setRemark10(@Nullable String str) {
        this.remark10 = str;
    }

    public final void setRetailBusinessType(@Nullable String str) {
        this.retailBusinessType = str;
    }

    public final void setRtrCode(@Nullable String str) {
        this.rtrCode = str;
    }

    public final void setSalesCode(@Nullable String str) {
        this.salesCode = str;
    }

    public final void setSimFlag(@Nullable String str) {
        this.simFlag = str;
    }

    @NotNull
    public String toString() {
        String str = this.rtrCode;
        String str2 = this.clusterCode;
        String str3 = this.partnerBusinessType;
        List<PartnerAddressItem> list = this.partnerAddress;
        String str4 = this.partnerName;
        String str5 = this.salesCode;
        String str6 = this.companyName;
        PartnerErefillSim partnerErefillSim = this.partnerErefillSim;
        String str7 = this.physiclLoctnId;
        PartnerOwner partnerOwner = this.partnerOwner;
        String str8 = this.businessTypeCode;
        String str9 = this.simFlag;
        String str10 = this.dolFlag;
        String str11 = this.preSIMRTR;
        String str12 = this.password;
        String str13 = this.partnerDocumentCompleteDocList;
        PartnerContact partnerContact = this.partnerContact;
        Integer num = this.parentPartnerId;
        String str14 = this.comsnPaymntType;
        String str15 = this.retailBusinessType;
        String str16 = this.comsnMsisdn;
        String str17 = this.remark10;
        return "OneOnlineRegisterCreateRetailerProfileRequest(rtrCode=" + str + ", clusterCode=" + str2 + ", partnerBusinessType=" + str3 + ", partnerAddress=" + list + ", partnerName=" + str4 + ", salesCode=" + str5 + ", companyName=" + str6 + ", partnerErefillSim=" + partnerErefillSim + ", physiclLoctnId=" + str7 + ", partnerOwner=" + partnerOwner + ", businessTypeCode=" + str8 + ", simFlag=" + str9 + ", dolFlag=" + str10 + ", preSIMRTR=" + str11 + ", password=" + str12 + ", partnerDocumentCompleteDocList=" + str13 + ", partnerContact=" + partnerContact + ", parentPartnerId=" + num + ", comsnPaymntType=" + str14 + ", retailBusinessType=" + str15 + ", comsnMsisdn=" + str16 + ", remark10=" + str17 + ")";
    }

    public OneOnlineRegisterCreateRetailerProfileRequest(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable List<PartnerAddressItem> list, @Nullable String str4, @Nullable String str5, @Nullable String str6, @Nullable PartnerErefillSim partnerErefillSim, @Nullable String str7, @Nullable PartnerOwner partnerOwner, @Nullable String str8, @Nullable String str9, @Nullable String str10, @Nullable String str11, @Nullable String str12, @Nullable String str13, @Nullable PartnerContact partnerContact, @Nullable Integer num, @Nullable String str14, @Nullable String str15, @Nullable String str16, @Nullable String str17) {
        this.rtrCode = str;
        this.clusterCode = str2;
        this.partnerBusinessType = str3;
        this.partnerAddress = list;
        this.partnerName = str4;
        this.salesCode = str5;
        this.companyName = str6;
        this.partnerErefillSim = partnerErefillSim;
        this.physiclLoctnId = str7;
        this.partnerOwner = partnerOwner;
        this.businessTypeCode = str8;
        this.simFlag = str9;
        this.dolFlag = str10;
        this.preSIMRTR = str11;
        this.password = str12;
        this.partnerDocumentCompleteDocList = str13;
        this.partnerContact = partnerContact;
        this.parentPartnerId = num;
        this.comsnPaymntType = str14;
        this.retailBusinessType = str15;
        this.comsnMsisdn = str16;
        this.remark10 = str17;
    }

    public /* synthetic */ OneOnlineRegisterCreateRetailerProfileRequest(String str, String str2, String str3, List list, String str4, String str5, String str6, PartnerErefillSim partnerErefillSim, String str7, PartnerOwner partnerOwner, String str8, String str9, String str10, String str11, String str12, String str13, PartnerContact partnerContact, Integer num, String str14, String str15, String str16, String str17, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : list, (i & 16) != 0 ? null : str4, (i & 32) != 0 ? null : str5, (i & 64) != 0 ? null : str6, (i & 128) != 0 ? new PartnerErefillSim(null, null, null, 7, null) : partnerErefillSim, (i & 256) != 0 ? null : str7, (i & 512) != 0 ? new PartnerOwner(null, null, null, null, null, null, null, null, null, null, null, null, null, 8191, null) : partnerOwner, (i & 1024) != 0 ? null : str8, (i & 2048) != 0 ? null : str9, (i & 4096) != 0 ? null : str10, (i & 8192) != 0 ? null : str11, (i & 16384) != 0 ? null : str12, (i & 32768) != 0 ? null : str13, (i & 65536) != 0 ? new PartnerContact(null, null, null, null, null, 31, null) : partnerContact, (i & 131072) != 0 ? null : num, (i & 262144) != 0 ? null : str14, (i & 524288) != 0 ? "PERSONAL" : str15, (i & 1048576) != 0 ? null : str16, (i & 2097152) != 0 ? null : str17);
    }
}
