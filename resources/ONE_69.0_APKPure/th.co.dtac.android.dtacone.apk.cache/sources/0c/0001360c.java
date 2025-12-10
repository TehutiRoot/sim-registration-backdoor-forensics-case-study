package th.p047co.dtac.android.dtacone.view.appOne.ownerManagement.model.response;

import androidx.compose.runtime.internal.StabilityInferred;
import com.google.gson.annotations.SerializedName;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 0)
@Metadata(m29143d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0013\b\u0087\b\u0018\u00002\u00020\u0001BK\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00010\u0005\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\u0006\u0010\u000b\u001a\u00020\u0002¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u000fJ\u0016\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u000fJ\u0016\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00010\u0005HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0012J\u0010\u0010\u0015\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u000fJ\u0010\u0010\u0016\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u000fJb\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\b\b\u0002\u0010\b\u001a\u00020\u00022\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00010\u00052\b\b\u0002\u0010\n\u001a\u00020\u00022\b\b\u0002\u0010\u000b\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u000fJ\u0010\u0010\u001b\u001a\u00020\u001aHÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010\u001f\u001a\u00020\u001e2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001f\u0010 R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010\u000fR\u001a\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b$\u0010\"\u001a\u0004\b%\u0010\u000fR \u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010\u0012R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b)\u0010\"\u001a\u0004\b*\u0010\u000fR \u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b+\u0010'\u001a\u0004\b,\u0010\u0012R\u001a\u0010\n\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b-\u0010\"\u001a\u0004\b.\u0010\u000fR\u001a\u0010\u000b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b/\u0010\"\u001a\u0004\b0\u0010\u000f¨\u00061"}, m29142d2 = {"Lth/co/dtac/android/dtacone/view/appOne/ownerManagement/model/response/OneOwnerTransactionResponse;", "", "", "code", "codeType", "", "Lth/co/dtac/android/dtacone/view/appOne/ownerManagement/model/response/OneOwnerTransactionDataResponse;", "data", "desc", "replaceMessage", "responseDateTime", "systemMessage", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "()Ljava/util/List;", "component4", "component5", "component6", "component7", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;)Lth/co/dtac/android/dtacone/view/appOne/ownerManagement/model/response/OneOwnerTransactionResponse;", "toString", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", PDPageLabelRange.STYLE_LETTERS_LOWER, "Ljava/lang/String;", "getCode", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "getCodeType", OperatorName.CURVE_TO, "Ljava/util/List;", "getData", "d", "getDesc", "e", "getReplaceMessage", OperatorName.FILL_NON_ZERO, "getResponseDateTime", OperatorName.NON_STROKING_GRAY, "getSystemMessage", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0})
/* renamed from: th.co.dtac.android.dtacone.view.appOne.ownerManagement.model.response.OneOwnerTransactionResponse */
/* loaded from: classes10.dex */
public final class OneOwnerTransactionResponse {
    public static final int $stable = 8;
    @SerializedName("code")
    @NotNull

    /* renamed from: a */
    private final String f93144a;
    @SerializedName("codeType")
    @NotNull

    /* renamed from: b */
    private final String f93145b;
    @SerializedName("data")
    @NotNull

    /* renamed from: c */
    private final List<OneOwnerTransactionDataResponse> f93146c;
    @SerializedName("desc")
    @NotNull

    /* renamed from: d */
    private final String f93147d;
    @SerializedName("replaceMessage")
    @NotNull

    /* renamed from: e */
    private final List<Object> f93148e;
    @SerializedName("responseDateTime")
    @NotNull

    /* renamed from: f */
    private final String f93149f;
    @SerializedName("systemMessage")
    @NotNull

    /* renamed from: g */
    private final String f93150g;

    public OneOwnerTransactionResponse(@NotNull String code, @NotNull String codeType, @NotNull List<OneOwnerTransactionDataResponse> data, @NotNull String desc, @NotNull List<? extends Object> replaceMessage, @NotNull String responseDateTime, @NotNull String systemMessage) {
        Intrinsics.checkNotNullParameter(code, "code");
        Intrinsics.checkNotNullParameter(codeType, "codeType");
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(desc, "desc");
        Intrinsics.checkNotNullParameter(replaceMessage, "replaceMessage");
        Intrinsics.checkNotNullParameter(responseDateTime, "responseDateTime");
        Intrinsics.checkNotNullParameter(systemMessage, "systemMessage");
        this.f93144a = code;
        this.f93145b = codeType;
        this.f93146c = data;
        this.f93147d = desc;
        this.f93148e = replaceMessage;
        this.f93149f = responseDateTime;
        this.f93150g = systemMessage;
    }

    public static /* synthetic */ OneOwnerTransactionResponse copy$default(OneOwnerTransactionResponse oneOwnerTransactionResponse, String str, String str2, List list, String str3, List list2, String str4, String str5, int i, Object obj) {
        if ((i & 1) != 0) {
            str = oneOwnerTransactionResponse.f93144a;
        }
        if ((i & 2) != 0) {
            str2 = oneOwnerTransactionResponse.f93145b;
        }
        String str6 = str2;
        List<OneOwnerTransactionDataResponse> list3 = list;
        if ((i & 4) != 0) {
            list3 = oneOwnerTransactionResponse.f93146c;
        }
        List list4 = list3;
        if ((i & 8) != 0) {
            str3 = oneOwnerTransactionResponse.f93147d;
        }
        String str7 = str3;
        List<Object> list5 = list2;
        if ((i & 16) != 0) {
            list5 = oneOwnerTransactionResponse.f93148e;
        }
        List list6 = list5;
        if ((i & 32) != 0) {
            str4 = oneOwnerTransactionResponse.f93149f;
        }
        String str8 = str4;
        if ((i & 64) != 0) {
            str5 = oneOwnerTransactionResponse.f93150g;
        }
        return oneOwnerTransactionResponse.copy(str, str6, list4, str7, list6, str8, str5);
    }

    @NotNull
    public final String component1() {
        return this.f93144a;
    }

    @NotNull
    public final String component2() {
        return this.f93145b;
    }

    @NotNull
    public final List<OneOwnerTransactionDataResponse> component3() {
        return this.f93146c;
    }

    @NotNull
    public final String component4() {
        return this.f93147d;
    }

    @NotNull
    public final List<Object> component5() {
        return this.f93148e;
    }

    @NotNull
    public final String component6() {
        return this.f93149f;
    }

    @NotNull
    public final String component7() {
        return this.f93150g;
    }

    @NotNull
    public final OneOwnerTransactionResponse copy(@NotNull String code, @NotNull String codeType, @NotNull List<OneOwnerTransactionDataResponse> data, @NotNull String desc, @NotNull List<? extends Object> replaceMessage, @NotNull String responseDateTime, @NotNull String systemMessage) {
        Intrinsics.checkNotNullParameter(code, "code");
        Intrinsics.checkNotNullParameter(codeType, "codeType");
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(desc, "desc");
        Intrinsics.checkNotNullParameter(replaceMessage, "replaceMessage");
        Intrinsics.checkNotNullParameter(responseDateTime, "responseDateTime");
        Intrinsics.checkNotNullParameter(systemMessage, "systemMessage");
        return new OneOwnerTransactionResponse(code, codeType, data, desc, replaceMessage, responseDateTime, systemMessage);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof OneOwnerTransactionResponse) {
            OneOwnerTransactionResponse oneOwnerTransactionResponse = (OneOwnerTransactionResponse) obj;
            return Intrinsics.areEqual(this.f93144a, oneOwnerTransactionResponse.f93144a) && Intrinsics.areEqual(this.f93145b, oneOwnerTransactionResponse.f93145b) && Intrinsics.areEqual(this.f93146c, oneOwnerTransactionResponse.f93146c) && Intrinsics.areEqual(this.f93147d, oneOwnerTransactionResponse.f93147d) && Intrinsics.areEqual(this.f93148e, oneOwnerTransactionResponse.f93148e) && Intrinsics.areEqual(this.f93149f, oneOwnerTransactionResponse.f93149f) && Intrinsics.areEqual(this.f93150g, oneOwnerTransactionResponse.f93150g);
        }
        return false;
    }

    @NotNull
    public final String getCode() {
        return this.f93144a;
    }

    @NotNull
    public final String getCodeType() {
        return this.f93145b;
    }

    @NotNull
    public final List<OneOwnerTransactionDataResponse> getData() {
        return this.f93146c;
    }

    @NotNull
    public final String getDesc() {
        return this.f93147d;
    }

    @NotNull
    public final List<Object> getReplaceMessage() {
        return this.f93148e;
    }

    @NotNull
    public final String getResponseDateTime() {
        return this.f93149f;
    }

    @NotNull
    public final String getSystemMessage() {
        return this.f93150g;
    }

    public int hashCode() {
        return (((((((((((this.f93144a.hashCode() * 31) + this.f93145b.hashCode()) * 31) + this.f93146c.hashCode()) * 31) + this.f93147d.hashCode()) * 31) + this.f93148e.hashCode()) * 31) + this.f93149f.hashCode()) * 31) + this.f93150g.hashCode();
    }

    @NotNull
    public String toString() {
        String str = this.f93144a;
        String str2 = this.f93145b;
        List<OneOwnerTransactionDataResponse> list = this.f93146c;
        String str3 = this.f93147d;
        List<Object> list2 = this.f93148e;
        String str4 = this.f93149f;
        String str5 = this.f93150g;
        return "OneOwnerTransactionResponse(code=" + str + ", codeType=" + str2 + ", data=" + list + ", desc=" + str3 + ", replaceMessage=" + list2 + ", responseDateTime=" + str4 + ", systemMessage=" + str5 + ")";
    }
}