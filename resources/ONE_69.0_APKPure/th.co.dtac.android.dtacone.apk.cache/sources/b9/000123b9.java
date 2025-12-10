package th.p047co.dtac.android.dtacone.presenter.inactive_user;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import th.p047co.dtac.android.dtacone.model.inactive_user.InactiveOwnerTransectionCollection;
import th.p047co.dtac.android.dtacone.model.inactive_user.OwnerDetailCollection;
import th.p047co.dtac.android.dtacone.presenter.inactive_user.InactiveOwnerDetailPresenter;

@Metadata(m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.presenter.inactive_user.InactiveOwnerDetailPresenter$getOwnerDetail$1 */
/* loaded from: classes8.dex */
public /* synthetic */ class InactiveOwnerDetailPresenter$getOwnerDetail$1 extends FunctionReferenceImpl implements Function1<OwnerDetailCollection, List<? extends InactiveOwnerTransectionCollection>> {
    public InactiveOwnerDetailPresenter$getOwnerDetail$1(Object obj) {
        super(1, obj, InactiveOwnerDetailPresenter.Companion.class, "groupTransactionByDate", "groupTransactionByDate(Lth/co/dtac/android/dtacone/model/inactive_user/OwnerDetailCollection;)Ljava/util/List;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    @NotNull
    public final List<InactiveOwnerTransectionCollection> invoke(@NotNull OwnerDetailCollection p0) {
        List<InactiveOwnerTransectionCollection> m18087a;
        Intrinsics.checkNotNullParameter(p0, "p0");
        m18087a = ((InactiveOwnerDetailPresenter.Companion) this.receiver).m18087a(p0);
        return m18087a;
    }
}