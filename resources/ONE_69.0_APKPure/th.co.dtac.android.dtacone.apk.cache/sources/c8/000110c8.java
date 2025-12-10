package th.p047co.dtac.android.dtacone.app_one.model.stv;

import androidx.compose.runtime.internal.StabilityInferred;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.gson.annotations.SerializedName;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.i18n.MessageBundle;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 0)
@Metadata(m29143d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u0011\n\u0002\b\u0007\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\b\n\u0002\b>\b\u0007\u0018\u00002\u00020\u0001B\u008d\u0002\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\u000e\b\u0002\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00020\f\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0002\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u001c\u0010\u001dR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\"\u0010\u001f\u001a\u0004\b#\u0010!R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b$\u0010\u001f\u001a\u0004\b%\u0010!R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b&\u0010\u001f\u001a\u0004\b'\u0010!R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b(\u0010\u001f\u001a\u0004\b)\u0010!R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b*\u0010\u001f\u001a\u0004\b+\u0010!R\u001c\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b,\u0010\u001f\u001a\u0004\b-\u0010!R\u001c\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b.\u0010\u001f\u001a\u0004\b/\u0010!R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b0\u0010\u001f\u001a\u0004\b1\u0010!R \u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00020\f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b2\u00103\u001a\u0004\b4\u00105R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b6\u0010\u001f\u001a\u0004\b7\u0010!R\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b8\u0010\u001f\u001a\u0004\b9\u0010!R\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b:\u0010\u001f\u001a\u0004\b;\u0010!R\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b<\u0010\u001f\u001a\u0004\b=\u0010!R\u001c\u0010\u0012\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b>\u0010\u001f\u001a\u0004\b?\u0010!R\u001a\u0010\u0013\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b@\u0010\u001f\u001a\u0004\bA\u0010!R\u001c\u0010\u0015\u001a\u0004\u0018\u00010\u00148\u0006X\u0087\u0004¢\u0006\f\n\u0004\bB\u0010C\u001a\u0004\bD\u0010ER\u001c\u0010\u0017\u001a\u0004\u0018\u00010\u00168\u0006X\u0087\u0004¢\u0006\f\n\u0004\bF\u0010G\u001a\u0004\bH\u0010IR\u001c\u0010\u0018\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\bJ\u0010\u001f\u001a\u0004\bK\u0010!R\u001c\u0010\u0019\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\bL\u0010\u001f\u001a\u0004\bM\u0010!R\u001c\u0010\u001a\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\bN\u0010\u001f\u001a\u0004\bO\u0010!R$\u0010\u001b\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bP\u0010\u001f\u001a\u0004\bQ\u0010!\"\u0004\bR\u0010S¨\u0006T"}, m29142d2 = {"Lth/co/dtac/android/dtacone/app_one/model/stv/OneStvRecommendPackage;", "", "", "code", "ussdCode", "flowId", "type", "typeImage", MessageBundle.TITLE_ENTRY, "descriptionTitle", "packageGroupType", "name", "", "descriptions", "net", "validity", "priceLabel", FirebaseAnalytics.Param.PRICE, "commission", "commissionColor", "", "commissionValue", "", "seq", "campaignID", "offerPOID", "requesterLocation", "ipkCode", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Float;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", PDPageLabelRange.STYLE_LETTERS_LOWER, "Ljava/lang/String;", "getCode", "()Ljava/lang/String;", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "getUssdCode", OperatorName.CURVE_TO, "getFlowId", "d", "getType", "e", "getTypeImage", OperatorName.FILL_NON_ZERO, "getTitle", OperatorName.NON_STROKING_GRAY, "getDescriptionTitle", OperatorName.CLOSE_PATH, "getPackageGroupType", "i", "getName", OperatorName.SET_LINE_JOINSTYLE, "[Ljava/lang/String;", "getDescriptions", "()[Ljava/lang/String;", OperatorName.NON_STROKING_CMYK, "getNet", OperatorName.LINE_TO, "getValidity", OperatorName.MOVE_TO, "getPriceLabel", OperatorName.ENDPATH, "getPrice", "o", "getCommission", "p", "getCommissionColor", OperatorName.SAVE, "Ljava/lang/Float;", "getCommissionValue", "()Ljava/lang/Float;", PDPageLabelRange.STYLE_ROMAN_LOWER, "Ljava/lang/Integer;", "getSeq", "()Ljava/lang/Integer;", OperatorName.CLOSE_AND_STROKE, "getCampaignID", "t", "getOfferPOID", "u", "getRequesterLocation", OperatorName.CURVE_TO_REPLICATE_INITIAL_POINT, "getIpkCode", "setIpkCode", "(Ljava/lang/String;)V", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0})
/* renamed from: th.co.dtac.android.dtacone.app_one.model.stv.OneStvRecommendPackage */
/* loaded from: classes7.dex */
public final class OneStvRecommendPackage {
    public static final int $stable = 8;
    @SerializedName("code")
    @Nullable

    /* renamed from: a */
    private final String f82259a;
    @SerializedName("ussdCode")
    @Nullable

    /* renamed from: b */
    private final String f82260b;
    @SerializedName("flowId")
    @Nullable

    /* renamed from: c */
    private final String f82261c;
    @SerializedName("type")
    @Nullable

    /* renamed from: d */
    private final String f82262d;
    @SerializedName("typeImage")
    @Nullable

    /* renamed from: e */
    private final String f82263e;
    @SerializedName(MessageBundle.TITLE_ENTRY)
    @Nullable

    /* renamed from: f */
    private final String f82264f;
    @SerializedName("descriptionTitle")
    @Nullable

    /* renamed from: g */
    private final String f82265g;
    @SerializedName("packageGroupType")
    @Nullable

    /* renamed from: h */
    private final String f82266h;
    @SerializedName("name")
    @Nullable

    /* renamed from: i */
    private final String f82267i;
    @SerializedName("descriptions")
    @NotNull

    /* renamed from: j */
    private final String[] f82268j;
    @SerializedName("net")
    @Nullable

    /* renamed from: k */
    private final String f82269k;
    @SerializedName("validity")
    @Nullable

    /* renamed from: l */
    private final String f82270l;
    @SerializedName("priceLabel")
    @Nullable

    /* renamed from: m */
    private final String f82271m;
    @SerializedName(FirebaseAnalytics.Param.PRICE)
    @Nullable

    /* renamed from: n */
    private final String f82272n;
    @SerializedName("commission")
    @Nullable

    /* renamed from: o */
    private final String f82273o;
    @SerializedName("commissionColor")
    @NotNull

    /* renamed from: p */
    private final String f82274p;
    @SerializedName("commissionValue")
    @Nullable

    /* renamed from: q */
    private final Float f82275q;
    @SerializedName("seq")
    @Nullable

    /* renamed from: r */
    private final Integer f82276r;
    @SerializedName("campaignID")
    @Nullable

    /* renamed from: s */
    private final String f82277s;
    @SerializedName("offerPOID")
    @Nullable

    /* renamed from: t */
    private final String f82278t;
    @SerializedName("requesterLocation")
    @Nullable

    /* renamed from: u */
    private final String f82279u;

    /* renamed from: v */
    public String f82280v;

    public OneStvRecommendPackage(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable String str6, @Nullable String str7, @Nullable String str8, @Nullable String str9, @NotNull String[] descriptions, @Nullable String str10, @Nullable String str11, @Nullable String str12, @Nullable String str13, @Nullable String str14, @NotNull String commissionColor, @Nullable Float f, @Nullable Integer num, @Nullable String str15, @Nullable String str16, @Nullable String str17, @Nullable String str18) {
        Intrinsics.checkNotNullParameter(descriptions, "descriptions");
        Intrinsics.checkNotNullParameter(commissionColor, "commissionColor");
        this.f82259a = str;
        this.f82260b = str2;
        this.f82261c = str3;
        this.f82262d = str4;
        this.f82263e = str5;
        this.f82264f = str6;
        this.f82265g = str7;
        this.f82266h = str8;
        this.f82267i = str9;
        this.f82268j = descriptions;
        this.f82269k = str10;
        this.f82270l = str11;
        this.f82271m = str12;
        this.f82272n = str13;
        this.f82273o = str14;
        this.f82274p = commissionColor;
        this.f82275q = f;
        this.f82276r = num;
        this.f82277s = str15;
        this.f82278t = str16;
        this.f82279u = str17;
        this.f82280v = str18;
    }

    @Nullable
    public final String getCampaignID() {
        return this.f82277s;
    }

    @Nullable
    public final String getCode() {
        return this.f82259a;
    }

    @Nullable
    public final String getCommission() {
        return this.f82273o;
    }

    @NotNull
    public final String getCommissionColor() {
        return this.f82274p;
    }

    @Nullable
    public final Float getCommissionValue() {
        return this.f82275q;
    }

    @Nullable
    public final String getDescriptionTitle() {
        return this.f82265g;
    }

    @NotNull
    public final String[] getDescriptions() {
        return this.f82268j;
    }

    @Nullable
    public final String getFlowId() {
        return this.f82261c;
    }

    @Nullable
    public final String getIpkCode() {
        return this.f82280v;
    }

    @Nullable
    public final String getName() {
        return this.f82267i;
    }

    @Nullable
    public final String getNet() {
        return this.f82269k;
    }

    @Nullable
    public final String getOfferPOID() {
        return this.f82278t;
    }

    @Nullable
    public final String getPackageGroupType() {
        return this.f82266h;
    }

    @Nullable
    public final String getPrice() {
        return this.f82272n;
    }

    @Nullable
    public final String getPriceLabel() {
        return this.f82271m;
    }

    @Nullable
    public final String getRequesterLocation() {
        return this.f82279u;
    }

    @Nullable
    public final Integer getSeq() {
        return this.f82276r;
    }

    @Nullable
    public final String getTitle() {
        return this.f82264f;
    }

    @Nullable
    public final String getType() {
        return this.f82262d;
    }

    @Nullable
    public final String getTypeImage() {
        return this.f82263e;
    }

    @Nullable
    public final String getUssdCode() {
        return this.f82260b;
    }

    @Nullable
    public final String getValidity() {
        return this.f82270l;
    }

    public final void setIpkCode(@Nullable String str) {
        this.f82280v = str;
    }

    public /* synthetic */ OneStvRecommendPackage(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String[] strArr, String str10, String str11, String str12, String str13, String str14, String str15, Float f, Integer num, String str16, String str17, String str18, String str19, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? "" : str4, (i & 16) != 0 ? "" : str5, (i & 32) != 0 ? "" : str6, (i & 64) != 0 ? "" : str7, (i & 128) != 0 ? "" : str8, (i & 256) != 0 ? "" : str9, (i & 512) != 0 ? new String[0] : strArr, (i & 1024) != 0 ? "" : str10, (i & 2048) != 0 ? "" : str11, (i & 4096) != 0 ? "" : str12, (i & 8192) != 0 ? "" : str13, (i & 16384) != 0 ? "" : str14, (32768 & i) != 0 ? "#178729" : str15, f, num, (262144 & i) != 0 ? "" : str16, (524288 & i) != 0 ? "" : str17, (1048576 & i) != 0 ? "" : str18, (i & 2097152) != 0 ? "" : str19);
    }
}