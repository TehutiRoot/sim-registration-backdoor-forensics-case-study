package th.p047co.dtac.android.dtacone.view.appOne.tol.viewmodel;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
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
@DebugMetadata(m29093c = "th.co.dtac.android.dtacone.view.appOne.tol.viewmodel.OneRegisterTrueOnlineViewModel$onDeviceMeshSelected$1", m29092f = "OneRegisterTrueOnlineViewModel.kt", m29091i = {}, m29090l = {}, m29089m = "invokeSuspend", m29088n = {}, m29087s = {})
@SourceDebugExtension({"SMAP\nOneRegisterTrueOnlineViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OneRegisterTrueOnlineViewModel.kt\nth/co/dtac/android/dtacone/view/appOne/tol/viewmodel/OneRegisterTrueOnlineViewModel$onDeviceMeshSelected$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 StateFlow.kt\nkotlinx/coroutines/flow/StateFlowKt\n*L\n1#1,2372:1\n288#2,2:2373\n766#2:2378\n857#2,2:2379\n230#3,3:2375\n233#3,2:2381\n*S KotlinDebug\n*F\n+ 1 OneRegisterTrueOnlineViewModel.kt\nth/co/dtac/android/dtacone/view/appOne/tol/viewmodel/OneRegisterTrueOnlineViewModel$onDeviceMeshSelected$1\n*L\n1577#1:2373,2\n1580#1:2378\n1580#1:2379,2\n1578#1:2375,3\n1578#1:2381,2\n*E\n"})
/* renamed from: th.co.dtac.android.dtacone.view.appOne.tol.viewmodel.OneRegisterTrueOnlineViewModel$onDeviceMeshSelected$1 */
/* loaded from: classes10.dex */
public final class OneRegisterTrueOnlineViewModel$onDeviceMeshSelected$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $meshModelCode;
    int label;
    final /* synthetic */ OneRegisterTrueOnlineViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OneRegisterTrueOnlineViewModel$onDeviceMeshSelected$1(OneRegisterTrueOnlineViewModel oneRegisterTrueOnlineViewModel, String str, Continuation<? super OneRegisterTrueOnlineViewModel$onDeviceMeshSelected$1> continuation) {
        super(2, continuation);
        this.this$0 = oneRegisterTrueOnlineViewModel;
        this.$meshModelCode = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new OneRegisterTrueOnlineViewModel$onDeviceMeshSelected$1(this.this$0, this.$meshModelCode, continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        DeviceListState.Success success;
        List<DeviceRouterItem> list;
        DeviceRouterItem deviceRouterItem;
        Object value;
        DeviceRouterItem deviceRouterItem2;
        Object obj2;
        String str;
        AbstractC19782eg0.getCOROUTINE_SUSPENDED();
        if (this.label == 0) {
            ResultKt.throwOnFailure(obj);
            Object value2 = this.this$0.f98195P0.getValue();
            if (value2 instanceof DeviceListState.Success) {
                success = (DeviceListState.Success) value2;
            } else {
                success = null;
            }
            if (success != null) {
                list = success.getData();
            } else {
                list = null;
            }
            if (list != null) {
                OneRegisterTrueOnlineViewModel oneRegisterTrueOnlineViewModel = this.this$0;
                Iterator<T> it = list.iterator();
                while (true) {
                    if (it.hasNext()) {
                        obj2 = it.next();
                        String deviceOfferCode = ((DeviceRouterItem) obj2).getDeviceOfferCode();
                        DeviceRouterItem device2 = oneRegisterTrueOnlineViewModel.f98221c.getDevice();
                        if (device2 != null) {
                            str = device2.getDeviceOfferCode();
                        } else {
                            str = null;
                        }
                        if (Intrinsics.areEqual(deviceOfferCode, str)) {
                            break;
                        }
                    } else {
                        obj2 = null;
                        break;
                    }
                }
                deviceRouterItem = (DeviceRouterItem) obj2;
            } else {
                deviceRouterItem = null;
            }
            MutableStateFlow mutableStateFlow = this.this$0.f98199R0;
            String str2 = this.$meshModelCode;
            do {
                value = mutableStateFlow.getValue();
                DeviceRouterItem deviceRouterItem3 = (DeviceRouterItem) value;
                if (deviceRouterItem != null) {
                    ArrayList arrayList = new ArrayList();
                    for (Object obj3 : deviceRouterItem.getDeviceMeshList()) {
                        if (Intrinsics.areEqual(((DeviceMeshItem) obj3).getMeshOfferCode(), str2)) {
                            arrayList.add(obj3);
                        }
                    }
                    deviceRouterItem2 = DeviceRouterItem.copy$default(deviceRouterItem, null, null, false, arrayList, 7, null);
                } else {
                    deviceRouterItem2 = null;
                }
            } while (!mutableStateFlow.compareAndSet(value, deviceRouterItem2));
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }

    @Override // kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
        return ((OneRegisterTrueOnlineViewModel$onDeviceMeshSelected$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }
}