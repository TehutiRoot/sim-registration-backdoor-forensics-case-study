package th.p047co.dtac.android.dtacone.model.otp.request;

import androidx.compose.runtime.internal.StabilityInferred;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 0)
@Metadata(m29143d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0005J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J!\u0010\r\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0003HÖ\u0001R\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R \u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\u0007\"\u0004\b\t\u0010\n¨\u0006\u0014"}, m29142d2 = {"Lth/co/dtac/android/dtacone/model/otp/request/RequestOtpBody;", "", "mobileNumber", "", "event", "(Ljava/lang/String;Ljava/lang/String;)V", "getEvent", "()Ljava/lang/String;", "getMobileNumber", "setMobileNumber", "(Ljava/lang/String;)V", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.model.otp.request.RequestOtpBody */
/* loaded from: classes8.dex */
public final class RequestOtpBody {
    public static final int $stable = 8;
    @SerializedName("event")
    @Nullable
    private final String event;
    @SerializedName("mobileNumber")
    @Nullable
    private String mobileNumber;

    public RequestOtpBody() {
        this(null, null, 3, null);
    }

    public static /* synthetic */ RequestOtpBody copy$default(RequestOtpBody requestOtpBody, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = requestOtpBody.mobileNumber;
        }
        if ((i & 2) != 0) {
            str2 = requestOtpBody.event;
        }
        return requestOtpBody.copy(str, str2);
    }

    @Nullable
    public final String component1() {
        return this.mobileNumber;
    }

    @Nullable
    public final String component2() {
        return this.event;
    }

    @NotNull
    public final RequestOtpBody copy(@Nullable String str, @Nullable String str2) {
        return new RequestOtpBody(str, str2);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof RequestOtpBody) {
            RequestOtpBody requestOtpBody = (RequestOtpBody) obj;
            return Intrinsics.areEqual(this.mobileNumber, requestOtpBody.mobileNumber) && Intrinsics.areEqual(this.event, requestOtpBody.event);
        }
        return false;
    }

    @Nullable
    public final String getEvent() {
        return this.event;
    }

    @Nullable
    public final String getMobileNumber() {
        return this.mobileNumber;
    }

    public int hashCode() {
        String str = this.mobileNumber;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.event;
        return hashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final void setMobileNumber(@Nullable String str) {
        this.mobileNumber = str;
    }

    @NotNull
    public String toString() {
        String str = this.mobileNumber;
        String str2 = this.event;
        return "RequestOtpBody(mobileNumber=" + str + ", event=" + str2 + ")";
    }

    public RequestOtpBody(@Nullable String str, @Nullable String str2) {
        this.mobileNumber = str;
        this.event = str2;
    }

    public /* synthetic */ RequestOtpBody(String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2);
    }
}