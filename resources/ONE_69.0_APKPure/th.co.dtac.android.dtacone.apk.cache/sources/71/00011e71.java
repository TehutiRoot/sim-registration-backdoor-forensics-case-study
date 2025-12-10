package th.p047co.dtac.android.dtacone.model.esim;

import androidx.compose.runtime.internal.StabilityInferred;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 0)
@Metadata(m29143d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004J\u0010\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0006J\u001a\u0010\t\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010\nJ\u0013\u0010\u000b\u001a\u00020\u00032\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u001a\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0011"}, m29142d2 = {"Lth/co/dtac/android/dtacone/model/esim/SendSaleTransToRichPOSResponse;", "", "result", "", "(Ljava/lang/Boolean;)V", "getResult", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "component1", "copy", "(Ljava/lang/Boolean;)Lth/co/dtac/android/dtacone/model/esim/SendSaleTransToRichPOSResponse;", "equals", "other", "hashCode", "", "toString", "", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.model.esim.SendSaleTransToRichPOSResponse */
/* loaded from: classes8.dex */
public final class SendSaleTransToRichPOSResponse {
    public static final int $stable = 0;
    @SerializedName("result")
    @Nullable
    private final Boolean result;

    public SendSaleTransToRichPOSResponse() {
        this(null, 1, null);
    }

    public static /* synthetic */ SendSaleTransToRichPOSResponse copy$default(SendSaleTransToRichPOSResponse sendSaleTransToRichPOSResponse, Boolean bool, int i, Object obj) {
        if ((i & 1) != 0) {
            bool = sendSaleTransToRichPOSResponse.result;
        }
        return sendSaleTransToRichPOSResponse.copy(bool);
    }

    @Nullable
    public final Boolean component1() {
        return this.result;
    }

    @NotNull
    public final SendSaleTransToRichPOSResponse copy(@Nullable Boolean bool) {
        return new SendSaleTransToRichPOSResponse(bool);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof SendSaleTransToRichPOSResponse) && Intrinsics.areEqual(this.result, ((SendSaleTransToRichPOSResponse) obj).result);
    }

    @Nullable
    public final Boolean getResult() {
        return this.result;
    }

    public int hashCode() {
        Boolean bool = this.result;
        if (bool == null) {
            return 0;
        }
        return bool.hashCode();
    }

    @NotNull
    public String toString() {
        Boolean bool = this.result;
        return "SendSaleTransToRichPOSResponse(result=" + bool + ")";
    }

    public SendSaleTransToRichPOSResponse(@Nullable Boolean bool) {
        this.result = bool;
    }

    public /* synthetic */ SendSaleTransToRichPOSResponse(Boolean bool, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : bool);
    }
}