package p000;

import p046rx.Observable;
import p046rx.functions.Func1;
import th.p047co.dtac.android.dtacone.model.login.SessionEntity;
import th.p047co.dtac.android.dtacone.presenter.login.LoginPresenter;

/* renamed from: Il0  reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final /* synthetic */ class C17806Il0 implements Func1 {

    /* renamed from: a */
    public final /* synthetic */ LoginPresenter f2586a;

    public /* synthetic */ C17806Il0(LoginPresenter loginPresenter) {
        this.f2586a = loginPresenter;
    }

    @Override // p046rx.functions.Func1
    public final Object call(Object obj) {
        Observable m17827a0;
        m17827a0 = this.f2586a.m17827a0((SessionEntity) obj);
        return m17827a0;
    }
}
