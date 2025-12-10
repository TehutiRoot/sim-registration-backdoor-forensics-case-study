package th.p047co.dtac.android.dtacone.app_one.model.stv;

import androidx.compose.runtime.internal.StabilityInferred;
import com.google.gson.annotations.SerializedName;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 0)
@Metadata(m29143d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0019\b\u0007\u0018\u00002\u00020\u0001Bc\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\u0012\b\u0002\u0010\n\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0018\u00010\t\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\f\u0010\rR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u000f\u001a\u0004\b\u0013\u0010\u0011R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u000f\u001a\u0004\b\u0015\u0010\u0011R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u000f\u001a\u0004\b\u0017\u0010\u0011R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR$\u0010\n\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b \u0010\u000f\u001a\u0004\b!\u0010\u0011¨\u0006\""}, m29142d2 = {"Lth/co/dtac/android/dtacone/app_one/model/stv/OneStvRecommendPackageResponse;", "", "", "systemMessage", "code", "codeType", "responseDateTime", "Lth/co/dtac/android/dtacone/app_one/model/stv/OneStvRecommendPackageResp;", "recommendedPackage", "", "replaceMessage", "desc", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lth/co/dtac/android/dtacone/app_one/model/stv/OneStvRecommendPackageResp;Ljava/util/List;Ljava/lang/String;)V", PDPageLabelRange.STYLE_LETTERS_LOWER, "Ljava/lang/String;", "getSystemMessage", "()Ljava/lang/String;", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "getCode", OperatorName.CURVE_TO, "getCodeType", "d", "getResponseDateTime", "e", "Lth/co/dtac/android/dtacone/app_one/model/stv/OneStvRecommendPackageResp;", "getRecommendedPackage", "()Lth/co/dtac/android/dtacone/app_one/model/stv/OneStvRecommendPackageResp;", OperatorName.FILL_NON_ZERO, "Ljava/util/List;", "getReplaceMessage", "()Ljava/util/List;", OperatorName.NON_STROKING_GRAY, "getDesc", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0})
/* renamed from: th.co.dtac.android.dtacone.app_one.model.stv.OneStvRecommendPackageResponse */
/* loaded from: classes7.dex */
public final class OneStvRecommendPackageResponse {
    public static final int $stable = 8;
    @SerializedName("systemMessage")
    @Nullable

    /* renamed from: a */
    private final String f82293a;
    @SerializedName("code")
    @Nullable

    /* renamed from: b */
    private final String f82294b;
    @SerializedName("codeType")
    @Nullable

    /* renamed from: c */
    private final String f82295c;
    @SerializedName("responseDateTime")
    @Nullable

    /* renamed from: d */
    private final String f82296d;
    @SerializedName("data")
    @Nullable

    /* renamed from: e */
    private final OneStvRecommendPackageResp f82297e;
    @SerializedName("replaceMessage")
    @Nullable

    /* renamed from: f */
    private final List<String> f82298f;
    @SerializedName("desc")
    @Nullable

    /* renamed from: g */
    private final String f82299g;

    public OneStvRecommendPackageResponse() {
        this(null, null, null, null, null, null, null, 127, null);
    }

    @Nullable
    public final String getCode() {
        return this.f82294b;
    }

    @Nullable
    public final String getCodeType() {
        return this.f82295c;
    }

    @Nullable
    public final String getDesc() {
        return this.f82299g;
    }

    @Nullable
    public final OneStvRecommendPackageResp getRecommendedPackage() {
        return this.f82297e;
    }

    @Nullable
    public final List<String> getReplaceMessage() {
        return this.f82298f;
    }

    @Nullable
    public final String getResponseDateTime() {
        return this.f82296d;
    }

    @Nullable
    public final String getSystemMessage() {
        return this.f82293a;
    }

    public OneStvRecommendPackageResponse(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable OneStvRecommendPackageResp oneStvRecommendPackageResp, @Nullable List<String> list, @Nullable String str5) {
        this.f82293a = str;
        this.f82294b = str2;
        this.f82295c = str3;
        this.f82296d = str4;
        this.f82297e = oneStvRecommendPackageResp;
        this.f82298f = list;
        this.f82299g = str5;
    }

    public /* synthetic */ OneStvRecommendPackageResponse(String str, String str2, String str3, String str4, OneStvRecommendPackageResp oneStvRecommendPackageResp, List list, String str5, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : oneStvRecommendPackageResp, (i & 32) != 0 ? null : list, (i & 64) != 0 ? null : str5);
    }
}