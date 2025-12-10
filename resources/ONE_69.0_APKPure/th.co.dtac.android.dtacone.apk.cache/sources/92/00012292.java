package th.p047co.dtac.android.dtacone.presenter.card_reader;

import android.bluetooth.BluetoothAdapter;
import java.util.concurrent.TimeUnit;
import p046rx.Observable;
import p046rx.Subscription;
import p046rx.functions.Action1;
import p046rx.functions.Func1;
import p046rx.functions.Func2;
import p046rx.subscriptions.CompositeSubscription;
import th.p047co.dtac.android.dtacone.R;
import th.p047co.dtac.android.dtacone.manager.bus.RxBus;
import th.p047co.dtac.android.dtacone.manager.bus.event.ReaderStatusEvent;
import th.p047co.dtac.android.dtacone.manager.cardreader.CardReaderReadException;
import th.p047co.dtac.android.dtacone.manager.cardreader.CardReaderService;
import th.p047co.dtac.android.dtacone.manager.cardreader.bluetooth.BluetoothService;
import th.p047co.dtac.android.dtacone.manager.service.RxThreadService;
import th.p047co.dtac.android.dtacone.presenter.ILoadingViewable;
import th.p047co.dtac.android.dtacone.presenter.IPresenter;
import th.p047co.dtac.android.dtacone.presenter.LifecyclePresenter;
import th.p047co.dtac.android.dtacone.presenter.card_reader.BaseCardReaderPresenter;

/* renamed from: th.co.dtac.android.dtacone.presenter.card_reader.BaseCardReaderPresenter */
/* loaded from: classes8.dex */
public abstract class BaseCardReaderPresenter extends LifecyclePresenter {
    protected static final String TAG = "CardReaderPresenter";

    /* renamed from: a */
    public RxBus f85574a;

    /* renamed from: b */
    public RxThreadService f85575b;

    /* renamed from: c */
    public CompositeSubscription f85576c = new CompositeSubscription();

    /* renamed from: d */
    public Subscription f85577d;

    /* renamed from: e */
    public BluetoothAdapter f85578e;

    /* renamed from: f */
    public BluetoothService f85579f;

    /* renamed from: th.co.dtac.android.dtacone.presenter.card_reader.BaseCardReaderPresenter$View */
    /* loaded from: classes8.dex */
    public interface View extends IPresenter.IView, ILoadingViewable {
        void showDialogMessage(int i);

        void showStepMessage(int i);
    }

    public BaseCardReaderPresenter(RxBus<Object> rxBus, RxThreadService rxThreadService, BluetoothService bluetoothService) {
        this.f85574a = rxBus;
        this.f85575b = rxThreadService;
        this.f85579f = bluetoothService;
    }

    /* renamed from: a */
    public static /* synthetic */ void m18584a(Boolean bool) {
        m18570o(bool);
    }

    /* renamed from: b */
    public static /* synthetic */ Observable m18583b(Observable observable, Integer num) {
        return m18572m(observable, num);
    }

    /* renamed from: d */
    public static /* synthetic */ Boolean m18581d(CardReaderService cardReaderService, Integer num) {
        return m18571n(cardReaderService, num);
    }

    /* renamed from: e */
    public static /* synthetic */ void m18580e(Throwable th2) {
        m18575j(th2);
    }

    /* renamed from: f */
    public static /* synthetic */ Integer m18579f(Throwable th2, Integer num) {
        return m18573l(th2, num);
    }

    /* renamed from: g */
    public static /* synthetic */ void m18578g(BaseCardReaderPresenter baseCardReaderPresenter, ReaderStatusEvent readerStatusEvent) {
        baseCardReaderPresenter.m18576i(readerStatusEvent);
    }

    /* renamed from: j */
    public static /* synthetic */ void m18575j(Throwable th2) {
    }

    /* renamed from: l */
    public static /* synthetic */ Integer m18573l(Throwable th2, Integer num) {
        return num;
    }

    /* renamed from: m */
    public static /* synthetic */ Observable m18572m(Observable observable, Integer num) {
        if (num.intValue() == 1) {
            return Observable.just(num);
        }
        return observable.flatMap(new Func1() { // from class: Ea
            @Override // p046rx.functions.Func1
            public final Object call(Object obj) {
                return Observable.error((Throwable) obj);
            }
        });
    }

    /* renamed from: n */
    public static /* synthetic */ Boolean m18571n(CardReaderService cardReaderService, Integer num) {
        return Boolean.valueOf(cardReaderService.unlockDevice());
    }

    /* renamed from: o */
    public static /* synthetic */ void m18570o(Boolean bool) {
    }

    public void dialogMessageTryReconnect() {
        getView().showDialogMessage(getMessageTryReconnect());
    }

    public void dialogMessageTryReinsert() {
        getView().showDialogMessage(getMessageTryReinsert());
    }

    public void disconnectDevice() {
        Subscription subscription = this.f85577d;
        if (subscription != null && !subscription.isUnsubscribed()) {
            this.f85577d.unsubscribe();
            this.f85576c.remove(this.f85577d);
            this.f85577d = null;
            dialogMessageTryReinsert();
        }
    }

    public abstract Subscription fetchCardData();

    public abstract int getMessageInsertCard();

    public abstract int getMessageOpenCardReader();

    public abstract int getMessageTryReconnect();

    public abstract int getMessageTryReinsert();

    public abstract View getView();

    /* renamed from: i */
    public final /* synthetic */ void m18576i(ReaderStatusEvent readerStatusEvent) {
        switch (readerStatusEvent.getStatus()) {
            case 1:
                stepMessageInsertIdCard();
                return;
            case 2:
                stepMessageOpenCardReader();
                disconnectDevice();
                return;
            case 3:
                dialogMessageTryReconnect();
                return;
            case 4:
                Subscription fetchCardData = fetchCardData();
                this.f85577d = fetchCardData;
                if (fetchCardData != null) {
                    this.f85576c.add(fetchCardData);
                    return;
                }
                return;
            case 5:
                stopFetchCardData();
                return;
            case 6:
                dialogMessageTryReinsert();
                return;
            default:
                return;
        }
    }

    public boolean isApduError(Throwable th2) {
        if ((th2 instanceof CardReaderReadException) && "trans apdu error".equals(th2.getMessage())) {
            return true;
        }
        return false;
    }

    /* renamed from: k */
    public final /* synthetic */ Observable m18574k(Throwable th2) {
        if (isApduError(th2)) {
            return Observable.just(th2);
        }
        return Observable.error(th2);
    }

    @Override // th.p047co.dtac.android.dtacone.presenter.LifecyclePresenter, th.p047co.dtac.android.dtacone.presenter.IPresenter
    public void onPause() {
        Subscription subscription = this.f85577d;
        if (subscription != null && subscription.isUnsubscribed()) {
            this.f85577d.unsubscribe();
            this.f85576c.remove(this.f85577d);
            this.f85577d = null;
        }
        this.f85576c.clear();
    }

    @Override // th.p047co.dtac.android.dtacone.presenter.LifecyclePresenter, th.p047co.dtac.android.dtacone.presenter.IPresenter
    public void onResume() {
        this.f85578e = this.f85579f.getBluetoothService();
        if (!this.f85579f.isSupportBluetooth()) {
            getView().showDialogMessage(R.string.mnp_card_reader_read_error_bluetooth_support);
        }
        m18568q();
    }

    /* renamed from: p */
    public final /* synthetic */ Observable m18569p(final CardReaderService cardReaderService, final Observable observable) {
        return observable.flatMap(new Func1() { // from class: za
            @Override // p046rx.functions.Func1
            public final Object call(Object obj) {
                Observable m18574k;
                m18574k = BaseCardReaderPresenter.this.m18574k((Throwable) obj);
                return m18574k;
            }
        }).zipWith(Observable.range(1, 2), new Func2() { // from class: Aa
            @Override // p046rx.functions.Func2
            public final Object call(Object obj, Object obj2) {
                return BaseCardReaderPresenter.m18579f((Throwable) obj, (Integer) obj2);
            }
        }).flatMap(new Func1() { // from class: Ba
            @Override // p046rx.functions.Func1
            public final Object call(Object obj) {
                return BaseCardReaderPresenter.m18583b(Observable.this, (Integer) obj);
            }
        }).map(new Func1() { // from class: Ca
            @Override // p046rx.functions.Func1
            public final Object call(Object obj) {
                return BaseCardReaderPresenter.m18581d(CardReaderService.this, (Integer) obj);
            }
        }).doOnNext(new Action1() { // from class: Da
            @Override // p046rx.functions.Action1
            public final void call(Object obj) {
                BaseCardReaderPresenter.m18584a((Boolean) obj);
            }
        });
    }

    /* renamed from: q */
    public final void m18568q() {
        this.f85576c.add(this.f85574a.observeEvents(ReaderStatusEvent.class).debounce(500L, TimeUnit.MILLISECONDS).compose(this.f85575b.applyAsync()).subscribe(new Action1() { // from class: xa
            @Override // p046rx.functions.Action1
            public final void call(Object obj) {
                BaseCardReaderPresenter.m18578g(BaseCardReaderPresenter.this, (ReaderStatusEvent) obj);
            }
        }, new Action1() { // from class: ya
            @Override // p046rx.functions.Action1
            public final void call(Object obj) {
                BaseCardReaderPresenter.m18580e((Throwable) obj);
            }
        }));
    }

    public Func1<Observable<? extends Throwable>, Observable<?>> retryWithUnlockDeviceObservable(final CardReaderService cardReaderService) {
        return new Func1() { // from class: wa
            @Override // p046rx.functions.Func1
            public final Object call(Object obj) {
                Observable m18569p;
                m18569p = BaseCardReaderPresenter.this.m18569p(cardReaderService, (Observable) obj);
                return m18569p;
            }
        };
    }

    public void stepMessageInsertIdCard() {
        getView().showStepMessage(getMessageInsertCard());
    }

    public void stepMessageOpenCardReader() {
        getView().showStepMessage(getMessageOpenCardReader());
    }

    public void stopFetchCardData() {
        Subscription subscription = this.f85577d;
        if (subscription != null && subscription.isUnsubscribed()) {
            this.f85577d.unsubscribe();
            this.f85576c.remove(this.f85577d);
            this.f85577d = null;
            stepMessageInsertIdCard();
        }
    }
}