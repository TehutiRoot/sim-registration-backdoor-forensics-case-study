package th.p047co.dtac.android.dtacone.viewmodel.mrtr_prepaid_multi_sim;

import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.functions.Function;
import io.reactivex.rxkotlin.DisposableKt;
import io.reactivex.rxkotlin.SubscribersKt;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;
import th.p047co.dtac.android.dtacone.manager.service.Rx2ThreadService;
import th.p047co.dtac.android.dtacone.model.mrtr_prepaid_multi_sim.MultiSubscriber;
import th.p047co.dtac.android.dtacone.model.mrtr_prepaid_multi_sim.register.MrtrPrepaidRegisterMultiSimRequest;

@Metadata(m29143d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m29142d2 = {"<anonymous>", "", "invoke"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.viewmodel.mrtr_prepaid_multi_sim.MrtrPrepaidMultiSimViewModel$callSubmit$1 */
/* loaded from: classes9.dex */
public final class MrtrPrepaidMultiSimViewModel$callSubmit$1 extends Lambda implements Function0<Unit> {
    final /* synthetic */ MrtrPrepaidMultiSimViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MrtrPrepaidMultiSimViewModel$callSubmit$1(MrtrPrepaidMultiSimViewModel mrtrPrepaidMultiSimViewModel) {
        super(0);
        this.this$0 = mrtrPrepaidMultiSimViewModel;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ObservableSource invoke$lambda$4$lambda$0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (ObservableSource) tmp0.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ObservableSource invoke$lambda$4$lambda$1(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (ObservableSource) tmp0.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ObservableSource invoke$lambda$4$lambda$2(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (ObservableSource) tmp0.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ObservableSource invoke$lambda$4$lambda$3(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (ObservableSource) tmp0.invoke(obj);
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }

    /* JADX WARN: Type inference failed for: r12v0, types: [th.co.dtac.android.dtacone.model.mrtr_prepaid_multi_sim.MultiSubscriber, T] */
    /* JADX WARN: Type inference failed for: r15v0, types: [th.co.dtac.android.dtacone.model.mrtr_prepaid_multi_sim.register.MrtrPrepaidRegisterMultiSimRequest, T] */
    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2() {
        Rx2ThreadService rx2ThreadService;
        Ref.BooleanRef booleanRef = new Ref.BooleanRef();
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        objectRef.element = new MultiSubscriber(null, null, null, null, null, null, 63, null);
        Ref.ObjectRef objectRef2 = new Ref.ObjectRef();
        objectRef2.element = new MrtrPrepaidRegisterMultiSimRequest(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, Integer.MAX_VALUE, null);
        this.this$0.setMultiSimSubmitResultList(new ArrayList());
        if (this.this$0.getSubscriberList() != null) {
            MrtrPrepaidMultiSimViewModel mrtrPrepaidMultiSimViewModel = this.this$0;
            List<MultiSubscriber> subscriberList = mrtrPrepaidMultiSimViewModel.getSubscriberList();
            Observable fromIterable = Observable.fromIterable(subscriberList != null ? CollectionsKt___CollectionsKt.withIndex(subscriberList) : null);
            final MrtrPrepaidMultiSimViewModel$callSubmit$1$1$1 mrtrPrepaidMultiSimViewModel$callSubmit$1$1$1 = new MrtrPrepaidMultiSimViewModel$callSubmit$1$1$1(booleanRef, mrtrPrepaidMultiSimViewModel, objectRef);
            Observable flatMap = fromIterable.flatMap(new Function() { // from class: th.co.dtac.android.dtacone.viewmodel.mrtr_prepaid_multi_sim.a
                @Override // io.reactivex.functions.Function
                public final Object apply(Object obj) {
                    ObservableSource invoke$lambda$4$lambda$0;
                    invoke$lambda$4$lambda$0 = MrtrPrepaidMultiSimViewModel$callSubmit$1.invoke$lambda$4$lambda$0(Function1.this, obj);
                    return invoke$lambda$4$lambda$0;
                }
            });
            final MrtrPrepaidMultiSimViewModel$callSubmit$1$1$2 mrtrPrepaidMultiSimViewModel$callSubmit$1$1$2 = new MrtrPrepaidMultiSimViewModel$callSubmit$1$1$2(objectRef2, mrtrPrepaidMultiSimViewModel, booleanRef);
            Observable flatMap2 = flatMap.flatMap(new Function() { // from class: th.co.dtac.android.dtacone.viewmodel.mrtr_prepaid_multi_sim.b
                @Override // io.reactivex.functions.Function
                public final Object apply(Object obj) {
                    ObservableSource invoke$lambda$4$lambda$1;
                    invoke$lambda$4$lambda$1 = MrtrPrepaidMultiSimViewModel$callSubmit$1.invoke$lambda$4$lambda$1(Function1.this, obj);
                    return invoke$lambda$4$lambda$1;
                }
            });
            final MrtrPrepaidMultiSimViewModel$callSubmit$1$1$3 mrtrPrepaidMultiSimViewModel$callSubmit$1$1$3 = new MrtrPrepaidMultiSimViewModel$callSubmit$1$1$3(booleanRef, mrtrPrepaidMultiSimViewModel, objectRef);
            Observable flatMap3 = flatMap2.flatMap(new Function() { // from class: th.co.dtac.android.dtacone.viewmodel.mrtr_prepaid_multi_sim.c
                @Override // io.reactivex.functions.Function
                public final Object apply(Object obj) {
                    ObservableSource invoke$lambda$4$lambda$2;
                    invoke$lambda$4$lambda$2 = MrtrPrepaidMultiSimViewModel$callSubmit$1.invoke$lambda$4$lambda$2(Function1.this, obj);
                    return invoke$lambda$4$lambda$2;
                }
            });
            final MrtrPrepaidMultiSimViewModel$callSubmit$1$1$4 mrtrPrepaidMultiSimViewModel$callSubmit$1$1$4 = new MrtrPrepaidMultiSimViewModel$callSubmit$1$1$4(mrtrPrepaidMultiSimViewModel, booleanRef, objectRef, objectRef2);
            Observable flatMap4 = flatMap3.flatMap(new Function() { // from class: th.co.dtac.android.dtacone.viewmodel.mrtr_prepaid_multi_sim.d
                @Override // io.reactivex.functions.Function
                public final Object apply(Object obj) {
                    ObservableSource invoke$lambda$4$lambda$3;
                    invoke$lambda$4$lambda$3 = MrtrPrepaidMultiSimViewModel$callSubmit$1.invoke$lambda$4$lambda$3(Function1.this, obj);
                    return invoke$lambda$4$lambda$3;
                }
            });
            rx2ThreadService = mrtrPrepaidMultiSimViewModel.f106672d;
            Observable compose = flatMap4.compose(rx2ThreadService.applyAsync());
            Intrinsics.checkNotNullExpressionValue(compose, "fun callSubmit() {\n     …        }\n        }\n    }");
            DisposableKt.addTo(SubscribersKt.subscribeBy(compose, new MrtrPrepaidMultiSimViewModel$callSubmit$1$1$5(mrtrPrepaidMultiSimViewModel), new MrtrPrepaidMultiSimViewModel$callSubmit$1$1$6(mrtrPrepaidMultiSimViewModel), new MrtrPrepaidMultiSimViewModel$callSubmit$1$1$7(mrtrPrepaidMultiSimViewModel)), mrtrPrepaidMultiSimViewModel.getDisposable());
        }
    }
}