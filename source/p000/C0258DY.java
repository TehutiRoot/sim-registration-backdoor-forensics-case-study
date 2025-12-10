package p000;

import java.net.URL;
import java.util.function.Supplier;
import org.apache.commons.p028io.function.IOSupplier;

/* renamed from: DY */
/* loaded from: classes6.dex */
public final /* synthetic */ class C0258DY implements IOSupplier {

    /* renamed from: a */
    public final /* synthetic */ URL f1019a;

    public /* synthetic */ C0258DY(URL url) {
        this.f1019a = url;
    }

    @Override // org.apache.commons.p028io.function.IOSupplier
    public /* synthetic */ Supplier asSupplier() {
        return AbstractC17712Hb0.m68064a(this);
    }

    @Override // org.apache.commons.p028io.function.IOSupplier
    public final Object get() {
        return this.f1019a.openStream();
    }

    @Override // org.apache.commons.p028io.function.IOSupplier
    public /* synthetic */ Object getUnchecked() {
        return AbstractC17712Hb0.m68063b(this);
    }
}
