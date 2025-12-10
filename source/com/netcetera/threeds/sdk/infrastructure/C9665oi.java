package com.netcetera.threeds.sdk.infrastructure;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.io.Reader;
import java.io.Writer;
import java.nio.charset.Charset;

/* renamed from: com.netcetera.threeds.sdk.infrastructure.oi */
/* loaded from: classes5.dex */
public class C9665oi {
    public static final String ThreeDS2ServiceInstance;

    static {
        C9661oe c9661oe = new C9661oe(4);
        try {
            PrintWriter printWriter = new PrintWriter(c9661oe);
            printWriter.println();
            ThreeDS2ServiceInstance = c9661oe.toString();
            printWriter.close();
            c9661oe.close();
        } catch (Throwable th2) {
            try {
                c9661oe.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }

    public static long ThreeDS2ServiceInstance(Reader reader, Writer writer) throws IOException {
        return ThreeDS2ServiceInstance(reader, writer, new char[8192]);
    }

    public static void get(InputStream inputStream, Writer writer, Charset charset) throws IOException {
        valueOf(new InputStreamReader(inputStream, C9660od.ThreeDS2ServiceInstance(charset)), writer);
    }

    public static int valueOf(Reader reader, Writer writer) throws IOException {
        long ThreeDS2ServiceInstance2 = ThreeDS2ServiceInstance(reader, writer);
        if (ThreeDS2ServiceInstance2 > 2147483647L) {
            return -1;
        }
        return (int) ThreeDS2ServiceInstance2;
    }

    public static String values(InputStream inputStream, Charset charset) throws IOException {
        C9661oe c9661oe = new C9661oe();
        try {
            get(inputStream, c9661oe, charset);
            String c9661oe2 = c9661oe.toString();
            c9661oe.close();
            return c9661oe2;
        } catch (Throwable th2) {
            try {
                c9661oe.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }

    public static long ThreeDS2ServiceInstance(Reader reader, Writer writer, char[] cArr) throws IOException {
        long j = 0;
        while (true) {
            int read = reader.read(cArr);
            if (-1 == read) {
                return j;
            }
            writer.write(cArr, 0, read);
            j += read;
        }
    }
}
