package th.p047co.dtac.android.dtacone.model.postpaid;

import androidx.compose.runtime.internal.StabilityInferred;
import com.google.gson.annotations.SerializedName;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@StabilityInferred(parameters = 0)
@Metadata(m29143d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tR\u0016\u0010\u0007\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, m29142d2 = {"Lth/co/dtac/android/dtacone/model/postpaid/PostPaidSearchpackagesRequest;", "", OperatorName.SAVE, "", "simType", "withDevice", "", "minPriceValue", "", "(Ljava/lang/String;Ljava/lang/String;ZI)V", "getMinPriceValue", "()I", "getQ", "()Ljava/lang/String;", "getSimType", "getWithDevice", "()Z", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.model.postpaid.PostPaidSearchpackagesRequest */
/* loaded from: classes8.dex */
public final class PostPaidSearchpackagesRequest {
    public static final int $stable = 0;
    @SerializedName("minPriceValue")
    private final int minPriceValue;
    @SerializedName(OperatorName.SAVE)
    @NotNull

    /* renamed from: q */
    private final String f85179q;
    @SerializedName("simType")
    @NotNull
    private final String simType;
    @SerializedName("withDevice")
    private final boolean withDevice;

    public PostPaidSearchpackagesRequest(@NotNull String q, @NotNull String simType, boolean z, int i) {
        Intrinsics.checkNotNullParameter(q, "q");
        Intrinsics.checkNotNullParameter(simType, "simType");
        this.f85179q = q;
        this.simType = simType;
        this.withDevice = z;
        this.minPriceValue = i;
    }

    public final int getMinPriceValue() {
        return this.minPriceValue;
    }

    @NotNull
    public final String getQ() {
        return this.f85179q;
    }

    @NotNull
    public final String getSimType() {
        return this.simType;
    }

    public final boolean getWithDevice() {
        return this.withDevice;
    }
}