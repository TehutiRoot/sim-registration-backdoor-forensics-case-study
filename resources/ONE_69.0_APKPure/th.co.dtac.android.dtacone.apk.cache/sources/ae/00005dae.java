package androidx.compose.runtime;

import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.markers.KMappedMarker;
import org.jetbrains.annotations.Nullable;

@Metadata(m29143d1 = {"\u0000\u001d\n\u0000\n\u0002\u0010(\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\b*\u0001\u0000\b\n\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001J\u0010\u0010\u0004\u001a\u00020\u0003H\u0096\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u0002H\u0096\u0002¢\u0006\u0004\b\u0006\u0010\u0007R\"\u0010\u000f\u001a\u00020\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e¨\u0006\u0010"}, m29142d2 = {"androidx/compose/runtime/SlotWriter$groupSlots$1", "", "", "", "hasNext", "()Z", "next", "()Ljava/lang/Object;", "", PDPageLabelRange.STYLE_LETTERS_LOWER, "I", "getCurrent", "()I", "setCurrent", "(I)V", "current", "runtime_release"}, m29141k = 1, m29140mv = {1, 8, 0})
/* loaded from: classes2.dex */
public final class SlotWriter$groupSlots$1 implements Iterator<Object>, KMappedMarker {

    /* renamed from: a */
    public int f28547a;

    /* renamed from: b */
    public final /* synthetic */ int f28548b;

    /* renamed from: c */
    public final /* synthetic */ SlotWriter f28549c;

    public SlotWriter$groupSlots$1(int i, int i2, SlotWriter slotWriter) {
        this.f28548b = i2;
        this.f28549c = slotWriter;
        this.f28547a = i;
    }

    public final int getCurrent() {
        return this.f28547a;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        if (this.f28547a < this.f28548b) {
            return true;
        }
        return false;
    }

    @Override // java.util.Iterator
    @Nullable
    public Object next() {
        int m60101i;
        if (hasNext()) {
            Object[] objArr = this.f28549c.f28528c;
            SlotWriter slotWriter = this.f28549c;
            int i = this.f28547a;
            this.f28547a = i + 1;
            m60101i = slotWriter.m60101i(i);
            return objArr[m60101i];
        }
        return null;
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final void setCurrent(int i) {
        this.f28547a = i;
    }
}