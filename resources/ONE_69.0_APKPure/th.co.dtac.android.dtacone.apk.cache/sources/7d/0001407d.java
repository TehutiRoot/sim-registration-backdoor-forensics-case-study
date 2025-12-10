package th.p047co.dtac.android.dtacone.view.appOne.tol.model;

import androidx.annotation.StringRes;
import androidx.compose.runtime.internal.StabilityInferred;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 0)
@Metadata(m29143d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u001c\b\u0087\b\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000f\u0010\fJ\u0010\u0010\u0010\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J8\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0003\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u0007HÆ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0014\u0010\fJ\u0010\u0010\u0015\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u000eJ\u001a\u0010\u0017\u001a\u00020\u00072\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\fR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u000eR\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001f\u0010\u001a\u001a\u0004\b \u0010\fR\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b\b\u0010\u0011¨\u0006#"}, m29142d2 = {"Lth/co/dtac/android/dtacone/view/appOne/tol/model/IdCardDataItem;", "", "", "idCardType", "", "nameRes", "value", "", "isNumber", "<init>", "(Ljava/lang/String;ILjava/lang/String;Z)V", "component1", "()Ljava/lang/String;", "component2", "()I", "component3", "component4", "()Z", "copy", "(Ljava/lang/String;ILjava/lang/String;Z)Lth/co/dtac/android/dtacone/view/appOne/tol/model/IdCardDataItem;", "toString", "hashCode", "other", "equals", "(Ljava/lang/Object;)Z", PDPageLabelRange.STYLE_LETTERS_LOWER, "Ljava/lang/String;", "getIdCardType", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "I", "getNameRes", OperatorName.CURVE_TO, "getValue", "d", "Z", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0})
/* renamed from: th.co.dtac.android.dtacone.view.appOne.tol.model.IdCardDataItem */
/* loaded from: classes10.dex */
public final class IdCardDataItem {
    public static final int $stable = 0;

    /* renamed from: a */
    public final String f97867a;

    /* renamed from: b */
    public final int f97868b;

    /* renamed from: c */
    public final String f97869c;

    /* renamed from: d */
    public final boolean f97870d;

    public IdCardDataItem(@NotNull String idCardType, @StringRes int i, @NotNull String value, boolean z) {
        Intrinsics.checkNotNullParameter(idCardType, "idCardType");
        Intrinsics.checkNotNullParameter(value, "value");
        this.f97867a = idCardType;
        this.f97868b = i;
        this.f97869c = value;
        this.f97870d = z;
    }

    public static /* synthetic */ IdCardDataItem copy$default(IdCardDataItem idCardDataItem, String str, int i, String str2, boolean z, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = idCardDataItem.f97867a;
        }
        if ((i2 & 2) != 0) {
            i = idCardDataItem.f97868b;
        }
        if ((i2 & 4) != 0) {
            str2 = idCardDataItem.f97869c;
        }
        if ((i2 & 8) != 0) {
            z = idCardDataItem.f97870d;
        }
        return idCardDataItem.copy(str, i, str2, z);
    }

    @NotNull
    public final String component1() {
        return this.f97867a;
    }

    public final int component2() {
        return this.f97868b;
    }

    @NotNull
    public final String component3() {
        return this.f97869c;
    }

    public final boolean component4() {
        return this.f97870d;
    }

    @NotNull
    public final IdCardDataItem copy(@NotNull String idCardType, @StringRes int i, @NotNull String value, boolean z) {
        Intrinsics.checkNotNullParameter(idCardType, "idCardType");
        Intrinsics.checkNotNullParameter(value, "value");
        return new IdCardDataItem(idCardType, i, value, z);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof IdCardDataItem) {
            IdCardDataItem idCardDataItem = (IdCardDataItem) obj;
            return Intrinsics.areEqual(this.f97867a, idCardDataItem.f97867a) && this.f97868b == idCardDataItem.f97868b && Intrinsics.areEqual(this.f97869c, idCardDataItem.f97869c) && this.f97870d == idCardDataItem.f97870d;
        }
        return false;
    }

    @NotNull
    public final String getIdCardType() {
        return this.f97867a;
    }

    public final int getNameRes() {
        return this.f97868b;
    }

    @NotNull
    public final String getValue() {
        return this.f97869c;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode = ((((this.f97867a.hashCode() * 31) + this.f97868b) * 31) + this.f97869c.hashCode()) * 31;
        boolean z = this.f97870d;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        return hashCode + i;
    }

    public final boolean isNumber() {
        return this.f97870d;
    }

    @NotNull
    public String toString() {
        String str = this.f97867a;
        int i = this.f97868b;
        String str2 = this.f97869c;
        boolean z = this.f97870d;
        return "IdCardDataItem(idCardType=" + str + ", nameRes=" + i + ", value=" + str2 + ", isNumber=" + z + ")";
    }
}