package th.p047co.dtac.android.dtacone.manager.cardreader;

import android.annotation.SuppressLint;
import android.hardware.usb.UsbDevice;
import android.hardware.usb.UsbManager;
import android.os.Handler;
import com.feitian.reader.devicecontrol.CardCmd;
import com.feitian.reader.protocol.IProto;
import com.feitian.reader.protocol.ProtocolExtended;
import com.feitian.readerdk.Tool.C6150DK;
import com.feitian.readerdk.deviceconnect.AndroidBlueToothDeviceConnect;
import java.io.InputStream;
import java.io.OutputStream;
import th.p047co.dtac.android.dtacone.manager.cardreader.usb.AndroidUsbDeviceConnect;

/* renamed from: th.co.dtac.android.dtacone.manager.cardreader.Card */
/* loaded from: classes7.dex */
public class Card {

    /* renamed from: a */
    public AndroidUsbDeviceConnect f84810a;

    /* renamed from: b */
    public AndroidBlueToothDeviceConnect f84811b;

    /* renamed from: c */
    public CardCmd f84812c;

    /* renamed from: d */
    public IProto f84813d;

    /* renamed from: e */
    public byte[] f84814e;

    /* renamed from: f */
    public final boolean f84815f = true;

    /* renamed from: h */
    public String f84817h = "2.0.6";

    /* renamed from: i */
    public String f84818i = "2.0.5";

    /* renamed from: g */
    public boolean f84816g = false;

    @SuppressLint({"NewApi", "NewApi"})
    public Card(UsbManager usbManager, UsbDevice usbDevice) {
        this.f84810a = new AndroidUsbDeviceConnect(usbManager, usbDevice);
        this.f84812c = new CardCmd(this.f84810a);
    }

    public boolean EnData(byte[] bArr, byte[] bArr2) throws Exception {
        return this.f84812c.cmdEnData(bArr, bArr2);
    }

    public int FtGetSerialNum(byte[] bArr, int[] iArr) {
        return this.f84812c.FtGetSerialNum(bArr, iArr);
    }

    public int FtInitDukpt(byte[] bArr, int i) {
        return this.f84812c.FtDukptInit(bArr, i);
    }

    public int FtReadFlash(byte[] bArr, int i, int i2) {
        return this.f84812c.cmdReadFlash(bArr, i, i2);
    }

    public int FtWriteFlash(byte[] bArr, int i, int i2) {
        return this.f84812c.cmdWriteFlash(bArr, i, i2);
    }

    public String GetDkVersion() {
        if (this.f84816g) {
            return this.f84817h;
        }
        return this.f84818i;
    }

    public int GetKeySn(byte[] bArr, int[] iArr) {
        return this.f84812c.cmdGetKSN(bArr, iArr);
    }

    public boolean LockReader() {
        return this.f84812c.LockReader();
    }

    public int PowerOff() {
        return this.f84812c.cmdPowerOff();
    }

    public int PowerOn() {
        byte[] bArr = new byte[128];
        int[] iArr = new int[1];
        int cmdPowerOn = this.f84812c.cmdPowerOn(bArr, iArr);
        if (cmdPowerOn != 0) {
            return cmdPowerOn;
        }
        int i = iArr[0];
        if (i == 0) {
            return C6150DK.RETURN_ERROR;
        }
        byte[] bArr2 = new byte[i];
        this.f84814e = bArr2;
        System.arraycopy(bArr, 0, bArr2, 0, i);
        this.f84812c.AnalysisAtr(bArr, iArr[0]);
        this.f84813d = new ProtocolExtended(this.f84812c);
        return cmdPowerOn;
    }

    public int SetEncrypt(boolean z, boolean z2, boolean z3) {
        return this.f84812c.cmdSetEncrypt(z, z2, z3);
    }

    public boolean UnlockReader(String str, byte[] bArr) {
        return this.f84812c.UnlockReader(str, bArr);
    }

    public void cardClose() {
        this.f84812c.close();
    }

    public int close() {
        if (this.f84816g) {
            return -1;
        }
        return this.f84810a.close();
    }

    public byte[] getAtr() {
        return this.f84814e;
    }

    public int getCardStatus() {
        return this.f84812c.cmdGetCardStatus();
    }

    public String getManufacturerName() {
        if (this.f84816g) {
            return null;
        }
        return this.f84810a.getManufacturerName();
    }

    public int getProductId() {
        if (this.f84816g) {
            return -1;
        }
        return this.f84810a.getProductId();
    }

    public int getProtocol() {
        return this.f84812c.getProtocol();
    }

    public String getReaderName() {
        if (this.f84816g) {
            return null;
        }
        return this.f84810a.getReaderName();
    }

    public int getVendorId() {
        if (this.f84816g) {
            return -1;
        }
        return this.f84810a.getVendorId();
    }

    public int getVersion(byte[] bArr, int[] iArr) {
        return this.f84812c.cmdGetVersion(bArr, iArr);
    }

    public int open() {
        if (this.f84816g) {
            return -1;
        }
        return this.f84810a.open();
    }

    public int registerCardStatusMonitoring(Handler handler) {
        if (this.f84816g) {
            this.f84811b.IDeviceIctl("Hander", handler);
            return 0;
        }
        this.f84810a.IDeviceIctl("Hander", handler);
        return 0;
    }

    public int transApdu(int i, byte[] bArr, int[] iArr, byte[] bArr2) {
        int protoTransmit = this.f84813d.protoTransmit(bArr, i, bArr2, iArr);
        if (61445 != protoTransmit) {
            return protoTransmit;
        }
        if (3 == getCardStatus()) {
            return 3;
        }
        return C6150DK.TRANS_RETURN_ERROR;
    }

    public Card(InputStream inputStream, OutputStream outputStream) {
        this.f84811b = new AndroidBlueToothDeviceConnect(inputStream, outputStream);
        this.f84812c = new CardCmd(this.f84811b);
    }
}
