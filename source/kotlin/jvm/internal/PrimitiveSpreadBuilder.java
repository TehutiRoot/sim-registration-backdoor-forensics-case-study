package kotlin.jvm.internal;

import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import kotlin.Metadata;
import kotlin.ranges.IntRange;
import org.jetbrains.annotations.NotNull;

@Metadata(m28851d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\r\n\u0002\u0010\u0011\n\u0002\b\u0006\b&\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0013\u0010\u0007\u001a\u00020\u0003*\u00028\u0000H$¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00028\u0000¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u0004\u001a\u00020\u0003H\u0004¢\u0006\u0004\b\u0004\u0010\rJ\u001f\u0010\u0010\u001a\u00028\u00002\u0006\u0010\u000e\u001a\u00028\u00002\u0006\u0010\u000f\u001a\u00028\u0000H\u0004¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\"\u0010\u0017\u001a\u00020\u00038\u0004@\u0004X\u0084\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010\u0013\u001a\u0004\b\u0015\u0010\r\"\u0004\b\u0016\u0010\u0006R\"\u0010\u001d\u001a\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u00188\u0002X\u0082\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u0012\u0004\b\u001b\u0010\u001c¨\u0006\u001e"}, m28850d2 = {"Lkotlin/jvm/internal/PrimitiveSpreadBuilder;", "", "T", "", "size", "<init>", "(I)V", "getSize", "(Ljava/lang/Object;)I", "spreadArgument", "", "addSpread", "(Ljava/lang/Object;)V", "()I", "values", "result", "toArray", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", PDPageLabelRange.STYLE_LETTERS_LOWER, "I", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "getPosition", "setPosition", "position", "", OperatorName.CURVE_TO, "[Ljava/lang/Object;", "getSpreads$annotations", "()V", "spreads", "kotlin-stdlib"}, m28849k = 1, m28848mv = {1, 9, 0})
/* loaded from: classes5.dex */
public abstract class PrimitiveSpreadBuilder<T> {

    /* renamed from: a */
    public final int f68277a;

    /* renamed from: b */
    public int f68278b;

    /* renamed from: c */
    public final Object[] f68279c;

    public PrimitiveSpreadBuilder(int i) {
        this.f68277a = i;
        this.f68279c = new Object[i];
    }

    public final void addSpread(@NotNull T spreadArgument) {
        Intrinsics.checkNotNullParameter(spreadArgument, "spreadArgument");
        Object[] objArr = this.f68279c;
        int i = this.f68278b;
        this.f68278b = i + 1;
        objArr[i] = spreadArgument;
    }

    public final int getPosition() {
        return this.f68278b;
    }

    public abstract int getSize(@NotNull T t);

    public final void setPosition(int i) {
        this.f68278b = i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [kotlin.collections.IntIterator, java.util.Iterator] */
    public final int size() {
        int i;
        int i2 = 0;
        ?? it = new IntRange(0, this.f68277a - 1).iterator();
        while (it.hasNext()) {
            Object obj = this.f68279c[it.nextInt()];
            if (obj != null) {
                i = getSize(obj);
            } else {
                i = 1;
            }
            i2 += i;
        }
        return i2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [kotlin.collections.IntIterator, java.util.Iterator] */
    @NotNull
    public final T toArray(@NotNull T values, @NotNull T result) {
        Intrinsics.checkNotNullParameter(values, "values");
        Intrinsics.checkNotNullParameter(result, "result");
        ?? it = new IntRange(0, this.f68277a - 1).iterator();
        int i = 0;
        int i2 = 0;
        while (it.hasNext()) {
            int nextInt = it.nextInt();
            Object obj = this.f68279c[nextInt];
            if (obj != null) {
                if (i < nextInt) {
                    int i3 = nextInt - i;
                    System.arraycopy(values, i, result, i2, i3);
                    i2 += i3;
                }
                int size = getSize(obj);
                System.arraycopy(obj, 0, result, i2, size);
                i2 += size;
                i = nextInt + 1;
            }
        }
        int i4 = this.f68277a;
        if (i < i4) {
            System.arraycopy(values, i, result, i2, i4 - i);
        }
        return result;
    }
}
