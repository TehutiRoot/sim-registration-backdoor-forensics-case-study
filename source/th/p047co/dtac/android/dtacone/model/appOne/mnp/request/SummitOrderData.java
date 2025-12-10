package th.p047co.dtac.android.dtacone.model.appOne.mnp.request;

import androidx.autofill.HintConstants;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.core.view.ViewCompat;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 0)
@Metadata(m28851d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\bJ\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B¥\u0002\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u001bJ\u000b\u00104\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00105\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00106\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00107\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00108\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00109\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010:\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010;\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010<\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010=\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010>\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010?\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010@\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010A\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010B\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010C\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010D\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010E\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010F\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010G\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010H\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010I\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010J\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010K\u001a\u0004\u0018\u00010\u0003HÆ\u0003J©\u0002\u0010L\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010M\u001a\u00020N2\b\u0010O\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010P\u001a\u00020QHÖ\u0001J\t\u0010R\u001a\u00020\u0003HÖ\u0001R\u0018\u0010\u0018\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0018\u0010\u0016\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001dR\u0018\u0010\u0013\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u001dR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u001dR\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u001dR\u0018\u0010\u0017\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u001dR\u0018\u0010\u0014\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b#\u0010\u001dR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b$\u0010\u001dR\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b%\u0010\u001dR\u0018\u0010\b\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b&\u0010\u001dR\u0018\u0010\u0015\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u001dR\u0018\u0010\u0019\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b'\u0010\u001dR\u0018\u0010\u001a\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b(\u0010\u001dR\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b)\u0010\u001dR\u0018\u0010\t\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b*\u0010\u001dR\u0018\u0010\r\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b+\u0010\u001dR\u0018\u0010\n\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b,\u0010\u001dR\u0018\u0010\u000b\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b-\u0010\u001dR\u0018\u0010\f\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b.\u0010\u001dR\u0018\u0010\u000e\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b/\u0010\u001dR\u0018\u0010\u000f\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b0\u0010\u001dR\u0018\u0010\u0010\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b1\u0010\u001dR\u0018\u0010\u0011\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b2\u0010\u001dR\u0018\u0010\u0012\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b3\u0010\u001d¨\u0006S"}, m28850d2 = {"Lth/co/dtac/android/dtacone/model/appOne/mnp/request/SummitOrderData;", "", "packageCode", "", "custName", HintConstants.AUTOFILL_HINT_GENDER, "eSign", "idNumber", "idType", "partnerCode", "productIdNumber", "productName", "propoPromo", "priceplanRc", "readCard", "saleCode", "serialNumber", "serviceCode", "serviceName", "consentId", "faceRecogStatus", "isIdentical", "confidentRatio", "faceCustCert", "approver", "operatorCode", "operatorDesc", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getApprover", "()Ljava/lang/String;", "getConfidentRatio", "getConsentId", "getCustName", "getESign", "getFaceCustCert", "getFaceRecogStatus", "getGender", "getIdNumber", "getIdType", "getOperatorCode", "getOperatorDesc", "getPackageCode", "getPartnerCode", "getPriceplanRc", "getProductIdNumber", "getProductName", "getPropoPromo", "getReadCard", "getSaleCode", "getSerialNumber", "getServiceCode", "getServiceName", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component2", "component20", "component21", "component22", "component23", "component24", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "", "other", "hashCode", "", "toString", "app_prodRelease"}, m28849k = 1, m28848mv = {1, 8, 0}, m28846xi = 48)
/* renamed from: th.co.dtac.android.dtacone.model.appOne.mnp.request.SummitOrderData */
/* loaded from: classes8.dex */
public final class SummitOrderData {
    public static final int $stable = 0;
    @SerializedName("approver")
    @Nullable
    private final String approver;
    @SerializedName("confidentRatio")
    @Nullable
    private final String confidentRatio;
    @SerializedName("consentId")
    @Nullable
    private final String consentId;
    @SerializedName("custName")
    @Nullable
    private final String custName;
    @SerializedName("eSign")
    @Nullable
    private final String eSign;
    @SerializedName("faceCustCert")
    @Nullable
    private final String faceCustCert;
    @SerializedName("faceRecogStatus")
    @Nullable
    private final String faceRecogStatus;
    @SerializedName(HintConstants.AUTOFILL_HINT_GENDER)
    @Nullable
    private final String gender;
    @SerializedName("idNumber")
    @Nullable
    private final String idNumber;
    @SerializedName("idType")
    @Nullable
    private final String idType;
    @SerializedName("isIdentical")
    @Nullable
    private final String isIdentical;
    @SerializedName("operatorCode")
    @Nullable
    private final String operatorCode;
    @SerializedName("operatorDesc")
    @Nullable
    private final String operatorDesc;
    @SerializedName("packageCode")
    @Nullable
    private final String packageCode;
    @SerializedName("partnerCode")
    @Nullable
    private final String partnerCode;
    @SerializedName("priceplanRc")
    @Nullable
    private final String priceplanRc;
    @SerializedName("productIdNumber")
    @Nullable
    private final String productIdNumber;
    @SerializedName("productName")
    @Nullable
    private final String productName;
    @SerializedName("propoPromo")
    @Nullable
    private final String propoPromo;
    @SerializedName("readCard")
    @Nullable
    private final String readCard;
    @SerializedName("saleCode")
    @Nullable
    private final String saleCode;
    @SerializedName("serialNumber")
    @Nullable
    private final String serialNumber;
    @SerializedName("serviceCode")
    @Nullable
    private final String serviceCode;
    @SerializedName("serviceName")
    @Nullable
    private final String serviceName;

    public SummitOrderData() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, ViewCompat.MEASURED_SIZE_MASK, null);
    }

    @Nullable
    public final String component1() {
        return this.packageCode;
    }

    @Nullable
    public final String component10() {
        return this.propoPromo;
    }

    @Nullable
    public final String component11() {
        return this.priceplanRc;
    }

    @Nullable
    public final String component12() {
        return this.readCard;
    }

    @Nullable
    public final String component13() {
        return this.saleCode;
    }

    @Nullable
    public final String component14() {
        return this.serialNumber;
    }

    @Nullable
    public final String component15() {
        return this.serviceCode;
    }

    @Nullable
    public final String component16() {
        return this.serviceName;
    }

    @Nullable
    public final String component17() {
        return this.consentId;
    }

    @Nullable
    public final String component18() {
        return this.faceRecogStatus;
    }

    @Nullable
    public final String component19() {
        return this.isIdentical;
    }

    @Nullable
    public final String component2() {
        return this.custName;
    }

    @Nullable
    public final String component20() {
        return this.confidentRatio;
    }

    @Nullable
    public final String component21() {
        return this.faceCustCert;
    }

    @Nullable
    public final String component22() {
        return this.approver;
    }

    @Nullable
    public final String component23() {
        return this.operatorCode;
    }

    @Nullable
    public final String component24() {
        return this.operatorDesc;
    }

    @Nullable
    public final String component3() {
        return this.gender;
    }

    @Nullable
    public final String component4() {
        return this.eSign;
    }

    @Nullable
    public final String component5() {
        return this.idNumber;
    }

    @Nullable
    public final String component6() {
        return this.idType;
    }

    @Nullable
    public final String component7() {
        return this.partnerCode;
    }

    @Nullable
    public final String component8() {
        return this.productIdNumber;
    }

    @Nullable
    public final String component9() {
        return this.productName;
    }

    @NotNull
    public final SummitOrderData copy(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable String str6, @Nullable String str7, @Nullable String str8, @Nullable String str9, @Nullable String str10, @Nullable String str11, @Nullable String str12, @Nullable String str13, @Nullable String str14, @Nullable String str15, @Nullable String str16, @Nullable String str17, @Nullable String str18, @Nullable String str19, @Nullable String str20, @Nullable String str21, @Nullable String str22, @Nullable String str23, @Nullable String str24) {
        return new SummitOrderData(str, str2, str3, str4, str5, str6, str7, str8, str9, str10, str11, str12, str13, str14, str15, str16, str17, str18, str19, str20, str21, str22, str23, str24);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof SummitOrderData) {
            SummitOrderData summitOrderData = (SummitOrderData) obj;
            return Intrinsics.areEqual(this.packageCode, summitOrderData.packageCode) && Intrinsics.areEqual(this.custName, summitOrderData.custName) && Intrinsics.areEqual(this.gender, summitOrderData.gender) && Intrinsics.areEqual(this.eSign, summitOrderData.eSign) && Intrinsics.areEqual(this.idNumber, summitOrderData.idNumber) && Intrinsics.areEqual(this.idType, summitOrderData.idType) && Intrinsics.areEqual(this.partnerCode, summitOrderData.partnerCode) && Intrinsics.areEqual(this.productIdNumber, summitOrderData.productIdNumber) && Intrinsics.areEqual(this.productName, summitOrderData.productName) && Intrinsics.areEqual(this.propoPromo, summitOrderData.propoPromo) && Intrinsics.areEqual(this.priceplanRc, summitOrderData.priceplanRc) && Intrinsics.areEqual(this.readCard, summitOrderData.readCard) && Intrinsics.areEqual(this.saleCode, summitOrderData.saleCode) && Intrinsics.areEqual(this.serialNumber, summitOrderData.serialNumber) && Intrinsics.areEqual(this.serviceCode, summitOrderData.serviceCode) && Intrinsics.areEqual(this.serviceName, summitOrderData.serviceName) && Intrinsics.areEqual(this.consentId, summitOrderData.consentId) && Intrinsics.areEqual(this.faceRecogStatus, summitOrderData.faceRecogStatus) && Intrinsics.areEqual(this.isIdentical, summitOrderData.isIdentical) && Intrinsics.areEqual(this.confidentRatio, summitOrderData.confidentRatio) && Intrinsics.areEqual(this.faceCustCert, summitOrderData.faceCustCert) && Intrinsics.areEqual(this.approver, summitOrderData.approver) && Intrinsics.areEqual(this.operatorCode, summitOrderData.operatorCode) && Intrinsics.areEqual(this.operatorDesc, summitOrderData.operatorDesc);
        }
        return false;
    }

    @Nullable
    public final String getApprover() {
        return this.approver;
    }

    @Nullable
    public final String getConfidentRatio() {
        return this.confidentRatio;
    }

    @Nullable
    public final String getConsentId() {
        return this.consentId;
    }

    @Nullable
    public final String getCustName() {
        return this.custName;
    }

    @Nullable
    public final String getESign() {
        return this.eSign;
    }

    @Nullable
    public final String getFaceCustCert() {
        return this.faceCustCert;
    }

    @Nullable
    public final String getFaceRecogStatus() {
        return this.faceRecogStatus;
    }

    @Nullable
    public final String getGender() {
        return this.gender;
    }

    @Nullable
    public final String getIdNumber() {
        return this.idNumber;
    }

    @Nullable
    public final String getIdType() {
        return this.idType;
    }

    @Nullable
    public final String getOperatorCode() {
        return this.operatorCode;
    }

    @Nullable
    public final String getOperatorDesc() {
        return this.operatorDesc;
    }

    @Nullable
    public final String getPackageCode() {
        return this.packageCode;
    }

    @Nullable
    public final String getPartnerCode() {
        return this.partnerCode;
    }

    @Nullable
    public final String getPriceplanRc() {
        return this.priceplanRc;
    }

    @Nullable
    public final String getProductIdNumber() {
        return this.productIdNumber;
    }

    @Nullable
    public final String getProductName() {
        return this.productName;
    }

    @Nullable
    public final String getPropoPromo() {
        return this.propoPromo;
    }

    @Nullable
    public final String getReadCard() {
        return this.readCard;
    }

    @Nullable
    public final String getSaleCode() {
        return this.saleCode;
    }

    @Nullable
    public final String getSerialNumber() {
        return this.serialNumber;
    }

    @Nullable
    public final String getServiceCode() {
        return this.serviceCode;
    }

    @Nullable
    public final String getServiceName() {
        return this.serviceName;
    }

    public int hashCode() {
        String str = this.packageCode;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.custName;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.gender;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.eSign;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.idNumber;
        int hashCode5 = (hashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.idType;
        int hashCode6 = (hashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.partnerCode;
        int hashCode7 = (hashCode6 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.productIdNumber;
        int hashCode8 = (hashCode7 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.productName;
        int hashCode9 = (hashCode8 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.propoPromo;
        int hashCode10 = (hashCode9 + (str10 == null ? 0 : str10.hashCode())) * 31;
        String str11 = this.priceplanRc;
        int hashCode11 = (hashCode10 + (str11 == null ? 0 : str11.hashCode())) * 31;
        String str12 = this.readCard;
        int hashCode12 = (hashCode11 + (str12 == null ? 0 : str12.hashCode())) * 31;
        String str13 = this.saleCode;
        int hashCode13 = (hashCode12 + (str13 == null ? 0 : str13.hashCode())) * 31;
        String str14 = this.serialNumber;
        int hashCode14 = (hashCode13 + (str14 == null ? 0 : str14.hashCode())) * 31;
        String str15 = this.serviceCode;
        int hashCode15 = (hashCode14 + (str15 == null ? 0 : str15.hashCode())) * 31;
        String str16 = this.serviceName;
        int hashCode16 = (hashCode15 + (str16 == null ? 0 : str16.hashCode())) * 31;
        String str17 = this.consentId;
        int hashCode17 = (hashCode16 + (str17 == null ? 0 : str17.hashCode())) * 31;
        String str18 = this.faceRecogStatus;
        int hashCode18 = (hashCode17 + (str18 == null ? 0 : str18.hashCode())) * 31;
        String str19 = this.isIdentical;
        int hashCode19 = (hashCode18 + (str19 == null ? 0 : str19.hashCode())) * 31;
        String str20 = this.confidentRatio;
        int hashCode20 = (hashCode19 + (str20 == null ? 0 : str20.hashCode())) * 31;
        String str21 = this.faceCustCert;
        int hashCode21 = (hashCode20 + (str21 == null ? 0 : str21.hashCode())) * 31;
        String str22 = this.approver;
        int hashCode22 = (hashCode21 + (str22 == null ? 0 : str22.hashCode())) * 31;
        String str23 = this.operatorCode;
        int hashCode23 = (hashCode22 + (str23 == null ? 0 : str23.hashCode())) * 31;
        String str24 = this.operatorDesc;
        return hashCode23 + (str24 != null ? str24.hashCode() : 0);
    }

    @Nullable
    public final String isIdentical() {
        return this.isIdentical;
    }

    @NotNull
    public String toString() {
        String str = this.packageCode;
        String str2 = this.custName;
        String str3 = this.gender;
        String str4 = this.eSign;
        String str5 = this.idNumber;
        String str6 = this.idType;
        String str7 = this.partnerCode;
        String str8 = this.productIdNumber;
        String str9 = this.productName;
        String str10 = this.propoPromo;
        String str11 = this.priceplanRc;
        String str12 = this.readCard;
        String str13 = this.saleCode;
        String str14 = this.serialNumber;
        String str15 = this.serviceCode;
        String str16 = this.serviceName;
        String str17 = this.consentId;
        String str18 = this.faceRecogStatus;
        String str19 = this.isIdentical;
        String str20 = this.confidentRatio;
        String str21 = this.faceCustCert;
        String str22 = this.approver;
        String str23 = this.operatorCode;
        String str24 = this.operatorDesc;
        return "SummitOrderData(packageCode=" + str + ", custName=" + str2 + ", gender=" + str3 + ", eSign=" + str4 + ", idNumber=" + str5 + ", idType=" + str6 + ", partnerCode=" + str7 + ", productIdNumber=" + str8 + ", productName=" + str9 + ", propoPromo=" + str10 + ", priceplanRc=" + str11 + ", readCard=" + str12 + ", saleCode=" + str13 + ", serialNumber=" + str14 + ", serviceCode=" + str15 + ", serviceName=" + str16 + ", consentId=" + str17 + ", faceRecogStatus=" + str18 + ", isIdentical=" + str19 + ", confidentRatio=" + str20 + ", faceCustCert=" + str21 + ", approver=" + str22 + ", operatorCode=" + str23 + ", operatorDesc=" + str24 + ")";
    }

    public SummitOrderData(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable String str6, @Nullable String str7, @Nullable String str8, @Nullable String str9, @Nullable String str10, @Nullable String str11, @Nullable String str12, @Nullable String str13, @Nullable String str14, @Nullable String str15, @Nullable String str16, @Nullable String str17, @Nullable String str18, @Nullable String str19, @Nullable String str20, @Nullable String str21, @Nullable String str22, @Nullable String str23, @Nullable String str24) {
        this.packageCode = str;
        this.custName = str2;
        this.gender = str3;
        this.eSign = str4;
        this.idNumber = str5;
        this.idType = str6;
        this.partnerCode = str7;
        this.productIdNumber = str8;
        this.productName = str9;
        this.propoPromo = str10;
        this.priceplanRc = str11;
        this.readCard = str12;
        this.saleCode = str13;
        this.serialNumber = str14;
        this.serviceCode = str15;
        this.serviceName = str16;
        this.consentId = str17;
        this.faceRecogStatus = str18;
        this.isIdentical = str19;
        this.confidentRatio = str20;
        this.faceCustCert = str21;
        this.approver = str22;
        this.operatorCode = str23;
        this.operatorDesc = str24;
    }

    public /* synthetic */ SummitOrderData(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, String str18, String str19, String str20, String str21, String str22, String str23, String str24, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : str5, (i & 32) != 0 ? null : str6, (i & 64) != 0 ? null : str7, (i & 128) != 0 ? null : str8, (i & 256) != 0 ? null : str9, (i & 512) != 0 ? null : str10, (i & 1024) != 0 ? null : str11, (i & 2048) != 0 ? null : str12, (i & 4096) != 0 ? null : str13, (i & 8192) != 0 ? null : str14, (i & 16384) != 0 ? null : str15, (i & 32768) != 0 ? null : str16, (i & 65536) != 0 ? null : str17, (i & 131072) != 0 ? null : str18, (i & 262144) != 0 ? null : str19, (i & 524288) != 0 ? null : str20, (i & 1048576) != 0 ? null : str21, (i & 2097152) != 0 ? null : str22, (i & 4194304) != 0 ? null : str23, (i & 8388608) != 0 ? null : str24);
    }
}
