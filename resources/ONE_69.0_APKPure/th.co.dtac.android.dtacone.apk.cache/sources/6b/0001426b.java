package th.p047co.dtac.android.dtacone.view.appOne.tol.screen.fixedLinePlus;

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
import th.p047co.dtac.android.dtacone.model.appOne.tol.fixedLinePlus.PackagePriceInfo;

@Metadata(m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
@SourceDebugExtension({"SMAP\nOneRegisterTrueOnlineFlpPackageScreen.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OneRegisterTrueOnlineFlpPackageScreen.kt\nth/co/dtac/android/dtacone/view/appOne/tol/screen/fixedLinePlus/OneRegisterTrueOnlineFlpPackageScreenKt$OneRegisterTrueOnlineFlpPackageScreen$1$1$3\n+ 2 LazyDsl.kt\nandroidx/compose/foundation/lazy/LazyDslKt\n*L\n1#1,374:1\n136#2,12:375\n*S KotlinDebug\n*F\n+ 1 OneRegisterTrueOnlineFlpPackageScreen.kt\nth/co/dtac/android/dtacone/view/appOne/tol/screen/fixedLinePlus/OneRegisterTrueOnlineFlpPackageScreenKt$OneRegisterTrueOnlineFlpPackageScreen$1$1$3\n*L\n133#1:375,12\n*E\n"})
/* renamed from: th.co.dtac.android.dtacone.view.appOne.tol.screen.fixedLinePlus.OneRegisterTrueOnlineFlpPackageScreenKt$OneRegisterTrueOnlineFlpPackageScreen$1$1$3 */
/* loaded from: classes10.dex */
public final class C15393x7e07df72 extends Lambda implements Function1<LazyListScope, Unit> {
    final /* synthetic */ int $$dirty;
    final /* synthetic */ MutableState<String> $filterText$delegate;
    final /* synthetic */ List<PackagePriceInfo> $filteredPackage;
    final /* synthetic */ Function1<String, Unit> $onSelect;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C15393x7e07df72(List<PackagePriceInfo> list, Function1<? super String, Unit> function1, int i, MutableState<String> mutableState) {
        super(1);
        this.$filteredPackage = list;
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
        List<PackagePriceInfo> list = this.$filteredPackage;
        Function1<String, Unit> function1 = this.$onSelect;
        int i = this.$$dirty;
        MutableState<String> mutableState = this.$filterText$delegate;
        LazyColumn.items(list.size(), null, new C15390xf61dcdc9(C15388xf61dcdc7.INSTANCE, list), ComposableLambdaKt.composableLambdaInstance(-632812321, true, new C15391xf61dcdca(list, function1, i, mutableState)));
    }
}