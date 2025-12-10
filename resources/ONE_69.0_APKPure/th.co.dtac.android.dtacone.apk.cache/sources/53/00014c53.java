package th.p047co.dtac.android.dtacone.view.fragment.eSIM;

import android.content.Context;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import th.p047co.dtac.android.dtacone.adapter.eSIM.ESimNumberListAdapter;
import th.p047co.dtac.android.dtacone.model.Resource;
import th.p047co.dtac.android.dtacone.model.esim.ESIMNumberResponse;
import th.p047co.dtac.android.dtacone.model.esim.TelephoneNumberListItem;
import th.p047co.dtac.android.dtacone.viewmodel.esim.ESimViewModel;

@Metadata(m29143d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u001a\u0010\u0002\u001a\u0016\u0012\u0004\u0012\u00020\u0004 \u0005*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0006"}, m29142d2 = {"<anonymous>", "", "it", "Lth/co/dtac/android/dtacone/model/Resource;", "Lth/co/dtac/android/dtacone/model/esim/ESIMNumberResponse;", "kotlin.jvm.PlatformType", "invoke"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
@SourceDebugExtension({"SMAP\nESimSelectNumberFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ESimSelectNumberFragment.kt\nth/co/dtac/android/dtacone/view/fragment/eSIM/ESimSelectNumberFragment$initView$1$2\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,157:1\n1#2:158\n*E\n"})
/* renamed from: th.co.dtac.android.dtacone.view.fragment.eSIM.ESimSelectNumberFragment$initView$1$2 */
/* loaded from: classes9.dex */
public final class ESimSelectNumberFragment$initView$1$2 extends Lambda implements Function1<Resource<? extends ESIMNumberResponse>, Unit> {
    final /* synthetic */ ESimViewModel $this_with;
    final /* synthetic */ ESimSelectNumberFragment this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ESimSelectNumberFragment$initView$1$2(ESimSelectNumberFragment eSimSelectNumberFragment, ESimViewModel eSimViewModel) {
        super(1);
        this.this$0 = eSimSelectNumberFragment;
        this.$this_with = eSimViewModel;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Resource<? extends ESIMNumberResponse> resource) {
        invoke2((Resource<ESIMNumberResponse>) resource);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(Resource<ESIMNumberResponse> resource) {
        RecyclerView recyclerView;
        ESimNumberListAdapter eSimNumberListAdapter;
        ESIMNumberResponse data = resource.getData();
        if (data != null) {
            ESimSelectNumberFragment eSimSelectNumberFragment = this.this$0;
            ESimViewModel eSimViewModel = this.$this_with;
            List<TelephoneNumberListItem> telephoneNumberList = data.getTelephoneNumberList();
            RecyclerView recyclerView2 = null;
            List<TelephoneNumberListItem> telephoneNumberList2 = telephoneNumberList != null ? eSimViewModel.getTelephoneNumberList(telephoneNumberList) : null;
            FragmentActivity requireActivity = eSimSelectNumberFragment.requireActivity();
            Intrinsics.checkNotNullExpressionValue(requireActivity, "requireActivity()");
            eSimSelectNumberFragment.f100480i = new ESimNumberListAdapter(requireActivity, telephoneNumberList2, eSimSelectNumberFragment);
            recyclerView = eSimSelectNumberFragment.f100487p;
            if (recyclerView == null) {
                Intrinsics.throwUninitializedPropertyAccessException("rvNumberList");
            } else {
                recyclerView2 = recyclerView;
            }
            recyclerView2.setLayoutManager(new GridLayoutManager((Context) eSimSelectNumberFragment.getActivity(), 2, 1, false));
            eSimNumberListAdapter = eSimSelectNumberFragment.f100480i;
            recyclerView2.setAdapter(eSimNumberListAdapter);
        }
    }
}