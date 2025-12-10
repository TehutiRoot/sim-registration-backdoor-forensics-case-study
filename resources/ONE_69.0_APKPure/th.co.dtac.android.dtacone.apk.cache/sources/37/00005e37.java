package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet;

import androidx.compose.runtime.external.kotlinx.collections.immutable.internal.CommonFunctionsKt;
import androidx.exifinterface.media.ExifInterface;
import com.google.android.gms.analytics.ecommerce.ProductAction;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.TypeIntrinsics;
import kotlin.jvm.internal.markers.KMutableIterator;
import org.jetbrains.annotations.NotNull;

@Metadata(m29143d1 = {"\u00004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010)\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\b\u0012\u0004\u0012\u00028\u00000\u0003B\u0015\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\nJ\u0010\u0010\f\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000e\u0010\nJ3\u0010\u0015\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\u000f2\n\u0010\u0012\u001a\u0006\u0012\u0002\b\u00030\u00112\u0006\u0010\u0013\u001a\u00028\u00002\u0006\u0010\u0014\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u001b\u0010\u0018\u001a\u00020\u00172\n\u0010\u0012\u001a\u0006\u0012\u0002\b\u00030\u0011H\u0002¢\u0006\u0004\b\u0018\u0010\u0019R\u001a\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0018\u0010\u001d\u001a\u0004\u0018\u00018\u00008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\t\u0010\u001cR\u0016\u0010\u001f\u001a\u00020\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010\u001eR\u0016\u0010!\u001a\u00020\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010 ¨\u0006\""}, m29142d2 = {"Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableSet/PersistentHashSetMutableIterator;", ExifInterface.LONGITUDE_EAST, "Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableSet/PersistentHashSetIterator;", "", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableSet/PersistentHashSetBuilder;", "builder", "<init>", "(Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableSet/PersistentHashSetBuilder;)V", "", "e", "()V", OperatorName.CURVE_TO, "next", "()Ljava/lang/Object;", ProductAction.ACTION_REMOVE, "", "hashCode", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableSet/TrieNode;", "node", "element", "pathIndex", OperatorName.NON_STROKING_GRAY, "(ILandroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableSet/TrieNode;Ljava/lang/Object;I)V", "", OperatorName.FILL_NON_ZERO, "(Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableSet/TrieNode;)Z", "d", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableSet/PersistentHashSetBuilder;", "Ljava/lang/Object;", "lastIteratedElement", "Z", "nextWasInvoked", "I", "expectedModCount", "runtime_release"}, m29141k = 1, m29140mv = {1, 8, 0})
/* loaded from: classes2.dex */
public final class PersistentHashSetMutableIterator<E> extends PersistentHashSetIterator<E> implements Iterator<E>, KMutableIterator {

    /* renamed from: d */
    public final PersistentHashSetBuilder f28683d;

    /* renamed from: e */
    public Object f28684e;

    /* renamed from: f */
    public boolean f28685f;

    /* renamed from: g */
    public int f28686g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PersistentHashSetMutableIterator(@NotNull PersistentHashSetBuilder<E> builder) {
        super(builder.getNode$runtime_release());
        Intrinsics.checkNotNullParameter(builder, "builder");
        this.f28683d = builder;
        this.f28686g = builder.getModCount$runtime_release();
    }

    /* renamed from: c */
    private final void m59944c() {
        if (this.f28683d.getModCount$runtime_release() == this.f28686g) {
            return;
        }
        throw new ConcurrentModificationException();
    }

    /* renamed from: e */
    private final void m59943e() {
        if (this.f28685f) {
            return;
        }
        throw new IllegalStateException();
    }

    /* renamed from: f */
    public final boolean m59942f(TrieNode trieNode) {
        if (trieNode.getBitmap() == 0) {
            return true;
        }
        return false;
    }

    /* renamed from: g */
    public final void m59941g(int i, TrieNode trieNode, Object obj, int i2) {
        boolean z = true;
        if (m59942f(trieNode)) {
            int indexOf = ArraysKt___ArraysKt.indexOf(trieNode.getBuffer(), obj);
            if (indexOf == -1) {
                z = false;
            }
            CommonFunctionsKt.m71589assert(z);
            getPath().get(i2).reset(trieNode.getBuffer(), indexOf);
            setPathLastIndex(i2);
            return;
        }
        int indexOfCellAt$runtime_release = trieNode.indexOfCellAt$runtime_release(1 << TrieNodeKt.indexSegment(i, i2 * 5));
        getPath().get(i2).reset(trieNode.getBuffer(), indexOfCellAt$runtime_release);
        Object obj2 = trieNode.getBuffer()[indexOfCellAt$runtime_release];
        if (obj2 instanceof TrieNode) {
            m59941g(i, (TrieNode) obj2, obj, i2 + 1);
        } else {
            setPathLastIndex(i2);
        }
    }

    @Override // androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.PersistentHashSetIterator, java.util.Iterator
    public E next() {
        m59944c();
        E e = (E) super.next();
        this.f28684e = e;
        this.f28685f = true;
        return e;
    }

    @Override // androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.PersistentHashSetIterator, java.util.Iterator
    public void remove() {
        int i;
        m59943e();
        if (hasNext()) {
            E currentElement = currentElement();
            PersistentHashSetBuilder persistentHashSetBuilder = this.f28683d;
            TypeIntrinsics.asMutableCollection(persistentHashSetBuilder).remove(this.f28684e);
            if (currentElement != null) {
                i = currentElement.hashCode();
            } else {
                i = 0;
            }
            m59941g(i, this.f28683d.getNode$runtime_release(), currentElement, 0);
        } else {
            PersistentHashSetBuilder persistentHashSetBuilder2 = this.f28683d;
            TypeIntrinsics.asMutableCollection(persistentHashSetBuilder2).remove(this.f28684e);
        }
        this.f28684e = null;
        this.f28685f = false;
        this.f28686g = this.f28683d.getModCount$runtime_release();
    }
}