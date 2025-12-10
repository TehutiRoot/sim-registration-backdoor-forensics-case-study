package th.p047co.dtac.android.dtacone.view.appOne.activateSim.model.request;

import androidx.compose.runtime.internal.StabilityInferred;
import ch.qos.logback.core.joran.action.Action;
import com.google.gson.annotations.SerializedName;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 0)
@Metadata(m29143d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B+\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0012\u0010\b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0012\u0010\n\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\tJ\u0012\u0010\u000b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\tJ4\u0010\f\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000e\u0010\tJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\tR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u0017\u001a\u0004\b\u001a\u0010\tR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u0017\u001a\u0004\b\u001c\u0010\t¨\u0006\u001d"}, m29142d2 = {"Lth/co/dtac/android/dtacone/view/appOne/activateSim/model/request/OneCheckSimActivateSimTrueCompanyRequest;", "", "", Action.KEY_ATTRIBUTE, "value", "flow", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lth/co/dtac/android/dtacone/view/appOne/activateSim/model/request/OneCheckSimActivateSimTrueCompanyRequest;", "toString", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", PDPageLabelRange.STYLE_LETTERS_LOWER, "Ljava/lang/String;", "getKey", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "getValue", OperatorName.CURVE_TO, "getFlow", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0})
/* renamed from: th.co.dtac.android.dtacone.view.appOne.activateSim.model.request.OneCheckSimActivateSimTrueCompanyRequest */
/* loaded from: classes10.dex */
public final class OneCheckSimActivateSimTrueCompanyRequest {
    public static final int $stable = 0;
    @SerializedName(Action.KEY_ATTRIBUTE)
    @Nullable

    /* renamed from: a */
    private final String f88199a;
    @SerializedName("value")
    @Nullable

    /* renamed from: b */
    private final String f88200b;
    @SerializedName("flow")
    @Nullable

    /* renamed from: c */
    private final String f88201c;

    public OneCheckSimActivateSimTrueCompanyRequest() {
        this(null, null, null, 7, null);
    }

    public static /* synthetic */ OneCheckSimActivateSimTrueCompanyRequest copy$default(OneCheckSimActivateSimTrueCompanyRequest oneCheckSimActivateSimTrueCompanyRequest, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = oneCheckSimActivateSimTrueCompanyRequest.f88199a;
        }
        if ((i & 2) != 0) {
            str2 = oneCheckSimActivateSimTrueCompanyRequest.f88200b;
        }
        if ((i & 4) != 0) {
            str3 = oneCheckSimActivateSimTrueCompanyRequest.f88201c;
        }
        return oneCheckSimActivateSimTrueCompanyRequest.copy(str, str2, str3);
    }

    @Nullable
    public final String component1() {
        return this.f88199a;
    }

    @Nullable
    public final String component2() {
        return this.f88200b;
    }

    @Nullable
    public final String component3() {
        return this.f88201c;
    }

    @NotNull
    public final OneCheckSimActivateSimTrueCompanyRequest copy(@Nullable String str, @Nullable String str2, @Nullable String str3) {
        return new OneCheckSimActivateSimTrueCompanyRequest(str, str2, str3);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof OneCheckSimActivateSimTrueCompanyRequest) {
            OneCheckSimActivateSimTrueCompanyRequest oneCheckSimActivateSimTrueCompanyRequest = (OneCheckSimActivateSimTrueCompanyRequest) obj;
            return Intrinsics.areEqual(this.f88199a, oneCheckSimActivateSimTrueCompanyRequest.f88199a) && Intrinsics.areEqual(this.f88200b, oneCheckSimActivateSimTrueCompanyRequest.f88200b) && Intrinsics.areEqual(this.f88201c, oneCheckSimActivateSimTrueCompanyRequest.f88201c);
        }
        return false;
    }

    @Nullable
    public final String getFlow() {
        return this.f88201c;
    }

    @Nullable
    public final String getKey() {
        return this.f88199a;
    }

    @Nullable
    public final String getValue() {
        return this.f88200b;
    }

    public int hashCode() {
        String str = this.f88199a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f88200b;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f88201c;
        return hashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        String str = this.f88199a;
        String str2 = this.f88200b;
        String str3 = this.f88201c;
        return "OneCheckSimActivateSimTrueCompanyRequest(key=" + str + ", value=" + str2 + ", flow=" + str3 + ")";
    }

    public OneCheckSimActivateSimTrueCompanyRequest(@Nullable String str, @Nullable String str2, @Nullable String str3) {
        this.f88199a = str;
        this.f88200b = str2;
        this.f88201c = str3;
    }

    public /* synthetic */ OneCheckSimActivateSimTrueCompanyRequest(String str, String str2, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3);
    }
}