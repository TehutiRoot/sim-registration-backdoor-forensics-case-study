package ch.qos.logback.classic.layout;

import ch.qos.logback.classic.pattern.ThrowableProxyConverter;
import ch.qos.logback.classic.spi.ILoggingEvent;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.LayoutBase;
import ch.qos.logback.core.util.CachingDateFormatter;
import org.apache.commons.cli.HelpFormatter;

/* loaded from: classes.dex */
public class TTLLLayout extends LayoutBase<ILoggingEvent> {

    /* renamed from: g */
    public CachingDateFormatter f39559g = new CachingDateFormatter("HH:mm:ss.SSS");

    /* renamed from: h */
    public ThrowableProxyConverter f39560h = new ThrowableProxyConverter();

    @Override // ch.qos.logback.core.Layout
    public String doLayout(ILoggingEvent iLoggingEvent) {
        if (isStarted()) {
            StringBuilder sb = new StringBuilder();
            sb.append(this.f39559g.format(iLoggingEvent.getTimeStamp()));
            sb.append(" [");
            sb.append(iLoggingEvent.getThreadName());
            sb.append("] ");
            sb.append(iLoggingEvent.getLevel().toString());
            sb.append(HelpFormatter.DEFAULT_LONG_OPT_SEPARATOR);
            sb.append(iLoggingEvent.getLoggerName());
            sb.append(" - ");
            sb.append(iLoggingEvent.getFormattedMessage());
            sb.append(CoreConstants.LINE_SEPARATOR);
            if (iLoggingEvent.getThrowableProxy() != null) {
                sb.append(this.f39560h.convert(iLoggingEvent));
            }
            return sb.toString();
        }
        return "";
    }

    @Override // ch.qos.logback.core.LayoutBase, ch.qos.logback.core.spi.LifeCycle
    public void start() {
        this.f39560h.start();
        super.start();
    }
}
