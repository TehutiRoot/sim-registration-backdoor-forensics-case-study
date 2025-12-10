package p000;

import java.nio.file.Path;
import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: Ui1  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C18609Ui1 {

    /* renamed from: a */
    public final Path f6701a;

    /* renamed from: b */
    public final Object f6702b;

    /* renamed from: c */
    public final C18609Ui1 f6703c;

    /* renamed from: d */
    public Iterator f6704d;

    public C18609Ui1(Path path, Object obj, C18609Ui1 c18609Ui1) {
        Intrinsics.checkNotNullParameter(path, "path");
        this.f6701a = path;
        this.f6702b = obj;
        this.f6703c = c18609Ui1;
    }

    /* renamed from: a */
    public final Iterator m66105a() {
        return this.f6704d;
    }

    /* renamed from: b */
    public final Object m66104b() {
        return this.f6702b;
    }

    /* renamed from: c */
    public final C18609Ui1 m66103c() {
        return this.f6703c;
    }

    /* renamed from: d */
    public final Path m66102d() {
        return this.f6701a;
    }

    /* renamed from: e */
    public final void m66101e(Iterator it) {
        this.f6704d = it;
    }
}