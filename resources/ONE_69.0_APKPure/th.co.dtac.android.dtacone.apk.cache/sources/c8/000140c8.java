package th.p047co.dtac.android.dtacone.view.appOne.tol.model.campaign;

import androidx.compose.runtime.internal.StabilityInferred;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 0)
@Metadata(m29143d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b9\b\u0087\b\u0018\u00002\u00020\u0001B\u0089\u0001\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0002\u0012\b\b\u0002\u0010\b\u001a\u00020\u0002\u0012\b\b\u0002\u0010\t\u001a\u00020\u0002\u0012\b\b\u0002\u0010\n\u001a\u00020\u0002\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b\u0012\b\b\u0002\u0010\r\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u000f\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u000f¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0015J\u0010\u0010\u0018\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0015J\u0010\u0010\u0019\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u0015J\u0010\u0010\u001a\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u0015J\u0010\u0010\u001b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u0015J\u0010\u0010\u001c\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u0015J\u0010\u0010\u001d\u001a\u00020\u000bHÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u000bHÆ\u0003¢\u0006\u0004\b\u001f\u0010\u001eJ\u0010\u0010 \u001a\u00020\u000bHÆ\u0003¢\u0006\u0004\b \u0010\u001eJ\u0010\u0010!\u001a\u00020\u000fHÆ\u0003¢\u0006\u0004\b!\u0010\"J\u0010\u0010#\u001a\u00020\u000fHÆ\u0003¢\u0006\u0004\b#\u0010\"J\u0092\u0001\u0010$\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\u00022\b\b\u0002\u0010\n\u001a\u00020\u00022\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\r\u001a\u00020\u000b2\b\b\u0002\u0010\u000e\u001a\u00020\u000b2\b\b\u0002\u0010\u0010\u001a\u00020\u000f2\b\b\u0002\u0010\u0011\u001a\u00020\u000fHÆ\u0001¢\u0006\u0004\b$\u0010%J\u0010\u0010&\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b&\u0010\u0015J\u0010\u0010'\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b'\u0010\u001eJ\u001a\u0010)\u001a\u00020\u000f2\b\u0010(\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b)\u0010*R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b+\u0010,\u001a\u0004\b-\u0010\u0015R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b.\u0010,\u001a\u0004\b/\u0010\u0015R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b0\u0010,\u001a\u0004\b1\u0010\u0015R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b2\u0010,\u001a\u0004\b3\u0010\u0015R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b4\u0010,\u001a\u0004\b5\u0010\u0015R\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b6\u0010,\u001a\u0004\b7\u0010\u0015R\u0017\u0010\t\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b8\u0010,\u001a\u0004\b9\u0010\u0015R\u0017\u0010\n\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b:\u0010,\u001a\u0004\b;\u0010\u0015R\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b<\u0010=\u001a\u0004\b>\u0010\u001eR\u0017\u0010\r\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b?\u0010=\u001a\u0004\b@\u0010\u001eR\u0017\u0010\u000e\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\bA\u0010=\u001a\u0004\bB\u0010\u001eR\u0017\u0010\u0010\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\bC\u0010D\u001a\u0004\bE\u0010\"R\u0017\u0010\u0011\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\bF\u0010D\u001a\u0004\bG\u0010\"¨\u0006H"}, m29142d2 = {"Lth/co/dtac/android/dtacone/view/appOne/tol/model/campaign/SmartSearchResult;", "", "", "campaignCode", "marketingCode", "campaignName", "marketingName", "speedDownValue", "speedDownUnit", "speedUpValue", "speedUpUnit", "", "serviceFee", "contract", "entryFee", "", "discountFlag", "meshFlag", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IIIZZ)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "()I", "component10", "component11", "component12", "()Z", "component13", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IIIZZ)Lth/co/dtac/android/dtacone/view/appOne/tol/model/campaign/SmartSearchResult;", "toString", "hashCode", "other", "equals", "(Ljava/lang/Object;)Z", PDPageLabelRange.STYLE_LETTERS_LOWER, "Ljava/lang/String;", "getCampaignCode", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "getMarketingCode", OperatorName.CURVE_TO, "getCampaignName", "d", "getMarketingName", "e", "getSpeedDownValue", OperatorName.FILL_NON_ZERO, "getSpeedDownUnit", OperatorName.NON_STROKING_GRAY, "getSpeedUpValue", OperatorName.CLOSE_PATH, "getSpeedUpUnit", "i", "I", "getServiceFee", OperatorName.SET_LINE_JOINSTYLE, "getContract", OperatorName.NON_STROKING_CMYK, "getEntryFee", OperatorName.LINE_TO, "Z", "getDiscountFlag", OperatorName.MOVE_TO, "getMeshFlag", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0})
/* renamed from: th.co.dtac.android.dtacone.view.appOne.tol.model.campaign.SmartSearchResult */
/* loaded from: classes10.dex */
public final class SmartSearchResult {
    public static final int $stable = 0;

    /* renamed from: a */
    public final String f97969a;

    /* renamed from: b */
    public final String f97970b;

    /* renamed from: c */
    public final String f97971c;

    /* renamed from: d */
    public final String f97972d;

    /* renamed from: e */
    public final String f97973e;

    /* renamed from: f */
    public final String f97974f;

    /* renamed from: g */
    public final String f97975g;

    /* renamed from: h */
    public final String f97976h;

    /* renamed from: i */
    public final int f97977i;

    /* renamed from: j */
    public final int f97978j;

    /* renamed from: k */
    public final int f97979k;

    /* renamed from: l */
    public final boolean f97980l;

    /* renamed from: m */
    public final boolean f97981m;

    public SmartSearchResult() {
        this(null, null, null, null, null, null, null, null, 0, 0, 0, false, false, 8191, null);
    }

    @NotNull
    public final String component1() {
        return this.f97969a;
    }

    public final int component10() {
        return this.f97978j;
    }

    public final int component11() {
        return this.f97979k;
    }

    public final boolean component12() {
        return this.f97980l;
    }

    public final boolean component13() {
        return this.f97981m;
    }

    @NotNull
    public final String component2() {
        return this.f97970b;
    }

    @NotNull
    public final String component3() {
        return this.f97971c;
    }

    @NotNull
    public final String component4() {
        return this.f97972d;
    }

    @NotNull
    public final String component5() {
        return this.f97973e;
    }

    @NotNull
    public final String component6() {
        return this.f97974f;
    }

    @NotNull
    public final String component7() {
        return this.f97975g;
    }

    @NotNull
    public final String component8() {
        return this.f97976h;
    }

    public final int component9() {
        return this.f97977i;
    }

    @NotNull
    public final SmartSearchResult copy(@NotNull String campaignCode, @NotNull String marketingCode, @NotNull String campaignName, @NotNull String marketingName, @NotNull String speedDownValue, @NotNull String speedDownUnit, @NotNull String speedUpValue, @NotNull String speedUpUnit, int i, int i2, int i3, boolean z, boolean z2) {
        Intrinsics.checkNotNullParameter(campaignCode, "campaignCode");
        Intrinsics.checkNotNullParameter(marketingCode, "marketingCode");
        Intrinsics.checkNotNullParameter(campaignName, "campaignName");
        Intrinsics.checkNotNullParameter(marketingName, "marketingName");
        Intrinsics.checkNotNullParameter(speedDownValue, "speedDownValue");
        Intrinsics.checkNotNullParameter(speedDownUnit, "speedDownUnit");
        Intrinsics.checkNotNullParameter(speedUpValue, "speedUpValue");
        Intrinsics.checkNotNullParameter(speedUpUnit, "speedUpUnit");
        return new SmartSearchResult(campaignCode, marketingCode, campaignName, marketingName, speedDownValue, speedDownUnit, speedUpValue, speedUpUnit, i, i2, i3, z, z2);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof SmartSearchResult) {
            SmartSearchResult smartSearchResult = (SmartSearchResult) obj;
            return Intrinsics.areEqual(this.f97969a, smartSearchResult.f97969a) && Intrinsics.areEqual(this.f97970b, smartSearchResult.f97970b) && Intrinsics.areEqual(this.f97971c, smartSearchResult.f97971c) && Intrinsics.areEqual(this.f97972d, smartSearchResult.f97972d) && Intrinsics.areEqual(this.f97973e, smartSearchResult.f97973e) && Intrinsics.areEqual(this.f97974f, smartSearchResult.f97974f) && Intrinsics.areEqual(this.f97975g, smartSearchResult.f97975g) && Intrinsics.areEqual(this.f97976h, smartSearchResult.f97976h) && this.f97977i == smartSearchResult.f97977i && this.f97978j == smartSearchResult.f97978j && this.f97979k == smartSearchResult.f97979k && this.f97980l == smartSearchResult.f97980l && this.f97981m == smartSearchResult.f97981m;
        }
        return false;
    }

    @NotNull
    public final String getCampaignCode() {
        return this.f97969a;
    }

    @NotNull
    public final String getCampaignName() {
        return this.f97971c;
    }

    public final int getContract() {
        return this.f97978j;
    }

    public final boolean getDiscountFlag() {
        return this.f97980l;
    }

    public final int getEntryFee() {
        return this.f97979k;
    }

    @NotNull
    public final String getMarketingCode() {
        return this.f97970b;
    }

    @NotNull
    public final String getMarketingName() {
        return this.f97972d;
    }

    public final boolean getMeshFlag() {
        return this.f97981m;
    }

    public final int getServiceFee() {
        return this.f97977i;
    }

    @NotNull
    public final String getSpeedDownUnit() {
        return this.f97974f;
    }

    @NotNull
    public final String getSpeedDownValue() {
        return this.f97973e;
    }

    @NotNull
    public final String getSpeedUpUnit() {
        return this.f97976h;
    }

    @NotNull
    public final String getSpeedUpValue() {
        return this.f97975g;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode = ((((((((((((((((((((this.f97969a.hashCode() * 31) + this.f97970b.hashCode()) * 31) + this.f97971c.hashCode()) * 31) + this.f97972d.hashCode()) * 31) + this.f97973e.hashCode()) * 31) + this.f97974f.hashCode()) * 31) + this.f97975g.hashCode()) * 31) + this.f97976h.hashCode()) * 31) + this.f97977i) * 31) + this.f97978j) * 31) + this.f97979k) * 31;
        boolean z = this.f97980l;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        int i2 = (hashCode + i) * 31;
        boolean z2 = this.f97981m;
        return i2 + (z2 ? 1 : z2 ? 1 : 0);
    }

    @NotNull
    public String toString() {
        String str = this.f97969a;
        String str2 = this.f97970b;
        String str3 = this.f97971c;
        String str4 = this.f97972d;
        String str5 = this.f97973e;
        String str6 = this.f97974f;
        String str7 = this.f97975g;
        String str8 = this.f97976h;
        int i = this.f97977i;
        int i2 = this.f97978j;
        int i3 = this.f97979k;
        boolean z = this.f97980l;
        boolean z2 = this.f97981m;
        return "SmartSearchResult(campaignCode=" + str + ", marketingCode=" + str2 + ", campaignName=" + str3 + ", marketingName=" + str4 + ", speedDownValue=" + str5 + ", speedDownUnit=" + str6 + ", speedUpValue=" + str7 + ", speedUpUnit=" + str8 + ", serviceFee=" + i + ", contract=" + i2 + ", entryFee=" + i3 + ", discountFlag=" + z + ", meshFlag=" + z2 + ")";
    }

    public SmartSearchResult(@NotNull String campaignCode, @NotNull String marketingCode, @NotNull String campaignName, @NotNull String marketingName, @NotNull String speedDownValue, @NotNull String speedDownUnit, @NotNull String speedUpValue, @NotNull String speedUpUnit, int i, int i2, int i3, boolean z, boolean z2) {
        Intrinsics.checkNotNullParameter(campaignCode, "campaignCode");
        Intrinsics.checkNotNullParameter(marketingCode, "marketingCode");
        Intrinsics.checkNotNullParameter(campaignName, "campaignName");
        Intrinsics.checkNotNullParameter(marketingName, "marketingName");
        Intrinsics.checkNotNullParameter(speedDownValue, "speedDownValue");
        Intrinsics.checkNotNullParameter(speedDownUnit, "speedDownUnit");
        Intrinsics.checkNotNullParameter(speedUpValue, "speedUpValue");
        Intrinsics.checkNotNullParameter(speedUpUnit, "speedUpUnit");
        this.f97969a = campaignCode;
        this.f97970b = marketingCode;
        this.f97971c = campaignName;
        this.f97972d = marketingName;
        this.f97973e = speedDownValue;
        this.f97974f = speedDownUnit;
        this.f97975g = speedUpValue;
        this.f97976h = speedUpUnit;
        this.f97977i = i;
        this.f97978j = i2;
        this.f97979k = i3;
        this.f97980l = z;
        this.f97981m = z2;
    }

    public /* synthetic */ SmartSearchResult(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, int i, int i2, int i3, boolean z, boolean z2, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this((i4 & 1) != 0 ? "" : str, (i4 & 2) != 0 ? "" : str2, (i4 & 4) != 0 ? "" : str3, (i4 & 8) != 0 ? "" : str4, (i4 & 16) != 0 ? "" : str5, (i4 & 32) != 0 ? "" : str6, (i4 & 64) != 0 ? "" : str7, (i4 & 128) == 0 ? str8 : "", (i4 & 256) != 0 ? -1 : i, (i4 & 512) != 0 ? -1 : i2, (i4 & 1024) == 0 ? i3 : -1, (i4 & 2048) != 0 ? false : z, (i4 & 4096) == 0 ? z2 : false);
    }
}