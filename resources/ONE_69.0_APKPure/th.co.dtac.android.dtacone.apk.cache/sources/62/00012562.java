package th.p047co.dtac.android.dtacone.presenter.sim_r;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p046rx.Observable;
import p046rx.functions.Func1;
import th.p047co.dtac.android.dtacone.extension.format.PhoneNumberExtKt;
import th.p047co.dtac.android.dtacone.model.SimRCollection;
import th.p047co.dtac.android.dtacone.util.AESCryptUtil;

@Metadata(m29143d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a*\u0012\u000e\b\u0001\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002 \u0003*\u0014\u0012\u000e\b\u0001\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002\u0018\u00010\u00010\u00012\u000e\u0010\u0004\u001a\n \u0003*\u0004\u0018\u00010\u00050\u0005H\n¢\u0006\u0002\b\u0006"}, m29142d2 = {"<anonymous>", "Lrx/Observable;", "", "kotlin.jvm.PlatformType", "simRColl", "Lth/co/dtac/android/dtacone/model/SimRCollection;", "invoke"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.presenter.sim_r.SimRListPresenter$getSimRList$1 */
/* loaded from: classes8.dex */
public final class SimRListPresenter$getSimRList$1 extends Lambda implements Function1<SimRCollection, Observable<? extends String>> {
    public static final SimRListPresenter$getSimRList$1 INSTANCE = new SimRListPresenter$getSimRList$1();

    @Metadata(m29143d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u00012\u000e\u0010\u0003\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0002\b\u0004"}, m29142d2 = {"<anonymous>", "", "kotlin.jvm.PlatformType", "it", "invoke"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
    /* renamed from: th.co.dtac.android.dtacone.presenter.sim_r.SimRListPresenter$getSimRList$1$1 */
    /* loaded from: classes8.dex */
    public static final class C143861 extends Lambda implements Function1<String, String> {
        public static final C143861 INSTANCE = new C143861();

        public C143861() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final String invoke(String it) {
            Intrinsics.checkNotNullExpressionValue(it, "it");
            return PhoneNumberExtKt.toPretty(AESCryptUtil.decryptCBC(it, "JfMhPmSpUrXuZw4z6B8EbGdJgNjQmTKl"));
        }
    }

    public SimRListPresenter$getSimRList$1() {
        super(1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String invoke$lambda$0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (String) tmp0.invoke(obj);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Observable<? extends String> invoke(SimRCollection simRCollection) {
        Observable from = Observable.from(simRCollection.getSimRList());
        final C143861 c143861 = C143861.INSTANCE;
        return from.map(new Func1() { // from class: th.co.dtac.android.dtacone.presenter.sim_r.a
            @Override // p046rx.functions.Func1
            public final Object call(Object obj) {
                String invoke$lambda$0;
                invoke$lambda$0 = SimRListPresenter$getSimRList$1.invoke$lambda$0(Function1.this, obj);
                return invoke$lambda$0;
            }
        });
    }
}