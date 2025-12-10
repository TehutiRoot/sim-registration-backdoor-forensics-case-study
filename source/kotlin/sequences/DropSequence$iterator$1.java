package kotlin.sequences;

import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.markers.KMappedMarker;
import org.jetbrains.annotations.NotNull;

@Metadata(m28851d1 = {"\u0000%\n\u0000\n\u0002\u0010(\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\b*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u0010\u0010\u0002\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004H\u0096\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\b\u0010\tR\u001d\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\u00018\u0006¢\u0006\f\n\u0004\b\b\u0010\n\u001a\u0004\b\u000b\u0010\fR\"\u0010\u0015\u001a\u00020\u000e8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014¨\u0006\u0016"}, m28850d2 = {"kotlin/sequences/DropSequence$iterator$1", "", "next", "()Ljava/lang/Object;", "", "hasNext", "()Z", "", PDPageLabelRange.STYLE_LETTERS_LOWER, "()V", "Ljava/util/Iterator;", "getIterator", "()Ljava/util/Iterator;", "iterator", "", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "I", "getLeft", "()I", "setLeft", "(I)V", "left", "kotlin-stdlib"}, m28849k = 1, m28848mv = {1, 9, 0})
/* loaded from: classes6.dex */
public final class DropSequence$iterator$1 implements Iterator<T>, KMappedMarker {

    /* renamed from: a */
    public final Iterator f70412a;

    /* renamed from: b */
    public int f70413b;

    public DropSequence$iterator$1(DropSequence dropSequence) {
        Sequence sequence;
        int i;
        sequence = dropSequence.f70410a;
        this.f70412a = sequence.iterator();
        i = dropSequence.f70411b;
        this.f70413b = i;
    }

    /* renamed from: a */
    public final void m27481a() {
        while (this.f70413b > 0 && this.f70412a.hasNext()) {
            this.f70412a.next();
            this.f70413b--;
        }
    }

    @NotNull
    public final Iterator<T> getIterator() {
        return this.f70412a;
    }

    public final int getLeft() {
        return this.f70413b;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        m27481a();
        return this.f70412a.hasNext();
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [T, java.lang.Object] */
    @Override // java.util.Iterator
    public T next() {
        m27481a();
        return this.f70412a.next();
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final void setLeft(int i) {
        this.f70413b = i;
    }
}
