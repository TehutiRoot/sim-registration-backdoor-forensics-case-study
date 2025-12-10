package p000;

import kotlin.reflect.jvm.internal.impl.builtins.jvm.JvmBuiltInsCustomizer;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.utils.DFS;

/* renamed from: Fh0  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public class C17630Fh0 implements DFS.Neighbors {

    /* renamed from: a */
    public static final C17630Fh0 f1746a = new C17630Fh0();

    @Override // kotlin.reflect.jvm.internal.impl.utils.DFS.Neighbors
    public Iterable getNeighbors(Object obj) {
        Iterable m28868n;
        m28868n = JvmBuiltInsCustomizer.m28868n((CallableMemberDescriptor) obj);
        return m28868n;
    }
}