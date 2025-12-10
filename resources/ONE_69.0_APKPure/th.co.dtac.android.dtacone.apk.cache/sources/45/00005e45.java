package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.persistentOrderedMap;

import androidx.compose.runtime.external.kotlinx.collections.immutable.internal.EndOfChain;
import androidx.exifinterface.media.ExifInterface;
import com.google.android.gms.analytics.ecommerce.ProductAction;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.TypeIntrinsics;
import kotlin.jvm.internal.markers.KMutableIterator;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(m29143d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010)\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0011\n\u0002\u0010\b\n\u0002\b\n\b\u0010\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u00040\u0003B%\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0007¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u000e\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u000f\u0010\rJ\u0010\u0010\u0011\u001a\u00020\u0010H\u0096\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0016\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00010\u0004H\u0096\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0015\u0010\rR\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010\u0016R&\u0010\b\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00078\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\f\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R$\u0010\u001e\u001a\u0004\u0018\u00010\u00058\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010\u0016\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\u0016\u0010!\u001a\u00020\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0016\u0010%\u001a\u00020\"8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b#\u0010$R\"\u0010+\u001a\u00020\"8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b&\u0010$\u001a\u0004\b'\u0010(\"\u0004\b)\u0010*¨\u0006,"}, m29142d2 = {"Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/persistentOrderedMap/PersistentOrderedMapBuilderLinksIterator;", "K", ExifInterface.GPS_MEASUREMENT_INTERRUPTED, "", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/persistentOrderedMap/LinkedValue;", "", "nextKey", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/persistentOrderedMap/PersistentOrderedMapBuilder;", "builder", "<init>", "(Ljava/lang/Object;Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/persistentOrderedMap/PersistentOrderedMapBuilder;)V", "", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "()V", OperatorName.CURVE_TO, PDPageLabelRange.STYLE_LETTERS_LOWER, "", "hasNext", "()Z", "next", "()Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/persistentOrderedMap/LinkedValue;", ProductAction.ACTION_REMOVE, "Ljava/lang/Object;", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/persistentOrderedMap/PersistentOrderedMapBuilder;", "getBuilder$runtime_release", "()Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/persistentOrderedMap/PersistentOrderedMapBuilder;", "getLastIteratedKey$runtime_release", "()Ljava/lang/Object;", "setLastIteratedKey$runtime_release", "(Ljava/lang/Object;)V", "lastIteratedKey", "d", "Z", "nextWasInvoked", "", "e", "I", "expectedModCount", OperatorName.FILL_NON_ZERO, "getIndex$runtime_release", "()I", "setIndex$runtime_release", "(I)V", FirebaseAnalytics.Param.INDEX, "runtime_release"}, m29141k = 1, m29140mv = {1, 8, 0})
/* loaded from: classes2.dex */
public class PersistentOrderedMapBuilderLinksIterator<K, V> implements Iterator<LinkedValue<V>>, KMutableIterator {

    /* renamed from: a */
    public Object f28708a;

    /* renamed from: b */
    public final PersistentOrderedMapBuilder f28709b;

    /* renamed from: c */
    public Object f28710c;

    /* renamed from: d */
    public boolean f28711d;

    /* renamed from: e */
    public int f28712e;

    /* renamed from: f */
    public int f28713f;

    public PersistentOrderedMapBuilderLinksIterator(@Nullable Object obj, @NotNull PersistentOrderedMapBuilder<K, V> builder) {
        Intrinsics.checkNotNullParameter(builder, "builder");
        this.f28708a = obj;
        this.f28709b = builder;
        this.f28710c = EndOfChain.INSTANCE;
        this.f28712e = builder.getHashMapBuilder$runtime_release().getModCount$runtime_release();
    }

    /* renamed from: a */
    private final void m59912a() {
        if (this.f28709b.getHashMapBuilder$runtime_release().getModCount$runtime_release() == this.f28712e) {
            return;
        }
        throw new ConcurrentModificationException();
    }

    /* renamed from: b */
    private final void m59911b() {
        if (hasNext()) {
            return;
        }
        throw new NoSuchElementException();
    }

    /* renamed from: c */
    private final void m59910c() {
        if (this.f28711d) {
            return;
        }
        throw new IllegalStateException();
    }

    @NotNull
    public final PersistentOrderedMapBuilder<K, V> getBuilder$runtime_release() {
        return this.f28709b;
    }

    public final int getIndex$runtime_release() {
        return this.f28713f;
    }

    @Nullable
    public final Object getLastIteratedKey$runtime_release() {
        return this.f28710c;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        if (this.f28713f < this.f28709b.size()) {
            return true;
        }
        return false;
    }

    @Override // java.util.Iterator
    public void remove() {
        m59910c();
        TypeIntrinsics.asMutableMap(this.f28709b).remove(this.f28710c);
        this.f28710c = null;
        this.f28711d = false;
        this.f28712e = this.f28709b.getHashMapBuilder$runtime_release().getModCount$runtime_release();
        this.f28713f--;
    }

    public final void setIndex$runtime_release(int i) {
        this.f28713f = i;
    }

    public final void setLastIteratedKey$runtime_release(@Nullable Object obj) {
        this.f28710c = obj;
    }

    @Override // java.util.Iterator
    @NotNull
    public LinkedValue<V> next() {
        m59912a();
        m59911b();
        this.f28710c = this.f28708a;
        this.f28711d = true;
        this.f28713f++;
        LinkedValue<V> linkedValue = this.f28709b.getHashMapBuilder$runtime_release().get(this.f28708a);
        if (linkedValue != null) {
            LinkedValue<V> linkedValue2 = linkedValue;
            this.f28708a = linkedValue2.getNext();
            return linkedValue2;
        }
        throw new ConcurrentModificationException("Hash code of a key (" + this.f28708a + ") has changed after it was added to the persistent map.");
    }
}