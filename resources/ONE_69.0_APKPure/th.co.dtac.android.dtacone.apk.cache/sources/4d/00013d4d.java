package th.p047co.dtac.android.dtacone.view.appOne.rectify.viewmodel;

import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import th.p047co.dtac.android.dtacone.app_one.model.rectify.OneRectifyListResponse;

@Metadata(m29143d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a*\u0012\u000e\b\u0001\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002 \u0003*\u0014\u0012\u000e\b\u0001\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002\u0018\u00010\u00010\u00012\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, m29142d2 = {"<anonymous>", "Lio/reactivex/ObservableSource;", "Lth/co/dtac/android/dtacone/app_one/model/rectify/OneRectifyListResponse$DataItem$RectifyItem;", "kotlin.jvm.PlatformType", "it", "Lth/co/dtac/android/dtacone/app_one/model/rectify/OneRectifyListResponse;", "invoke"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.view.appOne.rectify.viewmodel.OneRectifyViewModel$getRectifyList$2 */
/* loaded from: classes10.dex */
public final class OneRectifyViewModel$getRectifyList$2 extends Lambda implements Function1<OneRectifyListResponse, ObservableSource<? extends OneRectifyListResponse.DataItem.RectifyItem>> {
    public static final OneRectifyViewModel$getRectifyList$2 INSTANCE = new OneRectifyViewModel$getRectifyList$2();

    public OneRectifyViewModel$getRectifyList$2() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final ObservableSource<? extends OneRectifyListResponse.DataItem.RectifyItem> invoke(@NotNull OneRectifyListResponse it) {
        List<OneRectifyListResponse.DataItem.RectifyItem> emptyList;
        Intrinsics.checkNotNullParameter(it, "it");
        OneRectifyListResponse.DataItem data = it.getData();
        if (data == null || (emptyList = data.getRectifyList()) == null) {
            emptyList = CollectionsKt__CollectionsKt.emptyList();
        }
        return Observable.fromIterable(emptyList);
    }
}