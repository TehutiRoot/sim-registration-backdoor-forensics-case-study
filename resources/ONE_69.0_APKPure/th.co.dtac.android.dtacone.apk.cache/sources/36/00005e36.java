package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet;

import androidx.compose.runtime.external.kotlinx.collections.immutable.internal.CommonFunctionsKt;
import androidx.exifinterface.media.ExifInterface;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.KMappedMarker;
import org.apache.http.cookie.ClientCookie;
import org.jetbrains.annotations.NotNull;

@Metadata(m29143d1 = {"\u00006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010(\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0010\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\t\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bH\u0096\u0002¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00028\u0000H\u0004¢\u0006\u0004\b\u0010\u0010\u000fJ\u000f\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0012\u0010\u0013R&\u0010\u0019\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00150\u00148\u0004X\u0084\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\"\u0010\u001f\u001a\u00020\u00078\u0004@\u0004X\u0084\u000e¢\u0006\u0012\n\u0004\b\t\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR\u001c\u0010\f\u001a\u00020\u000b8\u0002@\u0002X\u0083\u000e¢\u0006\f\n\u0004\b \u0010!\u0012\u0004\b\"\u0010\u0013¨\u0006#"}, m29142d2 = {"Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableSet/PersistentHashSetIterator;", ExifInterface.LONGITUDE_EAST, "", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableSet/TrieNode;", "node", "<init>", "(Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableSet/TrieNode;)V", "", "pathIndex", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "(I)I", "", "hasNext", "()Z", "next", "()Ljava/lang/Object;", "currentElement", "", PDPageLabelRange.STYLE_LETTERS_LOWER, "()V", "", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableSet/TrieNodeIterator;", "Ljava/util/List;", "getPath", "()Ljava/util/List;", ClientCookie.PATH_ATTR, "I", "getPathLastIndex", "()I", "setPathLastIndex", "(I)V", "pathLastIndex", OperatorName.CURVE_TO, "Z", "getHasNext$annotations", "runtime_release"}, m29141k = 1, m29140mv = {1, 8, 0})
/* loaded from: classes2.dex */
public class PersistentHashSetIterator<E> implements Iterator<E>, KMappedMarker {

    /* renamed from: a */
    public final List f28680a;

    /* renamed from: b */
    public int f28681b;

    /* renamed from: c */
    public boolean f28682c;

    public PersistentHashSetIterator(@NotNull TrieNode<E> node) {
        Intrinsics.checkNotNullParameter(node, "node");
        List mutableListOf = CollectionsKt__CollectionsKt.mutableListOf(new TrieNodeIterator());
        this.f28680a = mutableListOf;
        this.f28682c = true;
        TrieNodeIterator.reset$default((TrieNodeIterator) mutableListOf.get(0), node.getBuffer(), 0, 2, null);
        this.f28681b = 0;
        m59946a();
    }

    /* renamed from: b */
    private final int m59945b(int i) {
        if (((TrieNodeIterator) this.f28680a.get(i)).hasNextElement()) {
            return i;
        }
        if (((TrieNodeIterator) this.f28680a.get(i)).hasNextNode()) {
            TrieNode<? extends E> currentNode = ((TrieNodeIterator) this.f28680a.get(i)).currentNode();
            int i2 = i + 1;
            if (i2 == this.f28680a.size()) {
                this.f28680a.add(new TrieNodeIterator());
            }
            TrieNodeIterator.reset$default((TrieNodeIterator) this.f28680a.get(i2), currentNode.getBuffer(), 0, 2, null);
            return m59945b(i2);
        }
        return -1;
    }

    /* renamed from: a */
    public final void m59946a() {
        if (((TrieNodeIterator) this.f28680a.get(this.f28681b)).hasNextElement()) {
            return;
        }
        for (int i = this.f28681b; -1 < i; i--) {
            int m59945b = m59945b(i);
            if (m59945b == -1 && ((TrieNodeIterator) this.f28680a.get(i)).hasNextCell()) {
                ((TrieNodeIterator) this.f28680a.get(i)).moveToNextCell();
                m59945b = m59945b(i);
            }
            if (m59945b != -1) {
                this.f28681b = m59945b;
                return;
            }
            if (i > 0) {
                ((TrieNodeIterator) this.f28680a.get(i - 1)).moveToNextCell();
            }
            ((TrieNodeIterator) this.f28680a.get(i)).reset(TrieNode.Companion.getEMPTY$runtime_release().getBuffer(), 0);
        }
        this.f28682c = false;
    }

    public final E currentElement() {
        CommonFunctionsKt.m71589assert(hasNext());
        return (E) ((TrieNodeIterator) this.f28680a.get(this.f28681b)).currentElement();
    }

    @NotNull
    public final List<TrieNodeIterator<E>> getPath() {
        return this.f28680a;
    }

    public final int getPathLastIndex() {
        return this.f28681b;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f28682c;
    }

    @Override // java.util.Iterator
    public E next() {
        if (this.f28682c) {
            E e = (E) ((TrieNodeIterator) this.f28680a.get(this.f28681b)).nextElement();
            m59946a();
            return e;
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final void setPathLastIndex(int i) {
        this.f28681b = i;
    }
}