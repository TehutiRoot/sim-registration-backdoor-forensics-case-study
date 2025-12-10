package androidx.compose.runtime.collection;

import com.google.firebase.analytics.FirebaseAnalytics;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.KMappedMarker;
import org.jetbrains.annotations.NotNull;

@Metadata(m28851d1 = {"\u0000\u0019\n\u0000\n\u0002\u0010(\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\b*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u0010\u0010\u0003\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\"\u0010\u000e\u001a\u00020\u00078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\r¨\u0006\u000f"}, m28850d2 = {"androidx/compose/runtime/collection/IdentityArraySet$iterator$1", "", "", "hasNext", "()Z", "next", "()Ljava/lang/Object;", "", PDPageLabelRange.STYLE_LETTERS_LOWER, "I", "getIndex", "()I", "setIndex", "(I)V", FirebaseAnalytics.Param.INDEX, "runtime_release"}, m28849k = 1, m28848mv = {1, 8, 0})
/* loaded from: classes2.dex */
public final class IdentityArraySet$iterator$1 implements Iterator<T>, KMappedMarker {

    /* renamed from: a */
    public int f28494a;

    /* renamed from: b */
    public final /* synthetic */ IdentityArraySet f28495b;

    public IdentityArraySet$iterator$1(IdentityArraySet identityArraySet) {
        this.f28495b = identityArraySet;
    }

    public final int getIndex() {
        return this.f28494a;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        if (this.f28494a < this.f28495b.size()) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Iterator
    @NotNull
    public T next() {
        Object[] values = this.f28495b.getValues();
        int i = this.f28494a;
        this.f28494a = i + 1;
        T t = values[i];
        Intrinsics.checkNotNull(t, "null cannot be cast to non-null type T of androidx.compose.runtime.collection.IdentityArraySet");
        return t;
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final void setIndex(int i) {
        this.f28494a = i;
    }
}
