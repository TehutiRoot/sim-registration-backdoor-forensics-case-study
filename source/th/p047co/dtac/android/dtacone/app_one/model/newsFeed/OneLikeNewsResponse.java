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
@Metadata(m28851d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0011\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0015\b\u0087\b\u0018\u00002\u00020\u0001:\u00013Ba\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\u0010\b\u0002\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\t\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\f\u0010\rJ\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0012\u0010\u0010\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u000fJ\u0012\u0010\u0011\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u000fJ\u0012\u0010\u0012\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u000fJ\u0012\u0010\u0013\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0018\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0012\u0010\u0017\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u000fJj\u0010\u0018\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\u0010\b\u0002\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\t2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u000fJ\u0010\u0010\u001c\u001a\u00020\u001bHÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u001a\u0010 \u001a\u00020\u001f2\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b \u0010!R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010\u000fR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b%\u0010#\u001a\u0004\b&\u0010\u000fR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b'\u0010#\u001a\u0004\b(\u0010\u000fR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b)\u0010#\u001a\u0004\b*\u0010\u000fR\u001c\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b+\u0010,\u001a\u0004\b-\u0010\u0014R\"\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b.\u0010/\u001a\u0004\b0\u0010\u0016R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b1\u0010#\u001a\u0004\b2\u0010\u000f¨\u00064"}, m28850d2 = {"Lth/co/dtac/android/dtacone/app_one/model/newsFeed/OneLikeNewsResponse;", "", "", "systemMessage", "code", "codeType", "responseDateTime", "Lth/co/dtac/android/dtacone/app_one/model/newsFeed/OneLikeNewsResponse$Data;", "data", "", "replaceMessage", "desc", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lth/co/dtac/android/dtacone/app_one/model/newsFeed/OneLikeNewsResponse$Data;Ljava/util/List;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "component5", "()Lth/co/dtac/android/dtacone/app_one/model/newsFeed/OneLikeNewsResponse$Data;", "component6", "()Ljava/util/List;", "component7", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lth/co/dtac/android/dtacone/app_one/model/newsFeed/OneLikeNewsResponse$Data;Ljava/util/List;Ljava/lang/String;)Lth/co/dtac/android/dtacone/app_one/model/newsFeed/OneLikeNewsResponse;", "toString", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", PDPageLabelRange.STYLE_LETTERS_LOWER, "Ljava/lang/String;", "getSystemMessage", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "getCode", OperatorName.CURVE_TO, "getCodeType", "d", "getResponseDateTime", "e", "Lth/co/dtac/android/dtacone/app_one/model/newsFeed/OneLikeNewsResponse$Data;", "getData", OperatorName.FILL_NON_ZERO, "Ljava/util/List;", "getReplaceMessage", OperatorName.NON_STROKING_GRAY, "getDesc", Constant.BenefitName.Data, "app_prodRelease"}, m28849k = 1, m28848mv = {1, 8, 0})
/* renamed from: th.co.dtac.android.dtacone.app_one.model.newsFeed.OneLikeNewsResponse */
/* loaded from: classes7.dex */
public final class OneLikeNewsResponse {
    public static final int $stable = 8;
    @SerializedName("systemMessage")
    @Nullable

    /* renamed from: a */
    private final String f81703a;
    @SerializedName("code")
    @Nullable

    /* renamed from: b */
    private final String f81704b;
    @SerializedName("codeType")
    @Nullable

    /* renamed from: c */
    private final String f81705c;
    @SerializedName("responseDateTime")
    @Nullable

    /* renamed from: d */
    private final String f81706d;
    @SerializedName("data")
    @Nullable

    /* renamed from: e */
    private final Data f81707e;
    @SerializedName("replaceMessage")
    @Nullable

    /* renamed from: f */
    private final List<String> f81708f;
    @SerializedName("desc")
    @Nullable

    /* renamed from: g */
    private final String f81709g;

    @StabilityInferred(parameters = 0)
    @Metadata(m28851d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0017B\u0013\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001c\u0010\b\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007¨\u0006\u0018"}, m28850d2 = {"Lth/co/dtac/android/dtacone/app_one/model/newsFeed/OneLikeNewsResponse$Data;", "", "Lth/co/dtac/android/dtacone/app_one/model/newsFeed/OneLikeNewsResponse$Data$News;", "news", "<init>", "(Lth/co/dtac/android/dtacone/app_one/model/newsFeed/OneLikeNewsResponse$Data$News;)V", "component1", "()Lth/co/dtac/android/dtacone/app_one/model/newsFeed/OneLikeNewsResponse$Data$News;", "copy", "(Lth/co/dtac/android/dtacone/app_one/model/newsFeed/OneLikeNewsResponse$Data$News;)Lth/co/dtac/android/dtacone/app_one/model/newsFeed/OneLikeNewsResponse$Data;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", PDPageLabelRange.STYLE_LETTERS_LOWER, "Lth/co/dtac/android/dtacone/app_one/model/newsFeed/OneLikeNewsResponse$Data$News;", "getNews", "News", "app_prodRelease"}, m28849k = 1, m28848mv = {1, 8, 0})
    /* renamed from: th.co.dtac.android.dtacone.app_one.model.newsFeed.OneLikeNewsResponse$Data */
    /* loaded from: classes7.dex */
    public static final class Data {
        public static final int $stable = 8;
        @SerializedName("news")
        @Nullable

        /* renamed from: a */
        private final News f81710a;

        @StabilityInferred(parameters = 0)
        @Metadata(m28851d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\bp\b\u0087\b\u0018\u00002\u00020\u0001B¿\u0002\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0001\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u001f\u0010 J\u0012\u0010!\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b!\u0010\"J\u0012\u0010#\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b#\u0010$J\u0012\u0010%\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b%\u0010$J\u0012\u0010&\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b&\u0010\"J\u0012\u0010'\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b'\u0010$J\u0012\u0010(\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b(\u0010$J\u0012\u0010)\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b)\u0010$J\u0012\u0010*\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b*\u0010$J\u0012\u0010+\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b+\u0010\"J\u0012\u0010,\u001a\u0004\u0018\u00010\rHÆ\u0003¢\u0006\u0004\b,\u0010-J\u0012\u0010.\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b.\u0010$J\u0012\u0010/\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b/\u0010\"J\u0012\u00100\u001a\u0004\u0018\u00010\rHÆ\u0003¢\u0006\u0004\b0\u0010-J\u0012\u00101\u001a\u0004\u0018\u00010\rHÆ\u0003¢\u0006\u0004\b1\u0010-J\u0012\u00102\u001a\u0004\u0018\u00010\u0001HÆ\u0003¢\u0006\u0004\b2\u00103J\u0012\u00104\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b4\u0010\"J\u0012\u00105\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b5\u0010$J\u0012\u00106\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b6\u0010$J\u0012\u00107\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b7\u0010$J\u0012\u00108\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b8\u0010$J\u0012\u00109\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b9\u0010$J\u0012\u0010:\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b:\u0010$J\u0012\u0010;\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b;\u0010$J\u0012\u0010<\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b<\u0010$J\u0012\u0010=\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b=\u0010$J\u0012\u0010>\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b>\u0010$JÈ\u0002\u0010?\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b?\u0010@J\u0010\u0010A\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\bA\u0010$J\u0010\u0010B\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\bB\u0010CJ\u001a\u0010E\u001a\u00020\r2\b\u0010D\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\bE\u0010FR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\bG\u0010H\u001a\u0004\bI\u0010\"R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\bJ\u0010K\u001a\u0004\bL\u0010$R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\bM\u0010K\u001a\u0004\bN\u0010$R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\bO\u0010H\u001a\u0004\bP\u0010\"R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\bQ\u0010K\u001a\u0004\bR\u0010$R\u001c\u0010\t\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\bS\u0010K\u001a\u0004\bT\u0010$R\u001c\u0010\n\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\bU\u0010K\u001a\u0004\bV\u0010$R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\bW\u0010K\u001a\u0004\bX\u0010$R\u001c\u0010\f\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\bY\u0010H\u001a\u0004\bZ\u0010\"R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b[\u0010\\\u001a\u0004\b\u000e\u0010-R\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b]\u0010K\u001a\u0004\b^\u0010$R\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b_\u0010H\u001a\u0004\b`\u0010\"R\u001c\u0010\u0011\u001a\u0004\u0018\u00010\r8\u0006X\u0087\u0004¢\u0006\f\n\u0004\ba\u0010\\\u001a\u0004\b\u0011\u0010-R\u001c\u0010\u0012\u001a\u0004\u0018\u00010\r8\u0006X\u0087\u0004¢\u0006\f\n\u0004\bb\u0010\\\u001a\u0004\bc\u0010-R\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u00018\u0006X\u0087\u0004¢\u0006\f\n\u0004\bd\u0010e\u001a\u0004\bf\u00103R\u001c\u0010\u0014\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\bg\u0010H\u001a\u0004\bh\u0010\"R\u001c\u0010\u0015\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\bi\u0010K\u001a\u0004\bj\u0010$R\u001c\u0010\u0016\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\bk\u0010K\u001a\u0004\bl\u0010$R\u001c\u0010\u0017\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\bm\u0010K\u001a\u0004\bn\u0010$R\u001c\u0010\u0018\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\bo\u0010K\u001a\u0004\bp\u0010$R\u001c\u0010\u0019\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\bq\u0010K\u001a\u0004\br\u0010$R\u001c\u0010\u001a\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\bs\u0010K\u001a\u0004\bt\u0010$R\u001c\u0010\u001b\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\bu\u0010K\u001a\u0004\bv\u0010$R\u001c\u0010\u001c\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\bw\u0010K\u001a\u0004\bx\u0010$R\u001c\u0010\u001d\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\by\u0010K\u001a\u0004\bz\u0010$R\u001c\u0010\u001e\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b{\u0010K\u001a\u0004\b|\u0010$¨\u0006}"}, m28850d2 = {"Lth/co/dtac/android/dtacone/app_one/model/newsFeed/OneLikeNewsResponse$Data$News;", "", "", "saved", "", "publisherCode", "expiredDate", "screenshotWidth", "channel", "screenshot", "type", "content", "liked", "", "isAllowedRetailer", "zone", "viewed", "isSentNotification", "scheduleFlag", "updatedBy", "screenshotHeight", "uri", "newsId", "targetApp", "publishType", "createdBy", "topic", "createdDate", "updatedDate", "effectiveDate", NotificationCompat.CATEGORY_STATUS, "<init>", "(Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Object;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/Integer;", "component2", "()Ljava/lang/String;", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "()Ljava/lang/Boolean;", "component11", "component12", "component13", "component14", "component15", "()Ljava/lang/Object;", "component16", "component17", "component18", "component19", "component20", "component21", "component22", "component23", "component24", "component25", "component26", "copy", "(Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Object;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lth/co/dtac/android/dtacone/app_one/model/newsFeed/OneLikeNewsResponse$Data$News;", "toString", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", PDPageLabelRange.STYLE_LETTERS_LOWER, "Ljava/lang/Integer;", "getSaved", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "Ljava/lang/String;", "getPublisherCode", OperatorName.CURVE_TO, "getExpiredDate", "d", "getScreenshotWidth", "e", "getChannel", OperatorName.FILL_NON_ZERO, "getScreenshot", OperatorName.NON_STROKING_GRAY, "getType", OperatorName.CLOSE_PATH, "getContent", "i", "getLiked", OperatorName.SET_LINE_JOINSTYLE, "Ljava/lang/Boolean;", OperatorName.NON_STROKING_CMYK, "getZone", OperatorName.LINE_TO, "getViewed", OperatorName.MOVE_TO, OperatorName.ENDPATH, "getScheduleFlag", "o", "Ljava/lang/Object;", "getUpdatedBy", "p", "getScreenshotHeight", OperatorName.SAVE, "getUri", PDPageLabelRange.STYLE_ROMAN_LOWER, "getNewsId", OperatorName.CLOSE_AND_STROKE, "getTargetApp", "t", "getPublishType", "u", "getCreatedBy", OperatorName.CURVE_TO_REPLICATE_INITIAL_POINT, "getTopic", OperatorName.SET_LINE_WIDTH, "getCreatedDate", "x", "getUpdatedDate", OperatorName.CURVE_TO_REPLICATE_FINAL_POINT, "getEffectiveDate", "z", "getStatus", "app_prodRelease"}, m28849k = 1, m28848mv = {1, 8, 0})
        /* renamed from: th.co.dtac.android.dtacone.app_one.model.newsFeed.OneLikeNewsResponse$Data$News */
        /* loaded from: classes7.dex */
        public static final class News {
            public static final int $stable = 8;
            @SerializedName("saved")
            @Nullable

            /* renamed from: a */
            private final Integer f81711a;
            @SerializedName("publisherCode")
            @Nullable

            /* renamed from: b */
            private final String f81712b;
            @SerializedName("expiredDate")
            @Nullable

            /* renamed from: c */
            private final String f81713c;
            @SerializedName("screenshotWidth")
            @Nullable

            /* renamed from: d */
            private final Integer f81714d;
            @SerializedName("channel")
            @Nullable

            /* renamed from: e */
            private final String f81715e;
            @SerializedName("screenshot")
            @Nullable

            /* renamed from: f */
            private final String f81716f;
            @SerializedName("type")
            @Nullable

            /* renamed from: g */
            private final String f81717g;
            @SerializedName("content")
            @Nullable

            /* renamed from: h */
            private final String f81718h;
            @SerializedName("liked")
            @Nullable

            /* renamed from: i */
            private final Integer f81719i;
            @SerializedName("isAllowedRetailer")
            @Nullable

            /* renamed from: j */
            private final Boolean f81720j;
            @SerializedName("zone")
            @Nullable

            /* renamed from: k */
            private final String f81721k;
            @SerializedName("viewed")
            @Nullable

            /* renamed from: l */
            private final Integer f81722l;
            @SerializedName("isSentNotification")
            @Nullable

            /* renamed from: m */
            private final Boolean f81723m;
            @SerializedName("scheduleFlag")
            @Nullable

            /* renamed from: n */
            private final Boolean f81724n;
            @SerializedName("updatedBy")
            @Nullable

            /* renamed from: o */
            private final Object f81725o;
            @SerializedName("screenshotHeight")
            @Nullable

            /* renamed from: p */
            private final Integer f81726p;
            @SerializedName("uri")
            @Nullable

            /* renamed from: q */
            private final String f81727q;
            @SerializedName("newsId")
            @Nullable

            /* renamed from: r */
            private final String f81728r;
            @SerializedName("targetApp")
            @Nullable

            /* renamed from: s */
            private final String f81729s;
            @SerializedName("publishType")
            @Nullable

            /* renamed from: t */
            private final String f81730t;
            @SerializedName("createdBy")
            @Nullable

            /* renamed from: u */
            private final String f81731u;
            @SerializedName("topic")
            @Nullable

            /* renamed from: v */
            private final String f81732v;
            @SerializedName("created_date")
            @Nullable

            /* renamed from: w */
            private final String f81733w;
            @SerializedName("updated_date")
            @Nullable

            /* renamed from: x */
            private final String f81734x;
            @SerializedName("effectiveDate")
            @Nullable

            /* renamed from: y */
            private final String f81735y;
            @SerializedName(NotificationCompat.CATEGORY_STATUS)
            @Nullable

            /* renamed from: z */
            private final String f81736z;

            public News() {
                this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 67108863, null);
            }

            @Nullable
            public final Integer component1() {
                return this.f81711a;
            }

            @Nullable
            public final Boolean component10() {
                return this.f81720j;
            }

            @Nullable
            public final String component11() {
                return this.f81721k;
            }

            @Nullable
            public final Integer component12() {
                return this.f81722l;
            }

            @Nullable
            public final Boolean component13() {
                return this.f81723m;
            }

            @Nullable
            public final Boolean component14() {
                return this.f81724n;
            }

            @Nullable
            public final Object component15() {
                return this.f81725o;
            }

            @Nullable
            public final Integer component16() {
                return this.f81726p;
            }

            @Nullable
            public final String component17() {
                return this.f81727q;
            }

            @Nullable
            public final String component18() {
                return this.f81728r;
            }

            @Nullable
            public final String component19() {
                return this.f81729s;
            }

            @Nullable
            public final String component2() {
                return this.f81712b;
            }

            @Nullable
            public final String component20() {
                return this.f81730t;
            }

            @Nullable
            public final String component21() {
                return this.f81731u;
            }

            @Nullable
            public final String component22() {
                return this.f81732v;
            }

            @Nullable
            public final String component23() {
                return this.f81733w;
            }

            @Nullable
            public final String component24() {
                return this.f81734x;
            }

            @Nullable
            public final String component25() {
                return this.f81735y;
            }

            @Nullable
            public final String component26() {
                return this.f81736z;
            }

            @Nullable
            public final String component3() {
                return this.f81713c;
            }

            @Nullable
            public final Integer component4() {
                return this.f81714d;
            }

            @Nullable
            public final String component5() {
                return this.f81715e;
            }

            @Nullable
            public final String component6() {
                return this.f81716f;
            }

            @Nullable
            public final String component7() {
                return this.f81717g;
            }

            @Nullable
            public final String component8() {
                return this.f81718h;
            }

            @Nullable
            public final Integer component9() {
                return this.f81719i;
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
                    return Intrinsics.areEqual(this.f81711a, news.f81711a) && Intrinsics.areEqual(this.f81712b, news.f81712b) && Intrinsics.areEqual(this.f81713c, news.f81713c) && Intrinsics.areEqual(this.f81714d, news.f81714d) && Intrinsics.areEqual(this.f81715e, news.f81715e) && Intrinsics.areEqual(this.f81716f, news.f81716f) && Intrinsics.areEqual(this.f81717g, news.f81717g) && Intrinsics.areEqual(this.f81718h, news.f81718h) && Intrinsics.areEqual(this.f81719i, news.f81719i) && Intrinsics.areEqual(this.f81720j, news.f81720j) && Intrinsics.areEqual(this.f81721k, news.f81721k) && Intrinsics.areEqual(this.f81722l, news.f81722l) && Intrinsics.areEqual(this.f81723m, news.f81723m) && Intrinsics.areEqual(this.f81724n, news.f81724n) && Intrinsics.areEqual(this.f81725o, news.f81725o) && Intrinsics.areEqual(this.f81726p, news.f81726p) && Intrinsics.areEqual(this.f81727q, news.f81727q) && Intrinsics.areEqual(this.f81728r, news.f81728r) && Intrinsics.areEqual(this.f81729s, news.f81729s) && Intrinsics.areEqual(this.f81730t, news.f81730t) && Intrinsics.areEqual(this.f81731u, news.f81731u) && Intrinsics.areEqual(this.f81732v, news.f81732v) && Intrinsics.areEqual(this.f81733w, news.f81733w) && Intrinsics.areEqual(this.f81734x, news.f81734x) && Intrinsics.areEqual(this.f81735y, news.f81735y) && Intrinsics.areEqual(this.f81736z, news.f81736z);
                }
                return false;
            }

            @Nullable
            public final String getChannel() {
                return this.f81715e;
            }

            @Nullable
            public final String getContent() {
                return this.f81718h;
            }

            @Nullable
            public final String getCreatedBy() {
                return this.f81731u;
            }

            @Nullable
            public final String getCreatedDate() {
                return this.f81733w;
            }

            @Nullable
            public final String getEffectiveDate() {
                return this.f81735y;
            }

            @Nullable
            public final String getExpiredDate() {
                return this.f81713c;
            }

            @Nullable
            public final Integer getLiked() {
                return this.f81719i;
            }

            @Nullable
            public final String getNewsId() {
                return this.f81728r;
            }

            @Nullable
            public final String getPublishType() {
                return this.f81730t;
            }

            @Nullable
            public final String getPublisherCode() {
                return this.f81712b;
            }

            @Nullable
            public final Integer getSaved() {
                return this.f81711a;
            }

            @Nullable
            public final Boolean getScheduleFlag() {
                return this.f81724n;
            }

            @Nullable
            public final String getScreenshot() {
                return this.f81716f;
            }

            @Nullable
            public final Integer getScreenshotHeight() {
                return this.f81726p;
            }

            @Nullable
            public final Integer getScreenshotWidth() {
                return this.f81714d;
            }

            @Nullable
            public final String getStatus() {
                return this.f81736z;
            }

            @Nullable
            public final String getTargetApp() {
                return this.f81729s;
            }

            @Nullable
            public final String getTopic() {
                return this.f81732v;
            }

            @Nullable
            public final String getType() {
                return this.f81717g;
            }

            @Nullable
            public final Object getUpdatedBy() {
                return this.f81725o;
            }

            @Nullable
            public final String getUpdatedDate() {
                return this.f81734x;
            }

            @Nullable
            public final String getUri() {
                return this.f81727q;
            }

            @Nullable
            public final Integer getViewed() {
                return this.f81722l;
            }

            @Nullable
            public final String getZone() {
                return this.f81721k;
            }

            public int hashCode() {
                Integer num = this.f81711a;
                int hashCode = (num == null ? 0 : num.hashCode()) * 31;
                String str = this.f81712b;
                int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
                String str2 = this.f81713c;
                int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
                Integer num2 = this.f81714d;
                int hashCode4 = (hashCode3 + (num2 == null ? 0 : num2.hashCode())) * 31;
                String str3 = this.f81715e;
                int hashCode5 = (hashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
                String str4 = this.f81716f;
                int hashCode6 = (hashCode5 + (str4 == null ? 0 : str4.hashCode())) * 31;
                String str5 = this.f81717g;
                int hashCode7 = (hashCode6 + (str5 == null ? 0 : str5.hashCode())) * 31;
                String str6 = this.f81718h;
                int hashCode8 = (hashCode7 + (str6 == null ? 0 : str6.hashCode())) * 31;
                Integer num3 = this.f81719i;
                int hashCode9 = (hashCode8 + (num3 == null ? 0 : num3.hashCode())) * 31;
                Boolean bool = this.f81720j;
                int hashCode10 = (hashCode9 + (bool == null ? 0 : bool.hashCode())) * 31;
                String str7 = this.f81721k;
                int hashCode11 = (hashCode10 + (str7 == null ? 0 : str7.hashCode())) * 31;
                Integer num4 = this.f81722l;
                int hashCode12 = (hashCode11 + (num4 == null ? 0 : num4.hashCode())) * 31;
                Boolean bool2 = this.f81723m;
                int hashCode13 = (hashCode12 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
                Boolean bool3 = this.f81724n;
                int hashCode14 = (hashCode13 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
                Object obj = this.f81725o;
                int hashCode15 = (hashCode14 + (obj == null ? 0 : obj.hashCode())) * 31;
                Integer num5 = this.f81726p;
                int hashCode16 = (hashCode15 + (num5 == null ? 0 : num5.hashCode())) * 31;
                String str8 = this.f81727q;
                int hashCode17 = (hashCode16 + (str8 == null ? 0 : str8.hashCode())) * 31;
                String str9 = this.f81728r;
                int hashCode18 = (hashCode17 + (str9 == null ? 0 : str9.hashCode())) * 31;
                String str10 = this.f81729s;
                int hashCode19 = (hashCode18 + (str10 == null ? 0 : str10.hashCode())) * 31;
                String str11 = this.f81730t;
                int hashCode20 = (hashCode19 + (str11 == null ? 0 : str11.hashCode())) * 31;
                String str12 = this.f81731u;
                int hashCode21 = (hashCode20 + (str12 == null ? 0 : str12.hashCode())) * 31;
                String str13 = this.f81732v;
                int hashCode22 = (hashCode21 + (str13 == null ? 0 : str13.hashCode())) * 31;
                String str14 = this.f81733w;
                int hashCode23 = (hashCode22 + (str14 == null ? 0 : str14.hashCode())) * 31;
                String str15 = this.f81734x;
                int hashCode24 = (hashCode23 + (str15 == null ? 0 : str15.hashCode())) * 31;
                String str16 = this.f81735y;
                int hashCode25 = (hashCode24 + (str16 == null ? 0 : str16.hashCode())) * 31;
                String str17 = this.f81736z;
                return hashCode25 + (str17 != null ? str17.hashCode() : 0);
            }

            @Nullable
            public final Boolean isAllowedRetailer() {
                return this.f81720j;
            }

            @Nullable
            public final Boolean isSentNotification() {
                return this.f81723m;
            }

            @NotNull
            public String toString() {
                Integer num = this.f81711a;
                String str = this.f81712b;
                String str2 = this.f81713c;
                Integer num2 = this.f81714d;
                String str3 = this.f81715e;
                String str4 = this.f81716f;
                String str5 = this.f81717g;
                String str6 = this.f81718h;
                Integer num3 = this.f81719i;
                Boolean bool = this.f81720j;
                String str7 = this.f81721k;
                Integer num4 = this.f81722l;
                Boolean bool2 = this.f81723m;
                Boolean bool3 = this.f81724n;
                Object obj = this.f81725o;
                Integer num5 = this.f81726p;
                String str8 = this.f81727q;
                String str9 = this.f81728r;
                String str10 = this.f81729s;
                String str11 = this.f81730t;
                String str12 = this.f81731u;
                String str13 = this.f81732v;
                String str14 = this.f81733w;
                String str15 = this.f81734x;
                String str16 = this.f81735y;
                String str17 = this.f81736z;
                return "News(saved=" + num + ", publisherCode=" + str + ", expiredDate=" + str2 + ", screenshotWidth=" + num2 + ", channel=" + str3 + ", screenshot=" + str4 + ", type=" + str5 + ", content=" + str6 + ", liked=" + num3 + ", isAllowedRetailer=" + bool + ", zone=" + str7 + ", viewed=" + num4 + ", isSentNotification=" + bool2 + ", scheduleFlag=" + bool3 + ", updatedBy=" + obj + ", screenshotHeight=" + num5 + ", uri=" + str8 + ", newsId=" + str9 + ", targetApp=" + str10 + ", publishType=" + str11 + ", createdBy=" + str12 + ", topic=" + str13 + ", createdDate=" + str14 + ", updatedDate=" + str15 + ", effectiveDate=" + str16 + ", status=" + str17 + ")";
            }

            public News(@Nullable Integer num, @Nullable String str, @Nullable String str2, @Nullable Integer num2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable String str6, @Nullable Integer num3, @Nullable Boolean bool, @Nullable String str7, @Nullable Integer num4, @Nullable Boolean bool2, @Nullable Boolean bool3, @Nullable Object obj, @Nullable Integer num5, @Nullable String str8, @Nullable String str9, @Nullable String str10, @Nullable String str11, @Nullable String str12, @Nullable String str13, @Nullable String str14, @Nullable String str15, @Nullable String str16, @Nullable String str17) {
                this.f81711a = num;
                this.f81712b = str;
                this.f81713c = str2;
                this.f81714d = num2;
                this.f81715e = str3;
                this.f81716f = str4;
                this.f81717g = str5;
                this.f81718h = str6;
                this.f81719i = num3;
                this.f81720j = bool;
                this.f81721k = str7;
                this.f81722l = num4;
                this.f81723m = bool2;
                this.f81724n = bool3;
                this.f81725o = obj;
                this.f81726p = num5;
                this.f81727q = str8;
                this.f81728r = str9;
                this.f81729s = str10;
                this.f81730t = str11;
                this.f81731u = str12;
                this.f81732v = str13;
                this.f81733w = str14;
                this.f81734x = str15;
                this.f81735y = str16;
                this.f81736z = str17;
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
                news = data.f81710a;
            }
            return data.copy(news);
        }

        @Nullable
        public final News component1() {
            return this.f81710a;
        }

        @NotNull
        public final Data copy(@Nullable News news) {
            return new Data(news);
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Data) && Intrinsics.areEqual(this.f81710a, ((Data) obj).f81710a);
        }

        @Nullable
        public final News getNews() {
            return this.f81710a;
        }

        public int hashCode() {
            News news = this.f81710a;
            if (news == null) {
                return 0;
            }
            return news.hashCode();
        }

        @NotNull
        public String toString() {
            News news = this.f81710a;
            return "Data(news=" + news + ")";
        }

        public Data(@Nullable News news) {
            this.f81710a = news;
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
            str = oneLikeNewsResponse.f81703a;
        }
        if ((i & 2) != 0) {
            str2 = oneLikeNewsResponse.f81704b;
        }
        String str6 = str2;
        if ((i & 4) != 0) {
            str3 = oneLikeNewsResponse.f81705c;
        }
        String str7 = str3;
        if ((i & 8) != 0) {
            str4 = oneLikeNewsResponse.f81706d;
        }
        String str8 = str4;
        if ((i & 16) != 0) {
            data = oneLikeNewsResponse.f81707e;
        }
        Data data2 = data;
        List<String> list2 = list;
        if ((i & 32) != 0) {
            list2 = oneLikeNewsResponse.f81708f;
        }
        List list3 = list2;
        if ((i & 64) != 0) {
            str5 = oneLikeNewsResponse.f81709g;
        }
        return oneLikeNewsResponse.copy(str, str6, str7, str8, data2, list3, str5);
    }

    @Nullable
    public final String component1() {
        return this.f81703a;
    }

    @Nullable
    public final String component2() {
        return this.f81704b;
    }

    @Nullable
    public final String component3() {
        return this.f81705c;
    }

    @Nullable
    public final String component4() {
        return this.f81706d;
    }

    @Nullable
    public final Data component5() {
        return this.f81707e;
    }

    @Nullable
    public final List<String> component6() {
        return this.f81708f;
    }

    @Nullable
    public final String component7() {
        return this.f81709g;
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
            return Intrinsics.areEqual(this.f81703a, oneLikeNewsResponse.f81703a) && Intrinsics.areEqual(this.f81704b, oneLikeNewsResponse.f81704b) && Intrinsics.areEqual(this.f81705c, oneLikeNewsResponse.f81705c) && Intrinsics.areEqual(this.f81706d, oneLikeNewsResponse.f81706d) && Intrinsics.areEqual(this.f81707e, oneLikeNewsResponse.f81707e) && Intrinsics.areEqual(this.f81708f, oneLikeNewsResponse.f81708f) && Intrinsics.areEqual(this.f81709g, oneLikeNewsResponse.f81709g);
        }
        return false;
    }

    @Nullable
    public final String getCode() {
        return this.f81704b;
    }

    @Nullable
    public final String getCodeType() {
        return this.f81705c;
    }

    @Nullable
    public final Data getData() {
        return this.f81707e;
    }

    @Nullable
    public final String getDesc() {
        return this.f81709g;
    }

    @Nullable
    public final List<String> getReplaceMessage() {
        return this.f81708f;
    }

    @Nullable
    public final String getResponseDateTime() {
        return this.f81706d;
    }

    @Nullable
    public final String getSystemMessage() {
        return this.f81703a;
    }

    public int hashCode() {
        String str = this.f81703a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f81704b;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f81705c;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f81706d;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Data data = this.f81707e;
        int hashCode5 = (hashCode4 + (data == null ? 0 : data.hashCode())) * 31;
        List<String> list = this.f81708f;
        int hashCode6 = (hashCode5 + (list == null ? 0 : list.hashCode())) * 31;
        String str5 = this.f81709g;
        return hashCode6 + (str5 != null ? str5.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        String str = this.f81703a;
        String str2 = this.f81704b;
        String str3 = this.f81705c;
        String str4 = this.f81706d;
        Data data = this.f81707e;
        List<String> list = this.f81708f;
        String str5 = this.f81709g;
        return "OneLikeNewsResponse(systemMessage=" + str + ", code=" + str2 + ", codeType=" + str3 + ", responseDateTime=" + str4 + ", data=" + data + ", replaceMessage=" + list + ", desc=" + str5 + ")";
    }

    public OneLikeNewsResponse(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable Data data, @Nullable List<String> list, @Nullable String str5) {
        this.f81703a = str;
        this.f81704b = str2;
        this.f81705c = str3;
        this.f81706d = str4;
        this.f81707e = data;
        this.f81708f = list;
        this.f81709g = str5;
    }

    public /* synthetic */ OneLikeNewsResponse(String str, String str2, String str3, String str4, Data data, List list, String str5, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : data, (i & 32) != 0 ? null : list, (i & 64) != 0 ? null : str5);
    }
}
