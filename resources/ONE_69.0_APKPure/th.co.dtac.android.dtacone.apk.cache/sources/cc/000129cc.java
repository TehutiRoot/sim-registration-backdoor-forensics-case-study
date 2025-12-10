package th.p047co.dtac.android.dtacone.view.appOne.buyDol.fragment;

import android.os.Handler;
import android.os.Looper;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import th.p047co.dtac.android.dtacone.view.appOne.buyDol.activity.OneBuyDolActivity;
import th.p047co.dtac.android.dtacone.view.appOne.buyDol.adapter.OneBuyDolBankListAdapter;
import th.p047co.dtac.android.dtacone.view.appOne.buyDol.fragment.OneBuyDolBankListFragment;
import th.p047co.dtac.android.dtacone.view.appOne.buyDol.fragment.OneBuyDolBankListFragment$setupAdapter$2;
import th.p047co.dtac.android.dtacone.view.appOne.buyDol.model.response.OneBuyDolBankListResponse;

@Metadata(m29143d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016¨\u0006\b"}, m29142d2 = {"th/co/dtac/android/dtacone/view/appOne/buyDol/fragment/OneBuyDolBankListFragment$setupAdapter$2", "Lth/co/dtac/android/dtacone/view/appOne/buyDol/adapter/OneBuyDolBankListAdapter$OnClickListener;", "onSelectBankItem", "", "position", "", "item", "Lth/co/dtac/android/dtacone/view/appOne/buyDol/model/response/OneBuyDolBankListResponse;", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.view.appOne.buyDol.fragment.OneBuyDolBankListFragment$setupAdapter$2 */
/* loaded from: classes10.dex */
public final class OneBuyDolBankListFragment$setupAdapter$2 implements OneBuyDolBankListAdapter.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ OneBuyDolBankListFragment f88379a;

    public OneBuyDolBankListFragment$setupAdapter$2(OneBuyDolBankListFragment oneBuyDolBankListFragment) {
        this.f88379a = oneBuyDolBankListFragment;
    }

    /* renamed from: a */
    public static /* synthetic */ void m16034a(OneBuyDolBankListFragment oneBuyDolBankListFragment, OneBuyDolBankListResponse oneBuyDolBankListResponse) {
        m16033b(oneBuyDolBankListFragment, oneBuyDolBankListResponse);
    }

    /* renamed from: b */
    public static final void m16033b(OneBuyDolBankListFragment this$0, OneBuyDolBankListResponse item) {
        OneBuyDolActivity m16036m;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(item, "$item");
        this$0.dismissLoading();
        m16036m = this$0.m16036m();
        m16036m.addFragment(OneBuyDolBankDetailFragment.Companion.newInstance(item));
    }

    @Override // th.p047co.dtac.android.dtacone.view.appOne.buyDol.adapter.OneBuyDolBankListAdapter.OnClickListener
    public void onSelectBankItem(int i, @NotNull final OneBuyDolBankListResponse item) {
        Intrinsics.checkNotNullParameter(item, "item");
        this.f88379a.showLoading();
        Handler handler = new Handler(Looper.getMainLooper());
        final OneBuyDolBankListFragment oneBuyDolBankListFragment = this.f88379a;
        handler.postDelayed(new Runnable() { // from class: lL0
            @Override // java.lang.Runnable
            public final void run() {
                OneBuyDolBankListFragment$setupAdapter$2.m16034a(OneBuyDolBankListFragment.this, item);
            }
        }, 400L);
    }
}