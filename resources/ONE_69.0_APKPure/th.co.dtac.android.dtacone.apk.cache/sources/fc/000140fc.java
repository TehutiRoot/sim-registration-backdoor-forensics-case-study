package th.p047co.dtac.android.dtacone.view.appOne.tol.screen;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.navigation.NavController;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.flow.SharedFlow;
import org.jetbrains.annotations.Nullable;
import th.p047co.dtac.android.dtacone.model.appOne.tol.discount.DiscountItem;
import th.p047co.dtac.android.dtacone.view.appOne.tol.viewmodel.state.DiscountListState;

@Metadata(m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.view.appOne.tol.screen.OneTolNavGraphKt$NavigateDiscountOrDevice$4 */
/* loaded from: classes10.dex */
public final class OneTolNavGraphKt$NavigateDiscountOrDevice$4 extends Lambda implements Function2<Composer, Integer, Unit> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ DiscountListState $discountListState;
    final /* synthetic */ NavController $navController;
    final /* synthetic */ SharedFlow<List<DiscountItem>> $onGetDiscountSuccess;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public OneTolNavGraphKt$NavigateDiscountOrDevice$4(DiscountListState discountListState, SharedFlow<? extends List<DiscountItem>> sharedFlow, NavController navController, int i) {
        super(2);
        this.$discountListState = discountListState;
        this.$onGetDiscountSuccess = sharedFlow;
        this.$navController = navController;
        this.$$changed = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
        invoke(composer, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(@Nullable Composer composer, int i) {
        OneTolNavGraphKt.NavigateDiscountOrDevice(this.$discountListState, this.$onGetDiscountSuccess, this.$navController, composer, RecomposeScopeImplKt.updateChangedFlags(this.$$changed | 1));
    }
}