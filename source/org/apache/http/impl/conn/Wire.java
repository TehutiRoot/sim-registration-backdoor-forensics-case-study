package org.apache.http.impl.conn;

import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import org.apache.commons.cli.HelpFormatter;
import org.apache.commons.logging.Log;
import org.apache.http.annotation.Contract;
import org.apache.http.annotation.ThreadingBehavior;
import org.apache.http.util.Args;

@Contract(threading = ThreadingBehavior.IMMUTABLE)
/* loaded from: classes6.dex */
public class Wire {

    /* renamed from: a */
    public final Log f74306a;

    /* renamed from: b */
    public final String f74307b;

    public Wire(Log log, String str) {
        this.f74306a = log;
        this.f74307b = str;
    }

    /* renamed from: a */
    public final void m24617a(String str, InputStream inputStream) {
        StringBuilder sb = new StringBuilder();
        while (true) {
            int read = inputStream.read();
            if (read == -1) {
                break;
            } else if (read == 13) {
                sb.append("[\\r]");
            } else if (read == 10) {
                sb.append("[\\n]\"");
                sb.insert(0, OperatorName.SHOW_TEXT_LINE_AND_SPACE);
                sb.insert(0, str);
                Log log = this.f74306a;
                log.debug(this.f74307b + HelpFormatter.DEFAULT_LONG_OPT_SEPARATOR + sb.toString());
                sb.setLength(0);
            } else if (read >= 32 && read <= 127) {
                sb.append((char) read);
            } else {
                sb.append("[0x");
                sb.append(Integer.toHexString(read));
                sb.append("]");
            }
        }
        if (sb.length() > 0) {
            sb.append('\"');
            sb.insert(0, '\"');
            sb.insert(0, str);
            Log log2 = this.f74306a;
            log2.debug(this.f74307b + HelpFormatter.DEFAULT_LONG_OPT_SEPARATOR + sb.toString());
        }
    }

    public boolean enabled() {
        return this.f74306a.isDebugEnabled();
    }

    public void input(InputStream inputStream) throws IOException {
        Args.notNull(inputStream, "Input");
        m24617a("<< ", inputStream);
    }

    public void output(InputStream inputStream) throws IOException {
        Args.notNull(inputStream, "Output");
        m24617a(">> ", inputStream);
    }

    public void input(byte[] bArr, int i, int i2) throws IOException {
        Args.notNull(bArr, "Input");
        m24617a("<< ", new ByteArrayInputStream(bArr, i, i2));
    }

    public void output(byte[] bArr, int i, int i2) throws IOException {
        Args.notNull(bArr, "Output");
        m24617a(">> ", new ByteArrayInputStream(bArr, i, i2));
    }

    public Wire(Log log) {
        this(log, "");
    }

    public void input(byte[] bArr) throws IOException {
        Args.notNull(bArr, "Input");
        m24617a("<< ", new ByteArrayInputStream(bArr));
    }

    public void output(byte[] bArr) throws IOException {
        Args.notNull(bArr, "Output");
        m24617a(">> ", new ByteArrayInputStream(bArr));
    }

    public void input(int i) throws IOException {
        input(new byte[]{(byte) i});
    }

    public void output(int i) throws IOException {
        output(new byte[]{(byte) i});
    }

    public void input(String str) throws IOException {
        Args.notNull(str, "Input");
        input(str.getBytes());
    }

    public void output(String str) throws IOException {
        Args.notNull(str, "Output");
        output(str.getBytes());
    }
}
