package th.p047co.dtac.android.dtacone.app_one.model.newsFeed;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.core.app.NotificationCompat;
import com.google.api.client.googleapis.media.MediaHttpDownloader;
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
@Metadata(m29143d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0011\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0015\b\u0087\b\u0018\u00002\u00020\u0001:\u00013Ba\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\u0010\b\u0002\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\t\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\f\u0010\rJ\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0012\u0010\u0010\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u000fJ\u0012\u0010\u0011\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u000fJ\u0012\u0010\u0012\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u000fJ\u0012\u0010\u0013\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0018\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0012\u0010\u0017\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u000fJj\u0010\u0018\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\u0010\b\u0002\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\t2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u000fJ\u0010\u0010\u001c\u001a\u00020\u001bHÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u001a\u0010 \u001a\u00020\u001f2\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b \u0010!R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010\u000fR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b%\u0010#\u001a\u0004\b&\u0010\u000fR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b'\u0010#\u001a\u0004\b(\u0010\u000fR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b)\u0010#\u001a\u0004\b*\u0010\u000fR\u001c\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b+\u0010,\u001a\u0004\b-\u0010\u0014R\"\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b.\u0010/\u001a\u0004\b0\u0010\u0016R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b1\u0010#\u001a\u0004\b2\u0010\u000f¨\u00064"}, m29142d2 = {"Lth/co/dtac/android/dtacone/app_one/model/newsFeed/OneLikeNewsResponse;", "", "", "systemMessage", "code", "codeType", "responseDateTime", "Lth/co/dtac/android/dtacone/app_one/model/newsFeed/OneLikeNewsResponse$Data;", "data", "", "replaceMessage", "desc", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lth/co/dtac/android/dtacone/app_one/model/newsFeed/OneLikeNewsResponse$Data;Ljava/util/List;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "component5", "()Lth/co/dtac/android/dtacone/app_one/model/newsFeed/OneLikeNewsResponse$Data;", "component6", "()Ljava/util/List;", "component7", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lth/co/dtac/android/dtacone/app_one/model/newsFeed/OneLikeNewsResponse$Data;Ljava/util/List;Ljava/lang/String;)Lth/co/dtac/android/dtacone/app_one/model/newsFeed/OneLikeNewsResponse;", "toString", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", PDPageLabelRange.STYLE_LETTERS_LOWER, "Ljava/lang/String;", "getSystemMessage", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "getCode", OperatorName.CURVE_TO, "getCodeType", "d", "getResponseDateTime", "e", "Lth/co/dtac/android/dtacone/app_one/model/newsFeed/OneLikeNewsResponse$Data;", "getData", OperatorName.FILL_NON_ZERO, "Ljava/util/List;", "getReplaceMessage", OperatorName.NON_STROKING_GRAY, "getDesc", Constant.BenefitName.Data, "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0})
/* renamed from: th.co.dtac.android.dtacone.app_one.model.newsFeed.OneLikeNewsResponse */
/* loaded from: classes7.dex */
public final class OneLikeNewsResponse {
    public static final int $stable = 8;
    @SerializedName("systemMessage")
    @Nullable

    /* renamed from: a */
    private final String f81795a;
    @SerializedName("code")
    @Nullable

    /* renamed from: b */
    private final String f81796b;
    @SerializedName("codeType")
    @Nullable

    /* renamed from: c */
    private final String f81797c;
    @SerializedName("responseDateTime")
    @Nullable

    /* renamed from: d */
    private final String f81798d;
    @SerializedName("data")
    @Nullable

    /* renamed from: e */
    private final Data f81799e;
    @SerializedName("replaceMessage")
    @Nullable

    /* renamed from: f */
    private final List<String> f81800f;
    @SerializedName("desc")
    @Nullable

    /* renamed from: g */
    private final String f81801g;

    @StabilityInferred(parameters = 0)
    @Metadata(m29143d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0017B\u0013\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001c\u0010\b\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007¨\u0006\u0018"}, m29142d2 = {"Lth/co/dtac/android/dtacone/app_one/model/newsFeed/OneLikeNewsResponse$Data;", "", "Lth/co/dtac/android/dtacone/app_one/model/newsFeed/OneLikeNewsResponse$Data$News;", "news", "<init>", "(Lth/co/dtac/android/dtacone/app_one/model/newsFeed/OneLikeNewsResponse$Data$News;)V", "component1", "()Lth/co/dtac/android/dtacone/app_one/model/newsFeed/OneLikeNewsResponse$Data$News;", "copy", "(Lth/co/dtac/android/dtacone/app_one/model/newsFeed/OneLikeNewsResponse$Data$News;)Lth/co/dtac/android/dtacone/app_one/model/newsFeed/OneLikeNewsResponse$Data;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", PDPageLabelRange.STYLE_LETTERS_LOWER, "Lth/co/dtac/android/dtacone/app_one/model/newsFeed/OneLikeNewsResponse$Data$News;", "getNews", "News", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0})
    /* renamed from: th.co.dtac.android.dtacone.app_one.model.newsFeed.OneLikeNewsResponse$Data */
    /* loaded from: classes7.dex */
    public static final class Data {
        public static final int $stable = 8;
        @SerializedName("news")
        @Nullable

        /* renamed from: a */
        private final News f81802a;

        @StabilityInferred(parameters = 0)
        @Metadata(m29143d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\bp\b\u0087\b\u0018\u00002\u00020\u0001B¿\u0002\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0001\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u001f\u0010 J\u0012\u0010!\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b!\u0010\"J\u0012\u0010#\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b#\u0010$J\u0012\u0010%\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b%\u0010$J\u0012\u0010&\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b&\u0010\"J\u0012\u0010'\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b'\u0010$J\u0012\u0010(\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b(\u0010$J\u0012\u0010)\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b)\u0010$J\u0012\u0010*\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b*\u0010$J\u0012\u0010+\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b+\u0010\"J\u0012\u0010,\u001a\u0004\u0018\u00010\rHÆ\u0003¢\u0006\u0004\b,\u0010-J\u0012\u0010.\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b.\u0010$J\u0012\u0010/\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b/\u0010\"J\u0012\u00100\u001a\u0004\u0018\u00010\rHÆ\u0003¢\u0006\u0004\b0\u0010-J\u0012\u00101\u001a\u0004\u0018\u00010\rHÆ\u0003¢\u0006\u0004\b1\u0010-J\u0012\u00102\u001a\u0004\u0018\u00010\u0001HÆ\u0003¢\u0006\u0004\b2\u00103J\u0012\u00104\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b4\u0010\"J\u0012\u00105\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b5\u0010$J\u0012\u00106\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b6\u0010$J\u0012\u00107\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b7\u0010$J\u0012\u00108\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b8\u0010$J\u0012\u00109\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b9\u0010$J\u0012\u0010:\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b:\u0010$J\u0012\u0010;\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b;\u0010$J\u0012\u0010<\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b<\u0010$J\u0012\u0010=\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b=\u0010$J\u0012\u0010>\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b>\u0010$JÈ\u0002\u0010?\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b?\u0010@J\u0010\u0010A\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\bA\u0010$J\u0010\u0010B\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\bB\u0010CJ\u001a\u0010E\u001a\u00020\r2\b\u0010D\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\bE\u0010FR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\bG\u0010H\u001a\u0004\bI\u0010\"R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\bJ\u0010K\u001a\u0004\bL\u0010$R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\bM\u0010K\u001a\u0004\bN\u0010$R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\bO\u0010H\u001a\u0004\bP\u0010\"R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\bQ\u0010K\u001a\u0004\bR\u0010$R\u001c\u0010\t\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\bS\u0010K\u001a\u0004\bT\u0010$R\u001c\u0010\n\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\bU\u0010K\u001a\u0004\bV\u0010$R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\bW\u0010K\u001a\u0004\bX\u0010$R\u001c\u0010\f\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\bY\u0010H\u001a\u0004\bZ\u0010\"R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b[\u0010\\\u001a\u0004\b\u000e\u0010-R\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b]\u0010K\u001a\u0004\b^\u0010$R\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b_\u0010H\u001a\u0004\b`\u0010\"R\u001c\u0010\u0011\u001a\u0004\u0018\u00010\r8\u0006X\u0087\u0004¢\u0006\f\n\u0004\ba\u0010\\\u001a\u0004\b\u0011\u0010-R\u001c\u0010\u0012\u001a\u0004\u0018\u00010\r8\u0006X\u0087\u0004¢\u0006\f\n\u0004\bb\u0010\\\u001a\u0004\bc\u0010-R\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u00018\u0006X\u0087\u0004¢\u0006\f\n\u0004\bd\u0010e\u001a\u0004\bf\u00103R\u001c\u0010\u0014\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\bg\u0010H\u001a\u0004\bh\u0010\"R\u001c\u0010\u0015\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\bi\u0010K\u001a\u0004\bj\u0010$R\u001c\u0010\u0016\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\bk\u0010K\u001a\u0004\bl\u0010$R\u001c\u0010\u0017\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\bm\u0010K\u001a\u0004\bn\u0010$R\u001c\u0010\u0018\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\bo\u0010K\u001a\u0004\bp\u0010$R\u001c\u0010\u0019\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\bq\u0010K\u001a\u0004\br\u0010$R\u001c\u0010\u001a\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\bs\u0010K\u001a\u0004\bt\u0010$R\u001c\u0010\u001b\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\bu\u0010K\u001a\u0004\bv\u0010$R\u001c\u0010\u001c\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\bw\u0010K\u001a\u0004\bx\u0010$R\u001c\u0010\u001d\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\by\u0010K\u001a\u0004\bz\u0010$R\u001c\u0010\u001e\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b{\u0010K\u001a\u0004\b|\u0010$¨\u0006}"}, m29142d2 = {"Lth/co/dtac/android/dtacone/app_one/model/newsFeed/OneLikeNewsResponse$Data$News;", "", "", "saved", "", "publisherCode", "expiredDate", "screenshotWidth", "channel", "screenshot", "type", "content", "liked", "", "isAllowedRetailer", "zone", "viewed", "isSentNotification", "scheduleFlag", "updatedBy", "screenshotHeight", "uri", "newsId", "targetApp", "publishType", "createdBy", "topic", "createdDate", "updatedDate", "effectiveDate", NotificationCompat.CATEGORY_STATUS, "<init>", "(Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Object;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/Integer;", "component2", "()Ljava/lang/String;", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "()Ljava/lang/Boolean;", "component11", "component12", "component13", "component14", "component15", "()Ljava/lang/Object;", "component16", "component17", "component18", "component19", "component20", "component21", "component22", "component23", "component24", "component25", "component26", "copy", "(Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Object;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lth/co/dtac/android/dtacone/app_one/model/newsFeed/OneLikeNewsResponse$Data$News;", "toString", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", PDPageLabelRange.STYLE_LETTERS_LOWER, "Ljava/lang/Integer;", "getSaved", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "Ljava/lang/String;", "getPublisherCode", OperatorName.CURVE_TO, "getExpiredDate", "d", "getScreenshotWidth", "e", "getChannel", OperatorName.FILL_NON_ZERO, "getScreenshot", OperatorName.NON_STROKING_GRAY, "getType", OperatorName.CLOSE_PATH, "getContent", "i", "getLiked", OperatorName.SET_LINE_JOINSTYLE, "Ljava/lang/Boolean;", OperatorName.NON_STROKING_CMYK, "getZone", OperatorName.LINE_TO, "getViewed", OperatorName.MOVE_TO, OperatorName.ENDPATH, "getScheduleFlag", "o", "Ljava/lang/Object;", "getUpdatedBy", "p", "getScreenshotHeight", OperatorName.SAVE, "getUri", PDPageLabelRange.STYLE_ROMAN_LOWER, "getNewsId", OperatorName.CLOSE_AND_STROKE, "getTargetApp", "t", "getPublishType", "u", "getCreatedBy", OperatorName.CURVE_TO_REPLICATE_INITIAL_POINT, "getTopic", OperatorName.SET_LINE_WIDTH, "getCreatedDate", "x", "getUpdatedDate", OperatorName.CURVE_TO_REPLICATE_FINAL_POINT, "getEffectiveDate", "z", "getStatus", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0})
        /* renamed from: th.co.dtac.android.dtacone.app_one.model.newsFeed.OneLikeNewsResponse$Data$News */
        /* loaded from: classes7.dex */
        public static final class News {
            public static final int $stable = 8;
            @SerializedName("saved")
            @Nullable

            /* renamed from: a */
            private final Integer f81803a;
            @SerializedName("publisherCode")
            @Nullable

            /* renamed from: b */
            private final String f81804b;
            @SerializedName("expiredDate")
            @Nullable

            /* renamed from: c */
            private final String f81805c;
            @SerializedName("screenshotWidth")
            @Nullable

            /* renamed from: d */
            private final Integer f81806d;
            @SerializedName("channel")
            @Nullable

            /* renamed from: e */
            private final String f81807e;
            @SerializedName("screenshot")
            @Nullable

            /* renamed from: f */
            private final String f81808f;
            @SerializedName("type")
            @Nullable

            /* renamed from: g */
            private final String f81809g;
            @SerializedName("content")
            @Nullable

            /* renamed from: h */
            private final String f81810h;
            @SerializedName("liked")
            @Nullable

            /* renamed from: i */
            private final Integer f81811i;
            @SerializedName("isAllowedRetailer")
            @Nullable

            /* renamed from: j */
            private final Boolean f81812j;
            @SerializedName("zone")
            @Nullable

            /* renamed from: k */
            private final String f81813k;
            @SerializedName("viewed")
            @Nullable

            /* renamed from: l */
            private final Integer f81814l;
            @SerializedName("isSentNotification")
            @Nullable

            /* renamed from: m */
            private final Boolean f81815m;
            @SerializedName("scheduleFlag")
            @Nullable

            /* renamed from: n */
            private final Boolean f81816n;
            @SerializedName("updatedBy")
            @Nullable

            /* renamed from: o */
            private final Object f81817o;
            @SerializedName("screenshotHeight")
            @Nullable

            /* renamed from: p */
            private final Integer f81818p;
            @SerializedName("uri")
            @Nullable

            /* renamed from: q */
            private final String f81819q;
            @SerializedName("newsId")
            @Nullable

            /* renamed from: r */
            private final String f81820r;
            @SerializedName("targetApp")
            @Nullable

            /* renamed from: s */
            private final String f81821s;
            @SerializedName("publishType")
            @Nullable

            /* renamed from: t */
            private final String f81822t;
            @SerializedName("createdBy")
            @Nullable

            /* renamed from: u */
            private final String f81823u;
            @SerializedName("topic")
            @Nullable

            /* renamed from: v */
            private final String f81824v;
            @SerializedName("created_date")
            @Nullable

            /* renamed from: w */
            private final String f81825w;
            @SerializedName("updated_date")
            @Nullable

            /* renamed from: x */
            private final String f81826x;
            @SerializedName("effectiveDate")
            @Nullable

            /* renamed from: y */
            private final String f81827y;
            @SerializedName(NotificationCompat.CATEGORY_STATUS)
            @Nullable

            /* renamed from: z */
            private final String f81828z;

            public News() {
                this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 67108863, null);
            }

            @Nullable
            public final Integer component1() {
                return this.f81803a;
            }

            @Nullable
            public final Boolean component10() {
                return this.f81812j;
            }

            @Nullable
            public final String component11() {
                return this.f81813k;
            }

            @Nullable
            public final Integer component12() {
                return this.f81814l;
            }

            @Nullable
            public final Boolean component13() {
                return this.f81815m;
            }

            @Nullable
            public final Boolean component14() {
                return this.f81816n;
            }

            @Nullable
            public final Object component15() {
                return this.f81817o;
            }

            @Nullable
            public final Integer component16() {
                return this.f81818p;
            }

            @Nullable
            public final String component17() {
                return this.f81819q;
            }

            @Nullable
            public final String component18() {
                return this.f81820r;
            }

            @Nullable
            public final String component19() {
                return this.f81821s;
            }

            @Nullable
            public final String component2() {
                return this.f81804b;
            }

            @Nullable
            public final String component20() {
                return this.f81822t;
            }

            @Nullable
            public final String component21() {
                return this.f81823u;
            }

            @Nullable
            public final String component22() {
                return this.f81824v;
            }

            @Nullable
            public final String component23() {
                return this.f81825w;
            }

            @Nullable
            public final String component24() {
                return this.f81826x;
            }

            @Nullable
            public final String component25() {
                return this.f81827y;
            }

            @Nullable
            public final String component26() {
                return this.f81828z;
            }

            @Nullable
            public final String component3() {
                return this.f81805c;
            }

            @Nullable
            public final Integer component4() {
                return this.f81806d;
            }

            @Nullable
            public final String component5() {
                return this.f81807e;
            }

            @Nullable
            public final String component6() {
                return this.f81808f;
            }

            @Nullable
            public final String component7() {
                return this.f81809g;
            }

            @Nullable
            public final String component8() {
                return this.f81810h;
            }

            @Nullable
            public final Integer component9() {
                return this.f81811i;
            }

            @NotNull
            public final News copy(@Nullable Integer num, @Nullable String str, @Nullable String str2, @Nullable Integer num2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable String str6, @Nullable Integer num3, @Nullable Boolean bool, @Nullable String str7, @Nullable Integer num4, @Nullable Boolean bool2, @Nullable Boolean bool3, @Nullable Object obj, @Nullable Integer num5, @Nullable String str8, @Nullable String str9, @Nullable String str10, @Nullable String str11, @Nullable String str12, @Nullable String str13, @Nullable String str14, @Nullable String str15, @Nullable String str16, @Nullable String str17) {
                return new News(num, str, str2, num2, str3, str4, str5, str6, num3, bool, str7, num4, bool2, bool3, obj, num5, str8, str9, str10, str11, str12, str13, str14, str15, str16, str17);
            }

            public boolean equals(@Nullable Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj instanceof News) {
                    News news = (News) obj;
                    return Intrinsics.areEqual(this.f81803a, news.f81803a) && Intrinsics.areEqual(this.f81804b, news.f81804b) && Intrinsics.areEqual(this.f81805c, news.f81805c) && Intrinsics.areEqual(this.f81806d, news.f81806d) && Intrinsics.areEqual(this.f81807e, news.f81807e) && Intrinsics.areEqual(this.f81808f, news.f81808f) && Intrinsics.areEqual(this.f81809g, news.f81809g) && Intrinsics.areEqual(this.f81810h, news.f81810h) && Intrinsics.areEqual(this.f81811i, news.f81811i) && Intrinsics.areEqual(this.f81812j, news.f81812j) && Intrinsics.areEqual(this.f81813k, news.f81813k) && Intrinsics.areEqual(this.f81814l, news.f81814l) && Intrinsics.areEqual(this.f81815m, news.f81815m) && Intrinsics.areEqual(this.f81816n, news.f81816n) && Intrinsics.areEqual(this.f81817o, news.f81817o) && Intrinsics.areEqual(this.f81818p, news.f81818p) && Intrinsics.areEqual(this.f81819q, news.f81819q) && Intrinsics.areEqual(this.f81820r, news.f81820r) && Intrinsics.areEqual(this.f81821s, news.f81821s) && Intrinsics.areEqual(this.f81822t, news.f81822t) && Intrinsics.areEqual(this.f81823u, news.f81823u) && Intrinsics.areEqual(this.f81824v, news.f81824v) && Intrinsics.areEqual(this.f81825w, news.f81825w) && Intrinsics.areEqual(this.f81826x, news.f81826x) && Intrinsics.areEqual(this.f81827y, news.f81827y) && Intrinsics.areEqual(this.f81828z, news.f81828z);
                }
                return false;
            }

            @Nullable
            public final String getChannel() {
                return this.f81807e;
            }

            @Nullable
            public final String getContent() {
                return this.f81810h;
            }

            @Nullable
            public final String getCreatedBy() {
                return this.f81823u;
            }

            @Nullable
            public final String getCreatedDate() {
                return this.f81825w;
            }

            @Nullable
            public final String getEffectiveDate() {
                return this.f81827y;
            }

            @Nullable
            public final String getExpiredDate() {
                return this.f81805c;
            }

            @Nullable
            public final Integer getLiked() {
                return this.f81811i;
            }

            @Nullable
            public final String getNewsId() {
                return this.f81820r;
            }

            @Nullable
            public final String getPublishType() {
                return this.f81822t;
            }

            @Nullable
            public final String getPublisherCode() {
                return this.f81804b;
            }

            @Nullable
            public final Integer getSaved() {
                return this.f81803a;
            }

            @Nullable
            public final Boolean getScheduleFlag() {
                return this.f81816n;
            }

            @Nullable
            public final String getScreenshot() {
                return this.f81808f;
            }

            @Nullable
            public final Integer getScreenshotHeight() {
                return this.f81818p;
            }

            @Nullable
            public final Integer getScreenshotWidth() {
                return this.f81806d;
            }

            @Nullable
            public final String getStatus() {
                return this.f81828z;
            }

            @Nullable
            public final String getTargetApp() {
                return this.f81821s;
            }

            @Nullable
            public final String getTopic() {
                return this.f81824v;
            }

            @Nullable
            public final String getType() {
                return this.f81809g;
            }

            @Nullable
            public final Object getUpdatedBy() {
                return this.f81817o;
            }

            @Nullable
            public final String getUpdatedDate() {
                return this.f81826x;
            }

            @Nullable
            public final String getUri() {
                return this.f81819q;
            }

            @Nullable
            public final Integer getViewed() {
                return this.f81814l;
            }

            @Nullable
            public final String getZone() {
                return this.f81813k;
            }

            public int hashCode() {
                Integer num = this.f81803a;
                int hashCode = (num == null ? 0 : num.hashCode()) * 31;
                String str = this.f81804b;
                int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
                String str2 = this.f81805c;
                int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
                Integer num2 = this.f81806d;
                int hashCode4 = (hashCode3 + (num2 == null ? 0 : num2.hashCode())) * 31;
                String str3 = this.f81807e;
                int hashCode5 = (hashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
                String str4 = this.f81808f;
                int hashCode6 = (hashCode5 + (str4 == null ? 0 : str4.hashCode())) * 31;
                String str5 = this.f81809g;
                int hashCode7 = (hashCode6 + (str5 == null ? 0 : str5.hashCode())) * 31;
                String str6 = this.f81810h;
                int hashCode8 = (hashCode7 + (str6 == null ? 0 : str6.hashCode())) * 31;
                Integer num3 = this.f81811i;
                int hashCode9 = (hashCode8 + (num3 == null ? 0 : num3.hashCode())) * 31;
                Boolean bool = this.f81812j;
                int hashCode10 = (hashCode9 + (bool == null ? 0 : bool.hashCode())) * 31;
                String str7 = this.f81813k;
                int hashCode11 = (hashCode10 + (str7 == null ? 0 : str7.hashCode())) * 31;
                Integer num4 = this.f81814l;
                int hashCode12 = (hashCode11 + (num4 == null ? 0 : num4.hashCode())) * 31;
                Boolean bool2 = this.f81815m;
                int hashCode13 = (hashCode12 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
                Boolean bool3 = this.f81816n;
                int hashCode14 = (hashCode13 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
                Object obj = this.f81817o;
                int hashCode15 = (hashCode14 + (obj == null ? 0 : obj.hashCode())) * 31;
                Integer num5 = this.f81818p;
                int hashCode16 = (hashCode15 + (num5 == null ? 0 : num5.hashCode())) * 31;
                String str8 = this.f81819q;
                int hashCode17 = (hashCode16 + (str8 == null ? 0 : str8.hashCode())) * 31;
                String str9 = this.f81820r;
                int hashCode18 = (hashCode17 + (str9 == null ? 0 : str9.hashCode())) * 31;
                String str10 = this.f81821s;
                int hashCode19 = (hashCode18 + (str10 == null ? 0 : str10.hashCode())) * 31;
                String str11 = this.f81822t;
                int hashCode20 = (hashCode19 + (str11 == null ? 0 : str11.hashCode())) * 31;
                String str12 = this.f81823u;
                int hashCode21 = (hashCode20 + (str12 == null ? 0 : str12.hashCode())) * 31;
                String str13 = this.f81824v;
                int hashCode22 = (hashCode21 + (str13 == null ? 0 : str13.hashCode())) * 31;
                String str14 = this.f81825w;
                int hashCode23 = (hashCode22 + (str14 == null ? 0 : str14.hashCode())) * 31;
                String str15 = this.f81826x;
                int hashCode24 = (hashCode23 + (str15 == null ? 0 : str15.hashCode())) * 31;
                String str16 = this.f81827y;
                int hashCode25 = (hashCode24 + (str16 == null ? 0 : str16.hashCode())) * 31;
                String str17 = this.f81828z;
                return hashCode25 + (str17 != null ? str17.hashCode() : 0);
            }

            @Nullable
            public final Boolean isAllowedRetailer() {
                return this.f81812j;
            }

            @Nullable
            public final Boolean isSentNotification() {
                return this.f81815m;
            }

            @NotNull
            public String toString() {
                Integer num = this.f81803a;
                String str = this.f81804b;
                String str2 = this.f81805c;
                Integer num2 = this.f81806d;
                String str3 = this.f81807e;
                String str4 = this.f81808f;
                String str5 = this.f81809g;
                String str6 = this.f81810h;
                Integer num3 = this.f81811i;
                Boolean bool = this.f81812j;
                String str7 = this.f81813k;
                Integer num4 = this.f81814l;
                Boolean bool2 = this.f81815m;
                Boolean bool3 = this.f81816n;
                Object obj = this.f81817o;
                Integer num5 = this.f81818p;
                String str8 = this.f81819q;
                String str9 = this.f81820r;
                String str10 = this.f81821s;
                String str11 = this.f81822t;
                String str12 = this.f81823u;
                String str13 = this.f81824v;
                String str14 = this.f81825w;
                String str15 = this.f81826x;
                String str16 = this.f81827y;
                String str17 = this.f81828z;
                return "News(saved=" + num + ", publisherCode=" + str + ", expiredDate=" + str2 + ", screenshotWidth=" + num2 + ", channel=" + str3 + ", screenshot=" + str4 + ", type=" + str5 + ", content=" + str6 + ", liked=" + num3 + ", isAllowedRetailer=" + bool + ", zone=" + str7 + ", viewed=" + num4 + ", isSentNotification=" + bool2 + ", scheduleFlag=" + bool3 + ", updatedBy=" + obj + ", screenshotHeight=" + num5 + ", uri=" + str8 + ", newsId=" + str9 + ", targetApp=" + str10 + ", publishType=" + str11 + ", createdBy=" + str12 + ", topic=" + str13 + ", createdDate=" + str14 + ", updatedDate=" + str15 + ", effectiveDate=" + str16 + ", status=" + str17 + ")";
            }

            public News(@Nullable Integer num, @Nullable String str, @Nullable String str2, @Nullable Integer num2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable String str6, @Nullable Integer num3, @Nullable Boolean bool, @Nullable String str7, @Nullable Integer num4, @Nullable Boolean bool2, @Nullable Boolean bool3, @Nullable Object obj, @Nullable Integer num5, @Nullable String str8, @Nullable String str9, @Nullable String str10, @Nullable String str11, @Nullable String str12, @Nullable String str13, @Nullable String str14, @Nullable String str15, @Nullable String str16, @Nullable String str17) {
                this.f81803a = num;
                this.f81804b = str;
                this.f81805c = str2;
                this.f81806d = num2;
                this.f81807e = str3;
                this.f81808f = str4;
                this.f81809g = str5;
                this.f81810h = str6;
                this.f81811i = num3;
                this.f81812j = bool;
                this.f81813k = str7;
                this.f81814l = num4;
                this.f81815m = bool2;
                this.f81816n = bool3;
                this.f81817o = obj;
                this.f81818p = num5;
                this.f81819q = str8;
                this.f81820r = str9;
                this.f81821s = str10;
                this.f81822t = str11;
                this.f81823u = str12;
                this.f81824v = str13;
                this.f81825w = str14;
                this.f81826x = str15;
                this.f81827y = str16;
                this.f81828z = str17;
            }

            public /* synthetic */ News(Integer num, String str, String str2, Integer num2, String str3, String str4, String str5, String str6, Integer num3, Boolean bool, String str7, Integer num4, Boolean bool2, Boolean bool3, Object obj, Integer num5, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this((i & 1) != 0 ? null : num, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? null : num2, (i & 16) != 0 ? null : str3, (i & 32) != 0 ? null : str4, (i & 64) != 0 ? null : str5, (i & 128) != 0 ? null : str6, (i & 256) != 0 ? null : num3, (i & 512) != 0 ? null : bool, (i & 1024) != 0 ? null : str7, (i & 2048) != 0 ? null : num4, (i & 4096) != 0 ? null : bool2, (i & 8192) != 0 ? null : bool3, (i & 16384) != 0 ? null : obj, (i & 32768) != 0 ? null : num5, (i & 65536) != 0 ? null : str8, (i & 131072) != 0 ? null : str9, (i & 262144) != 0 ? null : str10, (i & 524288) != 0 ? null : str11, (i & 1048576) != 0 ? null : str12, (i & 2097152) != 0 ? null : str13, (i & 4194304) != 0 ? null : str14, (i & 8388608) != 0 ? null : str15, (i & 16777216) != 0 ? null : str16, (i & MediaHttpDownloader.MAXIMUM_CHUNK_SIZE) != 0 ? null : str17);
            }
        }

        public Data() {
            this(null, 1, null);
        }

        public static /* synthetic */ Data copy$default(Data data, News news, int i, Object obj) {
            if ((i & 1) != 0) {
                news = data.f81802a;
            }
            return data.copy(news);
        }

        @Nullable
        public final News component1() {
            return this.f81802a;
        }

        @NotNull
        public final Data copy(@Nullable News news) {
            return new Data(news);
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Data) && Intrinsics.areEqual(this.f81802a, ((Data) obj).f81802a);
        }

        @Nullable
        public final News getNews() {
            return this.f81802a;
        }

        public int hashCode() {
            News news = this.f81802a;
            if (news == null) {
                return 0;
            }
            return news.hashCode();
        }

        @NotNull
        public String toString() {
            News news = this.f81802a;
            return "Data(news=" + news + ")";
        }

        public Data(@Nullable News news) {
            this.f81802a = news;
        }

        public /* synthetic */ Data(News news, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : news);
        }
    }

    public OneLikeNewsResponse() {
        this(null, null, null, null, null, null, null, 127, null);
    }

    public static /* synthetic */ OneLikeNewsResponse copy$default(OneLikeNewsResponse oneLikeNewsResponse, String str, String str2, String str3, String str4, Data data, List list, String str5, int i, Object obj) {
        if ((i & 1) != 0) {
            str = oneLikeNewsResponse.f81795a;
        }
        if ((i & 2) != 0) {
            str2 = oneLikeNewsResponse.f81796b;
        }
        String str6 = str2;
        if ((i & 4) != 0) {
            str3 = oneLikeNewsResponse.f81797c;
        }
        String str7 = str3;
        if ((i & 8) != 0) {
            str4 = oneLikeNewsResponse.f81798d;
        }
        String str8 = str4;
        if ((i & 16) != 0) {
            data = oneLikeNewsResponse.f81799e;
        }
        Data data2 = data;
        List<String> list2 = list;
        if ((i & 32) != 0) {
            list2 = oneLikeNewsResponse.f81800f;
        }
        List list3 = list2;
        if ((i & 64) != 0) {
            str5 = oneLikeNewsResponse.f81801g;
        }
        return oneLikeNewsResponse.copy(str, str6, str7, str8, data2, list3, str5);
    }

    @Nullable
    public final String component1() {
        return this.f81795a;
    }

    @Nullable
    public final String component2() {
        return this.f81796b;
    }

    @Nullable
    public final String component3() {
        return this.f81797c;
    }

    @Nullable
    public final String component4() {
        return this.f81798d;
    }

    @Nullable
    public final Data component5() {
        return this.f81799e;
    }

    @Nullable
    public final List<String> component6() {
        return this.f81800f;
    }

    @Nullable
    public final String component7() {
        return this.f81801g;
    }

    @NotNull
    public final OneLikeNewsResponse copy(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable Data data, @Nullable List<String> list, @Nullable String str5) {
        return new OneLikeNewsResponse(str, str2, str3, str4, data, list, str5);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof OneLikeNewsResponse) {
            OneLikeNewsResponse oneLikeNewsResponse = (OneLikeNewsResponse) obj;
            return Intrinsics.areEqual(this.f81795a, oneLikeNewsResponse.f81795a) && Intrinsics.areEqual(this.f81796b, oneLikeNewsResponse.f81796b) && Intrinsics.areEqual(this.f81797c, oneLikeNewsResponse.f81797c) && Intrinsics.areEqual(this.f81798d, oneLikeNewsResponse.f81798d) && Intrinsics.areEqual(this.f81799e, oneLikeNewsResponse.f81799e) && Intrinsics.areEqual(this.f81800f, oneLikeNewsResponse.f81800f) && Intrinsics.areEqual(this.f81801g, oneLikeNewsResponse.f81801g);
        }
        return false;
    }

    @Nullable
    public final String getCode() {
        return this.f81796b;
    }

    @Nullable
    public final String getCodeType() {
        return this.f81797c;
    }

    @Nullable
    public final Data getData() {
        return this.f81799e;
    }

    @Nullable
    public final String getDesc() {
        return this.f81801g;
    }

    @Nullable
    public final List<String> getReplaceMessage() {
        return this.f81800f;
    }

    @Nullable
    public final String getResponseDateTime() {
        return this.f81798d;
    }

    @Nullable
    public final String getSystemMessage() {
        return this.f81795a;
    }

    public int hashCode() {
        String str = this.f81795a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f81796b;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f81797c;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f81798d;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Data data = this.f81799e;
        int hashCode5 = (hashCode4 + (data == null ? 0 : data.hashCode())) * 31;
        List<String> list = this.f81800f;
        int hashCode6 = (hashCode5 + (list == null ? 0 : list.hashCode())) * 31;
        String str5 = this.f81801g;
        return hashCode6 + (str5 != null ? str5.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        String str = this.f81795a;
        String str2 = this.f81796b;
        String str3 = this.f81797c;
        String str4 = this.f81798d;
        Data data = this.f81799e;
        List<String> list = this.f81800f;
        String str5 = this.f81801g;
        return "OneLikeNewsResponse(systemMessage=" + str + ", code=" + str2 + ", codeType=" + str3 + ", responseDateTime=" + str4 + ", data=" + data + ", replaceMessage=" + list + ", desc=" + str5 + ")";
    }

    public OneLikeNewsResponse(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable Data data, @Nullable List<String> list, @Nullable String str5) {
        this.f81795a = str;
        this.f81796b = str2;
        this.f81797c = str3;
        this.f81798d = str4;
        this.f81799e = data;
        this.f81800f = list;
        this.f81801g = str5;
    }

    public /* synthetic */ OneLikeNewsResponse(String str, String str2, String str3, String str4, Data data, List list, String str5, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : data, (i & 32) != 0 ? null : list, (i & 64) != 0 ? null : str5);
    }
}