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
@Metadata(m29143d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0016\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001:\u0001%B_\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\fJ\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010\u001b\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\tHÆ\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\u0003HÆ\u0003Jc\u0010\u001e\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u001f\u001a\u00020 2\b\u0010!\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\"\u001a\u00020#HÖ\u0001J\t\u0010$\u001a\u00020\u0003HÖ\u0001R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000eR\u001e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0018\u0010\n\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u000eR\u0018\u0010\u000b\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u000e¨\u0006&"}, m29142d2 = {"Lth/co/dtac/android/dtacone/model/appOne/postpaid/true_company/OnePropositionRebateResponse;", "", "code", "", "codeType", "data", "Lth/co/dtac/android/dtacone/model/appOne/postpaid/true_company/OnePropositionRebateResponse$Data;", "desc", "replaceMessage", "", "responseDateTime", "systemMessage", "(Ljava/lang/String;Ljava/lang/String;Lth/co/dtac/android/dtacone/model/appOne/postpaid/true_company/OnePropositionRebateResponse$Data;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;)V", "getCode", "()Ljava/lang/String;", "getCodeType", "getData", "()Lth/co/dtac/android/dtacone/model/appOne/postpaid/true_company/OnePropositionRebateResponse$Data;", "getDesc", "getReplaceMessage", "()Ljava/util/List;", "getResponseDateTime", "getSystemMessage", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "", "other", "hashCode", "", "toString", Constant.BenefitName.Data, "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.model.appOne.postpaid.true_company.OnePropositionRebateResponse */
/* loaded from: classes8.dex */
public final class OnePropositionRebateResponse {
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
    @Metadata(m29143d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0018\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BY\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\nJ\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0003HÆ\u0003J]\u0010\u001a\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001e\u001a\u00020\u001fHÖ\u0001J\t\u0010 \u001a\u00020\u0003HÖ\u0001R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\fR\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\fR\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\fR\u0018\u0010\b\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\fR\u0018\u0010\t\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\f¨\u0006!"}, m29142d2 = {"Lth/co/dtac/android/dtacone/model/appOne/postpaid/true_company/OnePropositionRebateResponse$Data;", "", "advPaymentInvat", "", "brandSupportAmount", FirebaseAnalytics.Param.DISCOUNT, "nasCode", "nasDescription", "onTopAmount", "rebateAmount", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getAdvPaymentInvat", "()Ljava/lang/String;", "getBrandSupportAmount", "getDiscount", "getNasCode", "getNasDescription", "getOnTopAmount", "getRebateAmount", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "", "other", "hashCode", "", "toString", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0}, m29138xi = 48)
    /* renamed from: th.co.dtac.android.dtacone.model.appOne.postpaid.true_company.OnePropositionRebateResponse$Data */
    /* loaded from: classes8.dex */
    public static final class Data {
        public static final int $stable = 0;
        @SerializedName("advPaymentInvat")
        @Nullable
        private final String advPaymentInvat;
        @SerializedName("brandSupportAmount")
        @Nullable
        private final String brandSupportAmount;
        @SerializedName(FirebaseAnalytics.Param.DISCOUNT)
        @Nullable
        private final String discount;
        @SerializedName("nasCode")
        @Nullable
        private final String nasCode;
        @SerializedName("nasDescription")
        @Nullable
        private final String nasDescription;
        @SerializedName("onTopAmount")
        @Nullable
        private final String onTopAmount;
        @SerializedName("rebateAmount")
        @Nullable
        private final String rebateAmount;

        public Data() {
            this(null, null, null, null, null, null, null, 127, null);
        }

        public static /* synthetic */ Data copy$default(Data data, String str, String str2, String str3, String str4, String str5, String str6, String str7, int i, Object obj) {
            if ((i & 1) != 0) {
                str = data.advPaymentInvat;
            }
            if ((i & 2) != 0) {
                str2 = data.brandSupportAmount;
            }
            String str8 = str2;
            if ((i & 4) != 0) {
                str3 = data.discount;
            }
            String str9 = str3;
            if ((i & 8) != 0) {
                str4 = data.nasCode;
            }
            String str10 = str4;
            if ((i & 16) != 0) {
                str5 = data.nasDescription;
            }
            String str11 = str5;
            if ((i & 32) != 0) {
                str6 = data.onTopAmount;
            }
            String str12 = str6;
            if ((i & 64) != 0) {
                str7 = data.rebateAmount;
            }
            return data.copy(str, str8, str9, str10, str11, str12, str7);
        }

        @Nullable
        public final String component1() {
            return this.advPaymentInvat;
        }

        @Nullable
        public final String component2() {
            return this.brandSupportAmount;
        }

        @Nullable
        public final String component3() {
            return this.discount;
        }

        @Nullable
        public final String component4() {
            return this.nasCode;
        }

        @Nullable
        public final String component5() {
            return this.nasDescription;
        }

        @Nullable
        public final String component6() {
            return this.onTopAmount;
        }

        @Nullable
        public final String component7() {
            return this.rebateAmount;
        }

        @NotNull
        public final Data copy(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable String str6, @Nullable String str7) {
            return new Data(str, str2, str3, str4, str5, str6, str7);
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof Data) {
                Data data = (Data) obj;
                return Intrinsics.areEqual(this.advPaymentInvat, data.advPaymentInvat) && Intrinsics.areEqual(this.brandSupportAmount, data.brandSupportAmount) && Intrinsics.areEqual(this.discount, data.discount) && Intrinsics.areEqual(this.nasCode, data.nasCode) && Intrinsics.areEqual(this.nasDescription, data.nasDescription) && Intrinsics.areEqual(this.onTopAmount, data.onTopAmount) && Intrinsics.areEqual(this.rebateAmount, data.rebateAmount);
            }
            return false;
        }

        @Nullable
        public final String getAdvPaymentInvat() {
            return this.advPaymentInvat;
        }

        @Nullable
        public final String getBrandSupportAmount() {
            return this.brandSupportAmount;
        }

        @Nullable
        public final String getDiscount() {
            return this.discount;
        }

        @Nullable
        public final String getNasCode() {
            return this.nasCode;
        }

        @Nullable
        public final String getNasDescription() {
            return this.nasDescription;
        }

        @Nullable
        public final String getOnTopAmount() {
            return this.onTopAmount;
        }

        @Nullable
        public final String getRebateAmount() {
            return this.rebateAmount;
        }

        public int hashCode() {
            String str = this.advPaymentInvat;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.brandSupportAmount;
            int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.discount;
            int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.nasCode;
            int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
            String str5 = this.nasDescription;
            int hashCode5 = (hashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
            String str6 = this.onTopAmount;
            int hashCode6 = (hashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
            String str7 = this.rebateAmount;
            return hashCode6 + (str7 != null ? str7.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            String str = this.advPaymentInvat;
            String str2 = this.brandSupportAmount;
            String str3 = this.discount;
            String str4 = this.nasCode;
            String str5 = this.nasDescription;
            String str6 = this.onTopAmount;
            String str7 = this.rebateAmount;
            return "Data(advPaymentInvat=" + str + ", brandSupportAmount=" + str2 + ", discount=" + str3 + ", nasCode=" + str4 + ", nasDescription=" + str5 + ", onTopAmount=" + str6 + ", rebateAmount=" + str7 + ")";
        }

        public Data(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable String str6, @Nullable String str7) {
            this.advPaymentInvat = str;
            this.brandSupportAmount = str2;
            this.discount = str3;
            this.nasCode = str4;
            this.nasDescription = str5;
            this.onTopAmount = str6;
            this.rebateAmount = str7;
        }

        public /* synthetic */ Data(String str, String str2, String str3, String str4, String str5, String str6, String str7, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : str5, (i & 32) != 0 ? null : str6, (i & 64) != 0 ? null : str7);
        }
    }

    public OnePropositionRebateResponse() {
        this(null, null, null, null, null, null, null, 127, null);
    }

    public static /* synthetic */ OnePropositionRebateResponse copy$default(OnePropositionRebateResponse onePropositionRebateResponse, String str, String str2, Data data, String str3, List list, String str4, String str5, int i, Object obj) {
        if ((i & 1) != 0) {
            str = onePropositionRebateResponse.code;
        }
        if ((i & 2) != 0) {
            str2 = onePropositionRebateResponse.codeType;
        }
        String str6 = str2;
        if ((i & 4) != 0) {
            data = onePropositionRebateResponse.data;
        }
        Data data2 = data;
        if ((i & 8) != 0) {
            str3 = onePropositionRebateResponse.desc;
        }
        String str7 = str3;
        List<String> list2 = list;
        if ((i & 16) != 0) {
            list2 = onePropositionRebateResponse.replaceMessage;
        }
        List list3 = list2;
        if ((i & 32) != 0) {
            str4 = onePropositionRebateResponse.responseDateTime;
        }
        String str8 = str4;
        if ((i & 64) != 0) {
            str5 = onePropositionRebateResponse.systemMessage;
        }
        return onePropositionRebateResponse.copy(str, str6, data2, str7, list3, str8, str5);
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
    public final OnePropositionRebateResponse copy(@Nullable String str, @Nullable String str2, @Nullable Data data, @Nullable String str3, @Nullable List<String> list, @Nullable String str4, @Nullable String str5) {
        return new OnePropositionRebateResponse(str, str2, data, str3, list, str4, str5);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof OnePropositionRebateResponse) {
            OnePropositionRebateResponse onePropositionRebateResponse = (OnePropositionRebateResponse) obj;
            return Intrinsics.areEqual(this.code, onePropositionRebateResponse.code) && Intrinsics.areEqual(this.codeType, onePropositionRebateResponse.codeType) && Intrinsics.areEqual(this.data, onePropositionRebateResponse.data) && Intrinsics.areEqual(this.desc, onePropositionRebateResponse.desc) && Intrinsics.areEqual(this.replaceMessage, onePropositionRebateResponse.replaceMessage) && Intrinsics.areEqual(this.responseDateTime, onePropositionRebateResponse.responseDateTime) && Intrinsics.areEqual(this.systemMessage, onePropositionRebateResponse.systemMessage);
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
        return "OnePropositionRebateResponse(code=" + str + ", codeType=" + str2 + ", data=" + data + ", desc=" + str3 + ", replaceMessage=" + list + ", responseDateTime=" + str4 + ", systemMessage=" + str5 + ")";
    }

    public OnePropositionRebateResponse(@Nullable String str, @Nullable String str2, @Nullable Data data, @Nullable String str3, @Nullable List<String> list, @Nullable String str4, @Nullable String str5) {
        this.code = str;
        this.codeType = str2;
        this.data = data;
        this.desc = str3;
        this.replaceMessage = list;
        this.responseDateTime = str4;
        this.systemMessage = str5;
    }

    public /* synthetic */ OnePropositionRebateResponse(String str, String str2, Data data, String str3, List list, String str4, String str5, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : data, (i & 8) != 0 ? null : str3, (i & 16) != 0 ? null : list, (i & 32) != 0 ? null : str4, (i & 64) != 0 ? null : str5);
    }
}