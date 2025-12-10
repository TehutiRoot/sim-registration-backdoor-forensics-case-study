package com.netcetera.threeds.sdk.infrastructure;

import java.util.concurrent.Callable;

/* loaded from: classes5.dex */
class setProgressBackgroundTintList implements Callable {
    private final setProgressTintMode ThreeDS2Service;
    private final setIndeterminateTintMode valueOf;

    public setProgressBackgroundTintList(setProgressTintMode setprogresstintmode, setIndeterminateTintMode setindeterminatetintmode) {
        this.ThreeDS2Service = setprogresstintmode;
        this.valueOf = setindeterminatetintmode;
    }

    @Override // java.util.concurrent.Callable
    public Object call() {
        return setProgressTintMode.values(this.ThreeDS2Service, this.valueOf);
    }
}
