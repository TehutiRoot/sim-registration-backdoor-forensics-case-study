package kotlin.collections;

import com.google.android.gms.analytics.ecommerce.ProductAction;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import java.util.List;
import java.util.ListIterator;
import kotlin.Metadata;
import kotlin.jvm.internal.markers.KMutableListIterator;
import org.jetbrains.annotations.NotNull;

@Metadata(m28851d1 = {"\u0000!\n\u0000\n\u0002\u0010+\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u000b*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u0010\u0010\u0003\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0005\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0004J\u0010\u0010\u0006\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u000b\u0010\u0007J\u000f\u0010\f\u001a\u00020\bH\u0016¢\u0006\u0004\b\f\u0010\nJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0013\u0010\u0010R\u001d\u0010\u0018\u001a\b\u0012\u0004\u0012\u00028\u00000\u00018\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0019"}, m28850d2 = {"kotlin/collections/ReversedList$listIterator$1", "", "", "hasNext", "()Z", "hasPrevious", "next", "()Ljava/lang/Object;", "", "nextIndex", "()I", "previous", "previousIndex", "element", "", ProductAction.ACTION_ADD, "(Ljava/lang/Object;)V", ProductAction.ACTION_REMOVE, "()V", "set", PDPageLabelRange.STYLE_LETTERS_LOWER, "Ljava/util/ListIterator;", "getDelegateIterator", "()Ljava/util/ListIterator;", "delegateIterator", "kotlin-stdlib"}, m28849k = 1, m28848mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class ReversedList$listIterator$1 implements ListIterator<Object>, KMutableListIterator {

    /* renamed from: a */
    public final ListIterator f68127a;

    /* renamed from: b */
    public final /* synthetic */ ReversedList f68128b;

    public ReversedList$listIterator$1(ReversedList reversedList, int i) {
        List list;
        int m29306g;
        this.f68128b = reversedList;
        list = reversedList.f68126a;
        m29306g = AbstractC11494is.m29306g(reversedList, i);
        this.f68127a = list.listIterator(m29306g);
    }

    @Override // java.util.ListIterator
    public void add(Object obj) {
        this.f68127a.add(obj);
        this.f68127a.previous();
    }

    @NotNull
    public final ListIterator<Object> getDelegateIterator() {
        return this.f68127a;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public boolean hasNext() {
        return this.f68127a.hasPrevious();
    }

    @Override // java.util.ListIterator
    public boolean hasPrevious() {
        return this.f68127a.hasNext();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public Object next() {
        return this.f68127a.previous();
    }

    @Override // java.util.ListIterator
    public int nextIndex() {
        int m29307f;
        m29307f = AbstractC11494is.m29307f(this.f68128b, this.f68127a.previousIndex());
        return m29307f;
    }

    @Override // java.util.ListIterator
    public Object previous() {
        return this.f68127a.next();
    }

    @Override // java.util.ListIterator
    public int previousIndex() {
        int m29307f;
        m29307f = AbstractC11494is.m29307f(this.f68128b, this.f68127a.nextIndex());
        return m29307f;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public void remove() {
        this.f68127a.remove();
    }

    @Override // java.util.ListIterator
    public void set(Object obj) {
        this.f68127a.set(obj);
    }
}
