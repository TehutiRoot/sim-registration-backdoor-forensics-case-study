package ch.qos.logback.core.property;

import ch.qos.logback.core.PropertyDefinerBase;
import ch.qos.logback.core.util.Loader;
import ch.qos.logback.core.util.OptionHelper;

/* loaded from: classes.dex */
public class ResourceExistsPropertyDefiner extends PropertyDefinerBase {

    /* renamed from: c */
    public String f40005c;

    @Override // ch.qos.logback.core.spi.PropertyDefiner
    public String getPropertyValue() {
        if (!OptionHelper.isEmpty(this.f40005c)) {
            return PropertyDefinerBase.booleanAsStr(Loader.getResourceBySelfClassLoader(this.f40005c) != null);
        }
        addError("The \"resource\" property must be set.");
        return null;
    }

    public String getResource() {
        return this.f40005c;
    }

    public void setResource(String str) {
        this.f40005c = str;
    }
}