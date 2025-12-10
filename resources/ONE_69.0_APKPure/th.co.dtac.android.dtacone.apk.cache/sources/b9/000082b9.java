package com.chuckerteam.chucker.internal.support;

import androidx.lifecycle.MediatorLiveData;
import java.util.concurrent.Executor;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;

@Metadata(m29143d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u000e\u0010\u0003\u001a\n \u0004*\u0004\u0018\u0001H\u0002H\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m29142d2 = {"<anonymous>", "", "T", "new", "kotlin.jvm.PlatformType", "invoke", "(Ljava/lang/Object;)V"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* loaded from: classes3.dex */
public final class LiveDataUtilsKt$distinctUntilChanged$2 extends Lambda implements Function1<T, Unit> {
    final /* synthetic */ Function2<T, T, Boolean> $areEqual;
    final /* synthetic */ MediatorLiveData<T> $distinctMediator;
    final /* synthetic */ Executor $executor;
    final /* synthetic */ Ref.ObjectRef<Object> $old;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public LiveDataUtilsKt$distinctUntilChanged$2(Executor executor, Ref.ObjectRef<Object> objectRef, Function2<? super T, ? super T, Boolean> function2, MediatorLiveData<T> mediatorLiveData) {
        super(1);
        this.$executor = executor;
        this.$old = objectRef;
        this.$areEqual = function2;
        this.$distinctMediator = mediatorLiveData;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void invoke$lambda$0(Ref.ObjectRef old, Function2 areEqual, Object obj, MediatorLiveData distinctMediator) {
        Object obj2;
        Intrinsics.checkNotNullParameter(old, "$old");
        Intrinsics.checkNotNullParameter(areEqual, "$areEqual");
        Intrinsics.checkNotNullParameter(distinctMediator, "$distinctMediator");
        Object obj3 = old.element;
        obj2 = LiveDataUtilsKt.f42954a;
        if (obj3 == obj2 || !((Boolean) areEqual.invoke(old.element, obj)).booleanValue()) {
            old.element = obj;
            distinctMediator.postValue(obj);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Object obj) {
        invoke2((LiveDataUtilsKt$distinctUntilChanged$2) obj);
        return Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function1
    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(final T t) {
        Executor executor = this.$executor;
        final Ref.ObjectRef<Object> objectRef = this.$old;
        final Function2<T, T, Boolean> function2 = this.$areEqual;
        final MediatorLiveData<T> mediatorLiveData = this.$distinctMediator;
        executor.execute(new Runnable() { // from class: com.chuckerteam.chucker.internal.support.a
            @Override // java.lang.Runnable
            public final void run() {
                LiveDataUtilsKt$distinctUntilChanged$2.invoke$lambda$0(Ref.ObjectRef.this, function2, t, mediatorLiveData);
            }
        });
    }
}