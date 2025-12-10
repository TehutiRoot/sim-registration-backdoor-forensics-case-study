package th.p047co.dtac.android.dtacone.view.appOne.tol.viewmodel;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableStateFlow;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import th.p047co.dtac.android.dtacone.model.appOne.tol.device.DeviceMeshItem;
import th.p047co.dtac.android.dtacone.model.appOne.tol.device.DeviceRouterItem;
import th.p047co.dtac.android.dtacone.view.appOne.tol.viewmodel.state.DeviceListState;

@Metadata(m29143d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m29142d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
@DebugMetadata(m29093c = "th.co.dtac.android.dtacone.view.appOne.tol.viewmodel.OneRegisterTrueOnlineViewModel$onDeviceRouterSelected$1", m29092f = "OneRegisterTrueOnlineViewModel.kt", m29091i = {}, m29090l = {}, m29089m = "invokeSuspend", m29088n = {}, m29087s = {})
@SourceDebugExtension({"SMAP\nOneRegisterTrueOnlineViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OneRegisterTrueOnlineViewModel.kt\nth/co/dtac/android/dtacone/view/appOne/tol/viewmodel/OneRegisterTrueOnlineViewModel$onDeviceRouterSelected$1\n+ 2 StateFlow.kt\nkotlinx/coroutines/flow/StateFlowKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,2372:1\n230#2,3:2373\n233#2,2:2386\n288#3,2:2376\n777#3:2378\n788#3:2379\n1864#3,2:2380\n789#3,2:2382\n1866#3:2384\n791#3:2385\n*S KotlinDebug\n*F\n+ 1 OneRegisterTrueOnlineViewModel.kt\nth/co/dtac/android/dtacone/view/appOne/tol/viewmodel/OneRegisterTrueOnlineViewModel$onDeviceRouterSelected$1\n*L\n1558#1:2373,3\n1558#1:2386,2\n1559#1:2376,2\n1560#1:2378\n1560#1:2379\n1560#1:2380,2\n1560#1:2382,2\n1560#1:2384\n1560#1:2385\n*E\n"})
/* renamed from: th.co.dtac.android.dtacone.view.appOne.tol.viewmodel.OneRegisterTrueOnlineViewModel$onDeviceRouterSelected$1 */
/* loaded from: classes10.dex */
public final class OneRegisterTrueOnlineViewModel$onDeviceRouterSelected$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $deviceModelCode;
    int label;
    final /* synthetic */ OneRegisterTrueOnlineViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OneRegisterTrueOnlineViewModel$onDeviceRouterSelected$1(OneRegisterTrueOnlineViewModel oneRegisterTrueOnlineViewModel, String str, Continuation<? super OneRegisterTrueOnlineViewModel$onDeviceRouterSelected$1> continuation) {
        super(2, continuation);
        this.this$0 = oneRegisterTrueOnlineViewModel;
        this.$deviceModelCode = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new OneRegisterTrueOnlineViewModel$onDeviceRouterSelected$1(this.this$0, this.$deviceModelCode, continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        Object value;
        DeviceRouterItem deviceRouterItem;
        Object obj2;
        ArrayList emptyList;
        List<DeviceMeshItem> deviceMeshList;
        AbstractC19782eg0.getCOROUTINE_SUSPENDED();
        if (this.label == 0) {
            ResultKt.throwOnFailure(obj);
            Object value2 = this.this$0.f98195P0.getValue();
            Intrinsics.checkNotNull(value2, "null cannot be cast to non-null type th.co.dtac.android.dtacone.view.appOne.tol.viewmodel.state.DeviceListState.Success");
            List<DeviceRouterItem> data = ((DeviceListState.Success) value2).getData();
            MutableStateFlow mutableStateFlow = this.this$0.f98199R0;
            String str = this.$deviceModelCode;
            do {
                value = mutableStateFlow.getValue();
                DeviceRouterItem deviceRouterItem2 = (DeviceRouterItem) value;
                Iterator<T> it = data.iterator();
                while (true) {
                    deviceRouterItem = null;
                    if (it.hasNext()) {
                        obj2 = it.next();
                        if (Intrinsics.areEqual(((DeviceRouterItem) obj2).getDeviceOfferCode(), str)) {
                            break;
                        }
                    } else {
                        obj2 = null;
                        break;
                    }
                }
                DeviceRouterItem deviceRouterItem3 = (DeviceRouterItem) obj2;
                if (deviceRouterItem3 != null && (deviceMeshList = deviceRouterItem3.getDeviceMeshList()) != null) {
                    ArrayList arrayList = new ArrayList();
                    int i = 0;
                    for (Object obj3 : deviceMeshList) {
                        int i2 = i + 1;
                        if (i < 0) {
                            CollectionsKt__CollectionsKt.throwIndexOverflow();
                        }
                        DeviceMeshItem deviceMeshItem = (DeviceMeshItem) obj3;
                        if (i == 0) {
                            arrayList.add(obj3);
                        }
                        i = i2;
                    }
                    emptyList = arrayList;
                } else {
                    emptyList = CollectionsKt__CollectionsKt.emptyList();
                }
                if (deviceRouterItem3 != null) {
                    deviceRouterItem = DeviceRouterItem.copy$default(deviceRouterItem3, null, null, false, emptyList, 7, null);
                }
            } while (!mutableStateFlow.compareAndSet(value, deviceRouterItem));
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }

    @Override // kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
        return ((OneRegisterTrueOnlineViewModel$onDeviceRouterSelected$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }
}