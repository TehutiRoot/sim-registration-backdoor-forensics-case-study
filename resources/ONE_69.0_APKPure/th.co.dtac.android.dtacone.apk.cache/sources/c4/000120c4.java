package th.p047co.dtac.android.dtacone.model.topup;

import androidx.compose.runtime.internal.StabilityInferred;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 0)
@Metadata(m29143d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0007R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u001a\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\f\u001a\u0004\b\n\u0010\u000bR\u0014\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0002X\u0083\u0004¢\u0006\u0004\n\u0002\u0010\f¨\u0006\r"}, m29142d2 = {"Lth/co/dtac/android/dtacone/model/topup/TopUpPriceListCollection;", "", "id", "", FirebaseAnalytics.Param.PRICE, "", "sort", "(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;)V", "getId", "()Ljava/lang/String;", "getPrice", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.model.topup.TopUpPriceListCollection */
/* loaded from: classes8.dex */
public final class TopUpPriceListCollection {
    public static final int $stable = 0;
    @SerializedName("id")
    @NotNull

    /* renamed from: id */
    private final String f85191id;
    @SerializedName(FirebaseAnalytics.Param.PRICE)
    @Nullable
    private final Integer price;
    @SerializedName("sort")
    @Nullable
    private final Integer sort;

    public TopUpPriceListCollection(@NotNull String id2, @Nullable Integer num, @Nullable Integer num2) {
        Intrinsics.checkNotNullParameter(id2, "id");
        this.f85191id = id2;
        this.price = num;
        this.sort = num2;
    }

    @NotNull
    public final String getId() {
        return this.f85191id;
    }

    @Nullable
    public final Integer getPrice() {
        return this.price;
    }
}