package th.p047co.dtac.android.dtacone.model.appOne.tol.installation;

import androidx.compose.runtime.internal.StabilityInferred;
import com.google.gson.annotations.SerializedName;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 0)
@Metadata(m28851d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BQ\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u0006\u0012\u0006\u0010\u000b\u001a\u00020\u0003\u0012\u0006\u0010\f\u001a\u00020\u0003\u0012\u0006\u0010\r\u001a\u00020\u0003¢\u0006\u0002\u0010\u000eJ\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\n0\u0006HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001f\u001a\u00020\u0003HÆ\u0003J\t\u0010 \u001a\u00020\u0003HÆ\u0003Je\u0010!\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\b\b\u0002\u0010\b\u001a\u00020\u00032\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u00062\b\b\u0002\u0010\u000b\u001a\u00020\u00032\b\b\u0002\u0010\f\u001a\u00020\u00032\b\b\u0002\u0010\r\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\"\u001a\u00020#2\b\u0010$\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010%\u001a\u00020&HÖ\u0001J\t\u0010'\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\b\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u001c\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0010R\u001c\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0012R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0010R\u0016\u0010\u000b\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0010R\u0016\u0010\f\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0010R\u0016\u0010\r\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0010¨\u0006("}, m28850d2 = {"Lth/co/dtac/android/dtacone/model/appOne/tol/installation/AppointmentRequest;", "", "custId", "", "addrId", "changeService", "", "Lth/co/dtac/android/dtacone/model/appOne/tol/installation/AppointmentChangeService;", "accessMode", "additionalDeviceList", "Lth/co/dtac/android/dtacone/model/appOne/tol/installation/AppointmentDeviceItem;", "installationDate", "prodSpecCode", "saleCode", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getAccessMode", "()Ljava/lang/String;", "getAdditionalDeviceList", "()Ljava/util/List;", "getAddrId", "getChangeService", "getCustId", "getInstallationDate", "getProdSpecCode", "getSaleCode", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "equals", "", "other", "hashCode", "", "toString", "app_prodRelease"}, m28849k = 1, m28848mv = {1, 8, 0}, m28846xi = 48)
/* renamed from: th.co.dtac.android.dtacone.model.appOne.tol.installation.AppointmentRequest */
/* loaded from: classes8.dex */
public final class AppointmentRequest {
    public static final int $stable = 8;
    @SerializedName("accessMode")
    @NotNull
    private final String accessMode;
    @SerializedName("additionalDeviceList")
    @NotNull
    private final List<AppointmentDeviceItem> additionalDeviceList;
    @SerializedName("addrId")
    @NotNull
    private final String addrId;
    @SerializedName("changeService")
    @NotNull
    private final List<AppointmentChangeService> changeService;
    @SerializedName("custId")
    @NotNull
    private final String custId;
    @SerializedName("installationDate")
    @NotNull
    private final String installationDate;
    @SerializedName("prodSpecCode")
    @NotNull
    private final String prodSpecCode;
    @SerializedName("saleCode")
    @NotNull
    private final String saleCode;

    public AppointmentRequest(@NotNull String custId, @NotNull String addrId, @NotNull List<AppointmentChangeService> changeService, @NotNull String accessMode, @NotNull List<AppointmentDeviceItem> additionalDeviceList, @NotNull String installationDate, @NotNull String prodSpecCode, @NotNull String saleCode) {
        Intrinsics.checkNotNullParameter(custId, "custId");
        Intrinsics.checkNotNullParameter(addrId, "addrId");
        Intrinsics.checkNotNullParameter(changeService, "changeService");
        Intrinsics.checkNotNullParameter(accessMode, "accessMode");
        Intrinsics.checkNotNullParameter(additionalDeviceList, "additionalDeviceList");
        Intrinsics.checkNotNullParameter(installationDate, "installationDate");
        Intrinsics.checkNotNullParameter(prodSpecCode, "prodSpecCode");
        Intrinsics.checkNotNullParameter(saleCode, "saleCode");
        this.custId = custId;
        this.addrId = addrId;
        this.changeService = changeService;
        this.accessMode = accessMode;
        this.additionalDeviceList = additionalDeviceList;
        this.installationDate = installationDate;
        this.prodSpecCode = prodSpecCode;
        this.saleCode = saleCode;
    }

    @NotNull
    public final String component1() {
        return this.custId;
    }

    @NotNull
    public final String component2() {
        return this.addrId;
    }

    @NotNull
    public final List<AppointmentChangeService> component3() {
        return this.changeService;
    }

    @NotNull
    public final String component4() {
        return this.accessMode;
    }

    @NotNull
    public final List<AppointmentDeviceItem> component5() {
        return this.additionalDeviceList;
    }

    @NotNull
    public final String component6() {
        return this.installationDate;
    }

    @NotNull
    public final String component7() {
        return this.prodSpecCode;
    }

    @NotNull
    public final String component8() {
        return this.saleCode;
    }

    @NotNull
    public final AppointmentRequest copy(@NotNull String custId, @NotNull String addrId, @NotNull List<AppointmentChangeService> changeService, @NotNull String accessMode, @NotNull List<AppointmentDeviceItem> additionalDeviceList, @NotNull String installationDate, @NotNull String prodSpecCode, @NotNull String saleCode) {
        Intrinsics.checkNotNullParameter(custId, "custId");
        Intrinsics.checkNotNullParameter(addrId, "addrId");
        Intrinsics.checkNotNullParameter(changeService, "changeService");
        Intrinsics.checkNotNullParameter(accessMode, "accessMode");
        Intrinsics.checkNotNullParameter(additionalDeviceList, "additionalDeviceList");
        Intrinsics.checkNotNullParameter(installationDate, "installationDate");
        Intrinsics.checkNotNullParameter(prodSpecCode, "prodSpecCode");
        Intrinsics.checkNotNullParameter(saleCode, "saleCode");
        return new AppointmentRequest(custId, addrId, changeService, accessMode, additionalDeviceList, installationDate, prodSpecCode, saleCode);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof AppointmentRequest) {
            AppointmentRequest appointmentRequest = (AppointmentRequest) obj;
            return Intrinsics.areEqual(this.custId, appointmentRequest.custId) && Intrinsics.areEqual(this.addrId, appointmentRequest.addrId) && Intrinsics.areEqual(this.changeService, appointmentRequest.changeService) && Intrinsics.areEqual(this.accessMode, appointmentRequest.accessMode) && Intrinsics.areEqual(this.additionalDeviceList, appointmentRequest.additionalDeviceList) && Intrinsics.areEqual(this.installationDate, appointmentRequest.installationDate) && Intrinsics.areEqual(this.prodSpecCode, appointmentRequest.prodSpecCode) && Intrinsics.areEqual(this.saleCode, appointmentRequest.saleCode);
        }
        return false;
    }

    @NotNull
    public final String getAccessMode() {
        return this.accessMode;
    }

    @NotNull
    public final List<AppointmentDeviceItem> getAdditionalDeviceList() {
        return this.additionalDeviceList;
    }

    @NotNull
    public final String getAddrId() {
        return this.addrId;
    }

    @NotNull
    public final List<AppointmentChangeService> getChangeService() {
        return this.changeService;
    }

    @NotNull
    public final String getCustId() {
        return this.custId;
    }

    @NotNull
    public final String getInstallationDate() {
        return this.installationDate;
    }

    @NotNull
    public final String getProdSpecCode() {
        return this.prodSpecCode;
    }

    @NotNull
    public final String getSaleCode() {
        return this.saleCode;
    }

    public int hashCode() {
        return (((((((((((((this.custId.hashCode() * 31) + this.addrId.hashCode()) * 31) + this.changeService.hashCode()) * 31) + this.accessMode.hashCode()) * 31) + this.additionalDeviceList.hashCode()) * 31) + this.installationDate.hashCode()) * 31) + this.prodSpecCode.hashCode()) * 31) + this.saleCode.hashCode();
    }

    @NotNull
    public String toString() {
        String str = this.custId;
        String str2 = this.addrId;
        List<AppointmentChangeService> list = this.changeService;
        String str3 = this.accessMode;
        List<AppointmentDeviceItem> list2 = this.additionalDeviceList;
        String str4 = this.installationDate;
        String str5 = this.prodSpecCode;
        String str6 = this.saleCode;
        return "AppointmentRequest(custId=" + str + ", addrId=" + str2 + ", changeService=" + list + ", accessMode=" + str3 + ", additionalDeviceList=" + list2 + ", installationDate=" + str4 + ", prodSpecCode=" + str5 + ", saleCode=" + str6 + ")";
    }
}
