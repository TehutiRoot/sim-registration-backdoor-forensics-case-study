package th.p047co.dtac.android.dtacone.model.campaign.detail;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.apache.commons.codec.language.p027bm.Languages;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 0)
@Metadata(m28851d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001¢\u0006\u0002\u0010\u0003J\u000b\u0010\u0006\u001a\u0004\u0018\u00010\u0001HÆ\u0003J\u0015\u0010\u0007\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001HÆ\u0001J\u0013\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000b\u001a\u00020\fHÖ\u0001J\t\u0010\r\u001a\u00020\u000eHÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0001¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u000f"}, m28850d2 = {"Lth/co/dtac/android/dtacone/model/campaign/detail/PointHistory;", "", Languages.ANY, "(Ljava/lang/Object;)V", "getAny", "()Ljava/lang/Object;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "app_prodRelease"}, m28849k = 1, m28848mv = {1, 8, 0}, m28846xi = 48)
/* renamed from: th.co.dtac.android.dtacone.model.campaign.detail.PointHistory */
/* loaded from: classes8.dex */
public final class PointHistory {
    public static final int $stable = 8;
    @Nullable
    private final Object any;

    public PointHistory() {
        this(null, 1, null);
    }

    public static /* synthetic */ PointHistory copy$default(PointHistory pointHistory, Object obj, int i, Object obj2) {
        if ((i & 1) != 0) {
            obj = pointHistory.any;
        }
        return pointHistory.copy(obj);
    }

    @Nullable
    public final Object component1() {
        return this.any;
    }

    @NotNull
    public final PointHistory copy(@Nullable Object obj) {
        return new PointHistory(obj);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof PointHistory) && Intrinsics.areEqual(this.any, ((PointHistory) obj).any);
    }

    @Nullable
    public final Object getAny() {
        return this.any;
    }

    public int hashCode() {
        Object obj = this.any;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    @NotNull
    public String toString() {
        Object obj = this.any;
        return "PointHistory(any=" + obj + ")";
    }

    public PointHistory(@Nullable Object obj) {
        this.any = obj;
    }

    public /* synthetic */ PointHistory(Object obj, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : obj);
    }
}
