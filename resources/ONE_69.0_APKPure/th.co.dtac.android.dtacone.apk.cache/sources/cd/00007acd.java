package ch.qos.logback.core.rolling.helper;

/* loaded from: classes.dex */
public class TokenConverter {

    /* renamed from: a */
    public int f40089a;

    /* renamed from: b */
    public TokenConverter f40090b;

    public TokenConverter(int i) {
        this.f40089a = i;
    }

    public TokenConverter getNext() {
        return this.f40090b;
    }

    public int getType() {
        return this.f40089a;
    }

    public void setNext(TokenConverter tokenConverter) {
        this.f40090b = tokenConverter;
    }

    public void setType(int i) {
        this.f40089a = i;
    }
}