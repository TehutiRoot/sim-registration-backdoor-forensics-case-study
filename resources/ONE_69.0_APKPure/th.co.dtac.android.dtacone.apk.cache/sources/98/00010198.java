package org.bson;

/* loaded from: classes6.dex */
public interface FieldNameValidator {
    FieldNameValidator getValidatorForField(String str);

    boolean validate(String str);
}