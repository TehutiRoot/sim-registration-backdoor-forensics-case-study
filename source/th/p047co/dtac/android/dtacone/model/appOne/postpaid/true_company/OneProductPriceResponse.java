package th.p047co.dtac.android.dtacone.model.appOne.postpaid.true_company;

import androidx.compose.runtime.internal.StabilityInferred;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.gson.annotations.SerializedName;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import th.p047co.dtac.android.dtacone.util.Constant;

@StabilityInferred(parameters = 0)
@Metadata(m28851d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0016\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001:\u0001%B_\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\fJ\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010\u001b\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\tHÆ\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\u0003HÆ\u0003Jc\u0010\u001e\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u001f\u001a\u00020 2\b\u0010!\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\"\u001a\u00020#HÖ\u0001J\t\u0010$\u001a\u00020\u0003HÖ\u0001R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000eR\u001e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0018\u0010\n\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u000eR\u0018\u0010\u000b\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u000e¨\u0006&"}, m28850d2 = {"Lth/co/dtac/android/dtacone/model/appOne/postpaid/true_company/OneProductPriceResponse;", "", "code", "", "codeType", "data", "Lth/co/dtac/android/dtacone/model/appOne/postpaid/true_company/OneProductPriceResponse$Data;", "desc", "replaceMessage", "", "responseDateTime", "systemMessage", "(Ljava/lang/String;Ljava/lang/String;Lth/co/dtac/android/dtacone/model/appOne/postpaid/true_company/OneProductPriceResponse$Data;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;)V", "getCode", "()Ljava/lang/String;", "getCodeType", "getData", "()Lth/co/dtac/android/dtacone/model/appOne/postpaid/true_company/OneProductPriceResponse$Data;", "getDesc", "getReplaceMessage", "()Ljava/util/List;", "getResponseDateTime", "getSystemMessage", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "", "other", "hashCode", "", "toString", Constant.BenefitName.Data, "app_prodRelease"}, m28849k = 1, m28848mv = {1, 8, 0}, m28846xi = 48)
/* renamed from: th.co.dtac.android.dtacone.model.appOne.postpaid.true_company.OneProductPriceResponse */
/* loaded from: classes8.dex */
public final class OneProductPriceResponse {
    public static final int $stable = 8;
    @SerializedName("code")
    @Nullable
    private final String code;
    @SerializedName("codeType")
    @Nullable
    private final String codeType;
    @SerializedName("data")
    @Nullable
    private final Data data;
    @SerializedName("desc")
    @Nullable
    private final String desc;
    @SerializedName("replaceMessage")
    @Nullable
    private final List<String> replaceMessage;
    @SerializedName("responseDateTime")
    @Nullable
    private final String responseDateTime;
    @SerializedName("systemMessage")
    @Nullable
    private final String systemMessage;

    @StabilityInferred(parameters = 0)
    @Metadata(m28851d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001:\u0001'BY\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0001¢\u0006\u0002\u0010\fJ\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\u001d\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0002\u0010\u0013J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\nHÆ\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\u0001HÆ\u0003Jb\u0010 \u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÆ\u0001¢\u0006\u0002\u0010!J\u0013\u0010\"\u001a\u00020#2\b\u0010$\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010%\u001a\u00020\bHÖ\u0001J\t\u0010&\u001a\u00020\u0003HÖ\u0001R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000eR\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000eR\u001a\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u0014\u001a\u0004\b\u0012\u0010\u0013R\u0018\u0010\t\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0018\u0010\u000b\u001a\u0004\u0018\u00010\u00018\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018¨\u0006("}, m28850d2 = {"Lth/co/dtac/android/dtacone/model/appOne/postpaid/true_company/OneProductPriceResponse$Data;", "", "company", "", "desc", "ean", "name", FirebaseAnalytics.Param.PRICE, "", "productInfo", "Lth/co/dtac/android/dtacone/model/appOne/postpaid/true_company/OneProductPriceResponse$Data$ProductInfo;", "productStatus", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Lth/co/dtac/android/dtacone/model/appOne/postpaid/true_company/OneProductPriceResponse$Data$ProductInfo;Ljava/lang/Object;)V", "getCompany", "()Ljava/lang/String;", "getDesc", "getEan", "getName", "getPrice", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getProductInfo", "()Lth/co/dtac/android/dtacone/model/appOne/postpaid/true_company/OneProductPriceResponse$Data$ProductInfo;", "getProductStatus", "()Ljava/lang/Object;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Lth/co/dtac/android/dtacone/model/appOne/postpaid/true_company/OneProductPriceResponse$Data$ProductInfo;Ljava/lang/Object;)Lth/co/dtac/android/dtacone/model/appOne/postpaid/true_company/OneProductPriceResponse$Data;", "equals", "", "other", "hashCode", "toString", "ProductInfo", "app_prodRelease"}, m28849k = 1, m28848mv = {1, 8, 0}, m28846xi = 48)
    /* renamed from: th.co.dtac.android.dtacone.model.appOne.postpaid.true_company.OneProductPriceResponse$Data */
    /* loaded from: classes8.dex */
    public static final class Data {
        public static final int $stable = 8;
        @SerializedName("company")
        @Nullable
        private final String company;
        @SerializedName("desc")
        @Nullable
        private final String desc;
        @SerializedName("ean")
        @Nullable
        private final String ean;
        @SerializedName("name")
        @Nullable
        private final String name;
        @SerializedName(FirebaseAnalytics.Param.PRICE)
        @Nullable
        private final Integer price;
        @SerializedName("productInfo")
        @Nullable
        private final ProductInfo productInfo;
        @SerializedName("productStatus")
        @Nullable
        private final Object productStatus;

        @StabilityInferred(parameters = 0)
        @Metadata(m28851d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0014\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001BA\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0004¢\u0006\u0002\u0010\bJ\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÆ\u0003J\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0002\u0010\u000bJ\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0002\u0010\u000bJ\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0002\u0010\u000bJ\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0002\u0010\u000bJJ\u0010\u0014\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0002\u0010\u0015J\u0013\u0010\u0016\u001a\u00020\u00042\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00018\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u001a\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\f\u001a\u0004\b\u0003\u0010\u000bR\u001a\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\f\u001a\u0004\b\u0005\u0010\u000bR\u001a\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\f\u001a\u0004\b\r\u0010\u000bR\u001a\u0010\u0007\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\f\u001a\u0004\b\u000e\u0010\u000b¨\u0006\u001c"}, m28850d2 = {"Lth/co/dtac/android/dtacone/model/appOne/postpaid/true_company/OneProductPriceResponse$Data$ProductInfo;", "", "appleCareCode", "isSerial", "", "isSim", "reqSaleApproach", "requireForm", "(Ljava/lang/Object;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;)V", "getAppleCareCode", "()Ljava/lang/Object;", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getReqSaleApproach", "getRequireForm", "component1", "component2", "component3", "component4", "component5", "copy", "(Ljava/lang/Object;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;)Lth/co/dtac/android/dtacone/model/appOne/postpaid/true_company/OneProductPriceResponse$Data$ProductInfo;", "equals", "other", "hashCode", "", "toString", "", "app_prodRelease"}, m28849k = 1, m28848mv = {1, 8, 0}, m28846xi = 48)
        /* renamed from: th.co.dtac.android.dtacone.model.appOne.postpaid.true_company.OneProductPriceResponse$Data$ProductInfo */
        /* loaded from: classes8.dex */
        public static final class ProductInfo {
            public static final int $stable = 8;
            @SerializedName("appleCareCode")
            @Nullable
            private final Object appleCareCode;
            @SerializedName("isSerial")
            @Nullable
            private final Boolean isSerial;
            @SerializedName("isSim")
            @Nullable
            private final Boolean isSim;
            @SerializedName("reqSaleApproach")
            @Nullable
            private final Boolean reqSaleApproach;
            @SerializedName("requireForm")
            @Nullable
            private final Boolean requireForm;

            public ProductInfo() {
                this(null, null, null, null, null, 31, null);
            }

            public static /* synthetic */ ProductInfo copy$default(ProductInfo productInfo, Object obj, Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, int i, Object obj2) {
                if ((i & 1) != 0) {
                    obj = productInfo.appleCareCode;
                }
                if ((i & 2) != 0) {
                    bool = productInfo.isSerial;
                }
                Boolean bool5 = bool;
                if ((i & 4) != 0) {
                    bool2 = productInfo.isSim;
                }
                Boolean bool6 = bool2;
                if ((i & 8) != 0) {
                    bool3 = productInfo.reqSaleApproach;
                }
                Boolean bool7 = bool3;
                if ((i & 16) != 0) {
                    bool4 = productInfo.requireForm;
                }
                return productInfo.copy(obj, bool5, bool6, bool7, bool4);
            }

            @Nullable
            public final Object component1() {
                return this.appleCareCode;
            }

            @Nullable
            public final Boolean component2() {
                return this.isSerial;
            }

            @Nullable
            public final Boolean component3() {
                return this.isSim;
            }

            @Nullable
            public final Boolean component4() {
                return this.reqSaleApproach;
            }

            @Nullable
            public final Boolean component5() {
                return this.requireForm;
            }

            @NotNull
            public final ProductInfo copy(@Nullable Object obj, @Nullable Boolean bool, @Nullable Boolean bool2, @Nullable Boolean bool3, @Nullable Boolean bool4) {
                return new ProductInfo(obj, bool, bool2, bool3, bool4);
            }

            public boolean equals(@Nullable Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj instanceof ProductInfo) {
                    ProductInfo productInfo = (ProductInfo) obj;
                    return Intrinsics.areEqual(this.appleCareCode, productInfo.appleCareCode) && Intrinsics.areEqual(this.isSerial, productInfo.isSerial) && Intrinsics.areEqual(this.isSim, productInfo.isSim) && Intrinsics.areEqual(this.reqSaleApproach, productInfo.reqSaleApproach) && Intrinsics.areEqual(this.requireForm, productInfo.requireForm);
                }
                return false;
            }

            @Nullable
            public final Object getAppleCareCode() {
                return this.appleCareCode;
            }

            @Nullable
            public final Boolean getReqSaleApproach() {
                return this.reqSaleApproach;
            }

            @Nullable
            public final Boolean getRequireForm() {
                return this.requireForm;
            }

            public int hashCode() {
                Object obj = this.appleCareCode;
                int hashCode = (obj == null ? 0 : obj.hashCode()) * 31;
                Boolean bool = this.isSerial;
                int hashCode2 = (hashCode + (bool == null ? 0 : bool.hashCode())) * 31;
                Boolean bool2 = this.isSim;
                int hashCode3 = (hashCode2 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
                Boolean bool3 = this.reqSaleApproach;
                int hashCode4 = (hashCode3 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
                Boolean bool4 = this.requireForm;
                return hashCode4 + (bool4 != null ? bool4.hashCode() : 0);
            }

            @Nullable
            public final Boolean isSerial() {
                return this.isSerial;
            }

            @Nullable
            public final Boolean isSim() {
                return this.isSim;
            }

            @NotNull
            public String toString() {
                Object obj = this.appleCareCode;
                Boolean bool = this.isSerial;
                Boolean bool2 = this.isSim;
                Boolean bool3 = this.reqSaleApproach;
                Boolean bool4 = this.requireForm;
                return "ProductInfo(appleCareCode=" + obj + ", isSerial=" + bool + ", isSim=" + bool2 + ", reqSaleApproach=" + bool3 + ", requireForm=" + bool4 + ")";
            }

            public ProductInfo(@Nullable Object obj, @Nullable Boolean bool, @Nullable Boolean bool2, @Nullable Boolean bool3, @Nullable Boolean bool4) {
                this.appleCareCode = obj;
                this.isSerial = bool;
                this.isSim = bool2;
                this.reqSaleApproach = bool3;
                this.requireForm = bool4;
            }

            public /* synthetic */ ProductInfo(Object obj, Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this((i & 1) != 0 ? null : obj, (i & 2) != 0 ? null : bool, (i & 4) != 0 ? null : bool2, (i & 8) != 0 ? null : bool3, (i & 16) != 0 ? null : bool4);
            }
        }

        public Data() {
            this(null, null, null, null, null, null, null, 127, null);
        }

        public static /* synthetic */ Data copy$default(Data data, String str, String str2, String str3, String str4, Integer num, ProductInfo productInfo, Object obj, int i, Object obj2) {
            if ((i & 1) != 0) {
                str = data.company;
            }
            if ((i & 2) != 0) {
                str2 = data.desc;
            }
            String str5 = str2;
            if ((i & 4) != 0) {
                str3 = data.ean;
            }
            String str6 = str3;
            if ((i & 8) != 0) {
                str4 = data.name;
            }
            String str7 = str4;
            if ((i & 16) != 0) {
                num = data.price;
            }
            Integer num2 = num;
            if ((i & 32) != 0) {
                productInfo = data.productInfo;
            }
            ProductInfo productInfo2 = productInfo;
            if ((i & 64) != 0) {
                obj = data.productStatus;
            }
            return data.copy(str, str5, str6, str7, num2, productInfo2, obj);
        }

        @Nullable
        public final String component1() {
            return this.company;
        }

        @Nullable
        public final String component2() {
            return this.desc;
        }

        @Nullable
        public final String component3() {
            return this.ean;
        }

        @Nullable
        public final String component4() {
            return this.name;
        }

        @Nullable
        public final Integer component5() {
            return this.price;
        }

        @Nullable
        public final ProductInfo component6() {
            return this.productInfo;
        }

        @Nullable
        public final Object component7() {
            return this.productStatus;
        }

        @NotNull
        public final Data copy(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable Integer num, @Nullable ProductInfo productInfo, @Nullable Object obj) {
            return new Data(str, str2, str3, str4, num, productInfo, obj);
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof Data) {
                Data data = (Data) obj;
                return Intrinsics.areEqual(this.company, data.company) && Intrinsics.areEqual(this.desc, data.desc) && Intrinsics.areEqual(this.ean, data.ean) && Intrinsics.areEqual(this.name, data.name) && Intrinsics.areEqual(this.price, data.price) && Intrinsics.areEqual(this.productInfo, data.productInfo) && Intrinsics.areEqual(this.productStatus, data.productStatus);
            }
            return false;
        }

        @Nullable
        public final String getCompany() {
            return this.company;
        }

        @Nullable
        public final String getDesc() {
            return this.desc;
        }

        @Nullable
        public final String getEan() {
            return this.ean;
        }

        @Nullable
        public final String getName() {
            return this.name;
        }

        @Nullable
        public final Integer getPrice() {
            return this.price;
        }

        @Nullable
        public final ProductInfo getProductInfo() {
            return this.productInfo;
        }

        @Nullable
        public final Object getProductStatus() {
            return this.productStatus;
        }

        public int hashCode() {
            String str = this.company;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.desc;
            int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.ean;
            int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.name;
            int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
            Integer num = this.price;
            int hashCode5 = (hashCode4 + (num == null ? 0 : num.hashCode())) * 31;
            ProductInfo productInfo = this.productInfo;
            int hashCode6 = (hashCode5 + (productInfo == null ? 0 : productInfo.hashCode())) * 31;
            Object obj = this.productStatus;
            return hashCode6 + (obj != null ? obj.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            String str = this.company;
            String str2 = this.desc;
            String str3 = this.ean;
            String str4 = this.name;
            Integer num = this.price;
            ProductInfo productInfo = this.productInfo;
            Object obj = this.productStatus;
            return "Data(company=" + str + ", desc=" + str2 + ", ean=" + str3 + ", name=" + str4 + ", price=" + num + ", productInfo=" + productInfo + ", productStatus=" + obj + ")";
        }

        public Data(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable Integer num, @Nullable ProductInfo productInfo, @Nullable Object obj) {
            this.company = str;
            this.desc = str2;
            this.ean = str3;
            this.name = str4;
            this.price = num;
            this.productInfo = productInfo;
            this.productStatus = obj;
        }

        public /* synthetic */ Data(String str, String str2, String str3, String str4, Integer num, ProductInfo productInfo, Object obj, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : num, (i & 32) != 0 ? null : productInfo, (i & 64) != 0 ? null : obj);
        }
    }

    public OneProductPriceResponse() {
        this(null, null, null, null, null, null, null, 127, null);
    }

    public static /* synthetic */ OneProductPriceResponse copy$default(OneProductPriceResponse oneProductPriceResponse, String str, String str2, Data data, String str3, List list, String str4, String str5, int i, Object obj) {
        if ((i & 1) != 0) {
            str = oneProductPriceResponse.code;
        }
        if ((i & 2) != 0) {
            str2 = oneProductPriceResponse.codeType;
        }
        String str6 = str2;
        if ((i & 4) != 0) {
            data = oneProductPriceResponse.data;
        }
        Data data2 = data;
        if ((i & 8) != 0) {
            str3 = oneProductPriceResponse.desc;
        }
        String str7 = str3;
        List<String> list2 = list;
        if ((i & 16) != 0) {
            list2 = oneProductPriceResponse.replaceMessage;
        }
        List list3 = list2;
        if ((i & 32) != 0) {
            str4 = oneProductPriceResponse.responseDateTime;
        }
        String str8 = str4;
        if ((i & 64) != 0) {
            str5 = oneProductPriceResponse.systemMessage;
        }
        return oneProductPriceResponse.copy(str, str6, data2, str7, list3, str8, str5);
    }

    @Nullable
    public final String component1() {
        return this.code;
    }

    @Nullable
    public final String component2() {
        return this.codeType;
    }

    @Nullable
    public final Data component3() {
        return this.data;
    }

    @Nullable
    public final String component4() {
        return this.desc;
    }

    @Nullable
    public final List<String> component5() {
        return this.replaceMessage;
    }

    @Nullable
    public final String component6() {
        return this.responseDateTime;
    }

    @Nullable
    public final String component7() {
        return this.systemMessage;
    }

    @NotNull
    public final OneProductPriceResponse copy(@Nullable String str, @Nullable String str2, @Nullable Data data, @Nullable String str3, @Nullable List<String> list, @Nullable String str4, @Nullable String str5) {
        return new OneProductPriceResponse(str, str2, data, str3, list, str4, str5);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof OneProductPriceResponse) {
            OneProductPriceResponse oneProductPriceResponse = (OneProductPriceResponse) obj;
            return Intrinsics.areEqual(this.code, oneProductPriceResponse.code) && Intrinsics.areEqual(this.codeType, oneProductPriceResponse.codeType) && Intrinsics.areEqual(this.data, oneProductPriceResponse.data) && Intrinsics.areEqual(this.desc, oneProductPriceResponse.desc) && Intrinsics.areEqual(this.replaceMessage, oneProductPriceResponse.replaceMessage) && Intrinsics.areEqual(this.responseDateTime, oneProductPriceResponse.responseDateTime) && Intrinsics.areEqual(this.systemMessage, oneProductPriceResponse.systemMessage);
        }
        return false;
    }

    @Nullable
    public final String getCode() {
        return this.code;
    }

    @Nullable
    public final String getCodeType() {
        return this.codeType;
    }

    @Nullable
    public final Data getData() {
        return this.data;
    }

    @Nullable
    public final String getDesc() {
        return this.desc;
    }

    @Nullable
    public final List<String> getReplaceMessage() {
        return this.replaceMessage;
    }

    @Nullable
    public final String getResponseDateTime() {
        return this.responseDateTime;
    }

    @Nullable
    public final String getSystemMessage() {
        return this.systemMessage;
    }

    public int hashCode() {
        String str = this.code;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.codeType;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Data data = this.data;
        int hashCode3 = (hashCode2 + (data == null ? 0 : data.hashCode())) * 31;
        String str3 = this.desc;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        List<String> list = this.replaceMessage;
        int hashCode5 = (hashCode4 + (list == null ? 0 : list.hashCode())) * 31;
        String str4 = this.responseDateTime;
        int hashCode6 = (hashCode5 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.systemMessage;
        return hashCode6 + (str5 != null ? str5.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        String str = this.code;
        String str2 = this.codeType;
        Data data = this.data;
        String str3 = this.desc;
        List<String> list = this.replaceMessage;
        String str4 = this.responseDateTime;
        String str5 = this.systemMessage;
        return "OneProductPriceResponse(code=" + str + ", codeType=" + str2 + ", data=" + data + ", desc=" + str3 + ", replaceMessage=" + list + ", responseDateTime=" + str4 + ", systemMessage=" + str5 + ")";
    }

    public OneProductPriceResponse(@Nullable String str, @Nullable String str2, @Nullable Data data, @Nullable String str3, @Nullable List<String> list, @Nullable String str4, @Nullable String str5) {
        this.code = str;
        this.codeType = str2;
        this.data = data;
        this.desc = str3;
        this.replaceMessage = list;
        this.responseDateTime = str4;
        this.systemMessage = str5;
    }

    public /* synthetic */ OneProductPriceResponse(String str, String str2, Data data, String str3, List list, String str4, String str5, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : data, (i & 8) != 0 ? null : str3, (i & 16) != 0 ? null : list, (i & 32) != 0 ? null : str4, (i & 64) != 0 ? null : str5);
    }
}
