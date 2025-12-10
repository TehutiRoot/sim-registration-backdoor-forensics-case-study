package th.p047co.dtac.android.dtacone.view.appOne.tol.screen.device;

import androidx.compose.runtime.MutableState;
import java.util.Iterator;
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
@SourceDebugExtension({"SMAP\nDeviceSelectScreen.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DeviceSelectScreen.kt\nth/co/dtac/android/dtacone/view/appOne/tol/screen/device/ComposableSingletons$DeviceSelectScreenKt$lambda-8$1$2$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,796:1\n288#2,2:797\n*S KotlinDebug\n*F\n+ 1 DeviceSelectScreen.kt\nth/co/dtac/android/dtacone/view/appOne/tol/screen/device/ComposableSingletons$DeviceSelectScreenKt$lambda-8$1$2$1\n*L\n758#1:797,2\n*E\n"})
/* renamed from: th.co.dtac.android.dtacone.view.appOne.tol.screen.device.ComposableSingletons$DeviceSelectScreenKt$lambda-8$1$2$1  reason: invalid class name */
/* loaded from: classes10.dex */
public final class ComposableSingletons$DeviceSelectScreenKt$lambda8$1$2$1 extends Lambda implements Function1<String, Unit> {
    final /* synthetic */ MutableState<DeviceMeshItem> $mesh$delegate;
    final /* synthetic */ MutableState<List<DeviceMeshItem>> $meshList$delegate;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ComposableSingletons$DeviceSelectScreenKt$lambda8$1$2$1(MutableState<List<DeviceMeshItem>> mutableState, MutableState<DeviceMeshItem> mutableState2) {
        super(1);
        this.$meshList$delegate = mutableState;
        this.$mesh$delegate = mutableState2;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(String str) {
        invoke2(str);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(@NotNull String it) {
        Object obj;
        Intrinsics.checkNotNullParameter(it, "it");
        MutableState<DeviceMeshItem> mutableState = this.$mesh$delegate;
        Iterator it2 = ComposableSingletons$DeviceSelectScreenKt$lambda8$1.invoke$lambda$7(this.$meshList$delegate).iterator();
        while (true) {
            if (!it2.hasNext()) {
                obj = null;
                break;
            }
            obj = it2.next();
            DeviceMeshItem deviceMeshItem = (DeviceMeshItem) obj;
            if (deviceMeshItem.getMeshOfferCode().equals(deviceMeshItem)) {
                break;
            }
        }
        DeviceMeshItem deviceMeshItem2 = (DeviceMeshItem) obj;
        mutableState.setValue(deviceMeshItem2 != null ? DeviceMeshItem.copy$default(deviceMeshItem2, null, null, null, 0, 0, 31, null) : null);
    }
}