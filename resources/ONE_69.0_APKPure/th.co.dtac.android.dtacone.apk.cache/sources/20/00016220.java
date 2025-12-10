package p000;

import java.util.Iterator;
import kotlin.collections.EmptyIterator;
import kotlin.sequences.DropTakeSequence;
import kotlin.sequences.Sequence;

/* renamed from: yR */
/* loaded from: classes6.dex */
public final class C17129yR implements Sequence, DropTakeSequence {

    /* renamed from: a */
    public static final C17129yR f109036a = new C17129yR();

    @Override // kotlin.sequences.DropTakeSequence
    /* renamed from: a */
    public C17129yR drop(int i) {
        return f109036a;
    }

    @Override // kotlin.sequences.DropTakeSequence
    /* renamed from: b */
    public C17129yR take(int i) {
        return f109036a;
    }

    @Override // kotlin.sequences.Sequence
    public Iterator iterator() {
        return EmptyIterator.INSTANCE;
    }
}