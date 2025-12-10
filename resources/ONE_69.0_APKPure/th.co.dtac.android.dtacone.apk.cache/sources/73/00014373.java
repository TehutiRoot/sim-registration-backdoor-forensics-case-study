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
import th.p047co.dtac.android.dtacone.view.appOne.tol.model.customerInfo.address.SubDistrict;

@Metadata(m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
@SourceDebugExtension({"SMAP\nInputInfoScreen.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InputInfoScreen.kt\nth/co/dtac/android/dtacone/view/appOne/tol/screen/inputInfo/InputInfoScreenKt$SubDistrictList$1\n+ 2 LazyDsl.kt\nandroidx/compose/foundation/lazy/LazyDslKt\n*L\n1#1,1296:1\n136#2,12:1297\n*S KotlinDebug\n*F\n+ 1 InputInfoScreen.kt\nth/co/dtac/android/dtacone/view/appOne/tol/screen/inputInfo/InputInfoScreenKt$SubDistrictList$1\n*L\n979#1:1297,12\n*E\n"})
/* renamed from: th.co.dtac.android.dtacone.view.appOne.tol.screen.inputInfo.InputInfoScreenKt$SubDistrictList$1 */
/* loaded from: classes10.dex */
public final class InputInfoScreenKt$SubDistrictList$1 extends Lambda implements Function1<LazyListScope, Unit> {
    final /* synthetic */ int $$dirty;
    final /* synthetic */ List<SubDistrict> $filteredList;
    final /* synthetic */ Function1<SubDistrict, Unit> $onSubDistrictSelect;
    final /* synthetic */ int $subDistrictId;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public InputInfoScreenKt$SubDistrictList$1(List<SubDistrict> list, int i, Function1<? super SubDistrict, Unit> function1, int i2) {
        super(1);
        this.$filteredList = list;
        this.$subDistrictId = i;
        this.$onSubDistrictSelect = function1;
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
        List<SubDistrict> list = this.$filteredList;
        int i = this.$subDistrictId;
        Function1<SubDistrict, Unit> function1 = this.$onSubDistrictSelect;
        int i2 = this.$$dirty;
        LazyColumn.items(list.size(), null, new C15472x77b59519(C15470x77b59517.INSTANCE, list), ComposableLambdaKt.composableLambdaInstance(-632812321, true, new C15473x77b5951a(list, i, function1, i2)));
        LazyListScope.CC.m61223i(LazyColumn, null, null, ComposableSingletons$InputInfoScreenKt.INSTANCE.m75216getLambda6$app_prodRelease(), 3, null);
    }
}