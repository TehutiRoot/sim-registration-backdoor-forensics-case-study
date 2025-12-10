package ch.qos.logback.classic.turbo;

import ch.qos.logback.classic.Level;

/* loaded from: classes.dex */
public class MDCValueLevelPair {

    /* renamed from: a */
    public String f39674a;

    /* renamed from: b */
    public Level f39675b;

    public Level getLevel() {
        return this.f39675b;
    }

    public String getValue() {
        return this.f39674a;
    }

    public void setLevel(Level level) {
        this.f39675b = level;
    }

    public void setValue(String str) {
        this.f39674a = str;
    }
}