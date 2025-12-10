package th.p047co.dtac.android.dtacone.app_one.model.rectify;

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
@Metadata(m29143d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0011\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0015\b\u0087\b\u0018\u00002\u00020\u0001:\u00013Bc\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\u0012\b\u0002\u0010\n\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\t\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\f\u0010\rJ\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0012\u0010\u0010\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u000fJ\u0012\u0010\u0011\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u000fJ\u0012\u0010\u0012\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u000fJ\u0012\u0010\u0013\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0015\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0012\u0010\u0017\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u000fJl\u0010\u0018\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\u0012\b\u0002\u0010\n\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\t2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u000fJ\u0010\u0010\u001c\u001a\u00020\u001bHÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u001a\u0010 \u001a\u00020\u001f2\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b \u0010!R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010\u000fR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b%\u0010#\u001a\u0004\b&\u0010\u000fR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b'\u0010#\u001a\u0004\b(\u0010\u000fR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b)\u0010#\u001a\u0004\b*\u0010\u000fR\u001c\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b+\u0010,\u001a\u0004\b-\u0010\u0014R$\u0010\n\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b.\u0010/\u001a\u0004\b0\u0010\u0016R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b1\u0010#\u001a\u0004\b2\u0010\u000f¨\u00064"}, m29142d2 = {"Lth/co/dtac/android/dtacone/app_one/model/rectify/OneRectifyListResponse;", "", "", "systemMessage", "code", "codeType", "responseDateTime", "Lth/co/dtac/android/dtacone/app_one/model/rectify/OneRectifyListResponse$DataItem;", "data", "", "replaceMessage", "desc", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lth/co/dtac/android/dtacone/app_one/model/rectify/OneRectifyListResponse$DataItem;Ljava/util/List;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "component5", "()Lth/co/dtac/android/dtacone/app_one/model/rectify/OneRectifyListResponse$DataItem;", "component6", "()Ljava/util/List;", "component7", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lth/co/dtac/android/dtacone/app_one/model/rectify/OneRectifyListResponse$DataItem;Ljava/util/List;Ljava/lang/String;)Lth/co/dtac/android/dtacone/app_one/model/rectify/OneRectifyListResponse;", "toString", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", PDPageLabelRange.STYLE_LETTERS_LOWER, "Ljava/lang/String;", "getSystemMessage", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "getCode", OperatorName.CURVE_TO, "getCodeType", "d", "getResponseDateTime", "e", "Lth/co/dtac/android/dtacone/app_one/model/rectify/OneRectifyListResponse$DataItem;", "getData", OperatorName.FILL_NON_ZERO, "Ljava/util/List;", "getReplaceMessage", OperatorName.NON_STROKING_GRAY, "getDesc", "DataItem", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0})
/* renamed from: th.co.dtac.android.dtacone.app_one.model.rectify.OneRectifyListResponse */
/* loaded from: classes7.dex */
public final class OneRectifyListResponse {
    public static final int $stable = 8;
    @SerializedName("systemMessage")
    @Nullable

    /* renamed from: a */
    private final String f82133a;
    @SerializedName("code")
    @Nullable

    /* renamed from: b */
    private final String f82134b;
    @SerializedName("codeType")
    @Nullable

    /* renamed from: c */
    private final String f82135c;
    @SerializedName("responseDateTime")
    @Nullable

    /* renamed from: d */
    private final String f82136d;
    @SerializedName("data")
    @Nullable

    /* renamed from: e */
    private final DataItem f82137e;
    @SerializedName("replaceMessage")
    @Nullable

    /* renamed from: f */
    private final List<Object> f82138f;
    @SerializedName("desc")
    @Nullable

    /* renamed from: g */
    private final String f82139g;

    @StabilityInferred(parameters = 0)
    @Metadata(m29143d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0018B\u0019\u0012\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0018\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\"\u0010\t\u001a\u00020\u00002\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\"\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\b¨\u0006\u0019"}, m29142d2 = {"Lth/co/dtac/android/dtacone/app_one/model/rectify/OneRectifyListResponse$DataItem;", "", "", "Lth/co/dtac/android/dtacone/app_one/model/rectify/OneRectifyListResponse$DataItem$RectifyItem;", "rectifyList", "<init>", "(Ljava/util/List;)V", "component1", "()Ljava/util/List;", "copy", "(Ljava/util/List;)Lth/co/dtac/android/dtacone/app_one/model/rectify/OneRectifyListResponse$DataItem;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", PDPageLabelRange.STYLE_LETTERS_LOWER, "Ljava/util/List;", "getRectifyList", "RectifyItem", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0})
    /* renamed from: th.co.dtac.android.dtacone.app_one.model.rectify.OneRectifyListResponse$DataItem */
    /* loaded from: classes7.dex */
    public static final class DataItem {
        public static final int $stable = 8;
        @SerializedName("rectifyList")
        @Nullable

        /* renamed from: a */
        private final List<RectifyItem> f82140a;

        @StabilityInferred(parameters = 0)
        @Metadata(m29143d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b#\n\u0002\u0010\u000b\n\u0002\b\"\b\u0087\b\u0018\u00002\u00020\u0001B£\u0001\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0012\u0010\u0013\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0012\u0010\u0015\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0012\u0010\u0017\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0014J\u0012\u0010\u0018\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0014J\u0012\u0010\u0019\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u0014J\u0012\u0010\u001a\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u0014J\u0012\u0010\u001b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u0014J\u0012\u0010\u001c\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u0014J\u0012\u0010\u001d\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u0014J\u0012\u0010\u001e\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u0014J\u0012\u0010\u001f\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001f\u0010\u0014J\u0012\u0010 \u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b \u0010\u0014J\u0012\u0010!\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b!\u0010\u0014J¬\u0001\u0010\"\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\"\u0010#J\u0010\u0010$\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b$\u0010\u0014J\u0010\u0010%\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b%\u0010&J\u001a\u0010)\u001a\u00020(2\b\u0010'\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b)\u0010*R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b+\u0010,\u001a\u0004\b-\u0010\u0014R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b.\u0010/\u001a\u0004\b0\u0010\u0016R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b1\u0010,\u001a\u0004\b2\u0010\u0014R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b3\u0010,\u001a\u0004\b4\u0010\u0014R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b5\u0010,\u001a\u0004\b6\u0010\u0014R\u001c\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b7\u0010,\u001a\u0004\b8\u0010\u0014R\u001c\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b9\u0010,\u001a\u0004\b:\u0010\u0014R$\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b;\u0010,\u001a\u0004\b<\u0010\u0014\"\u0004\b=\u0010>R\u001c\u0010\f\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b?\u0010,\u001a\u0004\b@\u0010\u0014R$\u0010\r\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bA\u0010,\u001a\u0004\bB\u0010\u0014\"\u0004\bC\u0010>R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\bD\u0010,\u001a\u0004\bE\u0010\u0014R\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\bF\u0010,\u001a\u0004\bG\u0010\u0014R\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\bH\u0010,\u001a\u0004\bI\u0010\u0014¨\u0006J"}, m29142d2 = {"Lth/co/dtac/android/dtacone/app_one/model/rectify/OneRectifyListResponse$DataItem$RectifyItem;", "", "", "marketDescription", "", "amount", "featureCode", "createdDateTime", "transactionRefId", "type", "customerNumber", "customerNumberDisplay", "simR", "simRDisplay", "transactionID", "ussdServiceCode", "featureDescription", "<init>", "(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "()Ljava/lang/Integer;", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "copy", "(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lth/co/dtac/android/dtacone/app_one/model/rectify/OneRectifyListResponse$DataItem$RectifyItem;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", PDPageLabelRange.STYLE_LETTERS_LOWER, "Ljava/lang/String;", "getMarketDescription", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "Ljava/lang/Integer;", "getAmount", OperatorName.CURVE_TO, "getFeatureCode", "d", "getCreatedDateTime", "e", "getTransactionRefId", OperatorName.FILL_NON_ZERO, "getType", OperatorName.NON_STROKING_GRAY, "getCustomerNumber", OperatorName.CLOSE_PATH, "getCustomerNumberDisplay", "setCustomerNumberDisplay", "(Ljava/lang/String;)V", "i", "getSimR", OperatorName.SET_LINE_JOINSTYLE, "getSimRDisplay", "setSimRDisplay", OperatorName.NON_STROKING_CMYK, "getTransactionID", OperatorName.LINE_TO, "getUssdServiceCode", OperatorName.MOVE_TO, "getFeatureDescription", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0})
        /* renamed from: th.co.dtac.android.dtacone.app_one.model.rectify.OneRectifyListResponse$DataItem$RectifyItem */
        /* loaded from: classes7.dex */
        public static final class RectifyItem {
            public static final int $stable = 8;
            @SerializedName("marketDescription")
            @Nullable

            /* renamed from: a */
            private final String f82141a;
            @SerializedName("amount")
            @Nullable

            /* renamed from: b */
            private final Integer f82142b;
            @SerializedName("featureCode")
            @Nullable

            /* renamed from: c */
            private final String f82143c;
            @SerializedName("createdDateTime")
            @Nullable

            /* renamed from: d */
            private final String f82144d;
            @SerializedName("transactionRefId")
            @Nullable

            /* renamed from: e */
            private final String f82145e;
            @SerializedName("type")
            @Nullable

            /* renamed from: f */
            private final String f82146f;
            @SerializedName("customerNumber")
            @Nullable

            /* renamed from: g */
            private final String f82147g;

            /* renamed from: h */
            public String f82148h;
            @SerializedName("simR")
            @Nullable

            /* renamed from: i */
            private final String f82149i;

            /* renamed from: j */
            public String f82150j;
            @SerializedName("transactionID")
            @Nullable

            /* renamed from: k */
            private final String f82151k;
            @SerializedName("ussdServiceCode")
            @Nullable

            /* renamed from: l */
            private final String f82152l;
            @SerializedName("featureDescription")
            @Nullable

            /* renamed from: m */
            private final String f82153m;

            public RectifyItem() {
                this(null, null, null, null, null, null, null, null, null, null, null, null, null, 8191, null);
            }

            @Nullable
            public final String component1() {
                return this.f82141a;
            }

            @Nullable
            public final String component10() {
                return this.f82150j;
            }

            @Nullable
            public final String component11() {
                return this.f82151k;
            }

            @Nullable
            public final String component12() {
                return this.f82152l;
            }

            @Nullable
            public final String component13() {
                return this.f82153m;
            }

            @Nullable
            public final Integer component2() {
                return this.f82142b;
            }

            @Nullable
            public final String component3() {
                return this.f82143c;
            }

            @Nullable
            public final String component4() {
                return this.f82144d;
            }

            @Nullable
            public final String component5() {
                return this.f82145e;
            }

            @Nullable
            public final String component6() {
                return this.f82146f;
            }

            @Nullable
            public final String component7() {
                return this.f82147g;
            }

            @Nullable
            public final String component8() {
                return this.f82148h;
            }

            @Nullable
            public final String component9() {
                return this.f82149i;
            }

            @NotNull
            public final RectifyItem copy(@Nullable String str, @Nullable Integer num, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable String str6, @Nullable String str7, @Nullable String str8, @Nullable String str9, @Nullable String str10, @Nullable String str11, @Nullable String str12) {
                return new RectifyItem(str, num, str2, str3, str4, str5, str6, str7, str8, str9, str10, str11, str12);
            }

            public boolean equals(@Nullable Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj instanceof RectifyItem) {
                    RectifyItem rectifyItem = (RectifyItem) obj;
                    return Intrinsics.areEqual(this.f82141a, rectifyItem.f82141a) && Intrinsics.areEqual(this.f82142b, rectifyItem.f82142b) && Intrinsics.areEqual(this.f82143c, rectifyItem.f82143c) && Intrinsics.areEqual(this.f82144d, rectifyItem.f82144d) && Intrinsics.areEqual(this.f82145e, rectifyItem.f82145e) && Intrinsics.areEqual(this.f82146f, rectifyItem.f82146f) && Intrinsics.areEqual(this.f82147g, rectifyItem.f82147g) && Intrinsics.areEqual(this.f82148h, rectifyItem.f82148h) && Intrinsics.areEqual(this.f82149i, rectifyItem.f82149i) && Intrinsics.areEqual(this.f82150j, rectifyItem.f82150j) && Intrinsics.areEqual(this.f82151k, rectifyItem.f82151k) && Intrinsics.areEqual(this.f82152l, rectifyItem.f82152l) && Intrinsics.areEqual(this.f82153m, rectifyItem.f82153m);
                }
                return false;
            }

            @Nullable
            public final Integer getAmount() {
                return this.f82142b;
            }

            @Nullable
            public final String getCreatedDateTime() {
                return this.f82144d;
            }

            @Nullable
            public final String getCustomerNumber() {
                return this.f82147g;
            }

            @Nullable
            public final String getCustomerNumberDisplay() {
                return this.f82148h;
            }

            @Nullable
            public final String getFeatureCode() {
                return this.f82143c;
            }

            @Nullable
            public final String getFeatureDescription() {
                return this.f82153m;
            }

            @Nullable
            public final String getMarketDescription() {
                return this.f82141a;
            }

            @Nullable
            public final String getSimR() {
                return this.f82149i;
            }

            @Nullable
            public final String getSimRDisplay() {
                return this.f82150j;
            }

            @Nullable
            public final String getTransactionID() {
                return this.f82151k;
            }

            @Nullable
            public final String getTransactionRefId() {
                return this.f82145e;
            }

            @Nullable
            public final String getType() {
                return this.f82146f;
            }

            @Nullable
            public final String getUssdServiceCode() {
                return this.f82152l;
            }

            public int hashCode() {
                String str = this.f82141a;
                int hashCode = (str == null ? 0 : str.hashCode()) * 31;
                Integer num = this.f82142b;
                int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
                String str2 = this.f82143c;
                int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
                String str3 = this.f82144d;
                int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
                String str4 = this.f82145e;
                int hashCode5 = (hashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
                String str5 = this.f82146f;
                int hashCode6 = (hashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
                String str6 = this.f82147g;
                int hashCode7 = (hashCode6 + (str6 == null ? 0 : str6.hashCode())) * 31;
                String str7 = this.f82148h;
                int hashCode8 = (hashCode7 + (str7 == null ? 0 : str7.hashCode())) * 31;
                String str8 = this.f82149i;
                int hashCode9 = (hashCode8 + (str8 == null ? 0 : str8.hashCode())) * 31;
                String str9 = this.f82150j;
                int hashCode10 = (hashCode9 + (str9 == null ? 0 : str9.hashCode())) * 31;
                String str10 = this.f82151k;
                int hashCode11 = (hashCode10 + (str10 == null ? 0 : str10.hashCode())) * 31;
                String str11 = this.f82152l;
                int hashCode12 = (hashCode11 + (str11 == null ? 0 : str11.hashCode())) * 31;
                String str12 = this.f82153m;
                return hashCode12 + (str12 != null ? str12.hashCode() : 0);
            }

            public final void setCustomerNumberDisplay(@Nullable String str) {
                this.f82148h = str;
            }

            public final void setSimRDisplay(@Nullable String str) {
                this.f82150j = str;
            }

            @NotNull
            public String toString() {
                String str = this.f82141a;
                Integer num = this.f82142b;
                String str2 = this.f82143c;
                String str3 = this.f82144d;
                String str4 = this.f82145e;
                String str5 = this.f82146f;
                String str6 = this.f82147g;
                String str7 = this.f82148h;
                String str8 = this.f82149i;
                String str9 = this.f82150j;
                String str10 = this.f82151k;
                String str11 = this.f82152l;
                String str12 = this.f82153m;
                return "RectifyItem(marketDescription=" + str + ", amount=" + num + ", featureCode=" + str2 + ", createdDateTime=" + str3 + ", transactionRefId=" + str4 + ", type=" + str5 + ", customerNumber=" + str6 + ", customerNumberDisplay=" + str7 + ", simR=" + str8 + ", simRDisplay=" + str9 + ", transactionID=" + str10 + ", ussdServiceCode=" + str11 + ", featureDescription=" + str12 + ")";
            }

            public RectifyItem(@Nullable String str, @Nullable Integer num, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable String str6, @Nullable String str7, @Nullable String str8, @Nullable String str9, @Nullable String str10, @Nullable String str11, @Nullable String str12) {
                this.f82141a = str;
                this.f82142b = num;
                this.f82143c = str2;
                this.f82144d = str3;
                this.f82145e = str4;
                this.f82146f = str5;
                this.f82147g = str6;
                this.f82148h = str7;
                this.f82149i = str8;
                this.f82150j = str9;
                this.f82151k = str10;
                this.f82152l = str11;
                this.f82153m = str12;
            }

            public /* synthetic */ RectifyItem(String str, Integer num, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : num, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? null : str3, (i & 16) != 0 ? null : str4, (i & 32) != 0 ? null : str5, (i & 64) != 0 ? null : str6, (i & 128) != 0 ? null : str7, (i & 256) != 0 ? null : str8, (i & 512) != 0 ? null : str9, (i & 1024) != 0 ? null : str10, (i & 2048) != 0 ? null : str11, (i & 4096) == 0 ? str12 : null);
            }
        }

        public DataItem() {
            this(null, 1, null);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ DataItem copy$default(DataItem dataItem, List list, int i, Object obj) {
            if ((i & 1) != 0) {
                list = dataItem.f82140a;
            }
            return dataItem.copy(list);
        }

        @Nullable
        public final List<RectifyItem> component1() {
            return this.f82140a;
        }

        @NotNull
        public final DataItem copy(@Nullable List<RectifyItem> list) {
            return new DataItem(list);
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof DataItem) && Intrinsics.areEqual(this.f82140a, ((DataItem) obj).f82140a);
        }

        @Nullable
        public final List<RectifyItem> getRectifyList() {
            return this.f82140a;
        }

        public int hashCode() {
            List<RectifyItem> list = this.f82140a;
            if (list == null) {
                return 0;
            }
            return list.hashCode();
        }

        @NotNull
        public String toString() {
            List<RectifyItem> list = this.f82140a;
            return "DataItem(rectifyList=" + list + ")";
        }

        public DataItem(@Nullable List<RectifyItem> list) {
            this.f82140a = list;
        }

        public /* synthetic */ DataItem(List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : list);
        }
    }

    public OneRectifyListResponse() {
        this(null, null, null, null, null, null, null, 127, null);
    }

    public static /* synthetic */ OneRectifyListResponse copy$default(OneRectifyListResponse oneRectifyListResponse, String str, String str2, String str3, String str4, DataItem dataItem, List list, String str5, int i, Object obj) {
        if ((i & 1) != 0) {
            str = oneRectifyListResponse.f82133a;
        }
        if ((i & 2) != 0) {
            str2 = oneRectifyListResponse.f82134b;
        }
        String str6 = str2;
        if ((i & 4) != 0) {
            str3 = oneRectifyListResponse.f82135c;
        }
        String str7 = str3;
        if ((i & 8) != 0) {
            str4 = oneRectifyListResponse.f82136d;
        }
        String str8 = str4;
        if ((i & 16) != 0) {
            dataItem = oneRectifyListResponse.f82137e;
        }
        DataItem dataItem2 = dataItem;
        List<Object> list2 = list;
        if ((i & 32) != 0) {
            list2 = oneRectifyListResponse.f82138f;
        }
        List list3 = list2;
        if ((i & 64) != 0) {
            str5 = oneRectifyListResponse.f82139g;
        }
        return oneRectifyListResponse.copy(str, str6, str7, str8, dataItem2, list3, str5);
    }

    @Nullable
    public final String component1() {
        return this.f82133a;
    }

    @Nullable
    public final String component2() {
        return this.f82134b;
    }

    @Nullable
    public final String component3() {
        return this.f82135c;
    }

    @Nullable
    public final String component4() {
        return this.f82136d;
    }

    @Nullable
    public final DataItem component5() {
        return this.f82137e;
    }

    @Nullable
    public final List<Object> component6() {
        return this.f82138f;
    }

    @Nullable
    public final String component7() {
        return this.f82139g;
    }

    @NotNull
    public final OneRectifyListResponse copy(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable DataItem dataItem, @Nullable List<? extends Object> list, @Nullable String str5) {
        return new OneRectifyListResponse(str, str2, str3, str4, dataItem, list, str5);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof OneRectifyListResponse) {
            OneRectifyListResponse oneRectifyListResponse = (OneRectifyListResponse) obj;
            return Intrinsics.areEqual(this.f82133a, oneRectifyListResponse.f82133a) && Intrinsics.areEqual(this.f82134b, oneRectifyListResponse.f82134b) && Intrinsics.areEqual(this.f82135c, oneRectifyListResponse.f82135c) && Intrinsics.areEqual(this.f82136d, oneRectifyListResponse.f82136d) && Intrinsics.areEqual(this.f82137e, oneRectifyListResponse.f82137e) && Intrinsics.areEqual(this.f82138f, oneRectifyListResponse.f82138f) && Intrinsics.areEqual(this.f82139g, oneRectifyListResponse.f82139g);
        }
        return false;
    }

    @Nullable
    public final String getCode() {
        return this.f82134b;
    }

    @Nullable
    public final String getCodeType() {
        return this.f82135c;
    }

    @Nullable
    public final DataItem getData() {
        return this.f82137e;
    }

    @Nullable
    public final String getDesc() {
        return this.f82139g;
    }

    @Nullable
    public final List<Object> getReplaceMessage() {
        return this.f82138f;
    }

    @Nullable
    public final String getResponseDateTime() {
        return this.f82136d;
    }

    @Nullable
    public final String getSystemMessage() {
        return this.f82133a;
    }

    public int hashCode() {
        String str = this.f82133a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f82134b;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f82135c;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f82136d;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        DataItem dataItem = this.f82137e;
        int hashCode5 = (hashCode4 + (dataItem == null ? 0 : dataItem.hashCode())) * 31;
        List<Object> list = this.f82138f;
        int hashCode6 = (hashCode5 + (list == null ? 0 : list.hashCode())) * 31;
        String str5 = this.f82139g;
        return hashCode6 + (str5 != null ? str5.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        String str = this.f82133a;
        String str2 = this.f82134b;
        String str3 = this.f82135c;
        String str4 = this.f82136d;
        DataItem dataItem = this.f82137e;
        List<Object> list = this.f82138f;
        String str5 = this.f82139g;
        return "OneRectifyListResponse(systemMessage=" + str + ", code=" + str2 + ", codeType=" + str3 + ", responseDateTime=" + str4 + ", data=" + dataItem + ", replaceMessage=" + list + ", desc=" + str5 + ")";
    }

    public OneRectifyListResponse(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable DataItem dataItem, @Nullable List<? extends Object> list, @Nullable String str5) {
        this.f82133a = str;
        this.f82134b = str2;
        this.f82135c = str3;
        this.f82136d = str4;
        this.f82137e = dataItem;
        this.f82138f = list;
        this.f82139g = str5;
    }

    public /* synthetic */ OneRectifyListResponse(String str, String str2, String str3, String str4, DataItem dataItem, List list, String str5, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : dataItem, (i & 32) != 0 ? null : list, (i & 64) != 0 ? null : str5);
    }
}