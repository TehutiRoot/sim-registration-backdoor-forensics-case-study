package com.feitian.reader.devicecontrol;

import com.facebook.stetho.dumpapp.Framer;
import com.feitian.readerdk.Tool.C6150DK;
import com.feitian.readerdk.Tool.C6151Tool;
import com.feitian.readerdk.deviceconnect.IDeviceConnect;
import com.google.common.primitives.SignedBytes;

/* loaded from: classes3.dex */
public class CardCmd {

    /* renamed from: e */
    public static byte[] f43494e = new byte[4096];

    /* renamed from: a */
    public IDeviceConnect f43495a;

    /* renamed from: b */
    public int f43496b = 0;

    /* renamed from: c */
    public int f43497c = 0;

    /* renamed from: d */
    public C11511j7 f43498d = new C11511j7();

    public CardCmd(IDeviceConnect iDeviceConnect) {
        this.f43495a = iDeviceConnect;
    }

    public int AnalysisAtr(byte[] bArr, int i) {
        return AbstractC13292rm.m23275a(bArr, i, this.f43498d);
    }

    public void BuildApdu(byte[] bArr, int i, int i2, int i3) {
        buildApdu((byte) 111, bArr, i, i2, i3);
    }

    public int CmdRecv(byte[] bArr, int[] iArr) {
        return this.f43495a.IDeviceRead(bArr, iArr);
    }

    public int CmdSend() {
        return this.f43495a.IDeviceWrite(f43494e, this.f43497c);
    }

    public int FtDukptInit(byte[] bArr, int i) {
        if (i != 40 && i != 48) {
            return C6150DK.RETURN_ERROR;
        }
        int i2 = i + 4;
        byte[] bArr2 = new byte[i2];
        byte[] bArr3 = new byte[62];
        bArr2[0] = 91;
        bArr2[1] = 2;
        bArr2[2] = 0;
        bArr2[3] = (byte) i;
        System.arraycopy(bArr, 0, bArr2, 4, i);
        buildApdu((byte) 107, bArr2, i2, 0, 0);
        int Transmit = Transmit(f43494e, this.f43497c, bArr3, new int[1]);
        if (Transmit != 0) {
            return Transmit;
        }
        if (bArr3[10] != -75 || bArr3[11] != 2 || bArr3[12] != 0 || bArr3[13] != 2 || bArr3[14] != -112 || bArr3[15] != 0) {
            return C6150DK.RETURN_ERROR;
        }
        return 0;
    }

    public int FtGetSerialNum(byte[] bArr, int[] iArr) {
        byte[] bArr2 = new byte[62];
        int[] iArr2 = new int[1];
        buildApdu((byte) 107, new byte[]{90, -91, Framer.STDOUT_FRAME_PREFIX, Framer.STDOUT_FRAME_PREFIX}, 4, 0, 0);
        int Transmit = Transmit(f43494e, this.f43497c, bArr2, iArr2);
        if (Transmit != 0) {
            return Transmit;
        }
        int i = iArr2[0];
        if (i <= 10) {
            return C6150DK.RETURN_ERROR;
        }
        System.arraycopy(bArr2, 10, bArr, 0, i - 10);
        iArr[0] = iArr2[0] - 10;
        return 0;
    }

    public boolean LockReader() {
        byte[] bArr = new byte[512];
        int[] iArr = new int[1];
        buildApdu((byte) 107, new byte[]{-91, 90, 99}, 3, 0, 0);
        if (Transmit(f43494e, this.f43497c, bArr, iArr) != 0) {
            return false;
        }
        int i = iArr[0];
        if ((bArr[i - 1] & 255) == 0 && (bArr[i - 2] & 255) == 144) {
            return true;
        }
        return false;
    }

    public synchronized int Transmit(byte[] bArr, int i, byte[] bArr2, int[] iArr) {
        int IDeviceWrite = this.f43495a.IDeviceWrite(f43494e, this.f43497c);
        if (IDeviceWrite != 0) {
            return IDeviceWrite;
        }
        return this.f43495a.IDeviceRead(bArr2, iArr);
    }

    public boolean UnlockReader(String str, byte[] bArr) {
        byte[] bArr2 = new byte[512];
        int[] iArr = new int[1];
        byte[] bArr3 = new byte[19];
        bArr3[0] = -91;
        bArr3[1] = 90;
        bArr3[2] = 98;
        System.arraycopy(bArr, 0, bArr3, 3, 12);
        buildApdu((byte) 107, bArr3, 15, 0, 0);
        if (Transmit(f43494e, this.f43497c, bArr2, iArr) != 0) {
            return false;
        }
        int i = iArr[0];
        if ((bArr2[i - 1] & 255) == 0 && (bArr2[i - 2] & 255) == 144) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public final boolean m49363a(byte[] bArr) {
        byte[] bArr2 = new byte[512];
        int[] iArr = new int[1];
        buildApdu((byte) 107, new byte[]{-91, 90, 97}, 3, 0, 0);
        if (Transmit(f43494e, this.f43497c, bArr2, iArr) != 0) {
            return false;
        }
        int i = iArr[0];
        if ((bArr2[i - 1] & 255) != 0 || (bArr2[i - 2] & 255) != 144) {
            return false;
        }
        System.arraycopy(bArr2, i - 6, bArr, 0, 4);
        return true;
    }

    public synchronized void buildApdu(byte b, byte[] bArr, int i, int i2, int i3) {
        try {
            int i4 = this.f43496b + 1;
            this.f43496b = i4;
            if (i4 == 256) {
                this.f43496b = 0;
            }
            byte[] bArr2 = f43494e;
            bArr2[0] = b;
            C6151Tool.i2dw(i, bArr2, 1);
            byte[] bArr3 = f43494e;
            bArr3[5] = 0;
            bArr3[6] = (byte) this.f43496b;
            bArr3[7] = (byte) (i3 & 255);
            bArr3[8] = (byte) (i2 & 255);
            bArr3[9] = (byte) (((byte) (i2 >> 8)) & 255);
            if (i != 0 && bArr != null) {
                System.arraycopy(bArr, 0, bArr3, 10, i);
                this.f43497c = i + 10;
            } else {
                this.f43497c = 10;
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public void close() {
        this.f43495a.releaseReource();
    }

    public boolean cmdEnData(byte[] bArr, byte[] bArr2) {
        byte[] bArr3 = {0, 0, 0, 0, 110, -107, 116, 70, 78, -32, 101, -33, -81, -102, 119, 108};
        byte[] bArr4 = new byte[20];
        System.arraycopy(bArr, 0, bArr3, 0, 4);
        cardencryption cardencryptionVar = new cardencryption();
        byte[] bArr5 = new byte[4];
        if (!m49363a(bArr5)) {
            return false;
        }
        cardencryptionVar.randomCrypt(bArr3, (byte) 16, bArr5, (byte) 4, (byte) 54, bArr4);
        System.arraycopy(bArr5, 0, bArr2, 0, 4);
        bArr2[4] = bArr4[3];
        bArr2[5] = bArr4[2];
        bArr2[6] = bArr4[1];
        bArr2[7] = bArr4[0];
        bArr2[8] = bArr4[7];
        bArr2[9] = bArr4[6];
        bArr2[10] = bArr4[5];
        bArr2[11] = bArr4[4];
        return true;
    }

    public int cmdGetCardStatus() {
        byte[] bArr = new byte[128];
        int[] iArr = new int[1];
        buildApdu((byte) 101, null, 0, 0, 0);
        int Transmit = Transmit(f43494e, this.f43497c, bArr, iArr);
        if (Transmit == 612) {
            return Transmit;
        }
        if (iArr[0] < 8) {
            return C6150DK.RETURN_ERROR;
        }
        int i = bArr[7] & 2;
        if (i == 0 || i == 1) {
            return 1;
        }
        if (i != 2) {
            return 2;
        }
        return 3;
    }

    public int cmdGetKSN(byte[] bArr, int[] iArr) {
        byte[] bArr2 = new byte[74];
        int[] iArr2 = new int[1];
        buildApdu((byte) 107, new byte[]{91, 3}, 4, 0, 0);
        int Transmit = Transmit(f43494e, this.f43497c, bArr2, iArr2);
        if (Transmit != 0) {
            return Transmit;
        }
        if (iArr2[0] < 26 || (bArr2[7] & 128) != 0 || bArr2[10] != -75 || bArr2[11] != 3 || bArr2[12] != 0 || bArr2[13] != 12 || bArr2[24] != -112 || bArr2[25] != 0) {
            return C6150DK.RETURN_ERROR;
        }
        System.arraycopy(bArr2, 14, bArr, 0, 10);
        iArr[0] = 10;
        return 0;
    }

    public int cmdGetVersion(byte[] bArr, int[] iArr) {
        byte[] bArr2 = new byte[128];
        bArr2[0] = 90;
        bArr2[1] = -91;
        bArr2[2] = 32;
        int[] iArr2 = new int[1];
        buildApdu((byte) 107, bArr2, 3, 0, 0);
        if (Transmit(f43494e, this.f43497c, bArr2, iArr2) != 0) {
            bArr[0] = 0;
            iArr[0] = 0;
            return C6150DK.RETURN_ERROR;
        }
        int i = iArr2[0];
        if (i < 14) {
            return C6150DK.RETURN_ERROR;
        }
        int i2 = i - 12;
        iArr2[0] = i2;
        System.arraycopy(bArr2, 10, bArr, 0, i2);
        iArr[0] = iArr2[0];
        return 0;
    }

    public int cmdPowerOff() {
        byte[] bArr = new byte[128];
        int[] iArr = new int[1];
        buildApdu((byte) 99, null, 0, 0, 0);
        if (Transmit(f43494e, this.f43497c, bArr, iArr) != 0) {
            return 612;
        }
        if (iArr[0] >= 8 && (bArr[7] & SignedBytes.MAX_POWER_OF_TWO) == 0) {
            return 0;
        }
        return C6150DK.RETURN_ERROR;
    }

    public int cmdPowerOn(byte[] bArr, int[] iArr) {
        byte[] bArr2 = new byte[128];
        buildApdu((byte) 98, null, 0, 0, 0);
        int Transmit = Transmit(f43494e, this.f43497c, bArr2, iArr);
        if (Transmit != 0) {
            return Transmit;
        }
        int i = iArr[0];
        if (i < 8 || (bArr2[7] & SignedBytes.MAX_POWER_OF_TWO) != 0) {
            return C6150DK.RETURN_ERROR;
        }
        int i2 = i - 10;
        iArr[0] = i2;
        if (i2 > 0) {
            System.arraycopy(bArr2, 10, bArr, 0, i2);
        }
        return 0;
    }

    public int cmdReadFlash(byte[] bArr, int i, int i2) {
        if (i + i2 > 255) {
            return 61443;
        }
        byte[] bArr2 = new byte[512];
        bArr2[0] = 90;
        bArr2[1] = -89;
        bArr2[2] = -1;
        bArr2[3] = 0;
        int[] iArr = new int[1];
        buildApdu((byte) 107, bArr2, 4, 0, 0);
        if (Transmit(f43494e, this.f43497c, bArr2, iArr) != 0) {
            bArr[0] = 0;
            return C6150DK.RETURN_ERROR;
        } else if (iArr[0] < 265) {
            return C6150DK.RETURN_ERROR;
        } else {
            System.arraycopy(bArr2, i + 10, bArr, 0, i2);
            return 0;
        }
    }

    public int cmdSetEncrypt(boolean z, boolean z2, boolean z3) {
        byte b = z ? (byte) 1 : (byte) 0;
        byte b2 = z2 ? (byte) 1 : (byte) 0;
        byte b3 = z3 ? (byte) 1 : (byte) 0;
        byte[] bArr = new byte[64];
        int[] iArr = new int[1];
        buildApdu((byte) 107, new byte[]{91, 1, 0, 3, b, b2, b3}, 7, 0, 0);
        int Transmit = Transmit(f43494e, this.f43497c, bArr, iArr);
        if (Transmit != 0) {
            return Transmit;
        }
        if (iArr[0] != 19) {
            return C6150DK.RETURN_ERROR;
        }
        if (bArr[10] == -75 && bArr[11] == 1 && bArr[12] == 0 && bArr[13] == 5 && bArr[17] == -112 && bArr[18] == 0 && bArr[14] == b && bArr[15] == b2 && bArr[16] == b3) {
            return 0;
        }
        return C6150DK.TRANS_RETURN_ERROR;
    }

    public int cmdSetPPs() {
        byte[] m23272d = AbstractC13292rm.m23272d(this.f43498d);
        buildApdu((byte) 97, m23272d, m23272d.length, 0, AbstractC13292rm.m23271e(this.f43498d));
        return Transmit(f43494e, this.f43497c, new byte[128], new int[1]);
    }

    public int cmdWriteFlash(byte[] bArr, int i, int i2) {
        if (i + i2 > 255) {
            return 61443;
        }
        byte[] bArr2 = new byte[512];
        if ((i != 0 || i2 != 255) && cmdReadFlash(bArr2, 0, 255) != 0) {
            return C6150DK.RETURN_ERROR;
        }
        System.arraycopy(bArr, 0, bArr2, i, i2);
        byte[] bArr3 = new byte[512];
        bArr3[0] = 90;
        bArr3[1] = -90;
        bArr3[2] = -1;
        bArr3[3] = 0;
        int[] iArr = new int[1];
        buildApdu((byte) 107, bArr3, 4, 0, 0);
        if (Transmit(f43494e, this.f43497c, bArr3, iArr) != 0) {
            return C6150DK.RETURN_ERROR;
        }
        buildApdu((byte) 107, bArr2, 255, 0, 0);
        if (Transmit(f43494e, this.f43497c, bArr3, iArr) != 0) {
            return C6150DK.RETURN_ERROR;
        }
        return 0;
    }

    public int getIfsc() {
        return AbstractC13292rm.m23273c(this.f43498d);
    }

    public int getProtocol() {
        return AbstractC13292rm.m23271e(this.f43498d);
    }
}
