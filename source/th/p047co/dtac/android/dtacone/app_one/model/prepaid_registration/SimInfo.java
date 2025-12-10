package th.p047co.dtac.android.dtacone.app_one.model.prepaid_registration;

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
@Metadata(m28851d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u001a\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0018\b\u0087\b\u0018\u00002\u00020\u0001B\u007f\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0012\u0010\u000f\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0012\u0010\u0011\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0010J\u0012\u0010\u0012\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0010J\u0012\u0010\u0013\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0010J\u0012\u0010\u0014\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0010J\u0012\u0010\u0015\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0010J\u0012\u0010\u0016\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0010J\u0012\u0010\u0017\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0010J\u0012\u0010\u0018\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0010J\u0012\u0010\u0019\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u0010J\u0088\u0001\u0010\u001a\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001c\u0010\u0010J\u0010\u0010\u001e\u001a\u00020\u001dHÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u001a\u0010\"\u001a\u00020!2\b\u0010 \u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\"\u0010#R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010\u0010R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b'\u0010%\u001a\u0004\b(\u0010\u0010R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b)\u0010%\u001a\u0004\b*\u0010\u0010R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b+\u0010%\u001a\u0004\b,\u0010\u0010R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b-\u0010%\u001a\u0004\b.\u0010\u0010R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b/\u0010%\u001a\u0004\b0\u0010\u0010R\u001c\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b1\u0010%\u001a\u0004\b2\u0010\u0010R\u001c\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b3\u0010%\u001a\u0004\b4\u0010\u0010R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b5\u0010%\u001a\u0004\b6\u0010\u0010R\u001c\u0010\f\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b7\u0010%\u001a\u0004\b8\u0010\u0010¨\u00069"}, m28850d2 = {"Lth/co/dtac/android/dtacone/app_one/model/prepaid_registration/SimInfo;", "", "", "result", "simType", "type", "resourceStatus", "simCompanyCode", "simPoolType", "resultDesc", "pricePlan", "soc", "itemId", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lth/co/dtac/android/dtacone/app_one/model/prepaid_registration/SimInfo;", "toString", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", PDPageLabelRange.STYLE_LETTERS_LOWER, "Ljava/lang/String;", "getResult", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "getSimType", OperatorName.CURVE_TO, "getType", "d", "getResourceStatus", "e", "getSimCompanyCode", OperatorName.FILL_NON_ZERO, "getSimPoolType", OperatorName.NON_STROKING_GRAY, "getResultDesc", OperatorName.CLOSE_PATH, "getPricePlan", "i", "getSoc", OperatorName.SET_LINE_JOINSTYLE, "getItemId", "app_prodRelease"}, m28849k = 1, m28848mv = {1, 8, 0})
/* renamed from: th.co.dtac.android.dtacone.app_one.model.prepaid_registration.SimInfo */
/* loaded from: classes7.dex */
public final class SimInfo {
    public static final int $stable = 0;
    @SerializedName("result")
    @Nullable

    /* renamed from: a */
    private final String f81972a;
    @SerializedName("simType")
    @Nullable

    /* renamed from: b */
    private final String f81973b;
    @SerializedName("type")
    @Nullable

    /* renamed from: c */
    private final String f81974c;
    @SerializedName("resourceStatus")
    @Nullable

    /* renamed from: d */
    private final String f81975d;
    @SerializedName("simCompanyCode")
    @Nullable

    /* renamed from: e */
    private final String f81976e;
    @SerializedName("simPoolType")
    @Nullable

    /* renamed from: f */
    private final String f81977f;
    @SerializedName("resultDesc")
    @Nullable

    /* renamed from: g */
    private final String f81978g;
    @SerializedName("priceplan")
    @Nullable

    /* renamed from: h */
    private final String f81979h;
    @SerializedName("soc")
    @Nullable

    /* renamed from: i */
    private final String f81980i;
    @SerializedName("itemId")
    @Nullable

    /* renamed from: j */
    private final String f81981j;

    public SimInfo() {
        this(null, null, null, null, null, null, null, null, null, null, 1023, null);
    }

    @Nullable
    public final String component1() {
        return this.f81972a;
    }

    @Nullable
    public final String component10() {
        return this.f81981j;
    }

    @Nullable
    public final String component2() {
        return this.f81973b;
    }

    @Nullable
    public final String component3() {
        return this.f81974c;
    }

    @Nullable
    public final String component4() {
        return this.f81975d;
    }

    @Nullable
    public final String component5() {
        return this.f81976e;
    }

    @Nullable
    public final String component6() {
        return this.f81977f;
    }

    @Nullable
    public final String component7() {
        return this.f81978g;
    }

    @Nullable
    public final String component8() {
        return this.f81979h;
    }

    @Nullable
    public final String component9() {
        return this.f81980i;
    }

    @NotNull
    public final SimInfo copy(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable String str6, @Nullable String str7, @Nullable String str8, @Nullable String str9, @Nullable String str10) {
        return new SimInfo(str, str2, str3, str4, str5, str6, str7, str8, str9, str10);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof SimInfo) {
            SimInfo simInfo = (SimInfo) obj;
            return Intrinsics.areEqual(this.f81972a, simInfo.f81972a) && Intrinsics.areEqual(this.f81973b, simInfo.f81973b) && Intrinsics.areEqual(this.f81974c, simInfo.f81974c) && Intrinsics.areEqual(this.f81975d, simInfo.f81975d) && Intrinsics.areEqual(this.f81976e, simInfo.f81976e) && Intrinsics.areEqual(this.f81977f, simInfo.f81977f) && Intrinsics.areEqual(this.f81978g, simInfo.f81978g) && Intrinsics.areEqual(this.f81979h, simInfo.f81979h) && Intrinsics.areEqual(this.f81980i, simInfo.f81980i) && Intrinsics.areEqual(this.f81981j, simInfo.f81981j);
        }
        return false;
    }

    @Nullable
    public final String getItemId() {
        return this.f81981j;
    }

    @Nullable
    public final String getPricePlan() {
        return this.f81979h;
    }

    @Nullable
    public final String getResourceStatus() {
        return this.f81975d;
    }

    @Nullable
    public final String getResult() {
        return this.f81972a;
    }

    @Nullable
    public final String getResultDesc() {
        return this.f81978g;
    }

    @Nullable
    public final String getSimCompanyCode() {
        return this.f81976e;
    }

    @Nullable
    public final String getSimPoolType() {
        return this.f81977f;
    }

    @Nullable
    public final String getSimType() {
        return this.f81973b;
    }

    @Nullable
    public final String getSoc() {
        return this.f81980i;
    }

    @Nullable
    public final String getType() {
        return this.f81974c;
    }

    public int hashCode() {
        String str = this.f81972a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f81973b;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f81974c;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f81975d;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.f81976e;
        int hashCode5 = (hashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.f81977f;
        int hashCode6 = (hashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.f81978g;
        int hashCode7 = (hashCode6 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.f81979h;
        int hashCode8 = (hashCode7 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.f81980i;
        int hashCode9 = (hashCode8 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.f81981j;
        return hashCode9 + (str10 != null ? str10.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        String str = this.f81972a;
        String str2 = this.f81973b;
        String str3 = this.f81974c;
        String str4 = this.f81975d;
        String str5 = this.f81976e;
        String str6 = this.f81977f;
        String str7 = this.f81978g;
        String str8 = this.f81979h;
        String str9 = this.f81980i;
        String str10 = this.f81981j;
        return "SimInfo(result=" + str + ", simType=" + str2 + ", type=" + str3 + ", resourceStatus=" + str4 + ", simCompanyCode=" + str5 + ", simPoolType=" + str6 + ", resultDesc=" + str7 + ", pricePlan=" + str8 + ", soc=" + str9 + ", itemId=" + str10 + ")";
    }

    public SimInfo(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable String str6, @Nullable String str7, @Nullable String str8, @Nullable String str9, @Nullable String str10) {
        this.f81972a = str;
        this.f81973b = str2;
        this.f81974c = str3;
        this.f81975d = str4;
        this.f81976e = str5;
        this.f81977f = str6;
        this.f81978g = str7;
        this.f81979h = str8;
        this.f81980i = str9;
        this.f81981j = str10;
    }

    public /* synthetic */ SimInfo(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : str5, (i & 32) != 0 ? null : str6, (i & 64) != 0 ? null : str7, (i & 128) != 0 ? null : str8, (i & 256) != 0 ? null : str9, (i & 512) == 0 ? str10 : null);
    }
}
