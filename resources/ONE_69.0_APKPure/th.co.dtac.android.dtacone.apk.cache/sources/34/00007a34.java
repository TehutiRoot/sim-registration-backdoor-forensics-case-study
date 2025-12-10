package ch.qos.logback.core.joran.event;

import ch.qos.logback.core.Context;
import ch.qos.logback.core.joran.spi.ElementPath;
import ch.qos.logback.core.joran.spi.JoranException;
import ch.qos.logback.core.spi.ContextAware;
import ch.qos.logback.core.spi.ContextAwareImpl;
import ch.qos.logback.core.status.Status;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import org.xml.sax.Attributes;
import org.xml.sax.InputSource;
import org.xml.sax.Locator;
import org.xml.sax.SAXException;
import org.xml.sax.SAXNotSupportedException;
import org.xml.sax.SAXParseException;
import org.xml.sax.helpers.DefaultHandler;
import org.xmlpull.v1.sax2.Driver;

/* loaded from: classes.dex */
public class SaxEventRecorder extends DefaultHandler implements ContextAware {

    /* renamed from: a */
    public final ContextAwareImpl f39795a;

    /* renamed from: b */
    public List f39796b;

    /* renamed from: c */
    public Locator f39797c;

    /* renamed from: d */
    public ElementPath f39798d;

    public SaxEventRecorder() {
        this.f39796b = new ArrayList();
        this.f39798d = new ElementPath();
        this.f39795a = new ContextAwareImpl(null, this);
    }

    /* renamed from: a */
    public final Driver m51509a() {
        try {
            Driver driver = new Driver();
            try {
                driver.setFeature("http://xml.org/sax/features/validation", false);
            } catch (SAXNotSupportedException unused) {
            }
            driver.setFeature("http://xml.org/sax/features/namespaces", true);
            return driver;
        } catch (Exception e) {
            addError("Parser configuration error occurred", e);
            throw new JoranException("Parser configuration error occurred", e);
        }
    }

    @Override // ch.qos.logback.core.spi.ContextAware
    public void addError(String str) {
        this.f39795a.addError(str);
    }

    @Override // ch.qos.logback.core.spi.ContextAware
    public void addInfo(String str) {
        this.f39795a.addInfo(str);
    }

    @Override // ch.qos.logback.core.spi.ContextAware
    public void addStatus(Status status) {
        this.f39795a.addStatus(status);
    }

    @Override // ch.qos.logback.core.spi.ContextAware
    public void addWarn(String str) {
        this.f39795a.addWarn(str);
    }

    /* renamed from: b */
    public SaxEvent m51508b() {
        if (this.f39796b.isEmpty()) {
            return null;
        }
        return (SaxEvent) this.f39796b.get(this.f39796b.size() - 1);
    }

    /* renamed from: c */
    public String m51507c(String str, String str2) {
        return (str == null || str.length() < 1) ? str2 : str;
    }

    @Override // org.xml.sax.helpers.DefaultHandler, org.xml.sax.ContentHandler
    public void characters(char[] cArr, int i, int i2) {
        String str = new String(cArr, i, i2);
        SaxEvent m51508b = m51508b();
        if (m51508b instanceof BodyEvent) {
            ((BodyEvent) m51508b).append(str);
        } else if (m51505f(str)) {
        } else {
            this.f39796b.add(new BodyEvent(str, getLocator()));
        }
    }

    /* renamed from: d */
    public final void m51506d(String str, Throwable th2) {
        addError(str, th2);
        throw new JoranException(str, th2);
    }

    @Override // org.xml.sax.helpers.DefaultHandler, org.xml.sax.ContentHandler
    public void endElement(String str, String str2, String str3) {
        if (str3 == null || str3.length() == 0) {
            str3 = str2;
        }
        this.f39796b.add(new EndEvent(str, str2, str3, getLocator()));
        this.f39798d.pop();
    }

    @Override // org.xml.sax.helpers.DefaultHandler, org.xml.sax.ErrorHandler
    public void error(SAXParseException sAXParseException) throws SAXException {
        addError("XML_PARSING - Parsing error on line " + sAXParseException.getLineNumber() + " and column " + sAXParseException.getColumnNumber(), sAXParseException);
    }

    /* renamed from: f */
    public boolean m51505f(String str) {
        return str.trim().length() == 0;
    }

    @Override // org.xml.sax.helpers.DefaultHandler, org.xml.sax.ErrorHandler
    public void fatalError(SAXParseException sAXParseException) throws SAXException {
        addError("XML_PARSING - Parsing fatal error on line " + sAXParseException.getLineNumber() + " and column " + sAXParseException.getColumnNumber(), sAXParseException);
    }

    @Override // ch.qos.logback.core.spi.ContextAware
    public Context getContext() {
        return this.f39795a.getContext();
    }

    public Locator getLocator() {
        return this.f39797c;
    }

    public List<SaxEvent> getSaxEventList() {
        return this.f39796b;
    }

    public List<SaxEvent> recordEvents(InputSource inputSource) throws JoranException {
        String str;
        Driver m51509a = m51509a();
        try {
            m51509a.setContentHandler(this);
            m51509a.setErrorHandler(this);
            m51509a.parse(inputSource);
            return this.f39796b;
        } catch (EOFException e) {
            m51506d(e.getLocalizedMessage(), new SAXParseException(e.getLocalizedMessage(), this.f39797c, e));
            throw new IllegalStateException("This point can never be reached");
        } catch (IOException e2) {
            e = e2;
            str = "I/O error occurred while parsing xml file";
            m51506d(str, e);
            throw new IllegalStateException("This point can never be reached");
        } catch (SAXException e3) {
            throw new JoranException("Problem parsing XML document. See previously reported errors.", e3);
        } catch (Exception e4) {
            e = e4;
            str = "Unexpected exception while parsing XML document.";
            m51506d(str, e);
            throw new IllegalStateException("This point can never be reached");
        }
    }

    @Override // ch.qos.logback.core.spi.ContextAware
    public void setContext(Context context) {
        this.f39795a.setContext(context);
    }

    @Override // org.xml.sax.helpers.DefaultHandler, org.xml.sax.ContentHandler
    public void setDocumentLocator(Locator locator) {
        this.f39797c = locator;
    }

    @Override // org.xml.sax.helpers.DefaultHandler, org.xml.sax.ContentHandler
    public void startDocument() {
    }

    @Override // org.xml.sax.helpers.DefaultHandler, org.xml.sax.ContentHandler
    public void startElement(String str, String str2, String str3, Attributes attributes) {
        String str4 = (str3 == null || str3.length() == 0) ? str2 : str3;
        this.f39798d.push(m51507c(str2, str4));
        this.f39796b.add(new StartEvent(this.f39798d.duplicate(), str, str2, str4, attributes, getLocator()));
    }

    @Override // org.xml.sax.helpers.DefaultHandler, org.xml.sax.ErrorHandler
    public void warning(SAXParseException sAXParseException) throws SAXException {
        addWarn("XML_PARSING - Parsing warning on line " + sAXParseException.getLineNumber() + " and column " + sAXParseException.getColumnNumber(), sAXParseException);
    }

    public SaxEventRecorder(Context context) {
        this.f39796b = new ArrayList();
        this.f39798d = new ElementPath();
        this.f39795a = new ContextAwareImpl(context, this);
    }

    @Override // ch.qos.logback.core.spi.ContextAware
    public void addError(String str, Throwable th2) {
        this.f39795a.addError(str, th2);
    }

    @Override // ch.qos.logback.core.spi.ContextAware
    public void addInfo(String str, Throwable th2) {
        this.f39795a.addInfo(str, th2);
    }

    @Override // ch.qos.logback.core.spi.ContextAware
    public void addWarn(String str, Throwable th2) {
        this.f39795a.addWarn(str, th2);
    }

    public final void recordEvents(InputStream inputStream) throws JoranException {
        recordEvents(new InputSource(inputStream));
    }
}