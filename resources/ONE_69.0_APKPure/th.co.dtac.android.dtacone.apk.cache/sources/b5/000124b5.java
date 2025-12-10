package th.p047co.dtac.android.dtacone.presenter.rectify;

import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import p046rx.observables.GroupedObservable;
import th.p047co.dtac.android.dtacone.model.rectify.RectifyListCollection;

@Metadata(m29143d1 = {"\u0000$\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0000\u0010\u0000\u001a\u0016\u0012\u0004\u0012\u00020\u0002 \u0003*\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00010\u00012\u009b\u0001\u0010\u0004\u001a\u0096\u0001\u0012D\u0012B\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00070\u0007\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\b0\b \u0003* \u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00070\u0007\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\b0\b\u0018\u00010\u00060\u0006 \u0003*J\u0012D\u0012B\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00070\u0007\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\b0\b \u0003* \u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00070\u0007\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\b0\b\u0018\u00010\u00060\u0006\u0018\u00010\t0\u0005H\n¢\u0006\u0002\b\n"}, m29142d2 = {"<anonymous>", "Ljava/util/ArrayList;", "", "kotlin.jvm.PlatformType", "groups", "", "Lrx/observables/GroupedObservable;", "", "Lth/co/dtac/android/dtacone/model/rectify/RectifyListCollection;", "", "invoke"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.presenter.rectify.RectifyListPresenterKt$getRectifyList$6 */
/* loaded from: classes8.dex */
public final class RectifyListPresenterKt$getRectifyList$6 extends Lambda implements Function1<List<GroupedObservable<String, RectifyListCollection>>, ArrayList<Object>> {
    public static final RectifyListPresenterKt$getRectifyList$6 INSTANCE = new RectifyListPresenterKt$getRectifyList$6();

    public RectifyListPresenterKt$getRectifyList$6() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final ArrayList<Object> invoke(List<GroupedObservable<String, RectifyListCollection>> list) {
        ArrayList<Object> arrayList = new ArrayList<>();
        for (GroupedObservable<String, RectifyListCollection> groupedObservable : list) {
            arrayList.add(groupedObservable.getKey());
            arrayList.addAll(groupedObservable.toList().toBlocking().single());
        }
        return arrayList;
    }
}