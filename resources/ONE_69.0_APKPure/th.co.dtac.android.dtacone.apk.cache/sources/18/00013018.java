package th.p047co.dtac.android.dtacone.view.appOne.eSign.model;

import androidx.compose.runtime.internal.StabilityInferred;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import th.p047co.dtac.android.dtacone.view.appOne.eSign.response.AdditionalInformation;

@StabilityInferred(parameters = 0)
@Metadata(m29143d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0013\b\u0087\b\u0018\u00002\u00020\u0001B_\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t¢\u0006\u0004\b\f\u0010\rJ\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0012\u0010\u0010\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u000fJ\u0012\u0010\u0011\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u000fJ\u0012\u0010\u0012\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u000fJ\u0012\u0010\u0013\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u000fJ\u0012\u0010\u0014\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u000fJ\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\n0\tHÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0016Jh\u0010\u0017\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00022\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\tHÆ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u000fJ\u0010\u0010\u001b\u001a\u00020\u001aHÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010\u001f\u001a\u00020\u001e2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001f\u0010 R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010\u000fR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b$\u0010\"\u001a\u0004\b%\u0010\u000fR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b&\u0010\"\u001a\u0004\b'\u0010\u000fR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b(\u0010\"\u001a\u0004\b)\u0010\u000fR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b*\u0010\"\u001a\u0004\b+\u0010\u000fR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b,\u0010\"\u001a\u0004\b-\u0010\u000fR\u001d\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0006¢\u0006\f\n\u0004\b.\u0010/\u001a\u0004\b0\u0010\u0016¨\u00061"}, m29142d2 = {"Lth/co/dtac/android/dtacone/view/appOne/eSign/model/OneOrderInfoModel;", "", "", "tel", "simCardNumber", "advancePayment", "contractPeriod", "screenTitle", "screenMessage", "", "Lth/co/dtac/android/dtacone/view/appOne/eSign/response/AdditionalInformation;", "additionalInformation", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "component5", "component6", "component7", "()Ljava/util/List;", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)Lth/co/dtac/android/dtacone/view/appOne/eSign/model/OneOrderInfoModel;", "toString", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", PDPageLabelRange.STYLE_LETTERS_LOWER, "Ljava/lang/String;", "getTel", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "getSimCardNumber", OperatorName.CURVE_TO, "getAdvancePayment", "d", "getContractPeriod", "e", "getScreenTitle", OperatorName.FILL_NON_ZERO, "getScreenMessage", OperatorName.NON_STROKING_GRAY, "Ljava/util/List;", "getAdditionalInformation", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0})
/* renamed from: th.co.dtac.android.dtacone.view.appOne.eSign.model.OneOrderInfoModel */
/* loaded from: classes10.dex */
public final class OneOrderInfoModel {
    public static final int $stable = 8;

    /* renamed from: a */
    public final String f90781a;

    /* renamed from: b */
    public final String f90782b;

    /* renamed from: c */
    public final String f90783c;

    /* renamed from: d */
    public final String f90784d;

    /* renamed from: e */
    public final String f90785e;

    /* renamed from: f */
    public final String f90786f;

    /* renamed from: g */
    public final List f90787g;

    public OneOrderInfoModel() {
        this(null, null, null, null, null, null, null, 127, null);
    }

    public static /* synthetic */ OneOrderInfoModel copy$default(OneOrderInfoModel oneOrderInfoModel, String str, String str2, String str3, String str4, String str5, String str6, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = oneOrderInfoModel.f90781a;
        }
        if ((i & 2) != 0) {
            str2 = oneOrderInfoModel.f90782b;
        }
        String str7 = str2;
        if ((i & 4) != 0) {
            str3 = oneOrderInfoModel.f90783c;
        }
        String str8 = str3;
        if ((i & 8) != 0) {
            str4 = oneOrderInfoModel.f90784d;
        }
        String str9 = str4;
        if ((i & 16) != 0) {
            str5 = oneOrderInfoModel.f90785e;
        }
        String str10 = str5;
        if ((i & 32) != 0) {
            str6 = oneOrderInfoModel.f90786f;
        }
        String str11 = str6;
        List list2 = list;
        if ((i & 64) != 0) {
            list2 = oneOrderInfoModel.f90787g;
        }
        return oneOrderInfoModel.copy(str, str7, str8, str9, str10, str11, list2);
    }

    @Nullable
    public final String component1() {
        return this.f90781a;
    }

    @Nullable
    public final String component2() {
        return this.f90782b;
    }

    @Nullable
    public final String component3() {
        return this.f90783c;
    }

    @Nullable
    public final String component4() {
        return this.f90784d;
    }

    @Nullable
    public final String component5() {
        return this.f90785e;
    }

    @Nullable
    public final String component6() {
        return this.f90786f;
    }

    @NotNull
    public final List<AdditionalInformation> component7() {
        return this.f90787g;
    }

    @NotNull
    public final OneOrderInfoModel copy(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable String str6, @NotNull List<AdditionalInformation> additionalInformation) {
        Intrinsics.checkNotNullParameter(additionalInformation, "additionalInformation");
        return new OneOrderInfoModel(str, str2, str3, str4, str5, str6, additionalInformation);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof OneOrderInfoModel) {
            OneOrderInfoModel oneOrderInfoModel = (OneOrderInfoModel) obj;
            return Intrinsics.areEqual(this.f90781a, oneOrderInfoModel.f90781a) && Intrinsics.areEqual(this.f90782b, oneOrderInfoModel.f90782b) && Intrinsics.areEqual(this.f90783c, oneOrderInfoModel.f90783c) && Intrinsics.areEqual(this.f90784d, oneOrderInfoModel.f90784d) && Intrinsics.areEqual(this.f90785e, oneOrderInfoModel.f90785e) && Intrinsics.areEqual(this.f90786f, oneOrderInfoModel.f90786f) && Intrinsics.areEqual(this.f90787g, oneOrderInfoModel.f90787g);
        }
        return false;
    }

    @NotNull
    public final List<AdditionalInformation> getAdditionalInformation() {
        return this.f90787g;
    }

    @Nullable
    public final String getAdvancePayment() {
        return this.f90783c;
    }

    @Nullable
    public final String getContractPeriod() {
        return this.f90784d;
    }

    @Nullable
    public final String getScreenMessage() {
        return this.f90786f;
    }

    @Nullable
    public final String getScreenTitle() {
        return this.f90785e;
    }

    @Nullable
    public final String getSimCardNumber() {
        return this.f90782b;
    }

    @Nullable
    public final String getTel() {
        return this.f90781a;
    }

    public int hashCode() {
        String str = this.f90781a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f90782b;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f90783c;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f90784d;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.f90785e;
        int hashCode5 = (hashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.f90786f;
        return ((hashCode5 + (str6 != null ? str6.hashCode() : 0)) * 31) + this.f90787g.hashCode();
    }

    @NotNull
    public String toString() {
        String str = this.f90781a;
        String str2 = this.f90782b;
        String str3 = this.f90783c;
        String str4 = this.f90784d;
        String str5 = this.f90785e;
        String str6 = this.f90786f;
        List list = this.f90787g;
        return "OneOrderInfoModel(tel=" + str + ", simCardNumber=" + str2 + ", advancePayment=" + str3 + ", contractPeriod=" + str4 + ", screenTitle=" + str5 + ", screenMessage=" + str6 + ", additionalInformation=" + list + ")";
    }

    public OneOrderInfoModel(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable String str6, @NotNull List<AdditionalInformation> additionalInformation) {
        Intrinsics.checkNotNullParameter(additionalInformation, "additionalInformation");
        this.f90781a = str;
        this.f90782b = str2;
        this.f90783c = str3;
        this.f90784d = str4;
        this.f90785e = str5;
        this.f90786f = str6;
        this.f90787g = additionalInformation;
    }

    public /* synthetic */ OneOrderInfoModel(String str, String str2, String str3, String str4, String str5, String str6, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : str5, (i & 32) == 0 ? str6 : null, (i & 64) != 0 ? CollectionsKt__CollectionsKt.emptyList() : list);
    }
}