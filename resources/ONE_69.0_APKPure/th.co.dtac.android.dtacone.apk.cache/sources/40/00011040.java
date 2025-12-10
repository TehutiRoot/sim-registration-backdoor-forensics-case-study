package th.p047co.dtac.android.dtacone.app_one.model.channel;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.core.app.NotificationCompat;
import com.google.gson.annotations.SerializedName;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import th.p047co.dtac.android.dtacone.util.Constant;

@StabilityInferred(parameters = 0)
@Metadata(m29143d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0011\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0014\b\u0087\b\u0018\u00002\u00020\u0001:\u00010Bi\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0007\u0012\u0012\b\u0002\u0010\t\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0018\u00010\u0007\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0012\u0010\r\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0012\u0010\u000f\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u000eJ\u0012\u0010\u0010\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u000eJ\u0012\u0010\u0011\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u000eJ\u0018\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0014\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0013J\u0012\u0010\u0015\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u000eJr\u0010\u0016\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00022\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00072\u0012\b\u0002\u0010\t\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0018\u00010\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u000eJ\u0010\u0010\u001a\u001a\u00020\u0019HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u001a\u0010\u001e\u001a\u00020\u001d2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001e\u0010\u001fR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010\u000eR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b#\u0010!\u001a\u0004\b$\u0010\u000eR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b%\u0010!\u001a\u0004\b&\u0010\u000eR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b'\u0010!\u001a\u0004\b(\u0010\u000eR\"\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b+\u0010\u0013R$\u0010\t\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b,\u0010*\u001a\u0004\b-\u0010\u0013R\u001c\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b.\u0010!\u001a\u0004\b/\u0010\u000e¨\u00061"}, m29142d2 = {"Lth/co/dtac/android/dtacone/app_one/model/channel/OneChannelTopicResponse;", "", "", "systemMessage", "code", "codeType", "responseDateTime", "", "dataList", "replaceMessage", "desc", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "component5", "()Ljava/util/List;", "component6", "component7", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/lang/String;)Lth/co/dtac/android/dtacone/app_one/model/channel/OneChannelTopicResponse;", "toString", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", PDPageLabelRange.STYLE_LETTERS_LOWER, "Ljava/lang/String;", "getSystemMessage", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "getCode", OperatorName.CURVE_TO, "getCodeType", "d", "getResponseDateTime", "e", "Ljava/util/List;", "getDataList", OperatorName.FILL_NON_ZERO, "getReplaceMessage", OperatorName.NON_STROKING_GRAY, "getDesc", Constant.BenefitName.Data, "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0})
/* renamed from: th.co.dtac.android.dtacone.app_one.model.channel.OneChannelTopicResponse */
/* loaded from: classes7.dex */
public final class OneChannelTopicResponse {
    public static final int $stable = 8;
    @SerializedName("systemMessage")
    @Nullable

    /* renamed from: a */
    private final String f81697a;
    @SerializedName("code")
    @Nullable

    /* renamed from: b */
    private final String f81698b;
    @SerializedName("codeType")
    @Nullable

    /* renamed from: c */
    private final String f81699c;
    @SerializedName("responseDateTime")
    @Nullable

    /* renamed from: d */
    private final String f81700d;
    @SerializedName("data")
    @Nullable

    /* renamed from: e */
    private final List<String> f81701e;
    @SerializedName("replaceMessage")
    @Nullable

    /* renamed from: f */
    private final List<String> f81702f;
    @SerializedName("desc")
    @Nullable

    /* renamed from: g */
    private final String f81703g;

    @StabilityInferred(parameters = 0)
    @Metadata(m29143d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u0013\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001c\u0010\b\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\n\u0010\u0007J\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0007¨\u0006\u0015"}, m29142d2 = {"Lth/co/dtac/android/dtacone/app_one/model/channel/OneChannelTopicResponse$Data;", "", "", NotificationCompat.CATEGORY_STATUS, "<init>", "(Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lth/co/dtac/android/dtacone/app_one/model/channel/OneChannelTopicResponse$Data;", "toString", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", PDPageLabelRange.STYLE_LETTERS_LOWER, "Ljava/lang/String;", "getStatus", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0})
    /* renamed from: th.co.dtac.android.dtacone.app_one.model.channel.OneChannelTopicResponse$Data */
    /* loaded from: classes7.dex */
    public static final class Data {
        public static final int $stable = 0;
        @SerializedName(NotificationCompat.CATEGORY_STATUS)
        @Nullable

        /* renamed from: a */
        private final String f81704a;

        public Data() {
            this(null, 1, null);
        }

        public static /* synthetic */ Data copy$default(Data data, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = data.f81704a;
            }
            return data.copy(str);
        }

        @Nullable
        public final String component1() {
            return this.f81704a;
        }

        @NotNull
        public final Data copy(@Nullable String str) {
            return new Data(str);
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Data) && Intrinsics.areEqual(this.f81704a, ((Data) obj).f81704a);
        }

        @Nullable
        public final String getStatus() {
            return this.f81704a;
        }

        public int hashCode() {
            String str = this.f81704a;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        @NotNull
        public String toString() {
            String str = this.f81704a;
            return "Data(status=" + str + ")";
        }

        public Data(@Nullable String str) {
            this.f81704a = str;
        }

        public /* synthetic */ Data(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : str);
        }
    }

    public OneChannelTopicResponse() {
        this(null, null, null, null, null, null, null, 127, null);
    }

    public static /* synthetic */ OneChannelTopicResponse copy$default(OneChannelTopicResponse oneChannelTopicResponse, String str, String str2, String str3, String str4, List list, List list2, String str5, int i, Object obj) {
        if ((i & 1) != 0) {
            str = oneChannelTopicResponse.f81697a;
        }
        if ((i & 2) != 0) {
            str2 = oneChannelTopicResponse.f81698b;
        }
        String str6 = str2;
        if ((i & 4) != 0) {
            str3 = oneChannelTopicResponse.f81699c;
        }
        String str7 = str3;
        if ((i & 8) != 0) {
            str4 = oneChannelTopicResponse.f81700d;
        }
        String str8 = str4;
        List<String> list3 = list;
        if ((i & 16) != 0) {
            list3 = oneChannelTopicResponse.f81701e;
        }
        List list4 = list3;
        List<String> list5 = list2;
        if ((i & 32) != 0) {
            list5 = oneChannelTopicResponse.f81702f;
        }
        List list6 = list5;
        if ((i & 64) != 0) {
            str5 = oneChannelTopicResponse.f81703g;
        }
        return oneChannelTopicResponse.copy(str, str6, str7, str8, list4, list6, str5);
    }

    @Nullable
    public final String component1() {
        return this.f81697a;
    }

    @Nullable
    public final String component2() {
        return this.f81698b;
    }

    @Nullable
    public final String component3() {
        return this.f81699c;
    }

    @Nullable
    public final String component4() {
        return this.f81700d;
    }

    @Nullable
    public final List<String> component5() {
        return this.f81701e;
    }

    @Nullable
    public final List<String> component6() {
        return this.f81702f;
    }

    @Nullable
    public final String component7() {
        return this.f81703g;
    }

    @NotNull
    public final OneChannelTopicResponse copy(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable List<String> list, @Nullable List<String> list2, @Nullable String str5) {
        return new OneChannelTopicResponse(str, str2, str3, str4, list, list2, str5);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof OneChannelTopicResponse) {
            OneChannelTopicResponse oneChannelTopicResponse = (OneChannelTopicResponse) obj;
            return Intrinsics.areEqual(this.f81697a, oneChannelTopicResponse.f81697a) && Intrinsics.areEqual(this.f81698b, oneChannelTopicResponse.f81698b) && Intrinsics.areEqual(this.f81699c, oneChannelTopicResponse.f81699c) && Intrinsics.areEqual(this.f81700d, oneChannelTopicResponse.f81700d) && Intrinsics.areEqual(this.f81701e, oneChannelTopicResponse.f81701e) && Intrinsics.areEqual(this.f81702f, oneChannelTopicResponse.f81702f) && Intrinsics.areEqual(this.f81703g, oneChannelTopicResponse.f81703g);
        }
        return false;
    }

    @Nullable
    public final String getCode() {
        return this.f81698b;
    }

    @Nullable
    public final String getCodeType() {
        return this.f81699c;
    }

    @Nullable
    public final List<String> getDataList() {
        return this.f81701e;
    }

    @Nullable
    public final String getDesc() {
        return this.f81703g;
    }

    @Nullable
    public final List<String> getReplaceMessage() {
        return this.f81702f;
    }

    @Nullable
    public final String getResponseDateTime() {
        return this.f81700d;
    }

    @Nullable
    public final String getSystemMessage() {
        return this.f81697a;
    }

    public int hashCode() {
        String str = this.f81697a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f81698b;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f81699c;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f81700d;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        List<String> list = this.f81701e;
        int hashCode5 = (hashCode4 + (list == null ? 0 : list.hashCode())) * 31;
        List<String> list2 = this.f81702f;
        int hashCode6 = (hashCode5 + (list2 == null ? 0 : list2.hashCode())) * 31;
        String str5 = this.f81703g;
        return hashCode6 + (str5 != null ? str5.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        String str = this.f81697a;
        String str2 = this.f81698b;
        String str3 = this.f81699c;
        String str4 = this.f81700d;
        List<String> list = this.f81701e;
        List<String> list2 = this.f81702f;
        String str5 = this.f81703g;
        return "OneChannelTopicResponse(systemMessage=" + str + ", code=" + str2 + ", codeType=" + str3 + ", responseDateTime=" + str4 + ", dataList=" + list + ", replaceMessage=" + list2 + ", desc=" + str5 + ")";
    }

    public OneChannelTopicResponse(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable List<String> list, @Nullable List<String> list2, @Nullable String str5) {
        this.f81697a = str;
        this.f81698b = str2;
        this.f81699c = str3;
        this.f81700d = str4;
        this.f81701e = list;
        this.f81702f = list2;
        this.f81703g = str5;
    }

    public /* synthetic */ OneChannelTopicResponse(String str, String str2, String str3, String str4, List list, List list2, String str5, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : list, (i & 32) != 0 ? null : list2, (i & 64) != 0 ? null : str5);
    }
}