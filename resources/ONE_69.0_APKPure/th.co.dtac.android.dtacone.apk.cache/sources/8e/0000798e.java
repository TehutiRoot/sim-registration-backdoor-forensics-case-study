package ch.qos.logback.classic.log4j;

import ch.qos.logback.classic.spi.ILoggingEvent;
import ch.qos.logback.classic.spi.IThrowableProxy;
import ch.qos.logback.classic.spi.StackTraceElementProxy;
import ch.qos.logback.core.LayoutBase;
import ch.qos.logback.core.helpers.Transform;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import java.util.Map;
import java.util.Set;

/* loaded from: classes.dex */
public class XMLLayout extends LayoutBase<ILoggingEvent> {

    /* renamed from: g */
    public StringBuilder f39559g = new StringBuilder(256);

    /* renamed from: h */
    public boolean f39560h = false;

    /* renamed from: i */
    public boolean f39561i = false;

    @Override // ch.qos.logback.core.Layout
    public String doLayout(ILoggingEvent iLoggingEvent) {
        Map<String, String> mDCPropertyMap;
        StackTraceElement[] callerData;
        if (this.f39559g.capacity() > 2048) {
            this.f39559g = new StringBuilder(256);
        } else {
            this.f39559g.setLength(0);
        }
        this.f39559g.append("<log4j:event logger=\"");
        this.f39559g.append(Transform.escapeTags(iLoggingEvent.getLoggerName()));
        this.f39559g.append("\"\r\n");
        this.f39559g.append("             timestamp=\"");
        this.f39559g.append(iLoggingEvent.getTimeStamp());
        this.f39559g.append("\" level=\"");
        this.f39559g.append(iLoggingEvent.getLevel());
        this.f39559g.append("\" thread=\"");
        this.f39559g.append(Transform.escapeTags(iLoggingEvent.getThreadName()));
        this.f39559g.append("\">\r\n");
        this.f39559g.append("  <log4j:message>");
        this.f39559g.append(Transform.escapeTags(iLoggingEvent.getFormattedMessage()));
        this.f39559g.append("</log4j:message>\r\n");
        IThrowableProxy throwableProxy = iLoggingEvent.getThrowableProxy();
        if (throwableProxy != null) {
            StackTraceElementProxy[] stackTraceElementProxyArray = throwableProxy.getStackTraceElementProxyArray();
            this.f39559g.append("  <log4j:throwable><![CDATA[");
            for (StackTraceElementProxy stackTraceElementProxy : stackTraceElementProxyArray) {
                this.f39559g.append('\t');
                this.f39559g.append(stackTraceElementProxy.toString());
                this.f39559g.append("\r\n");
            }
            this.f39559g.append("]]></log4j:throwable>\r\n");
        }
        if (this.f39560h && (callerData = iLoggingEvent.getCallerData()) != null && callerData.length > 0) {
            StackTraceElement stackTraceElement = callerData[0];
            this.f39559g.append("  <log4j:locationInfo class=\"");
            this.f39559g.append(stackTraceElement.getClassName());
            this.f39559g.append("\"\r\n");
            this.f39559g.append("                      method=\"");
            this.f39559g.append(Transform.escapeTags(stackTraceElement.getMethodName()));
            this.f39559g.append("\" file=\"");
            this.f39559g.append(Transform.escapeTags(stackTraceElement.getFileName()));
            this.f39559g.append("\" line=\"");
            this.f39559g.append(stackTraceElement.getLineNumber());
            this.f39559g.append("\"/>\r\n");
        }
        if (getProperties() && (mDCPropertyMap = iLoggingEvent.getMDCPropertyMap()) != null && mDCPropertyMap.size() != 0) {
            Set<Map.Entry<String, String>> entrySet = mDCPropertyMap.entrySet();
            this.f39559g.append("  <log4j:properties>");
            for (Map.Entry<String, String> entry : entrySet) {
                this.f39559g.append("\r\n    <log4j:data");
                this.f39559g.append(" name=\"" + Transform.escapeTags(entry.getKey()) + OperatorName.SHOW_TEXT_LINE_AND_SPACE);
                this.f39559g.append(" value=\"" + Transform.escapeTags(entry.getValue()) + OperatorName.SHOW_TEXT_LINE_AND_SPACE);
                this.f39559g.append(" />");
            }
            this.f39559g.append("\r\n  </log4j:properties>");
        }
        this.f39559g.append("\r\n</log4j:event>\r\n\r\n");
        return this.f39559g.toString();
    }

    @Override // ch.qos.logback.core.LayoutBase, ch.qos.logback.core.Layout
    public String getContentType() {
        return "text/xml";
    }

    public boolean getLocationInfo() {
        return this.f39560h;
    }

    public boolean getProperties() {
        return this.f39561i;
    }

    public void setLocationInfo(boolean z) {
        this.f39560h = z;
    }

    public void setProperties(boolean z) {
        this.f39561i = z;
    }

    @Override // ch.qos.logback.core.LayoutBase, ch.qos.logback.core.spi.LifeCycle
    public void start() {
        super.start();
    }
}