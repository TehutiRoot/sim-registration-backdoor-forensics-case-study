package th.p047co.dtac.android.dtacone.view.appOne.pre2post.fragment;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import th.p047co.dtac.android.dtacone.view.appOne.pre2post.activity.OnePre2PostActivity;

@Metadata(m29143d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m29142d2 = {"<anonymous>", "", "invoke"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.view.appOne.pre2post.fragment.OnePre2PostAllPackageTelephoneNumberFragment$actionToolbar$1 */
/* loaded from: classes10.dex */
public final class OnePre2PostAllPackageTelephoneNumberFragment$actionToolbar$1 extends Lambda implements Function0<Unit> {
    final /* synthetic */ OnePre2PostAllPackageTelephoneNumberFragment this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OnePre2PostAllPackageTelephoneNumberFragment$actionToolbar$1(OnePre2PostAllPackageTelephoneNumberFragment onePre2PostAllPackageTelephoneNumberFragment) {
        super(0);
        this.this$0 = onePre2PostAllPackageTelephoneNumberFragment;
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2() {
        OnePre2PostActivity m11446p;
        m11446p = this.this$0.m11446p();
        m11446p.replaceFragment(OnePre2PostSearchPackageFragment.Companion.newInstance(), null);
    }
}