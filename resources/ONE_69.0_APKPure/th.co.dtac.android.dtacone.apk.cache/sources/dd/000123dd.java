package th.p047co.dtac.android.dtacone.presenter.login;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import p046rx.Observable;
import th.p047co.dtac.android.dtacone.data.cache.realm.RtrRepository;

@Metadata(m29143d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0000\u0010\u0000\u001a*\u0012\u000e\b\u0001\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002 \u0003*\u0014\u0012\u000e\b\u0001\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002\u0018\u00010\u00010\u00012\u000e\u0010\u0004\u001a\n \u0003*\u0004\u0018\u00010\u00050\u0005H\n¢\u0006\u0002\b\u0006"}, m29142d2 = {"<anonymous>", "Lrx/Observable;", "", "kotlin.jvm.PlatformType", "it", "", "invoke"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.presenter.login.LogoutPresenter$logout$1 */
/* loaded from: classes8.dex */
public final class LogoutPresenter$logout$1 extends Lambda implements Function1<Throwable, Observable<? extends Object>> {
    final /* synthetic */ LogoutPresenter this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LogoutPresenter$logout$1(LogoutPresenter logoutPresenter) {
        super(1);
        this.this$0 = logoutPresenter;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Observable<? extends Object> invoke(Throwable th2) {
        RtrRepository rtrRepository;
        rtrRepository = this.this$0.f85941c;
        return rtrRepository.deleteAllCache();
    }
}