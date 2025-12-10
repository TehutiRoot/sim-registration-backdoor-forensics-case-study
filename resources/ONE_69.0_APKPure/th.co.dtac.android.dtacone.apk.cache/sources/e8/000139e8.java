package th.p047co.dtac.android.dtacone.view.appOne.pre2post.fragment;

import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import th.p047co.dtac.android.dtacone.adapter.ViewPagerCardAdapter;
import th.p047co.dtac.android.dtacone.model.postpaid.packages.TabPackage;

@Metadata(m29143d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u001a\u0010\u0002\u001a\u0016\u0012\u0004\u0012\u00020\u0004 \u0005*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0006"}, m29142d2 = {"<anonymous>", "", "it", "", "Lth/co/dtac/android/dtacone/model/postpaid/packages/TabPackage;", "kotlin.jvm.PlatformType", "invoke"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
@SourceDebugExtension({"SMAP\nOnePre2PostAllPackageTelephoneNumberFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OnePre2PostAllPackageTelephoneNumberFragment.kt\nth/co/dtac/android/dtacone/view/appOne/pre2post/fragment/OnePre2PostAllPackageTelephoneNumberFragment$onStart$2\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,245:1\n1855#2,2:246\n*S KotlinDebug\n*F\n+ 1 OnePre2PostAllPackageTelephoneNumberFragment.kt\nth/co/dtac/android/dtacone/view/appOne/pre2post/fragment/OnePre2PostAllPackageTelephoneNumberFragment$onStart$2\n*L\n173#1:246,2\n*E\n"})
/* renamed from: th.co.dtac.android.dtacone.view.appOne.pre2post.fragment.OnePre2PostAllPackageTelephoneNumberFragment$onStart$2 */
/* loaded from: classes10.dex */
public final class OnePre2PostAllPackageTelephoneNumberFragment$onStart$2 extends Lambda implements Function1<List<? extends TabPackage>, Unit> {
    final /* synthetic */ OnePre2PostAllPackageTelephoneNumberFragment this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OnePre2PostAllPackageTelephoneNumberFragment$onStart$2(OnePre2PostAllPackageTelephoneNumberFragment onePre2PostAllPackageTelephoneNumberFragment) {
        super(1);
        this.this$0 = onePre2PostAllPackageTelephoneNumberFragment;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(List<? extends TabPackage> list) {
        invoke2(list);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(List<? extends TabPackage> list) {
        ViewPagerCardAdapter viewPagerCardAdapter;
        ViewPagerCardAdapter viewPagerCardAdapter2;
        if (list != null) {
            OnePre2PostAllPackageTelephoneNumberFragment onePre2PostAllPackageTelephoneNumberFragment = this.this$0;
            viewPagerCardAdapter = onePre2PostAllPackageTelephoneNumberFragment.f94843j;
            if (viewPagerCardAdapter == null) {
                Intrinsics.throwUninitializedPropertyAccessException("cardAdapter");
                viewPagerCardAdapter = null;
            }
            viewPagerCardAdapter.removeFragment();
            for (TabPackage tabPackage : list) {
                viewPagerCardAdapter2 = onePre2PostAllPackageTelephoneNumberFragment.f94843j;
                if (viewPagerCardAdapter2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("cardAdapter");
                    viewPagerCardAdapter2 = null;
                }
                viewPagerCardAdapter2.addFragmentCard(OnePre2PostPackageListFragment.Companion.newInstance(tabPackage), tabPackage.getTabName());
            }
            onePre2PostAllPackageTelephoneNumberFragment.onRenderComplete();
            onePre2PostAllPackageTelephoneNumberFragment.dismissLoading();
        }
    }
}