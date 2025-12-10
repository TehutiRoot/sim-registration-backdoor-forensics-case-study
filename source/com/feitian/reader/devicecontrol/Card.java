package com.feitian.reader.devicecontrol;

import android.annotation.SuppressLint;
import android.hardware.usb.UsbDevice;
import android.hardware.usb.UsbManager;
import android.os.Handler;
import com.feitian.reader.protocol.IProto;
import com.feitian.reader.protocol.ProtocolExtended;
import com.feitian.readerdk.Tool.C6150DK;
import com.feitian.readerdk.deviceconnect.AndroidBlueToothDeviceConnect;
import com.feitian.readerdk.deviceconnect.AndroidUsbDeviceConnect;
import java.io.InputStream;
import java.io.OutputStream;

/* loaded from: classes3.dex */
public class Card {

    /* renamed from: a */
    public AndroidUsbDeviceConnect f43485a;

    /* renamed from: b */
    public AndroidBlueToothDeviceConnect f43486b;

    /* renamed from: c */
    public CardCmd f43487c;

    /* renamed from: d */
    public IProto f43488d;

    /* renamed from: e */
    public byte[] f43489e;

    /* renamed from: f */
    public final boolean f43490f = true;

    /* renamed from: h */
    public String f43492h = "2.0.6";

    /* renamed from: i */
    public String f43493i = "2.0.5";

    /* renamed from: g */
    public boolean f43491g = false;

    @SuppressLint({"NewApi", "NewApi"})
    public Card(UsbManager usbManager, UsbDevice usbDevice, Handler handler) {
        this.f43485a = new AndroidUsbDeviceConnect(usbManager, usbDevice);
        this.f43487c = new CardCmd(this.f43485a);
    }

    public boolean EnData(byte[] bArr, byte[] bArr2) {
        return this.f43487c.cmdEnData(bArr, bArr2);
    }

    public int FtGetSerialNum(byte[] bArr, int[] iArr) {
        return this.f43487c.FtGetSerialNum(bArr, iArr);
    }

    public int FtInitDukpt(byte[] bArr, int i) {
        return this.f43487c.FtDukptInit(bArr, i);
    }

    public int FtReadFlash(byte[] bArr, int i, int i2) {
        return this.f43487c.cmdReadFlash(bArr, i, i2);
    }

    public int FtWriteFlash(byte[] bArr, int i, int i2) {
        return this.f43487c.cmdWriteFlash(bArr, i, i2);
    }

    public String GetDkVersion() {
        if (this.f43491g) {
            return this.f43492h;
        }
        return this.f43493i;
    }

    public int GetKeySn(byte[] bArr, int[] iArr) {
        return this.f43487c.cmdGetKSN(bArr, iArr);
    }

    public boolean LockReader() {
        return this.f43487c.LockReader();
    }

    public int PowerOff() {
        return this.f43487c.cmdPowerOff();
    }

    public int PowerOn() {
        byte[] bArr = new byte[128];
        int[] iArr = new int[1];
        int cmdPowerOn = this.f43487c.cmdPowerOn(bArr, iArr);
        if (cmdPowerOn != 0) {
            return cmdPowerOn;
        }
        int i = iArr[0];
        if (i == 0) {
            return C6150DK.RETURN_ERROR;
        }
        byte[] bArr2 = new byte[i];
        this.f43489e = bArr2;
        System.arraycopy(bArr, 0, bArr2, 0, i);
        this.f43487c.AnalysisAtr(bArr, iArr[0]);
        this.f43488d = new ProtocolExtended(this.f43487c);
        return cmdPowerOn;
    }

    public int SetEncrypt(boolean z, boolean z2, boolean z3) {
        return this.f43487c.cmdSetEncrypt(z, z2, z3);
    }

    public boolean UnlockReader(String str, byte[] bArr) {
        return this.f43487c.UnlockReader(str, bArr);
    }

    public void cardClose() {
        this.f43487c.close();
    }

    public int checkCardStatues(int i) {
        if (this.f43491g) {
            return -1;
        }
        return this.f43485a.checkCardStatues(i);
    }

    public int close() {
        if (this.f43491g) {
            return -1;
        }
        return this.f43485a.close();
    }

    public byte[] getAtr() {
        return this.f43489e;
    }

    public String getManufacturerName() {
        if (this.f43491g) {
            return null;
        }
        return this.f43485a.getManufacturerName();
    }

    public int getProductId() {
        if (this.f43491g) {
            return -1;
        }
        return this.f43485a.getProductId();
    }

    public int getProtocol() {
        return this.f43487c.getProtocol();
    }

    public String getReaderName() {
        if (this.f43491g) {
            return null;
        }
        return this.f43485a.getReaderName();
    }

    public int getVendorId() {
        if (this.f43491g) {
            return -1;
        }
        return this.f43485a.getVendorId();
    }

    public int getVersion(byte[] bArr, int[] iArr) {
        return this.f43487c.cmdGetVersion(bArr, iArr);
    }

    public int getcardStatus() {
        return this.f43487c.cmdGetCardStatus();
    }

    public int open() {
        if (this.f43491g) {
            return -1;
        }
        return this.f43485a.open();
    }

    public int registerCardStatusMonitoring(Handler handler) {
        if (this.f43491g) {
            this.f43486b.IDeviceIctl("Hander", handler);
            return 0;
        }
        this.f43485a.IDeviceIctl("Hander", handler);
        return 0;
    }

    public int transApdu(int i, byte[] bArr, int[] iArr, byte[] bArr2) {
        int protoTransmit = this.f43488d.protoTransmit(bArr, i, bArr2, iArr);
        if (61445 != protoTransmit) {
            return protoTransmit;
        }
        if (3 == getcardStatus()) {
            return 3;
        }
        return C6150DK.TRANS_RETURN_ERROR;
    }

    public Card(InputStream inputStream, OutputStream outputStream) {
        this.f43486b = new AndroidBlueToothDeviceConnect(inputStream, outputStream);
        this.f43487c = new CardCmd(this.f43486b);
    }
}
