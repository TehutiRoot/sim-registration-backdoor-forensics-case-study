package com.feitian.reader.devicecontrol;

import android.annotation.SuppressLint;
import android.hardware.usb.UsbDevice;
import android.hardware.usb.UsbManager;
import android.os.Handler;
import com.feitian.reader.protocol.IProto;
import com.feitian.reader.protocol.ProtocolExtended;
import com.feitian.readerdk.Tool.C6139DK;
import com.feitian.readerdk.deviceconnect.AndroidBlueToothDeviceConnect;
import com.feitian.readerdk.deviceconnect.AndroidUsbDeviceConnect;
import java.io.InputStream;
import java.io.OutputStream;

/* loaded from: classes3.dex */
public class Card {

    /* renamed from: a */
    public AndroidUsbDeviceConnect f43497a;

    /* renamed from: b */
    public AndroidBlueToothDeviceConnect f43498b;

    /* renamed from: c */
    public CardCmd f43499c;

    /* renamed from: d */
    public IProto f43500d;

    /* renamed from: e */
    public byte[] f43501e;

    /* renamed from: f */
    public final boolean f43502f = true;

    /* renamed from: h */
    public String f43504h = "2.0.6";

    /* renamed from: i */
    public String f43505i = "2.0.5";

    /* renamed from: g */
    public boolean f43503g = false;

    @SuppressLint({"NewApi", "NewApi"})
    public Card(UsbManager usbManager, UsbDevice usbDevice, Handler handler) {
        this.f43497a = new AndroidUsbDeviceConnect(usbManager, usbDevice);
        this.f43499c = new CardCmd(this.f43497a);
    }

    public boolean EnData(byte[] bArr, byte[] bArr2) {
        return this.f43499c.cmdEnData(bArr, bArr2);
    }

    public int FtGetSerialNum(byte[] bArr, int[] iArr) {
        return this.f43499c.FtGetSerialNum(bArr, iArr);
    }

    public int FtInitDukpt(byte[] bArr, int i) {
        return this.f43499c.FtDukptInit(bArr, i);
    }

    public int FtReadFlash(byte[] bArr, int i, int i2) {
        return this.f43499c.cmdReadFlash(bArr, i, i2);
    }

    public int FtWriteFlash(byte[] bArr, int i, int i2) {
        return this.f43499c.cmdWriteFlash(bArr, i, i2);
    }

    public String GetDkVersion() {
        if (this.f43503g) {
            return this.f43504h;
        }
        return this.f43505i;
    }

    public int GetKeySn(byte[] bArr, int[] iArr) {
        return this.f43499c.cmdGetKSN(bArr, iArr);
    }

    public boolean LockReader() {
        return this.f43499c.LockReader();
    }

    public int PowerOff() {
        return this.f43499c.cmdPowerOff();
    }

    public int PowerOn() {
        byte[] bArr = new byte[128];
        int[] iArr = new int[1];
        int cmdPowerOn = this.f43499c.cmdPowerOn(bArr, iArr);
        if (cmdPowerOn != 0) {
            return cmdPowerOn;
        }
        int i = iArr[0];
        if (i == 0) {
            return C6139DK.RETURN_ERROR;
        }
        byte[] bArr2 = new byte[i];
        this.f43501e = bArr2;
        System.arraycopy(bArr, 0, bArr2, 0, i);
        this.f43499c.AnalysisAtr(bArr, iArr[0]);
        this.f43500d = new ProtocolExtended(this.f43499c);
        return cmdPowerOn;
    }

    public int SetEncrypt(boolean z, boolean z2, boolean z3) {
        return this.f43499c.cmdSetEncrypt(z, z2, z3);
    }

    public boolean UnlockReader(String str, byte[] bArr) {
        return this.f43499c.UnlockReader(str, bArr);
    }

    public void cardClose() {
        this.f43499c.close();
    }

    public int checkCardStatues(int i) {
        if (this.f43503g) {
            return -1;
        }
        return this.f43497a.checkCardStatues(i);
    }

    public int close() {
        if (this.f43503g) {
            return -1;
        }
        return this.f43497a.close();
    }

    public byte[] getAtr() {
        return this.f43501e;
    }

    public String getManufacturerName() {
        if (this.f43503g) {
            return null;
        }
        return this.f43497a.getManufacturerName();
    }

    public int getProductId() {
        if (this.f43503g) {
            return -1;
        }
        return this.f43497a.getProductId();
    }

    public int getProtocol() {
        return this.f43499c.getProtocol();
    }

    public String getReaderName() {
        if (this.f43503g) {
            return null;
        }
        return this.f43497a.getReaderName();
    }

    public int getVendorId() {
        if (this.f43503g) {
            return -1;
        }
        return this.f43497a.getVendorId();
    }

    public int getVersion(byte[] bArr, int[] iArr) {
        return this.f43499c.cmdGetVersion(bArr, iArr);
    }

    public int getcardStatus() {
        return this.f43499c.cmdGetCardStatus();
    }

    public int open() {
        if (this.f43503g) {
            return -1;
        }
        return this.f43497a.open();
    }

    public int registerCardStatusMonitoring(Handler handler) {
        if (this.f43503g) {
            this.f43498b.IDeviceIctl("Hander", handler);
            return 0;
        }
        this.f43497a.IDeviceIctl("Hander", handler);
        return 0;
    }

    public int transApdu(int i, byte[] bArr, int[] iArr, byte[] bArr2) {
        int protoTransmit = this.f43500d.protoTransmit(bArr, i, bArr2, iArr);
        if (61445 != protoTransmit) {
            return protoTransmit;
        }
        if (3 == getcardStatus()) {
            return 3;
        }
        return C6139DK.TRANS_RETURN_ERROR;
    }

    public Card(InputStream inputStream, OutputStream outputStream) {
        this.f43498b = new AndroidBlueToothDeviceConnect(inputStream, outputStream);
        this.f43499c = new CardCmd(this.f43498b);
    }
}