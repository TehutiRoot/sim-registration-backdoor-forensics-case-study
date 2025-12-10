package p000;

import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.collection.IdentityArraySet;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: jg0  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C20591jg0 {

    /* renamed from: a */
    public final RecomposeScopeImpl f67332a;

    /* renamed from: b */
    public final int f67333b;

    /* renamed from: c */
    public IdentityArraySet f67334c;

    public C20591jg0(RecomposeScopeImpl scope, int i, IdentityArraySet identityArraySet) {
        Intrinsics.checkNotNullParameter(scope, "scope");
        this.f67332a = scope;
        this.f67333b = i;
        this.f67334c = identityArraySet;
    }

    /* renamed from: a */
    public final IdentityArraySet m29156a() {
        return this.f67334c;
    }

    /* renamed from: b */
    public final int m29155b() {
        return this.f67333b;
    }

    /* renamed from: c */
    public final RecomposeScopeImpl m29154c() {
        return this.f67332a;
    }

    /* renamed from: d */
    public final boolean m29153d() {
        return this.f67332a.isInvalidFor(this.f67334c);
    }

    /* renamed from: e */
    public final void m29152e(IdentityArraySet identityArraySet) {
        this.f67334c = identityArraySet;
    }
}
