package org.apache.commons.p028io.build;

import java.util.function.Supplier;
import org.apache.commons.p028io.build.AbstractSupplier;
import org.apache.commons.p028io.function.IOSupplier;

/* renamed from: org.apache.commons.io.build.AbstractSupplier */
/* loaded from: classes6.dex */
public abstract class AbstractSupplier<T, B extends AbstractSupplier<T, B>> implements IOSupplier<T> {
    @Override // org.apache.commons.p028io.function.IOSupplier
    public /* synthetic */ Supplier asSupplier() {
        return AbstractC17712Hb0.m68064a(this);
    }

    public B asThis() {
        return this;
    }

    @Override // org.apache.commons.p028io.function.IOSupplier
    public /* synthetic */ Object getUnchecked() {
        return AbstractC17712Hb0.m68063b(this);
    }
}
