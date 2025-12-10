package kotlin.sequences;

import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.jvm.internal.markers.KMappedMarker;
import org.jetbrains.annotations.NotNull;

@Metadata(m29143d1 = {"\u0000!\n\u0000\n\u0002\u0010(\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\b*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0006\u001a\u00020\u0005H\u0096\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0004\b\b\u0010\tR\u001d\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\u00018\u0006¢\u0006\f\n\u0004\b\u0003\u0010\n\u001a\u0004\b\u000b\u0010\fR\"\u0010\u0015\u001a\u00020\u000e8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014¨\u0006\u0016"}, m29142d2 = {"kotlin/sequences/SubSequence$iterator$1", "", "", PDPageLabelRange.STYLE_LETTERS_LOWER, "()V", "", "hasNext", "()Z", "next", "()Ljava/lang/Object;", "Ljava/util/Iterator;", "getIterator", "()Ljava/util/Iterator;", "iterator", "", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "I", "getPosition", "()I", "setPosition", "(I)V", "position", "kotlin-stdlib"}, m29141k = 1, m29140mv = {1, 9, 0})
/* loaded from: classes6.dex */
public final class SubSequence$iterator$1 implements Iterator<T>, KMappedMarker {

    /* renamed from: a */
    public final Iterator f70501a;

    /* renamed from: b */
    public int f70502b;

    /* renamed from: c */
    public final /* synthetic */ SubSequence f70503c;

    public SubSequence$iterator$1(SubSequence subSequence) {
        Sequence sequence;
        this.f70503c = subSequence;
        sequence = subSequence.f70498a;
        this.f70501a = sequence.iterator();
    }

    /* JADX WARN: Incorrect condition in loop: B:3:0x0008 */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void m27764a() {
        /*
            r2 = this;
        L0:
            int r0 = r2.f70502b
            kotlin.sequences.SubSequence r1 = r2.f70503c
            int r1 = kotlin.sequences.SubSequence.access$getStartIndex$p(r1)
            if (r0 >= r1) goto L1e
            java.util.Iterator r0 = r2.f70501a
            boolean r0 = r0.hasNext()
            if (r0 == 0) goto L1e
            java.util.Iterator r0 = r2.f70501a
            r0.next()
            int r0 = r2.f70502b
            int r0 = r0 + 1
            r2.f70502b = r0
            goto L0
        L1e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.sequences.SubSequence$iterator$1.m27764a():void");
    }

    @NotNull
    public final Iterator<T> getIterator() {
        return this.f70501a;
    }

    public final int getPosition() {
        return this.f70502b;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        int i;
        m27764a();
        int i2 = this.f70502b;
        i = this.f70503c.f70500c;
        if (i2 < i && this.f70501a.hasNext()) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [T, java.lang.Object] */
    @Override // java.util.Iterator
    public T next() {
        int i;
        m27764a();
        int i2 = this.f70502b;
        i = this.f70503c.f70500c;
        if (i2 < i) {
            this.f70502b++;
            return this.f70501a.next();
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final void setPosition(int i) {
        this.f70502b = i;
    }
}