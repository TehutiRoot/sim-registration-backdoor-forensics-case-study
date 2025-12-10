package ch.qos.logback.core.joran.action;

import ch.qos.logback.core.joran.spi.ActionException;
import ch.qos.logback.core.joran.spi.InterpretationContext;
import ch.qos.logback.core.joran.spi.JoranException;
import ch.qos.logback.core.util.Loader;
import ch.qos.logback.core.util.OptionHelper;
import com.google.android.gms.common.internal.ImagesContract;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.UnknownHostException;
import org.xml.sax.Attributes;

/* loaded from: classes.dex */
public abstract class AbstractIncludeAction extends Action {

    /* renamed from: c */
    public String f39757c;

    /* renamed from: d */
    public boolean f39758d;

    /* renamed from: b */
    public final URL m51523b(String str) {
        StringBuilder sb;
        String str2;
        try {
            URL url = new URL(str);
            url.openStream().close();
            return url;
        } catch (MalformedURLException e) {
            e = e;
            sb = new StringBuilder();
            sb.append("URL [");
            sb.append(str);
            str2 = "] is not well formed.";
            sb.append(str2);
            optionalWarning(sb.toString(), e);
            return null;
        } catch (IOException e2) {
            e = e2;
            sb = new StringBuilder();
            sb.append("URL [");
            sb.append(str);
            str2 = "] cannot be opened.";
            sb.append(str2);
            optionalWarning(sb.toString(), e);
            return null;
        }
    }

    @Override // ch.qos.logback.core.joran.action.Action
    public void begin(InterpretationContext interpretationContext, String str, Attributes attributes) throws ActionException {
        this.f39757c = null;
        this.f39758d = OptionHelper.toBoolean(attributes.getValue("optional"), false);
        if (m51522d(attributes)) {
            try {
                URL m51520i = m51520i(interpretationContext, attributes);
                if (m51520i != null) {
                    processInclude(interpretationContext, m51520i);
                }
            } catch (JoranException e) {
                optionalWarning("Error while parsing " + this.f39757c, e);
            }
        }
    }

    public void close(InputStream inputStream) {
        if (inputStream != null) {
            try {
                inputStream.close();
            } catch (IOException unused) {
            }
        }
    }

    /* renamed from: d */
    public final boolean m51522d(Attributes attributes) {
        String format;
        String value = attributes.getValue("file");
        String value2 = attributes.getValue(ImagesContract.URL);
        String value3 = attributes.getValue("resource");
        int i = !OptionHelper.isEmpty(value) ? 1 : 0;
        if (!OptionHelper.isEmpty(value2)) {
            i++;
        }
        if (!OptionHelper.isEmpty(value3)) {
            i++;
        }
        if (i == 0) {
            format = String.format("One of \"%1$s\", \"%2$s\" or \"%3$s\" attributes must be set.", "file", "resource", ImagesContract.URL);
        } else if (i <= 1) {
            if (i == 1) {
                return true;
            }
            throw new IllegalStateException("Count value [" + i + "] is not expected");
        } else {
            format = String.format("Only one of \"%1$s\", \"%2$s\" or \"%3$s\" attributes should be set.", "file", "resource", ImagesContract.URL);
        }
        optionalWarning(format, null);
        return false;
    }

    @Override // ch.qos.logback.core.joran.action.Action
    public void end(InterpretationContext interpretationContext, String str) throws ActionException {
    }

    /* renamed from: g */
    public final URL m51521g(String str) {
        File file = new File(str);
        if (file.exists() && file.isFile()) {
            try {
                return file.toURI().toURL();
            } catch (MalformedURLException e) {
                e.printStackTrace();
                return null;
            }
        }
        optionalWarning("File does not exist [" + str + "]", new FileNotFoundException(str));
        return null;
    }

    public String getAttributeInUse() {
        return this.f39757c;
    }

    public void handleError(String str, Exception exc) {
        if (exc == null || !((exc instanceof FileNotFoundException) || (exc instanceof UnknownHostException))) {
            addError(str, exc);
        } else {
            addWarn(str, exc);
        }
    }

    /* renamed from: i */
    public final URL m51520i(InterpretationContext interpretationContext, Attributes attributes) {
        String value = attributes.getValue("file");
        String value2 = attributes.getValue(ImagesContract.URL);
        String value3 = attributes.getValue("resource");
        if (!OptionHelper.isEmpty(value)) {
            String subst = interpretationContext.subst(value);
            this.f39757c = subst;
            return m51521g(subst);
        } else if (!OptionHelper.isEmpty(value2)) {
            String subst2 = interpretationContext.subst(value2);
            this.f39757c = subst2;
            return m51523b(subst2);
        } else if (OptionHelper.isEmpty(value3)) {
            throw new IllegalStateException("A URL stream should have been returned");
        } else {
            String subst3 = interpretationContext.subst(value3);
            this.f39757c = subst3;
            return m51519j(subst3);
        }
    }

    public boolean isOptional() {
        return this.f39758d;
    }

    /* renamed from: j */
    public final URL m51519j(String str) {
        URL resourceBySelfClassLoader = Loader.getResourceBySelfClassLoader(str);
        if (resourceBySelfClassLoader == null) {
            optionalWarning("Could not find resource corresponding to [" + str + "]", null);
            return null;
        }
        return resourceBySelfClassLoader;
    }

    public void optionalWarning(String str, Exception exc) {
        if (isOptional()) {
            return;
        }
        handleError(str, exc);
    }

    public abstract void processInclude(InterpretationContext interpretationContext, URL url) throws JoranException;
}