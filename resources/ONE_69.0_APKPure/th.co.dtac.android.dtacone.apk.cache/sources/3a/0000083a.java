package p000;

import kotlin.reflect.KClass;
import kotlin.reflect.KProperty1;
import kotlin.reflect.full.KClasses;
import kotlin.reflect.jvm.internal.impl.utils.DFS;

/* renamed from: Ih0  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public class C17825Ih0 implements DFS.Neighbors {

    /* renamed from: a */
    public final KProperty1 f2747a;

    public C17825Ih0(KProperty1 kProperty1) {
        this.f2747a = kProperty1;
    }

    @Override // kotlin.reflect.jvm.internal.impl.utils.DFS.Neighbors
    public Iterable getNeighbors(Object obj) {
        Iterable m29002f;
        m29002f = KClasses.m29002f(this.f2747a, (KClass) obj);
        return m29002f;
    }
}