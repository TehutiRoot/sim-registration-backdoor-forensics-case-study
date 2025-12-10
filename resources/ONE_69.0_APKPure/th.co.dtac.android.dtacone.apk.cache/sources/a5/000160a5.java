package p000;

import androidx.compose.p003ui.tooling.CompositionDataRecord;
import java.util.Collections;
import java.util.Set;
import java.util.WeakHashMap;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: wv */
/* loaded from: classes2.dex */
public final class C17015wv implements CompositionDataRecord {

    /* renamed from: a */
    public final Set f108594a;

    public C17015wv() {
        Set newSetFromMap = Collections.newSetFromMap(new WeakHashMap());
        Intrinsics.checkNotNullExpressionValue(newSetFromMap, "newSetFromMap(WeakHashMap())");
        this.f108594a = newSetFromMap;
    }

    @Override // androidx.compose.p003ui.tooling.CompositionDataRecord
    public Set getStore() {
        return this.f108594a;
    }
}