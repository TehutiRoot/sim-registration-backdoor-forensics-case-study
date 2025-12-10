package th.p047co.dtac.android.dtacone.model.appOne.pre2post.response;

import androidx.compose.runtime.internal.StabilityInferred;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 0)
@Metadata(m29143d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0011\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m29142d2 = {"Lth/co/dtac/android/dtacone/model/appOne/pre2post/response/OnePre2PostSubscribeNumberResponse;", "", "data", "Lth/co/dtac/android/dtacone/model/appOne/pre2post/response/OnePre2PostSubscribeNumberDataResponse;", "(Lth/co/dtac/android/dtacone/model/appOne/pre2post/response/OnePre2PostSubscribeNumberDataResponse;)V", "getData", "()Lth/co/dtac/android/dtacone/model/appOne/pre2post/response/OnePre2PostSubscribeNumberDataResponse;", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.model.appOne.pre2post.response.OnePre2PostSubscribeNumberResponse */
/* loaded from: classes8.dex */
public final class OnePre2PostSubscribeNumberResponse {
    public static final int $stable = 0;
    @SerializedName("data")
    @Nullable
    private final OnePre2PostSubscribeNumberDataResponse data;

    public OnePre2PostSubscribeNumberResponse() {
        this(null, 1, null);
    }

    @Nullable
    public final OnePre2PostSubscribeNumberDataResponse getData() {
        return this.data;
    }

    public OnePre2PostSubscribeNumberResponse(@Nullable OnePre2PostSubscribeNumberDataResponse onePre2PostSubscribeNumberDataResponse) {
        this.data = onePre2PostSubscribeNumberDataResponse;
    }

    public /* synthetic */ OnePre2PostSubscribeNumberResponse(OnePre2PostSubscribeNumberDataResponse onePre2PostSubscribeNumberDataResponse, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : onePre2PostSubscribeNumberDataResponse);
    }
}