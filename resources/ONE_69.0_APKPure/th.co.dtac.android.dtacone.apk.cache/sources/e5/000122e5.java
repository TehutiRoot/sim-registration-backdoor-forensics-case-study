package th.p047co.dtac.android.dtacone.presenter.change_sim;

import com.google.android.gms.analytics.ecommerce.Promotion;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.SourceDebugExtension;
import th.p047co.dtac.android.dtacone.model.change_sim.ChangeSimAdmKeyCollection;
import th.p047co.dtac.android.dtacone.model.change_sim.ChangeSimNewCardInfo;
import th.p047co.dtac.android.dtacone.presenter.change_sim.ChangeSimVerifyWriteSimPresenter;

@Metadata(m29143d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m29142d2 = {"<anonymous>", "", "it", "Lth/co/dtac/android/dtacone/model/change_sim/ChangeSimNewCardInfo;", "kotlin.jvm.PlatformType", "invoke"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
@SourceDebugExtension({"SMAP\nChangeSimVerifyWriteSimPresenter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ChangeSimVerifyWriteSimPresenter.kt\nth/co/dtac/android/dtacone/presenter/change_sim/ChangeSimVerifyWriteSimPresenter$pollingVerifyFromServer$4\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,117:1\n1#2:118\n*E\n"})
/* renamed from: th.co.dtac.android.dtacone.presenter.change_sim.ChangeSimVerifyWriteSimPresenter$pollingVerifyFromServer$4 */
/* loaded from: classes8.dex */
public final class ChangeSimVerifyWriteSimPresenter$pollingVerifyFromServer$4 extends Lambda implements Function1<ChangeSimNewCardInfo, Unit> {

    /* renamed from: $c */
    final /* synthetic */ Ref.IntRef f85691$c;
    final /* synthetic */ ChangeSimVerifyWriteSimPresenter this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChangeSimVerifyWriteSimPresenter$pollingVerifyFromServer$4(Ref.IntRef intRef, ChangeSimVerifyWriteSimPresenter changeSimVerifyWriteSimPresenter) {
        super(1);
        this.f85691$c = intRef;
        this.this$0 = changeSimVerifyWriteSimPresenter;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(ChangeSimNewCardInfo changeSimNewCardInfo) {
        invoke2(changeSimNewCardInfo);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(ChangeSimNewCardInfo changeSimNewCardInfo) {
        ChangeSimVerifyWriteSimPresenter.View view;
        ChangeSimVerifyWriteSimPresenter.View view2;
        this.f85691$c.element++;
        ChangeSimVerifyWriteSimPresenter.View view3 = null;
        if (Intrinsics.areEqual(changeSimNewCardInfo.getStatus(), "Success")) {
            ChangeSimAdmKeyCollection response = changeSimNewCardInfo.getResponse();
            if (response != null) {
                view2 = this.this$0.f85689d;
                if (view2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException(Promotion.ACTION_VIEW);
                } else {
                    view3 = view2;
                }
                view3.onVerifyChangeSimSuccess(response);
            }
        } else if (this.f85691$c.element == 5) {
            view = this.this$0.f85689d;
            if (view == null) {
                Intrinsics.throwUninitializedPropertyAccessException(Promotion.ACTION_VIEW);
            } else {
                view3 = view;
            }
            view3.onVerifyChangeSimError();
        }
    }
}