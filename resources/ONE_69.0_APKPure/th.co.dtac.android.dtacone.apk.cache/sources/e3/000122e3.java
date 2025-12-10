package th.p047co.dtac.android.dtacone.presenter.change_sim;

import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

@Metadata(m29143d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\u0010\u0000\u001a\u0012\u0012\u0002\b\u0003 \u0002*\b\u0012\u0002\b\u0003\u0018\u00010\u00010\u00012\u0014\u0010\u0003\u001a\u0010\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00050\u00050\u0004H\n¢\u0006\u0002\b\u0006"}, m29142d2 = {"<anonymous>", "Lio/reactivex/ObservableSource;", "kotlin.jvm.PlatformType", "completed", "Lio/reactivex/Observable;", "", "invoke"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.presenter.change_sim.ChangeSimVerifyWriteSimPresenter$pollingVerifyFromServer$1 */
/* loaded from: classes8.dex */
public final class ChangeSimVerifyWriteSimPresenter$pollingVerifyFromServer$1 extends Lambda implements Function1<Observable<Throwable>, ObservableSource<?>> {
    public static final ChangeSimVerifyWriteSimPresenter$pollingVerifyFromServer$1 INSTANCE = new ChangeSimVerifyWriteSimPresenter$pollingVerifyFromServer$1();

    public ChangeSimVerifyWriteSimPresenter$pollingVerifyFromServer$1() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final ObservableSource<?> invoke(@NotNull Observable<Throwable> completed) {
        Intrinsics.checkNotNullParameter(completed, "completed");
        return completed.delay(10L, TimeUnit.SECONDS);
    }
}