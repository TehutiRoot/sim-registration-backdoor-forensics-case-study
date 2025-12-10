package th.p047co.dtac.android.dtacone.view.appOne.notification.repository;

import androidx.compose.runtime.internal.StabilityInferred;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import io.reactivex.Observable;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import th.p047co.dtac.android.dtacone.app_one.model.newsFeed.OneNewsNotificationResponse;
import th.p047co.dtac.android.dtacone.data.remote.RTRApiRx2;

@StabilityInferred(parameters = 0)
@Metadata(m29143d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001d\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\n\u0010\u000bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\r¨\u0006\u000e"}, m29142d2 = {"Lth/co/dtac/android/dtacone/view/appOne/notification/repository/OneNewsNotificationRepositoryImpl;", "Lth/co/dtac/android/dtacone/view/appOne/notification/repository/OneNewsNotificationRepository;", "Lth/co/dtac/android/dtacone/data/remote/RTRApiRx2;", "api", "<init>", "(Lth/co/dtac/android/dtacone/data/remote/RTRApiRx2;)V", "", "newsId", "Lio/reactivex/Observable;", "Lth/co/dtac/android/dtacone/app_one/model/newsFeed/OneNewsNotificationResponse;", "oneNewsDetail", "(I)Lio/reactivex/Observable;", PDPageLabelRange.STYLE_LETTERS_LOWER, "Lth/co/dtac/android/dtacone/data/remote/RTRApiRx2;", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0})
/* renamed from: th.co.dtac.android.dtacone.view.appOne.notification.repository.OneNewsNotificationRepositoryImpl */
/* loaded from: classes10.dex */
public final class OneNewsNotificationRepositoryImpl implements OneNewsNotificationRepository {
    public static final int $stable = 8;

    /* renamed from: a */
    public final RTRApiRx2 f92467a;

    @Inject
    public OneNewsNotificationRepositoryImpl(@NotNull RTRApiRx2 api) {
        Intrinsics.checkNotNullParameter(api, "api");
        this.f92467a = api;
    }

    @Override // th.p047co.dtac.android.dtacone.view.appOne.notification.repository.OneNewsNotificationRepository
    @NotNull
    public Observable<OneNewsNotificationResponse> oneNewsDetail(int i) {
        return this.f92467a.oneNewsDetail(i);
    }
}