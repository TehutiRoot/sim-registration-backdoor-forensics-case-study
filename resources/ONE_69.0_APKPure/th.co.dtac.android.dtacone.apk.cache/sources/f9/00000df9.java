package p000;

import p046rx.Observable;
import p046rx.functions.Func1;
import th.p047co.dtac.android.dtacone.model.login.SessionEntity;
import th.p047co.dtac.android.dtacone.presenter.login.LoginPresenter;

/* renamed from: Ol0  reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final /* synthetic */ class C18227Ol0 implements Func1 {

    /* renamed from: a */
    public final /* synthetic */ LoginPresenter f4525a;

    public /* synthetic */ C18227Ol0(LoginPresenter loginPresenter) {
        this.f4525a = loginPresenter;
    }

    @Override // p046rx.functions.Func1
    public final Object call(Object obj) {
        Observable m17995a0;
        m17995a0 = this.f4525a.m17995a0((SessionEntity) obj);
        return m17995a0;
    }
}