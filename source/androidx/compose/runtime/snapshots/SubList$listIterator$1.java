package androidx.compose.runtime.snapshots;

import com.google.android.gms.analytics.ecommerce.ProductAction;
import java.util.ListIterator;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.markers.KMutableListIterator;
import org.jetbrains.annotations.NotNull;

@Metadata(m28851d1 = {"\u0000#\n\u0000\n\u0002\u0010+\n\u0000\n\u0002\u0010\u0001\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u0015\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00028\u0000H\u0016¢\u0006\u0002\u0010\u0005J\t\u0010\u0006\u001a\u00020\u0007H\u0096\u0002J\b\u0010\b\u001a\u00020\u0007H\u0016J\u000e\u0010\t\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0002\u0010\nJ\b\u0010\u000b\u001a\u00020\fH\u0016J\r\u0010\r\u001a\u00028\u0000H\u0016¢\u0006\u0002\u0010\nJ\b\u0010\u000e\u001a\u00020\fH\u0016J\b\u0010\u000f\u001a\u00020\u0003H\u0016J\u0015\u0010\u0010\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00028\u0000H\u0016¢\u0006\u0002\u0010\u0005¨\u0006\u0011"}, m28850d2 = {"androidx/compose/runtime/snapshots/SubList$listIterator$1", "", ProductAction.ACTION_ADD, "", "element", "(Ljava/lang/Object;)Ljava/lang/Void;", "hasNext", "", "hasPrevious", "next", "()Ljava/lang/Object;", "nextIndex", "", "previous", "previousIndex", ProductAction.ACTION_REMOVE, "set", "runtime_release"}, m28849k = 1, m28848mv = {1, 8, 0}, m28846xi = 48)
/* loaded from: classes2.dex */
public final class SubList$listIterator$1 implements ListIterator<Object>, KMutableListIterator {

    /* renamed from: a */
    public final /* synthetic */ Ref.IntRef f28797a;

    /* renamed from: b */
    public final /* synthetic */ SubList f28798b;

    public SubList$listIterator$1(Ref.IntRef intRef, SubList subList) {
        this.f28797a = intRef;
        this.f28798b = subList;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public boolean hasNext() {
        if (this.f28797a.element < this.f28798b.size() - 1) {
            return true;
        }
        return false;
    }

    @Override // java.util.ListIterator
    public boolean hasPrevious() {
        if (this.f28797a.element >= 0) {
            return true;
        }
        return false;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public Object next() {
        int i = this.f28797a.element + 1;
        SnapshotStateListKt.m59897b(i, this.f28798b.size());
        this.f28797a.element = i;
        return this.f28798b.get(i);
    }

    @Override // java.util.ListIterator
    public int nextIndex() {
        return this.f28797a.element + 1;
    }

    @Override // java.util.ListIterator
    public Object previous() {
        int i = this.f28797a.element;
        SnapshotStateListKt.m59897b(i, this.f28798b.size());
        this.f28797a.element = i - 1;
        return this.f28798b.get(i);
    }

    @Override // java.util.ListIterator
    public int previousIndex() {
        return this.f28797a.element;
    }

    @Override // java.util.ListIterator
    @NotNull
    public Void add(Object obj) {
        SnapshotStateListKt.m59898a();
        throw new KotlinNothingValueException();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    @NotNull
    public Void remove() {
        SnapshotStateListKt.m59898a();
        throw new KotlinNothingValueException();
    }

    @Override // java.util.ListIterator
    @NotNull
    public Void set(Object obj) {
        SnapshotStateListKt.m59898a();
        throw new KotlinNothingValueException();
    }
}
