package p000;

import kotlinx.coroutines.internal.LockFreeLinkedListNode;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* renamed from: Aw1  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C17342Aw1 {

    /* renamed from: a */
    public final LockFreeLinkedListNode f261a;

    public C17342Aw1(LockFreeLinkedListNode lockFreeLinkedListNode) {
        this.f261a = lockFreeLinkedListNode;
    }

    public String toString() {
        return "Removed[" + this.f261a + AbstractJsonLexerKt.END_LIST;
    }
}