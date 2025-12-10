package p000;

import java.net.URL;
import java.util.function.Supplier;
import org.apache.commons.p028io.function.IOSupplier;

/* renamed from: HY */
/* loaded from: classes6.dex */
public final /* synthetic */ class C0525HY implements IOSupplier {

    /* renamed from: a */
    public final /* synthetic */ URL f2406a;

    public /* synthetic */ C0525HY(URL url) {
        this.f2406a = url;
    }

    @Override // org.apache.commons.p028io.function.IOSupplier
    public /* synthetic */ Supplier asSupplier() {
        return AbstractC18132Nb0.m67225a(this);
    }

    @Override // org.apache.commons.p028io.function.IOSupplier
    public final Object get() {
        return this.f2406a.openStream();
    }

    @Override // org.apache.commons.p028io.function.IOSupplier
    public /* synthetic */ Object getUnchecked() {
        return AbstractC18132Nb0.m67224b(this);
    }
}