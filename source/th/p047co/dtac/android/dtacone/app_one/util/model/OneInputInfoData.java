package th.p047co.dtac.android.dtacone.app_one.util.model;

import androidx.autofill.HintConstants;
import androidx.compose.runtime.internal.StabilityInferred;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 0)
@Metadata(m28851d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0012\u0010\t\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\bJ(\u0010\n\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\f\u0010\bJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\bR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0015\u001a\u0004\b\u0018\u0010\b¨\u0006\u0019"}, m28850d2 = {"Lth/co/dtac/android/dtacone/app_one/util/model/OneInputInfoData;", "", "", "rtrCode", HintConstants.AUTOFILL_HINT_PHONE_NUMBER, "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "copy", "(Ljava/lang/String;Ljava/lang/String;)Lth/co/dtac/android/dtacone/app_one/util/model/OneInputInfoData;", "toString", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", PDPageLabelRange.STYLE_LETTERS_LOWER, "Ljava/lang/String;", "getRtrCode", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "getPhoneNumber", "app_prodRelease"}, m28849k = 1, m28848mv = {1, 8, 0})
/* renamed from: th.co.dtac.android.dtacone.app_one.util.model.OneInputInfoData */
/* loaded from: classes7.dex */
public final class OneInputInfoData {
    public static final int $stable = 0;

    /* renamed from: a */
    public final String f82415a;

    /* renamed from: b */
    public final String f82416b;

    public OneInputInfoData() {
        this(null, null, 3, null);
    }

    public static /* synthetic */ OneInputInfoData copy$default(OneInputInfoData oneInputInfoData, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = oneInputInfoData.f82415a;
        }
        if ((i & 2) != 0) {
            str2 = oneInputInfoData.f82416b;
        }
        return oneInputInfoData.copy(str, str2);
    }

    @Nullable
    public final String component1() {
        return this.f82415a;
    }

    @Nullable
    public final String component2() {
        return this.f82416b;
    }

    @NotNull
    public final OneInputInfoData copy(@Nullable String str, @Nullable String str2) {
        return new OneInputInfoData(str, str2);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof OneInputInfoData) {
            OneInputInfoData oneInputInfoData = (OneInputInfoData) obj;
            return Intrinsics.areEqual(this.f82415a, oneInputInfoData.f82415a) && Intrinsics.areEqual(this.f82416b, oneInputInfoData.f82416b);
        }
        return false;
    }

    @Nullable
    public final String getPhoneNumber() {
        return this.f82416b;
    }

    @Nullable
    public final String getRtrCode() {
        return this.f82415a;
    }

    public int hashCode() {
        String str = this.f82415a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f82416b;
        return hashCode + (str2 != null ? str2.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        String str = this.f82415a;
        String str2 = this.f82416b;
        return "OneInputInfoData(rtrCode=" + str + ", phoneNumber=" + str2 + ")";
    }

    public OneInputInfoData(@Nullable String str, @Nullable String str2) {
        this.f82415a = str;
        this.f82416b = str2;
    }

    public /* synthetic */ OneInputInfoData(String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2);
    }
}
