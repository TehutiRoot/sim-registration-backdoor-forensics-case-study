package kotlin.p023io;

import java.io.BufferedReader;
import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.Sequence;

/* renamed from: kotlin.io.LinesSequence */
/* loaded from: classes5.dex */
public final class LinesSequence implements Sequence {

    /* renamed from: a */
    public final BufferedReader f68264a;

    public LinesSequence(BufferedReader reader) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        this.f68264a = reader;
    }

    @Override // kotlin.sequences.Sequence
    public Iterator iterator() {
        return new LinesSequence$iterator$1(this);
    }
}