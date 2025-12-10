package th.p047co.dtac.android.dtacone.view.appOne.tol.screen.device;

import androidx.compose.runtime.MutableState;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import th.p047co.dtac.android.dtacone.model.appOne.tol.device.DeviceMeshItem;

@Metadata(m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.view.appOne.tol.screen.device.ComposableSingletons$DeviceSelectScreenKt$lambda-8$1$4$1  reason: invalid class name */
/* loaded from: classes10.dex */
public final class ComposableSingletons$DeviceSelectScreenKt$lambda8$1$4$1 extends Lambda implements Function1<String, Unit> {
    final /* synthetic */ MutableState<DeviceMeshItem> $mesh$delegate;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ComposableSingletons$DeviceSelectScreenKt$lambda8$1$4$1(MutableState<DeviceMeshItem> mutableState) {
        super(1);
        this.$mesh$delegate = mutableState;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(String str) {
        invoke2(str);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(@NotNull String code) {
        DeviceMeshItem invoke$lambda$10;
        DeviceMeshItem deviceMeshItem;
        DeviceMeshItem invoke$lambda$102;
        Intrinsics.checkNotNullParameter(code, "code");
        MutableState<DeviceMeshItem> mutableState = this.$mesh$delegate;
        invoke$lambda$10 = ComposableSingletons$DeviceSelectScreenKt$lambda8$1.invoke$lambda$10(mutableState);
        if (invoke$lambda$10 != null) {
            invoke$lambda$102 = ComposableSingletons$DeviceSelectScreenKt$lambda8$1.invoke$lambda$10(this.$mesh$delegate);
            deviceMeshItem = DeviceMeshItem.copy$default(invoke$lambda$10, null, null, null, 0, (invoke$lambda$102 != null ? invoke$lambda$102.getMeshQuantity() : 0) - 1, 15, null);
        } else {
            deviceMeshItem = null;
        }
        mutableState.setValue(deviceMeshItem);
    }
}