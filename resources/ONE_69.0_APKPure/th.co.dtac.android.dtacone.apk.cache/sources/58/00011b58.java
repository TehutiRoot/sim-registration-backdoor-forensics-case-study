package th.p047co.dtac.android.dtacone.model.appOne.postpaid.saveOrder.request;

import androidx.compose.runtime.internal.StabilityInferred;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 0)
@Metadata(m29143d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004J\u000b\u0010\u0007\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\b\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\f\u001a\u00020\rHÖ\u0001J\t\u0010\u000e\u001a\u00020\u0003HÖ\u0001R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u000f"}, m29142d2 = {"Lth/co/dtac/android/dtacone/model/appOne/postpaid/saveOrder/request/OnePostPaidOrderDataContent;", "", "readCardPhoto", "", "(Ljava/lang/String;)V", "getReadCardPhoto", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.model.appOne.postpaid.saveOrder.request.OnePostPaidOrderDataContent */
/* loaded from: classes8.dex */
public final class OnePostPaidOrderDataContent {
    public static final int $stable = 0;
    @SerializedName("readCardPhoto")
    @Nullable
    private final String readCardPhoto;

    public OnePostPaidOrderDataContent() {
        this(null, 1, null);
    }

    public static /* synthetic */ OnePostPaidOrderDataContent copy$default(OnePostPaidOrderDataContent onePostPaidOrderDataContent, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = onePostPaidOrderDataContent.readCardPhoto;
        }
        return onePostPaidOrderDataContent.copy(str);
    }

    @Nullable
    public final String component1() {
        return this.readCardPhoto;
    }

    @NotNull
    public final OnePostPaidOrderDataContent copy(@Nullable String str) {
        return new OnePostPaidOrderDataContent(str);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof OnePostPaidOrderDataContent) && Intrinsics.areEqual(this.readCardPhoto, ((OnePostPaidOrderDataContent) obj).readCardPhoto);
    }

    @Nullable
    public final String getReadCardPhoto() {
        return this.readCardPhoto;
    }

    public int hashCode() {
        String str = this.readCardPhoto;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    @NotNull
    public String toString() {
        String str = this.readCardPhoto;
        return "OnePostPaidOrderDataContent(readCardPhoto=" + str + ")";
    }

    public OnePostPaidOrderDataContent(@Nullable String str) {
        this.readCardPhoto = str;
    }

    public /* synthetic */ OnePostPaidOrderDataContent(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str);
    }
}