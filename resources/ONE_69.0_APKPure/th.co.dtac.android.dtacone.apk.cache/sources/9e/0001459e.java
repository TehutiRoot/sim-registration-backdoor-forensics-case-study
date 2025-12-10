package th.p047co.dtac.android.dtacone.view.appOne.tol.viewmodel;

import io.realm.CollectionUtils;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import th.p047co.dtac.android.dtacone.view.appOne.tol.model.customerInfo.CustomerInformation;
import th.p047co.dtac.android.dtacone.view.appOne.tol.model.customerInfo.address.Province;

@Metadata(m29143d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\u008a@"}, m29142d2 = {"<anonymous>", "", CollectionUtils.LIST_TYPE, "", "Lth/co/dtac/android/dtacone/view/appOne/tol/model/customerInfo/address/Province;", "customer", "Lth/co/dtac/android/dtacone/view/appOne/tol/model/customerInfo/CustomerInformation;"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
@DebugMetadata(m29093c = "th.co.dtac.android.dtacone.view.appOne.tol.viewmodel.OneRegisterTrueOnlineViewModel$provinceId$1", m29092f = "OneRegisterTrueOnlineViewModel.kt", m29091i = {}, m29090l = {}, m29089m = "invokeSuspend", m29088n = {}, m29087s = {})
@SourceDebugExtension({"SMAP\nOneRegisterTrueOnlineViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OneRegisterTrueOnlineViewModel.kt\nth/co/dtac/android/dtacone/view/appOne/tol/viewmodel/OneRegisterTrueOnlineViewModel$provinceId$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,2372:1\n288#2,2:2373\n*S KotlinDebug\n*F\n+ 1 OneRegisterTrueOnlineViewModel.kt\nth/co/dtac/android/dtacone/view/appOne/tol/viewmodel/OneRegisterTrueOnlineViewModel$provinceId$1\n*L\n419#1:2373,2\n*E\n"})
/* renamed from: th.co.dtac.android.dtacone.view.appOne.tol.viewmodel.OneRegisterTrueOnlineViewModel$provinceId$1 */
/* loaded from: classes10.dex */
public final class OneRegisterTrueOnlineViewModel$provinceId$1 extends SuspendLambda implements Function3<List<? extends Province>, CustomerInformation, Continuation<? super Integer>, Object> {
    /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;
    final /* synthetic */ OneRegisterTrueOnlineViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OneRegisterTrueOnlineViewModel$provinceId$1(OneRegisterTrueOnlineViewModel oneRegisterTrueOnlineViewModel, Continuation<? super OneRegisterTrueOnlineViewModel$provinceId$1> continuation) {
        super(3, continuation);
        this.this$0 = oneRegisterTrueOnlineViewModel;
    }

    @Override // kotlin.jvm.functions.Function3
    public /* bridge */ /* synthetic */ Object invoke(List<? extends Province> list, CustomerInformation customerInformation, Continuation<? super Integer> continuation) {
        return invoke2((List<Province>) list, customerInformation, continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        String m9339j;
        Object obj2;
        int i;
        AbstractC19782eg0.getCOROUTINE_SUSPENDED();
        if (this.label == 0) {
            ResultKt.throwOnFailure(obj);
            CustomerInformation customerInformation = (CustomerInformation) this.L$1;
            m9339j = this.this$0.m9339j(customerInformation.getAddressList().get(customerInformation.getAddressType().ordinal()).getProvince());
            String obj3 = StringsKt__StringsKt.trim(m9339j).toString();
            Iterator it = ((List) this.L$0).iterator();
            while (true) {
                if (it.hasNext()) {
                    obj2 = it.next();
                    if (Intrinsics.areEqual(((Province) obj2).getName(), obj3)) {
                        break;
                    }
                } else {
                    obj2 = null;
                    break;
                }
            }
            Province province = (Province) obj2;
            if (province != null) {
                i = province.getId();
            } else {
                i = 0;
            }
            return Boxing.boxInt(i);
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }

    @Nullable
    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final Object invoke2(@NotNull List<Province> list, @NotNull CustomerInformation customerInformation, @Nullable Continuation<? super Integer> continuation) {
        OneRegisterTrueOnlineViewModel$provinceId$1 oneRegisterTrueOnlineViewModel$provinceId$1 = new OneRegisterTrueOnlineViewModel$provinceId$1(this.this$0, continuation);
        oneRegisterTrueOnlineViewModel$provinceId$1.L$0 = list;
        oneRegisterTrueOnlineViewModel$provinceId$1.L$1 = customerInformation;
        return oneRegisterTrueOnlineViewModel$provinceId$1.invokeSuspend(Unit.INSTANCE);
    }
}