package androidx.compose.runtime;

import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(m29143d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u001b\u0010\n\u001a\u00028\u00008BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0007\u0010\tR\u0014\u0010\f\u001a\u00028\u00008VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\t¨\u0006\r"}, m29142d2 = {"Landroidx/compose/runtime/LazyValueHolder;", "T", "Landroidx/compose/runtime/State;", "Lkotlin/Function0;", "valueProducer", "<init>", "(Lkotlin/jvm/functions/Function0;)V", PDPageLabelRange.STYLE_LETTERS_LOWER, "Lkotlin/Lazy;", "()Ljava/lang/Object;", "current", "getValue", "value", "runtime_release"}, m29141k = 1, m29140mv = {1, 8, 0})
/* loaded from: classes2.dex */
public final class LazyValueHolder<T> implements State<T> {

    /* renamed from: a */
    public final Lazy f28436a;

    public LazyValueHolder(@NotNull Function0<? extends T> valueProducer) {
        Intrinsics.checkNotNullParameter(valueProducer, "valueProducer");
        this.f28436a = LazyKt__LazyJVMKt.lazy(valueProducer);
    }

    /* renamed from: a */
    public final Object m60215a() {
        return this.f28436a.getValue();
    }

    @Override // androidx.compose.runtime.State
    public T getValue() {
        return (T) m60215a();
    }
}