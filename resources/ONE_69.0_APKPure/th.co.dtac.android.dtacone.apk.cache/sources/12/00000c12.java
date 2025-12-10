package p000;

import p046rx.functions.Func1;
import th.p047co.dtac.android.dtacone.model.login.SessionEntity;
import th.p047co.dtac.android.dtacone.presenter.login.LoginPresenter;

/* renamed from: Ml0  reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final /* synthetic */ class C18097Ml0 implements Func1 {

    /* renamed from: a */
    public final /* synthetic */ LoginPresenter f3955a;

    public /* synthetic */ C18097Ml0(LoginPresenter loginPresenter) {
        this.f3955a = loginPresenter;
    }

    @Override // p046rx.functions.Func1
    public final Object call(Object obj) {
        return LoginPresenter.m18024M(this.f3955a, (SessionEntity) obj);
    }
}