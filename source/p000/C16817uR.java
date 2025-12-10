package p000;

import java.util.Iterator;
import kotlin.collections.EmptyIterator;
import kotlin.sequences.DropTakeSequence;
import kotlin.sequences.Sequence;

/* renamed from: uR */
/* loaded from: classes6.dex */
public final class C16817uR implements Sequence, DropTakeSequence {

    /* renamed from: a */
    public static final C16817uR f107358a = new C16817uR();

    @Override // kotlin.sequences.DropTakeSequence
    /* renamed from: a */
    public C16817uR drop(int i) {
        return f107358a;
    }

    @Override // kotlin.sequences.DropTakeSequence
    /* renamed from: b */
    public C16817uR take(int i) {
        return f107358a;
    }

    @Override // kotlin.sequences.Sequence
    public Iterator iterator() {
        return EmptyIterator.INSTANCE;
    }
}
