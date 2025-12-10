package kotlin.p023io;

import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import java.io.BufferedReader;
import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.KMappedMarker;
import org.jetbrains.annotations.NotNull;

@Metadata(m29143d1 = {"\u0000\u0015\n\u0000\n\u0002\u0010(\n\u0002\u0010\u000e\n\u0002\u0010\u000b\n\u0002\b\u000b*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0004\u001a\u00020\u0003H\u0096\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\u0006\u0010\u0007R\u0018\u0010\n\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0016\u0010\r\u001a\u00020\u00038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\u000e"}, m29142d2 = {"kotlin/io/LinesSequence$iterator$1", "", "", "", "hasNext", "()Z", "next", "()Ljava/lang/String;", PDPageLabelRange.STYLE_LETTERS_LOWER, "Ljava/lang/String;", "nextValue", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "Z", "done", "kotlin-stdlib"}, m29141k = 1, m29140mv = {1, 9, 0})
/* renamed from: kotlin.io.LinesSequence$iterator$1 */
/* loaded from: classes5.dex */
public final class LinesSequence$iterator$1 implements Iterator<String>, KMappedMarker {

    /* renamed from: a */
    public String f68265a;

    /* renamed from: b */
    public boolean f68266b;

    /* renamed from: c */
    public final /* synthetic */ LinesSequence f68267c;

    public LinesSequence$iterator$1(LinesSequence linesSequence) {
        this.f68267c = linesSequence;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        BufferedReader bufferedReader;
        if (this.f68265a == null && !this.f68266b) {
            bufferedReader = this.f68267c.f68264a;
            String readLine = bufferedReader.readLine();
            this.f68265a = readLine;
            if (readLine == null) {
                this.f68266b = true;
            }
        }
        if (this.f68265a != null) {
            return true;
        }
        return false;
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Iterator
    @NotNull
    public String next() {
        if (hasNext()) {
            String str = this.f68265a;
            this.f68265a = null;
            Intrinsics.checkNotNull(str);
            return str;
        }
        throw new NoSuchElementException();
    }
}