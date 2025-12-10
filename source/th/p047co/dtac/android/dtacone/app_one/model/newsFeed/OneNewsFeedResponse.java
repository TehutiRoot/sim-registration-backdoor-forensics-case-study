package th.p047co.dtac.android.dtacone.app_one.model.newsFeed;

import androidx.compose.runtime.internal.StabilityInferred;
import com.google.gson.annotations.SerializedName;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 0)
@Metadata(m28851d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0013\b\u0087\b\u0018\u00002\u00020\u0001Bg\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\u0010\b\u0002\u0010\t\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007\u0012\u0010\b\u0002\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0007\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\f\u0010\rJ\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0012\u0010\u0010\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u000fJ\u0012\u0010\u0011\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u000fJ\u0012\u0010\u0012\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u000fJ\u0018\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0018\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0014J\u0012\u0010\u0016\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u000fJp\u0010\u0017\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00022\u0010\b\u0002\u0010\t\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00072\u0010\b\u0002\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00072\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u000fJ\u0010\u0010\u001b\u001a\u00020\u001aHÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010\u001f\u001a\u00020\u001e2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001f\u0010 R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010\u000fR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b$\u0010\"\u001a\u0004\b%\u0010\u000fR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b&\u0010\"\u001a\u0004\b'\u0010\u000fR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b(\u0010\"\u001a\u0004\b)\u0010\u000fR\"\u0010\t\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b,\u0010\u0014R\"\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b-\u0010+\u001a\u0004\b.\u0010\u0014R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b/\u0010\"\u001a\u0004\b0\u0010\u000f¨\u00061"}, m28850d2 = {"Lth/co/dtac/android/dtacone/app_one/model/newsFeed/OneNewsFeedResponse;", "", "", "systemMessage", "code", "codeType", "responseDateTime", "", "Lth/co/dtac/android/dtacone/app_one/model/newsFeed/OneNewsItem;", "newList", "replaceMessage", "desc", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "component5", "()Ljava/util/List;", "component6", "component7", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/lang/String;)Lth/co/dtac/android/dtacone/app_one/model/newsFeed/OneNewsFeedResponse;", "toString", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", PDPageLabelRange.STYLE_LETTERS_LOWER, "Ljava/lang/String;", "getSystemMessage", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "getCode", OperatorName.CURVE_TO, "getCodeType", "d", "getResponseDateTime", "e", "Ljava/util/List;", "getNewList", OperatorName.FILL_NON_ZERO, "getReplaceMessage", OperatorName.NON_STROKING_GRAY, "getDesc", "app_prodRelease"}, m28849k = 1, m28848mv = {1, 8, 0})
/* renamed from: th.co.dtac.android.dtacone.app_one.model.newsFeed.OneNewsFeedResponse */
/* loaded from: classes7.dex */
public final class OneNewsFeedResponse {
    public static final int $stable = 8;
    @SerializedName("systemMessage")
    @Nullable

    /* renamed from: a */
    private final String f81737a;
    @SerializedName("code")
    @Nullable

    /* renamed from: b */
    private final String f81738b;
    @SerializedName("codeType")
    @Nullable

    /* renamed from: c */
    private final String f81739c;
    @SerializedName("responseDateTime")
    @Nullable

    /* renamed from: d */
    private final String f81740d;
    @SerializedName("data")
    @Nullable

    /* renamed from: e */
    private final List<OneNewsItem> f81741e;
    @SerializedName("replaceMessage")
    @Nullable

    /* renamed from: f */
    private final List<String> f81742f;
    @SerializedName("desc")
    @Nullable

    /* renamed from: g */
    private final String f81743g;

    public OneNewsFeedResponse() {
        this(null, null, null, null, null, null, null, 127, null);
    }

    public static /* synthetic */ OneNewsFeedResponse copy$default(OneNewsFeedResponse oneNewsFeedResponse, String str, String str2, String str3, String str4, List list, List list2, String str5, int i, Object obj) {
        if ((i & 1) != 0) {
            str = oneNewsFeedResponse.f81737a;
        }
        if ((i & 2) != 0) {
            str2 = oneNewsFeedResponse.f81738b;
        }
        String str6 = str2;
        if ((i & 4) != 0) {
            str3 = oneNewsFeedResponse.f81739c;
        }
        String str7 = str3;
        if ((i & 8) != 0) {
            str4 = oneNewsFeedResponse.f81740d;
        }
        String str8 = str4;
        List<OneNewsItem> list3 = list;
        if ((i & 16) != 0) {
            list3 = oneNewsFeedResponse.f81741e;
        }
        List list4 = list3;
        List<String> list5 = list2;
        if ((i & 32) != 0) {
            list5 = oneNewsFeedResponse.f81742f;
        }
        List list6 = list5;
        if ((i & 64) != 0) {
            str5 = oneNewsFeedResponse.f81743g;
        }
        return oneNewsFeedResponse.copy(str, str6, str7, str8, list4, list6, str5);
    }

    @Nullable
    public final String component1() {
        return this.f81737a;
    }

    @Nullable
    public final String component2() {
        return this.f81738b;
    }

    @Nullable
    public final String component3() {
        return this.f81739c;
    }

    @Nullable
    public final String component4() {
        return this.f81740d;
    }

    @Nullable
    public final List<OneNewsItem> component5() {
        return this.f81741e;
    }

    @Nullable
    public final List<String> component6() {
        return this.f81742f;
    }

    @Nullable
    public final String component7() {
        return this.f81743g;
    }

    @NotNull
    public final OneNewsFeedResponse copy(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable List<OneNewsItem> list, @Nullable List<String> list2, @Nullable String str5) {
        return new OneNewsFeedResponse(str, str2, str3, str4, list, list2, str5);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof OneNewsFeedResponse) {
            OneNewsFeedResponse oneNewsFeedResponse = (OneNewsFeedResponse) obj;
            return Intrinsics.areEqual(this.f81737a, oneNewsFeedResponse.f81737a) && Intrinsics.areEqual(this.f81738b, oneNewsFeedResponse.f81738b) && Intrinsics.areEqual(this.f81739c, oneNewsFeedResponse.f81739c) && Intrinsics.areEqual(this.f81740d, oneNewsFeedResponse.f81740d) && Intrinsics.areEqual(this.f81741e, oneNewsFeedResponse.f81741e) && Intrinsics.areEqual(this.f81742f, oneNewsFeedResponse.f81742f) && Intrinsics.areEqual(this.f81743g, oneNewsFeedResponse.f81743g);
        }
        return false;
    }

    @Nullable
    public final String getCode() {
        return this.f81738b;
    }

    @Nullable
    public final String getCodeType() {
        return this.f81739c;
    }

    @Nullable
    public final String getDesc() {
        return this.f81743g;
    }

    @Nullable
    public final List<OneNewsItem> getNewList() {
        return this.f81741e;
    }

    @Nullable
    public final List<String> getReplaceMessage() {
        return this.f81742f;
    }

    @Nullable
    public final String getResponseDateTime() {
        return this.f81740d;
    }

    @Nullable
    public final String getSystemMessage() {
        return this.f81737a;
    }

    public int hashCode() {
        String str = this.f81737a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f81738b;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f81739c;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f81740d;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        List<OneNewsItem> list = this.f81741e;
        int hashCode5 = (hashCode4 + (list == null ? 0 : list.hashCode())) * 31;
        List<String> list2 = this.f81742f;
        int hashCode6 = (hashCode5 + (list2 == null ? 0 : list2.hashCode())) * 31;
        String str5 = this.f81743g;
        return hashCode6 + (str5 != null ? str5.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        String str = this.f81737a;
        String str2 = this.f81738b;
        String str3 = this.f81739c;
        String str4 = this.f81740d;
        List<OneNewsItem> list = this.f81741e;
        List<String> list2 = this.f81742f;
        String str5 = this.f81743g;
        return "OneNewsFeedResponse(systemMessage=" + str + ", code=" + str2 + ", codeType=" + str3 + ", responseDateTime=" + str4 + ", newList=" + list + ", replaceMessage=" + list2 + ", desc=" + str5 + ")";
    }

    public OneNewsFeedResponse(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable List<OneNewsItem> list, @Nullable List<String> list2, @Nullable String str5) {
        this.f81737a = str;
        this.f81738b = str2;
        this.f81739c = str3;
        this.f81740d = str4;
        this.f81741e = list;
        this.f81742f = list2;
        this.f81743g = str5;
    }

    public /* synthetic */ OneNewsFeedResponse(String str, String str2, String str3, String str4, List list, List list2, String str5, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : list, (i & 32) != 0 ? null : list2, (i & 64) != 0 ? null : str5);
    }
}
