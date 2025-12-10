package com.facebook.stetho.websocket;

import com.google.common.primitives.SignedBytes;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import okhttp3.internal.p026ws.WebSocketProtocol;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public class Frame {
    public static final byte OPCODE_BINARY_FRAME = 2;
    public static final byte OPCODE_CONNECTION_CLOSE = 8;
    public static final byte OPCODE_CONNECTION_PING = 9;
    public static final byte OPCODE_CONNECTION_PONG = 10;
    public static final byte OPCODE_TEXT_FRAME = 1;
    public boolean fin;
    public boolean hasMask;
    public byte[] maskingKey;
    public byte opcode;
    public byte[] payloadData;
    public long payloadLen;
    public boolean rsv1;
    public boolean rsv2;
    public boolean rsv3;

    private void decodeFirstByte(byte b) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4 = false;
        if ((b & 128) != 0) {
            z = true;
        } else {
            z = false;
        }
        this.fin = z;
        if ((b & SignedBytes.MAX_POWER_OF_TWO) != 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        this.rsv1 = z2;
        if ((b & 32) != 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        this.rsv2 = z3;
        if ((b & 16) != 0) {
            z4 = true;
        }
        this.rsv3 = z4;
        this.opcode = (byte) (b & 15);
    }

    private long decodeLength(byte b, InputStream inputStream) throws IOException {
        if (b <= 125) {
            return b;
        }
        if (b == 126) {
            return ((readByteOrThrow(inputStream) & 255) << 8) | (readByteOrThrow(inputStream) & 255);
        }
        if (b == Byte.MAX_VALUE) {
            long j = 0;
            for (int i = 0; i < 8; i++) {
                j = (j | (readByteOrThrow(inputStream) & 255)) << 8;
            }
            return j;
        }
        throw new IOException("Unexpected length byte: " + ((int) b));
    }

    private static byte[] decodeMaskingKey(InputStream inputStream) throws IOException {
        byte[] bArr = new byte[4];
        readBytesOrThrow(inputStream, bArr, 0, 4);
        return bArr;
    }

    private byte encodeFirstByte() {
        byte b;
        if (this.fin) {
            b = (byte) 128;
        } else {
            b = 0;
        }
        if (this.rsv1) {
            b = (byte) (b | SignedBytes.MAX_POWER_OF_TWO);
        }
        if (this.rsv2) {
            b = (byte) (b | 32);
        }
        if (this.rsv3) {
            b = (byte) (b | 16);
        }
        return (byte) (b | (this.opcode & 15));
    }

    private static byte[] encodeLength(long j) {
        if (j <= 125) {
            return new byte[]{(byte) j};
        }
        if (j <= WebSocketProtocol.PAYLOAD_SHORT_MAX) {
            return new byte[]{126, (byte) ((j >> 8) & 255), (byte) (j & 255)};
        }
        return new byte[]{Byte.MAX_VALUE, (byte) ((j >> 56) & 255), (byte) ((j >> 48) & 255), (byte) ((j >> 40) & 255), (byte) ((j >> 32) & 255), (byte) ((j >> 24) & 255), (byte) ((j >> 16) & 255), (byte) ((j >> 8) & 255), (byte) (j & 255)};
    }

    private static byte readByteOrThrow(InputStream inputStream) throws IOException {
        int read = inputStream.read();
        if (read != -1) {
            return (byte) read;
        }
        throw new EOFException();
    }

    private static void readBytesOrThrow(InputStream inputStream, byte[] bArr, int i, int i2) throws IOException {
        while (i2 > 0) {
            int read = inputStream.read(bArr, i, i2);
            if (read != -1) {
                i2 -= read;
                i += read;
            } else {
                throw new EOFException();
            }
        }
    }

    public void readFrom(BufferedInputStream bufferedInputStream) throws IOException {
        boolean z;
        byte[] bArr;
        decodeFirstByte(readByteOrThrow(bufferedInputStream));
        byte readByteOrThrow = readByteOrThrow(bufferedInputStream);
        if ((readByteOrThrow & 128) != 0) {
            z = true;
        } else {
            z = false;
        }
        this.hasMask = z;
        this.payloadLen = decodeLength((byte) (readByteOrThrow & (-129)), bufferedInputStream);
        if (this.hasMask) {
            bArr = decodeMaskingKey(bufferedInputStream);
        } else {
            bArr = null;
        }
        this.maskingKey = bArr;
        long j = this.payloadLen;
        byte[] bArr2 = new byte[(int) j];
        this.payloadData = bArr2;
        readBytesOrThrow(bufferedInputStream, bArr2, 0, (int) j);
        MaskingHelper.unmask(this.maskingKey, this.payloadData, 0, (int) this.payloadLen);
    }

    public void writeTo(BufferedOutputStream bufferedOutputStream) throws IOException {
        bufferedOutputStream.write(encodeFirstByte());
        byte[] encodeLength = encodeLength(this.payloadLen);
        if (this.hasMask) {
            encodeLength[0] = (byte) (encodeLength[0] | 128);
        }
        bufferedOutputStream.write(encodeLength, 0, encodeLength.length);
        if (!this.hasMask) {
            bufferedOutputStream.write(this.payloadData, 0, (int) this.payloadLen);
            return;
        }
        throw new UnsupportedOperationException("Writing masked data not implemented");
    }
}