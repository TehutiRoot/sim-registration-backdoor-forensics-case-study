package ch.qos.logback.core.recovery;

import ch.qos.logback.core.net.SyslogOutputStream;
import java.io.OutputStream;
import java.net.SocketException;
import java.net.UnknownHostException;

/* loaded from: classes.dex */
public class ResilientSyslogOutputStream extends ResilientOutputStreamBase {

    /* renamed from: e */
    public String f40021e;

    /* renamed from: f */
    public int f40022f;

    public ResilientSyslogOutputStream(String str, int i) throws UnknownHostException, SocketException {
        this.f40021e = str;
        this.f40022f = i;
        this.f40020os = new SyslogOutputStream(str, i);
        this.presumedClean = true;
    }

    @Override // ch.qos.logback.core.recovery.ResilientOutputStreamBase
    /* renamed from: g */
    public String mo51398g() {
        return "syslog [" + this.f40021e + ":" + this.f40022f + "]";
    }

    @Override // ch.qos.logback.core.recovery.ResilientOutputStreamBase
    /* renamed from: j */
    public OutputStream mo51397j() {
        return new SyslogOutputStream(this.f40021e, this.f40022f);
    }

    public String toString() {
        return "c.q.l.c.recovery.ResilientSyslogOutputStream@" + System.identityHashCode(this);
    }
}