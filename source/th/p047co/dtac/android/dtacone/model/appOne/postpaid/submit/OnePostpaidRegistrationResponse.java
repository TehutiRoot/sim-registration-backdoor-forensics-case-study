package th.p047co.dtac.android.dtacone.model.appOne.postpaid.submit;

import androidx.compose.runtime.internal.StabilityInferred;
import com.google.gson.annotations.SerializedName;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import th.p047co.dtac.android.dtacone.util.Constant;

@StabilityInferred(parameters = 0)
@Metadata(m28851d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0015\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001:\u0001%B_\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\u0010\b\u0002\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\n\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\fJ\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\bHÆ\u0003J\u0011\u0010\u001c\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\nHÆ\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\u0003HÆ\u0003Jc\u0010\u001e\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\u0010\b\u0002\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u001f\u001a\u00020 2\b\u0010!\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\"\u001a\u00020#HÖ\u0001J\t\u0010$\u001a\u00020\u0003HÖ\u0001R\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0018\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0018\u0010\u000b\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000eR\u001e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u000eR\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u000e¨\u0006&"}, m28850d2 = {"Lth/co/dtac/android/dtacone/model/appOne/postpaid/submit/OnePostpaidRegistrationResponse;", "", "systemMessage", "", "code", "codeType", "responseDateTime", "data", "Lth/co/dtac/android/dtacone/model/appOne/postpaid/submit/OnePostpaidRegistrationResponse$Data;", "replaceMessage", "", "desc", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lth/co/dtac/android/dtacone/model/appOne/postpaid/submit/OnePostpaidRegistrationResponse$Data;Ljava/util/List;Ljava/lang/String;)V", "getCode", "()Ljava/lang/String;", "getCodeType", "getData", "()Lth/co/dtac/android/dtacone/model/appOne/postpaid/submit/OnePostpaidRegistrationResponse$Data;", "getDesc", "getReplaceMessage", "()Ljava/util/List;", "getResponseDateTime", "getSystemMessage", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "", "other", "hashCode", "", "toString", Constant.BenefitName.Data, "app_prodRelease"}, m28849k = 1, m28848mv = {1, 8, 0}, m28846xi = 48)
/* renamed from: th.co.dtac.android.dtacone.model.appOne.postpaid.submit.OnePostpaidRegistrationResponse */
/* loaded from: classes8.dex */
public final class OnePostpaidRegistrationResponse {
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
    @Metadata(m28851d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003¢\u0006\u0002\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J'\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\bR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0014"}, m28850d2 = {"Lth/co/dtac/android/dtacone/model/appOne/postpaid/submit/OnePostpaidRegistrationResponse$Data;", "", "transactionId", "", "isDupTran", "custNumb", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getCustNumb", "()Ljava/lang/String;", "getTransactionId", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "app_prodRelease"}, m28849k = 1, m28848mv = {1, 8, 0}, m28846xi = 48)
    /* renamed from: th.co.dtac.android.dtacone.model.appOne.postpaid.submit.OnePostpaidRegistrationResponse$Data */
    /* loaded from: classes8.dex */
    public static final class Data {
        public static final int $stable = 0;
        @SerializedName("custNumb")
        @NotNull
        private final String custNumb;
        @SerializedName("isDupTran")
        @NotNull
        private final String isDupTran;
        @SerializedName("transactionId")
        @NotNull
        private final String transactionId;

        public Data() {
            this(null, null, null, 7, null);
        }

        public static /* synthetic */ Data copy$default(Data data, String str, String str2, String str3, int i, Object obj) {
            if ((i & 1) != 0) {
                str = data.transactionId;
            }
            if ((i & 2) != 0) {
                str2 = data.isDupTran;
            }
            if ((i & 4) != 0) {
                str3 = data.custNumb;
            }
            return data.copy(str, str2, str3);
        }

        @NotNull
        public final String component1() {
            return this.transactionId;
        }

        @NotNull
        public final String component2() {
            return this.isDupTran;
        }

        @NotNull
        public final String component3() {
            return this.custNumb;
        }

        @NotNull
        public final Data copy(@NotNull String transactionId, @NotNull String isDupTran, @NotNull String custNumb) {
            Intrinsics.checkNotNullParameter(transactionId, "transactionId");
            Intrinsics.checkNotNullParameter(isDupTran, "isDupTran");
            Intrinsics.checkNotNullParameter(custNumb, "custNumb");
            return new Data(transactionId, isDupTran, custNumb);
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof Data) {
                Data data = (Data) obj;
                return Intrinsics.areEqual(this.transactionId, data.transactionId) && Intrinsics.areEqual(this.isDupTran, data.isDupTran) && Intrinsics.areEqual(this.custNumb, data.custNumb);
            }
            return false;
        }

        @NotNull
        public final String getCustNumb() {
            return this.custNumb;
        }

        @NotNull
        public final String getTransactionId() {
            return this.transactionId;
        }

        public int hashCode() {
            return (((this.transactionId.hashCode() * 31) + this.isDupTran.hashCode()) * 31) + this.custNumb.hashCode();
        }

        @NotNull
        public final String isDupTran() {
            return this.isDupTran;
        }

        @NotNull
        public String toString() {
            String str = this.transactionId;
            String str2 = this.isDupTran;
            String str3 = this.custNumb;
            return "Data(transactionId=" + str + ", isDupTran=" + str2 + ", custNumb=" + str3 + ")";
        }

        public Data(@NotNull String transactionId, @NotNull String isDupTran, @NotNull String custNumb) {
            Intrinsics.checkNotNullParameter(transactionId, "transactionId");
            Intrinsics.checkNotNullParameter(isDupTran, "isDupTran");
            Intrinsics.checkNotNullParameter(custNumb, "custNumb");
            this.transactionId = transactionId;
            this.isDupTran = isDupTran;
            this.custNumb = custNumb;
        }

        public /* synthetic */ Data(String str, String str2, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3);
        }
    }

    public OnePostpaidRegistrationResponse() {
        this(null, null, null, null, null, null, null, 127, null);
    }

    public static /* synthetic */ OnePostpaidRegistrationResponse copy$default(OnePostpaidRegistrationResponse onePostpaidRegistrationResponse, String str, String str2, String str3, String str4, Data data, List list, String str5, int i, Object obj) {
        if ((i & 1) != 0) {
            str = onePostpaidRegistrationResponse.systemMessage;
        }
        if ((i & 2) != 0) {
            str2 = onePostpaidRegistrationResponse.code;
        }
        String str6 = str2;
        if ((i & 4) != 0) {
            str3 = onePostpaidRegistrationResponse.codeType;
        }
        String str7 = str3;
        if ((i & 8) != 0) {
            str4 = onePostpaidRegistrationResponse.responseDateTime;
        }
        String str8 = str4;
        if ((i & 16) != 0) {
            data = onePostpaidRegistrationResponse.data;
        }
        Data data2 = data;
        List<String> list2 = list;
        if ((i & 32) != 0) {
            list2 = onePostpaidRegistrationResponse.replaceMessage;
        }
        List list3 = list2;
        if ((i & 64) != 0) {
            str5 = onePostpaidRegistrationResponse.desc;
        }
        return onePostpaidRegistrationResponse.copy(str, str6, str7, str8, data2, list3, str5);
    }

    @Nullable
    public final String component1() {
        return this.systemMessage;
    }

    @Nullable
    public final String component2() {
        return this.code;
    }

    @Nullable
    public final String component3() {
        return this.codeType;
    }

    @Nullable
    public final String component4() {
        return this.responseDateTime;
    }

    @Nullable
    public final Data component5() {
        return this.data;
    }

    @Nullable
    public final List<String> component6() {
        return this.replaceMessage;
    }

    @Nullable
    public final String component7() {
        return this.desc;
    }

    @NotNull
    public final OnePostpaidRegistrationResponse copy(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable Data data, @Nullable List<String> list, @Nullable String str5) {
        return new OnePostpaidRegistrationResponse(str, str2, str3, str4, data, list, str5);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof OnePostpaidRegistrationResponse) {
            OnePostpaidRegistrationResponse onePostpaidRegistrationResponse = (OnePostpaidRegistrationResponse) obj;
            return Intrinsics.areEqual(this.systemMessage, onePostpaidRegistrationResponse.systemMessage) && Intrinsics.areEqual(this.code, onePostpaidRegistrationResponse.code) && Intrinsics.areEqual(this.codeType, onePostpaidRegistrationResponse.codeType) && Intrinsics.areEqual(this.responseDateTime, onePostpaidRegistrationResponse.responseDateTime) && Intrinsics.areEqual(this.data, onePostpaidRegistrationResponse.data) && Intrinsics.areEqual(this.replaceMessage, onePostpaidRegistrationResponse.replaceMessage) && Intrinsics.areEqual(this.desc, onePostpaidRegistrationResponse.desc);
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
        String str = this.systemMessage;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.code;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.codeType;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.responseDateTime;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Data data = this.data;
        int hashCode5 = (hashCode4 + (data == null ? 0 : data.hashCode())) * 31;
        List<String> list = this.replaceMessage;
        int hashCode6 = (hashCode5 + (list == null ? 0 : list.hashCode())) * 31;
        String str5 = this.desc;
        return hashCode6 + (str5 != null ? str5.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        String str = this.systemMessage;
        String str2 = this.code;
        String str3 = this.codeType;
        String str4 = this.responseDateTime;
        Data data = this.data;
        List<String> list = this.replaceMessage;
        String str5 = this.desc;
        return "OnePostpaidRegistrationResponse(systemMessage=" + str + ", code=" + str2 + ", codeType=" + str3 + ", responseDateTime=" + str4 + ", data=" + data + ", replaceMessage=" + list + ", desc=" + str5 + ")";
    }

    public OnePostpaidRegistrationResponse(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable Data data, @Nullable List<String> list, @Nullable String str5) {
        this.systemMessage = str;
        this.code = str2;
        this.codeType = str3;
        this.responseDateTime = str4;
        this.data = data;
        this.replaceMessage = list;
        this.desc = str5;
    }

    public /* synthetic */ OnePostpaidRegistrationResponse(String str, String str2, String str3, String str4, Data data, List list, String str5, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : data, (i & 32) != 0 ? null : list, (i & 64) != 0 ? null : str5);
    }
}
