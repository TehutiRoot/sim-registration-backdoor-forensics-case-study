package th.p047co.dtac.android.dtacone.view.appOne.tol.screen.inputInfo;

import androidx.compose.material3.SheetState;
import androidx.compose.runtime.MutableState;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import th.p047co.dtac.android.dtacone.view.appOne.tol.model.customerInfo.CustomerInfoAddress;
import th.p047co.dtac.android.dtacone.view.appOne.tol.model.customerInfo.CustomerInformation;
import th.p047co.dtac.android.dtacone.view.appOne.tol.model.customerInfo.address.PostCode;

@Metadata(m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
@SourceDebugExtension({"SMAP\nInputInfoScreen.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InputInfoScreen.kt\nth/co/dtac/android/dtacone/view/appOne/tol/screen/inputInfo/InputInfoScreenKt$InputInfoScreen$7\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,1296:1\n1559#2:1297\n1590#2,4:1298\n*S KotlinDebug\n*F\n+ 1 InputInfoScreen.kt\nth/co/dtac/android/dtacone/view/appOne/tol/screen/inputInfo/InputInfoScreenKt$InputInfoScreen$7\n*L\n218#1:1297\n218#1:1298,4\n*E\n"})
/* renamed from: th.co.dtac.android.dtacone.view.appOne.tol.screen.inputInfo.InputInfoScreenKt$InputInfoScreen$7 */
/* loaded from: classes10.dex */
public final class InputInfoScreenKt$InputInfoScreen$7 extends Lambda implements Function1<PostCode, Unit> {
    final /* synthetic */ SheetState $addressSheetState;
    final /* synthetic */ CustomerInformation $customerInfo;
    final /* synthetic */ Function1<CustomerInformation, Unit> $onCustomerInfoChange;
    final /* synthetic */ CoroutineScope $scope;
    final /* synthetic */ MutableState<Boolean> $showAddressSelectSheet$delegate;

    @Metadata(m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
    @DebugMetadata(m29093c = "th.co.dtac.android.dtacone.view.appOne.tol.screen.inputInfo.InputInfoScreenKt$InputInfoScreen$7$2", m29092f = "InputInfoScreen.kt", m29091i = {}, m29090l = {221}, m29089m = "invokeSuspend", m29088n = {}, m29087s = {})
    /* renamed from: th.co.dtac.android.dtacone.view.appOne.tol.screen.inputInfo.InputInfoScreenKt$InputInfoScreen$7$2 */
    /* loaded from: classes10.dex */
    public static final class C154882 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ SheetState $addressSheetState;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C154882(SheetState sheetState, Continuation<? super C154882> continuation) {
            super(2, continuation);
            this.$addressSheetState = sheetState;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new C154882(this.$addressSheetState, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = AbstractC19782eg0.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i != 0) {
                if (i == 1) {
                    ResultKt.throwOnFailure(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.throwOnFailure(obj);
                SheetState sheetState = this.$addressSheetState;
                this.label = 1;
                if (sheetState.hide(this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((C154882) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @Metadata(m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
    /* renamed from: th.co.dtac.android.dtacone.view.appOne.tol.screen.inputInfo.InputInfoScreenKt$InputInfoScreen$7$3 */
    /* loaded from: classes10.dex */
    public static final class C154893 extends Lambda implements Function1<Throwable, Unit> {
        final /* synthetic */ MutableState<Boolean> $showAddressSelectSheet$delegate;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C154893(MutableState<Boolean> mutableState) {
            super(1);
            this.$showAddressSelectSheet$delegate = mutableState;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th2) {
            invoke2(th2);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(@Nullable Throwable th2) {
            InputInfoScreenKt.m9505p(this.$showAddressSelectSheet$delegate, false);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public InputInfoScreenKt$InputInfoScreen$7(Function1<? super CustomerInformation, Unit> function1, CustomerInformation customerInformation, CoroutineScope coroutineScope, SheetState sheetState, MutableState<Boolean> mutableState) {
        super(1);
        this.$onCustomerInfoChange = function1;
        this.$customerInfo = customerInformation;
        this.$scope = coroutineScope;
        this.$addressSheetState = sheetState;
        this.$showAddressSelectSheet$delegate = mutableState;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(PostCode postCode) {
        invoke2(postCode);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(@Nullable PostCode postCode) {
        CustomerInformation copy;
        Job m65885e;
        Function1<CustomerInformation, Unit> function1 = this.$onCustomerInfoChange;
        CustomerInformation customerInformation = this.$customerInfo;
        List<CustomerInfoAddress> addressList = customerInformation.getAddressList();
        CustomerInformation customerInformation2 = this.$customerInfo;
        ArrayList arrayList = new ArrayList(AbstractC10172es.collectionSizeOrDefault(addressList, 10));
        int i = 0;
        for (Object obj : addressList) {
            int i2 = i + 1;
            if (i < 0) {
                CollectionsKt__CollectionsKt.throwIndexOverflow();
            }
            CustomerInfoAddress customerInfoAddress = (CustomerInfoAddress) obj;
            if (i == customerInformation2.getAddressType().ordinal()) {
                customerInfoAddress = CustomerInfoAddress.copy$default(customerInfoAddress, null, null, null, null, null, (postCode == null || (r5 = postCode.getPostCode()) == null) ? "" : "", 31, null);
            }
            arrayList.add(customerInfoAddress);
            i = i2;
        }
        copy = customerInformation.copy((r24 & 1) != 0 ? customerInformation.f97990a : null, (r24 & 2) != 0 ? customerInformation.f97991b : null, (r24 & 4) != 0 ? customerInformation.f97992c : null, (r24 & 8) != 0 ? customerInformation.f97993d : null, (r24 & 16) != 0 ? customerInformation.f97994e : null, (r24 & 32) != 0 ? customerInformation.f97995f : arrayList, (r24 & 64) != 0 ? customerInformation.f97996g : null, (r24 & 128) != 0 ? customerInformation.f97997h : null, (r24 & 256) != 0 ? customerInformation.f97998i : null, (r24 & 512) != 0 ? customerInformation.f97999j : null, (r24 & 1024) != 0 ? customerInformation.f98000k : null);
        function1.invoke(copy);
        m65885e = AbstractC1539Vc.m65885e(this.$scope, null, null, new C154882(this.$addressSheetState, null), 3, null);
        m65885e.invokeOnCompletion(new C154893(this.$showAddressSelectSheet$delegate));
    }
}