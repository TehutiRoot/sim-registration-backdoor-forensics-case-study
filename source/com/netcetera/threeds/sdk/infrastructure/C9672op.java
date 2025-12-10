package com.netcetera.threeds.sdk.infrastructure;

import com.facebook.stetho.dumpapp.Framer;
import com.google.common.base.Ascii;
import com.netcetera.threeds.sdk.infrastructure.AbstractC9671oo;
import kotlin.p023io.encoding.Base64;
import okio.Utf8;

/* renamed from: com.netcetera.threeds.sdk.infrastructure.op */
/* loaded from: classes5.dex */
public class C9672op extends AbstractC9671oo {
    private final byte[] cleanup;
    private final byte[] getSDKInfo;
    private final byte[] getSDKVersion;
    private final int initialize;
    private final int onCompleted;
    static final byte[] ThreeDS2Service = {13, 10};
    private static final byte[] get = {65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, Framer.EXIT_FRAME_PREFIX, 121, 122, 48, Framer.STDOUT_FRAME_PREFIX, Framer.STDERR_FRAME_PREFIX, 51, 52, 53, 54, 55, 56, 57, 43, 47};
    private static final byte[] valueOf = {65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, Framer.EXIT_FRAME_PREFIX, 121, 122, 48, Framer.STDOUT_FRAME_PREFIX, Framer.STDERR_FRAME_PREFIX, 51, 52, 53, 54, 55, 56, 57, Framer.STDIN_FRAME_PREFIX, Framer.STDIN_REQUEST_FRAME_PREFIX};
    private static final byte[] getWarnings = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 62, -1, 62, -1, Utf8.REPLACEMENT_BYTE, 52, 53, 54, 55, 56, 57, 58, 59, 60, Base64.padSymbol, -1, -1, -1, -1, -1, -1, -1, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, Ascii.DC4, Ascii.NAK, Ascii.SYN, Ascii.ETB, Ascii.CAN, Ascii.f52684EM, -1, -1, -1, -1, Utf8.REPLACEMENT_BYTE, -1, Ascii.SUB, Ascii.ESC, Ascii.f52686FS, Ascii.f52687GS, Ascii.f52691RS, Ascii.f52695US, 32, Framer.ENTER_FRAME_PREFIX, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, Framer.STDIN_FRAME_PREFIX, 46, 47, 48, Framer.STDOUT_FRAME_PREFIX, Framer.STDERR_FRAME_PREFIX, 51};

    public C9672op() {
        this(0);
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.AbstractC9671oo
    public void ThreeDS2Service(byte[] bArr, int i, int i2, AbstractC9671oo.get getVar) {
        if (getVar.getSDKVersion) {
            return;
        }
        if (i2 < 0) {
            getVar.getSDKVersion = true;
            if (getVar.getSDKInfo == 0 && this.values == 0) {
                return;
            }
            byte[] ThreeDS2ServiceInstance = ThreeDS2ServiceInstance(this.onCompleted, getVar);
            int i3 = getVar.get;
            int i4 = getVar.getSDKInfo;
            if (i4 != 0) {
                if (i4 != 1) {
                    if (i4 == 2) {
                        byte[] bArr2 = this.cleanup;
                        int i5 = getVar.ThreeDS2Service;
                        ThreeDS2ServiceInstance[i3] = bArr2[(i5 >> 10) & 63];
                        ThreeDS2ServiceInstance[i3 + 1] = bArr2[(i5 >> 4) & 63];
                        int i6 = i3 + 3;
                        getVar.get = i6;
                        ThreeDS2ServiceInstance[i3 + 2] = bArr2[(i5 << 2) & 63];
                        if (bArr2 == get) {
                            getVar.get = i3 + 4;
                            ThreeDS2ServiceInstance[i6] = Base64.padSymbol;
                        }
                    } else {
                        throw new IllegalStateException("Impossible modulus " + getVar.getSDKInfo);
                    }
                } else {
                    byte[] bArr3 = this.cleanup;
                    int i7 = getVar.ThreeDS2Service;
                    ThreeDS2ServiceInstance[i3] = bArr3[(i7 >> 2) & 63];
                    int i8 = i3 + 2;
                    getVar.get = i8;
                    ThreeDS2ServiceInstance[i3 + 1] = bArr3[(i7 << 4) & 63];
                    if (bArr3 == get) {
                        ThreeDS2ServiceInstance[i8] = Base64.padSymbol;
                        getVar.get = i3 + 4;
                        ThreeDS2ServiceInstance[i3 + 3] = Base64.padSymbol;
                    }
                }
            }
            int i9 = getVar.getWarnings;
            int i10 = getVar.get;
            int i11 = i9 + (i10 - i3);
            getVar.getWarnings = i11;
            if (this.values > 0 && i11 > 0) {
                byte[] bArr4 = this.getSDKInfo;
                System.arraycopy(bArr4, 0, ThreeDS2ServiceInstance, i10, bArr4.length);
                getVar.get += this.getSDKInfo.length;
                return;
            }
            return;
        }
        int i12 = 0;
        while (i12 < i2) {
            byte[] ThreeDS2ServiceInstance2 = ThreeDS2ServiceInstance(this.onCompleted, getVar);
            int i13 = (getVar.getSDKInfo + 1) % 3;
            getVar.getSDKInfo = i13;
            int i14 = i + 1;
            int i15 = bArr[i];
            if (i15 < 0) {
                i15 += 256;
            }
            int i16 = (getVar.ThreeDS2Service << 8) + i15;
            getVar.ThreeDS2Service = i16;
            if (i13 == 0) {
                int i17 = getVar.get;
                byte[] bArr5 = this.cleanup;
                ThreeDS2ServiceInstance2[i17] = bArr5[(i16 >> 18) & 63];
                ThreeDS2ServiceInstance2[i17 + 1] = bArr5[(i16 >> 12) & 63];
                int i18 = i17 + 3;
                ThreeDS2ServiceInstance2[i17 + 2] = bArr5[(i16 >> 6) & 63];
                int i19 = i17 + 4;
                getVar.get = i19;
                ThreeDS2ServiceInstance2[i18] = bArr5[i16 & 63];
                int i20 = getVar.getWarnings + 4;
                getVar.getWarnings = i20;
                int i21 = this.values;
                if (i21 > 0 && i21 <= i20) {
                    byte[] bArr6 = this.getSDKInfo;
                    System.arraycopy(bArr6, 0, ThreeDS2ServiceInstance2, i19, bArr6.length);
                    getVar.get += this.getSDKInfo.length;
                    getVar.getWarnings = 0;
                }
            }
            i12++;
            i = i14;
        }
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.AbstractC9671oo
    public void get(byte[] bArr, int i, int i2, AbstractC9671oo.get getVar) {
        byte b;
        if (getVar.getSDKVersion) {
            return;
        }
        if (i2 < 0) {
            getVar.getSDKVersion = true;
        }
        int i3 = 0;
        while (true) {
            if (i3 >= i2) {
                break;
            }
            byte[] ThreeDS2ServiceInstance = ThreeDS2ServiceInstance(this.initialize, getVar);
            int i4 = i + 1;
            byte b2 = bArr[i];
            if (b2 == 61) {
                getVar.getSDKVersion = true;
                break;
            }
            if (b2 >= 0) {
                byte[] bArr2 = getWarnings;
                if (b2 < bArr2.length && (b = bArr2[b2]) >= 0) {
                    int i5 = (getVar.getSDKInfo + 1) % 4;
                    getVar.getSDKInfo = i5;
                    int i6 = (getVar.ThreeDS2Service << 6) + b;
                    getVar.ThreeDS2Service = i6;
                    if (i5 == 0) {
                        int i7 = getVar.get;
                        ThreeDS2ServiceInstance[i7] = (byte) ((i6 >> 16) & 255);
                        ThreeDS2ServiceInstance[i7 + 1] = (byte) ((i6 >> 8) & 255);
                        getVar.get = i7 + 3;
                        ThreeDS2ServiceInstance[i7 + 2] = (byte) (i6 & 255);
                    }
                }
            }
            i3++;
            i = i4;
        }
        if (getVar.getSDKVersion && getVar.getSDKInfo != 0) {
            byte[] ThreeDS2ServiceInstance2 = ThreeDS2ServiceInstance(this.initialize, getVar);
            int i8 = getVar.getSDKInfo;
            if (i8 != 1) {
                if (i8 != 2) {
                    if (i8 == 3) {
                        int i9 = getVar.ThreeDS2Service;
                        int i10 = i9 >> 2;
                        getVar.ThreeDS2Service = i10;
                        int i11 = getVar.get;
                        ThreeDS2ServiceInstance2[i11] = (byte) ((i9 >> 10) & 255);
                        getVar.get = i11 + 2;
                        ThreeDS2ServiceInstance2[i11 + 1] = (byte) (i10 & 255);
                        return;
                    }
                    throw new IllegalStateException("Impossible modulus " + getVar.getSDKInfo);
                }
                int i12 = getVar.ThreeDS2Service >> 4;
                getVar.ThreeDS2Service = i12;
                int i13 = getVar.get;
                getVar.get = i13 + 1;
                ThreeDS2ServiceInstance2[i13] = (byte) (i12 & 255);
            }
        }
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.AbstractC9671oo
    public boolean valueOf(byte b) {
        if (b >= 0) {
            byte[] bArr = this.getSDKVersion;
            if (b < bArr.length && bArr[b] != -1) {
                return true;
            }
        }
        return false;
    }

    public C9672op(int i) {
        this(i, ThreeDS2Service);
    }

    public C9672op(int i, byte[] bArr) {
        this(i, bArr, false);
    }

    public C9672op(int i, byte[] bArr, boolean z) {
        super(3, 4, i, bArr == null ? 0 : bArr.length);
        this.getSDKVersion = getWarnings;
        if (bArr != null) {
            if (get(bArr)) {
                String str = C9730ro.get(bArr);
                throw new IllegalArgumentException("lineSeparator must not contain base64 characters: [" + str + "]");
            } else if (i > 0) {
                this.onCompleted = bArr.length + 4;
                byte[] bArr2 = new byte[bArr.length];
                this.getSDKInfo = bArr2;
                System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
            } else {
                this.onCompleted = 4;
                this.getSDKInfo = null;
            }
        } else {
            this.onCompleted = 4;
            this.getSDKInfo = null;
        }
        this.initialize = this.onCompleted - 1;
        this.cleanup = z ? valueOf : get;
    }
}
