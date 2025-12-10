package ch.qos.logback.core.joran.spi;

import ch.qos.logback.core.spi.ContextAwareBase;
import java.io.File;
import java.net.URL;
import java.net.URLDecoder;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public class ConfigurationWatchList extends ContextAwareBase {

    /* renamed from: c */
    public URL f39801c;

    /* renamed from: d */
    public List f39802d = new ArrayList();

    /* renamed from: e */
    public List f39803e = new ArrayList();

    public void addToWatchList(URL url) {
        m51509b(url);
    }

    /* renamed from: b */
    public final void m51509b(URL url) {
        File m51508d = m51508d(url);
        if (m51508d != null) {
            this.f39802d.add(m51508d);
            this.f39803e.add(Long.valueOf(m51508d.lastModified()));
        }
    }

    public ConfigurationWatchList buildClone() {
        ConfigurationWatchList configurationWatchList = new ConfigurationWatchList();
        configurationWatchList.f39801c = this.f39801c;
        configurationWatchList.f39802d = new ArrayList(this.f39802d);
        configurationWatchList.f39803e = new ArrayList(this.f39803e);
        return configurationWatchList;
    }

    public boolean changeDetected() {
        int size = this.f39802d.size();
        for (int i = 0; i < size; i++) {
            if (((Long) this.f39803e.get(i)).longValue() != ((File) this.f39802d.get(i)).lastModified()) {
                return true;
            }
        }
        return false;
    }

    public void clear() {
        this.f39801c = null;
        this.f39803e.clear();
        this.f39802d.clear();
    }

    /* renamed from: d */
    public File m51508d(URL url) {
        if ("file".equals(url.getProtocol())) {
            return new File(URLDecoder.decode(url.getFile()));
        }
        addInfo("URL [" + url + "] is not of type file");
        return null;
    }

    public List<File> getCopyOfFileWatchList() {
        return new ArrayList(this.f39802d);
    }

    public URL getMainURL() {
        return this.f39801c;
    }

    public void setMainURL(URL url) {
        this.f39801c = url;
        if (url != null) {
            m51509b(url);
        }
    }
}
