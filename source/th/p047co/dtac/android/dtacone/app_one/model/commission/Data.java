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
@Metadata(m28851d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u0013\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001c\u0010\b\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007¨\u0006\u0017"}, m28850d2 = {"Lth/co/dtac/android/dtacone/app_one/model/commission/Data;", "", "Lth/co/dtac/android/dtacone/app_one/model/commission/Commission;", "commission", "<init>", "(Lth/co/dtac/android/dtacone/app_one/model/commission/Commission;)V", "component1", "()Lth/co/dtac/android/dtacone/app_one/model/commission/Commission;", "copy", "(Lth/co/dtac/android/dtacone/app_one/model/commission/Commission;)Lth/co/dtac/android/dtacone/app_one/model/commission/Data;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", PDPageLabelRange.STYLE_LETTERS_LOWER, "Lth/co/dtac/android/dtacone/app_one/model/commission/Commission;", "getCommission", "app_prodRelease"}, m28849k = 1, m28848mv = {1, 8, 0})
/* renamed from: th.co.dtac.android.dtacone.app_one.model.commission.Data */
/* loaded from: classes7.dex */
public final class Data {
    public static final int $stable = 8;
    @SerializedName("commission")
    @Nullable

    /* renamed from: a */
    private final Commission f81638a;

    public Data() {
        this(null, 1, null);
    }

    public static /* synthetic */ Data copy$default(Data data, Commission commission, int i, Object obj) {
        if ((i & 1) != 0) {
            commission = data.f81638a;
        }
        return data.copy(commission);
    }

    @Nullable
    public final Commission component1() {
        return this.f81638a;
    }

    @NotNull
    public final Data copy(@Nullable Commission commission) {
        return new Data(commission);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof Data) && Intrinsics.areEqual(this.f81638a, ((Data) obj).f81638a);
    }

    @Nullable
    public final Commission getCommission() {
        return this.f81638a;
    }

    public int hashCode() {
        Commission commission = this.f81638a;
        if (commission == null) {
            return 0;
        }
        return commission.hashCode();
    }

    @NotNull
    public String toString() {
        Commission commission = this.f81638a;
        return "Data(commission=" + commission + ")";
    }

    public Data(@Nullable Commission commission) {
        this.f81638a = commission;
    }

    public /* synthetic */ Data(Commission commission, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : commission);
    }
}
