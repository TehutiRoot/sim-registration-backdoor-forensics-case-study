package ch.qos.logback.core;

import ch.qos.logback.core.spi.ContextAwareBase;
import org.apache.http.protocol.HTTP;

/* loaded from: classes.dex */
public abstract class LayoutBase<E> extends ContextAwareBase implements Layout<E> {

    /* renamed from: c */
    public String f39723c;

    /* renamed from: d */
    public String f39724d;

    /* renamed from: e */
    public String f39725e;

    /* renamed from: f */
    public String f39726f;
    protected boolean started;

    public String getContentType() {
        return HTTP.PLAIN_TEXT_TYPE;
    }

    @Override // ch.qos.logback.core.spi.ContextAwareBase, ch.qos.logback.core.spi.ContextAware
    public Context getContext() {
        return this.context;
    }

    @Override // ch.qos.logback.core.Layout
    public String getFileFooter() {
        return this.f39724d;
    }

    @Override // ch.qos.logback.core.Layout
    public String getFileHeader() {
        return this.f39723c;
    }

    @Override // ch.qos.logback.core.Layout
    public String getPresentationFooter() {
        return this.f39726f;
    }

    @Override // ch.qos.logback.core.Layout
    public String getPresentationHeader() {
        return this.f39725e;
    }

    @Override // ch.qos.logback.core.spi.LifeCycle
    public boolean isStarted() {
        return this.started;
    }

    @Override // ch.qos.logback.core.spi.ContextAwareBase, ch.qos.logback.core.spi.ContextAware
    public void setContext(Context context) {
        this.context = context;
    }

    public void setFileFooter(String str) {
        this.f39724d = str;
    }

    public void setFileHeader(String str) {
        this.f39723c = str;
    }

    public void setPresentationFooter(String str) {
        this.f39726f = str;
    }

    public void setPresentationHeader(String str) {
        this.f39725e = str;
    }

    public void start() {
        this.started = true;
    }

    @Override // ch.qos.logback.core.spi.LifeCycle
    public void stop() {
        this.started = false;
    }
}
