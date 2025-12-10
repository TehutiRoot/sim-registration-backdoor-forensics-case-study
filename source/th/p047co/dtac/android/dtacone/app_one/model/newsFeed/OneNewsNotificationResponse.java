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
@Metadata(m28851d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0011\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0014\b\u0087\b\u0018\u00002\u00020\u0001Ba\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\u0010\b\u0002\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\t\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\f\u0010\rJ\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0012\u0010\u0010\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u000fJ\u0012\u0010\u0011\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u000fJ\u0012\u0010\u0012\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u000fJ\u0012\u0010\u0013\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0018\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0012\u0010\u0017\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u000fJj\u0010\u0018\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\u0010\b\u0002\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\t2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u000fJ\u0010\u0010\u001c\u001a\u00020\u001bHÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u001a\u0010 \u001a\u00020\u001f2\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b \u0010!R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010\u000fR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b%\u0010#\u001a\u0004\b&\u0010\u000fR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b'\u0010#\u001a\u0004\b(\u0010\u000fR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b)\u0010#\u001a\u0004\b*\u0010\u000fR\u001c\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b+\u0010,\u001a\u0004\b-\u0010\u0014R\"\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b.\u0010/\u001a\u0004\b0\u0010\u0016R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b1\u0010#\u001a\u0004\b2\u0010\u000f¨\u00063"}, m28850d2 = {"Lth/co/dtac/android/dtacone/app_one/model/newsFeed/OneNewsNotificationResponse;", "", "", "systemMessage", "code", "codeType", "responseDateTime", "Lth/co/dtac/android/dtacone/app_one/model/newsFeed/OneNewsItem;", "data", "", "replaceMessage", "desc", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lth/co/dtac/android/dtacone/app_one/model/newsFeed/OneNewsItem;Ljava/util/List;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "component5", "()Lth/co/dtac/android/dtacone/app_one/model/newsFeed/OneNewsItem;", "component6", "()Ljava/util/List;", "component7", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lth/co/dtac/android/dtacone/app_one/model/newsFeed/OneNewsItem;Ljava/util/List;Ljava/lang/String;)Lth/co/dtac/android/dtacone/app_one/model/newsFeed/OneNewsNotificationResponse;", "toString", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", PDPageLabelRange.STYLE_LETTERS_LOWER, "Ljava/lang/String;", "getSystemMessage", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "getCode", OperatorName.CURVE_TO, "getCodeType", "d", "getResponseDateTime", "e", "Lth/co/dtac/android/dtacone/app_one/model/newsFeed/OneNewsItem;", "getData", OperatorName.FILL_NON_ZERO, "Ljava/util/List;", "getReplaceMessage", OperatorName.NON_STROKING_GRAY, "getDesc", "app_prodRelease"}, m28849k = 1, m28848mv = {1, 8, 0})
/* renamed from: th.co.dtac.android.dtacone.app_one.model.newsFeed.OneNewsNotificationResponse */
/* loaded from: classes7.dex */
public final class OneNewsNotificationResponse {
    public static final int $stable = 8;
    @SerializedName("systemMessage")
    @Nullable

    /* renamed from: a */
    private final String f81778a;
    @SerializedName("code")
    @Nullable

    /* renamed from: b */
    private final String f81779b;
    @SerializedName("codeType")
    @Nullable

    /* renamed from: c */
    private final String f81780c;
    @SerializedName("responseDateTime")
    @Nullable

    /* renamed from: d */
    private final String f81781d;
    @SerializedName("data")
    @Nullable

    /* renamed from: e */
    private final OneNewsItem f81782e;
    @SerializedName("replaceMessage")
    @Nullable

    /* renamed from: f */
    private final List<String> f81783f;
    @SerializedName("desc")
    @Nullable

    /* renamed from: g */
    private final String f81784g;

    public OneNewsNotificationResponse() {
        this(null, null, null, null, null, null, null, 127, null);
    }

    public static /* synthetic */ OneNewsNotificationResponse copy$default(OneNewsNotificationResponse oneNewsNotificationResponse, String str, String str2, String str3, String str4, OneNewsItem oneNewsItem, List list, String str5, int i, Object obj) {
        if ((i & 1) != 0) {
            str = oneNewsNotificationResponse.f81778a;
        }
        if ((i & 2) != 0) {
            str2 = oneNewsNotificationResponse.f81779b;
        }
        String str6 = str2;
        if ((i & 4) != 0) {
            str3 = oneNewsNotificationResponse.f81780c;
        }
        String str7 = str3;
        if ((i & 8) != 0) {
            str4 = oneNewsNotificationResponse.f81781d;
        }
        String str8 = str4;
        if ((i & 16) != 0) {
            oneNewsItem = oneNewsNotificationResponse.f81782e;
        }
        OneNewsItem oneNewsItem2 = oneNewsItem;
        List<String> list2 = list;
        if ((i & 32) != 0) {
            list2 = oneNewsNotificationResponse.f81783f;
        }
        List list3 = list2;
        if ((i & 64) != 0) {
            str5 = oneNewsNotificationResponse.f81784g;
        }
        return oneNewsNotificationResponse.copy(str, str6, str7, str8, oneNewsItem2, list3, str5);
    }

    @Nullable
    public final String component1() {
        return this.f81778a;
    }

    @Nullable
    public final String component2() {
        return this.f81779b;
    }

    @Nullable
    public final String component3() {
        return this.f81780c;
    }

    @Nullable
    public final String component4() {
        return this.f81781d;
    }

    @Nullable
    public final OneNewsItem component5() {
        return this.f81782e;
    }

    @Nullable
    public final List<String> component6() {
        return this.f81783f;
    }

    @Nullable
    public final String component7() {
        return this.f81784g;
    }

    @NotNull
    public final OneNewsNotificationResponse copy(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable OneNewsItem oneNewsItem, @Nullable List<String> list, @Nullable String str5) {
        return new OneNewsNotificationResponse(str, str2, str3, str4, oneNewsItem, list, str5);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof OneNewsNotificationResponse) {
            OneNewsNotificationResponse oneNewsNotificationResponse = (OneNewsNotificationResponse) obj;
            return Intrinsics.areEqual(this.f81778a, oneNewsNotificationResponse.f81778a) && Intrinsics.areEqual(this.f81779b, oneNewsNotificationResponse.f81779b) && Intrinsics.areEqual(this.f81780c, oneNewsNotificationResponse.f81780c) && Intrinsics.areEqual(this.f81781d, oneNewsNotificationResponse.f81781d) && Intrinsics.areEqual(this.f81782e, oneNewsNotificationResponse.f81782e) && Intrinsics.areEqual(this.f81783f, oneNewsNotificationResponse.f81783f) && Intrinsics.areEqual(this.f81784g, oneNewsNotificationResponse.f81784g);
        }
        return false;
    }

    @Nullable
    public final String getCode() {
        return this.f81779b;
    }

    @Nullable
    public final String getCodeType() {
        return this.f81780c;
    }

    @Nullable
    public final OneNewsItem getData() {
        return this.f81782e;
    }

    @Nullable
    public final String getDesc() {
        return this.f81784g;
    }

    @Nullable
    public final List<String> getReplaceMessage() {
        return this.f81783f;
    }

    @Nullable
    public final String getResponseDateTime() {
        return this.f81781d;
    }

    @Nullable
    public final String getSystemMessage() {
        return this.f81778a;
    }

    public int hashCode() {
        String str = this.f81778a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f81779b;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f81780c;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f81781d;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        OneNewsItem oneNewsItem = this.f81782e;
        int hashCode5 = (hashCode4 + (oneNewsItem == null ? 0 : oneNewsItem.hashCode())) * 31;
        List<String> list = this.f81783f;
        int hashCode6 = (hashCode5 + (list == null ? 0 : list.hashCode())) * 31;
        String str5 = this.f81784g;
        return hashCode6 + (str5 != null ? str5.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        String str = this.f81778a;
        String str2 = this.f81779b;
        String str3 = this.f81780c;
        String str4 = this.f81781d;
        OneNewsItem oneNewsItem = this.f81782e;
        List<String> list = this.f81783f;
        String str5 = this.f81784g;
        return "OneNewsNotificationResponse(systemMessage=" + str + ", code=" + str2 + ", codeType=" + str3 + ", responseDateTime=" + str4 + ", data=" + oneNewsItem + ", replaceMessage=" + list + ", desc=" + str5 + ")";
    }

    public OneNewsNotificationResponse(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable OneNewsItem oneNewsItem, @Nullable List<String> list, @Nullable String str5) {
        this.f81778a = str;
        this.f81779b = str2;
        this.f81780c = str3;
        this.f81781d = str4;
        this.f81782e = oneNewsItem;
        this.f81783f = list;
        this.f81784g = str5;
    }

    public /* synthetic */ OneNewsNotificationResponse(String str, String str2, String str3, String str4, OneNewsItem oneNewsItem, List list, String str5, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : oneNewsItem, (i & 32) != 0 ? null : list, (i & 64) != 0 ? null : str5);
    }
}
