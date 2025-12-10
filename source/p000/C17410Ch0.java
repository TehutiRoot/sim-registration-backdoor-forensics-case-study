package p000;

import kotlin.reflect.KClass;
import kotlin.reflect.KProperty1;
import kotlin.reflect.full.KClasses;
import kotlin.reflect.jvm.internal.impl.utils.DFS;

/* renamed from: Ch0  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public class C17410Ch0 implements DFS.Neighbors {

    /* renamed from: a */
    public final KProperty1 f801a;

    public C17410Ch0(KProperty1 kProperty1) {
        this.f801a = kProperty1;
    }

    @Override // kotlin.reflect.jvm.internal.impl.utils.DFS.Neighbors
    public Iterable getNeighbors(Object obj) {
        Iterable m28710f;
        m28710f = KClasses.m28710f(this.f801a, (KClass) obj);
        return m28710f;
    }
}
