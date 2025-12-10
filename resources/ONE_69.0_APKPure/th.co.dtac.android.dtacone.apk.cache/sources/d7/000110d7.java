package th.p047co.dtac.android.dtacone.app_one.model.stv;

import androidx.compose.runtime.internal.StabilityInferred;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.gson.annotations.SerializedName;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.i18n.MessageBundle;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 0)
@Metadata(m29143d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010 \n\u0000\n\u0002\u0010\u0006\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\"\n\u0002\u0010\u000b\n\u0002\b/\b\u0087\b\u0018\u00002\u00020\u0001Bý\u0001\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\u0010\b\u0002\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\t\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0017\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u0012\u0010\u001c\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0012\u0010\u001e\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001dJ\u0012\u0010\u001f\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001f\u0010\u001dJ\u0012\u0010 \u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b \u0010\u001dJ\u0012\u0010!\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b!\u0010\u001dJ\u0012\u0010\"\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\"\u0010\u001dJ\u0018\u0010#\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b#\u0010$J\u0012\u0010%\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0004\b%\u0010&J\u0012\u0010'\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b'\u0010\u001dJ\u0012\u0010(\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b(\u0010\u001dJ\u0012\u0010)\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b)\u0010\u001dJ\u0012\u0010*\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b*\u0010\u001dJ\u0012\u0010+\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b+\u0010\u001dJ\u0012\u0010,\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b,\u0010\u001dJ\u0012\u0010-\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b-\u0010\u001dJ\u0012\u0010.\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b.\u0010\u001dJ\u0012\u0010/\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b/\u0010\u001dJ\u0012\u00100\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b0\u0010\u001dJ\u0012\u00101\u001a\u0004\u0018\u00010\u0017HÆ\u0003¢\u0006\u0004\b1\u00102J\u0012\u00103\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b3\u0010\u001dJ\u0086\u0002\u00104\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00022\u0010\b\u0002\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\t2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00172\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b4\u00105J\u0010\u00106\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b6\u0010\u001dJ\u0010\u00107\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b7\u00108J\u001a\u0010;\u001a\u00020:2\b\u00109\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b;\u0010<R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b=\u0010>\u001a\u0004\b?\u0010\u001dR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b@\u0010>\u001a\u0004\bA\u0010\u001dR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\bB\u0010>\u001a\u0004\bC\u0010\u001dR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\bD\u0010>\u001a\u0004\bE\u0010\u001dR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\bF\u0010>\u001a\u0004\bG\u0010\u001dR\u001c\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\bH\u0010>\u001a\u0004\bI\u0010\u001dR\"\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\bJ\u0010K\u001a\u0004\bL\u0010$R\u001c\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\bM\u0010N\u001a\u0004\bO\u0010&R\u001c\u0010\r\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\bP\u0010>\u001a\u0004\bQ\u0010\u001dR\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\bR\u0010>\u001a\u0004\bS\u0010\u001dR\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\bT\u0010>\u001a\u0004\bU\u0010\u001dR\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\bV\u0010>\u001a\u0004\bW\u0010\u001dR\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\bX\u0010>\u001a\u0004\bY\u0010\u001dR\u001c\u0010\u0012\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\bZ\u0010>\u001a\u0004\b[\u0010\u001dR\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\\\u0010>\u001a\u0004\b]\u0010\u001dR\u001c\u0010\u0014\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b^\u0010>\u001a\u0004\b_\u0010\u001dR\u001c\u0010\u0015\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b`\u0010>\u001a\u0004\ba\u0010\u001dR\u001c\u0010\u0016\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\bb\u0010>\u001a\u0004\bc\u0010\u001dR\u001c\u0010\u0018\u001a\u0004\u0018\u00010\u00178\u0006X\u0087\u0004¢\u0006\f\n\u0004\bd\u0010e\u001a\u0004\bf\u00102R\u001c\u0010\u0019\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\bg\u0010>\u001a\u0004\bh\u0010\u001d¨\u0006i"}, m29142d2 = {"Lth/co/dtac/android/dtacone/app_one/model/stv/PackagesItem;", "", "", "poqItemProductPackageId", "code", "packageGroupType", "descriptionTitle", "ussdCode", MessageBundle.TITLE_ENTRY, "", "descriptions", "", "commissionValue", "poqItemProductOfferingId", FirebaseAnalytics.Param.PRICE, "poqItemId", "name", "typeImage", "commission", "validity", "commissionColor", "net", "priceLabel", "", "seq", "categoryId", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/Double;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "component5", "component6", "component7", "()Ljava/util/List;", "component8", "()Ljava/lang/Double;", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "()Ljava/lang/Integer;", "component20", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/Double;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;)Lth/co/dtac/android/dtacone/app_one/model/stv/PackagesItem;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", PDPageLabelRange.STYLE_LETTERS_LOWER, "Ljava/lang/String;", "getPoqItemProductPackageId", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "getCode", OperatorName.CURVE_TO, "getPackageGroupType", "d", "getDescriptionTitle", "e", "getUssdCode", OperatorName.FILL_NON_ZERO, "getTitle", OperatorName.NON_STROKING_GRAY, "Ljava/util/List;", "getDescriptions", OperatorName.CLOSE_PATH, "Ljava/lang/Double;", "getCommissionValue", "i", "getPoqItemProductOfferingId", OperatorName.SET_LINE_JOINSTYLE, "getPrice", OperatorName.NON_STROKING_CMYK, "getPoqItemId", OperatorName.LINE_TO, "getName", OperatorName.MOVE_TO, "getTypeImage", OperatorName.ENDPATH, "getCommission", "o", "getValidity", "p", "getCommissionColor", OperatorName.SAVE, "getNet", PDPageLabelRange.STYLE_ROMAN_LOWER, "getPriceLabel", OperatorName.CLOSE_AND_STROKE, "Ljava/lang/Integer;", "getSeq", "t", "getCategoryId", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0})
/* renamed from: th.co.dtac.android.dtacone.app_one.model.stv.PackagesItem */
/* loaded from: classes7.dex */
public final class PackagesItem {
    public static final int $stable = 8;
    @SerializedName("poqItemProductPackageId")
    @Nullable

    /* renamed from: a */
    private final String f82358a;
    @SerializedName("code")
    @Nullable

    /* renamed from: b */
    private final String f82359b;
    @SerializedName("packageGroupType")
    @Nullable

    /* renamed from: c */
    private final String f82360c;
    @SerializedName("descriptionTitle")
    @Nullable

    /* renamed from: d */
    private final String f82361d;
    @SerializedName("ussdCode")
    @Nullable

    /* renamed from: e */
    private final String f82362e;
    @SerializedName(MessageBundle.TITLE_ENTRY)
    @Nullable

    /* renamed from: f */
    private final String f82363f;
    @SerializedName("descriptions")
    @Nullable

    /* renamed from: g */
    private final List<String> f82364g;
    @SerializedName("commissionValue")
    @Nullable

    /* renamed from: h */
    private final Double f82365h;
    @SerializedName("poqItemProductOfferingId")
    @Nullable

    /* renamed from: i */
    private final String f82366i;
    @SerializedName(FirebaseAnalytics.Param.PRICE)
    @Nullable

    /* renamed from: j */
    private final String f82367j;
    @SerializedName("poqItemId")
    @Nullable

    /* renamed from: k */
    private final String f82368k;
    @SerializedName("name")
    @Nullable

    /* renamed from: l */
    private final String f82369l;
    @SerializedName("typeImage")
    @Nullable

    /* renamed from: m */
    private final String f82370m;
    @SerializedName("commission")
    @Nullable

    /* renamed from: n */
    private final String f82371n;
    @SerializedName("validity")
    @Nullable

    /* renamed from: o */
    private final String f82372o;
    @SerializedName("commissionColor")
    @Nullable

    /* renamed from: p */
    private final String f82373p;
    @SerializedName("net")
    @Nullable

    /* renamed from: q */
    private final String f82374q;
    @SerializedName("priceLabel")
    @Nullable

    /* renamed from: r */
    private final String f82375r;
    @SerializedName("seq")
    @Nullable

    /* renamed from: s */
    private final Integer f82376s;
    @SerializedName("categoryId")
    @Nullable

    /* renamed from: t */
    private final String f82377t;

    public PackagesItem() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 1048575, null);
    }

    @Nullable
    public final String component1() {
        return this.f82358a;
    }

    @Nullable
    public final String component10() {
        return this.f82367j;
    }

    @Nullable
    public final String component11() {
        return this.f82368k;
    }

    @Nullable
    public final String component12() {
        return this.f82369l;
    }

    @Nullable
    public final String component13() {
        return this.f82370m;
    }

    @Nullable
    public final String component14() {
        return this.f82371n;
    }

    @Nullable
    public final String component15() {
        return this.f82372o;
    }

    @Nullable
    public final String component16() {
        return this.f82373p;
    }

    @Nullable
    public final String component17() {
        return this.f82374q;
    }

    @Nullable
    public final String component18() {
        return this.f82375r;
    }

    @Nullable
    public final Integer component19() {
        return this.f82376s;
    }

    @Nullable
    public final String component2() {
        return this.f82359b;
    }

    @Nullable
    public final String component20() {
        return this.f82377t;
    }

    @Nullable
    public final String component3() {
        return this.f82360c;
    }

    @Nullable
    public final String component4() {
        return this.f82361d;
    }

    @Nullable
    public final String component5() {
        return this.f82362e;
    }

    @Nullable
    public final String component6() {
        return this.f82363f;
    }

    @Nullable
    public final List<String> component7() {
        return this.f82364g;
    }

    @Nullable
    public final Double component8() {
        return this.f82365h;
    }

    @Nullable
    public final String component9() {
        return this.f82366i;
    }

    @NotNull
    public final PackagesItem copy(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable String str6, @Nullable List<String> list, @Nullable Double d, @Nullable String str7, @Nullable String str8, @Nullable String str9, @Nullable String str10, @Nullable String str11, @Nullable String str12, @Nullable String str13, @Nullable String str14, @Nullable String str15, @Nullable String str16, @Nullable Integer num, @Nullable String str17) {
        return new PackagesItem(str, str2, str3, str4, str5, str6, list, d, str7, str8, str9, str10, str11, str12, str13, str14, str15, str16, num, str17);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof PackagesItem) {
            PackagesItem packagesItem = (PackagesItem) obj;
            return Intrinsics.areEqual(this.f82358a, packagesItem.f82358a) && Intrinsics.areEqual(this.f82359b, packagesItem.f82359b) && Intrinsics.areEqual(this.f82360c, packagesItem.f82360c) && Intrinsics.areEqual(this.f82361d, packagesItem.f82361d) && Intrinsics.areEqual(this.f82362e, packagesItem.f82362e) && Intrinsics.areEqual(this.f82363f, packagesItem.f82363f) && Intrinsics.areEqual(this.f82364g, packagesItem.f82364g) && Intrinsics.areEqual((Object) this.f82365h, (Object) packagesItem.f82365h) && Intrinsics.areEqual(this.f82366i, packagesItem.f82366i) && Intrinsics.areEqual(this.f82367j, packagesItem.f82367j) && Intrinsics.areEqual(this.f82368k, packagesItem.f82368k) && Intrinsics.areEqual(this.f82369l, packagesItem.f82369l) && Intrinsics.areEqual(this.f82370m, packagesItem.f82370m) && Intrinsics.areEqual(this.f82371n, packagesItem.f82371n) && Intrinsics.areEqual(this.f82372o, packagesItem.f82372o) && Intrinsics.areEqual(this.f82373p, packagesItem.f82373p) && Intrinsics.areEqual(this.f82374q, packagesItem.f82374q) && Intrinsics.areEqual(this.f82375r, packagesItem.f82375r) && Intrinsics.areEqual(this.f82376s, packagesItem.f82376s) && Intrinsics.areEqual(this.f82377t, packagesItem.f82377t);
        }
        return false;
    }

    @Nullable
    public final String getCategoryId() {
        return this.f82377t;
    }

    @Nullable
    public final String getCode() {
        return this.f82359b;
    }

    @Nullable
    public final String getCommission() {
        return this.f82371n;
    }

    @Nullable
    public final String getCommissionColor() {
        return this.f82373p;
    }

    @Nullable
    public final Double getCommissionValue() {
        return this.f82365h;
    }

    @Nullable
    public final String getDescriptionTitle() {
        return this.f82361d;
    }

    @Nullable
    public final List<String> getDescriptions() {
        return this.f82364g;
    }

    @Nullable
    public final String getName() {
        return this.f82369l;
    }

    @Nullable
    public final String getNet() {
        return this.f82374q;
    }

    @Nullable
    public final String getPackageGroupType() {
        return this.f82360c;
    }

    @Nullable
    public final String getPoqItemId() {
        return this.f82368k;
    }

    @Nullable
    public final String getPoqItemProductOfferingId() {
        return this.f82366i;
    }

    @Nullable
    public final String getPoqItemProductPackageId() {
        return this.f82358a;
    }

    @Nullable
    public final String getPrice() {
        return this.f82367j;
    }

    @Nullable
    public final String getPriceLabel() {
        return this.f82375r;
    }

    @Nullable
    public final Integer getSeq() {
        return this.f82376s;
    }

    @Nullable
    public final String getTitle() {
        return this.f82363f;
    }

    @Nullable
    public final String getTypeImage() {
        return this.f82370m;
    }

    @Nullable
    public final String getUssdCode() {
        return this.f82362e;
    }

    @Nullable
    public final String getValidity() {
        return this.f82372o;
    }

    public int hashCode() {
        String str = this.f82358a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f82359b;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f82360c;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f82361d;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.f82362e;
        int hashCode5 = (hashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.f82363f;
        int hashCode6 = (hashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
        List<String> list = this.f82364g;
        int hashCode7 = (hashCode6 + (list == null ? 0 : list.hashCode())) * 31;
        Double d = this.f82365h;
        int hashCode8 = (hashCode7 + (d == null ? 0 : d.hashCode())) * 31;
        String str7 = this.f82366i;
        int hashCode9 = (hashCode8 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.f82367j;
        int hashCode10 = (hashCode9 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.f82368k;
        int hashCode11 = (hashCode10 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.f82369l;
        int hashCode12 = (hashCode11 + (str10 == null ? 0 : str10.hashCode())) * 31;
        String str11 = this.f82370m;
        int hashCode13 = (hashCode12 + (str11 == null ? 0 : str11.hashCode())) * 31;
        String str12 = this.f82371n;
        int hashCode14 = (hashCode13 + (str12 == null ? 0 : str12.hashCode())) * 31;
        String str13 = this.f82372o;
        int hashCode15 = (hashCode14 + (str13 == null ? 0 : str13.hashCode())) * 31;
        String str14 = this.f82373p;
        int hashCode16 = (hashCode15 + (str14 == null ? 0 : str14.hashCode())) * 31;
        String str15 = this.f82374q;
        int hashCode17 = (hashCode16 + (str15 == null ? 0 : str15.hashCode())) * 31;
        String str16 = this.f82375r;
        int hashCode18 = (hashCode17 + (str16 == null ? 0 : str16.hashCode())) * 31;
        Integer num = this.f82376s;
        int hashCode19 = (hashCode18 + (num == null ? 0 : num.hashCode())) * 31;
        String str17 = this.f82377t;
        return hashCode19 + (str17 != null ? str17.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        String str = this.f82358a;
        String str2 = this.f82359b;
        String str3 = this.f82360c;
        String str4 = this.f82361d;
        String str5 = this.f82362e;
        String str6 = this.f82363f;
        List<String> list = this.f82364g;
        Double d = this.f82365h;
        String str7 = this.f82366i;
        String str8 = this.f82367j;
        String str9 = this.f82368k;
        String str10 = this.f82369l;
        String str11 = this.f82370m;
        String str12 = this.f82371n;
        String str13 = this.f82372o;
        String str14 = this.f82373p;
        String str15 = this.f82374q;
        String str16 = this.f82375r;
        Integer num = this.f82376s;
        String str17 = this.f82377t;
        return "PackagesItem(poqItemProductPackageId=" + str + ", code=" + str2 + ", packageGroupType=" + str3 + ", descriptionTitle=" + str4 + ", ussdCode=" + str5 + ", title=" + str6 + ", descriptions=" + list + ", commissionValue=" + d + ", poqItemProductOfferingId=" + str7 + ", price=" + str8 + ", poqItemId=" + str9 + ", name=" + str10 + ", typeImage=" + str11 + ", commission=" + str12 + ", validity=" + str13 + ", commissionColor=" + str14 + ", net=" + str15 + ", priceLabel=" + str16 + ", seq=" + num + ", categoryId=" + str17 + ")";
    }

    public PackagesItem(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable String str6, @Nullable List<String> list, @Nullable Double d, @Nullable String str7, @Nullable String str8, @Nullable String str9, @Nullable String str10, @Nullable String str11, @Nullable String str12, @Nullable String str13, @Nullable String str14, @Nullable String str15, @Nullable String str16, @Nullable Integer num, @Nullable String str17) {
        this.f82358a = str;
        this.f82359b = str2;
        this.f82360c = str3;
        this.f82361d = str4;
        this.f82362e = str5;
        this.f82363f = str6;
        this.f82364g = list;
        this.f82365h = d;
        this.f82366i = str7;
        this.f82367j = str8;
        this.f82368k = str9;
        this.f82369l = str10;
        this.f82370m = str11;
        this.f82371n = str12;
        this.f82372o = str13;
        this.f82373p = str14;
        this.f82374q = str15;
        this.f82375r = str16;
        this.f82376s = num;
        this.f82377t = str17;
    }

    public /* synthetic */ PackagesItem(String str, String str2, String str3, String str4, String str5, String str6, List list, Double d, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, Integer num, String str17, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : str5, (i & 32) != 0 ? null : str6, (i & 64) != 0 ? null : list, (i & 128) != 0 ? null : d, (i & 256) != 0 ? null : str7, (i & 512) != 0 ? null : str8, (i & 1024) != 0 ? null : str9, (i & 2048) != 0 ? null : str10, (i & 4096) != 0 ? null : str11, (i & 8192) != 0 ? null : str12, (i & 16384) != 0 ? null : str13, (i & 32768) != 0 ? null : str14, (i & 65536) != 0 ? null : str15, (i & 131072) != 0 ? null : str16, (i & 262144) != 0 ? null : num, (i & 524288) != 0 ? null : str17);
    }
}