package th.p047co.dtac.android.dtacone.manager.cardreader;

import android.annotation.SuppressLint;
import android.hardware.usb.UsbDevice;
import android.hardware.usb.UsbManager;
import android.os.Handler;
import com.feitian.reader.devicecontrol.CardCmd;
import com.feitian.reader.protocol.IProto;
import com.feitian.reader.protocol.ProtocolExtended;
import com.feitian.readerdk.Tool.C6139DK;
import com.feitian.readerdk.deviceconnect.AndroidBlueToothDeviceConnect;
import java.io.InputStream;
import java.io.OutputStream;
import th.p047co.dtac.android.dtacone.manager.cardreader.usb.AndroidUsbDeviceConnect;

/* renamed from: th.co.dtac.android.dtacone.manager.cardreader.Card */
/* loaded from: classes7.dex */
public class Card {

    /* renamed from: a */
    public AndroidUsbDeviceConnect f84920a;

    /* renamed from: b */
    public AndroidBlueToothDeviceConnect f84921b;

    /* renamed from: c */
    public CardCmd f84922c;

    /* renamed from: d */
    public IProto f84923d;

    /* renamed from: e */
    public byte[] f84924e;

    /* renamed from: f */
    public final boolean f84925f = true;

    /* renamed from: h */
    public String f84927h = "2.0.6";

    /* renamed from: i */
    public String f84928i = "2.0.5";

    /* renamed from: g */
    public boolean f84926g = false;

    @SuppressLint({"NewApi", "NewApi"})
    public Card(UsbManager usbManager, UsbDevice usbDevice) {
        this.f84920a = new AndroidUsbDeviceConnect(usbManager, usbDevice);
        this.f84922c = new CardCmd(this.f84920a);
    }

    public boolean EnData(byte[] bArr, byte[] bArr2) throws Exception {
        return this.f84922c.cmdEnData(bArr, bArr2);
    }

    public int FtGetSerialNum(byte[] bArr, int[] iArr) {
        return this.f84922c.FtGetSerialNum(bArr, iArr);
    }

    public int FtInitDukpt(byte[] bArr, int i) {
        return this.f84922c.FtDukptInit(bArr, i);
    }

    public int FtReadFlash(byte[] bArr, int i, int i2) {
        return this.f84922c.cmdReadFlash(bArr, i, i2);
    }

    public int FtWriteFlash(byte[] bArr, int i, int i2) {
        return this.f84922c.cmdWriteFlash(bArr, i, i2);
    }

    public String GetDkVersion() {
        if (this.f84926g) {
            return this.f84927h;
        }
        return this.f84928i;
    }

    public int GetKeySn(byte[] bArr, int[] iArr) {
        return this.f84922c.cmdGetKSN(bArr, iArr);
    }

    public boolean LockReader() {
        return this.f84922c.LockReader();
    }

    public int PowerOff() {
        return this.f84922c.cmdPowerOff();
    }

    public int PowerOn() {
        byte[] bArr = new byte[128];
        int[] iArr = new int[1];
        int cmdPowerOn = this.f84922c.cmdPowerOn(bArr, iArr);
        if (cmdPowerOn != 0) {
            return cmdPowerOn;
        }
        int i = iArr[0];
        if (i == 0) {
            return C6139DK.RETURN_ERROR;
        }
        byte[] bArr2 = new byte[i];
        this.f84924e = bArr2;
        System.arraycopy(bArr, 0, bArr2, 0, i);
        this.f84922c.AnalysisAtr(bArr, iArr[0]);
        this.f84923d = new ProtocolExtended(this.f84922c);
        return cmdPowerOn;
    }

    public int SetEncrypt(boolean z, boolean z2, boolean z3) {
        return this.f84922c.cmdSetEncrypt(z, z2, z3);
    }

    public boolean UnlockReader(String str, byte[] bArr) {
        return this.f84922c.UnlockReader(str, bArr);
    }

    public void cardClose() {
        this.f84922c.close();
    }

    public int close() {
        if (this.f84926g) {
            return -1;
        }
        return this.f84920a.close();
    }

    public byte[] getAtr() {
        return this.f84924e;
    }

    public int getCardStatus() {
        return this.f84922c.cmdGetCardStatus();
    }

    public String getManufacturerName() {
        if (this.f84926g) {
            return null;
        }
        return this.f84920a.getManufacturerName();
    }

    public int getProductId() {
        if (this.f84926g) {
            return -1;
        }
        return this.f84920a.getProductId();
    }

    public int getProtocol() {
        return this.f84922c.getProtocol();
    }

    public String getReaderName() {
        if (this.f84926g) {
            return null;
        }
        return this.f84920a.getReaderName();
    }

    public int getVendorId() {
        if (this.f84926g) {
            return -1;
        }
        return this.f84920a.getVendorId();
    }

    public int getVersion(byte[] bArr, int[] iArr) {
        return this.f84922c.cmdGetVersion(bArr, iArr);
    }

    public int open() {
        if (this.f84926g) {
            return -1;
        }
        return this.f84920a.open();
    }

    public int registerCardStatusMonitoring(Handler handler) {
        if (this.f84926g) {
            this.f84921b.IDeviceIctl("Hander", handler);
            return 0;
        }
        this.f84920a.IDeviceIctl("Hander", handler);
        return 0;
    }

    public int transApdu(int i, byte[] bArr, int[] iArr, byte[] bArr2) {
        int protoTransmit = this.f84923d.protoTransmit(bArr, i, bArr2, iArr);
        if (61445 != protoTransmit) {
            return protoTransmit;
        }
        if (3 == getCardStatus()) {
            return 3;
        }
        return C6139DK.TRANS_RETURN_ERROR;
    }

    public Card(InputStream inputStream, OutputStream outputStream) {
        this.f84921b = new AndroidBlueToothDeviceConnect(inputStream, outputStream);
        this.f84922c = new CardCmd(this.f84921b);
    }
}