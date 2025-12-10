package io.fotoapparat.result;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import org.jetbrains.annotations.Nullable;

@Metadata(m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* loaded from: classes5.dex */
public /* synthetic */ class PendingResult$whenDone$1 extends FunctionReferenceImpl implements Function1<T, Unit> {
    public PendingResult$whenDone$1(Object obj) {
        super(1, obj, WhenDoneListener.class, "whenDone", "whenDone(Ljava/lang/Object;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Object obj) {
        invoke2((PendingResult$whenDone$1) obj);
        return Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function1
    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(@Nullable T t) {
        ((WhenDoneListener) this.receiver).whenDone(t);
    }
}