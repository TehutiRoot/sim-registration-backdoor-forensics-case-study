package th.p047co.dtac.android.dtacone.view.appOne.rectify.viewmodel;

import io.reactivex.observables.GroupedObservable;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import th.p047co.dtac.android.dtacone.app_one.model.rectify.OneRectifyListResponse;

@Metadata(m29143d1 = {"\u0000(\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0000\u0010\u0000\u001a,\u0012\u0004\u0012\u00020\u0002 \u0004*\u0016\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0001j\n\u0012\u0004\u0012\u00020\u0002\u0018\u0001`\u00030\u0001j\b\u0012\u0004\u0012\u00020\u0002`\u00032\u0099\u0001\u0010\u0005\u001a\u0094\u0001\u0012D\u0012B\u0012\f\u0012\n \u0004*\u0004\u0018\u00010\b0\b\u0012\f\u0012\n \u0004*\u0004\u0018\u00010\t0\t \u0004* \u0012\f\u0012\n \u0004*\u0004\u0018\u00010\b0\b\u0012\f\u0012\n \u0004*\u0004\u0018\u00010\t0\t\u0018\u00010\u00070\u0007 \u0004*H\u0012D\u0012B\u0012\f\u0012\n \u0004*\u0004\u0018\u00010\b0\b\u0012\f\u0012\n \u0004*\u0004\u0018\u00010\t0\t \u0004* \u0012\f\u0012\n \u0004*\u0004\u0018\u00010\b0\b\u0012\f\u0012\n \u0004*\u0004\u0018\u00010\t0\t\u0018\u00010\u00070\u00070\n0\u0006H\n¢\u0006\u0002\b\u000b"}, m29142d2 = {"<anonymous>", "Ljava/util/ArrayList;", "", "Lkotlin/collections/ArrayList;", "kotlin.jvm.PlatformType", "groups", "", "Lio/reactivex/observables/GroupedObservable;", "", "Lth/co/dtac/android/dtacone/app_one/model/rectify/OneRectifyListResponse$DataItem$RectifyItem;", "", "invoke"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.view.appOne.rectify.viewmodel.OneRectifyViewModel$getRectifyList$4 */
/* loaded from: classes10.dex */
public final class OneRectifyViewModel$getRectifyList$4 extends Lambda implements Function1<List<GroupedObservable<String, OneRectifyListResponse.DataItem.RectifyItem>>, ArrayList<Object>> {
    public static final OneRectifyViewModel$getRectifyList$4 INSTANCE = new OneRectifyViewModel$getRectifyList$4();

    public OneRectifyViewModel$getRectifyList$4() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final ArrayList<Object> invoke(@NotNull List<GroupedObservable<String, OneRectifyListResponse.DataItem.RectifyItem>> groups) {
        Intrinsics.checkNotNullParameter(groups, "groups");
        ArrayList<Object> arrayList = new ArrayList<>();
        for (GroupedObservable<String, OneRectifyListResponse.DataItem.RectifyItem> groupedObservable : groups) {
            String key = groupedObservable.getKey();
            Intrinsics.checkNotNull(key);
            arrayList.add(key);
            arrayList.addAll(groupedObservable.toList().blockingGet());
        }
        return arrayList;
    }
}