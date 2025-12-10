package kotlin.sequences;

import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.KMappedMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(m29143d1 = {"\u0000\u0015\n\u0000\n\u0002\u0010(\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\r*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u0010\u0010\u0002\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004H\u0096\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\u0006R\u001d\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00010\u00018\u0006¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\nR*\u0010\u0010\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u00018\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\f\u0010\b\u001a\u0004\b\r\u0010\n\"\u0004\b\u000e\u0010\u000f¨\u0006\u0011"}, m29142d2 = {"kotlin/sequences/FlatteningSequence$iterator$1", "", "next", "()Ljava/lang/Object;", "", "hasNext", "()Z", PDPageLabelRange.STYLE_LETTERS_LOWER, "Ljava/util/Iterator;", "getIterator", "()Ljava/util/Iterator;", "iterator", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "getItemIterator", "setItemIterator", "(Ljava/util/Iterator;)V", "itemIterator", "kotlin-stdlib"}, m29141k = 1, m29140mv = {1, 9, 0})
/* loaded from: classes6.dex */
public final class FlatteningSequence$iterator$1 implements Iterator<E>, KMappedMarker {

    /* renamed from: a */
    public final Iterator f70464a;

    /* renamed from: b */
    public Iterator f70465b;

    /* renamed from: c */
    public final /* synthetic */ FlatteningSequence f70466c;

    public FlatteningSequence$iterator$1(FlatteningSequence flatteningSequence) {
        Sequence sequence;
        this.f70466c = flatteningSequence;
        sequence = flatteningSequence.f70461a;
        this.f70464a = sequence.iterator();
    }

    /* renamed from: a */
    public final boolean m27770a() {
        Function1 function1;
        Function1 function12;
        Iterator it = this.f70465b;
        if (it != null && !it.hasNext()) {
            this.f70465b = null;
        }
        while (true) {
            if (this.f70465b == null) {
                if (!this.f70464a.hasNext()) {
                    return false;
                }
                Object next = this.f70464a.next();
                function1 = this.f70466c.f70463c;
                function12 = this.f70466c.f70462b;
                Iterator it2 = (Iterator) function1.invoke(function12.invoke(next));
                if (it2.hasNext()) {
                    this.f70465b = it2;
                    break;
                }
            } else {
                break;
            }
        }
        return true;
    }

    @Nullable
    public final Iterator<E> getItemIterator() {
        return this.f70465b;
    }

    @NotNull
    public final Iterator<T> getIterator() {
        return this.f70464a;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return m27770a();
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [E, java.lang.Object] */
    @Override // java.util.Iterator
    public E next() {
        if (m27770a()) {
            Iterator it = this.f70465b;
            Intrinsics.checkNotNull(it);
            return it.next();
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final void setItemIterator(@Nullable Iterator<? extends E> it) {
        this.f70465b = it;
    }
}