package th.p047co.dtac.android.dtacone.view.appOne.tol.screen.tolPackage;

import androidx.compose.foundation.lazy.LazyListScope;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import th.p047co.dtac.android.dtacone.model.appOne.tol.tolPackage.MarketingDetails;

@Metadata(m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
@SourceDebugExtension({"SMAP\nMarketingCodeSelectScreen.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MarketingCodeSelectScreen.kt\nth/co/dtac/android/dtacone/view/appOne/tol/screen/tolPackage/MarketingCodeSelectScreenKt$MarketingCodeSelectScreen$3$1$4\n+ 2 LazyDsl.kt\nandroidx/compose/foundation/lazy/LazyDslKt\n*L\n1#1,730:1\n136#2,12:731\n*S KotlinDebug\n*F\n+ 1 MarketingCodeSelectScreen.kt\nth/co/dtac/android/dtacone/view/appOne/tol/screen/tolPackage/MarketingCodeSelectScreenKt$MarketingCodeSelectScreen$3$1$4\n*L\n152#1:731,12\n*E\n"})
/* renamed from: th.co.dtac.android.dtacone.view.appOne.tol.screen.tolPackage.MarketingCodeSelectScreenKt$MarketingCodeSelectScreen$3$1$4 */
/* loaded from: classes10.dex */
public final class MarketingCodeSelectScreenKt$MarketingCodeSelectScreen$3$1$4 extends Lambda implements Function1<LazyListScope, Unit> {
    final /* synthetic */ int $$dirty;
    final /* synthetic */ List<MarketingDetails> $filterList;
    final /* synthetic */ MutableState<String> $filterText$delegate;
    final /* synthetic */ Function1<MarketingDetails, Unit> $onSelect;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public MarketingCodeSelectScreenKt$MarketingCodeSelectScreen$3$1$4(List<MarketingDetails> list, Function1<? super MarketingDetails, Unit> function1, int i, MutableState<String> mutableState) {
        super(1);
        this.$filterList = list;
        this.$onSelect = function1;
        this.$$dirty = i;
        this.$filterText$delegate = mutableState;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(LazyListScope lazyListScope) {
        invoke2(lazyListScope);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(@NotNull LazyListScope LazyColumn) {
        Intrinsics.checkNotNullParameter(LazyColumn, "$this$LazyColumn");
        List<MarketingDetails> list = this.$filterList;
        Function1<MarketingDetails, Unit> function1 = this.$onSelect;
        int i = this.$$dirty;
        MutableState<String> mutableState = this.$filterText$delegate;
        LazyColumn.items(list.size(), null, new C15605x7fcf4d9e(C15603x7fcf4d9c.INSTANCE, list), ComposableLambdaKt.composableLambdaInstance(-632812321, true, new C15606x7fcf4d9f(list, function1, i, mutableState)));
    }
}