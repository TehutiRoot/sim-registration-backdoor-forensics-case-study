package ch.qos.logback.core.property;

import ch.qos.logback.core.PropertyDefinerBase;
import ch.qos.logback.core.util.OptionHelper;
import java.io.File;

/* loaded from: classes.dex */
public class FileExistsPropertyDefiner extends PropertyDefinerBase {

    /* renamed from: c */
    public String f40004c;

    public String getPath() {
        return this.f40004c;
    }

    @Override // ch.qos.logback.core.spi.PropertyDefiner
    public String getPropertyValue() {
        if (OptionHelper.isEmpty(this.f40004c)) {
            addError("The \"path\" property must be set.");
            return null;
        }
        return PropertyDefinerBase.booleanAsStr(new File(this.f40004c).exists());
    }

    public void setPath(String str) {
        this.f40004c = str;
    }
}