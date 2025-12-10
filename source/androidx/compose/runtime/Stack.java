package androidx.compose.runtime;

import com.google.firebase.analytics.FirebaseAnalytics;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import java.util.ArrayList;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(m28851d1 = {"\u00008\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00028\u0000¢\u0006\u0004\b\u0007\u0010\bJ\r\u0010\t\u001a\u00028\u0000¢\u0006\u0004\b\t\u0010\nJ\r\u0010\u000b\u001a\u00028\u0000¢\u0006\u0004\b\u000b\u0010\nJ\u0015\u0010\u000b\u001a\u00028\u00002\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000b\u0010\u000eJ\r\u0010\u000f\u001a\u00020\u0006¢\u0006\u0004\b\u000f\u0010\u0010J\r\u0010\u0011\u001a\u00020\u0006¢\u0006\u0004\b\u0011\u0010\u0010J\r\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0013\u0010\u0004J\u0013\u0010\u0015\u001a\b\u0012\u0004\u0012\u00028\u00000\u0014¢\u0006\u0004\b\u0015\u0010\u0016R$\u0010\u001b\u001a\u0012\u0012\u0004\u0012\u00028\u00000\u0017j\b\u0012\u0004\u0012\u00028\u0000`\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0011\u0010\u001e\u001a\u00020\f8F¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001d¨\u0006\u001f"}, m28850d2 = {"Landroidx/compose/runtime/Stack;", "T", "", "<init>", "()V", "value", "", "push", "(Ljava/lang/Object;)Z", "pop", "()Ljava/lang/Object;", "peek", "", FirebaseAnalytics.Param.INDEX, "(I)Ljava/lang/Object;", "isEmpty", "()Z", "isNotEmpty", "", "clear", "", "toArray", "()[Ljava/lang/Object;", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", PDPageLabelRange.STYLE_LETTERS_LOWER, "Ljava/util/ArrayList;", "backing", "getSize", "()I", "size", "runtime_release"}, m28849k = 1, m28848mv = {1, 8, 0})
/* loaded from: classes2.dex */
public final class Stack<T> {

    /* renamed from: a */
    public final ArrayList f28478a = new ArrayList();

    public final void clear() {
        this.f28478a.clear();
    }

    public final int getSize() {
        return this.f28478a.size();
    }

    public final boolean isEmpty() {
        return this.f28478a.isEmpty();
    }

    public final boolean isNotEmpty() {
        return !isEmpty();
    }

    public final T peek() {
        return (T) this.f28478a.get(getSize() - 1);
    }

    public final T pop() {
        return (T) this.f28478a.remove(getSize() - 1);
    }

    public final boolean push(T t) {
        return this.f28478a.add(t);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @NotNull
    public final T[] toArray() {
        int size = this.f28478a.size();
        T[] tArr = (T[]) new Object[size];
        for (int i = 0; i < size; i++) {
            tArr[i] = this.f28478a.get(i);
        }
        return tArr;
    }

    public final T peek(int i) {
        return (T) this.f28478a.get(i);
    }
}
