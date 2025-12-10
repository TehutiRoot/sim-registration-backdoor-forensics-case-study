package org.bouncycastle.crypto.engines;

import androidx.appcompat.app.AppCompatDelegate;
import androidx.recyclerview.widget.ItemTouchHelper;
import com.facebook.stetho.dumpapp.Framer;
import com.fasterxml.jackson.core.json.ByteSourceJsonBootstrapper;
import com.google.common.base.Ascii;
import com.google.common.primitives.SignedBytes;
import java.lang.reflect.Array;
import kotlin.p023io.encoding.Base64;
import okio.Utf8;
import org.bouncycastle.asn1.cmc.BodyPartID;
import org.bouncycastle.crypto.BlockCipher;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.DataLengthException;
import org.bouncycastle.crypto.OutputLengthException;
import org.bouncycastle.crypto.params.KeyParameter;
import org.bouncycastle.crypto.signers.PSSSigner;
import th.p047co.dtac.android.dtacone.util.MapLocation;

/* loaded from: classes6.dex */
public class RijndaelEngine implements BlockCipher {
    private static final int MAXKC = 64;
    private static final int MAXROUNDS = 14;

    /* renamed from: A0 */
    private long f75027A0;

    /* renamed from: A1 */
    private long f75028A1;

    /* renamed from: A2 */
    private long f75029A2;

    /* renamed from: A3 */
    private long f75030A3;

    /* renamed from: BC */
    private int f75031BC;
    private long BC_MASK;
    private int ROUNDS;
    private int blockBits;
    private boolean forEncryption;
    private byte[] shifts0SC;
    private byte[] shifts1SC;
    private long[][] workingKey;
    private static final byte[] logtable = {0, 0, Ascii.f52684EM, 1, Framer.STDERR_FRAME_PREFIX, 2, Ascii.SUB, -58, 75, -57, Ascii.ESC, 104, 51, -18, -33, 3, 100, 4, -32, 14, 52, -115, -127, ByteSourceJsonBootstrapper.UTF8_BOM_1, 76, 113, 8, -56, -8, 105, Ascii.f52686FS, -63, 125, -62, Ascii.f52687GS, -75, -7, -71, 39, 106, 77, -28, -90, 114, -102, -55, 9, Framer.EXIT_FRAME_PREFIX, 101, 47, -118, 5, Framer.ENTER_FRAME_PREFIX, 15, -31, 36, 18, -16, -126, 69, 53, -109, -38, -114, -106, -113, -37, -67, 54, -48, -50, -108, 19, 92, -46, -15, SignedBytes.MAX_POWER_OF_TWO, 70, -125, 56, 102, -35, -3, 48, ByteSourceJsonBootstrapper.UTF8_BOM_3, 6, -117, 98, -77, 37, -30, -104, 34, -120, -111, 16, 126, 110, 72, -61, -93, -74, Ascii.f52691RS, 66, 58, 107, 40, 84, -6, -123, Base64.padSymbol, -70, 43, 121, 10, Ascii.NAK, -101, -97, 94, -54, 78, -44, -84, -27, -13, 115, -89, 87, -81, 88, -88, 80, -12, -22, -42, 116, 79, -82, -23, -43, -25, -26, -83, -24, 44, -41, 117, 122, -21, Ascii.SYN, 11, -11, 89, -53, Framer.STDIN_REQUEST_FRAME_PREFIX, -80, -100, -87, 81, -96, Byte.MAX_VALUE, 12, -10, 111, Ascii.ETB, -60, 73, -20, -40, 67, Ascii.f52695US, Framer.STDIN_FRAME_PREFIX, -92, 118, 123, -73, -52, ByteSourceJsonBootstrapper.UTF8_BOM_2, 62, 90, -5, 96, -79, -122, 59, 82, -95, 108, -86, 85, 41, -99, -105, -78, -121, -112, 97, -66, -36, -4, PSSSigner.TRAILER_IMPLICIT, -107, -49, -51, 55, Utf8.REPLACEMENT_BYTE, 91, -47, 83, 57, -124, 60, 65, -94, 109, 71, Ascii.DC4, 42, -98, 93, 86, -14, -45, -85, 68, 17, -110, -39, 35, 32, 46, -119, -76, 124, -72, 38, 119, -103, -29, -91, 103, 74, -19, -34, -59, Framer.STDOUT_FRAME_PREFIX, -2, Ascii.CAN, 13, 99, -116, Byte.MIN_VALUE, -64, -9, 112, 7};
    private static final byte[] aLogtable = {0, 3, 5, 15, 17, 51, 85, -1, Ascii.SUB, 46, 114, -106, -95, -8, 19, 53, Framer.STDIN_REQUEST_FRAME_PREFIX, -31, 56, 72, -40, 115, -107, -92, -9, 2, 6, 10, Ascii.f52691RS, 34, 102, -86, -27, 52, 92, -28, 55, 89, -21, 38, 106, -66, -39, 112, -112, -85, -26, Framer.STDOUT_FRAME_PREFIX, 83, -11, 4, 12, Ascii.DC4, 60, 68, -52, 79, -47, 104, -72, -45, 110, -78, -51, 76, -44, 103, -87, -32, 59, 77, -41, 98, -90, -15, 8, Ascii.CAN, 40, Framer.EXIT_FRAME_PREFIX, -120, -125, -98, -71, -48, 107, -67, -36, Byte.MAX_VALUE, -127, -104, -77, -50, 73, -37, 118, -102, -75, -60, 87, -7, 16, 48, 80, -16, 11, Ascii.f52687GS, 39, 105, ByteSourceJsonBootstrapper.UTF8_BOM_2, -42, 97, -93, -2, Ascii.f52684EM, 43, 125, -121, -110, -83, -20, 47, 113, -109, -82, -23, 32, 96, -96, -5, Ascii.SYN, 58, 78, -46, 109, -73, -62, 93, -25, Framer.STDERR_FRAME_PREFIX, 86, -6, Ascii.NAK, Utf8.REPLACEMENT_BYTE, 65, -61, 94, -30, Base64.padSymbol, 71, -55, SignedBytes.MAX_POWER_OF_TWO, -64, 91, -19, 44, 116, -100, ByteSourceJsonBootstrapper.UTF8_BOM_3, -38, 117, -97, -70, -43, 100, -84, ByteSourceJsonBootstrapper.UTF8_BOM_1, 42, 126, -126, -99, PSSSigner.TRAILER_IMPLICIT, -33, 122, -114, -119, Byte.MIN_VALUE, -101, -74, -63, 88, -24, 35, 101, -81, -22, 37, 111, -79, -56, 67, -59, 84, -4, Ascii.f52695US, Framer.ENTER_FRAME_PREFIX, 99, -91, -12, 7, 9, Ascii.ESC, Framer.STDIN_FRAME_PREFIX, 119, -103, -80, -53, 70, -54, 69, -49, 74, -34, 121, -117, -122, -111, -88, -29, 62, 66, -58, 81, -13, 14, 18, 54, 90, -18, 41, 123, -115, -116, -113, -118, -123, -108, -89, -14, 13, Ascii.ETB, 57, 75, -35, 124, -124, -105, -94, -3, Ascii.f52686FS, 36, 108, -76, -57, 82, -10, 1, 3, 5, 15, 17, 51, 85, -1, Ascii.SUB, 46, 114, -106, -95, -8, 19, 53, Framer.STDIN_REQUEST_FRAME_PREFIX, -31, 56, 72, -40, 115, -107, -92, -9, 2, 6, 10, Ascii.f52691RS, 34, 102, -86, -27, 52, 92, -28, 55, 89, -21, 38, 106, -66, -39, 112, -112, -85, -26, Framer.STDOUT_FRAME_PREFIX, 83, -11, 4, 12, Ascii.DC4, 60, 68, -52, 79, -47, 104, -72, -45, 110, -78, -51, 76, -44, 103, -87, -32, 59, 77, -41, 98, -90, -15, 8, Ascii.CAN, 40, Framer.EXIT_FRAME_PREFIX, -120, -125, -98, -71, -48, 107, -67, -36, Byte.MAX_VALUE, -127, -104, -77, -50, 73, -37, 118, -102, -75, -60, 87, -7, 16, 48, 80, -16, 11, Ascii.f52687GS, 39, 105, ByteSourceJsonBootstrapper.UTF8_BOM_2, -42, 97, -93, -2, Ascii.f52684EM, 43, 125, -121, -110, -83, -20, 47, 113, -109, -82, -23, 32, 96, -96, -5, Ascii.SYN, 58, 78, -46, 109, -73, -62, 93, -25, Framer.STDERR_FRAME_PREFIX, 86, -6, Ascii.NAK, Utf8.REPLACEMENT_BYTE, 65, -61, 94, -30, Base64.padSymbol, 71, -55, SignedBytes.MAX_POWER_OF_TWO, -64, 91, -19, 44, 116, -100, ByteSourceJsonBootstrapper.UTF8_BOM_3, -38, 117, -97, -70, -43, 100, -84, ByteSourceJsonBootstrapper.UTF8_BOM_1, 42, 126, -126, -99, PSSSigner.TRAILER_IMPLICIT, -33, 122, -114, -119, Byte.MIN_VALUE, -101, -74, -63, 88, -24, 35, 101, -81, -22, 37, 111, -79, -56, 67, -59, 84, -4, Ascii.f52695US, Framer.ENTER_FRAME_PREFIX, 99, -91, -12, 7, 9, Ascii.ESC, Framer.STDIN_FRAME_PREFIX, 119, -103, -80, -53, 70, -54, 69, -49, 74, -34, 121, -117, -122, -111, -88, -29, 62, 66, -58, 81, -13, 14, 18, 54, 90, -18, 41, 123, -115, -116, -113, -118, -123, -108, -89, -14, 13, Ascii.ETB, 57, 75, -35, 124, -124, -105, -94, -3, Ascii.f52686FS, 36, 108, -76, -57, 82, -10, 1};

    /* renamed from: S */
    private static final byte[] f75025S = {99, 124, 119, 123, -14, 107, 111, -59, 48, 1, 103, 43, -2, -41, -85, 118, -54, -126, -55, 125, -6, 89, 71, -16, -83, -44, -94, -81, -100, -92, 114, -64, -73, -3, -109, 38, 54, Utf8.REPLACEMENT_BYTE, -9, -52, 52, -91, -27, -15, 113, -40, Framer.STDOUT_FRAME_PREFIX, Ascii.NAK, 4, -57, 35, -61, Ascii.CAN, -106, 5, -102, 7, 18, Byte.MIN_VALUE, -30, -21, 39, -78, 117, 9, -125, 44, Ascii.SUB, Ascii.ESC, 110, 90, -96, 82, 59, -42, -77, 41, -29, 47, -124, 83, -47, 0, -19, 32, -4, -79, 91, 106, -53, -66, 57, 74, 76, 88, -49, -48, ByteSourceJsonBootstrapper.UTF8_BOM_1, -86, -5, 67, 77, 51, -123, 69, -7, 2, Byte.MAX_VALUE, 80, 60, -97, -88, 81, -93, SignedBytes.MAX_POWER_OF_TWO, -113, -110, -99, 56, -11, PSSSigner.TRAILER_IMPLICIT, -74, -38, Framer.ENTER_FRAME_PREFIX, 16, -1, -13, -46, -51, 12, 19, -20, Framer.STDIN_REQUEST_FRAME_PREFIX, -105, 68, Ascii.ETB, -60, -89, 126, Base64.padSymbol, 100, 93, Ascii.f52684EM, 115, 96, -127, 79, -36, 34, 42, -112, -120, 70, -18, -72, Ascii.DC4, -34, 94, 11, -37, -32, Framer.STDERR_FRAME_PREFIX, 58, 10, 73, 6, 36, 92, -62, -45, -84, 98, -111, -107, -28, 121, -25, -56, 55, 109, -115, -43, 78, -87, 108, 86, -12, -22, 101, 122, -82, 8, -70, Framer.EXIT_FRAME_PREFIX, 37, 46, Ascii.f52686FS, -90, -76, -58, -24, -35, 116, Ascii.f52695US, 75, -67, -117, -118, 112, 62, -75, 102, 72, 3, -10, 14, 97, 53, 87, -71, -122, -63, Ascii.f52687GS, -98, -31, -8, -104, 17, 105, -39, -114, -108, -101, Ascii.f52691RS, -121, -23, -50, 85, 40, -33, -116, -95, -119, 13, ByteSourceJsonBootstrapper.UTF8_BOM_3, -26, 66, 104, 65, -103, Framer.STDIN_FRAME_PREFIX, 15, -80, 84, ByteSourceJsonBootstrapper.UTF8_BOM_2, Ascii.SYN};

    /* renamed from: Si */
    private static final byte[] f75026Si = {82, 9, 106, -43, 48, 54, -91, 56, ByteSourceJsonBootstrapper.UTF8_BOM_3, SignedBytes.MAX_POWER_OF_TWO, -93, -98, -127, -13, -41, -5, 124, -29, 57, -126, -101, 47, -1, -121, 52, -114, 67, 68, -60, -34, -23, -53, 84, 123, -108, Framer.STDERR_FRAME_PREFIX, -90, -62, 35, Base64.padSymbol, -18, 76, -107, 11, 66, -6, -61, 78, 8, 46, -95, 102, 40, -39, 36, -78, 118, 91, -94, 73, 109, -117, -47, 37, 114, -8, -10, 100, -122, 104, -104, Ascii.SYN, -44, -92, 92, -52, 93, 101, -74, -110, 108, 112, 72, 80, -3, -19, -71, -38, 94, Ascii.NAK, 70, 87, -89, -115, -99, -124, -112, -40, -85, 0, -116, PSSSigner.TRAILER_IMPLICIT, -45, 10, -9, -28, 88, 5, -72, -77, 69, 6, -48, 44, Ascii.f52691RS, -113, -54, Utf8.REPLACEMENT_BYTE, 15, 2, -63, -81, -67, 3, 1, 19, -118, 107, 58, -111, 17, 65, 79, 103, -36, -22, -105, -14, -49, -50, -16, -76, -26, 115, -106, -84, 116, 34, -25, -83, 53, -123, -30, -7, 55, -24, Ascii.f52686FS, 117, -33, 110, 71, -15, Ascii.SUB, 113, Ascii.f52687GS, 41, -59, -119, 111, -73, 98, 14, -86, Ascii.CAN, -66, Ascii.ESC, -4, 86, 62, 75, -58, -46, 121, 32, -102, -37, -64, -2, Framer.EXIT_FRAME_PREFIX, -51, 90, -12, Ascii.f52695US, -35, -88, 51, -120, 7, -57, Framer.STDOUT_FRAME_PREFIX, -79, 18, 16, 89, 39, Byte.MIN_VALUE, -20, Framer.STDIN_REQUEST_FRAME_PREFIX, 96, 81, Byte.MAX_VALUE, -87, Ascii.f52684EM, -75, 74, 13, Framer.STDIN_FRAME_PREFIX, -27, 122, -97, -109, -55, -100, ByteSourceJsonBootstrapper.UTF8_BOM_1, -96, -32, 59, 77, -82, 42, -11, -80, -56, -21, ByteSourceJsonBootstrapper.UTF8_BOM_2, 60, -125, 83, -103, 97, Ascii.ETB, 43, 4, 126, -70, 119, -42, 38, -31, 105, Ascii.DC4, 99, 85, Framer.ENTER_FRAME_PREFIX, 12, 125};
    private static final int[] rcon = {1, 2, 4, 8, 16, 32, 64, 128, 27, 54, AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR, 216, 171, 77, 154, 47, 94, 188, 99, 198, 151, 53, 106, 212, 179, 125, ItemTouchHelper.Callback.DEFAULT_SWIPE_ANIMATION_DURATION, 239, 197, 145};
    static byte[][] shifts0 = {new byte[]{0, 8, 16, Ascii.CAN}, new byte[]{0, 8, 16, Ascii.CAN}, new byte[]{0, 8, 16, Ascii.CAN}, new byte[]{0, 8, 16, 32}, new byte[]{0, 8, Ascii.CAN, 32}};
    static byte[][] shifts1 = {new byte[]{0, Ascii.CAN, 16, 8}, new byte[]{0, 32, Ascii.CAN, 16}, new byte[]{0, 40, 32, Ascii.CAN}, new byte[]{0, 48, 40, Ascii.CAN}, new byte[]{0, 56, 40, 32}};

    public RijndaelEngine() {
        this(128);
    }

    private void InvMixColumn() {
        long j = 0;
        long j2 = 0;
        long j3 = 0;
        long j4 = 0;
        for (int i = 0; i < this.f75031BC; i += 8) {
            int i2 = (int) ((this.f75027A0 >> i) & 255);
            int i3 = (int) ((this.f75028A1 >> i) & 255);
            int i4 = (int) ((this.f75029A2 >> i) & 255);
            long j5 = j4;
            int i5 = (int) ((this.f75030A3 >> i) & 255);
            int i6 = -1;
            int i7 = i2 != 0 ? logtable[i2 & 255] & 255 : -1;
            int i8 = i3 != 0 ? logtable[i3 & 255] & 255 : -1;
            int i9 = i4 != 0 ? logtable[i4 & 255] & 255 : -1;
            if (i5 != 0) {
                i6 = logtable[i5 & 255] & 255;
            }
            j |= ((((mul0xe(i7) ^ mul0xb(i8)) ^ mul0xd(i9)) ^ mul0x9(i6)) & 255) << i;
            j2 |= ((((mul0xe(i8) ^ mul0xb(i9)) ^ mul0xd(i6)) ^ mul0x9(i7)) & 255) << i;
            j3 |= ((((mul0xe(i9) ^ mul0xb(i6)) ^ mul0xd(i7)) ^ mul0x9(i8)) & 255) << i;
            j4 = j5 | (((((mul0xe(i6) ^ mul0xb(i7)) ^ mul0xd(i8)) ^ mul0x9(i9)) & 255) << i);
        }
        this.f75027A0 = j;
        this.f75028A1 = j2;
        this.f75029A2 = j3;
        this.f75030A3 = j4;
    }

    private void KeyAddition(long[] jArr) {
        this.f75027A0 ^= jArr[0];
        this.f75028A1 ^= jArr[1];
        this.f75029A2 ^= jArr[2];
        this.f75030A3 ^= jArr[3];
    }

    private void MixColumn() {
        long j = 0;
        long j2 = 0;
        long j3 = 0;
        long j4 = 0;
        for (int i = 0; i < this.f75031BC; i += 8) {
            int i2 = (int) ((this.f75027A0 >> i) & 255);
            int i3 = (int) ((this.f75028A1 >> i) & 255);
            int i4 = (int) ((this.f75029A2 >> i) & 255);
            int i5 = (int) ((this.f75030A3 >> i) & 255);
            j |= ((((mul0x2(i2) ^ mul0x3(i3)) ^ i4) ^ i5) & 255) << i;
            j2 |= ((((mul0x2(i3) ^ mul0x3(i4)) ^ i5) ^ i2) & 255) << i;
            j3 |= ((((mul0x2(i4) ^ mul0x3(i5)) ^ i2) ^ i3) & 255) << i;
            j4 |= ((((mul0x2(i5) ^ mul0x3(i2)) ^ i3) ^ i4) & 255) << i;
        }
        this.f75027A0 = j;
        this.f75028A1 = j2;
        this.f75029A2 = j3;
        this.f75030A3 = j4;
    }

    private void ShiftRow(byte[] bArr) {
        this.f75028A1 = shift(this.f75028A1, bArr[1]);
        this.f75029A2 = shift(this.f75029A2, bArr[2]);
        this.f75030A3 = shift(this.f75030A3, bArr[3]);
    }

    private void Substitution(byte[] bArr) {
        this.f75027A0 = applyS(this.f75027A0, bArr);
        this.f75028A1 = applyS(this.f75028A1, bArr);
        this.f75029A2 = applyS(this.f75029A2, bArr);
        this.f75030A3 = applyS(this.f75030A3, bArr);
    }

    private long applyS(long j, byte[] bArr) {
        long j2 = 0;
        for (int i = 0; i < this.f75031BC; i += 8) {
            j2 |= (bArr[(int) ((j >> i) & 255)] & 255) << i;
        }
        return j2;
    }

    private void decryptBlock(long[][] jArr) {
        KeyAddition(jArr[this.ROUNDS]);
        Substitution(f75026Si);
        ShiftRow(this.shifts1SC);
        for (int i = this.ROUNDS - 1; i > 0; i--) {
            KeyAddition(jArr[i]);
            InvMixColumn();
            Substitution(f75026Si);
            ShiftRow(this.shifts1SC);
        }
        KeyAddition(jArr[0]);
    }

    private void encryptBlock(long[][] jArr) {
        KeyAddition(jArr[0]);
        for (int i = 1; i < this.ROUNDS; i++) {
            Substitution(f75025S);
            ShiftRow(this.shifts0SC);
            MixColumn();
            KeyAddition(jArr[i]);
        }
        Substitution(f75025S);
        ShiftRow(this.shifts0SC);
        KeyAddition(jArr[this.ROUNDS]);
    }

    private long[][] generateWorkingKey(byte[] bArr) {
        int i;
        int i2;
        int i3 = 8;
        int length = bArr.length * 8;
        int i4 = 1;
        int i5 = 4;
        byte[][] bArr2 = (byte[][]) Array.newInstance(Byte.TYPE, 4, 64);
        long[][] jArr = (long[][]) Array.newInstance(Long.TYPE, 15, 4);
        if (length == 128) {
            i = 4;
        } else if (length == 160) {
            i = 5;
        } else if (length == 192) {
            i = 6;
        } else if (length == 224) {
            i = 7;
        } else if (length != 256) {
            throw new IllegalArgumentException("Key length not 128/160/192/224/256 bits.");
        } else {
            i = 8;
        }
        this.ROUNDS = length >= this.blockBits ? i + 6 : (this.f75031BC / 8) + 6;
        int i6 = 0;
        int i7 = 0;
        while (i6 < bArr.length) {
            bArr2[i6 % 4][i6 / 4] = bArr[i7];
            i6++;
            i7++;
        }
        int i8 = 0;
        int i9 = 0;
        while (i8 < i && i9 < (this.ROUNDS + 1) * (this.f75031BC / 8)) {
            int i10 = 0;
            while (i10 < i5) {
                int i11 = this.f75031BC;
                long[] jArr2 = jArr[i9 / (i11 / 8)];
                jArr2[i10] = ((bArr2[i10][i8] & 255) << ((i9 * 8) % i11)) | jArr2[i10];
                i10++;
                i5 = 4;
            }
            i8++;
            i9++;
            i5 = 4;
        }
        int i12 = 0;
        while (i9 < (this.ROUNDS + i4) * (this.f75031BC / i3)) {
            int i13 = 0;
            for (int i14 = 4; i13 < i14; i14 = 4) {
                byte[] bArr3 = bArr2[i13];
                i13++;
                bArr3[0] = (byte) (f75025S[bArr2[i13 % 4][i - 1] & 255] ^ bArr3[0]);
            }
            byte[] bArr4 = bArr2[0];
            int i15 = i12 + 1;
            bArr4[0] = (byte) (rcon[i12] ^ bArr4[0]);
            if (i <= 6) {
                for (int i16 = 1; i16 < i; i16++) {
                    int i17 = 0;
                    for (int i18 = 4; i17 < i18; i18 = 4) {
                        byte[] bArr5 = bArr2[i17];
                        bArr5[i16] = (byte) (bArr5[i16] ^ bArr5[i16 - 1]);
                        i17++;
                    }
                }
            } else {
                int i19 = 4;
                int i20 = 1;
                while (true) {
                    i2 = 0;
                    if (i20 >= i19) {
                        break;
                    }
                    while (i2 < i19) {
                        byte[] bArr6 = bArr2[i2];
                        bArr6[i20] = (byte) (bArr6[i20] ^ bArr6[i20 - 1]);
                        i2++;
                        i19 = 4;
                    }
                    i20++;
                    i19 = 4;
                }
                while (i2 < i19) {
                    byte[] bArr7 = bArr2[i2];
                    bArr7[i19] = (byte) (bArr7[i19] ^ f75025S[bArr7[3] & 255]);
                    i2++;
                }
                int i21 = 5;
                while (i21 < i) {
                    int i22 = 0;
                    while (i22 < i19) {
                        byte[] bArr8 = bArr2[i22];
                        bArr8[i21] = (byte) (bArr8[i21] ^ bArr8[i21 - 1]);
                        i22++;
                        i19 = 4;
                    }
                    i21++;
                    i19 = 4;
                }
            }
            int i23 = 0;
            while (i23 < i && i9 < (this.ROUNDS + i4) * (this.f75031BC / i3)) {
                for (int i24 = 0; i24 < 4; i24++) {
                    int i25 = this.f75031BC;
                    long[] jArr3 = jArr[i9 / (i25 / 8)];
                    jArr3[i24] = ((bArr2[i24][i23] & 255) << ((i9 * 8) % i25)) | jArr3[i24];
                }
                i23++;
                i9++;
                i3 = 8;
                i4 = 1;
            }
            i12 = i15;
            i3 = 8;
            i4 = 1;
        }
        return jArr;
    }

    private byte mul0x2(int i) {
        if (i != 0) {
            return aLogtable[(logtable[i] & 255) + 25];
        }
        return (byte) 0;
    }

    private byte mul0x3(int i) {
        if (i != 0) {
            return aLogtable[(logtable[i] & 255) + 1];
        }
        return (byte) 0;
    }

    private byte mul0x9(int i) {
        if (i >= 0) {
            return aLogtable[i + MapLocation.REQUEST_LOCATION];
        }
        return (byte) 0;
    }

    private byte mul0xb(int i) {
        if (i >= 0) {
            return aLogtable[i + 104];
        }
        return (byte) 0;
    }

    private byte mul0xd(int i) {
        if (i >= 0) {
            return aLogtable[i + 238];
        }
        return (byte) 0;
    }

    private byte mul0xe(int i) {
        if (i >= 0) {
            return aLogtable[i + 223];
        }
        return (byte) 0;
    }

    private void packBlock(byte[] bArr, int i) {
        for (int i2 = 0; i2 != this.f75031BC; i2 += 8) {
            bArr[i] = (byte) (this.f75027A0 >> i2);
            bArr[i + 1] = (byte) (this.f75028A1 >> i2);
            int i3 = i + 3;
            bArr[i + 2] = (byte) (this.f75029A2 >> i2);
            i += 4;
            bArr[i3] = (byte) (this.f75030A3 >> i2);
        }
    }

    private long shift(long j, int i) {
        return ((j << (this.f75031BC - i)) | (j >>> i)) & this.BC_MASK;
    }

    private void unpackBlock(byte[] bArr, int i) {
        this.f75027A0 = bArr[i] & 255;
        this.f75028A1 = bArr[i + 1] & 255;
        int i2 = i + 3;
        this.f75029A2 = bArr[i + 2] & 255;
        int i3 = i + 4;
        this.f75030A3 = bArr[i2] & 255;
        for (int i4 = 8; i4 != this.f75031BC; i4 += 8) {
            this.f75027A0 |= (bArr[i3] & 255) << i4;
            this.f75028A1 |= (bArr[i3 + 1] & 255) << i4;
            int i5 = i3 + 3;
            this.f75029A2 |= (bArr[i3 + 2] & 255) << i4;
            i3 += 4;
            this.f75030A3 |= (bArr[i5] & 255) << i4;
        }
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public String getAlgorithmName() {
        return "Rijndael";
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public int getBlockSize() {
        return this.f75031BC / 2;
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public void init(boolean z, CipherParameters cipherParameters) {
        if (cipherParameters instanceof KeyParameter) {
            this.workingKey = generateWorkingKey(((KeyParameter) cipherParameters).getKey());
            this.forEncryption = z;
            return;
        }
        throw new IllegalArgumentException("invalid parameter passed to Rijndael init - " + cipherParameters.getClass().getName());
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public int processBlock(byte[] bArr, int i, byte[] bArr2, int i2) {
        if (this.workingKey != null) {
            int i3 = this.f75031BC;
            if ((i3 / 2) + i <= bArr.length) {
                if ((i3 / 2) + i2 <= bArr2.length) {
                    boolean z = this.forEncryption;
                    unpackBlock(bArr, i);
                    long[][] jArr = this.workingKey;
                    if (z) {
                        encryptBlock(jArr);
                    } else {
                        decryptBlock(jArr);
                    }
                    packBlock(bArr2, i2);
                    return this.f75031BC / 2;
                }
                throw new OutputLengthException("output buffer too short");
            }
            throw new DataLengthException("input buffer too short");
        }
        throw new IllegalStateException("Rijndael engine not initialised");
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public void reset() {
    }

    public RijndaelEngine(int i) {
        if (i == 128) {
            this.f75031BC = 32;
            this.BC_MASK = BodyPartID.bodyIdMax;
            this.shifts0SC = shifts0[0];
            this.shifts1SC = shifts1[0];
        } else if (i == 160) {
            this.f75031BC = 40;
            this.BC_MASK = 1099511627775L;
            this.shifts0SC = shifts0[1];
            this.shifts1SC = shifts1[1];
        } else if (i == 192) {
            this.f75031BC = 48;
            this.BC_MASK = 281474976710655L;
            this.shifts0SC = shifts0[2];
            this.shifts1SC = shifts1[2];
        } else if (i == 224) {
            this.f75031BC = 56;
            this.BC_MASK = 72057594037927935L;
            this.shifts0SC = shifts0[3];
            this.shifts1SC = shifts1[3];
        } else if (i != 256) {
            throw new IllegalArgumentException("unknown blocksize to Rijndael");
        } else {
            this.f75031BC = 64;
            this.BC_MASK = -1L;
            this.shifts0SC = shifts0[4];
            this.shifts1SC = shifts1[4];
        }
        this.blockBits = i;
    }
}
