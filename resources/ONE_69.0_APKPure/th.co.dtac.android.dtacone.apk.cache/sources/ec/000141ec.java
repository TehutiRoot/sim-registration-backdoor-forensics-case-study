package th.p047co.dtac.android.dtacone.view.appOne.tol.screen.device;

import androidx.compose.runtime.MutableState;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import th.p047co.dtac.android.dtacone.model.appOne.tol.device.DeviceMeshItem;

@Metadata(m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
@SourceDebugExtension({"SMAP\nDeviceSelectScreen.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DeviceSelectScreen.kt\nth/co/dtac/android/dtacone/view/appOne/tol/screen/device/ComposableSingletons$DeviceSelectScreenKt$lambda-9$1$4$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,796:1\n1549#2:797\n1620#2,3:798\n*S KotlinDebug\n*F\n+ 1 DeviceSelectScreen.kt\nth/co/dtac/android/dtacone/view/appOne/tol/screen/device/ComposableSingletons$DeviceSelectScreenKt$lambda-9$1$4$1\n*L\n789#1:797\n789#1:798,3\n*E\n"})
/* renamed from: th.co.dtac.android.dtacone.view.appOne.tol.screen.device.ComposableSingletons$DeviceSelectScreenKt$lambda-9$1$4$1  reason: invalid class name */
/* loaded from: classes10.dex */
public final class ComposableSingletons$DeviceSelectScreenKt$lambda9$1$4$1 extends Lambda implements Function1<String, Unit> {
    final /* synthetic */ MutableState<List<DeviceMeshItem>> $meshList$delegate;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ComposableSingletons$DeviceSelectScreenKt$lambda9$1$4$1(MutableState<List<DeviceMeshItem>> mutableState) {
        super(1);
        this.$meshList$delegate = mutableState;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(String str) {
        invoke2(str);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(@NotNull String code) {
        List invoke$lambda$6;
        Intrinsics.checkNotNullParameter(code, "code");
        MutableState<List<DeviceMeshItem>> mutableState = this.$meshList$delegate;
        invoke$lambda$6 = ComposableSingletons$DeviceSelectScreenKt$lambda9$1.invoke$lambda$6(mutableState);
        List<DeviceMeshItem> list = invoke$lambda$6;
        ArrayList arrayList = new ArrayList(AbstractC10172es.collectionSizeOrDefault(list, 10));
        for (DeviceMeshItem deviceMeshItem : list) {
            if (Intrinsics.areEqual(deviceMeshItem.getMeshOfferCode(), code)) {
                deviceMeshItem = DeviceMeshItem.copy$default(deviceMeshItem, null, null, null, 0, deviceMeshItem.getMeshQuantity() - 1, 15, null);
            }
            arrayList.add(deviceMeshItem);
        }
        mutableState.setValue(arrayList);
    }
}