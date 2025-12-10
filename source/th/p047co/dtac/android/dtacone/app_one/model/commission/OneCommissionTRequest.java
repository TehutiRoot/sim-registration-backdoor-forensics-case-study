package th.p047co.dtac.android.dtacone.app_one.model.commission;

import androidx.compose.runtime.internal.StabilityInferred;
import com.google.gson.annotations.SerializedName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 0)
@Metadata(m28851d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u0013\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001c\u0010\b\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\n\u0010\u0007J\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0007¨\u0006\u0015"}, m28850d2 = {"Lth/co/dtac/android/dtacone/app_one/model/commission/OneCommissionTRequest;", "", "", "comPeriod", "<init>", "(Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lth/co/dtac/android/dtacone/app_one/model/commission/OneCommissionTRequest;", "toString", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", PDPageLabelRange.STYLE_LETTERS_LOWER, "Ljava/lang/String;", "getComPeriod", "app_prodRelease"}, m28849k = 1, m28848mv = {1, 8, 0})
/* renamed from: th.co.dtac.android.dtacone.app_one.model.commission.OneCommissionTRequest */
/* loaded from: classes7.dex */
public final class OneCommissionTRequest {
    public static final int $stable = 0;
    @SerializedName("comPeriod")
    @Nullable

    /* renamed from: a */
    private final String f81677a;

    public OneCommissionTRequest() {
        this(null, 1, null);
    }

    public static /* synthetic */ OneCommissionTRequest copy$default(OneCommissionTRequest oneCommissionTRequest, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = oneCommissionTRequest.f81677a;
        }
        return oneCommissionTRequest.copy(str);
    }

    @Nullable
    public final String component1() {
        return this.f81677a;
    }

    @NotNull
    public final OneCommissionTRequest copy(@Nullable String str) {
        return new OneCommissionTRequest(str);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof OneCommissionTRequest) && Intrinsics.areEqual(this.f81677a, ((OneCommissionTRequest) obj).f81677a);
    }

    @Nullable
    public final String getComPeriod() {
        return this.f81677a;
    }

    public int hashCode() {
        String str = this.f81677a;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    @NotNull
    public String toString() {
        String str = this.f81677a;
        return "OneCommissionTRequest(comPeriod=" + str + ")";
    }

    public OneCommissionTRequest(@Nullable String str) {
        this.f81677a = str;
    }

    public /* synthetic */ OneCommissionTRequest(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str);
    }
}
