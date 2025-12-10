package p000;

import p046rx.Observable;
import p046rx.functions.Func1;
import th.p047co.dtac.android.dtacone.model.login.SessionEntity;
import th.p047co.dtac.android.dtacone.presenter.login.LoginPresenter;

/* renamed from: Hl0  reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final /* synthetic */ class C17742Hl0 implements Func1 {

    /* renamed from: a */
    public final /* synthetic */ LoginPresenter f2298a;

    public /* synthetic */ C17742Hl0(LoginPresenter loginPresenter) {
        this.f2298a = loginPresenter;
    }

    @Override // p046rx.functions.Func1
    public final Object call(Object obj) {
        Observable m17837V0;
        m17837V0 = this.f2298a.m17837V0((SessionEntity) obj);
        return m17837V0;
    }
}
