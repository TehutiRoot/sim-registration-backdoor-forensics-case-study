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
@Metadata(m28851d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u0013\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001c\u0010\b\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\n\u0010\u0007J\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0007¨\u0006\u0015"}, m28850d2 = {"Lth/co/dtac/android/dtacone/app_one/model/commission/OneGetCommissionDetailRequest;", "", "", "comPeriod", "<init>", "(Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lth/co/dtac/android/dtacone/app_one/model/commission/OneGetCommissionDetailRequest;", "toString", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", PDPageLabelRange.STYLE_LETTERS_LOWER, "Ljava/lang/String;", "getComPeriod", "app_prodRelease"}, m28849k = 1, m28848mv = {1, 8, 0})
/* renamed from: th.co.dtac.android.dtacone.app_one.model.commission.OneGetCommissionDetailRequest */
/* loaded from: classes7.dex */
public final class OneGetCommissionDetailRequest {
    public static final int $stable = 0;
    @SerializedName("comPeriod")
    @Nullable

    /* renamed from: a */
    private final String f81686a;

    public OneGetCommissionDetailRequest() {
        this(null, 1, null);
    }

    public static /* synthetic */ OneGetCommissionDetailRequest copy$default(OneGetCommissionDetailRequest oneGetCommissionDetailRequest, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = oneGetCommissionDetailRequest.f81686a;
        }
        return oneGetCommissionDetailRequest.copy(str);
    }

    @Nullable
    public final String component1() {
        return this.f81686a;
    }

    @NotNull
    public final OneGetCommissionDetailRequest copy(@Nullable String str) {
        return new OneGetCommissionDetailRequest(str);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof OneGetCommissionDetailRequest) && Intrinsics.areEqual(this.f81686a, ((OneGetCommissionDetailRequest) obj).f81686a);
    }

    @Nullable
    public final String getComPeriod() {
        return this.f81686a;
    }

    public int hashCode() {
        String str = this.f81686a;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    @NotNull
    public String toString() {
        String str = this.f81686a;
        return "OneGetCommissionDetailRequest(comPeriod=" + str + ")";
    }

    public OneGetCommissionDetailRequest(@Nullable String str) {
        this.f81686a = str;
    }

    public /* synthetic */ OneGetCommissionDetailRequest(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str);
    }
}
