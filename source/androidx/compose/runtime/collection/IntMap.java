package androidx.compose.runtime.collection;

import android.util.SparseArray;
import androidx.exifinterface.media.ExifInterface;
import ch.qos.logback.core.joran.action.Action;
import com.google.android.gms.analytics.ecommerce.ProductAction;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.Nullable;

@Metadata(m28851d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u000b\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u0017\b\u0002\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003¢\u0006\u0004\b\u0005\u0010\u0006B\u0013\b\u0016\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\u0005\u0010\tJ\u0018\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\u0007H\u0086\u0002¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u000e\u001a\u0004\u0018\u00018\u00002\u0006\u0010\n\u001a\u00020\u0007H\u0086\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u001d\u0010\u000e\u001a\u00028\u00002\u0006\u0010\n\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00028\u0000¢\u0006\u0004\b\u000e\u0010\u0011J \u0010\u0014\u001a\u00020\u00132\u0006\u0010\n\u001a\u00020\u00072\u0006\u0010\u0012\u001a\u00028\u0000H\u0086\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u0015\u0010\u0016\u001a\u00020\u00132\u0006\u0010\n\u001a\u00020\u0007¢\u0006\u0004\b\u0016\u0010\tJ\r\u0010\u0017\u001a\u00020\u0013¢\u0006\u0004\b\u0017\u0010\u0018R\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0011\u0010\u001d\u001a\u00020\u00078F¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u001c¨\u0006\u001e"}, m28850d2 = {"Landroidx/compose/runtime/collection/IntMap;", ExifInterface.LONGITUDE_EAST, "", "Landroid/util/SparseArray;", "sparseArray", "<init>", "(Landroid/util/SparseArray;)V", "", "initialCapacity", "(I)V", Action.KEY_ATTRIBUTE, "", "contains", "(I)Z", "get", "(I)Ljava/lang/Object;", "valueIfAbsent", "(ILjava/lang/Object;)Ljava/lang/Object;", "value", "", "set", "(ILjava/lang/Object;)V", ProductAction.ACTION_REMOVE, "clear", "()V", PDPageLabelRange.STYLE_LETTERS_LOWER, "Landroid/util/SparseArray;", "getSize", "()I", "size", "runtime_release"}, m28849k = 1, m28848mv = {1, 8, 0})
/* loaded from: classes2.dex */
public final class IntMap<E> {

    /* renamed from: a */
    public final SparseArray f28500a;

    public IntMap(SparseArray sparseArray) {
        this.f28500a = sparseArray;
    }

    public final void clear() {
        this.f28500a.clear();
    }

    public final boolean contains(int i) {
        if (this.f28500a.indexOfKey(i) >= 0) {
            return true;
        }
        return false;
    }

    @Nullable
    public final E get(int i) {
        return (E) this.f28500a.get(i);
    }

    public final int getSize() {
        return this.f28500a.size();
    }

    public final void remove(int i) {
        this.f28500a.remove(i);
    }

    public final void set(int i, E e) {
        this.f28500a.put(i, e);
    }

    public final E get(int i, E e) {
        return (E) this.f28500a.get(i, e);
    }

    public IntMap(int i) {
        this(new SparseArray(i));
    }

    public /* synthetic */ IntMap(int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 10 : i);
    }
}
