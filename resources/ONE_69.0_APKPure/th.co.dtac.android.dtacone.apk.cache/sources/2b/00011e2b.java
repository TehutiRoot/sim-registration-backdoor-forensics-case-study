package th.p047co.dtac.android.dtacone.model.device_sale;

import androidx.compose.runtime.internal.StabilityInferred;
import com.google.gson.annotations.SerializedName;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 0)
@Metadata(m29143d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0015\u0012\u000e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0005J\u0011\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0003J\u001b\u0010\t\u001a\u00020\u00002\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u001e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, m29142d2 = {"Lth/co/dtac/android/dtacone/model/device_sale/GetInputFieldResponse;", "", "fields", "", "Lth/co/dtac/android/dtacone/model/device_sale/InputField;", "(Ljava/util/List;)V", "getFields", "()Ljava/util/List;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.model.device_sale.GetInputFieldResponse */
/* loaded from: classes8.dex */
public final class GetInputFieldResponse {
    public static final int $stable = 8;
    @SerializedName("fields")
    @Nullable
    private final List<InputField> fields;

    public GetInputFieldResponse(@Nullable List<InputField> list) {
        this.fields = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ GetInputFieldResponse copy$default(GetInputFieldResponse getInputFieldResponse, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            list = getInputFieldResponse.fields;
        }
        return getInputFieldResponse.copy(list);
    }

    @Nullable
    public final List<InputField> component1() {
        return this.fields;
    }

    @NotNull
    public final GetInputFieldResponse copy(@Nullable List<InputField> list) {
        return new GetInputFieldResponse(list);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof GetInputFieldResponse) && Intrinsics.areEqual(this.fields, ((GetInputFieldResponse) obj).fields);
    }

    @Nullable
    public final List<InputField> getFields() {
        return this.fields;
    }

    public int hashCode() {
        List<InputField> list = this.fields;
        if (list == null) {
            return 0;
        }
        return list.hashCode();
    }

    @NotNull
    public String toString() {
        List<InputField> list = this.fields;
        return "GetInputFieldResponse(fields=" + list + ")";
    }
}