package th.p047co.dtac.android.dtacone.model.appOne.mnp.request;

import androidx.compose.runtime.internal.StabilityInferred;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 0)
@Metadata(m28851d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0005J\u000b\u0010\t\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\n\u001a\u0004\u0018\u00010\u0003HÆ\u0003J!\u0010\u000b\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0003HÖ\u0001R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u0012"}, m28850d2 = {"Lth/co/dtac/android/dtacone/model/appOne/mnp/request/ParamsItem;", "", "paramName", "", "paramValue", "(Ljava/lang/String;Ljava/lang/String;)V", "getParamName", "()Ljava/lang/String;", "getParamValue", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "app_prodRelease"}, m28849k = 1, m28848mv = {1, 8, 0}, m28846xi = 48)
/* renamed from: th.co.dtac.android.dtacone.model.appOne.mnp.request.ParamsItem */
/* loaded from: classes8.dex */
public final class ParamsItem {
    public static final int $stable = 0;
    @SerializedName("paramName")
    @Nullable
    private final String paramName;
    @SerializedName("paramValue")
    @Nullable
    private final String paramValue;

    public ParamsItem() {
        this(null, null, 3, null);
    }

    public static /* synthetic */ ParamsItem copy$default(ParamsItem paramsItem, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = paramsItem.paramName;
        }
        if ((i & 2) != 0) {
            str2 = paramsItem.paramValue;
        }
        return paramsItem.copy(str, str2);
    }

    @Nullable
    public final String component1() {
        return this.paramName;
    }

    @Nullable
    public final String component2() {
        return this.paramValue;
    }

    @NotNull
    public final ParamsItem copy(@Nullable String str, @Nullable String str2) {
        return new ParamsItem(str, str2);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ParamsItem) {
            ParamsItem paramsItem = (ParamsItem) obj;
            return Intrinsics.areEqual(this.paramName, paramsItem.paramName) && Intrinsics.areEqual(this.paramValue, paramsItem.paramValue);
        }
        return false;
    }

    @Nullable
    public final String getParamName() {
        return this.paramName;
    }

    @Nullable
    public final String getParamValue() {
        return this.paramValue;
    }

    public int hashCode() {
        String str = this.paramName;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.paramValue;
        return hashCode + (str2 != null ? str2.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        String str = this.paramName;
        String str2 = this.paramValue;
        return "ParamsItem(paramName=" + str + ", paramValue=" + str2 + ")";
    }

    public ParamsItem(@Nullable String str, @Nullable String str2) {
        this.paramName = str;
        this.paramValue = str2;
    }

    public /* synthetic */ ParamsItem(String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2);
    }
}
