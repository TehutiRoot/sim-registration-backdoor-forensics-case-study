package ch.qos.logback.core.net;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import java.net.UnknownHostException;

/* loaded from: classes.dex */
public class SyslogOutputStream extends OutputStream {

    /* renamed from: a */
    public InetAddress f39906a;

    /* renamed from: d */
    public final int f39909d;

    /* renamed from: c */
    public ByteArrayOutputStream f39908c = new ByteArrayOutputStream();

    /* renamed from: b */
    public DatagramSocket f39907b = new DatagramSocket();

    public SyslogOutputStream(String str, int i) throws UnknownHostException, SocketException {
        this.f39906a = InetAddress.getByName(str);
        this.f39909d = i;
    }

    /* renamed from: b */
    public int m51451b() {
        return this.f39907b.getSendBufferSize();
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        DatagramSocket datagramSocket = this.f39907b;
        if (datagramSocket != null) {
            datagramSocket.close();
        }
        this.f39906a = null;
        this.f39907b = null;
    }

    @Override // java.io.OutputStream, java.io.Flushable
    public void flush() throws IOException {
        DatagramSocket datagramSocket;
        byte[] byteArray = this.f39908c.toByteArray();
        DatagramPacket datagramPacket = new DatagramPacket(byteArray, byteArray.length, this.f39906a, this.f39909d);
        if (this.f39908c.size() > 1024) {
            this.f39908c = new ByteArrayOutputStream();
        } else {
            this.f39908c.reset();
        }
        if (byteArray.length == 0 || (datagramSocket = this.f39907b) == null) {
            return;
        }
        datagramSocket.send(datagramPacket);
    }

    public int getPort() {
        return this.f39909d;
    }

    @Override // java.io.OutputStream
    public void write(int i) throws IOException {
        this.f39908c.write(i);
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr, int i, int i2) throws IOException {
        this.f39908c.write(bArr, i, i2);
    }
}
