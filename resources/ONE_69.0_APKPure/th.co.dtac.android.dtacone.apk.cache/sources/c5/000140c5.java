package th.p047co.dtac.android.dtacone.view.appOne.tol.model.campaign;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.core.app.FrameMetricsAggregator;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 0)
@Metadata(m29143d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b,\b\u0087\b\u0018\u00002\u00020\u0001Ba\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0002\u0012\b\b\u0002\u0010\b\u001a\u00020\u0002\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\b\b\u0002\u0010\u000b\u001a\u00020\t\u0012\b\b\u0002\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0011J\u0010\u0010\u0014\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0011J\u0010\u0010\u0015\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0011J\u0010\u0010\u0016\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0011J\u0010\u0010\u0017\u001a\u00020\tHÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\tHÆ\u0003¢\u0006\u0004\b\u0019\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\fHÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJj\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u00022\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u000b\u001a\u00020\t2\b\b\u0002\u0010\r\u001a\u00020\fHÆ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001e\u0010\u0011J\u0010\u0010\u001f\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\u001f\u0010\u001bJ\u001a\u0010!\u001a\u00020\t2\b\u0010 \u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b!\u0010\"R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010\u0011R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b&\u0010$\u001a\u0004\b'\u0010\u0011R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b(\u0010$\u001a\u0004\b)\u0010\u0011R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b*\u0010$\u001a\u0004\b+\u0010\u0011R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b,\u0010$\u001a\u0004\b-\u0010\u0011R\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b.\u0010$\u001a\u0004\b/\u0010\u0011R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b0\u00101\u001a\u0004\b2\u0010\u0018R\u0017\u0010\u000b\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b3\u00101\u001a\u0004\b4\u0010\u0018R\u0017\u0010\r\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b5\u00106\u001a\u0004\b7\u0010\u001b¨\u00068"}, m29142d2 = {"Lth/co/dtac/android/dtacone/view/appOne/tol/model/campaign/MarketingItem;", "", "", "marketingCode", "marketingName", "marketingSpeedUpValue", "marketingSpeedDownValue", "marketingSpeedUpUnit", "marketingSpeedDownUnit", "", "marketingMeshFlag", "marketingDiscountFlag", "", "marketingFee", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZI)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "component5", "component6", "component7", "()Z", "component8", "component9", "()I", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZI)Lth/co/dtac/android/dtacone/view/appOne/tol/model/campaign/MarketingItem;", "toString", "hashCode", "other", "equals", "(Ljava/lang/Object;)Z", PDPageLabelRange.STYLE_LETTERS_LOWER, "Ljava/lang/String;", "getMarketingCode", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "getMarketingName", OperatorName.CURVE_TO, "getMarketingSpeedUpValue", "d", "getMarketingSpeedDownValue", "e", "getMarketingSpeedUpUnit", OperatorName.FILL_NON_ZERO, "getMarketingSpeedDownUnit", OperatorName.NON_STROKING_GRAY, "Z", "getMarketingMeshFlag", OperatorName.CLOSE_PATH, "getMarketingDiscountFlag", "i", "I", "getMarketingFee", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0})
/* renamed from: th.co.dtac.android.dtacone.view.appOne.tol.model.campaign.MarketingItem */
/* loaded from: classes10.dex */
public final class MarketingItem {
    public static final int $stable = 0;

    /* renamed from: a */
    public final String f97958a;

    /* renamed from: b */
    public final String f97959b;

    /* renamed from: c */
    public final String f97960c;

    /* renamed from: d */
    public final String f97961d;

    /* renamed from: e */
    public final String f97962e;

    /* renamed from: f */
    public final String f97963f;

    /* renamed from: g */
    public final boolean f97964g;

    /* renamed from: h */
    public final boolean f97965h;

    /* renamed from: i */
    public final int f97966i;

    public MarketingItem() {
        this(null, null, null, null, null, null, false, false, 0, FrameMetricsAggregator.EVERY_DURATION, null);
    }

    @NotNull
    public final String component1() {
        return this.f97958a;
    }

    @NotNull
    public final String component2() {
        return this.f97959b;
    }

    @NotNull
    public final String component3() {
        return this.f97960c;
    }

    @NotNull
    public final String component4() {
        return this.f97961d;
    }

    @NotNull
    public final String component5() {
        return this.f97962e;
    }

    @NotNull
    public final String component6() {
        return this.f97963f;
    }

    public final boolean component7() {
        return this.f97964g;
    }

    public final boolean component8() {
        return this.f97965h;
    }

    public final int component9() {
        return this.f97966i;
    }

    @NotNull
    public final MarketingItem copy(@NotNull String marketingCode, @NotNull String marketingName, @NotNull String marketingSpeedUpValue, @NotNull String marketingSpeedDownValue, @NotNull String marketingSpeedUpUnit, @NotNull String marketingSpeedDownUnit, boolean z, boolean z2, int i) {
        Intrinsics.checkNotNullParameter(marketingCode, "marketingCode");
        Intrinsics.checkNotNullParameter(marketingName, "marketingName");
        Intrinsics.checkNotNullParameter(marketingSpeedUpValue, "marketingSpeedUpValue");
        Intrinsics.checkNotNullParameter(marketingSpeedDownValue, "marketingSpeedDownValue");
        Intrinsics.checkNotNullParameter(marketingSpeedUpUnit, "marketingSpeedUpUnit");
        Intrinsics.checkNotNullParameter(marketingSpeedDownUnit, "marketingSpeedDownUnit");
        return new MarketingItem(marketingCode, marketingName, marketingSpeedUpValue, marketingSpeedDownValue, marketingSpeedUpUnit, marketingSpeedDownUnit, z, z2, i);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof MarketingItem) {
            MarketingItem marketingItem = (MarketingItem) obj;
            return Intrinsics.areEqual(this.f97958a, marketingItem.f97958a) && Intrinsics.areEqual(this.f97959b, marketingItem.f97959b) && Intrinsics.areEqual(this.f97960c, marketingItem.f97960c) && Intrinsics.areEqual(this.f97961d, marketingItem.f97961d) && Intrinsics.areEqual(this.f97962e, marketingItem.f97962e) && Intrinsics.areEqual(this.f97963f, marketingItem.f97963f) && this.f97964g == marketingItem.f97964g && this.f97965h == marketingItem.f97965h && this.f97966i == marketingItem.f97966i;
        }
        return false;
    }

    @NotNull
    public final String getMarketingCode() {
        return this.f97958a;
    }

    public final boolean getMarketingDiscountFlag() {
        return this.f97965h;
    }

    public final int getMarketingFee() {
        return this.f97966i;
    }

    public final boolean getMarketingMeshFlag() {
        return this.f97964g;
    }

    @NotNull
    public final String getMarketingName() {
        return this.f97959b;
    }

    @NotNull
    public final String getMarketingSpeedDownUnit() {
        return this.f97963f;
    }

    @NotNull
    public final String getMarketingSpeedDownValue() {
        return this.f97961d;
    }

    @NotNull
    public final String getMarketingSpeedUpUnit() {
        return this.f97962e;
    }

    @NotNull
    public final String getMarketingSpeedUpValue() {
        return this.f97960c;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode = ((((((((((this.f97958a.hashCode() * 31) + this.f97959b.hashCode()) * 31) + this.f97960c.hashCode()) * 31) + this.f97961d.hashCode()) * 31) + this.f97962e.hashCode()) * 31) + this.f97963f.hashCode()) * 31;
        boolean z = this.f97964g;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        int i2 = (hashCode + i) * 31;
        boolean z2 = this.f97965h;
        return ((i2 + (z2 ? 1 : z2 ? 1 : 0)) * 31) + this.f97966i;
    }

    @NotNull
    public String toString() {
        String str = this.f97958a;
        String str2 = this.f97959b;
        String str3 = this.f97960c;
        String str4 = this.f97961d;
        String str5 = this.f97962e;
        String str6 = this.f97963f;
        boolean z = this.f97964g;
        boolean z2 = this.f97965h;
        int i = this.f97966i;
        return "MarketingItem(marketingCode=" + str + ", marketingName=" + str2 + ", marketingSpeedUpValue=" + str3 + ", marketingSpeedDownValue=" + str4 + ", marketingSpeedUpUnit=" + str5 + ", marketingSpeedDownUnit=" + str6 + ", marketingMeshFlag=" + z + ", marketingDiscountFlag=" + z2 + ", marketingFee=" + i + ")";
    }

    public MarketingItem(@NotNull String marketingCode, @NotNull String marketingName, @NotNull String marketingSpeedUpValue, @NotNull String marketingSpeedDownValue, @NotNull String marketingSpeedUpUnit, @NotNull String marketingSpeedDownUnit, boolean z, boolean z2, int i) {
        Intrinsics.checkNotNullParameter(marketingCode, "marketingCode");
        Intrinsics.checkNotNullParameter(marketingName, "marketingName");
        Intrinsics.checkNotNullParameter(marketingSpeedUpValue, "marketingSpeedUpValue");
        Intrinsics.checkNotNullParameter(marketingSpeedDownValue, "marketingSpeedDownValue");
        Intrinsics.checkNotNullParameter(marketingSpeedUpUnit, "marketingSpeedUpUnit");
        Intrinsics.checkNotNullParameter(marketingSpeedDownUnit, "marketingSpeedDownUnit");
        this.f97958a = marketingCode;
        this.f97959b = marketingName;
        this.f97960c = marketingSpeedUpValue;
        this.f97961d = marketingSpeedDownValue;
        this.f97962e = marketingSpeedUpUnit;
        this.f97963f = marketingSpeedDownUnit;
        this.f97964g = z;
        this.f97965h = z2;
        this.f97966i = i;
    }

    public /* synthetic */ MarketingItem(String str, String str2, String str3, String str4, String str5, String str6, boolean z, boolean z2, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? "" : str, (i2 & 2) != 0 ? "" : str2, (i2 & 4) != 0 ? "" : str3, (i2 & 8) != 0 ? "" : str4, (i2 & 16) != 0 ? "" : str5, (i2 & 32) == 0 ? str6 : "", (i2 & 64) != 0 ? false : z, (i2 & 128) != 0 ? false : z2, (i2 & 256) == 0 ? i : 0);
    }
}