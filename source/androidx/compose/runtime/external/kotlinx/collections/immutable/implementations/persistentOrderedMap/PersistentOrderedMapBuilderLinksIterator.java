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

@Metadata(m28851d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010)\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0011\n\u0002\u0010\b\n\u0002\b\n\b\u0010\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u00040\u0003B%\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0007¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u000e\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u000f\u0010\rJ\u0010\u0010\u0011\u001a\u00020\u0010H\u0096\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0016\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00010\u0004H\u0096\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0015\u0010\rR\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010\u0016R&\u0010\b\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00078\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\f\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R$\u0010\u001e\u001a\u0004\u0018\u00010\u00058\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010\u0016\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\u0016\u0010!\u001a\u00020\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0016\u0010%\u001a\u00020\"8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b#\u0010$R\"\u0010+\u001a\u00020\"8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b&\u0010$\u001a\u0004\b'\u0010(\"\u0004\b)\u0010*¨\u0006,"}, m28850d2 = {"Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/persistentOrderedMap/PersistentOrderedMapBuilderLinksIterator;", "K", ExifInterface.GPS_MEASUREMENT_INTERRUPTED, "", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/persistentOrderedMap/LinkedValue;", "", "nextKey", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/persistentOrderedMap/PersistentOrderedMapBuilder;", "builder", "<init>", "(Ljava/lang/Object;Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/persistentOrderedMap/PersistentOrderedMapBuilder;)V", "", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "()V", OperatorName.CURVE_TO, PDPageLabelRange.STYLE_LETTERS_LOWER, "", "hasNext", "()Z", "next", "()Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/persistentOrderedMap/LinkedValue;", ProductAction.ACTION_REMOVE, "Ljava/lang/Object;", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/persistentOrderedMap/PersistentOrderedMapBuilder;", "getBuilder$runtime_release", "()Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/persistentOrderedMap/PersistentOrderedMapBuilder;", "getLastIteratedKey$runtime_release", "()Ljava/lang/Object;", "setLastIteratedKey$runtime_release", "(Ljava/lang/Object;)V", "lastIteratedKey", "d", "Z", "nextWasInvoked", "", "e", "I", "expectedModCount", OperatorName.FILL_NON_ZERO, "getIndex$runtime_release", "()I", "setIndex$runtime_release", "(I)V", FirebaseAnalytics.Param.INDEX, "runtime_release"}, m28849k = 1, m28848mv = {1, 8, 0})
/* loaded from: classes2.dex */
public class PersistentOrderedMapBuilderLinksIterator<K, V> implements Iterator<LinkedValue<V>>, KMutableIterator {

    /* renamed from: a */
    public Object f28620a;

    /* renamed from: b */
    public final PersistentOrderedMapBuilder f28621b;

    /* renamed from: c */
    public Object f28622c;

    /* renamed from: d */
    public boolean f28623d;

    /* renamed from: e */
    public int f28624e;

    /* renamed from: f */
    public int f28625f;

    public PersistentOrderedMapBuilderLinksIterator(@Nullable Object obj, @NotNull PersistentOrderedMapBuilder<K, V> builder) {
        Intrinsics.checkNotNullParameter(builder, "builder");
        this.f28620a = obj;
        this.f28621b = builder;
        this.f28622c = EndOfChain.INSTANCE;
        this.f28624e = builder.getHashMapBuilder$runtime_release().getModCount$runtime_release();
    }

    /* renamed from: a */
    private final void m59962a() {
        if (this.f28621b.getHashMapBuilder$runtime_release().getModCount$runtime_release() == this.f28624e) {
            return;
        }
        throw new ConcurrentModificationException();
    }

    /* renamed from: b */
    private final void m59961b() {
        if (hasNext()) {
            return;
        }
        throw new NoSuchElementException();
    }

    /* renamed from: c */
    private final void m59960c() {
        if (this.f28623d) {
            return;
        }
        throw new IllegalStateException();
    }

    @NotNull
    public final PersistentOrderedMapBuilder<K, V> getBuilder$runtime_release() {
        return this.f28621b;
    }

    public final int getIndex$runtime_release() {
        return this.f28625f;
    }

    @Nullable
    public final Object getLastIteratedKey$runtime_release() {
        return this.f28622c;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        if (this.f28625f < this.f28621b.size()) {
            return true;
        }
        return false;
    }

    @Override // java.util.Iterator
    public void remove() {
        m59960c();
        TypeIntrinsics.asMutableMap(this.f28621b).remove(this.f28622c);
        this.f28622c = null;
        this.f28623d = false;
        this.f28624e = this.f28621b.getHashMapBuilder$runtime_release().getModCount$runtime_release();
        this.f28625f--;
    }

    public final void setIndex$runtime_release(int i) {
        this.f28625f = i;
    }

    public final void setLastIteratedKey$runtime_release(@Nullable Object obj) {
        this.f28622c = obj;
    }

    @Override // java.util.Iterator
    @NotNull
    public LinkedValue<V> next() {
        m59962a();
        m59961b();
        this.f28622c = this.f28620a;
        this.f28623d = true;
        this.f28625f++;
        LinkedValue<V> linkedValue = this.f28621b.getHashMapBuilder$runtime_release().get(this.f28620a);
        if (linkedValue != null) {
            LinkedValue<V> linkedValue2 = linkedValue;
            this.f28620a = linkedValue2.getNext();
            return linkedValue2;
        }
        throw new ConcurrentModificationException("Hash code of a key (" + this.f28620a + ") has changed after it was added to the persistent map.");
    }
}
