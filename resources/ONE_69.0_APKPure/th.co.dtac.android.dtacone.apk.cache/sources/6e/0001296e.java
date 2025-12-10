package th.p047co.dtac.android.dtacone.view.appOne.activateSim.model;

import androidx.compose.runtime.internal.StabilityInferred;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 0)
@Metadata(m29143d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0087\b\u0018\u00002\u00020\u0001B+\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0012\u0010\b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0012\u0010\n\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\tJ\u0012\u0010\u000b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\tJ4\u0010\f\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000e\u0010\tJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R$\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\t\"\u0004\b\u0019\u0010\u001aR$\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001b\u0010\u0017\u001a\u0004\b\u001c\u0010\t\"\u0004\b\u001d\u0010\u001aR$\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001e\u0010\u0017\u001a\u0004\b\u001f\u0010\t\"\u0004\b \u0010\u001a¨\u0006!"}, m29142d2 = {"Lth/co/dtac/android/dtacone/view/appOne/activateSim/model/OneActivateSimErrorModel;", "", "", "errorCode", "errorTime", "encrptyCardId", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lth/co/dtac/android/dtacone/view/appOne/activateSim/model/OneActivateSimErrorModel;", "toString", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", PDPageLabelRange.STYLE_LETTERS_LOWER, "Ljava/lang/String;", "getErrorCode", "setErrorCode", "(Ljava/lang/String;)V", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "getErrorTime", "setErrorTime", OperatorName.CURVE_TO, "getEncrptyCardId", "setEncrptyCardId", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0})
/* renamed from: th.co.dtac.android.dtacone.view.appOne.activateSim.model.OneActivateSimErrorModel */
/* loaded from: classes10.dex */
public final class OneActivateSimErrorModel {
    public static final int $stable = 8;

    /* renamed from: a */
    public String f88160a;

    /* renamed from: b */
    public String f88161b;

    /* renamed from: c */
    public String f88162c;

    public OneActivateSimErrorModel() {
        this(null, null, null, 7, null);
    }

    public static /* synthetic */ OneActivateSimErrorModel copy$default(OneActivateSimErrorModel oneActivateSimErrorModel, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = oneActivateSimErrorModel.f88160a;
        }
        if ((i & 2) != 0) {
            str2 = oneActivateSimErrorModel.f88161b;
        }
        if ((i & 4) != 0) {
            str3 = oneActivateSimErrorModel.f88162c;
        }
        return oneActivateSimErrorModel.copy(str, str2, str3);
    }

    @Nullable
    public final String component1() {
        return this.f88160a;
    }

    @Nullable
    public final String component2() {
        return this.f88161b;
    }

    @Nullable
    public final String component3() {
        return this.f88162c;
    }

    @NotNull
    public final OneActivateSimErrorModel copy(@Nullable String str, @Nullable String str2, @Nullable String str3) {
        return new OneActivateSimErrorModel(str, str2, str3);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof OneActivateSimErrorModel) {
            OneActivateSimErrorModel oneActivateSimErrorModel = (OneActivateSimErrorModel) obj;
            return Intrinsics.areEqual(this.f88160a, oneActivateSimErrorModel.f88160a) && Intrinsics.areEqual(this.f88161b, oneActivateSimErrorModel.f88161b) && Intrinsics.areEqual(this.f88162c, oneActivateSimErrorModel.f88162c);
        }
        return false;
    }

    @Nullable
    public final String getEncrptyCardId() {
        return this.f88162c;
    }

    @Nullable
    public final String getErrorCode() {
        return this.f88160a;
    }

    @Nullable
    public final String getErrorTime() {
        return this.f88161b;
    }

    public int hashCode() {
        String str = this.f88160a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f88161b;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f88162c;
        return hashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    public final void setEncrptyCardId(@Nullable String str) {
        this.f88162c = str;
    }

    public final void setErrorCode(@Nullable String str) {
        this.f88160a = str;
    }

    public final void setErrorTime(@Nullable String str) {
        this.f88161b = str;
    }

    @NotNull
    public String toString() {
        String str = this.f88160a;
        String str2 = this.f88161b;
        String str3 = this.f88162c;
        return "OneActivateSimErrorModel(errorCode=" + str + ", errorTime=" + str2 + ", encrptyCardId=" + str3 + ")";
    }

    public OneActivateSimErrorModel(@Nullable String str, @Nullable String str2, @Nullable String str3) {
        this.f88160a = str;
        this.f88161b = str2;
        this.f88162c = str3;
    }

    public /* synthetic */ OneActivateSimErrorModel(String str, String str2, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3);
    }
}