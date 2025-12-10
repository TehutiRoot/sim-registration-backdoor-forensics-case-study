package th.p047co.dtac.android.dtacone.model.device_sale;

import androidx.compose.runtime.internal.StabilityInferred;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 0)
@Metadata(m29143d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\t\u0010\t\u001a\u00020\u0003HÆ\u0003J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u0012"}, m29142d2 = {"Lth/co/dtac/android/dtacone/model/device_sale/FieldInput;", "", "inputFieldId", "", "inputFieldValue", "(Ljava/lang/String;Ljava/lang/String;)V", "getInputFieldId", "()Ljava/lang/String;", "getInputFieldValue", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.model.device_sale.FieldInput */
/* loaded from: classes8.dex */
public final class FieldInput {
    public static final int $stable = 0;
    @SerializedName("inputFieldId")
    @NotNull
    private final String inputFieldId;
    @SerializedName("inputFieldValue")
    @NotNull
    private final String inputFieldValue;

    public FieldInput(@NotNull String inputFieldId, @NotNull String inputFieldValue) {
        Intrinsics.checkNotNullParameter(inputFieldId, "inputFieldId");
        Intrinsics.checkNotNullParameter(inputFieldValue, "inputFieldValue");
        this.inputFieldId = inputFieldId;
        this.inputFieldValue = inputFieldValue;
    }

    public static /* synthetic */ FieldInput copy$default(FieldInput fieldInput, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = fieldInput.inputFieldId;
        }
        if ((i & 2) != 0) {
            str2 = fieldInput.inputFieldValue;
        }
        return fieldInput.copy(str, str2);
    }

    @NotNull
    public final String component1() {
        return this.inputFieldId;
    }

    @NotNull
    public final String component2() {
        return this.inputFieldValue;
    }

    @NotNull
    public final FieldInput copy(@NotNull String inputFieldId, @NotNull String inputFieldValue) {
        Intrinsics.checkNotNullParameter(inputFieldId, "inputFieldId");
        Intrinsics.checkNotNullParameter(inputFieldValue, "inputFieldValue");
        return new FieldInput(inputFieldId, inputFieldValue);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof FieldInput) {
            FieldInput fieldInput = (FieldInput) obj;
            return Intrinsics.areEqual(this.inputFieldId, fieldInput.inputFieldId) && Intrinsics.areEqual(this.inputFieldValue, fieldInput.inputFieldValue);
        }
        return false;
    }

    @NotNull
    public final String getInputFieldId() {
        return this.inputFieldId;
    }

    @NotNull
    public final String getInputFieldValue() {
        return this.inputFieldValue;
    }

    public int hashCode() {
        return (this.inputFieldId.hashCode() * 31) + this.inputFieldValue.hashCode();
    }

    @NotNull
    public String toString() {
        String str = this.inputFieldId;
        String str2 = this.inputFieldValue;
        return "FieldInput(inputFieldId=" + str + ", inputFieldValue=" + str2 + ")";
    }
}