package th.p047co.dtac.android.dtacone.manager.cardreader;

import android.hardware.usb.UsbDevice;
import android.hardware.usb.UsbManager;
import android.os.Build;
import android.os.Handler;
import com.feitian.readerdk.Tool.C6150DK;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Arrays;

/* renamed from: th.co.dtac.android.dtacone.manager.cardreader.CardReader */
/* loaded from: classes7.dex */
public class CardReader {

    /* renamed from: a */
    public boolean f84819a = false;

    /* renamed from: b */
    public Card f84820b;

    /* renamed from: c */
    public Handler f84821c;

    public CardReader(InputStream inputStream, OutputStream outputStream) {
        try {
            m19435c();
            this.f84820b = new Card(inputStream, outputStream);
            m19437a();
        } catch (UnsatisfiedLinkError e) {
            m19436b(e);
            throw e;
        }
    }

    public boolean EnData(byte[] bArr, byte[] bArr2) throws Exception {
        if (bArr != null && bArr2 != null) {
            if (bArr2.length >= 16) {
                return this.f84820b.EnData(bArr, bArr2);
            }
            throw new IllegalArgumentException("outputEnData too small");
        }
        throw new IllegalArgumentException("null buffer");
    }

    public boolean LockReader() {
        return this.f84820b.LockReader();
    }

    public int PowerOff() throws CardReaderReadException {
        int PowerOff = this.f84820b.PowerOff();
        if (PowerOff == 0) {
            this.f84819a = false;
            return PowerOff;
        }
        throw new CardReaderReadException("Power Off Failed");
    }

    public int PowerOn() throws CardReaderReadException {
        int PowerOn = this.f84820b.PowerOn();
        if (PowerOn == 0) {
            this.f84819a = true;
            return PowerOn;
        }
        throw new CardReaderReadException("Power On Failed");
    }

    public boolean UnlockReader(String str, byte[] bArr) {
        return this.f84820b.UnlockReader(str, bArr);
    }

    /* renamed from: a */
    public final void m19437a() {
        StringBuilder sb = new StringBuilder();
        sb.append("ManufacturerName ");
        sb.append(this.f84820b.getManufacturerName());
        StringBuilder sb2 = new StringBuilder();
        sb2.append("ReaderName ");
        sb2.append(this.f84820b.getReaderName());
        StringBuilder sb3 = new StringBuilder();
        sb3.append("VendorId ");
        sb3.append(this.f84820b.getVendorId());
        StringBuilder sb4 = new StringBuilder();
        sb4.append("ProductId ");
        sb4.append(this.f84820b.getProductId());
    }

    /* renamed from: b */
    public final void m19436b(Throwable th2) {
        StringBuilder sb = new StringBuilder();
        sb.append("SUPPORTED_ABIS=");
        sb.append(Arrays.toString(Build.SUPPORTED_ABIS));
    }

    /* renamed from: c */
    public final void m19435c() {
        String[] strArr = {"ftcrypt", "libftcrypt", "libftcrypt.so"};
        for (int i = 0; i < 3; i++) {
            try {
                System.loadLibrary(strArr[i]);
                return;
            } catch (Throwable unused) {
            }
        }
    }

    public byte[] getAtr() throws CardReaderReadException {
        if (this.f84819a) {
            return this.f84820b.getAtr();
        }
        throw new CardReaderReadException("Power Off already");
    }

    public int getCardStatus() throws CardReaderReadException {
        return this.f84820b.getCardStatus();
    }

    public String getDkVersion() {
        return this.f84820b.GetDkVersion();
    }

    public int getProtocol() throws CardReaderReadException {
        if (this.f84819a) {
            return this.f84820b.getProtocol();
        }
        throw new CardReaderReadException("Power Off already");
    }

    public int getSerialNum(byte[] bArr, int[] iArr) {
        return this.f84820b.FtGetSerialNum(bArr, iArr);
    }

    public int getVersion(byte[] bArr, int[] iArr) {
        return this.f84820b.getVersion(bArr, iArr);
    }

    public boolean isPowerOn() {
        return this.f84819a;
    }

    public int readFlash(byte[] bArr, int i, int i2) {
        return this.f84820b.FtReadFlash(bArr, i, i2);
    }

    public void readerClose() {
        try {
            if (this.f84819a) {
                try {
                    this.f84820b.PowerOff();
                } catch (Throwable unused) {
                }
                this.f84819a = false;
            }
            this.f84820b.close();
            try {
                this.f84820b.cardClose();
            } catch (Throwable unused2) {
            }
        } catch (Throwable th2) {
            try {
                this.f84820b.cardClose();
            } catch (Throwable unused3) {
            }
            throw th2;
        }
    }

    public void registerCardStatusMonitoring(Handler handler) throws CardReaderReadException {
        this.f84821c = handler;
        if (this.f84820b.registerCardStatusMonitoring(handler) == 0) {
            return;
        }
        throw new CardReaderReadException("not support cardStatusMonitoring");
    }

    public int transApdu(int i, byte[] bArr, int[] iArr, byte[] bArr2) throws CardReaderReadException {
        if (this.f84819a) {
            int transApdu = this.f84820b.transApdu(i, bArr, iArr, bArr2);
            if (transApdu == 0) {
                return transApdu;
            }
            if (transApdu != 61442) {
                if (transApdu == 3) {
                    Handler handler = this.f84821c;
                    if (handler != null) {
                        handler.obtainMessage(C6150DK.CARD_STATUS, 3, -1).sendToTarget();
                    }
                    throw new CardReaderReadException("card is absent");
                }
                throw new CardReaderReadException("trans apdu error");
            }
            throw new CardReaderReadException("receive buffer not enough");
        }
        throw new CardReaderReadException("Power Off already");
    }

    public int writeFlash(byte[] bArr, int i, int i2) {
        return this.f84820b.FtWriteFlash(bArr, i, i2);
    }

    public CardReader(UsbManager usbManager, UsbDevice usbDevice) {
        try {
            m19435c();
            Card card = new Card(usbManager, usbDevice);
            this.f84820b = card;
            card.open();
            m19437a();
        } catch (UnsatisfiedLinkError e) {
            m19436b(e);
            throw e;
        }
    }
}
