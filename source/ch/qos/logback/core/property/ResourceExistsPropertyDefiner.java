package ch.qos.logback.core.property;

import ch.qos.logback.core.PropertyDefinerBase;
import ch.qos.logback.core.util.Loader;
import ch.qos.logback.core.util.OptionHelper;

/* loaded from: classes.dex */
public class ResourceExistsPropertyDefiner extends PropertyDefinerBase {

    /* renamed from: c */
    public String f40007c;

    @Override // ch.qos.logback.core.spi.PropertyDefiner
    public String getPropertyValue() {
        if (!OptionHelper.isEmpty(this.f40007c)) {
            return PropertyDefinerBase.booleanAsStr(Loader.getResourceBySelfClassLoader(this.f40007c) != null);
        }
        addError("The \"resource\" property must be set.");
        return null;
    }

    public String getResource() {
        return this.f40007c;
    }

    public void setResource(String str) {
        this.f40007c = str;
    }
}
