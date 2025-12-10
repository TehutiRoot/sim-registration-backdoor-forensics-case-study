package th.p047co.dtac.android.dtacone.manager.cardreader;

import android.app.Application;
import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import android.bluetooth.BluetoothSocket;
import android.hardware.usb.UsbDevice;
import android.hardware.usb.UsbManager;
import android.os.Build;
import android.util.Log;
import com.feitian.readerdk.Tool.C6151Tool;
import java.io.IOException;
import java.util.Arrays;
import java.util.UUID;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;
import p046rx.Observable;
import p046rx.Subscription;
import p046rx.functions.Action1;
import p046rx.functions.Func1;
import th.p047co.dtac.android.dtacone.manager.TemporaryCache;
import th.p047co.dtac.android.dtacone.manager.bus.RxBus;
import th.p047co.dtac.android.dtacone.manager.bus.event.CardDetectionEvent;
import th.p047co.dtac.android.dtacone.manager.bus.event.ReaderStatusEvent;
import th.p047co.dtac.android.dtacone.manager.cardreader.CardReaderService;
import th.p047co.dtac.android.dtacone.manager.cardreader.bluetooth.BluetoothService;
import th.p047co.dtac.android.dtacone.manager.service.RxThreadService;

/* renamed from: th.co.dtac.android.dtacone.manager.cardreader.CardReaderService */
/* loaded from: classes7.dex */
public class CardReaderService {

    /* renamed from: o */
    public static final String f84823o = "CardReaderService";

    /* renamed from: p */
    public static final UUID f84824p = UUID.fromString("00001101-0000-1000-8000-00805F9B34FB");

    /* renamed from: q */
    public static final UUID f84825q = UUID.fromString("00000000-DECA-FADE-DECA-DEAFDECACAFF");

    /* renamed from: a */
    public final RxThreadService f84826a;

    /* renamed from: b */
    public final RxBus f84827b;

    /* renamed from: c */
    public final CardReaderHandler f84828c;

    /* renamed from: d */
    public final Application f84829d;

    /* renamed from: e */
    public final BluetoothAdapter f84830e;

    /* renamed from: f */
    public BluetoothDevice f84831f;

    /* renamed from: g */
    public BluetoothSocket f84832g;

    /* renamed from: h */
    public final UsbManager f84833h;

    /* renamed from: i */
    public UsbDevice f84834i;

    /* renamed from: j */
    public TemporaryCache f84835j;

    /* renamed from: k */
    public CardReader f84836k;

    /* renamed from: l */
    public Subscription f84837l;

    /* renamed from: m */
    public Subscription f84838m;

    /* renamed from: n */
    public final int f84839n = 500;

    public CardReaderService(UsbManager usbManager, CardReaderHandler cardReaderHandler, RxBus<Object> rxBus, RxThreadService rxThreadService, Application application, BluetoothService bluetoothService, TemporaryCache temporaryCache) {
        this.f84833h = usbManager;
        this.f84828c = cardReaderHandler;
        this.f84827b = rxBus;
        this.f84826a = rxThreadService;
        this.f84830e = bluetoothService.getBluetoothService();
        this.f84829d = application;
        this.f84835j = temporaryCache;
    }

    /* renamed from: T */
    public static /* synthetic */ void m19414T(UsbDevice usbDevice, Throwable th2) {
        StringBuilder sb = new StringBuilder();
        sb.append("Disconnect device fail ");
        sb.append(usbDevice);
    }

    /* renamed from: V */
    public static /* synthetic */ void m19412V(BluetoothDevice bluetoothDevice, Throwable th2) {
        StringBuilder sb = new StringBuilder();
        sb.append("Disconnect device fail ");
        sb.append(bluetoothDevice.getName());
    }

    /* renamed from: Y */
    public static /* synthetic */ void m19409Y(Throwable th2) {
    }

    /* renamed from: a */
    public static /* synthetic */ Boolean m19407a(CardReaderService cardReaderService) {
        return cardReaderService.m19411W();
    }

    /* renamed from: b */
    public static /* synthetic */ void m19405b(CardReaderService cardReaderService, Integer num) {
        cardReaderService.m19418P(num);
    }

    /* renamed from: c */
    public static /* synthetic */ void m19403c(CardReaderService cardReaderService, Throwable th2) {
        cardReaderService.m19404b0(th2);
    }

    /* renamed from: d */
    public static /* synthetic */ void m19401d(CardReaderService cardReaderService, BluetoothDevice bluetoothDevice, Throwable th2) {
        cardReaderService.m19425I(bluetoothDevice, th2);
    }

    /* renamed from: e0 */
    public static /* synthetic */ void m19398e0(Throwable th2) {
    }

    /* renamed from: f */
    public static /* synthetic */ Boolean m19397f(CardReaderService cardReaderService) {
        return cardReaderService.m19402c0();
    }

    /* renamed from: g */
    public static /* synthetic */ void m19395g(CardReaderService cardReaderService, Integer num) {
        cardReaderService.m19422L(num);
    }

    /* renamed from: h */
    public static /* synthetic */ void m19393h(Throwable th2) {
        m19398e0(th2);
    }

    /* renamed from: j */
    public static /* synthetic */ void m19389j(CardReaderService cardReaderService, BluetoothDevice bluetoothDevice, Boolean bool) {
        cardReaderService.m19413U(bluetoothDevice, bool);
    }

    /* renamed from: k */
    public static /* synthetic */ void m19387k(CardReaderService cardReaderService, Boolean bool) {
        cardReaderService.m19410X(bool);
    }

    /* renamed from: l */
    public static /* synthetic */ void m19385l(CardReaderService cardReaderService, CardDetectionEvent cardDetectionEvent) {
        cardReaderService.m19400d0(cardDetectionEvent);
    }

    /* renamed from: m */
    public static /* synthetic */ void m19383m(CardReaderService cardReaderService, Boolean bool) {
        cardReaderService.m19406a0(bool);
    }

    /* renamed from: n */
    public static /* synthetic */ Boolean m19381n(CardReaderService cardReaderService, UsbDevice usbDevice) {
        return cardReaderService.m19416R(usbDevice);
    }

    /* renamed from: o */
    public static /* synthetic */ void m19379o(Throwable th2) {
        m19409Y(th2);
    }

    /* renamed from: p */
    public static /* synthetic */ void m19378p(CardReaderService cardReaderService, UsbDevice usbDevice, Boolean bool) {
        cardReaderService.m19415S(usbDevice, bool);
    }

    /* renamed from: q */
    public static /* synthetic */ Integer m19377q(CardReaderService cardReaderService) {
        return cardReaderService.m19420N();
    }

    /* renamed from: r */
    public static /* synthetic */ Integer m19376r(CardReaderService cardReaderService) {
        return cardReaderService.m19424J();
    }

    /* renamed from: s */
    public static /* synthetic */ void m19375s(UsbDevice usbDevice, Throwable th2) {
        m19414T(usbDevice, th2);
    }

    /* renamed from: t */
    public static /* synthetic */ void m19374t(CardReaderService cardReaderService, UsbDevice usbDevice, Throwable th2) {
        cardReaderService.m19421M(usbDevice, th2);
    }

    /* renamed from: u */
    public static /* synthetic */ Boolean m19373u(CardReaderService cardReaderService, BluetoothDevice bluetoothDevice) {
        return cardReaderService.m19417Q(bluetoothDevice);
    }

    /* renamed from: v */
    public static /* synthetic */ void m19372v(BluetoothDevice bluetoothDevice, Throwable th2) {
        m19412V(bluetoothDevice, th2);
    }

    /* renamed from: w */
    public static /* synthetic */ Boolean m19371w(CardReaderService cardReaderService) {
        return cardReaderService.m19408Z();
    }

    /* renamed from: A */
    public final Observable m19433A(final UsbDevice usbDevice) {
        return Observable.fromCallable(new Callable() { // from class: Sl
            {
                CardReaderService.this = this;
            }

            @Override // java.util.concurrent.Callable
            public final Object call() {
                return CardReaderService.m19381n(CardReaderService.this, usbDevice);
            }
        });
    }

    /* renamed from: B */
    public final CardReader m19432B(BluetoothSocket bluetoothSocket, CardReaderHandler cardReaderHandler) {
        CardReader cardReader = new CardReader(bluetoothSocket.getInputStream(), bluetoothSocket.getOutputStream());
        cardReader.registerCardStatusMonitoring(cardReaderHandler);
        return cardReader;
    }

    /* renamed from: C */
    public final CardReader m19431C(UsbManager usbManager, UsbDevice usbDevice, CardReaderHandler cardReaderHandler) {
        CardReader cardReader = new CardReader(usbManager, usbDevice);
        cardReader.registerCardStatusMonitoring(cardReaderHandler);
        return cardReader;
    }

    /* renamed from: D */
    public final Observable m19430D() {
        return Observable.fromCallable(new Callable() { // from class: Vl
            {
                CardReaderService.this = this;
            }

            @Override // java.util.concurrent.Callable
            public final Object call() {
                return CardReaderService.m19407a(CardReaderService.this);
            }
        });
    }

    /* renamed from: E */
    public final void m19429E() {
        String[] strArr = {"ftcrypt", "libftcrypt", "libftcrypt.so"};
        for (int i = 0; i < 3; i++) {
            try {
                System.loadLibrary(strArr[i]);
                return;
            } catch (Throwable unused) {
            }
        }
    }

    /* renamed from: F */
    public final String m19428F(BluetoothDevice bluetoothDevice) {
        try {
            return new String[]{"UNKNOWN", "Classic", "Low Energy", "Dual (BR/EDR/LE)"}[bluetoothDevice.getType()];
        } catch (Exception unused) {
            return "UNKNOWN";
        }
    }

    /* renamed from: G */
    public final boolean m19427G(BluetoothDevice bluetoothDevice) {
        String name;
        if (bluetoothDevice == null) {
            name = null;
        } else {
            name = bluetoothDevice.getName();
        }
        if (name != null && name.startsWith("FT")) {
            return true;
        }
        return false;
    }

    /* renamed from: H */
    public final boolean m19426H(UsbDevice usbDevice) {
        if (usbDevice.getVendorId() != 0) {
            return true;
        }
        return false;
    }

    /* renamed from: I */
    public final /* synthetic */ void m19425I(BluetoothDevice bluetoothDevice, Throwable th2) {
        Log.getStackTraceString(th2);
        StringBuilder sb = new StringBuilder();
        sb.append("Connect device fail(ConnectDevice) ");
        sb.append(bluetoothDevice.getName());
        m19382m0(3);
    }

    /* renamed from: J */
    public final /* synthetic */ Integer m19424J() {
        return Integer.valueOf(this.f84836k.getCardStatus());
    }

    /* renamed from: K */
    public final /* synthetic */ Observable m19423K(Boolean bool) {
        return Observable.fromCallable(new Callable() { // from class: Ul
            {
                CardReaderService.this = this;
            }

            @Override // java.util.concurrent.Callable
            public final Object call() {
                return CardReaderService.m19376r(CardReaderService.this);
            }
        });
    }

    /* renamed from: L */
    public final /* synthetic */ void m19422L(Integer num) {
        m19382m0(1);
        this.f84827b.post(new CardDetectionEvent(num.intValue()));
    }

    /* renamed from: M */
    public final /* synthetic */ void m19421M(UsbDevice usbDevice, Throwable th2) {
        StringBuilder sb = new StringBuilder();
        sb.append("Connect device fail ");
        sb.append(usbDevice);
        m19382m0(3);
    }

    /* renamed from: N */
    public final /* synthetic */ Integer m19420N() {
        return Integer.valueOf(this.f84836k.getCardStatus());
    }

    /* renamed from: O */
    public final /* synthetic */ Observable m19419O(Boolean bool) {
        return Observable.fromCallable(new Callable() { // from class: Tl
            {
                CardReaderService.this = this;
            }

            @Override // java.util.concurrent.Callable
            public final Object call() {
                return CardReaderService.m19377q(CardReaderService.this);
            }
        });
    }

    /* renamed from: P */
    public final /* synthetic */ void m19418P(Integer num) {
        m19382m0(1);
        this.f84827b.post(new CardDetectionEvent(num.intValue()));
    }

    /* renamed from: Q */
    public final /* synthetic */ Boolean m19417Q(BluetoothDevice bluetoothDevice) {
        if (this.f84832g == null) {
            this.f84832g = m19394g0(bluetoothDevice);
        }
        this.f84836k = m19432B(this.f84832g, this.f84828c);
        this.f84831f = bluetoothDevice;
        StringBuilder sb = new StringBuilder();
        sb.append("DK Version ");
        sb.append(this.f84836k.getDkVersion());
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Bluetooth Device type: ");
        sb2.append(m19428F(this.f84831f));
        return Boolean.TRUE;
    }

    /* renamed from: R */
    public final /* synthetic */ Boolean m19416R(UsbDevice usbDevice) {
        try {
            m19429E();
        } catch (Throwable th2) {
            m19396f0(th2);
        }
        this.f84836k = m19431C(this.f84833h, usbDevice, this.f84828c);
        this.f84834i = usbDevice;
        StringBuilder sb = new StringBuilder();
        sb.append("DK Version ");
        sb.append(this.f84836k.getDkVersion());
        return Boolean.TRUE;
    }

    /* renamed from: S */
    public final /* synthetic */ void m19415S(UsbDevice usbDevice, Boolean bool) {
        StringBuilder sb = new StringBuilder();
        sb.append("Disconnect device ");
        sb.append(usbDevice);
        sb.append(" status: ");
        sb.append(bool);
        if (bool.booleanValue()) {
            m19382m0(2);
        }
    }

    /* renamed from: U */
    public final /* synthetic */ void m19413U(BluetoothDevice bluetoothDevice, Boolean bool) {
        StringBuilder sb = new StringBuilder();
        sb.append("Disconnect device ");
        sb.append(bluetoothDevice.getName());
        sb.append(" status: ");
        sb.append(bool);
        if (bool.booleanValue()) {
            m19382m0(2);
        }
    }

    /* renamed from: W */
    public final /* synthetic */ Boolean m19411W() {
        CardReader cardReader = this.f84836k;
        if (cardReader != null) {
            cardReader.readerClose();
        }
        BluetoothSocket bluetoothSocket = this.f84832g;
        if (bluetoothSocket != null) {
            bluetoothSocket.close();
        }
        this.f84836k = null;
        this.f84832g = null;
        this.f84831f = null;
        this.f84834i = null;
        return Boolean.TRUE;
    }

    /* renamed from: X */
    public final /* synthetic */ void m19410X(Boolean bool) {
        m19382m0(5);
    }

    /* renamed from: Z */
    public final /* synthetic */ Boolean m19408Z() {
        if (this.f84836k.isPowerOn()) {
            this.f84836k.PowerOff();
        }
        return Boolean.TRUE;
    }

    /* renamed from: a0 */
    public final /* synthetic */ void m19406a0(Boolean bool) {
        m19382m0(4);
    }

    /* renamed from: b0 */
    public final /* synthetic */ void m19404b0(Throwable th2) {
        m19382m0(6);
    }

    /* renamed from: c0 */
    public final /* synthetic */ Boolean m19402c0() {
        if (!this.f84836k.isPowerOn()) {
            this.f84836k.PowerOn();
        }
        m19380n0();
        return Boolean.TRUE;
    }

    public void cleanUp() {
        Subscription subscription = this.f84837l;
        if (subscription != null) {
            subscription.unsubscribe();
        }
    }

    public void connectDevice(final UsbDevice usbDevice) {
        if (!m19426H(usbDevice)) {
            Log.w(f84823o, "Connect device cancel because device is not support.");
        } else if (this.f84834i != null) {
            String str = f84823o;
            Log.w(str, "Connect device cancel because device " + this.f84834i + " has been connected.");
        } else {
            m19384l0();
            this.f84837l = m19433A(usbDevice).delay(500L, TimeUnit.MILLISECONDS).flatMap(new Func1() { // from class: em
                @Override // p046rx.functions.Func1
                public final Object call(Object obj) {
                    Observable m19423K;
                    m19423K = CardReaderService.this.m19423K((Boolean) obj);
                    return m19423K;
                }
            }).compose(this.f84826a.applyBackground()).subscribe(new Action1() { // from class: fm
                {
                    CardReaderService.this = this;
                }

                @Override // p046rx.functions.Action1
                public final void call(Object obj) {
                    CardReaderService.m19395g(CardReaderService.this, (Integer) obj);
                }
            }, new Action1() { // from class: gm
                {
                    CardReaderService.this = this;
                }

                @Override // p046rx.functions.Action1
                public final void call(Object obj) {
                    CardReaderService.m19374t(CardReaderService.this, usbDevice, (Throwable) obj);
                }
            });
        }
    }

    /* renamed from: d0 */
    public final /* synthetic */ void m19400d0(CardDetectionEvent cardDetectionEvent) {
        int status = cardDetectionEvent.getStatus();
        if (status != 1) {
            if (status == 3) {
                m19392h0();
                return;
            }
            return;
        }
        m19388j0();
    }

    public void disconnectDevice(final UsbDevice usbDevice) {
        Subscription subscription = this.f84838m;
        if (subscription != null && !subscription.isUnsubscribed()) {
            this.f84838m.unsubscribe();
        }
        Subscription subscription2 = this.f84837l;
        if (subscription2 != null && !subscription2.isUnsubscribed()) {
            this.f84837l.unsubscribe();
        }
        m19430D().compose(this.f84826a.applyBackground()).subscribe(new Action1() { // from class: km
            {
                CardReaderService.this = this;
            }

            @Override // p046rx.functions.Action1
            public final void call(Object obj) {
                CardReaderService.m19378p(CardReaderService.this, usbDevice, (Boolean) obj);
            }
        }, new Action1() { // from class: lm
            @Override // p046rx.functions.Action1
            public final void call(Object obj) {
                CardReaderService.m19375s(usbDevice, (Throwable) obj);
            }
        });
    }

    /* renamed from: f0 */
    public final void m19396f0(Throwable th2) {
        StringBuilder sb = new StringBuilder();
        sb.append("SUPPORTED_ABIS=");
        sb.append(Arrays.toString(Build.SUPPORTED_ABIS));
        StringBuilder sb2 = new StringBuilder();
        sb2.append("nativeLibraryDir=");
        sb2.append(this.f84829d.getApplicationInfo().nativeLibraryDir);
    }

    /* renamed from: g0 */
    public final BluetoothSocket m19394g0(BluetoothDevice bluetoothDevice) {
        BluetoothSocket bluetoothSocket;
        BluetoothSocket createRfcommSocketToServiceRecord = bluetoothDevice.createRfcommSocketToServiceRecord(f84824p);
        try {
            m19369y(createRfcommSocketToServiceRecord);
            return createRfcommSocketToServiceRecord;
        } catch (IOException e) {
            try {
                try {
                    bluetoothSocket = (BluetoothSocket) bluetoothDevice.getClass().getMethod("createRfcommSocket", Integer.TYPE).invoke(bluetoothDevice, 1);
                } catch (Exception e2) {
                    e = e2;
                }
            } catch (Exception e3) {
                e = e3;
            }
            try {
                m19369y(bluetoothSocket);
                return bluetoothSocket;
            } catch (Exception e4) {
                e = e4;
                createRfcommSocketToServiceRecord = bluetoothSocket;
                m19370x(createRfcommSocketToServiceRecord);
                StringBuilder sb = new StringBuilder();
                sb.append("(openSocket) ");
                sb.append(e.getClass().getSimpleName());
                sb.append(", ");
                sb.append(e.getMessage());
                return createRfcommSocketToServiceRecord;
            }
        }
    }

    public CardReader getReader() {
        return this.f84836k;
    }

    /* renamed from: h0 */
    public final void m19392h0() {
        CardReader cardReader = this.f84836k;
        if (cardReader != null && cardReader.isPowerOn()) {
            m19390i0().compose(this.f84826a.applyBackground()).subscribe(new Action1() { // from class: Zl
                {
                    CardReaderService.this = this;
                }

                @Override // p046rx.functions.Action1
                public final void call(Object obj) {
                    CardReaderService.m19387k(CardReaderService.this, (Boolean) obj);
                }
            }, new Action1() { // from class: bm
                @Override // p046rx.functions.Action1
                public final void call(Object obj) {
                    CardReaderService.m19379o((Throwable) obj);
                }
            });
        }
    }

    /* renamed from: i0 */
    public final Observable m19390i0() {
        return Observable.fromCallable(new Callable() { // from class: cm
            {
                CardReaderService.this = this;
            }

            @Override // java.util.concurrent.Callable
            public final Object call() {
                return CardReaderService.m19371w(CardReaderService.this);
            }
        });
    }

    public boolean isConnected() {
        BluetoothSocket bluetoothSocket = this.f84832g;
        if ((bluetoothSocket != null && bluetoothSocket.isConnected()) || this.f84834i != null) {
            return true;
        }
        return false;
    }

    public boolean isPowerOn() {
        CardReader cardReader = this.f84836k;
        if (cardReader != null && cardReader.isPowerOn()) {
            return true;
        }
        return false;
    }

    public boolean isSupportUsbHost() {
        return this.f84829d.getPackageManager().hasSystemFeature("android.hardware.usb.host");
    }

    /* renamed from: j0 */
    public final void m19388j0() {
        CardReader cardReader = this.f84836k;
        if (cardReader != null && !cardReader.isPowerOn()) {
            m19386k0().retry(1L).compose(this.f84826a.applyBackground()).subscribe(new Action1() { // from class: Xl
                {
                    CardReaderService.this = this;
                }

                @Override // p046rx.functions.Action1
                public final void call(Object obj) {
                    CardReaderService.m19383m(CardReaderService.this, (Boolean) obj);
                }
            }, new Action1() { // from class: Yl
                {
                    CardReaderService.this = this;
                }

                @Override // p046rx.functions.Action1
                public final void call(Object obj) {
                    CardReaderService.m19403c(CardReaderService.this, (Throwable) obj);
                }
            });
        }
    }

    /* renamed from: k0 */
    public final Observable m19386k0() {
        return Observable.fromCallable(new Callable() { // from class: dm
            {
                CardReaderService.this = this;
            }

            @Override // java.util.concurrent.Callable
            public final Object call() {
                return CardReaderService.m19397f(CardReaderService.this);
            }
        });
    }

    /* renamed from: l0 */
    public final void m19384l0() {
        this.f84838m = this.f84827b.observeEvents(CardDetectionEvent.class).debounce(500L, TimeUnit.MILLISECONDS).compose(this.f84826a.applyBackground()).subscribe(new Action1() { // from class: Ql
            {
                CardReaderService.this = this;
            }

            @Override // p046rx.functions.Action1
            public final void call(Object obj) {
                CardReaderService.m19385l(CardReaderService.this, (CardDetectionEvent) obj);
            }
        }, new Action1() { // from class: Rl
            @Override // p046rx.functions.Action1
            public final void call(Object obj) {
                CardReaderService.m19393h((Throwable) obj);
            }
        });
    }

    /* renamed from: m0 */
    public final void m19382m0(int i) {
        this.f84827b.post(new ReaderStatusEvent(i));
    }

    /* renamed from: n0 */
    public final void m19380n0() {
        try {
            byte[] atr = this.f84836k.getAtr();
            if (atr == null) {
                return;
            }
            byte[] bArr = new byte[128];
            this.f84836k.getVersion(bArr, new int[1]);
            StringBuilder sb = new StringBuilder();
            sb.append("Reader atr: ");
            sb.append(C6151Tool.byte2HexStr(atr, atr.length));
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Reader protocol: T");
            sb2.append(this.f84836k.getProtocol());
            StringBuilder sb3 = new StringBuilder();
            sb3.append("Reader Version: ");
            sb3.append((int) bArr[0]);
            sb3.append('.');
            sb3.append(String.format("%x", Byte.valueOf(bArr[1])));
        } catch (CardReaderReadException unused) {
        }
    }

    public boolean unlockDevice() {
        byte[] bArr = new byte[64];
        try {
            if (this.f84836k.EnData("ATUWORRY01".getBytes(), bArr)) {
                StringBuilder sb = new StringBuilder();
                sb.append("Encrypt Data: ");
                sb.append(C6151Tool.byte2HexStr(bArr, 12));
                return this.f84836k.UnlockReader(null, bArr);
            }
        } catch (Exception unused) {
        }
        return false;
    }

    /* renamed from: x */
    public final void m19370x(BluetoothSocket bluetoothSocket) {
        if (isConnected()) {
            bluetoothSocket.close();
        }
    }

    /* renamed from: y */
    public final void m19369y(BluetoothSocket bluetoothSocket) {
        if (!isConnected()) {
            bluetoothSocket.connect();
        }
    }

    /* renamed from: z */
    public final Observable m19368z(final BluetoothDevice bluetoothDevice) {
        return Observable.fromCallable(new Callable() { // from class: Wl
            {
                CardReaderService.this = this;
            }

            @Override // java.util.concurrent.Callable
            public final Object call() {
                return CardReaderService.m19373u(CardReaderService.this, bluetoothDevice);
            }
        });
    }

    public void disconnectDevice(final BluetoothDevice bluetoothDevice) {
        if (this.f84831f != null && bluetoothDevice != null && bluetoothDevice.getName().equals(this.f84831f.getName())) {
            Subscription subscription = this.f84838m;
            if (subscription != null && !subscription.isUnsubscribed()) {
                this.f84838m.unsubscribe();
            }
            Subscription subscription2 = this.f84837l;
            if (subscription2 != null && !subscription2.isUnsubscribed()) {
                this.f84837l.unsubscribe();
            }
            m19430D().compose(this.f84826a.applyBackground()).subscribe(new Action1() { // from class: Pl
                {
                    CardReaderService.this = this;
                }

                @Override // p046rx.functions.Action1
                public final void call(Object obj) {
                    CardReaderService.m19389j(CardReaderService.this, bluetoothDevice, (Boolean) obj);
                }
            }, new Action1() { // from class: am
                @Override // p046rx.functions.Action1
                public final void call(Object obj) {
                    CardReaderService.m19372v(bluetoothDevice, (Throwable) obj);
                }
            });
            return;
        }
        Log.w(f84823o, "Disconnect device cancel because device does not match");
    }

    public void connectDevice(final BluetoothDevice bluetoothDevice) {
        if (!m19427G(bluetoothDevice)) {
            Log.w(f84823o, "Connect device cancel because device is not support.");
            return;
        }
        m19384l0();
        BluetoothAdapter bluetoothAdapter = this.f84830e;
        if (bluetoothAdapter != null && bluetoothAdapter.isDiscovering()) {
            this.f84830e.cancelDiscovery();
        }
        this.f84837l = m19368z(bluetoothDevice).delay(500L, TimeUnit.MILLISECONDS).flatMap(new Func1() { // from class: hm
            @Override // p046rx.functions.Func1
            public final Object call(Object obj) {
                Observable m19419O;
                m19419O = CardReaderService.this.m19419O((Boolean) obj);
                return m19419O;
            }
        }).retry(1L).compose(this.f84826a.applyBackground()).subscribe(new Action1() { // from class: im
            {
                CardReaderService.this = this;
            }

            @Override // p046rx.functions.Action1
            public final void call(Object obj) {
                CardReaderService.m19405b(CardReaderService.this, (Integer) obj);
            }
        }, new Action1() { // from class: jm
            {
                CardReaderService.this = this;
            }

            @Override // p046rx.functions.Action1
            public final void call(Object obj) {
                CardReaderService.m19401d(CardReaderService.this, bluetoothDevice, (Throwable) obj);
            }
        });
    }
}
