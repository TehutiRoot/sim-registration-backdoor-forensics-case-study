package th.p047co.dtac.android.dtacone.view.appOne.tol.screen.device;

import androidx.compose.runtime.MutableState;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

@Metadata(m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.view.appOne.tol.screen.device.DeviceSelectScreenKt$DeviceSelectScreen$4$1 */
/* loaded from: classes10.dex */
public final class DeviceSelectScreenKt$DeviceSelectScreen$4$1 extends Lambda implements Function1<String, Unit> {
    final /* synthetic */ Function1<String, Unit> $onMeshSelect;
    final /* synthetic */ MutableState<Boolean> $showMeshSheet$delegate;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public DeviceSelectScreenKt$DeviceSelectScreen$4$1(Function1<? super String, Unit> function1, MutableState<Boolean> mutableState) {
        super(1);
        this.$onMeshSelect = function1;
        this.$showMeshSheet$delegate = mutableState;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(String str) {
        invoke2(str);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(@NotNull String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        this.$onMeshSelect.invoke(it);
        DeviceSelectScreenKt.m9578j(this.$showMeshSheet$delegate, false);
    }
}