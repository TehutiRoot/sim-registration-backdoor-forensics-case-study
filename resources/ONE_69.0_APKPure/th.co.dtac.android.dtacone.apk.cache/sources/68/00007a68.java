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
    public InetAddress f39904a;

    /* renamed from: d */
    public final int f39907d;

    /* renamed from: c */
    public ByteArrayOutputStream f39906c = new ByteArrayOutputStream();

    /* renamed from: b */
    public DatagramSocket f39905b = new DatagramSocket();

    public SyslogOutputStream(String str, int i) throws UnknownHostException, SocketException {
        this.f39904a = InetAddress.getByName(str);
        this.f39907d = i;
    }

    /* renamed from: b */
    public int m51446b() {
        return this.f39905b.getSendBufferSize();
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        DatagramSocket datagramSocket = this.f39905b;
        if (datagramSocket != null) {
            datagramSocket.close();
        }
        this.f39904a = null;
        this.f39905b = null;
    }

    @Override // java.io.OutputStream, java.io.Flushable
    public void flush() throws IOException {
        DatagramSocket datagramSocket;
        byte[] byteArray = this.f39906c.toByteArray();
        DatagramPacket datagramPacket = new DatagramPacket(byteArray, byteArray.length, this.f39904a, this.f39907d);
        if (this.f39906c.size() > 1024) {
            this.f39906c = new ByteArrayOutputStream();
        } else {
            this.f39906c.reset();
        }
        if (byteArray.length == 0 || (datagramSocket = this.f39905b) == null) {
            return;
        }
        datagramSocket.send(datagramPacket);
    }

    public int getPort() {
        return this.f39907d;
    }

    @Override // java.io.OutputStream
    public void write(int i) throws IOException {
        this.f39906c.write(i);
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr, int i, int i2) throws IOException {
        this.f39906c.write(bArr, i, i2);
    }
}