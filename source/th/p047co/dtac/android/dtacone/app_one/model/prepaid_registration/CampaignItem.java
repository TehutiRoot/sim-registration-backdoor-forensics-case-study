package th.p047co.dtac.android.dtacone.app_one.model.prepaid_registration;

import androidx.compose.runtime.internal.StabilityInferred;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.gson.annotations.SerializedName;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.apache.commons.logging.LogFactory;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 0)
@Metadata(m28851d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\"\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b \b\u0087\b\u0018\u00002\u00020\u0001B¯\u0001\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0012\u0010\u0013\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0012\u0010\u0015\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0014J\u0012\u0010\u0016\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0014J\u0012\u0010\u0017\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0014J\u0012\u0010\u0018\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0014J\u0012\u0010\u0019\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u0014J\u0012\u0010\u001a\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u0014J\u0012\u0010\u001b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u0014J\u0012\u0010\u001c\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u0014J\u0012\u0010\u001d\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u0014J\u0012\u0010\u001e\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u0014J\u0012\u0010\u001f\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001f\u0010\u0014J\u0012\u0010 \u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b \u0010\u0014J\u0012\u0010!\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b!\u0010\u0014J¸\u0001\u0010\"\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\"\u0010#J\u0010\u0010$\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b$\u0010\u0014J\u0010\u0010&\u001a\u00020%HÖ\u0001¢\u0006\u0004\b&\u0010'J\u001a\u0010*\u001a\u00020)2\b\u0010(\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b*\u0010+R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b,\u0010-\u001a\u0004\b.\u0010\u0014R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b/\u0010-\u001a\u0004\b0\u0010\u0014R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b1\u0010-\u001a\u0004\b2\u0010\u0014R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b3\u0010-\u001a\u0004\b4\u0010\u0014R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b5\u0010-\u001a\u0004\b6\u0010\u0014R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b7\u0010-\u001a\u0004\b8\u0010\u0014R\u001c\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b9\u0010-\u001a\u0004\b:\u0010\u0014R\u001c\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b;\u0010-\u001a\u0004\b<\u0010\u0014R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b=\u0010-\u001a\u0004\b>\u0010\u0014R\u001c\u0010\f\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b?\u0010-\u001a\u0004\b@\u0010\u0014R\u001c\u0010\r\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\bA\u0010-\u001a\u0004\bB\u0010\u0014R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\bC\u0010-\u001a\u0004\bD\u0010\u0014R\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\bE\u0010-\u001a\u0004\bF\u0010\u0014R\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\bG\u0010-\u001a\u0004\bH\u0010\u0014¨\u0006I"}, m28850d2 = {"Lth/co/dtac/android/dtacone/app_one/model/prepaid_registration/CampaignItem;", "", "", "privilegeCode", "customerAge", LogFactory.PRIORITY_KEY, "campaignNameTh", "campaignNameEn", "matCode", "priceplanCode", "priceplanName", "priceplanDesc", FirebaseAnalytics.Param.PRICE, "internetData", "voiceData", "wifiData", "companyName", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lth/co/dtac/android/dtacone/app_one/model/prepaid_registration/CampaignItem;", "toString", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", PDPageLabelRange.STYLE_LETTERS_LOWER, "Ljava/lang/String;", "getPrivilegeCode", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "getCustomerAge", OperatorName.CURVE_TO, "getPriority", "d", "getCampaignNameTh", "e", "getCampaignNameEn", OperatorName.FILL_NON_ZERO, "getMatCode", OperatorName.NON_STROKING_GRAY, "getPriceplanCode", OperatorName.CLOSE_PATH, "getPriceplanName", "i", "getPriceplanDesc", OperatorName.SET_LINE_JOINSTYLE, "getPrice", OperatorName.NON_STROKING_CMYK, "getInternetData", OperatorName.LINE_TO, "getVoiceData", OperatorName.MOVE_TO, "getWifiData", OperatorName.ENDPATH, "getCompanyName", "app_prodRelease"}, m28849k = 1, m28848mv = {1, 8, 0})
/* renamed from: th.co.dtac.android.dtacone.app_one.model.prepaid_registration.CampaignItem */
/* loaded from: classes7.dex */
public final class CampaignItem {
    public static final int $stable = 0;
    @SerializedName("privilegeCode")
    @Nullable

    /* renamed from: a */
    private final String f81788a;
    @SerializedName("customerAge")
    @Nullable

    /* renamed from: b */
    private final String f81789b;
    @SerializedName(LogFactory.PRIORITY_KEY)
    @Nullable

    /* renamed from: c */
    private final String f81790c;
    @SerializedName("campaignNameTh")
    @Nullable

    /* renamed from: d */
    private final String f81791d;
    @SerializedName("campaignNameEn")
    @Nullable

    /* renamed from: e */
    private final String f81792e;
    @SerializedName("matCode")
    @Nullable

    /* renamed from: f */
    private final String f81793f;
    @SerializedName("priceplanCode")
    @Nullable

    /* renamed from: g */
    private final String f81794g;
    @SerializedName("priceplanName")
    @Nullable

    /* renamed from: h */
    private final String f81795h;
    @SerializedName("priceplanDesc")
    @Nullable

    /* renamed from: i */
    private final String f81796i;
    @SerializedName(FirebaseAnalytics.Param.PRICE)
    @Nullable

    /* renamed from: j */
    private final String f81797j;
    @SerializedName("internetData")
    @Nullable

    /* renamed from: k */
    private final String f81798k;
    @SerializedName("voiceData")
    @Nullable

    /* renamed from: l */
    private final String f81799l;
    @SerializedName("wifiData")
    @Nullable

    /* renamed from: m */
    private final String f81800m;
    @SerializedName("companyName")
    @Nullable

    /* renamed from: n */
    private final String f81801n;

    public CampaignItem() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, 16383, null);
    }

    @Nullable
    public final String component1() {
        return this.f81788a;
    }

    @Nullable
    public final String component10() {
        return this.f81797j;
    }

    @Nullable
    public final String component11() {
        return this.f81798k;
    }

    @Nullable
    public final String component12() {
        return this.f81799l;
    }

    @Nullable
    public final String component13() {
        return this.f81800m;
    }

    @Nullable
    public final String component14() {
        return this.f81801n;
    }

    @Nullable
    public final String component2() {
        return this.f81789b;
    }

    @Nullable
    public final String component3() {
        return this.f81790c;
    }

    @Nullable
    public final String component4() {
        return this.f81791d;
    }

    @Nullable
    public final String component5() {
        return this.f81792e;
    }

    @Nullable
    public final String component6() {
        return this.f81793f;
    }

    @Nullable
    public final String component7() {
        return this.f81794g;
    }

    @Nullable
    public final String component8() {
        return this.f81795h;
    }

    @Nullable
    public final String component9() {
        return this.f81796i;
    }

    @NotNull
    public final CampaignItem copy(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable String str6, @Nullable String str7, @Nullable String str8, @Nullable String str9, @Nullable String str10, @Nullable String str11, @Nullable String str12, @Nullable String str13, @Nullable String str14) {
        return new CampaignItem(str, str2, str3, str4, str5, str6, str7, str8, str9, str10, str11, str12, str13, str14);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof CampaignItem) {
            CampaignItem campaignItem = (CampaignItem) obj;
            return Intrinsics.areEqual(this.f81788a, campaignItem.f81788a) && Intrinsics.areEqual(this.f81789b, campaignItem.f81789b) && Intrinsics.areEqual(this.f81790c, campaignItem.f81790c) && Intrinsics.areEqual(this.f81791d, campaignItem.f81791d) && Intrinsics.areEqual(this.f81792e, campaignItem.f81792e) && Intrinsics.areEqual(this.f81793f, campaignItem.f81793f) && Intrinsics.areEqual(this.f81794g, campaignItem.f81794g) && Intrinsics.areEqual(this.f81795h, campaignItem.f81795h) && Intrinsics.areEqual(this.f81796i, campaignItem.f81796i) && Intrinsics.areEqual(this.f81797j, campaignItem.f81797j) && Intrinsics.areEqual(this.f81798k, campaignItem.f81798k) && Intrinsics.areEqual(this.f81799l, campaignItem.f81799l) && Intrinsics.areEqual(this.f81800m, campaignItem.f81800m) && Intrinsics.areEqual(this.f81801n, campaignItem.f81801n);
        }
        return false;
    }

    @Nullable
    public final String getCampaignNameEn() {
        return this.f81792e;
    }

    @Nullable
    public final String getCampaignNameTh() {
        return this.f81791d;
    }

    @Nullable
    public final String getCompanyName() {
        return this.f81801n;
    }

    @Nullable
    public final String getCustomerAge() {
        return this.f81789b;
    }

    @Nullable
    public final String getInternetData() {
        return this.f81798k;
    }

    @Nullable
    public final String getMatCode() {
        return this.f81793f;
    }

    @Nullable
    public final String getPrice() {
        return this.f81797j;
    }

    @Nullable
    public final String getPriceplanCode() {
        return this.f81794g;
    }

    @Nullable
    public final String getPriceplanDesc() {
        return this.f81796i;
    }

    @Nullable
    public final String getPriceplanName() {
        return this.f81795h;
    }

    @Nullable
    public final String getPriority() {
        return this.f81790c;
    }

    @Nullable
    public final String getPrivilegeCode() {
        return this.f81788a;
    }

    @Nullable
    public final String getVoiceData() {
        return this.f81799l;
    }

    @Nullable
    public final String getWifiData() {
        return this.f81800m;
    }

    public int hashCode() {
        String str = this.f81788a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f81789b;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f81790c;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f81791d;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.f81792e;
        int hashCode5 = (hashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.f81793f;
        int hashCode6 = (hashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.f81794g;
        int hashCode7 = (hashCode6 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.f81795h;
        int hashCode8 = (hashCode7 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.f81796i;
        int hashCode9 = (hashCode8 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.f81797j;
        int hashCode10 = (hashCode9 + (str10 == null ? 0 : str10.hashCode())) * 31;
        String str11 = this.f81798k;
        int hashCode11 = (hashCode10 + (str11 == null ? 0 : str11.hashCode())) * 31;
        String str12 = this.f81799l;
        int hashCode12 = (hashCode11 + (str12 == null ? 0 : str12.hashCode())) * 31;
        String str13 = this.f81800m;
        int hashCode13 = (hashCode12 + (str13 == null ? 0 : str13.hashCode())) * 31;
        String str14 = this.f81801n;
        return hashCode13 + (str14 != null ? str14.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        String str = this.f81788a;
        String str2 = this.f81789b;
        String str3 = this.f81790c;
        String str4 = this.f81791d;
        String str5 = this.f81792e;
        String str6 = this.f81793f;
        String str7 = this.f81794g;
        String str8 = this.f81795h;
        String str9 = this.f81796i;
        String str10 = this.f81797j;
        String str11 = this.f81798k;
        String str12 = this.f81799l;
        String str13 = this.f81800m;
        String str14 = this.f81801n;
        return "CampaignItem(privilegeCode=" + str + ", customerAge=" + str2 + ", priority=" + str3 + ", campaignNameTh=" + str4 + ", campaignNameEn=" + str5 + ", matCode=" + str6 + ", priceplanCode=" + str7 + ", priceplanName=" + str8 + ", priceplanDesc=" + str9 + ", price=" + str10 + ", internetData=" + str11 + ", voiceData=" + str12 + ", wifiData=" + str13 + ", companyName=" + str14 + ")";
    }

    public CampaignItem(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable String str6, @Nullable String str7, @Nullable String str8, @Nullable String str9, @Nullable String str10, @Nullable String str11, @Nullable String str12, @Nullable String str13, @Nullable String str14) {
        this.f81788a = str;
        this.f81789b = str2;
        this.f81790c = str3;
        this.f81791d = str4;
        this.f81792e = str5;
        this.f81793f = str6;
        this.f81794g = str7;
        this.f81795h = str8;
        this.f81796i = str9;
        this.f81797j = str10;
        this.f81798k = str11;
        this.f81799l = str12;
        this.f81800m = str13;
        this.f81801n = str14;
    }

    public /* synthetic */ CampaignItem(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : str5, (i & 32) != 0 ? null : str6, (i & 64) != 0 ? null : str7, (i & 128) != 0 ? null : str8, (i & 256) != 0 ? null : str9, (i & 512) != 0 ? null : str10, (i & 1024) != 0 ? null : str11, (i & 2048) != 0 ? null : str12, (i & 4096) != 0 ? null : str13, (i & 8192) == 0 ? str14 : null);
    }
}
