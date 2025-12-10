package th.p047co.dtac.android.dtacone.app_one.presenter;

import androidx.compose.runtime.internal.StabilityInferred;
import com.google.android.gms.analytics.ecommerce.Promotion;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p046rx.Observable;
import p046rx.Subscription;
import p046rx.functions.Action0;
import p046rx.functions.Action1;
import th.p047co.dtac.android.dtacone.R;
import th.p047co.dtac.android.dtacone.app_one.presenter.OneIdCardReaderPresenter;
import th.p047co.dtac.android.dtacone.manager.TemporaryCache;
import th.p047co.dtac.android.dtacone.manager.bus.RxBus;
import th.p047co.dtac.android.dtacone.manager.cardreader.CardReaderService;
import th.p047co.dtac.android.dtacone.manager.cardreader.IdCardCommand;
import th.p047co.dtac.android.dtacone.manager.cardreader.bluetooth.BluetoothService;
import th.p047co.dtac.android.dtacone.manager.service.RxThreadService;
import th.p047co.dtac.android.dtacone.model.error.ValidatedRuleException;
import th.p047co.dtac.android.dtacone.model.mnp.IdCardInformationCollection;
import th.p047co.dtac.android.dtacone.presenter.IPresenter;
import th.p047co.dtac.android.dtacone.presenter.card_reader.BaseCardReaderPresenter;
import th.p047co.dtac.android.dtacone.util.bitmap.BitmapUtil;
import th.p047co.dtac.android.dtacone.util.bitmap.draw.DrawBitmap;

@StabilityInferred(parameters = 0)
@Metadata(m28851d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u001e\b\u0007\u0018\u00002\u00020\u0001:\u0001BB_\b\u0007\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0010\u0010\n\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\t\u0018\u00010\b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0013\u0010\u0014J\u0019\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0011\u0010\u001b\u001a\u0004\u0018\u00010\u001aH\u0014¢\u0006\u0004\b\u001b\u0010\u001cJ\u0015\u0010\u001f\u001a\u00020\u00172\u0006\u0010\u001e\u001a\u00020\u001d¢\u0006\u0004\b\u001f\u0010 J\u0011\u0010\"\u001a\u0004\u0018\u00010!H\u0016¢\u0006\u0004\b\"\u0010#J\u000f\u0010$\u001a\u0004\u0018\u00010!¢\u0006\u0004\b$\u0010#J\u000f\u0010&\u001a\u00020%H\u0014¢\u0006\u0004\b&\u0010'J\u000f\u0010(\u001a\u00020%H\u0014¢\u0006\u0004\b(\u0010'J\u000f\u0010)\u001a\u00020%H\u0014¢\u0006\u0004\b)\u0010'J\u000f\u0010*\u001a\u00020%H\u0014¢\u0006\u0004\b*\u0010'J\u000f\u0010+\u001a\u00020\u0017H\u0016¢\u0006\u0004\b+\u0010,R\u0018\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b-\u0010.R\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b/\u00100R\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b1\u00102R \u0010\n\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\t\u0018\u00010\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b3\u00104R\u0018\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b5\u00106R\u0018\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b7\u00108R\u0018\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b9\u0010:R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b;\u0010<R\u0016\u0010?\u001a\u00020\u001d8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b=\u0010>R\u0018\u0010\u0016\u001a\u0004\u0018\u00010\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b@\u0010A¨\u0006C"}, m28850d2 = {"Lth/co/dtac/android/dtacone/app_one/presenter/OneIdCardReaderPresenter;", "Lth/co/dtac/android/dtacone/presenter/card_reader/BaseCardReaderPresenter;", "Lth/co/dtac/android/dtacone/manager/cardreader/IdCardCommand;", "idCardCommand", "Lth/co/dtac/android/dtacone/manager/service/RxThreadService;", "threadService", "Lth/co/dtac/android/dtacone/manager/cardreader/CardReaderService;", "cardReaderService", "Lth/co/dtac/android/dtacone/manager/bus/RxBus;", "", "bus", "Lth/co/dtac/android/dtacone/util/bitmap/BitmapUtil;", "bitmapUtil", "Lth/co/dtac/android/dtacone/manager/cardreader/bluetooth/BluetoothService;", "bluetoothService", "Lth/co/dtac/android/dtacone/util/bitmap/draw/DrawBitmap;", "drawBitmap", "Lth/co/dtac/android/dtacone/manager/TemporaryCache;", "temporaryCache", "<init>", "(Lth/co/dtac/android/dtacone/manager/cardreader/IdCardCommand;Lth/co/dtac/android/dtacone/manager/service/RxThreadService;Lth/co/dtac/android/dtacone/manager/cardreader/CardReaderService;Lth/co/dtac/android/dtacone/manager/bus/RxBus;Lth/co/dtac/android/dtacone/util/bitmap/BitmapUtil;Lth/co/dtac/android/dtacone/manager/cardreader/bluetooth/BluetoothService;Lth/co/dtac/android/dtacone/util/bitmap/draw/DrawBitmap;Lth/co/dtac/android/dtacone/manager/TemporaryCache;)V", "Lth/co/dtac/android/dtacone/presenter/IPresenter$IView;", Promotion.ACTION_VIEW, "", "attachView", "(Lth/co/dtac/android/dtacone/presenter/IPresenter$IView;)V", "Lth/co/dtac/android/dtacone/app_one/presenter/OneIdCardReaderPresenter$View;", "getView", "()Lth/co/dtac/android/dtacone/app_one/presenter/OneIdCardReaderPresenter$View;", "", "name", "setBitmapName", "(Ljava/lang/String;)V", "Lrx/Subscription;", "fetchCardData", "()Lrx/Subscription;", "oneFetchCardData", "", "getMessageOpenCardReader", "()I", "getMessageInsertCard", "getMessageTryReinsert", "getMessageTryReconnect", "onStop", "()V", OperatorName.NON_STROKING_GRAY, "Lth/co/dtac/android/dtacone/manager/cardreader/IdCardCommand;", OperatorName.CLOSE_PATH, "Lth/co/dtac/android/dtacone/manager/service/RxThreadService;", "i", "Lth/co/dtac/android/dtacone/manager/cardreader/CardReaderService;", OperatorName.SET_LINE_JOINSTYLE, "Lth/co/dtac/android/dtacone/manager/bus/RxBus;", OperatorName.NON_STROKING_CMYK, "Lth/co/dtac/android/dtacone/util/bitmap/BitmapUtil;", OperatorName.LINE_TO, "Lth/co/dtac/android/dtacone/manager/cardreader/bluetooth/BluetoothService;", OperatorName.MOVE_TO, "Lth/co/dtac/android/dtacone/util/bitmap/draw/DrawBitmap;", OperatorName.ENDPATH, "Lth/co/dtac/android/dtacone/manager/TemporaryCache;", "o", "Ljava/lang/String;", "bitmapName", "p", "Lth/co/dtac/android/dtacone/app_one/presenter/OneIdCardReaderPresenter$View;", "View", "app_prodRelease"}, m28849k = 1, m28848mv = {1, 8, 0})
/* renamed from: th.co.dtac.android.dtacone.app_one.presenter.OneIdCardReaderPresenter */
/* loaded from: classes7.dex */
public final class OneIdCardReaderPresenter extends BaseCardReaderPresenter {
    public static final int $stable = 8;

    /* renamed from: g */
    public IdCardCommand f82304g;

    /* renamed from: h */
    public RxThreadService f82305h;

    /* renamed from: i */
    public CardReaderService f82306i;

    /* renamed from: j */
    public RxBus f82307j;

    /* renamed from: k */
    public BitmapUtil f82308k;

    /* renamed from: l */
    public BluetoothService f82309l;

    /* renamed from: m */
    public DrawBitmap f82310m;

    /* renamed from: n */
    public final TemporaryCache f82311n;

    /* renamed from: o */
    public String f82312o;

    /* renamed from: p */
    public View f82313p;

    @Metadata(m28851d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0006"}, m28850d2 = {"Lth/co/dtac/android/dtacone/app_one/presenter/OneIdCardReaderPresenter$View;", "Lth/co/dtac/android/dtacone/presenter/card_reader/BaseCardReaderPresenter$View;", "onSuccessReadFinish", "", "cardInformation", "Lth/co/dtac/android/dtacone/model/mnp/IdCardInformationCollection;", "app_prodRelease"}, m28849k = 1, m28848mv = {1, 8, 0}, m28846xi = 48)
    /* renamed from: th.co.dtac.android.dtacone.app_one.presenter.OneIdCardReaderPresenter$View */
    /* loaded from: classes7.dex */
    public interface View extends BaseCardReaderPresenter.View {
        void onSuccessReadFinish(@NotNull IdCardInformationCollection idCardInformationCollection);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @Inject
    public OneIdCardReaderPresenter(@Nullable IdCardCommand idCardCommand, @Nullable RxThreadService rxThreadService, @Nullable CardReaderService cardReaderService, @Nullable RxBus<Object> rxBus, @Nullable BitmapUtil bitmapUtil, @Nullable BluetoothService bluetoothService, @Nullable DrawBitmap drawBitmap, @NotNull TemporaryCache temporaryCache) {
        super(rxBus, rxThreadService, bluetoothService);
        Intrinsics.checkNotNullParameter(temporaryCache, "temporaryCache");
        this.f82304g = idCardCommand;
        this.f82305h = rxThreadService;
        this.f82306i = cardReaderService;
        this.f82307j = rxBus;
        this.f82308k = bitmapUtil;
        this.f82309l = bluetoothService;
        this.f82310m = drawBitmap;
        this.f82311n = temporaryCache;
        this.f82312o = BitmapUtil.IMAGE_ID_CARD;
    }

    /* renamed from: A */
    public static /* synthetic */ void m20185A(OneIdCardReaderPresenter oneIdCardReaderPresenter, Throwable th2) {
        m20180F(oneIdCardReaderPresenter, th2);
    }

    /* renamed from: B */
    public static final IdCardInformationCollection m20184B(OneIdCardReaderPresenter this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        IdCardCommand idCardCommand = this$0.f82304g;
        Intrinsics.checkNotNull(idCardCommand);
        CardReaderService cardReaderService = this$0.f82306i;
        Intrinsics.checkNotNull(cardReaderService);
        return idCardCommand.getIdCardData(cardReaderService.getReader());
    }

    /* renamed from: C */
    public static final void m20183C(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: D */
    public static final void m20182D(OneIdCardReaderPresenter this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        IdCardCommand idCardCommand = this$0.f82304g;
        Intrinsics.checkNotNull(idCardCommand);
        idCardCommand.closeByeStream();
        View view = this$0.f82313p;
        Intrinsics.checkNotNull(view);
        view.dismissLoading();
    }

    /* renamed from: E */
    public static final void m20181E(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: F */
    public static final void m20180F(OneIdCardReaderPresenter this$0, Throwable th2) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (th2 instanceof ValidatedRuleException) {
            View view = this$0.f82313p;
            Intrinsics.checkNotNull(view);
            view.showDialogMessage(((ValidatedRuleException) th2).getResId());
            return;
        }
        this$0.dialogMessageTryReinsert();
    }

    /* renamed from: G */
    public static final IdCardInformationCollection m20179G(OneIdCardReaderPresenter this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        IdCardCommand idCardCommand = this$0.f82304g;
        Intrinsics.checkNotNull(idCardCommand);
        CardReaderService cardReaderService = this$0.f82306i;
        Intrinsics.checkNotNull(cardReaderService);
        return idCardCommand.getIdCardData(cardReaderService.getReader());
    }

    /* renamed from: H */
    public static final void m20178H(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: I */
    public static final void m20177I(OneIdCardReaderPresenter this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        IdCardCommand idCardCommand = this$0.f82304g;
        Intrinsics.checkNotNull(idCardCommand);
        idCardCommand.closeByeStream();
        View view = this$0.f82313p;
        Intrinsics.checkNotNull(view);
        view.dismissLoading();
    }

    /* renamed from: J */
    public static final void m20176J(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: K */
    public static final void m20175K(OneIdCardReaderPresenter this$0, Throwable th2) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (th2 instanceof ValidatedRuleException) {
            View view = this$0.f82313p;
            Intrinsics.checkNotNull(view);
            view.showDialogMessage(((ValidatedRuleException) th2).getResId());
            return;
        }
        this$0.dialogMessageTryReinsert();
    }

    /* renamed from: r */
    public static /* synthetic */ void m20174r(Function1 function1, Object obj) {
        m20181E(function1, obj);
    }

    /* renamed from: s */
    public static /* synthetic */ IdCardInformationCollection m20173s(OneIdCardReaderPresenter oneIdCardReaderPresenter) {
        return m20184B(oneIdCardReaderPresenter);
    }

    /* renamed from: t */
    public static /* synthetic */ void m20172t(Function1 function1, Object obj) {
        m20176J(function1, obj);
    }

    /* renamed from: u */
    public static /* synthetic */ void m20171u(OneIdCardReaderPresenter oneIdCardReaderPresenter) {
        m20182D(oneIdCardReaderPresenter);
    }

    /* renamed from: v */
    public static /* synthetic */ void m20170v(OneIdCardReaderPresenter oneIdCardReaderPresenter) {
        m20177I(oneIdCardReaderPresenter);
    }

    /* renamed from: w */
    public static /* synthetic */ IdCardInformationCollection m20169w(OneIdCardReaderPresenter oneIdCardReaderPresenter) {
        return m20179G(oneIdCardReaderPresenter);
    }

    /* renamed from: x */
    public static /* synthetic */ void m20168x(OneIdCardReaderPresenter oneIdCardReaderPresenter, Throwable th2) {
        m20175K(oneIdCardReaderPresenter, th2);
    }

    /* renamed from: y */
    public static /* synthetic */ void m20167y(Function1 function1, Object obj) {
        m20183C(function1, obj);
    }

    /* renamed from: z */
    public static /* synthetic */ void m20166z(Function1 function1, Object obj) {
        m20178H(function1, obj);
    }

    @Override // th.p047co.dtac.android.dtacone.presenter.IPresenter
    public void attachView(@Nullable IPresenter.IView iView) {
        this.f82313p = (View) iView;
    }

    @Override // th.p047co.dtac.android.dtacone.presenter.card_reader.BaseCardReaderPresenter
    @Nullable
    public Subscription fetchCardData() {
        CardReaderService cardReaderService = this.f82306i;
        Intrinsics.checkNotNull(cardReaderService);
        if (!cardReaderService.isConnected()) {
            stepMessageOpenCardReader();
            return null;
        }
        stepMessageInsertIdCard();
        CardReaderService cardReaderService2 = this.f82306i;
        Intrinsics.checkNotNull(cardReaderService2);
        if (!cardReaderService2.isPowerOn()) {
            return null;
        }
        View view = this.f82313p;
        Intrinsics.checkNotNull(view);
        view.showLoading();
        Observable retryWhen = Observable.fromCallable(new Callable() { // from class: RT0
            {
                OneIdCardReaderPresenter.this = this;
            }

            @Override // java.util.concurrent.Callable
            public final Object call() {
                return OneIdCardReaderPresenter.m20173s(OneIdCardReaderPresenter.this);
            }
        }).timeout(20L, TimeUnit.SECONDS).retryWhen(retryWithUnlockDeviceObservable(this.f82306i));
        final OneIdCardReaderPresenter$fetchCardData$2 oneIdCardReaderPresenter$fetchCardData$2 = new OneIdCardReaderPresenter$fetchCardData$2(this);
        Observable doOnNext = retryWhen.doOnNext(new Action1() { // from class: ST0
            @Override // p046rx.functions.Action1
            public final void call(Object obj) {
                OneIdCardReaderPresenter.m20167y(oneIdCardReaderPresenter$fetchCardData$2, obj);
            }
        });
        RxThreadService rxThreadService = this.f82305h;
        Intrinsics.checkNotNull(rxThreadService);
        Observable doOnTerminate = doOnNext.compose(rxThreadService.applyAsync()).doOnTerminate(new Action0() { // from class: TT0
            {
                OneIdCardReaderPresenter.this = this;
            }

            @Override // p046rx.functions.Action0
            public final void call() {
                OneIdCardReaderPresenter.m20171u(OneIdCardReaderPresenter.this);
            }
        });
        final OneIdCardReaderPresenter$fetchCardData$4 oneIdCardReaderPresenter$fetchCardData$4 = new OneIdCardReaderPresenter$fetchCardData$4(this);
        return doOnTerminate.subscribe(new Action1() { // from class: UT0
            @Override // p046rx.functions.Action1
            public final void call(Object obj) {
                OneIdCardReaderPresenter.m20174r(oneIdCardReaderPresenter$fetchCardData$4, obj);
            }
        }, new Action1() { // from class: VT0
            {
                OneIdCardReaderPresenter.this = this;
            }

            @Override // p046rx.functions.Action1
            public final void call(Object obj) {
                OneIdCardReaderPresenter.m20185A(OneIdCardReaderPresenter.this, (Throwable) obj);
            }
        });
    }

    @Override // th.p047co.dtac.android.dtacone.presenter.card_reader.BaseCardReaderPresenter
    public int getMessageInsertCard() {
        return R.string.one_read_smart_card_input_card;
    }

    @Override // th.p047co.dtac.android.dtacone.presenter.card_reader.BaseCardReaderPresenter
    public int getMessageOpenCardReader() {
        return R.string.mnp_card_reader_description_card_reader_not_found;
    }

    @Override // th.p047co.dtac.android.dtacone.presenter.card_reader.BaseCardReaderPresenter
    public int getMessageTryReconnect() {
        return R.string.mnp_card_reader_description_card_reader_not_found;
    }

    @Override // th.p047co.dtac.android.dtacone.presenter.card_reader.BaseCardReaderPresenter
    public int getMessageTryReinsert() {
        return R.string.mnp_card_reader_read_error;
    }

    @Override // th.p047co.dtac.android.dtacone.presenter.LifecyclePresenter, th.p047co.dtac.android.dtacone.presenter.IPresenter
    public void onStop() {
        super.onStop();
    }

    @Nullable
    public final Subscription oneFetchCardData() {
        CardReaderService cardReaderService = this.f82306i;
        Intrinsics.checkNotNull(cardReaderService);
        if (!cardReaderService.isConnected()) {
            stepMessageOpenCardReader();
            return null;
        }
        stepMessageInsertIdCard();
        CardReaderService cardReaderService2 = this.f82306i;
        Intrinsics.checkNotNull(cardReaderService2);
        if (!cardReaderService2.isPowerOn()) {
            return null;
        }
        View view = this.f82313p;
        Intrinsics.checkNotNull(view);
        view.showLoading();
        Observable retryWhen = Observable.fromCallable(new Callable() { // from class: MT0
            {
                OneIdCardReaderPresenter.this = this;
            }

            @Override // java.util.concurrent.Callable
            public final Object call() {
                return OneIdCardReaderPresenter.m20169w(OneIdCardReaderPresenter.this);
            }
        }).timeout(20L, TimeUnit.SECONDS).retryWhen(retryWithUnlockDeviceObservable(this.f82306i));
        final OneIdCardReaderPresenter$oneFetchCardData$2 oneIdCardReaderPresenter$oneFetchCardData$2 = new OneIdCardReaderPresenter$oneFetchCardData$2(this);
        Observable doOnNext = retryWhen.doOnNext(new Action1() { // from class: NT0
            @Override // p046rx.functions.Action1
            public final void call(Object obj) {
                OneIdCardReaderPresenter.m20166z(oneIdCardReaderPresenter$oneFetchCardData$2, obj);
            }
        });
        RxThreadService rxThreadService = this.f82305h;
        Intrinsics.checkNotNull(rxThreadService);
        Observable doOnTerminate = doOnNext.compose(rxThreadService.applyAsync()).doOnTerminate(new Action0() { // from class: OT0
            {
                OneIdCardReaderPresenter.this = this;
            }

            @Override // p046rx.functions.Action0
            public final void call() {
                OneIdCardReaderPresenter.m20170v(OneIdCardReaderPresenter.this);
            }
        });
        final OneIdCardReaderPresenter$oneFetchCardData$4 oneIdCardReaderPresenter$oneFetchCardData$4 = new OneIdCardReaderPresenter$oneFetchCardData$4(this);
        return doOnTerminate.subscribe(new Action1() { // from class: PT0
            @Override // p046rx.functions.Action1
            public final void call(Object obj) {
                OneIdCardReaderPresenter.m20172t(oneIdCardReaderPresenter$oneFetchCardData$4, obj);
            }
        }, new Action1() { // from class: QT0
            {
                OneIdCardReaderPresenter.this = this;
            }

            @Override // p046rx.functions.Action1
            public final void call(Object obj) {
                OneIdCardReaderPresenter.m20168x(OneIdCardReaderPresenter.this, (Throwable) obj);
            }
        });
    }

    public final void setBitmapName(@NotNull String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        this.f82312o = name;
    }

    @Override // th.p047co.dtac.android.dtacone.presenter.card_reader.BaseCardReaderPresenter
    @Nullable
    public View getView() {
        return this.f82313p;
    }
}
