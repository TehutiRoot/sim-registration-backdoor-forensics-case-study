package th.p047co.dtac.android.dtacone.view.appOne.rectify.viewmodel;

import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import th.p047co.dtac.android.dtacone.app_one.model.rectify.OneRectifyListResponse;
import th.p047co.dtac.android.dtacone.view.activity.customerenquiry.CustomerEnquiryActivity;
import th.p047co.dtac.android.dtacone.view.appOne.rectify.repository.OneRectifyRepository;

@Metadata(m29143d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a,\u0012\u0004\u0012\u00020\u0002 \u0004*\u0016\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0001j\n\u0012\u0004\u0012\u00020\u0002\u0018\u0001`\u00030\u0001j\b\u0012\u0004\u0012\u00020\u0002`\u00032\u0016\u0010\u0005\u001a\u0012\u0012\u0004\u0012\u00020\u00020\u0001j\b\u0012\u0004\u0012\u00020\u0002`\u0003H\n¢\u0006\u0002\b\u0006"}, m29142d2 = {"<anonymous>", "Ljava/util/ArrayList;", "", "Lkotlin/collections/ArrayList;", "kotlin.jvm.PlatformType", CustomerEnquiryActivity.RESULT, "invoke"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
@SourceDebugExtension({"SMAP\nOneRectifyViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OneRectifyViewModel.kt\nth/co/dtac/android/dtacone/view/appOne/rectify/viewmodel/OneRectifyViewModel$getRectifyList$5\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,214:1\n1549#2:215\n1620#2,3:216\n*S KotlinDebug\n*F\n+ 1 OneRectifyViewModel.kt\nth/co/dtac/android/dtacone/view/appOne/rectify/viewmodel/OneRectifyViewModel$getRectifyList$5\n*L\n136#1:215\n136#1:216,3\n*E\n"})
/* renamed from: th.co.dtac.android.dtacone.view.appOne.rectify.viewmodel.OneRectifyViewModel$getRectifyList$5 */
/* loaded from: classes10.dex */
public final class OneRectifyViewModel$getRectifyList$5 extends Lambda implements Function1<ArrayList<Object>, ArrayList<Object>> {
    final /* synthetic */ OneRectifyViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OneRectifyViewModel$getRectifyList$5(OneRectifyViewModel oneRectifyViewModel) {
        super(1);
        this.this$0 = oneRectifyViewModel;
    }

    @Override // kotlin.jvm.functions.Function1
    public final ArrayList<Object> invoke(@NotNull ArrayList<Object> results) {
        OneRectifyRepository oneRectifyRepository;
        OneRectifyRepository oneRectifyRepository2;
        Intrinsics.checkNotNullParameter(results, "results");
        OneRectifyViewModel oneRectifyViewModel = this.this$0;
        ArrayList arrayList = new ArrayList(AbstractC10172es.collectionSizeOrDefault(results, 10));
        for (Object obj : results) {
            if (obj instanceof OneRectifyListResponse.DataItem.RectifyItem) {
                OneRectifyListResponse.DataItem.RectifyItem rectifyItem = (OneRectifyListResponse.DataItem.RectifyItem) obj;
                oneRectifyRepository = oneRectifyViewModel.f96159b;
                rectifyItem.setCustomerNumberDisplay(oneRectifyRepository.decryptCBC(rectifyItem.getCustomerNumber()));
                oneRectifyRepository2 = oneRectifyViewModel.f96159b;
                rectifyItem.setSimRDisplay(oneRectifyRepository2.decryptCBC(rectifyItem.getSimR()));
            }
            arrayList.add(Unit.INSTANCE);
        }
        return results;
    }
}