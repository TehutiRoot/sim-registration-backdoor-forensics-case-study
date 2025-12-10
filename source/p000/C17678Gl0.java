package p000;

import p046rx.Observable;
import p046rx.functions.Func1;
import th.p047co.dtac.android.dtacone.model.login.SessionEntity;
import th.p047co.dtac.android.dtacone.presenter.login.LoginPresenter;

/* renamed from: Gl0  reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final /* synthetic */ class C17678Gl0 implements Func1 {

    /* renamed from: a */
    public final /* synthetic */ LoginPresenter f1999a;

    public /* synthetic */ C17678Gl0(LoginPresenter loginPresenter) {
        this.f1999a = loginPresenter;
    }

    @Override // p046rx.functions.Func1
    public final Object call(Object obj) {
        Observable m17830Z;
        m17830Z = this.f1999a.m17830Z((SessionEntity) obj);
        return m17830Z;
    }
}
