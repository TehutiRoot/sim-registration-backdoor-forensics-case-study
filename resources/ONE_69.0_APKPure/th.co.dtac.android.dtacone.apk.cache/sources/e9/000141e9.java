package th.p047co.dtac.android.dtacone.view.appOne.tol.screen.device;

import androidx.compose.runtime.MutableState;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import th.p047co.dtac.android.dtacone.model.appOne.tol.device.DeviceRouterItem;
import th.p047co.dtac.android.dtacone.view.appOne.tol.viewmodel.state.DeviceListState;

@Metadata(m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
@SourceDebugExtension({"SMAP\nDeviceSelectScreen.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DeviceSelectScreen.kt\nth/co/dtac/android/dtacone/view/appOne/tol/screen/device/ComposableSingletons$DeviceSelectScreenKt$lambda-9$1$1$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,796:1\n288#2,2:797\n*S KotlinDebug\n*F\n+ 1 DeviceSelectScreen.kt\nth/co/dtac/android/dtacone/view/appOne/tol/screen/device/ComposableSingletons$DeviceSelectScreenKt$lambda-9$1$1$1\n*L\n781#1:797,2\n*E\n"})
/* renamed from: th.co.dtac.android.dtacone.view.appOne.tol.screen.device.ComposableSingletons$DeviceSelectScreenKt$lambda-9$1$1$1  reason: invalid class name */
/* loaded from: classes10.dex */
public final class ComposableSingletons$DeviceSelectScreenKt$lambda9$1$1$1 extends Lambda implements Function1<String, Unit> {
    final /* synthetic */ MutableState<DeviceListState.Success> $deviceListState$delegate;
    final /* synthetic */ MutableState<DeviceRouterItem> $router$delegate;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ComposableSingletons$DeviceSelectScreenKt$lambda9$1$1$1(MutableState<DeviceListState.Success> mutableState, MutableState<DeviceRouterItem> mutableState2) {
        super(1);
        this.$deviceListState$delegate = mutableState;
        this.$router$delegate = mutableState2;
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
        MutableState<DeviceRouterItem> mutableState = this.$router$delegate;
        Iterator<T> it2 = ComposableSingletons$DeviceSelectScreenKt$lambda9$1.invoke$lambda$1(this.$deviceListState$delegate).getData().iterator();
        while (true) {
            if (!it2.hasNext()) {
                obj = null;
                break;
            }
            obj = it2.next();
            DeviceRouterItem deviceRouterItem = (DeviceRouterItem) obj;
            if (deviceRouterItem.getDeviceOfferCode().equals(deviceRouterItem)) {
                break;
            }
        }
        mutableState.setValue((DeviceRouterItem) obj);
    }
}