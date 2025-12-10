package ch.qos.logback.core.recovery;

import ch.qos.logback.core.net.SyslogOutputStream;
import java.io.OutputStream;
import java.net.SocketException;
import java.net.UnknownHostException;

/* loaded from: classes.dex */
public class ResilientSyslogOutputStream extends ResilientOutputStreamBase {

    /* renamed from: e */
    public String f40023e;

    /* renamed from: f */
    public int f40024f;

    public ResilientSyslogOutputStream(String str, int i) throws UnknownHostException, SocketException {
        this.f40023e = str;
        this.f40024f = i;
        this.f40022os = new SyslogOutputStream(str, i);
        this.presumedClean = true;
    }

    @Override // ch.qos.logback.core.recovery.ResilientOutputStreamBase
    /* renamed from: g */
    public String mo51403g() {
        return "syslog [" + this.f40023e + ":" + this.f40024f + "]";
    }

    @Override // ch.qos.logback.core.recovery.ResilientOutputStreamBase
    /* renamed from: j */
    public OutputStream mo51402j() {
        return new SyslogOutputStream(this.f40023e, this.f40024f);
    }

    public String toString() {
        return "c.q.l.c.recovery.ResilientSyslogOutputStream@" + System.identityHashCode(this);
    }
}
