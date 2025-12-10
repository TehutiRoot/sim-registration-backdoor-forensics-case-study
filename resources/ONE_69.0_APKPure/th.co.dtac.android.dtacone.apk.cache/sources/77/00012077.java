package th.p047co.dtac.android.dtacone.model.self_update;

import androidx.compose.runtime.internal.StabilityInferred;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@StabilityInferred(parameters = 0)
@Metadata(m29143d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0002\u0010\u0007R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0016\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000b¨\u0006\r"}, m29142d2 = {"Lth/co/dtac/android/dtacone/model/self_update/RtrProfileProvince;", "", "id", "", "nameTH", "", "nameEN", "(ILjava/lang/String;Ljava/lang/String;)V", "getId", "()I", "getNameEN", "()Ljava/lang/String;", "getNameTH", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.model.self_update.RtrProfileProvince */
/* loaded from: classes8.dex */
public final class RtrProfileProvince {
    public static final int $stable = 0;
    @SerializedName("id")

    /* renamed from: id */
    private final int f85182id;
    @SerializedName("nameEN")
    @NotNull
    private final String nameEN;
    @SerializedName("nameTH")
    @NotNull
    private final String nameTH;

    public RtrProfileProvince(int i, @NotNull String nameTH, @NotNull String nameEN) {
        Intrinsics.checkNotNullParameter(nameTH, "nameTH");
        Intrinsics.checkNotNullParameter(nameEN, "nameEN");
        this.f85182id = i;
        this.nameTH = nameTH;
        this.nameEN = nameEN;
    }

    public final int getId() {
        return this.f85182id;
    }

    @NotNull
    public final String getNameEN() {
        return this.nameEN;
    }

    @NotNull
    public final String getNameTH() {
        return this.nameTH;
    }
}