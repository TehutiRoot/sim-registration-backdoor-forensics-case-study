package p000;

import p046rx.Observable;
import p046rx.functions.Func1;
import th.p047co.dtac.android.dtacone.model.login.SessionEntity;
import th.p047co.dtac.android.dtacone.presenter.login.LoginPresenter;

/* renamed from: Nl0  reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final /* synthetic */ class C18162Nl0 implements Func1 {

    /* renamed from: a */
    public final /* synthetic */ LoginPresenter f4257a;

    public /* synthetic */ C18162Nl0(LoginPresenter loginPresenter) {
        this.f4257a = loginPresenter;
    }

    @Override // p046rx.functions.Func1
    public final Object call(Object obj) {
        Observable m18005V0;
        m18005V0 = this.f4257a.m18005V0((SessionEntity) obj);
        return m18005V0;
    }
}