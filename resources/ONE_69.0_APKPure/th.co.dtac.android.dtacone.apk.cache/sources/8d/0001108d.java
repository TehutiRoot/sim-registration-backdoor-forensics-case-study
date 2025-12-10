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
@Metadata(m29143d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B+\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0012\u0010\b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0012\u0010\n\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\tJ\u0012\u0010\u000b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\tJ4\u0010\f\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000e\u0010\tJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\tR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u0017\u001a\u0004\b\u001a\u0010\tR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u0017\u001a\u0004\b\u001c\u0010\t¨\u0006\u001d"}, m29142d2 = {"Lth/co/dtac/android/dtacone/app_one/model/prepaid_registration/SearchMsisdn;", "", "", "result", "resultDesc", "msisdn", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lth/co/dtac/android/dtacone/app_one/model/prepaid_registration/SearchMsisdn;", "toString", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", PDPageLabelRange.STYLE_LETTERS_LOWER, "Ljava/lang/String;", "getResult", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "getResultDesc", OperatorName.CURVE_TO, "getMsisdn", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0})
/* renamed from: th.co.dtac.android.dtacone.app_one.model.prepaid_registration.SearchMsisdn */
/* loaded from: classes7.dex */
public final class SearchMsisdn {
    public static final int $stable = 0;
    @SerializedName("result")
    @Nullable

    /* renamed from: a */
    private final String f82061a;
    @SerializedName("resultDesc")
    @Nullable

    /* renamed from: b */
    private final String f82062b;
    @SerializedName("msisdn")
    @Nullable

    /* renamed from: c */
    private final String f82063c;

    public SearchMsisdn() {
        this(null, null, null, 7, null);
    }

    public static /* synthetic */ SearchMsisdn copy$default(SearchMsisdn searchMsisdn, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = searchMsisdn.f82061a;
        }
        if ((i & 2) != 0) {
            str2 = searchMsisdn.f82062b;
        }
        if ((i & 4) != 0) {
            str3 = searchMsisdn.f82063c;
        }
        return searchMsisdn.copy(str, str2, str3);
    }

    @Nullable
    public final String component1() {
        return this.f82061a;
    }

    @Nullable
    public final String component2() {
        return this.f82062b;
    }

    @Nullable
    public final String component3() {
        return this.f82063c;
    }

    @NotNull
    public final SearchMsisdn copy(@Nullable String str, @Nullable String str2, @Nullable String str3) {
        return new SearchMsisdn(str, str2, str3);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof SearchMsisdn) {
            SearchMsisdn searchMsisdn = (SearchMsisdn) obj;
            return Intrinsics.areEqual(this.f82061a, searchMsisdn.f82061a) && Intrinsics.areEqual(this.f82062b, searchMsisdn.f82062b) && Intrinsics.areEqual(this.f82063c, searchMsisdn.f82063c);
        }
        return false;
    }

    @Nullable
    public final String getMsisdn() {
        return this.f82063c;
    }

    @Nullable
    public final String getResult() {
        return this.f82061a;
    }

    @Nullable
    public final String getResultDesc() {
        return this.f82062b;
    }

    public int hashCode() {
        String str = this.f82061a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f82062b;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f82063c;
        return hashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        String str = this.f82061a;
        String str2 = this.f82062b;
        String str3 = this.f82063c;
        return "SearchMsisdn(result=" + str + ", resultDesc=" + str2 + ", msisdn=" + str3 + ")";
    }

    public SearchMsisdn(@Nullable String str, @Nullable String str2, @Nullable String str3) {
        this.f82061a = str;
        this.f82062b = str2;
        this.f82063c = str3;
    }

    public /* synthetic */ SearchMsisdn(String str, String str2, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3);
    }
}