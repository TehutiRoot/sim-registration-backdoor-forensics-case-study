package th.p047co.dtac.android.dtacone.view.appOne.activateSim.model.response;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.core.app.NotificationCompat;
import com.google.gson.annotations.SerializedName;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 0)
@Metadata(m29143d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\r\b\u0087\b\u0018\u00002\u00020\u0001B+\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0012\u0010\t\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0012\u0010\u000b\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0012\u0010\r\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\r\u0010\fJ4\u0010\u000e\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0010\u0010\fJ\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0015\u001a\u00020\u00022\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0003\u0010\nR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\fR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u001a\u001a\u0004\b\u001d\u0010\f¨\u0006\u001e"}, m29142d2 = {"Lth/co/dtac/android/dtacone/view/appOne/activateSim/model/response/OneActivateSimTrueCompanyData;", "", "", "isDupTran", "", "message", NotificationCompat.CATEGORY_STATUS, "<init>", "(Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/Boolean;", "component2", "()Ljava/lang/String;", "component3", "copy", "(Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;)Lth/co/dtac/android/dtacone/view/appOne/activateSim/model/response/OneActivateSimTrueCompanyData;", "toString", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", PDPageLabelRange.STYLE_LETTERS_LOWER, "Ljava/lang/Boolean;", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "Ljava/lang/String;", "getMessage", OperatorName.CURVE_TO, "getStatus", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0})
/* renamed from: th.co.dtac.android.dtacone.view.appOne.activateSim.model.response.OneActivateSimTrueCompanyData */
/* loaded from: classes10.dex */
public final class OneActivateSimTrueCompanyData {
    public static final int $stable = 0;
    @SerializedName("isDupTran")
    @Nullable

    /* renamed from: a */
    private final Boolean f88224a;
    @SerializedName("message")
    @Nullable

    /* renamed from: b */
    private final String f88225b;
    @SerializedName(NotificationCompat.CATEGORY_STATUS)
    @Nullable

    /* renamed from: c */
    private final String f88226c;

    public OneActivateSimTrueCompanyData() {
        this(null, null, null, 7, null);
    }

    public static /* synthetic */ OneActivateSimTrueCompanyData copy$default(OneActivateSimTrueCompanyData oneActivateSimTrueCompanyData, Boolean bool, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            bool = oneActivateSimTrueCompanyData.f88224a;
        }
        if ((i & 2) != 0) {
            str = oneActivateSimTrueCompanyData.f88225b;
        }
        if ((i & 4) != 0) {
            str2 = oneActivateSimTrueCompanyData.f88226c;
        }
        return oneActivateSimTrueCompanyData.copy(bool, str, str2);
    }

    @Nullable
    public final Boolean component1() {
        return this.f88224a;
    }

    @Nullable
    public final String component2() {
        return this.f88225b;
    }

    @Nullable
    public final String component3() {
        return this.f88226c;
    }

    @NotNull
    public final OneActivateSimTrueCompanyData copy(@Nullable Boolean bool, @Nullable String str, @Nullable String str2) {
        return new OneActivateSimTrueCompanyData(bool, str, str2);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof OneActivateSimTrueCompanyData) {
            OneActivateSimTrueCompanyData oneActivateSimTrueCompanyData = (OneActivateSimTrueCompanyData) obj;
            return Intrinsics.areEqual(this.f88224a, oneActivateSimTrueCompanyData.f88224a) && Intrinsics.areEqual(this.f88225b, oneActivateSimTrueCompanyData.f88225b) && Intrinsics.areEqual(this.f88226c, oneActivateSimTrueCompanyData.f88226c);
        }
        return false;
    }

    @Nullable
    public final String getMessage() {
        return this.f88225b;
    }

    @Nullable
    public final String getStatus() {
        return this.f88226c;
    }

    public int hashCode() {
        Boolean bool = this.f88224a;
        int hashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        String str = this.f88225b;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f88226c;
        return hashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    @Nullable
    public final Boolean isDupTran() {
        return this.f88224a;
    }

    @NotNull
    public String toString() {
        Boolean bool = this.f88224a;
        String str = this.f88225b;
        String str2 = this.f88226c;
        return "OneActivateSimTrueCompanyData(isDupTran=" + bool + ", message=" + str + ", status=" + str2 + ")";
    }

    public OneActivateSimTrueCompanyData(@Nullable Boolean bool, @Nullable String str, @Nullable String str2) {
        this.f88224a = bool;
        this.f88225b = str;
        this.f88226c = str2;
    }

    public /* synthetic */ OneActivateSimTrueCompanyData(Boolean bool, String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : bool, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : str2);
    }
}