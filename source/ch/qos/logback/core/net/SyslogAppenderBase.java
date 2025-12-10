package ch.qos.logback.core.net;

import ch.qos.logback.core.AppenderBase;
import ch.qos.logback.core.Layout;
import java.io.IOException;
import java.io.OutputStream;
import java.net.SocketException;
import java.net.UnknownHostException;
import java.nio.charset.Charset;

/* loaded from: classes.dex */
public abstract class SyslogAppenderBase<E> extends AppenderBase<E> {

    /* renamed from: g */
    public Layout f39898g;

    /* renamed from: h */
    public String f39899h;

    /* renamed from: i */
    public String f39900i;

    /* renamed from: j */
    public int f39901j = SyslogConstants.SYSLOG_PORT;

    /* renamed from: k */
    public boolean f39902k = false;

    /* renamed from: l */
    public boolean f39903l = false;

    /* renamed from: m */
    public int f39904m;

    /* renamed from: n */
    public Charset f39905n;
    protected SyslogOutputStream sos;
    protected String suffixPattern;

    public static int facilityStringToint(String str) {
        if ("KERN".equalsIgnoreCase(str)) {
            return 0;
        }
        if ("USER".equalsIgnoreCase(str)) {
            return 8;
        }
        if ("MAIL".equalsIgnoreCase(str)) {
            return 16;
        }
        if ("DAEMON".equalsIgnoreCase(str)) {
            return 24;
        }
        if ("AUTH".equalsIgnoreCase(str)) {
            return 32;
        }
        if ("SYSLOG".equalsIgnoreCase(str)) {
            return 40;
        }
        if ("LPR".equalsIgnoreCase(str)) {
            return 48;
        }
        if ("NEWS".equalsIgnoreCase(str)) {
            return 56;
        }
        if ("UUCP".equalsIgnoreCase(str)) {
            return 64;
        }
        if ("CRON".equalsIgnoreCase(str)) {
            return 72;
        }
        if ("AUTHPRIV".equalsIgnoreCase(str)) {
            return 80;
        }
        if ("FTP".equalsIgnoreCase(str)) {
            return 88;
        }
        if ("NTP".equalsIgnoreCase(str)) {
            return 96;
        }
        if ("AUDIT".equalsIgnoreCase(str)) {
            return 104;
        }
        if ("ALERT".equalsIgnoreCase(str)) {
            return 112;
        }
        if ("CLOCK".equalsIgnoreCase(str)) {
            return 120;
        }
        if ("LOCAL0".equalsIgnoreCase(str)) {
            return 128;
        }
        if ("LOCAL1".equalsIgnoreCase(str)) {
            return 136;
        }
        if ("LOCAL2".equalsIgnoreCase(str)) {
            return SyslogConstants.LOG_LOCAL2;
        }
        if ("LOCAL3".equalsIgnoreCase(str)) {
            return SyslogConstants.LOG_LOCAL3;
        }
        if ("LOCAL4".equalsIgnoreCase(str)) {
            return SyslogConstants.LOG_LOCAL4;
        }
        if ("LOCAL5".equalsIgnoreCase(str)) {
            return 168;
        }
        if ("LOCAL6".equalsIgnoreCase(str)) {
            return SyslogConstants.LOG_LOCAL6;
        }
        if ("LOCAL7".equalsIgnoreCase(str)) {
            return SyslogConstants.LOG_LOCAL7;
        }
        throw new IllegalArgumentException(str + " is not a valid syslog facility string");
    }

    @Override // ch.qos.logback.core.AppenderBase
    public void append(E e) {
        if (isStarted()) {
            if (!this.f39902k && this.f39903l) {
                this.f39902k = true;
                m51452b();
            }
            if (this.sos == null) {
                return;
            }
            try {
                String doLayout = this.f39898g.doLayout(e);
                if (doLayout == null) {
                    return;
                }
                int length = doLayout.length();
                int i = this.f39904m;
                if (length > i) {
                    doLayout = doLayout.substring(0, i);
                }
                this.sos.write(doLayout.getBytes(this.f39905n));
                this.sos.flush();
                postProcess(e, this.sos);
            } catch (IOException e2) {
                addError("Failed to send diagram to " + this.f39900i, e2);
            }
        }
    }

    /* renamed from: b */
    public final boolean m51452b() {
        try {
            SyslogOutputStream createOutputStream = createOutputStream();
            this.sos = createOutputStream;
            int m51451b = createOutputStream.m51451b();
            int i = this.f39904m;
            if (i == 0) {
                this.f39904m = Math.min(m51451b, 65000);
                addInfo("Defaulting maxMessageSize to [" + this.f39904m + "]");
            } else if (i > m51451b) {
                addWarn("maxMessageSize of [" + this.f39904m + "] is larger than the system defined datagram size of [" + m51451b + "].");
                addWarn("This may result in dropped logs.");
            }
        } catch (SocketException e) {
            addWarn("Failed to bind to a random datagram socket. Will try to reconnect later.", e);
        } catch (UnknownHostException e2) {
            addError("Could not create SyslogWriter", e2);
        }
        return this.sos != null;
    }

    public abstract Layout<E> buildLayout();

    public abstract SyslogOutputStream createOutputStream() throws UnknownHostException, SocketException;

    public Charset getCharset() {
        return this.f39905n;
    }

    public String getFacility() {
        return this.f39899h;
    }

    public Layout<E> getLayout() {
        return this.f39898g;
    }

    public boolean getLazy() {
        return this.f39903l;
    }

    public int getMaxMessageSize() {
        return this.f39904m;
    }

    public int getPort() {
        return this.f39901j;
    }

    public abstract int getSeverityForEvent(Object obj);

    public String getSuffixPattern() {
        return this.suffixPattern;
    }

    public String getSyslogHost() {
        return this.f39900i;
    }

    public void postProcess(Object obj, OutputStream outputStream) {
    }

    public void setCharset(Charset charset) {
        this.f39905n = charset;
    }

    public void setFacility(String str) {
        if (str != null) {
            str = str.trim();
        }
        this.f39899h = str;
    }

    public void setLayout(Layout<E> layout) {
        addWarn("The layout of a SyslogAppender cannot be set directly. See also http://logback.qos.ch/codes.html#syslog_layout");
    }

    public void setLazy(boolean z) {
        this.f39903l = z;
    }

    public void setMaxMessageSize(int i) {
        this.f39904m = i;
    }

    public void setPort(int i) {
        this.f39901j = i;
    }

    public void setSuffixPattern(String str) {
        this.suffixPattern = str;
    }

    public void setSyslogHost(String str) {
        this.f39900i = str;
    }

    @Override // ch.qos.logback.core.AppenderBase, ch.qos.logback.core.spi.LifeCycle
    public void start() {
        int i;
        if (this.f39899h == null) {
            addError("The Facility option is mandatory");
            i = 1;
        } else {
            i = 0;
        }
        if (this.f39905n == null) {
            this.f39905n = Charset.defaultCharset();
        }
        if (!this.f39903l && !m51452b()) {
            i++;
        }
        if (this.f39898g == null) {
            this.f39898g = buildLayout();
        }
        if (i == 0) {
            super.start();
        }
    }

    @Override // ch.qos.logback.core.AppenderBase, ch.qos.logback.core.spi.LifeCycle
    public void stop() {
        SyslogOutputStream syslogOutputStream = this.sos;
        if (syslogOutputStream != null) {
            syslogOutputStream.close();
        }
        super.stop();
    }
}
