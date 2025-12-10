package ch.qos.logback.core.pattern;

import java.util.List;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public class ReplacingCompositeConverter<E> extends CompositeConverter<E> {

    /* renamed from: f */
    public Pattern f39979f;

    /* renamed from: g */
    public String f39980g;

    /* renamed from: h */
    public String f39981h;

    @Override // ch.qos.logback.core.pattern.DynamicConverter, ch.qos.logback.core.spi.LifeCycle
    public void start() {
        List<String> optionList = getOptionList();
        if (optionList == null) {
            addError("at least two options are expected whereas you have declared none");
            return;
        }
        int size = optionList.size();
        if (size >= 2) {
            String str = optionList.get(0);
            this.f39980g = str;
            this.f39979f = Pattern.compile(str);
            this.f39981h = optionList.get(1);
            super.start();
            return;
        }
        addError("at least two options are expected whereas you have declared only " + size + "as [" + optionList + "]");
    }

    @Override // ch.qos.logback.core.pattern.CompositeConverter
    public String transform(E e, String str) {
        return !this.started ? str : this.f39979f.matcher(str).replaceAll(this.f39981h);
    }
}