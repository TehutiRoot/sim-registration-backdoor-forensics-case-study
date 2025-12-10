package th.p047co.dtac.android.dtacone.app_one.model.prepaid_registration;

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
@Metadata(m29143d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\bC\b\u0087\b\u0018\u00002\u00020\u0001B·\u0001\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0004\u0012\u0012\b\u0002\u0010\r\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0014\u0010\u0015J\u0012\u0010\u0016\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0012\u0010\u0018\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0012\u0010\u001a\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u0019J\u0012\u0010\u001b\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u0019J\u0012\u0010\u001c\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u0019J\u0012\u0010\u001d\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0012\u0010\u001f\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u001f\u0010\u0019J\u001a\u0010 \u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0004\b \u0010!J\u0012\u0010\"\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\"\u0010\u0017J\u0012\u0010#\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b#\u0010\u0019J\u0012\u0010$\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b$\u0010\u0017J\u0012\u0010%\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b%\u0010\u0019J\u0012\u0010&\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b&\u0010\u0019J\u0012\u0010'\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b'\u0010\u0019JÀ\u0001\u0010(\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00042\u0012\b\u0002\u0010\r\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0018\u00010\f2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b(\u0010)J\u0010\u0010*\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b*\u0010\u0019J\u0010\u0010+\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b+\u0010,J\u001a\u0010.\u001a\u00020\t2\b\u0010-\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b.\u0010/R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b0\u00101\u001a\u0004\b2\u0010\u0017R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b3\u00104\u001a\u0004\b5\u0010\u0019R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b6\u00104\u001a\u0004\b7\u0010\u0019R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b8\u00104\u001a\u0004\b9\u0010\u0019R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b:\u00104\u001a\u0004\b;\u0010\u0019R\u001c\u0010\n\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b<\u0010=\u001a\u0004\b\n\u0010\u001eR\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b>\u00104\u001a\u0004\b?\u0010\u0019R$\u0010\r\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b@\u0010A\u001a\u0004\bB\u0010!R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\bC\u00101\u001a\u0004\bD\u0010\u0017R\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\bE\u00104\u001a\u0004\bF\u0010\u0019R\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\bG\u00101\u001a\u0004\bH\u0010\u0017R\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\bI\u00104\u001a\u0004\bJ\u0010\u0019R\u001c\u0010\u0012\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\bK\u00104\u001a\u0004\bL\u0010\u0019R\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\bM\u00104\u001a\u0004\bN\u0010\u0019¨\u0006O"}, m29142d2 = {"Lth/co/dtac/android/dtacone/app_one/model/prepaid_registration/CheckPrivilegeResponse;", "", "", "depositAmount", "", "otherPaymentCode", "returnCode", "depositDate", "discountCode", "", "isTccActivate", "dhopReceive", "", "privilegeUsedList", "otherPaymentAmount", "promotionSetCode", "remainPrivilege", "depositDocNo", "shopReceive", "promotionSet_Code", "<init>", "(Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/util/List;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/Integer;", "component2", "()Ljava/lang/String;", "component3", "component4", "component5", "component6", "()Ljava/lang/Boolean;", "component7", "component8", "()Ljava/util/List;", "component9", "component10", "component11", "component12", "component13", "component14", "copy", "(Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/util/List;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lth/co/dtac/android/dtacone/app_one/model/prepaid_registration/CheckPrivilegeResponse;", "toString", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", PDPageLabelRange.STYLE_LETTERS_LOWER, "Ljava/lang/Integer;", "getDepositAmount", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "Ljava/lang/String;", "getOtherPaymentCode", OperatorName.CURVE_TO, "getReturnCode", "d", "getDepositDate", "e", "getDiscountCode", OperatorName.FILL_NON_ZERO, "Ljava/lang/Boolean;", OperatorName.NON_STROKING_GRAY, "getDhopReceive", OperatorName.CLOSE_PATH, "Ljava/util/List;", "getPrivilegeUsedList", "i", "getOtherPaymentAmount", OperatorName.SET_LINE_JOINSTYLE, "getPromotionSetCode", OperatorName.NON_STROKING_CMYK, "getRemainPrivilege", OperatorName.LINE_TO, "getDepositDocNo", OperatorName.MOVE_TO, "getShopReceive", OperatorName.ENDPATH, "getPromotionSet_Code", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0})
/* renamed from: th.co.dtac.android.dtacone.app_one.model.prepaid_registration.CheckPrivilegeResponse */
/* loaded from: classes7.dex */
public final class CheckPrivilegeResponse {
    public static final int $stable = 8;
    @SerializedName("depositAmount")
    @Nullable

    /* renamed from: a */
    private final Integer f81894a;
    @SerializedName("otherPaymentCode")
    @Nullable

    /* renamed from: b */
    private final String f81895b;
    @SerializedName("returnCode")
    @Nullable

    /* renamed from: c */
    private final String f81896c;
    @SerializedName("depositDate")
    @Nullable

    /* renamed from: d */
    private final String f81897d;
    @SerializedName("discountCode")
    @Nullable

    /* renamed from: e */
    private final String f81898e;
    @SerializedName("isTccActivate")
    @Nullable

    /* renamed from: f */
    private final Boolean f81899f;
    @SerializedName("dhopReceive")
    @Nullable

    /* renamed from: g */
    private final String f81900g;
    @SerializedName("privilegeUsedList")
    @Nullable

    /* renamed from: h */
    private final List<String> f81901h;
    @SerializedName("otherPaymentAmount")
    @Nullable

    /* renamed from: i */
    private final Integer f81902i;
    @SerializedName("promotionSetCode")
    @Nullable

    /* renamed from: j */
    private final String f81903j;
    @SerializedName("remainPrivilege")
    @Nullable

    /* renamed from: k */
    private final Integer f81904k;
    @SerializedName("depositDocNo")
    @Nullable

    /* renamed from: l */
    private final String f81905l;
    @SerializedName("shopReceive")
    @Nullable

    /* renamed from: m */
    private final String f81906m;
    @SerializedName("promotionSet_Code")
    @Nullable

    /* renamed from: n */
    private final String f81907n;

    public CheckPrivilegeResponse() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, 16383, null);
    }

    @Nullable
    public final Integer component1() {
        return this.f81894a;
    }

    @Nullable
    public final String component10() {
        return this.f81903j;
    }

    @Nullable
    public final Integer component11() {
        return this.f81904k;
    }

    @Nullable
    public final String component12() {
        return this.f81905l;
    }

    @Nullable
    public final String component13() {
        return this.f81906m;
    }

    @Nullable
    public final String component14() {
        return this.f81907n;
    }

    @Nullable
    public final String component2() {
        return this.f81895b;
    }

    @Nullable
    public final String component3() {
        return this.f81896c;
    }

    @Nullable
    public final String component4() {
        return this.f81897d;
    }

    @Nullable
    public final String component5() {
        return this.f81898e;
    }

    @Nullable
    public final Boolean component6() {
        return this.f81899f;
    }

    @Nullable
    public final String component7() {
        return this.f81900g;
    }

    @Nullable
    public final List<String> component8() {
        return this.f81901h;
    }

    @Nullable
    public final Integer component9() {
        return this.f81902i;
    }

    @NotNull
    public final CheckPrivilegeResponse copy(@Nullable Integer num, @Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable Boolean bool, @Nullable String str5, @Nullable List<String> list, @Nullable Integer num2, @Nullable String str6, @Nullable Integer num3, @Nullable String str7, @Nullable String str8, @Nullable String str9) {
        return new CheckPrivilegeResponse(num, str, str2, str3, str4, bool, str5, list, num2, str6, num3, str7, str8, str9);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof CheckPrivilegeResponse) {
            CheckPrivilegeResponse checkPrivilegeResponse = (CheckPrivilegeResponse) obj;
            return Intrinsics.areEqual(this.f81894a, checkPrivilegeResponse.f81894a) && Intrinsics.areEqual(this.f81895b, checkPrivilegeResponse.f81895b) && Intrinsics.areEqual(this.f81896c, checkPrivilegeResponse.f81896c) && Intrinsics.areEqual(this.f81897d, checkPrivilegeResponse.f81897d) && Intrinsics.areEqual(this.f81898e, checkPrivilegeResponse.f81898e) && Intrinsics.areEqual(this.f81899f, checkPrivilegeResponse.f81899f) && Intrinsics.areEqual(this.f81900g, checkPrivilegeResponse.f81900g) && Intrinsics.areEqual(this.f81901h, checkPrivilegeResponse.f81901h) && Intrinsics.areEqual(this.f81902i, checkPrivilegeResponse.f81902i) && Intrinsics.areEqual(this.f81903j, checkPrivilegeResponse.f81903j) && Intrinsics.areEqual(this.f81904k, checkPrivilegeResponse.f81904k) && Intrinsics.areEqual(this.f81905l, checkPrivilegeResponse.f81905l) && Intrinsics.areEqual(this.f81906m, checkPrivilegeResponse.f81906m) && Intrinsics.areEqual(this.f81907n, checkPrivilegeResponse.f81907n);
        }
        return false;
    }

    @Nullable
    public final Integer getDepositAmount() {
        return this.f81894a;
    }

    @Nullable
    public final String getDepositDate() {
        return this.f81897d;
    }

    @Nullable
    public final String getDepositDocNo() {
        return this.f81905l;
    }

    @Nullable
    public final String getDhopReceive() {
        return this.f81900g;
    }

    @Nullable
    public final String getDiscountCode() {
        return this.f81898e;
    }

    @Nullable
    public final Integer getOtherPaymentAmount() {
        return this.f81902i;
    }

    @Nullable
    public final String getOtherPaymentCode() {
        return this.f81895b;
    }

    @Nullable
    public final List<String> getPrivilegeUsedList() {
        return this.f81901h;
    }

    @Nullable
    public final String getPromotionSetCode() {
        return this.f81903j;
    }

    @Nullable
    public final String getPromotionSet_Code() {
        return this.f81907n;
    }

    @Nullable
    public final Integer getRemainPrivilege() {
        return this.f81904k;
    }

    @Nullable
    public final String getReturnCode() {
        return this.f81896c;
    }

    @Nullable
    public final String getShopReceive() {
        return this.f81906m;
    }

    public int hashCode() {
        Integer num = this.f81894a;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.f81895b;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f81896c;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f81897d;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f81898e;
        int hashCode5 = (hashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Boolean bool = this.f81899f;
        int hashCode6 = (hashCode5 + (bool == null ? 0 : bool.hashCode())) * 31;
        String str5 = this.f81900g;
        int hashCode7 = (hashCode6 + (str5 == null ? 0 : str5.hashCode())) * 31;
        List<String> list = this.f81901h;
        int hashCode8 = (hashCode7 + (list == null ? 0 : list.hashCode())) * 31;
        Integer num2 = this.f81902i;
        int hashCode9 = (hashCode8 + (num2 == null ? 0 : num2.hashCode())) * 31;
        String str6 = this.f81903j;
        int hashCode10 = (hashCode9 + (str6 == null ? 0 : str6.hashCode())) * 31;
        Integer num3 = this.f81904k;
        int hashCode11 = (hashCode10 + (num3 == null ? 0 : num3.hashCode())) * 31;
        String str7 = this.f81905l;
        int hashCode12 = (hashCode11 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.f81906m;
        int hashCode13 = (hashCode12 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.f81907n;
        return hashCode13 + (str9 != null ? str9.hashCode() : 0);
    }

    @Nullable
    public final Boolean isTccActivate() {
        return this.f81899f;
    }

    @NotNull
    public String toString() {
        Integer num = this.f81894a;
        String str = this.f81895b;
        String str2 = this.f81896c;
        String str3 = this.f81897d;
        String str4 = this.f81898e;
        Boolean bool = this.f81899f;
        String str5 = this.f81900g;
        List<String> list = this.f81901h;
        Integer num2 = this.f81902i;
        String str6 = this.f81903j;
        Integer num3 = this.f81904k;
        String str7 = this.f81905l;
        String str8 = this.f81906m;
        String str9 = this.f81907n;
        return "CheckPrivilegeResponse(depositAmount=" + num + ", otherPaymentCode=" + str + ", returnCode=" + str2 + ", depositDate=" + str3 + ", discountCode=" + str4 + ", isTccActivate=" + bool + ", dhopReceive=" + str5 + ", privilegeUsedList=" + list + ", otherPaymentAmount=" + num2 + ", promotionSetCode=" + str6 + ", remainPrivilege=" + num3 + ", depositDocNo=" + str7 + ", shopReceive=" + str8 + ", promotionSet_Code=" + str9 + ")";
    }

    public CheckPrivilegeResponse(@Nullable Integer num, @Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable Boolean bool, @Nullable String str5, @Nullable List<String> list, @Nullable Integer num2, @Nullable String str6, @Nullable Integer num3, @Nullable String str7, @Nullable String str8, @Nullable String str9) {
        this.f81894a = num;
        this.f81895b = str;
        this.f81896c = str2;
        this.f81897d = str3;
        this.f81898e = str4;
        this.f81899f = bool;
        this.f81900g = str5;
        this.f81901h = list;
        this.f81902i = num2;
        this.f81903j = str6;
        this.f81904k = num3;
        this.f81905l = str7;
        this.f81906m = str8;
        this.f81907n = str9;
    }

    public /* synthetic */ CheckPrivilegeResponse(Integer num, String str, String str2, String str3, String str4, Boolean bool, String str5, List list, Integer num2, String str6, Integer num3, String str7, String str8, String str9, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : num, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? null : str3, (i & 16) != 0 ? null : str4, (i & 32) != 0 ? null : bool, (i & 64) != 0 ? null : str5, (i & 128) != 0 ? null : list, (i & 256) != 0 ? null : num2, (i & 512) != 0 ? null : str6, (i & 1024) != 0 ? null : num3, (i & 2048) != 0 ? null : str7, (i & 4096) != 0 ? null : str8, (i & 8192) == 0 ? str9 : null);
    }
}