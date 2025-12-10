package p000;

import org.bson.FieldNameValidator;

/* renamed from: JI0 */
/* loaded from: classes6.dex */
public class JI0 implements FieldNameValidator {
    @Override // org.bson.FieldNameValidator
    public boolean validate(String str) {
        return true;
    }

    @Override // org.bson.FieldNameValidator
    public FieldNameValidator getValidatorForField(String str) {
        return this;
    }
}
