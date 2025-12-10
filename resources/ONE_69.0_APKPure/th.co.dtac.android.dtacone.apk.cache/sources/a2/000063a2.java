package androidx.compose.p003ui.platform;

import androidx.compose.runtime.collection.MutableVector;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.Nullable;

@Metadata(m29143d1 = {"\u00002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00028\u0000¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u0004\u0018\u00018\u0000¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u000b\u0010\u0004R \u0010\u000f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\r0\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u000eR\u001a\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00000\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0017\u001a\u00020\u00148F¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u0018"}, m29142d2 = {"Landroidx/compose/ui/platform/WeakCache;", "T", "", "<init>", "()V", "element", "", "push", "(Ljava/lang/Object;)V", "pop", "()Ljava/lang/Object;", PDPageLabelRange.STYLE_LETTERS_LOWER, "Landroidx/compose/runtime/collection/MutableVector;", "Ljava/lang/ref/Reference;", "Landroidx/compose/runtime/collection/MutableVector;", "values", "Ljava/lang/ref/ReferenceQueue;", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "Ljava/lang/ref/ReferenceQueue;", "referenceQueue", "", "getSize", "()I", "size", "ui_release"}, m29141k = 1, m29140mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nWeakCache.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WeakCache.kt\nandroidx/compose/ui/platform/WeakCache\n+ 2 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVectorKt\n+ 3 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector\n*L\n1#1,76:1\n1182#2:77\n1161#2,2:78\n728#3,2:80\n48#3:82\n*S KotlinDebug\n*F\n+ 1 WeakCache.kt\nandroidx/compose/ui/platform/WeakCache\n*L\n29#1:77\n29#1:78,2\n38#1:80,2\n49#1:82\n*E\n"})
/* renamed from: androidx.compose.ui.platform.WeakCache */
/* loaded from: classes2.dex */
public final class WeakCache<T> {

    /* renamed from: a */
    public final MutableVector f30889a = new MutableVector(new Reference[16], 0);

    /* renamed from: b */
    public final ReferenceQueue f30890b = new ReferenceQueue();

    /* renamed from: a */
    public final void m59140a() {
        Reference<? extends T> poll;
        do {
            poll = this.f30890b.poll();
            if (poll != null) {
                this.f30889a.remove(poll);
                continue;
            }
        } while (poll != null);
    }

    public final int getSize() {
        m59140a();
        return this.f30889a.getSize();
    }

    @Nullable
    public final T pop() {
        m59140a();
        while (this.f30889a.isNotEmpty()) {
            MutableVector mutableVector = this.f30889a;
            T t = (T) ((Reference) mutableVector.removeAt(mutableVector.getSize() - 1)).get();
            if (t != null) {
                return t;
            }
        }
        return null;
    }

    public final void push(T t) {
        m59140a();
        this.f30889a.add(new WeakReference(t, this.f30890b));
    }
}