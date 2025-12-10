package th.p047co.dtac.android.dtacone.view.appOne.sellerID.model;

import androidx.compose.runtime.internal.StabilityInferred;
import com.google.gson.annotations.SerializedName;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 0)
@Metadata(m29143d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B+\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0012\u0010\b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0012\u0010\n\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\tJ\u0012\u0010\u000b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\tJ4\u0010\f\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000e\u0010\tJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\tR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u0017\u001a\u0004\b\u001a\u0010\tR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u0017\u001a\u0004\b\u001c\u0010\t¨\u0006\u001d"}, m29142d2 = {"Lth/co/dtac/android/dtacone/view/appOne/sellerID/model/ShopData;", "", "", "rtrCode", "rtrName", "companyCode", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lth/co/dtac/android/dtacone/view/appOne/sellerID/model/ShopData;", "toString", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", PDPageLabelRange.STYLE_LETTERS_LOWER, "Ljava/lang/String;", "getRtrCode", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "getRtrName", OperatorName.CURVE_TO, "getCompanyCode", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0})
/* renamed from: th.co.dtac.android.dtacone.view.appOne.sellerID.model.ShopData */
/* loaded from: classes10.dex */
public final class ShopData {
    public static final int $stable = 0;
    @SerializedName("rtr_code")
    @Nullable

    /* renamed from: a */
    private final String f97147a;
    @SerializedName("rtr_name")
    @Nullable

    /* renamed from: b */
    private final String f97148b;
    @SerializedName("company_name")
    @Nullable

    /* renamed from: c */
    private final String f97149c;

    public ShopData() {
        this(null, null, null, 7, null);
    }

    public static /* synthetic */ ShopData copy$default(ShopData shopData, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = shopData.f97147a;
        }
        if ((i & 2) != 0) {
            str2 = shopData.f97148b;
        }
        if ((i & 4) != 0) {
            str3 = shopData.f97149c;
        }
        return shopData.copy(str, str2, str3);
    }

    @Nullable
    public final String component1() {
        return this.f97147a;
    }

    @Nullable
    public final String component2() {
        return this.f97148b;
    }

    @Nullable
    public final String component3() {
        return this.f97149c;
    }

    @NotNull
    public final ShopData copy(@Nullable String str, @Nullable String str2, @Nullable String str3) {
        return new ShopData(str, str2, str3);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ShopData) {
            ShopData shopData = (ShopData) obj;
            return Intrinsics.areEqual(this.f97147a, shopData.f97147a) && Intrinsics.areEqual(this.f97148b, shopData.f97148b) && Intrinsics.areEqual(this.f97149c, shopData.f97149c);
        }
        return false;
    }

    @Nullable
    public final String getCompanyCode() {
        return this.f97149c;
    }

    @Nullable
    public final String getRtrCode() {
        return this.f97147a;
    }

    @Nullable
    public final String getRtrName() {
        return this.f97148b;
    }

    public int hashCode() {
        String str = this.f97147a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f97148b;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f97149c;
        return hashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        String str = this.f97147a;
        String str2 = this.f97148b;
        String str3 = this.f97149c;
        return "ShopData(rtrCode=" + str + ", rtrName=" + str2 + ", companyCode=" + str3 + ")";
    }

    public ShopData(@Nullable String str, @Nullable String str2, @Nullable String str3) {
        this.f97147a = str;
        this.f97148b = str2;
        this.f97149c = str3;
    }

    public /* synthetic */ ShopData(String str, String str2, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3);
    }
}