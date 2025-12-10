package th.p047co.dtac.android.dtacone.manager.service;

import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.Nullable;

@Metadata(m29143d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0000\u0010\u0000\u001a*\u0012\u000e\b\u0001\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002 \u0003*\u0014\u0012\u000e\b\u0001\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002\u0018\u00010\u00010\u00012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\n¢\u0006\u0002\b\u0006"}, m29142d2 = {"<anonymous>", "Lio/reactivex/ObservableSource;", "", "kotlin.jvm.PlatformType", "t", "", "invoke"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.manager.service.OneErrorService$defaultHandleException$1 */
/* loaded from: classes7.dex */
public final class OneErrorService$defaultHandleException$1 extends Lambda implements Function1<Throwable, ObservableSource<? extends Boolean>> {
    public static final OneErrorService$defaultHandleException$1 INSTANCE = new OneErrorService$defaultHandleException$1();

    public OneErrorService$defaultHandleException$1() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final ObservableSource<? extends Boolean> invoke(@Nullable Throwable th2) {
        return Observable.just(Boolean.TRUE);
    }
}