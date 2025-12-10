package kotlin.sequences;

import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.KMappedMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(m29143d1 = {"\u0000!\n\u0000\n\u0002\u0010(\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\b*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007H\u0096\u0002¢\u0006\u0004\b\b\u0010\tR$\u0010\u000e\u001a\u0004\u0018\u00018\u00008\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\n\u001a\u0004\b\u000b\u0010\u0006\"\u0004\b\f\u0010\rR\"\u0010\u0016\u001a\u00020\u000f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, m29142d2 = {"kotlin/sequences/GeneratorSequence$iterator$1", "", "", PDPageLabelRange.STYLE_LETTERS_LOWER, "()V", "next", "()Ljava/lang/Object;", "", "hasNext", "()Z", "Ljava/lang/Object;", "getNextItem", "setNextItem", "(Ljava/lang/Object;)V", "nextItem", "", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "I", "getNextState", "()I", "setNextState", "(I)V", "nextState", "kotlin-stdlib"}, m29141k = 1, m29140mv = {1, 9, 0})
/* loaded from: classes6.dex */
public final class GeneratorSequence$iterator$1 implements Iterator<Object>, KMappedMarker {

    /* renamed from: a */
    public Object f70469a;

    /* renamed from: b */
    public int f70470b = -2;

    /* renamed from: c */
    public final /* synthetic */ GeneratorSequence f70471c;

    public GeneratorSequence$iterator$1(GeneratorSequence generatorSequence) {
        this.f70471c = generatorSequence;
    }

    /* renamed from: a */
    private final void m27767a() {
        Function1 function1;
        Object invoke;
        int i;
        Function0 function0;
        if (this.f70470b == -2) {
            function0 = this.f70471c.f70467a;
            invoke = function0.invoke();
        } else {
            function1 = this.f70471c.f70468b;
            Object obj = this.f70469a;
            Intrinsics.checkNotNull(obj);
            invoke = function1.invoke(obj);
        }
        this.f70469a = invoke;
        if (invoke == null) {
            i = 0;
        } else {
            i = 1;
        }
        this.f70470b = i;
    }

    @Nullable
    public final Object getNextItem() {
        return this.f70469a;
    }

    public final int getNextState() {
        return this.f70470b;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        if (this.f70470b < 0) {
            m27767a();
        }
        if (this.f70470b == 1) {
            return true;
        }
        return false;
    }

    @Override // java.util.Iterator
    @NotNull
    public Object next() {
        if (this.f70470b < 0) {
            m27767a();
        }
        if (this.f70470b != 0) {
            Object obj = this.f70469a;
            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type T of kotlin.sequences.GeneratorSequence");
            this.f70470b = -1;
            return obj;
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final void setNextItem(@Nullable Object obj) {
        this.f70469a = obj;
    }

    public final void setNextState(int i) {
        this.f70470b = i;
    }
}