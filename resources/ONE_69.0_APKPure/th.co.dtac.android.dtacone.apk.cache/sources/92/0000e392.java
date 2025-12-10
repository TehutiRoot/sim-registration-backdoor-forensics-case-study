package kotlin.sequences;

import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.markers.KMappedMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(m29143d1 = {"\u0000!\n\u0000\n\u0002\u0010(\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u000e*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007H\u0096\u0002¢\u0006\u0004\b\b\u0010\tR\u001d\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\u00018\u0006¢\u0006\f\n\u0004\b\u0003\u0010\n\u001a\u0004\b\u000b\u0010\fR\"\u0010\u0015\u001a\u00020\u000e8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R$\u0010\u001b\u001a\u0004\u0018\u00018\u00008\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0006\"\u0004\b\u0019\u0010\u001a¨\u0006\u001c"}, m29142d2 = {"kotlin/sequences/TakeWhileSequence$iterator$1", "", "", PDPageLabelRange.STYLE_LETTERS_LOWER, "()V", "next", "()Ljava/lang/Object;", "", "hasNext", "()Z", "Ljava/util/Iterator;", "getIterator", "()Ljava/util/Iterator;", "iterator", "", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "I", "getNextState", "()I", "setNextState", "(I)V", "nextState", OperatorName.CURVE_TO, "Ljava/lang/Object;", "getNextItem", "setNextItem", "(Ljava/lang/Object;)V", "nextItem", "kotlin-stdlib"}, m29141k = 1, m29140mv = {1, 9, 0})
/* loaded from: classes6.dex */
public final class TakeWhileSequence$iterator$1 implements Iterator<T>, KMappedMarker {

    /* renamed from: a */
    public final Iterator f70510a;

    /* renamed from: b */
    public int f70511b;

    /* renamed from: c */
    public Object f70512c;

    /* renamed from: d */
    public final /* synthetic */ TakeWhileSequence f70513d;

    public TakeWhileSequence$iterator$1(TakeWhileSequence takeWhileSequence) {
        Sequence sequence;
        this.f70513d = takeWhileSequence;
        sequence = takeWhileSequence.f70508a;
        this.f70510a = sequence.iterator();
        this.f70511b = -1;
    }

    /* renamed from: a */
    private final void m27763a() {
        Function1 function1;
        if (this.f70510a.hasNext()) {
            Object next = this.f70510a.next();
            function1 = this.f70513d.f70509b;
            if (((Boolean) function1.invoke(next)).booleanValue()) {
                this.f70511b = 1;
                this.f70512c = next;
                return;
            }
        }
        this.f70511b = 0;
    }

    @NotNull
    public final Iterator<T> getIterator() {
        return this.f70510a;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [T, java.lang.Object] */
    @Nullable
    public final T getNextItem() {
        return this.f70512c;
    }

    public final int getNextState() {
        return this.f70511b;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        if (this.f70511b == -1) {
            m27763a();
        }
        if (this.f70511b == 1) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [T, java.lang.Object] */
    @Override // java.util.Iterator
    public T next() {
        if (this.f70511b == -1) {
            m27763a();
        }
        if (this.f70511b != 0) {
            ?? r0 = this.f70512c;
            this.f70512c = null;
            this.f70511b = -1;
            return r0;
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final void setNextItem(@Nullable T t) {
        this.f70512c = t;
    }

    public final void setNextState(int i) {
        this.f70511b = i;
    }
}