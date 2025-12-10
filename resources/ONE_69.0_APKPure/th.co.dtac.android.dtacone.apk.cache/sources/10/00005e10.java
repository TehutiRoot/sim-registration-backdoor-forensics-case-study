package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList;

import com.google.android.gms.analytics.ecommerce.ProductAction;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import java.util.ConcurrentModificationException;
import java.util.ListIterator;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.KMutableListIterator;
import kotlin.ranges.AbstractC11695c;
import org.jetbrains.annotations.NotNull;

@Metadata(m29143d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010+\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\b\u0012\u0004\u0012\u00028\u00000\u0003B\u001d\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0004\b\u000f\u0010\u000eJ\u0017\u0010\u0011\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0013\u0010\fJ\u0017\u0010\u0014\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0014\u0010\u0012J\u000f\u0010\u0015\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0015\u0010\fJ\u000f\u0010\u0016\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0016\u0010\fJ\u000f\u0010\u0017\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0017\u0010\fR\u001a\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u0018R\u0016\u0010\u001b\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u001e\u0010\u001e\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u001c8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010\u001dR\u0016\u0010 \u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010\u001a¨\u0006!"}, m29142d2 = {"Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableList/PersistentVectorMutableIterator;", "T", "", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableList/AbstractListIterator;", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableList/PersistentVectorBuilder;", "builder", "", FirebaseAnalytics.Param.INDEX, "<init>", "(Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableList/PersistentVectorBuilder;I)V", "", OperatorName.CURVE_TO, "()V", "previous", "()Ljava/lang/Object;", "next", "element", ProductAction.ACTION_ADD, "(Ljava/lang/Object;)V", ProductAction.ACTION_REMOVE, "set", "e", PDPageLabelRange.STYLE_LETTERS_LOWER, OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableList/PersistentVectorBuilder;", "d", "I", "expectedModCount", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableList/TrieIterator;", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableList/TrieIterator;", "trieIterator", OperatorName.FILL_NON_ZERO, "lastIteratedIndex", "runtime_release"}, m29141k = 1, m29140mv = {1, 8, 0})
/* loaded from: classes2.dex */
public final class PersistentVectorMutableIterator<T> extends AbstractListIterator<T> implements ListIterator<T>, KMutableListIterator {

    /* renamed from: c */
    public final PersistentVectorBuilder f28626c;

    /* renamed from: d */
    public int f28627d;

    /* renamed from: e */
    public TrieIterator f28628e;

    /* renamed from: f */
    public int f28629f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PersistentVectorMutableIterator(@NotNull PersistentVectorBuilder<T> builder, int i) {
        super(i, builder.size());
        Intrinsics.checkNotNullParameter(builder, "builder");
        this.f28626c = builder;
        this.f28627d = builder.getModCount$runtime_release();
        this.f28629f = -1;
        m59999e();
    }

    /* renamed from: c */
    private final void m60000c() {
        setSize(this.f28626c.size());
        this.f28627d = this.f28626c.getModCount$runtime_release();
        this.f28629f = -1;
        m59999e();
    }

    /* renamed from: a */
    public final void m60002a() {
        if (this.f28627d == this.f28626c.getModCount$runtime_release()) {
            return;
        }
        throw new ConcurrentModificationException();
    }

    @Override // androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList.AbstractListIterator, java.util.ListIterator
    public void add(T t) {
        m60002a();
        this.f28626c.add(getIndex(), t);
        setIndex(getIndex() + 1);
        m60000c();
    }

    /* renamed from: b */
    public final void m60001b() {
        if (this.f28629f != -1) {
            return;
        }
        throw new IllegalStateException();
    }

    /* renamed from: e */
    public final void m59999e() {
        Object[] root$runtime_release = this.f28626c.getRoot$runtime_release();
        if (root$runtime_release == null) {
            this.f28628e = null;
            return;
        }
        int rootSize = UtilsKt.rootSize(this.f28626c.size());
        int coerceAtMost = AbstractC11695c.coerceAtMost(getIndex(), rootSize);
        int rootShift$runtime_release = (this.f28626c.getRootShift$runtime_release() / 5) + 1;
        TrieIterator trieIterator = this.f28628e;
        if (trieIterator == null) {
            this.f28628e = new TrieIterator(root$runtime_release, coerceAtMost, rootSize, rootShift$runtime_release);
            return;
        }
        Intrinsics.checkNotNull(trieIterator);
        trieIterator.reset$runtime_release(root$runtime_release, coerceAtMost, rootSize, rootShift$runtime_release);
    }

    @Override // androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList.AbstractListIterator, java.util.ListIterator, java.util.Iterator
    public T next() {
        m60002a();
        checkHasNext$runtime_release();
        this.f28629f = getIndex();
        TrieIterator trieIterator = this.f28628e;
        if (trieIterator == null) {
            Object[] tail$runtime_release = this.f28626c.getTail$runtime_release();
            int index = getIndex();
            setIndex(index + 1);
            return (T) tail$runtime_release[index];
        } else if (trieIterator.hasNext()) {
            setIndex(getIndex() + 1);
            return (T) trieIterator.next();
        } else {
            Object[] tail$runtime_release2 = this.f28626c.getTail$runtime_release();
            int index2 = getIndex();
            setIndex(index2 + 1);
            return (T) tail$runtime_release2[index2 - trieIterator.getSize()];
        }
    }

    @Override // java.util.ListIterator
    public T previous() {
        m60002a();
        checkHasPrevious$runtime_release();
        this.f28629f = getIndex() - 1;
        TrieIterator trieIterator = this.f28628e;
        if (trieIterator == null) {
            Object[] tail$runtime_release = this.f28626c.getTail$runtime_release();
            setIndex(getIndex() - 1);
            return (T) tail$runtime_release[getIndex()];
        } else if (getIndex() > trieIterator.getSize()) {
            Object[] tail$runtime_release2 = this.f28626c.getTail$runtime_release();
            setIndex(getIndex() - 1);
            return (T) tail$runtime_release2[getIndex() - trieIterator.getSize()];
        } else {
            setIndex(getIndex() - 1);
            return (T) trieIterator.previous();
        }
    }

    @Override // androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList.AbstractListIterator, java.util.ListIterator, java.util.Iterator
    public void remove() {
        m60002a();
        m60001b();
        this.f28626c.remove(this.f28629f);
        if (this.f28629f < getIndex()) {
            setIndex(this.f28629f);
        }
        m60000c();
    }

    @Override // androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList.AbstractListIterator, java.util.ListIterator
    public void set(T t) {
        m60002a();
        m60001b();
        this.f28626c.set(this.f28629f, t);
        this.f28627d = this.f28626c.getModCount$runtime_release();
        m59999e();
    }
}