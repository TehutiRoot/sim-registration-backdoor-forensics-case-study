package ch.qos.logback.core.rolling.helper;

/* loaded from: classes.dex */
public class TokenConverter {

    /* renamed from: a */
    public int f40091a;

    /* renamed from: b */
    public TokenConverter f40092b;

    public TokenConverter(int i) {
        this.f40091a = i;
    }

    public TokenConverter getNext() {
        return this.f40092b;
    }

    public int getType() {
        return this.f40091a;
    }

    public void setNext(TokenConverter tokenConverter) {
        this.f40092b = tokenConverter;
    }

    public void setType(int i) {
        this.f40091a = i;
    }
}
