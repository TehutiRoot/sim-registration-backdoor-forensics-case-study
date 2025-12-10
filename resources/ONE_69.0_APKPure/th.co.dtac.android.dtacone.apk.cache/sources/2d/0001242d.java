package th.p047co.dtac.android.dtacone.presenter.password;

import io.reactivex.ObservableSource;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import th.p047co.dtac.android.dtacone.model.PasswordRequest;
import th.p047co.dtac.android.dtacone.model.status.StatusResponse;

@Metadata(m29143d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a*\u0012\u000e\b\u0001\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002 \u0003*\u0014\u0012\u000e\b\u0001\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002\u0018\u00010\u00010\u00012\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, m29142d2 = {"<anonymous>", "Lio/reactivex/ObservableSource;", "Lth/co/dtac/android/dtacone/model/status/StatusResponse;", "kotlin.jvm.PlatformType", "it", "Lth/co/dtac/android/dtacone/model/PasswordRequest;", "invoke"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.presenter.password.VerifyPasswordPresenter$verifyPasswordObservable$2 */
/* loaded from: classes8.dex */
public final class VerifyPasswordPresenter$verifyPasswordObservable$2 extends Lambda implements Function1<PasswordRequest, ObservableSource<? extends StatusResponse>> {
    final /* synthetic */ PasswordRequest $password;
    final /* synthetic */ VerifyPasswordPresenter this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VerifyPasswordPresenter$verifyPasswordObservable$2(VerifyPasswordPresenter verifyPasswordPresenter, PasswordRequest passwordRequest) {
        super(1);
        this.this$0 = verifyPasswordPresenter;
        this.$password = passwordRequest;
    }

    @Override // kotlin.jvm.functions.Function1
    public final ObservableSource<? extends StatusResponse> invoke(@NotNull PasswordRequest it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return this.this$0.getApi().verifyPassword(this.$password);
    }
}