package th.p047co.dtac.android.dtacone.view.appOne.tol.viewmodel;

import java.util.ArrayList;
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

@Metadata(m29143d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m29142d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
@DebugMetadata(m29093c = "th.co.dtac.android.dtacone.view.appOne.tol.viewmodel.OneRegisterTrueOnlineViewModel$onDeviceMeshInc$1", m29092f = "OneRegisterTrueOnlineViewModel.kt", m29091i = {}, m29090l = {}, m29089m = "invokeSuspend", m29088n = {}, m29087s = {})
@SourceDebugExtension({"SMAP\nOneRegisterTrueOnlineViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OneRegisterTrueOnlineViewModel.kt\nth/co/dtac/android/dtacone/view/appOne/tol/viewmodel/OneRegisterTrueOnlineViewModel$onDeviceMeshInc$1\n+ 2 StateFlow.kt\nkotlinx/coroutines/flow/StateFlowKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,2372:1\n230#2,3:2373\n233#2,2:2380\n1549#3:2376\n1620#3,3:2377\n*S KotlinDebug\n*F\n+ 1 OneRegisterTrueOnlineViewModel.kt\nth/co/dtac/android/dtacone/view/appOne/tol/viewmodel/OneRegisterTrueOnlineViewModel$onDeviceMeshInc$1\n*L\n1589#1:2373,3\n1589#1:2380,2\n1591#1:2376\n1591#1:2377,3\n*E\n"})
/* renamed from: th.co.dtac.android.dtacone.view.appOne.tol.viewmodel.OneRegisterTrueOnlineViewModel$onDeviceMeshInc$1 */
/* loaded from: classes10.dex */
public final class OneRegisterTrueOnlineViewModel$onDeviceMeshInc$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $meshModelCode;
    int label;
    final /* synthetic */ OneRegisterTrueOnlineViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OneRegisterTrueOnlineViewModel$onDeviceMeshInc$1(OneRegisterTrueOnlineViewModel oneRegisterTrueOnlineViewModel, String str, Continuation<? super OneRegisterTrueOnlineViewModel$onDeviceMeshInc$1> continuation) {
        super(2, continuation);
        this.this$0 = oneRegisterTrueOnlineViewModel;
        this.$meshModelCode = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new OneRegisterTrueOnlineViewModel$onDeviceMeshInc$1(this.this$0, this.$meshModelCode, continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        Object value;
        DeviceRouterItem deviceRouterItem;
        AbstractC19782eg0.getCOROUTINE_SUSPENDED();
        if (this.label == 0) {
            ResultKt.throwOnFailure(obj);
            MutableStateFlow mutableStateFlow = this.this$0.f98199R0;
            String str = this.$meshModelCode;
            do {
                value = mutableStateFlow.getValue();
                DeviceRouterItem deviceRouterItem2 = (DeviceRouterItem) value;
                if (deviceRouterItem2 != null) {
                    List<DeviceMeshItem> deviceMeshList = deviceRouterItem2.getDeviceMeshList();
                    ArrayList arrayList = new ArrayList(AbstractC10172es.collectionSizeOrDefault(deviceMeshList, 10));
                    for (DeviceMeshItem deviceMeshItem : deviceMeshList) {
                        if (Intrinsics.areEqual(deviceMeshItem.getMeshOfferCode(), str) && deviceMeshItem.getMeshQuantity() < deviceMeshItem.getMeshAvailableValue()) {
                            deviceMeshItem = DeviceMeshItem.copy$default(deviceMeshItem, null, null, null, 0, deviceMeshItem.getMeshQuantity() + 1, 15, null);
                        }
                        arrayList.add(deviceMeshItem);
                    }
                    deviceRouterItem = DeviceRouterItem.copy$default(deviceRouterItem2, null, null, false, arrayList, 7, null);
                } else {
                    deviceRouterItem = null;
                }
            } while (!mutableStateFlow.compareAndSet(value, deviceRouterItem));
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }

    @Override // kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
        return ((OneRegisterTrueOnlineViewModel$onDeviceMeshInc$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }
}