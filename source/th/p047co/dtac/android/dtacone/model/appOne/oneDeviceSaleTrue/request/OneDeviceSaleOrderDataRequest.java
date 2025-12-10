package th.p047co.dtac.android.dtacone.model.appOne.oneDeviceSaleTrue.request;

import androidx.autofill.HintConstants;
import androidx.compose.runtime.internal.StabilityInferred;
import com.google.api.client.googleapis.media.MediaHttpDownloader;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 0)
@Metadata(m28851d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\bO\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B½\u0002\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u001fJ\u000b\u0010=\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010>\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010?\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010@\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010A\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010B\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010C\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0002\u0010*J\u000b\u0010D\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010E\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010F\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010G\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010H\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010I\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010J\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010K\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010L\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010M\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010N\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010O\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010P\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010Q\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010R\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010S\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010T\u001a\u0004\u0018\u00010\nHÆ\u0003J\u0010\u0010U\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0002\u0010*J\u000b\u0010V\u001a\u0004\u0018\u00010\u0003HÆ\u0003JÆ\u0002\u0010W\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010XJ\u0013\u0010Y\u001a\u00020\f2\b\u0010Z\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010[\u001a\u00020\\HÖ\u0001J\t\u0010]\u001a\u00020\u0003HÖ\u0001R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b \u0010!R\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010!R\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b#\u0010!R\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b$\u0010!R\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b%\u0010!R\u0018\u0010\b\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b&\u0010!R\u0018\u0010\t\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b'\u0010(R\u001a\u0010\u000b\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010+\u001a\u0004\b)\u0010*R\u0018\u0010\r\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b,\u0010!R\u0018\u0010\u000e\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b-\u0010!R\u0018\u0010\u000f\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b.\u0010!R\u0018\u0010\u0010\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b/\u0010!R\u0018\u0010\u0011\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b0\u0010!R\u0018\u0010\u0012\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b1\u0010!R\u001a\u0010\u0013\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010+\u001a\u0004\b\u0013\u0010*R\u0018\u0010\u0014\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b2\u0010!R\u0018\u0010\u0015\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b3\u0010!R\u0018\u0010\u0016\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b4\u0010!R\u0018\u0010\u0017\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b5\u0010!R\u0018\u0010\u0018\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b6\u0010!R\u0018\u0010\u0019\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b7\u0010!R\u0018\u0010\u001b\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b8\u0010!R\u0018\u0010\u001c\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b9\u0010!R\u0018\u0010\u001a\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b:\u0010!R\u0018\u0010\u001d\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b;\u0010!R\u0018\u0010\u001e\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b<\u0010!¨\u0006^"}, m28850d2 = {"Lth/co/dtac/android/dtacone/model/appOne/oneDeviceSaleTrue/request/OneDeviceSaleOrderDataRequest;", "", "approver", "", "campaignCode", "campaignName", "confidentRatio", "consentId", "custName", "device", "Lth/co/dtac/android/dtacone/model/appOne/oneDeviceSaleTrue/request/OneDeviceSaleDeviceDataRequest;", "deviceFlag", "", "eSign", "faceCustCert", "faceRecogStatus", HintConstants.AUTOFILL_HINT_GENDER, "idNumber", "idType", "isIdentical", "packageCode", "partnerCode", "priceplanRc", "productIdNumber", "productName", "propoPromo", "serialNumber", "readCard", "saleCode", "serviceCode", "serviceName", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lth/co/dtac/android/dtacone/model/appOne/oneDeviceSaleTrue/request/OneDeviceSaleDeviceDataRequest;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getApprover", "()Ljava/lang/String;", "getCampaignCode", "getCampaignName", "getConfidentRatio", "getConsentId", "getCustName", "getDevice", "()Lth/co/dtac/android/dtacone/model/appOne/oneDeviceSaleTrue/request/OneDeviceSaleDeviceDataRequest;", "getDeviceFlag", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getESign", "getFaceCustCert", "getFaceRecogStatus", "getGender", "getIdNumber", "getIdType", "getPackageCode", "getPartnerCode", "getPriceplanRc", "getProductIdNumber", "getProductName", "getPropoPromo", "getReadCard", "getSaleCode", "getSerialNumber", "getServiceCode", "getServiceName", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component2", "component20", "component21", "component22", "component23", "component24", "component25", "component26", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lth/co/dtac/android/dtacone/model/appOne/oneDeviceSaleTrue/request/OneDeviceSaleDeviceDataRequest;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lth/co/dtac/android/dtacone/model/appOne/oneDeviceSaleTrue/request/OneDeviceSaleOrderDataRequest;", "equals", "other", "hashCode", "", "toString", "app_prodRelease"}, m28849k = 1, m28848mv = {1, 8, 0}, m28846xi = 48)
/* renamed from: th.co.dtac.android.dtacone.model.appOne.oneDeviceSaleTrue.request.OneDeviceSaleOrderDataRequest */
/* loaded from: classes8.dex */
public final class OneDeviceSaleOrderDataRequest {
    public static final int $stable = 0;
    @SerializedName("approver")
    @Nullable
    private final String approver;
    @SerializedName("campaignCode")
    @Nullable
    private final String campaignCode;
    @SerializedName("campaignName")
    @Nullable
    private final String campaignName;
    @SerializedName("confidentRatio")
    @Nullable
    private final String confidentRatio;
    @SerializedName("consentId")
    @Nullable
    private final String consentId;
    @SerializedName("custName")
    @Nullable
    private final String custName;
    @SerializedName("device")
    @Nullable

    /* renamed from: device  reason: collision with root package name */
    private final OneDeviceSaleDeviceDataRequest f109517device;
    @SerializedName("deviceFlag")
    @Nullable
    private final Boolean deviceFlag;
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
    private final Boolean isIdentical;
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

    public OneDeviceSaleOrderDataRequest() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 67108863, null);
    }

    @Nullable
    public final String component1() {
        return this.approver;
    }

    @Nullable
    public final String component10() {
        return this.faceCustCert;
    }

    @Nullable
    public final String component11() {
        return this.faceRecogStatus;
    }

    @Nullable
    public final String component12() {
        return this.gender;
    }

    @Nullable
    public final String component13() {
        return this.idNumber;
    }

    @Nullable
    public final String component14() {
        return this.idType;
    }

    @Nullable
    public final Boolean component15() {
        return this.isIdentical;
    }

    @Nullable
    public final String component16() {
        return this.packageCode;
    }

    @Nullable
    public final String component17() {
        return this.partnerCode;
    }

    @Nullable
    public final String component18() {
        return this.priceplanRc;
    }

    @Nullable
    public final String component19() {
        return this.productIdNumber;
    }

    @Nullable
    public final String component2() {
        return this.campaignCode;
    }

    @Nullable
    public final String component20() {
        return this.productName;
    }

    @Nullable
    public final String component21() {
        return this.propoPromo;
    }

    @Nullable
    public final String component22() {
        return this.serialNumber;
    }

    @Nullable
    public final String component23() {
        return this.readCard;
    }

    @Nullable
    public final String component24() {
        return this.saleCode;
    }

    @Nullable
    public final String component25() {
        return this.serviceCode;
    }

    @Nullable
    public final String component26() {
        return this.serviceName;
    }

    @Nullable
    public final String component3() {
        return this.campaignName;
    }

    @Nullable
    public final String component4() {
        return this.confidentRatio;
    }

    @Nullable
    public final String component5() {
        return this.consentId;
    }

    @Nullable
    public final String component6() {
        return this.custName;
    }

    @Nullable
    public final OneDeviceSaleDeviceDataRequest component7() {
        return this.f109517device;
    }

    @Nullable
    public final Boolean component8() {
        return this.deviceFlag;
    }

    @Nullable
    public final String component9() {
        return this.eSign;
    }

    @NotNull
    public final OneDeviceSaleOrderDataRequest copy(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable String str6, @Nullable OneDeviceSaleDeviceDataRequest oneDeviceSaleDeviceDataRequest, @Nullable Boolean bool, @Nullable String str7, @Nullable String str8, @Nullable String str9, @Nullable String str10, @Nullable String str11, @Nullable String str12, @Nullable Boolean bool2, @Nullable String str13, @Nullable String str14, @Nullable String str15, @Nullable String str16, @Nullable String str17, @Nullable String str18, @Nullable String str19, @Nullable String str20, @Nullable String str21, @Nullable String str22, @Nullable String str23) {
        return new OneDeviceSaleOrderDataRequest(str, str2, str3, str4, str5, str6, oneDeviceSaleDeviceDataRequest, bool, str7, str8, str9, str10, str11, str12, bool2, str13, str14, str15, str16, str17, str18, str19, str20, str21, str22, str23);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof OneDeviceSaleOrderDataRequest) {
            OneDeviceSaleOrderDataRequest oneDeviceSaleOrderDataRequest = (OneDeviceSaleOrderDataRequest) obj;
            return Intrinsics.areEqual(this.approver, oneDeviceSaleOrderDataRequest.approver) && Intrinsics.areEqual(this.campaignCode, oneDeviceSaleOrderDataRequest.campaignCode) && Intrinsics.areEqual(this.campaignName, oneDeviceSaleOrderDataRequest.campaignName) && Intrinsics.areEqual(this.confidentRatio, oneDeviceSaleOrderDataRequest.confidentRatio) && Intrinsics.areEqual(this.consentId, oneDeviceSaleOrderDataRequest.consentId) && Intrinsics.areEqual(this.custName, oneDeviceSaleOrderDataRequest.custName) && Intrinsics.areEqual(this.f109517device, oneDeviceSaleOrderDataRequest.f109517device) && Intrinsics.areEqual(this.deviceFlag, oneDeviceSaleOrderDataRequest.deviceFlag) && Intrinsics.areEqual(this.eSign, oneDeviceSaleOrderDataRequest.eSign) && Intrinsics.areEqual(this.faceCustCert, oneDeviceSaleOrderDataRequest.faceCustCert) && Intrinsics.areEqual(this.faceRecogStatus, oneDeviceSaleOrderDataRequest.faceRecogStatus) && Intrinsics.areEqual(this.gender, oneDeviceSaleOrderDataRequest.gender) && Intrinsics.areEqual(this.idNumber, oneDeviceSaleOrderDataRequest.idNumber) && Intrinsics.areEqual(this.idType, oneDeviceSaleOrderDataRequest.idType) && Intrinsics.areEqual(this.isIdentical, oneDeviceSaleOrderDataRequest.isIdentical) && Intrinsics.areEqual(this.packageCode, oneDeviceSaleOrderDataRequest.packageCode) && Intrinsics.areEqual(this.partnerCode, oneDeviceSaleOrderDataRequest.partnerCode) && Intrinsics.areEqual(this.priceplanRc, oneDeviceSaleOrderDataRequest.priceplanRc) && Intrinsics.areEqual(this.productIdNumber, oneDeviceSaleOrderDataRequest.productIdNumber) && Intrinsics.areEqual(this.productName, oneDeviceSaleOrderDataRequest.productName) && Intrinsics.areEqual(this.propoPromo, oneDeviceSaleOrderDataRequest.propoPromo) && Intrinsics.areEqual(this.serialNumber, oneDeviceSaleOrderDataRequest.serialNumber) && Intrinsics.areEqual(this.readCard, oneDeviceSaleOrderDataRequest.readCard) && Intrinsics.areEqual(this.saleCode, oneDeviceSaleOrderDataRequest.saleCode) && Intrinsics.areEqual(this.serviceCode, oneDeviceSaleOrderDataRequest.serviceCode) && Intrinsics.areEqual(this.serviceName, oneDeviceSaleOrderDataRequest.serviceName);
        }
        return false;
    }

    @Nullable
    public final String getApprover() {
        return this.approver;
    }

    @Nullable
    public final String getCampaignCode() {
        return this.campaignCode;
    }

    @Nullable
    public final String getCampaignName() {
        return this.campaignName;
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
    public final OneDeviceSaleDeviceDataRequest getDevice() {
        return this.f109517device;
    }

    @Nullable
    public final Boolean getDeviceFlag() {
        return this.deviceFlag;
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
        String str = this.approver;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.campaignCode;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.campaignName;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.confidentRatio;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.consentId;
        int hashCode5 = (hashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.custName;
        int hashCode6 = (hashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
        OneDeviceSaleDeviceDataRequest oneDeviceSaleDeviceDataRequest = this.f109517device;
        int hashCode7 = (hashCode6 + (oneDeviceSaleDeviceDataRequest == null ? 0 : oneDeviceSaleDeviceDataRequest.hashCode())) * 31;
        Boolean bool = this.deviceFlag;
        int hashCode8 = (hashCode7 + (bool == null ? 0 : bool.hashCode())) * 31;
        String str7 = this.eSign;
        int hashCode9 = (hashCode8 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.faceCustCert;
        int hashCode10 = (hashCode9 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.faceRecogStatus;
        int hashCode11 = (hashCode10 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.gender;
        int hashCode12 = (hashCode11 + (str10 == null ? 0 : str10.hashCode())) * 31;
        String str11 = this.idNumber;
        int hashCode13 = (hashCode12 + (str11 == null ? 0 : str11.hashCode())) * 31;
        String str12 = this.idType;
        int hashCode14 = (hashCode13 + (str12 == null ? 0 : str12.hashCode())) * 31;
        Boolean bool2 = this.isIdentical;
        int hashCode15 = (hashCode14 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        String str13 = this.packageCode;
        int hashCode16 = (hashCode15 + (str13 == null ? 0 : str13.hashCode())) * 31;
        String str14 = this.partnerCode;
        int hashCode17 = (hashCode16 + (str14 == null ? 0 : str14.hashCode())) * 31;
        String str15 = this.priceplanRc;
        int hashCode18 = (hashCode17 + (str15 == null ? 0 : str15.hashCode())) * 31;
        String str16 = this.productIdNumber;
        int hashCode19 = (hashCode18 + (str16 == null ? 0 : str16.hashCode())) * 31;
        String str17 = this.productName;
        int hashCode20 = (hashCode19 + (str17 == null ? 0 : str17.hashCode())) * 31;
        String str18 = this.propoPromo;
        int hashCode21 = (hashCode20 + (str18 == null ? 0 : str18.hashCode())) * 31;
        String str19 = this.serialNumber;
        int hashCode22 = (hashCode21 + (str19 == null ? 0 : str19.hashCode())) * 31;
        String str20 = this.readCard;
        int hashCode23 = (hashCode22 + (str20 == null ? 0 : str20.hashCode())) * 31;
        String str21 = this.saleCode;
        int hashCode24 = (hashCode23 + (str21 == null ? 0 : str21.hashCode())) * 31;
        String str22 = this.serviceCode;
        int hashCode25 = (hashCode24 + (str22 == null ? 0 : str22.hashCode())) * 31;
        String str23 = this.serviceName;
        return hashCode25 + (str23 != null ? str23.hashCode() : 0);
    }

    @Nullable
    public final Boolean isIdentical() {
        return this.isIdentical;
    }

    @NotNull
    public String toString() {
        String str = this.approver;
        String str2 = this.campaignCode;
        String str3 = this.campaignName;
        String str4 = this.confidentRatio;
        String str5 = this.consentId;
        String str6 = this.custName;
        OneDeviceSaleDeviceDataRequest oneDeviceSaleDeviceDataRequest = this.f109517device;
        Boolean bool = this.deviceFlag;
        String str7 = this.eSign;
        String str8 = this.faceCustCert;
        String str9 = this.faceRecogStatus;
        String str10 = this.gender;
        String str11 = this.idNumber;
        String str12 = this.idType;
        Boolean bool2 = this.isIdentical;
        String str13 = this.packageCode;
        String str14 = this.partnerCode;
        String str15 = this.priceplanRc;
        String str16 = this.productIdNumber;
        String str17 = this.productName;
        String str18 = this.propoPromo;
        String str19 = this.serialNumber;
        String str20 = this.readCard;
        String str21 = this.saleCode;
        String str22 = this.serviceCode;
        String str23 = this.serviceName;
        return "OneDeviceSaleOrderDataRequest(approver=" + str + ", campaignCode=" + str2 + ", campaignName=" + str3 + ", confidentRatio=" + str4 + ", consentId=" + str5 + ", custName=" + str6 + ", device=" + oneDeviceSaleDeviceDataRequest + ", deviceFlag=" + bool + ", eSign=" + str7 + ", faceCustCert=" + str8 + ", faceRecogStatus=" + str9 + ", gender=" + str10 + ", idNumber=" + str11 + ", idType=" + str12 + ", isIdentical=" + bool2 + ", packageCode=" + str13 + ", partnerCode=" + str14 + ", priceplanRc=" + str15 + ", productIdNumber=" + str16 + ", productName=" + str17 + ", propoPromo=" + str18 + ", serialNumber=" + str19 + ", readCard=" + str20 + ", saleCode=" + str21 + ", serviceCode=" + str22 + ", serviceName=" + str23 + ")";
    }

    public OneDeviceSaleOrderDataRequest(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable String str6, @Nullable OneDeviceSaleDeviceDataRequest oneDeviceSaleDeviceDataRequest, @Nullable Boolean bool, @Nullable String str7, @Nullable String str8, @Nullable String str9, @Nullable String str10, @Nullable String str11, @Nullable String str12, @Nullable Boolean bool2, @Nullable String str13, @Nullable String str14, @Nullable String str15, @Nullable String str16, @Nullable String str17, @Nullable String str18, @Nullable String str19, @Nullable String str20, @Nullable String str21, @Nullable String str22, @Nullable String str23) {
        this.approver = str;
        this.campaignCode = str2;
        this.campaignName = str3;
        this.confidentRatio = str4;
        this.consentId = str5;
        this.custName = str6;
        this.f109517device = oneDeviceSaleDeviceDataRequest;
        this.deviceFlag = bool;
        this.eSign = str7;
        this.faceCustCert = str8;
        this.faceRecogStatus = str9;
        this.gender = str10;
        this.idNumber = str11;
        this.idType = str12;
        this.isIdentical = bool2;
        this.packageCode = str13;
        this.partnerCode = str14;
        this.priceplanRc = str15;
        this.productIdNumber = str16;
        this.productName = str17;
        this.propoPromo = str18;
        this.serialNumber = str19;
        this.readCard = str20;
        this.saleCode = str21;
        this.serviceCode = str22;
        this.serviceName = str23;
    }

    public /* synthetic */ OneDeviceSaleOrderDataRequest(String str, String str2, String str3, String str4, String str5, String str6, OneDeviceSaleDeviceDataRequest oneDeviceSaleDeviceDataRequest, Boolean bool, String str7, String str8, String str9, String str10, String str11, String str12, Boolean bool2, String str13, String str14, String str15, String str16, String str17, String str18, String str19, String str20, String str21, String str22, String str23, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : str5, (i & 32) != 0 ? null : str6, (i & 64) != 0 ? null : oneDeviceSaleDeviceDataRequest, (i & 128) != 0 ? Boolean.FALSE : bool, (i & 256) != 0 ? null : str7, (i & 512) != 0 ? null : str8, (i & 1024) != 0 ? null : str9, (i & 2048) != 0 ? null : str10, (i & 4096) != 0 ? null : str11, (i & 8192) != 0 ? null : str12, (i & 16384) != 0 ? Boolean.FALSE : bool2, (i & 32768) != 0 ? null : str13, (i & 65536) != 0 ? null : str14, (i & 131072) != 0 ? null : str15, (i & 262144) != 0 ? null : str16, (i & 524288) != 0 ? null : str17, (i & 1048576) != 0 ? null : str18, (i & 2097152) != 0 ? null : str19, (i & 4194304) != 0 ? null : str20, (i & 8388608) != 0 ? null : str21, (i & 16777216) != 0 ? null : str22, (i & MediaHttpDownloader.MAXIMUM_CHUNK_SIZE) != 0 ? null : str23);
    }
}
