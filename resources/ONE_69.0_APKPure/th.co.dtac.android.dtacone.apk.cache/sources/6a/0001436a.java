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
import th.p047co.dtac.android.dtacone.view.appOne.tol.model.customerInfo.address.PostCode;

@Metadata(m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
@SourceDebugExtension({"SMAP\nInputInfoScreen.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InputInfoScreen.kt\nth/co/dtac/android/dtacone/view/appOne/tol/screen/inputInfo/InputInfoScreenKt$PostCodeList$3\n+ 2 LazyDsl.kt\nandroidx/compose/foundation/lazy/LazyDslKt\n*L\n1#1,1296:1\n136#2,12:1297\n*S KotlinDebug\n*F\n+ 1 InputInfoScreen.kt\nth/co/dtac/android/dtacone/view/appOne/tol/screen/inputInfo/InputInfoScreenKt$PostCodeList$3\n*L\n1021#1:1297,12\n*E\n"})
/* renamed from: th.co.dtac.android.dtacone.view.appOne.tol.screen.inputInfo.InputInfoScreenKt$PostCodeList$3 */
/* loaded from: classes10.dex */
public final class InputInfoScreenKt$PostCodeList$3 extends Lambda implements Function1<LazyListScope, Unit> {
    final /* synthetic */ int $$dirty;
    final /* synthetic */ List<PostCode> $filteredList;
    final /* synthetic */ Function1<PostCode, Unit> $onPostCodeSelect;
    final /* synthetic */ String $postCode;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public InputInfoScreenKt$PostCodeList$3(List<PostCode> list, String str, Function1<? super PostCode, Unit> function1, int i) {
        super(1);
        this.$filteredList = list;
        this.$postCode = str;
        this.$onPostCodeSelect = function1;
        this.$$dirty = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(LazyListScope lazyListScope) {
        invoke2(lazyListScope);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(@NotNull LazyListScope LazyColumn) {
        Intrinsics.checkNotNullParameter(LazyColumn, "$this$LazyColumn");
        List<PostCode> list = this.$filteredList;
        String str = this.$postCode;
        Function1<PostCode, Unit> function1 = this.$onPostCodeSelect;
        int i = this.$$dirty;
        LazyColumn.items(list.size(), null, new InputInfoScreenKt$PostCodeList$3$invoke$$inlined$items$default$3(InputInfoScreenKt$PostCodeList$3$invoke$$inlined$items$default$1.INSTANCE, list), ComposableLambdaKt.composableLambdaInstance(-632812321, true, new InputInfoScreenKt$PostCodeList$3$invoke$$inlined$items$default$4(list, str, function1, i)));
        LazyListScope.CC.m61223i(LazyColumn, null, null, ComposableSingletons$InputInfoScreenKt.INSTANCE.m75217getLambda7$app_prodRelease(), 3, null);
    }
}