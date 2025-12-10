package com.chuckerteam.chucker.internal.support;

import androidx.lifecycle.MediatorLiveData;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;

@Metadata(m29143d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003\"\u0004\b\u0002\u0010\u00042\u000e\u0010\u0005\u001a\n \u0006*\u0004\u0018\u0001H\u0003H\u0003H\n¢\u0006\u0004\b\u0007\u0010\b"}, m29142d2 = {"<anonymous>", "", "T1", "T2", "R", "it", "kotlin.jvm.PlatformType", "invoke", "(Ljava/lang/Object;)V"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* loaded from: classes3.dex */
public final class LiveDataUtilsKt$combineLatest$1$2 extends Lambda implements Function1<T2, Unit> {
    final /* synthetic */ Function2<T1, T2, R> $func;
    final /* synthetic */ Ref.ObjectRef<T1> $lastA;
    final /* synthetic */ Ref.ObjectRef<T2> $lastB;
    final /* synthetic */ MediatorLiveData<R> $this_apply;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public LiveDataUtilsKt$combineLatest$1$2(Ref.ObjectRef<T2> objectRef, Ref.ObjectRef<T1> objectRef2, MediatorLiveData<R> mediatorLiveData, Function2<? super T1, ? super T2, ? extends R> function2) {
        super(1);
        this.$lastB = objectRef;
        this.$lastA = objectRef2;
        this.$this_apply = mediatorLiveData;
        this.$func = function2;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Object obj) {
        invoke2((LiveDataUtilsKt$combineLatest$1$2) obj);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function1
    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(T2 t2) {
        this.$lastB.element = t2;
        Object obj = this.$lastA.element;
        if (t2 == 0 && this.$this_apply.getValue() != null) {
            this.$this_apply.setValue(null);
        } else if (obj == null || t2 == 0) {
        } else {
            this.$this_apply.setValue(this.$func.invoke(obj, t2));
        }
    }
}