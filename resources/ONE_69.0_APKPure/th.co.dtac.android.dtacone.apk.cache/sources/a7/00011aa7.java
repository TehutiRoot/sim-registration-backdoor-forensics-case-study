package th.p047co.dtac.android.dtacone.model.appOne.mnp.response;

import androidx.compose.runtime.internal.StabilityInferred;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import th.p047co.dtac.android.dtacone.model.appOne.common.true_company.common_package.PackageItem;
import th.p047co.dtac.android.dtacone.model.appOne.common.true_company.common_package.Properties;
import th.p047co.dtac.android.dtacone.model.appOne.common.true_company.common_package.SalePeriod;

@StabilityInferred(parameters = 0)
@Metadata(m29143d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b-\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001BÅ\u0001\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0016\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0018J\u000b\u00101\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u00102\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0002\u0010\u001aJ\u0010\u00103\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0002\u0010\u001aJ\u000b\u00104\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00105\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00106\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00107\u001a\u0004\u0018\u00010\u0016HÆ\u0003J\u000b\u00108\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00109\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010:\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010;\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010<\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010=\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0002\u0010\u001aJ\u0010\u0010>\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0002\u0010\u001aJ\u000b\u0010?\u001a\u0004\u0018\u00010\rHÆ\u0003J\u0010\u0010@\u001a\u0004\u0018\u00010\u000fHÆ\u0003¢\u0006\u0002\u0010 JÎ\u0001\u0010A\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00162\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010BJ\u0013\u0010C\u001a\u00020D2\b\u0010E\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010F\u001a\u00020\u000fHÖ\u0001J\t\u0010G\u001a\u00020\u0003HÖ\u0001R\u001a\u0010\t\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u001b\u001a\u0004\b\u0019\u0010\u001aR\u0018\u0010\b\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0018\u0010\u0017\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001dR\u001a\u0010\u000e\u001a\u0004\u0018\u00010\u000f8\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010!\u001a\u0004\b\u001f\u0010 R\u0018\u0010\u0013\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u001dR\u001a\u0010\u0011\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u001b\u001a\u0004\b#\u0010\u001aR\u0018\u0010\f\u001a\u0004\u0018\u00010\r8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b$\u0010%R\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b&\u0010\u001dR\u0018\u0010\u0015\u001a\u0004\u0018\u00010\u00168\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b'\u0010(R\u001a\u0010\u0010\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u001b\u001a\u0004\b)\u0010\u001aR\u0018\u0010\u0012\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b*\u0010\u001dR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b+\u0010,R\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b-\u0010\u001dR\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b.\u0010\u001dR\u0018\u0010\u0014\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b/\u0010\u001dR\u001a\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u001b\u001a\u0004\b0\u0010\u001a¨\u0006H"}, m29142d2 = {"Lth/co/dtac/android/dtacone/model/appOne/mnp/response/PricePlanListItem;", "", "soc", "", "salePeriod", "Lth/co/dtac/android/dtacone/model/appOne/common/true_company/common_package/SalePeriod;", "serviceLevel", "priceplanPeriod", "description", "dataQuota", "", "voiceQuota", "packages", "Lth/co/dtac/android/dtacone/model/appOne/common/true_company/common_package/PackageItem;", "maxInstanceAllow", "", "rc", "oc", "saleContext", "name", "socType", "properties", "Lth/co/dtac/android/dtacone/model/appOne/common/true_company/common_package/Properties;", "group", "(Ljava/lang/String;Lth/co/dtac/android/dtacone/model/appOne/common/true_company/common_package/SalePeriod;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/Double;Lth/co/dtac/android/dtacone/model/appOne/common/true_company/common_package/PackageItem;Ljava/lang/Integer;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lth/co/dtac/android/dtacone/model/appOne/common/true_company/common_package/Properties;Ljava/lang/String;)V", "getDataQuota", "()Ljava/lang/Double;", "Ljava/lang/Double;", "getDescription", "()Ljava/lang/String;", "getGroup", "getMaxInstanceAllow", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getName", "getOc", "getPackages", "()Lth/co/dtac/android/dtacone/model/appOne/common/true_company/common_package/PackageItem;", "getPriceplanPeriod", "getProperties", "()Lth/co/dtac/android/dtacone/model/appOne/common/true_company/common_package/Properties;", "getRc", "getSaleContext", "getSalePeriod", "()Lth/co/dtac/android/dtacone/model/appOne/common/true_company/common_package/SalePeriod;", "getServiceLevel", "getSoc", "getSocType", "getVoiceQuota", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Ljava/lang/String;Lth/co/dtac/android/dtacone/model/appOne/common/true_company/common_package/SalePeriod;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/Double;Lth/co/dtac/android/dtacone/model/appOne/common/true_company/common_package/PackageItem;Ljava/lang/Integer;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lth/co/dtac/android/dtacone/model/appOne/common/true_company/common_package/Properties;Ljava/lang/String;)Lth/co/dtac/android/dtacone/model/appOne/mnp/response/PricePlanListItem;", "equals", "", "other", "hashCode", "toString", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.model.appOne.mnp.response.PricePlanListItem */
/* loaded from: classes8.dex */
public final class PricePlanListItem {
    public static final int $stable = 8;
    @SerializedName("data-quota")
    @Nullable
    private final Double dataQuota;
    @SerializedName("description")
    @Nullable
    private final String description;
    @SerializedName("group")
    @Nullable
    private final String group;
    @SerializedName("max-instance-allow")
    @Nullable
    private final Integer maxInstanceAllow;
    @SerializedName("name")
    @Nullable
    private final String name;
    @SerializedName("oc")
    @Nullable

    /* renamed from: oc */
    private final Double f85162oc;
    @SerializedName("package")
    @Nullable
    private final PackageItem packages;
    @SerializedName("priceplan-period")
    @Nullable
    private final String priceplanPeriod;
    @SerializedName("properties")
    @Nullable
    private final Properties properties;
    @SerializedName("rc")
    @Nullable

    /* renamed from: rc */
    private final Double f85163rc;
    @SerializedName("sale-context")
    @Nullable
    private final String saleContext;
    @SerializedName("sale-period")
    @Nullable
    private final SalePeriod salePeriod;
    @SerializedName("service-level")
    @Nullable
    private final String serviceLevel;
    @SerializedName("soc")
    @Nullable
    private final String soc;
    @SerializedName("soc-type")
    @Nullable
    private final String socType;
    @SerializedName("voice-quota")
    @Nullable
    private final Double voiceQuota;

    public PricePlanListItem() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 65535, null);
    }

    @Nullable
    public final String component1() {
        return this.soc;
    }

    @Nullable
    public final Double component10() {
        return this.f85163rc;
    }

    @Nullable
    public final Double component11() {
        return this.f85162oc;
    }

    @Nullable
    public final String component12() {
        return this.saleContext;
    }

    @Nullable
    public final String component13() {
        return this.name;
    }

    @Nullable
    public final String component14() {
        return this.socType;
    }

    @Nullable
    public final Properties component15() {
        return this.properties;
    }

    @Nullable
    public final String component16() {
        return this.group;
    }

    @Nullable
    public final SalePeriod component2() {
        return this.salePeriod;
    }

    @Nullable
    public final String component3() {
        return this.serviceLevel;
    }

    @Nullable
    public final String component4() {
        return this.priceplanPeriod;
    }

    @Nullable
    public final String component5() {
        return this.description;
    }

    @Nullable
    public final Double component6() {
        return this.dataQuota;
    }

    @Nullable
    public final Double component7() {
        return this.voiceQuota;
    }

    @Nullable
    public final PackageItem component8() {
        return this.packages;
    }

    @Nullable
    public final Integer component9() {
        return this.maxInstanceAllow;
    }

    @NotNull
    public final PricePlanListItem copy(@Nullable String str, @Nullable SalePeriod salePeriod, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable Double d, @Nullable Double d2, @Nullable PackageItem packageItem, @Nullable Integer num, @Nullable Double d3, @Nullable Double d4, @Nullable String str5, @Nullable String str6, @Nullable String str7, @Nullable Properties properties, @Nullable String str8) {
        return new PricePlanListItem(str, salePeriod, str2, str3, str4, d, d2, packageItem, num, d3, d4, str5, str6, str7, properties, str8);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof PricePlanListItem) {
            PricePlanListItem pricePlanListItem = (PricePlanListItem) obj;
            return Intrinsics.areEqual(this.soc, pricePlanListItem.soc) && Intrinsics.areEqual(this.salePeriod, pricePlanListItem.salePeriod) && Intrinsics.areEqual(this.serviceLevel, pricePlanListItem.serviceLevel) && Intrinsics.areEqual(this.priceplanPeriod, pricePlanListItem.priceplanPeriod) && Intrinsics.areEqual(this.description, pricePlanListItem.description) && Intrinsics.areEqual((Object) this.dataQuota, (Object) pricePlanListItem.dataQuota) && Intrinsics.areEqual((Object) this.voiceQuota, (Object) pricePlanListItem.voiceQuota) && Intrinsics.areEqual(this.packages, pricePlanListItem.packages) && Intrinsics.areEqual(this.maxInstanceAllow, pricePlanListItem.maxInstanceAllow) && Intrinsics.areEqual((Object) this.f85163rc, (Object) pricePlanListItem.f85163rc) && Intrinsics.areEqual((Object) this.f85162oc, (Object) pricePlanListItem.f85162oc) && Intrinsics.areEqual(this.saleContext, pricePlanListItem.saleContext) && Intrinsics.areEqual(this.name, pricePlanListItem.name) && Intrinsics.areEqual(this.socType, pricePlanListItem.socType) && Intrinsics.areEqual(this.properties, pricePlanListItem.properties) && Intrinsics.areEqual(this.group, pricePlanListItem.group);
        }
        return false;
    }

    @Nullable
    public final Double getDataQuota() {
        return this.dataQuota;
    }

    @Nullable
    public final String getDescription() {
        return this.description;
    }

    @Nullable
    public final String getGroup() {
        return this.group;
    }

    @Nullable
    public final Integer getMaxInstanceAllow() {
        return this.maxInstanceAllow;
    }

    @Nullable
    public final String getName() {
        return this.name;
    }

    @Nullable
    public final Double getOc() {
        return this.f85162oc;
    }

    @Nullable
    public final PackageItem getPackages() {
        return this.packages;
    }

    @Nullable
    public final String getPriceplanPeriod() {
        return this.priceplanPeriod;
    }

    @Nullable
    public final Properties getProperties() {
        return this.properties;
    }

    @Nullable
    public final Double getRc() {
        return this.f85163rc;
    }

    @Nullable
    public final String getSaleContext() {
        return this.saleContext;
    }

    @Nullable
    public final SalePeriod getSalePeriod() {
        return this.salePeriod;
    }

    @Nullable
    public final String getServiceLevel() {
        return this.serviceLevel;
    }

    @Nullable
    public final String getSoc() {
        return this.soc;
    }

    @Nullable
    public final String getSocType() {
        return this.socType;
    }

    @Nullable
    public final Double getVoiceQuota() {
        return this.voiceQuota;
    }

    public int hashCode() {
        String str = this.soc;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        SalePeriod salePeriod = this.salePeriod;
        int hashCode2 = (hashCode + (salePeriod == null ? 0 : salePeriod.hashCode())) * 31;
        String str2 = this.serviceLevel;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.priceplanPeriod;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.description;
        int hashCode5 = (hashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Double d = this.dataQuota;
        int hashCode6 = (hashCode5 + (d == null ? 0 : d.hashCode())) * 31;
        Double d2 = this.voiceQuota;
        int hashCode7 = (hashCode6 + (d2 == null ? 0 : d2.hashCode())) * 31;
        PackageItem packageItem = this.packages;
        int hashCode8 = (hashCode7 + (packageItem == null ? 0 : packageItem.hashCode())) * 31;
        Integer num = this.maxInstanceAllow;
        int hashCode9 = (hashCode8 + (num == null ? 0 : num.hashCode())) * 31;
        Double d3 = this.f85163rc;
        int hashCode10 = (hashCode9 + (d3 == null ? 0 : d3.hashCode())) * 31;
        Double d4 = this.f85162oc;
        int hashCode11 = (hashCode10 + (d4 == null ? 0 : d4.hashCode())) * 31;
        String str5 = this.saleContext;
        int hashCode12 = (hashCode11 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.name;
        int hashCode13 = (hashCode12 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.socType;
        int hashCode14 = (hashCode13 + (str7 == null ? 0 : str7.hashCode())) * 31;
        Properties properties = this.properties;
        int hashCode15 = (hashCode14 + (properties == null ? 0 : properties.hashCode())) * 31;
        String str8 = this.group;
        return hashCode15 + (str8 != null ? str8.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        String str = this.soc;
        SalePeriod salePeriod = this.salePeriod;
        String str2 = this.serviceLevel;
        String str3 = this.priceplanPeriod;
        String str4 = this.description;
        Double d = this.dataQuota;
        Double d2 = this.voiceQuota;
        PackageItem packageItem = this.packages;
        Integer num = this.maxInstanceAllow;
        Double d3 = this.f85163rc;
        Double d4 = this.f85162oc;
        String str5 = this.saleContext;
        String str6 = this.name;
        String str7 = this.socType;
        Properties properties = this.properties;
        String str8 = this.group;
        return "PricePlanListItem(soc=" + str + ", salePeriod=" + salePeriod + ", serviceLevel=" + str2 + ", priceplanPeriod=" + str3 + ", description=" + str4 + ", dataQuota=" + d + ", voiceQuota=" + d2 + ", packages=" + packageItem + ", maxInstanceAllow=" + num + ", rc=" + d3 + ", oc=" + d4 + ", saleContext=" + str5 + ", name=" + str6 + ", socType=" + str7 + ", properties=" + properties + ", group=" + str8 + ")";
    }

    public PricePlanListItem(@Nullable String str, @Nullable SalePeriod salePeriod, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable Double d, @Nullable Double d2, @Nullable PackageItem packageItem, @Nullable Integer num, @Nullable Double d3, @Nullable Double d4, @Nullable String str5, @Nullable String str6, @Nullable String str7, @Nullable Properties properties, @Nullable String str8) {
        this.soc = str;
        this.salePeriod = salePeriod;
        this.serviceLevel = str2;
        this.priceplanPeriod = str3;
        this.description = str4;
        this.dataQuota = d;
        this.voiceQuota = d2;
        this.packages = packageItem;
        this.maxInstanceAllow = num;
        this.f85163rc = d3;
        this.f85162oc = d4;
        this.saleContext = str5;
        this.name = str6;
        this.socType = str7;
        this.properties = properties;
        this.group = str8;
    }

    public /* synthetic */ PricePlanListItem(String str, SalePeriod salePeriod, String str2, String str3, String str4, Double d, Double d2, PackageItem packageItem, Integer num, Double d3, Double d4, String str5, String str6, String str7, Properties properties, String str8, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : salePeriod, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? null : str3, (i & 16) != 0 ? null : str4, (i & 32) != 0 ? null : d, (i & 64) != 0 ? null : d2, (i & 128) != 0 ? null : packageItem, (i & 256) != 0 ? null : num, (i & 512) != 0 ? null : d3, (i & 1024) != 0 ? null : d4, (i & 2048) != 0 ? null : str5, (i & 4096) != 0 ? null : str6, (i & 8192) != 0 ? null : str7, (i & 16384) != 0 ? null : properties, (i & 32768) != 0 ? null : str8);
    }
}