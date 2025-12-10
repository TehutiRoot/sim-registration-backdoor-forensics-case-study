package th.p047co.dtac.android.dtacone.model.postpaid.save_postpaid;

import androidx.compose.runtime.internal.StabilityInferred;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 0)
@Metadata(m29143d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0011\b\u0007\u0018\u00002\u00020\u0001BU\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\r\u001a\u00020\u0006¢\u0006\u0002\u0010\u000eR\u001a\u0010\b\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u0011\u001a\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0016\u0010\r\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0016\u0010\n\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0018\u0010\f\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0015R\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0015R\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0015R\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0013¨\u0006\u001c"}, m29142d2 = {"Lth/co/dtac/android/dtacone/model/postpaid/save_postpaid/SaveFaceRecognition;", "", "confidence", "", "threshold", "nbtcStatusCode", "", "nbtcResponseMessage", "attempted", "", "knowYourCustomer", "", "laseId", "customerPhotoName", "(FFLjava/lang/String;Ljava/lang/String;Ljava/lang/Integer;ZLjava/lang/String;Ljava/lang/String;)V", "getAttempted", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getConfidence", "()F", "getCustomerPhotoName", "()Ljava/lang/String;", "getKnowYourCustomer", "()Z", "getLaseId", "getNbtcResponseMessage", "getNbtcStatusCode", "getThreshold", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.model.postpaid.save_postpaid.SaveFaceRecognition */
/* loaded from: classes8.dex */
public final class SaveFaceRecognition {
    public static final int $stable = 0;
    @SerializedName("attempted")
    @Nullable
    private final Integer attempted;
    @SerializedName("confidence")
    private final float confidence;
    @SerializedName("customerPhoto")
    @NotNull
    private final String customerPhotoName;
    @SerializedName("knowYourCustomer")
    private final boolean knowYourCustomer;
    @SerializedName("laserId")
    @Nullable
    private final String laseId;
    @SerializedName("nbtcResponseMessage")
    @Nullable
    private final String nbtcResponseMessage;
    @SerializedName("nbtcStatusCode")
    @Nullable
    private final String nbtcStatusCode;
    @SerializedName("threshold")
    private final float threshold;

    public SaveFaceRecognition(float f, float f2, @Nullable String str, @Nullable String str2, @Nullable Integer num, boolean z, @Nullable String str3, @NotNull String customerPhotoName) {
        Intrinsics.checkNotNullParameter(customerPhotoName, "customerPhotoName");
        this.confidence = f;
        this.threshold = f2;
        this.nbtcStatusCode = str;
        this.nbtcResponseMessage = str2;
        this.attempted = num;
        this.knowYourCustomer = z;
        this.laseId = str3;
        this.customerPhotoName = customerPhotoName;
    }

    @Nullable
    public final Integer getAttempted() {
        return this.attempted;
    }

    public final float getConfidence() {
        return this.confidence;
    }

    @NotNull
    public final String getCustomerPhotoName() {
        return this.customerPhotoName;
    }

    public final boolean getKnowYourCustomer() {
        return this.knowYourCustomer;
    }

    @Nullable
    public final String getLaseId() {
        return this.laseId;
    }

    @Nullable
    public final String getNbtcResponseMessage() {
        return this.nbtcResponseMessage;
    }

    @Nullable
    public final String getNbtcStatusCode() {
        return this.nbtcStatusCode;
    }

    public final float getThreshold() {
        return this.threshold;
    }

    public /* synthetic */ SaveFaceRecognition(float f, float f2, String str, String str2, Integer num, boolean z, String str3, String str4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(f, f2, (i & 4) != 0 ? "" : str, (i & 8) != 0 ? "" : str2, (i & 16) != 0 ? 0 : num, z, (i & 64) != 0 ? null : str3, str4);
    }
}