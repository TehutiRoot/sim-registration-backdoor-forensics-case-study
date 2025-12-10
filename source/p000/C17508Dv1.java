package p000;

import kotlinx.coroutines.internal.LockFreeLinkedListNode;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* renamed from: Dv1  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C17508Dv1 {

    /* renamed from: a */
    public final LockFreeLinkedListNode f1143a;

    public C17508Dv1(LockFreeLinkedListNode lockFreeLinkedListNode) {
        this.f1143a = lockFreeLinkedListNode;
    }

    public String toString() {
        return "Removed[" + this.f1143a + AbstractJsonLexerKt.END_LIST;
    }
}
