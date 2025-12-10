package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap;

import androidx.exifinterface.media.ExifInterface;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.KMappedMarker;
import org.apache.http.cookie.ClientCookie;
import org.jetbrains.annotations.NotNull;

@Metadata(m28851d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010(\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u000f\b \u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u0002*\u0004\b\u0002\u0010\u00032\b\u0012\u0004\u0012\u00028\u00020\u0004B;\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0005\u0012\u001e\u0010\t\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\b0\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00028\u0000H\u0004¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eH\u0096\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00028\u0002H\u0096\u0002¢\u0006\u0004\b\u0011\u0010\rJ\u0017\u0010\u0014\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0017\u001a\u00020\u0016H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\u0016H\u0002¢\u0006\u0004\b\u0019\u0010\u0018R2\u0010\t\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\b0\u00078\u0004X\u0084\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\"\u0010\"\u001a\u00020\u00128\u0004@\u0004X\u0084\u000e¢\u0006\u0012\n\u0004\b\u0017\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R\u001c\u0010\u000f\u001a\u00020\u000e8\u0002@\u0002X\u0083\u000e¢\u0006\f\n\u0004\b\u0014\u0010#\u0012\u0004\b$\u0010\u0018¨\u0006%"}, m28850d2 = {"Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/PersistentHashMapBaseIterator;", "K", ExifInterface.GPS_MEASUREMENT_INTERRUPTED, "T", "", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/TrieNode;", "node", "", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/TrieNodeBaseIterator;", ClientCookie.PATH_ATTR, "<init>", "(Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/TrieNode;[Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/TrieNodeBaseIterator;)V", "currentKey", "()Ljava/lang/Object;", "", "hasNext", "()Z", "next", "", "pathIndex", OperatorName.CURVE_TO, "(I)I", "", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "()V", PDPageLabelRange.STYLE_LETTERS_LOWER, "[Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/TrieNodeBaseIterator;", "getPath", "()[Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/TrieNodeBaseIterator;", "I", "getPathLastIndex", "()I", "setPathLastIndex", "(I)V", "pathLastIndex", "Z", "getHasNext$annotations", "runtime_release"}, m28849k = 1, m28848mv = {1, 8, 0})
/* loaded from: classes2.dex */
public abstract class PersistentHashMapBaseIterator<K, V, T> implements Iterator<T>, KMappedMarker {

    /* renamed from: a */
    public final TrieNodeBaseIterator[] f28553a;

    /* renamed from: b */
    public int f28554b;

    /* renamed from: c */
    public boolean f28555c;

    public PersistentHashMapBaseIterator(@NotNull TrieNode<K, V> node, @NotNull TrieNodeBaseIterator<K, V, T>[] path) {
        Intrinsics.checkNotNullParameter(node, "node");
        Intrinsics.checkNotNullParameter(path, "path");
        this.f28553a = path;
        this.f28555c = true;
        path[0].reset(node.getBuffer$runtime_release(), node.entryCount$runtime_release() * 2);
        this.f28554b = 0;
        m60042b();
    }

    /* renamed from: a */
    public final void m60043a() {
        if (hasNext()) {
            return;
        }
        throw new NoSuchElementException();
    }

    /* renamed from: b */
    public final void m60042b() {
        if (this.f28553a[this.f28554b].hasNextKey()) {
            return;
        }
        for (int i = this.f28554b; -1 < i; i--) {
            int m60041c = m60041c(i);
            if (m60041c == -1 && this.f28553a[i].hasNextNode()) {
                this.f28553a[i].moveToNextNode();
                m60041c = m60041c(i);
            }
            if (m60041c != -1) {
                this.f28554b = m60041c;
                return;
            }
            if (i > 0) {
                this.f28553a[i - 1].moveToNextNode();
            }
            this.f28553a[i].reset(TrieNode.Companion.getEMPTY$runtime_release().getBuffer$runtime_release(), 0);
        }
        this.f28555c = false;
    }

    /* renamed from: c */
    public final int m60041c(int i) {
        if (this.f28553a[i].hasNextKey()) {
            return i;
        }
        if (this.f28553a[i].hasNextNode()) {
            TrieNode<? extends K, ? extends V> currentNode = this.f28553a[i].currentNode();
            if (i == 6) {
                this.f28553a[i + 1].reset(currentNode.getBuffer$runtime_release(), currentNode.getBuffer$runtime_release().length);
            } else {
                this.f28553a[i + 1].reset(currentNode.getBuffer$runtime_release(), currentNode.entryCount$runtime_release() * 2);
            }
            return m60041c(i + 1);
        }
        return -1;
    }

    public final K currentKey() {
        m60043a();
        return (K) this.f28553a[this.f28554b].currentKey();
    }

    @NotNull
    public final TrieNodeBaseIterator<K, V, T>[] getPath() {
        return this.f28553a;
    }

    public final int getPathLastIndex() {
        return this.f28554b;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f28555c;
    }

    @Override // java.util.Iterator
    public T next() {
        m60043a();
        T next = this.f28553a[this.f28554b].next();
        m60042b();
        return next;
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final void setPathLastIndex(int i) {
        this.f28554b = i;
    }
}
