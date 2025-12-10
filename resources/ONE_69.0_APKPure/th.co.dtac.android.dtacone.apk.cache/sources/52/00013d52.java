package th.p047co.dtac.android.dtacone.view.appOne.rectify.viewmodel;

import androidx.lifecycle.MutableLiveData;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import th.p047co.dtac.android.dtacone.app_one.model.rectify.OneRectifyListResponse;
import th.p047co.dtac.android.dtacone.model.Resource;
import th.p047co.dtac.android.dtacone.model.StatusResource;
import th.p047co.dtac.android.dtacone.view.activity.customerenquiry.CustomerEnquiryActivity;
import th.p047co.dtac.android.dtacone.view.appOne.rectify.repository.OneRectifyRepository;

@Metadata(m29143d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u000120\u0010\u0002\u001a,\u0012\u0004\u0012\u00020\u0004 \u0006*\u0016\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003j\n\u0012\u0004\u0012\u00020\u0004\u0018\u0001`\u00050\u0003j\b\u0012\u0004\u0012\u00020\u0004`\u0005H\n¢\u0006\u0002\b\u0007"}, m29142d2 = {"<anonymous>", "", CustomerEnquiryActivity.RESULT, "Ljava/util/ArrayList;", "", "Lkotlin/collections/ArrayList;", "kotlin.jvm.PlatformType", "invoke"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
@SourceDebugExtension({"SMAP\nOneRectifyViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OneRectifyViewModel.kt\nth/co/dtac/android/dtacone/view/appOne/rectify/viewmodel/OneRectifyViewModel$getRectifyList$7\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,214:1\n1549#2:215\n1620#2,3:216\n*S KotlinDebug\n*F\n+ 1 OneRectifyViewModel.kt\nth/co/dtac/android/dtacone/view/appOne/rectify/viewmodel/OneRectifyViewModel$getRectifyList$7\n*L\n156#1:215\n156#1:216,3\n*E\n"})
/* renamed from: th.co.dtac.android.dtacone.view.appOne.rectify.viewmodel.OneRectifyViewModel$getRectifyList$7 */
/* loaded from: classes10.dex */
public final class OneRectifyViewModel$getRectifyList$7 extends Lambda implements Function1<ArrayList<Object>, Unit> {
    final /* synthetic */ Boolean $isRefresh;
    final /* synthetic */ OneRectifyViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OneRectifyViewModel$getRectifyList$7(Boolean bool, OneRectifyViewModel oneRectifyViewModel) {
        super(1);
        this.$isRefresh = bool;
        this.this$0 = oneRectifyViewModel;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(ArrayList<Object> arrayList) {
        invoke2(arrayList);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(ArrayList<Object> results) {
        MutableLiveData m10483B;
        MutableLiveData m10483B2;
        OneRectifyRepository oneRectifyRepository;
        Intrinsics.checkNotNullExpressionValue(results, "results");
        if (!results.isEmpty()) {
            if (Intrinsics.areEqual(this.$isRefresh, Boolean.TRUE)) {
                this.this$0.isRefreshing().setValue(StatusResource.SUCCESS);
            } else {
                this.this$0.getLiveDataState().setValue(StatusResource.SUCCESS);
            }
            OneRectifyViewModel oneRectifyViewModel = this.this$0;
            ArrayList arrayList = new ArrayList(AbstractC10172es.collectionSizeOrDefault(results, 10));
            for (Object obj : results) {
                if (obj instanceof OneRectifyListResponse.DataItem.RectifyItem) {
                    oneRectifyRepository = oneRectifyViewModel.f96159b;
                    oneRectifyRepository.decryptCBC(((OneRectifyListResponse.DataItem.RectifyItem) obj).getCustomerNumber());
                }
                arrayList.add(obj);
            }
            m10483B2 = this.this$0.m10483B();
            m10483B2.setValue(Resource.Companion.success(results));
            return;
        }
        if (Intrinsics.areEqual(this.$isRefresh, Boolean.TRUE)) {
            this.this$0.isRefreshing().setValue(StatusResource.ERROR);
        } else {
            this.this$0.getLiveDataState().setValue(StatusResource.ERROR);
        }
        m10483B = this.this$0.m10483B();
        m10483B.setValue(Resource.Companion.error$default(Resource.Companion, "ไม่พบรายการ", null, null, 4, null));
    }
}