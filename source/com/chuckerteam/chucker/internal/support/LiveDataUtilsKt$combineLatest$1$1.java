package com.chuckerteam.chucker.internal.support;

import androidx.lifecycle.MediatorLiveData;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;

@Metadata(m28851d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003\"\u0004\b\u0002\u0010\u00042\u000e\u0010\u0005\u001a\n \u0006*\u0004\u0018\u0001H\u0002H\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, m28850d2 = {"<anonymous>", "", "T1", "T2", "R", "it", "kotlin.jvm.PlatformType", "invoke", "(Ljava/lang/Object;)V"}, m28849k = 3, m28848mv = {1, 8, 0}, m28846xi = 48)
/* loaded from: classes3.dex */
public final class LiveDataUtilsKt$combineLatest$1$1 extends Lambda implements Function1<T1, Unit> {
    final /* synthetic */ Function2<T1, T2, R> $func;
    final /* synthetic */ Ref.ObjectRef<T1> $lastA;
    final /* synthetic */ Ref.ObjectRef<T2> $lastB;
    final /* synthetic */ MediatorLiveData<R> $this_apply;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public LiveDataUtilsKt$combineLatest$1$1(Ref.ObjectRef<T1> objectRef, Ref.ObjectRef<T2> objectRef2, MediatorLiveData<R> mediatorLiveData, Function2<? super T1, ? super T2, ? extends R> function2) {
        super(1);
        this.$lastA = objectRef;
        this.$lastB = objectRef2;
        this.$this_apply = mediatorLiveData;
        this.$func = function2;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Object obj) {
        invoke2((LiveDataUtilsKt$combineLatest$1$1) obj);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function1
    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(T1 t1) {
        this.$lastA.element = t1;
        Object obj = this.$lastB.element;
        if (t1 == 0 && this.$this_apply.getValue() != null) {
            this.$this_apply.setValue(null);
        } else if (t1 == 0 || obj == null) {
        } else {
            this.$this_apply.setValue(this.$func.invoke(t1, obj));
        }
    }
}
