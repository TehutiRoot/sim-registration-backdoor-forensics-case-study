package th.p047co.dtac.android.dtacone.view.appOne.tol.screen.inputInfo;

import androidx.compose.foundation.lazy.LazyListScope;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import th.p047co.dtac.android.dtacone.view.appOne.tol.model.customerInfo.address.Province;

@Metadata(m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
@SourceDebugExtension({"SMAP\nInputInfoScreen.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InputInfoScreen.kt\nth/co/dtac/android/dtacone/view/appOne/tol/screen/inputInfo/InputInfoScreenKt$ProvinceList$1$2\n+ 2 LazyDsl.kt\nandroidx/compose/foundation/lazy/LazyDslKt\n*L\n1#1,1296:1\n136#2,12:1297\n*S KotlinDebug\n*F\n+ 1 InputInfoScreen.kt\nth/co/dtac/android/dtacone/view/appOne/tol/screen/inputInfo/InputInfoScreenKt$ProvinceList$1$2\n*L\n913#1:1297,12\n*E\n"})
/* renamed from: th.co.dtac.android.dtacone.view.appOne.tol.screen.inputInfo.InputInfoScreenKt$ProvinceList$1$2 */
/* loaded from: classes10.dex */
public final class InputInfoScreenKt$ProvinceList$1$2 extends Lambda implements Function1<LazyListScope, Unit> {
    final /* synthetic */ int $$dirty;
    final /* synthetic */ List<Province> $filteredList;
    final /* synthetic */ Function1<Province, Unit> $onProvinceSelect;
    final /* synthetic */ int $provinceId;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public InputInfoScreenKt$ProvinceList$1$2(List<Province> list, int i, Function1<? super Province, Unit> function1, int i2) {
        super(1);
        this.$filteredList = list;
        this.$provinceId = i;
        this.$onProvinceSelect = function1;
        this.$$dirty = i2;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(LazyListScope lazyListScope) {
        invoke2(lazyListScope);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(@NotNull LazyListScope LazyColumn) {
        Intrinsics.checkNotNullParameter(LazyColumn, "$this$LazyColumn");
        List<Province> list = this.$filteredList;
        int i = this.$provinceId;
        Function1<Province, Unit> function1 = this.$onProvinceSelect;
        int i2 = this.$$dirty;
        LazyColumn.items(list.size(), null, new C15468x59ea0277(C15466x59ea0275.INSTANCE, list), ComposableLambdaKt.composableLambdaInstance(-632812321, true, new C15469x59ea0278(list, i, function1, i2)));
        LazyListScope.CC.m61223i(LazyColumn, null, null, ComposableSingletons$InputInfoScreenKt.INSTANCE.m75214getLambda4$app_prodRelease(), 3, null);
    }
}