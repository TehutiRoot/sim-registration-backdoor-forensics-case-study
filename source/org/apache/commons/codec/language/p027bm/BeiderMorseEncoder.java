package org.apache.commons.codec.language.p027bm;

import org.apache.commons.codec.EncoderException;
import org.apache.commons.codec.StringEncoder;

/* renamed from: org.apache.commons.codec.language.bm.BeiderMorseEncoder */
/* loaded from: classes6.dex */
public class BeiderMorseEncoder implements StringEncoder {

    /* renamed from: a */
    public PhoneticEngine f73174a = new PhoneticEngine(NameType.GENERIC, RuleType.APPROX, true);

    @Override // org.apache.commons.codec.Encoder
    public Object encode(Object obj) throws EncoderException {
        if (obj instanceof String) {
            return encode((String) obj);
        }
        throw new EncoderException("BeiderMorseEncoder encode parameter is not of type String");
    }

    public NameType getNameType() {
        return this.f73174a.getNameType();
    }

    public RuleType getRuleType() {
        return this.f73174a.getRuleType();
    }

    public boolean isConcat() {
        return this.f73174a.isConcat();
    }

    public void setConcat(boolean z) {
        this.f73174a = new PhoneticEngine(this.f73174a.getNameType(), this.f73174a.getRuleType(), z, this.f73174a.getMaxPhonemes());
    }

    public void setMaxPhonemes(int i) {
        this.f73174a = new PhoneticEngine(this.f73174a.getNameType(), this.f73174a.getRuleType(), this.f73174a.isConcat(), i);
    }

    public void setNameType(NameType nameType) {
        this.f73174a = new PhoneticEngine(nameType, this.f73174a.getRuleType(), this.f73174a.isConcat(), this.f73174a.getMaxPhonemes());
    }

    public void setRuleType(RuleType ruleType) {
        this.f73174a = new PhoneticEngine(this.f73174a.getNameType(), ruleType, this.f73174a.isConcat(), this.f73174a.getMaxPhonemes());
    }

    @Override // org.apache.commons.codec.StringEncoder
    public String encode(String str) throws EncoderException {
        if (str == null) {
            return null;
        }
        return this.f73174a.encode(str);
    }
}
