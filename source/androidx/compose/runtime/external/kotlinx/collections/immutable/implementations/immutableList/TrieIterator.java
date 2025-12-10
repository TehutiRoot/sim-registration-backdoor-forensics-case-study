package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList;

import androidx.exifinterface.media.ExifInterface;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.apache.http.cookie.ClientCookie;
import org.jetbrains.annotations.NotNull;

@Metadata(m28851d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0000\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B/\u0012\u000e\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\u0006¢\u0006\u0004\b\n\u0010\u000bJ7\u0010\u000e\u001a\u00020\f2\u000e\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u00032\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u0006H\u0000¢\u0006\u0004\b\r\u0010\u000bJ\u0010\u0010\u000f\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0011\u0010\u0010J\u001f\u0010\u0013\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0016\u001a\u00020\f2\u0006\u0010\u0015\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00028\u0000H\u0002¢\u0006\u0004\b\u0018\u0010\u0010R\u0016\u0010\t\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\u0019R\u001e\u0010\u001c\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u00038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0016\u0010 \u001a\u00020\u001d8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010\u001f¨\u0006!"}, m28850d2 = {"Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableList/TrieIterator;", ExifInterface.LONGITUDE_EAST, "Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableList/AbstractListIterator;", "", "", "root", "", FirebaseAnalytics.Param.INDEX, "size", "height", "<init>", "([Ljava/lang/Object;III)V", "", "reset$runtime_release", "reset", "next", "()Ljava/lang/Object;", "previous", "startLevel", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "(II)V", "indexPredicate", OperatorName.CURVE_TO, "(I)V", PDPageLabelRange.STYLE_LETTERS_LOWER, "I", "d", "[Ljava/lang/Object;", ClientCookie.PATH_ATTR, "", "e", "Z", "isInRightEdge", "runtime_release"}, m28849k = 1, m28848mv = {1, 8, 0})
/* loaded from: classes2.dex */
public final class TrieIterator<E> extends AbstractListIterator<E> {

    /* renamed from: c */
    public int f28545c;

    /* renamed from: d */
    public Object[] f28546d;

    /* renamed from: e */
    public boolean f28547e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v2, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r5v3 */
    public TrieIterator(@NotNull Object[] root, int i, int i2, int i3) {
        super(i, i2);
        ?? r5;
        Intrinsics.checkNotNullParameter(root, "root");
        this.f28545c = i3;
        Object[] objArr = new Object[i3];
        this.f28546d = objArr;
        if (i == i2) {
            r5 = 1;
        } else {
            r5 = 0;
        }
        this.f28547e = r5;
        objArr[0] = root;
        m60046b(i - r5, 1);
    }

    /* renamed from: a */
    public final Object m60047a() {
        Object obj = this.f28546d[this.f28545c - 1];
        Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.Array<E of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList.TrieIterator>");
        return ((Object[]) obj)[getIndex() & 31];
    }

    /* renamed from: b */
    public final void m60046b(int i, int i2) {
        int i3 = (this.f28545c - i2) * 5;
        while (i2 < this.f28545c) {
            Object[] objArr = this.f28546d;
            Object[] objArr2 = objArr[i2 - 1];
            Intrinsics.checkNotNull(objArr2, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
            objArr[i2] = objArr2[UtilsKt.indexSegment(i, i3)];
            i3 -= 5;
            i2++;
        }
    }

    /* renamed from: c */
    public final void m60045c(int i) {
        int i2 = 0;
        while (UtilsKt.indexSegment(getIndex(), i2) == i) {
            i2 += 5;
        }
        if (i2 > 0) {
            m60046b(getIndex(), ((this.f28545c - 1) - (i2 / 5)) + 1);
        }
    }

    @Override // androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList.AbstractListIterator, java.util.ListIterator, java.util.Iterator
    public E next() {
        if (hasNext()) {
            E e = (E) m60047a();
            setIndex(getIndex() + 1);
            if (getIndex() == getSize()) {
                this.f28547e = true;
                return e;
            }
            m60045c(0);
            return e;
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.ListIterator
    public E previous() {
        if (hasPrevious()) {
            setIndex(getIndex() - 1);
            if (this.f28547e) {
                this.f28547e = false;
                return (E) m60047a();
            }
            m60045c(31);
            return (E) m60047a();
        }
        throw new NoSuchElementException();
    }

    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v4, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r0v5 */
    public final void reset$runtime_release(@NotNull Object[] root, int i, int i2, int i3) {
        Intrinsics.checkNotNullParameter(root, "root");
        setIndex(i);
        setSize(i2);
        this.f28545c = i3;
        if (this.f28546d.length < i3) {
            this.f28546d = new Object[i3];
        }
        ?? r0 = 0;
        this.f28546d[0] = root;
        if (i == i2) {
            r0 = 1;
        }
        this.f28547e = r0;
        m60046b(i - r0, 1);
    }
}
