package kotlin.ranges;

import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.collections.CharIterator;
import kotlin.jvm.internal.Intrinsics;

@Metadata(m28851d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\f\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0000\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tH\u0096\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\f\u0010\rR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0013\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u000fR\u0016\u0010\n\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0016\u0010\u0017\u001a\u00020\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\u000f¨\u0006\u0018"}, m28850d2 = {"Lkotlin/ranges/CharProgressionIterator;", "Lkotlin/collections/CharIterator;", "", "first", "last", "", "step", "<init>", "(CCI)V", "", "hasNext", "()Z", "nextChar", "()C", PDPageLabelRange.STYLE_LETTERS_LOWER, "I", "getStep", "()I", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "finalElement", OperatorName.CURVE_TO, "Z", "d", "next", "kotlin-stdlib"}, m28849k = 1, m28848mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class CharProgressionIterator extends CharIterator {

    /* renamed from: a */
    public final int f68307a;

    /* renamed from: b */
    public final int f68308b;

    /* renamed from: c */
    public boolean f68309c;

    /* renamed from: d */
    public int f68310d;

    public CharProgressionIterator(char c, char c2, int i) {
        this.f68307a = i;
        this.f68308b = c2;
        boolean z = false;
        if (i <= 0 ? Intrinsics.compare((int) c, (int) c2) >= 0 : Intrinsics.compare((int) c, (int) c2) <= 0) {
            z = true;
        }
        this.f68309c = z;
        this.f68310d = z ? c : c2;
    }

    public final int getStep() {
        return this.f68307a;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f68309c;
    }

    @Override // kotlin.collections.CharIterator
    public char nextChar() {
        int i = this.f68310d;
        if (i == this.f68308b) {
            if (this.f68309c) {
                this.f68309c = false;
            } else {
                throw new NoSuchElementException();
            }
        } else {
            this.f68310d = this.f68307a + i;
        }
        return (char) i;
    }
}
