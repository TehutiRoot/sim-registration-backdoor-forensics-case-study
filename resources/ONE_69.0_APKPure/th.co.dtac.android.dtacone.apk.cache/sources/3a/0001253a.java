package th.p047co.dtac.android.dtacone.presenter.sellerID;

import com.google.android.gms.analytics.ecommerce.Promotion;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import th.p047co.dtac.android.dtacone.manager.service.ServerErrorService;
import th.p047co.dtac.android.dtacone.model.error.ServerErrorException;
import th.p047co.dtac.android.dtacone.presenter.sellerID.ShopListPresenter;

@Metadata(m29143d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, m29142d2 = {"<anonymous>", "", "it", "", "invoke"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.presenter.sellerID.ShopListPresenter$changeRetailer$1 */
/* loaded from: classes8.dex */
public final class ShopListPresenter$changeRetailer$1 extends Lambda implements Function1<Throwable, Unit> {
    final /* synthetic */ ShopListPresenter this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ShopListPresenter$changeRetailer$1(ShopListPresenter shopListPresenter) {
        super(1);
        this.this$0 = shopListPresenter;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Throwable th2) {
        invoke2(th2);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(@NotNull Throwable it) {
        ShopListPresenter.View view;
        Intrinsics.checkNotNullParameter(it, "it");
        view = this.this$0.f86475d;
        if (view == null) {
            Intrinsics.throwUninitializedPropertyAccessException(Promotion.ACTION_VIEW);
            view = null;
        }
        view.dismissLoading();
        ServerErrorService errorService = this.this$0.getErrorService();
        final ShopListPresenter shopListPresenter = this.this$0;
        errorService.handleException(it, new ServerErrorService.ExceptionHandler() { // from class: th.co.dtac.android.dtacone.presenter.sellerID.ShopListPresenter$changeRetailer$1.1
            @Override // th.p047co.dtac.android.dtacone.manager.service.ServerErrorService.ExceptionHandler
            public void handle(@Nullable Throwable th2) {
                ShopListPresenter.View view2;
                if (th2 instanceof ServerErrorException) {
                    view2 = ShopListPresenter.this.f86475d;
                    if (view2 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException(Promotion.ACTION_VIEW);
                        view2 = null;
                    }
                    view2.onChangeRetailerFailed((ServerErrorException) th2);
                }
            }

            @Override // th.p047co.dtac.android.dtacone.manager.service.ServerErrorService.ExceptionHandler
            public boolean supportHttpCode(int i) {
                return i != 401;
            }
        });
    }
}