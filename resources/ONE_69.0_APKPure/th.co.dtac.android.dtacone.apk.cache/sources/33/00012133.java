package th.p047co.dtac.android.dtacone.presenter;

import com.google.android.gms.analytics.ecommerce.Promotion;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(m29143d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001:\u0001\u0006J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0007"}, m29142d2 = {"Lth/co/dtac/android/dtacone/presenter/IViewModel;", "", "attachView", "", Promotion.ACTION_VIEW, "Lth/co/dtac/android/dtacone/presenter/IViewModel$IView;", "IView", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.presenter.IViewModel */
/* loaded from: classes8.dex */
public interface IViewModel {

    @Metadata(m29143d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m29142d2 = {"Lth/co/dtac/android/dtacone/presenter/IViewModel$IView;", "", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0}, m29138xi = 48)
    /* renamed from: th.co.dtac.android.dtacone.presenter.IViewModel$IView */
    /* loaded from: classes8.dex */
    public interface IView {
    }

    void attachView(@NotNull IView iView);
}