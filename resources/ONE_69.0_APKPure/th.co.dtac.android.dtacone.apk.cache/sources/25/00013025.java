package th.p047co.dtac.android.dtacone.view.appOne.eSign.response;

import androidx.compose.runtime.internal.StabilityInferred;
import com.google.gson.annotations.SerializedName;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 0)
@Metadata(m29143d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000e\u0010\tJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0013\u001a\u00020\u00042\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u000b¨\u0006\u001b"}, m29142d2 = {"Lth/co/dtac/android/dtacone/view/appOne/eSign/response/BooleanCharacteristic;", "", "", "name", "", "value", "<init>", "(Ljava/lang/String;Z)V", "component1", "()Ljava/lang/String;", "component2", "()Z", "copy", "(Ljava/lang/String;Z)Lth/co/dtac/android/dtacone/view/appOne/eSign/response/BooleanCharacteristic;", "toString", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", PDPageLabelRange.STYLE_LETTERS_LOWER, "Ljava/lang/String;", "getName", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "Z", "getValue", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0})
/* renamed from: th.co.dtac.android.dtacone.view.appOne.eSign.response.BooleanCharacteristic */
/* loaded from: classes10.dex */
public final class BooleanCharacteristic {
    public static final int $stable = 0;
    @SerializedName("name")
    @NotNull

    /* renamed from: a */
    private final String f90814a;
    @SerializedName("value")

    /* renamed from: b */
    private final boolean f90815b;

    public BooleanCharacteristic() {
        this(null, false, 3, null);
    }

    public static /* synthetic */ BooleanCharacteristic copy$default(BooleanCharacteristic booleanCharacteristic, String str, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            str = booleanCharacteristic.f90814a;
        }
        if ((i & 2) != 0) {
            z = booleanCharacteristic.f90815b;
        }
        return booleanCharacteristic.copy(str, z);
    }

    @NotNull
    public final String component1() {
        return this.f90814a;
    }

    public final boolean component2() {
        return this.f90815b;
    }

    @NotNull
    public final BooleanCharacteristic copy(@NotNull String name, boolean z) {
        Intrinsics.checkNotNullParameter(name, "name");
        return new BooleanCharacteristic(name, z);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof BooleanCharacteristic) {
            BooleanCharacteristic booleanCharacteristic = (BooleanCharacteristic) obj;
            return Intrinsics.areEqual(this.f90814a, booleanCharacteristic.f90814a) && this.f90815b == booleanCharacteristic.f90815b;
        }
        return false;
    }

    @NotNull
    public final String getName() {
        return this.f90814a;
    }

    public final boolean getValue() {
        return this.f90815b;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode = this.f90814a.hashCode() * 31;
        boolean z = this.f90815b;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        return hashCode + i;
    }

    @NotNull
    public String toString() {
        String str = this.f90814a;
        boolean z = this.f90815b;
        return "BooleanCharacteristic(name=" + str + ", value=" + z + ")";
    }

    public BooleanCharacteristic(@NotNull String name, boolean z) {
        Intrinsics.checkNotNullParameter(name, "name");
        this.f90814a = name;
        this.f90815b = z;
    }

    public /* synthetic */ BooleanCharacteristic(String str, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? false : z);
    }
}